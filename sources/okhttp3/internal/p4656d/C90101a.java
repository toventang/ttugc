package okhttp3.internal.p4656d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import okhttp3.AbstractC90031ad;
import okhttp3.C90029ac;
import okhttp3.C90198s;
import okhttp3.C90200t;
import okhttp3.C90208y;
import okhttp3.Request;
import okhttp3.internal.AbstractC90058a;
import okhttp3.internal.C90084c;
import okhttp3.internal.p4654b.C90076c;
import okhttp3.internal.p4654b.C90082g;
import okhttp3.internal.p4655c.AbstractC90090c;
import okhttp3.internal.p4655c.C90093e;
import okhttp3.internal.p4655c.C90096h;
import okhttp3.internal.p4655c.C90097i;
import okhttp3.internal.p4655c.C90099k;
import p4632k.AbstractC89408aa;
import p4632k.AbstractC89425g;
import p4632k.AbstractC89426h;
import p4632k.AbstractC89447y;
import p4632k.C89409ab;
import p4632k.C89420f;
import p4632k.C89432m;
import p4632k.C89436q;

/* renamed from: okhttp3.internal.d.a */
public final class C90101a implements AbstractC90090c {

    /* renamed from: a */
    final C90208y f204498a;

    /* renamed from: b */
    final C90082g f204499b;

    /* renamed from: c */
    final AbstractC89426h f204500c;

    /* renamed from: d */
    final AbstractC89425g f204501d;

    /* renamed from: e */
    int f204502e;

    /* renamed from: f */
    private long f204503f = 262144;

    static {
        Covode.recordClassIndex(106273);
    }

    /* renamed from: okhttp3.internal.d.a$a */
    abstract class AbstractC90102a implements AbstractC89408aa {

        /* renamed from: a */
        protected final C89432m f204504a;

        /* renamed from: b */
        protected boolean f204505b;

        /* renamed from: c */
        protected long f204506c;

        static {
            Covode.recordClassIndex(106274);
        }

        @Override // p4632k.AbstractC89408aa
        public C89409ab timeout() {
            return this.f204504a;
        }

        private AbstractC90102a() {
            this.f204504a = new C89432m(C90101a.this.f204500c.timeout());
            this.f204506c = 0;
        }

        /* synthetic */ AbstractC90102a(C90101a aVar, byte b) {
            this();
        }

