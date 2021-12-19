package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55190b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.q */
public final class C54562q extends AbstractC54482a {

    /* renamed from: a */
    private ImageView f125055a;

    /* renamed from: b */
    private Animation f125056b;

    /* renamed from: x */
    private Animation.AnimationListener f125057x = new Animation.AnimationListener() {
        /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54562q.animationAnimation$AnimationListenerC545631 */

        static {
            Covode.recordClassIndex(64274);
        }

        public final void onAnimationEnd(Animation animation) {
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }
    };

    static {
        Covode.recordClassIndex(64273);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public final void mo91007a() {
        super.mo91007a();
        this.f125055a = (ImageView) mo91563a(R.id.dha);
    }

    /* renamed from: i */
    public final void mo91644i() {
        if (this.f125056b == null) {
            this.f125056b = C55190b.m100901a(800, this.f125057x);
        }
        this.f125055a.startAnimation(this.f125056b);
    }

    /* renamed from: j */
    public final void mo91645j() {
        Animation animation = this.f125055a.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        this.f125055a.clearAnimation();
    }

    public C54562q(View view) {
        super(view);
    }
}
