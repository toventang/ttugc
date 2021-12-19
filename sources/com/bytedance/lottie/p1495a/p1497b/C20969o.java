package com.bytedance.lottie.p1495a.p1497b;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.AbstractC21121m;
import com.bytedance.lottie.p1495a.p1497b.AbstractC20954a;
import com.bytedance.lottie.p1499c.p1500a.C20988l;
import com.bytedance.lottie.p1499c.p1502c.AbstractC21017a;
import com.bytedance.lottie.p1506g.C21091c;
import com.bytedance.lottie.p1506g.C21092d;

/* renamed from: com.bytedance.lottie.a.b.o */
public final class C20969o {

    /* renamed from: a */
    public final AbstractC20954a<PointF, PointF> f49686a;

    /* renamed from: b */
    public final AbstractC20954a<?, PointF> f49687b;

    /* renamed from: c */
    public final AbstractC20954a<C21092d, C21092d> f49688c;

    /* renamed from: d */
    public final AbstractC20954a<Float, Float> f49689d;

    /* renamed from: e */
    public final AbstractC20954a<Integer, Integer> f49690e;

    /* renamed from: f */
    public final AbstractC20954a<?, Float> f49691f;

    /* renamed from: g */
    public final AbstractC20954a<?, Float> f49692g;

    /* renamed from: h */
    private final Matrix f49693h = new Matrix();

    static {
        Covode.recordClassIndex(24585);
    }

    /* renamed from: a */
    public final Matrix mo34471a() {
        this.f49693h.reset();
        PointF d = this.f49687b.mo34470d();
        if (!(d.x == 0.0f && d.y == 0.0f)) {
            this.f49693h.preTranslate(d.x, d.y);
        }
        float floatValue = this.f49689d.mo34470d().floatValue();
        if (floatValue != 0.0f) {
            this.f49693h.preRotate(floatValue);
        }
        C21092d d2 = this.f49688c.mo34470d();
        if (!(d2.f50006a == 1.0f && d2.f50007b == 1.0f)) {
            this.f49693h.preScale(d2.f50006a, d2.f50007b);
        }
        C21092d.C21093a.f50008a.mo34557a(d2);
        PointF d3 = this.f49686a.mo34470d();
        if (!(d3.x == 0.0f && d3.y == 0.0f)) {
            this.f49693h.preTranslate(-d3.x, -d3.y);
        }
        return this.f49693h;
    }

    /* renamed from: a */
    public final void mo34473a(AbstractC20954a.AbstractC20955a aVar) {
        this.f49686a.mo34466a(aVar);
        this.f49687b.mo34466a(aVar);
        this.f49688c.mo34466a(aVar);
        this.f49689d.mo34466a(aVar);
        this.f49690e.mo34466a(aVar);
        AbstractC20954a<?, Float> aVar2 = this.f49691f;
        if (aVar2 != null) {
            aVar2.mo34466a(aVar);
        }
        AbstractC20954a<?, Float> aVar3 = this.f49692g;
        if (aVar3 != null) {
            aVar3.mo34466a(aVar);
        }
    }

    public C20969o(C20988l lVar) {
        this.f49686a = lVar.f49719a.mo34480a();
        this.f49687b = lVar.f49720b.mo34480a();
        this.f49688c = lVar.f49721c.mo34480a();
        this.f49689d = lVar.f49722d.mo34480a();
        this.f49690e = lVar.f49723e.mo34480a();
        if (lVar.f49724f != null) {
            this.f49691f = lVar.f49724f.mo34480a();
        } else {
            this.f49691f = null;
        }
        if (lVar.f49725g != null) {
            this.f49692g = lVar.f49725g.mo34480a();
        } else {
            this.f49692g = null;
        }
    }

    /* renamed from: a */
    public final Matrix mo34472a(float f) {
        PointF d = this.f49687b.mo34470d();
        PointF d2 = this.f49686a.mo34470d();
        C21092d d3 = this.f49688c.mo34470d();
        float floatValue = this.f49689d.mo34470d().floatValue();
        this.f49693h.reset();
        this.f49693h.preTranslate(d.x * f, d.y * f);
        double d4 = (double) f;
        this.f49693h.preScale((float) Math.pow((double) d3.f50006a, d4), (float) Math.pow((double) d3.f50007b, d4));
        this.f49693h.preRotate(floatValue * f, d2.x, d2.y);
        return this.f49693h;
    }

    /* renamed from: a */
    public final void mo34474a(AbstractC21017a aVar) {
        aVar.mo34496a(this.f49686a);
        aVar.mo34496a(this.f49687b);
        aVar.mo34496a(this.f49688c);
        aVar.mo34496a(this.f49689d);
        aVar.mo34496a(this.f49690e);
        AbstractC20954a<?, Float> aVar2 = this.f49691f;
        if (aVar2 != null) {
            aVar.mo34496a(aVar2);
        }
        AbstractC20954a<?, Float> aVar3 = this.f49692g;
        if (aVar3 != null) {
            aVar.mo34496a(aVar3);
        }
    }

    /* renamed from: a */
    public final <T> boolean mo34475a(T t, C21091c<T> cVar) {
        AbstractC20954a<?, Float> aVar;
        AbstractC20954a<?, Float> aVar2;
        if (t == AbstractC21121m.f50080e) {
            this.f49686a.mo34467a(cVar);
            return true;
        } else if (t == AbstractC21121m.f50081f) {
            this.f49687b.mo34467a(cVar);
            return true;
        } else if (t == AbstractC21121m.f50084i) {
            this.f49688c.mo34467a(cVar);
            return true;
        } else if (t == AbstractC21121m.f50085j) {
            this.f49689d.mo34467a(cVar);
            return true;
        } else if (t == AbstractC21121m.f50078c) {
            this.f49690e.mo34467a(cVar);
            return true;
        } else if (t == AbstractC21121m.f50096u && (aVar2 = this.f49691f) != null) {
            aVar2.mo34467a(cVar);
            return true;
        } else if (t != AbstractC21121m.f50097v || (aVar = this.f49692g) == null) {
            return false;
        } else {
            aVar.mo34467a(cVar);
            return true;
        }
    }
}
