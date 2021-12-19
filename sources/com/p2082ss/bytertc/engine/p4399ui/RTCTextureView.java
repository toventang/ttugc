package com.p2082ss.bytertc.engine.p4399ui;

import android.content.Context;
import android.opengl.EGLContext;
import android.util.AttributeSet;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.bytertc.engine.mediaio.IVideoSink;
import com.p2082ss.bytertc.engine.mediaio.RTCVideoFrame;
import org.webrtc.EglBase;
import org.webrtc.EglBase$$CC;
import org.webrtc.RendererCommon;

/* renamed from: com.ss.bytertc.engine.ui.RTCTextureView */
public class RTCTextureView extends TextureView implements IVideoSink {
    private boolean isRelease = true;
    private EglBase mEglBase;
    private boolean mIsStart;
    private VideoFrameRender mVideoFrameRender;

    static {
        Covode.recordClassIndex(101126);
    }

    @Override // com.p2082ss.bytertc.engine.mediaio.IVideoSink
    public int getBufferType() {
        return 0;
    }

    @Override // com.p2082ss.bytertc.engine.mediaio.IVideoSink
    public EGLContext getEGLContextHandle() {
        return null;
    }

    @Override // com.p2082ss.bytertc.engine.mediaio.IVideoSink
    public int getPixelFormat() {
        return 1;
    }

    @Override // com.p2082ss.bytertc.engine.mediaio.IVideoSink
    public void onStop() {
        this.mIsStart = false;
    }

    private void init() {
        VideoFrameRender videoFrameRender = new VideoFrameRender("SurfaceViewRenderer");
        this.mVideoFrameRender = videoFrameRender;
        videoFrameRender.setRenderView(this, (TextureView.SurfaceTextureListener) null);
    }

    @Override // com.p2082ss.bytertc.engine.mediaio.IVideoSink
    public boolean onStart() {
        this.mIsStart = true;
        this.mVideoFrameRender.onStart();
        return true;
    }

    @Override // com.p2082ss.bytertc.engine.mediaio.IVideoSink
    public void onDispose() {
        if (!this.isRelease) {
            this.isRelease = true;
            this.mVideoFrameRender.release();
            EglBase eglBase = this.mEglBase;
            if (eglBase != null) {
                eglBase.release();
            }
        }
    }

    @Override // com.p2082ss.bytertc.engine.mediaio.IVideoSink
    public boolean onInitialize() {
        if (!this.isRelease) {
            return false;
        }
        EglBase create$$STATIC$$ = EglBase$$CC.create$$STATIC$$();
        this.mEglBase = create$$STATIC$$;
        this.mVideoFrameRender.init(create$$STATIC$$.getEglBaseContext());
        this.isRelease = false;
        return true;
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        this.mVideoFrameRender.setScalingType(scalingType);
    }

    @Override // com.p2082ss.bytertc.engine.mediaio.IVideoFrameConsumer
    public void consumeVideoFrame(RTCVideoFrame rTCVideoFrame) {
        if (this.mIsStart) {
            this.mVideoFrameRender.consumeVideoFrame(rTCVideoFrame);
        }
    }

    public RTCTextureView(Context context) {
        super(context);
        MethodCollector.m26663i(2762);
        init();
        MethodCollector.m26664o(2762);
    }

    public RTCTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(2766);
        init();
        MethodCollector.m26664o(2766);
    }

    public RTCTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m26663i(2768);
        init();
        MethodCollector.m26664o(2768);
    }

    public RTCTextureView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        MethodCollector.m26663i(2858);
        MethodCollector.m26664o(2858);
    }
}
