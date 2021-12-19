package com.bytedance.ies.xelement.banner;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView$$PropsSetter;

public class LynxSwiperView$$PropsSetter extends UISimpleView$$PropsSetter {
    static {
        Covode.recordClassIndex(21769);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.p2052ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        LynxSwiperView lynxSwiperView = (LynxSwiperView) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -1992012396:
                if (str.equals("duration")) {
                    lynxSwiperView.setDuration(vVar.mo49820a(str, 500));
                    return;
                }
                break;
            case -1597449863:
                if (str.equals("start-margin")) {
                    lynxSwiperView.setStartMargin(vVar.mo49827f(str));
                    return;
                }
                break;
            case -1596393144:
                if (str.equals("indicator-dots")) {
                    lynxSwiperView.setIndicator(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case -1498085729:
                if (str.equals("circular")) {
                    lynxSwiperView.setCircular(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case -1235498272:
                if (str.equals("end-margin")) {
                    lynxSwiperView.setEndMargin(vVar.mo49827f(str));
                    return;
                }
                break;
            case -1029251878:
                if (str.equals("indicator-active-color")) {
                    lynxSwiperView.setIndicatorActiveColor(vVar.mo49824c(str));
                    return;
                }
                break;
            case -313198140:
                if (str.equals("hardware_texture")) {
                    lynxSwiperView.setRenderHardwareTexture(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case -111166008:
                if (str.equals("next-margin")) {
                    lynxSwiperView.setNextMargin(vVar.mo49827f(str));
                    return;
                }
                break;
            case 3357091:
                if (str.equals("mode")) {
                    lynxSwiperView.setMode(vVar.mo49824c(str));
                    return;
                }
                break;
            case 24002884:
                if (str.equals("previous-margin")) {
                    lynxSwiperView.setPreviousMargin(vVar.mo49827f(str));
                    return;
                }
                break;
            case 364166425:
                if (str.equals("touchable")) {
                    lynxSwiperView.setTouchable(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case 570418373:
                if (str.equals("interval")) {
                    lynxSwiperView.setInterval(vVar.mo49820a(str, 5000));
                    return;
                }
                break;
            case 914875020:
                if (str.equals("item-width")) {
                    lynxSwiperView.setItemWidth(vVar.mo49827f(str));
                    return;
                }
                break;
            case 1126940025:
                if (str.equals("current")) {
                    lynxSwiperView.setCurrentIndex(vVar.mo49820a(str, 0));
                    return;
                }
                break;
            case 1127093697:
                if (str.equals("current-item-id")) {
                    lynxSwiperView.setCurrentItemId(vVar.mo49824c(str));
                    return;
                }
                break;
            case 1255595234:
                if (str.equals("hideshadow")) {
                    lynxSwiperView.setHideShadow(vVar.mo49822a(str, true));
                    return;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    lynxSwiperView.setAutoPlay(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case 1599847372:
                if (str.equals("smooth-scroll")) {
                    lynxSwiperView.setSmoothScroll(vVar.mo49822a(str, true));
                    return;
                }
                break;
            case 1616798838:
                if (str.equals("shadow-color")) {
                    lynxSwiperView.setShadowColor(vVar.mo49824c(str));
                    return;
                }
                break;
            case 1665556140:
                if (str.equals("page-margin")) {
                    lynxSwiperView.setPageMargin(vVar.mo49827f(str));
                    return;
                }
                break;
            case 2050488869:
                if (str.equals("indicator-color")) {
                    lynxSwiperView.setIndicatorColor(vVar.mo49824c(str));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
