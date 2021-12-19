package com.p2082ss.android.ugc.aweme.lancet;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33659b;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.lancet.q */
public final class C58036q {
    static {
        Covode.recordClassIndex(68071);
    }

    /* renamed from: a */
    public static void m104857a(String str) {
        Uri parse;
        List<String> pathSegments;
        if (!TextUtils.isEmpty(str) && str.startsWith("aweme://user/profile/") && (pathSegments = (parse = Uri.parse(str)).getPathSegments()) != null && pathSegments.size() >= 2) {
            C33659b.C33694h.m68983a(pathSegments.get(1), parse, false);
        }
    }
}
