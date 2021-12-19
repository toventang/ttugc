package com.lynx.tasm.behavior.p2052ui.image;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter;

/* renamed from: com.lynx.tasm.behavior.ui.image.AbsUIImage$$PropsSetter */
public class AbsUIImage$$PropsSetter extends LynxUI$$PropsSetter {
    static {
        Covode.recordClassIndex(34670);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        AbsUIImage absUIImage = (AbsUIImage) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -1937917490:
                if (str.equals("cap-insets-scale")) {
                    absUIImage.setCapInsetsScale(vVar.mo49824c(str));
                    return;
                }
                break;
            case -1249491252:
                if (str.equals("cover-start")) {
                    absUIImage.setCoverStart(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case -934531685:
                if (str.equals("repeat")) {
                    absUIImage.setRepeat(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case -629825370:
                if (str.equals("loop-count")) {
                    absUIImage.setLoopCount(vVar.mo49820a(str, 0));
                    return;
                }
                break;
            case -256430480:
                if (str.equals("prefetch-width")) {
                    absUIImage.setPreFetchWidth(vVar.mo49824c(str));
                    return;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    absUIImage.setSource(vVar.mo49824c(str));
                    return;
                }
                break;
            case 3357091:
                if (str.equals("mode")) {
                    absUIImage.setObjectFit(vVar.mo49824c(str));
                    return;
                }
                break;
            case 207594941:
                if (str.equals("prefetch-height")) {
                    absUIImage.setPreFetchHeight(vVar.mo49824c(str));
                    return;
                }
                break;
            case 516005201:
                if (str.equals("cap-insets")) {
                    absUIImage.setCapInsetsBackUp(vVar.mo49824c(str));
                    return;
                }
                break;
            case 598246771:
                if (str.equals("placeholder")) {
                    absUIImage.setPlaceholder(vVar.mo49824c(str));
                    return;
                }
                break;
            case 681292984:
                if (str.equals("blur-radius")) {
                    absUIImage.setBlurRadius(vVar.mo49824c(str));
                    return;
                }
                break;
            case 1198809474:
                if (str.equals("disable-default-placeholder")) {
                    absUIImage.setDisableDefaultPlaceholder(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case 1515751784:
                if (str.equals("capInsets")) {
                    absUIImage.setCapInsets(vVar.mo49824c(str));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
