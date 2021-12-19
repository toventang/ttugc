package com.p2082ss.android.ugc.aweme.model.api.request;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.model.api.p3460b.C60117d;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.api.request.ProfileNaviInfoRequest */
public final class ProfileNaviInfoRequest {

    /* renamed from: a */
    public static Api f137052a;

    /* renamed from: b */
    public static final C60125a f137053b = new C60125a((byte) 0);

    /* renamed from: c */
    private static final String f137054c = "https://api.tiktokv.com";

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.model.api.request.ProfileNaviInfoRequest$Api */
    public interface Api {
        static {
            Covode.recordClassIndex(70645);
        }

        @AbstractC22000h(mo35789a = "tiktok/v1/navi/info")
        AbstractC88403ab<C60117d> getNaviInfo(@AbstractC22018z(mo35807a = "navi_id") String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.model.api.request.ProfileNaviInfoRequest$a */
    public static final class C60125a {
        static {
            Covode.recordClassIndex(70646);
        }

        private C60125a() {
        }

        public /* synthetic */ C60125a(byte b) {
            this();
        }

        /* renamed from: a */
        public static AbstractC88403ab<C60117d> m109595a(String str) {
            C89219l.m154721d(str, "");
            return ProfileNaviInfoRequest.f137052a.getNaviInfo(str);
        }
    }

    static {
        Covode.recordClassIndex(70644);
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        f137052a = (Api) createIAVServiceProxybyMonsterPlugin.getNetworkService().createRetrofit("https://api.tiktokv.com", true, Api.class);
    }
}
