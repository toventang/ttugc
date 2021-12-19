package com.p2082ss.android.common.applog.p2129b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.applog.C29809u;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.applog.b.d */
public final class C29784d {

    /* renamed from: a */
    public long f71024a;

    /* renamed from: b */
    public String f71025b;

    /* renamed from: c */
    public boolean f71026c;

    /* renamed from: d */
    public String f71027d;

    /* renamed from: e */
    public boolean f71028e;

    /* renamed from: f */
    public String f71029f;

    /* renamed from: g */
    public long f71030g;

    /* renamed from: h */
    public long f71031h;

    /* renamed from: i */
    public long f71032i;

    static {
        Covode.recordClassIndex(36189);
    }

    public C29784d() {
    }

    public final String toString() {
        return mo52050a();
    }

    /* renamed from: a */
    public final String mo52050a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("start_time", this.f71024a);
            jSONObject.put("session_id", this.f71025b);
            jSONObject.put("is_front_continuous", this.f71026c);
            jSONObject.put("front_session_id", this.f71027d);
            jSONObject.put("is_end_continuous", this.f71028e);
            jSONObject.put("end_session_id", this.f71029f);
            jSONObject.put("latest_end_time", this.f71030g);
            jSONObject.put("non_task_time", this.f71031h);
            jSONObject.put("tea_event_index", this.f71032i);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    public C29784d(long j) {
        this.f71024a = j;
        this.f71025b = AppLog.genSession();
        this.f71032i = AppLog.genEventIndex();
    }

    /* renamed from: a */
    public static C29784d m59982a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("session_id", "");
            C29784d dVar = new C29784d();
            dVar.f71025b = optString;
            dVar.f71024a = C29809u.m60049a(jSONObject, "start_time");
            dVar.f71026c = jSONObject.optBoolean("is_front_continuous", false);
            dVar.f71027d = jSONObject.optString("front_session_id", "");
            dVar.f71028e = jSONObject.optBoolean("is_end_continuous", false);
            dVar.f71029f = jSONObject.optString("end_session_id", "");
            dVar.f71030g = C29809u.m60049a(jSONObject, "latest_end_time");
            dVar.f71031h = C29809u.m60049a(jSONObject, "non_task_time");
            dVar.f71032i = C29809u.m60049a(jSONObject, "tea_event_index");
            return dVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }
}
