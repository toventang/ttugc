package com.bytedance.ies.xelement.overlay;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.UIGroup$$PropsSetter;

public class LynxOverlayView$$PropsSetter extends UIGroup$$PropsSetter {
    static {
        Covode.recordClassIndex(22080);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.p2052ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        LynxOverlayView lynxOverlayView = (LynxOverlayView) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -1952821320:
                if (str.equals("overlay-id")) {
                    lynxOverlayView.setOverlayId(vVar.mo49824c(str));
                    return;
                }
                break;
            case -1389050563:
                if (str.equals("events-pass-through")) {
                    lynxOverlayView.setEventsPassThrough(vVar.mo49827f(str));
                    return;
                }
                break;
            case -939362323:
                if (str.equals("cut-out-mode")) {
                    lynxOverlayView.setCutOutMode(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case -243354428:
                if (str.equals("status-bar-translucent")) {
                    lynxOverlayView.setStatusBarTranslucent(vVar.mo49827f(str));
                    return;
                }
                break;
            case 466743410:
                if (str.equals("visible")) {
                    lynxOverlayView.setVisible(vVar.mo49827f(str));
                    return;
                }
                break;
            case 1860950378:
                if (str.equals("full-screen")) {
                    lynxOverlayView.setFullScreen(vVar.mo49822a(str, false));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
