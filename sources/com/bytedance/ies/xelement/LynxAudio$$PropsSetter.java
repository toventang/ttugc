package com.bytedance.ies.xelement;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView$$PropsSetter;

public class LynxAudio$$PropsSetter extends UISimpleView$$PropsSetter {
    static {
        Covode.recordClassIndex(21625);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.p2052ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        LynxAudio lynxAudio = (LynxAudio) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -1669980826:
                if (str.equals("nativecontrol")) {
                    lynxAudio.setSupportNativeControl(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case 114148:
                if (str.equals("src")) {
                    lynxAudio.setSrc(vVar.mo49824c(str));
                    return;
                }
                break;
            case 3322014:
                if (str.equals("list")) {
                    lynxAudio.setList(vVar.mo49824c(str));
                    return;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    lynxAudio.setLoop(vVar.mo49824c(str));
                    return;
                }
                break;
            case 1197813673:
                if (str.equals("nativeplugins")) {
                    lynxAudio.setNativePlugins(vVar.mo49824c(str));
                    return;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    lynxAudio.isAutoPlay(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case 1629011506:
                if (str.equals("focusable")) {
                    lynxAudio.setSupportFocusable(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case 2095859131:
                if (str.equals("playerType")) {
                    lynxAudio.setPlayerType(vVar.mo49824c(str));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
