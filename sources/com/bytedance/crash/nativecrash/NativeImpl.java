package com.bytedance.crash.nativecrash;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.util.C14041aa;
import com.bytedance.crash.util.C14069r;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;

public class NativeImpl {

    /* renamed from: a */
    public static volatile boolean f33976a;

    /* renamed from: b */
    public static long f33977b = 100;

    /* renamed from: c */
    public static boolean f33978c;

    /* renamed from: d */
    private static volatile boolean f33979d;

    /* renamed from: e */
    private static String f33980e;

    private static native boolean doCheckNativeCrash();

    public static native int doCreateCallbackThread();

    static native void doDelayCheck();

    static native String doGetCrashHeader(String str);

    public static native long doGetNpthCatchAddr();

    static native void doRebuildTombstone(String str, String str2, String str3);

    public static native void doSetAlogFlushAddr(long j);

    public static native void doSetLocalCoreInfo(int i);

    private static native void doSetMallocInfoFunctionAddress(long j);

    private static native void doSetNativeCallbackAddr(long j);

    public static native void doSetOnlineCoreInfo(int i);

    private static native void doSetUploadEnd();

    private static native int doStartNativeCrashMonitor(int i, String str, String str2, String str3);

    static {
        Covode.recordClassIndex(16008);
    }

    /* renamed from: b */
    public static boolean m25248b() {
        MethodCollector.m26663i(2391);
        if (!f33976a) {
            MethodCollector.m26664o(2391);
            return false;
        }
        try {
            boolean doCheckNativeCrash = doCheckNativeCrash();
            MethodCollector.m26664o(2391);
            return doCheckNativeCrash;
        } catch (Throwable unused) {
            MethodCollector.m26664o(2391);
            return false;
        }
    }

    /* renamed from: c */
    public static void m25249c() {
        MethodCollector.m26663i(2396);
        if (!f33976a) {
            MethodCollector.m26664o(2396);
            return;
        }
        doSetUploadEnd();
        MethodCollector.m26664o(2396);
    }

    /* renamed from: a */
    public static boolean m25245a() {
        if (f33979d) {
            return f33976a;
        }
        f33979d = true;
        if (!f33976a) {
            boolean a = C14041aa.m25486a("npth");
            f33976a = a;
            if (a) {
                f33976a = C14041aa.m25486a("npth_tools");
            }
        }
        return f33976a;
    }

    private static void handleNativeCrash(String str) {
        NativeCrashCollector.onNativeCrash(str);
    }

    /* renamed from: b */
    public static String m25247b(Context context) {
        String str = f33980e;
        if (str != null) {
            return str;
        }
        if (new File(context.getApplicationInfo().nativeLibraryDir, "libnpth_dumper.so").exists()) {
            f33980e = context.getApplicationInfo().nativeLibraryDir;
        } else {
            f33980e = C13962f.m25278a();
            f33978c = true;
            C13962f.m25280a("npth_dumper", "3.1.6-rc.13-ttp");
        }
        return f33980e;
    }

    /* renamed from: a */
    public static boolean m25246a(Context context) {
        MethodCollector.m26663i(2289);
        if (m25245a()) {
            try {
                doStartNativeCrashMonitor(Build.VERSION.SDK_INT, m25247b(context), C14069r.m25642j(context) + "/npth", C13933m.m25229e());
            } catch (Throwable unused) {
                MethodCollector.m26664o(2289);
                return false;
            }
        }
        MethodCollector.m26664o(2289);
        return true;
    }
}
