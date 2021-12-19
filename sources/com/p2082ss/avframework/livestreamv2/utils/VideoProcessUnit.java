package com.p2082ss.avframework.livestreamv2.utils;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.GlTextureFrameBuffer;
import com.p2082ss.avframework.opengl.GlRenderDrawer;
import com.p2082ss.avframework.opengl.RendererCommon;
import com.p2082ss.avframework.utils.ThreadUtils;

/* renamed from: com.ss.avframework.livestreamv2.utils.VideoProcessUnit */
public class VideoProcessUnit {
    public GlTextureFrameBuffer mBuffer;
    public GlRenderDrawer mDrawer;
    public Handler mGlHandler;
    public boolean mHorizontalMirror;
    private int mInputHeight;
    private int mInputWidth;
    private Mode mMode = Mode.MODE_FIT;
    private float[] mPrjMatrix = new float[16];
    public int mRotation;
    private int mTargetHeight;
    private int mTargetWidth;
    private boolean mUpdateProject;
    public boolean mVerticalMirror;

    static {
        Covode.recordClassIndex(100635);
    }

    public void reset() {
        Matrix.setIdentityM(this.mPrjMatrix, 0);
    }

    public synchronized void release() {
        MethodCollector.m26663i(1433);
        Handler handler = this.mGlHandler;
        if (handler == null) {
            MethodCollector.m26664o(1433);
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() {
            /* class com.p2082ss.avframework.livestreamv2.utils.VideoProcessUnit.RunnableC860221 */

            static {
                Covode.recordClassIndex(100636);
            }

            public void run() {
                if (VideoProcessUnit.this.mBuffer != null) {
                    VideoProcessUnit.this.mBuffer.release();
                    VideoProcessUnit.this.mBuffer = null;
                }
                if (VideoProcessUnit.this.mDrawer != null) {
                    VideoProcessUnit.this.mDrawer.release();
                    VideoProcessUnit.this.mDrawer = null;
                }
                VideoProcessUnit.this.mGlHandler = null;
            }
        });
        MethodCollector.m26664o(1433);
    }

    /* renamed from: com.ss.avframework.livestreamv2.utils.VideoProcessUnit$Mode */
    public enum Mode {
        MODE_FIT,
        MODE_FILL;

        static {
            Covode.recordClassIndex(100638);
        }
    }

    private void updateProject() {
        boolean z;
        if (this.mTargetHeight == 0 || this.mTargetWidth == 0) {
            this.mTargetHeight = this.mInputHeight;
            this.mTargetWidth = this.mInputWidth;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.reset();
        matrix.preRotate((float) (-this.mRotation));
        this.mPrjMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix);
        if (this.mBuffer == null) {
            this.mBuffer = new GlTextureFrameBuffer(6408);
        }
        this.mBuffer.setSize(this.mTargetWidth, this.mTargetHeight);
        if (this.mMode == Mode.MODE_FIT) {
            z = true;
        } else {
            z = false;
        }
        RendererCommon.calcWindRatio(z, this.mHorizontalMirror, this.mVerticalMirror, this.mTargetWidth, this.mTargetHeight, this.mInputWidth, this.mInputHeight, this.mPrjMatrix);
        this.mUpdateProject = false;
    }

    public void updateRotation(int i) {
        this.mRotation = i;
        this.mUpdateProject = true;
    }

    public void updateCrop(int i, int i2) {
        this.mTargetHeight = i2;
        this.mTargetWidth = i;
        this.mUpdateProject = true;
    }

    public void updateMirror(boolean z, boolean z2) {
        if (z2) {
            this.mHorizontalMirror = z;
        } else {
            this.mVerticalMirror = z;
        }
        this.mUpdateProject = true;
    }

    public VideoProcessUnit(Handler handler, Mode mode) {
        reset();
        this.mMode = mode;
        this.mGlHandler = handler;
        if (handler == null) {
            throw new AndroidRuntimeException("Handler is null.");
        }
    }

    public int process(int i, int i2, int i3, boolean z, android.graphics.Matrix matrix) {
        return process(i, i2, i3, z, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix));
    }

    public int process(final int i, final int i2, final int i3, final boolean z, final float[] fArr) {
        final int[] iArr = {-1};
        Handler handler = this.mGlHandler;
        if (handler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() {
                /* class com.p2082ss.avframework.livestreamv2.utils.VideoProcessUnit.RunnableC860232 */

                static {
                    Covode.recordClassIndex(100637);
                }

                public void run() {
                    iArr[0] = VideoProcessUnit.this.onProcess(i, i2, i3, z, fArr);
                }
            });
        }
        return iArr[0];
    }

    public int onProcess(int i, int i2, int i3, boolean z, float[] fArr) {
        if (i2 <= 0 || i3 <= 0 || i <= 0) {
            throw new AndroidRuntimeException("Bad parameter");
        }
        if (!(this.mInputWidth == i2 && this.mInputHeight == i3)) {
            this.mInputHeight = i3;
            this.mInputWidth = i2;
            this.mUpdateProject = true;
        }
        if (this.mUpdateProject) {
            updateProject();
        }
        if (this.mDrawer == null) {
            this.mDrawer = new GlRenderDrawer();
        }
        GLES20.glBindFramebuffer(36160, this.mBuffer.getFrameBufferId());
        GLES20.glClear(16640);
        if (z) {
            this.mDrawer.drawOes(i, this.mPrjMatrix, fArr, 0, 0, this.mTargetWidth, this.mTargetHeight);
        } else {
            this.mDrawer.drawRgb(i, this.mPrjMatrix, fArr, 0, 0, this.mTargetWidth, this.mTargetHeight);
        }
        GLES20.glFinish();
        GLES20.glBindFramebuffer(36160, 0);
        return this.mBuffer.getTextureId();
    }
}
