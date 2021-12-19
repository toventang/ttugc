package com.bytedance.lighten.p1477a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.lighten.a.q */
public enum EnumC20760q {
    LOW,
    MEDIUM,
    HIGH;

    static {
        Covode.recordClassIndex(24333);
    }

    public static EnumC20760q getHigherPriority(EnumC20760q qVar, EnumC20760q qVar2) {
        if (qVar == null) {
            return qVar2;
        }
        if (qVar2 != null && qVar.ordinal() <= qVar2.ordinal()) {
            return qVar2;
        }
        return qVar;
    }
}