        @Override // p4632k.AbstractC89408aa
        public long read(C89420f fVar, long j) {
            try {
                long read = C90101a.this.f204500c.read(fVar, j);
                if (read > 0) {
                    this.f204506c += read;
                }
                return read;
            } catch (IOException e) {
                mo144867a(false, e);
                throw e;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo144867a(boolean z, IOException iOException) {
            if (C90101a.this.f204502e != 6) {
                if (C90101a.this.f204502e == 5) {
                    C90101a.m156467a(this.f204504a);
                    C90101a.this.f204502e = 6;
                    if (C90101a.this.f204499b != null) {
                        C90101a.this.f204499b.mo144840a(!z, C90101a.this, this.f204506c, iOException);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("state: " + C90101a.this.f204502e);
            }
        }
    }

    /* renamed from: okhttp3.internal.d.a$b */
    final class C90103b implements AbstractC89447y {

        /* renamed from: b */
        private final C89432m f204509b;

        /* renamed from: c */
        private boolean f204510c;

        static {
            Covode.recordClassIndex(106275);
        }

        @Override // p4632k.AbstractC89447y
        public final C89409ab timeout() {
            return this.f204509b;
        }

        @Override // p4632k.AbstractC89447y, java.io.Flushable
        public final synchronized void flush() {
            MethodCollector.m26663i(8229);
            if (this.f204510c) {
                MethodCollector.m26664o(8229);
                return;
            }
            C90101a.this.f204501d.flush();
            MethodCollector.m26664o(8229);
        }

        @Override // p4632k.AbstractC89447y, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            MethodCollector.m26663i(8363);
            if (this.f204510c) {
                MethodCollector.m26664o(8363);
                return;
            }
            this.f204510c = true;
            C90101a.this.f204501d.mo68849a("0\r\n\r\n");
            C90101a.m156467a(this.f204509b);
            C90101a.this.f204502e = 3;
            MethodCollector.m26664o(8363);
        }

        C90103b() {
            this.f204509b = new C89432m(C90101a.this.f204501d.timeout());
        }

        @Override // p4632k.AbstractC89447y
        /* renamed from: a */
        public final void mo22060a(C89420f fVar, long j) {
            if (this.f204510c) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                C90101a.this.f204501d.mo68858c(j);
                C90101a.this.f204501d.mo68849a("\r\n");
                C90101a.this.f204501d.mo22060a(fVar, j);
                C90101a.this.f204501d.mo68849a("\r\n");
            }
        }
    }

    /* renamed from: okhttp3.internal.d.a$d */
    final class C90105d implements AbstractC89447y {

        /* renamed from: b */
        private final C89432m f204516b;

        /* renamed from: c */
        private boolean f204517c;

        /* renamed from: d */
        private long f204518d;

        static {
            Covode.recordClassIndex(106277);
        }

        @Override // p4632k.AbstractC89447y
        public final C89409ab timeout() {
            return this.f204516b;
        }

        @Override // p4632k.AbstractC89447y, java.io.Flushable
        public final void flush() {
            if (!this.f204517c) {
                C90101a.this.f204501d.flush();
            }
        }

        @Override // p4632k.AbstractC89447y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!this.f204517c) {
                this.f204517c = true;
                if (this.f204518d <= 0) {
                    C90101a.m156467a(this.f204516b);
                    C90101a.this.f204502e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        C90105d(long j) {
            this.f204516b = new C89432m(C90101a.this.f204501d.timeout());
            this.f204518d = j;
        }

        @Override // p4632k.AbstractC89447y
        /* renamed from: a */
        public final void mo22060a(C89420f fVar, long j) {
            if (!this.f204517c) {
                C90084c.m156414a(fVar.f203091b, 0, j);
                if (j <= this.f204518d) {
                    C90101a.this.f204501d.mo22060a(fVar, j);
                    this.f204518d -= j;
                    return;
                }
                throw new ProtocolException("expected " + this.f204518d + " bytes but received " + j);
            }
            throw new IllegalStateException("closed");
        }
    }

    @Override // okhttp3.internal.p4655c.AbstractC90090c
    /* renamed from: a */
    public final void mo144851a() {
        this.f204501d.flush();
    }

    @Override // okhttp3.internal.p4655c.AbstractC90090c
    /* renamed from: b */
    public final void mo144853b() {
        this.f204501d.flush();
    }

    @Override // okhttp3.internal.p4655c.AbstractC90090c
    /* renamed from: c */
    public final void mo144854c() {
        C90076c b = this.f204499b.mo144841b();
        if (b != null) {
            C90084c.m156416a(b.f204402b);
        }
    }

    /* renamed from: okhttp3.internal.d.a$c */
    class C90104c extends AbstractC90102a {

        /* renamed from: f */
        private final C90200t f204512f;

        /* renamed from: g */
        private long f204513g = -1;

        /* renamed from: h */
        private boolean f204514h = true;

        static {
            Covode.recordClassIndex(106276);
        }

        @Override // p4632k.AbstractC89408aa, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!this.f204505b) {
                if (this.f204514h && !C90084c.m156420a((AbstractC89408aa) this, TimeUnit.MILLISECONDS)) {
                    mo144867a(false, null);
                }
                this.f204505b = true;
            }
        }

        C90104c(C90200t tVar) {
            super(C90101a.this, (byte) 0);
            this.f204512f = tVar;
        }

        @Override // p4632k.AbstractC89408aa, okhttp3.internal.p4656d.C90101a.AbstractC90102a
        public final long read(C89420f fVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            } else if (this.f204505b) {
                throw new IllegalStateException("closed");
            } else if (!this.f204514h) {
                return -1;
            } else {
                long j2 = this.f204513g;
                if (j2 == 0 || j2 == -1) {
                    if (j2 != -1) {
                        C90101a.this.f204500c.mo143850s();
                    }
                    try {
                        this.f204513g = C90101a.this.f204500c.mo143845p();
                        String trim = C90101a.this.f204500c.mo143850s().trim();
                        if (this.f204513g < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f204513g + trim + "\"");
                        }
                        if (this.f204513g == 0) {
                            this.f204514h = false;
                            C90093e.m156445a(C90101a.this.f204498a.f204913k, this.f204512f, C90101a.this.mo144866d());
                            mo144867a(true, null);
                        }
                        if (!this.f204514h) {
                            return -1;
                        }
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long read = super.read(fVar, Math.min(j, this.f204513g));
                if (read != -1) {
                    this.f204513g -= read;
                    return read;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo144867a(false, protocolException);
                throw protocolException;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: okhttp3.internal.d.a$e */
    public class C90106e extends AbstractC90102a {

        /* renamed from: f */
        private long f204520f;

        static {
            Covode.recordClassIndex(106278);
        }

        @Override // p4632k.AbstractC89408aa, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!this.f204505b) {
                if (this.f204520f != 0 && !C90084c.m156420a((AbstractC89408aa) this, TimeUnit.MILLISECONDS)) {
                    mo144867a(false, null);
                }
                this.f204505b = true;
            }
        }

        C90106e(long j) {
            super(C90101a.this, (byte) 0);
            this.f204520f = j;
            if (j == 0) {
                mo144867a(true, null);
            }
        }

        @Override // p4632k.AbstractC89408aa, okhttp3.internal.p4656d.C90101a.AbstractC90102a
        public final long read(C89420f fVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            } else if (!this.f204505b) {
                long j2 = this.f204520f;
                if (j2 == 0) {
                    return -1;
                }
                long read = super.read(fVar, Math.min(j2, j));
                if (read != -1) {
                    long j3 = this.f204520f - read;
                    this.f204520f = j3;
                    if (j3 == 0) {
                        mo144867a(true, null);
                    }
                    return read;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo144867a(false, protocolException);
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }
    }

    /* renamed from: okhttp3.internal.d.a$f */
    class C90107f extends AbstractC90102a {

        /* renamed from: f */
        private boolean f204522f;

        static {
            Covode.recordClassIndex(106279);
        }

        @Override // p4632k.AbstractC89408aa, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (!this.f204505b) {
                if (!this.f204522f) {
                    mo144867a(false, null);
                }
                this.f204505b = true;
            }
        }

        C90107f() {
            super(C90101a.this, (byte) 0);
        }

        @Override // p4632k.AbstractC89408aa, okhttp3.internal.p4656d.C90101a.AbstractC90102a
        public final long read(C89420f fVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            } else if (this.f204505b) {
                throw new IllegalStateException("closed");
            } else if (this.f204522f) {
                return -1;
            } else {
                long read = super.read(fVar, j);
                if (read != -1) {
                    return read;
                }
                this.f204522f = true;
                mo144867a(true, null);
                return -1;
            }
        }
    }

