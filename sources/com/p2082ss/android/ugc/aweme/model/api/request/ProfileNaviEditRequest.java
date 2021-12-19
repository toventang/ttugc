package com.p2082ss.android.ugc.aweme.model.api.request;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.model.api.p3460b.C60115b;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.api.request.ProfileNaviEditRequest */
public final class ProfileNaviEditRequest {

    /* renamed from: a */
    public static Api f137046a;

    /* renamed from: b */
    public static final C60123a f137047b = new C60123a((byte) 0);

    /* renamed from: c */
    private static final String f137048c = "https://api.tiktokv.com";

    /* renamed from: com.ss.android.ugc.aweme.model.api.request.ProfileNaviEditRequest$Api */
    public interface Api {
        static {
            Covode.recordClassIndex(70639);
        }

        @AbstractC22012t(mo35799a = "tiktok/v1/navi/edit")
        AbstractC88403ab<C60115b> editNavi(@AbstractC22018z(mo35807a = "navi") String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.model.api.request.ProfileNaviEditRequest$a */
    public static final class C60123a {
        static {
            Covode.recordClassIndex(70640);
        }

        private C60123a() {
        }

        public /* synthetic */ C60123a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(70638);
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        f137046a = (Api) createIAVServiceProxybyMonsterPlugin.getNetworkService().createRetrofit("https://api.tiktokv.com", false, Api.class);
    }
}
