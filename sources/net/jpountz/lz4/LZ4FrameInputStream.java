package net.jpountz.lz4;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import net.jpountz.lz4.LZ4FrameOutputStream;
import net.jpountz.xxhash.XXHash32;
import net.jpountz.xxhash.XXHashFactory;

public class LZ4FrameInputStream extends FilterInputStream {
    private ByteBuffer buffer;
    private final XXHash32 checksum;
    private byte[] compressedBuffer;
    private final LZ4SafeDecompressor decompressor;
    private long expectedContentSize;
    private LZ4FrameOutputStream.FrameInfo frameInfo;
    private final byte[] headerArray;
    private final ByteBuffer headerBuffer;
    private int maxBlockSize;
    private byte[] rawBuffer;
    private final ByteBuffer readNumberBuff;
    private long totalContentSize;

    static {
        Covode.recordClassIndex(106067);
    }

    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return this.buffer.remaining();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        MethodCollector.m26663i(7484);
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("reset not supported");
        MethodCollector.m26664o(7484);
        throw unsupportedOperationException;
    }

    private void skippableFrame() {
        MethodCollector.m26663i(6722);
        int readInt = readInt(this.in);
        byte[] bArr = new byte[1024];
        while (readInt > 0) {
            int read = this.in.read(bArr, 0, Math.min(readInt, 1024));
            if (read >= 0) {
                readInt -= read;
            } else {
                IOException iOException = new IOException("Stream ended prematurely");
                MethodCollector.m26664o(6722);
                throw iOException;
            }
        }
        MethodCollector.m26664o(6722);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        while (this.buffer.remaining() == 0) {
            if (this.frameInfo.isFinished() && !nextFrameInfo()) {
                return -1;
            }
            readBlock();
        }
        return this.buffer.get() & 255;
    }

    private boolean nextFrameInfo() {
        MethodCollector.m26663i(6577);
        while (true) {
            int i = 0;
            do {
                int read = this.in.read(this.readNumberBuff.array(), i, 4 - i);
                if (read < 0) {
                    MethodCollector.m26664o(6577);
                    return false;
                }
                i += read;
            } while (i < 4);
            int i2 = this.readNumberBuff.getInt(0);
            if (i2 == 407708164) {
                readHeader();
                MethodCollector.m26664o(6577);
                return true;
            } else if ((i2 >>> 4) == 25481893) {
                skippableFrame();
            } else {
                IOException iOException = new IOException("Stream unsupported");
                MethodCollector.m26664o(6577);
                throw iOException;
            }
        }
    }

    private void readHeader() {
        MethodCollector.m26663i(6872);
        this.headerBuffer.rewind();
        int read = this.in.read();
        if (read >= 0) {
            int read2 = this.in.read();
            if (read2 >= 0) {
                byte b = (byte) (read & 255);
                LZ4FrameOutputStream.FLG fromByte = LZ4FrameOutputStream.FLG.fromByte(b);
                this.headerBuffer.put(b);
                byte b2 = (byte) (read2 & 255);
                LZ4FrameOutputStream.C89961BD fromByte2 = LZ4FrameOutputStream.C89961BD.fromByte(b2);
                this.headerBuffer.put(b2);
                this.frameInfo = new LZ4FrameOutputStream.FrameInfo(fromByte, fromByte2);
                if (fromByte.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_SIZE)) {
                    long readLong = readLong(this.in);
                    this.expectedContentSize = readLong;
                    this.headerBuffer.putLong(readLong);
                }
                this.totalContentSize = 0;
                byte hash = (byte) ((this.checksum.hash(this.headerArray, 0, this.headerBuffer.position(), 0) >> 8) & 255);
                int read3 = this.in.read();
                if (read3 < 0) {
                    IOException iOException = new IOException("Stream ended prematurely");
                    MethodCollector.m26664o(6872);
                    throw iOException;
                } else if (hash == ((byte) (read3 & 255))) {
                    int blockMaximumSize = this.frameInfo.getBD().getBlockMaximumSize();
                    this.maxBlockSize = blockMaximumSize;
                    this.compressedBuffer = new byte[blockMaximumSize];
                    byte[] bArr = new byte[blockMaximumSize];
                    this.rawBuffer = bArr;
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    this.buffer = wrap;
                    wrap.limit(0);
                    MethodCollector.m26664o(6872);
                } else {
                    IOException iOException2 = new IOException("Stream frame descriptor corrupted");
                    MethodCollector.m26664o(6872);
                    throw iOException2;
                }
            } else {
                IOException iOException3 = new IOException("Stream ended prematurely");
                MethodCollector.m26664o(6872);
                throw iOException3;
            }
        } else {
            IOException iOException4 = new IOException("Stream ended prematurely");
            MethodCollector.m26664o(6872);
            throw iOException4;
        }
    }

    private void readBlock() {
        boolean z;
        byte[] bArr;
        MethodCollector.m26663i(7316);
        int readInt = readInt(this.in);
        if ((Integer.MIN_VALUE & readInt) == 0) {
            z = true;
        } else {
            z = false;
        }
        int i = readInt & Integer.MAX_VALUE;
        if (i != 0) {
            if (z) {
                bArr = this.compressedBuffer;
            } else {
                bArr = this.rawBuffer;
            }
            if (i <= this.maxBlockSize) {
                int i2 = 0;
                while (i2 < i) {
                    int read = this.in.read(bArr, i2, i - i2);
                    if (read >= 0) {
                        i2 += read;
                    } else {
                        IOException iOException = new IOException("Stream ended prematurely");
                        MethodCollector.m26664o(7316);
                        throw iOException;
                    }
                }
                if (!this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.BLOCK_CHECKSUM) || readInt(this.in) == this.checksum.hash(bArr, 0, i, 0)) {
                    if (z) {
                        try {
                            LZ4SafeDecompressor lZ4SafeDecompressor = this.decompressor;
                            byte[] bArr2 = this.rawBuffer;
                            i = lZ4SafeDecompressor.decompress(bArr, 0, i, bArr2, 0, bArr2.length);
                        } catch (LZ4Exception e) {
                            IOException iOException2 = new IOException(e);
                            MethodCollector.m26664o(7316);
                            throw iOException2;
                        }
                    }
                    if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_CHECKSUM)) {
                        this.frameInfo.updateStreamHash(this.rawBuffer, 0, i);
                    }
                    this.totalContentSize += (long) i;
                    this.buffer.limit(i);
                    this.buffer.rewind();
                    MethodCollector.m26664o(7316);
                    return;
                }
                IOException iOException3 = new IOException("Block checksum mismatch");
                MethodCollector.m26664o(7316);
                throw iOException3;
            }
            IOException iOException4 = new IOException(C1764a.m5929a(Locale.ROOT, "Block size %s exceeded max: %s", new Object[]{Integer.valueOf(i), Integer.valueOf(this.maxBlockSize)}));
            MethodCollector.m26664o(7316);
            throw iOException4;
        } else if (this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_CHECKSUM) && readInt(this.in) != this.frameInfo.currentStreamHash()) {
            IOException iOException5 = new IOException("Content checksum mismatch");
            MethodCollector.m26664o(7316);
            throw iOException5;
        } else if (!this.frameInfo.isEnabled(LZ4FrameOutputStream.FLG.Bits.CONTENT_SIZE) || this.expectedContentSize == this.totalContentSize) {
            this.frameInfo.finish();
            MethodCollector.m26664o(7316);
        } else {
            IOException iOException6 = new IOException("Size check mismatch");
            MethodCollector.m26664o(7316);
            throw iOException6;
        }
    }

    public LZ4FrameInputStream(InputStream inputStream) {
        this(inputStream, LZ4Factory.fastestInstance().safeDecompressor(), XXHashFactory.fastestInstance().hash32());
    }

    public synchronized void mark(int i) {
        MethodCollector.m26663i(7483);
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("mark not supported");
        MethodCollector.m26664o(7483);
        throw unsupportedOperationException;
    }

    private int readInt(InputStream inputStream) {
        MethodCollector.m26663i(7171);
        int i = 0;
        do {
            int read = inputStream.read(this.readNumberBuff.array(), i, 4 - i);
            if (read >= 0) {
                i += read;
            } else {
                IOException iOException = new IOException("Stream ended prematurely");
                MethodCollector.m26664o(7171);
                throw iOException;
            }
        } while (i < 4);
        int i2 = this.readNumberBuff.getInt(0);
        MethodCollector.m26664o(7171);
        return i2;
    }

    private long readLong(InputStream inputStream) {
        MethodCollector.m26663i(7012);
        int i = 0;
        do {
            int read = inputStream.read(this.readNumberBuff.array(), i, 8 - i);
            if (read >= 0) {
                i += read;
            } else {
                IOException iOException = new IOException("Stream ended prematurely");
                MethodCollector.m26664o(7012);
                throw iOException;
            }
        } while (i < 8);
        long j = this.readNumberBuff.getLong(0);
        MethodCollector.m26664o(7012);
        return j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        if (j <= 0) {
            return 0;
        }
        while (this.buffer.remaining() == 0) {
            if (this.frameInfo.isFinished() && !nextFrameInfo()) {
                return 0;
            }
            readBlock();
        }
        long min = Math.min(j, (long) this.buffer.remaining());
        ByteBuffer byteBuffer = this.buffer;
        byteBuffer.position(byteBuffer.position() + ((int) min));
        return min;
    }

    public LZ4FrameInputStream(InputStream inputStream, LZ4SafeDecompressor lZ4SafeDecompressor, XXHash32 xXHash32) {
        super(inputStream);
        MethodCollector.m26663i(6439);
        byte[] bArr = new byte[15];
        this.headerArray = bArr;
        this.headerBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        this.buffer = null;
        this.rawBuffer = null;
        this.maxBlockSize = -1;
        this.expectedContentSize = -1;
        this.totalContentSize = 0;
        this.frameInfo = null;
        this.readNumberBuff = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.decompressor = lZ4SafeDecompressor;
        this.checksum = xXHash32;
        nextFrameInfo();
        MethodCollector.m26664o(6439);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        while (this.buffer.remaining() == 0) {
            if (this.frameInfo.isFinished() && !nextFrameInfo()) {
                return -1;
            }
            readBlock();
        }
        int min = Math.min(i2, this.buffer.remaining());
        this.buffer.get(bArr, i, min);
        return min;
    }
}
