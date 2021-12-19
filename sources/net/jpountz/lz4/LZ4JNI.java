package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import net.jpountz.util.Native;

enum LZ4JNI {
    ;

    static native int LZ4_compressBound(int i);

    static native int LZ4_compressHC(byte[] bArr, ByteBuffer byteBuffer, int i, int i2, byte[] bArr2, ByteBuffer byteBuffer2, int i3, int i4, int i5);

    static native int LZ4_compress_limitedOutput(byte[] bArr, ByteBuffer byteBuffer, int i, int i2, byte[] bArr2, ByteBuffer byteBuffer2, int i3, int i4);

    static native int LZ4_decompress_fast(byte[] bArr, ByteBuffer byteBuffer, int i, byte[] bArr2, ByteBuffer byteBuffer2, int i2, int i3);

    static native int LZ4_decompress_safe(byte[] bArr, ByteBuffer byteBuffer, int i, int i2, byte[] bArr2, ByteBuffer byteBuffer2, int i3, int i4);

    static native void init();

    static {
        MethodCollector.m26663i(5283);
        Covode.recordClassIndex(106080);
        Native.load();
        init();
        MethodCollector.m26664o(5283);
    }
}
