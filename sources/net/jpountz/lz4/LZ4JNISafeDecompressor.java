package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class LZ4JNISafeDecompressor extends LZ4SafeDecompressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4JNISafeDecompressor INSTANCE = new LZ4JNISafeDecompressor();
    private static LZ4SafeDecompressor SAFE_INSTANCE;

    LZ4JNISafeDecompressor() {
    }

    static {
        Covode.recordClassIndex(106083);
    }

    @Override // net.jpountz.lz4.LZ4UnknownSizeDecompressor, net.jpountz.lz4.LZ4SafeDecompressor
    public final int decompress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        MethodCollector.m26663i(5203);
        SafeUtils.checkRange(bArr, i, i2);
        SafeUtils.checkRange(bArr2, i3, i4);
        int LZ4_decompress_safe = LZ4JNI.LZ4_decompress_safe(bArr, null, i, i2, bArr2, null, i3, i4);
        if (LZ4_decompress_safe >= 0) {
            MethodCollector.m26664o(5203);
            return LZ4_decompress_safe;
        }
        LZ4Exception lZ4Exception = new LZ4Exception("Error decoding offset " + (i - LZ4_decompress_safe) + " of input buffer");
        MethodCollector.m26664o(5203);
        throw lZ4Exception;
    }

    @Override // net.jpountz.lz4.LZ4SafeDecompressor
    public final int decompress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        int i5;
        byte[] bArr;
        byte[] bArr2;
        ByteBuffer byteBuffer3 = byteBuffer;
        int i6 = i3;
        ByteBuffer byteBuffer4 = byteBuffer2;
        MethodCollector.m26663i(5219);
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
            int LZ4_decompress_safe = LZ4JNI.LZ4_decompress_safe(bArr, byteBuffer3, i5, i2, bArr2, byteBuffer4, i6, i4);
            if (LZ4_decompress_safe >= 0) {
                MethodCollector.m26664o(5219);
                return LZ4_decompress_safe;
            }
            LZ4Exception lZ4Exception = new LZ4Exception("Error decoding offset " + (i5 - LZ4_decompress_safe) + " of input buffer");
            MethodCollector.m26664o(5219);
            throw lZ4Exception;
        }
        LZ4SafeDecompressor lZ4SafeDecompressor = SAFE_INSTANCE;
        if (lZ4SafeDecompressor == null) {
            lZ4SafeDecompressor = LZ4Factory.safeInstance().safeDecompressor();
            SAFE_INSTANCE = lZ4SafeDecompressor;
        }
        int decompress = lZ4SafeDecompressor.decompress(byteBuffer3, i, i2, byteBuffer4, i6, i4);
        MethodCollector.m26664o(5219);
        return decompress;
    }
}
