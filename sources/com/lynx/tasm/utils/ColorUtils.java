package com.lynx.tasm.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class ColorUtils {
    static {
        Covode.recordClassIndex(35038);
    }

    private static native int nativeParse(String str);

    private static native boolean nativeValidate(String str);

    /* renamed from: a */
    public static int m57910a(String str) {
        MethodCollector.m26663i(2048);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(2048);
            return 0;
        }
        int nativeParse = nativeParse(str);
        MethodCollector.m26664o(2048);
        return nativeParse;
    }
}
