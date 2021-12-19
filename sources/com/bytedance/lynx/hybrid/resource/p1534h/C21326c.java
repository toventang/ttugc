package com.bytedance.lynx.hybrid.resource.p1534h;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.resource.AbstractC21323h;
import com.bytedance.lynx.hybrid.resource.C21314g;
import com.bytedance.lynx.hybrid.resource.C21335j;
import com.bytedance.lynx.hybrid.resource.config.AbstractC21279e;
import com.bytedance.lynx.hybrid.resource.config.C21277c;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import com.bytedance.lynx.hybrid.resource.config.GeckoConfig;
import com.bytedance.lynx.hybrid.resource.p1526b.C21263f;
import com.bytedance.lynx.hybrid.resource.p1527c.C21274b;
import com.bytedance.lynx.hybrid.resource.p1528d.C21290a;
import com.bytedance.lynx.hybrid.resource.p1528d.C21297g;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.resource.h.c */
public final class C21326c {

    /* renamed from: a */
    public static final C21326c f50641a = new C21326c();

    /* renamed from: b */
    private static int f50642b;

    private C21326c() {
    }

    static {
        Covode.recordClassIndex(24944);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.lynx.hybrid.resource.h.c$a */
    public static final class C21327a {

        /* renamed from: a */
        public long f50643a;

        /* renamed from: b */
        public int f50644b;

        static {
            Covode.recordClassIndex(24945);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21327a)) {
                return false;
            }
            C21327a aVar = (C21327a) obj;
            return this.f50643a == aVar.f50643a && this.f50644b == aVar.f50644b;
        }

        public final int hashCode() {
            long j = this.f50643a;
            return (((int) (j ^ (j >>> 32))) * 31) + this.f50644b;
        }

        public final String toString() {
            return "LoadPerfParams(startTime=" + this.f50643a + ", perfFrequency=" + this.f50644b + ")";
        }

        public C21327a(long j, int i) {
            this.f50643a = j;
            this.f50644b = i;
        }
    }

    /* renamed from: a */
    private static String m40068a(Uri uri, C21277c cVar) {
        String str;
        boolean z;
        try {
            String queryParameter = uri.getQueryParameter("accessKey");
            if (queryParameter == null) {
                queryParameter = "";
            }
            str = C89379q.m157068constructorimpl(queryParameter);
        } catch (Throwable th) {
            str = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        String accessKey = cVar.f50503j.getAccessKey();
        if (C89379q.m157073isFailureimpl(str)) {
            str = accessKey;
        }
        String str2 = (String) str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return cVar.f50503j.getAccessKey();
        }
        return str2;
    }

    /* renamed from: a */
    private static C21335j m40067a(Uri uri, C21284j jVar, C21277c cVar, C21327a aVar) {
        C21335j jVar2 = new C21335j(uri, false, null, aVar.f50643a, 1022);
        jVar2.mo34939d(jVar.f50524o);
        jVar2.f50666h = C21274b.m39977a(cVar, jVar2.f50546m, jVar);
        jVar2.f50660b = C21274b.m39976a(jVar);
        return jVar2;
    }

    /* renamed from: a */
    private static void m40069a(String str, Uri uri, C21284j jVar, C21314g gVar) {
        String str2;
        String b;
        Object obj;
        Object obj2;
        if (jVar.f50516g.length() <= 0) {
            String str3 = "";
            if (!C89219l.m154714a((Object) jVar.f50524o, (Object) "web")) {
                try {
                    String queryParameter = uri.getQueryParameter("channel");
                    if (queryParameter == null) {
                        queryParameter = str3;
                    }
                    obj = C89379q.m157068constructorimpl(queryParameter);
                } catch (Throwable th) {
                    obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
                boolean r0 = C89379q.m157073isFailureimpl(obj);
                Object obj3 = obj;
                if (r0) {
                    obj3 = str3;
                }
                jVar.mo34887a((String) obj3);
                try {
                    String queryParameter2 = uri.getQueryParameter("bundle");
                    if (queryParameter2 == null) {
                        queryParameter2 = str3;
                    }
                    obj2 = C89379q.m157068constructorimpl(queryParameter2);
                } catch (Throwable th2) {
                    obj2 = C89379q.m157068constructorimpl(C89382r.m154941a(th2));
                }
                boolean r02 = C89379q.m157073isFailureimpl(obj2);
                Object obj4 = obj2;
                if (r02) {
                    obj4 = str3;
                }
                jVar.mo34888b((String) obj4);
            }
            if (jVar.f50516g.length() <= 0) {
                C21290a a = C21324a.m40061a(str, gVar, jVar);
                if (a == null || (str2 = a.mo34894a()) == null) {
                    str2 = str3;
                }
                jVar.mo34887a(str2);
                if (!(a == null || (b = a.mo34895b()) == null)) {
                    str3 = b;
                }
                jVar.mo34888b(str3);
            }
        }
    }

    /* renamed from: a */
    private static C21284j m40066a(String str, Uri uri, C21284j jVar, C21277c cVar, C21314g gVar) {
        if (jVar.f50529t.length() == 0) {
            jVar.mo34892f(m40068a(uri, cVar));
        }
        m40069a(str, uri, jVar, gVar);
        jVar.f50526q = cVar.f50497d;
        GeckoConfig a = C21263f.m39966a(cVar, jVar.f50529t);
        if (!cVar.f50499f || !(a.getGeckoDepender() instanceof AbstractC21323h)) {
            return jVar;
        }
        AbstractC21279e geckoDepender = a.getGeckoDepender();
        if (geckoDepender != null) {
            return ((AbstractC21323h) geckoDepender).mo34927a(uri, jVar);
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: a */
    public final C21297g mo34930a(boolean z, long j, String str, Uri uri, C21284j jVar, C21314g gVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(uri, "");
        C89219l.m154719c(jVar, "");
        C89219l.m154719c(gVar, "");
        C21277c resourceConfig = gVar.getResourceConfig();
        int i = resourceConfig.f50495b;
        if (i > 0) {
            f50642b = (f50642b + 1) % i;
        }
        C21327a aVar = new C21327a(j, f50642b);
        C21284j a = m40066a(str, uri, jVar, resourceConfig, gVar);
        return new C21297g(str, m40067a(uri, a, resourceConfig, aVar), a, z);
    }
}
