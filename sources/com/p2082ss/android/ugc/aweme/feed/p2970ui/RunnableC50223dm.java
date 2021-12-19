package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.dm */
final /* synthetic */ class RunnableC50223dm implements Runnable {

    /* renamed from: a */
    private final C50211dg f115980a;

    static {
        Covode.recordClassIndex(59349);
    }

    RunnableC50223dm(C50211dg dgVar) {
        this.f115980a = dgVar;
    }

    public final void run() {
        C50211dg dgVar = this.f115980a;
        if (!dgVar.f115956g) {
            int i = 1;
            dgVar.f115956g = true;
            dgVar.f113961T.setVisibility(0);
            dgVar.f113961T.measure(View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE));
            dgVar.f115951b = dgVar.f113961T.getMeasuredHeight();
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) dgVar.f115951b, 0.0f);
            translateAnimation.setDuration(250);
            translateAnimation.setFillAfter(true);
            translateAnimation.setAnimationListener(new Animation.AnimationListener() {
                /* class com.p2082ss.android.ugc.aweme.feed.p2970ui.C50211dg.animationAnimation$AnimationListenerC502165 */

                static {
                    Covode.recordClassIndex(59342);
                }

                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    C50211dg.this.f115956g = false;
                    if (C50211dg.this.f115959j != null) {
                        C50211dg.this.f115959j.setShowed(true);
                    }
                }
            });
            dgVar.f115950a.startAnimation(translateAnimation);
            C33744d a = new C33744d().mo59983a("enter_from", dgVar.f113957P == 0 ? "homepage_hot" : "server_push").mo59983a("group_id", dgVar.f113953L.getAid()).mo59983a("author_id", dgVar.f113953L.getAuthorUid()).mo59983a("from_user_id", dgVar.f115959j.getUid());
            if (dgVar.f115954e == null || dgVar.f115954e.getVisibility() != 0) {
                i = 0;
            }
            C39162r.m79460a("show_share_user_info", a.mo59980a("with_follow_button", i).f79943a);
        }
    }
}
