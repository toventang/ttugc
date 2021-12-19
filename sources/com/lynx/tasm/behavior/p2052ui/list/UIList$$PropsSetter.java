package com.lynx.tasm.behavior.p2052ui.list;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;

/* renamed from: com.lynx.tasm.behavior.ui.list.UIList$$PropsSetter */
public class UIList$$PropsSetter extends AbsLynxList$$PropsSetter {
    static {
        Covode.recordClassIndex(34681);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.view.UISimpleView$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter, com.lynx.tasm.behavior.p2052ui.list.AbsLynxList$$PropsSetter, com.lynx.tasm.behavior.p2052ui.UIGroup$$PropsSetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        UIList uIList = (UIList) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -1035189822:
                if (str.equals("enable-new-exposure-strategy")) {
                    uIList.setNewAppear(vVar.mo49822a(str, false));
                    return;
                }
                break;
            case 1683042429:
                if (str.equals("android-diffable")) {
                    uIList.setDiffable(vVar.mo49827f(str));
                    return;
                }
                break;
            case 1816872768:
                if (str.equals("auto-measure")) {
                    uIList.setAutoMeasure(vVar.mo49827f(str));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
