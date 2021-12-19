package com.bytedance.ies.xelement;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll$$PropsSetter;

public class LynxScrollView$$PropsSetter extends AbsLynxUIScroll$$PropsSetter {
    static {
        Covode.recordClassIndex(21654);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.scroll.AbsLynxUIScroll$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.p2052ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        LynxScrollView lynxScrollView = (LynxScrollView) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -1826701651:
                if (str.equals("scroll-to-id")) {
                    lynxScrollView.scrollToId(vVar.mo49824c(str));
                    return;
                }
                break;
            case -1383205240:
                if (str.equals("bounce")) {
                    lynxScrollView.setBounces(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case -1138034670:
                if (str.equals("enable-load-more")) {
                    lynxScrollView.enableLoadMore(vVar.mo49822a(str, true));
                    return;
                }
                break;
            case 363559068:
                if (str.equals("layout-direction")) {
                    lynxScrollView.setLayoutDirection(vVar.mo49824c(str));
                    return;
                }
                break;
            case 561570840:
                if (str.equals("overflow-text")) {
                    lynxScrollView.overflowText(vVar.mo49824c(str));
                    return;
                }
                break;
            case 1448017537:
                if (str.equals("page-enable")) {
                    lynxScrollView.setPageEnable(vVar.mo49822a(str, false));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
