package net.jpountz.xxhash;

import com.bytedance.covode.number.Covode;
import net.jpountz.util.SafeUtils;
import net.jpountz.util.UnsafeUtils;
import net.jpountz.xxhash.StreamingXXHash64;

final class StreamingXXHash64JavaUnsafe extends AbstractStreamingXXHash64Java {
    static {
        Covode.recordClassIndex(106121);
    }

    static class Factory implements StreamingXXHash64.Factory {
        public static final StreamingXXHash64.Factory INSTANCE = new Factory();

        Factory() {
        }

        static {
            Covode.recordClassIndex(106122);
        }

        @Override // net.jpountz.xxhash.StreamingXXHash64.Factory
        public StreamingXXHash64 newStreamingHash(long j) {
            return new StreamingXXHash64JavaUnsafe(j);
        }
    }

    @Override // net.jpountz.xxhash.StreamingXXHash64
    public final long getValue() {
        long j;
        if (this.totalLen >= 32) {
            long j2 = this.f203849v1;
            long j3 = this.f203850v2;
            long j4 = this.f203851v3;
            long j5 = this.f203852v4;
            j = ((((((((((((Long.rotateLeft(j2 * -4417276706812531889L, 31) * -7046029288634856825L) ^ (((Long.rotateLeft(j2, 1) + Long.rotateLeft(j3, 7)) + Long.rotateLeft(j4, 12)) + Long.rotateLeft(j5, 18))) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(j3 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(j4 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L) ^ (Long.rotateLeft(j5 * -4417276706812531889L, 31) * -7046029288634856825L)) * -7046029288634856825L) - 8796714831421723037L;
        } else {
            j = this.seed + 2870177450012600261L;
        }
        long j6 = j + this.totalLen;
        int i = 0;
        while (i <= this.memSize - 8) {
            j6 = (Long.rotateLeft(j6 ^ (Long.rotateLeft(UnsafeUtils.readLongLE(this.memory, i) * -4417276706812531889L, 31) * -7046029288634856825L), 27) * -7046029288634856825L) - 8796714831421723037L;
            i += 8;
        }
        if (i <= this.memSize - 4) {
            j6 = (Long.rotateLeft(j6 ^ ((((long) UnsafeUtils.readIntLE(this.memory, i)) & 4294967295L) * -7046029288634856825L), 23) * -4417276706812531889L) + 1609587929392839161L;
            i += 4;
        }
        while (i < this.memSize) {
            j6 = Long.rotateLeft(j6 ^ (((long) (this.memory[i] & 255)) * 2870177450012600261L), 11) * -7046029288634856825L;
            i++;
        }
        long j7 = (j6 ^ (j6 >>> 33)) * -4417276706812531889L;
        long j8 = (j7 ^ (j7 >>> 29)) * 1609587929392839161L;
        return j8 ^ (j8 >>> 32);
    }

    StreamingXXHash64JavaUnsafe(long j) {
        super(j);
    }

    @Override // net.jpountz.xxhash.StreamingXXHash64
    public final void update(byte[] bArr, int i, int i2) {
        int i3 = i;
        SafeUtils.checkRange(bArr, i3, i2);
        this.totalLen += (long) i2;
        if (this.memSize + i2 < 32) {
            System.arraycopy(bArr, i3, this.memory, this.memSize, i2);
            this.memSize += i2;
            return;
        }
        int i4 = i2 + i3;
        long j = -4417276706812531889L;
        if (this.memSize > 0) {
            System.arraycopy(bArr, i3, this.memory, this.memSize, 32 - this.memSize);
            this.f203849v1 += UnsafeUtils.readLongLE(this.memory, 0) * -4417276706812531889L;
            this.f203849v1 = Long.rotateLeft(this.f203849v1, 31);
            this.f203849v1 *= -7046029288634856825L;
            this.f203850v2 += UnsafeUtils.readLongLE(this.memory, 8) * -4417276706812531889L;
            this.f203850v2 = Long.rotateLeft(this.f203850v2, 31);
            this.f203850v2 *= -7046029288634856825L;
            this.f203851v3 += UnsafeUtils.readLongLE(this.memory, 16) * -4417276706812531889L;
            this.f203851v3 = Long.rotateLeft(this.f203851v3, 31);
            this.f203851v3 *= -7046029288634856825L;
            this.f203852v4 += UnsafeUtils.readLongLE(this.memory, 24) * -4417276706812531889L;
            this.f203852v4 = Long.rotateLeft(this.f203852v4, 31);
            this.f203852v4 *= -7046029288634856825L;
            i3 += 32 - this.memSize;
            this.memSize = 0;
        }
        int i5 = i4 - 32;
        long j2 = this.f203849v1;
        long j3 = this.f203850v2;
        long j4 = this.f203851v3;
        long j5 = this.f203852v4;
        while (i3 <= i5) {
            j2 = Long.rotateLeft(j2 + (UnsafeUtils.readLongLE(bArr, i3) * j), 31) * -7046029288634856825L;
            int i6 = i3 + 8;
            j3 = Long.rotateLeft(j3 + (UnsafeUtils.readLongLE(bArr, i6) * -4417276706812531889L), 31) * -7046029288634856825L;
            int i7 = i6 + 8;
            j4 = Long.rotateLeft(j4 + (UnsafeUtils.readLongLE(bArr, i7) * -4417276706812531889L), 31) * -7046029288634856825L;
            int i8 = i7 + 8;
            j5 = Long.rotateLeft(j5 + (UnsafeUtils.readLongLE(bArr, i8) * -4417276706812531889L), 31) * -7046029288634856825L;
            i3 = i8 + 8;
            j = -4417276706812531889L;
        }
        this.f203849v1 = j2;
        this.f203850v2 = j3;
        this.f203851v3 = j4;
        this.f203852v4 = j5;
        if (i3 < i4) {
            int i9 = i4 - i3;
            System.arraycopy(bArr, i3, this.memory, 0, i9);
            this.memSize = i9;
        }
    }
}
