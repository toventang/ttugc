package com.lynx.tasm.behavior.shadow;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.utils.ShadowNodeSetter;

public class ShadowNode$$PropsSetter implements ShadowNodeSetter<ShadowNode> {
    static {
        Covode.recordClassIndex(34534);
    }

    @Override // com.lynx.tasm.behavior.utils.ShadowNodeSetter
    /* renamed from: a */
    public void mo30605a(ShadowNode shadowNode, String str, C28716v vVar) {
        str.hashCode();
        if (str.equals("vertical-align")) {
            shadowNode.setVerticalAlign(vVar.mo49825d(str));
        }
    }
}
