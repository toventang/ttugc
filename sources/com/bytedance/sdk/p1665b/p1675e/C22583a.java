package com.bytedance.sdk.p1665b.p1675e;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.p1665b.C22518a;
import com.bytedance.sdk.p1665b.p1667b.C22530b;
import com.bytedance.sdk.p1665b.p1667b.C22531c;
import com.bytedance.sdk.p1665b.p1668c.C22539a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.bytedance.sdk.b.e.a */
public class C22583a {

    /* renamed from: b */
    private static C22583a f53361b;

    /* renamed from: a */
    public SharedPreferences f53362a;

    static {
        Covode.recordClassIndex(26399);
    }

    private C22583a() {
        Context c = C22518a.m42479c();
        if (c != null) {
            this.f53362a = C34822d.m71158a(c, "mobile_data_sdk_storage", 0);
        }
    }

    /* renamed from: c */
    public final C22530b mo36868c() {
        String b = mo36866b("free_flow_entity_string");
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        try {
            return C22530b.m42502a(b);
        } catch (Exception e) {
            C22539a.m42536d(e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static C22583a m42598a() {
        MethodCollector.m26663i(1157);
        if (f53361b == null) {
            synchronized (C22583a.class) {
                try {
                    if (f53361b == null) {
                        f53361b = new C22583a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1157);
                    throw th;
                }
            }
        }
        C22583a aVar = f53361b;
        MethodCollector.m26664o(1157);
        return aVar;
    }

    /* renamed from: b */
    public final C22531c mo36865b() {
        SharedPreferences sharedPreferences = this.f53362a;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString("mobile_status_string", "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    return C22531c.m42504a(string);
                } catch (Exception e) {
                    C22539a.m42536d(e.getMessage());
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo36863a(String str) {
        if (!TextUtils.isEmpty(str)) {
            mo36864a("free_flow_entity_string", str);
        }
    }

    /* renamed from: b */
    public final String mo36866b(String str) {
        SharedPreferences sharedPreferences = this.f53362a;
        if (sharedPreferences != null) {
            return sharedPreferences.getString(str, "");
        }
        return "";
    }

    /* renamed from: c */
    public final int mo36867c(String str) {
        SharedPreferences sharedPreferences = this.f53362a;
        if (sharedPreferences != null) {
            return sharedPreferences.getInt(str, -1);
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo36864a(String str, String str2) {
        SharedPreferences sharedPreferences = this.f53362a;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }
}
