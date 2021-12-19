package com.bytedance.sdk.p1625a.p1645h.p1647b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22406a;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22423a;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.h.b.a */
public final class C22422a extends AbstractC22384h<C22291d<C22406a>> {

    /* renamed from: e */
    private C22406a f53059e;

    static {
        Covode.recordClassIndex(26238);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C22291d<C22406a> dVar) {
        C22455a.m42371a("passport_mobile_bind", "mobile", (String) null, dVar);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22291d<C22406a> mo36600a(boolean z, C22357b bVar) {
        return new C22291d(z, 1012, this.f53059e);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f53059e.f52971g = C22371b.C22372a.m42131a(jSONObject, jSONObject2);
        this.f53059e.f53008m = jSONObject;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C22371b.m42128a(this.f53059e, jSONObject);
        this.f53059e.f53008m = jSONObject2;
    }

    public C22422a(Context context, C22355a aVar, C22406a aVar2, AbstractC22423a aVar3) {
        super(context, aVar, aVar3);
        this.f53059e = aVar2;
    }
}
