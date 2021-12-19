package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;

public interface LZ4Decompressor {
    static {
        Covode.recordClassIndex(106063);
    }

    int decompress(byte[] bArr, int i, byte[] bArr2, int i2, int i3);
}
