package com.p2082ss.android.ugc.effectmanager;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.effectmanager.FetchModelType */
public enum FetchModelType {
    ORIGIN(0),
    ZIP(1);
    
    private int value;

    public final int getValue() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(95368);
    }

    public static FetchModelType fromValue(int i) {
        FetchModelType[] values = values();
        for (FetchModelType fetchModelType : values) {
            if (fetchModelType.value == i) {
                return fetchModelType;
            }
        }
        return ORIGIN;
    }

    private FetchModelType(int i) {
        this.value = i;
    }
}
