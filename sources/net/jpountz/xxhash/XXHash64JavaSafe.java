package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class XXHash64JavaSafe extends XXHash64 {
    public static final XXHash64 INSTANCE = new XXHash64JavaSafe();

    XXHash64JavaSafe() {
    }

    static {
        Covode.recordClassIndex(106129);
    }

    @Override // net.jpountz.xxhash.XXHash64
    public final long hash(ByteBuffer byteBuffer, int i, int i2, long j) {
        long j2;
        int i3 = i;
        if (byteBuffer.hasArray()) {
            return hash(byteBuffer.array(), i3 + byteBuffer.arrayOffset(), i2, j);
        }
        ByteBufferUtils.checkRange(byteBuffer, i3, i2);
        ByteBuffer inLittleEndianOrder = ByteBufferUtils.inLittleEndianOrder(byteBuffer);
        int i4 = i3 + i2;
        long j3 = -4417276706812531889L;
        if (i2 >= 32) {
            int i5 = i4 - 32;
            long j4 = (j - 7046029288634856825L) - 4417276706812531889L;
            long j5 = j - 4417276706812531889L;
            long j6 = j + 0;
            long j7 = j - -7046029288634856825L;
            while (true) {
                j4 = Long.rotateLeft(j4 + (ByteBufferUtils.readLongLE(inLittleEndianOrder, i3) * j3), 31) * -7046029288634856825L;
                int i6 = i3 + 8;
                j5 = Long.rotateLeft(j5 + (ByteBufferUtils.readLongLE(inLittleEndianOrder, i6) * j3), 31) * -7046029288634856825L;
                int i7 = i6 + 8;
                j6 = Long.rotateLeft(j6 + (ByteBufferUtils.readLongLE(inLittleEndianOrder, i7) * j3), 31) * -7046029288634856825L;
                int i8 = i7 + 8;
                j7 = Long.rotateLeft(j7 + (ByteBufferUtils.readLongLE(inLittleEndianOrder, i8) * j3), 31) * -7046029288634856825L;
                i3 = i8 + 8;
                if (i3 > i5) {
                    break;
                }
                j3 = -4417276706812531889L;
            }
            j2 = ((((((((((((Long.rotateLeft(j4 * -4417276706812531889L, 31) * -7046029288634856825L) ^ (((Long.rotateLeft(j4, 1) + Long.rotateLeft(j5, 7)) + Long.rotateLeft(j6, 12)) + Long.rotateLeft(j7, 18))) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(j5 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(j6 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(j7 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L;
        } else {
            j2 = j + 2870177450012600261L;
        }
        long j8 = j2 + ((long) i2);
        while (i3 <= i4 - 8) {
            j8 = (Long.rotateLeft(j8 ^ (Long.rotateLeft(ByteBufferUtils.readLongLE(inLittleEndianOrder, i3) * -4417276706812531889L, 31) * -7046029288634856825L), 27) * -7046029288634856825L) - 8796714831421723037L;
            i3 += 8;
        }
        if (i3 <= i4 - 4) {
            j8 = (Long.rotateLeft(j8 ^ ((((long) ByteBufferUtils.readIntLE(inLittleEndianOrder, i3)) & 4294967295L) * -7046029288634856825L), 23) * -4417276706812531889L) + 1609587929392839161L;
            i3 += 4;
        }
        while (i3 < i4) {
            j8 = Long.rotateLeft(j8 ^ (((long) (ByteBufferUtils.readByte(inLittleEndianOrder, i3) & 255)) * 2870177450012600261L), 11) * -7046029288634856825L;
            i3++;
        }
        long j9 = ((j8 >>> 33) ^ j8) * -4417276706812531889L;
        long j10 = (j9 ^ (j9 >>> 29)) * 1609587929392839161L;
        return j10 ^ (j10 >>> 32);
    }

    @Override // net.jpountz.xxhash.XXHash64
    public final long hash(byte[] bArr, int i, int i2, long j) {
        long j2;
        int i3 = i;
        SafeUtils.checkRange(bArr, i3, i2);
        int i4 = i3 + i2;
        long j3 = -4417276706812531889L;
        if (i2 >= 32) {
            int i5 = i4 - 32;
            long j4 = (j - 7046029288634856825L) - 4417276706812531889L;
            long j5 = j - 4417276706812531889L;
            long j6 = j + 0;
            long j7 = j - -7046029288634856825L;
            while (true) {
                j4 = Long.rotateLeft(j4 + (SafeUtils.readLongLE(bArr, i3) * j3), 31) * -7046029288634856825L;
                int i6 = i3 + 8;
                j5 = Long.rotateLeft(j5 + (SafeUtils.readLongLE(bArr, i6) * j3), 31) * -7046029288634856825L;
                int i7 = i6 + 8;
                j6 = Long.rotateLeft(j6 + (SafeUtils.readLongLE(bArr, i7) * j3), 31) * -7046029288634856825L;
                int i8 = i7 + 8;
                j7 = Long.rotateLeft(j7 + (SafeUtils.readLongLE(bArr, i8) * -4417276706812531889L), 31) * -7046029288634856825L;
                i3 = i8 + 8;
                if (i3 > i5) {
                    break;
                }
                j3 = -4417276706812531889L;
            }
            long rotateLeft = Long.rotateLeft(j4, 1) + Long.rotateLeft(j5, 7) + Long.rotateLeft(j6, 12) + Long.rotateLeft(j7, 18);
            j2 = (((Long.rotateLeft(j7 * -4417276706812531889L, 31) * -7046029288634856825L) ^ ((((((((((Long.rotateLeft(j4 * -4417276706812531889L, 31) * -7046029288634856825L) ^ rotateLeft) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(j5 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(j6 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L)) * -7046029288634856825L) - 8796714831421723037L;
        } else {
            j2 = j + 2870177450012600261L;
        }
        long j8 = j2 + ((long) i2);
        while (i3 <= i4 - 8) {
            j8 = (Long.rotateLeft(j8 ^ (Long.rotateLeft(SafeUtils.readLongLE(bArr, i3) * -4417276706812531889L, 31) * -7046029288634856825L), 27) * -7046029288634856825L) - 8796714831421723037L;
            i3 += 8;
        }
        if (i3 <= i4 - 4) {
            j8 = (Long.rotateLeft(j8 ^ ((((long) SafeUtils.readIntLE(bArr, i3)) & 4294967295L) * -7046029288634856825L), 23) * -4417276706812531889L) + 1609587929392839161L;
            i3 += 4;
        }
        while (i3 < i4) {
            j8 = Long.rotateLeft(j8 ^ (((long) (SafeUtils.readByte(bArr, i3) & 255)) * 2870177450012600261L), 11) * -7046029288634856825L;
            i3++;
        }
        long j9 = (j8 ^ (j8 >>> 33)) * -4417276706812531889L;
        long j10 = (j9 ^ (j9 >>> 29)) * 1609587929392839161L;
        return j10 ^ (j10 >>> 32);
    }
}
