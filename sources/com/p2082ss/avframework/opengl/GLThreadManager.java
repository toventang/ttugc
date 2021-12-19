package com.p2082ss.avframework.opengl;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.GLES10;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.engine.MediaEngineFactory;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.ThreadUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.avframework.opengl.GLThreadManager */
public class GLThreadManager {
    private static boolean sForceFinish = true;
    private static GLThreadManager sGLThreadManager;
    private static int sGLVersion = 2;
    public static String sGPUGLVersion = "";
    public static String sGPURender = "";
    public static String sGPUVendor = "";
    public static boolean sNeedFinish;
    public EGLContext mEGLContext;
    public int[] mEGLVersion = {0, 0};
    private ArrayList<String> mGlFinishDeviceList;
    public Handler mHandler;
    private AtomicInteger mInteger = new AtomicInteger(1);

    private static native boolean nativeIsEnableGlobalGlContextMutex();

    private static native void nativeLockGlShareContext();

    private static native void nativeSetEnableGlobalGlContextMutex(boolean z);

    public static native void nativeSetupOpenGlRecycler();

    private static native void nativeUnLockGlShareContext();

    public static int getConfigGLVersion() {
        return sGLVersion;
    }

    public static String getGPUGLVersoin() {
        return sGPUGLVersion;
    }

    public static String getGPURender() {
        return sGPURender;
    }

    public static String getGPUVendor() {
        return sGPUVendor;
    }

    public static boolean isEnableForceGLFinish() {
        return sForceFinish;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        super.finalize();
    }

    public static EGLContext getEGLContext() {
        return get().mEGLContext;
    }

    public static int[] getEGLVersion() {
        return get().mEGLVersion;
    }

    public static Handler getMainGlHandle() {
        return get().mHandler;
    }

    public static GLThreadManager get() {
        return get(null, getConfigGLVersion());
    }

    public static long getNativeEGLContext() {
        return toNativeEGLContext(getEGLContext());
    }

    public static boolean isEnableGlobalGlContextMutex() {
        MethodCollector.m26663i(1779);
        boolean nativeIsEnableGlobalGlContextMutex = nativeIsEnableGlobalGlContextMutex();
        MethodCollector.m26664o(1779);
        return nativeIsEnableGlobalGlContextMutex;
    }

    public static boolean isNeedFinish() {
        if (sForceFinish || sNeedFinish) {
            return true;
        }
        return false;
    }

    public static void lockSharedGLContext() {
        MethodCollector.m26663i(1712);
        nativeLockGlShareContext();
        MethodCollector.m26664o(1712);
    }

    public static void unlockSharedGLContext() {
        MethodCollector.m26663i(1714);
        nativeUnLockGlShareContext();
        MethodCollector.m26664o(1714);
    }

