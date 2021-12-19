package okhttp3.internal.p4662j;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;
import p4632k.AbstractC89425g;
import p4632k.AbstractC89447y;
import p4632k.C89409ab;
import p4632k.C89420f;
import p4632k.C89427i;

/* access modifiers changed from: package-private */
/* renamed from: okhttp3.internal.j.d */
public final class C90178d {

    /* renamed from: a */
    final boolean f204774a;

    /* renamed from: b */
    final Random f204775b;

    /* renamed from: c */
    final AbstractC89425g f204776c;

    /* renamed from: d */
    final C89420f f204777d;

    /* renamed from: e */
    boolean f204778e;

    /* renamed from: f */
    final C89420f f204779f = new C89420f();

    /* renamed from: g */
    final C90179a f204780g = new C90179a();

    /* renamed from: h */
    boolean f204781h;

    /* renamed from: i */
    private final byte[] f204782i;

    /* renamed from: j */
    private final C89420f.C89422b f204783j;

    static {
        Covode.recordClassIndex(106350);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: okhttp3.internal.j.d$a */
    public final class C90179a implements AbstractC89447y {

        /* renamed from: a */
        int f204784a;

        /* renamed from: b */
        long f204785b;

        /* renamed from: c */
        boolean f204786c;

        /* renamed from: d */
        boolean f204787d;

        static {
            Covode.recordClassIndex(106351);
        }

        @Override // p4632k.AbstractC89447y
        public final C89409ab timeout() {
            return C90178d.this.f204776c.timeout();
        }

        @Override // p4632k.AbstractC89447y, java.io.Flushable
        public final void flush() {
            if (!this.f204787d) {
                C90178d dVar = C90178d.this;
                dVar.mo144992a(this.f204784a, dVar.f204779f.f203091b, this.f204786c, false);
                this.f204786c = false;
                return;
            }
            throw new IOException("closed");
        }

        @Override // p4632k.AbstractC89447y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!this.f204787d) {
                C90178d dVar = C90178d.this;
                dVar.mo144992a(this.f204784a, dVar.f204779f.f203091b, this.f204786c, true);
                this.f204787d = true;
                C90178d.this.f204781h = false;
                return;
            }
            throw new IOException("closed");
        }

        C90179a() {
        }

        @Override // p4632k.AbstractC89447y
        /* renamed from: a */
        public final void mo22060a(C89420f fVar, long j) {
            boolean z;
            if (!this.f204787d) {
                C90178d.this.f204779f.mo22060a(fVar, j);
                if (!this.f204786c || this.f204785b == -1 || C90178d.this.f204779f.f203091b <= this.f204785b - 8192) {
                    z = false;
                } else {
                    z = true;
                }
                long g = C90178d.this.f204779f.mo143821g();
                if (g > 0 && !z) {
                    C90178d.this.mo144992a(this.f204784a, g, this.f204786c, false);
                    this.f204786c = false;
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo144993a(int i, C89427i iVar) {
        if (!this.f204778e) {
            int size = iVar.size();
            if (((long) size) <= 125) {
                this.f204777d.mo68847a(i | 128);
                if (this.f204774a) {
                    this.f204777d.mo68847a(size | 128);
                    this.f204775b.nextBytes(this.f204782i);
                    this.f204777d.mo68851a(this.f204782i);
                    if (size > 0) {
                        long j = this.f204777d.f203091b;
                        this.f204777d.mo68850a(iVar);
                        this.f204777d.mo143800a(this.f204783j);
                        this.f204783j.mo143859a(j);
                        C90175b.m156720a(this.f204783j, this.f204782i);
                        this.f204783j.close();
                    }
                } else {
                    this.f204777d.mo68847a(size);
                    this.f204777d.mo68850a(iVar);
                }
                this.f204776c.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    C90178d(boolean z, AbstractC89425g gVar, Random random) {
        byte[] bArr;
        Objects.requireNonNull(gVar, "sink == null");
        Objects.requireNonNull(random, "random == null");
        this.f204774a = z;
        this.f204776c = gVar;
        this.f204777d = gVar.mo68846a();
        this.f204775b = random;
        C89420f.C89422b bVar = null;
        if (z) {
            bArr = new byte[4];
        } else {
            bArr = null;
        }
        this.f204782i = bArr;
        this.f204783j = z ? new C89420f.C89422b() : bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo144992a(int i, long j, boolean z, boolean z2) {
        if (!this.f204778e) {
            int i2 = 0;
            if (!z) {
                i = 0;
            }
            if (z2) {
                i |= 128;
            }
            this.f204777d.mo68847a(i);
            if (this.f204774a) {
                i2 = 128;
            }
            if (j <= 125) {
                this.f204777d.mo68847a(((int) j) | i2);
            } else if (j <= 65535) {
                this.f204777d.mo68847a(i2 | 126);
                this.f204777d.mo68854b((int) j);
            } else {
                this.f204777d.mo68847a(i2 | 127);
                this.f204777d.mo143840m(j);
            }
            if (this.f204774a) {
                this.f204775b.nextBytes(this.f204782i);
                this.f204777d.mo68851a(this.f204782i);
                if (j > 0) {
                    long j2 = this.f204777d.f203091b;
                    this.f204777d.mo22060a(this.f204779f, j);
                    this.f204777d.mo143800a(this.f204783j);
                    this.f204783j.mo143859a(j2);
                    C90175b.m156720a(this.f204783j, this.f204782i);
                    this.f204783j.close();
                }
            } else {
                this.f204777d.mo22060a(this.f204779f, j);
            }
            this.f204776c.mo68856c();
            return;
        }
        throw new IOException("closed");
    }
}
