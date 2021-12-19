package com.bytedance.lottie.p1495a.p1497b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1499c.p1501b.C20994c;
import com.bytedance.lottie.p1505f.C21081c;
import com.bytedance.lottie.p1506g.C21089a;
import java.util.List;

/* renamed from: com.bytedance.lottie.a.b.d */
public final class C20958d extends AbstractC20960f<C20994c> {

    /* renamed from: e */
    private final C20994c f49671e;

    static {
        Covode.recordClassIndex(24574);
    }

    public C20958d(List<C21089a<C20994c>> list) {
        super(list);
        int i = 0;
        T t = list.get(0).f49988c;
        i = t != null ? t.f49743b.length : i;
        this.f49671e = new C20994c(new float[i], new int[i]);
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.lottie.p1495a.p1497b.AbstractC20954a
    /* renamed from: a */
    public final /* synthetic */ Object mo34463a(C21089a aVar, float f) {
        C20994c cVar = this.f49671e;
        T t = aVar.f49988c;
        T t2 = aVar.f49989d;
        if (t.f49743b.length == t2.f49743b.length) {
            for (int i = 0; i < t.f49743b.length; i++) {
                float[] fArr = cVar.f49742a;
                float f2 = t.f49742a[i];
                fArr[i] = f2 + ((t2.f49742a[i] - f2) * f);
                cVar.f49743b[i] = C21081c.m39688a(f, t.f49743b[i], t2.f49743b[i]);
            }
            return this.f49671e;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + t.f49743b.length + " vs " + t2.f49743b.length + ")");
    }
}
