package com.google.android.gms.internal.measurement;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.fq */
public abstract class AbstractC25958fq extends AbstractC25937ey {

    /* renamed from: b */
    private static final Logger f61139b = Logger.getLogger(AbstractC25958fq.class.getName());

    /* renamed from: c */
    private static final boolean f61140c = C26065jh.f61381b;

    /* renamed from: a */
    C25962fs f61141a;

    /* renamed from: d */
    public static int m50378d(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: e */
    static long m50381e(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: m */
    public static int m50394m(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: n */
    static int m50395n(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: a */
    public abstract int mo42494a();

    /* renamed from: a */
    public abstract void mo42495a(byte b);

    /* renamed from: a */
    public abstract void mo42498a(int i);

    /* renamed from: a */
    public abstract void mo42501a(int i, int i2);

    /* renamed from: a */
    public abstract void mo42502a(int i, long j);

    /* renamed from: a */
    public abstract void mo42503a(int i, AbstractC25943fb fbVar);

    /* renamed from: a */
    public abstract void mo42504a(int i, AbstractC26020hq hqVar);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo42505a(int i, AbstractC26020hq hqVar, AbstractC26041ik ikVar);

    /* renamed from: a */
    public abstract void mo42506a(int i, String str);

    /* renamed from: a */
    public abstract void mo42507a(int i, boolean z);

    /* renamed from: a */
    public abstract void mo42508a(long j);

    /* renamed from: a */
    public abstract void mo42509a(AbstractC25943fb fbVar);

    /* renamed from: a */
    public abstract void mo42510a(AbstractC26020hq hqVar);

    /* renamed from: a */
    public abstract void mo42511a(String str);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo42514a(byte[] bArr, int i);

    /* renamed from: b */
    public abstract void mo42516b(int i);

    /* renamed from: b */
    public abstract void mo42517b(int i, int i2);

    /* renamed from: b */
    public abstract void mo42519b(int i, AbstractC25943fb fbVar);

    /* renamed from: c */
    public abstract void mo42522c(int i, int i2);

    /* renamed from: c */
    public abstract void mo42523c(int i, long j);

    /* renamed from: c */
    public abstract void mo42524c(long j);

    /* renamed from: d */
    public abstract void mo42525d(int i);

    /* renamed from: e */
    public abstract void mo42527e(int i, int i2);

    private AbstractC25958fq() {
    }

    /* renamed from: a */
    public final void mo42500a(int i, float f) {
        mo42527e(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: b */
    public final void mo42520b(long j) {
        mo42508a(m50381e(j));
    }

    /* renamed from: a */
    public final void mo42513a(boolean z) {
        mo42495a(z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.measurement.fq$a */
    public static class C25959a extends AbstractC25958fq {

        /* renamed from: b */
        private final byte[] f61142b;

        /* renamed from: c */
        private final int f61143c;

        /* renamed from: d */
        private final int f61144d;

        /* renamed from: e */
        private int f61145e;

        static {
            Covode.recordClassIndex(31374);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25958fq
        /* renamed from: a */
        public final void mo42507a(int i, boolean z) {
            mo42501a(i, 0);
            mo42495a(z ? (byte) 1 : 0);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25958fq
        /* renamed from: a */
        public final void mo42509a(AbstractC25943fb fbVar) {
            mo42516b(fbVar.zza());
            fbVar.mo42409a(this);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25958fq
        /* renamed from: a */
        public final void mo42514a(byte[] bArr, int i) {
            mo42516b(i);
            m50430b(bArr, 0, i);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25958fq
        /* renamed from: a */
        public final void mo42510a(AbstractC26020hq hqVar) {
            mo42516b(hqVar.mo42621m());
            hqVar.mo42616a(this);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25958fq
        /* renamed from: a */
        public final void mo42508a(long j) {
            if (!AbstractC25958fq.f61140c || mo42494a() < 10) {
                while ((j & -128) != 0) {
                    try {
                        byte[] bArr = this.f61142b;
                        int i = this.f61145e;
                        this.f61145e = i + 1;
                        bArr[i] = (byte) ((((int) j) & 127) | 128);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new C25960b(C1764a.m5928a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f61145e), Integer.valueOf(this.f61144d), 1}), e);
                    }
                }
                byte[] bArr2 = this.f61142b;
                int i2 = this.f61145e;
                this.f61145e = i2 + 1;
                bArr2[i2] = (byte) ((int) j);
                return;
            }
            while ((j & -128) != 0) {
                byte[] bArr3 = this.f61142b;
                int i3 = this.f61145e;
                this.f61145e = i3 + 1;
                C26065jh.m50957a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.f61142b;
            int i4 = this.f61145e;
            this.f61145e = i4 + 1;
            C26065jh.m50957a(bArr4, (long) i4, (byte) ((int) j));
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25958fq
        /* renamed from: a */
        public final void mo42511a(String str) {
            int i = this.f61145e;
            try {
                int m = m50394m(str.length() * 3);
                int m2 = m50394m(str.length());
                if (m2 == m) {
                    int i2 = i + m2;
                    this.f61145e = i2;
                    int a = C26071jj.m51023a(str, this.f61142b, i2, mo42494a());
                    this.f61145e = i;
                    mo42516b((a - i) - m2);
                    this.f61145e = a;
                    return;
                }
                mo42516b(C26071jj.m51022a(str));
                this.f61145e = C26071jj.m51023a(str, this.f61142b, this.f61145e, mo42494a());
            } catch (C26075jn e) {
                this.f61145e = i;
                mo42512a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new C25960b(e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25958fq
        /* renamed from: a */
        public final int mo42494a() {
            return this.f61144d - this.f61145e;
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25958fq
        /* renamed from: a */
        public final void mo42498a(int i) {
            if (i >= 0) {
                mo42516b(i);
            } else {
                mo42508a((long) i);
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25958fq
        /* renamed from: a */
        public final void mo42495a(byte b) {
            try {
                byte[] bArr = this.f61142b;
                int i = this.f61145e;
                this.f61145e = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new C25960b(C1764a.m5928a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f61145e), Integer.valueOf(this.f61144d), 1}), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25958fq
        /* renamed from: d */
        public final void mo42525d(int i) {
            try {
                byte[] bArr = this.f61142b;
                int i2 = this.f61145e;
                int i3 = i2 + 1;
                this.f61145e = i3;
                bArr[i2] = (byte) i;
                int i4 = i3 + 1;
                this.f61145e = i4;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i4 + 1;
                this.f61145e = i5;
                bArr[i4] = (byte) (i >> 16);
                this.f61145e = i5 + 1;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new C25960b(C1764a.m5928a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f61145e), Integer.valueOf(this.f61144d), 1}), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25958fq
        /* renamed from: b */
        public final void mo42516b(int i) {
            if (!AbstractC25958fq.f61140c || C25933eu.m50185a() || mo42494a() < 5) {
                while ((i & -128) != 0) {
                    try {
                        byte[] bArr = this.f61142b;
                        int i2 = this.f61145e;
                        this.f61145e = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new C25960b(C1764a.m5928a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f61145e), Integer.valueOf(this.f61144d), 1}), e);
                    }
                }
                byte[] bArr2 = this.f61142b;
                int i3 = this.f61145e;
                this.f61145e = i3 + 1;
                bArr2[i3] = (byte) i;
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.f61142b;
                int i4 = this.f61145e;
                this.f61145e = i4 + 1;
                C26065jh.m50957a(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.f61142b;
                int i5 = this.f61145e;
                this.f61145e = i5 + 1;
                C26065jh.m50957a(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.f61142b;
                    int i7 = this.f61145e;
                    this.f61145e = i7 + 1;
                    C26065jh.m50957a(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f61142b;
                int i8 = this.f61145e;
                this.f61145e = i8 + 1;
                C26065jh.m50957a(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.f61142b;
                    int i10 = this.f61145e;
                    this.f61145e = i10 + 1;
                    C26065jh.m50957a(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f61142b;
                int i11 = this.f61145e;
                this.f61145e = i11 + 1;
                C26065jh.m50957a(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.f61142b;
                    int i13 = this.f61145e;
                    this.f61145e = i13 + 1;
                    C26065jh.m50957a(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f61142b;
                int i14 = this.f61145e;
                this.f61145e = i14 + 1;
                C26065jh.m50957a(bArr10, (long) i14, (byte) (i12 | 128));
                byte[] bArr11 = this.f61142b;
                int i15 = this.f61145e;
                this.f61145e = i15 + 1;
                C26065jh.m50957a(bArr11, (long) i15, (byte) (i12 >>> 7));
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25958fq
        /* renamed from: c */
        public final void mo42524c(long j) {
            try {
                byte[] bArr = this.f61142b;
                int i = this.f61145e;
                int i2 = i + 1;
                this.f61145e = i2;
                bArr[i] = (byte) ((int) j);
                int i3 = i2 + 1;
                this.f61145e = i3;
                bArr[i2] = (byte) ((int) (j >> 8));
                int i4 = i3 + 1;
                this.f61145e = i4;
                bArr[i3] = (byte) ((int) (j >> 16));
                int i5 = i4 + 1;
                this.f61145e = i5;
                bArr[i4] = (byte) ((int) (j >> 24));
                int i6 = i5 + 1;
                this.f61145e = i6;
                bArr[i5] = (byte) ((int) (j >> 32));
                int i7 = i6 + 1;
                this.f61145e = i7;
                bArr[i6] = (byte) ((int) (j >> 40));
                int i8 = i7 + 1;
                this.f61145e = i8;
                bArr[i7] = (byte) ((int) (j >> 48));
                this.f61145e = i8 + 1;
                bArr[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new C25960b(C1764a.m5928a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f61145e), Integer.valueOf(this.f61144d), 1}), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25958fq
        /* renamed from: b */
        public final void mo42517b(int i, int i2) {
            mo42501a(i, 0);
            mo42498a(i2);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25958fq
        /* renamed from: c */
        public final void mo42522c(int i, int i2) {
            mo42501a(i, 0);
            mo42516b(i2);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25958fq
        /* renamed from: e */
        public final void mo42527e(int i, int i2) {
            mo42501a(i, 5);
            mo42525d(i2);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25958fq
        /* renamed from: c */
        public final void mo42523c(int i, long j) {
            mo42501a(i, 1);
            mo42524c(j);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25958fq
        /* renamed from: a */
        public final void mo42501a(int i, int i2) {
            mo42516b((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25958fq
        /* renamed from: b */
        public final void mo42519b(int i, AbstractC25943fb fbVar) {
            mo42501a(1, 3);
            mo42522c(2, i);
            mo42503a(3, fbVar);
            mo42501a(1, 4);
        }

        C25959a(byte[] bArr, int i) {
            super((byte) 0);
            Objects.requireNonNull(bArr, "buffer");
            int i2 = i + 0;
            if ((i | 0 | (bArr.length - i2)) >= 0) {
                this.f61142b = bArr;
                this.f61143c = 0;
                this.f61145e = 0;
                this.f61144d = i2;
                return;
            }
            throw new IllegalArgumentException(C1764a.m5928a("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)}));
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25958fq
        /* renamed from: a */
        public final void mo42502a(int i, long j) {
            mo42501a(i, 0);
            mo42508a(j);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25958fq
        /* renamed from: a */
        public final void mo42503a(int i, AbstractC25943fb fbVar) {
            mo42501a(i, 2);
            mo42509a(fbVar);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25958fq
        /* renamed from: a */
        public final void mo42504a(int i, AbstractC26020hq hqVar) {
            mo42501a(1, 3);
            mo42522c(2, i);
            mo42501a(3, 2);
            mo42510a(hqVar);
            mo42501a(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25958fq
        /* renamed from: a */
        public final void mo42506a(int i, String str) {
            mo42501a(i, 2);
            mo42511a(str);
        }

        @Override // com.google.android.gms.internal.measurement.AbstractC25937ey
        /* renamed from: a */
        public final void mo42381a(byte[] bArr, int i, int i2) {
            m50430b(bArr, i, i2);
        }

        /* renamed from: b */
        private final void m50430b(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f61142b, this.f61145e, i2);
                this.f61145e += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new C25960b(C1764a.m5928a("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f61145e), Integer.valueOf(this.f61144d), Integer.valueOf(i2)}), e);
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.measurement.AbstractC25958fq
        /* renamed from: a */
        public final void mo42505a(int i, AbstractC26020hq hqVar, AbstractC26041ik ikVar) {
            mo42501a(i, 2);
            AbstractC25931es esVar = (AbstractC25931es) hqVar;
            int i2 = esVar.mo42365i();
            if (i2 == -1) {
                i2 = ikVar.mo42699b(esVar);
                esVar.mo42362b(i2);
            }
            mo42516b(i2);
            ikVar.mo42696a((Object) hqVar, (AbstractC26081jt) this.f61141a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo42512a(String str, C26075jn jnVar) {
        f61139b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) jnVar);
        byte[] bytes = str.getBytes(C25989gm.f61260a);
        try {
            mo42516b(bytes.length);
            mo42381a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new C25960b(e);
        } catch (C25960b e2) {
            throw e2;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.fq$b */
    public static class C25960b extends IOException {
        static {
            Covode.recordClassIndex(31375);
        }

        C25960b() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        C25960b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C25960b(java.lang.String r4, java.lang.Throwable r5) {
            /*
                r3 = this;
                java.lang.String r2 = java.lang.String.valueOf(r4)
                int r0 = r2.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0014
                java.lang.String r0 = r1.concat(r2)
            L_0x0010:
                r3.<init>(r0, r5)
                return
            L_0x0014:
                java.lang.String r0 = new java.lang.String
                r0.<init>(r1)
                goto L_0x0010
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC25958fq.C25960b.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    static {
        Covode.recordClassIndex(31373);
    }

    /* renamed from: b */
    public final void mo42515b() {
        if (mo42494a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* synthetic */ AbstractC25958fq(byte b) {
        this();
    }

    /* renamed from: a */
    public static AbstractC25958fq m50367a(byte[] bArr) {
        return new C25959a(bArr, bArr.length);
    }

    /* renamed from: b */
    public static int m50373b(byte[] bArr) {
        int length = bArr.length;
        return m50394m(length) + length;
    }

    /* renamed from: c */
    public final void mo42521c(int i) {
        mo42516b(m50395n(i));
    }

    /* renamed from: a */
    public static int m50365a(C26002gz gzVar) {
        int a = gzVar.mo42657a();
        return m50394m(a) + a;
    }

    /* renamed from: e */
    public static int m50379e(int i) {
        return m50394m(i << 3) + 4;
    }

    /* renamed from: f */
    public static int m50382f(int i) {
        return m50394m(i << 3) + 4;
    }

    /* renamed from: g */
    public static int m50385g(int i) {
        return m50394m(i << 3) + 8;
    }

    /* renamed from: h */
    public static int m50387h(int i) {
        return m50394m(i << 3) + 8;
    }

    /* renamed from: i */
    public static int m50389i(int i) {
        return m50394m(i << 3) + 4;
    }

    /* renamed from: j */
    public static int m50391j(int i) {
        return m50394m(i << 3) + 8;
    }

    /* renamed from: k */
    public static int m50392k(int i) {
        return m50394m(i << 3) + 1;
    }

    /* renamed from: l */
    public static int m50393l(int i) {
        if (i >= 0) {
            return m50394m(i);
        }
        return 10;
    }

    /* renamed from: b */
    public static int m50370b(AbstractC25943fb fbVar) {
        int zza = fbVar.zza();
        return m50394m(zza) + zza;
    }

    /* renamed from: b */
    public static int m50371b(AbstractC26020hq hqVar) {
        int m = hqVar.mo42621m();
        return m50394m(m) + m;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* renamed from: b */
    public static int m50372b(String str) {
        int i;
        try {
            str = C26071jj.m51022a(str);
            i = str;
        } catch (C26075jn unused) {
            i = str.getBytes(C25989gm.f61260a).length;
        }
        return m50394m(i) + i;
    }

    /* renamed from: a */
    public final void mo42496a(double d) {
        mo42524c(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo42497a(float f) {
        mo42525d(Float.floatToRawIntBits(f));
    }

    /* renamed from: d */
    public final void mo42526d(int i, int i2) {
        mo42522c(i, m50395n(i2));
    }

    /* renamed from: d */
    public static int m50377d(int i, long j) {
        return m50394m(i << 3) + m50378d(j);
    }

    /* renamed from: a */
    public static int m50364a(int i, C26002gz gzVar) {
        int m = m50394m(i << 3);
        int a = gzVar.mo42657a();
        return m + m50394m(a) + a;
    }

    /* renamed from: b */
    public static int m50369b(int i, String str) {
        return m50394m(i << 3) + m50372b(str);
    }

    /* renamed from: c */
    public static int m50374c(int i, AbstractC25943fb fbVar) {
        int m = m50394m(i << 3);
        int zza = fbVar.zza();
        return m + m50394m(zza) + zza;
    }

    /* renamed from: e */
    public static int m50380e(int i, long j) {
        return m50394m(i << 3) + m50378d(j);
    }

    /* renamed from: f */
    public static int m50383f(int i, int i2) {
        return m50394m(i << 3) + m50393l(i2);
    }

    /* renamed from: g */
    public static int m50386g(int i, int i2) {
        return m50394m(i << 3) + m50394m(i2);
    }

    /* renamed from: h */
    public static int m50388h(int i, int i2) {
        return m50394m(i << 3) + m50394m(m50395n(i2));
    }

    /* renamed from: i */
    public static int m50390i(int i, int i2) {
        return m50394m(i << 3) + m50393l(i2);
    }

    /* renamed from: a */
    static int m50366a(AbstractC26020hq hqVar, AbstractC26041ik ikVar) {
        AbstractC25931es esVar = (AbstractC25931es) hqVar;
        int i = esVar.mo42365i();
        if (i == -1) {
            i = ikVar.mo42699b(esVar);
            esVar.mo42362b(i);
        }
        return m50394m(i) + i;
    }

    /* renamed from: f */
    public static int m50384f(int i, long j) {
        return m50394m(i << 3) + m50378d(m50381e(j));
    }

    /* renamed from: a */
    public final void mo42499a(int i, double d) {
        mo42523c(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: b */
    public final void mo42518b(int i, long j) {
        mo42502a(i, m50381e(j));
    }

    /* renamed from: b */
    static int m50368b(int i, AbstractC26020hq hqVar, AbstractC26041ik ikVar) {
        return m50394m(i << 3) + m50366a(hqVar, ikVar);
    }

    /* renamed from: c */
    static int m50375c(int i, AbstractC26020hq hqVar, AbstractC26041ik ikVar) {
        int m = m50394m(i << 3) << 1;
        AbstractC25931es esVar = (AbstractC25931es) hqVar;
        int i2 = esVar.mo42365i();
        if (i2 == -1) {
            i2 = ikVar.mo42699b(esVar);
            esVar.mo42362b(i2);
        }
        return m + i2;
    }
}
