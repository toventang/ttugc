package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ttnet.org.chromium.base.C87445c;
import com.ttnet.org.chromium.net.C87653r;
import com.ttnet.org.chromium.net.NetworkChangeNotifier;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;

public class CronetLibraryLoader {

    /* renamed from: a */
    public static long f198694a;

    /* renamed from: b */
    public static long f198695b;

    /* renamed from: c */
    public static long f198696c;

    /* renamed from: d */
    static final /* synthetic */ boolean f198697d = true;

    /* renamed from: e */
    private static final Object f198698e = new Object();

    /* renamed from: f */
    private static final String f198699f = CronetLibraryLoader.class.getSimpleName();

    /* renamed from: g */
    private static final HandlerThread f198700g = new HandlerThread("CronetInit");

    /* renamed from: h */
    private static volatile boolean f198701h = false;

    /* renamed from: i */
    private static volatile boolean f198702i;

    /* renamed from: j */
    private static final ConditionVariable f198703j = new ConditionVariable();

    private static native void nativeCronetInitOnInitThread();

    private static native String nativeGetCronetVersion();

    private static String getDefaultUserAgent() {
        return C87644s.m152412a(C87445c.f198342a);
    }

    /* renamed from: b */
    private static boolean m152153b() {
        if (f198700g.getLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(103524);
    }

    private static void ensureInitializedFromNative() {
        MethodCollector.m26663i(10450);
        synchronized (f198698e) {
            try {
                f198701h = true;
                f198703j.open();
            } catch (Throwable th) {
                MethodCollector.m26664o(10450);
                throw th;
            }
        }
        Context context = C87445c.f198342a;
        if (f198697d || context != null) {
            m152151a(context, null);
            MethodCollector.m26664o(10450);
            return;
        }
        AssertionError assertionError = new AssertionError();
        MethodCollector.m26664o(10450);
        throw assertionError;
    }

    /* renamed from: a */
    static void m152150a() {
        MethodCollector.m26663i(10137);
        boolean z = f198697d;
        if (!z && !m152153b()) {
            AssertionError assertionError = new AssertionError();
            MethodCollector.m26664o(10137);
            throw assertionError;
        } else if (f198702i) {
            MethodCollector.m26664o(10137);
        } else {
            f198694a = System.currentTimeMillis();
            NetworkChangeNotifier.init();
            NetworkChangeNotifier.m151862a().mo141592a(true, (NetworkChangeNotifierAutoDetect.AbstractC87520f) new C87653r());
            f198703j.block();
            if (z || f198701h) {
                nativeCronetInitOnInitThread();
                f198702i = true;
                f198695b = System.currentTimeMillis();
                MethodCollector.m26664o(10137);
                return;
            }
            AssertionError assertionError2 = new AssertionError();
            MethodCollector.m26664o(10137);
            throw assertionError2;
        }
    }

    private static void setNetworkThreadPriorityOnNetworkThread(int i) {
        Process.setThreadPriority(i);
    }

    /* renamed from: a */
    public static void m152152a(Runnable runnable) {
        if (m152153b()) {
            runnable.run();
        } else {
            new Handler(f198700g.getLooper()).post(runnable);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m152151a(android.content.Context r10, com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl r11) {
        /*
        // Method dump skipped, instructions count: 341
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetLibraryLoader.m152151a(android.content.Context, com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl):void");
    }
}
