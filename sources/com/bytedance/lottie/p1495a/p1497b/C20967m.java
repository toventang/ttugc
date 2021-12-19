package com.bytedance.lottie.p1495a.p1497b;

import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1495a.p1497b.AbstractC20954a;
import com.bytedance.lottie.p1506g.C21089a;
import java.util.Collections;

/* renamed from: com.bytedance.lottie.a.b.m */
public final class C20967m extends AbstractC20954a<PointF, PointF> {

    /* renamed from: e */
    private final PointF f49683e = new PointF();

    /* renamed from: f */
    private final AbstractC20954a<Float, Float> f49684f;

    /* renamed from: g */
    private final AbstractC20954a<Float, Float> f49685g;

    static {
        Covode.recordClassIndex(24583);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.lottie.p1495a.p1497b.AbstractC20954a
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ PointF mo34470d() {
        return this.f49683e;
    }

    @Override // com.bytedance.lottie.p1495a.p1497b.AbstractC20954a
    /* renamed from: a */
    public final void mo34465a(float f) {
        this.f49684f.mo34465a(f);
        this.f49685g.mo34465a(f);
        this.f49683e.set(this.f49684f.mo34470d().floatValue(), this.f49685g.mo34470d().floatValue());
        for (int i = 0; i < this.f49656a.size(); i++) {
            ((AbstractC20954a.AbstractC20955a) this.f49656a.get(i)).mo34451a();
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.lottie.g.a, float] */
    /* access modifiers changed from: package-private */
    @Override // com.bytedance.lottie.p1495a.p1497b.AbstractC20954a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ PointF mo34463a(C21089a<PointF> aVar, float f) {
        return this.f49683e;
    }

    public C20967m(AbstractC20954a<Float, Float> aVar, AbstractC20954a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f49684f = aVar;
        this.f49685g = aVar2;
        mo34465a(this.f49658c);
    }
}
