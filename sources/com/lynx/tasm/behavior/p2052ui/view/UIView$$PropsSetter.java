package com.lynx.tasm.behavior.p2052ui.view;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;

/* renamed from: com.lynx.tasm.behavior.ui.view.UIView$$PropsSetter */
public class UIView$$PropsSetter extends UISimpleView$$PropsSetter {
    static {
        Covode.recordClassIndex(34781);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.p2052ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        UIView uIView = (UIView) lynxBaseUI;
        str.hashCode();
        if (!str.equals("impression_id")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            uIView.setImpressionId(vVar.mo49824c(str));
        }
    }
}
