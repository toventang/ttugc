package com.p2082ss.android.ugc.aweme.effect.p2891c.p2893b;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.p3803a.AbstractC70519b;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.p3803a.C70517a;
import com.p2082ss.android.ugc.tools.view.widget.C85041d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.c.b.c */
public final class C46348c implements AbstractC70519b {

    /* renamed from: a */
    private boolean f108034a = true;

    /* renamed from: b */
    private final ActivityC0945e f108035b;

    /* renamed from: c */
    private final AbstractC89171a<Boolean> f108036c;

    /* renamed from: d */
    private final AbstractC89172b<Float, Long> f108037d;

    /* renamed from: e */
    private final AbstractC89189s<Boolean, Float, Float, Integer, Float, Float> f108038e;

    static {
        Covode.recordClassIndex(54925);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.p3803a.AbstractC70519b
    /* renamed from: b */
    public final C70517a<C89378p<Float, Float>> mo78845b() {
        Float valueOf = Float.valueOf(0.0f);
        return C70517a.C70518a.m124519b(new C89378p(valueOf, valueOf));
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.p3803a.AbstractC70519b
    /* renamed from: a */
    public final String mo78844a() {
        String simpleName = getClass().getSimpleName();
        C89219l.m154716b(simpleName, "");
        return simpleName;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.p3803a.AbstractC70519b
    /* renamed from: a */
    public final C70517a<Float> mo78843a(float f, int i, float f2, float f3) {
        return m89403a(false, f2, f, i, f3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super java.lang.Float, java.lang.Long> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.s<? super java.lang.Boolean, ? super java.lang.Float, ? super java.lang.Float, ? super java.lang.Integer, ? super java.lang.Float, java.lang.Float> */
    /* JADX WARN: Multi-variable type inference failed */
    public C46348c(ActivityC0945e eVar, AbstractC89171a<Boolean> aVar, AbstractC89172b<? super Float, Long> bVar, AbstractC89189s<? super Boolean, ? super Float, ? super Float, ? super Integer, ? super Float, Float> sVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(sVar, "");
        this.f108035b = eVar;
        this.f108036c = aVar;
        this.f108037d = bVar;
        this.f108038e = sVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.p3803a.AbstractC70519b
    /* renamed from: b */
    public final C70517a<Float> mo78846b(float f, int i, float f2, float f3) {
        return m89403a(true, f, f2, i, f3);
    }

    /* renamed from: a */
    private final C70517a<Float> m89403a(boolean z, float f, float f2, int i, float f3) {
        C89378p<Boolean, Float> b = m89404b(z, f, f2, i, f3);
        if (!b.getFirst().booleanValue()) {
            this.f108034a = true;
        } else if (this.f108034a) {
            C85041d.m146229c(this.f108035b, R.string.bla).mo129984b();
            this.f108034a = false;
        }
        if (b.getFirst().booleanValue()) {
            return C70517a.C70518a.m124518a(b.getSecond());
        }
        return C70517a.C70518a.m124519b(Float.valueOf(0.0f));
    }

    /* renamed from: b */
    private final C89378p<Boolean, Float> m89404b(boolean z, float f, float f2, int i, float f3) {
        boolean booleanValue = this.f108036c.invoke().booleanValue();
        Float valueOf = Float.valueOf(0.0f);
        if (!booleanValue) {
            return new C89378p<>(false, valueOf);
        }
        if (!C46344a.m89396a(this.f108037d.invoke(Float.valueOf(Math.abs((f2 - f) - ((float) i)) * f3)).longValue())) {
            return new C89378p<>(false, valueOf);
        }
        return new C89378p<>(true, Float.valueOf(this.f108038e.invoke(Boolean.valueOf(z), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i), Float.valueOf(f3)).floatValue()));
    }
}
