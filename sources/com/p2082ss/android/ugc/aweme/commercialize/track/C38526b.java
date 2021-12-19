package com.p2082ss.android.ugc.aweme.commercialize.track;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.C16091a;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.track.b */
public class C38526b {

    /* renamed from: a */
    public static final String f91039a = C38526b.class.getSimpleName();

    static {
        Covode.recordClassIndex(46056);
    }

    /* renamed from: a */
    public static void m78143a(AbstractC38530e eVar, Collection<String> collection) {
        if (!C13603b.m24435a((Collection) collection)) {
            String c = RawURLGetter.m78123c();
            for (String str : collection) {
                if (!TextUtils.isEmpty(str)) {
                    m78144a(str, eVar, c);
                }
            }
        }
    }

    /* renamed from: a */
    public static String m78142a(String str, long j, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            if (str.contains("{TS}") || str.contains("__TS__")) {
                str = str.replace("{TS}", String.valueOf(j)).replace("__TS__", String.valueOf(j));
            }
            String deviceId = C16091a.f38743c.getDeviceId();
            if (TextUtils.isEmpty(deviceId)) {
                return str;
            }
            String a = C38525a.f91037a.mo65633a(str, deviceId);
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
    private static void m78144a(String str, AbstractC38530e eVar, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        String b = C13627m.m24500b(m78142a(str, currentTimeMillis, str2));
        Uri parse = Uri.parse(b);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("track_url", b);
            jSONObject.put("scheme", parse.getScheme());
            jSONObject.put("host", parse.getHost());
            jSONObject.put("path", parse.getPath());
            jSONObject.put("ref", "native");
        } catch (JSONException unused) {
        }
        RawURLGetter.m78121a(b, new C38527c(eVar, b, currentTimeMillis, jSONObject));
    }
}
