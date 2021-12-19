package com.facebook.internal.p1894a.p1897c;

import com.bytedance.covode.number.Covode;
import com.facebook.internal.p1894a.C24686d;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.a.c.a */
public final class C24681a {

    /* renamed from: a */
    public String f58612a;

    /* renamed from: b */
    Long f58613b;

    /* renamed from: c */
    private String f58614c;

    static {
        Covode.recordClassIndex(28834);
    }

    /* renamed from: a */
    public final boolean mo40508a() {
        if (this.f58614c == null || this.f58613b == null) {
            return false;
        }
        return true;
    }

    public final String toString() {
        JSONObject b = m47212b();
        if (b == null) {
            return null;
        }
        return b.toString();
    }

    /* renamed from: b */
    private JSONObject m47212b() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.f58613b;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            jSONObject.put("error_message", this.f58614c);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public C24681a(File file) {
        String name = file.getName();
        this.f58612a = name;
        JSONObject a = C24686d.m47218a(name);
        if (a != null) {
            this.f58613b = Long.valueOf(a.optLong("timestamp", 0));
            this.f58614c = a.optString("error_message", null);
        }
    }

    public C24681a(String str) {
        this.f58613b = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f58614c = str;
        this.f58612a = new StringBuffer("error_log_").append(this.f58613b).append(".json").toString();
    }
}
