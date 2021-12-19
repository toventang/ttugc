package com.bytedance.zoin.zstd;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.zoin.zstd.p1792a.C23756a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ZstdInputStream extends FilterInputStream {
    private static final int srcBuffSize = ((int) recommendedDInSize());
    private long dstPos;
    private boolean finalize = true;
    private boolean frameFinished = true;
    private boolean isClosed;
    private boolean isContinuous;
    private boolean needRead = true;
    private byte[] src = new byte[srcBuffSize];
    private long srcPos;
    private long srcSize;
    private final long stream;

    private static native long createDStream();

    private native int decompressStream(long j, byte[] bArr, int i, byte[] bArr2, int i2);

    private static native int freeDStream(long j);

    private native int initDStream(long j);

    private static native long recommendedDInSize();

    private static native long recommendedDOutSize();

    public boolean markSupported() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        if (this.finalize) {
            close();
        }
    }

    public synchronized boolean getContinuous() {
        boolean z;
        MethodCollector.m26663i(1613);
        z = this.isContinuous;
        MethodCollector.m26664o(1613);
        return z;
    }

    static {
        MethodCollector.m26663i(1984);
        Covode.recordClassIndex(27862);
        C23756a.m44905a();
        MethodCollector.m26664o(1984);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        MethodCollector.m26663i(1809);
        if (this.isClosed) {
            IOException iOException = new IOException("Stream closed");
            MethodCollector.m26664o(1809);
            throw iOException;
        } else if (!this.needRead) {
            MethodCollector.m26664o(1809);
            return 1;
        } else {
            int available = this.in.available();
            MethodCollector.m26664o(1809);
            return available;
        }
    }

    @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public synchronized void close() {
        MethodCollector.m26663i(1906);
        if (this.isClosed) {
            MethodCollector.m26664o(1906);
            return;
        }
        freeDStream(this.stream);
        this.in.close();
        this.isClosed = true;
        MethodCollector.m26664o(1906);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int readInternal;
        MethodCollector.m26663i(1734);
        byte[] bArr = new byte[1];
        while (true) {
            readInternal = readInternal(bArr, 0, 1);
            if (readInternal != 0) {
                break;
            }
        }
        if (readInternal == 1) {
            int i = bArr[0] & 255;
            MethodCollector.m26664o(1734);
            return i;
        }
        MethodCollector.m26664o(1734);
        return -1;
    }

    public void setFinalize(boolean z) {
        this.finalize = z;
    }

    public synchronized ZstdInputStream setContinuous(boolean z) {
        MethodCollector.m26663i(1611);
        this.isContinuous = z;
        MethodCollector.m26664o(1611);
        return this;
    }

    public ZstdInputStream(InputStream inputStream) {
        super(inputStream);
        MethodCollector.m26663i(1610);
        synchronized (this) {
            try {
                long createDStream = createDStream();
                this.stream = createDStream;
                initDStream(createDStream);
            } finally {
                MethodCollector.m26664o(1610);
            }
        }
    }

    public synchronized ZstdInputStream setDict(byte[] bArr) {
        MethodCollector.m26663i(1624);
        long loadDictDecompress = (long) Zstd.loadDictDecompress(this.stream, bArr, bArr.length);
        if (!Zstd.isError(loadDictDecompress)) {
            MethodCollector.m26664o(1624);
        } else {
            IOException iOException = new IOException("Decompression error: " + Zstd.getErrorName(loadDictDecompress));
            MethodCollector.m26664o(1624);
            throw iOException;
        }
        return this;
    }

    public synchronized ZstdInputStream setDict(ZstdDictDecompress zstdDictDecompress) {
        int i;
        MethodCollector.m26663i(1722);
        do {
            i = zstdDictDecompress.f56211b;
            if (i < 0) {
                IllegalStateException illegalStateException = new IllegalStateException("Closed");
                MethodCollector.m26664o(1722);
                throw illegalStateException;
            } else if (i == Integer.MAX_VALUE) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Shared lock overflow");
                MethodCollector.m26664o(1722);
                throw illegalStateException2;
            }
        } while (!AbstractC23755a.f56210a.compareAndSet(zstdDictDecompress, i, i + 1));
        try {
            long loadFastDictDecompress = (long) Zstd.loadFastDictDecompress(this.stream, zstdDictDecompress);
            if (Zstd.isError(loadFastDictDecompress)) {
                IOException iOException = new IOException("Decompression error: " + Zstd.getErrorName(loadFastDictDecompress));
                MethodCollector.m26664o(1722);
                throw iOException;
            }
        } finally {
            zstdDictDecompress.mo39216a();
            MethodCollector.m26664o(1722);
        }
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) {
        int read;
        MethodCollector.m26663i(1897);
        if (this.isClosed) {
            IOException iOException = new IOException("Stream closed");
            MethodCollector.m26664o(1897);
            throw iOException;
        } else if (j <= 0) {
            MethodCollector.m26664o(1897);
            return 0;
        } else {
            int min = (int) Math.min(recommendedDOutSize(), j);
            byte[] bArr = new byte[min];
            long j2 = j;
            while (j2 > 0 && (read = read(bArr, 0, (int) Math.min((long) min, j2))) >= 0) {
                j2 -= (long) read;
            }
            long j3 = j - j2;
            MethodCollector.m26664o(1897);
            return j3;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        int readInternal;
        MethodCollector.m26663i(1730);
        if (i < 0 || i2 > bArr.length - i) {
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Requested lenght " + i2 + " from offset " + i + " in buffer of size " + bArr.length);
            MethodCollector.m26664o(1730);
            throw indexOutOfBoundsException;
        } else if (i2 == 0) {
            MethodCollector.m26664o(1730);
            return 0;
        } else {
            do {
                readInternal = readInternal(bArr, i, i2);
            } while (readInternal == 0);
            MethodCollector.m26664o(1730);
            return readInternal;
        }
    }

    /* access modifiers changed from: package-private */
    public int readInternal(byte[] bArr, int i, int i2) {
        long j;
        int i3 = 1733;
        MethodCollector.m26663i(1733);
        if (this.isClosed) {
            IOException iOException = new IOException("Stream closed");
            MethodCollector.m26664o(1733);
            throw iOException;
        } else if (i < 0 || i2 > bArr.length - i) {
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("Requested lenght " + i2 + " from offset " + i + " in buffer of size " + bArr.length);
            MethodCollector.m26664o(1733);
            throw indexOutOfBoundsException;
        } else {
            int i4 = i + i2;
            long j2 = (long) i;
            this.dstPos = j2;
            long j3 = -1;
            while (true) {
                j = this.dstPos;
                long j4 = (long) i4;
                if (j >= j4 || j3 >= j) {
                    int i5 = (int) (j - j2);
                    MethodCollector.m26664o(1733);
                } else {
                    boolean z = false;
                    if (this.needRead && (this.in.available() > 0 || this.dstPos == j2)) {
                        long read = (long) this.in.read(this.src, 0, srcBuffSize);
                        this.srcSize = read;
                        this.srcPos = 0;
                        if (read < 0) {
                            this.srcSize = 0;
                            if (this.frameFinished) {
                                MethodCollector.m26664o(i3);
                                return -1;
                            } else if (this.isContinuous) {
                                int i6 = (int) (this.dstPos - j2);
                                MethodCollector.m26664o(i3);
                                return i6;
                            } else {
                                IOException iOException2 = new IOException("Read error or truncated source");
                                MethodCollector.m26664o(i3);
                                throw iOException2;
                            }
                        } else {
                            this.frameFinished = false;
                        }
                    }
                    j3 = this.dstPos;
                    int decompressStream = decompressStream(this.stream, bArr, i4, this.src, (int) this.srcSize);
                    long j5 = (long) decompressStream;
                    if (Zstd.isError(j5)) {
                        IOException iOException3 = new IOException("Decompression error: " + Zstd.getErrorName(j5));
                        MethodCollector.m26664o(1733);
                        throw iOException3;
                    } else if (decompressStream == 0) {
                        this.frameFinished = true;
                        if (this.srcPos == this.srcSize) {
                            z = true;
                        }
                        this.needRead = z;
                        int i7 = (int) (this.dstPos - j2);
                        MethodCollector.m26664o(1733);
                        return i7;
                    } else {
                        if (this.dstPos < j4) {
                            z = true;
                        }
                        this.needRead = z;
                        i3 = 1733;
                    }
                }
            }
            int i52 = (int) (j - j2);
            MethodCollector.m26664o(1733);
            return i52;
        }
    }
}
