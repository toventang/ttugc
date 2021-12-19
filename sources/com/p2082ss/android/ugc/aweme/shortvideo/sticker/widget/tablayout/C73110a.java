package com.p2082ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.p048g.p049a.p050a.C0994a;
import androidx.p048g.p049a.p050a.C0995b;
import androidx.p048g.p049a.p050a.C0996c;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.a */
public final class C73110a {

    /* renamed from: a */
    static final Interpolator f164156a = new LinearInterpolator();

    /* renamed from: b */
    static final Interpolator f164157b = new C0995b();

    /* renamed from: c */
    static final Interpolator f164158c = new C0994a();

    /* renamed from: d */
    static final Interpolator f164159d = new C0996c();

    /* renamed from: e */
    static final Interpolator f164160e = new DecelerateInterpolator();

    static {
        Covode.recordClassIndex(85819);
    }

    /* renamed from: a */
    static int m129121a(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
