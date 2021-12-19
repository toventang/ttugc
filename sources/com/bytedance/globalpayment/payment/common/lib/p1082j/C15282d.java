package com.bytedance.globalpayment.payment.common.lib.p1082j;

import android.util.Pair;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.bytedance.globalpayment.payment.common.lib.j.d */
public final class C15282d {
    static {
        Covode.recordClassIndex(17482);
    }

    /* renamed from: a */
    public static String m28157a(String str, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new Pair(entry.getKey(), entry.getValue()));
            }
        }
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        sb.append(C13624l.m24483a(arrayList, "UTF-8"));
        return sb.toString();
    }
}
