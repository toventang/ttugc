package com.bytedance.ies.xelement.input;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;

public class LynxInputView$$PropsSetter extends LynxBaseInputView$$PropsSetter {
    static {
        Covode.recordClassIndex(22039);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.bytedance.ies.xelement.input.LynxBaseInputView$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        LynxInputView lynxInputView = (LynxInputView) lynxBaseUI;
        str.hashCode();
        if (!str.equals("password")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            lynxInputView.setIsPassword(vVar.mo49822a(str, false));
        }
    }
}
