package com.bytedance.android.monitorV2.p731d;

import com.bytedance.android.monitorV2.p728a.AbstractC12066a;
import com.bytedance.android.monitorV2.p735h.p736a.C12097a;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.android.monitorV2.p740l.C12131g;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitorV2.d.i */
public class C12090i extends AbstractC12066a {

    /* renamed from: a */
    public String f29009a;

    /* renamed from: b */
    public String f29010b = C12131g.m21660a();

    /* renamed from: c */
    public String f29011c = null;

    /* renamed from: d */
    public long f29012d = 0;

    /* renamed from: e */
    public String f29013e;

    /* renamed from: f */
    public JSONObject f29014f;

    /* renamed from: g */
    public JSONObject f29015g = new JSONObject();

    /* renamed from: h */
    public JSONObject f29016h;

    /* renamed from: i */
    public long f29017i;

    /* renamed from: j */
    public Boolean f29018j;

    static {
        Covode.recordClassIndex(13819);
    }

    @Override // com.bytedance.android.monitorV2.p728a.AbstractC12066a
    /* renamed from: a */
    public void mo19417a(JSONObject jSONObject) {
        C12130f.m21652a(jSONObject, "navigation_id", this.f29010b);
        C12130f.m21652a(jSONObject, "url", this.f29009a);
        C12130f.m21652a(jSONObject, "container_type", this.f29011c);
        C12130f.m21650a(jSONObject, "click_start", this.f29012d);
        C12130f.m21652a(jSONObject, "sdk_version", "1.2.0-alpha.4");
        C12130f.m21652a(jSONObject, "virtual_aid", this.f29013e);
        C12130f.m21651a(jSONObject, "context", this.f29014f);
        C12130f.m21652a(jSONObject, "sdk_version", "1.2.0-alpha.4");
        C12130f.m21651a(jSONObject, "bid_info", this.f29016h);
        C12130f.m21651a(jSONObject, "debug_context", this.f29015g);
        long j = this.f29017i;
        if (j != 0) {
            C12130f.m21650a(jSONObject, "container_init_ts", j);
        }
        Boolean bool = this.f29018j;
        if (bool != null) {
            C12130f.m21651a(jSONObject, "container_reuse", bool);
        }
        C12130f.m21652a(this.f29015g, "monitor_package", "monitorV2");
    }

    /* renamed from: a */
    public final void mo19442a(C12097a.C12098a aVar, String str) {
        if (this.f29016h == null) {
            this.f29016h = new JSONObject();
        }
        C12130f.m21652a(this.f29016h, "bid", str);
        C12130f.m21652a(this.f29016h, "setting_bid", aVar.f29047a);
        C12130f.m21650a(this.f29016h, "hit_sample", aVar.f29048b);
        C12130f.m21650a(this.f29016h, "setting_id", aVar.f29049c);
    }
}
