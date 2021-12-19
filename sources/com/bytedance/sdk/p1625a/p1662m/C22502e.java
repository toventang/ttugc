package com.bytedance.sdk.p1625a.p1662m;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22292e;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.m.e */
public final class C22502e extends AbstractC22384h<C22292e> {

    /* renamed from: e */
    private C22503a f53202e = new C22503a();

    /* renamed from: com.bytedance.sdk.a.m.e$a */
    public static class C22503a extends C22504f {

        /* renamed from: a */
        JSONObject f53203a;

        static {
            Covode.recordClassIndex(26319);
        }
    }

    static {
        Covode.recordClassIndex(26318);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C22292e eVar) {
        C22455a.m42371a("passport_auth_login_only", this.f52931b.mo36704a("platform"), (String) null, eVar);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        C22371b.C22372a.m42133a(jSONObject, this.f53202e);
        this.f53202e.f53203a = jSONObject;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C22371b.C22372a.m42132a(this.f53202e, jSONObject);
        this.f53202e.f53203a = jSONObject2;
        if (jSONObject != null) {
            this.f53202e.f53183i = jSONObject.optString("profile_key");
            this.f53202e.f53184j = jSONObject.optString("shark_ticket");
        }
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22292e mo36600a(boolean z, C22357b bVar) {
        C22292e eVar = new C22292e(z, 1);
        if (z) {
            eVar.f52724j = this.f53202e.f53204b;
        } else {
            eVar.f52735u = this.f53202e.f53183i;
            eVar.f52715d = this.f53202e.f53181g;
            eVar.f52717f = this.f53202e.f53182h;
            eVar.f52728n = this.f53202e.f53184j;
            if (this.f53202e.f53181g == 1075) {
                eVar.f52730p = this.f53202e.f53187m;
                eVar.f52733s = this.f53202e.f53190p;
                eVar.f52732r = this.f53202e.f53189o;
                eVar.f52731q = this.f53202e.f53188n;
                eVar.f52729o = this.f53202e.f53186l;
            }
        }
        eVar.f52719h = this.f53202e.f53203a;
        return eVar;
    }

    public C22502e(Context context, C22355a aVar, AbstractC22288a<C22292e> aVar2) {
        super(context, aVar, aVar2);
    }
}
