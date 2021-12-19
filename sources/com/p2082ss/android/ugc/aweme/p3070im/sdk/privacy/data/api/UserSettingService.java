package com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.data.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.data.api.UserSettingService */
public interface UserSettingService {

    /* renamed from: a */
    public static final C55705a f127063a = C55705a.f127064a;

    static {
        Covode.recordClassIndex(65489);
    }

    @AbstractC22000h(mo35789a = "/aweme/v1/user/settings/")
    AbstractC88403ab<C68348f> getUserSettings(@AbstractC22018z(mo35807a = "last_settings_version") String str);

    @AbstractC22000h(mo35789a = "/aweme/v1/user/settings/")
    AbstractFutureC27655q<C68348f> getUserSettingsFuture(@AbstractC22018z(mo35807a = "last_settings_version") String str);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.data.api.UserSettingService$a */
    public static final class C55705a {

        /* renamed from: a */
        static final /* synthetic */ C55705a f127064a = new C55705a();

        /* renamed from: b */
        private static UserSettingService f127065b;

        private C55705a() {
        }

        static {
            Covode.recordClassIndex(65490);
        }

        /* renamed from: a */
        public static UserSettingService m101447a() {
            if (f127065b == null) {
                f127065b = (UserSettingService) RetrofitFactory.m33635a().mo28816a(C29736b.f70924e).mo28858a(UserSettingService.class);
            }
            UserSettingService userSettingService = f127065b;
            if (userSettingService == null) {
                C89219l.m154715b();
            }
            return userSettingService;
        }
    }
}
