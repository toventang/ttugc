package com.bytedance.android.livesdk.service.p625c.p635j;

import android.text.TextUtils;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.service.c.j.a */
public final class C10759a {
    static {
        Covode.recordClassIndex(12356);
    }

    /* renamed from: a */
    public static void m19358a(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("desc", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("gift_id", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("msg_id", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("asset_id", str4);
        }
        C6555i.m14021b().mo9220c("ttlive_gift", hashMap);
    }
}
