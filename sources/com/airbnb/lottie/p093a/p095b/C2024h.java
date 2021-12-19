package com.airbnb.lottie.p093a.p095b;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C2044e;
import com.airbnb.lottie.p106i.C2194g;
import com.airbnb.lottie.p107j.C2202a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.a.b.h */
public final class C2024h extends C2202a<PointF> {

    /* renamed from: a */
    public Path f6084a;

    /* renamed from: m */
    private final C2202a<PointF> f6085m;

    static {
        Covode.recordClassIndex(2219);
    }

    /* renamed from: a */
    public final void mo5926a() {
        boolean z;
        if (this.f6567c == null || this.f6566b == null || !((PointF) this.f6566b).equals(((PointF) this.f6567c).x, ((PointF) this.f6567c).y)) {
            z = false;
        } else {
            z = true;
        }
        if (this.f6567c != null && !z) {
            this.f6084a = C2194g.m6795a((PointF) this.f6566b, (PointF) this.f6567c, this.f6085m.f6575k, this.f6085m.f6576l);
        }
    }

    public C2024h(C2044e eVar, C2202a<PointF> aVar) {
        super(eVar, aVar.f6566b, aVar.f6567c, aVar.f6568d, aVar.f6569e, aVar.f6570f);
        this.f6085m = aVar;
        mo5926a();
    }
}
