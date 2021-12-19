package com.bytedance.bdturing.ttnet;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.net.URL;
import java.util.Map;

/* renamed from: com.bytedance.bdturing.ttnet.b */
public final class C13309b {
    static {
        Covode.recordClassIndex(15274);
    }

    /* renamed from: a */
    private static boolean m23933a(Context context, String str) {
        URL url = new URL(str);
        if (TextUtils.isEmpty(url.getPath()) || !url.getPath().contains("vc/setting")) {
            return true;
        }
        return true ^ C34822d.m71158a(context, "bd_turning_settings_init", 0).getBoolean("inited", false);
    }

    /* renamed from: a */
    public static void m23932a(Context context, String str, Map<String, String> map) {
        int i;
        try {
            boolean a = m23933a(context, str);
            StringBuilder append = new StringBuilder().append("").append("n=");
            if (a) {
                i = 1;
            } else {
                i = 0;
            }
            map.put("x-tt-request-tag", append.append(i).append(";").toString() + "t=0");
        } catch (Exception unused) {
        }
    }
}
