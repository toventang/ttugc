package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;
import java.util.zip.Checksum;

public abstract class StreamingXXHash64 {
    final long seed;

    /* access modifiers changed from: package-private */
    public interface Factory {
        static {
            Covode.recordClassIndex(106116);
        }

        StreamingXXHash64 newStreamingHash(long j);
    }

    static {
        Covode.recordClassIndex(106114);
    }

    public abstract long getValue();

    public abstract void reset();

    public abstract void update(byte[] bArr, int i, int i2);

    public final Checksum asChecksum() {
        return new Checksum() {
            /* class net.jpountz.xxhash.StreamingXXHash64.C899641 */

            static {
                Covode.recordClassIndex(106115);
            }

            public long getValue() {
                return StreamingXXHash64.this.getValue();
            }

            public void reset() {
                StreamingXXHash64.this.reset();
            }

            public String toString() {
                return StreamingXXHash64.this.toString();
            }

            public void update(int i) {
                StreamingXXHash64.this.update(new byte[]{(byte) i}, 0, 1);
            }

            public void update(byte[] bArr, int i, int i2) {
                StreamingXXHash64.this.update(bArr, i, i2);
            }
        };
    }

    public String toString() {
        return getClass().getSimpleName() + "(seed=" + this.seed + ")";
    }

    StreamingXXHash64(long j) {
        this.seed = j;
    }
}
