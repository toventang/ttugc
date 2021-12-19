package com.airbnb.lottie.p099e.p101b;

import android.graphics.Path;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.p093a.p094a.AbstractC1993c;
import com.airbnb.lottie.p093a.p094a.C1997g;
import com.airbnb.lottie.p099e.p100a.C2048a;
import com.airbnb.lottie.p099e.p100a.C2051d;
import com.airbnb.lottie.p099e.p102c.AbstractC2088a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.e.b.m */
public final class C2078m implements AbstractC2064b {

    /* renamed from: a */
    public final Path.FillType f6238a;

    /* renamed from: b */
    public final String f6239b;

    /* renamed from: c */
    public final C2048a f6240c;

    /* renamed from: d */
    public final C2051d f6241d;

    /* renamed from: e */
    private final boolean f6242e;

    static {
        Covode.recordClassIndex(2273);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f6242e + '}';
    }

    @Override // com.airbnb.lottie.p099e.p101b.AbstractC2064b
    /* renamed from: a */
    public final AbstractC1993c mo5951a(C2122g gVar, AbstractC2088a aVar) {
        return new C1997g(gVar, aVar, this);
    }

    public C2078m(String str, boolean z, Path.FillType fillType, C2048a aVar, C2051d dVar) {
        this.f6239b = str;
        this.f6242e = z;
        this.f6238a = fillType;
        this.f6240c = aVar;
        this.f6241d = dVar;
    }
}
