package com.bytedance.sdk.p1625a.p1662m;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.C22306c;
import com.bytedance.sdk.p1625a.p1626a.p1627a.AbstractC22288a;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22292e;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.m.c */
public final class C22498c extends AbstractC22384h<C22292e> {

    /* renamed from: e */
    private C22499a f53198e = new C22499a();

    /* renamed from: com.bytedance.sdk.a.m.c$a */
    public static class C22499a extends C22504f {

        /* renamed from: a */
        JSONObject f53199a;

        static {
            Covode.recordClassIndex(26315);
        }
    }

    static {
        Covode.recordClassIndex(26314);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ void mo36601a(C22292e eVar) {
        String str;
        C22292e eVar2 = eVar;
        if (!TextUtils.isEmpty(eVar2.f52714c)) {
            if (eVar2.f52714c.contains(C22306c.C22308b.m41974a("/passport/auth/bind_with_mobile/"))) {
                str = "passport_oauth_bind_with_mobile_click";
            } else {
                str = "passport_oauth_bind_click";
            }
            C22455a.m42371a(str, this.f52931b.mo36704a("platform"), "auth_bind", eVar2);
        }
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        C22371b.C22372a.m42133a(jSONObject, this.f53198e);
        this.f53198e.f53199a = jSONObject;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C22371b.C22372a.m42132a(this.f53198e, jSONObject);
        this.f53198e.f53199a = jSONObject2;
        if (jSONObject != null) {
            this.f53198e.f53183i = jSONObject.optString("profile_key");
            this.f53198e.f53184j = jSONObject.optString("shark_ticket");
        }
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C22292e mo36600a(boolean z, C22357b bVar) {
        C22292e a = C22371b.C22372a.m42130a(this.f53198e, z);
        if (z) {
            a.f52724j = this.f53198e.f53204b;
        } else {
            a.f52715d = this.f53198e.f53181g;
            a.f52717f = this.f53198e.f53182h;
            a.f52728n = this.f53198e.f53184j;
            a.f52735u = this.f53198e.f53183i;
            if (this.f53198e.f53181g == 1075) {
                a.f52730p = this.f53198e.f53187m;
                a.f52733s = this.f53198e.f53190p;
                a.f52732r = this.f53198e.f53189o;
                a.f52731q = this.f53198e.f53188n;
                a.f52729o = this.f53198e.f53186l;
            }
        }
        a.f52719h = this.f53198e.f53199a;
        return a;
    }

    public C22498c(Context context, C22355a aVar, AbstractC22288a<C22292e> aVar2) {
        super(context, aVar, aVar2);
    }
}
