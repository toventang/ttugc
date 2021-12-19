package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.i */
public final class C26680i {

    /* renamed from: a */
    public final ArrayList<C26682a> f63214a = new ArrayList<>();

    /* renamed from: b */
    public C26682a f63215b = null;

    /* renamed from: c */
    public ValueAnimator f63216c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f63217d = new AnimatorListenerAdapter() {
        /* class com.google.android.material.internal.C26680i.C266811 */

        static {
            Covode.recordClassIndex(32137);
        }

        public final void onAnimationEnd(Animator animator) {
            if (C26680i.this.f63216c == animator) {
                C26680i.this.f63216c = null;
            }
        }
    };

    static {
        Covode.recordClassIndex(32136);
    }

    /* renamed from: com.google.android.material.internal.i$a */
    public static class C26682a {

        /* renamed from: a */
        public final int[] f63219a;

        /* renamed from: b */
        public final ValueAnimator f63220b;

        static {
            Covode.recordClassIndex(32138);
        }

        C26682a(int[] iArr, ValueAnimator valueAnimator) {
            this.f63219a = iArr;
            this.f63220b = valueAnimator;
        }
    }

    /* renamed from: a */
    public final void mo44187a(int[] iArr, ValueAnimator valueAnimator) {
        C26682a aVar = new C26682a(iArr, valueAnimator);
        valueAnimator.addListener(this.f63217d);
        this.f63214a.add(aVar);
    }
}
