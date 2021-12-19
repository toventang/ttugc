package com.bytedance.sdk.p1625a.p1644g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.AbstractC22346c;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22318e;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.g.e */
public final class C22396e extends AbstractC22384h<C22318e> {

    /* renamed from: e */
    private String f52950e;

    static {
        Covode.recordClassIndex(26212);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C22318e eVar) {
        C22455a.m42371a("passport_app_email_register_code_verify", (String) null, (String) null, eVar);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f52950e = jSONObject2.optString("email_ticket");
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22318e mo36600a(boolean z, C22357b bVar) {
        C22318e eVar = new C22318e(z);
        if (z) {
            eVar.f52749j = this.f52950e;
        } else {
            eVar.f52715d = bVar.f52831b;
            eVar.f52717f = bVar.f52832c;
            eVar.f52718g = bVar.f52834e;
        }
        return eVar;
    }

    public C22396e(Context context, C22355a aVar, AbstractC22346c<C22318e> cVar) {
        super(context, aVar, cVar);
    }
}
