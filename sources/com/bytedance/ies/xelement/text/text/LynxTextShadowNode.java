package com.bytedance.ies.xelement.text.text;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.text.inlinetext.LynxInlineTextShadowNode;
import com.bytedance.ies.xelement.text.inlinetruncation.LynxInlineTruncationShadowNode;
import com.bytedance.ies.xelement.text.p1397a.AbstractC19417b;
import com.bytedance.ies.xelement.text.p1397a.C19416a;
import com.bytedance.ies.xelement.text.p1397a.C19418c;
import com.bytedance.ies.xelement.text.p1397a.C19420d;
import com.bytedance.ies.xelement.text.p1397a.C19421e;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.shadow.C28542g;
import com.lynx.tasm.behavior.shadow.EnumC28540e;
import com.lynx.tasm.behavior.shadow.LayoutNode;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.C28561k;
import com.lynx.tasm.behavior.shadow.text.RawTextShadowNode;
import com.lynx.tasm.behavior.shadow.text.TextShadowNode;
import com.lynx.tasm.behavior.utils.C28715e;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;

public final class LynxTextShadowNode extends TextShadowNode {

    /* renamed from: b */
    public static final C89350l f46022b = new C89350l("^[\\s]+|[\\s]+$");

    /* renamed from: c */
    public static final C19423a f46023c = new C19423a((byte) 0);

    /* renamed from: a */
    public AbstractC89172b<? super Context, ? extends AbstractC19417b> f46024a = C19424b.f46027a;

    /* renamed from: t */
    private String f46025t = "none";

    /* renamed from: u */
    private int f46026u;

    @Override // com.lynx.tasm.behavior.shadow.text.TextShadowNode
    /* renamed from: b */
    public final boolean mo30994b() {
        return false;
    }

    /* renamed from: com.bytedance.ies.xelement.text.text.LynxTextShadowNode$a */
    public static final class C19423a {
        static {
            Covode.recordClassIndex(22241);
        }

        private C19423a() {
        }

        public /* synthetic */ C19423a(byte b) {
            this();
        }

        /* renamed from: a */
        public static String m36241a(String str) {
            if (str != null) {
                return C28715e.m57503b(LynxTextShadowNode.f46022b.replace(str, ""));
            }
            return null;
        }
    }

    static {
        Covode.recordClassIndex(22239);
    }

    /* renamed from: com.bytedance.ies.xelement.text.text.LynxTextShadowNode$b */
    static final class C19424b extends AbstractC89220m implements AbstractC89172b<Context, C19416a> {

        /* renamed from: a */
        public static final C19424b f46027a = new C19424b();

        static {
            Covode.recordClassIndex(22242);
        }

