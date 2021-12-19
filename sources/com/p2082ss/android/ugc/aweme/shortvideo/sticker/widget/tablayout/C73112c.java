package com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout;

import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.c */
final /* synthetic */ class C73112c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final TabLayout.C73106h f164164a;

    /* renamed from: b */
    private final int f164165b;

    /* renamed from: c */
    private final int f164166c;

    /* renamed from: d */
    private final TabLayout f164167d;

    /* renamed from: e */
    private final boolean f164168e;

    /* renamed from: f */
    private final boolean f164169f;

    static {
        Covode.recordClassIndex(85821);
    }

    C73112c(TabLayout.C73106h hVar, int i, int i2, TabLayout tabLayout, boolean z, boolean z2) {
        this.f164164a = hVar;
        this.f164165b = i;
        this.f164166c = i2;
        this.f164167d = tabLayout;
        this.f164168e = z;
        this.f164169f = z2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        TabLayout.C73106h hVar = this.f164164a;
        int i = this.f164165b;
        int i2 = this.f164166c;
        TabLayout tabLayout = this.f164167d;
        boolean z = this.f164168e;
        boolean z2 = this.f164169f;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (i >= i2 || hVar.f164137a) {
            floatValue = 1.0f - floatValue;
        } else {
            i2--;
        }
        tabLayout.mo115521a(i2, floatValue, z, z2);
    }
}
