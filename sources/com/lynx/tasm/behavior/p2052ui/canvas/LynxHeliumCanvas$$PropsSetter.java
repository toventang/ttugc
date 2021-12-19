package com.lynx.tasm.behavior.p2052ui.canvas;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter;

/* renamed from: com.lynx.tasm.behavior.ui.canvas.LynxHeliumCanvas$$PropsSetter */
public class LynxHeliumCanvas$$PropsSetter extends LynxUI$$PropsSetter {
    static {
        Covode.recordClassIndex(34656);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        LynxHeliumCanvas lynxHeliumCanvas = (LynxHeliumCanvas) lynxBaseUI;
        str.hashCode();
        if (!str.equals("consume-android-events")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            lynxHeliumCanvas.setConsumeAllEvents(vVar.mo49822a(str, false));
        }
    }
}
