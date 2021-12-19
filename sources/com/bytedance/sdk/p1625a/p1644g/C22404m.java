package com.bytedance.sdk.p1625a.p1644g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1628b.AbstractC22304j;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22327n;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.g.m */
public final class C22404m extends AbstractC22384h<C22327n> {

    /* renamed from: e */
    private C22327n f52962e;

    static {
        Covode.recordClassIndex(26220);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C22327n nVar) {
        C22455a.m42371a("passport_token_beat_v2", (String) null, (String) null, nVar);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        C22327n nVar = new C22327n(true);
        this.f52962e = nVar;
        nVar.f52719h = jSONObject;
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22327n mo36600a(boolean z, C22357b bVar) {
        C22327n nVar = this.f52962e;
        if (nVar == null) {
            nVar = new C22327n(z);
        } else {
            nVar.f52713b = z;
        }
        if (!z) {
            nVar.f52715d = bVar.f52831b;
            nVar.f52717f = bVar.f52832c;
        }
        return nVar;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C22327n nVar = new C22327n(false);
        this.f52962e = nVar;
        nVar.f52719h = jSONObject2;
        this.f52962e.f52768j = jSONObject.optString("error_name");
    }

    private C22404m(Context context, C22355a aVar, AbstractC22304j jVar) {
        super(context, aVar, jVar);
    }

    /* renamed from: a */
    public static C22404m m42281a(Context context, String str, AbstractC22304j jVar) {
        C22355a.C22356a aVar = new C22355a.C22356a();
        aVar.f52826a = str;
        return new C22404m(context, aVar.mo36709b(), jVar);
    }
}
