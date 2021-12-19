package com.bytedance.ies.xelement;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView$$PropsSetter;

public class LynxVideoManagerLite$$PropsSetter extends UISimpleView$$PropsSetter {
    static {
        Covode.recordClassIndex(21677);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.p2052ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        LynxVideoManagerLite lynxVideoManagerLite = (LynxVideoManagerLite) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -1699818261:
                if (str.equals("enableplaylistener")) {
                    lynxVideoManagerLite.setEnablePlayListener(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case -1664825047:
                if (str.equals("singleplayer")) {
                    lynxVideoManagerLite.setSinglePlayer(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case -1531319052:
                if (str.equals("performanceLog")) {
                    lynxVideoManagerLite.setPerformanceLog(vVar.mo49824c(str));
                    return;
                }
                break;
            case -1489589134:
                if (str.equals("objectfit")) {
                    lynxVideoManagerLite.setObjectFit(vVar.mo49824c(str));
                    return;
                }
                break;
            case -982450867:
                if (str.equals("poster")) {
                    lynxVideoManagerLite.setPoster(vVar.mo49827f(str));
                    return;
                }
                break;
            case -894681731:
                if (str.equals("__control")) {
                    lynxVideoManagerLite.setControl(vVar.mo49824c(str));
                    return;
                }
                break;
            case -810883302:
                if (str.equals("volume")) {
                    lynxVideoManagerLite.setVolume(vVar.mo49819a(str, 0.0f));
                    return;
                }
                break;
            case -318476791:
                if (str.equals("preload")) {
                    lynxVideoManagerLite.setPreload(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    lynxVideoManagerLite.setSrc(vVar.mo49827f(str));
                    return;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    lynxVideoManagerLite.setLoop(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case 3493088:
                if (str.equals("rate")) {
                    lynxVideoManagerLite.setRate(vVar.mo49820a(str, 0));
                    return;
                }
                break;
            case 104264043:
                if (str.equals("muted")) {
                    lynxVideoManagerLite.setMuted(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case 269397981:
                if (str.equals("inittime")) {
                    lynxVideoManagerLite.setInitTime(vVar.mo49820a(str, 0));
                    return;
                }
                break;
            case 850708551:
                if (str.equals("log-extra")) {
                    lynxVideoManagerLite.setLogExtra(vVar.mo49826e(str));
                    return;
                }
                break;
            case 894041755:
                if (str.equals("autolifecycle")) {
                    lynxVideoManagerLite.setAutoLifecycle(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case 1331794760:
                if (str.equals("video-tag")) {
                    lynxVideoManagerLite.setVideoTag(vVar.mo49824c(str));
                    return;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    lynxVideoManagerLite.setAutoPlay(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case 1933829272:
                if (str.equals("devicechangeaware")) {
                    lynxVideoManagerLite.setDeviceChangeAware(vVar.mo49822a(str, false));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
