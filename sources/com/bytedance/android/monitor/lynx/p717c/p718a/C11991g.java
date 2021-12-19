package com.bytedance.android.monitor.lynx.p717c.p718a;

import com.bytedance.android.monitor.p704b.AbstractC11908b;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitor.lynx.c.a.g */
public final class C11991g extends AbstractC11908b {

    /* renamed from: b */
    public double f28727b;

    /* renamed from: c */
    public double f28728c;

    /* renamed from: d */
    public double f28729d;

    /* renamed from: e */
    public double f28730e;

    /* renamed from: f */
    public double f28731f;

    /* renamed from: g */
    public double f28732g;

    /* renamed from: h */
    public double f28733h;

    /* renamed from: i */
    public double f28734i;

    /* renamed from: j */
    public double f28735j;

    /* renamed from: k */
    public double f28736k;

    /* renamed from: l */
    public C11987d f28737l;

    /* renamed from: m */
    public JSONObject f28738m;

    /* renamed from: n */
    public int f28739n;

    /* renamed from: o */
    public long f28740o = System.currentTimeMillis();

    static {
        Covode.recordClassIndex(13717);
    }

    public C11991g() {
        super("performance");
    }

    @Override // com.bytedance.android.monitor.p704b.AbstractC11907a
    /* renamed from: a */
    public final void mo19117a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        C11950d.m21102a(jSONObject, this.f28738m);
        C11950d.m21100a(jSONObject, "fp", Double.valueOf(this.f28727b));
        C11950d.m21100a(jSONObject, "fmp", Double.valueOf(this.f28728c));
        C11950d.m21100a(jSONObject, "tti", Double.valueOf(this.f28729d));
        C11950d.m21100a(jSONObject, "Layout", Double.valueOf(this.f28730e));
        C11950d.m21100a(jSONObject, "render_page", Double.valueOf(this.f28736k));
        C11950d.m21100a(jSONObject, "Diff_root_create", Double.valueOf(this.f28731f));
        C11950d.m21100a(jSONObject, "Diff_same_root", Double.valueOf(this.f28732g));
        C11950d.m21100a(jSONObject, "tasm_binary_decode", Double.valueOf(this.f28734i));
        C11950d.m21100a(jSONObject, "tasm_end_decode_finish_load_template", Double.valueOf(this.f28733h));
        C11950d.m21100a(jSONObject, "tasm_finish_load_template", Double.valueOf(this.f28735j));
        C11950d.m21098a(jSONObject, "state", this.f28739n);
        C11950d.m21099a(jSONObject, "report_ts", this.f28740o);
        C11987d dVar = this.f28737l;
        if (dVar != null) {
            dVar.mo19117a(jSONObject);
        }
    }
}
