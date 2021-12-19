package com.bef.effectsdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;

public class GeneralParam {
    static {
        Covode.recordClassIndex(2690);
    }

    private static native String nativeGetParamByKey(String str);

    private static native void nativeSetParamWithKey(String str, String str2);

    private static native void nativeSetParams(HashMap<String, String> hashMap);

    public static String getParamByKey(String str) {
        MethodCollector.m26663i(3119);
        String nativeGetParamByKey = nativeGetParamByKey(str);
        MethodCollector.m26664o(3119);
        return nativeGetParamByKey;
    }

    public static void setParams(HashMap<String, String> hashMap) {
        MethodCollector.m26663i(3114);
        nativeSetParams(hashMap);
        MethodCollector.m26664o(3114);
    }

    public static void setParamWithKey(String str, String str2) {
        MethodCollector.m26663i(3117);
        nativeSetParamWithKey(str, str2);
        MethodCollector.m26664o(3117);
    }
}
