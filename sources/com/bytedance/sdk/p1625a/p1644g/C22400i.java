package com.bytedance.sdk.p1625a.p1644g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1628b.AbstractC22300f;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22323j;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.g.i */
public final class C22400i extends AbstractC22384h<C22323j> {

    /* renamed from: e */
    private String f52954e;

    /* renamed from: f */
    private boolean f52955f;

    /* renamed from: g */
    private JSONObject f52956g;

    static {
        Covode.recordClassIndex(26216);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C22323j jVar) {
        C22455a.m42371a("passport_shark_safe_verify", (String) null, (String) null, jVar);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f52956g = jSONObject2;
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22323j mo36600a(boolean z, C22357b bVar) {
        C22323j jVar = new C22323j(z);
        if (z) {
            jVar.f52766j = this.f52954e;
            jVar.f52767k = this.f52955f;
        } else {
            jVar.f52715d = bVar.f52831b;
            jVar.f52717f = bVar.f52832c;
        }
        jVar.f52719h = this.f52956g;
        return jVar;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f52956g = jSONObject;
        this.f52954e = jSONObject2.optString("ticket");
        this.f52955f = jSONObject2.optBoolean("safe");
    }

    public C22400i(Context context, C22355a aVar, AbstractC22300f fVar) {
        super(context, aVar, fVar);
    }
}
