package okhttp3;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.net.monitor.C61445p;
import com.p2082ss.android.ugc.aweme.net.p3500j.C61410h;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.AbstractC90049e;
import okhttp3.AbstractC90191p;
import okhttp3.C90029ac;
import okhttp3.C90182k;
import okhttp3.C90198s;
import okhttp3.internal.AbstractC90058a;
import okhttp3.internal.C90084c;
import okhttp3.internal.p4653a.AbstractC90072f;
import okhttp3.internal.p4654b.C90076c;
import okhttp3.internal.p4654b.C90078d;
import okhttp3.internal.p4654b.C90082g;
import okhttp3.internal.p4659g.C90160f;
import okhttp3.internal.p4660h.C90161a;
import okhttp3.internal.p4661i.AbstractC90164c;
import okhttp3.internal.p4661i.C90165d;
import okhttp3.internal.p4662j.C90167a;

/* renamed from: okhttp3.y */
public class C90208y implements Cloneable, AbstractC90049e.AbstractC90050a {

    /* renamed from: a */
    static final List<EnumC90211z> f204899a = C90084c.m156411a(EnumC90211z.HTTP_2, EnumC90211z.HTTP_1_1);

    /* renamed from: b */
    static final List<C90182k> f204900b = C90084c.m156411a(C90182k.f204799b, C90182k.f204801d);

    /* renamed from: A */
    public final int f204901A;

    /* renamed from: B */
    public final int f204902B;

    /* renamed from: C */
    public final int f204903C;

    /* renamed from: D */
    public final int f204904D;

    /* renamed from: c */
    public final C90188n f204905c;

    /* renamed from: d */
    public final Proxy f204906d;

    /* renamed from: e */
    public final List<EnumC90211z> f204907e;

    /* renamed from: f */
    public final List<C90182k> f204908f;

    /* renamed from: g */
    public final List<AbstractC90202u> f204909g;

    /* renamed from: h */
    public final List<AbstractC90202u> f204910h;

    /* renamed from: i */
    public final AbstractC90191p.AbstractC90194a f204911i;

    /* renamed from: j */
    public final ProxySelector f204912j;

    /* renamed from: k */
    public final AbstractC90186m f204913k;

    /* renamed from: l */
    public final C90040c f204914l;

    /* renamed from: m */
    final AbstractC90072f f204915m;

    /* renamed from: n */
    public final SocketFactory f204916n;

    /* renamed from: o */
    public final SSLSocketFactory f204917o;

    /* renamed from: p */
    final AbstractC90164c f204918p;

    /* renamed from: q */
    public final HostnameVerifier f204919q;

    /* renamed from: r */
    public final C90052g f204920r;

    /* renamed from: s */
    public final AbstractC90038b f204921s;

    /* renamed from: t */
    public final AbstractC90038b f204922t;

    /* renamed from: u */
    public final C90180j f204923u;

    /* renamed from: v */
    public final AbstractC90189o f204924v;

    /* renamed from: w */
    public final boolean f204925w;

    /* renamed from: x */
    public final boolean f204926x;

    /* renamed from: y */
    public final boolean f204927y;

    /* renamed from: z */
    public final int f204928z;

    /* renamed from: okhttp3.y$a */
    public static final class C90210a {

        /* renamed from: A */
        int f204929A;

        /* renamed from: B */
        int f204930B;

        /* renamed from: a */
        public C90188n f204931a;

        /* renamed from: b */
        Proxy f204932b;

        /* renamed from: c */
        List<EnumC90211z> f204933c;

        /* renamed from: d */
        List<C90182k> f204934d;

        /* renamed from: e */
        public final List<AbstractC90202u> f204935e;

        /* renamed from: f */
        public final List<AbstractC90202u> f204936f;

        /* renamed from: g */
        public AbstractC90191p.AbstractC90194a f204937g;

        /* renamed from: h */
        ProxySelector f204938h;

        /* renamed from: i */
        AbstractC90186m f204939i;

        /* renamed from: j */
        C90040c f204940j;

        /* renamed from: k */
        AbstractC90072f f204941k;

        /* renamed from: l */
        SocketFactory f204942l;

        /* renamed from: m */
        public SSLSocketFactory f204943m;

