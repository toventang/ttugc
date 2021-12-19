package com.p2082ss.android.ugc.aweme.commercialize.log;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.commercialize.C37698e;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.g */
public class C38185g {

    /* renamed from: a */
    public static final String f90217a = C38185g.class.getSimpleName();

    static {
        Covode.recordClassIndex(45664);
    }

    /* renamed from: a */
    public static void m77450a(AbstractC38162ah ahVar, Collection<String> collection, boolean z) {
        if (!C13603b.m24435a((Collection) collection)) {
            String a = RawURLGetter.m77316a("other");
            for (String str : collection) {
                if (!TextUtils.isEmpty(str)) {
                    m77451a(str, z, ahVar, a);
                }
            }
        }
    }

    /* renamed from: a */
    private static String m77449a(String str, long j, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            if (str.contains("{TS}") || str.contains("__TS__")) {
                str = str.replace("{TS}", String.valueOf(j)).replace("__TS__", String.valueOf(j));
            }
            String serverDeviceId = AppLog.getServerDeviceId();
            if (TextUtils.isEmpty(serverDeviceId)) {
                return str;
            }
            String a = C37698e.m76197a(str, serverDeviceId);
            if (a.contains("{UA}") || a.contains("__UA__")) {
                return a.replace("{UA}", str2).replace("__UA__", str2);
            }
            return a;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: a */
    private static void m77451a(String str, boolean z, AbstractC38162ah ahVar, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        String a = m77449a(str, currentTimeMillis, str2);
        if (z) {
            a = C13627m.m24500b(a);
        }
        Uri parse = Uri.parse(a);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("track_url", a);
            jSONObject.put("scheme", parse.getScheme());
            jSONObject.put("host", parse.getHost());
            jSONObject.put("path", parse.getPath());
            jSONObject.put("ref", "native");
        } catch (JSONException unused) {
        }
        RawURLGetter.m77318a(a, new C38186h(ahVar, a, currentTimeMillis, jSONObject));
    }
}
