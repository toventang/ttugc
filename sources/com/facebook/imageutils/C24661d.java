package com.facebook.imageutils;

import android.graphics.ColorSpace;
import android.util.Pair;
import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.imageutils.d */
public final class C24661d {

    /* renamed from: a */
    public final Pair<Integer, Integer> f58584a;

    /* renamed from: b */
    public final ColorSpace f58585b;

    static {
        Covode.recordClassIndex(28813);
    }

    public C24661d(int i, int i2, ColorSpace colorSpace) {
        Pair<Integer, Integer> pair;
        if (i == -1 || i2 == -1) {
            pair = null;
        } else {
            pair = new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        }
        this.f58584a = pair;
        this.f58585b = colorSpace;
    }
}
