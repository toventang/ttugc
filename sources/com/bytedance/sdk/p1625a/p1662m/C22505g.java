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

/* renamed from: com.bytedance.sdk.a.m.g */
public final class C22505g extends AbstractC22384h<C22292e> {

    /* renamed from: e */
    private C22506a f53209e = new C22506a();

    /* renamed from: com.bytedance.sdk.a.m.g$a */
    public static class C22506a extends C22504f {
        static {
            Covode.recordClassIndex(26322);
        }
    }

    static {
        Covode.recordClassIndex(26321);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C22292e eVar) {
        C22455a.m42371a("2_user_info", this.f52931b.mo36704a("platform"), (String) null, eVar);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C22371b.C22372a.m42132a(this.f53209e, jSONObject);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        C22371b.C22372a.m42133a(jSONObject, this.f53209e);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C22292e mo36600a(boolean z, C22357b bVar) {
        C22292e a = C22371b.C22372a.m42130a(this.f53209e, z);
        if (z) {
            a.f52724j = this.f53209e.f53204b;
        } else {
            a.f52715d = this.f53209e.f53181g;
            a.f52717f = this.f53209e.f53182h;
        }
        return a;
    }

    public C22505g(Context context, C22355a aVar, AbstractC22288a<C22292e> aVar2) {
        super(context, aVar, aVar2);
    }
}
