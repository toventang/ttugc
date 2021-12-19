package com.bytedance.geckox.buffer.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.buffer.AbstractC14888a;
import com.bytedance.geckox.utils.C15050c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.geckox.buffer.impl.c */
final class C14893c implements AbstractC14888a {

    /* renamed from: a */
    private long f36384a;

    /* renamed from: b */
    private long f36385b;

    /* renamed from: c */
    private RandomAccessFile f36386c;

    /* renamed from: d */
    private AtomicBoolean f36387d = new AtomicBoolean(false);

    /* renamed from: e */
    private File f36388e;

    static {
        Covode.recordClassIndex(17006);
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: b */
    public final long mo23975b() {
        return this.f36384a;
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: f */
    public final File mo23980f() {
        return this.f36388e;
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: d */
    public final int mo23978d() {
        byte[] bArr = new byte[1];
        if (mo23973b(bArr) == 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: e */
    public final void mo23979e() {
        if (!this.f36387d.getAndSet(true)) {
            C15050c.m27709a(this.f36386c);
        }
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: a */
    public final void mo23970a() {
        if (this.f36387d.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: c */
    public final long mo23977c() {
        if (!this.f36387d.get()) {
            return this.f36385b;
        }
        throw new IOException("released!");
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: a */
    public final void mo23972a(byte[] bArr) {
        mo23968a(bArr, 0, bArr.length);
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: b */
    public final int mo23973b(byte[] bArr) {
        return mo23974b(bArr, 0, bArr.length);
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: a */
    public final void mo23971a(int i) {
        mo23972a(new byte[]{(byte) i});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r4 > r1) goto L_0x000e;
     */
    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23976b(long r4) {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f36387d
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x001e
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
        L_0x000e:
            r4 = r1
        L_0x000f:
            r3.f36385b = r4
            java.io.RandomAccessFile r0 = r3.f36386c
            r0.seek(r4)
            return
        L_0x0017:
            long r1 = r3.f36384a
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x000f
            goto L_0x000e
        L_0x001e:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "released!"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.buffer.impl.C14893c.mo23976b(long):void");
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: a */
    public final synchronized long mo23969a(long j) {
        long j2;
        MethodCollector.m26663i(2657);
        if (!this.f36387d.get()) {
            int i = (int) j;
            if (((long) i) == j) {
                int skipBytes = this.f36386c.skipBytes(i);
                this.f36385b = this.f36386c.getFilePointer();
                j2 = (long) skipBytes;
                MethodCollector.m26664o(2657);
            } else {
                IOException iOException = new IOException("too large:".concat(String.valueOf(j)));
                MethodCollector.m26664o(2657);
                throw iOException;
            }
        } else {
            IOException iOException2 = new IOException("released!");
            MethodCollector.m26664o(2657);
            throw iOException2;
        }
        return j2;
    }

    C14893c(long j, File file) {
        this.f36384a = j;
        this.f36388e = file;
        boolean mkdirs = file.getParentFile().mkdirs();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            this.f36386c = randomAccessFile;
            randomAccessFile.setLength(j);
        } catch (Exception e) {
            boolean exists = file.getParentFile().exists();
            C15050c.m27709a(this.f36386c);
            if (e instanceof FileNotFoundException) {
                boolean mkdirs2 = file.getParentFile().mkdirs();
                boolean exists2 = file.getParentFile().exists();
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rw");
                    this.f36386c = randomAccessFile2;
                    randomAccessFile2.setLength(j);
                } catch (Exception unused) {
                    C15050c.m27709a(this.f36386c);
                    throw new IOException("create raf swap failed[2 dir mk:" + mkdirs2 + ",dir exist:+" + exists2 + ", dir mk:" + mkdirs + ",dir exist:+" + exists + "]! path: " + file.getAbsolutePath() + " caused by: " + e.getMessage(), e);
                }
            } else {
                throw new IOException("create raf swap failed[1 dir mk:" + mkdirs + ",dir exist:+" + exists + "]! path: " + file.getAbsolutePath() + " caused by: " + e.getMessage(), e);
            }
        }
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: a */
    public final int mo23968a(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(2687);
        if (this.f36387d.get()) {
            IOException iOException = new IOException("released!");
            MethodCollector.m26664o(2687);
            throw iOException;
        } else if (bArr == null || bArr.length == 0 || i2 <= 0) {
            MethodCollector.m26664o(2687);
            return 0;
        } else if (i < 0 || i >= bArr.length) {
            MethodCollector.m26664o(2687);
            return 0;
        } else {
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                try {
                    long j = this.f36385b;
                    long j2 = this.f36384a;
                    if (j == j2) {
                        return 0;
                    }
                    if (((long) i2) + j > j2) {
                        i2 = (int) (j2 - j);
                    }
                    this.f36386c.write(bArr, i, i2);
                    this.f36385b += (long) i2;
                    MethodCollector.m26664o(2687);
                    return i2;
                } finally {
                    MethodCollector.m26664o(2687);
                }
            }
        }
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: b */
    public final int mo23974b(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(2695);
        if (this.f36387d.get()) {
            IOException iOException = new IOException("released!");
            MethodCollector.m26664o(2695);
            throw iOException;
        } else if (bArr == null || i2 <= 0 || i < 0 || i >= bArr.length) {
            MethodCollector.m26664o(2695);
            return 0;
        } else {
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                try {
                    long j = this.f36385b;
                    long j2 = this.f36384a;
                    if (j == j2) {
                        return -1;
                    }
                    if (((long) i2) + j > j2) {
                        i2 = (int) (j2 - j);
                    }
                    int read = this.f36386c.read(bArr, i, i2);
                    if (read == -1) {
                        MethodCollector.m26664o(2695);
                        return -1;
                    }
                    this.f36385b += (long) read;
                    MethodCollector.m26664o(2695);
                    return read;
                } finally {
                    MethodCollector.m26664o(2695);
                }
            }
        }
    }
}
