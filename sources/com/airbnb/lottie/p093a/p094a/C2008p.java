package com.airbnb.lottie.p093a.p094a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.AbstractC2206k;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.p093a.p095b.AbstractC2012a;
import com.airbnb.lottie.p093a.p095b.C2031o;
import com.airbnb.lottie.p099e.C2104e;
import com.airbnb.lottie.p099e.p101b.C2076k;
import com.airbnb.lottie.p099e.p102c.AbstractC2088a;
import com.airbnb.lottie.p106i.C2192f;
import com.airbnb.lottie.p107j.C2204c;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.p */
public final class C2008p implements AbstractC1995e, AbstractC2000j, AbstractC2001k, AbstractC2004m, AbstractC2012a.AbstractC2013a {

    /* renamed from: a */
    private final Matrix f6038a = new Matrix();

    /* renamed from: b */
    private final Path f6039b = new Path();

    /* renamed from: c */
    private final C2122g f6040c;

    /* renamed from: d */
    private final AbstractC2088a f6041d;

    /* renamed from: e */
    private final String f6042e;

    /* renamed from: f */
    private final AbstractC2012a<Float, Float> f6043f;

    /* renamed from: g */
    private final AbstractC2012a<Float, Float> f6044g;

    /* renamed from: h */
    private final C2031o f6045h;

    /* renamed from: i */
    private C1994d f6046i;

    static {
        Covode.recordClassIndex(2203);
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1993c
    /* renamed from: b */
    public final String mo5903b() {
        return this.f6042e;
    }

    @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2013a
    /* renamed from: a */
    public final void mo5895a() {
        this.f6040c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC2004m
    /* renamed from: e */
    public final Path mo5906e() {
        Path e = this.f6046i.mo5906e();
        this.f6039b.reset();
        float floatValue = this.f6043f.mo5918f().floatValue();
        float floatValue2 = this.f6044g.mo5918f().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f6038a.set(this.f6045h.mo5928a(((float) i) + floatValue2));
            this.f6039b.addPath(e, this.f6038a);
        }
        return this.f6039b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0005 A[LOOP:0: B:3:0x0005->B:6:0x000f, LOOP_START] */
    @Override // com.airbnb.lottie.p093a.p094a.AbstractC2000j
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5907a(java.util.ListIterator<com.airbnb.lottie.p093a.p094a.AbstractC1993c> r7) {
        /*
            r6 = this;
            com.airbnb.lottie.a.a.d r0 = r6.f6046i
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r7.hasPrevious()
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = r7.previous()
            if (r0 != r6) goto L_0x0005
        L_0x0011:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x0016:
            boolean r0 = r7.hasPrevious()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r7.previous()
            r4.add(r0)
            r7.remove()
            goto L_0x0016
        L_0x0027:
            java.util.Collections.reverse(r4)
            com.airbnb.lottie.a.a.d r0 = new com.airbnb.lottie.a.a.d
            com.airbnb.lottie.g r1 = r6.f6040c
            com.airbnb.lottie.e.c.a r2 = r6.f6041d
            r5 = 0
            java.lang.String r3 = "Repeater"
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f6046i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p093a.p094a.C2008p.mo5907a(java.util.ListIterator):void");
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1995e
    /* renamed from: a */
    public final void mo5897a(RectF rectF, Matrix matrix) {
        this.f6046i.mo5897a(rectF, matrix);
    }

    @Override // com.airbnb.lottie.p099e.AbstractC2105f
    /* renamed from: a */
    public final <T> void mo5899a(T t, C2204c<T> cVar) {
        if (!this.f6045h.mo5931a(t, cVar)) {
            if (t == AbstractC2206k.f6611q) {
                this.f6043f.mo5913a(cVar);
            } else if (t == AbstractC2206k.f6612r) {
                this.f6044g.mo5913a(cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1993c
    /* renamed from: a */
    public final void mo5900a(List<AbstractC1993c> list, List<AbstractC1993c> list2) {
        this.f6046i.mo5900a(list, list2);
    }

    public C2008p(C2122g gVar, AbstractC2088a aVar, C2076k kVar) {
        this.f6040c = gVar;
        this.f6041d = aVar;
        this.f6042e = kVar.f6231a;
        AbstractC2012a<Float, Float> a = kVar.f6232b.mo5947a();
        this.f6043f = a;
        aVar.mo5964a(a);
        a.mo5912a(this);
        AbstractC2012a<Float, Float> a2 = kVar.f6233c.mo5947a();
        this.f6044g = a2;
        aVar.mo5964a(a2);
        a2.mo5912a(this);
        C2031o a3 = kVar.f6234d.mo5952a();
        this.f6045h = a3;
        a3.mo5930a(aVar);
        a3.mo5929a(this);
    }

    @Override // com.airbnb.lottie.p093a.p094a.AbstractC1995e
    /* renamed from: a */
    public final void mo5896a(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.f6043f.mo5918f().floatValue();
        float floatValue2 = this.f6044g.mo5918f().floatValue();
        float floatValue3 = this.f6045h.f6102f.mo5918f().floatValue() / 100.0f;
        float floatValue4 = this.f6045h.f6103g.mo5918f().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f6038a.set(matrix);
            float f = (float) i2;
            this.f6038a.preConcat(this.f6045h.mo5928a(f + floatValue2));
            this.f6046i.mo5896a(canvas, this.f6038a, (int) (((float) i) * (((f / floatValue) * (floatValue4 - floatValue3)) + floatValue3)));
        }
    }

    @Override // com.airbnb.lottie.p099e.AbstractC2105f
    /* renamed from: a */
    public final void mo5898a(C2104e eVar, int i, List<C2104e> list, C2104e eVar2) {
        C2192f.m6791a(eVar, i, list, eVar2, this);
    }
}
