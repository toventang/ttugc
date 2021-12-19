package com.p2082ss.avframework.buffer;

import android.graphics.Matrix;
import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.utils.TimeUtils;

/* renamed from: com.ss.avframework.buffer.TextureBufferImpl */
public class TextureBufferImpl implements VideoFrame.TextureBuffer {
    private long captureMs;
    private VideoFrame.IExtraData extData;
    private final int height;

    /* renamed from: id */
    private final int f191978id;
    protected RoiInfo mROIInfo;
    private ToI420Interface mToI420Interface;
    private int refCount;
    private final Object refCountLock;
    private final Runnable releaseCallback;
    private final SurfaceTextureHelper surfaceTextureHelper;
    private final Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private final int width;

    /* renamed from: com.ss.avframework.buffer.TextureBufferImpl$ToI420Interface */
    public interface ToI420Interface {
        static {
            Covode.recordClassIndex(99850);
        }

        VideoFrame.I420Buffer toI420(VideoFrame.TextureBuffer textureBuffer);
    }

    static {
        Covode.recordClassIndex(99848);
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public boolean isTexture() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void recycle() {
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public long getCaptureMs() {
        return this.captureMs;
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public VideoFrame.IExtraData getExtData() {
        return this.extData;
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public RoiInfo getROIInfo() {
        return this.mROIInfo;
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.TextureBuffer
    public int getTextureId() {
        return this.f191978id;
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        return this.type;
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public void retain() {
        MethodCollector.m26663i(2388);
        synchronized (this.refCountLock) {
            try {
                this.refCount++;
            } finally {
                MethodCollector.m26664o(2388);
            }
        }
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        SurfaceTextureHelper surfaceTextureHelper2 = this.surfaceTextureHelper;
        if (surfaceTextureHelper2 != null) {
            return surfaceTextureHelper2.textureToYuv(this);
        }
        ToI420Interface toI420Interface = this.mToI420Interface;
        if (toI420Interface != null) {
            return toI420Interface.toI420(this);
        }
        throw new AndroidRuntimeException("BUG, Fixed me");
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public void release() {
        MethodCollector.m26663i(2418);
        synchronized (this.refCountLock) {
            try {
                int i = this.refCount - 1;
                this.refCount = i;
                if (i == 0) {
                    Runnable runnable = this.releaseCallback;
                    if (runnable != null) {
                        runnable.run();
                    } else {
                        recycle();
                    }
                    RoiInfo roiInfo = this.mROIInfo;
                    if (roiInfo != null) {
                        roiInfo.release();
                        this.mROIInfo = null;
                    }
                }
            } finally {
                MethodCollector.m26664o(2418);
            }
        }
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public void updateCaptureMs(long j) {
        this.captureMs = j;
    }

    public void updateExtraData(VideoFrame.IExtraData iExtraData) {
        this.extData = iExtraData;
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public void setROIInfo(RoiInfo roiInfo) {
        RoiInfo roiInfo2 = this.mROIInfo;
        if (roiInfo2 != roiInfo) {
            if (roiInfo2 != null) {
                roiInfo2.release();
            }
            this.mROIInfo = roiInfo;
        }
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        retain();
        Matrix matrix = new Matrix(this.transformMatrix);
        matrix.preTranslate(((float) i) / ((float) this.width), ((float) i2) / ((float) this.height));
        matrix.preScale(((float) i3) / ((float) this.width), ((float) i4) / ((float) this.height));
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i5, i6, this.type, this.f191978id, matrix, this.surfaceTextureHelper, new Runnable() {
            /* class com.p2082ss.avframework.buffer.TextureBufferImpl.RunnableC856451 */

            static {
                Covode.recordClassIndex(99849);
            }

            public void run() {
                TextureBufferImpl.this.release();
            }
        });
        textureBufferImpl.mToI420Interface = this.mToI420Interface;
        textureBufferImpl.setROIInfo(this.mROIInfo);
        this.mROIInfo = null;
        textureBufferImpl.captureMs = this.captureMs;
        return textureBufferImpl;
    }

    public TextureBufferImpl(int i, int i2, VideoFrame.TextureBuffer.Type type2, int i3, Matrix matrix, SurfaceTextureHelper surfaceTextureHelper2, Runnable runnable) {
        this(i, i2, type2, i3, matrix, surfaceTextureHelper2, runnable, (VideoFrame.IExtraData) null);
    }

    public TextureBufferImpl(int i, int i2, VideoFrame.TextureBuffer.Type type2, int i3, Matrix matrix, ToI420Interface toI420Interface, Runnable runnable) {
        this(i, i2, type2, i3, matrix, toI420Interface, runnable, (VideoFrame.IExtraData) null);
    }

    public TextureBufferImpl(int i, int i2, VideoFrame.TextureBuffer.Type type2, int i3, Matrix matrix, SurfaceTextureHelper surfaceTextureHelper2, Runnable runnable, VideoFrame.IExtraData iExtraData) {
        this.refCountLock = new Object();
        this.width = i;
        this.height = i2;
        this.type = type2;
        this.f191978id = i3;
        this.transformMatrix = matrix;
        this.surfaceTextureHelper = surfaceTextureHelper2;
        this.releaseCallback = runnable;
        this.mToI420Interface = null;
        this.extData = iExtraData;
        this.refCount = 1;
    }

    public TextureBufferImpl(int i, int i2, VideoFrame.TextureBuffer.Type type2, int i3, Matrix matrix, ToI420Interface toI420Interface, Runnable runnable, VideoFrame.IExtraData iExtraData) {
        this.refCountLock = new Object();
        this.width = i;
        this.height = i2;
        this.type = type2;
        this.f191978id = i3;
        this.transformMatrix = matrix;
        this.surfaceTextureHelper = null;
        this.releaseCallback = runnable;
        this.mToI420Interface = toI420Interface;
        this.extData = iExtraData;
        this.captureMs = TimeUtils.currentTimeMs();
        this.refCount = 1;
    }
}
