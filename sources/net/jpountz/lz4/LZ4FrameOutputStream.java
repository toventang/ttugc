package net.jpountz.lz4;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Locale;
import net.jpountz.xxhash.StreamingXXHash32;
import net.jpountz.xxhash.XXHash32;
import net.jpountz.xxhash.XXHashFactory;

public class LZ4FrameOutputStream extends FilterOutputStream {
    static final FLG.Bits[] DEFAULT_FEATURES = {FLG.Bits.BLOCK_INDEPENDENCE};
    private final ByteBuffer buffer;
    private final XXHash32 checksum;
    private final byte[] compressedBuffer;
    private final LZ4Compressor compressor;
    private FrameInfo frameInfo;
    private final ByteBuffer intLEBuffer;
    private final long knownSize;
    private final int maxBlockSize;

    /* renamed from: net.jpountz.lz4.LZ4FrameOutputStream$1 */
    static /* synthetic */ class C899601 {
        static {
            Covode.recordClassIndex(106069);
        }
    }

    public enum BLOCKSIZE {
        SIZE_64KB(4),
        SIZE_256KB(5),
        SIZE_1MB(6),
        SIZE_4MB(7);
        
        private final int indicator;

        public final int getIndicator() {
            return this.indicator;
        }

        static {
            Covode.recordClassIndex(106071);
        }

        public static BLOCKSIZE valueOf(int i) {
            if (i == 4) {
                return SIZE_64KB;
            }
            if (i == 5) {
                return SIZE_256KB;
            }
            if (i == 6) {
                return SIZE_1MB;
            }
            if (i == 7) {
                return SIZE_4MB;
            }
            throw new IllegalArgumentException(C1764a.m5929a(Locale.ROOT, "Block size must be 4-7. Cannot use value of [%d]", new Object[]{Integer.valueOf(i)}));
        }

        private BLOCKSIZE(int i) {
            this.indicator = i;
        }
    }

    public static class FLG {
        private final BitSet bitSet;
        private final int version;

        static {
            Covode.recordClassIndex(106072);
        }

        public int getVersion() {
            return this.version;
        }

        public byte toByte() {
            return (byte) (this.bitSet.toByteArray()[0] | ((this.version & 3) << 6));
        }

        public enum Bits {
            RESERVED_0(0),
            RESERVED_1(1),
            CONTENT_CHECKSUM(2),
            CONTENT_SIZE(3),
            BLOCK_CHECKSUM(4),
            BLOCK_INDEPENDENCE(5);
            
            public final int position;

            static {
                Covode.recordClassIndex(106073);
            }

            private Bits(int i) {
                this.position = i;
            }
        }

        private void validate() {
            if (this.bitSet.get(Bits.RESERVED_0.position)) {
                throw new RuntimeException("Reserved0 field must be 0");
            } else if (this.bitSet.get(Bits.RESERVED_1.position)) {
                throw new RuntimeException("Reserved1 field must be 0");
            } else if (!this.bitSet.get(Bits.BLOCK_INDEPENDENCE.position)) {
                throw new RuntimeException("Dependent block stream is unsupported (BLOCK_INDEPENDENCE must be set)");
            } else if (this.version != 1) {
                throw new RuntimeException(C1764a.m5929a(Locale.ROOT, "Version %d is unsupported", new Object[]{Integer.valueOf(this.version)}));
            }
        }

        public static FLG fromByte(byte b) {
            byte b2 = (byte) (b & 192);
            return new FLG(b2 >>> 6, (byte) (b ^ b2));
        }

        public boolean isEnabled(Bits bits) {
            return this.bitSet.get(bits.position);
        }

        private FLG(int i, byte b) {
            this.bitSet = BitSet.valueOf(new byte[]{b});
            this.version = i;
            validate();
        }

        public FLG(int i, Bits... bitsArr) {
            this.bitSet = new BitSet(8);
            this.version = i;
            if (bitsArr != null) {
                for (Bits bits : bitsArr) {
                    this.bitSet.set(bits.position);
                }
            }
            validate();
        }
    }

