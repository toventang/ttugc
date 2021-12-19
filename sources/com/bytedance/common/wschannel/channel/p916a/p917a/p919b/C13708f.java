package com.bytedance.common.wschannel.channel.p916a.p917a.p919b;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;
import p4632k.AbstractC89425g;
import p4632k.AbstractC89447y;
import p4632k.C89409ab;
import p4632k.C89420f;
import p4632k.C89427i;

/* renamed from: com.bytedance.common.wschannel.channel.a.a.b.f */
final class C13708f {

    /* renamed from: a */
    final boolean f33315a;

    /* renamed from: b */
    final Random f33316b;

    /* renamed from: c */
    final AbstractC89425g f33317c;

    /* renamed from: d */
    final C89420f f33318d;

    /* renamed from: e */
    boolean f33319e;

    /* renamed from: f */
    final C89420f f33320f = new C89420f();

    /* renamed from: g */
    final C13709a f33321g = new C13709a();

    /* renamed from: h */
    boolean f33322h;

    /* renamed from: i */
    private final byte[] f33323i;

    /* renamed from: j */
    private final C89420f.C89422b f33324j;

    static {
        Covode.recordClassIndex(15742);
    }

    /* renamed from: com.bytedance.common.wschannel.channel.a.a.b.f$a */
    final class C13709a implements AbstractC89447y {

        /* renamed from: a */
        int f33325a;

        /* renamed from: b */
        long f33326b;

        /* renamed from: c */
        boolean f33327c;

        /* renamed from: d */
        boolean f33328d;

        static {
            Covode.recordClassIndex(15743);
        }

        @Override // p4632k.AbstractC89447y
        public final C89409ab timeout() {
            return C13708f.this.f33317c.timeout();
        }

        @Override // p4632k.AbstractC89447y, java.io.Flushable
        public final void flush() {
            if (!this.f33328d) {
                C13708f fVar = C13708f.this;
                fVar.mo22058a(this.f33325a, fVar.f33320f.f203091b, this.f33327c, false);
                this.f33327c = false;
                return;
            }
            throw new IOException("closed");
        }

        @Override // p4632k.AbstractC89447y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!this.f33328d) {
                C13708f fVar = C13708f.this;
                fVar.mo22058a(this.f33325a, fVar.f33320f.f203091b, this.f33327c, true);
                this.f33328d = true;
                C13708f.this.f33322h = false;
                return;
            }
            throw new IOException("closed");
        }

        C13709a() {
        }

        @Override // p4632k.AbstractC89447y
        /* renamed from: a */
        public final void mo22060a(C89420f fVar, long j) {
            boolean z;
            if (!this.f33328d) {
                C13708f.this.f33320f.mo22060a(fVar, j);
                if (!this.f33327c || this.f33326b == -1 || C13708f.this.f33320f.f203091b <= this.f33326b - 8192) {
                    z = false;
                } else {
                    z = true;
                }
                long g = C13708f.this.f33320f.mo143821g();
                if (g > 0 && !z) {
                    C13708f.this.mo22058a(this.f33325a, g, this.f33327c, false);
                    this.f33327c = false;
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22059a(int i, C89427i iVar) {
        if (!this.f33319e) {
            int size = iVar.size();
            if (((long) size) <= 125) {
                this.f33318d.mo68847a(i | 128);
                if (this.f33315a) {
                    this.f33318d.mo68847a(size | 128);
                    this.f33316b.nextBytes(this.f33323i);
                    this.f33318d.mo68851a(this.f33323i);
                    if (size > 0) {
                        long j = this.f33318d.f203091b;
                        this.f33318d.mo68850a(iVar);
                        this.f33318d.mo143800a(this.f33324j);
                        this.f33324j.mo143859a(j);
                        C13705d.m24688a(this.f33324j, this.f33323i);
                        this.f33324j.close();
                    }
                } else {
                    this.f33318d.mo68847a(size);
                    this.f33318d.mo68850a(iVar);
                }
                this.f33317c.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    C13708f(boolean z, AbstractC89425g gVar, Random random) {
        byte[] bArr;
        Objects.requireNonNull(gVar, "sink == null");
        Objects.requireNonNull(random, "random == null");
        this.f33315a = z;
        this.f33317c = gVar;
        this.f33318d = gVar.mo68846a();
        this.f33316b = random;
        C89420f.C89422b bVar = null;
        if (z) {
            bArr = new byte[4];
        } else {
            bArr = null;
        }
        this.f33323i = bArr;
        this.f33324j = z ? new C89420f.C89422b() : bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22058a(int i, long j, boolean z, boolean z2) {
        if (!this.f33319e) {
            int i2 = 0;
            if (!z) {
                i = 0;
            }
            if (z2) {
                i |= 128;
            }
            this.f33318d.mo68847a(i);
            if (this.f33315a) {
                i2 = 128;
            }
            if (j <= 125) {
                this.f33318d.mo68847a(((int) j) | i2);
            } else if (j <= 65535) {
                this.f33318d.mo68847a(i2 | 126);
                this.f33318d.mo68854b((int) j);
            } else {
                this.f33318d.mo68847a(i2 | 127);
                this.f33318d.mo143840m(j);
            }
            if (this.f33315a) {
                this.f33316b.nextBytes(this.f33323i);
                this.f33318d.mo68851a(this.f33323i);
                if (j > 0) {
                    long j2 = this.f33318d.f203091b;
                    this.f33318d.mo22060a(this.f33320f, j);
                    this.f33318d.mo143800a(this.f33324j);
                    this.f33324j.mo143859a(j2);
                    C13705d.m24688a(this.f33324j, this.f33323i);
                    this.f33324j.close();
                }
            } else {
                this.f33318d.mo22060a(this.f33320f, j);
            }
            this.f33317c.mo68856c();
            return;
        }
        throw new IOException("closed");
    }
}
