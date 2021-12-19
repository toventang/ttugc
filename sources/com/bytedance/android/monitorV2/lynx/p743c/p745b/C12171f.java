package com.bytedance.android.monitorV2.lynx.p743c.p745b;

import com.bytedance.android.monitorV2.p728a.AbstractC12067b;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.lynx.c.b.f */
public final class C12171f extends AbstractC12067b {

    /* renamed from: b */
    public double f29292b;

    /* renamed from: c */
    public double f29293c;

    /* renamed from: d */
    public double f29294d;

    /* renamed from: e */
    public double f29295e;

    /* renamed from: f */
    public double f29296f;

    /* renamed from: g */
    public double f29297g;

    /* renamed from: h */
    public double f29298h;

    /* renamed from: i */
    public double f29299i;

    /* renamed from: j */
    public double f29300j;

    /* renamed from: k */
    public double f29301k;

    /* renamed from: l */
    public C12167c f29302l;

    /* renamed from: m */
    public JSONObject f29303m;

    /* renamed from: n */
    public int f29304n;

    /* renamed from: o */
    public long f29305o = System.currentTimeMillis();

    static {
        Covode.recordClassIndex(13900);
    }

    public C12171f() {
        super("performance");
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12066a
    /* renamed from: a */
    public final void mo19417a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        C12130f.m21653a(jSONObject, this.f29303m);
        C12130f.m21651a(jSONObject, "fp", Double.valueOf(this.f29292b));
        C12130f.m21651a(jSONObject, "fmp", Double.valueOf(this.f29293c));
        C12130f.m21651a(jSONObject, "tti", Double.valueOf(this.f29294d));
        C12130f.m21651a(jSONObject, "Layout", Double.valueOf(this.f29295e));
        C12130f.m21651a(jSONObject, "render_page", Double.valueOf(this.f29301k));
        C12130f.m21651a(jSONObject, "Diff_root_create", Double.valueOf(this.f29296f));
        C12130f.m21651a(jSONObject, "Diff_same_root", Double.valueOf(this.f29297g));
        C12130f.m21651a(jSONObject, "tasm_binary_decode", Double.valueOf(this.f29299i));
        C12130f.m21651a(jSONObject, "tasm_end_decode_finish_load_template", Double.valueOf(this.f29298h));
        C12130f.m21651a(jSONObject, "tasm_finish_load_template", Double.valueOf(this.f29300j));
        C12130f.m21649a(jSONObject, "state", this.f29304n);
        C12130f.m21650a(jSONObject, "report_ts", this.f29305o);
        C12167c cVar = this.f29302l;
        if (cVar != null) {
            cVar.mo19417a(jSONObject);
        }
    }
}