    /* access modifiers changed from: package-private */
    public static class FrameInfo {

        /* renamed from: bd */
        private final C89961BD f203844bd;
        private boolean finished;
        private final FLG flg;
        private final StreamingXXHash32 streamHash;

        static {
            Covode.recordClassIndex(106074);
        }

        public void finish() {
            this.finished = true;
        }

        public C89961BD getBD() {
            return this.f203844bd;
        }

        public FLG getFLG() {
            return this.flg;
        }

        public boolean isFinished() {
            return this.finished;
        }

        public int currentStreamHash() {
            return this.streamHash.getValue();
        }

        public boolean isEnabled(FLG.Bits bits) {
            return this.flg.isEnabled(bits);
        }

        public FrameInfo(FLG flg2, C89961BD bd) {
            StreamingXXHash32 streamingXXHash32;
            this.flg = flg2;
            this.f203844bd = bd;
            if (flg2.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
                streamingXXHash32 = XXHashFactory.fastestInstance().newStreamingHash32(0);
            } else {
                streamingXXHash32 = null;
            }
            this.streamHash = streamingXXHash32;
        }

        public void updateStreamHash(byte[] bArr, int i, int i2) {
            this.streamHash.update(bArr, i, i2);
        }
    }

    /* renamed from: net.jpountz.lz4.LZ4FrameOutputStream$BD */
    public static class C89961BD {
        private final BLOCKSIZE blockSizeValue;

        static {
            Covode.recordClassIndex(106070);
        }

        public int getBlockMaximumSize() {
            return 1 << ((this.blockSizeValue.getIndicator() * 2) + 8);
        }

        public byte toByte() {
            return (byte) ((this.blockSizeValue.getIndicator() & 7) << 4);
        }

        private C89961BD(BLOCKSIZE blocksize) {
            this.blockSizeValue = blocksize;
        }

        public static C89961BD fromByte(byte b) {
            int i = (b >>> 4) & 7;
            if ((b & 143) <= 0) {
                return new C89961BD(BLOCKSIZE.valueOf(i));
            }
            throw new RuntimeException("Reserved fields must be 0");
        }

        /* synthetic */ C89961BD(BLOCKSIZE blocksize, C899601 r2) {
            this(blocksize);
        }
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream, java.io.Flushable
    public void flush() {
        if (!this.frameInfo.isFinished()) {
            writeBlock();
        }
        super.flush();
    }

    static {
        Covode.recordClassIndex(106068);
    }

    private void ensureNotFinished() {
        if (this.frameInfo.isFinished()) {
            throw new IllegalStateException("The stream is already closed");
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
    public void close() {
        if (!this.frameInfo.isFinished()) {
            flush();
            writeEndMark();
        }
        super.close();
    }

    private void writeEndMark() {
        MethodCollector.m26663i(6249);
        this.intLEBuffer.putInt(0, 0);
        this.out.write(this.intLEBuffer.array());
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
            this.intLEBuffer.putInt(0, this.frameInfo.currentStreamHash());
            this.out.write(this.intLEBuffer.array());
        }
        this.frameInfo.finish();
        MethodCollector.m26664o(6249);
    }

    private void writeHeader() {
        MethodCollector.m26663i(5945);
        ByteBuffer order = ByteBuffer.allocate(15).order(ByteOrder.LITTLE_ENDIAN);
        order.putInt(407708164);
        order.put(this.frameInfo.getFLG().toByte());
        order.put(this.frameInfo.getBD().toByte());
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_SIZE)) {
            order.putLong(this.knownSize);
        }
        order.put((byte) ((this.checksum.hash(order.array(), 4, order.position() - 4, 0) >> 8) & 255));
        this.out.write(order.array(), 0, order.position());
        MethodCollector.m26664o(5945);
    }

