package com.squareup.p2075a.p2076a.p2078b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.p2075a.AbstractC29251y;
import com.squareup.p2075a.C29235p;
import com.squareup.p2075a.C29246v;
import com.squareup.p2075a.C29249x;
import com.squareup.p2075a.p2076a.AbstractC29190d;
import com.squareup.p2075a.p2076a.C29206j;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import p4632k.AbstractC89408aa;
import p4632k.AbstractC89425g;
import p4632k.AbstractC89426h;
import p4632k.AbstractC89447y;
import p4632k.C89409ab;
import p4632k.C89420f;
import p4632k.C89432m;
import p4632k.C89436q;

/* renamed from: com.squareup.a.a.b.e */
public final class C29159e implements AbstractC29175j {

    /* renamed from: a */
    public final C29185s f69020a;

    /* renamed from: b */
    public final AbstractC89426h f69021b;

    /* renamed from: c */
    public final AbstractC89425g f69022c;

    /* renamed from: d */
    public int f69023d;

    /* renamed from: e */
    private C29170h f69024e;

    static {
        Covode.recordClassIndex(35508);
    }

    /* renamed from: com.squareup.a.a.b.e$a */
    abstract class AbstractC29160a implements AbstractC89408aa {

        /* renamed from: a */
        protected final C89432m f69025a;

        /* renamed from: b */
        protected boolean f69026b;

        static {
            Covode.recordClassIndex(35509);
        }

        @Override // p4632k.AbstractC89408aa
        public C89409ab timeout() {
            return this.f69025a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo50869a() {
            if (C29159e.this.f69023d == 5) {
                C29159e.m58271a(this.f69025a);
                C29159e.this.f69023d = 6;
                if (C29159e.this.f69020a != null) {
                    C29159e.this.f69020a.mo50891a(C29159e.this);
                    return;
                }
                return;
            }
            throw new IllegalStateException("state: " + C29159e.this.f69023d);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo50870b() {
            if (C29159e.this.f69023d != 6) {
                C29159e.this.f69023d = 6;
                if (C29159e.this.f69020a != null) {
                    C29159e.this.f69020a.mo50894a(true, false, false);
                    C29159e.this.f69020a.mo50891a(C29159e.this);
                }
            }
        }

        private AbstractC29160a() {
            this.f69025a = new C89432m(C29159e.this.f69021b.timeout());
        }

        /* synthetic */ AbstractC29160a(C29159e eVar, byte b) {
            this();
        }
    }

    /* renamed from: com.squareup.a.a.b.e$b */
    final class C29161b implements AbstractC89447y {

        /* renamed from: b */
        private final C89432m f69029b;

        /* renamed from: c */
        private boolean f69030c;

        static {
            Covode.recordClassIndex(35510);
        }

        @Override // p4632k.AbstractC89447y
        public final C89409ab timeout() {
            return this.f69029b;
        }

        @Override // p4632k.AbstractC89447y, java.io.Flushable
        public final synchronized void flush() {
            MethodCollector.m26663i(125);
            if (this.f69030c) {
                MethodCollector.m26664o(125);
                return;
            }
            C29159e.this.f69022c.flush();
            MethodCollector.m26664o(125);
        }

        @Override // p4632k.AbstractC89447y, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            MethodCollector.m26663i(130);
            if (this.f69030c) {
                MethodCollector.m26664o(130);
                return;
            }
            this.f69030c = true;
            C29159e.this.f69022c.mo68849a("0\r\n\r\n");
            C29159e.m58271a(this.f69029b);
            C29159e.this.f69023d = 3;
            MethodCollector.m26664o(130);
        }

        private C29161b() {
            this.f69029b = new C89432m(C29159e.this.f69022c.timeout());
        }

        /* synthetic */ C29161b(C29159e eVar, byte b) {
            this();
        }

        @Override // p4632k.AbstractC89447y
        /* renamed from: a */
        public final void mo22060a(C89420f fVar, long j) {
            if (this.f69030c) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                C29159e.this.f69022c.mo68858c(j);
                C29159e.this.f69022c.mo68849a("\r\n");
                C29159e.this.f69022c.mo22060a(fVar, j);
                C29159e.this.f69022c.mo68849a("\r\n");
            }
        }
    }

