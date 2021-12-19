package com.p2082ss.android.ugc.aweme.p4173ug.guide;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.ug.guide.GuideView */
public class GuideView extends FrameLayout {

    /* renamed from: a */
    public AnimatorSet f178681a;

    /* renamed from: b */
    public AnimatorSet f178682b;

    /* renamed from: c */
    public PlayView f178683c;

    /* renamed from: d */
    float f178684d;

    static {
        Covode.recordClassIndex(92848);
    }

    public GuideView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private static int m138449a(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    private GuideView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(5589);
        View inflate = LayoutInflater.from(context).inflate(R.layout.sw, (ViewGroup) null);
        this.f178683c = (PlayView) inflate.findViewById(R.id.byg);
        View findViewById = inflate.findViewById(R.id.bvp);
        addView(inflate, new FrameLayout.LayoutParams(-1, -1));
        this.f178684d = (float) m138449a(context, 1.0f);
        this.f178681a = new AnimatorSet();
        this.f178682b = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, "rotation", 0.0f, 60.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(findViewById, "translationY", 0.0f, this.f178684d * -60.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(findViewById, "rotation", 60.0f, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(findViewById, "translationY", this.f178684d * -60.0f, 0.0f);
        this.f178681a.play(ofFloat).with(ofFloat2);
        this.f178682b.play(ofFloat3).with(ofFloat4);
        findViewById.setPivotX((float) m138449a(context, 114.0f));
        findViewById.setPivotY((float) m138449a(context, 60.0f));
        ofFloat.setDuration(1000L);
        ofFloat.setInterpolator(new DecelerateInterpolator(4.0f));
        ofFloat2.setDuration(1000L);
        ofFloat2.setInterpolator(new DecelerateInterpolator(4.0f));
        ofFloat3.setDuration(1000L);
        ofFloat3.setInterpolator(new DecelerateInterpolator(2.0f));
        ofFloat4.setDuration(1000L);
        ofFloat4.setInterpolator(new DecelerateInterpolator(2.0f));
        this.f178681a.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.p4173ug.guide.GuideView.C796361 */

            static {
                Covode.recordClassIndex(92849);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                GuideView.this.f178682b.start();
            }

            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                GuideView.this.f178683c.f178709m.start();
            }
        });
        this.f178682b.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.p4173ug.guide.GuideView.C796372 */

            static {
                Covode.recordClassIndex(92850);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                GuideView.this.f178681a.start();
            }
        });
        MethodCollector.m26664o(5589);
    }
}
