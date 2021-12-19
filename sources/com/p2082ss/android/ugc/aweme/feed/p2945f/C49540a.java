package com.p2082ss.android.ugc.aweme.feed.p2945f;

import android.webkit.CookieManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.C14695e;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.C14703k;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.p992b.C14705l;
import com.bytedance.frameworks.baselib.network.http.p995g.C14759i;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.feed.cache.C49324h;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.f.a */
public final class C49540a {

    /* renamed from: a */
    static final String f113929a = (C29736b.f70924e + "/aweme/v2/feed/");

    /* renamed from: b */
    public static final C49540a f113930b = new C49540a();

    /* renamed from: c */
    private static final AbstractC89244h f113931c = C89250i.m154773a((AbstractC89171a) C49541a.f113932a);

    /* renamed from: a */
    public static String m92781a() {
        return (String) f113931c.getValue();
    }

    private C49540a() {
    }

    /* renamed from: b */
    public static String m92784b() {
        if (!C89219l.m154714a((Object) C49324h.m92413g(), (Object) m92781a())) {
            return null;
        }
        C49324h.m92415h();
        return C49324h.m92415h();
    }

    static {
        Covode.recordClassIndex(58354);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.f.a$a */
    static final class C49541a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C49541a f113932a = new C49541a();

        static {
            Covode.recordClassIndex(58355);
        }

        C49541a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
            if (r1 == null) goto L_0x002c;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.String invoke() {
            /*
                r5 = this;
                java.lang.String r0 = com.p2082ss.android.ugc.aweme.feed.p2945f.C49540a.f113929a
                okhttp3.t r0 = okhttp3.C90200t.m156802f(r0)
                r4 = 0
                if (r0 == 0) goto L_0x002c
                java.lang.String r2 = r0.f204861d
                okhttp3.t$a r1 = r0.mo145060j()
                if (r1 == 0) goto L_0x002c
                java.lang.String r0 = "api.tiktokv.com"
                boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r2, r0)
                if (r0 == 0) goto L_0x001e
                java.lang.String r0 = "api-h2.tiktokv.com"
                r1.mo145069c(r0)
            L_0x001e:
                okhttp3.t r0 = r1.mo145068b()
                java.net.URL r0 = r0.mo145046a()
                java.lang.String r1 = r0.toString()
                if (r1 != 0) goto L_0x002e
            L_0x002c:
                java.lang.String r1 = com.p2082ss.android.ugc.aweme.feed.p2945f.C49540a.f113929a
            L_0x002e:
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                java.lang.String r3 = com.p2082ss.android.ugc.aweme.feed.p2945f.C49540a.m92782a(r1)
                r0 = 5000(0x1388, double:2.4703E-320)
                b.i r2 = p077b.C1731i.m5631a(r0)
                com.ss.android.ugc.aweme.feed.f.a$b r1 = new com.ss.android.ugc.aweme.feed.f.a$b
                r1.<init>(r3)
                java.util.concurrent.ExecutorService r0 = p077b.C1731i.f5562a
                r2.mo5534a(r1, r0, r4)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.p2945f.C49540a.C49541a.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.f.a$b */
    static final class C49542b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ String f113933a;

        static {
            Covode.recordClassIndex(58356);
        }

        C49542b(String str) {
            this.f113933a = str;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            String cookie = CookieManager.getInstance().getCookie(this.f113933a);
            String str = this.f113933a;
            C89219l.m154716b(cookie, "");
            C49540a.m92783a(str, cookie);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static String m92782a(String str) {
        C14703k.m26921a();
        C14703k.m26922a(C17867d.m33078a());
        C14703k a = C14703k.m26921a();
        C89219l.m154716b(a, "");
        if (!a.mo23710c()) {
            C14695e a2 = C14703k.m26921a().mo23706a(new C14705l(str, "get"));
            if (a2 == null || !(!C89219l.m154714a((Object) str, (Object) a2.f35716a)) || !C14759i.m27072b(a2.f35716a)) {
                return str;
            }
            String str2 = a2.f35716a;
            C89219l.m154716b(str2, "");
            return str2;
        }
        String a3 = C14703k.m26921a().mo23707a(str);
        if (!(!C89219l.m154714a((Object) str, (Object) a3)) || !C14759i.m27072b(a3)) {
            return str;
        }
        C89219l.m154716b(a3, "");
        return a3;
    }

    /* renamed from: a */
    public static void m92783a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C49324h.m92414g(str);
        C49324h.m92416h(str2);
    }
}
