package com.bytedance.android.livesdk.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.utils.k */
public final class C11274k {

    /* renamed from: a */
    public HashMap<String, String> f26963a = new HashMap<>();

    static {
        Covode.recordClassIndex(12906);
    }

    /* renamed from: a */
    public final C11274k mo18034a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f26963a.put(str, str2);
        }
        return this;
    }
}
