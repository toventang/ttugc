package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;

public abstract class XXHash32 {
    static {
        Covode.recordClassIndex(106123);
    }

    public abstract int hash(ByteBuffer byteBuffer, int i, int i2, int i3);

    public abstract int hash(byte[] bArr, int i, int i2, int i3);

    public String toString() {
        return getClass().getSimpleName();
    }

    public final int hash(ByteBuffer byteBuffer, int i) {
        int hash = hash(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), i);
        byteBuffer.position(byteBuffer.limit());
        return hash;
    }
}
