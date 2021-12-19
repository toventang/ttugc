package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.UnsafeUtils;

final class XXHash32JavaUnsafe extends XXHash32 {
    public static final XXHash32 INSTANCE = new XXHash32JavaUnsafe();

    XXHash32JavaUnsafe() {
    }

    static {
        Covode.recordClassIndex(106126);
    }

    @Override // net.jpountz.xxhash.XXHash32
    public final int hash(ByteBuffer byteBuffer, int i, int i2, int i3) {
        int i4;
        int i5 = i;
        if (byteBuffer.hasArray()) {
            return hash(byteBuffer.array(), i5 + byteBuffer.arrayOffset(), i2, i3);
        }
        ByteBufferUtils.checkRange(byteBuffer, i5, i2);
        ByteBuffer inLittleEndianOrder = ByteBufferUtils.inLittleEndianOrder(byteBuffer);
        int i6 = i5 + i2;
        if (i2 >= 16) {
            int i7 = i6 - 16;
            int i8 = (i3 - 1640531535) - 2048144777;
            int i9 = i3 - 2048144777;
            int i10 = i3 + 0;
            int i11 = i3 - -1640531535;
            do {
                i8 = Integer.rotateLeft(i8 + (ByteBufferUtils.readIntLE(inLittleEndianOrder, i5) * -2048144777), 13) * -1640531535;
                int i12 = i5 + 4;
                i9 = Integer.rotateLeft(i9 + (ByteBufferUtils.readIntLE(inLittleEndianOrder, i12) * -2048144777), 13) * -1640531535;
                int i13 = i12 + 4;
                i10 = Integer.rotateLeft(i10 + (ByteBufferUtils.readIntLE(inLittleEndianOrder, i13) * -2048144777), 13) * -1640531535;
                int i14 = i13 + 4;
                i11 = Integer.rotateLeft(i11 + (ByteBufferUtils.readIntLE(inLittleEndianOrder, i14) * -2048144777), 13) * -1640531535;
                i5 = i14 + 4;
            } while (i5 <= i7);
            i4 = Integer.rotateLeft(i8, 1) + Integer.rotateLeft(i9, 7) + Integer.rotateLeft(i10, 12) + Integer.rotateLeft(i11, 18);
        } else {
            i4 = i3 + 374761393;
        }
        int i15 = i4 + i2;
        while (i5 <= i6 - 4) {
            i15 = Integer.rotateLeft(i15 + (ByteBufferUtils.readIntLE(inLittleEndianOrder, i5) * -1028477379), 17) * 668265263;
            i5 += 4;
        }
        while (i5 < i6) {
            i15 = Integer.rotateLeft(i15 + ((ByteBufferUtils.readByte(inLittleEndianOrder, i5) & 255) * 374761393), 11) * -1640531535;
            i5++;
        }
        int i16 = ((i15 >>> 15) ^ i15) * -2048144777;
        int i17 = (i16 ^ (i16 >>> 13)) * -1028477379;
        return i17 ^ (i17 >>> 16);
    }

    @Override // net.jpountz.xxhash.XXHash32
    public final int hash(byte[] bArr, int i, int i2, int i3) {
        int i4;
        UnsafeUtils.checkRange(bArr, i, i2);
        int i5 = i + i2;
        if (i2 >= 16) {
            int i6 = i5 - 16;
            int i7 = (i3 - 1640531535) - 2048144777;
            int i8 = i3 - 2048144777;
            int i9 = i3 + 0;
            int i10 = i3 - -1640531535;
            do {
                i7 = Integer.rotateLeft(i7 + (UnsafeUtils.readIntLE(bArr, i) * -2048144777), 13) * -1640531535;
                int i11 = i + 4;
                i8 = Integer.rotateLeft(i8 + (UnsafeUtils.readIntLE(bArr, i11) * -2048144777), 13) * -1640531535;
                int i12 = i11 + 4;
                i9 = Integer.rotateLeft(i9 + (UnsafeUtils.readIntLE(bArr, i12) * -2048144777), 13) * -1640531535;
                int i13 = i12 + 4;
                i10 = Integer.rotateLeft(i10 + (UnsafeUtils.readIntLE(bArr, i13) * -2048144777), 13) * -1640531535;
                i = i13 + 4;
            } while (i <= i6);
            i4 = Integer.rotateLeft(i7, 1) + Integer.rotateLeft(i8, 7) + Integer.rotateLeft(i9, 12) + Integer.rotateLeft(i10, 18);
        } else {
            i4 = i3 + 374761393;
        }
        int i14 = i4 + i2;
        while (i <= i5 - 4) {
            i14 = Integer.rotateLeft(i14 + (UnsafeUtils.readIntLE(bArr, i) * -1028477379), 17) * 668265263;
            i += 4;
        }
        while (i < i5) {
            i14 = Integer.rotateLeft(i14 + ((UnsafeUtils.readByte(bArr, i) & 255) * 374761393), 11) * -1640531535;
            i++;
        }
        int i15 = ((i14 >>> 15) ^ i14) * -2048144777;
        int i16 = (i15 ^ (i15 >>> 13)) * -1028477379;
        return i16 ^ (i16 >>> 16);
    }
}
