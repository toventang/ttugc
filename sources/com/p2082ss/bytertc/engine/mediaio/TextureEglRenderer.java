package com.p2082ss.bytertc.engine.mediaio;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.bytertc.engine.p4399ui.VideoFrameRender;
import com.p2082ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;

/* renamed from: com.ss.bytertc.engine.mediaio.TextureEglRenderer */
public class TextureEglRenderer extends EglRenderer implements TextureView.SurfaceTextureListener {
    private final AtomicBoolean mHasBindAtomic = new AtomicBoolean(false);
    private final AtomicBoolean mHasInitAtomic = new AtomicBoolean(false);
    private VideoFrameRender.SurfaceLifecycleCallback mSurfaceLifecycleCallback;
    private TextureView.SurfaceTextureListener mSurfaceTextureListener;
    private final Object mSurfaceTextureListenerLock = new Object();
    private volatile WeakReference<TextureView> mTextureViewRef = new WeakReference<>(null);
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(101120);
    }

    @Override // org.webrtc.EglRenderer
    public void release() {
        TextureView textureView;
        if (this.mHasInitAtomic.compareAndSet(true, false)) {
            LogUtil.m147885d("TextureEglRenderer", "release");
            super.release();
            this.mHasBindAtomic.compareAndSet(true, false);
            if (this.mTextureViewRef != null && (textureView = this.mTextureViewRef.get()) != null) {
                textureView.setSurfaceTextureListener(null);
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

    public final /* synthetic */ void lambda$bind$0$TextureEglRenderer(TextureView textureView) {
        if (textureView.getSurfaceTexture() != null) {
            createEglSurface(textureView.getSurfaceTexture());
            VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = this.mSurfaceLifecycleCallback;
            if (surfaceLifecycleCallback != null) {
                surfaceLifecycleCallback.onCreated();
            }
        }
        textureView.setSurfaceTextureListener(this);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        MethodCollector.m26663i(259);
        synchronized (this.mSurfaceTextureListenerLock) {
            try {
                TextureView.SurfaceTextureListener surfaceTextureListener = this.mSurfaceTextureListener;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
                }
            } finally {
                MethodCollector.m26664o(259);
            }
        }
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        MethodCollector.m26663i(250);
        synchronized (this.mSurfaceTextureListenerLock) {
            try {
                this.mSurfaceTextureListener = surfaceTextureListener;
            } finally {
                MethodCollector.m26664o(250);
            }
        }
    }

    public TextureEglRenderer(String str) {
        super(str);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        MethodCollector.m26663i(257);
        ThreadUtils.checkIsOnMainThread();
        LogUtil.m147885d("TextureEglRenderer", "onSurfaceTextureDestroyed");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(TextureEglRenderer$$Lambda$1.get$Lambda(countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = this.mSurfaceLifecycleCallback;
        if (surfaceLifecycleCallback != null) {
            surfaceLifecycleCallback.onDestroy();
        }
        synchronized (this.mSurfaceTextureListenerLock) {
            try {
                TextureView.SurfaceTextureListener surfaceTextureListener = this.mSurfaceTextureListener;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
                }
            } finally {
                MethodCollector.m26664o(257);
            }
        }
        return true;
    }

    @Override // org.webrtc.EglRenderer, org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        if (this.mHasInitAtomic.get() && this.mHasBindAtomic.get() && this.mTextureViewRef != null) {
            TextureView textureView = this.mTextureViewRef.get();
            if (videoFrame != null && textureView != null && textureView.isShown()) {
                if (!(videoFrame.getBuffer() instanceof CountDownLatchI420Buffer) || !(textureView instanceof IVideoSink)) {
                    super.onFrame(videoFrame);
                    return;
                }
                CountDownLatchI420Buffer countDownLatchI420Buffer = (CountDownLatchI420Buffer) videoFrame.getBuffer();
                countDownLatchI420Buffer.retain();
                if (!postOnMainThreadAndLock(new TextureEglRenderer$$Lambda$2(this, videoFrame, countDownLatchI420Buffer), countDownLatchI420Buffer.getLatch())) {
                    countDownLatchI420Buffer.release();
                }
            }
        }
    }

    public final /* synthetic */ void lambda$onFrame$1$TextureEglRenderer(VideoFrame videoFrame, CountDownLatchI420Buffer countDownLatchI420Buffer) {
        super.onFrame(videoFrame);
        countDownLatchI420Buffer.release();
    }

    private boolean postOnMainThreadAndLock(Runnable runnable, CountDownLatch countDownLatch) {
        return this.mainHandler.post(new TextureEglRenderer$$Lambda$3(runnable, countDownLatch));
    }

    static final /* synthetic */ void lambda$postOnMainThreadAndLock$2$TextureEglRenderer(Runnable runnable, CountDownLatch countDownLatch) {
        runnable.run();
        try {
            if (countDownLatch.getCount() != 0) {
                countDownLatch.await();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void bind(TextureView textureView, VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback) {
        if (!this.mHasInitAtomic.get()) {
            throw new IllegalStateException("TextureEglRenderer has not init!!!!!!");
        } else if (this.mHasBindAtomic.compareAndSet(false, true)) {
            LogUtil.m147885d("TextureEglRenderer", "bind");
            this.mTextureViewRef = new WeakReference<>(textureView);
            this.mSurfaceLifecycleCallback = surfaceLifecycleCallback;
            runOnUIThread(new TextureEglRenderer$$Lambda$0(this, textureView));
        } else {
            throw new IllegalStateException("Called bind functions multiple times!!!!!!");
        }
    }

    @Override // org.webrtc.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        if (this.mHasInitAtomic.compareAndSet(false, true)) {
            LogUtil.m147885d("TextureEglRenderer", "init");
            super.init(context, iArr, glDrawer);
            return;
        }
        throw new IllegalStateException("TextureEglRenderer has already init!!!!!!");
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        MethodCollector.m26663i(254);
        ThreadUtils.checkIsOnMainThread();
        LogUtil.m147885d("TextureEglRenderer", "onSurfaceTextureAvailable");
        createEglSurface(surfaceTexture);
        VideoFrameRender.SurfaceLifecycleCallback surfaceLifecycleCallback = this.mSurfaceLifecycleCallback;
        if (surfaceLifecycleCallback != null) {
            surfaceLifecycleCallback.onCreated();
        }
        synchronized (this.mSurfaceTextureListenerLock) {
            try {
                TextureView.SurfaceTextureListener surfaceTextureListener = this.mSurfaceTextureListener;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
                }
            } finally {
                MethodCollector.m26664o(254);
            }
        }
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        MethodCollector.m26663i(255);
        LogUtil.m147885d("TextureEglRenderer", "onSurfaceTextureSizeChanged");
        synchronized (this.mSurfaceTextureListenerLock) {
            try {
                TextureView.SurfaceTextureListener surfaceTextureListener = this.mSurfaceTextureListener;
                if (surfaceTextureListener != null) {
                    surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                }
            } finally {
                MethodCollector.m26664o(255);
            }
        }
    }
}
