package com.bef.effectsdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class ModelnamesAssigner {
    static {
        Covode.recordClassIndex(2693);
    }

    private static native int nativeSetAssignedModelNames(long j, String[] strArr, String[] strArr2);

    private static native int nativeSetAssignedModelNamesWithPriority(long j, String[] strArr, String[] strArr2, int[] iArr);

    private ModelnamesAssigner() {
    }

    public static int setAssignedModelNames(long j, String[] strArr, String[] strArr2) {
        MethodCollector.m26663i(3031);
        int nativeSetAssignedModelNames = nativeSetAssignedModelNames(j, strArr, strArr2);
        MethodCollector.m26664o(3031);
        return nativeSetAssignedModelNames;
    }

    public static int setAssignedModelNamesWithPriority(long j, String[] strArr, String[] strArr2, int[] iArr) {
        MethodCollector.m26663i(3064);
        int nativeSetAssignedModelNamesWithPriority = nativeSetAssignedModelNamesWithPriority(j, strArr, strArr2, iArr);
        MethodCollector.m26664o(3064);
        return nativeSetAssignedModelNamesWithPriority;
    }
}
