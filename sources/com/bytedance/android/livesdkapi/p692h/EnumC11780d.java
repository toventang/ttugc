package com.bytedance.android.livesdkapi.p692h;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.h.d */
public enum EnumC11780d {
    UNKNOWN(0, ""),
    STRING(1, "string"),
    USER(11, "user"),
    GIFT(12, "gift"),
    HEART(13, "heart"),
    PATTERN_REF(14, "pref"),
    IMAGE(15, "image");
    

    /* renamed from: a */
    private int f28151a;

    /* renamed from: b */
    private String f28152b;

    public final int getPieceType() {
        return this.f28151a;
    }

    public final String getTag() {
        return this.f28152b;
    }

    static {
        Covode.recordClassIndex(13470);
    }

    private EnumC11780d(int i, String str) {
        this.f28151a = i;
        this.f28152b = str;
    }
}
