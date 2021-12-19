package com.bytedance.p802b.p813c.p814a;

import android.content.Context;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.p789q.C12591l;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1782z.p1783a.p1784a.AbstractC23724c;
import com.bytedance.p802b.p813c.p814a.C12981a;
import com.bytedance.p802b.p831i.p832a.p833a.AbstractC13097a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.c.a.e */
public final class C12992e extends AbstractC13097a {

    /* renamed from: a */
    public boolean f31644a = true;

    /* renamed from: b */
    public boolean f31645b = true;

    /* renamed from: c */
    private C12981a.EnumC12982a f31646c;

    /* renamed from: d */
    private AbstractC23724c.C23725a f31647d;

    /* renamed from: e */
    private String f31648e;

    /* renamed from: f */
    private double f31649f = -1.0d;

    /* renamed from: g */
    private double f31650g = -1.0d;

    /* renamed from: h */
    private double f31651h = -1.0d;

    /* renamed from: i */
    private double f31652i = -1.0d;

    /* renamed from: j */
    private List<C12591l<String, Double>> f31653j;

    static {
        Covode.recordClassIndex(14828);
    }

    @Override // com.bytedance.p802b.p830h.AbstractC13094b
    /* renamed from: b */
    public final boolean mo20771b() {
        return true;
    }

    @Override // com.bytedance.p802b.p831i.p832a.p833a.AbstractC13097a
    /* renamed from: d */
    public final String mo20846d() {
        return "cpu";
    }

    /* renamed from: com.bytedance.b.c.a.e$1 */
    static /* synthetic */ class C129931 {

        /* renamed from: a */
        static final /* synthetic */ int[] f31654a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        static {
            /*
                r0 = 14829(0x39ed, float:2.078E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.b.c.a.a$a[] r0 = com.bytedance.p802b.p813c.p814a.C12981a.EnumC12982a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.p802b.p813c.p814a.C12992e.C129931.f31654a = r2
                com.bytedance.b.c.a.a$a r0 = com.bytedance.p802b.p813c.p814a.C12981a.EnumC12982a.MIX     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.p802b.p813c.p814a.C12992e.C129931.f31654a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.b.c.a.a$a r0 = com.bytedance.p802b.p813c.p814a.C12981a.EnumC12982a.BACK     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.p802b.p813c.p814a.C12992e.C129931.f31654a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.b.c.a.a$a r0 = com.bytedance.p802b.p813c.p814a.C12981a.EnumC12982a.FRONT     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p802b.p813c.p814a.C12992e.C129931.<clinit>():void");
        }
    }

    @Override // com.bytedance.p802b.p831i.p832a.p833a.AbstractC13097a
    /* renamed from: f */
    public final JSONObject mo20848f() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("process_name", C12397c.m22278a());
            jSONObject.put("is_main_process", C12397c.m22285b());
            jSONObject.put("scene", this.f31648e);
            int i = C129931.f31654a[this.f31646c.ordinal()];
            if (i == 1) {
                jSONObject.put("data_type", "mix");
            } else if (i == 2) {
                jSONObject.put("data_type", "back");
            } else if (i == 3) {
                jSONObject.put("data_type", "front");
            }
            return jSONObject;
        } catch (Throwable th) {
            th.getLocalizedMessage();
            return null;
        }
    }

    @Override // com.bytedance.p802b.p831i.p832a.p833a.AbstractC13097a
    /* renamed from: g */
    public final JSONObject mo20849g() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_auto_sample", this.f31644a);
            if (this.f31647d != null) {
                Context context = C12397c.f29931a;
                if (C58029j.f132252d == C13624l.EnumC13625a.UNKNOWN || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132252d = C13624l.m24487c(context);
                }
                jSONObject.put("network_type", C58029j.f132252d);
                jSONObject.put("battery_level", this.f31647d.f56127c);
                jSONObject.put("cpu_hardware", this.f31647d.f56125a);
                jSONObject.put("is_charging", this.f31647d.f56126b);
                jSONObject.put("power_save_mode", this.f31647d.f56129e);
                jSONObject.put("thermal_status", this.f31647d.f56128d);
                jSONObject.put("battery_thermal", (double) this.f31647d.f56130f);
                jSONObject.put("is_normal_sample_state", this.f31645b);
            }
            return jSONObject;
        } catch (Throwable th) {
            th.getLocalizedMessage();
            return null;
        }
    }

    @Override // com.bytedance.p802b.p831i.p832a.p833a.AbstractC13097a
    /* renamed from: e */
    public final JSONObject mo20847e() {
        try {
            JSONObject jSONObject = new JSONObject();
            double d = this.f31649f;
            if (d > -1.0d && this.f31650g > -1.0d) {
                jSONObject.put("app_usage_rate", d);
                jSONObject.put("app_max_usage_rate", this.f31650g);
            }
            double d2 = this.f31651h;
            if (d2 > -1.0d && this.f31652i > -1.0d) {
                jSONObject.put("app_stat_speed", d2);
                jSONObject.put("app_max_stat_speed", this.f31652i);
            }
            List<C12591l<String, Double>> list = this.f31653j;
            if (list != null && !list.isEmpty()) {
                JSONObject jSONObject2 = new JSONObject();
                for (C12591l<String, Double> lVar : this.f31653j) {
                    if (!(lVar == null || lVar.f30622a == null || lVar.f30622a.isEmpty() || lVar.f30623b == null || lVar.f30623b.doubleValue() < 0.0d)) {
                        jSONObject2.put(lVar.f30622a, lVar.f30623b);
                    }
                }
                jSONObject.put("thread_cpu_usage", jSONObject2);
            }
            return jSONObject;
        } catch (Throwable th) {
            th.getLocalizedMessage();
            return null;
        }
    }

    public C12992e(C12981a.EnumC12982a aVar, String str, List<C12591l<String, Double>> list, AbstractC23724c.C23725a aVar2) {
        this.f31653j = new ArrayList(list);
        this.f31646c = aVar;
        this.f31648e = str;
        this.f31647d = aVar2;
    }

    public C12992e(C12981a.EnumC12982a aVar, String str, double d, double d2, double d3, double d4, AbstractC23724c.C23725a aVar2) {
        this.f31646c = aVar;
        this.f31648e = str;
        this.f31649f = d;
        this.f31650g = d2;
        this.f31651h = d3;
        this.f31652i = d4;
        this.f31647d = aVar2;
    }
}
