package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;
import net.jpountz.util.SafeUtils;

enum LZ4SafeUtils {
    ;

    static class Match {
        int len;
        int ref;
        int start;

        static {
            Covode.recordClassIndex(106092);
        }

        Match() {
        }

        /* access modifiers changed from: package-private */
        public int end() {
            return this.start + this.len;
        }

        /* access modifiers changed from: package-private */
        public void fix(int i) {
            this.start += i;
            this.ref += i;
            this.len -= i;
        }
    }

    static {
        Covode.recordClassIndex(106091);
    }

    static void copyTo(Match match, Match match2) {
        match2.len = match.len;
        match2.start = match.start;
        match2.ref = match.ref;
    }

    static int hash(byte[] bArr, int i) {
        return LZ4Utils.hash(SafeUtils.readInt(bArr, i));
    }

    static int hash64k(byte[] bArr, int i) {
        return LZ4Utils.hash64k(SafeUtils.readInt(bArr, i));
    }

    static int writeLen(int i, byte[] bArr, int i2) {
        while (i >= 255) {
            bArr[i2] = -1;
            i -= 255;
            i2++;
        }
        int i3 = i2 + 1;
        bArr[i2] = (byte) i;
        return i3;
    }

    static boolean readIntEquals(byte[] bArr, int i, int i2) {
        if (bArr[i] == bArr[i2] && bArr[i + 1] == bArr[i2 + 1] && bArr[i + 2] == bArr[i2 + 2] && bArr[i + 3] == bArr[i2 + 3]) {
            return true;
        }
        return false;
    }

    static void safeIncrementalCopy(byte[] bArr, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i2 + i4] = bArr[i + i4];
        }
    }

    static void wildIncrementalCopy(byte[] bArr, int i, int i2, int i3) {
        do {
            copy8Bytes(bArr, i, bArr, i2);
            i += 8;
            i2 += 8;
        } while (i2 < i3);
    }

    static int commonBytes(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i2 < i3) {
            int i5 = i + 1;
            int i6 = i2 + 1;
            if (bArr[i] != bArr[i2]) {
                break;
            }
            i4++;
            i = i5;
            i2 = i6;
        }
        return i4;
    }

    static void copy8Bytes(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = 0;
        do {
            bArr2[i2 + i3] = bArr[i + i3];
            i3++;
        } while (i3 < 8);
    }

    static void safeArraycopy(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        System.arraycopy(bArr, i, bArr2, i2, i3);
    }

    static int commonBytesBackward(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = 0;
        while (i > i3 && i2 > i4) {
            i--;
            i2--;
            if (bArr[i] != bArr[i2]) {
                break;
            }
            i5++;
        }
        return i5;
    }

    static void wildArraycopy(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4 += 8) {
            try {
                copy8Bytes(bArr, i + i4, bArr2, i2 + i4);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new LZ4Exception("Malformed input at offset ".concat(String.valueOf(i)));
            }
        }
    }

    static int lastLiterals(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5;
        if (i3 + i2 + 1 + (((i2 + 255) - 15) / 255) <= i4) {
            if (i2 >= 15) {
                bArr2[i3] = -16;
                i5 = writeLen(i2 - 15, bArr2, i3 + 1);
            } else {
                i5 = i3 + 1;
                bArr2[i3] = (byte) (i2 << 4);
            }
            System.arraycopy(bArr, i, bArr2, i5, i2);
            return i5 + i2;
        }
        throw new LZ4Exception();
    }

    static int encodeSequence(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        int i7;
        int i8;
        int i9 = i2 - i;
        int i10 = i5 + 1;
        if (i10 + i9 + 8 + (i9 >>> 8) <= i6) {
            if (i9 >= 15) {
                i7 = -16;
                i10 = writeLen(i9 - 15, bArr2, i10);
            } else {
                i7 = i9 << 4;
            }
            wildArraycopy(bArr, i, bArr2, i10, i9);
            int i11 = i10 + i9;
            int i12 = i2 - i3;
            int i13 = i11 + 1;
            bArr2[i11] = (byte) i12;
            int i14 = i13 + 1;
            bArr2[i13] = (byte) (i12 >>> 8);
            int i15 = i4 - 4;
            if (i14 + 6 + (i15 >>> 8) <= i6) {
                if (i15 >= 15) {
                    i8 = i7 | 15;
                    i14 = writeLen(i15 - 15, bArr2, i14);
                } else {
                    i8 = i7 | i15;
                }
                bArr2[i5] = (byte) i8;
                return i14;
            }
            throw new LZ4Exception("maxDestLen is too small");
        }
        throw new LZ4Exception("maxDestLen is too small");
    }
}
