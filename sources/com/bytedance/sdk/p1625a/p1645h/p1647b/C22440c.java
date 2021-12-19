package com.bytedance.sdk.p1625a.p1645h.p1647b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22409d;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22426d;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.h.b.c */
public final class C22440c extends AbstractC22384h<C22291d<C22409d>> {

    /* renamed from: e */
    private C22409d f53061e;

    static {
        Covode.recordClassIndex(26256);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C22291d<C22409d> dVar) {
        C22455a.m42371a("passport_email_check_register", "email", this.f52931b.mo36704a(StringSet.type), dVar);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22291d<C22409d> mo36600a(boolean z, C22357b bVar) {
        return new C22291d(z, 1026, this.f53061e);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f53061e.f52984d = jSONObject2.optInt("is_registered");
        this.f53061e.f53008m = jSONObject;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C22371b.m42128a(this.f53061e, jSONObject);
        this.f53061e.f53008m = jSONObject2;
    }

    public C22440c(Context context, C22355a aVar, C22409d dVar, AbstractC22426d dVar2) {
        super(context, aVar, dVar2);
        this.f53061e = dVar;
    }
}
