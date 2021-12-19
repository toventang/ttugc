package com.airbnb.lottie.p093a.p095b;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.AbstractC2206k;
import com.airbnb.lottie.p093a.p095b.AbstractC2012a;
import com.airbnb.lottie.p099e.p100a.C2059l;
import com.airbnb.lottie.p099e.p102c.AbstractC2088a;
import com.airbnb.lottie.p107j.C2204c;
import com.airbnb.lottie.p107j.C2205d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.a.b.o */
public final class C2031o {

    /* renamed from: a */
    public final AbstractC2012a<PointF, PointF> f6097a;

    /* renamed from: b */
    public final AbstractC2012a<?, PointF> f6098b;

    /* renamed from: c */
    public final AbstractC2012a<C2205d, C2205d> f6099c;

    /* renamed from: d */
    public final AbstractC2012a<Float, Float> f6100d;

    /* renamed from: e */
    public final AbstractC2012a<Integer, Integer> f6101e;

    /* renamed from: f */
    public final AbstractC2012a<?, Float> f6102f;

    /* renamed from: g */
    public final AbstractC2012a<?, Float> f6103g;

    /* renamed from: h */
    private final Matrix f6104h = new Matrix();

    static {
        Covode.recordClassIndex(2226);
    }

    /* renamed from: a */
    public final Matrix mo5927a() {
        this.f6104h.reset();
        PointF f = this.f6098b.mo5918f();
        if (!(f.x == 0.0f && f.y == 0.0f)) {
            this.f6104h.preTranslate(f.x, f.y);
        }
        float floatValue = this.f6100d.mo5918f().floatValue();
        if (floatValue != 0.0f) {
            this.f6104h.preRotate(floatValue);
        }
        C2205d f2 = this.f6099c.mo5918f();
        if (!(f2.f6589a == 1.0f && f2.f6590b == 1.0f)) {
            this.f6104h.preScale(f2.f6589a, f2.f6590b);
        }
        PointF f3 = this.f6097a.mo5918f();
        if (!(f3.x == 0.0f && f3.y == 0.0f)) {
            this.f6104h.preTranslate(-f3.x, -f3.y);
        }
        return this.f6104h;
    }

    /* renamed from: a */
    public final void mo5929a(AbstractC2012a.AbstractC2013a aVar) {
        this.f6097a.mo5912a(aVar);
        this.f6098b.mo5912a(aVar);
        this.f6099c.mo5912a(aVar);
        this.f6100d.mo5912a(aVar);
        this.f6101e.mo5912a(aVar);
        AbstractC2012a<?, Float> aVar2 = this.f6102f;
        if (aVar2 != null) {
            aVar2.mo5912a(aVar);
        }
        AbstractC2012a<?, Float> aVar3 = this.f6103g;
        if (aVar3 != null) {
            aVar3.mo5912a(aVar);
        }
    }

    public C2031o(C2059l lVar) {
        this.f6097a = lVar.f6162a.mo5947a();
        this.f6098b = lVar.f6163b.mo5947a();
        this.f6099c = lVar.f6164c.mo5947a();
        this.f6100d = lVar.f6165d.mo5947a();
        this.f6101e = lVar.f6166e.mo5947a();
        if (lVar.f6167f != null) {
            this.f6102f = lVar.f6167f.mo5947a();
        } else {
            this.f6102f = null;
        }
        if (lVar.f6168g != null) {
            this.f6103g = lVar.f6168g.mo5947a();
        } else {
            this.f6103g = null;
        }
    }

    /* renamed from: a */
    public final Matrix mo5928a(float f) {
        PointF f2 = this.f6098b.mo5918f();
        PointF f3 = this.f6097a.mo5918f();
        C2205d f4 = this.f6099c.mo5918f();
        float floatValue = this.f6100d.mo5918f().floatValue();
        this.f6104h.reset();
        this.f6104h.preTranslate(f2.x * f, f2.y * f);
        double d = (double) f;
        this.f6104h.preScale((float) Math.pow((double) f4.f6589a, d), (float) Math.pow((double) f4.f6590b, d));
        this.f6104h.preRotate(floatValue * f, f3.x, f3.y);
        return this.f6104h;
    }

    /* renamed from: a */
    public final void mo5930a(AbstractC2088a aVar) {
        aVar.mo5964a(this.f6097a);
        aVar.mo5964a(this.f6098b);
        aVar.mo5964a(this.f6099c);
        aVar.mo5964a(this.f6100d);
        aVar.mo5964a(this.f6101e);
        AbstractC2012a<?, Float> aVar2 = this.f6102f;
        if (aVar2 != null) {
            aVar.mo5964a(aVar2);
        }
        AbstractC2012a<?, Float> aVar3 = this.f6103g;
        if (aVar3 != null) {
            aVar.mo5964a(aVar3);
        }
    }

    /* renamed from: a */
    public final <T> boolean mo5931a(T t, C2204c<T> cVar) {
        AbstractC2012a<?, Float> aVar;
        AbstractC2012a<?, Float> aVar2;
        if (t == AbstractC2206k.f6599e) {
            this.f6097a.mo5913a(cVar);
            return true;
        } else if (t == AbstractC2206k.f6600f) {
            this.f6098b.mo5913a(cVar);
            return true;
        } else if (t == AbstractC2206k.f6605k) {
            this.f6099c.mo5913a(cVar);
            return true;
        } else if (t == AbstractC2206k.f6606l) {
            this.f6100d.mo5913a(cVar);
            return true;
        } else if (t == AbstractC2206k.f6597c) {
            this.f6101e.mo5913a(cVar);
            return true;
        } else if (t == AbstractC2206k.f6619y && (aVar2 = this.f6102f) != null) {
            aVar2.mo5913a(cVar);
            return true;
        } else if (t != AbstractC2206k.f6620z || (aVar = this.f6103g) == null) {
            return false;
        } else {
            aVar.mo5913a(cVar);
            return true;
        }
    }
}
