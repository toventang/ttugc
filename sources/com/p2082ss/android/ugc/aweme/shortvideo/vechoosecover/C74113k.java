package com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.vechoosecover.k */
final /* synthetic */ class C74113k implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final ChooseCoverActivity.C74095a f166407a;

    /* renamed from: b */
    private final float f166408b;

    /* renamed from: c */
    private final int f166409c;

    /* renamed from: d */
    private final int f166410d;

    /* renamed from: e */
    private final int f166411e;

    /* renamed from: f */
    private final int f166412f;

    static {
        Covode.recordClassIndex(86866);
    }

    C74113k(ChooseCoverActivity.C74095a aVar, float f, int i, int i2, int i3, int i4) {
        this.f166407a = aVar;
        this.f166408b = f;
        this.f166409c = i;
        this.f166410d = i2;
        this.f166411e = i3;
        this.f166412f = i4;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ChooseCoverActivity.C74095a aVar = this.f166407a;
        float f = this.f166408b;
        int i = this.f166409c;
        int i2 = this.f166410d;
        int i3 = this.f166411e;
        int i4 = this.f166412f;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i5 = (int) ((((((float) (i - i2)) - (((float) (i3 + i4)) * animatedFraction)) - floatValue) / 2.0f) + ((float) i4));
        int i6 = (int) (f * floatValue);
        int i7 = (int) floatValue;
        ChooseCoverActivity.this.f166350e.f200423w.mo56303a(0, i5, i6, i7);
        aVar.mo116481a(i5, i6, i7);
        ChooseCoverActivity.this.mo116477a(0, i5, i6, i7);
    }
}
