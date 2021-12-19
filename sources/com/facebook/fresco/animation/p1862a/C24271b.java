package com.facebook.fresco.animation.p1862a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.facebook.fresco.animation.p1862a.AbstractC24270a;

/* renamed from: com.facebook.fresco.animation.a.b */
public class C24271b<T extends AbstractC24270a> implements AbstractC24270a {

    /* renamed from: a */
    public T f57530a;

    /* renamed from: b */
    private int f57531b = -1;

    /* renamed from: c */
    private ColorFilter f57532c;

    /* renamed from: d */
    private Rect f57533d;

    static {
        Covode.recordClassIndex(28403);
    }

    @Override // com.facebook.fresco.animation.p1862a.AbstractC24270a
    /* renamed from: d */
    public final void mo40048d() {
        T t = this.f57530a;
        if (t != null) {
            t.mo40048d();
        }
    }

    @Override // com.facebook.fresco.animation.p1862a.AbstractC24275d
    /* renamed from: a */
    public int mo9308a() {
        T t = this.f57530a;
        if (t == null) {
            return 0;
        }
        return t.mo9308a();
    }

    @Override // com.facebook.fresco.animation.p1862a.AbstractC24270a
    /* renamed from: b */
    public final int mo40045b() {
        T t = this.f57530a;
        if (t == null) {
            return -1;
        }
        return t.mo40045b();
    }

    @Override // com.facebook.fresco.animation.p1862a.AbstractC24270a
    /* renamed from: c */
    public final int mo40047c() {
        T t = this.f57530a;
        if (t == null) {
            return -1;
        }
        return t.mo40047c();
    }

    @Override // com.facebook.fresco.animation.p1862a.AbstractC24275d
    /* renamed from: e */
    public final int mo40050e() {
        T t = this.f57530a;
        if (t == null) {
            return 0;
        }
        return t.mo40050e();
    }

    public C24271b(T t) {
        this.f57530a = t;
    }

    @Override // com.facebook.fresco.animation.p1862a.AbstractC24270a
    /* renamed from: a */
    public final void mo40041a(int i) {
        T t = this.f57530a;
        if (t != null) {
            t.mo40041a(i);
        }
        this.f57531b = i;
    }

    @Override // com.facebook.fresco.animation.p1862a.AbstractC24270a
    /* renamed from: b */
    public final boolean mo40046b(int i) {
        T t = this.f57530a;
        if (t != null) {
            return t.mo40046b(i);
        }
        return false;
    }

    @Override // com.facebook.fresco.animation.p1862a.AbstractC24275d
    /* renamed from: c */
    public final int mo40049c(int i) {
        T t = this.f57530a;
        if (t == null) {
            return 0;
        }
        return t.mo40049c(i);
    }

    @Override // com.facebook.fresco.animation.p1862a.AbstractC24270a
    /* renamed from: a */
    public final void mo40042a(ColorFilter colorFilter) {
        T t = this.f57530a;
        if (t != null) {
            t.mo40042a(colorFilter);
        }
        this.f57532c = colorFilter;
    }

    @Override // com.facebook.fresco.animation.p1862a.AbstractC24270a
    /* renamed from: a */
    public final void mo40043a(Rect rect) {
        T t = this.f57530a;
        if (t != null) {
            t.mo40043a(rect);
        }
        this.f57533d = rect;
    }

    @Override // com.facebook.fresco.animation.p1862a.AbstractC24270a
    /* renamed from: a */
    public boolean mo40044a(Drawable drawable, Canvas canvas, int i) {
        T t = this.f57530a;
        if (t == null || !t.mo40044a(drawable, canvas, i)) {
            return false;
        }
        return true;
    }
}
