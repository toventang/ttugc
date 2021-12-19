package com.bytedance.ies.xelement;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter;

public class LynxSeekerManager$$PropsSetter extends LynxUI$$PropsSetter {
    static {
        Covode.recordClassIndex(21667);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        LynxSeekerManager lynxSeekerManager = (LynxSeekerManager) lynxBaseUI;
        str.hashCode();
        if (str.equals("duration")) {
            lynxSeekerManager.setDuration(vVar.mo49820a(str, 0));
        } else if (!str.equals("currentDuration")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            lynxSeekerManager.setProgress(vVar.mo49820a(str, 0));
        }
    }
}
