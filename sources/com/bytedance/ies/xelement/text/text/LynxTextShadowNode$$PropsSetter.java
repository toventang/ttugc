package com.bytedance.ies.xelement.text.text;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode$$PropsSetter;

public class LynxTextShadowNode$$PropsSetter extends TextShadowNode$$PropsSetter {
    static {
        Covode.recordClassIndex(22240);
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter, com.lynx.tasm.behavior.shadow.text.TextShadowNode$$PropsSetter
    /* renamed from: a */
    public final void mo30605a(ShadowNode shadowNode, String str, C28716v vVar) {
        LynxTextShadowNode lynxTextShadowNode = (LynxTextShadowNode) shadowNode;
        str.hashCode();
        switch (str.hashCode()) {
            case -1550570986:
                if (str.equals("richtype")) {
                    lynxTextShadowNode.setRichType(vVar.mo49824c(str));
                    return;
                }
                break;
            case 125841635:
                if (str.equals("ellipsize-mode")) {
                    lynxTextShadowNode.setEllipsizeMode(vVar.mo49824c(str));
                    return;
                }
                break;
            case 1629007544:
                if (str.equals("text-maxline")) {
                    lynxTextShadowNode.setTextMaxLine(vVar.mo49824c(str));
                    return;
                }
                break;
        }
        super.mo30605a(shadowNode, str, vVar);
    }
}
