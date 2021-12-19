package com.bytedance.apm.battery.p761c;

import com.bytedance.apm.C12397c;
import com.bytedance.apm.p767c.p768a.C12401a;
import com.bytedance.apm.p767c.p769b.C12412f;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.battery.c.b */
public final class C12328b {

    /* renamed from: A */
    long f29678A;

    /* renamed from: a */
    long f29679a;

    /* renamed from: b */
    long f29680b;

    /* renamed from: c */
    public long f29681c;

    /* renamed from: d */
    long f29682d;

    /* renamed from: e */
    public long f29683e;

    /* renamed from: f */
    public long f29684f;

    /* renamed from: g */
    long f29685g;

    /* renamed from: h */
    public long f29686h;

    /* renamed from: i */
    long f29687i;

    /* renamed from: j */
    public long f29688j;

    /* renamed from: k */
    public long f29689k;

    /* renamed from: l */
    long f29690l;

    /* renamed from: m */
    public boolean f29691m = true;

    /* renamed from: n */
    public String f29692n;

    /* renamed from: o */
    public String f29693o;

    /* renamed from: p */
    long f29694p;

    /* renamed from: q */
    long f29695q;

    /* renamed from: r */
    int f29696r;

    /* renamed from: s */
    int f29697s;

    /* renamed from: t */
    int f29698t;

    /* renamed from: u */
    int f29699u;

    /* renamed from: v */
    long f29700v;

    /* renamed from: w */
    int f29701w;

    /* renamed from: x */
    int f29702x;

    /* renamed from: y */
    int f29703y;

    /* renamed from: z */
    int f29704z;

