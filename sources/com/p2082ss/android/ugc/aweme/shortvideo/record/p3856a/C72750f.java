package com.p2082ss.android.ugc.aweme.shortvideo.record.p3856a;

import android.content.Context;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.a.f */
final class C72750f {

    /* renamed from: a */
    Context f163119a;

    /* renamed from: b */
    ViewGroup f163120b;

    /* renamed from: c */
    public TextView f163121c;

    /* renamed from: d */
    int f163122d;

    /* renamed from: e */
    int f163123e;

    /* renamed from: f */
    int f163124f;

    static {
        Covode.recordClassIndex(85436);
    }

    C72750f(ViewGroup viewGroup) {
        this.f163119a = viewGroup.getContext();
        this.f163120b = viewGroup;
    }

    /* renamed from: a */
    public final void mo115046a(boolean z) {
        TextView textView = this.f163121c;
        if (textView != null && textView.getVisibility() == 0) {
            if (z) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(150);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.record.p3856a.C72750f.animationAnimation$AnimationListenerC727511 */

                    static {
                        Covode.recordClassIndex(85437);
                    }

                    public final void onAnimationRepeat(Animation animation) {
                    }

                    public final void onAnimationStart(Animation animation) {
                    }

                    public final void onAnimationEnd(Animation animation) {
                        C72750f.this.f163121c.setVisibility(8);
                    }
                });
                this.f163121c.startAnimation(alphaAnimation);
                return;
            }
            this.f163121c.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo115045a(int i, int i2, int i3) {
        this.f163122d = i;
        this.f163123e = i2;
        this.f163124f = i3;
    }
}
