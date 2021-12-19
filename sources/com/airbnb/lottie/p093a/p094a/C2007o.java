package com.airbnb.lottie.p093a.p094a;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.p093a.p095b.AbstractC2012a;
import com.airbnb.lottie.p099e.C2104e;
import com.airbnb.lottie.p099e.p101b.C2075j;
import com.airbnb.lottie.p099e.p101b.C2085q;
import com.airbnb.lottie.p099e.p102c.AbstractC2088a;
import com.airbnb.lottie.p104g.C2144d;
import com.airbnb.lottie.p106i.C2192f;
import com.airbnb.lottie.p106i.C2194g;
import com.airbnb.lottie.p107j.C2204c;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.o */
public final class C2007o implements AbstractC2001k, AbstractC2004m, AbstractC2012a.AbstractC2013a {

    /* renamed from: a */
    private final Path f6028a = new Path();

    /* renamed from: b */
    private final RectF f6029b = new RectF();

    /* renamed from: c */
    private final String f6030c;

    /* renamed from: d */
    private final C2122g f6031d;

    /* renamed from: e */
    private final AbstractC2012a<?, PointF> f6032e;

    /* renamed from: f */
    private final AbstractC2012a<?, PointF> f6033f;

    /* renamed from: g */
    private final AbstractC2012a<?, Float> f6034g;

    /* renamed from: h */
    private C2011s f6035h;

    /* renamed from: i */
    private C1992b f6036i;

    /* renamed from: j */
    private boolean f6037j;

    static {
        Covode.recordClassIndex(2202);
    }

    @Override // com.airbnb.lottie.p099e.AbstractC2105f
    /* renamed from: a */
    public final <T> void mo5899a(T t, C2204c<T> cVar) {
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1993c
    /* renamed from: b */
    public final String mo5903b() {
        return this.f6030c;
    }

    @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2013a
    /* renamed from: a */
    public final void mo5895a() {
        this.f6037j = false;
        this.f6031d.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC2004m
    /* renamed from: e */
    public final Path mo5906e() {
        float floatValue;
        C1992b bVar;
        if (this.f6037j) {
            return this.f6028a;
        }
        this.f6028a.reset();
        PointF f = this.f6033f.mo5918f();
        float f2 = f.x / 2.0f;
        float f3 = f.y / 2.0f;
        AbstractC2012a<?, Float> aVar = this.f6034g;
        if (aVar == null) {
            floatValue = 0.0f;
        } else {
            floatValue = aVar.mo5918f().floatValue();
        }
        float min = Math.min(f2, f3);
        if (floatValue > min) {
            floatValue = min;
        }
        PointF f4 = this.f6032e.mo5918f();
        this.f6028a.moveTo(f4.x + f2, (f4.y - f3) + floatValue);
        this.f6028a.lineTo(f4.x + f2, (f4.y + f3) - floatValue);
        if (floatValue > 0.0f) {
            float f5 = floatValue * 2.0f;
            this.f6029b.set((f4.x + f2) - f5, (f4.y + f3) - f5, f4.x + f2, f4.y + f3);
            this.f6028a.arcTo(this.f6029b, 0.0f, 90.0f, false);
        }
        this.f6028a.lineTo((f4.x - f2) + floatValue, f4.y + f3);
        if (floatValue > 0.0f) {
            float f6 = floatValue * 2.0f;
            this.f6029b.set(f4.x - f2, (f4.y + f3) - f6, (f4.x - f2) + f6, f4.y + f3);
            this.f6028a.arcTo(this.f6029b, 90.0f, 90.0f, false);
        }
        this.f6028a.lineTo(f4.x - f2, (f4.y - f3) + floatValue);
        if (floatValue > 0.0f) {
            float f7 = floatValue * 2.0f;
            this.f6029b.set(f4.x - f2, f4.y - f3, (f4.x - f2) + f7, (f4.y - f3) + f7);
            this.f6028a.arcTo(this.f6029b, 180.0f, 90.0f, false);
        }
        this.f6028a.lineTo((f4.x + f2) - floatValue, f4.y - f3);
        if (floatValue > 0.0f) {
            float f8 = floatValue * 2.0f;
            this.f6029b.set((f4.x + f2) - f8, f4.y - f3, f4.x + f2, (f4.y - f3) + f8);
            this.f6028a.arcTo(this.f6029b, 270.0f, 90.0f, false);
        }
        this.f6028a.close();
        if (!C2144d.C2145a.f6479a || (bVar = this.f6036i) == null) {
            C2194g.m6797a(this.f6028a, this.f6035h);
        } else {
            bVar.mo5901a(this.f6028a);
        }
        this.f6037j = true;
        return this.f6028a;
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1993c
    /* renamed from: a */
    public final void mo5900a(List<AbstractC1993c> list, List<AbstractC1993c> list2) {
        C1992b bVar;
        for (int i = 0; i < list.size(); i++) {
            AbstractC1993c cVar = list.get(i);
            if (cVar instanceof C2011s) {
                C2011s sVar = (C2011s) cVar;
                if (sVar.f6058a == C2085q.EnumC2086a.Simultaneously) {
                    if (!C2144d.C2145a.f6479a || (bVar = this.f6036i) == null) {
                        this.f6035h = sVar;
                        sVar.mo5908a(this);
                    } else {
                        bVar.mo5902a(sVar);
                        sVar.mo5908a(this);
                    }
                }
            }
        }
    }

    public C2007o(C2122g gVar, AbstractC2088a aVar, C2075j jVar) {
        if (C2144d.C2145a.f6479a) {
            this.f6036i = new C1992b();
        }
        this.f6030c = jVar.f6227a;
        this.f6031d = gVar;
        AbstractC2012a<PointF, PointF> a = jVar.f6228b.mo5947a();
        this.f6032e = a;
        AbstractC2012a<PointF, PointF> a2 = jVar.f6229c.mo5947a();
        this.f6033f = a2;
        AbstractC2012a<Float, Float> a3 = jVar.f6230d.mo5947a();
        this.f6034g = a3;
        aVar.mo5964a(a);
        aVar.mo5964a(a2);
        aVar.mo5964a(a3);
        a.mo5912a(this);
        a2.mo5912a(this);
        a3.mo5912a(this);
    }

    @Override // com.airbnb.lottie.p099e.AbstractC2105f
    /* renamed from: a */
    public final void mo5898a(C2104e eVar, int i, List<C2104e> list, C2104e eVar2) {
        C2192f.m6791a(eVar, i, list, eVar2, this);
    }
}
