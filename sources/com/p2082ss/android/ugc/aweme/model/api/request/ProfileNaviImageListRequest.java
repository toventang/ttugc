package com.p2082ss.android.ugc.aweme.model.api.request;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.model.api.p3460b.C60116c;
import p4560f.p4561a.AbstractC88403ab;

/* renamed from: com.ss.android.ugc.aweme.model.api.request.ProfileNaviImageListRequest */
public final class ProfileNaviImageListRequest {

    /* renamed from: a */
    public static Api f137049a = ((Api) RetrofitFactory.m33635a().mo28817b("https://api.tiktokv.com").mo28832d().mo28858a(Api.class));

    /* renamed from: b */
    public static final C60124a f137050b = new C60124a((byte) 0);

    /* renamed from: c */
    private static final String f137051c = "https://api.tiktokv.com";

    /* renamed from: com.ss.android.ugc.aweme.model.api.request.ProfileNaviImageListRequest$Api */
    public interface Api {
        static {
            Covode.recordClassIndex(70642);
        }

        @AbstractC22000h(mo35789a = "/tiktok/v1/navi/images")
        AbstractC88403ab<C60116c> getNaviImageList(@AbstractC22018z(mo35807a = "offset") int i, @AbstractC22018z(mo35807a = "count") int i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.model.api.request.ProfileNaviImageListRequest$a */
    public static final class C60124a {
        static {
            Covode.recordClassIndex(70643);
        }

        private C60124a() {
        }

        public /* synthetic */ C60124a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(70641);
    }
}
