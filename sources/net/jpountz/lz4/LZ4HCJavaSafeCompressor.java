package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import net.jpountz.lz4.LZ4Utils;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

/* access modifiers changed from: package-private */
public final class LZ4HCJavaSafeCompressor extends LZ4Compressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4Compressor INSTANCE = new LZ4HCJavaSafeCompressor();
    final int compressionLevel;
    public final int maxAttempts;

    LZ4HCJavaSafeCompressor() {
        this(9);
    }

    /* access modifiers changed from: package-private */
    public class HashTable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final int base;
        private final short[] chainTable = new short[65536];
        private final int[] hashTable;
        int nextToUpdate;

        static {
            Covode.recordClassIndex(106077);
        }

        private int hashPointer(int i) {
            return this.hashTable[LZ4Utils.hashHC(i)];
        }

        private int next(int i) {
            return i - (this.chainTable[i & 65535] & 65535);
        }

        private void addHash(ByteBuffer byteBuffer, int i) {
            addHash(ByteBufferUtils.readInt(byteBuffer, i), i);
        }

        private void addHash(byte[] bArr, int i) {
            addHash(SafeUtils.readInt(bArr, i), i);
        }

        /* access modifiers changed from: package-private */
        public void insert(int i, ByteBuffer byteBuffer) {
            while (true) {
                int i2 = this.nextToUpdate;
                if (i2 < i) {
                    addHash(byteBuffer, i2);
                    this.nextToUpdate++;
                } else {
                    return;
                }
            }
        }

        HashTable(int i) {
            this.base = i;
            this.nextToUpdate = i;
            int[] iArr = new int[32768];
            this.hashTable = iArr;
            Arrays.fill(iArr, -1);
        }

        private void addHash(int i, int i2) {
            int hashHC = LZ4Utils.hashHC(i);
            int[] iArr = this.hashTable;
            int i3 = i2 - iArr[hashHC];
            if (i3 >= 65536) {
                i3 = 65535;
            }
            this.chainTable[65535 & i2] = (short) i3;
            iArr[hashHC] = i2;
        }

        private int hashPointer(ByteBuffer byteBuffer, int i) {
            return hashPointer(ByteBufferUtils.readInt(byteBuffer, i));
        }

        /* access modifiers changed from: package-private */
        public void insert(int i, byte[] bArr) {
            while (true) {
                int i2 = this.nextToUpdate;
                if (i2 < i) {
                    addHash(bArr, i2);
                    this.nextToUpdate++;
                } else {
                    return;
                }
            }
        }

        private int hashPointer(byte[] bArr, int i) {
            return hashPointer(SafeUtils.readInt(bArr, i));
        }

        /* access modifiers changed from: package-private */
        public boolean insertAndFindBestMatch(ByteBuffer byteBuffer, int i, int i2, LZ4Utils.Match match) {
            int i3;
            int i4;
            int commonBytes;
            match.start = i;
            match.len = 0;
            insert(i, byteBuffer);
            int hashPointer = hashPointer(byteBuffer, i);
            if (hashPointer < i - 4 || hashPointer > i || hashPointer < this.base) {
                i3 = 0;
                i4 = 0;
            } else {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, hashPointer, i)) {
                    i3 = i - hashPointer;
                    i4 = LZ4ByteBufferUtils.commonBytes(byteBuffer, hashPointer + 4, i + 4, i2) + 4;
                    match.len = i4;
                    match.ref = hashPointer;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                hashPointer = next(hashPointer);
            }
            for (int i5 = 0; i5 < LZ4HCJavaSafeCompressor.this.maxAttempts && hashPointer >= Math.max(this.base, (i - 65536) + 1) && hashPointer <= i; i5++) {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, hashPointer, i) && (commonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, hashPointer + 4, i + 4, i2) + 4) > match.len) {
                    match.ref = hashPointer;
                    match.len = commonBytes;
                }
                hashPointer = next(hashPointer);
            }
            if (i4 != 0) {
                int i6 = (i4 + i) - 3;
                while (i < i6 - i3) {
                    this.chainTable[65535 & i] = (short) i3;
                    i++;
                }
                do {
                    this.chainTable[i & 65535] = (short) i3;
                    this.hashTable[LZ4Utils.hashHC(ByteBufferUtils.readInt(byteBuffer, i))] = i;
                    i++;
                } while (i < i6);
                this.nextToUpdate = i6;
            }
            if (match.len != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean insertAndFindBestMatch(byte[] bArr, int i, int i2, LZ4Utils.Match match) {
            int i3;
            int i4;
            int commonBytes;
            match.start = i;
            match.len = 0;
            insert(i, bArr);
            int hashPointer = hashPointer(bArr, i);
            if (hashPointer < i - 4 || hashPointer > i || hashPointer < this.base) {
                i3 = 0;
                i4 = 0;
            } else {
                if (LZ4SafeUtils.readIntEquals(bArr, hashPointer, i)) {
                    i3 = i - hashPointer;
                    i4 = LZ4SafeUtils.commonBytes(bArr, hashPointer + 4, i + 4, i2) + 4;
                    match.len = i4;
                    match.ref = hashPointer;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                hashPointer = next(hashPointer);
            }
            for (int i5 = 0; i5 < LZ4HCJavaSafeCompressor.this.maxAttempts && hashPointer >= Math.max(this.base, (i - 65536) + 1) && hashPointer <= i; i5++) {
                if (LZ4SafeUtils.readIntEquals(bArr, hashPointer, i) && (commonBytes = LZ4SafeUtils.commonBytes(bArr, hashPointer + 4, i + 4, i2) + 4) > match.len) {
                    match.ref = hashPointer;
                    match.len = commonBytes;
                }
                hashPointer = next(hashPointer);
            }
            if (i4 != 0) {
                int i6 = (i4 + i) - 3;
                while (i < i6 - i3) {
                    this.chainTable[65535 & i] = (short) i3;
                    i++;
                }
                do {
                    this.chainTable[i & 65535] = (short) i3;
                    this.hashTable[LZ4Utils.hashHC(SafeUtils.readInt(bArr, i))] = i;
                    i++;
                } while (i < i6);
                this.nextToUpdate = i6;
            }
            if (match.len != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean insertAndFindWiderMatch(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, LZ4Utils.Match match) {
            int commonBytesBackward;
            int commonBytes;
            match.len = i4;
            insert(i, byteBuffer);
            int hashPointer = hashPointer(byteBuffer, i);
            for (int i5 = 0; i5 < LZ4HCJavaSafeCompressor.this.maxAttempts && hashPointer >= Math.max(this.base, (i - 65536) + 1) && hashPointer <= i; i5++) {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, hashPointer, i) && (commonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, hashPointer + 4, i + 4, i3) + 4 + (commonBytesBackward = LZ4ByteBufferUtils.commonBytesBackward(byteBuffer, hashPointer, i, this.base, i2))) > match.len) {
                    match.len = commonBytes;
                    match.ref = hashPointer - commonBytesBackward;
                    match.start = i - commonBytesBackward;
                }
                hashPointer = next(hashPointer);
            }
            if (match.len > i4) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean insertAndFindWiderMatch(byte[] bArr, int i, int i2, int i3, int i4, LZ4Utils.Match match) {
            int commonBytesBackward;
            int commonBytes;
            match.len = i4;
            insert(i, bArr);
            int hashPointer = hashPointer(bArr, i);
            for (int i5 = 0; i5 < LZ4HCJavaSafeCompressor.this.maxAttempts && hashPointer >= Math.max(this.base, (i - 65536) + 1) && hashPointer <= i; i5++) {
                if (LZ4SafeUtils.readIntEquals(bArr, hashPointer, i) && (commonBytes = LZ4SafeUtils.commonBytes(bArr, hashPointer + 4, i + 4, i3) + 4 + (commonBytesBackward = LZ4SafeUtils.commonBytesBackward(bArr, hashPointer, i, this.base, i2))) > match.len) {
                    match.len = commonBytes;
                    match.ref = hashPointer - commonBytesBackward;
                    match.start = i - commonBytesBackward;
                }
                hashPointer = next(hashPointer);
            }
            if (match.len > i4) {
                return true;
            }
            return false;
        }
    }

    static {
        Covode.recordClassIndex(106076);
    }

    LZ4HCJavaSafeCompressor(int i) {
        this.maxAttempts = 1 << (i - 1);
        this.compressionLevel = i;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public final int compress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        int i5 = i;
        SafeUtils.checkRange(bArr, i5, i2);
        SafeUtils.checkRange(bArr2, i3, i4);
        int i6 = i5 + i2;
        int i7 = i3 + i4;
        int i8 = i6 - 12;
        int i9 = i6 - 5;
        int i10 = i5 + 1;
        HashTable hashTable = new HashTable(i5);
        LZ4Utils.Match match = new LZ4Utils.Match();
        LZ4Utils.Match match2 = new LZ4Utils.Match();
        LZ4Utils.Match match3 = new LZ4Utils.Match();
        LZ4Utils.Match match4 = new LZ4Utils.Match();
        int i11 = i3;
        while (i10 < i8) {
            if (!hashTable.insertAndFindBestMatch(bArr, i10, i9, match2)) {
                i10++;
            } else {
                LZ4Utils.copyTo(match2, match);
                while (true) {
                    if (match2.end() >= i8 || !hashTable.insertAndFindWiderMatch(bArr, match2.end() - 2, match2.start + 1, i9, match2.len, match3)) {
                        i11 = LZ4SafeUtils.encodeSequence(bArr, i5, match2.start, match2.ref, match2.len, bArr2, i11, i7);
                        i5 = match2.end();
                        i10 = i5;
                    } else {
                        if (match.start < match2.start && match3.start < match2.start + match.len) {
                            LZ4Utils.copyTo(match, match2);
                        }
                        if (match3.start - match2.start < 3) {
                            LZ4Utils.copyTo(match3, match2);
                        } else {
                            while (true) {
                                if (match3.start - match2.start < 18) {
                                    int i12 = match2.len;
                                    if (i12 > 18) {
                                        i12 = 18;
                                    }
                                    if (match2.start + i12 > match3.end() - 4) {
                                        i12 = ((match3.start - match2.start) + match3.len) - 4;
                                    }
                                    int i13 = i12 - (match3.start - match2.start);
                                    if (i13 > 0) {
                                        match3.fix(i13);
                                    }
                                }
                                if (match3.start + match3.len < i8 && hashTable.insertAndFindWiderMatch(bArr, match3.end() - 3, match3.start, i9, match3.len, match4)) {
                                    if (match4.start >= match2.end() + 3) {
                                        if (match3.start < match2.end()) {
                                            if (match3.start - match2.start < 15) {
                                                if (match2.len > 18) {
                                                    match2.len = 18;
                                                }
                                                if (match2.end() > match3.end() - 4) {
                                                    match2.len = (match3.end() - match2.start) - 4;
                                                }
                                                match3.fix(match2.end() - match3.start);
                                            } else {
                                                match2.len = match3.start - match2.start;
                                            }
                                        }
                                        i11 = LZ4SafeUtils.encodeSequence(bArr, i5, match2.start, match2.ref, match2.len, bArr2, i11, i7);
                                        i5 = match2.end();
                                        LZ4Utils.copyTo(match3, match2);
                                        LZ4Utils.copyTo(match4, match3);
                                    } else if (match4.start >= match2.end()) {
                                        if (match3.start < match2.end()) {
                                            match3.fix(match2.end() - match3.start);
                                            if (match3.len < 4) {
                                                LZ4Utils.copyTo(match4, match3);
                                            }
                                        }
                                        i11 = LZ4SafeUtils.encodeSequence(bArr, i5, match2.start, match2.ref, match2.len, bArr2, i11, i7);
                                        i5 = match2.end();
                                        LZ4Utils.copyTo(match4, match2);
                                        LZ4Utils.copyTo(match3, match);
                                    } else {
                                        LZ4Utils.copyTo(match4, match3);
                                    }
                                }
                            }
                        }
                    }
                }
                if (match3.start < match2.end()) {
                    match2.len = match3.start - match2.start;
                }
                i11 = LZ4SafeUtils.encodeSequence(bArr, match2.end(), match3.start, match3.ref, match3.len, bArr2, LZ4SafeUtils.encodeSequence(bArr, i5, match2.start, match2.ref, match2.len, bArr2, i11, i7), i7);
                i5 = match3.end();
                i10 = i5;
            }
        }
        return LZ4SafeUtils.lastLiterals(bArr, i5, i6 - i5, bArr2, i11, i7) - i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012a, code lost:
        if (r1.start >= r0.end()) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012c, code lost:
        r0.len = r1.start - r0.start;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0133, code lost:
        r19 = net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r13, r0.end(), r1.start, r1.ref, r1.len, r11, net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r13, r14, r0.start, r0.ref, r0.len, r11, r19, r20), r20);
        r14 = r1.end();
     */
    @Override // net.jpountz.lz4.LZ4Compressor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compress(java.nio.ByteBuffer r33, int r34, int r35, java.nio.ByteBuffer r36, int r37, int r38) {
        /*
        // Method dump skipped, instructions count: 544
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4HCJavaSafeCompressor.compress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }
}
