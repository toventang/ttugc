package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public abstract class XXHash64 {
    static {
        Covode.recordClassIndex(106127);
    }

    public abstract long hash(ByteBuffer byteBuffer, int i, int i2, long j);

    public abstract long hash(byte[] bArr, int i, int i2, long j);

    public String toString() {
        return getClass().getSimpleName();
    }

    public final long hash(ByteBuffer byteBuffer, long j) {
        long hash = hash(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.limit());
        return hash;
    }
}
