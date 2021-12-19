package com.p2082ss.texturerender;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.texturerender.VideoSurface;
import com.p2082ss.texturerender.p4404a.C86174d;
import com.p2082ss.texturerender.p4404a.C86176f;
import com.p2082ss.texturerender.p4404a.C86177g;
import com.p2082ss.texturerender.p4405b.C86188a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.texturerender.p */
public final class C86211p extends SurfaceTexture implements Serializable {

    /* renamed from: A */
    private static int[] f192365A = {864, 960, 960, 1024, 648, 1016};
    public static final int ERROR_SR_EXE_FAIL = 2;
    public static final int ERROR_SR_INIT_FAIL = 1;

    /* renamed from: z */
    private static int[] f192366z = {480, 540, 544, 576, 576, 576};

    /* renamed from: B */
    private boolean f192367B = false;

    /* renamed from: C */
    private boolean f192368C = false;

    /* renamed from: D */
    private HashMap<Surface, EGLSurface> f192369D;

    /* renamed from: E */
    private long f192370E = -1;

    /* renamed from: F */
    private int f192371F = 0;

    /* renamed from: G */
    private Message f192372G = new Message();

    /* renamed from: H */
    private int f192373H;

    /* renamed from: I */
    private int f192374I = 0;

    /* renamed from: J */
    private AbstractC86206n f192375J;

    /* renamed from: K */
    private C86174d f192376K = new C86174d();

    /* renamed from: L */
    private LinkedList<C86176f> f192377L = new LinkedList<>();

    /* renamed from: M */
    private HashMap<Integer, Integer> f192378M = new HashMap<>();

    /* renamed from: N */
    private Bundle f192379N = new Bundle();

    /* renamed from: O */
    private int f192380O = 3;

    /* renamed from: P */
    private C86212a f192381P;

    /* renamed from: a */
    private AbstractC86187b f192382a;

    /* renamed from: b */
    private volatile boolean f192383b = false;

    /* renamed from: c */
    private boolean f192384c = false;

    /* renamed from: d */
    private boolean f192385d = false;

    /* renamed from: e */
    private EGLSurface f192386e = EGL14.EGL_NO_SURFACE;

    /* renamed from: f */
    private int f192387f = 0;

    /* renamed from: g */
    private int f192388g = 0;

    /* renamed from: h */
    private Surface f192389h = null;

    /* renamed from: i */
    private Surface f192390i = null;

    /* renamed from: j */
    private VideoSurface f192391j = null;

    /* renamed from: k */
    private ReentrantLock f192392k;

    /* renamed from: l */
    private Handler f192393l;

    /* renamed from: m */
    private int f192394m = 0;

    /* renamed from: n */
    private EGLContext f192395n;

    /* renamed from: o */
    private EGLDisplay f192396o;

    /* renamed from: p */
    private EGLConfig f192397p;

    /* renamed from: q */
    private long f192398q;

    /* renamed from: r */
    private long f192399r;

    /* renamed from: s */
    private Looper f192400s;

    /* renamed from: t */
    private Bundle f192401t;

    /* renamed from: u */
    private long f192402u;

    /* renamed from: v */
    private volatile int f192403v;

    /* renamed from: w */
    private CopyOnWriteArrayList<Bundle> f192404w;

    /* renamed from: x */
    private int f192405x;

    /* renamed from: y */
    private int f192406y;

    public final void onFocusLoss() {
        this.f192385d = false;
    }

    public final void preRender() {
        this.f192367B = true;
    }

    public final C86174d getEffectConfig() {
        return this.f192376K;
    }

    public final HashMap<Surface, EGLSurface> getExtraRealSurfaces() {
        return this.f192369D;
    }

    public final long getOjbectId() {
        return this.f192398q;
    }

    public final CopyOnWriteArrayList<Bundle> getParamList() {
        return this.f192404w;
    }

    public final Surface getRenderSurface() {
        return this.f192389h;
    }

    public final int getSerial() {
        return this.f192394m;
    }

    public final long getSurfaceUpdateTime() {
        return this.f192399r;
    }

    public final int getTexHeight() {
        return this.f192406y;
    }

    public final AbstractC86187b getTexId() {
        return this.f192382a;
    }

    public final int getTexWidth() {
        return this.f192405x;
    }

    public final Surface getUpdateSurface() {
        return this.f192390i;
    }

    public final int getUseSr() {
        return this.f192403v;
    }

    public final boolean isPreRender() {
        return this.f192367B;
    }

