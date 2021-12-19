package com.p2082ss.android.ugc.aweme.model.api.request;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.api.request.ProfileNaviDeleteRequest */
public final class ProfileNaviDeleteRequest {

    /* renamed from: a */
    public static Api f137043a;

    /* renamed from: b */
    public static final C60122a f137044b = new C60122a((byte) 0);

    /* renamed from: c */
    private static final String f137045c = "https://api.tiktokv.com";

    /* renamed from: com.ss.android.ugc.aweme.model.api.request.ProfileNaviDeleteRequest$Api */
    interface Api {
        static {
            Covode.recordClassIndex(70636);
        }

        @AbstractC22012t(mo35799a = "tiktok/v1/navi/delete")
        AbstractC88403ab<BaseResponse> deleteNavi(@AbstractC22018z(mo35807a = "navi_id") String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.model.api.request.ProfileNaviDeleteRequest$a */
    public static final class C60122a {
        static {
            Covode.recordClassIndex(70637);
        }

        private C60122a() {
        }

        public /* synthetic */ C60122a(byte b) {
            this();
        }

        /* renamed from: a */
        public static AbstractC88403ab<BaseResponse> m109594a(C60129a aVar) {
            C89219l.m154721d(aVar, "");
            return ProfileNaviDeleteRequest.f137043a.deleteNavi(aVar.f137065a);
        }
    }

    static {
        Covode.recordClassIndex(70635);
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        f137043a = (Api) createIAVServiceProxybyMonsterPlugin.getNetworkService().createRetrofit("https://api.tiktokv.com", false, Api.class);
    }
}
