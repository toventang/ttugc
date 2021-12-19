package com.p2082ss.android.ugc.aweme.model.api.request;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.model.api.p3460b.C60120g;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.api.request.ProfileNaviStarterAvatarRequest */
public final class ProfileNaviStarterAvatarRequest {

    /* renamed from: a */
    public static Api f137061a;

    /* renamed from: b */
    public static final C60128a f137062b = new C60128a((byte) 0);

    /* renamed from: c */
    private static final String f137063c = "https://api.tiktokv.com";

    /* renamed from: com.ss.android.ugc.aweme.model.api.request.ProfileNaviStarterAvatarRequest$Api */
    interface Api {
        static {
            Covode.recordClassIndex(70654);
        }

        @AbstractC22000h(mo35789a = "tiktok/v1/navi/candidateinfo")
        AbstractC88403ab<C60120g> getStarterAvatar(@AbstractC22018z(mo35807a = "starter_navi_id") int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.model.api.request.ProfileNaviStarterAvatarRequest$a */
    public static final class C60128a {
        static {
            Covode.recordClassIndex(70655);
        }

        private C60128a() {
        }

        public /* synthetic */ C60128a(byte b) {
            this();
        }

        /* renamed from: a */
        public static AbstractC88403ab<C60120g> m109597a(int i) {
            return ProfileNaviStarterAvatarRequest.f137061a.getStarterAvatar(i);
        }
    }

    static {
        Covode.recordClassIndex(70653);
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        f137061a = (Api) createIAVServiceProxybyMonsterPlugin.getNetworkService().createRetrofit("https://api.tiktokv.com", true, Api.class);
    }
}
