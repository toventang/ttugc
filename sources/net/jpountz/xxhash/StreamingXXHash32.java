package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;
import java.util.zip.Checksum;

public abstract class StreamingXXHash32 {
    final int seed;

    /* access modifiers changed from: package-private */
    public interface Factory {
        static {
            Covode.recordClassIndex(106107);
        }

        StreamingXXHash32 newStreamingHash(int i);
    }

    static {
        Covode.recordClassIndex(106105);
    }

    public abstract int getValue();

    public abstract void reset();

    public abstract void update(byte[] bArr, int i, int i2);

    public final Checksum asChecksum() {
        return new Checksum() {
            /* class net.jpountz.xxhash.StreamingXXHash32.C899631 */

            static {
                Covode.recordClassIndex(106106);
            }

            public void reset() {
                StreamingXXHash32.this.reset();
            }

            public String toString() {
                return StreamingXXHash32.this.toString();
            }

            public long getValue() {
                return ((long) StreamingXXHash32.this.getValue()) & 268435455;
            }

            public void update(int i) {
                StreamingXXHash32.this.update(new byte[]{(byte) i}, 0, 1);
            }

            public void update(byte[] bArr, int i, int i2) {
                StreamingXXHash32.this.update(bArr, i, i2);
            }
        };
    }

    public String toString() {
        return getClass().getSimpleName() + "(seed=" + this.seed + ")";
    }

    StreamingXXHash32(int i) {
        this.seed = i;
    }
}
