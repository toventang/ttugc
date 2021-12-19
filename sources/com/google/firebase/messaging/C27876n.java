package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.android.datatransport.AbstractC25069c;
import com.google.android.datatransport.AbstractC25113f;
import com.google.firebase.C27695b;
import com.google.firebase.analytics.connector.AbstractC27689a;
import com.google.firebase.messaging.C27870k;
import com.google.firebase.p2008a.AbstractC27673a;
import com.google.firebase.p2008a.C27681c;
import com.google.firebase.p2008a.p2009a.C27674a;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58014b;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.messaging.n */
public final class C27876n {

    /* renamed from: a */
    private static final AbstractC27673a f65460a = new C27674a().mo46300a(C27870k.C27872b.class, new C27870k.C27873c()).mo46300a(C27870k.class, new C27870k.C27871a()).mo46301a();

    static {
        Covode.recordClassIndex(33469);
    }

    /* renamed from: a */
    static boolean m55792a() {
        ApplicationInfo applicationInfo;
        try {
            C27695b.m55376d();
            Context a = C27695b.m55376d().mo46324a();
            SharedPreferences a2 = C34822d.m71158a(a, "com.google.firebase.messaging", 0);
            if (a2.contains("export_to_big_query")) {
                return a2.getBoolean("export_to_big_query", false);
            }
            PackageManager packageManager = a.getPackageManager();
            if (packageManager != null) {
                String packageName = a.getPackageName();
                if (TextUtils.equals(packageName, C17867d.m33078a().getPackageName())) {
                    if (C58014b.f132218a == null) {
                        C58014b.f132218a = packageManager.getApplicationInfo(packageName, 128);
                    }
                    applicationInfo = C58014b.f132218a;
                } else {
                    applicationInfo = packageManager.getApplicationInfo(packageName, 128);
                }
                if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("delivery_metrics_exported_to_big_query_enabled"))) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            }
            return false;
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: d */
    public static Bundle m55796d(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    static boolean m55794b(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    /* renamed from: e */
    static String m55797e(Intent intent) {
        String a = m55788a(intent, "from");
        if (a == null || !a.startsWith("/topics/")) {
            return null;
        }
        return a;
    }

    /* renamed from: c */
    static int m55795c(Intent intent) {
        Object a = m55787a(m55796d(intent), "google.ttl");
        if (a instanceof Integer) {
            return ((Integer) a).intValue();
        }
        if (!(a instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) a);
        } catch (NumberFormatException unused) {
            String.valueOf(String.valueOf(a)).length();
            return 0;
        }
    }

    /* renamed from: a */
    public static boolean m55793a(Intent intent) {
        if (intent == null || m55794b(intent)) {
            return false;
        }
        return "1".equals(m55788a(intent, "google.c.a.e"));
    }

    /* renamed from: a */
    private static Object m55787a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m55788a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m55789a(Intent intent, AbstractC25113f<String> fVar) {
        m55790a("_nr", intent);
        if (fVar != null) {
            m55791a("MESSAGE_DELIVERED", intent, fVar);
        }
    }

    /* renamed from: a */
    public static void m55790a(String str, Intent intent) {
        String str2;
        String a;
        try {
            Bundle bundle = new Bundle();
            String a2 = m55788a(intent, "google.c.a.c_id");
            if (a2 != null) {
                bundle.putString("_nmid", a2);
            }
            String a3 = m55788a(intent, "google.c.a.c_l");
            if (a3 != null) {
                bundle.putString("_nmn", a3);
            }
            String a4 = m55788a(intent, "google.c.a.m_l");
            if (!TextUtils.isEmpty(a4)) {
                bundle.putString("label", a4);
            }
            String a5 = m55788a(intent, "google.c.a.m_c");
            if (!TextUtils.isEmpty(a5)) {
                bundle.putString("message_channel", a5);
            }
            String e = m55797e(intent);
            if (e != null) {
                bundle.putString("_nt", e);
            }
            String a6 = m55788a(intent, "google.c.a.ts");
            if (a6 != null) {
                try {
                    bundle.putInt("_nmt", Integer.parseInt(a6));
                } catch (NumberFormatException unused) {
                }
            }
            if (intent.hasExtra("google.c.a.udt") && (a = m55788a(intent, "google.c.a.udt")) != null) {
                try {
                    bundle.putInt("_ndt", Integer.parseInt(a));
                } catch (NumberFormatException unused2) {
                }
            }
            if (m55796d(intent) == null || !C27877o.m55798a(m55796d(intent))) {
                str2 = "data";
            } else {
                str2 = "display";
            }
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf = String.valueOf(bundle);
                String.valueOf(str).length();
                String.valueOf(valueOf).length();
            }
            AbstractC27689a aVar = (AbstractC27689a) C27695b.m55376d().mo46325a(AbstractC27689a.class);
            if (aVar != null) {
                aVar.mo46318a("fcm", str, bundle);
            }
        } catch (IllegalStateException e2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_reason", e2.toString());
                C12290b.m22066a("firebase_initialize_error", jSONObject, (JSONObject) null, (JSONObject) null);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m55791a(String str, Intent intent, AbstractC25113f<String> fVar) {
        try {
            fVar.mo41062a(AbstractC25069c.m48046a(f65460a.mo46298a(new C27870k.C27872b(new C27870k(str, intent)))));
        } catch (C27681c unused) {
        }
    }
}
