package com.twitter.sdk.android.core.identity;

import com.bytedance.covode.number.Covode;

/* renamed from: com.twitter.sdk.android.core.identity.i */
final class C87707i extends Exception {
    private static final long serialVersionUID = -7397331487240298819L;

    /* renamed from: a */
    private final int f199223a;

    /* renamed from: b */
    private final String f199224b;

    static {
        Covode.recordClassIndex(103696);
    }

    C87707i(int i, String str, String str2) {
        super(str);
        this.f199223a = i;
        this.f199224b = str2;
    }
}
