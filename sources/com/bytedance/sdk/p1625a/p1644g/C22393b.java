package com.bytedance.sdk.p1625a.p1644g;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1628b.AbstractC22296b;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22315b;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.g.b */
public final class C22393b extends AbstractC22384h<C22315b> {

    /* renamed from: e */
    private C22315b f52945e;

    static {
        Covode.recordClassIndex(26209);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C22315b bVar) {
        C22455a.m42371a("passport_check_password", (String) null, (String) null, bVar);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22315b mo36600a(boolean z, C22357b bVar) {
        C22315b bVar2 = this.f52945e;
        if (bVar2 == null) {
            bVar2 = new C22315b(z);
        } else {
            bVar2.f52713b = z;
        }
        if (!z) {
            bVar2.f52715d = bVar.f52831b;
            bVar2.f52717f = bVar.f52832c;
        }
        return bVar2;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        C22315b bVar = new C22315b(true);
        this.f52945e = bVar;
        bVar.f52740j = jSONObject2.optString("captcha");
    }

    public C22393b(Context context, C22355a aVar, AbstractC22296b bVar) {
        super(context, aVar, bVar);
    }
}
