package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;

public interface LZ4UnknownSizeDecompressor {
    static {
        Covode.recordClassIndex(106093);
    }

    int decompress(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

    int decompress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);
}
