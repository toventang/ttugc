package com.p2082ss.android.ugc.aweme.discover.helper;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.animationInterpolatorC69832aj;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.b */
public abstract class AbstractC41997b {

    /* renamed from: a */
    public Context f97942a;

    /* renamed from: b */
    public int f97943b;

    /* renamed from: c */
    protected int f97944c;

    /* renamed from: d */
    private ValueAnimator f97945d;

    /* renamed from: e */
    private ValueAnimator f97946e;

    static {
        Covode.recordClassIndex(49927);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo71168a(Animator animator);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo71169a(ValueAnimator valueAnimator);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo71172b(Animator animator);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo71173b(ValueAnimator valueAnimator);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo71174c(Animator animator);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo71175d(Animator animator);

    /* renamed from: a */
    public void mo71167a() {
        mo71170a(true);
    }

    /* renamed from: c */
    private void m84059c() {
        ValueAnimator valueAnimator = this.f97946e;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f97946e.end();
        }
        ValueAnimator valueAnimator2 = this.f97945d;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f97945d.end();
        }
    }

    /* renamed from: b */
    public void mo71171b() {
        long j;
        m84059c();
        if (this.f97944c != 0) {
            if (this.f97946e == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f97946e = valueAnimator;
                valueAnimator.setFloatValues(0.0f, 1.0f);
                ValueAnimator valueAnimator2 = this.f97946e;
                int i = this.f97943b;
                if (i == 0) {
                    j = 200;
                } else {
                    j = (long) i;
                }
                valueAnimator2.setDuration(j);
                this.f97946e.setInterpolator(new animationInterpolatorC69832aj(0.32f, 0.94f, 0.6f));
                this.f97946e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.p2082ss.android.ugc.aweme.discover.helper.AbstractC41997b.C420003 */

                    static {
                        Covode.recordClassIndex(49930);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        AbstractC41997b.this.mo71173b(valueAnimator);
                    }
                });
                this.f97946e.addListener(new AnimatorListenerAdapter() {
                    /* class com.p2082ss.android.ugc.aweme.discover.helper.AbstractC41997b.C420014 */

                    static {
                        Covode.recordClassIndex(49931);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        AbstractC41997b.this.mo71175d(animator);
                        AbstractC41997b.this.f97944c = 0;
                    }

                    public final void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        AbstractC41997b.this.mo71174c(animator);
                    }
                });
            }
            this.f97946e.start();
        }
    }

    public AbstractC41997b(Context context) {
        this.f97942a = context;
    }

    /* renamed from: a */
    public final void mo71170a(boolean z) {
        long j;
        m84059c();
        if (this.f97944c != 1) {
            if (this.f97945d == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f97945d = valueAnimator;
                valueAnimator.setFloatValues(0.0f, 1.0f);
                int i = this.f97943b;
                if (i == 0) {
                    j = 200;
                } else {
                    j = (long) i;
                }
                if (!z) {
                    j = 0;
                }
                this.f97945d.setDuration(j);
                this.f97945d.setInterpolator(new animationInterpolatorC69832aj(0.32f, 0.94f, 0.6f));
                this.f97945d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.p2082ss.android.ugc.aweme.discover.helper.AbstractC41997b.C419981 */

                    static {
                        Covode.recordClassIndex(49928);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        AbstractC41997b.this.mo71169a(valueAnimator);
                    }
                });
                this.f97945d.addListener(new AnimatorListenerAdapter() {
                    /* class com.p2082ss.android.ugc.aweme.discover.helper.AbstractC41997b.C419992 */

                    static {
                        Covode.recordClassIndex(49929);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        AbstractC41997b.this.mo71172b(animator);
                        AbstractC41997b.this.f97944c = 1;
                    }

                    public final void onAnimationStart(Animator animator) {
                        super.onAnimationStart(animator);
                        AbstractC41997b.this.mo71168a(animator);
                    }
                });
            }
            this.f97945d.start();
        }
    }
}
