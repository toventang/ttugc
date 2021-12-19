package com.p2082ss.android.ugc.aweme.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.utils.el */
public final class C80396el {
    static {
        Covode.recordClassIndex(93664);
    }

    /* renamed from: a */
    public static boolean m139368a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            String str2 = parse.getHost() + parse.getPath();
            if (str2.startsWith("videoRecord/live") || str2.startsWith("video_record/live")) {
                return true;
            }
            if (!parse.getHost().equals("video_record") || !TextUtils.equals(parse.getQueryParameter("record_type"), "live")) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
