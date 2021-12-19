package com.bytedance.ies.xelement.text.inlinetext;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.InlineTextShadowNode$$PropsSetter;

public class LynxInlineTextShadowNode$$PropsSetter extends InlineTextShadowNode$$PropsSetter {
    static {
        Covode.recordClassIndex(22235);
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter, com.lynx.tasm.behavior.shadow.text.InlineTextShadowNode$$PropsSetter
    /* renamed from: a */
    public final void mo30605a(ShadowNode shadowNode, String str, C28716v vVar) {
        LynxInlineTextShadowNode lynxInlineTextShadowNode = (LynxInlineTextShadowNode) shadowNode;
        str.hashCode();
        if (!str.equals("no-trim")) {
            super.mo30605a(shadowNode, str, vVar);
        } else {
            lynxInlineTextShadowNode.setNoTrim(vVar.mo49822a(str, true));
        }
    }
}
