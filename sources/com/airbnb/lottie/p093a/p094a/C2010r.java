package com.airbnb.lottie.p093a.p094a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.AbstractC2206k;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.p093a.p095b.AbstractC2012a;
import com.airbnb.lottie.p093a.p095b.C2032p;
import com.airbnb.lottie.p099e.p101b.C2081p;
import com.airbnb.lottie.p099e.p102c.AbstractC2088a;
import com.airbnb.lottie.p104g.C2144d;
import com.airbnb.lottie.p107j.C2204c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.a.a.r */
public final class C2010r extends AbstractC1990a {

    /* renamed from: c */
    private final AbstractC2088a f6054c;

    /* renamed from: d */
    private final String f6055d;

    /* renamed from: e */
    private final AbstractC2012a<Integer, Integer> f6056e;

    /* renamed from: f */
    private AbstractC2012a<ColorFilter, ColorFilter> f6057f;

    static {
        Covode.recordClassIndex(2205);
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1993c
    /* renamed from: b */
    public final String mo5903b() {
        return this.f6055d;
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1990a, com.airbnb.lottie.p099e.AbstractC2105f
    /* renamed from: a */
    public final <T> void mo5899a(T t, C2204c<T> cVar) {
        AbstractC2012a<ColorFilter, ColorFilter> aVar;
        super.mo5899a(t, cVar);
        if (t == AbstractC2206k.f6596b) {
            this.f6056e.mo5913a(cVar);
        } else if (t == AbstractC2206k.f6593C) {
            if (C2144d.C2145a.f6479a && (aVar = this.f6057f) != null) {
                this.f6054c.mo5968b(aVar);
            }
            if (cVar == null) {
                this.f6057f = null;
                return;
            }
            C2032p pVar = new C2032p(cVar);
            this.f6057f = pVar;
            pVar.mo5912a(this);
            this.f6054c.mo5964a(this.f6056e);
        }
    }

    public C2010r(C2122g gVar, AbstractC2088a aVar, C2081p pVar) {
        super(gVar, aVar, pVar.f6254g.toPaintCap(), pVar.f6255h.toPaintJoin(), pVar.f6256i, pVar.f6252e, pVar.f6253f, pVar.f6250c, pVar.f6249b);
        this.f6054c = aVar;
        this.f6055d = pVar.f6248a;
        AbstractC2012a<Integer, Integer> a = pVar.f6251d.mo5947a();
        this.f6056e = a;
        a.mo5912a(this);
        aVar.mo5964a(a);
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1990a, com.airbnb.lottie.p093a.p094a.AbstractC1995e
    /* renamed from: a */
    public final void mo5896a(Canvas canvas, Matrix matrix, int i) {
        this.f5938b.setColor(this.f6056e.mo5918f().intValue());
        if (this.f6057f != null) {
            this.f5938b.setColorFilter(this.f6057f.mo5918f());
        }
        super.mo5896a(canvas, matrix, i);
    }
}
