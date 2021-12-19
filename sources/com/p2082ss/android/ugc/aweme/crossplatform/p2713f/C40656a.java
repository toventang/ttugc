package com.p2082ss.android.ugc.aweme.crossplatform.p2713f;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.f.a */
public final class C40656a {

    /* renamed from: a */
    public static final C40656a f95235a = new C40656a();

    private C40656a() {
    }

    static {
        Covode.recordClassIndex(48496);
    }

    /* renamed from: a */
    public static String m82027a(String str) {
        Uri parse;
        String[] strArr;
        if (str != null && (parse = Uri.parse(str)) != null && !parse.isOpaque() && TextUtils.equals(parse.getQueryParameter("need_is_cutout"), "1")) {
            try {
                strArr = (String[]) SettingsManager.m29616a().mo25396a("is_cutout_android", String[].class);
            } catch (Throwable unused) {
                strArr = null;
            }
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (TextUtils.equals(Build.MODEL, str2)) {
                        return parse.buildUpon().appendQueryParameter("is_cutout", "1").build().toString();
                    }
                }
            }
        }
        return str;
    }
}
