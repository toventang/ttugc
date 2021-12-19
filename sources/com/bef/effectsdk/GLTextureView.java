package com.bef.effectsdk;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    public static final GLThreadManager sGLThreadManager = new GLThreadManager(null);
    public int mDebugFlags;
    private boolean mDetached;
    public EGLConfigChooser mEGLConfigChooser;
    public int mEGLContextClientVersion;
    public EGLContextFactory mEGLContextFactory;
    public EGLWindowSurfaceFactory mEGLWindowSurfaceFactory;
    private GLThread mGLThread;
    public GLWrapper mGLWrapper;
    public boolean mPreserveEGLContextOnPause;
    SurfaceTexture mPrevSurfaceTexture;
    public GLSurfaceView.Renderer mRenderer;
    private final WeakReference<GLTextureView> mThisWeakRef = new WeakReference<>(this);

    /* renamed from: com.bef.effectsdk.GLTextureView$1 */
    static /* synthetic */ class C23841 {
        static {
            Covode.recordClassIndex(2673);
        }
    }

    public interface EGLConfigChooser {
        static {
            Covode.recordClassIndex(2678);
        }

        EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    public interface EGLContextFactory {
        static {
            Covode.recordClassIndex(2679);
        }

        EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    public interface EGLWindowSurfaceFactory {
        static {
            Covode.recordClassIndex(2680);
        }

        EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    public interface GLWrapper {
        static {
            Covode.recordClassIndex(2684);
        }

        GL wrap(GL gl);
    }

    /* renamed from: com_bef_effectsdk_GLTextureView_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m7235xc3c061f(String str, String str2) {
        return 0;
    }

    static class DefaultWindowSurfaceFactory implements EGLWindowSurfaceFactory {
        static {
            Covode.recordClassIndex(2677);
        }

        /* renamed from: com_bef_effectsdk_GLTextureView$DefaultWindowSurfaceFactory_com_ss_android_ugc_aweme_lancet_LogLancet_e */
        public static int m7239x3495156a(String str, String str2, Throwable th) {
            return 0;
        }

        private DefaultWindowSurfaceFactory() {
        }

        /* synthetic */ DefaultWindowSurfaceFactory(C23841 r1) {
            this();
        }

        @Override // com.bef.effectsdk.GLTextureView.EGLWindowSurfaceFactory
        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }

        @Override // com.bef.effectsdk.GLTextureView.EGLWindowSurfaceFactory
        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            EGLSurface eGLSurface = null;
            try {
                eGLSurface = egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
                return eGLSurface;
            } catch (IllegalArgumentException e) {
                m7239x3495156a("GLTextureView", "eglCreateWindowSurface", e);
                return eGLSurface;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class GLThreadManager {
        private static String TAG = "GLThreadManager";
        private GLThread mEglOwner;
        private boolean mGLESDriverCheckComplete;
        private int mGLESVersion;
        private boolean mGLESVersionCheckComplete;
        private boolean mLimitedGLESContexts;
        private boolean mMultipleGLESContextsAllowed;

        /* renamed from: com_bef_effectsdk_GLTextureView$GLThreadManager_com_ss_android_ugc_aweme_lancet_LogLancet_i */
        public static int m7244x696831de(String str, String str2) {
            return 0;
        }

        /* renamed from: com_bef_effectsdk_GLTextureView$GLThreadManager_com_ss_android_ugc_aweme_lancet_LogLancet_w */
        public static int m7245x696831ec(String str, String str2) {
            return 0;
        }

        private GLThreadManager() {
        }

        static {
            Covode.recordClassIndex(2683);
        }

        public synchronized boolean shouldReleaseEGLContextWhenPausing() {
            boolean z;
            MethodCollector.m26663i(3890);
            z = this.mLimitedGLESContexts;
            MethodCollector.m26664o(3890);
            return z;
        }

        public synchronized boolean shouldTerminateEGLWhenPausing() {
            MethodCollector.m26663i(3900);
            checkGLESVersion();
            if (!this.mMultipleGLESContextsAllowed) {
                MethodCollector.m26664o(3900);
                return true;
            }
            MethodCollector.m26664o(3900);
            return false;
        }

        private void checkGLESVersion() {
            if (!this.mGLESVersionCheckComplete) {
                this.mMultipleGLESContextsAllowed = true;
                m7245x696831ec(TAG, "checkGLESVersion mGLESVersion = " + this.mGLESVersion + " mMultipleGLESContextsAllowed = " + this.mMultipleGLESContextsAllowed);
                this.mGLESVersionCheckComplete = true;
            }
        }

        /* synthetic */ GLThreadManager(C23841 r1) {
            this();
        }

        public void releaseEglContextLocked(GLThread gLThread) {
            if (this.mEglOwner == gLThread) {
                this.mEglOwner = null;
            }
            notifyAll();
        }

        public boolean tryAcquireEglContextLocked(GLThread gLThread) {
            GLThread gLThread2 = this.mEglOwner;
            if (gLThread2 == gLThread || gLThread2 == null) {
                this.mEglOwner = gLThread;
                notifyAll();
                return true;
            }
            checkGLESVersion();
            if (this.mMultipleGLESContextsAllowed) {
                return true;
            }
            GLThread gLThread3 = this.mEglOwner;
            if (gLThread3 == null) {
                return false;
            }
            gLThread3.requestReleaseEglContextLocked();
            return false;
        }

        public synchronized void threadExiting(GLThread gLThread) {
            MethodCollector.m26663i(3880);
            m7244x696831de("GLThread", "exiting tid=" + gLThread.getId());
            gLThread.mExited = true;
            if (this.mEglOwner == gLThread) {
                this.mEglOwner = null;
            }
            notifyAll();
            MethodCollector.m26664o(3880);
        }

        public synchronized void checkGLDriver(GL10 gl10) {
            boolean z;
            MethodCollector.m26663i(3913);
            if (!this.mGLESDriverCheckComplete) {
                checkGLESVersion();
                String glGetString = gl10.glGetString(7937);
                boolean z2 = false;
                if (this.mGLESVersion < 131072) {
                    if (!glGetString.startsWith("Q3Dimension MSM7500 ")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.mMultipleGLESContextsAllowed = z;
                    notifyAll();
                }
                if (!this.mMultipleGLESContextsAllowed) {
                    z2 = true;
                }
                this.mLimitedGLESContexts = z2;
                m7245x696831ec(TAG, "checkGLDriver renderer = \"" + glGetString + "\" multipleContextsAllowed = " + this.mMultipleGLESContextsAllowed + " mLimitedGLESContexts = " + this.mLimitedGLESContexts);
                this.mGLESDriverCheckComplete = true;
            }
            MethodCollector.m26664o(3913);
        }
    }

    /* access modifiers changed from: package-private */
    public static class LogWriter extends Writer {
        private StringBuilder mBuilder = new StringBuilder();

        static {
            Covode.recordClassIndex(2685);
        }

        /* renamed from: com_bef_effectsdk_GLTextureView$LogWriter_com_ss_android_ugc_aweme_lancet_LogLancet_v */
        public static int m7246xdd007d04(String str, String str2) {
            return 0;
        }

        @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
        public void close() {
            flushBuilder();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            flushBuilder();
        }

        LogWriter() {
        }

        private void flushBuilder() {
            if (this.mBuilder.length() > 0) {
                m7246xdd007d04("GLSurfaceView", this.mBuilder.toString());
                StringBuilder sb = this.mBuilder;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    flushBuilder();
                } else {
                    this.mBuilder.append(c);
                }
            }
        }
    }

    private void init() {
        setSurfaceTextureListener(this);
    }

    public int getDebugFlags() {
        return this.mDebugFlags;
    }

    public int getEGLContextClientVersion() {
        return this.mEGLContextClientVersion;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.mPreserveEGLContextOnPause;
    }

    public int getRenderMode() {
        return this.mGLThread.getRenderMode();
    }

    public void onDestroy() {
        SurfaceTexture surfaceTexture = this.mPrevSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    public void onPause() {
        this.mGLThread.onPause();
    }

    public void requestRender() {
        this.mGLThread.requestRender();
    }

    /* access modifiers changed from: package-private */
    public static class GLThread extends Thread {
        private EglHelper mEglHelper;
        private ArrayList<Runnable> mEventQueue = new ArrayList<>();
        public boolean mExited;
        private boolean mFinishedCreatingEglSurface;
        private WeakReference<GLTextureView> mGLTextureViewWeakRef;
        private boolean mHasSurface;
        private boolean mHaveEglContext;
        private boolean mHaveEglSurface;
        private int mHeight = 0;
        private boolean mPaused;
        private boolean mRenderComplete;
        private int mRenderMode = 1;
        private boolean mRequestPaused;
        private boolean mRequestRender = true;
        private boolean mShouldExit;
        private boolean mShouldReleaseEglContext;
        private boolean mSizeChanged = true;
        private boolean mSurfaceIsBad;
        private boolean mWaitingForSurface;
        private int mWidth = 0;

        static {
            Covode.recordClassIndex(2682);
        }

        /* renamed from: com_bef_effectsdk_GLTextureView$GLThread_com_ss_android_ugc_aweme_lancet_LogLancet_i */
        public static int m7242x23adf661(String str, String str2) {
            return 0;
        }

        /* renamed from: com_bef_effectsdk_GLTextureView$GLThread_com_ss_android_ugc_aweme_lancet_LogLancet_w */
        public static int m7243x23adf66f(String str, String str2) {
            return 0;
        }

        private void stopEglSurfaceLocked() {
            if (this.mHaveEglSurface) {
                this.mHaveEglSurface = false;
                this.mEglHelper.destroySurface();
            }
        }

        public void requestReleaseEglContextLocked() {
            this.mShouldReleaseEglContext = true;
            GLTextureView.sGLThreadManager.notifyAll();
        }

        private boolean readyToDraw() {
            if (this.mPaused || !this.mHasSurface || this.mSurfaceIsBad || this.mWidth <= 0 || this.mHeight <= 0) {
                return false;
            }
            if (this.mRequestRender || this.mRenderMode == 1) {
                return true;
            }
            return false;
        }

        private void stopEglContextLocked() {
            if (this.mHaveEglContext) {
                this.mEglHelper.finish();
                this.mHaveEglContext = false;
                GLTextureView.sGLThreadManager.releaseEglContextLocked(this);
            }
        }

        public boolean ableToDraw() {
            if (!this.mHaveEglContext || !this.mHaveEglSurface || !readyToDraw()) {
                return false;
            }
            return true;
        }

        public int getRenderMode() {
            int i;
            MethodCollector.m26663i(8677);
            synchronized (GLTextureView.sGLThreadManager) {
                try {
                    i = this.mRenderMode;
                } finally {
                    MethodCollector.m26664o(8677);
                }
            }
            return i;
        }

        public void requestRender() {
            MethodCollector.m26663i(8678);
            synchronized (GLTextureView.sGLThreadManager) {
                try {
                    this.mRequestRender = true;
                    GLTextureView.sGLThreadManager.notifyAll();
                } finally {
                    MethodCollector.m26664o(8678);
                }
            }
        }

        public void requestExitAndWait() {
            MethodCollector.m26663i(9441);
            synchronized (GLTextureView.sGLThreadManager) {
                try {
                    this.mShouldExit = true;
                    GLTextureView.sGLThreadManager.notifyAll();
                    while (!this.mExited) {
                        try {
                            GLTextureView.sGLThreadManager.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } finally {
                    MethodCollector.m26664o(9441);
                }
            }
        }

        public void run() {
            setName("GLThread " + getId());
            m7242x23adf661("GLThread", "starting tid=" + getId());
            try {
                guardedRun();
            } catch (InterruptedException | RuntimeException unused) {
            } catch (Throwable th) {
                GLTextureView.sGLThreadManager.threadExiting(this);
                throw th;
            }
            GLTextureView.sGLThreadManager.threadExiting(this);
        }

        public void onPause() {
            MethodCollector.m26663i(8982);
            synchronized (GLTextureView.sGLThreadManager) {
                try {
                    m7242x23adf661("GLThread", "onPause tid=" + getId());
                    this.mRequestPaused = true;
                    GLTextureView.sGLThreadManager.notifyAll();
                    while (!this.mExited && !this.mPaused) {
                        m7242x23adf661("Main thread", "onPause waiting for mPaused.");
                        try {
                            GLTextureView.sGLThreadManager.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } finally {
                    MethodCollector.m26664o(8982);
                }
            }
        }

        public void onResume() {
            MethodCollector.m26663i(9135);
            synchronized (GLTextureView.sGLThreadManager) {
                try {
                    m7242x23adf661("GLThread", "onResume tid=" + getId());
                    this.mRequestPaused = false;
                    this.mRequestRender = true;
                    this.mRenderComplete = false;
                    GLTextureView.sGLThreadManager.notifyAll();
                    while (!this.mExited && this.mPaused && !this.mRenderComplete) {
                        m7242x23adf661("Main thread", "onResume waiting for !mPaused.");
                        try {
                            GLTextureView.sGLThreadManager.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } finally {
                    MethodCollector.m26664o(9135);
                }
            }
        }

        public void surfaceCreated() {
            MethodCollector.m26663i(8833);
            synchronized (GLTextureView.sGLThreadManager) {
                try {
                    m7242x23adf661("GLThread", "surfaceCreated tid=" + getId());
                    this.mHasSurface = true;
                    this.mFinishedCreatingEglSurface = false;
                    GLTextureView.sGLThreadManager.notifyAll();
                    while (this.mWaitingForSurface && !this.mFinishedCreatingEglSurface && !this.mExited) {
                        try {
                            GLTextureView.sGLThreadManager.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } finally {
                    MethodCollector.m26664o(8833);
                }
            }
        }

        public void surfaceDestroyed() {
            MethodCollector.m26663i(8835);
            synchronized (GLTextureView.sGLThreadManager) {
                try {
                    m7242x23adf661("GLThread", "surfaceDestroyed tid=" + getId());
                    this.mHasSurface = false;
                    GLTextureView.sGLThreadManager.notifyAll();
                    while (!this.mWaitingForSurface && !this.mExited) {
                        try {
                            GLTextureView.sGLThreadManager.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } finally {
                    MethodCollector.m26664o(8835);
                }
            }
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x02e5, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x02e6, code lost:
            r1 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x02e9, code lost:
            r17 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x02eb, code lost:
            if (r16 == false) goto L_0x02fc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x02ed, code lost:
            r2 = (javax.microedition.khronos.opengles.GL10) r5.mEglHelper.createGL();
            com.bef.effectsdk.GLTextureView.sGLThreadManager.checkGLDriver(r2);
            r16 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x02fc, code lost:
            if (r18 == false) goto L_0x031a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x02fe, code lost:
            m7243x23adf66f("GLThread", "onSurfaceCreated");
            r0 = r5.mGLTextureViewWeakRef.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x030d, code lost:
            if (r0 == null) goto L_0x0318;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x030f, code lost:
            r0.mRenderer.onSurfaceCreated(r2, r5.mEglHelper.mEglConfig);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x0318, code lost:
            r18 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x031a, code lost:
            if (r6 == null) goto L_0x031e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x031e, code lost:
            if (r14 == false) goto L_0x0354;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x0320, code lost:
            m7243x23adf66f("GLThread", "onSurfaceChanged(" + r4 + ", " + r3 + ")");
            r0 = r5.mGLTextureViewWeakRef.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x034c, code lost:
            if (r0 == null) goto L_0x0353;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x034e, code lost:
            r0.mRenderer.onSurfaceChanged(r2, r4, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x0353, code lost:
            r14 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
            m7243x23adf66f("GLThread", "onDrawFrame tid=" + getId());
            r0 = r5.mGLTextureViewWeakRef.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x0376, code lost:
            if (r0 == null) goto L_0x037d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x0378, code lost:
            r0.mRenderer.onDrawFrame(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x037d, code lost:
            r7 = r5.mEglHelper.swap();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x0385, code lost:
            if (r7 == 12288) goto L_0x03b9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x0389, code lost:
            if (r7 == 12302) goto L_0x039f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x038b, code lost:
            com.bef.effectsdk.GLTextureView.EglHelper.logEglErrorAsWarning("GLThread", "eglSwapBuffers", r7);
            r7 = com.bef.effectsdk.GLTextureView.sGLThreadManager;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:0x0394, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
            r5.mSurfaceIsBad = true;
            com.bef.effectsdk.GLTextureView.sGLThreadManager.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x039d, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x039f, code lost:
            m7242x23adf661("GLThread", "egl context lost tid=" + getId());
            r15 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x03b9, code lost:
            if (r13 == false) goto L_0x03bc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x03bb, code lost:
            r12 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x03bc, code lost:
            r1 = 0;
            r5 = r19;
            r17 = false;
            r18 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:0x03e5, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:151:0x03e7, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(7056);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x03ec, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x03ed, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x03ef, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(7056);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x03f4, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x03f5, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x03f7, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(7056);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x03fc, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x03fd, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x02ba, code lost:
            if (r17 == false) goto L_0x02eb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x02bc, code lost:
            m7243x23adf66f("GLThread", "egl createSurface");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x02c9, code lost:
            if (r5.mEglHelper.createSurface() == false) goto L_0x02d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x02cb, code lost:
            r7 = com.bef.effectsdk.GLTextureView.sGLThreadManager;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x02cd, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
            r5.mFinishedCreatingEglSurface = true;
            com.bef.effectsdk.GLTextureView.sGLThreadManager.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x02d6, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x02d8, code lost:
            r7 = com.bef.effectsdk.GLTextureView.sGLThreadManager;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x02da, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
            r5.mFinishedCreatingEglSurface = true;
            r5.mSurfaceIsBad = true;
            com.bef.effectsdk.GLTextureView.sGLThreadManager.notifyAll();
         */
        /* JADX WARNING: Removed duplicated region for block: B:178:0x0421 A[SYNTHETIC, Splitter:B:178:0x0421] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void guardedRun() {
            /*
            // Method dump skipped, instructions count: 1078
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.GLTextureView.GLThread.guardedRun():void");
        }

        GLThread(WeakReference<GLTextureView> weakReference) {
            this.mGLTextureViewWeakRef = weakReference;
        }

        public void queueEvent(Runnable runnable) {
            MethodCollector.m26663i(9591);
            if (runnable != null) {
                synchronized (GLTextureView.sGLThreadManager) {
                    try {
                        this.mEventQueue.add(runnable);
                        GLTextureView.sGLThreadManager.notifyAll();
                    } finally {
                        MethodCollector.m26664o(9591);
                    }
                }
                return;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("r must not be null");
            MethodCollector.m26664o(9591);
            throw illegalArgumentException;
        }

        public void setRenderMode(int i) {
            MethodCollector.m26663i(8537);
            if (i < 0 || i > 1) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("renderMode");
                MethodCollector.m26664o(8537);
                throw illegalArgumentException;
            }
            synchronized (GLTextureView.sGLThreadManager) {
                try {
                    this.mRenderMode = i;
                    GLTextureView.sGLThreadManager.notifyAll();
                } finally {
                    MethodCollector.m26664o(8537);
                }
            }
        }

        public void onWindowResize(int i, int i2) {
            MethodCollector.m26663i(9285);
            synchronized (GLTextureView.sGLThreadManager) {
                try {
                    this.mWidth = i;
                    this.mHeight = i2;
                    this.mSizeChanged = true;
                    this.mRequestRender = true;
                    this.mRenderComplete = false;
                    GLTextureView.sGLThreadManager.notifyAll();
                    while (!this.mExited && !this.mPaused && !this.mRenderComplete && ableToDraw()) {
                        m7242x23adf661("Main thread", "onWindowResize waiting for render complete from tid=" + getId());
                        try {
                            GLTextureView.sGLThreadManager.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } finally {
                    MethodCollector.m26664o(9285);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(2672);
    }

    private void checkRenderThreadState() {
        if (this.mGLThread != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        try {
            GLThread gLThread = this.mGLThread;
            if (gLThread != null) {
                gLThread.requestExitAndWait();
            }
        } finally {
            super.finalize();
        }
    }

    /* access modifiers changed from: package-private */
    public static class EglHelper {
        EGL10 mEgl;
        EGLConfig mEglConfig;
        EGLContext mEglContext;
        EGLDisplay mEglDisplay;
        EGLSurface mEglSurface;
        private WeakReference<GLTextureView> mGLTextureViewWeakRef;

        static {
            Covode.recordClassIndex(2681);
        }

        /* renamed from: com_bef_effectsdk_GLTextureView$EglHelper_com_ss_android_ugc_aweme_lancet_LogLancet_e */
        public static int m7240x97e222f4(String str, String str2) {
            return 0;
        }

        /* renamed from: com_bef_effectsdk_GLTextureView$EglHelper_com_ss_android_ugc_aweme_lancet_LogLancet_w */
        public static int m7241x97e22306(String str, String str2) {
            return 0;
        }

        public void destroySurface() {
            m7241x97e22306("EglHelper", "destroySurface()  tid=" + Thread.currentThread().getId());
            destroySurfaceImp();
        }

        public int swap() {
            if (!this.mEgl.eglSwapBuffers(this.mEglDisplay, this.mEglSurface)) {
                return this.mEgl.eglGetError();
            }
            return 12288;
        }

        private void destroySurfaceImp() {
            EGLSurface eGLSurface = this.mEglSurface;
            if (eGLSurface != null && eGLSurface != EGL10.EGL_NO_SURFACE) {
                EGL10 egl10 = this.mEgl;
                EGLDisplay eGLDisplay = this.mEglDisplay;
                EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
                GLTextureView gLTextureView = this.mGLTextureViewWeakRef.get();
                if (gLTextureView != null) {
                    gLTextureView.mEGLWindowSurfaceFactory.destroySurface(this.mEgl, this.mEglDisplay, this.mEglSurface);
                }
                this.mEglSurface = null;
            }
        }

        /* access modifiers changed from: package-private */
        public GL createGL() {
            GL gl = this.mEglContext.getGL();
            GLTextureView gLTextureView = this.mGLTextureViewWeakRef.get();
            if (gLTextureView == null) {
                return gl;
            }
            if (gLTextureView.mGLWrapper != null) {
                gl = gLTextureView.mGLWrapper.wrap(gl);
            }
            if ((gLTextureView.mDebugFlags & 3) == 0) {
                return gl;
            }
            int i = 0;
            LogWriter logWriter = null;
            if ((gLTextureView.mDebugFlags & 1) != 0) {
                i = 1;
            }
            if ((gLTextureView.mDebugFlags & 2) != 0) {
                logWriter = new LogWriter();
            }
            return GLDebugHelper.wrap(gl, i, logWriter);
        }

        public void finish() {
            m7241x97e22306("EglHelper", "finish() tid=" + Thread.currentThread().getId());
            if (this.mEglContext != null) {
                GLTextureView gLTextureView = this.mGLTextureViewWeakRef.get();
                if (gLTextureView != null) {
                    gLTextureView.mEGLContextFactory.destroyContext(this.mEgl, this.mEglDisplay, this.mEglContext);
                }
                this.mEglContext = null;
            }
            EGLDisplay eGLDisplay = this.mEglDisplay;
            if (eGLDisplay != null) {
                this.mEgl.eglTerminate(eGLDisplay);
                this.mEglDisplay = null;
            }
        }

        public boolean createSurface() {
            m7241x97e22306("EglHelper", "createSurface()  tid=" + Thread.currentThread().getId());
            if (this.mEgl == null) {
                throw new RuntimeException("egl not initialized");
            } else if (this.mEglDisplay == null) {
                throw new RuntimeException("eglDisplay not initialized");
            } else if (this.mEglConfig != null) {
                destroySurfaceImp();
                GLTextureView gLTextureView = this.mGLTextureViewWeakRef.get();
                if (gLTextureView != null) {
                    this.mEglSurface = gLTextureView.mEGLWindowSurfaceFactory.createWindowSurface(this.mEgl, this.mEglDisplay, this.mEglConfig, gLTextureView.getSurfaceTexture());
                } else {
                    this.mEglSurface = null;
                }
                EGLSurface eGLSurface = this.mEglSurface;
                if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                    if (this.mEgl.eglGetError() == 12299) {
                        m7240x97e222f4("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                    }
                    return false;
                }
                EGL10 egl10 = this.mEgl;
                EGLDisplay eGLDisplay = this.mEglDisplay;
                EGLSurface eGLSurface2 = this.mEglSurface;
                if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, this.mEglContext)) {
                    return true;
                }
                logEglErrorAsWarning("EGLHelper", "eglMakeCurrent", this.mEgl.eglGetError());
                return false;
            } else {
                throw new RuntimeException("mEglConfig not initialized");
            }
        }

        public void start() {
            m7241x97e22306("EglHelper", "start() tid=" + Thread.currentThread().getId());
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.mEgl = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.mEglDisplay = eglGetDisplay;
            if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
                if (this.mEgl.eglInitialize(this.mEglDisplay, new int[2])) {
                    GLTextureView gLTextureView = this.mGLTextureViewWeakRef.get();
                    if (gLTextureView == null) {
                        this.mEglConfig = null;
                        this.mEglContext = null;
                    } else {
                        this.mEglConfig = gLTextureView.mEGLConfigChooser.chooseConfig(this.mEgl, this.mEglDisplay);
                        this.mEglContext = gLTextureView.mEGLContextFactory.createContext(this.mEgl, this.mEglDisplay, this.mEglConfig);
                    }
                    EGLContext eGLContext = this.mEglContext;
                    if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                        this.mEglContext = null;
                        throwEglException("createContext");
                    }
                    m7241x97e22306("EglHelper", "createContext " + this.mEglContext + " tid=" + Thread.currentThread().getId());
                    this.mEglSurface = null;
                    return;
                }
                throw new RuntimeException("eglInitialize failed");
            }
            throw new RuntimeException("eglGetDisplay failed");
        }

        public EglHelper(WeakReference<GLTextureView> weakReference) {
            this.mGLTextureViewWeakRef = weakReference;
        }

        private void throwEglException(String str) {
            throwEglException(str, this.mEgl.eglGetError());
        }

        public static String formatEglError(String str, int i) {
            return str + " failed";
        }

        public static void throwEglException(String str, int i) {
            String formatEglError = formatEglError(str, i);
            m7240x97e222f4("EglHelper", "throwEglException tid=" + Thread.currentThread().getId() + " " + formatEglError);
            throw new RuntimeException(formatEglError);
        }

        public static void logEglErrorAsWarning(String str, String str2, int i) {
            m7241x97e22306(str, formatEglError(str2, i));
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        m7235xc3c061f("GLTextureView", "onDetachedFromWindow");
        GLThread gLThread = this.mGLThread;
        if (gLThread != null) {
            gLThread.requestExitAndWait();
        }
        this.mDetached = true;
        super.onDetachedFromWindow();
    }

    public void onResume() {
        if (!(this.mPrevSurfaceTexture == null || getSurfaceTexture() == this.mPrevSurfaceTexture)) {
            int i = Build.VERSION.SDK_INT;
            setSurfaceTexture(this.mPrevSurfaceTexture);
            this.mGLThread.surfaceCreated();
        }
        this.mGLThread.onResume();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        m7235xc3c061f("GLTextureView", "onAttachedToWindow reattach =" + this.mDetached);
        if (this.mDetached && this.mRenderer != null) {
            GLThread gLThread = this.mGLThread;
            if (gLThread != null) {
                i = gLThread.getRenderMode();
            } else {
                i = 1;
            }
            GLThread gLThread2 = new GLThread(this.mThisWeakRef);
            this.mGLThread = gLThread2;
            if (i != 1) {
                gLThread2.setRenderMode(i);
            }
            this.mGLThread.start();
        }
        this.mDetached = false;
    }

    public void setDebugFlags(int i) {
        this.mDebugFlags = i;
    }

    public void setGLWrapper(GLWrapper gLWrapper) {
        this.mGLWrapper = gLWrapper;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.mPreserveEGLContextOnPause = z;
    }

    /* renamed from: on */
    public void mo6582on(SurfaceHolder surfaceHolder) {
        this.mGLThread.surfaceCreated();
    }

    public void queueEvent(Runnable runnable) {
        this.mGLThread.queueEvent(runnable);
    }

    public void setEGLConfigChooser(EGLConfigChooser eGLConfigChooser) {
        checkRenderThreadState();
        this.mEGLConfigChooser = eGLConfigChooser;
    }

    public void setEGLContextClientVersion(int i) {
        checkRenderThreadState();
        this.mEGLContextClientVersion = i;
    }

    public void setEGLContextFactory(EGLContextFactory eGLContextFactory) {
        checkRenderThreadState();
        this.mEGLContextFactory = eGLContextFactory;
    }

    public void setEGLWindowSurfaceFactory(EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        checkRenderThreadState();
        this.mEGLWindowSurfaceFactory = eGLWindowSurfaceFactory;
    }

    public void setRenderMode(int i) {
        this.mGLThread.setRenderMode(i);
    }

    class DefaultContextFactory implements EGLContextFactory {
        private int EGL_CONTEXT_CLIENT_VERSION;

        static {
            Covode.recordClassIndex(2676);
        }

        /* renamed from: com_bef_effectsdk_GLTextureView$DefaultContextFactory_com_ss_android_ugc_aweme_lancet_LogLancet_e */
        public static int m7237xfbfed318(String str, String str2) {
            return 0;
        }

        /* renamed from: com_bef_effectsdk_GLTextureView$DefaultContextFactory_com_ss_android_ugc_aweme_lancet_LogLancet_i */
        public static int m7238xfbfed31c(String str, String str2) {
            return 0;
        }

        private DefaultContextFactory() {
            this.EGL_CONTEXT_CLIENT_VERSION = 12440;
        }

        /* synthetic */ DefaultContextFactory(GLTextureView gLTextureView, C23841 r2) {
            this();
        }

        @Override // com.bef.effectsdk.GLTextureView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{this.EGL_CONTEXT_CLIENT_VERSION, 3, 12344});
            GLTextureView.this.mEGLContextClientVersion = 3;
            if (eglCreateContext == EGL10.EGL_NO_CONTEXT) {
                eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{this.EGL_CONTEXT_CLIENT_VERSION, 2, 12344});
                GLTextureView.this.mEGLContextClientVersion = 2;
                if (eglCreateContext == EGL10.EGL_NO_CONTEXT) {
                    GLTextureView.this.mEGLContextClientVersion = 0;
                }
            }
            return eglCreateContext;
        }

        @Override // com.bef.effectsdk.GLTextureView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                m7237xfbfed318("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
                m7238xfbfed31c("DefaultContextFactory", "tid=" + Thread.currentThread().getId());
                EglHelper.throwEglException("eglDestroyContex", egl10.eglGetError());
            }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        GLThread gLThread = this.mGLThread;
        if (gLThread == null) {
            return false;
        }
        gLThread.surfaceDestroyed();
        return false;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (getRenderMode() != 0) {
            requestRender();
        }
    }

    public GLTextureView(Context context) {
        super(context);
        MethodCollector.m26663i(5973);
        init();
        MethodCollector.m26664o(5973);
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser(new SimpleEGLConfigChooser(z));
    }

    abstract class BaseConfigChooser implements EGLConfigChooser {
        protected int[] mConfigSpec;

        static {
            Covode.recordClassIndex(2674);
        }

        /* access modifiers changed from: package-private */
        public abstract EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        private int[] filterConfigSpec(int[] iArr) {
            if (GLTextureView.this.mEGLContextClientVersion == 2) {
                int length = iArr.length;
                int[] iArr2 = new int[(length + 2)];
                int i = length - 1;
                System.arraycopy(iArr, 0, iArr2, 0, i);
                iArr2[i] = 12352;
                iArr2[length] = 4;
                iArr2[length + 1] = 12344;
                return iArr2;
            } else if (GLTextureView.this.mEGLContextClientVersion != 3) {
                return iArr;
            } else {
                int length2 = iArr.length;
                int[] iArr3 = new int[(length2 + 2)];
                int i2 = length2 - 1;
                System.arraycopy(iArr, 0, iArr3, 0, i2);
                iArr3[i2] = 12352;
                iArr3[length2] = 64;
                iArr3[length2 + 1] = 12344;
                return iArr3;
            }
        }

        public BaseConfigChooser(int[] iArr) {
            this.mConfigSpec = filterConfigSpec(iArr);
        }

        @Override // com.bef.effectsdk.GLTextureView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (egl10.eglChooseConfig(eGLDisplay, this.mConfigSpec, null, 0, iArr)) {
                int i = iArr[0];
                if (i > 0) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[i];
                    if (egl10.eglChooseConfig(eGLDisplay, this.mConfigSpec, eGLConfigArr, i, iArr)) {
                        EGLConfig chooseConfig = chooseConfig(egl10, eGLDisplay, eGLConfigArr);
                        if (chooseConfig != null) {
                            return chooseConfig;
                        }
                        throw new IllegalArgumentException("No config chosen");
                    }
                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                }
                throw new IllegalArgumentException("No configs match configSpec");
            }
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        checkRenderThreadState();
        if (this.mEGLConfigChooser == null) {
            this.mEGLConfigChooser = new SimpleEGLConfigChooser(true);
        }
        if (this.mEGLContextFactory == null) {
            this.mEGLContextFactory = new DefaultContextFactory(this, null);
        }
        if (this.mEGLWindowSurfaceFactory == null) {
            this.mEGLWindowSurfaceFactory = new DefaultWindowSurfaceFactory(null);
        }
        this.mRenderer = renderer;
        GLThread gLThread = new GLThread(this.mThisWeakRef);
        this.mGLThread = gLThread;
        gLThread.start();
    }

    class SimpleEGLConfigChooser extends ComponentSizeChooser {
        static {
            Covode.recordClassIndex(2686);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public SimpleEGLConfigChooser(boolean r10) {
            /*
                r8 = this;
                r1 = r9
                com.bef.effectsdk.GLTextureView.this = r1
                if (r10 == 0) goto L_0x0016
                r0 = 16
                r6 = 16
            L_0x0009:
                r7 = 0
                r2 = 8
                r3 = 8
                r4 = 8
                r5 = 0
                r0 = r8
                r0.<init>(r2, r3, r4, r5, r6, r7)
                return
            L_0x0016:
                r0 = 0
                r6 = 0
                goto L_0x0009
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.GLTextureView.SimpleEGLConfigChooser.<init>(com.bef.effectsdk.GLTextureView, boolean):void");
        }
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(5975);
        init();
        MethodCollector.m26664o(5975);
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.mGLThread.onWindowResize(i, i2);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.mPrevSurfaceTexture = surfaceTexture;
        GLThread gLThread = this.mGLThread;
        if (gLThread != null) {
            gLThread.surfaceCreated();
        }
    }

    class ComponentSizeChooser extends BaseConfigChooser {
        protected int mAlphaSize;
        protected int mBlueSize;
        protected int mDepthSize;
        protected int mGreenSize;
        protected int mRedSize;
        protected int mStencilSize;
        private int[] mValue = new int[1];

        static {
            Covode.recordClassIndex(2675);
        }

        @Override // com.bef.effectsdk.GLTextureView.BaseConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int findConfigAttrib = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12325, 0);
                int findConfigAttrib2 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12326, 0);
                if (findConfigAttrib >= this.mDepthSize && findConfigAttrib2 >= this.mStencilSize) {
                    int findConfigAttrib3 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12324, 0);
                    int findConfigAttrib4 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12323, 0);
                    int findConfigAttrib5 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12322, 0);
                    int findConfigAttrib6 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12321, 0);
                    if (findConfigAttrib3 == this.mRedSize && findConfigAttrib4 == this.mGreenSize && findConfigAttrib5 == this.mBlueSize && findConfigAttrib6 == this.mAlphaSize) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        private int findConfigAttrib(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.mValue)) {
                return this.mValue[0];
            }
            return i2;
        }

        public ComponentSizeChooser(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            this.mRedSize = i;
            this.mGreenSize = i2;
            this.mBlueSize = i3;
            this.mAlphaSize = i4;
            this.mDepthSize = i5;
            this.mStencilSize = i6;
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        GLThread gLThread = this.mGLThread;
        if (gLThread != null) {
            gLThread.onWindowResize(i, i2);
        }
    }

    public void setEGLConfigChooser(int i, int i2, int i3, int i4, int i5, int i6) {
        setEGLConfigChooser(new ComponentSizeChooser(i, i2, i3, i4, i5, i6));
    }
}
