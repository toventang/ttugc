package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class LZ4JNICompressor extends LZ4Compressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4Compressor INSTANCE = new LZ4JNICompressor();
    private static LZ4Compressor SAFE_INSTANCE;

    LZ4JNICompressor() {
    }

    static {
        Covode.recordClassIndex(106081);
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public final int compress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        MethodCollector.m26663i(9316);
        SafeUtils.checkRange(bArr, i, i2);
        SafeUtils.checkRange(bArr2, i3, i4);
        int LZ4_compress_limitedOutput = LZ4JNI.LZ4_compress_limitedOutput(bArr, null, i, i2, bArr2, null, i3, i4);
        if (LZ4_compress_limitedOutput > 0) {
            MethodCollector.m26664o(9316);
            return LZ4_compress_limitedOutput;
        }
        LZ4Exception lZ4Exception = new LZ4Exception("maxDestLen is too small");
        MethodCollector.m26664o(9316);
        throw lZ4Exception;
    }

    @Override // net.jpountz.lz4.LZ4Compressor
    public final int compress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        int i5;
        byte[] bArr;
        byte[] bArr2;
        ByteBuffer byteBuffer3 = byteBuffer;
        int i6 = i3;
        ByteBuffer byteBuffer4 = byteBuffer2;
        MethodCollector.m26663i(9477);
        ByteBufferUtils.checkNotReadOnly(byteBuffer4);
        ByteBufferUtils.checkRange(byteBuffer3, i, i2);
        ByteBufferUtils.checkRange(byteBuffer4, i6, i4);
        if ((byteBuffer3.hasArray() || byteBuffer3.isDirect()) && (byteBuffer4.hasArray() || byteBuffer4.isDirect())) {
            if (byteBuffer3.hasArray()) {
                bArr = byteBuffer3.array();
                i5 = byteBuffer3.arrayOffset() + i;
                byteBuffer3 = null;
            } else {
                i5 = i;
                bArr = null;
            }
            if (byteBuffer4.hasArray()) {
                bArr2 = byteBuffer4.array();
                i6 += byteBuffer4.arrayOffset();
                byteBuffer4 = null;
            } else {
                bArr2 = null;
            }
            int LZ4_compress_limitedOutput = LZ4JNI.LZ4_compress_limitedOutput(bArr, byteBuffer3, i5, i2, bArr2, byteBuffer4, i6, i4);
            if (LZ4_compress_limitedOutput > 0) {
                MethodCollector.m26664o(9477);
                return LZ4_compress_limitedOutput;
            }
            LZ4Exception lZ4Exception = new LZ4Exception("maxDestLen is too small");
            MethodCollector.m26664o(9477);
            throw lZ4Exception;
        }
        LZ4Compressor lZ4Compressor = SAFE_INSTANCE;
        if (lZ4Compressor == null) {
            lZ4Compressor = LZ4Factory.safeInstance().fastCompressor();
            SAFE_INSTANCE = lZ4Compressor;
        }
        int compress = lZ4Compressor.compress(byteBuffer3, i, i2, byteBuffer4, i6, i4);
        MethodCollector.m26664o(9477);
        return compress;
    }
}
