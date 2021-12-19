package com.bytedance.ies.xelement.pickview;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter;

public class LynxPickerViewColumn$$PropsSetter extends LynxUI$$PropsSetter {
    static {
        Covode.recordClassIndex(22170);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        LynxPickerViewColumn lynxPickerViewColumn = (LynxPickerViewColumn) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -752785969:
                if (str.equals("range-key")) {
                    lynxPickerViewColumn.setRangeKey(vVar.mo49827f(str));
                    return;
                }
                break;
            case -208291852:
                if (str.equals("visible-count")) {
                    lynxPickerViewColumn.setVisibleCount(vVar.mo49824c(str));
                    return;
                }
                break;
            case 108280125:
                if (str.equals("range")) {
                    lynxPickerViewColumn.setRange(vVar.mo49827f(str));
                    return;
                }
                break;
            case 111972721:
                if (str.equals("value")) {
                    lynxPickerViewColumn.setValue(vVar.mo49827f(str));
                    return;
                }
                break;
            case 1256871824:
                if (str.equals("mask-style")) {
                    lynxPickerViewColumn.setMaskStyle(vVar.mo49824c(str));
                    return;
                }
                break;
            case 2065426547:
                if (str.equals("indicator-style")) {
                    lynxPickerViewColumn.setIndicatorStyle(vVar.mo49824c(str));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