        /* renamed from: n */
        public AbstractC90164c f204944n;

        /* renamed from: o */
        HostnameVerifier f204945o;

        /* renamed from: p */
        C90052g f204946p;

        /* renamed from: q */
        AbstractC90038b f204947q;

        /* renamed from: r */
        public AbstractC90038b f204948r;

        /* renamed from: s */
        public C90180j f204949s;

        /* renamed from: t */
        AbstractC90189o f204950t;

        /* renamed from: u */
        boolean f204951u;

        /* renamed from: v */
        public boolean f204952v;

        /* renamed from: w */
        public boolean f204953w;

        /* renamed from: x */
        int f204954x;

        /* renamed from: y */
        int f204955y;

        /* renamed from: z */
        int f204956z;

        static {
            Covode.recordClassIndex(106384);
        }

        /* renamed from: a */
        public final C90210a mo145087a() {
            this.f204951u = true;
            return this;
        }

        /* renamed from: b */
        public final C90210a mo145097b() {
            this.f204952v = true;
            return this;
        }

        /* renamed from: c */
        public final C90210a mo145101c() {
            this.f204953w = true;
            return this;
        }

        /* renamed from: d */
        public final C90208y mo145103d() {
            return new C90208y(this);
        }

        public C90210a() {
            this.f204935e = new ArrayList();
            this.f204936f = new ArrayList();
            this.f204931a = new C90188n();
            this.f204933c = C90208y.f204899a;
            this.f204934d = C90208y.f204900b;
            this.f204937g = AbstractC90191p.factory(AbstractC90191p.NONE);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f204938h = proxySelector;
            if (proxySelector == null) {
                this.f204938h = new C90161a();
            }
            this.f204939i = AbstractC90186m.f204834a;
            this.f204942l = SocketFactory.getDefault();
            this.f204945o = C90165d.f204723a;
            this.f204946p = C90052g.f204200a;
            this.f204947q = AbstractC90038b.f204142b;
            this.f204948r = AbstractC90038b.f204142b;
            this.f204949s = new C90180j();
            this.f204950t = AbstractC90189o.f204843d;
            this.f204951u = true;
            this.f204952v = true;
            this.f204953w = true;
            this.f204954x = 0;
            this.f204955y = 10000;
            this.f204956z = 10000;
            this.f204929A = 10000;
            this.f204930B = 0;
        }

        /* renamed from: a */
        public final C90210a mo145091a(C90040c cVar) {
            this.f204940j = cVar;
            this.f204941k = null;
            return this;
        }

        /* renamed from: b */
        public final C90210a mo145099b(List<C90182k> list) {
            this.f204934d = C90084c.m156410a(list);
            return this;
        }

        /* renamed from: a */
        public final C90210a mo145090a(SSLSocketFactory sSLSocketFactory) {
            this.f204943m = sSLSocketFactory;
            this.f204944n = C90160f.f204720c.mo144967c(sSLSocketFactory);
            return this;
        }

