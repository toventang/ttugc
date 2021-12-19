package com.squareup.p2075a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.squareup.p2075a.C29235p;
import com.squareup.p2075a.C29246v;
import com.squareup.p2075a.C29249x;
import com.squareup.p2075a.p2076a.AbstractC29197e;
import com.squareup.p2075a.p2076a.C29146b;
import com.squareup.p2075a.p2076a.C29206j;
import com.squareup.p2075a.p2076a.p2078b.AbstractC29155b;
import com.squareup.p2075a.p2076a.p2078b.C29156c;
import com.squareup.p2075a.p2076a.p2078b.C29174i;
import com.squareup.p2075a.p2076a.p2078b.C29176k;
import com.squareup.p2075a.p2076a.p2078b.C29184r;
import com.squareup.p2075a.p2076a.p2079c.AbstractC29187a;
import java.io.File;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p4632k.AbstractC89408aa;
import p4632k.AbstractC89425g;
import p4632k.AbstractC89426h;
import p4632k.AbstractC89430k;
import p4632k.AbstractC89431l;
import p4632k.AbstractC89447y;
import p4632k.C89420f;
import p4632k.C89427i;
import p4632k.C89436q;

/* renamed from: com.squareup.a.c */
public final class C29210c {

    /* renamed from: a */
    final AbstractC29197e f69183a;

    /* renamed from: b */
    public final C29146b f69184b;

    /* renamed from: c */
    public int f69185c;

    /* renamed from: d */
    public int f69186d;

    /* renamed from: e */
    private int f69187e;

    /* renamed from: f */
    private int f69188f;

    /* renamed from: g */
    private int f69189g;

