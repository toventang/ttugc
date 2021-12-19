package com.p2082ss.android.ugc.aweme.net.interceptor;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.net.p3493f.C61352h;
import okhttp3.C90200t;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.c */
public final class C61401c {
    static {
        Covode.recordClassIndex(72051);
    }

    /* renamed from: a */
    public static String m111177a(String str, C90200t.C90201a aVar) {
        String str2;
        if (!str.contains("/service/settings/v2")) {
            return str;
        }
        if (C61352h.m111093a()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        aVar.mo145064a("googleServiceEnable", str2);
        return aVar.mo145068b().mo145046a().toString();
    }
}
