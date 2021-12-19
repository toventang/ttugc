package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.C0643b;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.firebase.C27695b;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.iid.aq */
public final class C27774aq {

    /* renamed from: a */
    final SharedPreferences f65258a;

    /* renamed from: b */
    final Context f65259b;

    /* renamed from: c */
    private final Map<String, Long> f65260c = new C0484a();

    static {
        Covode.recordClassIndex(33362);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.iid.aq$a */
    public static class C27775a {

        /* renamed from: d */
        private static final long f65261d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        final String f65262a;

        /* renamed from: b */
        final String f65263b;

        /* renamed from: c */
        final long f65264c;

        static {
            Covode.recordClassIndex(33363);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final boolean mo46432b(String str) {
            if (System.currentTimeMillis() > this.f65264c + f65261d || !str.equals(this.f65263b)) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        static C27775a m55547a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new C27775a(str, null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C27775a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                String.valueOf(String.valueOf(e)).length();
                return null;
            }
        }

        private C27775a(String str, String str2, long j) {
            this.f65262a = str;
            this.f65263b = str2;
            this.f65264c = j;
        }

        /* renamed from: a */
        static String m55548a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                String.valueOf(String.valueOf(e)).length();
                return null;
            }
        }
    }

    /* renamed from: b */
    private synchronized boolean m55540b() {
        boolean isEmpty;
        MethodCollector.m26663i(12338);
        isEmpty = this.f65258a.getAll().isEmpty();
        MethodCollector.m26664o(12338);
        return isEmpty;
    }

    /* renamed from: a */
    public final synchronized void mo46429a() {
        MethodCollector.m26663i(12454);
        this.f65260c.clear();
        this.f65258a.edit().clear().commit();
        MethodCollector.m26664o(12454);
    }

    /* renamed from: c */
    private long m55541c(String str) {
        String string = this.f65258a.getString(m55538a(str, "cre"), null);
        if (string == null) {
            return 0;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public C27774aq(Context context) {
        File a;
        this.f65259b = context;
        this.f65258a = C34822d.m71158a(context, "com.google.android.gms.appid", 0);
        if (Build.VERSION.SDK_INT >= 21) {
            a = context.getNoBackupFilesDir();
        } else {
            a = C0643b.m2370a(new File(context.getApplicationInfo().dataDir, "no_backup"));
        }
        File file = new File(a, "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !m55540b()) {
                    mo46429a();
                    FirebaseInstanceId.getInstance(C27695b.m55376d()).mo46402g();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e.getMessage());
                    if (valueOf.length() != 0) {
                        "Error creating file in no backup dir: ".concat(valueOf);
                    } else {
                        new String("Error creating file in no backup dir: ");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized long mo46427a(String str) {
        long currentTimeMillis;
        MethodCollector.m26663i(12571);
        currentTimeMillis = System.currentTimeMillis();
        if (!this.f65258a.contains(m55538a(str, "cre"))) {
            SharedPreferences.Editor edit = this.f65258a.edit();
            edit.putString(m55538a(str, "cre"), String.valueOf(currentTimeMillis));
            edit.commit();
        } else {
            currentTimeMillis = m55541c(str);
        }
        this.f65260c.put(str, Long.valueOf(currentTimeMillis));
        MethodCollector.m26664o(12571);
        return currentTimeMillis;
    }

    /* renamed from: b */
    public final synchronized void mo46431b(String str) {
        MethodCollector.m26663i(12673);
        String concat = String.valueOf(str).concat("|T|");
        SharedPreferences.Editor edit = this.f65258a.edit();
        for (String str2 : this.f65258a.getAll().keySet()) {
            if (str2.startsWith(concat)) {
                edit.remove(str2);
            }
        }
        edit.commit();
        MethodCollector.m26664o(12673);
    }

    /* renamed from: a */
    private static String m55538a(String str, String str2) {
        return new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length()).append(str).append("|S|").append(str2).toString();
    }

    /* renamed from: a */
    public final synchronized C27775a mo46428a(String str, String str2, String str3) {
        C27775a a;
        MethodCollector.m26663i(12455);
        a = C27775a.m55547a(this.f65258a.getString(m55539b(str, str2, str3), null));
        MethodCollector.m26664o(12455);
        return a;
    }

    /* renamed from: b */
    private static String m55539b(String str, String str2, String str3) {
        return new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length()).append(str).append("|T|").append(str2).append("|").append(str3).toString();
    }

    /* renamed from: a */
    public final synchronized void mo46430a(String str, String str2, String str3, String str4, String str5) {
        MethodCollector.m26663i(12568);
        String a = C27775a.m55548a(str4, str5, System.currentTimeMillis());
        if (a == null) {
            MethodCollector.m26664o(12568);
            return;
        }
        SharedPreferences.Editor edit = this.f65258a.edit();
        edit.putString(m55539b(str, str2, str3), a);
        edit.commit();
        MethodCollector.m26664o(12568);
    }
}
