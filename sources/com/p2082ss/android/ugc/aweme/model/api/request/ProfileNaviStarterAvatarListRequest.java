package com.p2082ss.android.ugc.aweme.model.api.request;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.model.api.p3460b.C60119f;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.api.request.ProfileNaviStarterAvatarListRequest */
public final class ProfileNaviStarterAvatarListRequest {

    /* renamed from: a */
    public static Api f137058a;

    /* renamed from: b */
    public static final C60127a f137059b = new C60127a((byte) 0);

    /* renamed from: c */
    private static final String f137060c = "https://api.tiktokv.com";

    /* renamed from: com.ss.android.ugc.aweme.model.api.request.ProfileNaviStarterAvatarListRequest$Api */
    public interface Api {
        static {
            Covode.recordClassIndex(70651);
        }

        @AbstractC22000h(mo35789a = "tiktok/v1/navi/candidates")
        AbstractC88403ab<C60119f> getStarterAvatar();
    }

    /* renamed from: com.ss.android.ugc.aweme.model.api.request.ProfileNaviStarterAvatarListRequest$a */
    public static final class C60127a {
        static {
            Covode.recordClassIndex(70652);
        }

        private C60127a() {
        }

        public /* synthetic */ C60127a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(70650);
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        f137058a = (Api) createIAVServiceProxybyMonsterPlugin.getNetworkService().createRetrofit("https://api.tiktokv.com", true, Api.class);
    }
}
