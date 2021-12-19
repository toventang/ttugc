package com.bytedance.sdk.p1625a.p1645h.p1647b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22407b;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22424b;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.h.b.b */
public final class C22439b extends AbstractC22384h<C22291d<C22407b>> {

    /* renamed from: e */
    private C22407b f53060e;

    static {
        Covode.recordClassIndex(26255);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C22291d<C22407b> dVar) {
        C22455a.m42371a("passport_mobile_change", "mobile", (String) null, dVar);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22291d<C22407b> mo36600a(boolean z, C22357b bVar) {
        return new C22291d(z, 1011, this.f53060e);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f53060e.f52977f = C22371b.C22372a.m42131a(jSONObject, jSONObject2);
        this.f53060e.f53008m = jSONObject;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C22371b.m42128a(this.f53060e, jSONObject);
        this.f53060e.f53008m = jSONObject2;
    }

    public C22439b(Context context, C22355a aVar, C22407b bVar, AbstractC22424b bVar2) {
        super(context, aVar, bVar2);
        this.f53060e = bVar;
    }
}
