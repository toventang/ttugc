package com.airbnb.lottie.p099e.p100a;

import android.graphics.PointF;
import com.airbnb.lottie.p093a.p095b.AbstractC2012a;
import com.airbnb.lottie.p093a.p095b.C2025i;
import com.airbnb.lottie.p093a.p095b.C2026j;
import com.airbnb.lottie.p107j.C2202a;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.e.a.e */
public final class C2052e implements AbstractC2060m<PointF, PointF> {

    /* renamed from: a */
    private final List<C2202a<PointF>> f6155a;

    static {
        Covode.recordClassIndex(2247);
    }

    public C2052e() {
        this.f6155a = Collections.singletonList(new C2202a(new PointF(0.0f, 0.0f)));
    }

    @Override // com.airbnb.lottie.p099e.p100a.AbstractC2060m
    /* renamed from: a */
    public final AbstractC2012a<PointF, PointF> mo5947a() {
        if (this.f6155a.get(0).mo6124d()) {
            return new C2026j(this.f6155a);
        }
        return new C2025i(this.f6155a);
    }

    public C2052e(List<C2202a<PointF>> list) {
        this.f6155a = list;
    }
}
