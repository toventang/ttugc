package com.bytedance.android.monitorV2.lynx.p743c.p745b;

import com.bytedance.android.monitorV2.p728a.AbstractC12067b;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.lynx.c.b.a */
public final class C12165a extends AbstractC12067b {

    /* renamed from: b */
    public float f29261b;

    /* renamed from: c */
    public int f29262c;

    /* renamed from: d */
    public int f29263d;

    /* renamed from: e */
    public long f29264e;

    /* renamed from: f */
    public long f29265f;

    /* renamed from: g */
    public long f29266g;

    /* renamed from: h */
    public int f29267h;

    /* renamed from: i */
    public long f29268i;

    /* renamed from: j */
    public long f29269j;

    /* renamed from: k */
    public int f29270k;

    /* renamed from: l */
    public int f29271l;

    static {
        Covode.recordClassIndex(13894);
    }

    public C12165a() {
        super("blank");
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12066a
    /* renamed from: a */
    public final void mo19417a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        C12130f.m21651a(jSONObject, "effective_percentage", Float.valueOf(this.f29261b));
        C12130f.m21649a(jSONObject, "view_height", this.f29262c);
        C12130f.m21649a(jSONObject, "view_width", this.f29263d);
        C12130f.m21649a(jSONObject, "view_alpha", this.f29270k);
        C12130f.m21649a(jSONObject, "element_count", this.f29271l);
        C12130f.m21650a(jSONObject, "collect_time", this.f29265f);
        C12130f.m21650a(jSONObject, "calculate_time", this.f29266g);
        C12130f.m21650a(jSONObject, "cost_time", this.f29264e);
        C12130f.m21649a(jSONObject, "detect_type", this.f29267h);
        C12130f.m21650a(jSONObject, "enter_page_time", this.f29268i);
        C12130f.m21650a(jSONObject, "detect_start_time", this.f29269j);
    }
}
