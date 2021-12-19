package com.ttnet.org.chromium.base.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

public class PostTask {

    /* renamed from: a */
    static final Object f198405a = new Object();

    /* renamed from: b */
    static Set<AbstractC87494n> f198406b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    static final AbstractC87493m[] f198407c;

    /* renamed from: d */
    static final /* synthetic */ boolean f198408d = true;

    /* renamed from: e */
    private static final Executor f198409e = new C87484f();

    /* renamed from: f */
    private static Executor f198410f;

    static native void nativePostDelayedTask(boolean z, int i, boolean z2, boolean z3, byte b, byte[] bArr, Runnable runnable, long j);

    /* renamed from: a */
    static Executor m151819a() {
        MethodCollector.m26663i(8307);
        synchronized (f198405a) {
            try {
                Executor executor = f198410f;
                if (executor != null) {
                    return executor;
                }
                Executor executor2 = f198409e;
                MethodCollector.m26664o(8307);
                return executor2;
            } finally {
                MethodCollector.m26664o(8307);
            }
        }
    }

    private static void onNativeSchedulerShutdown() {
        MethodCollector.m26663i(8309);
        synchronized (f198405a) {
            try {
                f198406b = Collections.newSetFromMap(new WeakHashMap());
            } finally {
                MethodCollector.m26664o(8309);
            }
        }
    }

    static {
        Covode.recordClassIndex(103419);
        AbstractC87493m[] mVarArr = new AbstractC87493m[5];
        mVarArr[0] = new C87487h();
        f198407c = mVarArr;
    }

    private static void onNativeSchedulerReady() {
        MethodCollector.m26663i(8308);
        synchronized (f198405a) {
            try {
                Set<AbstractC87494n> set = f198406b;
                f198406b = null;
                for (AbstractC87494n nVar : set) {
                    nVar.mo141541c();
                }
            } finally {
                MethodCollector.m26664o(8308);
            }
        }
    }
}
