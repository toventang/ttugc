package com.p2082ss.android.ugc.aweme.creatortools.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89722f;

/* renamed from: com.ss.android.ugc.aweme.creatortools.api.ProAccountApi */
public interface ProAccountApi {

    /* renamed from: a */
    public static final C40452a f94671a = C40452a.f94672a;

    static {
        Covode.recordClassIndex(48255);
    }

    @AbstractC89722f(mo144276a = "/api/v1/affiliate/account/ttshop/showcase")
    AbstractC88979t<C40457d> getShowCaseResp();

    /* renamed from: com.ss.android.ugc.aweme.creatortools.api.ProAccountApi$a */
    public static final class C40452a {

        /* renamed from: a */
        static final /* synthetic */ C40452a f94672a = new C40452a();

        private C40452a() {
        }

        static {
            Covode.recordClassIndex(48256);
        }

        /* renamed from: a */
        public static ProAccountApi m81689a() {
            return (ProAccountApi) C18097a.m33696a().mo28816a("https://oec-api.tiktokv.com").mo28858a(ProAccountApi.class);
        }
    }
}
