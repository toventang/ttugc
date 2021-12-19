package com.p2082ss.android.newmedia;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.newmedia.c */
public final class C30126c {
    static {
        Covode.recordClassIndex(36625);
    }

    /* renamed from: a */
    public static boolean m60939a(String str, String str2, List<String> list) {
        boolean startsWith;
        if (!TextUtils.isEmpty(str) && list != null && !list.isEmpty()) {
            if (str2 == null) {
                str2 = Uri.parse(str).getScheme();
            }
            if (TextUtils.equals(str2, "sslocal")) {
                return true;
            }
            for (String str3 : list) {
                if (!(str == null || str2 == null || str3 == null)) {
                    if (!str3.contains(":")) {
                        startsWith = TextUtils.equals(str2, str3);
                    } else {
                        startsWith = str.startsWith(str3);
                    }
                    if (startsWith) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
