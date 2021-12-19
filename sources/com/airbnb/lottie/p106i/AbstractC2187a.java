package com.airbnb.lottie.p106i;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.airbnb.lottie.i.a */
public abstract class AbstractC2187a extends ValueAnimator {

    /* renamed from: a */
    private final Set<ValueAnimator.AnimatorUpdateListener> f6531a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private final Set<Animator.AnimatorListener> f6532b = new CopyOnWriteArraySet();

    static {
        Covode.recordClassIndex(2382);
    }

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void removeAllListeners() {
        this.f6532b.clear();
    }

    public void removeAllUpdateListeners() {
        this.f6531a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo6079a() {
        for (Animator.AnimatorListener animatorListener : this.f6532b) {
            animatorListener.onAnimationRepeat(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo6083b() {
        for (Animator.AnimatorListener animatorListener : this.f6532b) {
            animatorListener.onAnimationCancel(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo6085c() {
        for (ValueAnimator.AnimatorUpdateListener animatorUpdateListener : this.f6531a) {
            animatorUpdateListener.onAnimationUpdate(this);
        }
    }

    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f6532b.add(animatorListener);
    }

    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f6531a.add(animatorUpdateListener);
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f6532b.remove(animatorListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f6531a.remove(animatorUpdateListener);
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.ValueAnimator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo6080a(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f6532b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    /* renamed from: b */
    public final void mo6084b(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f6532b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }
}
