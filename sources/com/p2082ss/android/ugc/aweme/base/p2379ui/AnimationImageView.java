package com.p2082ss.android.ugc.aweme.base.p2379ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.base.ui.AnimationImageView */
public class AnimationImageView extends LottieAnimationView {
    static {
        Covode.recordClassIndex(41624);
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo5836d();
    }

    /* renamed from: g */
    private void mo85726g() {
        setImageFolder("images");
        mo5828a(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.base.p2379ui.AnimationImageView.C346541 */

            static {
                Covode.recordClassIndex(41625);
            }

            public final void onAnimationCancel(Animator animator) {
                super.onAnimationCancel(animator);
                AnimationImageView.this.setLayerType(0, null);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                AnimationImageView.this.setLayerType(0, null);
            }
        });
    }

    private void setImageFolder(String str) {
        setImageAssetsFolder(str);
    }

    public AnimationImageView(Context context) {
        super(context);
        mo85726g();
    }

    public AnimationImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo85726g();
    }
}