    /* renamed from: com.squareup.a.a.b.e$d */
    final class C29163d implements AbstractC89447y {

        /* renamed from: b */
        private final C89432m f69036b;

        /* renamed from: c */
        private boolean f69037c;

        /* renamed from: d */
        private long f69038d;

        static {
            Covode.recordClassIndex(35512);
        }

        @Override // p4632k.AbstractC89447y
        public final C89409ab timeout() {
            return this.f69036b;
        }

        @Override // p4632k.AbstractC89447y, java.io.Flushable
        public final void flush() {
            if (!this.f69037c) {
                C29159e.this.f69022c.flush();
            }
        }

        @Override // p4632k.AbstractC89447y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!this.f69037c) {
                this.f69037c = true;
                if (this.f69038d <= 0) {
                    C29159e.m58271a(this.f69036b);
                    C29159e.this.f69023d = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        private C29163d(long j) {
            this.f69036b = new C89432m(C29159e.this.f69022c.timeout());
            this.f69038d = j;
        }

        @Override // p4632k.AbstractC89447y
        /* renamed from: a */
        public final void mo22060a(C89420f fVar, long j) {
            if (!this.f69037c) {
                C29206j.m58437a(fVar.f203091b, j);
                if (j <= this.f69038d) {
                    C29159e.this.f69022c.mo22060a(fVar, j);
                    this.f69038d -= j;
                    return;
                }
                throw new ProtocolException("expected " + this.f69038d + " bytes but received " + j);
            }
            throw new IllegalStateException("closed");
        }

        /* synthetic */ C29163d(C29159e eVar, long j, byte b) {
            this(j);
        }
    }

    @Override // com.squareup.p2075a.p2076a.p2078b.AbstractC29175j
    /* renamed from: a */
    public final C29249x.C29250a mo50858a() {
        return mo50867c();
    }

    @Override // com.squareup.p2075a.p2076a.p2078b.AbstractC29175j
    /* renamed from: b */
    public final void mo50866b() {
        this.f69022c.flush();
    }

    /* renamed from: com.squareup.a.a.b.e$f */
    class C29165f extends AbstractC29160a {

        /* renamed from: e */
        private boolean f69042e;

        static {
            Covode.recordClassIndex(35514);
        }

        @Override // p4632k.AbstractC89408aa, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!this.f69026b) {
                if (!this.f69042e) {
                    mo50870b();
                }
                this.f69026b = true;
            }
        }

        private C29165f() {
            super(C29159e.this, (byte) 0);
        }

        /* synthetic */ C29165f(C29159e eVar, byte b) {
            this();
        }

