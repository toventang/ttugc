package com.p2082ss.android.ugc.aweme.compliance.business.setting.p2656a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.setting.a.b */
public final class C39533b {

    /* renamed from: a */
    public static final C39533b f93237a = new C39533b();

    private C39533b() {
    }

    static {
        Covode.recordClassIndex(47239);
    }

    /* renamed from: a */
    public static final String m80327a(String str) {
        C89219l.m154721d(str, "");
        return "https://www.tiktok.com/in_app/redirect?region=" + C58071d.m104913g() + "&language=" + SettingServiceImpl.m120782v().mo108872h() + "&projectKey=" + str;
    }
}
