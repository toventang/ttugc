package com.p2082ss.android.deviceregister.p2138c;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.deviceregister.p2134a.C29869d;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.deviceregister.c.a */
public class C29890a {

    /* renamed from: f */
    private static volatile C29890a f71323f;

    /* renamed from: a */
    public boolean f71324a;

    /* renamed from: b */
    public boolean f71325b;

    /* renamed from: c */
    public ConcurrentHashMap<String, String> f71326c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public WeakReference<Context> f71327d;

    /* renamed from: e */
    private String f71328e;

    static {
        Covode.recordClassIndex(36300);
    }

    /* renamed from: a */
    public final boolean mo52184a() {
        if (TextUtils.isEmpty(this.f71328e)) {
            this.f71328e = C29869d.f71247a;
        }
        return "local_test".equals(this.f71328e);
    }

    /* renamed from: a */
    public static C29890a m60254a(Context context) {
        MethodCollector.m26663i(387);
        if (f71323f == null) {
            synchronized (C29890a.class) {
                try {
                    if (f71323f == null) {
                        f71323f = new C29890a(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(387);
                    throw th;
                }
            }
        }
        C29890a aVar = f71323f;
        MethodCollector.m26664o(387);
        return aVar;
    }

    private C29890a(Context context) {
        this.f71327d = new WeakReference<>(context);
        if (mo52184a()) {
            String str = "";
            String string = C34822d.m71158a(this.f71327d.get(), "debug_new_user_mode_sp", 0).getString("new_user_mode_json_str", str);
            if (TextUtils.isEmpty(string)) {
                String b = C29891b.m60258b(this.f71327d.get());
                if (b != null && b.startsWith("newUserModeUtil:")) {
                    str = b.substring(16);
                }
                string = str;
            }
            try {
                m60255a(string);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            SharedPreferences.Editor edit = C34822d.m71158a(this.f71327d.get(), "debug_new_user_mode_sp", 0).edit();
            edit.putString("new_user_mode_json_str", string);
            edit.apply();
        }
    }

    /* renamed from: a */
    private void m60255a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        this.f71324a = jSONObject.optBoolean("is_new_user_mode", false);
        this.f71325b = jSONObject.optBoolean("auto_mode", false);
        JSONObject jSONObject2 = new JSONObject(jSONObject.optString("debug_custom_param", ""));
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.f71326c.put(next, jSONObject2.optString(next));
        }
    }
}
