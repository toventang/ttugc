package com.bytedance.ies.xelement.text.inlinetext;

import android.text.SpannableStringBuilder;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.text.p1397a.C19421e;
import com.bytedance.ies.xelement.text.text.LynxTextShadowNode;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.shadow.C28542g;
import com.lynx.tasm.behavior.shadow.text.C28561k;
import com.lynx.tasm.behavior.shadow.text.InlineTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.RawTextShadowNode;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxInlineTextShadowNode extends InlineTextShadowNode {

    /* renamed from: b */
    public static final C19422a f46019b = new C19422a((byte) 0);

    /* renamed from: a */
    public String f46020a = "none";

    /* renamed from: c */
    private boolean f46021c;

    static {
        Covode.recordClassIndex(22234);
    }

    /* renamed from: com.bytedance.ies.xelement.text.inlinetext.LynxInlineTextShadowNode$a */
    public static final class C19422a {
        static {
            Covode.recordClassIndex(22236);
        }

        private C19422a() {
        }

        public /* synthetic */ C19422a(byte b) {
            this();
        }
    }

    @AbstractC28525m(mo49059a = "no-trim", mo49064f = true)
    public final void setNoTrim(boolean z) {
        this.f46021c = z;
        mo49092d();
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    /* renamed from: a */
    public final void mo30989a(SpannableStringBuilder spannableStringBuilder, RawTextShadowNode rawTextShadowNode) {
        int i;
        C89219l.m154719c(spannableStringBuilder, "");
        C89219l.m154719c(rawTextShadowNode, "");
        String str = rawTextShadowNode.f67171a;
        if (!this.f46021c) {
            str = LynxTextShadowNode.C19423a.m36241a(str);
        }
        if (C89219l.m154714a((Object) this.f46020a, (Object) "bracket")) {
            AbstractC28520j h = mo49108h();
            C28561k kVar = this.f67161o;
            C89219l.m154709a((Object) kVar, "");
            if (C28542g.m57093a(kVar.f67201k)) {
                i = 40;
            } else {
                C28561k kVar2 = this.f67161o;
                C89219l.m154709a((Object) kVar2, "");
                i = (int) kVar2.f67201k;
            }
            spannableStringBuilder.append(C19421e.m36226a(h, str, i));
            return;
        }
        spannableStringBuilder.append((CharSequence) str);
    }
}
