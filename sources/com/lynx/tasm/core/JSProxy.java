package com.lynx.tasm.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.jsbridge.C28357b;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.provider.CanvasProvider;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class JSProxy {

    /* renamed from: a */
    public long f67784a;

    /* renamed from: b */
    public long f67785b;

    /* renamed from: c */
    public final WeakReference<AbstractC28520j> f67786c;

    /* renamed from: d */
    public final ReadWriteLock f67787d = new ReentrantReadWriteLock();

    static {
        Covode.recordClassIndex(34840);
    }

    private native void nativeCallIntersectionObserver(long j, int i, int i2, JavaOnlyMap javaOnlyMap);

    private native long nativeCreate(long j);

    private static native void nativeCreateCanvasAsyncCallback(long j, int i, long j2);

    private native void nativeDestroy(long j);

    static native void nativeEvaluateScript(long j, String str, byte[] bArr, int i);

    public static native JSProxy nativeGetProxyById(long j);

    private static native void nativeRejectDynamicComponentLoad(long j, String str, int i, int i2, String str2);

    public native void nativeCallJSFunction(long j, String str, String str2, JavaOnlyArray javaOnlyArray);

    /* renamed from: a */
    public final void mo49857a() {
        MethodCollector.m26663i(655);
        CanvasProvider canvasProvider = LynxEnv.m56706b().f66650q;
        if (canvasProvider != null) {
            canvasProvider.onLynxRuntimeDestroy(Long.valueOf(this.f67785b));
        }
        this.f67787d.writeLock().lock();
        nativeDestroy(this.f67784a);
        this.f67784a = 0;
        this.f67787d.writeLock().unlock();
        MethodCollector.m26664o(655);
    }

    private void setRuntimeId(long j) {
        this.f67785b = j;
    }

    /* renamed from: a */
    public final C28357b mo49856a(String str) {
        return new C28357b(str, this);
    }

    public JSProxy(long j, WeakReference<AbstractC28520j> weakReference) {
        MethodCollector.m26663i(642);
        this.f67786c = weakReference;
        this.f67784a = nativeCreate(j);
        MethodCollector.m26664o(642);
    }

    private static boolean ensureHeliumLoaded(long j, boolean z) {
        CanvasProvider canvasProvider = LynxEnv.m56706b().f66650q;
        if (canvasProvider == null || !canvasProvider.autoLoadNativeCanvasProvider(z)) {
            return false;
        }
        canvasProvider.onEnsureHeliumLoaded(new Long(j));
        return true;
    }

    /* renamed from: a */
    public final void mo49859a(int i, long j) {
        MethodCollector.m26663i(691);
        this.f67787d.readLock().lock();
        long j2 = this.f67784a;
        if (j2 != 0) {
            nativeCreateCanvasAsyncCallback(j2, i, j);
        }
        this.f67787d.readLock().unlock();
        MethodCollector.m26664o(691);
    }

    /* renamed from: a */
    public final void mo49858a(int i, int i2, JavaOnlyMap javaOnlyMap) {
        MethodCollector.m26663i(664);
        this.f67787d.readLock().lock();
        long j = this.f67784a;
        if (j != 0) {
            nativeCallIntersectionObserver(j, i, i2, javaOnlyMap);
        }
        this.f67787d.readLock().unlock();
        MethodCollector.m26664o(664);
    }

    private static long createCanvas(String str, long j, boolean z, int i) {
        MethodCollector.m26663i(686);
        JSProxy nativeGetProxyById = nativeGetProxyById(j);
        if (nativeGetProxyById == null) {
            MethodCollector.m26664o(686);
            return 0;
        }
        CanvasProvider canvasProvider = LynxEnv.m56706b().f66650q;
        if (canvasProvider != null) {
            long createCanvasOnJSThread = canvasProvider.createCanvasOnJSThread(str, new Long(j), z, nativeGetProxyById, i);
            MethodCollector.m26664o(686);
            return createCanvasOnJSThread;
        }
        MethodCollector.m26664o(686);
        return 0;
    }

    /* renamed from: a */
    public final void mo49860a(String str, int i, int i2, String str2) {
        MethodCollector.m26663i(668);
        this.f67787d.readLock().lock();
        long j = this.f67784a;
        if (j != 0) {
            nativeRejectDynamicComponentLoad(j, str, i, i2, str2);
        }
        this.f67787d.readLock().unlock();
        MethodCollector.m26664o(668);
    }
}
