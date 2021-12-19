package com.p2082ss.android.ugc.aweme.model.api.request;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.model.api.p3460b.C60118e;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.api.request.ProfileNaviListRequest */
public final class ProfileNaviListRequest {

    /* renamed from: a */
    public static Api f137055a = ((Api) RetrofitFactory.m33635a().mo28817b("https://api.tiktokv.com").mo28832d().mo28858a(Api.class));

    /* renamed from: b */
    public static final C60126a f137056b = new C60126a((byte) 0);

    /* renamed from: c */
    private static final String f137057c = "https://api.tiktokv.com";

    /* renamed from: com.ss.android.ugc.aweme.model.api.request.ProfileNaviListRequest$Api */
    interface Api {
        static {
            Covode.recordClassIndex(70648);
        }

        @AbstractC22000h(mo35789a = "tiktok/v1/navi/list")
        AbstractC88403ab<C60118e> getNaviList(@AbstractC22018z(mo35807a = "offset") int i, @AbstractC22018z(mo35807a = "count") int i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.model.api.request.ProfileNaviListRequest$a */
    public static final class C60126a {
        static {
            Covode.recordClassIndex(70649);
        }

        private C60126a() {
        }

        public /* synthetic */ C60126a(byte b) {
            this();
        }

        /* renamed from: a */
        public static AbstractC88403ab<C60118e> m109596a(C60136c cVar) {
            C89219l.m154721d(cVar, "");
            return ProfileNaviListRequest.f137055a.getNaviList(cVar.f137075a, cVar.f137076b);
        }
    }

    static {
        Covode.recordClassIndex(70647);
    }
}
