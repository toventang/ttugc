package com.p2082ss.avframework.livestreamv2.core;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.engine.VideoSink;
import com.p2082ss.avframework.livestreamv2.RenderView;
import com.p2082ss.avframework.mixer.VideoMixer;
import com.p2082ss.avframework.opengl.GLThreadManager;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.TEBundle;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.avframework.livestreamv2.core.DirectVideoMixer */
class DirectVideoMixer extends VideoMixer {
    private boolean mDirectRender;
    private int mHeight;
    public WeakReference<RenderView> mRenderView;
    private VideoSinkInternal mVideoSinkInternal;
    private int mWidth;

    static {
        Covode.recordClassIndex(100189);
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean isDirectRenderMode() {
        return this.mDirectRender;
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.DirectVideoMixer$SurfaceViewWithoutCallback */
    public static class SurfaceViewWithoutCallback extends MixerRenderView {
        SurfaceHolder holder;
        SurfaceView mSurfaceView;

        static {
            Covode.recordClassIndex(100191);
        }

        public void addViewCallback() {
            SurfaceHolder surfaceHolder = this.holder;
            if (surfaceHolder != null) {
                surfaceHolder.addCallback(this);
                AVLog.ioi("SurfaceViewWithoutCallback", "callback is added");
            }
        }

        public void removeViewCallback() {
            SurfaceHolder surfaceHolder = this.holder;
            if (surfaceHolder != null) {
                surfaceHolder.removeCallback(this);
                AVLog.ioi("SurfaceViewWithoutCallback", "callback is removed");
            }
        }

        @Override // com.p2082ss.avframework.opengl.GLRenderVideoSink
        public void initSurfaceView(SurfaceView surfaceView) {
            init();
            AVLog.ioi("SurfaceViewWithoutCallback", "SurfaceViewWithoutCallback is inited");
        }

        public SurfaceViewWithoutCallback(View view, DirectVideoMixer directVideoMixer) {
            super(view, directVideoMixer);
            if (view != null && (view instanceof SurfaceView)) {
                SurfaceView surfaceView = (SurfaceView) view;
                this.mSurfaceView = surfaceView;
                this.holder = surfaceView.getHolder();
            }
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.DirectVideoMixer$MixerRenderView */
    public static class MixerRenderView extends RenderView {
        private Object mFence;
        private boolean mUpdated = false;
        private WeakReference<DirectVideoMixer> mVideoMixer;

        static {
            Covode.recordClassIndex(100190);
        }

        @Override // com.p2082ss.avframework.livestreamv2.RenderView, com.p2082ss.avframework.opengl.GLRenderVideoSink.GLRenderer
        public void onSurfaceCreated() {
            super.onSurfaceCreated();
            AVLog.ioi("MixerRenderView", "surface Create ".concat(String.valueOf(this)));
        }

        @Override // com.p2082ss.avframework.livestreamv2.RenderView, com.p2082ss.avframework.opengl.GLRenderVideoSink.GLRenderer
        public void onSurfaceDestroy() {
            super.onSurfaceDestroy();
            AVLog.ioi("MixerRenderView", "surface Destroy ".concat(String.valueOf(this)));
        }

        @Override // com.p2082ss.avframework.opengl.GLRenderVideoSink, com.p2082ss.avframework.engine.NativeObject
        public synchronized void release() {
            MethodCollector.m26663i(3006);
            super.release();
            MethodCollector.m26664o(3006);
        }

        public MixerRenderView(View view, DirectVideoMixer directVideoMixer) {
            super(view, true);
            DirectVideoMixer directVideoMixer2;
            MethodCollector.m26663i(2463);
            Object obj = new Object();
            this.mFence = obj;
            synchronized (obj) {
                try {
                    this.mVideoMixer = new WeakReference<>(directVideoMixer);
                    if (!this.mUpdated && this.mWindHeight > 1 && this.mWindWidth > 1 && (directVideoMixer2 = this.mVideoMixer.get()) != null) {
                        directVideoMixer2.updateSize(this.mWindWidth, this.mWindHeight);
                    }
                } finally {
                    MethodCollector.m26664o(2463);
                }
            }
        }

        @Override // com.p2082ss.avframework.livestreamv2.RenderView, com.p2082ss.avframework.opengl.GLRenderVideoSink.GLRenderer
        public void onSurfaceChanged(int i, int i2) {
            MethodCollector.m26663i(3005);
            synchronized (this.mFence) {
                try {
                    super.onSurfaceChanged(i, i2);
                    WeakReference<DirectVideoMixer> weakReference = this.mVideoMixer;
                    if (weakReference != null) {
                        this.mUpdated = true;
                        DirectVideoMixer directVideoMixer = weakReference.get();
                        if (directVideoMixer != null) {
                            directVideoMixer.updateSize(i, i2);
                        }
                        AVLog.ioi("MixerRenderView", "surface Change(" + i + "," + i2 + ")" + this);
                        MethodCollector.m26664o(3005);
                    }
                } finally {
                    MethodCollector.m26664o(3005);
                }
            }
        }
    }

    /* renamed from: com.ss.avframework.livestreamv2.core.DirectVideoMixer$VideoSinkInternal */
    class VideoSinkInternal extends VideoSink {
        static {
            Covode.recordClassIndex(100192);
        }

        @Override // com.p2082ss.avframework.engine.VideoSink
        public void OnDiscardedFrame() {
        }

        @Override // com.p2082ss.avframework.engine.NativeObject
        public synchronized void release() {
            MethodCollector.m26663i(2673);
            super.release();
            MethodCollector.m26664o(2673);
        }

        VideoSinkInternal() {
        }

        @Override // com.p2082ss.avframework.engine.VideoSink
        public void onFrame(VideoFrame videoFrame) {
            RenderView renderView = DirectVideoMixer.this.mRenderView.get();
            if (renderView != null) {
                renderView.onFrame(videoFrame);
            }
        }
    }

    public DirectVideoMixer() {
        VideoSinkInternal videoSinkInternal = new VideoSinkInternal();
        this.mVideoSinkInternal = videoSinkInternal;
        AddVideoSink(videoSinkInternal);
        TEBundle tEBundle = new TEBundle();
        getParameter(tEBundle);
        this.mWidth = tEBundle.getInt("vmixer_width");
        this.mHeight = tEBundle.getInt("vmixer_height");
        tEBundle.setBool("vmixer_enable_gl_finish", GLThreadManager.isNeedFinish());
        setParameter(tEBundle);
        tEBundle.release();
        enableDirectRender(false);
    }

    @Override // com.p2082ss.avframework.mixer.VideoMixer, com.p2082ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.m26663i(2882);
        this.mRenderView = new WeakReference<>(null);
        RemoveVideoSink(this.mVideoSinkInternal);
        this.mVideoSinkInternal.release();
        this.mVideoSinkInternal = null;
        super.release();
        MethodCollector.m26664o(2882);
    }

    public void enableDirectRender(boolean z) {
        this.mDirectRender = z;
        setEnable(!z);
    }

    public void updateView(RenderView renderView) {
        this.mRenderView = new WeakReference<>(renderView);
    }

    public int onDirectFrame(VideoFrame videoFrame) {
        RenderView renderView;
        if (!this.mDirectRender || (renderView = this.mRenderView.get()) == null) {
            return 0;
        }
        renderView.onFrame(videoFrame);
        return 0;
    }

    public int onFrame(int i, VideoFrame videoFrame) {
        MethodCollector.m26663i(2584);
        synchronized (this) {
            try {
                if (!this.mDirectRender) {
                    return mixFrame(i, videoFrame);
                }
                MethodCollector.m26664o(2584);
                return -1;
            } finally {
                MethodCollector.m26664o(2584);
            }
        }
    }

    public void updateSize(int i, int i2) {
        TEBundle tEBundle = new TEBundle();
        getParameter(tEBundle);
        tEBundle.setInt("vmixer_width", i);
        tEBundle.setInt("vmixer_height", i2);
        setParameter(tEBundle);
        tEBundle.release();
        this.mWidth = i;
        this.mHeight = i2;
    }

    public int onFrame(int i, VideoMixer.VideoMixerTexture videoMixerTexture) {
        MethodCollector.m26663i(2521);
        synchronized (this) {
            try {
                if (!this.mDirectRender) {
                    return mixFrame(i, videoMixerTexture);
                }
                MethodCollector.m26664o(2521);
                return -1;
            } finally {
                MethodCollector.m26664o(2521);
            }
        }
    }
}
