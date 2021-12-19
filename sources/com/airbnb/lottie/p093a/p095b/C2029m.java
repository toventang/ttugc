package com.airbnb.lottie.p093a.p095b;

import android.graphics.PointF;
import com.airbnb.lottie.p093a.p095b.AbstractC2012a;
import com.airbnb.lottie.p107j.C2202a;
import com.bytedance.covode.number.Covode;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.a.b.m */
public final class C2029m extends AbstractC2012a<PointF, PointF> {

    /* renamed from: e */
    private final PointF f6094e = new PointF();

    /* renamed from: f */
    private final AbstractC2012a<Float, Float> f6095f;

    /* renamed from: g */
    private final AbstractC2012a<Float, Float> f6096g;

    static {
        Covode.recordClassIndex(2224);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ PointF mo5918f() {
        return this.f6094e;
    }

    @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a
    /* renamed from: a */
    public final void mo5911a(float f) {
        this.f6095f.mo5911a(f);
        this.f6096g.mo5911a(f);
        this.f6094e.set(this.f6095f.mo5918f().floatValue(), this.f6096g.mo5918f().floatValue());
        for (int i = 0; i < this.f6064a.size(); i++) {
            ((AbstractC2012a.AbstractC2013a) this.f6064a.get(i)).mo5895a();
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.airbnb.lottie.j.a, float] */
    /* access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ PointF mo5909a(C2202a<PointF> aVar, float f) {
        return this.f6094e;
    }

    public C2029m(AbstractC2012a<Float, Float> aVar, AbstractC2012a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f6095f = aVar;
        this.f6096g = aVar2;
        mo5911a(this.f6066c);
    }
}
