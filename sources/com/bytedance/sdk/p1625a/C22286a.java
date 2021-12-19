package com.bytedance.sdk.p1625a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22290c;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import com.bytedance.sdk.p1625a.p1662m.C22496a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.a */
public final class C22286a extends AbstractC22384h<C22290c> {

    /* renamed from: e */
    private String f52706e;

    /* renamed from: f */
    private C22496a f52707f = new C22496a();

    static {
        Covode.recordClassIndex(26102);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C22290c cVar) {
        C22455a.m42371a("passport_logout", (String) null, (String) null, cVar);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C22371b.m42129a(this.f52707f, jSONObject);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f52707f.f53185k = jSONObject.optString("session_key");
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22290c mo36600a(boolean z, C22357b bVar) {
        C22290c cVar = new C22290c(z);
        if (z) {
            cVar.f52721j = this.f52707f.f53185k;
        } else {
            cVar.f52715d = this.f52707f.f53181g;
            cVar.f52717f = this.f52707f.f53182h;
        }
        cVar.f52722k = this.f52706e;
        return cVar;
    }

    public C22286a(Context context, C22355a aVar, String str, AbstractC22288a<C22290c> aVar2) {
        super(context, aVar, aVar2);
        this.f52706e = str;
    }
}
