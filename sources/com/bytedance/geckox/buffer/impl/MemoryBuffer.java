package com.bytedance.geckox.buffer.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.buffer.AbstractC14888a;
import com.bytedance.geckox.utils.C15051d;
import com.bytedance.geckox.utils.C15057h;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

class MemoryBuffer implements AbstractC14888a {

    /* renamed from: a */
    private long f36376a;

    /* renamed from: b */
    private long f36377b;

    /* renamed from: c */
    private long f36378c;

    /* renamed from: d */
    private AtomicBoolean f36379d;

    /* renamed from: e */
    private File f36380e;

    private native long nCreate(String str, long j);

    private native void nFlush(long j, String str, long j2);

    private native void nRead(long j, long j2, byte[] bArr, int i, int i2);

    private native void nRelease(long j, long j2);

    private native void nWrite(long j, long j2, byte[] bArr, int i, int i2);

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: b */
    public final long mo23975b() {
        return this.f36376a;
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: f */
    public final File mo23980f() {
        return this.f36380e;
    }

    static {
        Covode.recordClassIndex(17003);
        C15057h.m27722a("buffer");
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

    /* access modifiers changed from: protected */
    public void finalize() {
        super.finalize();
        try {
            mo23979e();
        } catch (Exception e) {
            C15051d.m27710a(e);
        }
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: c */
    public final long mo23977c() {
        if (!this.f36379d.get()) {
            return this.f36378c;
        }
        throw new IOException("released!");
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: a */
    public final void mo23970a() {
        MethodCollector.m26663i(2409);
        if (!this.f36379d.get()) {
            nFlush(this.f36377b, this.f36380e.getAbsolutePath(), this.f36376a);
            MethodCollector.m26664o(2409);
            return;
        }
        IOException iOException = new IOException("released!");
        MethodCollector.m26664o(2409);
        throw iOException;
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: e */
    public final void mo23979e() {
        MethodCollector.m26663i(2624);
        if (this.f36379d.getAndSet(true)) {
            MethodCollector.m26664o(2624);
            return;
        }
        nRelease(this.f36377b, this.f36376a);
        this.f36377b = 0;
        MethodCollector.m26664o(2624);
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

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r4 > r1) goto L_0x000e;
     */
    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23976b(long r4) {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f36379d
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0019
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0012
        L_0x000e:
            r4 = r1
        L_0x000f:
            r3.f36378c = r4
            return
        L_0x0012:
            long r1 = r3.f36376a
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x000f
            goto L_0x000e
        L_0x0019:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "released!"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.buffer.impl.MemoryBuffer.mo23976b(long):void");
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: a */
    public final synchronized long mo23969a(long j) {
        MethodCollector.m26663i(2478);
        if (this.f36379d.get()) {
            IOException iOException = new IOException("released!");
            MethodCollector.m26664o(2478);
            throw iOException;
        } else if (j <= 0) {
            MethodCollector.m26664o(2478);
            return 0;
        } else {
            long j2 = this.f36378c;
            long j3 = j + j2;
            this.f36378c = j3;
            if (j3 < 0) {
                this.f36378c = 0;
            } else {
                long j4 = this.f36376a;
                if (j3 > j4) {
                    this.f36378c = j4;
                }
            }
            long j5 = this.f36378c - j2;
            MethodCollector.m26664o(2478);
            return j5;
        }
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: a */
    public final int mo23968a(byte[] bArr, int i, int i2) {
        int i3 = i2;
        MethodCollector.m26663i(2507);
        if (this.f36379d.get()) {
            IOException iOException = new IOException("released!");
            MethodCollector.m26664o(2507);
            throw iOException;
        } else if (bArr == null || bArr.length == 0 || i3 <= 0) {
            MethodCollector.m26664o(2507);
            return 0;
        } else if (i < 0 || i >= bArr.length) {
            MethodCollector.m26664o(2507);
            return 0;
        } else {
            if (i + i3 > bArr.length) {
                i3 = bArr.length - i;
            }
            synchronized (this) {
                try {
                    long j = this.f36378c;
                    long j2 = this.f36376a;
                    if (j == j2) {
                        return 0;
                    }
                    if (((long) i3) + j > j2) {
                        i3 = (int) (j2 - j);
                    }
                    nWrite(this.f36377b, j, bArr, i, i3);
                    this.f36378c += (long) i3;
                    MethodCollector.m26664o(2507);
                    return i3;
                } finally {
                    MethodCollector.m26664o(2507);
                }
            }
        }
    }

    @Override // com.bytedance.geckox.buffer.AbstractC14888a
    /* renamed from: b */
    public final int mo23974b(byte[] bArr, int i, int i2) {
        int i3 = i2;
        MethodCollector.m26663i(2552);
        if (this.f36379d.get()) {
            IOException iOException = new IOException("released!");
            MethodCollector.m26664o(2552);
            throw iOException;
        } else if (bArr == null || i3 <= 0 || i < 0 || i >= bArr.length) {
            MethodCollector.m26664o(2552);
            return 0;
        } else {
            if (i + i3 > bArr.length) {
                i3 = bArr.length - i;
            }
            synchronized (this) {
                try {
                    long j = this.f36378c;
                    long j2 = this.f36376a;
                    if (j == j2) {
                        return -1;
                    }
                    if (((long) i3) + j > j2) {
                        i3 = (int) (j2 - j);
                    }
                    nRead(this.f36377b, j, bArr, i, i3);
                    this.f36378c += (long) i3;
                    MethodCollector.m26664o(2552);
                    return i3;
                } finally {
                    MethodCollector.m26664o(2552);
                }
            }
        }
    }
}