    private void writeBlock() {
        byte[] bArr;
        int i;
        MethodCollector.m26663i(6099);
        if (this.buffer.position() == 0) {
            MethodCollector.m26664o(6099);
            return;
        }
        Arrays.fill(this.compressedBuffer, (byte) 0);
        int compress = this.compressor.compress(this.buffer.array(), 0, this.buffer.position(), this.compressedBuffer, 0);
        if (compress >= this.buffer.position()) {
            compress = this.buffer.position();
            bArr = Arrays.copyOf(this.buffer.array(), compress);
            i = Integer.MIN_VALUE;
        } else {
            bArr = this.compressedBuffer;
            i = 0;
        }
        this.intLEBuffer.putInt(0, i | compress);
        this.out.write(this.intLEBuffer.array());
        this.out.write(bArr, 0, compress);
        if (this.frameInfo.isEnabled(FLG.Bits.BLOCK_CHECKSUM)) {
            this.intLEBuffer.putInt(0, this.checksum.hash(bArr, 0, compress, 0));
            this.out.write(this.intLEBuffer.array());
        }
        this.buffer.rewind();
        MethodCollector.m26664o(6099);
    }

    public LZ4FrameOutputStream(OutputStream outputStream) {
        this(outputStream, BLOCKSIZE.SIZE_4MB);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(int i) {
        ensureNotFinished();
        if (this.buffer.position() == this.maxBlockSize) {
            writeBlock();
        }
        byte b = (byte) i;
        this.buffer.put(b);
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
            this.frameInfo.updateStreamHash(new byte[]{b}, 0, 1);
        }
    }

    public LZ4FrameOutputStream(OutputStream outputStream, BLOCKSIZE blocksize) {
        this(outputStream, blocksize, DEFAULT_FEATURES);
    }

    public LZ4FrameOutputStream(OutputStream outputStream, BLOCKSIZE blocksize, FLG.Bits... bitsArr) {
        this(outputStream, blocksize, -1, bitsArr);
    }

    @Override // java.io.OutputStream, java.io.FilterOutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        ensureNotFinished();
        while (i2 > this.buffer.remaining()) {
            int remaining = this.buffer.remaining();
            this.buffer.put(bArr, i, remaining);
            if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
                this.frameInfo.updateStreamHash(bArr, i, remaining);
            }
            writeBlock();
            i += remaining;
            i2 -= remaining;
        }
        this.buffer.put(bArr, i, i2);
        if (this.frameInfo.isEnabled(FLG.Bits.CONTENT_CHECKSUM)) {
            this.frameInfo.updateStreamHash(bArr, i, i2);
        }
    }

    public LZ4FrameOutputStream(OutputStream outputStream, BLOCKSIZE blocksize, long j, FLG.Bits... bitsArr) {
        super(outputStream);
        MethodCollector.m26663i(5808);
        this.intLEBuffer = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
        this.frameInfo = null;
        LZ4Compressor fastCompressor = LZ4Factory.fastestInstance().fastCompressor();
        this.compressor = fastCompressor;
        this.checksum = XXHashFactory.fastestInstance().hash32();
        FrameInfo frameInfo2 = new FrameInfo(new FLG(1, bitsArr), new C89961BD(blocksize, null));
        this.frameInfo = frameInfo2;
        int blockMaximumSize = frameInfo2.getBD().getBlockMaximumSize();
        this.maxBlockSize = blockMaximumSize;
        this.buffer = ByteBuffer.allocate(blockMaximumSize).order(ByteOrder.LITTLE_ENDIAN);
        this.compressedBuffer = new byte[fastCompressor.maxCompressedLength(blockMaximumSize)];
        if (!this.frameInfo.getFLG().isEnabled(FLG.Bits.CONTENT_SIZE) || j >= 0) {
            this.knownSize = j;
            writeHeader();
            MethodCollector.m26664o(5808);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Known size must be greater than zero in order to use the known size feature");
        MethodCollector.m26664o(5808);
        throw illegalArgumentException;
    }
}
