package okhttp3;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.C90029ac;
import okhttp3.C90198s;
import okhttp3.Request;
import okhttp3.internal.C90084c;
import okhttp3.internal.p4653a.AbstractC90061b;
import okhttp3.internal.p4653a.AbstractC90072f;
import okhttp3.internal.p4653a.C90062c;
import okhttp3.internal.p4653a.C90064d;
import okhttp3.internal.p4655c.C90093e;
import okhttp3.internal.p4655c.C90094f;
import okhttp3.internal.p4655c.C90099k;
import okhttp3.internal.p4658f.AbstractC90149a;
import p4632k.AbstractC89408aa;
import p4632k.AbstractC89425g;
import p4632k.AbstractC89426h;
import p4632k.AbstractC89430k;
import p4632k.AbstractC89431l;
import p4632k.AbstractC89447y;
import p4632k.C89420f;
import p4632k.C89427i;
import p4632k.C89436q;

/* renamed from: okhttp3.c */
public final class C90040c implements Closeable, Flushable {

    /* renamed from: a */
    final AbstractC90072f f204143a;

    /* renamed from: b */
    final C90064d f204144b;

    /* renamed from: c */
    int f204145c;

    /* renamed from: d */
    int f204146d;

    /* renamed from: e */
    private int f204147e;

    /* renamed from: f */
    private int f204148f;

    /* renamed from: g */
    private int f204149g;

