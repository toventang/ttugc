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

/* renamed from: com.bytedance.sdk.a.m.d */
public final class C22500d extends AbstractC22384h<C22292e> {

    /* renamed from: e */
    private C22501a f53200e = new C22501a();

    /* renamed from: com.bytedance.sdk.a.m.d$a */
    public static class C22501a extends C22504f {

        /* renamed from: a */
        JSONObject f53201a;

        static {
            Covode.recordClassIndex(26317);
        }
    }

    static {
        Covode.recordClassIndex(26316);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ void mo36601a(C22292e eVar) {
        String str;
        C22292e eVar2 = eVar;
        if (!TextUtils.isEmpty(eVar2.f52714c)) {
            if (eVar2.f52714c.contains(C22306c.C22308b.m41974a("/passport/auth/bind_with_mobile_login/"))) {
                str = "passport_auth_bind_with_mobile_login_click";
            } else if (eVar2.f52714c.contains(C22306c.C22308b.m41974a("/passport/auth/share_login/"))) {
                str = "passport_auth_share_login";
            } else {
                str = "passport_oauth_login_click";
            }
            C22455a.m42371a(str, this.f52931b.mo36704a("platform"), "login", eVar2);
        }
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        C22371b.C22372a.m42133a(jSONObject, this.f53200e);
        this.f53200e.f53201a = jSONObject;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C22371b.C22372a.m42132a(this.f53200e, jSONObject);
        this.f53200e.f53201a = jSONObject2;
        if (jSONObject != null) {
            this.f53200e.f53183i = jSONObject.optString("profile_key");
            this.f53200e.f53184j = jSONObject.optString("shark_ticket");
        }
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22292e mo36600a(boolean z, C22357b bVar) {
        C22292e eVar = new C22292e(z, 1);
        if (z) {
            eVar.f52724j = this.f53200e.f53204b;
        } else {
            eVar.f52715d = this.f53200e.f53181g;
            eVar.f52717f = this.f53200e.f53182h;
            eVar.f52728n = this.f53200e.f53184j;
            eVar.f52735u = this.f53200e.f53183i;
            if (this.f53200e.f53181g == 1075) {
                eVar.f52730p = this.f53200e.f53187m;
                eVar.f52733s = this.f53200e.f53190p;
                eVar.f52732r = this.f53200e.f53189o;
                eVar.f52731q = this.f53200e.f53188n;
                eVar.f52729o = this.f53200e.f53186l;
            }
            eVar.f52734t = this.f53200e.f53191q;
        }
        eVar.f52719h = this.f53200e.f53201a;
        return eVar;
    }

    public C22500d(Context context, C22355a aVar, AbstractC22288a<C22292e> aVar2) {
        super(context, aVar, aVar2);
    }
}
