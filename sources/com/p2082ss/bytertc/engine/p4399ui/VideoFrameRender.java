package com.p2082ss.bytertc.engine.p4399ui;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.bytertc.engine.adapter.VideoFrameConverter;
import com.p2082ss.bytertc.engine.mediaio.CountDownLatchI420Buffer;
import com.p2082ss.bytertc.engine.mediaio.IVideoFrameConsumer;
import com.p2082ss.bytertc.engine.mediaio.RTCVideoFrame;
import com.p2082ss.bytertc.engine.mediaio.SurfaceEglRender;
import com.p2082ss.bytertc.engine.mediaio.TextureEglRenderer;
import com.p2082ss.bytertc.engine.utils.ByteBufferUtils;
import com.p2082ss.bytertc.engine.utils.LogUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.GlRectDrawer;
import org.webrtc.JavaI420Buffer;
import org.webrtc.RendererCommon;
import org.webrtc.TextureBufferImpl;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
import org.webrtc.YuvConverter;

/* renamed from: com.ss.bytertc.engine.ui.VideoFrameRender */
public class VideoFrameRender implements View.OnLayoutChangeListener, IVideoFrameConsumer, EglRenderer.FirstVideoFrameRenderListener, RendererCommon.RendererEvents {
    private boolean enableFixedSize;
    private final VideoFrameConverter frameConverter;
    private volatile EglRenderer mEglRenderer;
    public final AtomicBoolean mEglSurfaceCreatedAtomic = new AtomicBoolean(false);
    private final Object mFirstFrameListenerLock = new Object();
    private final ArrayList<FirstVideoFrameRenderListener> mFirstVideoFrameListeners = new ArrayList<>();
    public final AtomicBoolean mHasInitAtomic = new AtomicBoolean(false);
    private boolean mHasReceivedFirstFrame;
    private final AtomicBoolean mHasRenderViewAtomic = new AtomicBoolean(false);
    private long mReceiveFirstTimeStamp;
    private final Object mRenderLock = new Object();
    private final String mRenderName;
    private volatile Surface mSurface;
    private final SurfaceLifecycleCallback mSurfaceLifecycleCallbackCallback;
    private volatile SurfaceView mSurfaceView;
    private final Object mTextureProcessLock = new Object();
    private Looper mTextureProcessLooper;
    private volatile TextureView mTextureView;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;
    private int surfaceHeight;
    private int surfaceWidth;

    /* renamed from: com.ss.bytertc.engine.ui.VideoFrameRender$FirstVideoFrameRenderListener */
    public interface FirstVideoFrameRenderListener {
        static {
            Covode.recordClassIndex(101138);
        }

        void onFirstVideoFrameRender(int i);
    }

    /* renamed from: com.ss.bytertc.engine.ui.VideoFrameRender$SurfaceLifecycleCallback */
    public interface SurfaceLifecycleCallback {
        static {
            Covode.recordClassIndex(101139);
        }

        void onCreated();

        void onDestroy();
    }

    static {
        Covode.recordClassIndex(101129);
    }

    static final /* synthetic */ void lambda$renderTextureFrame$2$VideoFrameRender() {
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
    }

    @Override // org.webrtc.EglRenderer.FirstVideoFrameRenderListener
    public void onFirstVideoFrameRender() {
        notifyFristRenderCallback();
    }

    public void release() {
        onDispose();
    }

