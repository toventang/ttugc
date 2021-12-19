package com.google.android.material.p1951a;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.p048g.p049a.p050a.C0994a;
import androidx.p048g.p049a.p050a.C0995b;
import androidx.p048g.p049a.p050a.C0996c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.material.a.a */
public final class C26555a {

    /* renamed from: a */
    public static final TimeInterpolator f62655a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f62656b = new C0995b();

    /* renamed from: c */
    public static final TimeInterpolator f62657c = new C0994a();

    /* renamed from: d */
    public static final TimeInterpolator f62658d = new C0996c();

    /* renamed from: e */
    public static final TimeInterpolator f62659e = new DecelerateInterpolator();

    static {
        Covode.recordClassIndex(31986);
    }

    /* renamed from: a */
    public static int m52579a(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
