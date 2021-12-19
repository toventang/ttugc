package com.squareup.p2075a.p2076a.p2078b;

import com.bytedance.covode.number.Covode;
import com.squareup.p2075a.AbstractC29225i;
import com.squareup.p2075a.AbstractC29240r;
import com.squareup.p2075a.AbstractC29251y;
import com.squareup.p2075a.C29098a;
import com.squareup.p2075a.C29221f;
import com.squareup.p2075a.C29226j;
import com.squareup.p2075a.C29235p;
import com.squareup.p2075a.C29237q;
import com.squareup.p2075a.C29243t;
import com.squareup.p2075a.C29246v;
import com.squareup.p2075a.C29249x;
import com.squareup.p2075a.p2076a.C29206j;
import java.net.CookieHandler;
import java.net.ProtocolException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p4632k.AbstractC89425g;
import p4632k.AbstractC89426h;
import p4632k.AbstractC89447y;
import p4632k.C89420f;
import p4632k.C89433n;
import p4632k.C89436q;

/* renamed from: com.squareup.a.a.b.h */
public final class C29170h {

    /* renamed from: a */
    public static final AbstractC29251y f69064a = new AbstractC29251y() {
        /* class com.squareup.p2075a.p2076a.p2078b.C29170h.C291711 */

        static {
            Covode.recordClassIndex(35520);
        }

        @Override // com.squareup.p2075a.AbstractC29251y
        /* renamed from: a */
        public final long mo50878a() {
            return 0;
        }

        @Override // com.squareup.p2075a.AbstractC29251y
        /* renamed from: b */
        public final AbstractC89426h mo50879b() {
            return new C89420f();
        }
    };

    /* renamed from: b */
    public final C29243t f69065b;

    /* renamed from: c */
    public final C29185s f69066c;

    /* renamed from: d */
    public final C29249x f69067d;

    /* renamed from: e */
    public AbstractC29175j f69068e;

    /* renamed from: f */
    public long f69069f = -1;

    /* renamed from: g */
    public boolean f69070g;

    /* renamed from: h */
    public final boolean f69071h;

    /* renamed from: i */
    public final C29246v f69072i;

    /* renamed from: j */
    public C29246v f69073j;

    /* renamed from: k */
    public C29249x f69074k;

    /* renamed from: l */
    public C29249x f69075l;

    /* renamed from: m */
    public AbstractC89447y f69076m;

    /* renamed from: n */
    public AbstractC89425g f69077n;

    /* renamed from: o */
    public final boolean f69078o;

    /* renamed from: p */
    public final boolean f69079p;

    /* renamed from: q */
    public AbstractC29155b f69080q;

    /* renamed from: r */
    public C29156c f69081r;

    /* renamed from: com.squareup.a.a.b.h$a */
    public class C29173a implements AbstractC29240r.AbstractC29241a {

        /* renamed from: b */
        private final int f69088b;

        /* renamed from: c */
        private final C29246v f69089c;

        /* renamed from: d */
        private int f69090d;

        static {
            Covode.recordClassIndex(35522);
        }

        /* renamed from: a */
        private AbstractC29225i m58308a() {
            return C29170h.this.f69066c.mo50890a();
        }

        @Override // com.squareup.p2075a.AbstractC29240r.AbstractC29241a
        /* renamed from: a */
        public final C29249x mo50880a(C29246v vVar) {
            this.f69090d++;
            if (this.f69088b > 0) {
                AbstractC29240r rVar = C29170h.this.f69065b.f69318i.get(this.f69088b - 1);
                C29098a aVar = m58308a().mo50904a().f69371a;
                if (!vVar.f69338a.f69286d.equals(aVar.f68782a.f69286d) || vVar.f69338a.f69287e != aVar.f68782a.f69287e) {
                    throw new IllegalStateException("network interceptor " + rVar + " must retain the same host and port");
                } else if (this.f69090d > 1) {
                    throw new IllegalStateException("network interceptor " + rVar + " must call proceed() exactly once");
                }
            }
            if (this.f69088b < C29170h.this.f69065b.f69318i.size()) {
                C29173a aVar2 = new C29173a(this.f69088b + 1, vVar);
                AbstractC29240r rVar2 = C29170h.this.f69065b.f69318i.get(this.f69088b);
                C29249x a = rVar2.mo51004a();
                if (aVar2.f69090d != 1) {
                    throw new IllegalStateException("network interceptor " + rVar2 + " must call proceed() exactly once");
                } else if (a != null) {
                    return a;
                } else {
                    throw new NullPointerException("network interceptor " + rVar2 + " returned null");
                }
            } else {
                C29170h.this.f69068e.mo50865a(vVar);
                C29170h.this.f69073j = vVar;
                if (C29174i.m58312c(vVar.f69339b) && vVar.f69341d != null) {
                    C89436q.m155159a(C29170h.this.f69068e.mo50861a(vVar, -1)).close();
                }
                C29249x c = C29170h.this.mo50877c();
                int i = c.f69352c;
                if ((i != 204 && i != 205) || c.f69356g.mo50878a() <= 0) {
                    return c;
                }
                throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + c.f69356g.mo50878a());
            }
        }

