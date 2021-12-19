package okhttp3.internal.p4657e;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.AbstractC90031ad;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.C90198s;
import okhttp3.C90208y;
import okhttp3.EnumC90211z;
import okhttp3.Request;
import okhttp3.internal.AbstractC90058a;
import okhttp3.internal.C90084c;
import okhttp3.internal.p4654b.C90082g;
import okhttp3.internal.p4655c.AbstractC90090c;
import okhttp3.internal.p4655c.C90093e;
import okhttp3.internal.p4655c.C90096h;
import okhttp3.internal.p4655c.C90097i;
import okhttp3.internal.p4655c.C90099k;
import p4632k.AbstractC89408aa;
import p4632k.AbstractC89431l;
import p4632k.AbstractC89447y;
import p4632k.C89420f;
import p4632k.C89427i;
import p4632k.C89436q;

/* renamed from: okhttp3.internal.e.f */
public final class C90116f implements AbstractC90090c {

    /* renamed from: b */
    private static final List<String> f204557b = C90084c.m156411a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: c */
    private static final List<String> f204558c = C90084c.m156411a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a */
    final C90082g f204559a;

    /* renamed from: d */
    private final AbstractC90202u.AbstractC90203a f204560d;

    /* renamed from: e */
    private final C90118g f204561e;

    /* renamed from: f */
    private C90138i f204562f;

    /* renamed from: g */
    private final EnumC90211z f204563g;

    /* renamed from: okhttp3.internal.e.f$a */
    class C90117a extends AbstractC89431l {

        /* renamed from: a */
        boolean f204564a;

        /* renamed from: b */
        long f204565b;

        static {
            Covode.recordClassIndex(106289);
        }

        @Override // p4632k.AbstractC89408aa, java.io.Closeable, p4632k.AbstractC89431l, java.lang.AutoCloseable
        public final void close() {
            super.close();
            m156512a(null);
        }

        /* renamed from: a */
        private void m156512a(IOException iOException) {
            if (!this.f204564a) {
                this.f204564a = true;
                C90116f.this.f204559a.mo144840a(false, C90116f.this, this.f204565b, iOException);
            }
        }

        C90117a(AbstractC89408aa aaVar) {
            super(aaVar);
        }

        @Override // p4632k.AbstractC89408aa, p4632k.AbstractC89431l
        public final long read(C89420f fVar, long j) {
            try {
                long read = this.delegate.read(fVar, j);
                if (read > 0) {
                    this.f204565b += read;
                }
                return read;
            } catch (IOException e) {
                m156512a(e);
                throw e;
            }
        }
    }

    @Override // okhttp3.internal.p4655c.AbstractC90090c
    /* renamed from: a */
    public final void mo144851a() {
        this.f204561e.f204590v.mo144925b();
    }

    @Override // okhttp3.internal.p4655c.AbstractC90090c
    /* renamed from: b */
    public final void mo144853b() {
        this.f204562f.mo144910d().close();
    }

    @Override // okhttp3.internal.p4655c.AbstractC90090c
    /* renamed from: c */
    public final void mo144854c() {
        C90138i iVar = this.f204562f;
        if (iVar != null) {
            iVar.mo144906b(EnumC90109b.CANCEL);
        }
    }

    static {
        Covode.recordClassIndex(106288);
    }

    @Override // okhttp3.internal.p4655c.AbstractC90090c
    /* renamed from: a */
    public final AbstractC90031ad mo144850a(C90029ac acVar) {
        this.f204559a.f204435e.responseBodyStart(this.f204559a.f204434d);
        return new C90096h(acVar.mo144718a("Content-Type", null), C90093e.m156443a(acVar.f204110f), C89436q.m155160a(new C90117a(this.f204562f.f204657h)));
    }

    @Override // okhttp3.internal.p4655c.AbstractC90090c
    /* renamed from: a */
    public final C90029ac.C90030a mo144849a(boolean z) {
        C90198s c = this.f204562f.mo144908c();
        EnumC90211z zVar = this.f204563g;
        C90198s.C90199a aVar = new C90198s.C90199a();
        int length = c.f204855a.length / 2;
        C90099k kVar = null;
        for (int i = 0; i < length; i++) {
            String a = c.mo145027a(i);
            String b = c.mo145031b(i);
            if (a.equals(":status")) {
                kVar = C90099k.m156466a("HTTP/1.1 ".concat(String.valueOf(b)));
            } else if (!f204558c.contains(a)) {
                AbstractC90058a.f204330a.mo144790a(aVar, a, b);
            }
        }
        if (kVar != null) {
            C90029ac.C90030a aVar2 = new C90029ac.C90030a();
            aVar2.f204119b = zVar;
            aVar2.f204120c = kVar.f204496b;
            aVar2.f204121d = kVar.f204497c;
            C90029ac.C90030a a2 = aVar2.mo144728a(aVar.mo145040a());
            if (!z || AbstractC90058a.f204330a.mo144781a(a2) != 100) {
                return a2;
            }
            return null;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // okhttp3.internal.p4655c.AbstractC90090c
    /* renamed from: a */
    public final void mo144852a(Request request) {
        boolean z;
        if (this.f204562f == null) {
            if (request.body() != null) {
                z = true;
            } else {
                z = false;
            }
            C90198s headers = request.headers();
            ArrayList arrayList = new ArrayList((headers.f204855a.length / 2) + 4);
            arrayList.add(new C90110c(C90110c.f204526c, request.method()));
            arrayList.add(new C90110c(C90110c.f204527d, C90097i.m156458a(request.url())));
            String header = request.header("Host");
            if (header != null) {
                arrayList.add(new C90110c(C90110c.f204529f, header));
            }
            arrayList.add(new C90110c(C90110c.f204528e, request.url().f204858a));
            int length = headers.f204855a.length / 2;
            for (int i = 0; i < length; i++) {
                C89427i encodeUtf8 = C89427i.encodeUtf8(headers.mo145027a(i).toLowerCase(Locale.US));
                if (!f204557b.contains(encodeUtf8.utf8())) {
                    arrayList.add(new C90110c(encodeUtf8, headers.mo145031b(i)));
                }
            }
            C90138i a = this.f204561e.mo144877a(arrayList, z);
            this.f204562f = a;
            a.f204659j.mo143784a((long) this.f204560d.mo144861d(), TimeUnit.MILLISECONDS);
            this.f204562f.f204660k.mo143784a((long) this.f204560d.mo144862e(), TimeUnit.MILLISECONDS);
        }
    }

    @Override // okhttp3.internal.p4655c.AbstractC90090c
    /* renamed from: a */
    public final AbstractC89447y mo144848a(Request request, long j) {
        return this.f204562f.mo144910d();
    }

    public C90116f(C90208y yVar, AbstractC90202u.AbstractC90203a aVar, C90082g gVar, C90118g gVar2) {
        EnumC90211z zVar;
        this.f204560d = aVar;
        this.f204559a = gVar;
        this.f204561e = gVar2;
        if (yVar.f204907e.contains(EnumC90211z.H2_PRIOR_KNOWLEDGE)) {
            zVar = EnumC90211z.H2_PRIOR_KNOWLEDGE;
        } else {
            zVar = EnumC90211z.HTTP_2;
        }
        this.f204563g = zVar;
    }
}
