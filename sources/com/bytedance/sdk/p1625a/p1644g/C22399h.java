package com.bytedance.sdk.p1625a.p1644g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22289b;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22321h;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.g.h */
public final class C22399h extends AbstractC22384h {

    /* renamed from: e */
    private C22321h f52953e;

    static {
        Covode.recordClassIndex(26215);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36601a(C22289b bVar) {
        C22455a.m42371a("passport_mobile_get_qrcode", (String) null, (String) null, bVar);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final C22289b mo36600a(boolean z, C22357b bVar) {
        C22321h hVar = this.f52953e;
        if (hVar == null) {
            hVar = new C22321h(z);
        } else {
            hVar.f52713b = z;
        }
        if (!z) {
            hVar.f52715d = bVar.f52831b;
            hVar.f52717f = bVar.f52832c;
        }
        return hVar;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        C22321h hVar = new C22321h(true);
        this.f52953e = hVar;
        hVar.f52760j = jSONObject2.optString("qrcode");
        this.f52953e.f52761k = jSONObject2.optString("qrcode_index_url");
        this.f52953e.f52762l = jSONObject2.optString("token");
        this.f52953e.f52763m = jSONObject2.optString("app_name");
        this.f52953e.f52764n = jSONObject2.optString("web_name");
    }

    public C22399h(Context context, C22355a aVar, AbstractC22288a aVar2) {
        super(context, aVar, aVar2);
    }
}
