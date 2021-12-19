package com.bytedance.sdk.p1625a.p1644g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1628b.AbstractC22305k;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22328o;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.g.n */
public final class C22405n extends AbstractC22384h<C22328o> {

    /* renamed from: e */
    private String f52963e;

    /* renamed from: f */
    private JSONObject f52964f;

    static {
        Covode.recordClassIndex(26221);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C22328o oVar) {
        C22455a.m42371a("passport_email_verify", (String) null, (String) null, oVar);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f52964f = jSONObject2;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f52964f = jSONObject;
        this.f52963e = jSONObject2.optString("ticket");
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22328o mo36600a(boolean z, C22357b bVar) {
        C22328o oVar = new C22328o(z);
        if (z) {
            oVar.f52769j = this.f52963e;
        } else {
            oVar.f52715d = bVar.f52831b;
            oVar.f52717f = bVar.f52832c;
        }
        oVar.f52719h = this.f52964f;
        return oVar;
    }

    public C22405n(Context context, C22355a aVar, AbstractC22305k kVar) {
        super(context, aVar, kVar);
    }
}
