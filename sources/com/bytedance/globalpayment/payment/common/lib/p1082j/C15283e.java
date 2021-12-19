package com.bytedance.globalpayment.payment.common.lib.p1082j;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.bytedance.globalpayment.payment.common.lib.j.e */
public class C15283e {

    /* renamed from: a */
    private static final String f37290a = C15283e.class.getCanonicalName();

    static {
        Covode.recordClassIndex(17483);
    }

    /* renamed from: a */
    public static String m28158a(String str) {
        try {
            return new String(Base64.decode(str, 2), "UTF-8");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m28159a(Map<String, Long> map) {
        StringBuilder sb = new StringBuilder();
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, Long> entry : map.entrySet()) {
                sb.append(entry.getKey());
                sb.append(":");
                sb.append(entry.getValue());
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
