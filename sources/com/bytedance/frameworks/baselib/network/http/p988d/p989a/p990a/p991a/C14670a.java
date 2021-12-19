package com.bytedance.frameworks.baselib.network.http.p988d.p989a.p990a.p991a;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.a.a.a */
public class C14670a {

    /* renamed from: a */
    private static final String f35613a = C14670a.class.getSimpleName();

    static {
        Covode.recordClassIndex(16767);
    }

    /* renamed from: a */
    public static String m26842a(List<String> list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) {
                sb.append(',');
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m26843a(String str) {
        if (str != null) {
            char[] charArray = str.toCharArray();
            if (charArray.length > 0 && charArray.length <= 255) {
                for (char c : charArray) {
                    if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '.' || c == '-'))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
