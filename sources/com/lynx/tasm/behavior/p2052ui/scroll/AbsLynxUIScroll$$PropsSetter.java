package com.lynx.tasm.behavior.p2052ui.scroll;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView$$PropsSetter;

/* renamed from: com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll$$PropsSetter */
public class AbsLynxUIScroll$$PropsSetter extends UISimpleView$$PropsSetter {
    static {
        Covode.recordClassIndex(34709);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.p2052ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        AbsLynxUIScroll absLynxUIScroll = (AbsLynxUIScroll) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -2032847360:
                if (str.equals("scroll-to-index")) {
                    absLynxUIScroll.scrollToIndex(vVar.mo49820a(str, 0));
                    return;
                }
                break;
            case -1571036001:
                if (str.equals("lower-threshold")) {
                    absLynxUIScroll.setLowerThreshole(vVar.mo49820a(str, 0));
                    return;
                }
                break;
            case -402166408:
                if (str.equals("scroll-x")) {
                    absLynxUIScroll.setScrollX(vVar.mo49827f(str));
                    return;
                }
                break;
            case -402166407:
                if (str.equals("scroll-y")) {
                    absLynxUIScroll.setScrollY(vVar.mo49827f(str));
                    return;
                }
                break;
            case -169901481:
                if (str.equals("enable-scroll")) {
                    absLynxUIScroll.setEnableScroll(vVar.mo49822a(str, true));
                    return;
                }
                break;
            case 65137827:
                if (str.equals("scroll-tap")) {
                    absLynxUIScroll.setScrollTap(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case 65138261:
                if (str.equals("scroll-top")) {
                    absLynxUIScroll.setScrollTop(vVar.mo49820a(str, 0));
                    return;
                }
                break;
            case 660290816:
                if (str.equals("upper-threshold")) {
                    absLynxUIScroll.setUpperThreshole(vVar.mo49820a(str, 0));
                    return;
                }
                break;
            case 1751260029:
                if (str.equals("scroll-bar-enable")) {
                    absLynxUIScroll.setScrollBarEnable(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case 2019037959:
                if (str.equals("scroll-left")) {
                    absLynxUIScroll.setScrollLeft(vVar.mo49820a(str, 0));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
