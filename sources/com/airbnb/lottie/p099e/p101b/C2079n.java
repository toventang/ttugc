package com.airbnb.lottie.p099e.p101b;

import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.p093a.p094a.AbstractC1993c;
import com.airbnb.lottie.p093a.p094a.C1994d;
import com.airbnb.lottie.p099e.p102c.AbstractC2088a;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.airbnb.lottie.e.b.n */
public final class C2079n implements AbstractC2064b {

    /* renamed from: a */
    public final String f6243a;

    /* renamed from: b */
    public final List<AbstractC2064b> f6244b;

    static {
        Covode.recordClassIndex(2274);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f6243a + "' Shapes: " + Arrays.toString(this.f6244b.toArray()) + '}';
    }

    public C2079n(String str, List<AbstractC2064b> list) {
        this.f6243a = str;
        this.f6244b = list;
    }

    @Override // com.airbnb.lottie.p099e.p101b.AbstractC2064b
    /* renamed from: a */
    public final AbstractC1993c mo5951a(C2122g gVar, AbstractC2088a aVar) {
        return new C1994d(gVar, aVar, this);
    }
}
