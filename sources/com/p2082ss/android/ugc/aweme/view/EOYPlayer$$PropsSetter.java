package com.p2082ss.android.ugc.aweme.view;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.view.UISimpleView$$PropsSetter;

/* renamed from: com.ss.android.ugc.aweme.view.EOYPlayer$$PropsSetter */
public class EOYPlayer$$PropsSetter extends UISimpleView$$PropsSetter {
    static {
        Covode.recordClassIndex(94413);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.p2052ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        EOYPlayer eOYPlayer = (EOYPlayer) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case 114148:
                if (str.equals("src")) {
                    eOYPlayer.setSrc(vVar.mo49827f(str));
                    return;
                }
                break;
            case 3443508:
                if (str.equals("play")) {
                    eOYPlayer.switchPlay(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case 104264043:
                if (str.equals("muted")) {
                    eOYPlayer.setMuted(vVar.mo49822a(str, false));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
