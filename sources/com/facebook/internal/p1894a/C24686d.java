package com.facebook.internal.p1894a;

import android.content.Context;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.facebook.AccessToken;
import com.facebook.C24872m;
import com.facebook.GraphRequest;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.a.d */
public final class C24686d {
    static {
        Covode.recordClassIndex(28839);
    }

    /* renamed from: a */
    public static File m47215a() {
        C24699ae.m47299a();
        File file = new File(m47216a(C24872m.f59047g), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m47222b(String str) {
        File a = m47215a();
        if (a == null || str == null) {
            return false;
        }
        return m47221a(new File(a, str));
    }

    /* renamed from: a */
    private static File m47216a(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    /* renamed from: a */
    public static String m47217a(Throwable th) {
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        do {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                jSONArray.put(stackTraceElement.toString());
            }
            th = th.getCause();
            if (th == null) {
                break;
            }
        } while (th != th);
        return jSONArray.toString();
    }

    /* renamed from: a */
    public static JSONObject m47218a(String str) {
        MethodCollector.m26663i(7034);
        File a = m47215a();
        if (a == null || str == null) {
            MethodCollector.m26664o(7034);
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(C24693ad.m47235a((InputStream) new FileInputStream(new File(a, str))));
            MethodCollector.m26664o(7034);
            return jSONObject;
        } catch (Exception unused) {
            m47222b(str);
            MethodCollector.m26664o(7034);
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m47221a(File file) {
        MethodCollector.m26663i(7332);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(7332);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(7332);
        return delete;
    }

    /* renamed from: a */
    public static void m47219a(String str, String str2) {
        MethodCollector.m26663i(7191);
        File a = m47215a();
        if (a == null || str == null || str2 == null) {
            MethodCollector.m26664o(7191);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(a, str));
            fileOutputStream.write(str2.getBytes());
            fileOutputStream.close();
            MethodCollector.m26664o(7191);
        } catch (Exception unused) {
            MethodCollector.m26664o(7191);
        }
    }

    /* renamed from: a */
    public static void m47220a(String str, JSONArray jSONArray, GraphRequest.AbstractC23858b bVar) {
        if (jSONArray.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str, jSONArray.toString());
                C24699ae.m47299a();
                GraphRequest.m45067a((AccessToken) null, C1764a.m5928a("%s/instruments", new Object[]{C24872m.f59041a}), jSONObject, bVar).mo39347a();
            } catch (JSONException unused) {
            }
        }
    }
}
