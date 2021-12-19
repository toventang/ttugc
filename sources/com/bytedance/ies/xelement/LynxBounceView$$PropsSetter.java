package com.bytedance.ies.xelement;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView$$PropsSetter;

public class LynxBounceView$$PropsSetter extends UISimpleView$$PropsSetter {
    static {
        Covode.recordClassIndex(21629);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.p2052ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        LynxBounceView lynxBounceView = (LynxBounceView) lynxBaseUI;
        str.hashCode();
        if (!str.equals("direction")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            lynxBounceView.setDirection(vVar.mo49827f(str));
        }
    }
}
