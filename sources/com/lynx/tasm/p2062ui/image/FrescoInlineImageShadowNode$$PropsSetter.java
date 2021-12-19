package com.lynx.tasm.p2062ui.image;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode$$PropsSetter;

/* renamed from: com.lynx.tasm.ui.image.FrescoInlineImageShadowNode$$PropsSetter */
public class FrescoInlineImageShadowNode$$PropsSetter extends AbsInlineImageShadowNode$$PropsSetter {
    static {
        Covode.recordClassIndex(34982);
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter, com.lynx.tasm.behavior.shadow.text.AbsInlineImageShadowNode$$PropsSetter
    /* renamed from: a */
    public void mo30605a(ShadowNode shadowNode, String str, C28716v vVar) {
        FrescoInlineImageShadowNode frescoInlineImageShadowNode = (FrescoInlineImageShadowNode) shadowNode;
        str.hashCode();
        if (!str.equals("skip-redirection")) {
            super.mo30605a(shadowNode, str, vVar);
        } else {
            frescoInlineImageShadowNode.setSkipRedirection(vVar.mo49822a(str, false));
        }
    }
}
