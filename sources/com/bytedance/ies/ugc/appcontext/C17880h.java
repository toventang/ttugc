package com.bytedance.ies.ugc.appcontext;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Properties;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.ugc.appcontext.h */
class C17880h {

    /* renamed from: d */
    private static C17880h f42649d;

    /* renamed from: a */
    private Properties f42650a;

    /* renamed from: b */
    private JSONObject f42651b;

    /* renamed from: c */
    private Context f42652c;

    static {
        Covode.recordClassIndex(20481);
    }

    /* renamed from: a */
    private static boolean m33108a(JSONObject jSONObject) {
        try {
            if (!TextUtils.isEmpty(jSONObject.getString("meta_channel"))) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private static String m33110c(Context context) {
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

    private C17880h(Context context) {
        this.f42652c = context;
        try {
            this.f42651b = m33109b(context);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private static JSONObject m33109b(Context context) {
        try {
            String a = C17862b.m33074a(m33110c(context));
            if (TextUtils.isEmpty(a)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(a);
            if (!m33108a(jSONObject)) {
                return null;
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C17880h m33107a(Context context) {
        MethodCollector.m26663i(1909);
        if (f42649d == null) {
            synchronized (C17880h.class) {
                try {
                    if (f42649d == null) {
                        f42649d = new C17880h(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1909);
                    throw th;
                }
            }
        }
        C17880h hVar = f42649d;
        MethodCollector.m26664o(1909);
        return hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo28459a(String str) {
        MethodCollector.m26663i(1943);
        Object obj = null;
        try {
            JSONObject jSONObject = this.f42651b;
            if (jSONObject != null) {
                obj = jSONObject.get(str);
            }
        } catch (Throwable unused) {
        }
        if (obj != null) {
            new StringBuilder("Key:").append(str).append(";Value:").append(obj).append(" load from channel info file!");
            MethodCollector.m26664o(1943);
            return obj;
        }
        try {
            if (this.f42650a == null) {
                Properties properties = new Properties();
                this.f42650a = properties;
                try {
                    properties.load(this.f42652c.getAssets().open("ss.properties"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Properties properties2 = this.f42650a;
            if (properties2 != null && properties2.containsKey(str)) {
                obj = this.f42650a.get(str);
                new StringBuilder("Key:").append(str).append(";Value:").append(obj).append(" load from ss.properties file!");
            }
        } catch (Throwable unused2) {
        }
        MethodCollector.m26664o(1943);
        return obj;
    }
}
