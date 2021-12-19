package com.lynx.tasm.behavior.shadow.text;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter;

public class RawTextShadowNode$$PropsSetter extends ShadowNode$$PropsSetter {
    static {
        Covode.recordClassIndex(34562);
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter
    /* renamed from: a */
    public final void mo30605a(ShadowNode shadowNode, String str, C28716v vVar) {
        RawTextShadowNode rawTextShadowNode = (RawTextShadowNode) shadowNode;
        str.hashCode();
        if (str.equals("pseudo")) {
            rawTextShadowNode.setPsuedo(vVar.mo49822a(str, false));
        } else if (!str.equals("text")) {
            super.mo30605a(shadowNode, str, vVar);
        } else {
            rawTextShadowNode.setText(vVar.mo49827f(str));
        }
    }
}
