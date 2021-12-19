package com.p2082ss.android.newmedia.p2163a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17862b;
import java.util.Properties;
import org.json.JSONObject;

/* renamed from: com.ss.android.newmedia.a.a */
public class C30122a {

    /* renamed from: c */
    private static C30122a f71862c;

    /* renamed from: a */
    private Properties f71863a = new Properties();

    /* renamed from: b */
    private JSONObject f71864b;

    static {
        Covode.recordClassIndex(36621);
    }

    /* renamed from: a */
    private static boolean m60928a(JSONObject jSONObject) {
        try {
            if (!TextUtils.isEmpty(jSONObject.getString("meta_channel"))) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private static String m60930c(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null) {
                return null;
            }
            return applicationInfo.sourceDir;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static JSONObject m60929b(Context context) {
        try {
            String a = C17862b.m33074a(m60930c(context));
            if (TextUtils.isEmpty(a)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(a);
            if (!m60928a(jSONObject)) {
                return null;
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    private C30122a(Context context) {
        MethodCollector.m26663i(3110);
        try {
            this.f71864b = m60929b(context);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            this.f71863a.load(context.getAssets().open("ss.properties"));
            MethodCollector.m26664o(3110);
        } catch (Exception e2) {
            e2.printStackTrace();
            MethodCollector.m26664o(3110);
        }
    }

    /* renamed from: a */
    public static C30122a m60926a(Context context) {
        MethodCollector.m26663i(3111);
        if (f71862c == null) {
            synchronized (C30122a.class) {
                try {
                    if (f71862c == null) {
                        f71862c = new C30122a(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3111);
                    throw th;
                }
            }
        }
        C30122a aVar = f71862c;
        MethodCollector.m26664o(3111);
        return aVar;
    }

    /* renamed from: a */
    private Object m60927a(String str) {
        Object obj;
        try {
            JSONObject jSONObject = this.f71864b;
            if (jSONObject != null) {
                obj = jSONObject.get(str);
            } else {
                Properties properties = this.f71863a;
                if (properties == null || !properties.containsKey(str)) {
                    obj = null;
                } else {
                    obj = this.f71863a.get(str);
                }
            }
            Logger.debug();
            return obj;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final String mo53499a(String str, String str2) {
        Object a = m60927a(str);
        if (!(a instanceof String)) {
            return str2;
        }
        return (String) a;
    }
}
