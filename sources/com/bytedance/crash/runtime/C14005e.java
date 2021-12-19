package com.bytedance.crash.runtime;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.runtime.p934b.C13996a;
import com.bytedance.crash.util.C14062n;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.runtime.e */
public final class C14005e extends C13996a {
    static {
        Covode.recordClassIndex(16070);
    }

    @Override // com.bytedance.crash.runtime.p934b.C13996a
    /* renamed from: a */
    public final long mo22513a() {
        return Long.decode(C14062n.m25599b(this.f34119b, "general", "slardar_api_settings", "fetch_setting", "fetch_setting_interval")).longValue() * 1000;
    }

    public C14005e(JSONObject jSONObject, String str) {
        super(jSONObject, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0064, code lost:
        if (r9 == false) goto L_0x006c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m25385a(java.util.Map<java.lang.String, java.lang.String> r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.runtime.C14005e.m25385a(java.util.Map, java.lang.String):boolean");
    }
}
