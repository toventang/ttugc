package com.p2082ss.android.ugc.aweme.feed.guide;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.k */
final /* synthetic */ class C49608k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final C49596j f114148a;

    /* renamed from: b */
    private final RecyclerView.ViewHolder f114149b;

    /* renamed from: c */
    private final float f114150c;

    static {
        Covode.recordClassIndex(58454);
    }

    C49608k(C49596j jVar, RecyclerView.ViewHolder viewHolder, float f) {
        this.f114148a = jVar;
        this.f114149b = viewHolder;
        this.f114150c = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        RecyclerView.ViewHolder viewHolder = this.f114149b;
        float f = this.f114150c;
        View view = viewHolder.itemView;
        Float f2 = (Float) valueAnimator.getAnimatedValue();
        view.setTranslationX((1.0f - f2.floatValue()) * f);
        view.setAlpha((f2.floatValue() * 0.65999997f) + 0.34f);
        view.setScaleX((f2.floatValue() * 0.100000024f) + 0.9f);
        view.setScaleY((f2.floatValue() * 0.100000024f) + 0.9f);
        view.setTranslationY(C49596j.m93013a(viewHolder, (1.0f - f2.floatValue()) * 12.0f));
    }
}