    static {
        Covode.recordClassIndex(106212);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: okhttp3.c$a */
    public final class C90042a implements AbstractC90061b {

        /* renamed from: a */
        boolean f204151a;

        /* renamed from: c */
        private final C90064d.C90067a f204153c;

        /* renamed from: d */
        private AbstractC89447y f204154d;

        /* renamed from: e */
        private AbstractC89447y f204155e;

        static {
            Covode.recordClassIndex(106214);
        }

        @Override // okhttp3.internal.p4653a.AbstractC90061b
        /* renamed from: b */
        public final AbstractC89447y mo144762b() {
            return this.f204155e;
        }

        @Override // okhttp3.internal.p4653a.AbstractC90061b
        /* renamed from: a */
        public final void mo144761a() {
            MethodCollector.m26663i(6173);
            synchronized (C90040c.this) {
                try {
                    if (!this.f204151a) {
                        this.f204151a = true;
                        C90040c.this.f204146d++;
                        C90084c.m156415a(this.f204154d);
                        try {
                            this.f204153c.mo144809c();
                            MethodCollector.m26664o(6173);
                        } catch (IOException unused) {
                            MethodCollector.m26664o(6173);
                        }
                    }
                } finally {
                    MethodCollector.m26664o(6173);
                }
            }
        }

        C90042a(final C90064d.C90067a aVar) {
            this.f204153c = aVar;
            this.f204154d = aVar.mo144806a(1);
            this.f204155e = new AbstractC89430k(this.f204154d, C90040c.this) {
                /* class okhttp3.C90040c.C90042a.C900431 */

                static {
                    Covode.recordClassIndex(106215);
                }

                @Override // p4632k.AbstractC89447y, java.io.Closeable, p4632k.AbstractC89430k, java.lang.AutoCloseable
                public final void close() {
                    MethodCollector.m26663i(9671);
                    synchronized (C90040c.this) {
                        try {
                            if (!C90042a.this.f204151a) {
                                C90042a.this.f204151a = true;
                                C90040c.this.f204145c++;
                                super.close();
                                aVar.mo144808b();
                                MethodCollector.m26664o(9671);
                            }
                        } finally {
                            MethodCollector.m26664o(9671);
                        }
                    }
                }
            };
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: okhttp3.c$b */
    public static class C90044b extends AbstractC90031ad {

        /* renamed from: a */
        final C90064d.C90070c f204159a;

        /* renamed from: b */
        private final AbstractC89426h f204160b;

        /* renamed from: c */
        private final String f204161c;

        /* renamed from: d */
        private final String f204162d;

        static {
            Covode.recordClassIndex(106216);
        }

        @Override // okhttp3.AbstractC90031ad
        public final AbstractC89426h source() {
            return this.f204160b;
        }

        @Override // okhttp3.AbstractC90031ad
        public final long contentLength() {
            try {
                String str = this.f204162d;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        @Override // okhttp3.AbstractC90031ad
        public final C90204w contentType() {
            String str = this.f204161c;
            if (str != null) {
                return C90204w.m156843b(str);
            }
            return null;
        }

        C90044b(final C90064d.C90070c cVar, String str, String str2) {
            this.f204159a = cVar;
            this.f204161c = str;
            this.f204162d = str2;
            this.f204160b = C89436q.m155160a(new AbstractC89431l(cVar.f204391c[1]) {
                /* class okhttp3.C90040c.C90044b.C900451 */

                static {
                    Covode.recordClassIndex(106217);
                }

                @Override // p4632k.AbstractC89408aa, java.io.Closeable, p4632k.AbstractC89431l, java.lang.AutoCloseable
                public final void close() {
                    cVar.close();
                    super.close();
                }
            });
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f204144b.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f204144b.flush();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: okhttp3.c$c */
    public static final class C90046c {

        /* renamed from: k */
        private static final String f204165k = "OkHttp-Sent-Millis";

        /* renamed from: l */
        private static final String f204166l = "OkHttp-Received-Millis";

        /* renamed from: a */
        final String f204167a;

        /* renamed from: b */
        final C90198s f204168b;

        /* renamed from: c */
        final String f204169c;

        /* renamed from: d */
        final EnumC90211z f204170d;

        /* renamed from: e */
        final int f204171e;

        /* renamed from: f */
        final String f204172f;

        /* renamed from: g */
        final C90198s f204173g;

        /* renamed from: h */
        final C90197r f204174h;

        /* renamed from: i */
        final long f204175i;

        /* renamed from: j */
        final long f204176j;

        static {
            Covode.recordClassIndex(106218);
        }

        /* renamed from: a */
        private boolean m156286a() {
            return this.f204167a.startsWith("https://");
        }

        C90046c(C90029ac acVar) {
            this.f204167a = acVar.f204105a.url().toString();
            this.f204168b = C90093e.m156444a(acVar.f204112h.f204105a.headers(), acVar.f204110f);
            this.f204169c = acVar.f204105a.method();
            this.f204170d = acVar.f204106b;
            this.f204171e = acVar.f204107c;
            this.f204172f = acVar.f204108d;
            this.f204173g = acVar.f204110f;
            this.f204174h = acVar.f204109e;
            this.f204175i = acVar.f204115k;
            this.f204176j = acVar.f204116l;
        }

        /* renamed from: a */
        private static List<Certificate> m156284a(AbstractC89426h hVar) {
            int a = C90040c.m156268a(hVar);
            if (a == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(a);
                for (int i = 0; i < a; i++) {
                    String s = hVar.mo143850s();
                    C89420f fVar = new C89420f();
                    fVar.mo68850a(C89427i.decodeBase64(s));
                    arrayList.add(instance.generateCertificate(fVar.mo143819f()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        C90046c(AbstractC89408aa aaVar) {
            long j;
            EnumC90035af afVar;
            try {
                AbstractC89426h a = C89436q.m155160a(aaVar);
                this.f204167a = a.mo143850s();
                this.f204169c = a.mo143850s();
                C90198s.C90199a aVar = new C90198s.C90199a();
                int a2 = C90040c.m156268a(a);
                for (int i = 0; i < a2; i++) {
                    aVar.mo145038a(a.mo143850s());
                }
                this.f204168b = aVar.mo145040a();
                C90099k a3 = C90099k.m156466a(a.mo143850s());
                this.f204170d = a3.f204495a;
                this.f204171e = a3.f204496b;
                this.f204172f = a3.f204497c;
                C90198s.C90199a aVar2 = new C90198s.C90199a();
                int a4 = C90040c.m156268a(a);
                for (int i2 = 0; i2 < a4; i2++) {
                    aVar2.mo145038a(a.mo143850s());
                }
                String str = f204165k;
                String c = aVar2.mo145043c(str);
                String str2 = f204166l;
                String c2 = aVar2.mo145043c(str2);
                aVar2.mo145041b(str);
                aVar2.mo145041b(str2);
                long j2 = 0;
                if (c != null) {
                    j = Long.parseLong(c);
                } else {
                    j = 0;
                }
                this.f204175i = j;
                this.f204176j = c2 != null ? Long.parseLong(c2) : j2;
                this.f204173g = aVar2.mo145040a();
                if (m156286a()) {
                    String s = a.mo143850s();
                    if (s.length() <= 0) {
                        C90055h a5 = C90055h.m156303a(a.mo143850s());
                        List<Certificate> a6 = m156284a(a);
                        List<Certificate> a7 = m156284a(a);
                        if (!a.mo143815e()) {
                            afVar = EnumC90035af.forJavaName(a.mo143850s());
                        } else {
                            afVar = EnumC90035af.SSL_3_0;
                        }
                        if (afVar == null) {
                            throw new NullPointerException("tlsVersion == null");
                        } else if (a5 != null) {
                            this.f204174h = new C90197r(afVar, a5, C90084c.m156410a(a6), C90084c.m156410a(a7));
                        } else {
                            throw new NullPointerException("cipherSuite == null");
                        }
                    } else {
                        throw new IOException("expected \"\" but was \"" + s + "\"");
                    }
                } else {
                    this.f204174h = null;
                }
            } finally {
                aaVar.close();
            }
        }

        /* renamed from: a */
        public final void mo144763a(C90064d.C90067a aVar) {
            AbstractC89425g a = C89436q.m155159a(aVar.mo144806a(0));
            a.mo68849a(this.f204167a).mo68847a(10);
            a.mo68849a(this.f204169c).mo68847a(10);
            a.mo68855b((long) (this.f204168b.f204855a.length / 2)).mo68847a(10);
            int length = this.f204168b.f204855a.length / 2;
            for (int i = 0; i < length; i++) {
                a.mo68849a(this.f204168b.mo145027a(i)).mo68849a(": ").mo68849a(this.f204168b.mo145031b(i)).mo68847a(10);
            }
            a.mo68849a(new C90099k(this.f204170d, this.f204171e, this.f204172f).toString()).mo68847a(10);
            a.mo68855b((long) ((this.f204173g.f204855a.length / 2) + 2)).mo68847a(10);
            int length2 = this.f204173g.f204855a.length / 2;
            for (int i2 = 0; i2 < length2; i2++) {
                a.mo68849a(this.f204173g.mo145027a(i2)).mo68849a(": ").mo68849a(this.f204173g.mo145031b(i2)).mo68847a(10);
            }
            a.mo68849a(f204165k).mo68849a(": ").mo68855b(this.f204175i).mo68847a(10);
            a.mo68849a(f204166l).mo68849a(": ").mo68855b(this.f204176j).mo68847a(10);
            if (m156286a()) {
                a.mo68847a(10);
                a.mo68849a(this.f204174h.f204852b.f204329bq).mo68847a(10);
                m156285a(a, this.f204174h.f204853c);
                m156285a(a, this.f204174h.f204854d);
                a.mo68849a(this.f204174h.f204851a.javaName()).mo68847a(10);
            }
            a.close();
        }

        /* renamed from: a */
        private static void m156285a(AbstractC89425g gVar, List<Certificate> list) {
            try {
                gVar.mo68855b((long) list.size()).mo68847a(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    gVar.mo68849a(C89427i.m155136of(list.get(i).getEncoded()).base64()).mo68847a(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo144750a() {
        MethodCollector.m26663i(10748);
        this.f204148f++;
        MethodCollector.m26664o(10748);
    }

    public C90040c(File file) {
        this(file, AbstractC90149a.f204692a);
    }

    /* renamed from: a */
    static void m156270a(C90064d.C90067a aVar) {
        if (aVar != null) {
            try {
                aVar.mo144809c();
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo144752b(Request request) {
        this.f204144b.mo144800b(m156269a(request.url()));
    }

    /* renamed from: a */
    private static String m156269a(C90200t tVar) {
        return C89427i.encodeUtf8(tVar.toString()).md5().hex();
    }

    /* renamed from: a */
    static int m156268a(AbstractC89426h hVar) {
        try {
            long o = hVar.mo143843o();
            String s = hVar.mo143850s();
            if (o >= 0 && o <= 2147483647L && s.isEmpty()) {
                return (int) o;
            }
            throw new IOException("expected an int but was \"" + o + s + "\"");
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C90029ac mo144748a(Request request) {
        boolean z;
        try {
            C90064d.C90070c a = this.f204144b.mo144795a(m156269a(request.url()));
            if (a == null) {
                return null;
            }
            try {
                boolean z2 = false;
                C90046c cVar = new C90046c(a.f204391c[0]);
                String a2 = cVar.f204173g.mo145028a("Content-Type");
                String a3 = cVar.f204173g.mo145028a("Content-Length");
                Request a4 = new Request.C90016a().mo144691a(cVar.f204167a).mo144693a(cVar.f204169c, (AbstractC90025ab) null).mo144696a(cVar.f204168b).mo144698a();
                C90029ac.C90030a aVar = new C90029ac.C90030a();
                aVar.f204118a = a4;
                aVar.f204119b = cVar.f204170d;
                aVar.f204120c = cVar.f204171e;
                aVar.f204121d = cVar.f204172f;
                C90029ac.C90030a a5 = aVar.mo144728a(cVar.f204173g);
                a5.f204124g = new C90044b(a, a2, a3);
                a5.f204122e = cVar.f204174h;
                a5.f204128k = cVar.f204175i;
                a5.f204129l = cVar.f204176j;
                C90029ac a6 = a5.mo144729a();
                if (cVar.f204167a.equals(request.url().toString()) && cVar.f204169c.equals(request.method())) {
                    C90198s sVar = cVar.f204168b;
                    Iterator<String> it = C90093e.m156447b(a6.f204110f).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        String next = it.next();
                        if (!C90084c.m156418a(sVar.mo145032b(next), request.headers(next))) {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        z2 = true;
                    }
                }
                if (z2) {
                    return a6;
                }
                C90084c.m156415a(a6.f204111g);
                return null;
            } catch (IOException unused) {
                C90084c.m156415a(a);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC90061b mo144749a(C90029ac acVar) {
        C90064d.C90067a aVar;
        String method = acVar.f204105a.method();
        if (C90094f.m156448a(acVar.f204105a.method())) {
            try {
                mo144752b(acVar.f204105a);
            } catch (IOException unused) {
            }
            return null;
        } else if (!method.equals("GET") || C90093e.m156447b(acVar.f204110f).contains("*")) {
            return null;
        } else {
            C90046c cVar = new C90046c(acVar);
            try {
                aVar = this.f204144b.mo144794a(m156269a(acVar.f204105a.url()), -1);
                if (aVar == null) {
                    return null;
                }
                try {
                    cVar.mo144763a(aVar);
                    return new C90042a(aVar);
                } catch (IOException unused2) {
                    m156270a(aVar);
                    return null;
                }
            } catch (IOException unused3) {
                aVar = null;
                m156270a(aVar);
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo144751a(C90062c cVar) {
        MethodCollector.m26663i(10747);
        this.f204149g++;
        if (cVar.f204337a != null) {
            this.f204147e++;
            MethodCollector.m26664o(10747);
            return;
        }
        if (cVar.f204338b != null) {
            this.f204148f++;
        }
        MethodCollector.m26664o(10747);
    }

    private C90040c(File file, AbstractC90149a aVar) {
        this.f204143a = new AbstractC90072f() {
            /* class okhttp3.C90040c.C900411 */

            static {
                Covode.recordClassIndex(106213);
            }

            @Override // okhttp3.internal.p4653a.AbstractC90072f
            /* renamed from: a */
            public final void mo144757a() {
                C90040c.this.mo144750a();
            }

            @Override // okhttp3.internal.p4653a.AbstractC90072f
            /* renamed from: a */
            public final C90029ac mo144755a(Request request) {
                return C90040c.this.mo144748a(request);
            }

            @Override // okhttp3.internal.p4653a.AbstractC90072f
            /* renamed from: b */
            public final void mo144760b(Request request) {
                C90040c.this.mo144752b(request);
            }

            @Override // okhttp3.internal.p4653a.AbstractC90072f
            /* renamed from: a */
            public final AbstractC90061b mo144756a(C90029ac acVar) {
                return C90040c.this.mo144749a(acVar);
            }

            @Override // okhttp3.internal.p4653a.AbstractC90072f
            /* renamed from: a */
            public final void mo144759a(C90062c cVar) {
                C90040c.this.mo144751a(cVar);
            }

            @Override // okhttp3.internal.p4653a.AbstractC90072f
            /* renamed from: a */
            public final void mo144758a(C90029ac acVar, C90029ac acVar2) {
                C90064d.C90067a aVar;
                C90046c cVar = new C90046c(acVar2);
                C90064d.C90070c cVar2 = ((C90044b) acVar.f204111g).f204159a;
                try {
                    aVar = C90064d.this.mo144794a(cVar2.f204389a, cVar2.f204390b);
                    if (aVar != null) {
                        try {
                            cVar.mo144763a(aVar);
                            aVar.mo144808b();
                        } catch (IOException unused) {
                            C90040c.m156270a(aVar);
                        }
                    }
                } catch (IOException unused2) {
                    aVar = null;
                    C90040c.m156270a(aVar);
                }
            }
        };
        this.f204144b = new C90064d(aVar, file, 1048576, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C90084c.m156412a("OkHttp DiskLruCache", true)));
    }
}
