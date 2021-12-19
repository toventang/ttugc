package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3191b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.b.b.a */
public enum EnumC55267a {
    COLUMN_SEC_UID("SEC_UID", "TEXT PRIMARY KEY NOT NULL"),
    COLUMN_RELATION_TYPE("RELATION_TYPE", "INTEGER"),
    COLUMN_CREATED_TIME("CREATED_TIME", "BIGINT");
    
    public final String key;
    public final String type;

    static {
        Covode.recordClassIndex(65016);
    }

    private EnumC55267a(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
