package com.bytedance.p802b.p819d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.p802b.p831i.p832a.C13099c;
import com.bytedance.p802b.p831i.p832a.p833a.AbstractC13097a;
import com.bytedance.p802b.p841k.C13129e;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.d.b */
public final class C13030b extends AbstractC13097a {

    /* renamed from: a */
    private long f31761a;

    /* renamed from: b */
    private long f31762b;

    /* renamed from: c */
    private long f31763c;

    /* renamed from: d */
    private long f31764d;

    /* renamed from: e */
    private long f31765e;

    /* renamed from: f */
    private long f31766f;

    /* renamed from: g */
    private long f31767g;

    /* renamed from: h */
    private double f31768h;

    /* renamed from: i */
    private JSONArray f31769i;

    /* renamed from: j */
    private JSONArray f31770j;

    /* renamed from: k */
    private JSONArray f31771k;

    /* renamed from: l */
    private JSONArray f31772l;

    static {
        Covode.recordClassIndex(14866);
    }

    @Override // com.bytedance.p802b.p830h.AbstractC13094b
    /* renamed from: b */
    public final boolean mo20771b() {
        return true;
    }

    @Override // com.bytedance.p802b.p831i.p832a.p833a.AbstractC13097a
    /* renamed from: d */
    public final String mo20846d() {
        return "disk";
    }

    @Override // com.bytedance.p802b.p831i.p832a.p833a.AbstractC13097a
    /* renamed from: g */
    public final JSONObject mo20849g() {
        JSONObject c = C13099c.m23558a().mo20939c();
        try {
            C13129e.m23601a(c, C13099c.m23558a().mo20940d());
        } catch (Exception unused) {
        }
        return c;
    }

    @Override // com.bytedance.p802b.p831i.p832a.p833a.AbstractC13097a
    /* renamed from: f */
    public final JSONObject mo20848f() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene", C13099c.m23558a().mo20938b());
            jSONObject.put("process_name", C13037a.m23436d());
            jSONObject.put("is_front", false);
            jSONObject.put("is_main_process", C13037a.m23435c());
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.p802b.p831i.p832a.p833a.AbstractC13097a
    /* renamed from: h */
    public final JSONObject mo20889h() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.f31772l;
            if (jSONArray != null) {
                jSONObject.put("disk_info", jSONArray);
            }
            JSONArray jSONArray2 = this.f31769i;
            if (jSONArray2 != null) {
                jSONObject.put("top_usage", jSONArray2);
            }
            JSONArray jSONArray3 = this.f31770j;
            if (jSONArray3 != null) {
                jSONObject.put("exception_folders", jSONArray3);
            }
            JSONArray jSONArray4 = this.f31771k;
            if (jSONArray4 != null) {
                jSONObject.put("outdated_files", jSONArray4);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @Override // com.bytedance.p802b.p831i.p832a.p833a.AbstractC13097a
    /* renamed from: e */
    public final JSONObject mo20847e() {
        JSONObject jSONObject = new JSONObject();
        try {
            long j = this.f31761a;
            if (j > 0) {
                jSONObject.put("data", j);
            }
            long j2 = this.f31762b;
            if (j2 > 0) {
                jSONObject.put("cache", j2);
            }
            long j3 = this.f31763c;
            if (j3 > 0) {
                jSONObject.put("total", j3);
            }
            long j4 = this.f31764d;
            if (j4 > 0) {
                jSONObject.put("rom_free", j4);
            }
            long j5 = this.f31765e;
            if (j5 > 0) {
                jSONObject.put("app_usage", j5);
            }
            long j6 = this.f31766f;
            if (j6 > 0) {
                jSONObject.put("total_capacity", j6);
            }
            long j7 = this.f31767g;
            if (j7 > 0) {
                jSONObject.put("free_capacity", j7);
            }
            double d = this.f31768h;
            if (d > 0.0d) {
                jSONObject.put("app_occupied_rate", d);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public C13030b(long j, long j2, long j3, long j4, long j5, long j6, long j7, double d, JSONArray jSONArray, JSONArray jSONArray2, JSONArray jSONArray3, JSONArray jSONArray4) {
        this.f31761a = j;
        this.f31762b = j2;
        this.f31763c = j3;
        this.f31764d = j4;
        this.f31765e = j5;
        this.f31766f = j6;
        this.f31767g = j7;
        this.f31768h = d;
        this.f31769i = jSONArray;
        this.f31770j = jSONArray2;
        this.f31771k = jSONArray3;
        this.f31772l = jSONArray4;
    }
}
