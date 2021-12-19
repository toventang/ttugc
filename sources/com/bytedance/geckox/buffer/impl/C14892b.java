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

/* renamed from: com.bytedance.geckox.buffer.impl.b */
final class C14892b implements AbstractC14888a {

    /* renamed from: a */
    private RandomAccessFile f36381a;

    /* renamed from: b */
    private AtomicBoolean f36382b = new AtomicBoolean(false);

    /* renamed from: c */
    private File f36383c;

    static {
        Covode.recordClassIndex(17005);
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: f */
    public final File mo23980f() {
        return this.f36383c;
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: b */
    public final long mo23975b() {
        return this.f36381a.length();
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: d */
    public final int mo23978d() {
        byte[] bArr = new byte[1];
        if (mo23973b(bArr) <= 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: e */
    public final void mo23979e() {
        if (!this.f36382b.getAndSet(true)) {
            C15050c.m27709a(this.f36381a);
        }
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: a */
    public final void mo23970a() {
        if (this.f36382b.get()) {
            throw new IOException("released!");
        }
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: c */
    public final long mo23977c() {
        if (!this.f36382b.get()) {
            return this.f36381a.getFilePointer();
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

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: b */
    public final void mo23976b(long j) {
        if (!this.f36382b.get()) {
            if (j < 0) {
                j = 0;
            }
            this.f36381a.seek(j);
            return;
        }
        throw new IOException("released!");
    }

    C14892b(File file) {
        this.f36383c = file;
        boolean mkdirs = file.getParentFile().mkdirs();
        try {
            this.f36381a = new RandomAccessFile(file, "rw");
        } catch (Exception e) {
            boolean exists = file.getParentFile().exists();
            C15050c.m27709a(this.f36381a);
            if (e instanceof FileNotFoundException) {
                boolean mkdirs2 = file.getParentFile().mkdirs();
                boolean exists2 = file.getParentFile().exists();
                try {
                    this.f36381a = new RandomAccessFile(file, "rw");
                } catch (Exception unused) {
                    C15050c.m27709a(this.f36381a);
                    throw new IOException("create raf mSwap failed![2 dir mk:" + mkdirs2 + ",dir exist:+" + exists2 + ", dir mk:" + mkdirs + ",dir exist:+" + exists + "] path: " + file.getAbsolutePath() + " caused by: " + e.getMessage(), e);
                }
            } else {
                throw new IOException("create raf mSwap failed![1 dir mk:" + mkdirs + ",dir exist:+" + exists + "] path: " + file.getAbsolutePath() + " caused by: " + e.getMessage(), e);
            }
        }
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: a */
    public final synchronized long mo23969a(long j) {
        long skipBytes;
        MethodCollector.m26663i(2740);
        if (!this.f36382b.get()) {
            int i = (int) j;
            if (((long) i) == j) {
                skipBytes = (long) this.f36381a.skipBytes(i);
                MethodCollector.m26664o(2740);
            } else {
                IOException iOException = new IOException("too large:".concat(String.valueOf(j)));
                MethodCollector.m26664o(2740);
                throw iOException;
            }
        } else {
            IOException iOException2 = new IOException("released!");
            MethodCollector.m26664o(2740);
            throw iOException2;
        }
        return skipBytes;
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: b */
    public final int mo23974b(byte[] bArr, int i, int i2) {
        int read;
        MethodCollector.m26663i(2809);
        if (this.f36382b.get()) {
            IOException iOException = new IOException("released!");
            MethodCollector.m26664o(2809);
            throw iOException;
        } else if (bArr == null || i2 <= 0 || i < 0 || i >= bArr.length) {
            MethodCollector.m26664o(2809);
            return 0;
        } else {
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                try {
                    read = this.f36381a.read(bArr, i, i2);
                } finally {
                    MethodCollector.m26664o(2809);
                }
            }
            return read;
        }
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: a */
    public final int mo23968a(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(2798);
        if (this.f36382b.get()) {
            IOException iOException = new IOException("released!");
            MethodCollector.m26664o(2798);
            throw iOException;
        } else if (bArr == null || bArr.length == 0 || i2 <= 0) {
            MethodCollector.m26664o(2798);
            return 0;
        } else if (i < 0 || i >= bArr.length) {
            MethodCollector.m26664o(2798);
            return 0;
        } else {
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                try {
                    this.f36381a.write(bArr, i, i2);
                } finally {
                    MethodCollector.m26664o(2798);
                }
            }
            return i2;
        }
    }
}
