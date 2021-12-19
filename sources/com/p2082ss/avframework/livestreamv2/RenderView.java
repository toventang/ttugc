package com.p2082ss.avframework.livestreamv2;

import android.opengl.Matrix;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.opengl.GLRenderVideoSink;
import com.p2082ss.avframework.opengl.GlRenderDrawer;
import com.p2082ss.avframework.opengl.RendererCommon;
import com.p2082ss.avframework.utils.AVLog;

/* renamed from: com.ss.avframework.livestreamv2.RenderView */
public class RenderView extends GLRenderVideoSink implements GLRenderVideoSink.GLRenderer {
    private int frameCount;
    private long lastTime;
    private boolean mAspectRatio;
    private GlRenderDrawer mDrawer;
    private boolean mFitMode;
    private int mFrameHeight;
    private VideoFrameRender mFrameRender;
    private int mFrameWidth;
    private boolean mMirrorX;
    private boolean mMirrorY;
    private float[] mPrj;
    protected VideoFrameStatics mRealRateStatistict;
    private boolean mSizedChanged;
    protected int mWindHeight;
    protected int mWindWidth;

    static {
        Covode.recordClassIndex(100095);
    }

    public boolean isFitMode() {
        return this.mFitMode;
    }

    /* renamed from: com.ss.avframework.livestreamv2.RenderView$SurfaceViewWithoutCallback */
    public static class SurfaceViewWithoutCallback extends RenderView {
        SurfaceHolder holder;
        SurfaceView mSurfaceView;

        static {
            Covode.recordClassIndex(100096);
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

        public SurfaceViewWithoutCallback(View view) {
            super(view, true);
            if (view != null && (view instanceof SurfaceView)) {
                SurfaceView surfaceView = (SurfaceView) view;
                this.mSurfaceView = surfaceView;
                this.holder = surfaceView.getHolder();
            }
        }
    }

    public float getRealRatePerSeconds() {
        VideoFrameStatics videoFrameStatics = this.mRealRateStatistict;
        if (videoFrameStatics != null) {
            return videoFrameStatics.getRealRatePerSecond();
        }
        return -1.0f;
    }

    @Override // com.p2082ss.avframework.opengl.GLRenderVideoSink
    public void init() {
        super.init();
        setRenderer(this);
        AVLog.iod("RenderView", this + " setRenderer");
    }

    @Override // com.p2082ss.avframework.opengl.GLRenderVideoSink.GLRenderer
    public void onSurfaceCreated() {
        AVLog.iow("RenderView", this + " onSurfaceCreated");
        this.mDrawer = new GlRenderDrawer();
        this.mFrameRender = new VideoFrameRender();
    }

    @Override // com.p2082ss.avframework.opengl.GLRenderVideoSink.GLRenderer
    public void onSurfaceDestroy() {
        AVLog.iow("RenderView", this + " onSurfaceDestroy");
        GlRenderDrawer glRenderDrawer = this.mDrawer;
        if (glRenderDrawer != null) {
            glRenderDrawer.release();
            this.mDrawer = null;
        }
        VideoFrameRender videoFrameRender = this.mFrameRender;
        if (videoFrameRender != null) {
            videoFrameRender.release();
            this.mFrameRender = null;
        }
    }

    public void setAutoFullAspectRatioOnFit(boolean z) {
        this.mAspectRatio = z;
    }

    public RenderView(View view) {
        this(view, false);
    }

    public boolean isMirror(boolean z) {
        if (z) {
            return this.mMirrorX;
        }
        return this.mMirrorY;
    }

    public void setFitMode(boolean z) {
        this.mFitMode = z;
        this.mSizedChanged = true;
    }

    @Override // com.p2082ss.avframework.engine.VideoSink, com.p2082ss.avframework.opengl.GLRenderVideoSink
    public void onFrame(VideoFrame videoFrame) {
        this.frameCount++;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastTime >= 30000) {
            AVLog.iow("RenderView", "[repeat " + this.frameCount + " times] " + this + " onFrame videoFps is: " + getRealRatePerSeconds());
            this.lastTime = currentTimeMillis;
            this.frameCount = 0;
        }
        super.onFrame(videoFrame);
    }

    @Override // com.p2082ss.avframework.opengl.GLRenderVideoSink.GLRenderer
    public void onDrawFrame(VideoFrame videoFrame) {
        if (this.mDrawer == null) {
            AVLog.logToIODevice2(5, "RenderView", this + " mDrawer is null", null, "RenderView.onDrawFrame1", 10000);
            return;
        }
        VideoFrameStatics videoFrameStatics = this.mRealRateStatistict;
        if (videoFrameStatics != null) {
            videoFrameStatics.add();
        }
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (!(!this.mSizedChanged && rotatedHeight == this.mFrameHeight && rotatedWidth == this.mFrameWidth)) {
            calcViewRatio(rotatedWidth, rotatedHeight);
            this.mSizedChanged = false;
        }
        VideoFrameRender videoFrameRender = this.mFrameRender;
        GlRenderDrawer glRenderDrawer = this.mDrawer;
        if (videoFrameRender == null || glRenderDrawer == null) {
            AVLog.logToIODevice2(5, "RenderView", this + " Render frame failed: render " + videoFrameRender + ", drawer " + glRenderDrawer, null, "RenderView.onDrawFrame3", 10000);
        } else if (!videoFrameRender.drawFrame(videoFrame, glRenderDrawer, this.mPrj, null, 0, 0, this.mWindWidth, this.mWindHeight)) {
            AVLog.logToIODevice2(5, "RenderView", this + " Render frame failed timestamp " + videoFrame.getTimestampNs(), null, "RenderView.onDrawFrame2", 10000);
        }
    }

    public void setMirror(boolean z, boolean z2) {
        if (z2) {
            this.mMirrorX = z;
        } else {
            this.mMirrorY = z;
        }
        this.mSizedChanged = true;
    }

    public RenderView(View view, boolean z) {
        super(view);
        float[] fArr = new float[16];
        this.mPrj = fArr;
        Matrix.setIdentityM(fArr, 0);
        this.mFrameRender = new VideoFrameRender();
        if (z) {
            this.mRealRateStatistict = new VideoFrameStatics(1000);
        }
    }

    @Override // com.p2082ss.avframework.opengl.GLRenderVideoSink.GLRenderer
    public void onSurfaceChanged(int i, int i2) {
        this.mWindWidth = i;
        this.mWindHeight = i2;
        this.mSizedChanged = true;
        AVLog.iow("RenderView", this + " onSurfaceChanged (" + i + "," + i2 + ")");
    }

    private void calcViewRatio(int i, int i2) {
        int i3;
        int i4;
        boolean z = this.mFitMode;
        if (this.mAspectRatio && (i3 = this.mWindWidth) > 0 && (i4 = this.mWindHeight) > 0) {
            float f = (((float) i3) * 1.0f) / ((float) i4);
            if (f > 0.0f && ((i > i2 && f > 1.0f) || (i < i2 && f < 1.0f))) {
                AVLog.iow("RenderView", "Using full mode instead of fit");
                z = false;
            }
        }
        this.mFrameHeight = i2;
        this.mFrameWidth = i;
        Matrix.setIdentityM(this.mPrj, 0);
        RendererCommon.calcWindRatio(z, this.mMirrorX, this.mMirrorY, this.mWindWidth, this.mWindHeight, i, i2, this.mPrj);
    }
}
