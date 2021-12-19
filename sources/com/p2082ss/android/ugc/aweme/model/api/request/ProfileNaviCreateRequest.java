package com.p2082ss.android.ugc.aweme.model.api.request;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.model.api.p3460b.C60114a;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.api.request.ProfileNaviCreateRequest */
public final class ProfileNaviCreateRequest {

    /* renamed from: a */
    public static Api f137040a;

    /* renamed from: b */
    public static final C60121a f137041b = new C60121a((byte) 0);

    /* renamed from: c */
    private static final String f137042c = "https://api.tiktokv.com";

    /* renamed from: com.ss.android.ugc.aweme.model.api.request.ProfileNaviCreateRequest$Api */
    public interface Api {
        static {
            Covode.recordClassIndex(70633);
        }

        @AbstractC22012t(mo35799a = "tiktok/v1/navi/create")
        AbstractC88403ab<C60114a> createNavi(@AbstractC22018z(mo35807a = "navi") String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.model.api.request.ProfileNaviCreateRequest$a */
    public static final class C60121a {
        static {
            Covode.recordClassIndex(70634);
        }

        private C60121a() {
        }

        public /* synthetic */ C60121a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(70632);
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        f137040a = (Api) createIAVServiceProxybyMonsterPlugin.getNetworkService().createRetrofit("https://api.tiktokv.com", true, Api.class);
    }
}
