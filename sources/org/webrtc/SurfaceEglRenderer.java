package org.webrtc;

import android.view.SurfaceHolder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;
import org.webrtc.RendererCommon;

public class SurfaceEglRenderer extends EglRenderer implements SurfaceHolder.Callback {
    private int frameRotation;
    private boolean isFirstFrameRendered;
    private boolean isRenderingPaused;
    private final Object layoutLock = new Object();
    private RendererCommon.RendererEvents rendererEvents;
    private int rotatedFrameHeight;
    private int rotatedFrameWidth;

    static {
        Covode.recordClassIndex(106707);
    }

    @Override // org.webrtc.EglRenderer
    public void disableFpsReduction() {
        MethodCollector.m26663i(1545);
        synchronized (this.layoutLock) {
            try {
                this.isRenderingPaused = false;
            } catch (Throwable th) {
                MethodCollector.m26664o(1545);
                throw th;
            }
        }
        super.disableFpsReduction();
        MethodCollector.m26664o(1545);
    }

    @Override // org.webrtc.EglRenderer
    public void pauseVideo() {
        MethodCollector.m26663i(1552);
        synchronized (this.layoutLock) {
            try {
                this.isRenderingPaused = true;
            } catch (Throwable th) {
                MethodCollector.m26664o(1552);
                throw th;
            }
        }
        super.pauseVideo();
        MethodCollector.m26664o(1552);
    }

    @Override // org.webrtc.EglRenderer
    public void release() {
        super.release();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(SurfaceEglRenderer$$Lambda$1.get$Lambda(countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    @Override // org.webrtc.EglRenderer, org.webrtc.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        updateFrameDimensionsAndReportEvents(videoFrame);
        super.onFrame(videoFrame);
    }

    public SurfaceEglRenderer(String str) {
        super(str);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        createEglSurface(surfaceHolder.getSurface());
    }

    private void logD(String str) {
        Logging.m157044i("SurfaceEglRenderer", this.name + ": " + str);
    }

    @Override // org.webrtc.EglRenderer
    public void setFpsReduction(float f) {
        boolean z;
        MethodCollector.m26663i(1538);
        synchronized (this.layoutLock) {
            if (f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            try {
                this.isRenderingPaused = z;
            } catch (Throwable th) {
                MethodCollector.m26664o(1538);
                throw th;
            }
        }
        super.setFpsReduction(f);
        MethodCollector.m26664o(1538);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        releaseEglSurface(SurfaceEglRenderer$$Lambda$0.get$Lambda(countDownLatch));
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    private void updateFrameDimensionsAndReportEvents(VideoFrame videoFrame) {
        MethodCollector.m26663i(1584);
        synchronized (this.layoutLock) {
            try {
                if (!this.isRenderingPaused) {
                    if (!this.isFirstFrameRendered) {
                        this.isFirstFrameRendered = true;
                        logD("Reporting first rendered frame.");
                        RendererCommon.RendererEvents rendererEvents2 = this.rendererEvents;
                        if (rendererEvents2 != null) {
                            rendererEvents2.onFirstFrameRendered();
                        }
                    }
                    if (!(this.rotatedFrameWidth == videoFrame.getRotatedWidth() && this.rotatedFrameHeight == videoFrame.getRotatedHeight() && this.frameRotation == videoFrame.getRotation())) {
                        logD("Reporting frame resolution changed to " + videoFrame.getBuffer().getWidth() + "x" + videoFrame.getBuffer().getHeight() + " with rotation " + videoFrame.getRotation());
                        RendererCommon.RendererEvents rendererEvents3 = this.rendererEvents;
                        if (rendererEvents3 != null) {
                            rendererEvents3.onFrameResolutionChanged(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation());
                        }
                        this.rotatedFrameWidth = videoFrame.getRotatedWidth();
                        this.rotatedFrameHeight = videoFrame.getRotatedHeight();
                        this.frameRotation = videoFrame.getRotation();
                    }
                    MethodCollector.m26664o(1584);
                }
            } finally {
                MethodCollector.m26664o(1584);
            }
        }
    }

    @Override // org.webrtc.EglRenderer
    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, (RendererCommon.RendererEvents) null, iArr, glDrawer);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents2, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        MethodCollector.m26663i(1528);
        ThreadUtils.checkIsOnMainThread();
        synchronized (this.layoutLock) {
            try {
                this.rendererEvents = rendererEvents2;
                this.isFirstFrameRendered = false;
                this.rotatedFrameWidth = 0;
                this.rotatedFrameHeight = 0;
                this.frameRotation = 0;
            } catch (Throwable th) {
                MethodCollector.m26664o(1528);
                throw th;
            }
        }
        super.init(context, iArr, glDrawer);
        MethodCollector.m26664o(1528);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        ThreadUtils.checkIsOnMainThread();
        logD("surfaceChanged: format: " + i + " size: " + i2 + "x" + i3);
    }
}
