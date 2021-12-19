package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.ay */
public enum EnumC9541ay {
    UNKNOWN("unknown"),
    ANCHOR_CLOSED("gift_disable_anchor"),
    SPECIAL_ACCOUNT("special_account"),
    GIFT_FEATURE_DOES_NOT_SUPPORT("country_disable"),
    AGE_GATE("l1_anchor");
    
    public final String description;

    public final String getDescription() {
        return this.description;
    }

    static {
        Covode.recordClassIndex(11080);
    }

    public static EnumC9541ay parseEnum(int i) {
        if (i < 0 || i >= values().length) {
            return null;
        }
        return values()[i];
    }

    private EnumC9541ay(String str) {
        this.description = str;
    }
}
