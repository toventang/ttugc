package com.p2082ss.android.ugc.aweme.video.preload;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.video.preload.c */
public enum EnumC80868c {
    Normal(null, -1),
    GHouse("g-house", 100);
    

    /* renamed from: b */
    private final String f180808b;

    /* renamed from: c */
    private final long f180809c;

    public final String getCacheDir() {
        return this.f180808b;
    }

    public final long getSizeMB() {
        return this.f180809c;
    }

    static {
        Covode.recordClassIndex(94166);
    }

    private EnumC80868c(String str, long j) {
        this.f180808b = str;
        this.f180809c = j;
    }
}
