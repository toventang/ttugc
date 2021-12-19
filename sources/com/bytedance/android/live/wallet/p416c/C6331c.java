package com.bytedance.android.live.wallet.p416c;

import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.wallet.c.c */
public final class C6331c {
    static {
        Covode.recordClassIndex(7053);
    }

    /* renamed from: a */
    public static void m13652a(String str, HashMap<String, Object> hashMap) {
        C3868c.m9491a(str + "_all", 0, hashMap);
    }

    /* renamed from: a */
    public static void m13650a(String str, int i, int i2, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", Integer.valueOf(i));
        hashMap.put("error_msg", str2);
        hashMap.put("detail_code", Integer.valueOf(i2));
        C3868c.m9491a(str + "_all", 1, hashMap);
        C3868c.m9491a(str + "_error", 1, hashMap);
    }

    /* renamed from: a */
    public static void m13651a(String str, int i, int i2, String str2, HashMap<String, Object> hashMap) {
        hashMap.put("error_code", Integer.valueOf(i));
        hashMap.put("error_msg", str2);
        hashMap.put("detail_code", Integer.valueOf(i2));
        C3868c.m9491a(str + "_all", 1, hashMap);
        C3868c.m9491a(str + "_error", 1, hashMap);
    }
}
