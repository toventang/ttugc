package com.bytedance.apm.p789q;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashSet;

/* renamed from: com.bytedance.apm.q.o */
public final class C12594o {

    /* renamed from: c */
    private static final byte[] f30625c = {Byte.MAX_VALUE, 69, 76, 70};

    /* renamed from: a */
    long f30626a;

    /* renamed from: b */
    long f30627b;

    /* renamed from: d */
    private final String f30628d;

    /* renamed from: e */
    private final RandomAccessFile f30629e;

    /* renamed from: f */
    private final byte[] f30630f;

    /* renamed from: g */
    private int f30631g;

    /* renamed from: h */
    private boolean f30632h;

    /* renamed from: i */
    private int f30633i;

    /* renamed from: j */
    private int f30634j;

    /* renamed from: k */
    private long f30635k;

    /* renamed from: l */
    private long f30636l;

    /* renamed from: m */
    private long f30637m;

    /* renamed from: n */
    private long f30638n;

    /* renamed from: o */
    private long f30639o;

    /* renamed from: p */
    private long f30640p;

    /* renamed from: q */
    private long f30641q;

    /* renamed from: r */
    private long f30642r;

    /* renamed from: b */
    private int m22703b() {
        return (int) m22699a(2);
    }

    /* renamed from: c */
    private long m22705c() {
        return m22699a(4);
    }

    /* renamed from: d */
    private long m22706d() {
        return m22699a(this.f30634j);
    }

    /* renamed from: e */
    private long m22707e() {
        return m22699a(this.f30634j);
    }

