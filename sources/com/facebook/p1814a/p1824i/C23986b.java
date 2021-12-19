package com.facebook.p1814a.p1824i;

import android.content.SharedPreferences;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.C24693ad;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.p1816b.p1817a.C23888f;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.i.b */
final class C23986b {

    /* renamed from: a */
    static final Map<String, String> f56772a = new HashMap();

    /* renamed from: b */
    static SharedPreferences f56773b;

    /* renamed from: c */
    static final AtomicBoolean f56774c = new AtomicBoolean(false);

    C23986b() {
    }

    static {
        Covode.recordClassIndex(28107);
    }

    /* renamed from: a */
    static String m45360a(String str) {
        if (C24677a.m47209a(C23986b.class)) {
            return null;
        }
        try {
            Map<String, String> map = f56772a;
            if (map.containsKey(str)) {
                return map.get(str);
            }
            return null;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23986b.class);
            return null;
        }
    }

    /* renamed from: a */
    static String m45359a(View view, String str) {
        if (C24677a.m47209a(C23986b.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", str);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = C23888f.m45157a(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return C24693ad.m47265b(jSONObject.toString());
        } catch (Throwable th) {
            C24677a.m47208a(th, C23986b.class);
            return null;
        }
    }
}
