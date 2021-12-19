package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.al */
public final class C26778al extends FilterInputStream {

    /* renamed from: a */
    public long f63452a;

    /* renamed from: b */
    public boolean f63453b = false;

    /* renamed from: c */
    public boolean f63454c = false;

    /* renamed from: d */
    private final C26818by f63455d = new C26818by();

    /* renamed from: e */
    private byte[] f63456e = new byte[4096];

    static {
        Covode.recordClassIndex(32253);
    }

    C26778al(InputStream inputStream) {
        super(inputStream);
        MethodCollector.m26663i(14258);
        MethodCollector.m26664o(14258);
    }

    /* renamed from: a */
    private final int m53218a(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(14271);
        int max = Math.max(0, super.read(bArr, i, i2));
        MethodCollector.m26664o(14271);
        return max;
    }

    /* renamed from: a */
    private final boolean m53219a(int i) {
        int a = m53218a(this.f63456e, 0, i);
        if (a != i) {
            int i2 = i - a;
            if (m53218a(this.f63456e, a, i2) != i2) {
                this.f63455d.mo44513a(this.f63456e, 0, a);
                return false;
            }
        }
        this.f63455d.mo44513a(this.f63456e, 0, i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C26839cs mo44480a() {
        byte[] bArr;
        if (this.f63452a > 0) {
            do {
                bArr = this.f63456e;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f63453b || this.f63454c) {
            return new C26839cs(null, -1, -1, false, false, null);
        }
        if (!m53219a(30)) {
            this.f63453b = true;
            return this.f63455d.mo44514a();
        }
        C26839cs a = this.f63455d.mo44514a();
        if (a.f63678e) {
            this.f63454c = true;
            return a;
        } else if (a.f63675b != 4294967295L) {
            int i = this.f63455d.f63607a - 30;
            long j = (long) i;
            int length = this.f63456e.length;
            if (j > ((long) length)) {
                do {
                    length += length;
                } while (((long) length) < j);
                this.f63456e = Arrays.copyOf(this.f63456e, length);
            }
            if (!m53219a(i)) {
                this.f63453b = true;
                return this.f63455d.mo44514a();
            }
            C26839cs a2 = this.f63455d.mo44514a();
            this.f63452a = a2.f63675b;
            return a2;
        } else {
            throw new C26787au("Files bigger than 4GiB are not supported.");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f63452a;
        if (j <= 0 || this.f63453b) {
            return -1;
        }
        int a = m53218a(bArr, i, (int) Math.min(j, (long) i2));
        this.f63452a -= (long) a;
        if (a != 0) {
            return a;
        }
        this.f63453b = true;
        return 0;
    }
}
