package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class LZ4HCJNICompressor extends LZ4Compressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4HCJNICompressor INSTANCE = new LZ4HCJNICompressor();
    private static LZ4Compressor SAFE_INSTANCE;
    private final int compressionLevel;

    LZ4HCJNICompressor() {
        this(9);
    }

    static {
        Covode.recordClassIndex(106075);
    }

    LZ4HCJNICompressor(int i) {
        this.compressionLevel = i;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public final int compress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        MethodCollector.m26663i(9932);
        SafeUtils.checkRange(bArr, i, i2);
        SafeUtils.checkRange(bArr2, i3, i4);
        int LZ4_compressHC = LZ4JNI.LZ4_compressHC(bArr, null, i, i2, bArr2, null, i3, i4, this.compressionLevel);
        if (LZ4_compressHC > 0) {
            MethodCollector.m26664o(9932);
            return LZ4_compressHC;
        }
        LZ4Exception lZ4Exception = new LZ4Exception();
        MethodCollector.m26664o(9932);
        throw lZ4Exception;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public final int compress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        byte[] bArr;
        byte[] bArr2;
        int i5 = i;
        ByteBuffer byteBuffer3 = byteBuffer;
        int i6 = i3;
        ByteBuffer byteBuffer4 = byteBuffer2;
        MethodCollector.m26663i(10095);
        ByteBufferUtils.checkNotReadOnly(byteBuffer4);
        ByteBufferUtils.checkRange(byteBuffer3, i5, i2);
        ByteBufferUtils.checkRange(byteBuffer4, i6, i4);
        if ((byteBuffer3.hasArray() || byteBuffer3.isDirect()) && (byteBuffer4.hasArray() || byteBuffer4.isDirect())) {
            if (byteBuffer3.hasArray()) {
                bArr = byteBuffer3.array();
                i5 += byteBuffer3.arrayOffset();
                byteBuffer3 = null;
            } else {
                bArr = null;
            }
            if (byteBuffer4.hasArray()) {
                bArr2 = byteBuffer4.array();
                i6 += byteBuffer4.arrayOffset();
                byteBuffer4 = null;
            } else {
                bArr2 = null;
            }
            int LZ4_compressHC = LZ4JNI.LZ4_compressHC(bArr, byteBuffer3, i5, i2, bArr2, byteBuffer4, i6, i4, this.compressionLevel);
            if (LZ4_compressHC > 0) {
                MethodCollector.m26664o(10095);
                return LZ4_compressHC;
            }
            LZ4Exception lZ4Exception = new LZ4Exception();
            MethodCollector.m26664o(10095);
            throw lZ4Exception;
        }
        LZ4Compressor lZ4Compressor = SAFE_INSTANCE;
        if (lZ4Compressor == null) {
            lZ4Compressor = LZ4Factory.safeInstance().highCompressor(this.compressionLevel);
            SAFE_INSTANCE = lZ4Compressor;
        }
        int compress = lZ4Compressor.compress(byteBuffer3, i5, i2, byteBuffer4, i6, i4);
        MethodCollector.m26664o(10095);
        return compress;
    }
}