        /* renamed from: b */
        public final C90210a mo145100b(AbstractC90202u uVar) {
            if (uVar != null) {
                this.f204936f.add(uVar);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        /* renamed from: a */
        public final C90210a mo145092a(C90052g gVar) {
            Objects.requireNonNull(gVar, "certificatePinner == null");
            this.f204946p = gVar;
            return this;
        }

        /* renamed from: a */
        public final C90210a mo145089a(List<EnumC90211z> list) {
            ArrayList arrayList = new ArrayList(list);
            if (!arrayList.contains(EnumC90211z.H2_PRIOR_KNOWLEDGE) && !arrayList.contains(EnumC90211z.HTTP_1_1)) {
                throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: ".concat(String.valueOf(arrayList)));
            } else if (arrayList.contains(EnumC90211z.H2_PRIOR_KNOWLEDGE) && arrayList.size() > 1) {
                throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: ".concat(String.valueOf(arrayList)));
            } else if (arrayList.contains(EnumC90211z.HTTP_1_0)) {
                throw new IllegalArgumentException("protocols must not contain http/1.0: ".concat(String.valueOf(arrayList)));
            } else if (!arrayList.contains(null)) {
                arrayList.remove(EnumC90211z.SPDY_3);
                this.f204933c = Collections.unmodifiableList(arrayList);
                return this;
            } else {
                throw new IllegalArgumentException("protocols must not contain null");
            }
        }

        C90210a(C90208y yVar) {
            ArrayList arrayList = new ArrayList();
            this.f204935e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f204936f = arrayList2;
            this.f204931a = yVar.f204905c;
            this.f204932b = yVar.f204906d;
            this.f204933c = yVar.f204907e;
            this.f204934d = yVar.f204908f;
            arrayList.addAll(yVar.f204909g);
            arrayList2.addAll(yVar.f204910h);
            this.f204937g = yVar.f204911i;
            this.f204938h = yVar.f204912j;
            this.f204939i = yVar.f204913k;
            this.f204941k = yVar.f204915m;
            this.f204940j = yVar.f204914l;
            this.f204942l = yVar.f204916n;
            this.f204943m = yVar.f204917o;
            this.f204944n = yVar.f204918p;
            this.f204945o = yVar.f204919q;
            this.f204946p = yVar.f204920r;
            this.f204947q = yVar.f204921s;
            this.f204948r = yVar.f204922t;
            this.f204949s = yVar.f204923u;
            this.f204950t = yVar.f204924v;
            this.f204951u = yVar.f204925w;
            this.f204952v = yVar.f204926x;
            this.f204953w = yVar.f204927y;
            this.f204954x = yVar.f204928z;
            this.f204955y = yVar.f204901A;
            this.f204956z = yVar.f204902B;
            this.f204929A = yVar.f204903C;
            this.f204930B = yVar.f204904D;
            List<AbstractC90202u> list = this.f204935e;
            if (C61410h.m111181a().f139422a) {
                for (AbstractC90202u uVar : list) {
                    if (uVar instanceof C61445p) {
                        return;
                    }
                }
                mo145096a(new C61445p());
            }
        }

        /* renamed from: a */
        public final C90210a mo145093a(AbstractC90186m mVar) {
            Objects.requireNonNull(mVar, "cookieJar == null");
            this.f204939i = mVar;
            return this;
        }

        /* renamed from: a */
        public final C90210a mo145094a(AbstractC90189o oVar) {
            Objects.requireNonNull(oVar, "dns == null");
            this.f204950t = oVar;
            return this;
        }

        /* renamed from: a */
        public final C90210a mo145095a(AbstractC90191p pVar) {
            Objects.requireNonNull(pVar, "eventListener == null");
            this.f204937g = AbstractC90191p.factory(pVar);
            return this;
        }

        /* renamed from: a */
        public final C90210a mo145096a(AbstractC90202u uVar) {
            if (uVar != null) {
                this.f204935e.add(uVar);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        /* renamed from: a */
        public final C90210a mo145088a(long j, TimeUnit timeUnit) {
            this.f204955y = C90084c.m156404a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: b */
        public final C90210a mo145098b(long j, TimeUnit timeUnit) {
            this.f204956z = C90084c.m156404a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: c */
        public final C90210a mo145102c(long j, TimeUnit timeUnit) {
            this.f204929A = C90084c.m156404a("timeout", j, timeUnit);
            return this;
        }
    }

    /* renamed from: b */
    public final C90210a mo145086b() {
        return new C90210a(this);
    }

    public C90208y() {
        this(new C90210a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC90072f mo145085a() {
        C90040c cVar = this.f204914l;
        if (cVar != null) {
            return cVar.f204143a;
        }
        return this.f204915m;
    }

    static {
        Covode.recordClassIndex(106382);
        AbstractC90058a.f204330a = new AbstractC90058a() {
            /* class okhttp3.C90208y.C902091 */

            static {
                Covode.recordClassIndex(106383);
            }

            @Override // okhttp3.internal.AbstractC90058a
            /* renamed from: a */
            public final boolean mo144791a(C90017a aVar, C90017a aVar2) {
                return aVar.mo144701a(aVar2);
            }

            @Override // okhttp3.internal.AbstractC90058a
            /* renamed from: a */
            public final boolean mo144792a(C90180j jVar, C90076c cVar) {
                if (!C90180j.f204790g && !Thread.holdsLock(jVar)) {
                    throw new AssertionError();
                } else if (cVar.f204408h || jVar.f204791b == 0) {
                    jVar.f204793d.remove(cVar);
                    return true;
                } else {
                    jVar.notifyAll();
                    return false;
                }
            }

            @Override // okhttp3.internal.AbstractC90058a
            /* renamed from: a */
            public final int mo144781a(C90029ac.C90030a aVar) {
                return aVar.f204120c;
            }

            @Override // okhttp3.internal.AbstractC90058a
            /* renamed from: a */
            public final C90078d mo144786a(C90180j jVar) {
                return jVar.f204794e;
            }

            @Override // okhttp3.internal.AbstractC90058a
            /* renamed from: a */
            public final C90082g mo144787a(AbstractC90049e eVar) {
                return ((C90022aa) eVar).f204087b.f204490a;
            }

            @Override // okhttp3.internal.AbstractC90058a
            /* renamed from: a */
            public final IOException mo144782a(AbstractC90049e eVar, IOException iOException) {
                return ((C90022aa) eVar).mo144706a(iOException);
            }

            @Override // okhttp3.internal.AbstractC90058a
            /* renamed from: a */
            public final AbstractC90049e mo144784a(C90208y yVar, Request request) {
                return C90022aa.m156235a(yVar, request, true);
            }

            @Override // okhttp3.internal.AbstractC90058a
            /* renamed from: b */
            public final void mo144793b(C90180j jVar, C90076c cVar) {
                if (C90180j.f204790g || Thread.holdsLock(jVar)) {
                    if (!jVar.f204795f) {
                        jVar.f204795f = true;
                        C90180j.f204789a.execute(jVar.f204792c);
                    }
                    jVar.f204793d.add(cVar);
                    return;
                }
                throw new AssertionError();
            }

            @Override // okhttp3.internal.AbstractC90058a
            /* renamed from: a */
            public final void mo144789a(C90198s.C90199a aVar, String str) {
                aVar.mo145038a(str);
            }

            @Override // okhttp3.internal.AbstractC90058a
            /* renamed from: a */
            public final Socket mo144783a(C90180j jVar, C90017a aVar, C90082g gVar) {
                if (C90180j.f204790g || Thread.holdsLock(jVar)) {
                    for (C90076c cVar : jVar.f204793d) {
                        if (cVar.mo144820a(aVar, null) && cVar.mo144823d() && cVar != gVar.mo144841b()) {
                            if (!C90082g.f204430i && !Thread.holdsLock(gVar.f204433c)) {
                                throw new AssertionError();
                            } else if (gVar.f204438h == null && gVar.f204436f.f204411k.size() == 1) {
                                Reference<C90082g> reference = gVar.f204436f.f204411k.get(0);
                                Socket a = gVar.mo144835a(true, false, false);
                                gVar.f204436f = cVar;
                                cVar.f204411k.add(reference);
                                return a;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                    }
                    return null;
                }
                throw new AssertionError();
            }

            @Override // okhttp3.internal.AbstractC90058a
            /* renamed from: a */
            public final void mo144788a(C90182k kVar, SSLSocket sSLSocket, boolean z) {
                String[] enabledCipherSuites;
                String[] enabledProtocols;
                if (kVar.f204806g != null) {
                    enabledCipherSuites = C90084c.m156421a(C90055h.f204234a, sSLSocket.getEnabledCipherSuites(), kVar.f204806g);
                } else {
                    enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
                }
                if (kVar.f204807h != null) {
                    enabledProtocols = C90084c.m156421a(C90084c.f204453h, sSLSocket.getEnabledProtocols(), kVar.f204807h);
                } else {
                    enabledProtocols = sSLSocket.getEnabledProtocols();
                }
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                Comparator<String> comparator = C90055h.f204234a;
                int length = supportedCipherSuites.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (comparator.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (z && i != -1) {
                    String str = supportedCipherSuites[i];
                    int length2 = enabledCipherSuites.length + 1;
                    String[] strArr = new String[length2];
                    System.arraycopy(enabledCipherSuites, 0, strArr, 0, enabledCipherSuites.length);
                    strArr[length2 - 1] = str;
                    enabledCipherSuites = strArr;
                }
                C90182k b = new C90182k.C90183a(kVar).mo145003a(enabledCipherSuites).mo145006b(enabledProtocols).mo145007b();
                if (b.f204807h != null) {
                    sSLSocket.setEnabledProtocols(b.f204807h);
                }
                if (b.f204806g != null) {
                    sSLSocket.setEnabledCipherSuites(b.f204806g);
                }
            }

            @Override // okhttp3.internal.AbstractC90058a
            /* renamed from: a */
            public final void mo144790a(C90198s.C90199a aVar, String str, String str2) {
                aVar.mo145044c(str, str2);
            }

            @Override // okhttp3.internal.AbstractC90058a
            /* renamed from: a */
            public final C90076c mo144785a(C90180j jVar, C90017a aVar, C90082g gVar, C90034ae aeVar) {
                if (C90180j.f204790g || Thread.holdsLock(jVar)) {
                    for (C90076c cVar : jVar.f204793d) {
                        if (cVar.mo144820a(aVar, aeVar)) {
                            gVar.mo144839a(cVar, true);
                            return cVar;
                        }
                    }
                    return null;
                }
                throw new AssertionError();
            }
        };
    }

    @Override // okhttp3.AbstractC90049e.AbstractC90050a
    /* renamed from: a */
    public final AbstractC90049e mo144767a(Request request) {
        return C90022aa.m156235a(this, request, false);
    }

    /* renamed from: a */
    private static SSLSocketFactory m156856a(X509TrustManager x509TrustManager) {
        try {
            SSLContext b = C90160f.f204720c.mo144950b();
            b.init(null, new TrustManager[]{x509TrustManager}, null);
            return b.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw C90084c.m156405a("No System TLS", (Exception) e);
        }
    }

    C90208y(C90210a aVar) {
        boolean z;
        this.f204905c = aVar.f204931a;
        this.f204906d = aVar.f204932b;
        this.f204907e = aVar.f204933c;
        List<C90182k> list = aVar.f204934d;
        this.f204908f = list;
        this.f204909g = C90084c.m156410a(aVar.f204935e);
        this.f204910h = C90084c.m156410a(aVar.f204936f);
        this.f204911i = aVar.f204937g;
        this.f204912j = aVar.f204938h;
        this.f204913k = aVar.f204939i;
        this.f204914l = aVar.f204940j;
        this.f204915m = aVar.f204941k;
        this.f204916n = aVar.f204942l;
        Iterator<C90182k> it = list.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C90182k next = it.next();
                if (z || next.f204804e) {
                    z = true;
                }
            }
        }
        if (aVar.f204943m != null || !z) {
            this.f204917o = aVar.f204943m;
            this.f204918p = aVar.f204944n;
        } else {
            X509TrustManager a = C90084c.m156413a();
            this.f204917o = m156856a(a);
            this.f204918p = C90160f.f204720c.mo144945a(a);
        }
        if (this.f204917o != null) {
            C90160f.f204720c.mo144961b(this.f204917o);
        }
        this.f204919q = aVar.f204945o;
        C90052g gVar = aVar.f204946p;
        AbstractC90164c cVar = this.f204918p;
        this.f204920r = !C90084c.m156418a(gVar.f204202c, cVar) ? new C90052g(gVar.f204201b, cVar) : gVar;
        this.f204921s = aVar.f204947q;
        this.f204922t = aVar.f204948r;
        this.f204923u = aVar.f204949s;
        this.f204924v = aVar.f204950t;
        this.f204925w = aVar.f204951u;
        this.f204926x = aVar.f204952v;
        this.f204927y = aVar.f204953w;
        this.f204928z = aVar.f204954x;
        this.f204901A = aVar.f204955y;
        this.f204902B = aVar.f204956z;
        this.f204903C = aVar.f204929A;
        this.f204904D = aVar.f204930B;
        if (this.f204909g.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f204909g);
        } else if (this.f204910h.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f204910h);
        }
    }

    /* renamed from: a */
    public final AbstractC90036ag mo145084a(Request request, AbstractC90037ah ahVar) {
        C90167a aVar = new C90167a(request, ahVar, new Random(), (long) this.f204904D);
        aVar.mo144981a(this);
        return aVar;
    }
}
