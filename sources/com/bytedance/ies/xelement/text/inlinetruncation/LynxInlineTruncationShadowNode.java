package com.bytedance.ies.xelement.text.inlinetruncation;

import android.text.SpannableStringBuilder;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import java.util.ArrayList;
import java.util.List;

public final class LynxInlineTruncationShadowNode extends TextShadowNode {
    static {
        Covode.recordClassIndex(22237);
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    /* renamed from: a */
    public final boolean mo30992a() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    /* renamed from: a */
    public final void mo30991a(SpannableStringBuilder spannableStringBuilder, List<BaseTextShadowNode.C28548b> list) {
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        super.mo30991a(spannableStringBuilder2, arrayList);
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                arrayList.get(size).mo49146a(spannableStringBuilder2);
            } else {
                this.f67176s = spannableStringBuilder2;
                return;
            }
        }
    }
}