    /* renamed from: a */
    public final void mo20410a() {
        try {
            this.f30629e.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: f */
    private int m22708f() {
        return this.f30629e.read() & 255;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            mo20410a();
        } finally {
            super.finalize();
        }
    }

    static {
        Covode.recordClassIndex(14411);
    }

    /* renamed from: com.bytedance.apm.q.o$a */
    public static class C12595a {

        /* renamed from: a */
        public final String f30643a;

        /* renamed from: b */
        public final int f30644b;

        /* renamed from: c */
        public final int f30645c;

        static {
            Covode.recordClassIndex(14412);
        }

        public final String toString() {
            String str;
            String str2;
            StringBuilder append = new StringBuilder("Symbol[").append(this.f30643a).append(",");
            int i = this.f30644b;
            if (i == 0) {
                str = "LOCAL";
            } else if (i == 1) {
                str = "GLOBAL";
            } else if (i != 2) {
                str = "STB_??? (" + this.f30644b + ")";
            } else {
                str = "WEAK";
            }
            StringBuilder append2 = append.append(str).append(",");
            switch (this.f30645c) {
                case 0:
                    str2 = "NOTYPE";
                    break;
                case 1:
                    str2 = "OBJECT";
                    break;
                case 2:
                    str2 = "FUNC";
                    break;
                case 3:
                    str2 = "SECTION";
                    break;
                case 4:
                    str2 = "FILE";
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    str2 = "COMMON";
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    str2 = "TLS";
                    break;
                default:
                    str2 = "STT_??? (" + this.f30645c + ")";
                    break;
            }
            return append2.append(str2).append("]").toString();
        }

        C12595a(String str, int i) {
            this.f30643a = str;
            this.f30644b = (i >> 4) & 15;
            this.f30645c = i & 15;
        }
    }

    /* renamed from: a */
    private String m22701a(long j) {
        long j2 = this.f30638n;
        if (j2 == 0 || j < 0 || j >= this.f30639o) {
            return null;
        }
        return m22704b(j2 + j);
    }

    /* renamed from: a */
    private long m22699a(int i) {
        int i2 = 0;
        this.f30629e.readFully(this.f30630f, 0, i);
        if (this.f30631g == 1) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                i2 = (i2 << 8) | (this.f30630f[i3] & 255);
            }
        } else {
            int i4 = i - 1;
            int i5 = 0;
            while (i2 <= i4) {
                i5 = (i5 << 8) | (this.f30630f[i2] & 255);
                i2++;
            }
            i2 = i5;
        }
        return (long) i2;
    }

    /* renamed from: b */
    private String m22704b(long j) {
        long filePointer = this.f30629e.getFilePointer();
        this.f30629e.seek(j);
        RandomAccessFile randomAccessFile = this.f30629e;
        byte[] bArr = this.f30630f;
        randomAccessFile.readFully(bArr, 0, (int) Math.min((long) bArr.length, randomAccessFile.length() - j));
        this.f30629e.seek(filePointer);
        int i = 0;
        while (true) {
            byte[] bArr2 = this.f30630f;
            if (i >= bArr2.length) {
                return null;
            }
            if (bArr2[i] == 0) {
                return new String(this.f30630f, 0, i);
            }
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo20412b(String str) {
        int i;
        HashSet<Long> hashSet = new HashSet();
        byte[] bArr = new byte[((int) Math.max(this.f30626a, this.f30627b))];
        this.f30629e.seek(this.f30635k);
        this.f30629e.readFully(bArr, 0, (int) this.f30626a);
        int i2 = 0;
        while (((long) i2) < this.f30626a) {
            long a = m22700a(bArr, i2);
            int i3 = i2 + 4;
            int i4 = this.f30634j;
            if (i4 == 8) {
                i = bArr[i3] & 255;
                i2 = i3 + 1 + 19;
            } else {
                int i5 = i3 + i4 + 4;
                i = bArr[i5] & 255;
                i2 = i5 + 1 + 3;
            }
            if (a != 0 && (i & 15) == 2) {
                hashSet.add(Long.valueOf(a));
            }
        }
        this.f30629e.seek(this.f30640p);
        this.f30629e.readFully(bArr, 0, (int) this.f30627b);
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        for (Long l : hashSet) {
            int i6 = 0;
            while (i6 < length) {
                int longValue = (int) (((long) i6) + l.longValue());
                if (((long) longValue) >= this.f30627b || bArr[longValue] != bytes[i6]) {
                    break;
                }
                i6++;
            }
            if (i6 == length && bArr[(int) (((long) i6) + l.longValue())] == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b5, code lost:
        if (r5 == 1) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e8, code lost:
        if (r5 == 1) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00eb, code lost:
        if (r5 == 2) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ee, code lost:
        if (r5 == 2) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f1, code lost:
        if (r5 == 1) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0154, code lost:
        throw new java.io.IOException("Invalid e_machine/EI_CLASS ELF combination: " + r7 + "/" + ((int) r5) + ": " + r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C12594o(java.io.File r13) {
        /*
        // Method dump skipped, instructions count: 407
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p789q.C12594o.<init>(java.io.File):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo20411a(String str) {
        int f;
        String str2;
        this.f30629e.seek(this.f30635k);
        while (this.f30629e.getFilePointer() < this.f30635k + this.f30626a) {
            long a = m22699a(4);
            if (this.f30634j == 8) {
                f = m22708f();
                m22708f();
                m22699a(2);
                m22707e();
                m22699a(this.f30634j);
            } else {
                m22707e();
                m22699a(4);
                f = m22708f();
                m22708f();
                m22699a(2);
            }
            if (a != 0) {
                long j = this.f30640p;
                long j2 = this.f30627b;
                if (j == 0 || a < 0 || a >= j2) {
                    str2 = null;
                } else {
                    str2 = m22704b(j + a);
                }
                if (TextUtils.equals(str, str2) && new C12595a(str2, f).f30645c == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private long m22700a(byte[] bArr, int i) {
        int i2 = 3;
        int i3 = 0;
        if (this.f30631g == 1) {
            do {
                i3 = (i3 << 8) | (bArr[i2 + i] & 255);
                i2--;
            } while (i2 >= 0);
        } else {
            int i4 = 0;
            do {
                i4 = (i4 << 8) | (bArr[i3 + i] & 255);
                i3++;
            } while (i3 <= 3);
            i3 = i4;
        }
        return (long) i3;
    }

    /* renamed from: a */
    private void m22702a(long j, int i, int i2, int i3) {
        this.f30629e.seek(j + ((long) (i3 * i2)));
        m22699a(4);
        long a = m22699a(4);
        m22699a(this.f30634j);
        m22707e();
        long d = m22706d();
        long a2 = m22699a(this.f30634j);
        if (a == 3) {
            this.f30638n = d;
            this.f30639o = a2;
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 != i3) {
                this.f30629e.seek(j + ((long) (i4 * i2)));
                long a3 = m22699a(4);
                long a4 = m22699a(4);
                m22699a(this.f30634j);
                m22707e();
                long d2 = m22706d();
                long a5 = m22699a(this.f30634j);
                if (a4 == 2 || a4 == 11) {
                    String a6 = m22701a(a3);
                    if (".symtab".equals(a6)) {
                        this.f30635k = d2;
                        this.f30626a = a5;
                    } else if (".dynsym".equals(a6)) {
                        this.f30636l = d2;
                        this.f30637m = a5;
                    }
                } else if (a4 == 3) {
                    String a7 = m22701a(a3);
                    if (".strtab".equals(a7)) {
                        this.f30640p = d2;
                        this.f30627b = a5;
                    } else if (".dynstr".equals(a7)) {
                        this.f30641q = d2;
                        this.f30642r = a5;
                    }
                } else if (a4 == 6) {
                    this.f30632h = true;
                }
            }
        }
    }
}
