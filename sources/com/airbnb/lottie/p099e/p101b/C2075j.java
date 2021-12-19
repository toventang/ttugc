package com.airbnb.lottie.p099e.p101b;

import android.graphics.PointF;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.p093a.p094a.AbstractC1993c;
import com.airbnb.lottie.p093a.p094a.C2007o;
import com.airbnb.lottie.p099e.p100a.AbstractC2060m;
import com.airbnb.lottie.p099e.p100a.C2049b;
import com.airbnb.lottie.p099e.p100a.C2053f;
import com.airbnb.lottie.p099e.p102c.AbstractC2088a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.e.b.j */
public final class C2075j implements AbstractC2064b {

    /* renamed from: a */
    public final String f6227a;

    /* renamed from: b */
    public final AbstractC2060m<PointF, PointF> f6228b;

    /* renamed from: c */
    public final C2053f f6229c;

    /* renamed from: d */
    public final C2049b f6230d;

    static {
        Covode.recordClassIndex(2270);
    }

    public final String toString() {
        return "RectangleShape{position=" + this.f6228b + ", size=" + this.f6229c + '}';
    }

    @Override // com.airbnb.lottie.p099e.p101b.AbstractC2064b
    /* renamed from: a */
    public final AbstractC1993c mo5951a(C2122g gVar, AbstractC2088a aVar) {
        return new C2007o(gVar, aVar, this);
    }

    public C2075j(String str, AbstractC2060m<PointF, PointF> mVar, C2053f fVar, C2049b bVar) {
        this.f6227a = str;
        this.f6228b = mVar;
        this.f6229c = fVar;
        this.f6230d = bVar;
    }
}
