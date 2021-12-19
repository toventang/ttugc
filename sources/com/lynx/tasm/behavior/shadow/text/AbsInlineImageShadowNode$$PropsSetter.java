package com.lynx.tasm.behavior.shadow.text;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter;

public class AbsInlineImageShadowNode$$PropsSetter extends ShadowNode$$PropsSetter {
    static {
        Covode.recordClassIndex(34549);
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    /* renamed from: a */
    public void mo30605a(ShadowNode shadowNode, String str, C28716v vVar) {
        AbsInlineImageShadowNode absInlineImageShadowNode = (AbsInlineImageShadowNode) shadowNode;
        str.hashCode();
        if (str.equals("src")) {
            absInlineImageShadowNode.setSource(vVar.mo49824c(str));
        } else if (!str.equals("mode")) {
            super.mo30605a(shadowNode, str, vVar);
        } else {
            absInlineImageShadowNode.setMode(vVar.mo49824c(str));
        }
    }
}
