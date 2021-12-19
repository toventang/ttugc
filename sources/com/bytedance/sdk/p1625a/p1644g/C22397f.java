package com.bytedance.sdk.p1625a.p1644g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22292e;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import com.p2082ss.android.account.C29346c;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.g.f */
public final class C22397f extends AbstractC22384h<C22292e> {

    /* renamed from: e */
    private C22507a f52951e;

    static {
        Covode.recordClassIndex(26213);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C22292e eVar) {
        C22455a.m42371a("passport_app_email_register_ticket_register", (String) null, (String) null, eVar);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f52951e = C29346c.C29347a.m58778a(jSONObject);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22292e mo36600a(boolean z, C22357b bVar) {
        C22292e eVar = new C22292e(z, 10053);
        if (z) {
            eVar.f52724j = this.f52951e;
        } else {
            eVar.f52715d = bVar.f52831b;
            eVar.f52717f = bVar.f52832c;
            eVar.f52718g = bVar.f52834e;
        }
        return eVar;
    }

    public C22397f(Context context, C22355a aVar, AbstractC22288a<C22292e> aVar2) {
        super(context, aVar, aVar2);
    }
}
