package com.p2082ss.android.ugc.aweme.shortvideo.subtitle;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.q */
public final class C73259q extends RuntimeException {

    /* renamed from: a */
    private final int f164505a;

    /* renamed from: b */
    private final int f164506b;

    static {
        Covode.recordClassIndex(85977);
    }

    public final int getErrorCode() {
        return this.f164506b;
    }

    public final int getStep() {
        return this.f164505a;
    }

    public C73259q(int i, int i2) {
        this.f164505a = i;
        this.f164506b = i2;
    }
}
