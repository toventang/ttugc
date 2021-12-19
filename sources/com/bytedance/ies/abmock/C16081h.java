package com.bytedance.ies.abmock;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SaveConfigType;

/* renamed from: com.bytedance.ies.abmock.h */
public final /* synthetic */ class C16081h {

    /* renamed from: a */
    public static final /* synthetic */ int[] f38731a;

    static {
        Covode.recordClassIndex(18357);
        int[] iArr = new int[SaveConfigType.ConfigType.values().length];
        f38731a = iArr;
        iArr[SaveConfigType.ConfigType.BOOLEAN.ordinal()] = 1;
        iArr[SaveConfigType.ConfigType.INT.ordinal()] = 2;
        iArr[SaveConfigType.ConfigType.LONG.ordinal()] = 3;
        iArr[SaveConfigType.ConfigType.FLOAT.ordinal()] = 4;
        iArr[SaveConfigType.ConfigType.DOUBLE.ordinal()] = 5;
        iArr[SaveConfigType.ConfigType.STRING.ordinal()] = 6;
        iArr[SaveConfigType.ConfigType.STRING_ARRAY.ordinal()] = 7;
    }
}
