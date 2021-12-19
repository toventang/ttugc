package com.bytedance.android.monitor.p706d;

import com.bytedance.android.monitor.p704b.AbstractC11907a;
import com.bytedance.android.monitor.p714l.C11950d;
import com.bytedance.android.monitor.p714l.C11952f;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.d.i */
public class C11926i extends AbstractC11907a {

    /* renamed from: a */
    public String f28529a;

    /* renamed from: b */
    public String f28530b = C11952f.m21108a();

    /* renamed from: c */
    public String f28531c = null;

    /* renamed from: d */
    public String f28532d = null;

    /* renamed from: e */
    public long f28533e = 0;

    /* renamed from: f */
    public String f28534f;

    /* renamed from: g */
    public JSONObject f28535g;

    /* renamed from: h */
    public long f28536h;

    /* renamed from: i */
    public long f28537i = 0;

    /* renamed from: j */
    public long f28538j = 0;

    /* renamed from: k */
    public Boolean f28539k;

    static {
        Covode.recordClassIndex(13652);
    }

    @Override // com.bytedance.android.monitor.p704b.AbstractC11907a
    /* renamed from: a */
    public void mo19117a(JSONObject jSONObject) {
        C11950d.m21101a(jSONObject, "navigation_id", this.f28530b);
        C11950d.m21101a(jSONObject, "url", this.f28529a);
        C11950d.m21101a(jSONObject, "container_type", this.f28531c);
        C11950d.m21099a(jSONObject, "click_start", this.f28533e);
        C11950d.m21101a(jSONObject, "sdk_version", "1.2.5");
        C11950d.m21101a(jSONObject, "virtual_aid", this.f28534f);
        C11950d.m21100a(jSONObject, "context", this.f28535g);
        C11950d.m21100a(jSONObject, "debug_context", new JSONObject());
        long j = this.f28536h;
        if (j != 0) {
            C11950d.m21099a(jSONObject, "container_init_ts", j);
        }
        Boolean bool = this.f28539k;
        if (bool != null) {
            C11950d.m21100a(jSONObject, "container_reuse", (Object) bool);
        }
    }

    /* renamed from: a */
    public final void mo19145a(String str, Object obj) {
        if (this.f28535g == null) {
            this.f28535g = new JSONObject();
        }
        C11950d.m21101a(this.f28535g, str, String.valueOf(obj));
    }
}
