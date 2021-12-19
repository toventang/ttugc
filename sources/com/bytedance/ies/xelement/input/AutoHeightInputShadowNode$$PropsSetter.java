package com.bytedance.ies.xelement.input;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode$$PropsSetter;

public class AutoHeightInputShadowNode$$PropsSetter extends TextShadowNode$$PropsSetter {
    static {
        Covode.recordClassIndex(22025);
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$$PropsSetter, com.lynx.tasm.behavior.shadow.ShadowNode$$PropsSetter, com.lynx.tasm.behavior.utils.ShadowNodeSetter, com.lynx.tasm.behavior.shadow.text.TextShadowNode$$PropsSetter
    /* renamed from: a */
    public final void mo30605a(ShadowNode shadowNode, String str, C28716v vVar) {
        AutoHeightInputShadowNode autoHeightInputShadowNode = (AutoHeightInputShadowNode) shadowNode;
        str.hashCode();
        if (!str.equals(C19386b.f45895b)) {
            super.mo30605a(shadowNode, str, vVar);
        } else {
            autoHeightInputShadowNode.setFontTextSize(vVar.mo49827f(str));
        }
    }
}
