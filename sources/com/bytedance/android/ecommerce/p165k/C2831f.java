package com.bytedance.android.ecommerce.p165k;

import android.util.Pair;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.android.ecommerce.k.f */
public final class C2831f {
    static {
        Covode.recordClassIndex(3257);
    }

    /* renamed from: a */
    public static String m8103a(String str, List<Pair<String, String>> list) {
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        sb.append(C13624l.m24483a(list, "UTF-8"));
        return sb.toString();
    }
}
