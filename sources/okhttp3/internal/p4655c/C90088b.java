package okhttp3.internal.p4655c;

import com.bytedance.covode.number.Covode;
import java.net.ProtocolException;
import okhttp3.AbstractC90202u;
import okhttp3.C90029ac;
import okhttp3.Request;
import okhttp3.internal.C90084c;
import okhttp3.internal.p4654b.C90076c;
import okhttp3.internal.p4654b.C90082g;
import p4632k.AbstractC89425g;
import p4632k.AbstractC89430k;
import p4632k.AbstractC89447y;
import p4632k.C89420f;
import p4632k.C89436q;

/* renamed from: okhttp3.internal.c.b */
public final class C90088b implements AbstractC90202u {

    /* renamed from: a */
    private final boolean f204468a;

    static {
        Covode.recordClassIndex(106260);
    }

    /* renamed from: okhttp3.internal.c.b$a */
    static final class C90089a extends AbstractC89430k {

        /* renamed from: a */
        long f204469a;

        static {
            Covode.recordClassIndex(106261);
        }

        C90089a(AbstractC89447y yVar) {
            super(yVar);
        }

        @Override // p4632k.AbstractC89447y, p4632k.AbstractC89430k
        /* renamed from: a */
        public final void mo22060a(C89420f fVar, long j) {
            super.mo22060a(fVar, j);
            this.f204469a += j;
        }
    }

    public C90088b(boolean z) {
        this.f204468a = z;
    }

    @Override // okhttp3.AbstractC90202u
    public final C90029ac intercept(AbstractC90202u.AbstractC90203a aVar) {
        C90029ac.C90030a aVar2;
        C90029ac a;
        C90095g gVar = (C90095g) aVar;
        AbstractC90090c cVar = gVar.f204476b;
        C90082g gVar2 = gVar.f204475a;
        C90076c cVar2 = gVar.f204477c;
        Request request = gVar.f204478d;
        long currentTimeMillis = System.currentTimeMillis();
        gVar.f204480f.requestHeadersStart(gVar.f204479e);
        cVar.mo144852a(request);
        gVar.f204480f.requestHeadersEnd(gVar.f204479e, request);
        if (!C90094f.m156450c(request.method()) || request.body() == null) {
            aVar2 = null;
        } else {
            if ("100-continue".equalsIgnoreCase(request.header("Expect"))) {
                cVar.mo144851a();
                gVar.f204480f.responseHeadersStart(gVar.f204479e);
                aVar2 = cVar.mo144849a(true);
                if (aVar2 != null) {
                    if (!cVar2.mo144823d()) {
                        gVar2.mo144843d();
                    }
                }
            } else {
                aVar2 = null;
            }
            gVar.f204480f.requestBodyStart(gVar.f204479e);
            C90089a aVar3 = new C90089a(cVar.mo144848a(request, request.body().contentLength()));
            AbstractC89425g a2 = C89436q.m155159a(aVar3);
            request.body().writeTo(a2);
            a2.close();
            gVar.f204480f.requestBodyEnd(gVar.f204479e, aVar3.f204469a);
        }
        cVar.mo144853b();
        if (aVar2 == null) {
            gVar.f204480f.responseHeadersStart(gVar.f204479e);
            aVar2 = cVar.mo144849a(false);
        }
        aVar2.f204118a = request;
        aVar2.f204122e = gVar2.mo144841b().f204404d;
        aVar2.f204128k = currentTimeMillis;
        aVar2.f204129l = System.currentTimeMillis();
        C90029ac a3 = aVar2.mo144729a();
        int i = a3.f204107c;
        if (i == 100) {
            C90029ac.C90030a a4 = cVar.mo144849a(false);
            a4.f204118a = request;
            a4.f204122e = gVar2.mo144841b().f204404d;
            a4.f204128k = currentTimeMillis;
            a4.f204129l = System.currentTimeMillis();
            a3 = a4.mo144729a();
            i = a3.f204107c;
        }
        gVar.f204480f.responseHeadersEnd(gVar.f204479e, a3);
        if (!this.f204468a || i != 101) {
            C90029ac.C90030a b = a3.mo144722b();
            b.f204124g = cVar.mo144850a(a3);
            a = b.mo144729a();
        } else {
            C90029ac.C90030a b2 = a3.mo144722b();
            b2.f204124g = C90084c.f204448c;
            a = b2.mo144729a();
        }
        if ("close".equalsIgnoreCase(a.f204105a.header("Connection")) || "close".equalsIgnoreCase(a.mo144718a("Connection", null))) {
            gVar2.mo144843d();
        }
        if ((i != 204 && i != 205) || a.f204111g.contentLength() <= 0) {
            return a;
        }
        throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + a.f204111g.contentLength());
    }
}
