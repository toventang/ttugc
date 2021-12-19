package com.lynx.tasm.behavior.p2052ui;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;

/* renamed from: com.lynx.tasm.behavior.ui.LynxFlattenUI$$PropsSetter */
public class LynxFlattenUI$$PropsSetter extends LynxBaseUI$$PropsSetter {
    static {
        Covode.recordClassIndex(34602);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        LynxFlattenUI lynxFlattenUI = (LynxFlattenUI) lynxBaseUI;
        str.hashCode();
        if (str.equals("opacity")) {
            lynxFlattenUI.setAlpha(vVar.mo49819a(str, 1.0f));
        } else if (!str.equals("transform")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            lynxFlattenUI.setTransform(vVar.mo49825d(str));
        }
    }
}
