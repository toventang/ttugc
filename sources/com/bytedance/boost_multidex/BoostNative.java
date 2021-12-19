package com.bytedance.boost_multidex;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
public final class BoostNative {
    private static volatile boolean alreadyInit;
    private static boolean supportFastLoadDex;

    static {
        Covode.recordClassIndex(15307);
        Monitor.get().loadLibrary("boost_multidex");
    }

    BoostNative() {
    }

    private static void checkSupportFastLoad(Result result) {
        MethodCollector.m26663i(9650);
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class, String.class);
            int i = Build.VERSION.SDK_INT;
            String str = (String) declaredMethod.invoke(null, "persist.sys.dalvik.vm.lib", null);
            result.vmLibName = str;
            Monitor.get().logInfo("VM lib is ".concat(String.valueOf(str)));
            if ("libart.so".equals(str)) {
                Monitor.get().logWarning("VM lib is art, skip!");
                MethodCollector.m26664o(9650);
                return;
            }
            String str2 = (String) declaredMethod.invoke(null, "ro.yunos.version", null);
            if ((str2 == null || str2.isEmpty()) && !new File("/system/lib/libvmkid_lemur.so").exists()) {
                boolean initialize = initialize(Build.VERSION.SDK_INT, RuntimeException.class);
                supportFastLoadDex = initialize;
                result.supportFastLoadDex = initialize;
                MethodCollector.m26664o(9650);
                return;
            }
            result.isYunOS = true;
            Monitor.get().logWarning("Yun os is " + str2 + ", skip boost!");
            MethodCollector.m26664o(9650);
        } catch (Throwable th) {
            result.addUnFatalThrowable(th);
            Monitor.get().logWarning("Fail to init", th);
            MethodCollector.m26664o(9650);
        }
    }

    private static native boolean initialize(int i, Class<RuntimeException> cls);

    static synchronized boolean isSupportFastLoad() {
        boolean z;
        synchronized (BoostNative.class) {
            MethodCollector.m26663i(9793);
            if (!alreadyInit) {
                checkSupportFastLoad(Result.get());
                alreadyInit = true;
            }
            z = supportFastLoadDex;
            MethodCollector.m26664o(9793);
        }
        return z;
    }

    static native Object loadDirectDex(String str, byte[] bArr);

    static native boolean makeOptDexFile(String str, String str2);

    static native long obtainCheckSum(String str);

    static native void recoverAction();
}
