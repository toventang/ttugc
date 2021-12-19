package com.toutiao.proxyserver;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.toutiao.proxyserver.x */
final class C87401x {

    /* renamed from: a */
    final RandomAccessFile f198164a;

    static {
        Covode.recordClassIndex(103298);
    }

    /* renamed from: com.toutiao.proxyserver.x$a */
    static class C87402a extends Exception {
        static {
            Covode.recordClassIndex(103299);
        }

        C87402a() {
        }

        C87402a(Throwable th) {
            super(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo141452a(byte[] bArr) {
        try {
            return this.f198164a.read(bArr);
        } catch (IOException e) {
            throw new C87402a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo141453a(long j) {
        try {
            this.f198164a.seek(j);
        } catch (IOException e) {
            throw new C87402a(e);
        }
    }

    C87401x(File file, String str) {
        try {
            this.f198164a = new RandomAccessFile(file, str);
        } catch (FileNotFoundException e) {
            throw new C87402a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo141454a(byte[] bArr, int i, int i2) {
        try {
            this.f198164a.write(bArr, i, i2);
        } catch (IOException e) {
            throw new C87402a(e);
        }
    }
}
