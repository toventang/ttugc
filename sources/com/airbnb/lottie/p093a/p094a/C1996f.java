package com.airbnb.lottie.p093a.p094a;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.AbstractC2206k;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.p093a.p095b.AbstractC2012a;
import com.airbnb.lottie.p099e.C2104e;
import com.airbnb.lottie.p099e.p101b.C2063a;
import com.airbnb.lottie.p099e.p101b.C2085q;
import com.airbnb.lottie.p099e.p102c.AbstractC2088a;
import com.airbnb.lottie.p104g.C2144d;
import com.airbnb.lottie.p106i.C2192f;
import com.airbnb.lottie.p106i.C2194g;
import com.airbnb.lottie.p107j.C2204c;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.f */
public final class C1996f implements AbstractC2001k, AbstractC2004m, AbstractC2012a.AbstractC2013a {

    /* renamed from: a */
    private final Path f5962a = new Path();

    /* renamed from: b */
    private final String f5963b;

    /* renamed from: c */
    private final C2122g f5964c;

    /* renamed from: d */
    private final AbstractC2012a<?, PointF> f5965d;

    /* renamed from: e */
    private final AbstractC2012a<?, PointF> f5966e;

    /* renamed from: f */
    private final C2063a f5967f;

    /* renamed from: g */
    private C2011s f5968g;

    /* renamed from: h */
    private C1992b f5969h;

    /* renamed from: i */
    private boolean f5970i;

    static {
        Covode.recordClassIndex(2191);
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1993c
    /* renamed from: b */
    public final String mo5903b() {
        return this.f5963b;
    }

    @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2013a
    /* renamed from: a */
    public final void mo5895a() {
        this.f5970i = false;
        this.f5964c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC2004m
    /* renamed from: e */
    public final Path mo5906e() {
        C1992b bVar;
        if (this.f5970i) {
            return this.f5962a;
        }
        this.f5962a.reset();
        PointF f = this.f5965d.mo5918f();
        float f2 = f.x / 2.0f;
        float f3 = f.y / 2.0f;
        float f4 = f2 * 0.55228f;
        float f5 = 0.55228f * f3;
        this.f5962a.reset();
        if (this.f5967f.f6184d) {
            float f6 = -f3;
            this.f5962a.moveTo(0.0f, f6);
            float f7 = 0.0f - f4;
            float f8 = -f2;
            float f9 = 0.0f - f5;
            this.f5962a.cubicTo(f7, f6, f8, f9, f8, 0.0f);
            float f10 = f5 + 0.0f;
            this.f5962a.cubicTo(f8, f10, f7, f3, 0.0f, f3);
            float f11 = f4 + 0.0f;
            this.f5962a.cubicTo(f11, f3, f2, f10, f2, 0.0f);
            this.f5962a.cubicTo(f2, f9, f11, f6, 0.0f, f6);
        } else {
            float f12 = -f3;
            this.f5962a.moveTo(0.0f, f12);
            float f13 = f4 + 0.0f;
            float f14 = 0.0f - f5;
            this.f5962a.cubicTo(f13, f12, f2, f14, f2, 0.0f);
            float f15 = f5 + 0.0f;
            this.f5962a.cubicTo(f2, f15, f13, f3, 0.0f, f3);
            float f16 = 0.0f - f4;
            float f17 = -f2;
            this.f5962a.cubicTo(f16, f3, f17, f15, f17, 0.0f);
            this.f5962a.cubicTo(f17, f14, f16, f12, 0.0f, f12);
        }
        PointF f18 = this.f5966e.mo5918f();
        this.f5962a.offset(f18.x, f18.y);
        this.f5962a.close();
        if (!C2144d.C2145a.f6479a || (bVar = this.f5969h) == null) {
            C2194g.m6797a(this.f5962a, this.f5968g);
        } else {
            bVar.mo5901a(this.f5962a);
        }
        this.f5970i = true;
        return this.f5962a;
    }

    @Override // com.airbnb.lottie.p099e.AbstractC2105f
    /* renamed from: a */
    public final <T> void mo5899a(T t, C2204c<T> cVar) {
        if (t == AbstractC2206k.f6601g) {
            this.f5965d.mo5913a(cVar);
        } else if (t == AbstractC2206k.f6604j) {
            this.f5966e.mo5913a(cVar);
        }
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
                    if (!C2144d.C2145a.f6479a || (bVar = this.f5969h) == null) {
                        this.f5968g = sVar;
                        sVar.mo5908a(this);
                    } else {
                        bVar.mo5902a(sVar);
                        sVar.mo5908a(this);
                    }
                }
            }
        }
    }

    public C1996f(C2122g gVar, AbstractC2088a aVar, C2063a aVar2) {
        if (C2144d.C2145a.f6479a) {
            this.f5969h = new C1992b();
        }
        this.f5963b = aVar2.f6181a;
        this.f5964c = gVar;
        AbstractC2012a<PointF, PointF> a = aVar2.f6183c.mo5947a();
        this.f5965d = a;
        AbstractC2012a<PointF, PointF> a2 = aVar2.f6182b.mo5947a();
        this.f5966e = a2;
        this.f5967f = aVar2;
        aVar.mo5964a(a);
        aVar.mo5964a(a2);
        a.mo5912a(this);
        a2.mo5912a(this);
    }

    @Override // com.airbnb.lottie.p099e.AbstractC2105f
    /* renamed from: a */
    public final void mo5898a(C2104e eVar, int i, List<C2104e> list, C2104e eVar2) {
        C2192f.m6791a(eVar, i, list, eVar2, this);
    }
}
