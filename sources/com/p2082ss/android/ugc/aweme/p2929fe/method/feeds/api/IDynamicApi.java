package com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.p2929fe.method.feeds.p2933b.C47953a;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89737u;
import p4640l.p4644b.AbstractC89740x;

/* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.api.IDynamicApi */
public interface IDynamicApi {

    /* renamed from: a */
    public static final C47949a f111060a = C47949a.f111061a;

    static {
        Covode.recordClassIndex(56657);
    }

    @AbstractC89722f
    AbstractC88979t<C47953a> loadVideos(@AbstractC89740x String str, @AbstractC89737u Map<String, String> map);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.api.IDynamicApi$a */
    public static final class C47949a {

        /* renamed from: a */
        static final /* synthetic */ C47949a f111061a = new C47949a();

        private C47949a() {
        }

        static {
            Covode.recordClassIndex(56658);
        }

        /* renamed from: a */
        public static IDynamicApi m90938a(String str) {
            C89219l.m154721d(str, "");
            Object a = RetrofitFactory.m33635a().mo28816a(str).mo28858a(IDynamicApi.class);
            C89219l.m154716b(a, "");
            return (IDynamicApi) a;
        }
    }
}
