package com.p2082ss.android.push.window.oppo;

import android.content.Context;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.push.window.oppo.d */
public class C30202d {

    /* renamed from: c */
    private static C30202d f72039c;

    /* renamed from: a */
    Context f72040a;

    /* renamed from: b */
    C30197b<Integer, C30203a> f72041b = new C30197b<>(2);

    static {
        Covode.recordClassIndex(36708);
    }

    /* renamed from: com.ss.android.push.window.oppo.d$a */
    public static class C30203a {

        /* renamed from: a */
        public int f72042a;

        /* renamed from: b */
        public int f72043b;

        /* renamed from: c */
        public String f72044c;

        /* renamed from: d */
        public int f72045d;

        /* renamed from: e */
        public String f72046e;

        static {
            Covode.recordClassIndex(36709);
        }

        public final String toString() {
            return "MessageObj{id=" + this.f72042a + ", type=" + this.f72043b + ", obj='" + this.f72044c + '\'' + ", from=" + this.f72045d + ", extra='" + this.f72046e + '\'' + '}';
        }
    }

    /* renamed from: a */
    private void m61090a() {
        try {
            String a = C30198c.f72017a.mo53621a(this.f72040a, "pop_window_message_cache_list", "");
            if (!C13627m.m24498a(a)) {
                JSONArray jSONArray = new JSONArray(a);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    C30203a aVar = new C30203a();
                    if (optJSONObject != null) {
                        try {
                            aVar.f72042a = optJSONObject.optInt("id");
                            aVar.f72043b = optJSONObject.optInt(StringSet.type);
                            aVar.f72044c = optJSONObject.optString("obj");
                            aVar.f72045d = optJSONObject.optInt("from");
                            aVar.f72046e = optJSONObject.optString("extra");
                        } catch (Throwable unused) {
                        }
                    }
                    this.f72041b.mo53622a(Integer.valueOf(aVar.f72042a), aVar);
                }
            }
        } catch (Throwable unused2) {
        }
    }

    private C30202d(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        this.f72040a = applicationContext;
        this.f72041b = new C30197b<>(C30198c.m61083a(context).f72027j);
        m61090a();
    }

    /* renamed from: a */
    public static C30202d m61089a(Context context) {
        MethodCollector.m26663i(12000);
        if (f72039c == null) {
            synchronized (C30202d.class) {
                try {
                    if (f72039c == null) {
                        f72039c = new C30202d(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12000);
                    throw th;
                }
            }
        }
        C30202d dVar = f72039c;
        MethodCollector.m26664o(12000);
        return dVar;
    }
}