    public void fillGPUDescription() {
        this.mHandler.post(new Runnable() {
            /* class com.p2082ss.avframework.opengl.GLThreadManager.RunnableC860312 */

            static {
                Covode.recordClassIndex(100660);
            }

            public void run() {
                try {
                    GLThreadManager.sGPUGLVersion = GLES10.glGetString(7938);
                    GLThreadManager.sGPURender = GLES10.glGetString(7937);
                    GLThreadManager.sGPUVendor = GLES10.glGetString(7936);
                    GLThreadManager.sNeedFinish = GLThreadManager.this.isContainVendoOnBlackList(GLThreadManager.sGPURender);
                } catch (Throwable th) {
                    AVLog.ioe("GLThreadManager", th.getMessage(), th);
                }
                AVLog.ioi("GLThreadManager", "GPU version: " + GLThreadManager.sGPUGLVersion);
                AVLog.ioi("GLThreadManager", "GPU Render: " + GLThreadManager.sGPURender);
                AVLog.ioi("GLThreadManager", "GPU Vendor: " + GLThreadManager.sGPUVendor);
                AVLog.ioi("GLThreadManager", "GPU render with finish: " + GLThreadManager.isNeedFinish());
                AVLog.ioi("GLThreadManager", "GPU render with global mutex: " + GLThreadManager.isEnableGlobalGlContextMutex());
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.opengl.GLThreadManager$MainGlThread */
    public class MainGlThread extends HandlerThread {
        static {
            Covode.recordClassIndex(100661);
        }

        public Handler getHandler() {
            Looper looper = getLooper();
            if (GLThreadManager.this.mHandler == null && looper != null) {
                GLThreadManager.this.mHandler = new Handler(looper);
            }
            return GLThreadManager.this.mHandler;
        }

        public void run() {
            MethodCollector.m26663i(1172);
            AVLog.ioi("GLThreadManager", "thread " + getName() + " is runing...");
            super.run();
            GlUtil.nativeDetachThreadToOpenGl();
            AVLog.ioi("GLThreadManager", "thread " + getName() + " is exit.");
            GLTracer.removeTraceStack();
            MethodCollector.m26664o(1172);
        }

        public MainGlThread(String str) {
            super(str);
            GLTracer.traceStack(this);
        }
    }

    static {
        Covode.recordClassIndex(100658);
    }

    public static synchronized void dispose() {
        synchronized (GLThreadManager.class) {
            MethodCollector.m26663i(1861);
            AVLog.iow("GLThreadManager", "GLThreadManager dispose");
            GLThreadManager gLThreadManager = sGLThreadManager;
            if (gLThreadManager != null) {
                gLThreadManager.decrementRef();
            }
            MethodCollector.m26664o(1861);
        }
    }

    private void initNeedGlFinishDeviceList() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.mGlFinishDeviceList = arrayList;
        arrayList.add("Adreno (TM) 506");
        this.mGlFinishDeviceList.add("Mali-T860");
    }

    public void addRef() {
        AVLog.iow("GLThreadManager", "addRef ".concat(String.valueOf(this.mInteger.incrementAndGet())));
    }

    public void decrementRef() {
        Looper looper;
        int decrementAndGet = this.mInteger.decrementAndGet();
        if (decrementAndGet <= 0) {
            AVLog.iow("GLThreadManager", "Release GLManager ...");
            Handler handler = this.mHandler;
            if (!(handler == null || (looper = handler.getLooper()) == null)) {
                sGLThreadManager = null;
                int i = Build.VERSION.SDK_INT;
                looper.quitSafely();
            }
        }
        AVLog.iow("GLThreadManager", "decrementRef ".concat(String.valueOf(decrementAndGet)));
    }

    public static void enableForceGLFinish(boolean z) {
        sForceFinish = z;
    }

    public static void setGLVersion(int i) {
        sGLVersion = i;
    }

    public static synchronized void addRefWithEnableAutoGlRecycler(boolean z) {
        synchronized (GLThreadManager.class) {
            MethodCollector.m26663i(1923);
            AVLog.iow("GLThreadManager", "GLThreadManager start by livecoreImpl initialization");
            GLThreadManager gLThreadManager = sGLThreadManager;
            if (gLThreadManager != null) {
                gLThreadManager.addRef();
            }
            MethodCollector.m26664o(1923);
        }
    }

    public static long toNativeEGLContext(EGLContext eGLContext) {
        if (eGLContext == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            return eGLContext.getNativeHandle();
        }
        int i = Build.VERSION.SDK_INT;
        return (long) eGLContext.getHandle();
    }

    public static void enableGlobalGlContextMutex(boolean z) {
        MethodCollector.m26663i(1776);
        nativeSetEnableGlobalGlContextMutex(z);
        AVLog.iod("GLThreadManager", "Using global mutex " + isEnableGlobalGlContextMutex());
        MethodCollector.m26664o(1776);
    }

    public boolean isContainVendoOnBlackList(String str) {
        ArrayList<String> arrayList = this.mGlFinishDeviceList;
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        Iterator<String> it = this.mGlFinishDeviceList.iterator();
        while (it.hasNext()) {
            if (it.next().equals(str)) {
                return true;
            }
        }
        return false;
    }

    private GLThreadManager(EGLContext eGLContext, int i) {
        MediaEngineFactory.loadLibrary();
        initNeedGlFinishDeviceList();
        setupSharedOpenGlContext(eGLContext, i);
    }

    public static GLThreadManager get(EGLContext eGLContext, int i) {
        MethodCollector.m26663i(1838);
        if (sGLThreadManager == null) {
            synchronized (GLThreadManager.class) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (sGLThreadManager == null) {
                        sGLThreadManager = new GLThreadManager(eGLContext, i);
                    } else if (eGLContext != null) {
                        AVLog.iow("GLThreadManager", "OpenGl env already init and ignore shared context");
                    }
                    AVLog.ioi("GLThreadManager", "Create GLThreadManager cost time " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                } catch (Throwable th) {
                    MethodCollector.m26664o(1838);
                    throw th;
                }
            }
        }
        GLThreadManager gLThreadManager = sGLThreadManager;
        MethodCollector.m26664o(1838);
        return gLThreadManager;
    }

    private void setupSharedOpenGlContext(EGLContext eGLContext, final int i) {
        final int[] iArr = {0};
        MainGlThread mainGlThread = new MainGlThread("OpenGlMgrThread");
        mainGlThread.start();
        Handler handler = mainGlThread.getHandler();
        this.mHandler = handler;
        if (handler != null) {
            final long nativeEGLContext = toNativeEGLContext(eGLContext);
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() {
                /* class com.p2082ss.avframework.opengl.GLThreadManager.RunnableC860301 */

                static {
                    Covode.recordClassIndex(100659);
                }

                public void run() {
                    MethodCollector.m26663i(2411);
                    AVLog.ioi("GLThreadManager", "Init GLThreadManager with context " + nativeEGLContext + " version " + i);
                    iArr[0] = GlUtil.nativeAttachThreadToOpenGl(nativeEGLContext, i, 0);
                    int i = Build.VERSION.SDK_INT;
                    GLThreadManager.this.mEGLContext = EGL14.eglGetCurrentContext();
                    int[] iArr = {0, 0};
                    if (GLThreadManager.this.mEGLContext != null) {
                        EGL14.eglQueryContext(EGL14.eglGetCurrentDisplay(), GLThreadManager.this.mEGLContext, 12440, iArr, 0);
                        GLThreadManager.this.mEGLVersion = iArr;
                        GLThreadManager.nativeSetupOpenGlRecycler();
                        GLThreadManager.this.fillGPUDescription();
                    }
                    MethodCollector.m26664o(2411);
                }
            });
            AVLog.ioi("GLThreadManager", "EGLClient version " + (this.mEGLVersion[0] + "." + this.mEGLVersion[1]) + " result:" + iArr[0]);
            return;
        }
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG! not found handler");
        AVLog.ioe("GLThreadManager", androidRuntimeException.getMessage(), androidRuntimeException);
        throw androidRuntimeException;
    }
}
