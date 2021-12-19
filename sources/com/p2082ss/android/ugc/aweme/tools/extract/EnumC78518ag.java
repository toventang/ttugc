package com.p2082ss.android.ugc.aweme.tools.extract;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.ag */
public enum EnumC78518ag {
    PHOTO_MOVIE(1),
    MV_THEME(2),
    STATUS_UPLOAD(4),
    RECORD_PROP(8),
    EDIT_EFFECT(16),
    EDIT_STICKER(32);
    

    /* renamed from: b */
    private final int f176446b;

    public final int getTag() {
        return this.f176446b;
    }

    static {
        Covode.recordClassIndex(91650);
    }

    private EnumC78518ag(int i) {
        this.f176446b = i;
    }
}
