package com.bytedance.lottie.p1499c.p1500a;

import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1495a.p1497b.AbstractC20954a;
import com.bytedance.lottie.p1495a.p1497b.C20963i;
import com.bytedance.lottie.p1495a.p1497b.C20964j;
import com.bytedance.lottie.p1506g.C21089a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.lottie.c.a.e */
public final class C20981e implements AbstractC20989m<PointF, PointF> {

    /* renamed from: a */
    public final List<C21089a<PointF>> f49712a;

    static {
        Covode.recordClassIndex(24597);
    }

    public C20981e() {
        this.f49712a = Collections.singletonList(new C21089a(new PointF(0.0f, 0.0f)));
    }

    @Override // com.bytedance.lottie.p1499c.p1500a.AbstractC20989m
    /* renamed from: a */
    public final AbstractC20954a<PointF, PointF> mo34480a() {
        if (this.f49712a.get(0).mo34569c()) {
            return new C20964j(this.f49712a);
        }
        return new C20963i(this.f49712a);
    }

    public C20981e(List<C21089a<PointF>> list) {
        this.f49712a = list;
    }
}
