package com.bytedance.sdk.p1625a.p1645h.p1647b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22417l;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22432j;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.h.b.h */
public final class C22445h extends AbstractC22384h<C22291d<C22417l>> {

    /* renamed from: e */
    private C22417l f53066e;

    static {
        Covode.recordClassIndex(26261);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C22291d<C22417l> dVar) {
        C22455a.m42371a("passport_mobile_login_only", "mobile", "login_only", dVar);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22291d<C22417l> mo36600a(boolean z, C22357b bVar) {
        return new C22291d(z, 1021, this.f53066e);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f53066e.f53026e = C22371b.C22372a.m42131a(jSONObject, jSONObject2);
        this.f53066e.f53008m = jSONObject;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C22371b.m42128a(this.f53066e, jSONObject);
        this.f53066e.f53008m = jSONObject2;
        try {
            this.f53066e.f53025d = jSONObject.optString("sms_code_key");
        } catch (Exception unused) {
        }
    }

    public C22445h(Context context, C22355a aVar, C22417l lVar, AbstractC22432j jVar) {
        super(context, aVar, jVar);
        this.f53066e = lVar;
    }
}