    static {
        Covode.recordClassIndex(14133);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo20060b() {
        if (this.f29679a > 60000) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo20061c() {
        if (this.f29680b > 5000) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20058a() {
        this.f29679a = 0;
        this.f29680b = 0;
        this.f29681c = 0;
        this.f29682d = 0;
        this.f29683e = 0;
        this.f29684f = 0;
        this.f29685g = 0;
        this.f29686h = 0;
        this.f29687i = 0;
        this.f29688j = 0;
        this.f29689k = 0;
        this.f29690l = 0;
        this.f29691m = true;
        this.f29692n = "";
        this.f29693o = "";
    }

    /* renamed from: b */
    private boolean m22109b(boolean z) {
        JSONObject c = m22110c(z);
        if (c == null || c.length() <= 0) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_main_process", this.f29691m);
        jSONObject.put("process_name", this.f29692n);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("sid", this.f29693o);
        C12401a.m22303b().mo20179a(new C12412f("battery", "", c, jSONObject, jSONObject2, (byte) 0));
        if (C12397c.m22288e()) {
            String[] strArr = new String[1];
            String str = "stats report, processName: " + this.f29692n;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo20059a(boolean z) {
        boolean b = m22109b(z);
        if (!b && C12397c.m22288e()) {
            String[] strArr = new String[1];
            String str = "stats report failed, processName: " + this.f29692n;
        }
        mo20058a();
        return b;
    }

    /* renamed from: c */
    private JSONObject m22110c(boolean z) {
        JSONObject jSONObject = new JSONObject();
        if (mo20060b()) {
            jSONObject.put("front_alarm", this.f29684f);
            jSONObject.put("front_loc_p_time", this.f29682d / 1000);
            jSONObject.put("front_power_p_time", this.f29683e / 1000);
            long j = this.f29681c;
            if (j < 0) {
                if (C12397c.m22288e()) {
                    String[] strArr = new String[1];
                    String str = " report data invalid, frontCpuMs < 0 : " + this.f29681c;
                }
                return null;
            }
            jSONObject.put("front_cpu_active_time_p_time", j / 1000);
            long j2 = this.f29685g;
            if (j2 < 0) {
                if (C12397c.m22288e()) {
                    String[] strArr2 = new String[1];
                    String str2 = " report data invalid, mFrontTrafficBytes < 0 : " + this.f29685g;
                }
                return null;
            }
            if (!z) {
                jSONObject.put("front_traffic_p_capacity", j2 / 1024);
            }
            double d = (double) this.f29684f;
            Double.isNaN(d);
            double d2 = (double) this.f29681c;
            Double.isNaN(d2);
            double d3 = (d * 0.002083333383779973d) + (d2 * 6.944444612599909E-5d);
            double d4 = (double) this.f29682d;
            Double.isNaN(d4);
            double d5 = d3 + (d4 * 7.499999810534064E-6d);
            double d6 = (double) this.f29683e;
            Double.isNaN(d6);
            double d7 = d5 + (d6 * 6.944444521650439E-6d);
            if (!z) {
                double d8 = (double) this.f29685g;
                Double.isNaN(d8);
                d7 += d8 * 5.464481073431671E-4d;
            }
            if (d7 < 0.0d) {
                if (C12397c.m22288e()) {
                    String[] strArr3 = new String[1];
                    " report data invalid, frontScore < 0 : ".concat(String.valueOf(d7));
                }
                return null;
            }
            jSONObject.put("front_score", d7);
            jSONObject.put("front_p_time", this.f29679a / 1000);
            float f = 60000.0f / ((float) this.f29679a);
            jSONObject.put("front_alarm_per_min", (double) (((float) this.f29684f) * f));
            jSONObject.put("front_loc_per_min_p_time", (double) ((((float) this.f29682d) / 1000.0f) * f));
            jSONObject.put("front_power_per_min_p_time", (double) ((((float) this.f29683e) / 1000.0f) * f));
            jSONObject.put("front_cpu_active_time_per_min_p_time", (double) ((((float) this.f29681c) / 1000.0f) * f));
            if (!z) {
                jSONObject.put("front_traffic_per_min_p_capacity", (double) ((((float) this.f29685g) / 1024.0f) * f));
            }
            double d9 = (double) f;
            Double.isNaN(d9);
            jSONObject.put("front_score_per_min", d7 * d9);
            if (z) {
                this.f29696r = (int) (((long) this.f29696r) + this.f29684f);
                this.f29699u = (int) (((long) this.f29699u) + this.f29681c);
                this.f29697s = (int) (((long) this.f29697s) + this.f29682d);
                this.f29698t = (int) (((long) this.f29698t) + this.f29683e);
                if (this.f29691m) {
                    this.f29700v = this.f29685g;
                    this.f29694p = this.f29679a;
                }
            }
        }
        if (mo20061c()) {
            jSONObject.put("back_alarm", this.f29689k);
            jSONObject.put("back_loc_p_time", this.f29687i / 1000);
            jSONObject.put("back_power_p_time", this.f29688j / 1000);
            long j3 = this.f29686h;
            if (j3 < 0) {
                if (C12397c.m22288e()) {
                    String[] strArr4 = new String[1];
                    String str3 = " report data invalid, mBackCpuMs < 0 : " + this.f29686h;
                }
                return null;
            }
            jSONObject.put("back_cpu_active_time_p_time", j3 / 1000);
            long j4 = this.f29690l;
            if (j4 < 0) {
                if (C12397c.m22288e()) {
                    String[] strArr5 = new String[1];
                    String str4 = " report data invalid, mBackTrafficBytes < 0 : " + this.f29690l;
                }
                return null;
            }
            if (!z) {
                jSONObject.put("back_traffic_p_capacity", j4 / 1024);
            }
            double d10 = (double) this.f29689k;
            Double.isNaN(d10);
            double d11 = (double) this.f29686h;
            Double.isNaN(d11);
            double d12 = (d10 * 0.002083333383779973d) + (d11 * 6.944444612599909E-5d);
            double d13 = (double) this.f29687i;
            Double.isNaN(d13);
            double d14 = d12 + (d13 * 7.499999810534064E-6d);
            double d15 = (double) this.f29688j;
            Double.isNaN(d15);
            double d16 = d14 + (d15 * 6.944444521650439E-6d);
            if (!z) {
                double d17 = (double) this.f29690l;
                Double.isNaN(d17);
                d16 += d17 * 5.464481073431671E-4d;
            }
            jSONObject.put("back_score", d16);
            jSONObject.put("back_p_time", this.f29680b / 1000);
            float f2 = 60000.0f / ((float) this.f29680b);
            jSONObject.put("back_alarm_per_min", (double) (((float) this.f29689k) * f2));
            jSONObject.put("back_loc_per_min_p_time", (double) ((((float) this.f29687i) / 1000.0f) * f2));
            jSONObject.put("back_power_per_min_p_time", (double) ((((float) this.f29688j) / 1000.0f) * f2));
            jSONObject.put("back_cpu_active_time_per_min_p_time", (double) ((((float) this.f29686h) / 1000.0f) * f2));
            if (!z) {
                jSONObject.put("back_traffic_per_min_p_capacity", (double) ((((float) this.f29690l) / 1024.0f) * f2));
            }
            double d18 = (double) f2;
            Double.isNaN(d18);
            jSONObject.put("back_score_per_min", d16 * d18);
            if (z) {
                this.f29701w = (int) (((long) this.f29701w) + this.f29689k);
                this.f29704z = (int) (((long) this.f29704z) + this.f29686h);
                this.f29702x = (int) (((long) this.f29702x) + this.f29687i);
                this.f29703y = (int) (((long) this.f29703y) + this.f29688j);
                if (this.f29691m) {
                    this.f29678A = this.f29690l;
                }
                long j5 = this.f29680b;
                if (j5 > this.f29695q) {
                    this.f29695q = j5;
                }
            }
        }
        return jSONObject;
    }
}
