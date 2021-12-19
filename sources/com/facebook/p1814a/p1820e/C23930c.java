package com.facebook.p1814a.p1820e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.facebook.EnumC25029u;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24710b;
import com.facebook.internal.C24783w;
import com.facebook.p1814a.C23874b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.a.e.c */
public final class C23930c {

    /* renamed from: a */
    private static final Map<EnumC23932a, String> f56656a = new HashMap<EnumC23932a, String>() {
        /* class com.facebook.p1814a.p1820e.C23930c.C239311 */

        static {
            Covode.recordClassIndex(28052);
        }

        {
            put(EnumC23932a.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL");
            put(EnumC23932a.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS");
        }
    };

    static {
        Covode.recordClassIndex(28051);
    }

    /* renamed from: com.facebook.a.e.c$a */
    public enum EnumC23932a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS;

        static {
            Covode.recordClassIndex(28053);
        }
    }

    /* renamed from: a */
    public static JSONObject m45243a(EnumC23932a aVar, C24710b bVar, String str, boolean z, Context context) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f56656a.get(aVar));
        String a = C23874b.m45140a();
        if (a != null) {
            jSONObject.put("app_user_id", a);
        }
        C24693ad.m47258a(jSONObject, bVar, str, z);
        try {
            C24693ad.m47257a(jSONObject, context);
        } catch (Exception e) {
            C24783w.m47441a(EnumC25029u.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e.toString());
        }
        JSONObject f = C24693ad.m47286f();
        if (f != null) {
            Iterator<String> keys = f.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, f.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
