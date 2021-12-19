package com.squareup.p2075a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.p2075a.C29228k;
import com.squareup.p2075a.C29235p;
import com.squareup.p2075a.p2076a.AbstractC29190d;
import com.squareup.p2075a.p2076a.AbstractC29197e;
import com.squareup.p2075a.p2076a.C29205i;
import com.squareup.p2075a.p2076a.C29206j;
import com.squareup.p2075a.p2076a.p2077a.C29104d;
import com.squareup.p2075a.p2076a.p2078b.C29185s;
import com.squareup.p2075a.p2076a.p2079c.C29189b;
import java.net.CookieHandler;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.squareup.a.t */
public class C29243t implements Cloneable {

    /* renamed from: A */
    private static SSLSocketFactory f69309A;

    /* renamed from: a */
    static final List<EnumC29245u> f69310a = C29206j.m58434a(EnumC29245u.HTTP_2, EnumC29245u.SPDY_3, EnumC29245u.HTTP_1_1);

    /* renamed from: b */
    static final List<C29228k> f69311b = C29206j.m58434a(C29228k.f69259a, C29228k.f69260b, C29228k.f69261c);

    /* renamed from: c */
    public final C29205i f69312c;

    /* renamed from: d */
    public C29231m f69313d;

    /* renamed from: e */
    public Proxy f69314e;

    /* renamed from: f */
    public List<EnumC29245u> f69315f;

    /* renamed from: g */
    public List<C29228k> f69316g;

    /* renamed from: h */
    public final List<AbstractC29240r> f69317h;

    /* renamed from: i */
    public final List<AbstractC29240r> f69318i;

    /* renamed from: j */
    public ProxySelector f69319j;

    /* renamed from: k */
    public CookieHandler f69320k;

    /* renamed from: l */
    public AbstractC29197e f69321l;

    /* renamed from: m */
    public C29210c f69322m;

    /* renamed from: n */
    public SocketFactory f69323n;

    /* renamed from: o */
    public SSLSocketFactory f69324o;

    /* renamed from: p */
    public HostnameVerifier f69325p;

    /* renamed from: q */
    public C29221f f69326q;

    /* renamed from: r */
    public AbstractC29209b f69327r;

    /* renamed from: s */
    public C29226j f69328s;

    /* renamed from: t */
    public AbstractC29232n f69329t;

    /* renamed from: u */
    public boolean f69330u;

    /* renamed from: v */
    public boolean f69331v;

    /* renamed from: w */
    public boolean f69332w;

    /* renamed from: x */
    public int f69333x;

    /* renamed from: y */
    public int f69334y;

    /* renamed from: z */
    public int f69335z;

    @Override // java.lang.Object
    public /* synthetic */ Object clone() {
        return new C29243t(this);
    }

    static {
        Covode.recordClassIndex(35592);
        AbstractC29190d.f69140b = new AbstractC29190d() {
            /* class com.squareup.p2075a.C29243t.C292441 */

            static {
                Covode.recordClassIndex(35593);
            }

            @Override // com.squareup.p2075a.p2076a.AbstractC29190d
            /* renamed from: a */
            public final AbstractC29197e mo50909a(C29243t tVar) {
                return tVar.f69321l;
            }

            @Override // com.squareup.p2075a.p2076a.AbstractC29190d
            /* renamed from: a */
            public final C29205i mo50910a(C29226j jVar) {
                return jVar.f69256f;
            }

            @Override // com.squareup.p2075a.p2076a.AbstractC29190d
            /* renamed from: a */
            public final void mo50912a(C29235p.C29236a aVar, String str) {
                aVar.mo50983a(str);
            }

            @Override // com.squareup.p2075a.p2076a.AbstractC29190d
            /* renamed from: a */
            public final boolean mo50913a(C29226j jVar, C29189b bVar) {
                if (!C29226j.f69251g && !Thread.holdsLock(jVar)) {
                    throw new AssertionError();
                } else if (bVar.f69135i || jVar.f69253c == 0) {
                    jVar.f69255e.remove(bVar);
                    return true;
                } else {
                    jVar.notifyAll();
                    return false;
                }
            }

            @Override // com.squareup.p2075a.p2076a.AbstractC29190d
            /* renamed from: b */
            public final void mo50914b(C29226j jVar, C29189b bVar) {
                if (C29226j.f69251g || Thread.holdsLock(jVar)) {
                    if (jVar.f69255e.isEmpty()) {
                        jVar.f69252b.execute(jVar.f69254d);
                    }
                    jVar.f69255e.add(bVar);
                    return;
                }
                throw new AssertionError();
            }

            @Override // com.squareup.p2075a.p2076a.AbstractC29190d
            /* renamed from: a */
            public final C29189b mo50908a(C29226j jVar, C29098a aVar, C29185s sVar) {
                int i;
                if (C29226j.f69251g || Thread.holdsLock(jVar)) {
                    for (C29189b bVar : jVar.f69255e) {
                        int size = bVar.f69134h.size();
                        C29104d dVar = bVar.f69130d;
                        if (dVar != null) {
                            i = dVar.mo50776a();
                        } else {
                            i = 1;
                        }
                        if (size < i && aVar.equals(bVar.f69127a.f69371a) && !bVar.f69135i) {
                            sVar.mo50892a(bVar);
                            return bVar;
                        }
                    }
                    return null;
                }
                throw new AssertionError();
            }

            @Override // com.squareup.p2075a.p2076a.AbstractC29190d
            /* renamed from: a */
            public final void mo50911a(C29228k kVar, SSLSocket sSLSocket, boolean z) {
                String[] enabledCipherSuites;
                String[] enabledProtocols;
                if (kVar.f69265f != null) {
                    enabledCipherSuites = (String[]) C29206j.m58445a(String.class, kVar.f69265f, sSLSocket.getEnabledCipherSuites());
                } else {
                    enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                }
                if (kVar.f69266g != null) {
                    enabledProtocols = (String[]) C29206j.m58445a(String.class, kVar.f69266g, sSLSocket.getEnabledProtocols());
                } else {
                    enabledProtocols = sSLSocket.getEnabledProtocols();
                }
                if (z && C29206j.m58444a(sSLSocket.getSupportedCipherSuites(), "TLS_FALLBACK_SCSV")) {
                    int length = enabledCipherSuites.length + 1;
                    String[] strArr = new String[length];
                    System.arraycopy(enabledCipherSuites, 0, strArr, 0, enabledCipherSuites.length);
                    strArr[length - 1] = "TLS_FALLBACK_SCSV";
                    enabledCipherSuites = strArr;
                }
                C29228k b = new C29228k.C29229a(kVar).mo50968a(enabledCipherSuites).mo50969b(enabledProtocols).mo50970b();
                if (b.f69266g != null) {
                    sSLSocket.setEnabledProtocols(b.f69266g);
                }
                if (b.f69265f != null) {
                    sSLSocket.setEnabledCipherSuites(b.f69265f);
                }
            }
        };
    }

