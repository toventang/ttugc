package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class LZ4JNIFastDecompressor extends LZ4FastDecompressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4JNIFastDecompressor INSTANCE = new LZ4JNIFastDecompressor();
    private static LZ4FastDecompressor SAFE_INSTANCE;

    LZ4JNIFastDecompressor() {
    }

    static {
        Covode.recordClassIndex(106082);
    }

    @Override // net.jpountz.lz4.LZ4Decompressor, net.jpountz.lz4.LZ4FastDecompressor
    public final int decompress(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        MethodCollector.m26663i(5642);
        SafeUtils.checkRange(bArr, i);
        SafeUtils.checkRange(bArr2, i2, i3);
        int LZ4_decompress_fast = LZ4JNI.LZ4_decompress_fast(bArr, null, i, bArr2, null, i2, i3);
        if (LZ4_decompress_fast >= 0) {
            MethodCollector.m26664o(5642);
            return LZ4_decompress_fast;
        }
        LZ4Exception lZ4Exception = new LZ4Exception("Error decoding offset " + (i - LZ4_decompress_fast) + " of input buffer");
        MethodCollector.m26664o(5642);
        throw lZ4Exception;
    }

    @Override // net.jpountz.lz4.LZ4FastDecompressor
    public final int decompress(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3) {
        byte[] bArr;
        byte[] bArr2;
        int i4 = i;
        ByteBuffer byteBuffer3 = byteBuffer;
        int i5 = i2;
        ByteBuffer byteBuffer4 = byteBuffer2;
        MethodCollector.m26663i(5770);
        ByteBufferUtils.checkNotReadOnly(byteBuffer4);
        ByteBufferUtils.checkRange(byteBuffer3, i4);
        ByteBufferUtils.checkRange(byteBuffer4, i5, i3);
        if ((byteBuffer3.hasArray() || byteBuffer3.isDirect()) && (byteBuffer4.hasArray() || byteBuffer4.isDirect())) {
            if (byteBuffer3.hasArray()) {
                bArr = byteBuffer3.array();
                i4 += byteBuffer3.arrayOffset();
                byteBuffer3 = null;
            } else {
                bArr = null;
            }
            if (byteBuffer4.hasArray()) {
                bArr2 = byteBuffer4.array();
                i5 += byteBuffer4.arrayOffset();
                byteBuffer4 = null;
            } else {
                bArr2 = null;
            }
            int LZ4_decompress_fast = LZ4JNI.LZ4_decompress_fast(bArr, byteBuffer3, i4, bArr2, byteBuffer4, i5, i3);
            if (LZ4_decompress_fast >= 0) {
                MethodCollector.m26664o(5770);
                return LZ4_decompress_fast;
            }
            LZ4Exception lZ4Exception = new LZ4Exception("Error decoding offset " + (i4 - LZ4_decompress_fast) + " of input buffer");
            MethodCollector.m26664o(5770);
            throw lZ4Exception;
        }
        LZ4FastDecompressor lZ4FastDecompressor = SAFE_INSTANCE;
        if (lZ4FastDecompressor == null) {
            lZ4FastDecompressor = LZ4Factory.safeInstance().fastDecompressor();
            SAFE_INSTANCE = lZ4FastDecompressor;
        }
        int decompress = lZ4FastDecompressor.decompress(byteBuffer3, i4, byteBuffer4, i5, i3);
        MethodCollector.m26664o(5770);
        return decompress;
    }
}
