package org.webrtc;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

public class EncodedImage {
    public final ByteBuffer buffer;
    public final long captureTimeMs;
    public final long captureTimeNs;
    public final boolean completeFrame;
    public final int encodedHeight;
    public final int encodedWidth;
    public final FrameType frameType;

    /* renamed from: qp */
    public final Integer f205060qp;
    public final int rotation;

    /* renamed from: org.webrtc.EncodedImage$1 */
    static /* synthetic */ class C902881 {
        static {
            Covode.recordClassIndex(106628);
        }
    }

    static {
        Covode.recordClassIndex(106627);
    }

    public static class Builder {
        private ByteBuffer buffer;
        private long captureTimeNs;
        private boolean completeFrame;
        private int encodedHeight;
        private int encodedWidth;
        private FrameType frameType;

        /* renamed from: qp */
        private Integer f205061qp;
        private int rotation;

        static {
            Covode.recordClassIndex(106629);
        }

        private Builder() {
        }

        public EncodedImage createEncodedImage() {
            return new EncodedImage(this.buffer, this.encodedWidth, this.encodedHeight, this.captureTimeNs, this.frameType, this.rotation, this.completeFrame, this.f205061qp, null);
        }

        public Builder setBuffer(ByteBuffer byteBuffer) {
            this.buffer = byteBuffer;
            return this;
        }

        public Builder setCaptureTimeNs(long j) {
            this.captureTimeNs = j;
            return this;
        }

        public Builder setCompleteFrame(boolean z) {
            this.completeFrame = z;
            return this;
        }

        public Builder setEncodedHeight(int i) {
            this.encodedHeight = i;
            return this;
        }

        public Builder setEncodedWidth(int i) {
            this.encodedWidth = i;
            return this;
        }

        public Builder setFrameType(FrameType frameType2) {
            this.frameType = frameType2;
            return this;
        }

        public Builder setQp(Integer num) {
            this.f205061qp = num;
            return this;
        }

        public Builder setRotation(int i) {
            this.rotation = i;
            return this;
        }

        /* synthetic */ Builder(C902881 r1) {
            this();
        }

        public Builder setCaptureTimeMs(long j) {
            this.captureTimeNs = TimeUnit.MILLISECONDS.toNanos(j);
            return this;
        }
    }

    public enum FrameType {
        EmptyFrame(0),
        VideoFrameKey(3),
        VideoFrameDelta(4);
        
        private final int nativeIndex;

        public final int getNative() {
            return this.nativeIndex;
        }

        static {
            Covode.recordClassIndex(106630);
        }

        static FrameType fromNativeIndex(int i) {
            FrameType[] values = values();
            for (FrameType frameType : values) {
                if (frameType.getNative() == i) {
                    return frameType;
                }
            }
            throw new IllegalArgumentException("Unknown native frame type: ".concat(String.valueOf(i)));
        }

        private FrameType(int i) {
            this.nativeIndex = i;
        }
    }

    private ByteBuffer getBuffer() {
        return this.buffer;
    }

    private long getCaptureTimeNs() {
        return this.captureTimeNs;
    }

    private boolean getCompleteFrame() {
        return this.completeFrame;
    }

    private int getEncodedHeight() {
        return this.encodedHeight;
    }

    private int getEncodedWidth() {
        return this.encodedWidth;
    }

    private Integer getQp() {
        return this.f205060qp;
    }

    private int getRotation() {
        return this.rotation;
    }

    public static Builder builder() {
        return new Builder(null);
    }

    private int getFrameType() {
        return this.frameType.getNative();
    }

    private EncodedImage(ByteBuffer byteBuffer, int i, int i2, long j, FrameType frameType2, int i3, boolean z, Integer num) {
        this.buffer = byteBuffer;
        this.encodedWidth = i;
        this.encodedHeight = i2;
        this.captureTimeMs = TimeUnit.NANOSECONDS.toMillis(j);
        this.captureTimeNs = j;
        this.frameType = frameType2;
        this.rotation = i3;
        this.completeFrame = z;
        this.f205060qp = num;
    }

    /* synthetic */ EncodedImage(ByteBuffer byteBuffer, int i, int i2, long j, FrameType frameType2, int i3, boolean z, Integer num, C902881 r10) {
        this(byteBuffer, i, i2, j, frameType2, i3, z, num);
    }
}
