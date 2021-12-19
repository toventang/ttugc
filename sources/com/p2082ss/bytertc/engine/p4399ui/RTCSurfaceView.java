package com.p2082ss.bytertc.engine.p4399ui;

import android.content.Context;
import android.opengl.EGLContext;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.bytertc.engine.mediaio.IVideoSink;
import com.p2082ss.bytertc.engine.mediaio.RTCVideoFrame;
import org.webrtc.EglBase;
import org.webrtc.EglBase$$CC;
import org.webrtc.RendererCommon;

/* renamed from: com.ss.bytertc.engine.ui.RTCSurfaceView */
public class RTCSurfaceView extends SurfaceView implements IVideoSink {
    private boolean isRelease = true;
    private EglBase mEglBase;
    private boolean mIsStart;
    private VideoFrameRender mVideoFrameRender;

    static {
        Covode.recordClassIndex(101125);
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

    /* access modifiers changed from: protected */
    public Looper getTextureFrameProcessLooper() {
        return null;
    }

    @Override // com.p2082ss.bytertc.engine.mediaio.IVideoSink
    public void onStop() {
        this.mIsStart = false;
    }

    public void disableFpsReduction() {
        this.mVideoFrameRender.disableFpsReduction();
    }

    private void init() {
        VideoFrameRender videoFrameRender = new VideoFrameRender("SurfaceViewRenderer");
        this.mVideoFrameRender = videoFrameRender;
        videoFrameRender.setRenderView(this, (SurfaceHolder.Callback) null);
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
        this.isRelease = false;
        this.mVideoFrameRender.init(create$$STATIC$$.getEglBaseContext());
        this.mVideoFrameRender.setProcessTextureLopper(getTextureFrameProcessLooper());
        return true;
    }

    public void setEnableHardwareScaler(boolean z) {
        this.mVideoFrameRender.setEnableHardwareScaler(z);
    }

    public void setFpsReduction(float f) {
        this.mVideoFrameRender.setFpsReduction(f);
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

    public RTCSurfaceView(Context context) {
        super(context);
        MethodCollector.m26663i(1525);
        init();
        MethodCollector.m26664o(1525);
    }

    public RTCSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(1529);
        init();
        MethodCollector.m26664o(1529);
    }

    public RTCSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m26663i(1531);
        init();
        MethodCollector.m26664o(1531);
    }

    public RTCSurfaceView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        MethodCollector.m26663i(2139);
        init();
        MethodCollector.m26664o(2139);
    }
}
