package p4632k;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: k.u */
public final class C89441u implements AbstractC89426h {

    /* renamed from: a */
    public boolean f203126a;

    /* renamed from: b */
    public final C89420f f203127b = new C89420f();

    /* renamed from: c */
    public final AbstractC89408aa f203128c;

    static {
        Covode.recordClassIndex(105525);
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: a */
    public final C89420f mo68846a() {
        return this.f203127b;
    }

    /* renamed from: k.u$a */
    public static final class C89442a extends InputStream {

        /* renamed from: a */
        final /* synthetic */ C89441u f203129a;

        static {
            Covode.recordClassIndex(105526);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
        public final void close() {
            this.f203129a.close();
        }

        @Override // java.io.InputStream
        public final int available() {
            if (!this.f203129a.f203126a) {
                return (int) Math.min(this.f203129a.f203127b.f203091b, 2147483647L);
            }
            throw new IOException("closed");
        }

        public final String toString() {
            return this.f203129a + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read() {
            if (this.f203129a.f203126a) {
                throw new IOException("closed");
            } else if (this.f203129a.f203127b.f203091b == 0 && this.f203129a.f203128c.read(this.f203129a.f203127b, 8192) == -1) {
                return -1;
            } else {
                return this.f203129a.f203127b.mo143824h() & 255;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C89442a(C89441u uVar) {
            this.f203129a = uVar;
            MethodCollector.m26663i(3570);
            MethodCollector.m26664o(3570);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            C89219l.m154719c(bArr, "");
            if (!this.f203129a.f203126a) {
                C89413c.m155000a((long) bArr.length, (long) i, (long) i2);
                if (this.f203129a.f203127b.f203091b == 0 && this.f203129a.f203128c.read(this.f203129a.f203127b, 8192) == -1) {
                    return -1;
                }
                return this.f203129a.f203127b.mo143804b(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: f */
    public final InputStream mo143819f() {
        return new C89442a(this);
    }

    public final boolean isOpen() {
        if (!this.f203126a) {
            return true;
        }
        return false;
    }

    @Override // p4632k.AbstractC89408aa
    public final C89409ab timeout() {
        return this.f203128c.timeout();
    }

    /* renamed from: b */
    public final long mo143938b() {
        return m155187a((byte) 0, Long.MAX_VALUE);
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: h */
    public final byte mo143824h() {
        mo143813d(1);
        return this.f203127b.mo143824h();
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: i */
    public final short mo143830i() {
        mo143813d(2);
        return this.f203127b.mo143830i();
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: j */
    public final int mo143832j() {
        mo143813d(4);
        return this.f203127b.mo143832j();
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: k */
    public final long mo143835k() {
        mo143813d(8);
        return this.f203127b.mo143835k();
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: m */
    public final int mo143839m() {
        mo143813d(4);
        return C89413c.m154998a(this.f203127b.mo143832j());
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: n */
    public final long mo143841n() {
        mo143813d(8);
        return C89413c.m154999a(this.f203127b.mo143835k());
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: r */
    public final String mo143848r() {
        this.f203127b.mo68845a(this.f203128c);
        return this.f203127b.mo143848r();
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: s */
    public final String mo143850s() {
        return mo143828i(Long.MAX_VALUE);
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: u */
    public final byte[] mo143853u() {
        this.f203127b.mo68845a(this.f203128c);
        return this.f203127b.mo143853u();
    }

    @Override // p4632k.AbstractC89408aa, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.f203126a) {
            this.f203126a = true;
            this.f203128c.close();
            this.f203127b.mo143854v();
        }
    }

    public final String toString() {
        return "buffer(" + this.f203128c + ')';
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: e */
    public final boolean mo143815e() {
        if (!(!this.f203126a)) {
            throw new IllegalStateException("closed".toString());
        } else if (!this.f203127b.mo143815e() || this.f203128c.read(this.f203127b, 8192) != -1) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r3 == 0) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        r1 = com.C1764a.m5928a("Expected leading [0-9] or '-' character but was %#x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(r7)}, 1));
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r1, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        throw new java.lang.NumberFormatException(r1);
     */
    @Override // p4632k.AbstractC89426h
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo143843o() {
        /*
            r10 = this;
            r5 = 1
            r10.mo143813d(r5)
            r8 = 0
            r3 = 0
        L_0x0009:
            long r1 = r3 + r5
            boolean r0 = r10.mo143816e(r1)
            if (r0 == 0) goto L_0x002b
            k.f r0 = r10.f203127b
            byte r7 = r0.mo143818f(r3)
            r0 = 48
            if (r7 < r0) goto L_0x001f
            r0 = 57
            if (r7 <= r0) goto L_0x0032
        L_0x001f:
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0027
            r0 = 45
            if (r7 == r0) goto L_0x0032
        L_0x0027:
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0034
        L_0x002b:
            k.f r0 = r10.f203127b
            long r0 = r0.mo143843o()
            return r0
        L_0x0032:
            r3 = r1
            goto L_0x0009
        L_0x0034:
            java.lang.NumberFormatException r4 = new java.lang.NumberFormatException
            r3 = 1
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r1 = 0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r7)
            r2[r1] = r0
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String r0 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r1 = com.C1764a.m5928a(r0, r1)
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154709a(r1, r0)
            r4.<init>(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p4632k.C89441u.mo143843o():long");
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: p */
    public final long mo143845p() {
        mo143813d(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!mo143816e((long) i2)) {
                break;
            }
            byte f = this.f203127b.mo143818f((long) i);
            if ((f >= 48 && f <= 57) || ((f >= 97 && f <= 102) || (f >= 65 && f <= 70))) {
                i = i2;
            } else if (i == 0) {
                String a = C1764a.m5928a("Expected leading [0-9a-fA-F] character but was %#x", Arrays.copyOf(new Object[]{Byte.valueOf(f)}, 1));
                C89219l.m154709a((Object) a, "");
                throw new NumberFormatException(a);
            }
        }
        return this.f203127b.mo143845p();
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: d */
    public final void mo143813d(long j) {
        if (!mo143816e(j)) {
            throw new EOFException();
        }
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: g */
    public final C89427i mo143823g(long j) {
        mo143813d(j);
        return this.f203127b.mo143823g(j);
    }

    public C89441u(AbstractC89408aa aaVar) {
        C89219l.m154719c(aaVar, "");
        this.f203128c = aaVar;
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: a */
    public final String mo143799a(Charset charset) {
        C89219l.m154719c(charset, "");
        this.f203127b.mo68845a(this.f203128c);
        return this.f203127b.mo143799a(charset);
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: h */
    public final String mo143825h(long j) {
        mo143813d(j);
        return this.f203127b.mo143825h(j);
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: k */
    public final byte[] mo143836k(long j) {
        mo143813d(j);
        return this.f203127b.mo143836k(j);
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: a */
    public final long mo143798a(AbstractC89447y yVar) {
        C89219l.m154719c(yVar, "");
        long j = 0;
        while (this.f203128c.read(this.f203127b, 8192) != -1) {
            long g = this.f203127b.mo143821g();
            if (g > 0) {
                j += g;
                yVar.mo22060a(this.f203127b, g);
            }
        }
        if (this.f203127b.f203091b <= 0) {
            return j;
        }
        long j2 = j + this.f203127b.f203091b;
        C89420f fVar = this.f203127b;
        yVar.mo22060a(fVar, fVar.f203091b);
        return j2;
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: b */
    public final void mo143808b(byte[] bArr) {
        C89219l.m154719c(bArr, "");
        try {
            mo143813d((long) bArr.length);
            this.f203127b.mo143808b(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.f203127b.f203091b > 0) {
                C89420f fVar = this.f203127b;
                int b = fVar.mo143804b(bArr, i, (int) fVar.f203091b);
                if (b != -1) {
                    i += b;
                } else {
                    throw new AssertionError();
                }
            }
            throw e;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C89219l.m154719c(byteBuffer, "");
        if (this.f203127b.f203091b == 0 && this.f203128c.read(this.f203127b, 8192) == -1) {
            return -1;
        }
        return this.f203127b.read(byteBuffer);
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: c */
    public final boolean mo143811c(C89427i iVar) {
        C89219l.m154719c(iVar, "");
        int size = iVar.size();
        C89219l.m154719c(iVar, "");
        if (!(!this.f203126a)) {
            throw new IllegalStateException("closed".toString());
        } else if (size < 0 || iVar.size() - 0 < size) {
            return false;
        } else {
            for (int i = 0; i < size; i++) {
                long j = ((long) i) + 0;
                if (!(mo143816e(1 + j) && this.f203127b.mo143818f(j) == iVar.getByte(i + 0))) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: e */
    public final boolean mo143816e(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)).toString());
        } else if (!this.f203126a) {
            while (this.f203127b.f203091b < j) {
                if (this.f203128c.read(this.f203127b, 8192) == -1) {
                    return false;
                }
            }
            return true;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: l */
    public final void mo143838l(long j) {
        if (!this.f203126a) {
            while (j > 0) {
                if (this.f203127b.f203091b == 0 && this.f203128c.read(this.f203127b, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f203127b.f203091b);
                this.f203127b.mo143838l(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: i */
    public final String mo143828i(long j) {
        long j2;
        if (j >= 0) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            long a = m155187a((byte) 10, j2);
            if (a != -1) {
                return this.f203127b.mo143833j(a);
            }
            if (j2 < Long.MAX_VALUE && mo143816e(j2) && this.f203127b.mo143818f(j2 - 1) == 13 && mo143816e(1 + j2) && this.f203127b.mo143818f(j2) == 10) {
                return this.f203127b.mo143833j(j2);
            }
            C89420f fVar = new C89420f();
            C89420f fVar2 = this.f203127b;
            fVar2.mo143803a(fVar, 0, Math.min(32L, fVar2.f203091b));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f203127b.f203091b, j) + " content=" + fVar.mo143847q().hex() + "…");
        }
        throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j)).toString());
    }

    @Override // p4632k.AbstractC89426h
    /* renamed from: b */
    public final void mo143807b(C89420f fVar, long j) {
        C89219l.m154719c(fVar, "");
        try {
            mo143813d(j);
            this.f203127b.mo143807b(fVar, j);
        } catch (EOFException e) {
            fVar.mo68845a((AbstractC89408aa) this.f203127b);
            throw e;
        }
    }

    /* renamed from: a */
    private long m155187a(byte b, long j) {
        if (!this.f203126a) {
            long j2 = 0;
            if (j >= 0) {
                while (j2 < j) {
                    long a = this.f203127b.mo143796a(b, j2, j);
                    if (a == -1) {
                        long j3 = this.f203127b.f203091b;
                        if (j3 >= j || this.f203128c.read(this.f203127b, 8192) == -1) {
                            break;
                        }
                        j2 = Math.max(j2, j3);
                    } else {
                        return a;
                    }
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // p4632k.AbstractC89408aa
    public final long read(C89420f fVar, long j) {
        C89219l.m154719c(fVar, "");
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)).toString());
        } else if (!(true ^ this.f203126a)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.f203127b.f203091b == 0 && this.f203128c.read(this.f203127b, 8192) == -1) {
            return -1;
        } else {
            return this.f203127b.read(fVar, Math.min(j, this.f203127b.f203091b));
        }
    }
}
