package com.bytedance.sdk.p1625a.p1644g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22289b;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22316c;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.g.c */
public final class C22394c extends AbstractC22384h {

    /* renamed from: e */
    private C22316c f52946e;

    static {
        Covode.recordClassIndex(26210);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36601a(C22289b bVar) {
        C22455a.m42371a("passport_mobile_check_qrconnect", (String) null, (String) null, bVar);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final C22289b mo36600a(boolean z, C22357b bVar) {
        C22316c cVar = this.f52946e;
        if (cVar == null) {
            cVar = new C22316c(z);
        } else {
            cVar.f52713b = z;
        }
        if (!z) {
            cVar.f52715d = bVar.f52831b;
            cVar.f52717f = bVar.f52832c;
        }
        return cVar;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        C22316c cVar = new C22316c(true);
        this.f52946e = cVar;
        cVar.f52743v = jSONObject2.optString("qrcode");
        this.f52946e.f52746y = jSONObject2.optString("status");
        this.f52946e.f52741A = jSONObject2.optString("app_name");
        this.f52946e.f52742B = jSONObject2.optString("web_name");
        this.f52946e.f52744w = jSONObject2.optString("qrcode_index_url");
        this.f52946e.f52747z = jSONObject2.optString("token");
        this.f52946e.f52745x = jSONObject2.optString("redirect_url");
        JSONObject optJSONObject = jSONObject2.optJSONObject("user_data");
        if (optJSONObject != null) {
            jSONObject.put("data", optJSONObject);
            this.f52946e.f52724j = C22371b.C22372a.m42131a(jSONObject, optJSONObject);
        }
    }

    public C22394c(Context context, C22355a aVar, AbstractC22288a aVar2) {
        super(context, aVar, aVar2);
    }
}
