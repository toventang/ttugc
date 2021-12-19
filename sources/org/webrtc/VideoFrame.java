package org.webrtc;

import android.graphics.Matrix;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public class VideoFrame implements RefCounted {
    private final Buffer buffer;
    private final ByteBuffer extendedData;
    private boolean isFlip;
    private final int rotation;
    private final long timestampNs;

    public interface Buffer extends RefCounted {
        static {
            Covode.recordClassIndex(106754);
        }

        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        int getHeight();

        int getWidth();

        @Override // org.webrtc.RefCounted
        void release();

        @Override // org.webrtc.RefCounted
        void retain();

        Buffer scaleAndFill(int i, int i2, int i3, int i4);

        I420Buffer toI420();
    }

    public interface I420Buffer extends Buffer {
        static {
            Covode.recordClassIndex(106755);
        }

        ByteBuffer getDataU();

        ByteBuffer getDataV();

        ByteBuffer getDataY();

        int getStrideU();

        int getStrideV();

        int getStrideY();
    }

    public interface TextureBuffer extends Buffer {
        static {
            Covode.recordClassIndex(106756);
        }

        int getTextureId();

        Matrix getTransformMatrix();

        Type getType();

        int getTypeGlTarget();

        float[] nativeGetTransFormMatrix();

        public enum Type {
            OES(36197),
            RGB(3553);
            
            private final int glTarget;

            public final int getGlTarget() {
                return this.glTarget;
            }

            static {
                Covode.recordClassIndex(106757);
            }

            private Type(int i) {
                this.glTarget = i;
            }
        }
    }

    static {
        Covode.recordClassIndex(106753);
    }

    public Buffer getBuffer() {
        return this.buffer;
    }

    public ByteBuffer getExtendedData() {
        return this.extendedData;
    }

    public boolean getFlipState() {
        return this.isFlip;
    }

    public int getRotation() {
        return this.rotation;
    }

    public long getTimestampNs() {
        return this.timestampNs;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        this.buffer.release();
    }

    @Override // org.webrtc.RefCounted
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

    public void setFlipState(boolean z) {
        this.isFlip = z;
    }

    public static ByteBuffer allocateDirectByteBuffer(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    public VideoFrame(Buffer buffer2, int i, long j) {
        this(buffer2, (ByteBuffer) null, i, j);
    }

    public VideoFrame(Buffer buffer2, int i, long j, boolean z) {
        if (buffer2 == null) {
            throw new IllegalArgumentException("buffer not allowed to be null");
        } else if (i % 90 == 0) {
            this.buffer = buffer2;
            this.rotation = i;
            this.timestampNs = j;
            this.extendedData = null;
            this.isFlip = z;
        } else {
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
    }

    public VideoFrame(Buffer buffer2, ByteBuffer byteBuffer, int i, long j) {
        if (buffer2 == null) {
            throw new IllegalArgumentException("buffer not allowed to be null");
        } else if (i % 90 == 0) {
            this.buffer = buffer2;
            this.rotation = i;
            this.timestampNs = j;
            this.extendedData = byteBuffer;
        } else {
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
    }

    public VideoFrame(Buffer buffer2, ByteBuffer byteBuffer, int i, long j, boolean z) {
        if (buffer2 == null) {
            throw new IllegalArgumentException("buffer not allowed to be null");
        } else if (i % 90 == 0) {
            this.buffer = buffer2;
            this.rotation = i;
            this.timestampNs = j;
            this.extendedData = byteBuffer;
            this.isFlip = z;
        } else {
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
    }
}
