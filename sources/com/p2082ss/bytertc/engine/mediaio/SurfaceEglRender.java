package com.p2082ss.bytertc.engine.mediaio;

import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.bytertc.engine.p4399ui.VideoFrameRender;
import com.p2082ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.SoftReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.EglBase;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceEglRenderer;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;

/* renamed from: com.ss.bytertc.engine.mediaio.SurfaceEglRender */
public class SurfaceEglRender extends SurfaceEglRenderer {
    private SurfaceHolder.Callback mCallback;
    private final AtomicBoolean mHasBindAtomic = new AtomicBoolean(false);
    private final AtomicBoolean mHasInitAtomic = new AtomicBoolean(false);
    private final Object mSurfaceCallbackLock = new Object();
    private VideoFrameRender.SurfaceLifecycleCallback mSurfaceLifecycleCallback;
    private final Object mSurfaceLifecycleCallbackLock = new Object();
    private SoftReference<SurfaceView> surfaceViewSoftReference = new SoftReference<>(null);

    static {
        Covode.recordClassIndex(101118);
    }

    @Override // org.webrtc.SurfaceEglRenderer, org.webrtc.EglRenderer
    public void release() {
        SurfaceView surfaceView;
        if (this.mHasInitAtomic.compareAndSet(true, false)) {
            LogUtil.m147885d("SurfaceEglRender", "release");
            super.release();
            this.mHasBindAtomic.compareAndSet(true, false);
            SoftReference<SurfaceView> softReference = this.surfaceViewSoftReference;
            if (softReference != null && (surfaceView = softReference.get()) != null) {
                surfaceView.getHolder().removeCallback(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("TextureEglRenderer has not init or already released!!!!!");
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    @Override // org.webrtc.SurfaceEglRenderer, org.webrtc.EglRenderer, org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (this.mHasInitAtomic.get() && this.mHasBindAtomic.get()) {
            super.onFrame(videoFrame);
        }
    }

    public void setSurfaceHolderCallback(SurfaceHolder.Callback callback) {
        MethodCollector.m26663i(198);
        synchronized (this.mSurfaceCallbackLock) {
            try {
                this.mCallback = callback;
            } finally {
                MethodCollector.m26664o(198);
            }
        }
    }

    public void setSurfaceLifecycleLisenter(VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback) {
        MethodCollector.m26663i(229);
        synchronized (this.mSurfaceLifecycleCallbackLock) {
            try {
                this.mSurfaceLifecycleCallback = surfaceLifecycleCallback;
            } finally {
                MethodCollector.m26664o(229);
            }
        }
    }

    public SurfaceEglRender(String str) {
        super(str);
    }

    public void bind(SurfaceView surfaceView) {
        if (!this.mHasInitAtomic.get()) {
            throw new IllegalStateException("TextureEglRenderer has not init!!!!!!");
        } else if (this.mHasBindAtomic.compareAndSet(false, true)) {
            LogUtil.m147885d("SurfaceEglRender", "bind");
            runOnUIThread(new SurfaceEglRender$$Lambda$0(this, surfaceView));
        } else {
            throw new IllegalStateException("Called bind functions multiple times!!!!!!");
        }
    }

    @Override // org.webrtc.SurfaceEglRenderer
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        MethodCollector.m26663i(965);
        super.surfaceCreated(surfaceHolder);
        LogUtil.m147885d("SurfaceEglRender", "surfaceCreated");
        synchronized (this.mSurfaceLifecycleCallbackLock) {
            try {
                VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = this.mSurfaceLifecycleCallback;
                if (surfaceLifecycleCallback != null) {
                    surfaceLifecycleCallback.onCreated();
                }
            } finally {
                MethodCollector.m26664o(965);
            }
        }
    }

    @Override // org.webrtc.SurfaceEglRenderer
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        MethodCollector.m26663i(970);
        super.surfaceDestroyed(surfaceHolder);
        LogUtil.m147885d("SurfaceEglRender", "surfaceDestroyed");
        synchronized (this.mSurfaceLifecycleCallbackLock) {
            try {
                VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = this.mSurfaceLifecycleCallback;
                if (surfaceLifecycleCallback != null) {
                    surfaceLifecycleCallback.onDestroy();
                }
            } finally {
                MethodCollector.m26664o(970);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$bind$0$SurfaceEglRender(SurfaceView surfaceView) {
        MethodCollector.m26663i(982);
        SurfaceHolder holder = surfaceView.getHolder();
        synchronized (this.mSurfaceCallbackLock) {
            try {
                SurfaceHolder.Callback callback = this.mCallback;
                if (callback != null) {
                    holder.addCallback(callback);
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(982);
                throw th;
            }
        }
        this.surfaceViewSoftReference = new SoftReference<>(surfaceView);
        if (holder.getSurface() != null && holder.getSurface().isValid()) {
            setLayoutAspectRatio(((float) surfaceView.getMeasuredWidth()) / ((float) surfaceView.getMeasuredHeight()));
            surfaceCreated(holder);
        }
        holder.addCallback(this);
        MethodCollector.m26664o(982);
    }

    @Override // org.webrtc.SurfaceEglRenderer, org.webrtc.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        if (this.mHasInitAtomic.compareAndSet(false, true)) {
            LogUtil.m147885d("SurfaceEglRender", "init");
            super.init(context, iArr, glDrawer);
            return;
        }
        throw new IllegalStateException("SurfaceEglRender has already init!!!!!!");
    }

    @Override // org.webrtc.SurfaceEglRenderer
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        super.surfaceChanged(surfaceHolder, i, i2, i3);
        LogUtil.m147885d("SurfaceEglRender", "surfaceChanged");
    }
}
