package com.lynx.tasm.behavior.shadow.text;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.shadow.ShadowNode;

public class InlineTextShadowNode$$PropsSetter extends BaseTextShadowNode$$PropsSetter {
    static {
        Covode.recordClassIndex(34557);
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    /* renamed from: a */
    public void mo30605a(ShadowNode shadowNode, String str, C28716v vVar) {
        InlineTextShadowNode inlineTextShadowNode = (InlineTextShadowNode) shadowNode;
        str.hashCode();
        if (!str.equals("background-color")) {
            super.mo30605a(shadowNode, str, vVar);
        } else {
            inlineTextShadowNode.setBackgroundColor(vVar.mo49820a(str, 0));
        }
    }
}
