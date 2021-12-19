package com.lynx.tasm.p2062ui.image;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.image.AbsUIImage$$PropsSetter;

/* renamed from: com.lynx.tasm.ui.image.UIImage$$PropsSetter */
public class UIImage$$PropsSetter extends AbsUIImage$$PropsSetter {
    static {
        Covode.recordClassIndex(34991);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.image.AbsUIImage$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        Boolean valueOf;
        UIImage uIImage = (UIImage) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -1937917490:
                if (str.equals("cap-insets-scale")) {
                    uIImage.setCapInsetsScale(vVar.mo49824c(str));
                    return;
                }
                break;
            case -1338903714:
                if (str.equals("skip-redirection")) {
                    uIImage.setSkipRedirection(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case -1138223116:
                if (str.equals("image-config")) {
                    uIImage.setImageConfig(vVar.mo49824c(str));
                    return;
                }
                break;
            case -602643660:
                if (str.equals("fresco-nine-patch")) {
                    uIImage.setFrescoNinePatch(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case 313009824:
                if (str.equals("local-cache")) {
                    if (vVar.mo49823b(str)) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(vVar.mo49822a(str, false));
                    }
                    uIImage.setLocalCache(valueOf);
                    return;
                }
                break;
            case 512852970:
                if (str.equals("subsample")) {
                    uIImage.setSubSample(vVar.mo49824c(str));
                    return;
                }
                break;
            case 516005201:
                if (str.equals("cap-insets")) {
                    uIImage.setCapInsetsBackUp(vVar.mo49824c(str));
                    return;
                }
                break;
            case 1090746891:
                if (str.equals("fresco-visible")) {
                    uIImage.setFrescoVisible(vVar.mo49824c(str));
                    return;
                }
                break;
            case 1245269388:
                if (str.equals("fresco-attach")) {
                    uIImage.setFrescoAttach(vVar.mo49824c(str));
                    return;
                }
                break;
            case 1672916293:
                if (str.equals("fix-fresco-bug")) {
                    uIImage.fixFrescoWebPBug(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    uIImage.setVisibility(vVar.mo49820a(str, 0));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
