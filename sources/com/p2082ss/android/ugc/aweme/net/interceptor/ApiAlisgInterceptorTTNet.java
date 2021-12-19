package com.p2082ss.android.ugc.aweme.net.interceptor;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import java.util.ArrayList;
import okhttp3.C90200t;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.ApiAlisgInterceptorTTNet */
public final class ApiAlisgInterceptorTTNet implements AbstractC22021a {

    /* renamed from: a */
    public static final ArrayList<String> f139391a = C89070n.m154525d("/service/2/app_log/", "/api/ad/v1/setting/", "/api/ad/splash/", "/aweme/v1/ttregion/test/", "/aweme/v1/feed/", "/aweme/v2/feed/", "/aweme/v2/category/list/", "/aweme/v1/find/", "/aweme/v1/challenge/history/intervene/");

    /* renamed from: b */
    public static final ArrayList<String> f139392b = C89070n.m154525d("IN", "NP", "PK", "LK");

    /* renamed from: c */
    public static final ArrayList<String> f139393c = C89070n.m154525d("US", "GB", "DE", "IT", "FR", "TR", "ES", "JP", "KR", "BR", "IQ");

    /* renamed from: d */
    public static final C61398a f139394d = new C61398a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.net.interceptor.ApiAlisgInterceptorTTNet$a */
    public static final class C61398a {
        static {
            Covode.recordClassIndex(72032);
        }

        private C61398a() {
        }

        public /* synthetic */ C61398a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(72031);
    }

    /* renamed from: a */
    private static C22099u<?> m111154a(AbstractC22021a.AbstractC22022a aVar) {
        C90200t.C90201a j;
        C89219l.m154721d(aVar, "");
        Request a = aVar.mo35809a();
        C89219l.m154716b(a, "");
        C90200t f = C90200t.m156802f(a.getUrl());
        if (!(f == null || (j = f.mo145060j()) == null)) {
            if (C89219l.m154714a((Object) f.f204861d, (Object) "api.tiktokv.com")) {
                j.mo145069c("api-h2.tiktokv.com");
            }
            a = a.newBuilder().mo35838a(j.mo145068b().toString()).mo35840a();
        }
        C22099u<?> a2 = aVar.mo35810a(a);
        C89219l.m154716b(a2, "");
        return a2;
    }

    @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
    public final C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
        if (!(aVar.mo35812c() instanceof C34932b)) {
            return m111154a(aVar);
        }
        C34932b bVar = (C34932b) aVar.mo35812c();
        if (bVar.f82415W > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
            bVar.mo61814a(bVar.f82417Y, uptimeMillis);
            bVar.mo61815b(bVar.f82417Y, uptimeMillis);
        }
        bVar.mo61813a(getClass().getSimpleName());
        bVar.f82415W = SystemClock.uptimeMillis();
        C22099u<?> a = m111154a(aVar);
        if (bVar.f82416X > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f82416X;
            String simpleName = getClass().getSimpleName();
            bVar.mo61814a(simpleName, uptimeMillis2);
            bVar.mo61816c(simpleName, uptimeMillis2);
        }
        bVar.f82416X = SystemClock.uptimeMillis();
        return a;
    }
}
