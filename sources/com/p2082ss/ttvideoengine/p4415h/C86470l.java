package com.p2082ss.ttvideoengine.p4415h;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.ttvideoengine.h.l */
public final class C86470l {
    static {
        Covode.recordClassIndex(101698);
    }

    /* renamed from: a */
    static Map<String, Long> m149391a(String str) {
        String[] split;
        HashMap hashMap = new HashMap();
        if (!(TextUtils.isEmpty(str) || (split = str.split(";|:")) == null || split.length == 0)) {
            for (int i = 0; i < split.length - 1; i += 2) {
                try {
                    hashMap.put(split[i], Long.valueOf(Long.parseLong(split[i + 1])));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    static void m149392a(Map map, String str, float f) {
        if (f != Float.MIN_VALUE) {
            map.put(str, Float.valueOf(f));
        }
    }

    /* renamed from: a */
    static void m149393a(Map map, String str, int i) {
        if (i != Integer.MIN_VALUE) {
            map.put(str, Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    static void m149394a(Map map, String str, long j) {
        if (j != -2147483648L) {
            map.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: a */
    static void m149395a(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    /* renamed from: a */
    static void m149396a(Map map, String str, ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            map.put(str, arrayList);
        }
    }
}
