package com.lynx.tasm.behavior.p2052ui.text;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter;

/* renamed from: com.lynx.tasm.behavior.ui.text.UIText$$PropsSetter */
public class UIText$$PropsSetter extends LynxUI$$PropsSetter {
    static {
        Covode.recordClassIndex(34750);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        UIText uIText = (UIText) lynxBaseUI;
        str.hashCode();
        if (str.equals(C19386b.f45894a)) {
            uIText.setColor(vVar.mo49827f(str));
        } else if (!str.equals("accessibility-label")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            uIText.setAccessibilityLabel(vVar.mo49827f(str));
        }
    }
}
