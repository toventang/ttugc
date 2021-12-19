package com.bytedance.ies.xelement.reveal;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView$$PropsSetter;

public class LynxRevealView$$PropsSetter extends UISimpleView$$PropsSetter {
    static {
        Covode.recordClassIndex(22215);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.p2052ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        LynxRevealView lynxRevealView = (LynxRevealView) lynxBaseUI;
        try {
            if (str.hashCode() == 3357091 && str.equals("mode")) {
                lynxRevealView.setRevealLayoutMode(vVar.mo49824c(str));
            } else {
                super.setProperty(lynxBaseUI, str, vVar);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
