package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21997e;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.api.TeenageModeApi */
public interface TeenageModeApi {

    /* renamed from: a */
    public static final C57882a f131959a = C57882a.f131960a;

    static {
        Covode.recordClassIndex(67893);
    }

    @AbstractC22012t(mo35799a = "/tiktok/v1/kids/user/check/password/")
    @AbstractC21999g
    AbstractC88979t<BaseResponse> checkTeenagePassword(@AbstractC21997e(mo35786a = "password") String str);

    @AbstractC22012t(mo35799a = "/tiktok/v1/kids/user/set/settings/")
    @AbstractC21999g
    AbstractC88979t<C57883a> setMinorSettings(@AbstractC21997e(mo35786a = "settings") String str);

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.api.TeenageModeApi$a */
    public static final class C57882a {

        /* renamed from: a */
        static final /* synthetic */ C57882a f131960a = new C57882a();

        private C57882a() {
        }

        static {
            Covode.recordClassIndex(67894);
        }
    }
}
