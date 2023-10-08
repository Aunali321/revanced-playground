package app.revanced.patches.unifiprotect.login.fingerprints

import app.revanced.patcher.fingerprint.method.impl.MethodFingerprint

object HideDeviceNotFoundDialogFingerprint : MethodFingerprint(
        customFingerprint = custom@{ methodDef, classDef ->
            if (!classDef.type.endsWith("Lcom/ubnt/common/connect/ConnectControllerBinder;")) return@custom false

            methodDef.name == "showLocalDeviceNotFoundDialog"
        }
)
