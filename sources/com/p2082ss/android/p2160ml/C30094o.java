package com.p2082ss.android.p2160ml;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ml.o */
public final class C30094o {

    /* renamed from: a */
    public boolean f71819a = C30120t.f71860a;

    /* renamed from: b */
    public String f71820b;

    /* renamed from: c */
    public String f71821c;

    /* renamed from: d */
    public boolean f71822d;

    /* renamed from: e */
    public C30095a f71823e = new C30095a();

    /* renamed from: f */
    public C30095a f71824f = new C30095a();

    /* renamed from: g */
    public C30095a f71825g = new C30095a();

    /* renamed from: h */
    public boolean f71826h = false;

    /* renamed from: i */
    public boolean f71827i = false;

    /* renamed from: j */
    public boolean f71828j = false;

    /* renamed from: k */
    public C30095a f71829k = new C30095a();

    /* renamed from: l */
    public C30095a f71830l = new C30095a();

    /* renamed from: m */
    public C30095a f71831m = new C30095a();

    /* renamed from: n */
    public C30095a f71832n = new C30095a();

    /* renamed from: o */
    public boolean f71833o = false;

    /* renamed from: p */
    public String f71834p = null;

    /* renamed from: q */
    public Float f71835q = null;

    static {
        Covode.recordClassIndex(36590);
    }

    /* renamed from: com.ss.android.ml.o$a */
    public static class C30095a {

        /* renamed from: a */
        public long f71836a = -1;

        /* renamed from: b */
        public long f71837b = -1;

        static {
            Covode.recordClassIndex(36591);
        }

        /* renamed from: b */
        public final void mo53483b() {
            this.f71837b = -1;
            this.f71836a = -1;
        }

        /* renamed from: a */
        public final float mo53482a() {
            long j = this.f71836a;
            if (j < 0) {
                return -1.0f;
            }
            long j2 = this.f71837b;
            if (j2 < 0 || j2 < j || j2 - j > 1000000000) {
                return -1.0f;
            }
            return ((float) (j2 - j)) * 1.0f;
        }
    }

    /* renamed from: a */
    public final void mo53471a() {
        m60869g();
        m60870h();
    }

    /* renamed from: b */
    public final void mo53475b() {
        if (this.f71819a) {
            this.f71829k.f71836a = System.currentTimeMillis();
        }
    }

    /* renamed from: c */
    public final void mo53477c() {
        if (this.f71819a) {
            this.f71831m.f71836a = System.currentTimeMillis();
        }
    }

    /* renamed from: d */
    public final void mo53478d() {
        if (this.f71819a) {
            this.f71831m.f71837b = System.currentTimeMillis();
        }
    }

    /* renamed from: e */
    public final void mo53479e() {
        if (this.f71819a) {
            this.f71832n.f71836a = System.currentTimeMillis();
        }
    }

    /* renamed from: f */
    public final void mo53480f() {
        if (this.f71819a) {
            this.f71832n.f71837b = System.currentTimeMillis();
        }
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        m60867a(jSONObject);
        m60868b(jSONObject);
        return jSONObject.toString();
    }

    /* renamed from: g */
    private void m60869g() {
        this.f71823e.mo53483b();
        this.f71824f.mo53483b();
        this.f71825g.mo53483b();
        this.f71826h = false;
        this.f71827i = false;
        this.f71828j = false;
    }

    /* renamed from: h */
    private void m60870h() {
        this.f71829k.mo53483b();
        this.f71830l.mo53483b();
        this.f71831m.mo53483b();
        this.f71832n.mo53483b();
        this.f71833o = false;
        this.f71834p = null;
        this.f71835q = null;
    }

    /* renamed from: a */
    public final void mo53472a(boolean z) {
        if (this.f71819a && !this.f71822d) {
            this.f71823e.f71837b = System.currentTimeMillis();
            this.f71826h = z;
            this.f71822d = true;
        }
    }

    /* renamed from: b */
    public final void mo53476b(boolean z) {
        if (this.f71819a && !this.f71822d) {
            this.f71825g.f71837b = System.currentTimeMillis();
            this.f71828j = z;
        }
    }

    public C30094o(String str) {
        this.f71820b = str;
    }

    /* renamed from: a */
    private JSONObject m60867a(JSONObject jSONObject) {
        int i;
        int i2;
        try {
            jSONObject.put("scene", this.f71820b);
            jSONObject.put("model_name", this.f71821c);
            jSONObject.put("sdk_duration", (double) this.f71823e.mo53482a());
            jSONObject.put("download_cost", (double) this.f71824f.mo53482a());
            jSONObject.put("model_cost", (double) this.f71825g.mo53482a());
            int i3 = 1;
            if (this.f71826h) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("sdk_success", i);
            if (this.f71827i) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("download_suc", i2);
            if (!this.f71828j) {
                i3 = 0;
            }
            jSONObject.put("model_load_suc", i3);
        } catch (JSONException e) {
            C30088k.m60845a("ml#evaluator", "getSdkInitMonitorData error!", e);
        }
        m60869g();
        return jSONObject;
    }

    /* renamed from: b */
    private JSONObject m60868b(JSONObject jSONObject) {
        int i;
        try {
            jSONObject.put("scene", this.f71820b);
            jSONObject.put("model_name", this.f71821c);
            jSONObject.put("sdk_duration", (double) this.f71829k.mo53482a());
            jSONObject.put("pre_cost", (double) this.f71830l.mo53482a());
            jSONObject.put("infer_cost", (double) this.f71831m.mo53482a());
            jSONObject.put("post_cost", (double) this.f71832n.mo53482a());
            if (this.f71833o) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("sdk_success", i);
            String str = this.f71834p;
            if (str != null) {
                jSONObject.put("s_result", str);
            }
            Float f = this.f71835q;
            if (f != null) {
                jSONObject.put("f_result", (double) f.floatValue());
            }
        } catch (JSONException e) {
            C30088k.m60845a("ml#evaluator", "getSdkRunMonitorData error!", e);
        }
        m60870h();
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo53473a(boolean z, float f) {
        if (this.f71819a) {
            this.f71829k.f71837b = System.currentTimeMillis();
            this.f71833o = z;
            this.f71835q = Float.valueOf(f);
        }
    }

    /* renamed from: a */
    public final void mo53474a(boolean z, String str, float f) {
        if (this.f71819a) {
            this.f71829k.f71837b = System.currentTimeMillis();
            this.f71833o = z;
            this.f71834p = str;
            this.f71835q = Float.valueOf(f);
        }
    }
}
