package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class LZ4JavaSafeFastDecompressor extends LZ4FastDecompressor {
    public static final LZ4FastDecompressor INSTANCE = new LZ4JavaSafeFastDecompressor();

    LZ4JavaSafeFastDecompressor() {
    }

    static {
        Covode.recordClassIndex(106085);
    }

    @Override // net.jpountz.lz4.LZ4FastDecompressor
    public final int decompress(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3) {
        int i4;
        byte readByte;
        int i5;
        byte readByte2;
        if (byteBuffer.hasArray() && byteBuffer2.hasArray()) {
            return decompress(byteBuffer.array(), i + byteBuffer.arrayOffset(), byteBuffer2.array(), i2 + byteBuffer2.arrayOffset(), i3);
        }
        ByteBuffer inNativeByteOrder = ByteBufferUtils.inNativeByteOrder(byteBuffer);
        ByteBuffer inNativeByteOrder2 = ByteBufferUtils.inNativeByteOrder(byteBuffer2);
        ByteBufferUtils.checkRange(inNativeByteOrder, i);
        ByteBufferUtils.checkRange(inNativeByteOrder2, i2, i3);
        if (i3 != 0) {
            int i6 = i3 + i2;
            int i7 = i;
            int i8 = i2;
            while (true) {
                int readByte3 = ByteBufferUtils.readByte(inNativeByteOrder, i7) & 255;
                int i9 = i7 + 1;
                int i10 = readByte3 >>> 4;
                if (i10 == 15) {
                    while (true) {
                        i5 = i9 + 1;
                        readByte2 = ByteBufferUtils.readByte(inNativeByteOrder, i9);
                        if (readByte2 != -1) {
                            break;
                        }
                        i10 += 255;
                        i9 = i5;
                    }
                    i10 += readByte2 & 255;
                    i9 = i5;
                }
                int i11 = i8 + i10;
                int i12 = i6 - 8;
                if (i11 <= i12) {
                    LZ4ByteBufferUtils.wildArraycopy(inNativeByteOrder, i9, inNativeByteOrder2, i8, i10);
                    int i13 = i9 + i10;
                    int readShortLE = ByteBufferUtils.readShortLE(inNativeByteOrder, i13);
                    i7 = i13 + 2;
                    int i14 = i11 - readShortLE;
                    if (i14 >= i2) {
                        int i15 = readByte3 & 15;
                        if (i15 == 15) {
                            while (true) {
                                i4 = i7 + 1;
                                readByte = ByteBufferUtils.readByte(inNativeByteOrder, i7);
                                if (readByte != -1) {
                                    break;
                                }
                                i15 += 255;
                                i7 = i4;
                            }
                            i15 += readByte & 255;
                            i7 = i4;
                        }
                        int i16 = i15 + 4;
                        i8 = i11 + i16;
                        if (i8 <= i12) {
                            LZ4ByteBufferUtils.wildIncrementalCopy(inNativeByteOrder2, i14, i11, i8);
                        } else if (i8 <= i6) {
                            LZ4ByteBufferUtils.safeIncrementalCopy(inNativeByteOrder2, i14, i11, i16);
                        } else {
                            throw new LZ4Exception("Malformed input at ".concat(String.valueOf(i7)));
                        }
                    } else {
                        throw new LZ4Exception("Malformed input at ".concat(String.valueOf(i7)));
                    }
                } else if (i11 == i6) {
                    LZ4ByteBufferUtils.safeArraycopy(inNativeByteOrder, i9, inNativeByteOrder2, i8, i10);
                    return (i9 + i10) - i;
                } else {
                    throw new LZ4Exception("Malformed input at ".concat(String.valueOf(i9)));
                }
            }
        } else if (ByteBufferUtils.readByte(inNativeByteOrder, i) == 0) {
            return 1;
        } else {
            throw new LZ4Exception("Malformed input at ".concat(String.valueOf(i)));
        }
    }

    @Override // net.jpountz.lz4.LZ4Decompressor, net.jpountz.lz4.LZ4FastDecompressor
    public final int decompress(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        byte readByte;
        int i5;
        byte readByte2;
        SafeUtils.checkRange(bArr, i);
        SafeUtils.checkRange(bArr2, i2, i3);
        if (i3 != 0) {
            int i6 = i3 + i2;
            int i7 = i;
            int i8 = i2;
            while (true) {
                int readByte3 = SafeUtils.readByte(bArr, i7) & 255;
                int i9 = i7 + 1;
                int i10 = readByte3 >>> 4;
                if (i10 == 15) {
                    while (true) {
                        i5 = i9 + 1;
                        readByte2 = SafeUtils.readByte(bArr, i9);
                        if (readByte2 != -1) {
                            break;
                        }
                        i10 += 255;
                        i9 = i5;
                    }
                    i10 += readByte2 & 255;
                    i9 = i5;
                }
                int i11 = i8 + i10;
                int i12 = i6 - 8;
                if (i11 <= i12) {
                    LZ4SafeUtils.wildArraycopy(bArr, i9, bArr2, i8, i10);
                    int i13 = i9 + i10;
                    int readShortLE = SafeUtils.readShortLE(bArr, i13);
                    i7 = i13 + 2;
                    int i14 = i11 - readShortLE;
                    if (i14 >= i2) {
                        int i15 = readByte3 & 15;
                        if (i15 == 15) {
                            while (true) {
                                i4 = i7 + 1;
                                readByte = SafeUtils.readByte(bArr, i7);
                                if (readByte != -1) {
                                    break;
                                }
                                i15 += 255;
                                i7 = i4;
                            }
                            i15 += readByte & 255;
                            i7 = i4;
                        }
                        int i16 = i15 + 4;
                        i8 = i11 + i16;
                        if (i8 <= i12) {
                            LZ4SafeUtils.wildIncrementalCopy(bArr2, i14, i11, i8);
                        } else if (i8 <= i6) {
                            LZ4SafeUtils.safeIncrementalCopy(bArr2, i14, i11, i16);
                        } else {
                            throw new LZ4Exception("Malformed input at ".concat(String.valueOf(i7)));
                        }
                    } else {
                        throw new LZ4Exception("Malformed input at ".concat(String.valueOf(i7)));
                    }
                } else if (i11 == i6) {
                    LZ4SafeUtils.safeArraycopy(bArr, i9, bArr2, i8, i10);
                    return (i9 + i10) - i;
                } else {
                    throw new LZ4Exception("Malformed input at ".concat(String.valueOf(i9)));
                }
            }
        } else if (SafeUtils.readByte(bArr, i) == 0) {
            return 1;
        } else {
            throw new LZ4Exception("Malformed input at ".concat(String.valueOf(i)));
        }
    }
}
