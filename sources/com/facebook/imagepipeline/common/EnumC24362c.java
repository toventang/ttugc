package com.facebook.imagepipeline.common;

import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.imagepipeline.common.c */
public enum EnumC24362c {
    LOW,
    MEDIUM,
    HIGH;

    static {
        Covode.recordClassIndex(28505);
    }

    public static EnumC24362c getHigherPriority(EnumC24362c cVar, EnumC24362c cVar2) {
        if (cVar == null) {
            return cVar2;
        }
        if (cVar2 != null && cVar.ordinal() <= cVar2.ordinal()) {
            return cVar2;
        }
        return cVar;
    }
}
