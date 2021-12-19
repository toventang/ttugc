package com.bytedance.android.monitor.lynx.p717c.p718a;

import com.bytedance.android.monitor.p704b.AbstractC11908b;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitor.lynx.c.a.c */
public final class C11986c extends AbstractC11908b {

    /* renamed from: b */
    public String f28701b;

    /* renamed from: c */
    public String f28702c;

    /* renamed from: d */
    public int f28703d;

    /* renamed from: e */
    public int f28704e;

    /* renamed from: f */
    public String f28705f;

    /* renamed from: g */
    public int f28706g;

    /* renamed from: h */
    public int f28707h;

    /* renamed from: i */
    public String f28708i;

    /* renamed from: j */
    public int f28709j;

    static {
        Covode.recordClassIndex(13712);
    }

    public C11986c() {
        super("fetchError");
    }

    @Override // com.bytedance.android.monitor.p704b.AbstractC11907a
    /* renamed from: a */
    public final void mo19117a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        C11950d.m21101a(jSONObject, "method", this.f28701b);
        C11950d.m21098a(jSONObject, "error_code", this.f28709j);
        C11950d.m21101a(jSONObject, "error_msg", this.f28708i);
        C11950d.m21101a(jSONObject, "url", this.f28702c);
        C11950d.m21098a(jSONObject, "status_code", this.f28703d);
        C11950d.m21098a(jSONObject, "request_error_code", this.f28704e);
        C11950d.m21101a(jSONObject, "request_error_msg", this.f28705f);
        C11950d.m21098a(jSONObject, "jsb_ret", this.f28706g);
        C11950d.m21098a(jSONObject, "hit_prefetch", this.f28707h);
    }
}
