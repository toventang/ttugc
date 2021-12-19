package com.p2082ss.android.ugc.aweme.utils;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.utils.bb */
public final /* synthetic */ class C80238bb implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final TextView f179716a;

    static {
        Covode.recordClassIndex(93506);
    }

    C80238bb(TextView textView) {
        this.f179716a = textView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        TextView textView = this.f179716a;
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.height = intValue;
        textView.setLayoutParams(layoutParams);
    }
}