        @Override // p4632k.AbstractC89408aa
        public final long read(C89420f fVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            } else if (this.f69026b) {
                throw new IllegalStateException("closed");
            } else if (this.f69042e) {
                return -1;
            } else {
                long read = C29159e.this.f69021b.read(fVar, j);
                if (read != -1) {
                    return read;
                }
                this.f69042e = true;
                mo50869a();
                return -1;
            }
        }
    }

    /* renamed from: com.squareup.a.a.b.e$c */
    class C29162c extends AbstractC29160a {

        /* renamed from: e */
        private long f69032e = -1;

        /* renamed from: f */
        private boolean f69033f = true;

        /* renamed from: g */
        private final C29170h f69034g;

        static {
            Covode.recordClassIndex(35511);
        }

        @Override // p4632k.AbstractC89408aa, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!this.f69026b) {
                if (this.f69033f && !C29206j.m58443a((AbstractC89408aa) this, TimeUnit.MILLISECONDS)) {
                    mo50870b();
                }
                this.f69026b = true;
            }
        }

        C29162c(C29170h hVar) {
            super(C29159e.this, (byte) 0);
            this.f69034g = hVar;
        }

        @Override // p4632k.AbstractC89408aa
        public final long read(C89420f fVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            } else if (this.f69026b) {
                throw new IllegalStateException("closed");
            } else if (!this.f69033f) {
                return -1;
            } else {
                long j2 = this.f69032e;
                if (j2 == 0 || j2 == -1) {
                    if (j2 != -1) {
                        C29159e.this.f69021b.mo143850s();
                    }
                    try {
                        this.f69032e = C29159e.this.f69021b.mo143845p();
                        String trim = C29159e.this.f69021b.mo143850s().trim();
                        if (this.f69032e < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f69032e + trim + "\"");
                        }
                        if (this.f69032e == 0) {
                            this.f69033f = false;
                            this.f69034g.mo50873a(C29159e.this.mo50868d());
                            mo50869a();
                        }
                        if (!this.f69033f) {
                            return -1;
                        }
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long read = C29159e.this.f69021b.read(fVar, Math.min(j, this.f69032e));
                if (read != -1) {
                    this.f69032e -= read;
                    return read;
                }
                mo50870b();
                throw new ProtocolException("unexpected end of stream");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.a.a.b.e$e */
    public class C29164e extends AbstractC29160a {

        /* renamed from: e */
        private long f69040e;

        static {
            Covode.recordClassIndex(35513);
        }

        @Override // p4632k.AbstractC89408aa, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!this.f69026b) {
                if (this.f69040e != 0 && !C29206j.m58443a((AbstractC89408aa) this, TimeUnit.MILLISECONDS)) {
                    mo50870b();
                }
                this.f69026b = true;
            }
        }

        public C29164e(long j) {
            super(C29159e.this, (byte) 0);
            this.f69040e = j;
            if (j == 0) {
                mo50869a();
            }
        }

        @Override // p4632k.AbstractC89408aa
        public final long read(C89420f fVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            } else if (this.f69026b) {
                throw new IllegalStateException("closed");
            } else if (this.f69040e == 0) {
                return -1;
            } else {
                long read = C29159e.this.f69021b.read(fVar, Math.min(this.f69040e, j));
                if (read != -1) {
                    long j2 = this.f69040e - read;
                    this.f69040e = j2;
                    if (j2 == 0) {
                        mo50869a();
                    }
                    return read;
                }
                mo50870b();
                throw new ProtocolException("unexpected end of stream");
            }
        }
    }

    /* renamed from: d */
    public final C29235p mo50868d() {
        C29235p.C29236a aVar = new C29235p.C29236a();
        while (true) {
            String s = this.f69021b.mo143850s();
            if (s.length() == 0) {
                return aVar.mo50985a();
            }
            AbstractC29190d.f69140b.mo50912a(aVar, s);
        }
    }

    /* renamed from: c */
    public final C29249x.C29250a mo50867c() {
        C29184r a;
        C29249x.C29250a a2;
        int i = this.f69023d;
        if (i == 1 || i == 3) {
            do {
                try {
                    a = C29184r.m58339a(this.f69021b.mo143850s());
                    C29249x.C29250a aVar = new C29249x.C29250a();
                    aVar.f69362b = a.f69113a;
                    aVar.f69363c = a.f69114b;
                    aVar.f69364d = a.f69115c;
                    a2 = aVar.mo51035a(mo50868d());
                } catch (EOFException e) {
                    IOException iOException = new IOException("unexpected end of stream on " + this.f69020a);
                    iOException.initCause(e);
                    throw iOException;
                }
            } while (a.f69114b == 100);
            this.f69023d = 4;
            return a2;
        }
        throw new IllegalStateException("state: " + this.f69023d);
    }

    @Override // com.squareup.p2075a.p2076a.p2078b.AbstractC29175j
    /* renamed from: a */
    public final void mo50862a(C29170h hVar) {
        this.f69024e = hVar;
    }

    /* renamed from: a */
    public static void m58271a(C89432m mVar) {
        C89409ab abVar = mVar.f203108a;
        mVar.mo143926a(C89409ab.f203072h);
        abVar.mo143785e();
        abVar.mo143782S_();
    }

    /* renamed from: a */
    public final AbstractC89408aa mo50860a(long j) {
        if (this.f69023d == 4) {
            this.f69023d = 5;
            return new C29164e(j);
        }
        throw new IllegalStateException("state: " + this.f69023d);
    }

    @Override // com.squareup.p2075a.p2076a.p2078b.AbstractC29175j
    /* renamed from: a */
    public final AbstractC29251y mo50859a(C29249x xVar) {
        AbstractC89408aa fVar;
        if (!C29170h.m58299c(xVar)) {
            fVar = mo50860a(0);
        } else if ("chunked".equalsIgnoreCase(xVar.mo51031a("Transfer-Encoding"))) {
            C29170h hVar = this.f69024e;
            if (this.f69023d == 4) {
                this.f69023d = 5;
                fVar = new C29162c(hVar);
            } else {
                throw new IllegalStateException("state: " + this.f69023d);
            }
        } else {
            long a = C29176k.m58320a(xVar.f69355f);
            if (a != -1) {
                fVar = mo50860a(a);
            } else if (this.f69023d == 4) {
                C29185s sVar = this.f69020a;
                if (sVar != null) {
                    this.f69023d = 5;
                    sVar.mo50894a(true, false, false);
                    fVar = new C29165f(this, (byte) 0);
                } else {
                    throw new IllegalStateException("streamAllocation == null");
                }
            } else {
                throw new IllegalStateException("state: " + this.f69023d);
            }
        }
        return new C29178l(xVar.f69355f, C89436q.m155160a(fVar));
    }

    @Override // com.squareup.p2075a.p2076a.p2078b.AbstractC29175j
    /* renamed from: a */
    public final void mo50863a(C29181o oVar) {
        if (this.f69023d == 1) {
            this.f69023d = 3;
            oVar.mo50883a(this.f69022c);
            return;
        }
        throw new IllegalStateException("state: " + this.f69023d);
    }

    @Override // com.squareup.p2075a.p2076a.p2078b.AbstractC29175j
    /* renamed from: a */
    public final void mo50865a(C29246v vVar) {
        this.f69024e.mo50872a();
        Proxy.Type type = this.f69024e.f69066c.mo50890a().mo50904a().f69372b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(vVar.f69339b);
        sb.append(' ');
        if (vVar.f69338a.mo50990c() || type != Proxy.Type.HTTP) {
            sb.append(C29180n.m58330a(vVar.f69338a));
        } else {
            sb.append(vVar.f69338a);
        }
        sb.append(" HTTP/1.1");
        mo50864a(vVar.f69340c, sb.toString());
    }

    @Override // com.squareup.p2075a.p2076a.p2078b.AbstractC29175j
    /* renamed from: a */
    public final AbstractC89447y mo50861a(C29246v vVar, long j) {
        if ("chunked".equalsIgnoreCase(vVar.mo51016a("Transfer-Encoding"))) {
            if (this.f69023d == 1) {
                this.f69023d = 2;
                return new C29161b(this, (byte) 0);
            }
            throw new IllegalStateException("state: " + this.f69023d);
        } else if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.f69023d == 1) {
            this.f69023d = 2;
            return new C29163d(this, j, (byte) 0);
        } else {
            throw new IllegalStateException("state: " + this.f69023d);
        }
    }

    /* renamed from: a */
    public final void mo50864a(C29235p pVar, String str) {
        if (this.f69023d == 0) {
            this.f69022c.mo68849a(str).mo68849a("\r\n");
            int length = pVar.f69280a.length / 2;
            for (int i = 0; i < length; i++) {
                this.f69022c.mo68849a(pVar.mo50977a(i)).mo68849a(": ").mo68849a(pVar.mo50979b(i)).mo68849a("\r\n");
            }
            this.f69022c.mo68849a("\r\n");
            this.f69023d = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f69023d);
    }

    public C29159e(C29185s sVar, AbstractC89426h hVar, AbstractC89425g gVar) {
        this.f69020a = sVar;
        this.f69021b = hVar;
        this.f69022c = gVar;
    }
}
