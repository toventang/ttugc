package com.p2082ss.ugc.effectplatform.model.algorithm;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ugc.effectplatform.model.algorithm.b */
public enum EnumC86835b {
    ORIGIN,
    ZIP;

    static {
        Covode.recordClassIndex(102560);
    }

    public final EnumC86835b fromValue(int i) {
        EnumC86835b[] values = values();
        for (EnumC86835b bVar : values) {
            if (bVar.ordinal() == i) {
                return bVar;
            }
        }
        return ORIGIN;
    }
}
