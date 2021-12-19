package com.p2082ss.android.ugc.aweme.video.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.utils.C80580in;

/* renamed from: com.ss.android.ugc.aweme.video.util.b */
public final class C81076b {
    static {
        Covode.recordClassIndex(94398);
    }

    /* renamed from: a */
    public static String m140766a(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("aweme/v1/play")) {
            return str;
        }
        return m140767b(str).mo52126a();
    }

    /* renamed from: b */
    public static C29844g m140767b(String str) {
        String addCommonParams = AppLog.addCommonParams(new C29844g(str).toString(), true);
        C29844g gVar = new C29844g(addCommonParams);
        try {
            if (!C80580in.m139687c()) {
                return gVar;
            }
            if (!(addCommonParams.contains("openudid") || addCommonParams.contains("uoo"))) {
                return gVar;
            }
            String[] split = addCommonParams.substring(addCommonParams.indexOf("?") + 1).split("&");
            for (String str2 : split) {
                if (!str2.contains("openudid") && !str2.contains("uoo") && str2.contains("=") && !str.contains(str2.substring(0, str2.indexOf("=")))) {
                    str = str + "&" + str2;
                }
            }
            return new C29844g(str);
        } catch (Exception e) {
            e.printStackTrace();
            return gVar;
        }
    }
}
