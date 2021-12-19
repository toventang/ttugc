package com.p2082ss.android.p2092ad.splash.core.p2105j;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.p037h.p039b.C0767b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.p2109f.C29661o;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ad.splash.core.j.d */
public final class C29533d extends RelativeLayout {

    /* renamed from: a */
    private ImageView f70359a;

    /* renamed from: b */
    private TextView f70360b;

    /* renamed from: c */
    private ImageView f70361c;

    /* renamed from: d */
    private Animator f70362d;

    /* renamed from: e */
    private Animator f70363e;

    /* renamed from: f */
    private AnimatorSet f70364f;

    /* renamed from: g */
    private AnimatorSet f70365g;

    static {
        Covode.recordClassIndex(35927);
    }

    /* renamed from: a */
    public final void mo51641a() {
        Animator animator = this.f70362d;
        if (animator != null) {
            animator.cancel();
            this.f70362d = null;
        }
        Animator animator2 = this.f70363e;
        if (animator2 != null) {
            animator2.cancel();
            this.f70363e = null;
        }
        AnimatorSet animatorSet = this.f70364f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f70364f = null;
        }
        AnimatorSet animatorSet2 = this.f70365g;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.f70365g = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f70364f = new AnimatorSet();
        this.f70365g = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, View.ALPHA, 0.0f, 1.0f);
        this.f70362d = ofFloat;
        ofFloat.setDuration(120L);
        this.f70362d.setInterpolator(new LinearInterpolator());
        this.f70362d.setStartDelay(1000);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, View.ALPHA, 1.0f, 0.0f);
        this.f70363e = ofFloat2;
        ofFloat2.setDuration(120L);
        this.f70363e.setStartDelay(3500);
        this.f70363e.setInterpolator(new LinearInterpolator());
        Interpolator a = C0767b.m2680a(0.4f, 0.8f, 0.74f, 1.0f);
        float translationY = this.f70361c.getTranslationY();
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f70361c, View.TRANSLATION_Y, translationY, ((float) ((int) C29661o.m59767a(getContext(), 80.0f))) + translationY);
        ofFloat3.setInterpolator(a);
        ofFloat3.setDuration(1000L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f70361c, View.ROTATION, 30.0f, 0.0f);
        ofFloat4.setInterpolator(a);
        ofFloat4.setDuration(1000L);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f70361c, View.ALPHA, 1.0f, 0.0f);
        ofFloat5.setStartDelay(880);
        ofFloat5.setDuration(120L);
        ofFloat5.setInterpolator(new LinearInterpolator());
        this.f70364f.playTogether(ofFloat3, ofFloat4, ofFloat5);
        this.f70364f.setStartDelay(1000);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f70361c, View.TRANSLATION_Y, translationY, translationY + ((float) ((int) C29661o.m59767a(getContext(), 80.0f))));
        ofFloat6.setInterpolator(a);
        ofFloat6.setDuration(1000L);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f70361c, View.ROTATION, 30.0f, 0.0f);
        ofFloat7.setInterpolator(a);
        ofFloat7.setDuration(1000L);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f70361c, View.ALPHA, 0.0f, 1.0f);
        ofFloat8.setDuration(120L);
        ofFloat8.setInterpolator(new LinearInterpolator());
        this.f70365g.playTogether(ofFloat6, ofFloat7, ofFloat8);
        this.f70365g.setStartDelay(2400);
        this.f70362d.start();
        this.f70363e.start();
        this.f70364f.start();
        this.f70365g.start();
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            mo51641a();
        }
    }

    public C29533d(Context context) {
        super(context);
        MethodCollector.m26663i(13171);
        int a = (int) C29661o.m59767a(context, 3.0f);
        TextView textView = new TextView(context);
        this.f70360b = textView;
        textView.setText(R.string.g08);
        this.f70360b.setShadowLayer(3.0f, 0.0f, 1.0f, Color.parseColor("#80000000"));
        this.f70360b.setTextColor(-1);
        this.f70360b.setGravity(14);
        this.f70360b.setTextSize(1, 17.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) C29661o.m59767a(context, 24.0f));
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        this.f70360b.setLayoutParams(layoutParams);
        this.f70360b.setId(R.id.e5_);
        ImageView imageView = new ImageView(context);
        this.f70359a = imageView;
        imageView.setImageResource(R.drawable.bkr);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) C29661o.m59767a(context, 23.0f), (int) C29661o.m59767a(context, 132.0f));
        layoutParams2.addRule(2, R.id.e5_);
        layoutParams2.bottomMargin = (int) C29661o.m59767a(context, 27.0f);
        layoutParams2.leftMargin = (int) C29661o.m59767a(context, 34.0f);
        layoutParams2.addRule(9);
        this.f70359a.setLayoutParams(layoutParams2);
        this.f70359a.setPadding(a, a, a, a);
        ImageView imageView2 = new ImageView(context);
        this.f70361c = imageView2;
        imageView2.setImageResource(R.drawable.bks);
        int a2 = (int) C29661o.m59767a(context, 59.0f);
        int a3 = (int) C29661o.m59767a(context, 48.0f);
        this.f70361c.setPivotX((float) (((int) C29661o.m59767a(context, 7.0f)) + a2));
        this.f70361c.setPivotY((float) a3);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(a2, a3);
        layoutParams3.addRule(2, R.id.e5_);
        layoutParams3.addRule(11);
        layoutParams3.rightMargin = (int) C29661o.m59767a(context, 26.0f);
        layoutParams3.bottomMargin = (int) C29661o.m59767a(context, 96.0f);
        this.f70361c.setLayoutParams(layoutParams3);
        this.f70361c.setPadding(a, a, a, a);
        addView(this.f70360b);
        addView(this.f70359a);
        addView(this.f70361c);
        setAlpha(0.0f);
        MethodCollector.m26664o(13171);
    }
}
