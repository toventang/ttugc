package com.bytedance.nita.api;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.nita.api.g */
public enum EnumC21530g {
    INFINITE(0),
    SHORT(15000),
    LONG(60000),
    ACTIVITY_DESTORY(-1);
    

    /* renamed from: b */
    private final long f51115b;

    public final long getDelay() {
        return this.f51115b;
    }

    static {
        Covode.recordClassIndex(25171);
    }

    private EnumC21530g(long j) {
        this.f51115b = j;
    }
}
