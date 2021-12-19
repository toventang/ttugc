package com.lynx.tasm.p2062ui.image;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;

/* renamed from: com.lynx.tasm.ui.image.UIFilterImage$$PropsSetter */
public class UIFilterImage$$PropsSetter extends UIImage$$PropsSetter {
    static {
        Covode.recordClassIndex(34987);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.image.AbsUIImage$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.p2062ui.image.UIImage$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        UIFilterImage uIFilterImage = (UIFilterImage) lynxBaseUI;
        str.hashCode();
        if (!str.equals("drop-shadow")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            uIFilterImage.setDropShadow(vVar.mo49824c(str));
        }
    }
}
