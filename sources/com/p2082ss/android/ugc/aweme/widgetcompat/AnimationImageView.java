package com.p2082ss.android.ugc.aweme.widgetcompat;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;

/* renamed from: com.ss.android.ugc.aweme.widgetcompat.AnimationImageView */
public class AnimationImageView extends LottieAnimationView {
    static {
        Covode.recordClassIndex(95030);
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo5836d();
        C58030k.m104850a(this);
    }

    private void setImageFolder(String str) {
        setImageAssetsFolder(str);
    }

    public AnimationImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setImageFolder("images");
        mo5828a(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.widgetcompat.AnimationImageView.C816331 */

            static {
                Covode.recordClassIndex(95031);
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
}
