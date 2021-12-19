package com.bytedance.xelement.experiment.richtext;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter;

public class ExperimentRichTextUI$$PropsSetter extends LynxUI$$PropsSetter {
    static {
        Covode.recordClassIndex(27810);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI$$PropsSetter, com.lynx.tasm.behavior.p2052ui.LynxBaseUI$$PropsSetter, com.lynx.tasm.behavior.utils.LynxUISetter
    public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
        ExperimentRichTextUI experimentRichTextUI = (ExperimentRichTextUI) lynxBaseUI;
        str.hashCode();
        if (!str.equals("html")) {
            super.setProperty(lynxBaseUI, str, vVar);
        } else {
            experimentRichTextUI.setSpan(vVar.mo49824c(str));
        }
    }
}