    /* renamed from: e */
    private String m156468e() {
        String i = this.f204500c.mo143828i(this.f204503f);
        this.f204503f -= (long) i.length();
        return i;
    }

    /* renamed from: d */
    public final C90198s mo144866d() {
        C90198s.C90199a aVar = new C90198s.C90199a();
        while (true) {
            String e = m156468e();
            if (e.length() == 0) {
                return aVar.mo145040a();
            }
            AbstractC90058a.f204330a.mo144789a(aVar, e);
        }
    }

    /* renamed from: a */
    static void m156467a(C89432m mVar) {
        C89409ab abVar = mVar.f203108a;
        mVar.mo143926a(C89409ab.f203072h);
        abVar.mo143785e();
        abVar.mo143782S_();
    }

    /* renamed from: a */
    public final AbstractC89408aa mo144864a(long j) {
        if (this.f204502e == 4) {
            this.f204502e = 5;
            return new C90106e(j);
        }
        throw new IllegalStateException("state: " + this.f204502e);
    }

    @Override // okhttp3.internal.p4655c.AbstractC90090c
    /* renamed from: a */
    public final C90029ac.C90030a mo144849a(boolean z) {
        int i = this.f204502e;
        if (i == 1 || i == 3) {
            try {
                C90099k a = C90099k.m156466a(m156468e());
                C90029ac.C90030a aVar = new C90029ac.C90030a();
                aVar.f204119b = a.f204495a;
                aVar.f204120c = a.f204496b;
                aVar.f204121d = a.f204497c;
                C90029ac.C90030a a2 = aVar.mo144728a(mo144866d());
                if (z && a.f204496b == 100) {
                    return null;
                }
                if (a.f204496b == 100) {
                    this.f204502e = 3;
                    return a2;
                }
                this.f204502e = 4;
                return a2;
            } catch (EOFException e) {
                IOException iOException = new IOException("unexpected end of stream on " + this.f204499b);
                iOException.initCause(e);
                throw iOException;
            }
        } else {
            throw new IllegalStateException("state: " + this.f204502e);
        }
    }

