package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3191b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.b.b.d */
public enum EnumC55270d {
    COLUMN_UID("UID", "TEXT PRIMARY KEY NOT NULL"),
    COLUMN_IS_DISABLE_SHOW_FOLLOW_BAR("IS_DISABLE_SHOW_FOLLOW_BAR", "INTEGER NOT NULL"),
    COLUMN_IS_SAY_HELLO_LOGGER("IS_SAY_HELLO_LOGGER", "INTEGER NOT NULL");
    
    public final String key;
    public final String type;

    static {
        Covode.recordClassIndex(65019);
    }

    private EnumC55270d(String str, String str2) {
        this.key = str;
        this.type = str2;
    }
}
