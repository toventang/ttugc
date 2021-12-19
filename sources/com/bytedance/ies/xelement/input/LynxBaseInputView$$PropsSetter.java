package com.bytedance.ies.xelement.input;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.kakao.usermgmt.StringSet;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter;

public class LynxBaseInputView$$PropsSetter extends LynxUI$$PropsSetter {
    static {
        Covode.recordClassIndex(22028);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        LynxBaseInputView lynxBaseInputView = (LynxBaseInputView) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -1988401764:
                if (str.equals("letter-spacing")) {
                    lynxBaseInputView.setLetterSpacing(vVar.mo49819a(str, 0.0f));
                    return;
                }
                break;
            case -1730062511:
                if (str.equals("smart-scroll")) {
                    lynxBaseInputView.setSmartScroll(vVar.mo49822a(str, true));
                    return;
                }
                break;
            case -1586082113:
                if (str.equals(C19386b.f45895b)) {
                    lynxBaseInputView.setFontTextSize(vVar.mo49827f(str));
                    return;
                }
                break;
            case -962590849:
                if (str.equals("direction")) {
                    lynxBaseInputView.setLynxDirection(vVar.mo49820a(str, 3));
                    return;
                }
                break;
            case -866730430:
                if (str.equals("readonly")) {
                    lynxBaseInputView.setIsReadOnly(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case -525534091:
                if (str.equals("fullscreen-mode")) {
                    lynxBaseInputView.setKeyBoardFullscreenMode(vVar.mo49822a(str, true));
                    return;
                }
                break;
            case -445272125:
                if (str.equals("show-soft-input-onfocus")) {
                    lynxBaseInputView.setShowSoftInputOnFocus(vVar.mo49822a(str, true));
                    return;
                }
                break;
            case -140393755:
                if (str.equals("placeholder-font-size")) {
                    lynxBaseInputView.setPlaceholderTextSize(vVar.mo49827f(str));
                    return;
                }
                break;
            case 3575610:
                if (str.equals(StringSet.type)) {
                    lynxBaseInputView.setInputType(vVar.mo49824c(str));
                    return;
                }
                break;
            case 94842723:
                if (str.equals(C19386b.f45894a)) {
                    lynxBaseInputView.setFontColor(vVar.mo49827f(str));
                    return;
                }
                break;
            case 97604824:
                if (str.equals("focus")) {
                    lynxBaseInputView.setFocus(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case 111972721:
                if (str.equals("value")) {
                    lynxBaseInputView.setInputValue(vVar.mo49824c(str));
                    return;
                }
                break;
            case 124732746:
                if (str.equals("maxlength")) {
                    lynxBaseInputView.setMaxLength(vVar.mo49827f(str));
                    return;
                }
                break;
            case 270940796:
                if (str.equals("disabled")) {
                    lynxBaseInputView.setDisable(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case 598246771:
                if (str.equals("placeholder")) {
                    lynxBaseInputView.setPlaceholder(vVar.mo49824c(str));
                    return;
                }
                break;
            case 746232421:
                if (str.equals("text-align")) {
                    lynxBaseInputView.setTextAlign(vVar.mo49820a(str, 0));
                    return;
                }
                break;
            case 1101235489:
                if (str.equals("adjust-mode")) {
                    lynxBaseInputView.setAdjustMode(vVar.mo49824c(str));
                    return;
                }
                break;
            case 1155760891:
                if (str.equals("bottom-inset")) {
                    lynxBaseInputView.setBottomInset(vVar.mo49824c(str));
                    return;
                }
                break;
            case 1437560563:
                if (str.equals("auto-fit")) {
                    lynxBaseInputView.setAutoFit(vVar.mo49822a(str, true));
                    return;
                }
                break;
            case 1782197877:
                if (str.equals("enableAutoFill")) {
                    lynxBaseInputView.setIsAutoFillEnabled(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case 1901673625:
                if (str.equals("caret-color")) {
                    lynxBaseInputView.setCursorColor(vVar.mo49824c(str));
                    return;
                }
                break;
            case 2018420361:
                if (str.equals("placeholder-color")) {
                    lynxBaseInputView.setPlaceholderColor(vVar.mo49827f(str));
                    return;
                }
                break;
            case 2033358039:
                if (str.equals("placeholder-style")) {
                    lynxBaseInputView.setPlaceHolderStyle(vVar.mo49826e(str));
                    return;
                }
                break;
            case 2051146279:
                if (str.equals("confirm-type")) {
                    lynxBaseInputView.setConfirmType(vVar.mo49824c(str));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