    public final boolean isRelease() {
        return this.f192383b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.texturerender.p$a */
    public static class C86212a implements SurfaceTexture.OnFrameAvailableListener {

        /* renamed from: a */
        boolean f192407a;

        static {
            Covode.recordClassIndex(101355);
        }

        private C86212a() {
            this.f192407a = true;
        }

        /* synthetic */ C86212a(byte b) {
            this();
        }

        public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
            if (this.f192407a) {
                ((C86211p) surfaceTexture).sendRenderMsg(1);
            } else {
                ((C86211p) surfaceTexture).sendRenderMsg(0);
            }
        }
    }

    public final void lock() {
        this.f192392k.lock();
    }

    public final void resetFlag() {
        this.f192378M.clear();
    }

    public final void unlock() {
        this.f192392k.unlock();
    }

    /* access modifiers changed from: protected */
    @Override // android.graphics.SurfaceTexture, java.lang.Object
    public final void finalize() {
        C86203l.m148116a("VideoSurfaceTexture", "finalize");
        releaseInternal();
        super.finalize();
    }

    public final int getViewportHeight() {
        int consumerHeight = getConsumerHeight(this.f192386e);
        if (this.f192388g != consumerHeight) {
            this.f192388g = consumerHeight;
        }
        return this.f192388g;
    }

    public final int getViewportWidth() {
        int consumerWidth = getConsumerWidth(this.f192386e);
        if (this.f192387f != consumerWidth) {
            this.f192387f = consumerWidth;
        }
        return this.f192387f;
    }

    public final boolean isMakeCurrent() {
        if (!this.f192385d || this.f192386e == EGL14.EGL_NO_SURFACE) {
            return false;
        }
        return true;
    }

    public final boolean makeCurrent() {
        if (!makeCurrent(this.f192386e)) {
            return false;
        }
        this.f192385d = true;
        return true;
    }

    public final void release() {
        C86203l.m148116a("VideoSurfaceTexture", "release");
        releaseInternal();
        super.release();
    }

    public final boolean couldForceRelease() {
        if (SystemClock.elapsedRealtime() - this.f192402u > 120000) {
            return true;
        }
        return false;
    }

    public final boolean render() {
        if (!eglSwapBuffer(this.f192386e)) {
            return false;
        }
        notifyRenderFrame(this.f192394m);
        return true;
    }

    static {
        Covode.recordClassIndex(101354);
    }

    public final synchronized VideoSurface getOffScreenSurface() {
        MethodCollector.m26663i(751);
        if (this.f192383b) {
            MethodCollector.m26664o(751);
            return null;
        }
        if (this.f192391j == null) {
            this.f192391j = new VideoSurface(this);
        }
        this.f192402u = -9223372036854775807L;
        VideoSurface videoSurface = this.f192391j;
        MethodCollector.m26664o(751);
        return videoSurface;
    }

    public final boolean isAlive() {
        C86203l.m148116a("VideoSurfaceTexture", "is alive = " + this.f192391j + ", eglsur = " + this.f192386e);
        if (this.f192391j == null && this.f192386e == EGL14.EGL_NO_SURFACE) {
            return false;
        }
        return true;
    }

