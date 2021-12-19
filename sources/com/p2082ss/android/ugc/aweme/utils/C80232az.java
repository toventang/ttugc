package com.p2082ss.android.ugc.aweme.utils;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.utils.az */
public final class C80232az {
    static {
        Covode.recordClassIndex(93500);
    }

    /* renamed from: a */
    public static void m139069a(ViewGroup viewGroup, ImageView imageView, TextView textView, int i, int i2, boolean z, boolean z2, AnimatorListenerAdapter animatorListenerAdapter) {
        float dimension;
        float b;
        int i3;
        ValueAnimator ofInt;
        ValueAnimator ofInt2;
        if (z2) {
            dimension = C13628n.m24520b(imageView.getContext(), 20.0f);
        } else {
            dimension = imageView.getResources().getDimension(R.dimen.jm);
        }
        int i4 = (int) dimension;
        if (z2) {
            b = C13628n.m24520b(imageView.getContext(), 12.0f);
        } else {
            b = C13628n.m24520b(imageView.getContext(), 0.0f);
        }
        int i5 = (int) b;
        int i6 = -180;
        if (z) {
            i3 = 0;
        } else {
            i3 = -180;
            i6 = 0;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "rotation", (float) i3, (float) i6);
        int[] iArr = new int[2];
        if (z) {
            iArr[0] = i4;
            iArr[1] = i5;
            ofInt = ValueAnimator.ofInt(iArr);
            ofInt2 = ValueAnimator.ofInt(i2, i);
        } else {
            iArr[0] = i5;
            iArr[1] = i4;
            ofInt = ValueAnimator.ofInt(iArr);
            ofInt2 = ValueAnimator.ofInt(i, i2);
        }
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new C80237ba(viewGroup, z2));
        ofInt2.addUpdateListener(new C80238bb(textView));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofInt).with(ofInt2);
        if (animatorListenerAdapter != null) {
            animatorSet.addListener(animatorListenerAdapter);
        }
        animatorSet.setDuration(400L);
        animatorSet.start();
    }
}
