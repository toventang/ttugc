package com.bytedance.sdk.p1625a.p1645h.p1647b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22419n;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22434l;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.h.b.k */
public final class C22448k extends AbstractC22384h<C22291d<C22419n>> {

    /* renamed from: e */
    private C22419n f53071e;

    static {
        Covode.recordClassIndex(26264);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C22291d<C22419n> dVar) {
        C22455a.m42371a("passport_mobile_send_voice_code", (String) null, (String) null, dVar);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22291d<C22419n> mo36600a(boolean z, C22357b bVar) {
        return new C22291d(z, 1002, this.f53071e);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C22371b.m42128a(this.f53071e, jSONObject);
        this.f53071e.f53008m = jSONObject2;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f53071e.f53040t = jSONObject2.optInt("retry_time", 30);
        this.f53071e.f53008m = jSONObject;
    }

    public C22448k(Context context, C22355a aVar, C22419n nVar, AbstractC22434l lVar) {
        super(context, aVar, lVar);
        this.f53071e = nVar;
    }
}