    public final synchronized void releaseAllExtraSurface_l() {
        MethodCollector.m26663i(672);
        Handler handler = this.f192393l;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(25);
            obtainMessage.arg1 = 3;
            Bundle bundle = new Bundle();
            bundle.putSerializable("texture", this);
            obtainMessage.setData(bundle);
            this.f192393l.sendMessage(obtainMessage);
        }
        MethodCollector.m26664o(672);
    }

    public final boolean needDrop() {
        int i;
        long j = this.f192370E;
        if (j > 0 && j > getTimestamp() && (i = this.f192371F) < 5) {
            this.f192371F = i + 1;
            C86203l.m148116a("VideoSurfaceTexture", "texture" + this + " previous play period,drop count:" + this.f192371F);
            return true;
        } else if (!this.f192384c) {
            return false;
        } else {
            C86203l.m148116a("VideoSurfaceTexture", "texture" + this + " is paused");
            return true;
        }
    }

    public final void releaseAllExtraSurface() {
        Iterator<Map.Entry<Surface, EGLSurface>> it = this.f192369D.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Surface, EGLSurface> next = it.next();
            if (!(next.getValue() == EGL14.EGL_NO_SURFACE || next.getValue() == null)) {
                EGL14.eglDestroySurface(this.f192396o, next.getValue());
                C86203l.m148116a("VideoSurfaceTexture", "releaseAllExtraSurface sf:" + this + ", eglSurface:" + next.getValue());
            }
            it.remove();
        }
    }

    public final synchronized void releaseInternal() {
        MethodCollector.m26663i(239);
        if (!this.f192383b) {
            try {
                lock();
                C86203l.m148116a("VideoSurfaceTexture", this + " release internal");
                this.f192383b = true;
                this.f192382a.mo136467b();
                this.f192393l = null;
                this.f192400s = null;
                C86177g gVar = this.f192375J.f192344m;
                while (this.f192377L.size() > 0) {
                    C86176f poll = this.f192377L.poll();
                    if (gVar != null) {
                        gVar.mo136489a(poll);
                    } else {
                        C86197g.m148105b(poll.f192201a);
                    }
                    C86203l.m148116a("VideoSurfaceTexture", "return fbotex:" + poll.f192201a + ",st:" + this);
                }
                C86203l.m148116a("VideoSurfaceTexture", this + " release internal done");
            } finally {
                unlock();
                MethodCollector.m26664o(239);
            }
        } else {
            MethodCollector.m26664o(239);
        }
    }

    public final void notifyError(int i) {
        try {
            this.f192391j.mo136448a(i);
        } catch (Exception unused) {
        }
    }

    public final boolean isCurrentObject(long j) {
        if (this.f192398q == j) {
            return true;
        }
        return false;
    }

    public final void notifyRenderFrame(int i) {
        if (i == this.f192394m) {
            try {
                this.f192391j.mo136451a(i, getTimestamp());
            } catch (Exception unused) {
            }
        }
    }

    public final int getConsumerHeight(EGLSurface eGLSurface) {
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.f192396o, eGLSurface, 12374, iArr, 0);
        return iArr[0];
    }

    public final int getConsumerWidth(EGLSurface eGLSurface) {
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            return -1;
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.f192396o, eGLSurface, 12375, iArr, 0);
        return iArr[0];
    }

    public final void ignoreSRResolutionCheck(boolean z) {
        this.f192368C = z;
        C86203l.m148116a("VideoSurfaceTexture", "ignoreSRResolutionCheck:".concat(String.valueOf(z)));
    }

    public final boolean eglSwapBuffer(EGLSurface eGLSurface) {
        if (EGL14.eglSwapBuffers(this.f192396o, eGLSurface)) {
            return true;
        }
        notifyError(EGL14.eglGetError());
        C86203l.m148116a("VideoSurfaceTexture", this + "swap buffer failed:" + GLUtils.getEGLErrorString(EGL14.eglGetError()));
        return false;
    }

    public final void release(boolean z) {
        C86203l.m148116a("VideoSurfaceTexture", "release " + this + ", glthread = " + z);
        releaseOffScreenSurface(z);
        release();
    }

    public final void sendRenderMsg(int i) {
        MethodCollector.m26663i(5942);
        Handler handler = this.f192393l;
        if (handler != null) {
            try {
                Message obtainMessage = handler.obtainMessage(2);
                obtainMessage.obj = this;
                obtainMessage.arg1 = i;
                if (!this.f192379N.isEmpty()) {
                    synchronized (this.f192379N) {
                        try {
                            obtainMessage.setData(this.f192379N);
                            this.f192379N = new Bundle();
                        } catch (Throwable th) {
                            MethodCollector.m26664o(5942);
                            throw th;
                        }
                    }
                }
                obtainMessage.sendToTarget();
                MethodCollector.m26664o(5942);
                return;
            } catch (Exception unused) {
            }
        }
        MethodCollector.m26664o(5942);
    }

    public final synchronized void setSuperResolutionMode(int i) {
        MethodCollector.m26663i(281);
        C86203l.m148116a("VideoSurfaceTexture", this + " set sr = " + i);
        this.f192403v = i;
        this.f192376K.mo136480a(5, i);
        MethodCollector.m26664o(281);
    }

    public final synchronized void updateVideoState(int i) {
        MethodCollector.m26663i(953);
        Handler handler = this.f192393l;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(26);
            obtainMessage.obj = this;
            obtainMessage.arg1 = i;
            this.f192393l.sendMessageAtFrontOfQueue(obtainMessage);
        }
        MethodCollector.m26664o(953);
    }

    /* renamed from: a */
    private static String m148155a(Looper looper) {
        if (looper == null) {
            return null;
        }
        Thread thread = looper.getThread();
        if (thread != null) {
            return "Looper (" + thread.getName() + ", tid " + thread.getId() + ") {" + Integer.toHexString(System.identityHashCode(looper)) + "}";
        }
        return "Looper {" + Integer.toHexString(System.identityHashCode(looper)) + "}";
    }

    public final boolean canReuse(Looper looper) {
        StringBuilder sb;
        StringBuilder sb2;
        boolean z = false;
        try {
            if (looper == this.f192400s) {
                z = true;
            }
            sb = new StringBuilder().append(this).append("ret = ").append(z).append(" looper =");
        } catch (Exception unused) {
            sb2 = new StringBuilder();
            sb = sb2.append(this).append("ret = false looper =");
            C86203l.m148116a("VideoSurfaceTexture", sb.append(m148155a(looper)).append(", mlooper = ").append(m148155a(this.f192400s)).toString());
            return z;
        } catch (Throwable unused2) {
            sb2 = new StringBuilder();
            sb = sb2.append(this).append("ret = false looper =");
            C86203l.m148116a("VideoSurfaceTexture", sb.append(m148155a(looper)).append(", mlooper = ").append(m148155a(this.f192400s)).toString());
            return z;
        }
        C86203l.m148116a("VideoSurfaceTexture", sb.append(m148155a(looper)).append(", mlooper = ").append(m148155a(this.f192400s)).toString());
        return z;
    }

    public final EGLSurface createEGLWindowSurface(Surface surface) {
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (surface == null || !surface.isValid()) {
            return eGLSurface;
        }
        int[] iArr = {12344};
        try {
            C86203l.m148116a("VideoSurfaceTexture", this + ",create window surface from " + surface);
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.f192396o, this.f192397p, surface, iArr, 0);
            if (eglCreateWindowSurface != EGL14.EGL_NO_SURFACE) {
                return eglCreateWindowSurface;
            }
            notifyError(EGL14.eglGetError());
            C86203l.m148116a("VideoSurfaceTexture", "create window surface failed" + GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return eglCreateWindowSurface;
        } catch (Exception unused) {
            notifyError(5);
            C86203l.m148116a("VideoSurfaceTexture", "createEGLWindowSurface exception failed");
            return EGL14.EGL_NO_SURFACE;
        }
    }

    public final void handleUpdateVideoState(int i) {
        this.f192380O = i;
        if (i != 1) {
            if (i == 2) {
                C86203l.m148116a("VideoSurfaceTexture", "TEXTURE_STATE_STOP mStartPlayTimeNanos:" + this.f192370E);
            } else if (i == 3) {
                this.f192371F = 0;
                C86203l.m148116a("VideoSurfaceTexture", "TEXTURE_STATE_STOP");
            }
        } else if (this.f192370E <= 0) {
            this.f192370E = System.nanoTime();
            C86203l.m148116a("VideoSurfaceTexture", "TEXTURE_STATE_PLAYING mStartPlayTimeNanos:" + this.f192370E);
        }
    }

    public final void initExtraSurface(Surface surface) {
        C86203l.m148116a("VideoSurfaceTexture", "initExtraSurface begin sf:" + this + ", surface:" + surface + ", mExtraSurfaceMap size:" + this.f192369D.size());
        if (surface != null && !this.f192369D.containsKey(surface)) {
            EGLSurface createEGLWindowSurface = createEGLWindowSurface(surface);
            this.f192369D.put(surface, createEGLWindowSurface);
            C86203l.m148116a("VideoSurfaceTexture", "initExtraSurface end sf:" + this + ", eglSurface:" + createEGLWindowSurface + ", mExtraSurfaceMap size:" + this.f192369D.size());
        }
    }

    public final boolean makeCurrent(EGLSurface eGLSurface) {
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            C86203l.m148116a("VideoSurfaceTexture", "no surface for make current");
            return false;
        }
        C86203l.m148116a("VideoSurfaceTexture", this + " make current again");
        GLES20.glFinish();
        if (!EGL14.eglMakeCurrent(this.f192396o, eGLSurface, eGLSurface, this.f192395n)) {
            notifyError(EGL14.eglGetError());
            C86203l.m148116a("VideoSurfaceTexture", "make current failed:" + eGLSurface + " error:" + GLUtils.getEGLErrorString(EGL14.eglGetError()));
            return false;
        }
        C86203l.m148116a("VideoSurfaceTexture", this + "make current done = " + this.f192391j);
        return true;
    }

    public final void releaseExtraSurface(Surface surface) {
        C86203l.m148116a("VideoSurfaceTexture", "releaseExtraSurface begin sf:" + this + ", surface:" + surface + ", mExtraSurfaceMap size:" + this.f192369D.size());
        EGLSurface eGLSurface = this.f192369D.get(surface);
        if (eGLSurface != null) {
            if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f192396o, eGLSurface);
            }
            this.f192369D.remove(surface);
        }
        C86203l.m148116a("VideoSurfaceTexture", "releaseExtraSurface end sf:" + this + ", eglSurface:" + eGLSurface + ", mExtraSurfaceMap size:" + this.f192369D.size());
    }

    /* renamed from: a */
    private void m148157a(Handler handler) {
        this.f192398q = new Random().nextLong();
        this.f192393l = handler;
        this.f192392k = new ReentrantLock();
        this.f192400s = Looper.myLooper();
        this.f192401t = new Bundle();
        this.f192386e = EGL14.EGL_NO_SURFACE;
        this.f192403v = 0;
        C86212a aVar = new C86212a((byte) 0);
        this.f192381P = aVar;
        setOnFrameAvailableListener(aVar);
        C86203l.m148116a("VideoSurfaceTexture", this + "gen a texture :" + this.f192398q + ", thread id " + Thread.currentThread().getId() + ", looper = " + m148155a(this.f192400s));
    }

    public final void releaseOffScreenSurface(boolean z) {
        MethodCollector.m26663i(855);
        this.f192391j = null;
        if (z) {
            this.f192390i = null;
            if (this.f192386e != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f192396o, this.f192386e);
                this.f192386e = EGL14.EGL_NO_SURFACE;
                this.f192385d = false;
            }
            releaseAllExtraSurface();
        } else {
            updateSurface(null);
            releaseAllExtraSurface_l();
        }
        if ((this.f192373H & 4) > 0) {
            synchronized (this.f192372G) {
                try {
                    this.f192372G.arg1 = Integer.MIN_VALUE;
                    this.f192372G.notify();
                    C86203l.m148116a("VideoSurfaceTexture", "releaseOffScreenSurface mSyncMsg.notify");
                } catch (Throwable th) {
                    MethodCollector.m26664o(855);
                    throw th;
                }
            }
        }
        this.f192402u = SystemClock.elapsedRealtime();
        this.f192380O = 3;
        CopyOnWriteArrayList<Bundle> copyOnWriteArrayList = this.f192404w;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
            this.f192404w = null;
        }
        C86203l.m148116a("VideoSurfaceTexture", this + "release offscreen surface done = " + this.f192402u);
        MethodCollector.m26664o(855);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r2 == 1) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void setEffect(android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.texturerender.C86211p.setEffect(android.os.Bundle):void");
    }

    public final synchronized void updateSurface(Surface surface) {
        MethodCollector.m26663i(543);
        C86203l.m148116a("VideoSurfaceTexture", "update Surface = " + this + ", " + surface + ", " + this.f192390i);
        if (surface != this.f192390i || surface == null || !surface.toString().contains("SurfaceTexture")) {
            this.f192392k.lock();
            this.f192390i = surface;
            this.f192392k.unlock();
            Handler handler = this.f192393l;
            if (handler != null) {
                Message obtainMessage = handler.obtainMessage(4);
                this.f192401t.putSerializable("texture", this);
                obtainMessage.setData(this.f192401t);
                if (this.f192374I != 1) {
                    this.f192393l.sendMessageAtFrontOfQueue(obtainMessage);
                } else {
                    Object obj = new Object();
                    obtainMessage.obj = obj;
                    synchronized (obj) {
                        try {
                            this.f192393l.sendMessageAtFrontOfQueue(obtainMessage);
                            try {
                                C86203l.m148116a("VideoSurfaceTexture", "update surface wait");
                                obj.wait(100);
                            } catch (Exception unused) {
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(543);
                            throw th;
                        }
                    }
                }
            }
            C86203l.m148116a("VideoSurfaceTexture", "update Surface end");
            MethodCollector.m26664o(543);
            return;
        }
        C86203l.m148116a("VideoSurfaceTexture", "prevent the same surface???");
        MethodCollector.m26664o(543);
    }

    /* renamed from: a */
    private void m148156a(int i, int i2) {
        Iterator<Bundle> it = this.f192404w.iterator();
        while (it.hasNext()) {
            Bundle next = it.next();
            if (next.getInt("action") == i && next.getInt("effect_type") == i2) {
                this.f192404w.remove(next);
                return;
            }
        }
    }

    public final boolean supportProcessResolution(int i, int i2) {
        if (this.f192368C) {
            return true;
        }
        int i3 = 0;
        while (true) {
            int[] iArr = f192366z;
            if (i3 >= iArr.length) {
                C86203l.m148116a("VideoSurfaceTexture", "sr not support resolution width:" + i + ",height：" + i2);
                return false;
            } else if (iArr[i3] == i && f192365A[i3] == i2) {
                return true;
            } else {
                i3++;
            }
        }
    }

    public final void updateTexDimension(int i, int i2) {
        C86203l.m148116a("VideoSurfaceTexture", "update tex dimension : " + i + ", " + i2);
        this.f192405x = i;
        this.f192406y = i2;
    }

    public final int getIntOption(int i, int i2) {
        if (i == 6) {
            i2 = 5;
        } else if (i == 10) {
            AbstractC86206n nVar = this.f192375J;
            if (nVar == null || !nVar.f192348q.f192198a) {
                return 0;
            }
            return 1;
        } else if (i == 23) {
            AbstractC86206n nVar2 = this.f192375J;
            if (nVar2 == null || !nVar2.f192348q.mo136483a(i2)) {
                return 0;
            }
            return 1;
        } else if (i == 15) {
            i2 = 1;
        } else if (i != 16) {
            if (i == 18) {
                AbstractC86206n nVar3 = this.f192375J;
                if (nVar3 == null || !nVar3.f192348q.f192199b) {
                    return 0;
                }
                return 1;
            } else if (i != 19) {
                return -1;
            }
        } else if (this.f192376K.mo136483a(1)) {
            return 1;
        } else {
            return 0;
        }
        Integer num = this.f192378M.get(Integer.valueOf(i2));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final synchronized void pause(boolean z, boolean z2) {
        MethodCollector.m26663i(330);
        if (z2 && !z && this.f192393l != null && (this.f192384c || this.f192367B)) {
            C86203l.m148116a("VideoSurfaceTexture", this + "need active , post a resume msg");
            Message obtainMessage = this.f192393l.obtainMessage(10);
            obtainMessage.obj = this;
            this.f192367B = false;
            this.f192393l.sendMessageAtFrontOfQueue(obtainMessage);
        }
        this.f192384c = z;
        C86203l.m148116a("VideoSurfaceTexture", this + "paused = " + this.f192384c);
        MethodCollector.m26664o(330);
    }

    public final synchronized void setExtraSurface(Surface surface, int i) {
        MethodCollector.m26663i(560);
        C86203l.m148116a("VideoSurfaceTexture", "setExtraSurface = " + this + ", " + surface + ", opera:" + i);
        Handler handler = this.f192393l;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(25);
            obtainMessage.arg1 = i;
            Bundle bundle = new Bundle();
            bundle.putSerializable("texture", this);
            bundle.putParcelable("surface", surface);
            obtainMessage.setData(bundle);
            this.f192393l.sendMessage(obtainMessage);
        }
        C86203l.m148116a("VideoSurfaceTexture", "setExtraSurface end");
        MethodCollector.m26664o(560);
    }

    public final synchronized void setOption(int i, float f) {
        MethodCollector.m26663i(1026);
        if (i != 4) {
            switch (i) {
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    Handler handler = this.f192393l;
                    if (handler != null) {
                        try {
                            Message obtainMessage = handler.obtainMessage(35);
                            obtainMessage.obj = this;
                            obtainMessage.arg1 = i;
                            Bundle bundle = new Bundle();
                            bundle.putFloat("float_value", f);
                            obtainMessage.setData(bundle);
                            obtainMessage.sendToTarget();
                            MethodCollector.m26664o(1026);
                            return;
                        } catch (Exception unused) {
                            break;
                        }
                    } else {
                        MethodCollector.m26664o(1026);
                        return;
                    }
            }
            MethodCollector.m26664o(1026);
            return;
        }
        C86203l.m148116a("VideoSurfaceTexture", "set TEXTURE_OPTION_SET_OVERLAY_RATIO ratio:".concat(String.valueOf(f)));
        try {
            Message obtainMessage2 = this.f192393l.obtainMessage(27);
            obtainMessage2.obj = this;
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("overlay_ratio", f);
            obtainMessage2.setData(bundle2);
            obtainMessage2.sendToTarget();
            MethodCollector.m26664o(1026);
        } catch (Exception unused2) {
            MethodCollector.m26664o(1026);
        }
    }

    public final boolean handleSurfaceChange(boolean z, EGLSurface eGLSurface) {
        boolean z2;
        this.f192392k.lock();
        Surface surface = this.f192389h;
        Surface surface2 = this.f192390i;
        if (surface != surface2 || surface2 == null || !surface2.toString().contains("SurfaceTexture")) {
            Surface surface3 = this.f192389h;
            Surface surface4 = this.f192390i;
            if (surface3 != surface4 || surface4 == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.f192389h = surface4;
            this.f192381P.f192407a = false;
            C86212a aVar = new C86212a((byte) 0);
            this.f192381P = aVar;
            setOnFrameAvailableListener(aVar);
            this.f192392k.unlock();
            boolean createEGLWindowSurface = createEGLWindowSurface(z, z2, eGLSurface);
            if (!createEGLWindowSurface) {
                return createEGLWindowSurface;
            }
            this.f192394m++;
            C86203l.m148116a("VideoSurfaceTexture", this + "update surface done serial = " + this.f192394m + "update time = " + this.f192399r);
            if (this.f192386e != EGL14.EGL_NO_SURFACE) {
                return true;
            }
            return false;
        }
        C86203l.m148116a("VideoSurfaceTexture", "surface change the same surface hashcode");
        this.f192392k.unlock();
        return false;
    }

    public final Bitmap saveFrame(Bundle bundle, VideoSurface.AbstractC86169c cVar) {
        MethodCollector.m26663i(942);
        Handler handler = this.f192393l;
        if (handler == null) {
            MethodCollector.m26664o(942);
            return null;
        } else if (cVar != null) {
            synchronized (this.f192379N) {
                try {
                    if (!this.f192379N.isEmpty()) {
                        this.f192379N.clear();
                    }
                    this.f192379N.putAll(bundle);
                    this.f192379N.putSerializable("callback", cVar);
                } finally {
                    MethodCollector.m26664o(942);
                }
            }
            if (this.f192380O != 1) {
                sendRenderMsg(1);
            }
            return null;
        } else {
            Message obtainMessage = handler.obtainMessage(14);
            this.f192401t.putSerializable("texture", this);
            obtainMessage.setData(this.f192401t);
            Message message = new Message();
            obtainMessage.obj = message;
            try {
                synchronized (message) {
                    try {
                        this.f192393l.sendMessageAtFrontOfQueue(obtainMessage);
                        message.wait(500);
                    } catch (Throwable th) {
                        MethodCollector.m26664o(942);
                        throw th;
                    }
                }
                if (message.obj == null && this.f192393l.hasMessages(14)) {
                    C86203l.m148116a("VideoSurfaceTexture", "render thread is busy");
                }
                C86203l.m148116a("VideoSurfaceTexture", "save frame done = " + message.obj);
                Bitmap bitmap = (Bitmap) message.obj;
                MethodCollector.m26664o(942);
                return bitmap;
            } catch (InterruptedException unused) {
                MethodCollector.m26664o(942);
                return null;
            }
        }
    }

    public final synchronized void setOption(int i, int i2) {
        MethodCollector.m26663i(1001);
        if (i != 2) {
            if (i == 3) {
                C86203l.m148116a("VideoSurfaceTexture", "set TEXTURE_OPTION_SET_OVERLAY_SYNC st:".concat(String.valueOf(this)));
                Message obtainMessage = this.f192393l.obtainMessage(31);
                obtainMessage.obj = this;
                obtainMessage.arg1 = i2;
                obtainMessage.sendToTarget();
                MethodCollector.m26664o(1001);
            } else if (i == 5) {
                this.f192373H = i2;
                MethodCollector.m26664o(1001);
            } else if (i == 6) {
                this.f192378M.put(5, Integer.valueOf(i2));
                MethodCollector.m26664o(1001);
            } else if (i == 9) {
                this.f192374I = i2;
                MethodCollector.m26664o(1001);
            } else if (i == 25) {
                for (int i3 = 0; i3 < i2; i3++) {
                    sendRenderMsg(1);
                }
                MethodCollector.m26664o(1001);
            } else if (i == 15) {
                this.f192378M.put(1, Integer.valueOf(i2));
                MethodCollector.m26664o(1001);
            } else if (i != 16) {
                Handler handler = this.f192393l;
                if (handler == null) {
                    MethodCollector.m26664o(1001);
                    return;
                }
                try {
                    Message obtainMessage2 = handler.obtainMessage(34);
                    obtainMessage2.obj = this;
                    obtainMessage2.arg1 = i;
                    obtainMessage2.arg2 = i2;
                    obtainMessage2.sendToTarget();
                    MethodCollector.m26664o(1001);
                } catch (Exception unused) {
                    MethodCollector.m26664o(1001);
                }
            } else {
                this.f192376K.mo136480a(1, i2);
                MethodCollector.m26664o(1001);
            }
        } else if (i2 != 1) {
            MethodCollector.m26664o(1001);
        } else {
            Handler handler2 = this.f192393l;
            if (handler2 == null) {
                MethodCollector.m26664o(1001);
                return;
            }
            try {
                Message obtainMessage3 = handler2.obtainMessage(33);
                obtainMessage3.obj = this;
                this.f192393l.sendMessageAtFrontOfQueue(obtainMessage3);
                MethodCollector.m26664o(1001);
            } catch (Exception unused2) {
                MethodCollector.m26664o(1001);
            }
        }
    }

    public final void bindEGLEnv(EGLContext eGLContext, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        if (eGLContext == null || eGLDisplay == null || eGLConfig == null) {
            throw new RuntimeException("no egl env for texture bind");
        }
        this.f192395n = eGLContext;
        this.f192396o = eGLDisplay;
        this.f192397p = eGLConfig;
    }

    public final void setOption(int i, int i2, int i3) {
        if (i == 19 && i2 >= 0) {
            this.f192378M.put(Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public C86211p(AbstractC86187b bVar, Handler handler, AbstractC86206n nVar) {
        super(bVar.mo136493c());
        bVar.mo136466a();
        this.f192382a = bVar;
        bVar.mo136494d();
        m148157a(handler);
        this.f192369D = new HashMap<>();
        this.f192375J = nVar;
    }

    public final boolean createEGLWindowSurface(boolean z, boolean z2, EGLSurface eGLSurface) {
        if (this.f192386e != EGL14.EGL_NO_SURFACE) {
            C86203l.m148116a("VideoSurfaceTexture", "destory previous surface = " + this.f192386e);
            if ((this.f192389h == null && z) || z2) {
                C86203l.m148116a("VideoSurfaceTexture", "make current to dummy surface due to non render surface, force:".concat(String.valueOf(z2)));
                EGL14.eglMakeCurrent(this.f192396o, eGLSurface, eGLSurface, this.f192395n);
            }
            EGL14.eglDestroySurface(this.f192396o, this.f192386e);
            this.f192386e = EGL14.EGL_NO_SURFACE;
            this.f192385d = false;
            C86203l.m148116a("VideoSurfaceTexture", "destory previous surface done = " + this.f192386e);
        }
        EGLSurface createEGLWindowSurface = createEGLWindowSurface(this.f192389h);
        this.f192386e = createEGLWindowSurface;
        if (createEGLWindowSurface == EGL14.EGL_NO_SURFACE) {
            return false;
        }
        try {
            makeCurrent();
            this.f192399r = System.nanoTime();
            return true;
        } catch (Exception unused) {
            C86203l.m148116a("VideoSurfaceTexture", "makeCurrent exception failed");
            return false;
        }
    }

    public final void frameMetaCallback(long j, long j2, Map<Integer, String> map) {
        String str;
        MethodCollector.m26663i(1124);
        C86203l.m148116a("VideoSurfaceTexture", "frameMetaCallback this:" + this + " pts:" + j + " mRenderHandler:" + this.f192393l);
        Handler handler = this.f192393l;
        if (handler == null) {
            MethodCollector.m26664o(1124);
        } else if ((this.f192373H & 4) == 0) {
            MethodCollector.m26664o(1124);
        } else if (this.f192391j == null) {
            C86203l.m148116a("VideoSurfaceTexture", "mOffScreenSurface null,return this:".concat(String.valueOf(this)));
            MethodCollector.m26664o(1124);
        } else {
            try {
                Message obtainMessage = handler.obtainMessage(32);
                Bundle bundle = new Bundle();
                bundle.putSerializable("update_frame_time", new C86188a.C86189a(j, j2));
                if (map != null) {
                    str = map.get(46);
                } else {
                    str = null;
                }
                bundle.putString("master_clock", str);
                bundle.putLong("master_clock_diff", SystemClock.elapsedRealtime());
                bundle.putSerializable("texture", this);
                obtainMessage.setData(bundle);
                obtainMessage.obj = this.f192372G;
                synchronized (this.f192372G) {
                    try {
                        obtainMessage.sendToTarget();
                        try {
                            this.f192372G.wait();
                            if (!(this.f192372G.arg1 == Integer.MIN_VALUE || ((long) this.f192372G.arg1) == j)) {
                                this.f192372G.wait();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } finally {
                        MethodCollector.m26664o(1124);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                MethodCollector.m26664o(1124);
            }
        }
    }

    public C86211p(AbstractC86187b bVar, boolean z, Handler handler, AbstractC86206n nVar) {
        super(bVar.mo136493c(), z);
        bVar.mo136466a();
        this.f192382a = bVar;
        bVar.mo136494d();
        m148157a(handler);
        this.f192369D = new HashMap<>();
        this.f192375J = nVar;
    }

    public final synchronized void setSuperResolutionConfig(int i, String str, String str2, String str3, int i2, int i3, String str4) {
        MethodCollector.m26663i(272);
        Handler handler = this.f192393l;
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(12);
            obtainMessage.obj = this;
            Bundle bundle = new Bundle();
            bundle.putInt("effect_type", 5);
            bundle.putInt("action", 21);
            bundle.putInt("srAlgType", i);
            bundle.putInt("srMaxSizeWidth", i2);
            bundle.putInt("srMaxSizeHeight", i3);
            bundle.putString("kernelBinPath", str);
            bundle.putString("oclModleName", str2);
            bundle.putString("dspModleName", str3);
            bundle.putString("moduleName", str4);
            obtainMessage.setData(bundle);
            this.f192393l.sendMessageAtFrontOfQueue(obtainMessage);
        }
        MethodCollector.m26664o(272);
    }
}
