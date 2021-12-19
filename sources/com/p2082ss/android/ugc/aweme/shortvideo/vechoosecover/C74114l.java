package com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.l */
final /* synthetic */ class C74114l implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final ChooseCoverActivity.C74095a f166413a;

    /* renamed from: b */
    private final float f166414b;

    /* renamed from: c */
    private final int f166415c;

    /* renamed from: d */
    private final int f166416d;

    static {
        Covode.recordClassIndex(86867);
    }

    C74114l(ChooseCoverActivity.C74095a aVar, float f, int i, int i2) {
        this.f166413a = aVar;
        this.f166414b = f;
        this.f166415c = i;
        this.f166416d = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ChooseCoverActivity.C74095a aVar = this.f166413a;
        float f = this.f166414b;
        int i = this.f166415c;
        int i2 = this.f166416d;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f2 = f * floatValue;
        int i3 = (int) ((((float) i) - f2) / 2.0f);
        int i4 = (int) (((float) i2) * animatedFraction);
        int i5 = (int) f2;
        int i6 = (int) floatValue;
        ChooseCoverActivity.this.f166350e.f200423w.mo56303a(i3, i4, i5, i6);
        aVar.mo116481a(i4, i5, i6);
        ChooseCoverActivity.this.mo116477a(i3, i4, i5, i6);
    }
}
