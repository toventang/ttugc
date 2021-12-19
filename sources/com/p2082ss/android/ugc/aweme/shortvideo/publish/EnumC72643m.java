package com.p2082ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.m */
public enum EnumC72643m {
    PRIVACY_DIALOG(2),
    POST_FREQUENCY_LIMIT_DIALOG(2),
    SENSITIVE_TITLE_DIALOG(1);
    

    /* renamed from: b */
    private final int f162837b;

    public final int getPriority() {
        return this.f162837b;
    }

    static {
        Covode.recordClassIndex(85326);
    }

    private EnumC72643m(int i) {
        this.f162837b = i;
    }
}
