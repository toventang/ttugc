package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.view;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.p3803a.AbstractC70519b;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.p3803a.C70517a;
import com.p2082ss.android.ugc.tools.view.widget.C85041d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.e */
public final class C71510e implements AbstractC70519b {

    /* renamed from: a */
    private boolean f160263a = true;

    /* renamed from: b */
    private final ActivityC0945e f160264b;

    /* renamed from: c */
    private final AbstractC89171a<Boolean> f160265c;

    /* renamed from: d */
    private final AbstractC89171a<Long> f160266d;

    static {
        Covode.recordClassIndex(84051);
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

    public C71510e(ActivityC0945e eVar, AbstractC89171a<Boolean> aVar, AbstractC89171a<Long> aVar2) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f160264b = eVar;
        this.f160265c = aVar;
        this.f160266d = aVar2;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.p3803a.AbstractC70519b
    /* renamed from: a */
    public final C70517a<Float> mo78843a(float f, int i, float f2, float f3) {
        return m126379a(false, f2, f, i, f3);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.p3803a.AbstractC70519b
    /* renamed from: b */
    public final C70517a<Float> mo78846b(float f, int i, float f2, float f3) {
        return m126379a(true, f, f2, i, f3);
    }

    /* renamed from: a */
    private final C70517a<Float> m126379a(boolean z, float f, float f2, int i, float f3) {
        C89378p<Boolean, Float> b = m126380b(z, f, f2, i, f3);
        if (!b.getFirst().booleanValue()) {
            this.f160263a = true;
        } else if (this.f160263a) {
            C85041d.m146229c(this.f160264b, R.string.czq).mo129984b();
            this.f160263a = false;
        }
        if (b.getFirst().booleanValue()) {
            return C70517a.C70518a.m124518a(b.getSecond());
        }
        return C70517a.C70518a.m124519b(Float.valueOf(0.0f));
    }

    /* renamed from: b */
    private final C89378p<Boolean, Float> m126380b(boolean z, float f, float f2, int i, float f3) {
        float f4;
        if (!this.f160265c.invoke().booleanValue()) {
            return new C89378p<>(false, Float.valueOf(0.0f));
        }
        float f5 = (float) i;
        float abs = Math.abs((f2 - f) - f5) * f3;
        float longValue = (float) this.f160266d.invoke().longValue();
        if (abs < longValue) {
            return new C89378p<>(false, Float.valueOf(abs));
        }
        if (z) {
            f4 = (f2 - f5) - (longValue / f3);
        } else {
            f4 = f + f5 + (longValue / f3);
        }
        return new C89378p<>(true, Float.valueOf(f4));
    }
}
