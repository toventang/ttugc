package com.p2082ss.android.ugc.aweme.live.sdk.chatroom.p3412ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63279g;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.ss.android.ugc.aweme.live.sdk.chatroom.ui.b */
public final class C58754b {

    /* renamed from: a */
    public int f133715a;

    /* renamed from: b */
    float f133716b;

    /* renamed from: c */
    LinkedList<View> f133717c = new LinkedList<>();

    /* renamed from: d */
    public ViewGroup f133718d;

    /* renamed from: e */
    public AbstractC63279g.AbstractC63280a f133719e;

    /* renamed from: f */
    private ValueAnimator f133720f;

    static {
        Covode.recordClassIndex(69060);
    }

    /* renamed from: a */
    public final void mo96153a() {
        ValueAnimator valueAnimator = this.f133720f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f133720f = null;
        }
        if (this.f133715a == 2) {
            this.f133720f = ValueAnimator.ofFloat(1.0f, 0.5f);
        } else {
            this.f133720f = ValueAnimator.ofFloat(0.5f, 1.0f);
        }
        this.f133720f.setDuration(300L);
        this.f133720f.setInterpolator(new LinearInterpolator());
        this.f133720f.addUpdateListener(new C58756c(this));
        this.f133720f.addListener(new Animator.AnimatorListener() {
            /* class com.p2082ss.android.ugc.aweme.live.sdk.chatroom.p3412ui.C58754b.C587551 */

            static {
                Covode.recordClassIndex(69061);
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationCancel(Animator animator) {
                int i = C58754b.this.f133715a;
                if (i == 1) {
                    C58754b.this.mo96154a(0.0f);
                } else if (i == 2) {
                    C58754b.this.mo96154a(1.0f);
                }
            }

            public final void onAnimationEnd(Animator animator) {
                C58754b.this.f133718d.setEnabled(true);
                if (C58754b.this.f133715a == 2) {
                    C58754b.this.f133718d.setVisibility(8);
                    if (C58754b.this.f133719e != null) {
                        C58754b.this.f133719e.mo101865a();
                    }
                }
                int i = C58754b.this.f133715a;
                if (i == 1) {
                    C58754b.this.mo96154a(0.0f);
                } else if (i == 2) {
                    C58754b.this.mo96154a(1.0f);
                }
            }

            public final void onAnimationStart(Animator animator) {
                C58754b.this.f133718d.setEnabled(false);
                C58754b.this.f133718d.setVisibility(0);
                if (C58754b.this.f133715a == 1 && C58754b.this.f133719e != null) {
                    C58754b.this.f133719e.mo101866b();
                }
            }
        });
        this.f133720f.start();
    }

    public C58754b(ViewGroup viewGroup) {
        this.f133718d = viewGroup;
    }

    /* renamed from: a */
    public final void mo96154a(float f) {
        Iterator<View> it = this.f133717c.iterator();
        while (it.hasNext()) {
            View next = it.next();
            next.setAlpha(f);
            if (f == 0.0f) {
                next.setEnabled(false);
            }
            if (f == 1.0f) {
                next.setEnabled(true);
            }
        }
    }
}
