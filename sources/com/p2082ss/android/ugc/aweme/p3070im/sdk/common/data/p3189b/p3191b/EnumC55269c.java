package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3191b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.b.b.c */
public enum EnumC55269c {
    COLUMN_MD5("MD5", "TEXT NOT NULL"),
    COLUMN_TYPE("TYPE", "INTEGER NOT NULL"),
    COLUMN_CONTENT_JSON("CONTENT_JSON", "TEXT"),
    COLUMN_VIDEO_JSON("VIDEO_JSON", "TEXT");
    
    public final String key;
    public final String type;

    static {
        Covode.recordClassIndex(65018);
    }

    private EnumC55269c(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
