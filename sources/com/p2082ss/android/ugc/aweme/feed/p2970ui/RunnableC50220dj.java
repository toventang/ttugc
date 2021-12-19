package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.ui.dj */
public final /* synthetic */ class RunnableC50220dj implements Runnable {

    /* renamed from: a */
    private final C50211dg f115972a;

    /* renamed from: b */
    private final boolean f115973b;

    /* renamed from: c */
    private final int f115974c;

    static {
        Covode.recordClassIndex(59346);
    }

    RunnableC50220dj(C50211dg dgVar, boolean z, int i) {
        this.f115972a = dgVar;
        this.f115973b = z;
        this.f115974c = i;
    }

    public final void run() {
        C50211dg dgVar = this.f115972a;
        boolean z = this.f115973b;
        int i = this.f115974c;
        if (z) {
            dgVar.f115955f.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dgVar.f115955f, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(500L);
            ofFloat.setRepeatCount(0);
            ofFloat.addListener(new AnimatorListenerAdapter() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50211dg.C502143 */

                static {
                    Covode.recordClassIndex(59340);
                }

                public final void onAnimationStart(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    C50211dg.this.f115957h = false;
                }
            });
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dgVar.f115954e, "alpha", 1.0f, 0.0f);
            ofFloat2.setDuration(500L);
            ofFloat2.addListener(new AnimatorListenerAdapter(i, ofFloat) {
                /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50211dg.C502154 */

                /* renamed from: a */
                final /* synthetic */ int f115965a;

                /* renamed from: b */
                final /* synthetic */ ObjectAnimator f115966b;

                static {
                    Covode.recordClassIndex(59341);
                }

                public final void onAnimationStart(Animator animator) {
                    C50211dg.this.f115957h = true;
                    C50211dg.this.f115954e.setVisibility(0);
                }

                public final void onAnimationEnd(Animator animator) {
                    C50211dg.this.f115954e.setVisibility(8);
                    C50211dg.this.f115954e.setAlpha(1.0f);
                    C50211dg.this.mo85379b(this.f115965a);
                    this.f115966b.start();
                }

                {
                    this.f115965a = r2;
                    this.f115966b = r3;
                }
            });
            ofFloat2.start();
            return;
        }
        dgVar.f115954e.setVisibility(8);
        dgVar.f115955f.setAlpha(1.0f);
        dgVar.mo85379b(i);
    }
}
