package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.fy */
public final class C80466fy {

    /* renamed from: a */
    public static final C80466fy f180041a = new C80466fy();

    private C80466fy() {
    }

    static {
        Covode.recordClassIndex(93734);
    }

    /* renamed from: a */
    public static String m139470a(String str) {
        C89219l.m154721d(str, "");
        return "https://www.tiktok.com/in_app/redirect?region=" + C58071d.m104913g() + "&language=" + SettingServiceImpl.m120782v().mo108872h() + "&projectKey=" + str;
    }
}
