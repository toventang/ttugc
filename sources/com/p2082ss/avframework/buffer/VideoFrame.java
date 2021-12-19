package com.p2082ss.avframework.buffer;

import android.graphics.Matrix;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.buffer.VideoFrame */
public class VideoFrame {
    private final Buffer buffer;
    private final int rotation;
    private final long timestampNs;

    /* renamed from: com.ss.avframework.buffer.VideoFrame$Buffer */
    public interface Buffer {
        static {
            Covode.recordClassIndex(99853);
        }

        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        long getCaptureMs();

        IExtraData getExtData();

        int getHeight();

        RoiInfo getROIInfo();

        int getWidth();

        boolean isTexture();

        void release();

        void retain();

        void setROIInfo(RoiInfo roiInfo);

        I420Buffer toI420();

        void updateCaptureMs(long j);
    }

    /* renamed from: com.ss.avframework.buffer.VideoFrame$I420Buffer */
    public interface I420Buffer extends Buffer {
        static {
            Covode.recordClassIndex(99854);
        }

        ByteBuffer getDataU();

        ByteBuffer getDataV();

        ByteBuffer getDataY();

        int getStrideU();

        int getStrideV();

        int getStrideY();
    }

    /* renamed from: com.ss.avframework.buffer.VideoFrame$IExtraData */
    public interface IExtraData {
        static {
            Covode.recordClassIndex(99855);
        }

        int peekParcelSize();

        int readParcel(ByteBuffer byteBuffer);

        void releaseExtraData(Object obj);
    }

    /* renamed from: com.ss.avframework.buffer.VideoFrame$TextureBuffer */
    public interface TextureBuffer extends Buffer {
        static {
            Covode.recordClassIndex(99856);
        }

        int getTextureId();

        Matrix getTransformMatrix();

        Type getType();

        /* renamed from: com.ss.avframework.buffer.VideoFrame$TextureBuffer$Type */
        public enum Type {
            OES(36197),
            RGB(3553);
            
            private final int glTarget;

            public final int getGlTarget() {
                return this.glTarget;
            }

            static {
                Covode.recordClassIndex(99857);
            }

            private Type(int i) {
                this.glTarget = i;
            }
        }
    }

    static {
        Covode.recordClassIndex(99851);
    }

    private static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, ByteBuffer byteBuffer4, int i8, ByteBuffer byteBuffer5, int i9, ByteBuffer byteBuffer6, int i10, int i11, int i12);

    public Buffer getBuffer() {
        return this.buffer;
    }

    public int getRotation() {
        return this.rotation;
    }

    public long getTimestampNs() {
        return this.timestampNs;
    }

    public IExtraData getExtraData() {
        return this.buffer.getExtData();
    }

    public boolean isTexture() {
        return this.buffer instanceof TextureBuffer;
    }

    public void release() {
        this.buffer.release();
    }

    public void retain() {
        this.buffer.retain();
    }

    public int getRotatedHeight() {
        if (this.rotation % LiveFeedRefreshTimeSetting.DEFAULT == 0) {
            return this.buffer.getHeight();
        }
        return this.buffer.getWidth();
    }

    public int getRotatedWidth() {
        if (this.rotation % LiveFeedRefreshTimeSetting.DEFAULT == 0) {
            return this.buffer.getWidth();
        }
        return this.buffer.getHeight();
    }

    public VideoFrame(Buffer buffer2, int i, long j) {
        if (buffer2 == null) {
            throw new IllegalArgumentException("buffer not allowed to be null");
        } else if (i % 90 == 0) {
            this.buffer = buffer2;
            this.rotation = i;
            this.timestampNs = j;
        } else {
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
    }

    public static Buffer cropAndScaleI420(final I420Buffer i420Buffer, int i, int i2, int i3, int i4, int i5, int i6) {
        MethodCollector.m26663i(5031);
        if (i3 == i5 && i4 == i6) {
            ByteBuffer dataY = i420Buffer.getDataY();
            ByteBuffer dataU = i420Buffer.getDataU();
            ByteBuffer dataV = i420Buffer.getDataV();
            dataY.position((i420Buffer.getStrideY() * i2) + i);
            int i7 = i / 2;
            int i8 = i2 / 2;
            dataU.position((i420Buffer.getStrideU() * i8) + i7);
            dataV.position(i7 + (i8 * i420Buffer.getStrideV()));
            i420Buffer.retain();
            JavaI420Buffer wrap = JavaI420Buffer.wrap(i420Buffer.getWidth(), i420Buffer.getHeight(), dataY.slice(), i420Buffer.getStrideY(), dataU.slice(), i420Buffer.getStrideU(), dataV.slice(), i420Buffer.getStrideV(), i420Buffer.getCaptureMs(), new Runnable() {
                /* class com.p2082ss.avframework.buffer.VideoFrame.RunnableC856461 */

                static {
                    Covode.recordClassIndex(99852);
                }

                public final void run() {
                    i420Buffer.release();
                }
            });
            MethodCollector.m26664o(5031);
            return wrap;
        }
        JavaI420Buffer allocate = JavaI420Buffer.allocate(i5, i6);
        nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i, i2, i3, i4, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV(), i5, i6);
        allocate.updateCaptureMs(i420Buffer.getCaptureMs());
        MethodCollector.m26664o(5031);
        return allocate;
    }
}
