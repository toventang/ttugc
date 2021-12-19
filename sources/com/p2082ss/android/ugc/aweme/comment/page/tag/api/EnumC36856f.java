package com.p2082ss.android.ugc.aweme.comment.page.tag.api;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.api.f */
public enum EnumC36856f {
    UNDEFINED(0),
    COMMENT_MENTION(3),
    VIDEO_TAG(4),
    QA_INVITE(5),
    VIDEO_MENTION(6);
    

    /* renamed from: b */
    private final int f86843b;

    public final int getType() {
        return this.f86843b;
    }

    static {
        Covode.recordClassIndex(44194);
    }

    private EnumC36856f(int i) {
        this.f86843b = i;
    }
}
