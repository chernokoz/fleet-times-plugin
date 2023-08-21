package fleet.sample.frontend

import com.jetbrains.rhizomedb.Entrypoint
import fleet.frontend.actions.actions
import fleet.frontend.actions.windowManager
import fleet.kernel.ChangeScope
import fleet.kernel.plugins.register
import noria.model.*
import noria.windowManagement.extensions.openUrl

@Entrypoint
fun ChangeScope.entrypoint() {
    register {
        actions(
            Action(
                defaultPresentation = ActionPresentation("Open Times Website"),
                perform = { ac ->
                    ac.windowManager.openUrl("https://www.thetimes.co.uk/")
                    Propagate.STOP
                },
                triggers = setOf(trigger),
                identifier = trigger.ident,
            )
        )
    }
}

val trigger = Trigger("open-times-website")