    @Override // okhttp3.internal.p4655c.AbstractC90090c
    /* renamed from: a */
    public final AbstractC90031ad mo144850a(C90029ac acVar) {
        this.f204499b.f204435e.responseBodyStart(this.f204499b.f204434d);
        String a = acVar.mo144718a("Content-Type", null);
        if (!C90093e.m156446a(acVar)) {
            return new C90096h(a, 0, C89436q.m155160a(mo144864a(0)));
        }
        if ("chunked".equalsIgnoreCase(acVar.mo144718a("Transfer-Encoding", null))) {
            C90200t url = acVar.f204105a.url();
            if (this.f204502e == 4) {
                this.f204502e = 5;
                return new C90096h(a, -1, C89436q.m155160a(new C90104c(url)));
            }
            throw new IllegalStateException("state: " + this.f204502e);
        }
        long a2 = C90093e.m156443a(acVar.f204110f);
        if (a2 != -1) {
            return new C90096h(a, a2, C89436q.m155160a(mo144864a(a2)));
        }
        if (this.f204502e == 4) {
            C90082g gVar = this.f204499b;
            if (gVar != null) {
                this.f204502e = 5;
                gVar.mo144843d();
                return new C90096h(a, -1, C89436q.m155160a(new C90107f()));
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.f204502e);
    }

    @Override // okhttp3.internal.p4655c.AbstractC90090c
    /* renamed from: a */
    public final void mo144852a(Request request) {
        Proxy.Type type = this.f204499b.mo144841b().f204401a.f204138b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(request.method());
        sb.append(' ');
        if (request.isHttps() || type != Proxy.Type.HTTP) {
            sb.append(C90097i.m156458a(request.url()));
        } else {
            sb.append(request.url());
        }
        sb.append(" HTTP/1.1");
        mo144865a(request.headers(), sb.toString());
    }

    @Override // okhttp3.internal.p4655c.AbstractC90090c
    /* renamed from: a */
    public final AbstractC89447y mo144848a(Request request, long j) {
        if ("chunked".equalsIgnoreCase(request.header("Transfer-Encoding"))) {
            if (this.f204502e == 1) {
                this.f204502e = 2;
                return new C90103b();
            }
            throw new IllegalStateException("state: " + this.f204502e);
        } else if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.f204502e == 1) {
            this.f204502e = 2;
            return new C90105d(j);
        } else {
            throw new IllegalStateException("state: " + this.f204502e);
        }
    }

    /* renamed from: a */
    public final void mo144865a(C90198s sVar, String str) {
        if (this.f204502e == 0) {
            this.f204501d.mo68849a(str).mo68849a("\r\n");
            int length = sVar.f204855a.length / 2;
            for (int i = 0; i < length; i++) {
                this.f204501d.mo68849a(sVar.mo145027a(i)).mo68849a(": ").mo68849a(sVar.mo145031b(i)).mo68849a("\r\n");
            }
            this.f204501d.mo68849a("\r\n");
            this.f204502e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f204502e);
    }

    public C90101a(C90208y yVar, C90082g gVar, AbstractC89426h hVar, AbstractC89425g gVar2) {
        this.f204498a = yVar;
        this.f204499b = gVar;
        this.f204500c = hVar;
        this.f204501d = gVar2;
    }
}
