package com.bytedance.ies.xelement.input;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;

public class LynxTextAreaView$$PropsSetter extends LynxBaseInputView$$PropsSetter {
    static {
        Covode.recordClassIndex(22044);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.bytedance.ies.xelement.input.LynxBaseInputView$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        LynxTextAreaView lynxTextAreaView = (LynxTextAreaView) lynxBaseUI;
        str.hashCode();
        switch (str.hashCode()) {
            case -1550570986:
                if (str.equals("richtype")) {
                    lynxTextAreaView.setRichType(vVar.mo49824c(str));
                    return;
                }
                break;
            case -428786256:
                if (str.equals("max-height")) {
                    lynxTextAreaView.setMaxHeight(vVar.mo49824c(str));
                    return;
                }
                break;
            case 419784731:
                if (str.equals("maxlines")) {
                    lynxTextAreaView.setMaxLines(vVar.mo49820a(str, Integer.MAX_VALUE));
                    return;
                }
                break;
            case 2043213058:
                if (str.equals("min-height")) {
                    lynxTextAreaView.setMinHeight(vVar.mo49824c(str));
                    return;
                }
                break;
        }
        super.setProperty(lynxBaseUI, str, vVar);
    }
}
