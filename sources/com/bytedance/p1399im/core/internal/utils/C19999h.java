package com.bytedance.p1399im.core.internal.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.C27917g;
import com.google.gson.p2019b.C27895a;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.utils.h */
public final class C19999h {

    /* renamed from: a */
    public static C27910f f47538a = new C27917g().mo46679a(new EnumTypeAdapterFactory()).mo46682b();

    /* renamed from: b */
    public static C27910f f47539b = new C27917g().mo46679a(new EnumTypeAdapterFactory()).mo46678a(new C19992a()).mo46682b();

    static {
        Covode.recordClassIndex(22844);
    }

    /* renamed from: a */
    public static String m37773a(Map<String, String> map) {
        if (map != null) {
            try {
                if (map.size() > 0) {
                    return f47538a.mo46674b(map);
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* renamed from: a */
    public static Map<String, String> m37774a(String str) {
        try {
            return (Map) f47538a.mo46671a(str, new C27895a<Map<String, String>>() {
                /* class com.bytedance.p1399im.core.internal.utils.C19999h.C200001 */

                static {
                    Covode.recordClassIndex(22845);
                }
            }.type);
        } catch (Exception unused) {
            return null;
        }
    }
}
