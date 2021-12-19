package com.airbnb.lottie.p093a.p095b;

import com.airbnb.lottie.p099e.p101b.C2065c;
import com.airbnb.lottie.p106i.C2188b;
import com.airbnb.lottie.p107j.C2202a;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.d */
public final class C2020d extends AbstractC2022f<C2065c> {

    /* renamed from: e */
    private final C2065c f6080e;

    static {
        Covode.recordClassIndex(2215);
    }

    public C2020d(List<C2202a<C2065c>> list) {
        super(list);
        int i = 0;
        T t = list.get(0).f6566b;
        i = t != null ? t.f6186b.length : i;
        this.f6080e = new C2065c(new float[i], new int[i]);
    }

    /* access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a
    /* renamed from: a */
    public final /* synthetic */ Object mo5909a(C2202a aVar, float f) {
        C2065c cVar = this.f6080e;
        T t = aVar.f6566b;
        T t2 = aVar.f6567c;
        if (t.f6186b.length == t2.f6186b.length) {
            for (int i = 0; i < t.f6186b.length; i++) {
                float[] fArr = cVar.f6185a;
                float f2 = t.f6185a[i];
                fArr[i] = f2 + ((t2.f6185a[i] - f2) * f);
                cVar.f6186b[i] = C2188b.m6766a(f, t.f6186b[i], t2.f6186b[i]);
            }
            return this.f6080e;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + t.f6186b.length + " vs " + t2.f6186b.length + ")");
    }
}
