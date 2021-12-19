package com.p2082ss.android.ugc.aweme.kids.discovery.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.kids.common.p3328a.C57345a;
import com.p2082ss.android.ugc.aweme.kids.discovery.p3350c.C57560b;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.discovery.api.DiscoverApiKid */
public interface DiscoverApiKid {

    /* renamed from: a */
    public static final C57555a f131390a = C57555a.f131392b;

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.api.DiscoverApiKid$b */
    public static final class C57556b {
        static {
            Covode.recordClassIndex(67509);
        }
    }

    static {
        Covode.recordClassIndex(67507);
    }

    @AbstractC22000h(mo35789a = "/tiktok/v1/kids/category/list/")
    AbstractC88979t<C57560b> getCategoryV2List(@AbstractC22018z(mo35807a = "cursor") int i, @AbstractC22018z(mo35807a = "count") int i2, @AbstractC22018z(mo35807a = "is_complete") Integer num);

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.api.DiscoverApiKid$a */
    public static final class C57555a {

        /* renamed from: a */
        public static final DiscoverApiKid f131391a;

        /* renamed from: b */
        static final /* synthetic */ C57555a f131392b = new C57555a();

        private C57555a() {
        }

        static {
            Covode.recordClassIndex(67508);
            Object a = RetrofitFactory.m33635a().mo28817b(C57345a.f130717a).mo28832d().mo28858a(DiscoverApiKid.class);
            C89219l.m154716b(a, "");
            f131391a = (DiscoverApiKid) a;
        }
    }
}
