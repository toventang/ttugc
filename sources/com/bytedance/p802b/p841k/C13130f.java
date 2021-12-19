package com.bytedance.p802b.p841k;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.b.k.f */
public final class C13130f {
    static {
        Covode.recordClassIndex(14966);
    }

    /* renamed from: a */
    public static boolean m23608a(List<?> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static Map<String, String> m23609b(List<Pair<String, String>> list) {
        if (m23608a(list)) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (Pair<String, String> pair : list) {
            if (!(pair == null || pair.first == null)) {
                hashMap.put(pair.first, pair.second);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static String m23607a(Object[] objArr, String str) {
        if (objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object obj : objArr) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            sb.append(obj.toString());
        }
        return sb.toString();
    }
}
