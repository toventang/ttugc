package com.bytedance.sdk.p1625a.p1644g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22324k;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.g.j */
public final class C22401j extends AbstractC22384h<C22324k> {

    /* renamed from: e */
    C22507a f52957e;

    static {
        Covode.recordClassIndex(26217);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C22324k kVar) {
        C22455a.m42371a("passport_account_switch", (String) null, (String) null, kVar);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f52957e = C22371b.C22372a.m42131a(jSONObject, jSONObject2);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22324k mo36600a(boolean z, C22357b bVar) {
        C22324k kVar = new C22324k(z);
        if (z) {
            kVar.f52724j = this.f52957e;
        } else {
            kVar.f52715d = bVar.f52831b;
            kVar.f52717f = bVar.f52832c;
        }
        return kVar;
    }

    public C22401j(Context context, C22355a aVar, AbstractC22288a aVar2) {
        super(context, aVar, aVar2);
    }
}
