package com.bytedance.android.monitorV2.lynx.p743c.p745b;

import com.bytedance.android.monitorV2.p731d.C12090i;
import com.bytedance.android.monitorV2.p740l.C12130f;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxEnv;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.lynx.c.b.b */
public final class C12166b extends C12090i {

    /* renamed from: k */
    public int f29272k;

    /* renamed from: l */
    public String f29273l = "";

    /* renamed from: m */
    public String f29274m;

    static {
        Covode.recordClassIndex(13895);
    }

    public C12166b() {
        C89219l.m154709a((Object) LynxEnv.m56706b(), "");
        this.f29274m = LynxEnv.m56707g();
        this.f29011c = "lynx";
    }

    @Override // com.bytedance.android.monitorV2.p731d.C12090i, com.bytedance.android.monitorV2.p728a.AbstractC12066a
    /* renamed from: a */
    public final void mo19417a(JSONObject jSONObject) {
        super.mo19417a(jSONObject);
        C12130f.m21649a(jSONObject, "template_state", this.f29272k);
        C12130f.m21652a(jSONObject, "lynx_version", this.f29274m);
        C12130f.m21652a(jSONObject, "page_version", this.f29273l);
    }
}
