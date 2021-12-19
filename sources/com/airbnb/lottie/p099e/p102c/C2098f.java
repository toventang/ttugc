package com.airbnb.lottie.p099e.p102c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.p093a.p094a.C1994d;
import com.airbnb.lottie.p099e.C2104e;
import com.airbnb.lottie.p099e.p101b.C2079n;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.e.c.f */
public final class C2098f extends AbstractC2088a {

    /* renamed from: h */
    private final C1994d f6330h;

    static {
        Covode.recordClassIndex(2293);
    }

    @Override // com.airbnb.lottie.p099e.p102c.AbstractC2088a, com.airbnb.lottie.p093a.p094a.AbstractC1995e
    /* renamed from: a */
    public final void mo5897a(RectF rectF, Matrix matrix) {
        super.mo5897a(rectF, matrix);
        this.f6330h.mo5897a(rectF, this.f6271a);
    }

    @Override // com.airbnb.lottie.p099e.p102c.AbstractC2088a
    /* renamed from: b */
    public final void mo5967b(RectF rectF, Matrix matrix) {
        super.mo5967b(rectF, matrix);
        this.f6330h.mo5897a(rectF, this.f6271a);
    }

    C2098f(C2122g gVar, C2094d dVar) {
        super(gVar, dVar);
        C1994d dVar2 = new C1994d(gVar, this, new C2079n("__container", dVar.f6307a));
        this.f6330h = dVar2;
        dVar2.mo5900a(Collections.emptyList(), Collections.emptyList());
    }

    /* access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.p099e.p102c.AbstractC2088a
    /* renamed from: b */
    public final void mo5966b(Canvas canvas, Matrix matrix, int i) {
        this.f6330h.mo5896a(canvas, matrix, i);
    }

    /* access modifiers changed from: protected */
    @Override // com.airbnb.lottie.p099e.p102c.AbstractC2088a
    /* renamed from: b */
    public final void mo5969b(C2104e eVar, int i, List<C2104e> list, C2104e eVar2) {
        this.f6330h.mo5898a(eVar, i, list, eVar2);
    }
}
