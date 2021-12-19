package com.bytedance.sdk.p1625a.p1664o;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.account.C29351f;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.o.b */
public class C22509b {

    /* renamed from: a */
    private static C22509b f53225a;

    /* renamed from: b */
    private SharedPreferences f53226b;

    static {
        Covode.recordClassIndex(26325);
    }

    private C22509b() {
    }

    /* renamed from: b */
    private SharedPreferences m42457b() {
        Context b;
        if (this.f53226b == null && (b = C29351f.m58781a().mo52210b()) != null) {
            this.f53226b = C34822d.m71158a(b, "com_bytedance_sdk_account_utils_common_request_cache_helper", 0);
        }
        return this.f53226b;
    }

    /* renamed from: a */
    public static C22509b m42455a() {
        MethodCollector.m26663i(2265);
        if (f53225a == null) {
            synchronized (C22509b.class) {
                try {
                    if (f53225a == null) {
                        f53225a = new C22509b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2265);
                    throw th;
                }
            }
        }
        C22509b bVar = f53225a;
        MethodCollector.m26664o(2265);
        return bVar;
    }

    /* renamed from: b */
    public static String m42458b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new URL(str).getPath();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: a */
    public final String mo36781a(String str) {
        SharedPreferences b;
        if (TextUtils.isEmpty(str) || (b = m42457b()) == null) {
            return null;
        }
        String a = m42456a(str, null);
        String string = b.getString(a, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (System.currentTimeMillis() < jSONObject.optLong("expire_timing")) {
                return jSONObject.optString("cache_value", "");
            }
            b.edit().putString(a, "").apply();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static String m42456a(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (map != null && !map.isEmpty()) {
            ArrayList arrayList = new ArrayList(map.keySet());
            Collections.sort(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = map.get(it.next());
                if (str2 != null) {
                    sb.append(str2);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo36782a(String str, Map<String, String> map, String str2, long j) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                String a = m42456a(str, map);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("expire_timing", j);
                jSONObject.put("cache_value", str2);
                SharedPreferences b = m42457b();
                if (b != null && System.currentTimeMillis() < j) {
                    b.edit().putString(a, jSONObject.toString()).apply();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
