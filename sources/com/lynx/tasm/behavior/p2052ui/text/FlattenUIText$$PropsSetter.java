package com.lynx.tasm.behavior.p2052ui.text;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxFlattenUI$$PropsSetter;

/* renamed from: com.lynx.tasm.behavior.ui.text.FlattenUIText$$PropsSetter */
public class FlattenUIText$$PropsSetter extends LynxFlattenUI$$PropsSetter {
    static {
        Covode.recordClassIndex(34746);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxFlattenUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        FlattenUIText flattenUIText = (FlattenUIText) lynxBaseUI;
        str.hashCode();
        if (!str.equals(C19386b.f45894a)) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            flattenUIText.setColor(vVar.mo49827f(str));
        }
    }
}
