package com.bytedance.android.p126a.p136b.p137a;

import android.text.TextUtils;
import com.bytedance.android.p126a.p127a.AbstractC2632f;
import com.bytedance.android.p126a.p127a.C2628e;
import com.bytedance.android.p126a.p127a.p135h.C2646f;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: com.bytedance.android.a.b.a.a */
public abstract class AbstractC2653a {
    static {
        Covode.recordClassIndex(3041);
    }

    /* renamed from: a */
    private static String m7677a() {
        AbstractC2632f fVar = C2628e.m7607d().f7911h;
        if (fVar != null) {
            return fVar.mo7152a();
        }
        return "";
    }

    /* renamed from: a */
    public static Map<String, String> m7678a(List<String> list) {
        String valueOf = String.valueOf(System.currentTimeMillis());
        HashMap hashMap = new HashMap();
        if (list.isEmpty()) {
            m7679a(hashMap, valueOf);
            return hashMap;
        }
        for (String str : list) {
            try {
                if (TextUtils.equals("__TS__", str) || TextUtils.equals("{TS}", str)) {
                    hashMap.put(str, valueOf);
                } else if ((TextUtils.equals("__ANDROIDID__", str) || TextUtils.equals("{ANDROIDID}", str)) && !TextUtils.isEmpty("")) {
                    String a = C2646f.m7659a("");
                    if (!TextUtils.isEmpty(a)) {
                        hashMap.put(str, a);
                    }
                } else if ((TextUtils.equals("__ANDROIDID1__", str) || TextUtils.equals("{ANDROIDID1}", str)) && !TextUtils.isEmpty("")) {
                    hashMap.put(str, "");
                } else if ((TextUtils.equals("__AAID__", str) || TextUtils.equals("{AAID}", str)) && !TextUtils.isEmpty("")) {
                    hashMap.put(str, "");
                } else if ((TextUtils.equals("__OPENUDID__", str) || TextUtils.equals("{OPENUDID}", str)) && !TextUtils.isEmpty("")) {
                    hashMap.put(str, "");
                } else if ((TextUtils.equals("__OS__", str) || TextUtils.equals("{OS}", str)) && !TextUtils.isEmpty("0")) {
                    hashMap.put(str, "0");
                } else if ((TextUtils.equals("__IP__", str) || TextUtils.equals("{IP}", str)) && !TextUtils.isEmpty("")) {
                    hashMap.put(str, "");
                } else if ((TextUtils.equals("__UA__", str) || TextUtils.equals("{UA}", str)) && !TextUtils.isEmpty(m7677a())) {
                    String b = C2646f.m7660b(C2646f.m7661c(m7677a()));
                    if (!TextUtils.isEmpty(b)) {
                        hashMap.put(str, b);
                    }
                } else if ((TextUtils.equals("__UOO__", str) || TextUtils.equals("{UOO}", str)) && !TextUtils.isEmpty("")) {
                    hashMap.put(str, "");
                } else if ((TextUtils.equals("__DEVICE_ID__", str) || TextUtils.equals("{DEVICE_ID}", str)) && !TextUtils.isEmpty("")) {
                    hashMap.put(str, "");
                } else if ((TextUtils.equals("__OS_STR__", str) || TextUtils.equals("{OS_STR}", str)) && !TextUtils.isEmpty("Android")) {
                    hashMap.put(str, "Android");
                }
            } catch (Throwable unused) {
            }
        }
        m7679a(hashMap, valueOf);
        return hashMap;
    }

    /* renamed from: a */
    private static void m7679a(Map<String, String> map, String str) {
        map.put("[ss_random]", String.valueOf(new Random().nextLong()));
        map.put("[ss_timestamp]", str);
    }
}
