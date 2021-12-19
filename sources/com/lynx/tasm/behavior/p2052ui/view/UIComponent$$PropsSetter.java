package com.lynx.tasm.behavior.p2052ui.view;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;

/* renamed from: com.lynx.tasm.behavior.ui.view.UIComponent$$PropsSetter */
public class UIComponent$$PropsSetter extends UIView$$PropsSetter {
    static {
        Covode.recordClassIndex(34775);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.p2052ui.view.UIView$$PropsSetter, com.lynx.tasm.behavior.p2052ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        UIComponent uIComponent = (UIComponent) lynxBaseUI;
        str.hashCode();
        if (!str.equals("item-key")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            uIComponent.setItemKey(vVar.mo49824c(str));
        }
    }
}
