package p4632k;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: k.f */
public final class C89420f implements Cloneable, ByteChannel, AbstractC89425g, AbstractC89426h {

    /* renamed from: c */
    public static final C89421a f203088c = new C89421a((byte) 0);

    /* renamed from: d */
    private static final byte[] f203089d;

    /* renamed from: a */
    public C89443v f203090a;

    /* renamed from: b */
    public long f203091b;

    @Override // p4632k.AbstractC89426h, p4632k.AbstractC89425g
    /* renamed from: a */
    public final C89420f mo68846a() {
        return this;
    }

    @Override // java.lang.AutoCloseable, p4632k.AbstractC89408aa, java.io.Closeable, p4632k.AbstractC89447y, java.nio.channels.Channel
    public final void close() {
    }

    @Override // p4632k.AbstractC89425g, p4632k.AbstractC89447y, java.io.Flushable
    public final void flush() {
    }

    public final boolean isOpen() {
        return true;
    }

    /* renamed from: k.f$a */
    public static final class C89421a {
        static {
            Covode.recordClassIndex(105505);
        }

        private C89421a() {
        }

        public /* synthetic */ C89421a(byte b) {
            this();
        }
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ AbstractC89425g mo68853b() {
        return this;
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ AbstractC89425g mo68856c() {
        return this;
    }

    @Override // p4632k.AbstractC89408aa, p4632k.AbstractC89447y
    public final C89409ab timeout() {
        return C89409ab.f203072h;
    }

    /* renamed from: a */
    public final C89420f mo143803a(C89420f fVar, long j, long j2) {
        long j3 = j2;
        long j4 = j;
        C89219l.m154719c(fVar, "");
        C89413c.m155000a(this.f203091b, j4, j3);
        if (j3 == 0) {
            return this;
        }
        fVar.f203091b += j3;
        C89443v vVar = this.f203090a;
        while (true) {
            if (vVar == null) {
                C89219l.m154707a();
            }
            if (j4 < ((long) (vVar.f203133c - vVar.f203132b))) {
                break;
            }
            j4 -= (long) (vVar.f203133c - vVar.f203132b);
            vVar = vVar.f203136f;
        }
        while (j3 > 0) {
            if (vVar == null) {
                C89219l.m154707a();
            }
            C89443v a = vVar.mo143947a();
            a.f203132b += (int) j4;
            a.f203133c = Math.min(a.f203132b + ((int) j3), a.f203133c);
            C89443v vVar2 = fVar.f203090a;
            if (vVar2 == null) {
                a.f203137g = a;
                a.f203136f = a.f203137g;
                fVar.f203090a = a.f203136f;
            } else {
                C89443v vVar3 = vVar2.f203137g;
                if (vVar3 == null) {
                    C89219l.m154707a();
                }
                vVar3.mo143949a(a);
            }
            j3 -= (long) (a.f203133c - a.f203132b);
            vVar = vVar.f203136f;
            j4 = 0;
        }
        return this;
    }

    /* renamed from: a */
    public final C89420f mo143801a(String str, int i, int i2) {
        char charAt;
        C89219l.m154719c(str, "");
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i)).toString());
        } else if (i2 < i) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    C89443v j = mo143834j(1);
                    byte[] bArr = j.f203131a;
                    int i3 = j.f203133c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt2;
                    while (true) {
                        i = i4;
                        if (i >= min || (charAt = str.charAt(i)) >= 128) {
                            int i5 = (i3 + i) - j.f203133c;
                            j.f203133c += i5;
                            this.f203091b += (long) i5;
                        } else {
                            i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                        }
                    }
                    int i52 = (i3 + i) - j.f203133c;
                    j.f203133c += i52;
                    this.f203091b += (long) i52;
                } else {
                    if (charAt2 < 2048) {
                        mo68847a((charAt2 >> 6) | 192);
                        mo68847a((charAt2 & '?') | 128);
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        mo68847a((charAt2 >> '\f') | 224);
                        mo68847a(((charAt2 >> 6) & 63) | 128);
                        mo68847a((charAt2 & '?') | 128);
                    } else {
                        int i6 = i + 1;
                        char charAt3 = i6 < i2 ? str.charAt(i6) : 0;
                        if (charAt2 > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                            mo68847a(63);
                            i = i6;
                        } else {
                            int i7 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                            mo68847a((i7 >> 18) | 240);
                            mo68847a(((i7 >> 12) & 63) | 128);
                            mo68847a(((i7 >> 6) & 63) | 128);
                            mo68847a((i7 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
    }

    /* renamed from: a */
    public final C89420f mo143802a(String str, int i, int i2, Charset charset) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(charset, "");
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i)).toString());
        } else if (i2 < i) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        } else if (i2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        } else if (C89219l.m154714a(charset, C89338d.f202990a)) {
            return mo143801a(str, i, i2);
        } else {
            String substring = str.substring(i, i2);
            C89219l.m154709a((Object) substring, "");
            if (substring != null) {
                byte[] bytes = substring.getBytes(charset);
                C89219l.m154709a((Object) bytes, "");
                return mo68852a(bytes, 0, bytes.length);
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    @Override // p4632k.AbstractC89447y
    /* renamed from: a */
    public final void mo22060a(C89420f fVar, long j) {
        C89443v vVar;
        long j2 = j;
        C89219l.m154719c(fVar, "");
        if (fVar != this) {
            C89413c.m155000a(fVar.f203091b, 0, j2);
            while (j2 > 0) {
                C89443v vVar2 = fVar.f203090a;
                if (vVar2 == null) {
                    C89219l.m154707a();
                }
                int i = vVar2.f203133c;
                C89443v vVar3 = fVar.f203090a;
                if (vVar3 == null) {
                    C89219l.m154707a();
                }
                if (j2 < ((long) (i - vVar3.f203132b))) {
                    C89443v vVar4 = this.f203090a;
                    if (!(vVar4 == null || (vVar = vVar4.f203137g) == null || !vVar.f203135e)) {
                        if ((((long) vVar.f203133c) + j2) - ((long) (vVar.f203134d ? 0 : vVar.f203132b)) <= 8192) {
                            C89443v vVar5 = fVar.f203090a;
                            if (vVar5 == null) {
                                C89219l.m154707a();
                            }
                            vVar5.mo143950a(vVar, (int) j2);
                            fVar.f203091b -= j2;
                            this.f203091b += j2;
                            return;
                        }
                    }
                    C89443v vVar6 = fVar.f203090a;
                    if (vVar6 == null) {
                        C89219l.m154707a();
                    }
                    fVar.f203090a = vVar6.mo143948a((int) j2);
                }
                C89443v vVar7 = fVar.f203090a;
                if (vVar7 == null) {
                    C89219l.m154707a();
                }
                long j3 = (long) (vVar7.f203133c - vVar7.f203132b);
                fVar.f203090a = vVar7.mo143952c();
                C89443v vVar8 = this.f203090a;
                if (vVar8 == null) {
                    this.f203090a = vVar7;
                    vVar7.f203137g = vVar7;
                    vVar7.f203136f = vVar7.f203137g;
                } else {
                    C89443v vVar9 = vVar8.f203137g;
                    if (vVar9 == null) {
                        C89219l.m154707a();
                    }
                    vVar9.mo143949a(vVar7).mo143953d();
                }
                fVar.f203091b -= j3;
                this.f203091b += j3;
                j2 -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: d */
    public final OutputStream mo68859d() {
        return new C89424d(this);
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: f */
    public final InputStream mo143819f() {
        return new C89423c(this);
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: u */
    public final byte[] mo143853u() {
        return mo143836k(this.f203091b);
    }

    /* renamed from: v */
    public final void mo143854v() {
        mo143838l(this.f203091b);
    }

    /* renamed from: k.f$c */
    public static final class C89423c extends InputStream {

        /* renamed from: a */
        final /* synthetic */ C89420f f203099a;

        static {
            Covode.recordClassIndex(105507);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
        public final void close() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(this.f203099a.f203091b, 2147483647L);
        }

        @Override // java.io.InputStream
        public final int read() {
            if (this.f203099a.f203091b > 0) {
                return this.f203099a.mo143824h() & 255;
            }
            return -1;
        }

        public final String toString() {
            return this.f203099a + ".inputStream()";
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C89423c(C89420f fVar) {
            this.f203099a = fVar;
            MethodCollector.m26663i(3698);
            MethodCollector.m26664o(3698);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            C89219l.m154719c(bArr, "");
            return this.f203099a.mo143804b(bArr, i, i2);
        }
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: e */
    public final boolean mo143815e() {
        if (this.f203091b == 0) {
            return true;
        }
        return false;
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: m */
    public final int mo143839m() {
        return C89413c.m154998a(mo143832j());
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: n */
    public final long mo143841n() {
        return C89413c.m154999a(mo143835k());
    }

    /* renamed from: q */
    public final C89427i mo143847q() {
        return new C89427i(mo143853u());
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: r */
    public final String mo143848r() {
        return m155014a(this.f203091b, C89338d.f202990a);
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: s */
    public final String mo143850s() {
        return mo143828i(Long.MAX_VALUE);
    }

    public final String toString() {
        return mo143857x().toString();
    }

    /* renamed from: k.f$d */
    public static final class C89424d extends OutputStream {

        /* renamed from: a */
        final /* synthetic */ C89420f f203100a;

        static {
            Covode.recordClassIndex(105508);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
        }

        public final String toString() {
            return this.f203100a + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            this.f203100a.mo68847a(i);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C89424d(C89420f fVar) {
            this.f203100a = fVar;
            MethodCollector.m26663i(5325);
            MethodCollector.m26664o(5325);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            C89219l.m154719c(bArr, "");
            this.f203100a.mo68852a(bArr, i, i2);
        }
    }

    static {
        Covode.recordClassIndex(105504);
        byte[] bytes = "0123456789abcdef".getBytes(C89338d.f202990a);
        C89219l.m154709a((Object) bytes, "");
        f203089d = bytes;
    }

    /* renamed from: l */
    public final short mo143837l() {
        int i = mo143830i() & 65535;
        return (short) (((i & 255) << 8) | ((65280 & i) >>> 8));
    }

    /* renamed from: k.f$b */
    public static final class C89422b implements Closeable {

        /* renamed from: a */
        public C89420f f203092a;

        /* renamed from: b */
        public boolean f203093b;

        /* renamed from: c */
        public long f203094c = -1;

        /* renamed from: d */
        public byte[] f203095d;

        /* renamed from: e */
        public int f203096e = -1;

        /* renamed from: f */
        public int f203097f = -1;

        /* renamed from: g */
        private C89443v f203098g;

        static {
            Covode.recordClassIndex(105506);
        }

        /* renamed from: a */
        public final int mo143858a() {
            long j;
            long j2 = this.f203094c;
            C89420f fVar = this.f203092a;
            if (fVar == null) {
                C89219l.m154707a();
            }
            if (j2 != fVar.f203091b) {
                long j3 = this.f203094c;
                if (j3 == -1) {
                    j = 0;
                } else {
                    j = j3 + ((long) (this.f203097f - this.f203096e));
                }
                return mo143859a(j);
            }
            throw new IllegalStateException("no more bytes".toString());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f203092a != null) {
                this.f203092a = null;
                this.f203098g = null;
                this.f203094c = -1;
                this.f203095d = null;
                this.f203096e = -1;
                this.f203097f = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer".toString());
        }

        /* renamed from: a */
        public final int mo143859a(long j) {
            C89420f fVar = this.f203092a;
            if (fVar == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            } else if (j < -1 || j > fVar.f203091b) {
                String a = C1764a.m5928a("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(fVar.f203091b)}, 2));
                C89219l.m154709a((Object) a, "");
                throw new ArrayIndexOutOfBoundsException(a);
            } else if (j == -1 || j == fVar.f203091b) {
                this.f203098g = null;
                this.f203094c = j;
                this.f203095d = null;
                this.f203096e = -1;
                this.f203097f = -1;
                return -1;
            } else {
                long j2 = 0;
                long j3 = fVar.f203091b;
                C89443v vVar = fVar.f203090a;
                C89443v vVar2 = fVar.f203090a;
                C89443v vVar3 = this.f203098g;
                if (vVar3 != null) {
                    long j4 = this.f203094c - ((long) (this.f203096e - vVar3.f203132b));
                    if (j4 > j) {
                        vVar2 = this.f203098g;
                        j3 = j4;
                    } else {
                        vVar = this.f203098g;
                        j2 = j4;
                    }
                }
                if (j3 - j > j - j2) {
                    while (true) {
                        if (vVar == null) {
                            C89219l.m154707a();
                        }
                        if (j < ((long) (vVar.f203133c - vVar.f203132b)) + j2) {
                            break;
                        }
                        j2 += (long) (vVar.f203133c - vVar.f203132b);
                        vVar = vVar.f203136f;
                    }
                } else {
                    while (j3 > j) {
                        if (vVar2 == null) {
                            C89219l.m154707a();
                        }
                        vVar2 = vVar2.f203137g;
                        if (vVar2 == null) {
                            C89219l.m154707a();
                        }
                        j3 -= (long) (vVar2.f203133c - vVar2.f203132b);
                    }
                    j2 = j3;
                    vVar = vVar2;
                }
                if (this.f203093b) {
                    if (vVar == null) {
                        C89219l.m154707a();
                    }
                    if (vVar.f203134d) {
                        C89443v b = vVar.mo143951b();
                        if (fVar.f203090a == vVar) {
                            fVar.f203090a = b;
                        }
                        vVar = vVar.mo143949a(b);
                        C89443v vVar4 = vVar.f203137g;
                        if (vVar4 == null) {
                            C89219l.m154707a();
                        }
                        vVar4.mo143952c();
                    }
                }
                this.f203098g = vVar;
                this.f203094c = j;
                if (vVar == null) {
                    C89219l.m154707a();
                }
                this.f203095d = vVar.f203131a;
                this.f203096e = vVar.f203132b + ((int) (j - j2));
                int i = vVar.f203133c;
                this.f203097f = i;
                return i - this.f203096e;
            }
        }
    }

    /* renamed from: g */
    public final long mo143821g() {
        long j = this.f203091b;
        if (j == 0) {
            return 0;
        }
        C89443v vVar = this.f203090a;
        if (vVar == null) {
            C89219l.m154707a();
        }
        C89443v vVar2 = vVar.f203137g;
        if (vVar2 == null) {
            C89219l.m154707a();
        }
        if (vVar2.f203133c >= 8192 || !vVar2.f203135e) {
            return j;
        }
        return j - ((long) (vVar2.f203133c - vVar2.f203132b));
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: h */
    public final byte mo143824h() {
        if (this.f203091b != 0) {
            C89443v vVar = this.f203090a;
            if (vVar == null) {
                C89219l.m154707a();
            }
            int i = vVar.f203132b;
            int i2 = vVar.f203133c;
            int i3 = i + 1;
            byte b = vVar.f203131a[i];
            this.f203091b--;
            if (i3 == i2) {
                this.f203090a = vVar.mo143952c();
                C89445w.m155223a(vVar);
            } else {
                vVar.f203132b = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    public final int hashCode() {
        C89443v vVar = this.f203090a;
        if (vVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = vVar.f203133c;
            for (int i3 = vVar.f203132b; i3 < i2; i3++) {
                i = (i * 31) + vVar.f203131a[i3];
            }
            vVar = vVar.f203136f;
            if (vVar == null) {
                C89219l.m154707a();
            }
        } while (vVar != this.f203090a);
        return i;
    }

    /* renamed from: x */
    public final C89427i mo143857x() {
        long j = this.f203091b;
        if (j <= 2147483647L) {
            return m155016k((int) j);
        }
        throw new IllegalStateException(("size > Integer.MAX_VALUE: " + this.f203091b).toString());
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: i */
    public final short mo143830i() {
        if (this.f203091b >= 2) {
            C89443v vVar = this.f203090a;
            if (vVar == null) {
                C89219l.m154707a();
            }
            int i = vVar.f203132b;
            int i2 = vVar.f203133c;
            if (i2 - i < 2) {
                return (short) (((mo143824h() & 255) << 8) | (mo143824h() & 255));
            }
            byte[] bArr = vVar.f203131a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f203091b -= 2;
            if (i4 == i2) {
                this.f203090a = vVar.mo143952c();
                C89445w.m155223a(vVar);
            } else {
                vVar.f203132b = i4;
            }
            return (short) i5;
        }
        throw new EOFException();
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: j */
    public final int mo143832j() {
        if (this.f203091b >= 4) {
            C89443v vVar = this.f203090a;
            if (vVar == null) {
                C89219l.m154707a();
            }
            int i = vVar.f203132b;
            int i2 = vVar.f203133c;
            if (((long) (i2 - i)) < 4) {
                return ((mo143824h() & 255) << 24) | ((mo143824h() & 255) << 16) | ((mo143824h() & 255) << 8) | (mo143824h() & 255);
            }
            byte[] bArr = vVar.f203131a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
            this.f203091b -= 4;
            if (i6 == i2) {
                this.f203090a = vVar.mo143952c();
                C89445w.m155223a(vVar);
            } else {
                vVar.f203132b = i6;
            }
            return i7;
        }
        throw new EOFException();
    }

    /* renamed from: w */
    public final C89420f clone() {
        C89420f fVar = new C89420f();
        if (this.f203091b == 0) {
            return fVar;
        }
        C89443v vVar = this.f203090a;
        if (vVar == null) {
            C89219l.m154707a();
        }
        C89443v a = vVar.mo143947a();
        fVar.f203090a = a;
        if (a == null) {
            C89219l.m154707a();
        }
        a.f203137g = fVar.f203090a;
        C89443v vVar2 = fVar.f203090a;
        if (vVar2 == null) {
            C89219l.m154707a();
        }
        C89443v vVar3 = fVar.f203090a;
        if (vVar3 == null) {
            C89219l.m154707a();
        }
        vVar2.f203136f = vVar3.f203137g;
        C89443v vVar4 = this.f203090a;
        if (vVar4 == null) {
            C89219l.m154707a();
        }
        while (true) {
            vVar4 = vVar4.f203136f;
            if (vVar4 != this.f203090a) {
                C89443v vVar5 = fVar.f203090a;
                if (vVar5 == null) {
                    C89219l.m154707a();
                }
                C89443v vVar6 = vVar5.f203137g;
                if (vVar6 == null) {
                    C89219l.m154707a();
                }
                if (vVar4 == null) {
                    C89219l.m154707a();
                }
                vVar6.mo143949a(vVar4.mo143947a());
            } else {
                fVar.f203091b = this.f203091b;
                return fVar;
            }
        }
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: k */
    public final long mo143835k() {
        if (this.f203091b >= 8) {
            C89443v vVar = this.f203090a;
            if (vVar == null) {
                C89219l.m154707a();
            }
            int i = vVar.f203132b;
            int i2 = vVar.f203133c;
            if (((long) (i2 - i)) < 8) {
                return ((((long) mo143832j()) & 4294967295L) << 32) | (4294967295L & ((long) mo143832j()));
            }
            byte[] bArr = vVar.f203131a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40);
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            int i9 = i8 + 1;
            long j2 = ((((long) bArr[i5]) & 255) << 32) | j | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16) | ((((long) bArr[i8]) & 255) << 8);
            int i10 = i9 + 1;
            long j3 = j2 | (((long) bArr[i9]) & 255);
            this.f203091b -= 8;
            if (i10 == i2) {
                this.f203090a = vVar.mo143952c();
                C89445w.m155223a(vVar);
            } else {
                vVar.f203132b = i10;
            }
            return j3;
        }
        throw new EOFException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r16 != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        r3.mo143824h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        throw new java.lang.NumberFormatException("Number too large: " + r3.mo143848r());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        r15 = true;
     */
    @Override // p4632k.AbstractC89426h
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo143843o() {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: p4632k.C89420f.mo143843o():long");
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: p */
    public final long mo143845p() {
        int i;
        int i2;
        if (this.f203091b != 0) {
            int i3 = 0;
            long j = 0;
            boolean z = false;
            do {
                C89443v vVar = this.f203090a;
                if (vVar == null) {
                    C89219l.m154707a();
                }
                byte[] bArr = vVar.f203131a;
                int i4 = vVar.f203132b;
                int i5 = vVar.f203133c;
                while (true) {
                    if (i4 >= i5) {
                        break;
                    }
                    byte b = bArr[i4];
                    if (b < 48 || b > 57) {
                        if (b >= 97 && b <= 102) {
                            i = b - 97;
                        } else if (b >= 65 && b <= 70) {
                            i = b - 65;
                        } else if (i3 != 0) {
                            z = true;
                        } else {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + Integer.toHexString(b));
                        }
                        i2 = i + 10;
                    } else {
                        i2 = b - 48;
                    }
                    if ((-1152921504606846976L & j) == 0) {
                        j = (j << 4) | ((long) i2);
                        i4++;
                        i3++;
                    } else {
                        throw new NumberFormatException("Number too large: " + new C89420f().mo68858c(j).mo68847a((int) b).mo143848r());
                    }
                }
                if (i4 == i5) {
                    this.f203090a = vVar.mo143952c();
                    C89445w.m155223a(vVar);
                } else {
                    vVar.f203132b = i4;
                }
                if (z) {
                    break;
                }
            } while (this.f203090a != null);
            this.f203091b -= (long) i3;
            return j;
        }
        throw new EOFException();
    }

    /* renamed from: t */
    public final int mo143851t() {
        int i;
        int i2;
        int i3;
        if (this.f203091b != 0) {
            byte f = mo143818f(0L);
            if ((f & 128) == 0) {
                i = f & Byte.MAX_VALUE;
                i2 = 1;
                i3 = 0;
            } else if ((f & 224) == 192) {
                i = f & 31;
                i2 = 2;
                i3 = 128;
            } else if ((f & 240) == 224) {
                i = f & 15;
                i2 = 3;
                i3 = 2048;
            } else if ((f & 248) == 240) {
                i = f & 7;
                i2 = 4;
                i3 = 65536;
            } else {
                mo143838l(1);
                return 65533;
            }
            long j = (long) i2;
            if (this.f203091b >= j) {
                for (int i4 = 1; i4 < i2; i4++) {
                    long j2 = (long) i4;
                    byte f2 = mo143818f(j2);
                    if ((f2 & 192) == 128) {
                        i = (i << 6) | (f2 & 63);
                    } else {
                        mo143838l(j2);
                        return 65533;
                    }
                }
                mo143838l(j);
                if (i > 1114111) {
                    return 65533;
                }
                if ((55296 <= i && 57343 >= i) || i < i3) {
                    return 65533;
                }
                return i;
            }
            throw new EOFException("size < " + i2 + ": " + this.f203091b + " (to read code point prefixed 0x" + Integer.toHexString(f) + ")");
        }
        throw new EOFException();
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: h */
    public final String mo143825h(long j) {
        return m155014a(j, C89338d.f202990a);
    }

    /* renamed from: k */
    private C89427i m155016k(int i) {
        if (i == 0) {
            return C89427i.EMPTY;
        }
        return new C89446x(this, i);
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: a */
    public final String mo143799a(Charset charset) {
        C89219l.m154719c(charset, "");
        return m155014a(this.f203091b, charset);
    }

    /* renamed from: b */
    public final C89420f mo68849a(String str) {
        C89219l.m154719c(str, "");
        return mo143801a(str, 0, str.length());
    }

    /* renamed from: c */
    public final C89420f mo68851a(byte[] bArr) {
        C89219l.m154719c(bArr, "");
        return mo68852a(bArr, 0, bArr.length);
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: g */
    public final C89427i mo143823g(long j) {
        return new C89427i(mo143836k(j));
    }

    /* renamed from: i */
    public final C89420f mo68860d(int i) {
        return mo68857c(C89413c.m154998a(i));
    }

    @Override // p4632k.AbstractC89425g
    /* renamed from: a */
    public final long mo68845a(AbstractC89408aa aaVar) {
        C89219l.m154719c(aaVar, "");
        long j = 0;
        while (true) {
            long read = aaVar.read(this, 8192);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    /* renamed from: b */
    public final C89420f mo68850a(C89427i iVar) {
        C89219l.m154719c(iVar, "");
        iVar.write$jvm(this);
        return this;
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: d */
    public final void mo143813d(long j) {
        if (this.f203091b < j) {
            throw new EOFException();
        }
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: e */
    public final boolean mo143816e(long j) {
        if (this.f203091b >= j) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final C89420f mo68847a(int i) {
        C89443v j = mo143834j(1);
        byte[] bArr = j.f203131a;
        int i2 = j.f203133c;
        j.f203133c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f203091b++;
        return this;
    }

    /* renamed from: n */
    public final C89420f mo68848a(long j) {
        return mo143840m(C89413c.m154999a(j));
    }

    /* renamed from: j */
    public final String mo143833j(long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (mo143818f(j2) == 13) {
                String h = mo143825h(j2);
                mo143838l(2);
                return h;
            }
        }
        String h2 = mo143825h(j);
        mo143838l(1);
        return h2;
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: k */
    public final byte[] mo143836k(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException("byteCount: ".concat(String.valueOf(j)).toString());
        } else if (this.f203091b >= j) {
            byte[] bArr = new byte[((int) j)];
            mo143808b(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: l */
    public final void mo143838l(long j) {
        while (j > 0) {
            C89443v vVar = this.f203090a;
            if (vVar != null) {
                int min = (int) Math.min(j, (long) (vVar.f203133c - vVar.f203132b));
                long j2 = (long) min;
                this.f203091b -= j2;
                j -= j2;
                vVar.f203132b += min;
                if (vVar.f203132b == vVar.f203133c) {
                    this.f203090a = vVar.mo143952c();
                    C89445w.m155223a(vVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C89219l.m154719c(byteBuffer, "");
        C89443v vVar = this.f203090a;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), vVar.f203133c - vVar.f203132b);
        byteBuffer.put(vVar.f203131a, vVar.f203132b, min);
        vVar.f203132b += min;
        this.f203091b -= (long) min;
        if (vVar.f203132b == vVar.f203133c) {
            this.f203090a = vVar.mo143952c();
            C89445w.m155223a(vVar);
        }
        return min;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        C89219l.m154719c(byteBuffer, "");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C89443v j = mo143834j(1);
            int min = Math.min(i, 8192 - j.f203133c);
            byteBuffer.get(j.f203131a, j.f203133c, min);
            i -= min;
            j.f203133c += min;
        }
        this.f203091b += (long) remaining;
        return remaining;
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: c */
    public final boolean mo143811c(C89427i iVar) {
        C89219l.m154719c(iVar, "");
        int size = iVar.size();
        C89219l.m154719c(iVar, "");
        if (size < 0 || this.f203091b - 0 < ((long) size) || iVar.size() - 0 < size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (mo143818f(((long) i) + 0) != iVar.getByte(i + 0)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final C89420f mo143814e(int i) {
        if (i < 128) {
            mo68847a(i);
        } else if (i < 2048) {
            mo68847a((i >> 6) | 192);
            mo68847a((i & 63) | 128);
        } else if (55296 <= i && 57343 >= i) {
            mo68847a(63);
        } else if (i < 65536) {
            mo68847a((i >> 12) | 224);
            mo68847a(((i >> 6) & 63) | 128);
            mo68847a((i & 63) | 128);
        } else if (i <= 1114111) {
            mo68847a((i >> 18) | 240);
            mo68847a(((i >> 12) & 63) | 128);
            mo68847a(((i >> 6) & 63) | 128);
            mo68847a((i & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C89420f)) {
            return false;
        }
        long j = this.f203091b;
        C89420f fVar = (C89420f) obj;
        if (j != fVar.f203091b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        C89443v vVar = this.f203090a;
        if (vVar == null) {
            C89219l.m154707a();
        }
        C89443v vVar2 = fVar.f203090a;
        if (vVar2 == null) {
            C89219l.m154707a();
        }
        int i = vVar.f203132b;
        int i2 = vVar2.f203132b;
        long j2 = 0;
        while (j2 < this.f203091b) {
            long min = (long) Math.min(vVar.f203133c - i, vVar2.f203133c - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (vVar.f203131a[i] != vVar2.f203131a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == vVar.f203133c) {
                vVar = vVar.f203136f;
                if (vVar == null) {
                    C89219l.m154707a();
                }
                i = vVar.f203132b;
            }
            if (i2 == vVar2.f203133c) {
                vVar2 = vVar2.f203136f;
                if (vVar2 == null) {
                    C89219l.m154707a();
                }
                i2 = vVar2.f203132b;
            }
            j2 += min;
        }
        return true;
    }

    /* renamed from: f */
    public final byte mo143818f(long j) {
        C89413c.m155000a(this.f203091b, j, 1);
        C89443v vVar = this.f203090a;
        if (vVar == null) {
            C89219l.m154707a();
            throw new NullPointerException("data");
        }
        long j2 = this.f203091b;
        if (j2 - j < j) {
            while (j2 > j) {
                vVar = vVar.f203137g;
                if (vVar == null) {
                    C89219l.m154707a();
                }
                j2 -= (long) (vVar.f203133c - vVar.f203132b);
            }
            return vVar.f203131a[(int) ((((long) vVar.f203132b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            long j4 = ((long) (vVar.f203133c - vVar.f203132b)) + j3;
            if (j4 > j) {
                return vVar.f203131a[(int) ((((long) vVar.f203132b) + j) - j3)];
            }
            vVar = vVar.f203136f;
            if (vVar == null) {
                C89219l.m154707a();
            }
            j3 = j4;
        }
    }

    /* renamed from: g */
    public final C89420f mo68854b(int i) {
        C89443v j = mo143834j(2);
        byte[] bArr = j.f203131a;
        int i2 = j.f203133c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        j.f203133c = i3 + 1;
        this.f203091b += 2;
        return this;
    }

    /* renamed from: h */
    public final C89420f mo68857c(int i) {
        C89443v j = mo143834j(4);
        byte[] bArr = j.f203131a;
        int i2 = j.f203133c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        j.f203133c = i5 + 1;
        this.f203091b += 4;
        return this;
    }

    /* renamed from: m */
    public final C89420f mo143840m(long j) {
        C89443v j2 = mo143834j(8);
        byte[] bArr = j2.f203131a;
        int i = j2.f203133c;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 56) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 48) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >>> 40) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((j >>> 32) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((j >>> 24) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((j >>> 16) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((j >>> 8) & 255));
        bArr[i8] = (byte) ((int) (j & 255));
        j2.f203133c = i8 + 1;
        this.f203091b += 8;
        return this;
    }

    /* renamed from: p */
    public final C89420f mo68858c(long j) {
        if (j == 0) {
            return mo68847a(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C89443v j2 = mo143834j(numberOfTrailingZeros);
        byte[] bArr = j2.f203131a;
        int i = j2.f203133c;
        for (int i2 = (j2.f203133c + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f203089d[(int) (15 & j)];
            j >>>= 4;
        }
        j2.f203133c += numberOfTrailingZeros;
        this.f203091b += (long) numberOfTrailingZeros;
        return this;
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: i */
    public final String mo143828i(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long a = mo143796a((byte) 10, 0, j2);
            if (a != -1) {
                return mo143833j(a);
            }
            if (j2 < this.f203091b && mo143818f(j2 - 1) == 13 && mo143818f(j2) == 10) {
                return mo143833j(j2);
            }
            C89420f fVar = new C89420f();
            mo143803a(fVar, 0, Math.min(32L, this.f203091b));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f203091b, j) + " content=" + fVar.mo143847q().hex() + (char) 8230);
        }
        throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j)).toString());
    }

    /* renamed from: j */
    public final C89443v mo143834j(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        C89443v vVar = this.f203090a;
        if (vVar == null) {
            C89443v a = C89445w.m155222a();
            this.f203090a = a;
            a.f203137g = a;
            a.f203136f = a;
            return a;
        }
        C89443v vVar2 = vVar.f203137g;
        if (vVar2 == null) {
            C89219l.m154707a();
        }
        if (vVar2.f203133c + i > 8192 || !vVar2.f203135e) {
            return vVar2.mo143949a(C89445w.m155222a());
        }
        return vVar2;
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: b */
    public final void mo143808b(byte[] bArr) {
        C89219l.m154719c(bArr, "");
        int i = 0;
        while (i < bArr.length) {
            int b = mo143804b(bArr, i, bArr.length - i);
            if (b != -1) {
                i += b;
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: o */
    public final C89420f mo68855b(long j) {
        if (j == 0) {
            return mo68847a(48);
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return mo68849a("-9223372036854775808");
            }
            z = true;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j < 100) {
                    if (j >= 10) {
                        i = 2;
                    }
                } else if (j < 1000) {
                    i = 3;
                } else {
                    i = 4;
                }
            } else if (j < 1000000) {
                if (j < 100000) {
                    i = 5;
                } else {
                    i = 6;
                }
            } else if (j < 10000000) {
                i = 7;
            } else {
                i = 8;
            }
        } else if (j < 1000000000000L) {
            if (j < 10000000000L) {
                if (j < 1000000000) {
                    i = 9;
                } else {
                    i = 10;
                }
            } else if (j < 100000000000L) {
                i = 11;
            } else {
                i = 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i = 13;
            } else if (j < 100000000000000L) {
                i = 14;
            } else {
                i = 15;
            }
        } else if (j < 100000000000000000L) {
            if (j < 10000000000000000L) {
                i = 16;
            } else {
                i = 17;
            }
        } else if (j < 1000000000000000000L) {
            i = 18;
        } else {
            i = 19;
        }
        if (z) {
            i++;
        }
        C89443v j2 = mo143834j(i);
        byte[] bArr = j2.f203131a;
        int i2 = j2.f203133c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = f203089d[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        j2.f203133c += i;
        this.f203091b += (long) i;
        return this;
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: a */
    public final long mo143798a(AbstractC89447y yVar) {
        C89219l.m154719c(yVar, "");
        long j = this.f203091b;
        if (j > 0) {
            yVar.mo22060a(this, j);
        }
        return j;
    }

    /* renamed from: a */
    public final C89422b mo143800a(C89422b bVar) {
        C89219l.m154719c(bVar, "");
        if (bVar.f203092a == null) {
            bVar.f203092a = this;
            bVar.f203093b = true;
            return bVar;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    /* renamed from: a */
    private String m155014a(long j, Charset charset) {
        C89219l.m154719c(charset, "");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException("byteCount: ".concat(String.valueOf(j)).toString());
        } else if (this.f203091b < j) {
            throw new EOFException();
        } else if (j == 0) {
            return "";
        } else {
            C89443v vVar = this.f203090a;
            if (vVar == null) {
                C89219l.m154707a();
            }
            if (((long) vVar.f203132b) + j > ((long) vVar.f203133c)) {
                return new String(mo143836k(j), charset);
            }
            int i = (int) j;
            String str = new String(vVar.f203131a, vVar.f203132b, i, charset);
            vVar.f203132b += i;
            this.f203091b -= j;
            if (vVar.f203132b == vVar.f203133c) {
                this.f203090a = vVar.mo143952c();
                C89445w.m155223a(vVar);
            }
            return str;
        }
    }

    @Override // p4632k.AbstractC89408aa
    public final long read(C89420f fVar, long j) {
        C89219l.m154719c(fVar, "");
        if (j >= 0) {
            long j2 = this.f203091b;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            fVar.mo22060a(this, j);
            return j;
        }
        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)).toString());
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: b */
    public final void mo143807b(C89420f fVar, long j) {
        C89219l.m154719c(fVar, "");
        long j2 = this.f203091b;
        if (j2 >= j) {
            fVar.mo22060a(this, j);
        } else {
            fVar.mo22060a(this, j2);
            throw new EOFException();
        }
    }

    /* renamed from: a */
    public final long mo143797a(C89427i iVar, long j) {
        C89219l.m154719c(iVar, "");
        if (iVar.size() > 0) {
            long j2 = 0;
            if (j >= 0) {
                C89443v vVar = this.f203090a;
                long j3 = -1;
                if (vVar == null) {
                    return -1;
                }
                long j4 = this.f203091b;
                if (j4 - j < j) {
                    while (j4 > j) {
                        vVar = vVar.f203137g;
                        if (vVar == null) {
                            C89219l.m154707a();
                        }
                        j4 -= (long) (vVar.f203133c - vVar.f203132b);
                    }
                    byte b = iVar.getByte(0);
                    int size = iVar.size();
                    long j5 = (this.f203091b - ((long) size)) + 1;
                    while (j4 < j5) {
                        byte[] bArr = vVar.f203131a;
                        int min = (int) Math.min((long) vVar.f203133c, (((long) vVar.f203132b) + j5) - j4);
                        for (int i = (int) ((((long) vVar.f203132b) + j) - j4); i < min; i++) {
                            if (bArr[i] == b && m155015a(vVar, i + 1, iVar.internalArray$jvm(), size)) {
                                return ((long) (i - vVar.f203132b)) + j4;
                            }
                        }
                        j4 += (long) (vVar.f203133c - vVar.f203132b);
                        vVar = vVar.f203136f;
                        if (vVar == null) {
                            C89219l.m154707a();
                        }
                        j = j4;
                        j3 = -1;
                    }
                    return j3;
                }
                while (true) {
                    long j6 = ((long) (vVar.f203133c - vVar.f203132b)) + j2;
                    if (j6 > j) {
                        break;
                    }
                    vVar = vVar.f203136f;
                    if (vVar == null) {
                        C89219l.m154707a();
                    }
                    j2 = j6;
                }
                byte b2 = iVar.getByte(0);
                int size2 = iVar.size();
                long j7 = (this.f203091b - ((long) size2)) + 1;
                while (j2 < j7) {
                    byte[] bArr2 = vVar.f203131a;
                    int min2 = (int) Math.min((long) vVar.f203133c, (((long) vVar.f203132b) + j7) - j2);
                    for (int i2 = (int) ((((long) vVar.f203132b) + j) - j2); i2 < min2; i2++) {
                        if (bArr2[i2] == b2 && m155015a(vVar, i2 + 1, iVar.internalArray$jvm(), size2)) {
                            return ((long) (i2 - vVar.f203132b)) + j2;
                        }
                    }
                    j2 += (long) (vVar.f203133c - vVar.f203132b);
                    vVar = vVar.f203136f;
                    if (vVar == null) {
                        C89219l.m154707a();
                    }
                    j = j2;
                }
                return -1;
            }
            throw new IllegalArgumentException("fromIndex < 0: ".concat(String.valueOf(j)).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    /* renamed from: b */
    public final int mo143804b(byte[] bArr, int i, int i2) {
        C89219l.m154719c(bArr, "");
        C89413c.m155000a((long) bArr.length, (long) i, (long) i2);
        C89443v vVar = this.f203090a;
        if (vVar == null) {
            return -1;
        }
        int min = Math.min(i2, vVar.f203133c - vVar.f203132b);
        System.arraycopy(vVar.f203131a, vVar.f203132b, bArr, i, min);
        vVar.f203132b += min;
        this.f203091b -= (long) min;
        if (vVar.f203132b == vVar.f203133c) {
            this.f203090a = vVar.mo143952c();
            C89445w.m155223a(vVar);
        }
        return min;
    }

    /* renamed from: c */
    public final C89420f mo68852a(byte[] bArr, int i, int i2) {
        C89219l.m154719c(bArr, "");
        long j = (long) i2;
        C89413c.m155000a((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C89443v j2 = mo143834j(1);
            int min = Math.min(i3 - i, 8192 - j2.f203133c);
            System.arraycopy(bArr, i, j2.f203131a, j2.f203133c, min);
            i += min;
            j2.f203133c += min;
        }
        this.f203091b += j;
        return this;
    }

    /* renamed from: a */
    public final long mo143796a(byte b, long j, long j2) {
        C89443v vVar;
        long j3 = 0;
        if (0 <= j && j2 >= j) {
            long j4 = this.f203091b;
            if (j2 > j4) {
                j2 = j4;
            }
            if (j == j2 || (vVar = this.f203090a) == null) {
                return -1;
            }
            if (j4 - j < j) {
                while (j4 > j) {
                    vVar = vVar.f203137g;
                    if (vVar == null) {
                        C89219l.m154707a();
                    }
                    j4 -= (long) (vVar.f203133c - vVar.f203132b);
                }
                while (j4 < j2) {
                    byte[] bArr = vVar.f203131a;
                    int min = (int) Math.min((long) vVar.f203133c, (((long) vVar.f203132b) + j2) - j4);
                    for (int i = (int) ((((long) vVar.f203132b) + j) - j4); i < min; i++) {
                        if (bArr[i] == b) {
                            return ((long) (i - vVar.f203132b)) + j4;
                        }
                    }
                    j4 += (long) (vVar.f203133c - vVar.f203132b);
                    vVar = vVar.f203136f;
                    if (vVar == null) {
                        C89219l.m154707a();
                    }
                    j = j4;
                }
                return -1;
            }
            while (true) {
                long j5 = ((long) (vVar.f203133c - vVar.f203132b)) + j3;
                if (j5 > j) {
                    break;
                }
                vVar = vVar.f203136f;
                if (vVar == null) {
                    C89219l.m154707a();
                }
                j3 = j5;
            }
            while (j3 < j2) {
                byte[] bArr2 = vVar.f203131a;
                int min2 = (int) Math.min((long) vVar.f203133c, (((long) vVar.f203132b) + j2) - j3);
                for (int i2 = (int) ((((long) vVar.f203132b) + j) - j3); i2 < min2; i2++) {
                    if (bArr2[i2] == b) {
                        return ((long) (i2 - vVar.f203132b)) + j3;
                    }
                }
                j3 += (long) (vVar.f203133c - vVar.f203132b);
                vVar = vVar.f203136f;
                if (vVar == null) {
                    C89219l.m154707a();
                }
                j = j3;
            }
            return -1;
        }
        throw new IllegalArgumentException(("size=" + this.f203091b + " fromIndex=" + j + " toIndex=" + j2).toString());
    }

    /* renamed from: a */
    private static boolean m155015a(C89443v vVar, int i, byte[] bArr, int i2) {
        int i3 = vVar.f203133c;
        byte[] bArr2 = vVar.f203131a;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                vVar = vVar.f203136f;
                if (vVar == null) {
                    C89219l.m154707a();
                }
                bArr2 = vVar.f203131a;
                i = vVar.f203132b;
                i3 = vVar.f203133c;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
