package com.p2082ss.android.ugc.aweme.kids.setting.base.p3368a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.kids.setting.items.language.p3381d.C57959c;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.base.a.a */
public final class C57805a {
    static {
        Covode.recordClassIndex(67807);
    }

    /* renamed from: a */
    public static String m104529a(Context context) {
        String language = C57959c.m104743a(context).getLanguage();
        if (TextUtils.equals(language, "in")) {
            language = "id";
        }
        if (TextUtils.equals(language, "pt")) {
            language = "pt_BR";
        }
        if (TextUtils.equals(language, "zh")) {
            language = "zh_Hant";
        }
        if (TextUtils.equals(language, "km")) {
            return "en";
        }
        return language;
    }
}
