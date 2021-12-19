package com.p2082ss.android.ugc.aweme.shortvideo.util;

import com.bytedance.covode.number.Covode;
import p4600h.C89378p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.aj */
public final class C73949aj {

    /* renamed from: a */
    public static final C73949aj f166024a = new C73949aj();

    private C73949aj() {
    }

    static {
        Covode.recordClassIndex(86699);
    }

    /* renamed from: a */
    public static final C89378p<Integer, Integer> m130040a(int i, int i2, int i3) {
        if (i >= i3) {
            return new C89378p<>(0, 0);
        }
        return new C89378p<>(Integer.valueOf(i), Integer.valueOf(Math.min(i2, i3)));
    }
}
