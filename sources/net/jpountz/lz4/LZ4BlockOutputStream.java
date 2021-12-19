package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.zip.Checksum;
import net.jpountz.util.SafeUtils;
import net.jpountz.xxhash.XXHashFactory;

public final class LZ4BlockOutputStream extends FilterOutputStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int HEADER_LENGTH = 21;
    static final byte[] MAGIC = {76, 90, 52, 66, 108, 111, 99, 107};
    static final int MAGIC_LENGTH = 8;
    private final int blockSize;
    private final byte[] buffer;
    private final Checksum checksum;
    private final byte[] compressedBuffer;
    private final int compressionLevel;
    private final LZ4Compressor compressor;
    private boolean finished;

    /* renamed from: o */
    private int f203843o;
    private final boolean syncFlush;

    private void ensureNotFinished() {
        if (this.finished) {
            throw new IllegalStateException("This stream is already closed");
        }
    }

    static {
        Covode.recordClassIndex(106058);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    public final void close() {
        if (!this.finished) {
            finish();
        }
        if (this.out != null) {
            this.out.close();
            this.out = null;
        }
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream, java.io.Flushable
    public final void flush() {
        if (this.out != null) {
            if (this.syncFlush) {
                flushBufferedData();
            }
            this.out.flush();
        }
    }

    public final void finish() {
        MethodCollector.m26663i(6087);
        ensureNotFinished();
        flushBufferedData();
        byte[] bArr = this.compressedBuffer;
        int i = MAGIC_LENGTH;
        bArr[i] = (byte) (this.compressionLevel | 16);
        writeIntLE(0, bArr, i + 1);
        writeIntLE(0, this.compressedBuffer, i + 5);
        writeIntLE(0, this.compressedBuffer, i + 9);
        this.out.write(this.compressedBuffer, 0, HEADER_LENGTH);
        this.finished = true;
        this.out.flush();
        MethodCollector.m26664o(6087);
    }

    private void flushBufferedData() {
        int i;
        MethodCollector.m26663i(5935);
        if (this.f203843o == 0) {
            MethodCollector.m26664o(5935);
            return;
        }
        this.checksum.reset();
        this.checksum.update(this.buffer, 0, this.f203843o);
        int value = (int) this.checksum.getValue();
        LZ4Compressor lZ4Compressor = this.compressor;
        byte[] bArr = this.buffer;
        int i2 = this.f203843o;
        byte[] bArr2 = this.compressedBuffer;
        int i3 = HEADER_LENGTH;
        int compress = lZ4Compressor.compress(bArr, 0, i2, bArr2, i3);
        int i4 = this.f203843o;
        if (compress >= i4) {
            i = 16;
            System.arraycopy(this.buffer, 0, this.compressedBuffer, i3, i4);
        } else {
            i4 = compress;
            i = 32;
        }
        byte[] bArr3 = this.compressedBuffer;
        int i5 = MAGIC_LENGTH;
        bArr3[i5] = (byte) (i | this.compressionLevel);
        writeIntLE(i4, bArr3, i5 + 1);
        writeIntLE(this.f203843o, this.compressedBuffer, i5 + 5);
        writeIntLE(value, this.compressedBuffer, i5 + 9);
        this.out.write(this.compressedBuffer, 0, i3 + i4);
        this.f203843o = 0;
        MethodCollector.m26664o(5935);
    }

    public final String toString() {
        return getClass().getSimpleName() + "(out=" + this.out + ", blockSize=" + this.blockSize + ", compressor=" + this.compressor + ", checksum=" + this.checksum + ")";
    }

    public LZ4BlockOutputStream(OutputStream outputStream) {
        this(outputStream, 65536);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public final void write(byte[] bArr) {
        ensureNotFinished();
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public final void write(int i) {
        ensureNotFinished();
        if (this.f203843o == this.blockSize) {
            flushBufferedData();
        }
        byte[] bArr = this.buffer;
        int i2 = this.f203843o;
        this.f203843o = i2 + 1;
        bArr[i2] = (byte) i;
    }

    private static int compressionLevel(int i) {
        if (i < 64) {
            throw new IllegalArgumentException("blockSize must be >= 64, got ".concat(String.valueOf(i)));
        } else if (i <= 33554432) {
            return Math.max(0, (32 - Integer.numberOfLeadingZeros(i - 1)) - 10);
        } else {
            throw new IllegalArgumentException("blockSize must be <= 33554432, got ".concat(String.valueOf(i)));
        }
    }

    public LZ4BlockOutputStream(OutputStream outputStream, int i) {
        this(outputStream, i, LZ4Factory.fastestInstance().fastCompressor());
    }

    public LZ4BlockOutputStream(OutputStream outputStream, int i, LZ4Compressor lZ4Compressor) {
        this(outputStream, i, lZ4Compressor, XXHashFactory.fastestInstance().newStreamingHash32(-1756908916).asChecksum(), false);
    }

    private static void writeIntLE(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        bArr[i2] = (byte) i;
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 8);
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public final void write(byte[] bArr, int i, int i2) {
        SafeUtils.checkRange(bArr, i, i2);
        ensureNotFinished();
        while (true) {
            int i3 = this.f203843o;
            int i4 = i3 + i2;
            int i5 = this.blockSize;
            if (i4 > i5) {
                int i6 = i5 - i3;
                System.arraycopy(bArr, i, this.buffer, i3, i5 - i3);
                this.f203843o = this.blockSize;
                flushBufferedData();
                i += i6;
                i2 -= i6;
            } else {
                System.arraycopy(bArr, i, this.buffer, i3, i2);
                this.f203843o += i2;
                return;
            }
        }
    }

    public LZ4BlockOutputStream(OutputStream outputStream, int i, LZ4Compressor lZ4Compressor, Checksum checksum2, boolean z) {
        super(outputStream);
        MethodCollector.m26663i(5930);
        this.blockSize = i;
        this.compressor = lZ4Compressor;
        this.checksum = checksum2;
        this.compressionLevel = compressionLevel(i);
        this.buffer = new byte[i];
        byte[] bArr = new byte[(HEADER_LENGTH + lZ4Compressor.maxCompressedLength(i))];
        this.compressedBuffer = bArr;
        this.syncFlush = z;
        this.f203843o = 0;
        this.finished = false;
        System.arraycopy(MAGIC, 0, bArr, 0, MAGIC_LENGTH);
        MethodCollector.m26664o(5930);
    }
}
