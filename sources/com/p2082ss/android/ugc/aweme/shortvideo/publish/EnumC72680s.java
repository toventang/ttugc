package com.p2082ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.s */
public enum EnumC72680s {
    START("start"),
    SUCCESS("success"),
    FAILED("failed"),
    CANCEL_EXTERNAL("cancel_external"),
    CANCEL_INTERNAL("cancel_internal"),
    PAUSED("paused");
    

    /* renamed from: b */
    private final String f162943b;

    public final String getDesc() {
        return this.f162943b;
    }

    static {
        Covode.recordClassIndex(85363);
    }

    private EnumC72680s(String str) {
        this.f162943b = str;
    }
}
