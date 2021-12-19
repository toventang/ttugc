package com.p2082ss.android.ugc.aweme.sticker.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;

/* renamed from: com.ss.android.ugc.aweme.sticker.widget.CheckableImageView */
public class CheckableImageView extends AppCompatImageView {

    /* renamed from: a */
    public AbstractC76409a f171642a;

    /* renamed from: com.ss.android.ugc.aweme.sticker.widget.CheckableImageView$a */
    public interface AbstractC76409a {
        static {
            Covode.recordClassIndex(89372);
        }

        /* renamed from: a */
        void mo118924a();

        /* renamed from: a */
        void mo118925a(int i);
    }

    static {
        Covode.recordClassIndex(89369);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    /* renamed from: a */
    public final void mo120123a() {
        clearAnimation();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, 1.08f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, 1.08f);
        ofFloat.setDuration(100L);
        ofFloat2.setDuration(100L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "scaleX", 1.08f, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, "scaleY", 1.08f, 0.0f);
        ofFloat3.setDuration(100L);
        ofFloat4.setDuration(100L);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        ofFloat6.setDuration(100L);
        ofFloat5.setDuration(100L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).with(ofFloat6).after(ofFloat);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this, "scaleX", 0.0f, 1.08f);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this, "scaleY", 0.0f, 1.08f);
        ofFloat7.setDuration(100L);
        ofFloat8.setDuration(100L);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this, "scaleX", 1.08f, 1.0f);
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this, "scaleY", 1.08f, 1.0f);
        ofFloat9.setDuration(100L);
        ofFloat9.setDuration(100L);
        final AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ofFloat7).with(ofFloat8).with(ofFloat5);
        animatorSet2.play(ofFloat9).with(ofFloat10).after(ofFloat7);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.sticker.widget.CheckableImageView.C764071 */

            static {
                Covode.recordClassIndex(89370);
            }

            public final void onAnimationStart(Animator animator) {
                if (CheckableImageView.this.f171642a != null) {
                    CheckableImageView.this.f171642a.mo118925a(0);
                }
            }

            public final void onAnimationEnd(Animator animator) {
                animatorSet2.start();
                if (CheckableImageView.this.f171642a != null) {
                    CheckableImageView.this.f171642a.mo118925a(1);
                }
            }
        });
        animatorSet2.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.sticker.widget.CheckableImageView.C764082 */

            static {
                Covode.recordClassIndex(89371);
            }

            public final void onAnimationEnd(Animator animator) {
                if (CheckableImageView.this.f171642a != null) {
                    CheckableImageView.this.f171642a.mo118924a();
                }
            }
        });
        animatorSet.start();
    }

    public void setOnStateChangeListener(AbstractC76409a aVar) {
        this.f171642a = aVar;
    }

    public CheckableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private CheckableImageView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
    }
}