    public C29243t() {
        this.f69317h = new ArrayList();
        this.f69318i = new ArrayList();
        this.f69330u = true;
        this.f69331v = true;
        this.f69332w = true;
        this.f69333x = 10000;
        this.f69334y = 10000;
        this.f69335z = 10000;
        this.f69312c = new C29205i();
        this.f69313d = new C29231m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized SSLSocketFactory mo51010a() {
        SSLSocketFactory sSLSocketFactory;
        MethodCollector.m26663i(5820);
        if (f69309A == null) {
            try {
                SSLContext instance = SSLContext.getInstance("TLS");
                instance.init(null, null, null);
                f69309A = instance.getSocketFactory();
            } catch (GeneralSecurityException unused) {
                AssertionError assertionError = new AssertionError();
                MethodCollector.m26664o(5820);
                throw assertionError;
            }
        }
        sSLSocketFactory = f69309A;
        MethodCollector.m26664o(5820);
        return sSLSocketFactory;
    }

    /* renamed from: a */
    public final C29219e mo51008a(C29246v vVar) {
        return new C29219e(this, vVar);
    }

    /* renamed from: a */
    public final C29243t mo51009a(C29210c cVar) {
        this.f69322m = cVar;
        this.f69321l = null;
        return this;
    }

    /* renamed from: b */
    public final void mo51012b(TimeUnit timeUnit) {
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(20000);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (millis == 0) {
                throw new IllegalArgumentException("Timeout too small.");
            } else {
                this.f69334y = (int) millis;
            }
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    /* renamed from: c */
    public final void mo51013c(TimeUnit timeUnit) {
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(20000);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (millis == 0) {
                throw new IllegalArgumentException("Timeout too small.");
            } else {
                this.f69335z = (int) millis;
            }
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    /* renamed from: a */
    public final void mo51011a(TimeUnit timeUnit) {
        if (timeUnit != null) {
            long millis = timeUnit.toMillis(15000);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (millis == 0) {
                throw new IllegalArgumentException("Timeout too small.");
            } else {
                this.f69333x = (int) millis;
            }
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    C29243t(C29243t tVar) {
        AbstractC29197e eVar;
        ArrayList arrayList = new ArrayList();
        this.f69317h = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f69318i = arrayList2;
        this.f69330u = true;
        this.f69331v = true;
        this.f69332w = true;
        this.f69333x = 10000;
        this.f69334y = 10000;
        this.f69335z = 10000;
        this.f69312c = tVar.f69312c;
        this.f69313d = tVar.f69313d;
        this.f69314e = tVar.f69314e;
        this.f69315f = tVar.f69315f;
        this.f69316g = tVar.f69316g;
        arrayList.addAll(tVar.f69317h);
        arrayList2.addAll(tVar.f69318i);
        this.f69319j = tVar.f69319j;
        this.f69320k = tVar.f69320k;
        C29210c cVar = tVar.f69322m;
        this.f69322m = cVar;
        if (cVar != null) {
            eVar = cVar.f69183a;
        } else {
            eVar = tVar.f69321l;
        }
        this.f69321l = eVar;
        this.f69323n = tVar.f69323n;
        this.f69324o = tVar.f69324o;
        this.f69325p = tVar.f69325p;
        this.f69326q = tVar.f69326q;
        this.f69327r = tVar.f69327r;
        this.f69328s = tVar.f69328s;
        this.f69329t = tVar.f69329t;
        this.f69330u = tVar.f69330u;
        this.f69331v = tVar.f69331v;
        this.f69332w = tVar.f69332w;
        this.f69333x = tVar.f69333x;
        this.f69334y = tVar.f69334y;
        this.f69335z = tVar.f69335z;
    }
}