    public void disableFpsReduction() {
        MethodCollector.m26663i(972);
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer != null) {
                    this.mEglRenderer.disableFpsReduction();
                }
            } finally {
                MethodCollector.m26664o(972);
            }
        }
    }

    private void initSurfaceView() {
        MethodCollector.m26663i(501);
        if (this.mSurfaceView == null || !this.mHasInitAtomic.get()) {
            MethodCollector.m26664o(501);
            return;
        }
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer instanceof SurfaceEglRender) {
                    ((SurfaceEglRender) this.mEglRenderer).bind(this.mSurfaceView);
                    this.mSurfaceView.addOnLayoutChangeListener(this);
                }
            } finally {
                MethodCollector.m26664o(501);
            }
        }
    }

    private void notifyFristRenderCallback() {
        MethodCollector.m26663i(1035);
        synchronized (this.mFirstFrameListenerLock) {
            try {
                if (!this.mFirstVideoFrameListeners.isEmpty()) {
                    int currentTimeMillis = (int) (System.currentTimeMillis() - this.mReceiveFirstTimeStamp);
                    Iterator<FirstVideoFrameRenderListener> it = this.mFirstVideoFrameListeners.iterator();
                    while (it.hasNext()) {
                        it.next().onFirstVideoFrameRender(currentTimeMillis);
                    }
                    MethodCollector.m26664o(1035);
                }
            } finally {
                MethodCollector.m26664o(1035);
            }
        }
    }

    public void onStart() {
        if (this.mHasRenderViewAtomic.get() && this.mHasInitAtomic.get()) {
            if (this.mTextureView != null) {
                initTextureView();
            } else if (this.mSurfaceView != null) {
                initSurfaceView();
            }
        }
    }

    private void initTextureView() {
        MethodCollector.m26663i(513);
        if (this.mTextureView == null || this.mEglRenderer == null || !this.mHasInitAtomic.get()) {
            MethodCollector.m26664o(513);
            return;
        }
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer instanceof TextureEglRenderer) {
                    TextureEglRenderer textureEglRenderer = (TextureEglRenderer) this.mEglRenderer;
                    textureEglRenderer.bind(this.mTextureView, this.mSurfaceLifecycleCallbackCallback);
                    if (this.mTextureView.isShown()) {
                        textureEglRenderer.setLayoutAspectRatio(((float) this.mTextureView.getMeasuredWidth()) / ((float) this.mTextureView.getMeasuredHeight()));
                    }
                    this.mTextureView.addOnLayoutChangeListener(this);
                }
            } finally {
                MethodCollector.m26664o(513);
            }
        }
    }

    public void onDispose() {
        MethodCollector.m26663i(562);
        if (this.mHasInitAtomic.compareAndSet(true, false)) {
            synchronized (this.mRenderLock) {
                try {
                    if (this.mEglRenderer != null) {
                        this.mEglRenderer.release();
                        this.mEglRenderer.createEglSurface((Surface) null);
                    }
                    if (this.mSurfaceView != null) {
                        this.mSurfaceView.removeOnLayoutChangeListener(this);
                    } else if (this.mTextureView != null) {
                        this.mTextureView.setSurfaceTextureListener(null);
                        this.mTextureView.removeOnLayoutChangeListener(this);
                    }
                    this.mEglSurfaceCreatedAtomic.set(false);
                } finally {
                    MethodCollector.m26664o(562);
                }
            }
            synchronized (this.mFirstFrameListenerLock) {
                try {
                    this.mFirstVideoFrameListeners.clear();
                } finally {
                    MethodCollector.m26664o(562);
                }
            }
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Try to dispose an not initialized VideoFrameRender");
        MethodCollector.m26664o(562);
        throw illegalStateException;
    }

    private void updateSurfaceSize() {
        ThreadUtils.checkIsOnMainThread();
        if (!this.enableFixedSize || this.rotatedFrameWidth == 0 || this.rotatedFrameHeight == 0 || this.mSurfaceView.getWidth() == 0 || this.mSurfaceView.getHeight() == 0) {
            this.surfaceHeight = 0;
            this.surfaceWidth = 0;
            this.mSurfaceView.getHolder().setSizeFromLayout();
            return;
        }
        float width = ((float) this.mSurfaceView.getWidth()) / ((float) this.mSurfaceView.getHeight());
        int i = this.rotatedFrameWidth;
        int i2 = this.rotatedFrameHeight;
        if (((float) i) / ((float) i2) > width) {
            i = (int) (((float) i2) * width);
        } else {
            i2 = (int) (((float) i) / width);
        }
        int min = Math.min(this.mSurfaceView.getWidth(), i);
        int min2 = Math.min(this.mSurfaceView.getHeight(), i2);
        LogUtil.m147885d("VideoFrameRender", "updateSurfaceSize. Layout size: " + this.mSurfaceView.getWidth() + "x" + this.mSurfaceView.getHeight() + ", frame size: " + this.rotatedFrameWidth + "x" + this.rotatedFrameHeight + ", requested surface size: " + min + "x" + min2 + ", old surface size: " + this.surfaceWidth + "x" + this.surfaceHeight);
        if (min != this.surfaceWidth || min2 != this.surfaceHeight) {
            this.surfaceWidth = min;
            this.surfaceHeight = min2;
            this.mSurfaceView.getHolder().setFixedSize(min, min2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$init$0$VideoFrameRender(EglBase.Context context) {
        this.mEglRenderer.init(context, EglBase.CONFIG_PLAIN, new GlRectDrawer());
    }

    public void setEnableHardwareScaler(boolean z) {
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z;
        if (this.mSurfaceView != null) {
            updateSurfaceSize();
        }
    }

    private void postOrRun(Runnable runnable) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        }
    }

    private void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public void setFpsReduction(float f) {
        MethodCollector.m26663i(958);
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer != null) {
                    this.mEglRenderer.setFpsReduction(f);
                }
            } finally {
                MethodCollector.m26664o(958);
            }
        }
    }

    public void setFristVideoFrameRenderListener(FirstVideoFrameRenderListener firstVideoFrameRenderListener) {
        MethodCollector.m26663i(1028);
        synchronized (this.mFirstFrameListenerLock) {
            try {
                this.mFirstVideoFrameListeners.add(firstVideoFrameRenderListener);
            } finally {
                MethodCollector.m26664o(1028);
            }
        }
    }

    public void setMirror(boolean z) {
        MethodCollector.m26663i(624);
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer != null) {
                    this.mEglRenderer.setMirror(z);
                }
            } finally {
                MethodCollector.m26664o(624);
            }
        }
    }

    public void setProcessTextureLopper(Looper looper) {
        MethodCollector.m26663i(927);
        synchronized (this.mTextureProcessLock) {
            try {
                this.mTextureProcessLooper = looper;
            } finally {
                MethodCollector.m26664o(927);
            }
        }
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        MethodCollector.m26663i(622);
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer != null) {
                    this.mEglRenderer.setRenderModel(scalingType);
                }
            } finally {
                MethodCollector.m26664o(622);
            }
        }
    }

    private void onVideoFrame(VideoFrame videoFrame) {
        MethodCollector.m26663i(619);
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglSurfaceCreatedAtomic.get() && this.mEglRenderer != null) {
                    if (!this.mHasReceivedFirstFrame) {
                        this.mReceiveFirstTimeStamp = System.currentTimeMillis();
                        this.mHasReceivedFirstFrame = true;
                    }
                    this.mEglRenderer.onFrame(videoFrame);
                    MethodCollector.m26664o(619);
                }
            } finally {
                MethodCollector.m26664o(619);
            }
        }
    }

    @Override // com.p2082ss.bytertc.engine.mediaio.IVideoFrameConsumer
    public void consumeVideoFrame(RTCVideoFrame rTCVideoFrame) {
        if (rTCVideoFrame != null) {
            if (rTCVideoFrame.format == 1) {
                renderI420Frame(rTCVideoFrame, rTCVideoFrame.stride, rTCVideoFrame.height, rTCVideoFrame.rotation, rTCVideoFrame.timestamp);
            } else if (rTCVideoFrame.format == 10) {
                if (this.mTextureProcessLooper == null) {
                    this.mTextureProcessLooper = Looper.getMainLooper();
                }
                renderTextureFrame(rTCVideoFrame.textureId, VideoFrame.TextureBuffer.Type.RGB, rTCVideoFrame.stride, rTCVideoFrame.height, rTCVideoFrame.rotation, rTCVideoFrame.timestamp, rTCVideoFrame.transform, this.mTextureProcessLooper);
            }
        }
    }

    public void setRenderView(Surface surface) {
        MethodCollector.m26663i(479);
        if (this.mEglSurfaceCreatedAtomic.get() || surface == null || !this.mHasRenderViewAtomic.compareAndSet(false, true)) {
            MethodCollector.m26664o(479);
            return;
        }
        synchronized (this.mRenderLock) {
            try {
                this.mSurface = surface;
                new EglRenderer(this.mRenderName).createEglSurface(surface);
            } catch (Throwable th) {
                MethodCollector.m26664o(479);
                throw th;
            }
        }
        this.mEglSurfaceCreatedAtomic.compareAndSet(false, true);
        MethodCollector.m26664o(479);
    }

    public VideoFrameRender(String str) {
        this.mRenderName = str;
        this.frameConverter = new VideoFrameConverter(true);
        this.mSurfaceLifecycleCallbackCallback = new SurfaceLifecycleCallback() {
            /* class com.p2082ss.bytertc.engine.p4399ui.VideoFrameRender.C860991 */

            static {
                Covode.recordClassIndex(101135);
            }

            @Override // com.p2082ss.bytertc.engine.p4399ui.VideoFrameRender.SurfaceLifecycleCallback
            public void onCreated() {
                if (!VideoFrameRender.this.mEglSurfaceCreatedAtomic.compareAndSet(false, true)) {
                    LogUtil.m147886e("VideoFrameRender", "Already has an another surface created.");
                }
            }

            @Override // com.p2082ss.bytertc.engine.p4399ui.VideoFrameRender.SurfaceLifecycleCallback
            public void onDestroy() {
                if (!VideoFrameRender.this.mHasInitAtomic.get()) {
                    VideoFrameRender.this.mEglSurfaceCreatedAtomic.set(false);
                } else if (!VideoFrameRender.this.mEglSurfaceCreatedAtomic.compareAndSet(true, false)) {
                    LogUtil.m147886e("VideoFrameRender", "Already has an another surface destroyed.");
                }
            }
        };
    }

    public void init(EglBase.Context context) {
        MethodCollector.m26663i(618);
        if (this.mHasInitAtomic.compareAndSet(false, true)) {
            synchronized (this.mRenderLock) {
                try {
                    if (this.mSurfaceView != null || this.mSurface != null || this.mTextureView != null || this.mEglRenderer != null) {
                        this.rotatedFrameWidth = 0;
                        this.rotatedFrameHeight = 0;
                        if (this.mEglRenderer instanceof SurfaceEglRender) {
                            ThreadUtils.invokeAtFrontUninterruptibly(new Handler(Looper.getMainLooper()), new VideoFrameRender$$Lambda$0(this, context));
                        } else {
                            this.mEglRenderer.init(context, EglBase.CONFIG_PLAIN, new GlRectDrawer());
                        }
                        MethodCollector.m26664o(618);
                    }
                } finally {
                    MethodCollector.m26664o(618);
                }
            }
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Already initialized");
            MethodCollector.m26664o(618);
            throw illegalStateException;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$onFrameResolutionChanged$1$VideoFrameRender(int i, int i2) {
        this.rotatedFrameWidth = i;
        this.rotatedFrameHeight = i2;
    }

    public void setRenderView(SurfaceView surfaceView, SurfaceHolder.Callback callback) {
        MethodCollector.m26663i(473);
        if (this.mEglSurfaceCreatedAtomic.get() || surfaceView == null || !this.mHasRenderViewAtomic.compareAndSet(false, true)) {
            MethodCollector.m26664o(473);
            return;
        }
        this.mSurfaceView = surfaceView;
        synchronized (this.mRenderLock) {
            try {
                SurfaceEglRender surfaceEglRender = new SurfaceEglRender(this.mRenderName);
                surfaceEglRender.setSurfaceHolderCallback(callback);
                surfaceEglRender.setSurfaceLifecycleLisenter(this.mSurfaceLifecycleCallbackCallback);
                this.mEglRenderer = surfaceEglRender;
                this.mEglRenderer.addFristFrameListener(this);
            } finally {
                MethodCollector.m26664o(473);
            }
        }
    }

    public void setRenderView(TextureView textureView, TextureView.SurfaceTextureListener surfaceTextureListener) {
        MethodCollector.m26663i(497);
        if (this.mEglSurfaceCreatedAtomic.get() || textureView == null || !this.mHasRenderViewAtomic.compareAndSet(false, true)) {
            MethodCollector.m26664o(497);
            return;
        }
        synchronized (this.mRenderLock) {
            try {
                this.mTextureView = textureView;
                TextureEglRenderer textureEglRenderer = new TextureEglRenderer(this.mRenderName);
                textureEglRenderer.setSurfaceTextureListener(surfaceTextureListener);
                this.mEglRenderer = textureEglRenderer;
                this.mEglRenderer.addFristFrameListener(this);
            } finally {
                MethodCollector.m26664o(497);
            }
        }
    }

    static final /* synthetic */ void lambda$createYUV$3$VideoFrameRender(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        MethodCollector.m26663i(1049);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer2);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer3);
        MethodCollector.m26664o(1049);
    }

    static final /* synthetic */ void lambda$createYUV$4$VideoFrameRender(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        MethodCollector.m26663i(1041);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer2);
        ByteBufferUtils.nativeReleaseBuffer(byteBuffer3);
        MethodCollector.m26664o(1041);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
        if (r5 != 0) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r5 == 180) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        postOrRun(new com.p2082ss.bytertc.engine.p4399ui.VideoFrameRender$$Lambda$1(r2, r1, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        return;
     */
    @Override // org.webrtc.RendererCommon.RendererEvents
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFrameResolutionChanged(int r3, int r4, int r5) {
        /*
            r2 = this;
            r0 = 180(0xb4, float:2.52E-43)
            if (r5 == 0) goto L_0x0006
            if (r5 != r0) goto L_0x0015
        L_0x0006:
            r1 = r3
            if (r5 == 0) goto L_0x000b
        L_0x0009:
            if (r5 != r0) goto L_0x000c
        L_0x000b:
            r3 = r4
        L_0x000c:
            com.ss.bytertc.engine.ui.VideoFrameRender$$Lambda$1 r0 = new com.ss.bytertc.engine.ui.VideoFrameRender$$Lambda$1
            r0.<init>(r2, r1, r3)
            r2.postOrRun(r0)
            return
        L_0x0015:
            r1 = r4
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.bytertc.engine.p4399ui.VideoFrameRender.onFrameResolutionChanged(int, int, int):void");
    }

    private VideoFrame.Buffer createYUV(final RTCVideoFrame rTCVideoFrame, int i, int i2) {
        if (rTCVideoFrame == null || rTCVideoFrame.buffer == null || rTCVideoFrame.buffer.remaining() <= 0) {
            return null;
        }
        int i3 = (i + 1) / 2;
        int i4 = (i * i2) + 0;
        int i5 = ((i2 + 1) / 2) * i3;
        int i6 = i4 + i5;
        rTCVideoFrame.buffer.position(0);
        rTCVideoFrame.buffer.limit(i4);
        ByteBuffer slice = rTCVideoFrame.buffer.slice();
        rTCVideoFrame.buffer.position(i4);
        rTCVideoFrame.buffer.limit(i6);
        ByteBuffer slice2 = rTCVideoFrame.buffer.slice();
        rTCVideoFrame.buffer.position(i6);
        rTCVideoFrame.buffer.limit(i6 + i5);
        ByteBuffer slice3 = rTCVideoFrame.buffer.slice();
        rTCVideoFrame.retain();
        if (this.mEglRenderer instanceof TextureEglRenderer) {
            return CountDownLatchI420Buffer.wrap(i, i2, slice, i, slice2, i3, slice3, i3, new Runnable() {
                /* class com.p2082ss.bytertc.engine.p4399ui.VideoFrameRender.RunnableC861002 */

                static {
                    Covode.recordClassIndex(101136);
                }

                public void run() {
                    rTCVideoFrame.release();
                }
            });
        }
        return JavaI420Buffer.wrap(i, i2, slice, i, slice2, i3, slice3, i3, new Runnable() {
            /* class com.p2082ss.bytertc.engine.p4399ui.VideoFrameRender.RunnableC861013 */

            static {
                Covode.recordClassIndex(101137);
            }

            public void run() {
                rTCVideoFrame.release();
            }
        });
    }

    private VideoFrame.Buffer createYUV(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(925);
        if (bArr == null || bArr.length == 0) {
            MethodCollector.m26664o(925);
            return null;
        }
        int i3 = (i + 1) / 2;
        int i4 = i * i2;
        int i5 = ((i2 + 1) / 2) * i3;
        ByteBuffer nativeAllocateBuffer = ByteBufferUtils.nativeAllocateBuffer(i4);
        ByteBuffer nativeAllocateBuffer2 = ByteBufferUtils.nativeAllocateBuffer(i5);
        ByteBuffer nativeAllocateBuffer3 = ByteBufferUtils.nativeAllocateBuffer(i5);
        nativeAllocateBuffer.put(bArr, 0, i4);
        nativeAllocateBuffer2.put(bArr, i4, i5);
        nativeAllocateBuffer3.put(bArr, i4 + i5, i5);
        nativeAllocateBuffer.position(0);
        nativeAllocateBuffer2.position(0);
        nativeAllocateBuffer3.position(0);
        if (this.mEglRenderer instanceof TextureEglRenderer) {
            CountDownLatchI420Buffer wrap = CountDownLatchI420Buffer.wrap(i, i2, nativeAllocateBuffer, i, nativeAllocateBuffer2, i3, nativeAllocateBuffer3, i3, new VideoFrameRender$$Lambda$3(nativeAllocateBuffer, nativeAllocateBuffer2, nativeAllocateBuffer3));
            MethodCollector.m26664o(925);
            return wrap;
        }
        JavaI420Buffer wrap2 = JavaI420Buffer.wrap(i, i2, nativeAllocateBuffer, i, nativeAllocateBuffer2, i3, nativeAllocateBuffer3, i3, new VideoFrameRender$$Lambda$4(nativeAllocateBuffer, nativeAllocateBuffer2, nativeAllocateBuffer3));
        MethodCollector.m26664o(925);
        return wrap2;
    }

    private void renderI420Frame(RTCVideoFrame rTCVideoFrame, int i, int i2, int i3, long j) {
        VideoFrame.Buffer createYUV;
        if (rTCVideoFrame != null && rTCVideoFrame.buffer != null) {
            if (rTCVideoFrame.buffer.isDirect()) {
                createYUV = createYUV(rTCVideoFrame, i, i2);
            } else {
                createYUV = createYUV(rTCVideoFrame.buffer.array(), i, i2);
            }
            if (createYUV != null) {
                VideoFrame videoFrame = new VideoFrame(createYUV, i3, j);
                onVideoFrame(videoFrame);
                videoFrame.release();
            }
        }
    }

    private void renderI420Frame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        VideoFrameConverter videoFrameConverter;
        VideoFrame.I420Buffer convertToJavaI420Buffer;
        if (byteBuffer != null && (videoFrameConverter = this.frameConverter) != null) {
            if (this.mEglRenderer instanceof TextureEglRenderer) {
                convertToJavaI420Buffer = videoFrameConverter.convertToJavaI420Buffer(byteBuffer, i, i2, true);
            } else {
                convertToJavaI420Buffer = videoFrameConverter.convertToJavaI420Buffer(byteBuffer, i, i2, false);
            }
            if (convertToJavaI420Buffer != null) {
                VideoFrame videoFrame = new VideoFrame(convertToJavaI420Buffer, i3, j);
                onVideoFrame(videoFrame);
                videoFrame.release();
            }
        }
    }

    private void renderI420Frame(byte[] bArr, int i, int i2, int i3, long j) {
        VideoFrameConverter videoFrameConverter;
        VideoFrame.I420Buffer convertToJavaI420Buffer;
        if (bArr != null && bArr.length > 0 && (videoFrameConverter = this.frameConverter) != null) {
            if (this.mEglRenderer instanceof TextureEglRenderer) {
                convertToJavaI420Buffer = videoFrameConverter.convertToJavaI420Buffer(bArr, i, i2, true);
            } else {
                convertToJavaI420Buffer = videoFrameConverter.convertToJavaI420Buffer(bArr, i, i2, false);
            }
            if (convertToJavaI420Buffer != null) {
                VideoFrame videoFrame = new VideoFrame(convertToJavaI420Buffer, i3, j);
                onVideoFrame(videoFrame);
                videoFrame.release();
            }
        }
    }

    public void consumeByteArrayFrame(byte[] bArr, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        if (i == 1) {
            renderI420Frame(bArr, i2, i3, i4, j);
        }
    }

    public void consumeByteBufferFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, long j) {
        if (i == 1) {
            renderI420Frame(byteBuffer, i2, i3, i4, j);
        }
    }

    private void renderTextureFrame(int i, VideoFrame.TextureBuffer.Type type, int i2, int i3, int i4, long j, float[] fArr, Looper looper) {
        VideoFrame videoFrame = new VideoFrame(new TextureBufferImpl(i2, i3, type, i, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), new Handler(looper), new YuvConverter(), VideoFrameRender$$Lambda$2.$instance), i4, j);
        onVideoFrame(videoFrame);
        videoFrame.release();
    }

    public void consumeTextureFrame(int i, ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, long j, float[] fArr) {
        MethodCollector.m26663i(882);
        if (i2 != 10) {
            MethodCollector.m26664o(882);
            return;
        }
        synchronized (this.mTextureProcessLock) {
            try {
                if (this.mTextureProcessLooper == null) {
                    this.mTextureProcessLooper = Looper.getMainLooper();
                }
                renderTextureFrame(i, VideoFrame.TextureBuffer.Type.RGB, i3, i4, i5, j, fArr, this.mTextureProcessLooper);
            } finally {
                MethodCollector.m26664o(882);
            }
        }
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        MethodCollector.m26663i(629);
        ThreadUtils.checkIsOnMainThread();
        synchronized (this.mRenderLock) {
            try {
                if (this.mEglRenderer != null) {
                    this.mEglRenderer.setLayoutAspectRatio(((float) (i3 - i)) / ((float) (i4 - i2)));
                }
                if (this.mSurfaceView != null) {
                    updateSurfaceSize();
                }
            } finally {
                MethodCollector.m26664o(629);
            }
        }
    }

    public void consumeYUVByteArrayFrame(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, long j, ByteBuffer byteBuffer) {
        renderI420Frame(this.frameConverter.convertRawYUV2ByteArray(bArr, bArr2, bArr3, i, i2, i3, i4, i5), i4, i5, i6, j);
    }
}
