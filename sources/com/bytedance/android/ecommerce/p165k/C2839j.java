package com.bytedance.android.ecommerce.p165k;

import android.text.TextUtils;
import com.bytedance.android.ecommerce.p159e.C2778c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.ecommerce.k.j */
public final class C2839j {
    static {
        Covode.recordClassIndex(3265);
    }

    /* renamed from: a */
    public static String m8118a(String str, String... strArr) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String c = C2778c.f8362a.mo7370b().mo7387c(str);
        if (c == null || !c.contains("{the_field}") || strArr.length <= 0) {
            return c;
        }
        return c.replace("{the_field}", C2778c.f8362a.mo7370b().mo7387c(strArr[0]));
    }
}
