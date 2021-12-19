package com.p2082ss.android.ugc.aweme.share.p3767m;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.share.m.b */
public final class C69303b {
    static {
        Covode.recordClassIndex(81633);
    }

    /* renamed from: a */
    public static String m122501a(String str) {
        if (!SettingServiceImpl.m120782v().mo108866b(C17867d.m33078a()) || TextUtils.isEmpty(str)) {
            return str;
        }
        return str.replace("#", "");
    }
}
