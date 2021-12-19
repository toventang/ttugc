package com.airbnb.lottie.p107j;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C2044e;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.j.a */
public class C2202a<T> {

    /* renamed from: a */
    private final C2044e f6565a;

    /* renamed from: b */
    public final T f6566b;

    /* renamed from: c */
    public T f6567c;

    /* renamed from: d */
    public final Interpolator f6568d;

    /* renamed from: e */
    public final float f6569e;

    /* renamed from: f */
    public Float f6570f;

    /* renamed from: g */
    public float f6571g = -3987645.8f;

    /* renamed from: h */
    public float f6572h = -3987645.8f;

    /* renamed from: i */
    public int f6573i = 784923401;

    /* renamed from: j */
    public int f6574j = 784923401;

    /* renamed from: k */
    public PointF f6575k;

    /* renamed from: l */
    public PointF f6576l;

    /* renamed from: m */
    private float f6577m = Float.MIN_VALUE;

    /* renamed from: n */
    private float f6578n = Float.MIN_VALUE;

    static {
        Covode.recordClassIndex(2397);
    }

    /* renamed from: d */
    public final boolean mo6124d() {
        if (this.f6568d == null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final float mo6122b() {
        C2044e eVar = this.f6565a;
        if (eVar == null) {
            return 0.0f;
        }
        if (this.f6577m == Float.MIN_VALUE) {
            this.f6577m = (this.f6569e - eVar.f6145i) / this.f6565a.mo5945b();
        }
        return this.f6577m;
    }

    /* renamed from: c */
    public final float mo6123c() {
        if (this.f6565a == null) {
            return 1.0f;
        }
        if (this.f6578n == Float.MIN_VALUE) {
            if (this.f6570f == null) {
                this.f6578n = 1.0f;
            } else {
                this.f6578n = mo6122b() + ((this.f6570f.floatValue() - this.f6569e) / this.f6565a.mo5945b());
            }
        }
        return this.f6578n;
    }

    public String toString() {
        return "Keyframe{startValue=" + ((Object) this.f6566b) + ", endValue=" + ((Object) this.f6567c) + ", startFrame=" + this.f6569e + ", endFrame=" + this.f6570f + ", interpolator=" + this.f6568d + '}';
    }

    /* renamed from: a */
    public final boolean mo6121a(float f) {
        if (f < mo6122b() || f >= mo6123c()) {
            return false;
        }
        return true;
    }

    public C2202a(T t) {
        this.f6566b = t;
        this.f6567c = t;
        this.f6569e = Float.MIN_VALUE;
        this.f6570f = Float.valueOf(Float.MAX_VALUE);
    }

    public C2202a(C2044e eVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f6565a = eVar;
        this.f6566b = t;
        this.f6567c = t2;
        this.f6568d = interpolator;
        this.f6569e = f;
        this.f6570f = f2;
    }
}
