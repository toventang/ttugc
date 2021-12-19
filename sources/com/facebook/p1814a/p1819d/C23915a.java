package com.facebook.p1814a.p1819d;

import com.bytedance.covode.number.Covode;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.p1821f.C23953c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.a.d.a */
public final class C23915a {

    /* renamed from: a */
    public static boolean f56624a;

    /* renamed from: b */
    public static boolean f56625b;

    static {
        Covode.recordClassIndex(28036);
    }

    /* renamed from: a */
    private static boolean m45224a(String str) {
        if (C24677a.m47209a(C23915a.class)) {
            return false;
        }
        try {
            if (!"none".equals(m45225b(str))) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23915a.class);
            return false;
        }
    }

    /* renamed from: b */
    private static String m45225b(String str) {
        if (C24677a.m47209a(C23915a.class)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            Arrays.fill(fArr, 0.0f);
            String[] a = C23953c.m45288a(C23953c.EnumC23958a.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            if (a == null) {
                return "none";
            }
            return a[0];
        } catch (Throwable th) {
            C24677a.m47208a(th, C23915a.class);
            return null;
        }
    }

    /* renamed from: a */
    public static void m45223a(Map<String, String> map) {
        if (!C24677a.m47209a(C23915a.class)) {
            try {
                if (!f56624a) {
                    return;
                }
                if (map.size() != 0) {
                    try {
                        ArrayList<String> arrayList = new ArrayList(map.keySet());
                        JSONObject jSONObject = new JSONObject();
                        for (String str : arrayList) {
                            String str2 = map.get(str);
                            if (m45224a(str) || m45224a(str2)) {
                                map.remove(str);
                                if (!f56625b) {
                                    str2 = "";
                                }
                                jSONObject.put(str, str2);
                            }
                        }
                        if (jSONObject.length() != 0) {
                            map.put("_onDeviceParams", jSONObject.toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C23915a.class);
            }
        }
    }
}
