package com.p2082ss.avframework.buffer;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.buffer.VideoFrame;
import com.p2082ss.avframework.utils.JniCommon;
import com.p2082ss.avframework.utils.TimeUtils;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.buffer.JavaI420Buffer */
public class JavaI420Buffer implements VideoFrame.I420Buffer {
    private long captureMs;
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private RoiInfo mROIInfo;
    private int refCount;
    private final Object refCountLock = new Object();
    private final Runnable releaseCallback;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    static {
        Covode.recordClassIndex(99828);
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public VideoFrame.IExtraData getExtData() {
        return null;
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public boolean isTexture() {
        return false;
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public long getCaptureMs() {
        return this.captureMs;
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public RoiInfo getROIInfo() {
        return this.mROIInfo;
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.I420Buffer
    public int getStrideU() {
        return this.strideU;
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.I420Buffer
    public int getStrideV() {
        return this.strideV;
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.I420Buffer
    public int getStrideY() {
        return this.strideY;
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.I420Buffer
    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.I420Buffer
    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.I420Buffer
    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public void retain() {
        MethodCollector.m26663i(7835);
        synchronized (this.refCountLock) {
            try {
                this.refCount++;
            } finally {
                MethodCollector.m26664o(7835);
            }
        }
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public void release() {
        Runnable runnable;
        MethodCollector.m26663i(7969);
        synchronized (this.refCountLock) {
            try {
                int i = this.refCount - 1;
                this.refCount = i;
                if (i == 0 && (runnable = this.releaseCallback) != null) {
                    runnable.run();
                }
            } finally {
                MethodCollector.m26664o(7969);
            }
        }
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public void updateCaptureMs(long j) {
        this.captureMs = j;
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

    public static JavaI420Buffer allocate(int i, int i2) {
        MethodCollector.m26663i(7698);
        int i3 = (i2 + 1) / 2;
        int i4 = (i + 1) / 2;
        int i5 = i * i2;
        int i6 = i5 + 0;
        int i7 = i4 * i3;
        int i8 = i6 + i7;
        final ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i5 + (i4 * 2 * i3));
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i6);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i6);
        nativeAllocateByteBuffer.limit(i8);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i8);
        nativeAllocateByteBuffer.limit(i8 + i7);
        JavaI420Buffer javaI420Buffer = new JavaI420Buffer(i, i2, slice, i, slice2, i4, nativeAllocateByteBuffer.slice(), i4, new Runnable() {
            /* class com.p2082ss.avframework.buffer.JavaI420Buffer.RunnableC856341 */

            static {
                Covode.recordClassIndex(99829);
            }

            public final void run() {
                MethodCollector.m26663i(5032);
                JniCommon.nativeFreeByteBuffer(nativeAllocateByteBuffer);
                MethodCollector.m26664o(5032);
            }
        });
        MethodCollector.m26664o(7698);
        return javaI420Buffer;
    }

    @Override // com.p2082ss.avframework.buffer.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return VideoFrame.cropAndScaleI420(this, i, i2, i3, i4, i5, i6);
    }

    private JavaI420Buffer(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable) {
        this.width = i;
        this.height = i2;
        this.dataY = byteBuffer;
        this.dataU = byteBuffer2;
        this.dataV = byteBuffer3;
        this.strideY = i3;
        this.strideU = i4;
        this.strideV = i5;
        this.releaseCallback = runnable;
        this.captureMs = TimeUtils.currentTimeMs();
        this.refCount = 1;
    }

    public static JavaI420Buffer wrap(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable) {
        if (byteBuffer == null || byteBuffer2 == null || byteBuffer3 == null) {
            throw new IllegalArgumentException("Data buffers cannot be null.");
        } else if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
        } else {
            ByteBuffer slice = byteBuffer.slice();
            ByteBuffer slice2 = byteBuffer2.slice();
            ByteBuffer slice3 = byteBuffer3.slice();
            int i6 = (i2 + 1) / 2;
            int i7 = i3 * i2;
            int i8 = i4 * i6;
            int i9 = i6 * i5;
            if (slice.capacity() < i7) {
                throw new IllegalArgumentException("Y-buffer must be at least " + i7 + " bytes.");
            } else if (slice2.capacity() < i8) {
                throw new IllegalArgumentException("U-buffer must be at least " + i8 + " bytes.");
            } else if (slice3.capacity() >= i9) {
                return new JavaI420Buffer(i, i2, slice, i3, slice2, i4, slice3, i5, runnable);
            } else {
                throw new IllegalArgumentException("V-buffer must be at least " + i9 + " bytes.");
            }
        }
    }

    public static JavaI420Buffer wrap(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, long j, Runnable runnable) {
        JavaI420Buffer wrap = wrap(i, i2, byteBuffer, i3, byteBuffer2, i4, byteBuffer3, i5, runnable);
        wrap.captureMs = j;
        return wrap;
    }
}
