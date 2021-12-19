package com.bytedance.ies.ugc.aweme.network.p1264a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.ies.ugc.aweme.network.a.g */
public final class C18090g extends InputStream {

    /* renamed from: a */
    InputStream f43064a;

    /* renamed from: b */
    public byte[] f43065b = new byte[4096];

    /* renamed from: c */
    public int f43066c;

    /* renamed from: d */
    byte[] f43067d = new byte[10240];

    /* renamed from: e */
    int f43068e;

    /* renamed from: f */
    int f43069f;

    /* renamed from: g */
    int f43070g;

    /* renamed from: h */
    int f43071h;

    /* renamed from: i */
    private int f43072i;

    /* renamed from: j */
    private int f43073j;

    /* renamed from: k */
    private int f43074k;

    /* renamed from: l */
    private boolean f43075l;

    /* renamed from: m */
    private boolean f43076m;

    /* renamed from: n */
    private boolean f43077n;

    static {
        Covode.recordClassIndex(20727);
    }

    /* renamed from: c */
    private void m33675c() {
        if (this.f43064a != null) {
            this.f43064a = null;
        }
    }

    /* renamed from: a */
    public final void mo28851a() {
        if (this.f43077n) {
            throw new IOException("stream is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final synchronized void close() {
        MethodCollector.m26663i(12688);
        if (this.f43077n) {
            MethodCollector.m26664o(12688);
            return;
        }
        m33675c();
        this.f43077n = true;
        MethodCollector.m26664o(12688);
    }

    /* renamed from: d */
    private int m33676d() {
        MethodCollector.m26663i(12349);
        int available = this.f43064a.available();
        if (available > 0) {
            m33672a(available);
            try {
                int read = this.f43064a.read(this.f43067d, this.f43069f, available);
                if (read < 0) {
                    this.f43076m = true;
                    MethodCollector.m26664o(12349);
                    return -1;
                }
                this.f43069f += read;
                m33673a(false);
            } catch (IOException e) {
                this.f43076m = true;
                MethodCollector.m26664o(12349);
                throw e;
            }
        }
        int i = this.f43074k - this.f43066c;
        MethodCollector.m26664o(12349);
        return i;
    }

    @Override // java.io.InputStream
    public final synchronized int available() {
        MethodCollector.m26663i(12687);
        mo28851a();
        int i = this.f43074k - this.f43066c;
        if (i > 0) {
            MethodCollector.m26664o(12687);
            return i;
        }
        int b = m33674b(false);
        if (b < 0) {
            MethodCollector.m26664o(12687);
            return 0;
        }
        MethodCollector.m26664o(12687);
        return b;
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        MethodCollector.m26663i(12583);
        mo28851a();
        if (this.f43066c < this.f43074k || m33674b(true) > 0) {
            byte[] bArr = this.f43065b;
            int i = this.f43066c;
            this.f43066c = i + 1;
            int i2 = bArr[i] & 255;
            MethodCollector.m26664o(12583);
            return i2;
        }
        MethodCollector.m26664o(12583);
        return -1;
    }

    /* renamed from: e */
    private int m33677e() {
        MethodCollector.m26663i(12475);
        while (this.f43070g != 5) {
            m33672a(32);
            try {
                InputStream inputStream = this.f43064a;
                byte[] bArr = this.f43067d;
                int i = this.f43069f;
                int read = inputStream.read(bArr, i, bArr.length - i);
                if (read >= 0) {
                    this.f43069f += read;
                    m33673a(false);
                    int i2 = this.f43074k;
                    if (i2 > 0) {
                        int i3 = i2 - this.f43066c;
                        MethodCollector.m26664o(12475);
                        return i3;
                    }
                } else {
                    this.f43076m = true;
                    IOException iOException = new IOException("Premature EOF");
                    MethodCollector.m26664o(12475);
                    throw iOException;
                }
            } catch (IOException e) {
                this.f43076m = true;
                MethodCollector.m26664o(12475);
                throw e;
            }
        }
        MethodCollector.m26664o(12475);
        return -1;
    }

    /* renamed from: b */
    public final int mo28853b() {
        int i;
        MethodCollector.m26663i(12689);
        if (this.f43070g == 5) {
            MethodCollector.m26664o(12689);
            return -1;
        }
        if (this.f43066c >= this.f43074k) {
            this.f43074k = 0;
            this.f43066c = 0;
        }
        while (this.f43070g != 5) {
            m33672a(32);
            try {
                if (!this.f43075l) {
                    long currentTimeMillis = System.currentTimeMillis();
                    InputStream inputStream = this.f43064a;
                    byte[] bArr = this.f43067d;
                    int i2 = this.f43069f;
                    i = inputStream.read(bArr, i2, bArr.length - i2);
                    this.f43071h = (int) (((long) this.f43071h) + (System.currentTimeMillis() - currentTimeMillis));
                } else {
                    i = this.f43069f - this.f43068e;
                }
                if (i >= 0) {
                    if (!this.f43075l) {
                        this.f43069f += i;
                    }
                    this.f43075l = m33673a(true);
                    int i3 = this.f43074k;
                    if (i3 > 0 && this.f43070g != 2) {
                        int i4 = i3 - this.f43066c;
                        MethodCollector.m26664o(12689);
                        return i4;
                    }
                } else {
                    this.f43076m = true;
                    IOException iOException = new IOException("Premature EOF");
                    MethodCollector.m26664o(12689);
                    throw iOException;
                }
            } catch (IOException e) {
                this.f43076m = true;
                MethodCollector.m26664o(12689);
                throw e;
            }
        }
        MethodCollector.m26664o(12689);
        return -1;
    }

    public C18090g(InputStream inputStream) {
        MethodCollector.m26663i(11939);
        this.f43064a = inputStream;
        MethodCollector.m26664o(11939);
    }

    /* renamed from: b */
    private int m33674b(boolean z) {
        if (this.f43070g == 5) {
            return -1;
        }
        if (this.f43066c >= this.f43074k) {
            this.f43074k = 0;
            this.f43066c = 0;
        }
        if (z) {
            return m33677e();
        }
        return m33676d();
    }

    /* renamed from: a */
    private void m33672a(int i) {
        int i2 = this.f43069f;
        int i3 = i2 + i;
        byte[] bArr = this.f43067d;
        if (i3 > bArr.length) {
            int i4 = this.f43068e;
            int i5 = i2 - i4;
            int i6 = i + i5;
            if (i6 > bArr.length) {
                byte[] bArr2 = new byte[i6];
                if (i5 > 0) {
                    System.arraycopy(bArr, i4, bArr2, 0, i5);
                }
                this.f43067d = bArr2;
            } else if (i5 > 0) {
                System.arraycopy(bArr, i4, bArr, 0, i5);
            }
            this.f43069f = i5;
            this.f43068e = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0028 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x00d1 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m33673a(boolean r12) {
        /*
        // Method dump skipped, instructions count: 355
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.network.p1264a.C18090g.m33673a(boolean):boolean");
    }

    /* renamed from: a */
    private int m33671a(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(11941);
        int i3 = this.f43072i - this.f43073j;
        if (i3 < i2) {
            i2 = i3;
        }
        if (i2 > 0) {
            try {
                int read = this.f43064a.read(bArr, i, i2);
                if (read > 0) {
                    int i4 = this.f43073j + read;
                    this.f43073j = i4;
                    if (i4 >= this.f43072i) {
                        this.f43070g = 3;
                    }
                    MethodCollector.m26664o(11941);
                    return read;
                }
                this.f43076m = true;
                IOException iOException = new IOException("Premature EOF");
                MethodCollector.m26664o(11941);
                throw iOException;
            } catch (IOException e) {
                this.f43076m = true;
                MethodCollector.m26664o(11941);
                throw e;
            }
        } else {
            MethodCollector.m26664o(11941);
            return 0;
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        MethodCollector.m26663i(12686);
        mo28851a();
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
            MethodCollector.m26664o(12686);
            throw indexOutOfBoundsException;
        } else if (i2 == 0) {
            MethodCollector.m26664o(12686);
            return 0;
        } else {
            int i4 = this.f43074k - this.f43066c;
            if (i4 <= 0) {
                if (this.f43070g == 2) {
                    int a = m33671a(bArr, i, i2);
                    MethodCollector.m26664o(12686);
                    return a;
                }
                i4 = m33674b(true);
                if (i4 < 0) {
                    MethodCollector.m26664o(12686);
                    return -1;
                }
            }
            if (i4 < i2) {
                i2 = i4;
            }
            System.arraycopy(this.f43065b, this.f43066c, bArr, i, i2);
            this.f43066c += i2;
            MethodCollector.m26664o(12686);
            return i2;
        }
    }
}
