package com.p2082ss.android.ugc.aweme.aabplugin.core.base.p2230a;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.aabplugin.core.base.AbstractC31339n;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.plugin.aab.C63128c;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.aabplugin.core.base.a.c */
public final class C31316c {
    /* renamed from: a */
    public static int m65514a(int i) {
        if (i == 2 || i == 3 || i == 4) {
            return 3;
        }
        if (i != 5) {
            return i != 8 ? 4 : 2;
        }
        return 1;
    }

    static {
        Covode.recordClassIndex(38016);
        C63128c.m114082c();
    }

    /* renamed from: a */
    public static JSONObject m65515a(AbstractC31339n nVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : nVar.mo57343c().entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m65516a(AbstractC31339n nVar, int i) {
        if (nVar != null) {
            try {
                JSONObject a = m65515a(nVar);
                a.put("status", i);
                a.put("is_silent_install", nVar.f75077a);
                a.put("is_regain_install", nVar.f75090n);
                C39162r.m79463b("df_install", a);
                C12290b.m22060a("df_install", m65514a(i), a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m65517a(AbstractC31339n nVar, int i, String str) {
        if (nVar != null) {
            try {
                JSONObject a = m65515a(nVar);
                a.put("operation", i);
                a.put("is_silent_install", nVar.f75077a);
                a.put("extra_info", str);
                C39162r.m79463b("df_downloader_op", a);
                C12290b.m22060a("df_downloader_op", i, a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
