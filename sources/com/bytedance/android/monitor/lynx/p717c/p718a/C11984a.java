package com.bytedance.android.monitor.lynx.p717c.p718a;

import com.bytedance.android.monitor.p704b.AbstractC11908b;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitor.lynx.c.a.a */
public final class C11984a extends AbstractC11908b {

    /* renamed from: b */
    public float f28690b;

    /* renamed from: c */
    public int f28691c;

    /* renamed from: d */
    public int f28692d;

    /* renamed from: e */
    public long f28693e;

    /* renamed from: f */
    public long f28694f;

    /* renamed from: g */
    public long f28695g;

    /* renamed from: h */
    public int f28696h;

    /* renamed from: i */
    public int f28697i;

    /* renamed from: j */
    public int f28698j;

    static {
        Covode.recordClassIndex(13710);
    }

    public C11984a() {
        super("blank");
    }

    @Override // com.bytedance.android.monitor.p704b.AbstractC11907a
    /* renamed from: a */
    public final void mo19117a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        C11950d.m21100a(jSONObject, "effective_percentage", Float.valueOf(this.f28690b));
        C11950d.m21098a(jSONObject, "view_height", this.f28691c);
        C11950d.m21098a(jSONObject, "view_width", this.f28692d);
        C11950d.m21098a(jSONObject, "view_alpha", this.f28697i);
        C11950d.m21098a(jSONObject, "element_count", this.f28698j);
        C11950d.m21099a(jSONObject, "collect_time", this.f28694f);
        C11950d.m21099a(jSONObject, "calculate_time", this.f28695g);
        C11950d.m21099a(jSONObject, "cost_time", this.f28693e);
        C11950d.m21098a(jSONObject, "detect_type", this.f28696h);
    }
}
