package com.bytedance.lottie.p1506g;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21088g;

/* renamed from: com.bytedance.lottie.g.a */
public class C21089a<T> {

    /* renamed from: a */
    private float f49986a = Float.MIN_VALUE;

    /* renamed from: b */
    public final C21088g f49987b;

    /* renamed from: c */
    public final T f49988c;

    /* renamed from: d */
    public final T f49989d;

    /* renamed from: e */
    public final Interpolator f49990e;

    /* renamed from: f */
    public final float f49991f;

    /* renamed from: g */
    public Float f49992g;

    /* renamed from: h */
    public PointF f49993h;

    /* renamed from: i */
    public PointF f49994i;

    /* renamed from: j */
    private float f49995j = Float.MIN_VALUE;

    static {
        Covode.recordClassIndex(24705);
    }

    /* renamed from: c */
    public final boolean mo34569c() {
        if (this.f49990e == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final float mo34566a() {
        C21088g gVar = this.f49987b;
        if (gVar == null) {
            return 0.0f;
        }
        if (this.f49986a == Float.MIN_VALUE) {
            this.f49986a = (this.f49991f - gVar.f49977i) / this.f49987b.mo34564b();
        }
        return this.f49986a;
    }

    /* renamed from: b */
    public final float mo34568b() {
        if (this.f49987b == null) {
            return 1.0f;
        }
        if (this.f49995j == Float.MIN_VALUE) {
            if (this.f49992g == null) {
                this.f49995j = 1.0f;
            } else {
                this.f49995j = mo34566a() + ((this.f49992g.floatValue() - this.f49991f) / this.f49987b.mo34564b());
            }
        }
        return this.f49995j;
    }

    public String toString() {
        return "Keyframe{startValue=" + ((Object) this.f49988c) + ", endValue=" + ((Object) this.f49989d) + ", startFrame=" + this.f49991f + ", endFrame=" + this.f49992g + ", interpolator=" + this.f49990e + '}';
    }

    public C21089a(T t) {
        this.f49988c = t;
        this.f49989d = t;
        this.f49991f = Float.MIN_VALUE;
        this.f49992g = Float.valueOf(Float.MAX_VALUE);
    }

    /* renamed from: a */
    public final boolean mo34567a(float f) {
        if (f < mo34566a() || f >= mo34568b()) {
            return false;
        }
        return true;
    }

    public C21089a(C21088g gVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f49987b = gVar;
        this.f49988c = t;
        this.f49989d = t2;
        this.f49990e = interpolator;
        this.f49991f = f;
        this.f49992g = f2;
    }
}
