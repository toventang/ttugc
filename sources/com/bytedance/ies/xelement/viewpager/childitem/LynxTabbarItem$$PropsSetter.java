package com.bytedance.ies.xelement.viewpager.childitem;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.UIGroup$$PropsSetter;

public class LynxTabbarItem$$PropsSetter extends UIGroup$$PropsSetter {
    static {
        Covode.recordClassIndex(22300);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.p2052ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        LynxTabbarItem lynxTabbarItem = (LynxTabbarItem) lynxBaseUI;
        str.hashCode();
        if (!str.equals("select")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            lynxTabbarItem.setSelect(vVar.mo49822a(str, false));
        }
    }
}
