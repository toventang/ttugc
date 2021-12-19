package com.bytedance.ies.xelement.alphavideo;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView$$PropsSetter;

public class LynxAlphaVideo$$PropsSetter extends UISimpleView$$PropsSetter {
    static {
        Covode.recordClassIndex(21695);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.p2052ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        LynxAlphaVideo lynxAlphaVideo = (LynxAlphaVideo) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -2133601602:
                if (str.equals("keep-last-frame")) {
                    lynxAlphaVideo.setKeepLastFrame(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case -982450867:
                if (str.equals("poster")) {
                    lynxAlphaVideo.setPoster(vVar.mo49824c(str));
                    return;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    lynxAlphaVideo.setSrc(vVar.mo49824c(str));
                    return;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    lynxAlphaVideo.setLoop(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case 838895478:
                if (str.equals("last-frame")) {
                    lynxAlphaVideo.setLastFrame(vVar.mo49824c(str));
                    return;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    lynxAlphaVideo.setAutoPlay(vVar.mo49822a(str, true));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
