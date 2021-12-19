package com.bef.effectsdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class RequirementResourceMapper {
    static {
        Covode.recordClassIndex(2697);
    }

    private static native String[] nativePeekResourcesNeededByRequirements(String[] strArr);

    private RequirementResourceMapper() {
    }

    public static String[] peekResourcesNeededByRequirements(String[] strArr) {
        MethodCollector.m26663i(5233);
        String[] nativePeekResourcesNeededByRequirements = nativePeekResourcesNeededByRequirements(strArr);
        MethodCollector.m26664o(5233);
        return nativePeekResourcesNeededByRequirements;
    }
}
