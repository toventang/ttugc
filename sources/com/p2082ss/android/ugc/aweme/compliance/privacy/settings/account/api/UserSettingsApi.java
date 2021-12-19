package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import p4560f.p4561a.AbstractC88979t;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.UserSettingsApi */
public interface UserSettingsApi {

    /* renamed from: a */
    public static final C39726a f93573a = C39726a.f93574a;

    static {
        Covode.recordClassIndex(47454);
    }

    @AbstractC22000h(mo35789a = "/aweme/v1/user/settings/")
    AbstractC88979t<C68348f> getUserSettings(@AbstractC22018z(mo35807a = "last_settings_version") String str);

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.UserSettingsApi$a */
    public static final class C39726a {

        /* renamed from: a */
        static final /* synthetic */ C39726a f93574a = new C39726a();

        private C39726a() {
        }

        static {
            Covode.recordClassIndex(47455);
        }
    }
}
