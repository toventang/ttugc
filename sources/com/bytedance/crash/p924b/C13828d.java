package com.bytedance.crash.p924b;

import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.b.d */
final class C13828d {

    /* renamed from: A */
    private int f33633A = -1;

    /* renamed from: B */
    private final long f33634B = 100;

    /* renamed from: a */
    float f33635a;

    /* renamed from: b */
    float f33636b;

    /* renamed from: c */
    float f33637c;

    /* renamed from: d */
    float f33638d;

    /* renamed from: e */
    float f33639e;

    /* renamed from: f */
    float f33640f;

    /* renamed from: g */
    String f33641g;

    /* renamed from: h */
    String f33642h;

    /* renamed from: i */
    int f33643i = -1;

    /* renamed from: j */
    JSONArray f33644j;

    /* renamed from: k */
    JSONObject f33645k;

    /* renamed from: l */
    JSONObject f33646l;

    /* renamed from: m */
    JSONObject f33647m;

    /* renamed from: n */
    private float f33648n;

    /* renamed from: o */
    private float f33649o;

    /* renamed from: p */
    private float f33650p;

    /* renamed from: q */
    private float f33651q;

    /* renamed from: r */
    private float f33652r;

    /* renamed from: s */
    private float f33653s;

    /* renamed from: t */
    private float f33654t;

    /* renamed from: u */
    private float f33655u;

    /* renamed from: v */
    private float f33656v;

    /* renamed from: w */
    private JSONObject f33657w;

    /* renamed from: x */
    private JSONArray f33658x;

    /* renamed from: y */
    private float f33659y;

    /* renamed from: z */
    private final int f33660z = 1000;

    static {
        Covode.recordClassIndex(15885);
    }

    /* renamed from: b */
    public final String mo22274b() {
        String str = this.f33642h;
        if (str != null) {
            return str;
        }
        return "";
    }

    C13828d() {
    }

    /* renamed from: a */
    public final JSONObject mo22270a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("kswapd", (double) this.f33648n);
            jSONObject2.put("mmcqd", (double) this.f33649o);
            jSONObject2.put("kwork", (double) this.f33635a);
            jSONObject2.put("system_server", (double) this.f33650p);
            jSONObject2.put("lmkd", (double) this.f33651q);
            jSONObject2.put("user", (double) this.f33652r);
            jSONObject2.put("sys", (double) this.f33653s);
            jSONObject2.put("iowait", (double) this.f33654t);
            jSONObject2.put("minor", (double) this.f33655u);
            jSONObject2.put("major", (double) this.f33656v);
            jSONObject2.put("user2", (double) this.f33636b);
            jSONObject2.put("sys2", (double) this.f33637c);
            jSONObject2.put("iowait2", (double) this.f33638d);
            jSONObject2.put("minor2", (double) this.f33639e);
            jSONObject2.put("major2", (double) this.f33640f);
            jSONObject2.put("process_name", this.f33641g);
            jSONObject2.put("top_cpu_process_name", this.f33642h);
            jSONObject2.put("top_cpu_process_is_anrapp", this.f33643i);
            jSONObject2.put("load", this.f33644j);
            jSONObject2.put("before_cpu_list", this.f33645k);
            jSONObject2.put("after_cpu_list", this.f33646l);
            jSONObject2.put("cpu_thread_list", this.f33657w);
            jSONObject2.put("dex2oat", this.f33658x);
            jSONObject2.put("main_thread_cpu", (double) this.f33659y);
            jSONObject.put("cpu", jSONObject2);
        } catch (Throwable unused) {
        }
        this.f33635a = 0.0f;
        this.f33648n = 0.0f;
        this.f33649o = 0.0f;
        this.f33635a = 0.0f;
        this.f33650p = 0.0f;
        this.f33651q = 0.0f;
        this.f33652r = 0.0f;
        this.f33653s = 0.0f;
        this.f33654t = 0.0f;
        this.f33643i = -1;
        this.f33642h = null;
        this.f33644j = null;
        this.f33645k = null;
        this.f33646l = null;
        this.f33657w = null;
        this.f33658x = null;
        this.f33659y = 0.0f;
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo22276c(Float f) {
        this.f33648n = f.floatValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo22277d(Float f) {
        this.f33650p = f.floatValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo22278e(Float f) {
        this.f33651q = f.floatValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo22275b(Float f) {
        this.f33649o = f.floatValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22272a(Float f) {
        this.f33635a += f.floatValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo22279f(Float f) {
        if (this.f33658x == null) {
            this.f33658x = new JSONArray();
        }
        this.f33658x.put(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22271a(float f, float f2, float f3, float f4, float f5) {
        this.f33652r = f;
        this.f33653s = f2;
        this.f33654t = f3;
        this.f33655u = f4;
        this.f33656v = f5;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo22273a(String str, int i, int i2, int i3, long j, long j2, long j3) {
        if (this.f33657w == null) {
            this.f33657w = new JSONObject();
        }
        if ("main".equals(str)) {
            this.f33659y = (float) i2;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("cpu", i2);
            jSONObject.put("nice", i3);
            jSONObject.put("runTime", j);
            jSONObject.put("waitTime", j2);
            jSONObject.put("switchCount", j3);
            this.f33657w.put(String.valueOf(i), jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
