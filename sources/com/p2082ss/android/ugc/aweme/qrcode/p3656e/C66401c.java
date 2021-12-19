package com.p2082ss.android.ugc.aweme.qrcode.p3656e;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.qrcode.api.C66371a;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.qrcode.e.c */
public final class C66401c {
    static {
        Covode.recordClassIndex(77933);
    }

    /* renamed from: a */
    public static boolean m118095a(String str) {
        if (m118096b(str)) {
            return m118094a(Uri.parse(str));
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m118096b(String str) {
        if (str == null) {
            return false;
        }
        return Pattern.compile("(https?|http)://[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]").matcher(str).find();
    }

    /* renamed from: c */
    public static boolean m118097c(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("ttschema://view_grade_resource")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m118094a(Uri uri) {
        Set<String> c = C33842s.C33843a.f80132a.mo60062f().mo59941c();
        if (c.isEmpty()) {
            return C66371a.f149270a.contains(uri.getHost());
        }
        return c.contains(uri.getHost());
    }
}
