package com.google.android.material.p1951a;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.material.a.i */
public final class C26563i {

    /* renamed from: a */
    public long f62669a;

    /* renamed from: b */
    public long f62670b = 300;

    /* renamed from: c */
    public int f62671c;

    /* renamed from: d */
    public int f62672d = 1;

    /* renamed from: e */
    private TimeInterpolator f62673e;

    static {
        Covode.recordClassIndex(31994);
    }

    /* renamed from: a */
    public final TimeInterpolator mo43710a() {
        TimeInterpolator timeInterpolator = this.f62673e;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return C26555a.f62656b;
    }

    public final int hashCode() {
        long j = this.f62669a;
        long j2 = this.f62670b;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + mo43710a().getClass().hashCode()) * 31) + this.f62671c) * 31) + this.f62672d;
    }

    public final String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f62669a + " duration: " + this.f62670b + " interpolator: " + mo43710a().getClass() + " repeatCount: " + this.f62671c + " repeatMode: " + this.f62672d + "}\n";
    }

    public C26563i(long j) {
        this.f62669a = j;
        this.f62670b = 150;
    }

    /* renamed from: a */
    static C26563i m52588a(ValueAnimator valueAnimator) {
        C26563i iVar = new C26563i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m52589b(valueAnimator));
        iVar.f62671c = valueAnimator.getRepeatCount();
        iVar.f62672d = valueAnimator.getRepeatMode();
        return iVar;
    }

    /* renamed from: b */
    private static TimeInterpolator m52589b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return C26555a.f62656b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return C26555a.f62657c;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            return C26555a.f62658d;
        }
        return interpolator;
    }

    /* renamed from: a */
    public final void mo43711a(Animator animator) {
        animator.setStartDelay(this.f62669a);
        animator.setDuration(this.f62670b);
        animator.setInterpolator(mo43710a());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f62671c);
            valueAnimator.setRepeatMode(this.f62672d);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C26563i iVar = (C26563i) obj;
        if (this.f62669a == iVar.f62669a && this.f62670b == iVar.f62670b && this.f62671c == iVar.f62671c && this.f62672d == iVar.f62672d) {
            return mo43710a().getClass().equals(iVar.mo43710a().getClass());
        }
        return false;
    }

    private C26563i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f62669a = j;
        this.f62670b = j2;
        this.f62673e = timeInterpolator;
    }
}
