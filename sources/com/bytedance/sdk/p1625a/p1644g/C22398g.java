package com.bytedance.sdk.p1625a.p1644g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1628b.AbstractC22298d;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22319f;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.g.g */
public final class C22398g extends AbstractC22384h<C22319f> {

    /* renamed from: e */
    private C22319f f52952e;

    static {
        Covode.recordClassIndex(26214);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C22319f fVar) {
        C22455a.m42371a("passport_account_info", (String) null, (String) null, fVar);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22319f mo36600a(boolean z, C22357b bVar) {
        C22319f fVar = this.f52952e;
        if (fVar == null) {
            fVar = new C22319f(z);
        } else {
            fVar.f52713b = z;
        }
        if (!z) {
            fVar.f52715d = bVar.f52831b;
            fVar.f52717f = bVar.f52832c;
        }
        return fVar;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        C22319f fVar = new C22319f(true);
        this.f52952e = fVar;
        fVar.f52719h = jSONObject;
        this.f52952e.f52724j = C22371b.C22372a.m42131a(jSONObject, jSONObject2);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C22319f fVar = new C22319f(false);
        this.f52952e = fVar;
        fVar.f52719h = jSONObject2;
        if (jSONObject.has(StringSet.name)) {
            this.f52952e.f52750v = jSONObject.optString(StringSet.name);
        } else if (jSONObject.has("error_name")) {
            this.f52952e.f52750v = jSONObject.optString("error_name");
        }
    }

    public C22398g(Context context, C22355a aVar, AbstractC22298d dVar) {
        super(context, aVar, dVar);
    }
}