        C19424b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C19416a invoke(Context context) {
            C89219l.m154719c(context, "");
            return new C19416a();
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    /* renamed from: a */
    public final void mo30993a(AbstractC28520j jVar) {
        super.mo30993a(jVar);
        C19418c a = C19418c.C19419a.m36225a();
        AbstractC89172b<? super Context, ? extends AbstractC19417b> bVar = this.f46024a;
        if (jVar == null) {
            C89219l.m154707a();
        }
        a.mo30986a((AbstractC19417b) bVar.invoke(jVar));
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    @AbstractC28525m(mo49059a = "text-maxline")
    public final void setTextMaxLine(String str) {
        C89219l.m154719c(str, "");
        super.setTextMaxLine(str);
        this.f46026u = Integer.parseInt(str);
        mo49092d();
    }

    @AbstractC28525m(mo49059a = "ellipsize-mode")
    public final void setEllipsizeMode(String str) {
        C89219l.m154719c(str, "");
        int hashCode = str.hashCode();
        if (hashCode != 3056464) {
            if (hashCode == 3552336 && str.equals("tail")) {
                setTextOverflow(1);
            }
        } else if (str.equals("clip")) {
            setTextOverflow(0);
        }
        mo49092d();
    }

    @AbstractC28525m(mo49059a = "richtype")
    public final void setRichType(String str) {
        float f;
        C89219l.m154719c(str, "");
        this.f46025t = str;
        if (C89219l.m154714a((Object) str, (Object) "bracket")) {
            C28561k kVar = this.f67161o;
            C89219l.m154709a((Object) kVar, "");
            if (C28542g.m57093a(kVar.f67201k)) {
                f = 40.0f;
            } else {
                C28561k kVar2 = this.f67161o;
                C89219l.m154709a((Object) kVar2, "");
                f = kVar2.f67201k;
            }
            setLineHeight(f);
        }
        mo49092d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0186  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m36235a(float r24) {
        /*
        // Method dump skipped, instructions count: 494
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.text.text.LynxTextShadowNode.m36235a(float):boolean");
    }

    /* renamed from: a */
    private static int m36233a(List<? extends List<Integer>> list, int i) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return 0;
            }
            List list2 = (List) list.get(size);
            if (((Number) list2.get(0)).intValue() <= i && i <= ((Number) list2.get(1)).intValue()) {
                return ((Number) list2.get(1)).intValue() - ((Number) list2.get(0)).intValue();
            }
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    /* renamed from: a */
    public final void mo30989a(SpannableStringBuilder spannableStringBuilder, RawTextShadowNode rawTextShadowNode) {
        C89219l.m154719c(spannableStringBuilder, "");
        C89219l.m154719c(rawTextShadowNode, "");
        String a = C19423a.m36241a(rawTextShadowNode.f67171a);
        if (C89219l.m154714a((Object) this.f46025t, (Object) "bracket")) {
            AbstractC28520j h = mo49108h();
            C28561k kVar = this.f67161o;
            C89219l.m154709a((Object) kVar, "");
            spannableStringBuilder.append(C19421e.m36226a(h, a, (int) kVar.f67201k));
            return;
        }
        spannableStringBuilder.append((CharSequence) a);
    }

    @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode
    /* renamed from: a */
    public final void mo30991a(SpannableStringBuilder spannableStringBuilder, List<BaseTextShadowNode.C28548b> list) {
        int f = mo49106f();
        for (int i = 0; i < f; i++) {
            ShadowNode b = mo49103b(i);
            if (b instanceof LynxInlineTextShadowNode) {
                String str = this.f46025t;
                C89219l.m154719c(str, "");
                ((LynxInlineTextShadowNode) b).f46020a = str;
            }
        }
        super.mo30991a(spannableStringBuilder, list);
    }

    /* renamed from: a */
    private static List<Integer> m36234a(int i, CharSequence charSequence, TextPaint textPaint) {
        ArrayList d = C89070n.m154525d(0, 0);
        if (TextUtils.isEmpty(charSequence)) {
            return d;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(charSequence) && (charSequence instanceof Spanned)) {
            Spanned spanned = (Spanned) charSequence;
            C19420d[] dVarArr = (C19420d[]) spanned.getSpans(0, charSequence.length(), C19420d.class);
            for (C19420d dVar : dVarArr) {
                arrayList.add(C89070n.m154522b(Integer.valueOf(spanned.getSpanStart(dVar)), Integer.valueOf(spanned.getSpanEnd(dVar))));
            }
        }
        int length = charSequence.length();
        float f = 0.0f;
        while (length > 0 && ((float) i) > f) {
            int a = m36233a(arrayList, length);
            if (a <= 0) {
                a = 1;
            }
            length -= a;
            f = Layout.getDesiredWidth(charSequence.subSequence(length, charSequence.length()), textPaint);
        }
        d.set(0, Integer.valueOf(charSequence.length() - length));
        d.set(1, Integer.valueOf((int) f));
        return d;
    }

    @Override // com.lynx.tasm.behavior.shadow.AbstractC28539d, com.lynx.tasm.behavior.shadow.text.TextShadowNode
    /* renamed from: a */
    public final long mo30603a(LayoutNode layoutNode, float f, EnumC28540e eVar, float f2, EnumC28540e eVar2) {
        float f3;
        if (eVar == EnumC28540e.UNDEFINED) {
            f3 = Float.MAX_VALUE;
        } else {
            f3 = f;
        }
        if (m36235a(f3)) {
            CharSequence charSequence = this.f67176s;
            C89219l.m154709a((Object) charSequence, "");
            SpannableStringBuilder spannableStringBuilder = null;
            if ((charSequence instanceof SpannableStringBuilder) && charSequence != null) {
                spannableStringBuilder = (SpannableStringBuilder) charSequence;
            }
            int f4 = mo49106f();
            for (int i = 0; i < f4; i++) {
                ShadowNode b = mo49103b(i);
                if ((b instanceof LynxInlineTruncationShadowNode) && spannableStringBuilder != null) {
                    spannableStringBuilder.append(((LynxInlineTruncationShadowNode) b).f67176s);
                }
            }
        }
        return super.mo30603a(layoutNode, f, eVar, f2, eVar2);
    }
}
