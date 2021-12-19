package com.p2082ss.android.ugc.aweme.badge;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.IAVSettingService;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.badge.EditProfileBadgeApi */
public final class EditProfileBadgeApi {

    /* renamed from: a */
    public static Api f81339a;

    /* renamed from: b */
    public static final C34415a f81340b = new C34415a((byte) 0);

    /* renamed from: c */
    private static final String f81341c = "https://api.tiktokv.com";

    /* renamed from: com.ss.android.ugc.aweme.badge.EditProfileBadgeApi$Api */
    interface Api {
        static {
            Covode.recordClassIndex(41360);
        }

        @AbstractC89722f(mo144276a = "/tiktok/v1/user/profile/self/badges/")
        AbstractC88403ab<C34449i> getProfileBadgeList(@AbstractC89736t(mo144292a = "app_language") String str, @AbstractC89736t(mo144292a = "region") String str2, @AbstractC89736t(mo144292a = "locale") String str3);
    }

    /* renamed from: com.ss.android.ugc.aweme.badge.EditProfileBadgeApi$a */
    public static final class C34415a {
        static {
            Covode.recordClassIndex(41361);
        }

        private C34415a() {
        }

        /* renamed from: a */
        public static AbstractC88403ab<C34449i> m70404a() {
            Api api = EditProfileBadgeApi.f81339a;
            IAVSettingService createIAVSettingServicebyMonsterPlugin = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false);
            C89219l.m154716b(createIAVSettingServicebyMonsterPlugin, "");
            String appLanguage = createIAVSettingServicebyMonsterPlugin.getAppLanguage();
            C89219l.m154716b(appLanguage, "");
            IAVSettingService createIAVSettingServicebyMonsterPlugin2 = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false);
            C89219l.m154716b(createIAVSettingServicebyMonsterPlugin2, "");
            String appLogRegion = createIAVSettingServicebyMonsterPlugin2.getAppLogRegion();
            C89219l.m154716b(appLogRegion, "");
            String b = C53438a.m98623b();
            C89219l.m154716b(b, "");
            return api.getProfileBadgeList(appLanguage, appLogRegion, b);
        }

        public /* synthetic */ C34415a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(41359);
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        f81339a = (Api) createIAVServiceProxybyMonsterPlugin.getNetworkService().createRetrofit("https://api.tiktokv.com", false, Api.class);
    }
}
