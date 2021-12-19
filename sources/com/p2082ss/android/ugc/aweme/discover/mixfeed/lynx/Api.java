package com.p2082ss.android.ugc.aweme.discover.mixfeed.lynx;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22017y;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.discover.api.SearchApiNew;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.lynx.Api */
public interface Api {

    /* renamed from: a */
    public static final C42420a f98835a = C42420a.f98837b;

    static {
        Covode.recordClassIndex(50365);
    }

    @AbstractC22000h(mo35789a = "/aweme/v1/search/forecast/")
    @AbstractC22017y(mo35806a = 3)
    C1731i<C42421a> fetchSchema(@AbstractC22018z(mo35807a = "keyword") String str, @AbstractC22018z(mo35807a = "count") int i);

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.lynx.Api$a */
    public static final class C42420a {

        /* renamed from: a */
        static final Api f98836a;

        /* renamed from: b */
        static final /* synthetic */ C42420a f98837b = new C42420a();

        private C42420a() {
        }

        static {
            Covode.recordClassIndex(50366);
            Object a = SearchApiNew.f97599b.mo28858a(Api.class);
            C89219l.m154716b(a, "");
            f98836a = (Api) a;
        }
    }
}
