package p4632k;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: k.n */
public final class C89433n implements AbstractC89408aa {

    /* renamed from: a */
    private byte f203109a;

    /* renamed from: b */
    private final C89441u f203110b;

    /* renamed from: c */
    private final Inflater f203111c;

    /* renamed from: d */
    private final C89434o f203112d;

    /* renamed from: e */
    private final CRC32 f203113e = new CRC32();

    static {
        Covode.recordClassIndex(105517);
    }

    @Override // p4632k.AbstractC89408aa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f203112d.close();
    }

    @Override // p4632k.AbstractC89408aa
    public final C89409ab timeout() {
        return this.f203110b.timeout();
    }

    public C89433n(AbstractC89408aa aaVar) {
        C89219l.m154719c(aaVar, "");
        C89441u uVar = new C89441u(aaVar);
        this.f203110b = uVar;
        Inflater inflater = new Inflater(true);
        this.f203111c = inflater;
        this.f203112d = new C89434o((AbstractC89426h) uVar, inflater);
    }

    @Override // p4632k.AbstractC89408aa
    public final long read(C89420f fVar, long j) {
        boolean z;
        boolean z2;
        C89219l.m154719c(fVar, "");
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)).toString());
        } else if (j == 0) {
            return 0;
        } else {
            if (this.f203109a == 0) {
                this.f203110b.mo143813d(10);
                byte f = this.f203110b.f203127b.mo143818f(3L);
                if (((f >> 1) & 1) == 1) {
                    z = true;
                    m155155a(this.f203110b.f203127b, 0, 10);
                } else {
                    z = false;
                }
                m155154a("ID1ID2", 8075, this.f203110b.mo143830i());
                this.f203110b.mo143838l(8);
                if (((f >> 2) & 1) == 1 && 1 != 0) {
                    this.f203110b.mo143813d(2);
                    if (z) {
                        m155155a(this.f203110b.f203127b, 0, 2);
                    }
                    long l = (long) this.f203110b.f203127b.mo143837l();
                    this.f203110b.mo143813d(l);
                    if (z) {
                        m155155a(this.f203110b.f203127b, 0, l);
                    }
                    this.f203110b.mo143838l(l);
                }
                if (((f >> 3) & 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    long b = this.f203110b.mo143938b();
                    if (b != -1) {
                        if (z) {
                            m155155a(this.f203110b.f203127b, 0, b + 1);
                        }
                        this.f203110b.mo143838l(b + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((f >> 4) & 1) == 1) {
                    long b2 = this.f203110b.mo143938b();
                    if (b2 != -1) {
                        if (z) {
                            m155155a(this.f203110b.f203127b, 0, b2 + 1);
                        }
                        this.f203110b.mo143838l(b2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z) {
                    C89441u uVar = this.f203110b;
                    uVar.mo143813d(2);
                    m155154a("FHCRC", uVar.f203127b.mo143837l(), (short) ((int) this.f203113e.getValue()));
                    this.f203113e.reset();
                }
                this.f203109a = 1;
            }
            if (this.f203109a == 1) {
                long j2 = fVar.f203091b;
                long read = this.f203112d.read(fVar, j);
                if (read != -1) {
                    m155155a(fVar, j2, read);
                    return read;
                }
                this.f203109a = 2;
            }
            if (this.f203109a == 2) {
                m155154a("CRC", this.f203110b.mo143839m(), (int) this.f203113e.getValue());
                m155154a("ISIZE", this.f203110b.mo143839m(), (int) this.f203111c.getBytesWritten());
                this.f203109a = 3;
                if (!this.f203110b.mo143815e()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    private static void m155154a(String str, int i, int i2) {
        if (i2 != i) {
            String a = C1764a.m5928a("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
            C89219l.m154709a((Object) a, "");
            throw new IOException(a);
        }
    }

    /* renamed from: a */
    private final void m155155a(C89420f fVar, long j, long j2) {
        C89443v vVar = fVar.f203090a;
        if (vVar == null) {
            C89219l.m154707a();
        }
        while (j >= ((long) (vVar.f203133c - vVar.f203132b))) {
            j -= (long) (vVar.f203133c - vVar.f203132b);
            vVar = vVar.f203136f;
            if (vVar == null) {
                C89219l.m154707a();
            }
        }
        while (j2 > 0) {
            int i = (int) (((long) vVar.f203132b) + j);
            int min = (int) Math.min((long) (vVar.f203133c - i), j2);
            this.f203113e.update(vVar.f203131a, i, min);
            j2 -= (long) min;
            vVar = vVar.f203136f;
            if (vVar == null) {
                C89219l.m154707a();
            }
            j = 0;
        }
    }
}
