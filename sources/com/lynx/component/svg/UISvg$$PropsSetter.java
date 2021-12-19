package com.lynx.component.svg;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter;

public class UISvg$$PropsSetter extends LynxUI$$PropsSetter {
    static {
        Covode.recordClassIndex(34201);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        UISvg uISvg = (UISvg) lynxBaseUI;
        try {
            int hashCode = str.hashCode();
            if (hashCode != 114148) {
                if (hashCode == 951530617) {
                    if (str.equals("content")) {
                        uISvg.setContent(vVar.mo49824c(str));
                        return;
                    }
                }
            } else if (str.equals("src")) {
                uISvg.setSource(vVar.mo49824c(str));
                return;
            }
            super.setProperty(lynxBaseUI, str, vVar);
        } catch (Exception e) {
            throw new RuntimeException("setProperty error: " + str + "\n" + e.toString());
        }
    }
}