    static {
        Covode.recordClassIndex(35559);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.a.c$a */
    public final class C29212a implements AbstractC29155b {

        /* renamed from: a */
        public boolean f69191a;

        /* renamed from: c */
        private final C29146b.C29150a f69193c;

        /* renamed from: d */
        private AbstractC89447y f69194d;

        /* renamed from: e */
        private AbstractC89447y f69195e;

        static {
            Covode.recordClassIndex(35561);
        }

        @Override // com.squareup.p2075a.p2076a.p2078b.AbstractC29155b
        /* renamed from: b */
        public final AbstractC89447y mo50857b() {
            return this.f69195e;
        }

        @Override // com.squareup.p2075a.p2076a.p2078b.AbstractC29155b
        /* renamed from: a */
        public final void mo50856a() {
            MethodCollector.m26663i(5979);
            synchronized (C29210c.this) {
                try {
                    if (!this.f69191a) {
                        this.f69191a = true;
                        C29210c.this.f69186d++;
                        C29206j.m58438a(this.f69194d);
                        try {
                            this.f69193c.mo50849b();
                            MethodCollector.m26664o(5979);
                        } catch (IOException unused) {
                            MethodCollector.m26664o(5979);
                        }
                    }
                } finally {
                    MethodCollector.m26664o(5979);
                }
            }
        }

        public C29212a(final C29146b.C29150a aVar) {
            this.f69193c = aVar;
            this.f69194d = aVar.mo50847a(1);
            this.f69195e = new AbstractC89430k(this.f69194d, C29210c.this) {
                /* class com.squareup.p2075a.C29210c.C29212a.C292131 */

                static {
                    Covode.recordClassIndex(35562);
                }

                @Override // p4632k.AbstractC89447y, java.io.Closeable, p4632k.AbstractC89430k, java.lang.AutoCloseable
                public final void close() {
                    MethodCollector.m26663i(3043);
                    synchronized (C29210c.this) {
                        try {
                            if (!C29212a.this.f69191a) {
                                C29212a.this.f69191a = true;
                                C29210c.this.f69185c++;
                                super.close();
                                aVar.mo50848a();
                                MethodCollector.m26664o(3043);
                            }
                        } finally {
                            MethodCollector.m26664o(3043);
                        }
                    }
                }
            };
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.a.c$b */
    public static class C29214b extends AbstractC29251y {

        /* renamed from: a */
        public final C29146b.C29153c f69199a;

        /* renamed from: b */
        private final AbstractC89426h f69200b;

        /* renamed from: c */
        private final String f69201c;

        /* renamed from: d */
        private final String f69202d;

        static {
            Covode.recordClassIndex(35563);
        }

        @Override // com.squareup.p2075a.AbstractC29251y
        /* renamed from: b */
        public final AbstractC89426h mo50879b() {
            return this.f69200b;
        }

        @Override // com.squareup.p2075a.AbstractC29251y
        /* renamed from: a */
        public final long mo50878a() {
            try {
                String str = this.f69202d;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        public C29214b(final C29146b.C29153c cVar, String str, String str2) {
            this.f69199a = cVar;
            this.f69201c = str;
            this.f69202d = str2;
            this.f69200b = C89436q.m155160a(new AbstractC89431l(cVar.f69002c[1]) {
                /* class com.squareup.p2075a.C29210c.C29214b.C292151 */

                static {
                    Covode.recordClassIndex(35564);
                }

                @Override // p4632k.AbstractC89408aa, java.io.Closeable, p4632k.AbstractC89431l, java.lang.AutoCloseable
                public final void close() {
                    cVar.close();
                    super.close();
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.a.c$c */
    public static final class C29216c {

        /* renamed from: a */
        final String f69205a;

        /* renamed from: b */
        final C29235p f69206b;

        /* renamed from: c */
        final String f69207c;

        /* renamed from: d */
        final EnumC29245u f69208d;

        /* renamed from: e */
        final int f69209e;

        /* renamed from: f */
        final String f69210f;

        /* renamed from: g */
        final C29235p f69211g;

        /* renamed from: h */
        final C29234o f69212h;

        static {
            Covode.recordClassIndex(35565);
        }

        /* renamed from: a */
        private boolean m58469a() {
            return this.f69205a.startsWith("https://");
        }

        public C29216c(C29249x xVar) {
            this.f69205a = xVar.f69350a.f69338a.toString();
            this.f69206b = C29176k.m58321a(xVar.f69357h.f69350a.f69340c, xVar.f69355f);
            this.f69207c = xVar.f69350a.f69339b;
            this.f69208d = xVar.f69351b;
            this.f69209e = xVar.f69352c;
            this.f69210f = xVar.f69353d;
            this.f69211g = xVar.f69355f;
            this.f69212h = xVar.f69354e;
        }

        /* renamed from: a */
        private static List<Certificate> m58467a(AbstractC89426h hVar) {
            int a = C29210c.m58449a(hVar);
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

        public C29216c(AbstractC89408aa aaVar) {
            try {
                AbstractC89426h a = C89436q.m155160a(aaVar);
                this.f69205a = a.mo143850s();
                this.f69207c = a.mo143850s();
                C29235p.C29236a aVar = new C29235p.C29236a();
                int a2 = C29210c.m58449a(a);
                for (int i = 0; i < a2; i++) {
                    aVar.mo50983a(a.mo143850s());
                }
                this.f69206b = aVar.mo50985a();
                C29184r a3 = C29184r.m58339a(a.mo143850s());
                this.f69208d = a3.f69113a;
                this.f69209e = a3.f69114b;
                this.f69210f = a3.f69115c;
                C29235p.C29236a aVar2 = new C29235p.C29236a();
                int a4 = C29210c.m58449a(a);
                for (int i2 = 0; i2 < a4; i2++) {
                    aVar2.mo50983a(a.mo143850s());
                }
                this.f69211g = aVar2.mo50985a();
                if (m58469a()) {
                    String s = a.mo143850s();
                    if (s.length() <= 0) {
                        String s2 = a.mo143850s();
                        List<Certificate> a5 = m58467a(a);
                        List<Certificate> a6 = m58467a(a);
                        if (s2 != null) {
                            this.f69212h = new C29234o(s2, C29206j.m58433a(a5), C29206j.m58433a(a6));
                        } else {
                            throw new IllegalArgumentException("cipherSuite == null");
                        }
                    } else {
                        throw new IOException("expected \"\" but was \"" + s + "\"");
                    }
                } else {
                    this.f69212h = null;
                }
            } finally {
                aaVar.close();
            }
        }

        /* renamed from: a */
        public final void mo50949a(C29146b.C29150a aVar) {
            AbstractC89425g a = C89436q.m155159a(aVar.mo50847a(0));
            a.mo68849a(this.f69205a);
            a.mo68847a(10);
            a.mo68849a(this.f69207c);
            a.mo68847a(10);
            a.mo68855b((long) (this.f69206b.f69280a.length / 2));
            a.mo68847a(10);
            int length = this.f69206b.f69280a.length / 2;
            for (int i = 0; i < length; i++) {
                a.mo68849a(this.f69206b.mo50977a(i));
                a.mo68849a(": ");
                a.mo68849a(this.f69206b.mo50979b(i));
                a.mo68847a(10);
            }
            a.mo68849a(new C29184r(this.f69208d, this.f69209e, this.f69210f).toString());
            a.mo68847a(10);
            a.mo68855b((long) (this.f69211g.f69280a.length / 2));
            a.mo68847a(10);
            int length2 = this.f69211g.f69280a.length / 2;
            for (int i2 = 0; i2 < length2; i2++) {
                a.mo68849a(this.f69211g.mo50977a(i2));
                a.mo68849a(": ");
                a.mo68849a(this.f69211g.mo50979b(i2));
                a.mo68847a(10);
            }
            if (m58469a()) {
                a.mo68847a(10);
                a.mo68849a(this.f69212h.f69277a);
                a.mo68847a(10);
                m58468a(a, this.f69212h.f69278b);
                m58468a(a, this.f69212h.f69279c);
            }
            a.close();
        }

        /* renamed from: a */
        private static void m58468a(AbstractC89425g gVar, List<Certificate> list) {
            try {
                gVar.mo68855b((long) list.size());
                gVar.mo68847a(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    gVar.mo68849a(C89427i.m155136of(list.get(i).getEncoded()).base64());
                    gVar.mo68847a(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo50946a() {
        MethodCollector.m26663i(4247);
        this.f69188f++;
        MethodCollector.m26664o(4247);
    }

    /* renamed from: a */
    static void m58450a(C29146b.C29150a aVar) {
        if (aVar != null) {
            try {
                aVar.mo50849b();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    private static String m58451c(C29246v vVar) {
        return C29206j.m58432a(vVar.f69338a.toString());
    }

    /* renamed from: b */
    public final void mo50948b(C29246v vVar) {
        this.f69184b.mo50842b(m58451c(vVar));
    }

    /* renamed from: a */
    public final synchronized void mo50947a(C29156c cVar) {
        MethodCollector.m26663i(4130);
        this.f69189g++;
        if (cVar.f69006a != null) {
            this.f69187e++;
            MethodCollector.m26664o(4130);
            return;
        }
        if (cVar.f69007b != null) {
            this.f69188f++;
        }
        MethodCollector.m26664o(4130);
    }

    /* renamed from: a */
    public static int m58449a(AbstractC89426h hVar) {
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

    /* renamed from: a */
    public final AbstractC29155b mo50944a(C29249x xVar) {
        C29146b.C29150a aVar;
        String str = xVar.f69350a.f69339b;
        if (C29174i.m58310a(xVar.f69350a.f69339b)) {
            try {
                mo50948b(xVar.f69350a);
            } catch (IOException unused) {
            }
            return null;
        } else if (!str.equals("GET") || C29176k.m58327c(xVar.f69355f).contains("*")) {
            return null;
        } else {
            C29216c cVar = new C29216c(xVar);
            try {
                aVar = this.f69184b.mo50836a(m58451c(xVar.f69350a), -1);
                if (aVar == null) {
                    return null;
                }
                try {
                    cVar.mo50949a(aVar);
                    return new C29212a(aVar);
                } catch (IOException unused2) {
                    m58450a(aVar);
                    return null;
                }
            } catch (IOException unused3) {
                aVar = null;
                m58450a(aVar);
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C29249x mo50945a(C29246v vVar) {
        try {
            C29146b.C29153c a = this.f69184b.mo50837a(m58451c(vVar));
            if (a == null) {
                return null;
            }
            try {
                C29216c cVar = new C29216c(a.f69002c[0]);
                String a2 = cVar.f69211g.mo50978a("Content-Type");
                String a3 = cVar.f69211g.mo50978a("Content-Length");
                C29246v.C29247a c = new C29246v.C29247a().mo51023a(cVar.f69205a).mo51028c(cVar.f69207c);
                c.f69347c = cVar.f69206b.mo50976a();
                C29246v a4 = c.mo51025a();
                C29249x.C29250a aVar = new C29249x.C29250a();
                aVar.f69361a = a4;
                aVar.f69362b = cVar.f69208d;
                aVar.f69363c = cVar.f69209e;
                aVar.f69364d = cVar.f69210f;
                C29249x.C29250a a5 = aVar.mo51035a(cVar.f69211g);
                a5.f69367g = new C29214b(a, a2, a3);
                a5.f69365e = cVar.f69212h;
                C29249x a6 = a5.mo51038a();
                if (!cVar.f69205a.equals(vVar.f69338a.toString()) || !cVar.f69207c.equals(vVar.f69339b)) {
                    C29206j.m58438a(a6.f69356g);
                    return null;
                }
                C29235p pVar = cVar.f69206b;
                for (String str : C29176k.m58327c(a6.f69355f)) {
                    if (!C29206j.m58441a(pVar.mo50981c(str), vVar.f69340c.mo50981c(str))) {
                        C29206j.m58438a(a6.f69356g);
                        return null;
                    }
                }
                return a6;
            } catch (IOException unused) {
                C29206j.m58438a(a);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public C29210c(File file, long j) {
        this(file, j, AbstractC29187a.f69124a);
    }

    private C29210c(File file, long j, AbstractC29187a aVar) {
        this.f69183a = new AbstractC29197e() {
            /* class com.squareup.p2075a.C29210c.C292111 */

            static {
                Covode.recordClassIndex(35560);
            }

            @Override // com.squareup.p2075a.p2076a.AbstractC29197e
            /* renamed from: a */
            public final void mo50924a() {
                C29210c.this.mo50946a();
            }

            @Override // com.squareup.p2075a.p2076a.AbstractC29197e
            /* renamed from: a */
            public final AbstractC29155b mo50922a(C29249x xVar) {
                return C29210c.this.mo50944a(xVar);
            }

            @Override // com.squareup.p2075a.p2076a.AbstractC29197e
            /* renamed from: b */
            public final void mo50927b(C29246v vVar) {
                C29210c.this.mo50948b(vVar);
            }

            @Override // com.squareup.p2075a.p2076a.AbstractC29197e
            /* renamed from: a */
            public final C29249x mo50923a(C29246v vVar) {
                return C29210c.this.mo50945a(vVar);
            }

            @Override // com.squareup.p2075a.p2076a.AbstractC29197e
            /* renamed from: a */
            public final void mo50925a(C29156c cVar) {
                C29210c.this.mo50947a(cVar);
            }

            @Override // com.squareup.p2075a.p2076a.AbstractC29197e
            /* renamed from: a */
            public final void mo50926a(C29249x xVar, C29249x xVar2) {
                C29146b.C29150a aVar;
                C29216c cVar = new C29216c(xVar2);
                C29146b.C29153c cVar2 = ((C29214b) xVar.f69356g).f69199a;
                try {
                    aVar = C29146b.this.mo50836a(cVar2.f69000a, cVar2.f69001b);
                    if (aVar != null) {
                        try {
                            cVar.mo50949a(aVar);
                            aVar.mo50848a();
                        } catch (IOException unused) {
                            C29210c.m58450a(aVar);
                        }
                    }
                } catch (IOException unused2) {
                    aVar = null;
                    C29210c.m58450a(aVar);
                }
            }
        };
        if (j > 0) {
            this.f69184b = new C29146b(aVar, file, j, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C29206j.m58446b("OkHttp DiskLruCache")));
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
}
