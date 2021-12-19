package com.p2082ss.android.ugc.aweme.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.utils.dk */
public final class C80346dk {
    static {
        Covode.recordClassIndex(93614);
    }

    /* renamed from: a */
    private static boolean m139310a(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    /* renamed from: b */
    private static boolean m139313b(String str) {
        if (str == null || !str.toLowerCase().contains("tiktok")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m139311a(String str, Context context) {
        if (str == null || str.length() < 2) {
            new C79459a(context).mo123050a(R.string.fjl).mo123053a();
            return false;
        } else if (str.length() > 24) {
            new C79459a(context).mo123050a(R.string.fjm).mo123053a();
            return false;
        } else if (!str.matches("[0-9A-Za-z_.]*")) {
            new C79459a(context).mo123050a(R.string.fji).mo123053a();
            return false;
        } else if (!m139310a(str)) {
            return true;
        } else {
            new C79459a(context).mo123050a(R.string.fjj).mo123053a();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m139312a(String str, String str2, String str3, Context context) {
        if (m139313b(str3) || TextUtils.equals(str, "2062")) {
            new C79459a(context).mo123050a(R.string.cbl).mo123053a();
            return false;
        } else if (TextUtils.equals(str, "2064")) {
            new C79459a(context).mo123050a(R.string.fjk).mo123053a();
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            return true;
        } else {
            new C79459a(context).mo123052a(str2).mo123053a();
            return false;
        }
    }
}
