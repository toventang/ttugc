package com.bytedance.common.utility;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.common.utility.b */
public final class C13585b extends Exception {

    /* renamed from: a */
    private int f33030a;

    static {
        Covode.recordClassIndex(15610);
    }

    public final int getResponseCode() {
        return this.f33030a;
    }

    public C13585b(int i, String str) {
        super(str);
        this.f33030a = i;
    }
}
