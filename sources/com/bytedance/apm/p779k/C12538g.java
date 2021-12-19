package com.bytedance.apm.p779k;

import android.text.TextUtils;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p789q.C12577c;
import com.bytedance.apm.p789q.C12585h;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.k.g */
public class C12538g {

    /* renamed from: c */
    private static volatile C12538g f30452c;

    /* renamed from: a */
    public CopyOnWriteArraySet<String> f30453a = new CopyOnWriteArraySet<>();

    /* renamed from: b */
    public ConcurrentHashMap<String, String> f30454b = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(14354);
    }

    private C12538g() {
    }

    /* renamed from: a */
    public static C12538g m22536a() {
        if (f30452c == null) {
            synchronized (C12538g.class) {
                if (f30452c == null) {
                    f30452c = new C12538g();
                }
            }
        }
        return f30452c;
    }

    /* renamed from: b */
    public final String mo20362b() {
        String a = C12585h.m22680a(this.f30453a.toArray(), "#");
        if (TextUtils.isEmpty(a)) {
            return ActivityLifeObserver.getInstance().getTopActivityClassName();
        }
        return a;
    }

    /* renamed from: a */
    public final JSONObject mo20361a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.f30454b.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            if (z) {
                C12577c.C12579a.f30614a.mo20404a(jSONObject, false);
                C12577c.C12579a.f30614a.mo20405b(jSONObject, false);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
