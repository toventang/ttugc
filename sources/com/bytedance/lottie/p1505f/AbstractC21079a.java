package com.bytedance.lottie.p1505f;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.lottie.f.a */
public abstract class AbstractC21079a extends ValueAnimator {

    /* renamed from: a */
    private final Set<ValueAnimator.AnimatorUpdateListener> f49948a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private final Set<Animator.AnimatorListener> f49949b = new CopyOnWriteArraySet();

    static {
        Covode.recordClassIndex(24695);
    }

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void removeAllListeners() {
        this.f49949b.clear();
    }

    public void removeAllUpdateListeners() {
        this.f49948a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34521a() {
        for (Animator.AnimatorListener animatorListener : this.f49949b) {
            animatorListener.onAnimationRepeat(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo34525b() {
        for (Animator.AnimatorListener animatorListener : this.f49949b) {
            animatorListener.onAnimationCancel(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo34527c() {
        for (ValueAnimator.AnimatorUpdateListener animatorUpdateListener : this.f49948a) {
            animatorUpdateListener.onAnimationUpdate(this);
        }
    }

    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f49949b.add(animatorListener);
    }

    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f49948a.add(animatorUpdateListener);
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f49949b.remove(animatorListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f49948a.remove(animatorUpdateListener);
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
    public final void mo34522a(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f49949b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    /* renamed from: b */
    public final void mo34526b(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f49949b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }
}