        public C29173a(int i, C29246v vVar) {
            this.f69088b = i;
            this.f69089c = vVar;
        }
    }

    static {
        Covode.recordClassIndex(35519);
    }

    /* renamed from: a */
    public final void mo50872a() {
        if (this.f69069f == -1) {
            this.f69069f = System.currentTimeMillis();
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public final C29185s mo50875b() {
        AbstractC89425g gVar = this.f69077n;
        if (gVar != null) {
            C29206j.m58438a(gVar);
        } else {
            AbstractC89447y yVar = this.f69076m;
            if (yVar != null) {
                C29206j.m58438a(yVar);
            }
        }
        C29249x xVar = this.f69075l;
        if (xVar != null) {
            C29206j.m58438a(xVar.f69356g);
        } else {
            this.f69066c.mo50894a(true, false, true);
        }
        return this.f69066c;
    }

    /* renamed from: c */
    public final C29249x mo50877c() {
        this.f69068e.mo50866b();
        C29249x.C29250a a = this.f69068e.mo50858a();
        a.f69361a = this.f69073j;
        a.f69365e = this.f69066c.mo50890a().f69129c;
        C29249x a2 = a.mo51037a(C29176k.f69092b, Long.toString(this.f69069f)).mo51037a(C29176k.f69093c, Long.toString(System.currentTimeMillis())).mo51038a();
        if (!this.f69079p) {
            C29249x.C29250a a3 = a2.mo51030a();
            a3.f69367g = this.f69068e.mo50859a(a2);
            a2 = a3.mo51038a();
        }
        if ("close".equalsIgnoreCase(a2.f69350a.mo51016a("Connection")) || "close".equalsIgnoreCase(a2.mo51031a("Connection"))) {
            this.f69066c.mo50894a(true, false, false);
        }
        return a2;
    }

    /* renamed from: a */
    public static C29249x m58298a(C29249x xVar) {
        if (xVar == null || xVar.f69356g == null) {
            return xVar;
        }
        C29249x.C29250a a = xVar.mo51030a();
        a.f69367g = null;
        return a.mo51038a();
    }

    /* renamed from: c */
    public static boolean m58299c(C29249x xVar) {
        if (xVar.f69350a.f69339b.equals("HEAD")) {
            return false;
        }
        int i = xVar.f69352c;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && C29176k.m58320a(xVar.f69355f) == -1 && !"chunked".equalsIgnoreCase(xVar.mo51031a("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final C29249x mo50876b(C29249x xVar) {
        if (!this.f69070g || !"gzip".equalsIgnoreCase(this.f69075l.mo51031a("Content-Encoding")) || xVar.f69356g == null) {
            return xVar;
        }
        C89433n nVar = new C89433n(xVar.f69356g.mo50879b());
        C29235p a = xVar.f69355f.mo50976a().mo50986b("Content-Encoding").mo50986b("Content-Length").mo50985a();
        C29249x.C29250a a2 = xVar.mo51030a().mo51035a(a);
        a2.f69367g = new C29178l(a, C89436q.m155160a(nVar));
        return a2.mo51038a();
    }

    /* renamed from: a */
    public final void mo50873a(C29235p pVar) {
        CookieHandler cookieHandler = this.f69065b.f69320k;
        if (cookieHandler != null) {
            cookieHandler.put(this.f69072i.mo51017a(), C29176k.m58326b(pVar));
        }
    }

    /* renamed from: a */
    public final boolean mo50874a(C29237q qVar) {
        C29237q qVar2 = this.f69072i.f69338a;
        if (!qVar2.f69286d.equals(qVar.f69286d) || qVar2.f69287e != qVar.f69287e || !qVar2.f69283a.equals(qVar.f69283a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C29235p m58297a(C29235p pVar, C29235p pVar2) {
        C29235p.C29236a aVar = new C29235p.C29236a();
        int length = pVar.f69280a.length / 2;
        for (int i = 0; i < length; i++) {
            String a = pVar.mo50977a(i);
            String b = pVar.mo50979b(i);
            if ((!"Warning".equalsIgnoreCase(a) || !b.startsWith("1")) && (!C29176k.m58324a(a) || pVar2.mo50978a(a) == null)) {
                aVar.mo50984a(a, b);
            }
        }
        int length2 = pVar2.f69280a.length / 2;
        for (int i2 = 0; i2 < length2; i2++) {
            String a2 = pVar2.mo50977a(i2);
            if (!"Content-Length".equalsIgnoreCase(a2) && C29176k.m58324a(a2)) {
                aVar.mo50984a(a2, pVar2.mo50979b(i2));
            }
        }
        return aVar.mo50985a();
    }

    public C29170h(C29243t tVar, C29246v vVar, boolean z, boolean z2, boolean z3, C29185s sVar, C29181o oVar, C29249x xVar) {
        HostnameVerifier hostnameVerifier;
        C29221f fVar;
        C29185s sVar2 = sVar;
        this.f69065b = tVar;
        this.f69072i = vVar;
        this.f69071h = z;
        this.f69078o = z2;
        this.f69079p = z3;
        if (sVar2 == null) {
            C29226j jVar = tVar.f69328s;
            SSLSocketFactory sSLSocketFactory = null;
            if (vVar.f69338a.mo50990c()) {
                sSLSocketFactory = tVar.f69324o;
                hostnameVerifier = tVar.f69325p;
                fVar = tVar.f69326q;
            } else {
                hostnameVerifier = null;
                fVar = null;
            }
            sVar2 = new C29185s(jVar, new C29098a(vVar.f69338a.f69286d, vVar.f69338a.f69287e, tVar.f69329t, tVar.f69323n, sSLSocketFactory, hostnameVerifier, fVar, tVar.f69327r, tVar.f69314e, tVar.f69315f, tVar.f69316g, tVar.f69319j));
        }
        this.f69066c = sVar2;
        this.f69076m = oVar;
        this.f69067d = xVar;
    }
}
