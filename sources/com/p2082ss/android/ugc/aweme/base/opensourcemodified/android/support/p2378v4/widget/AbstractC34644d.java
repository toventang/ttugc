package com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget;

import android.view.animation.Animation;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.d */
public abstract class AbstractC34644d {

    /* renamed from: b */
    private static final String f81812b = AbstractC34644d.class.getSimpleName();

    /* renamed from: a */
    public boolean f81813a;

    /* renamed from: c */
    private boolean f81814c = true;

    /* renamed from: d */
    private Boolean f81815d;

    /* renamed from: b */
    public final void mo61201b() {
        mo61200a(false);
    }

    /* renamed from: c */
    public final void mo61203c() {
        mo61200a(false);
    }

    static {
        Covode.recordClassIndex(41611);
    }

    /* renamed from: d */
    private void m70751d() {
        Boolean bool = this.f81815d;
        if (bool != null) {
            m70750b(bool.booleanValue());
            this.f81815d = null;
        }
    }

    /* renamed from: a */
    public final void mo61198a() {
        mo61200a(true);
    }

    /* renamed from: a */
    public final Animation.AnimationListener mo61197a(final Animation.AnimationListener animationListener) {
        return new Animation.AnimationListener() {
            /* class com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.AbstractC34644d.animationAnimation$AnimationListenerC346451 */

            static {
                Covode.recordClassIndex(41612);
            }

            public final void onAnimationRepeat(Animation animation) {
                Animation.AnimationListener animationListener = animationListener;
                if (animationListener != null) {
                    animationListener.onAnimationRepeat(animation);
                }
            }

            public final void onAnimationStart(Animation animation) {
                Animation.AnimationListener animationListener = animationListener;
                if (animationListener != null) {
                    animationListener.onAnimationStart(animation);
                }
            }

            public final void onAnimationEnd(Animation animation) {
                Animation.AnimationListener animationListener = animationListener;
                if (animationListener != null) {
                    animationListener.onAnimationEnd(animation);
                }
                AbstractC34644d.this.mo61200a(true);
            }
        };
    }

    /* renamed from: b */
    private void m70750b(boolean z) {
        if (this.f81813a != z) {
            if (!this.f81814c) {
                this.f81815d = Boolean.valueOf(z);
            } else {
                this.f81813a = z;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61200a(boolean z) {
        if (this.f81814c != z) {
            this.f81814c = z;
            if (z) {
                m70751d();
            }
        }
    }

    /* renamed from: a */
    public final void mo61199a(int i, Animation.AnimationListener animationListener) {
        new StringBuilder("animateOffsetToCorrectPosition() called with: from = [").append(i).append("], listener = [").append(animationListener).append("]");
        mo61200a(false);
    }

    /* renamed from: b */
    public final void mo61202b(int i, Animation.AnimationListener animationListener) {
        new StringBuilder("animateOffsetToStartPosition() called with: from = [").append(i).append("], listener = [").append(animationListener).append("]");
        mo61200a(false);
    }
}
