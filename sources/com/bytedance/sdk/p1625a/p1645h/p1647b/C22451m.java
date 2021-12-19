package com.bytedance.sdk.p1625a.p1645h.p1647b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.C22306c;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22420o;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22436n;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.h.b.m */
public final class C22451m extends AbstractC22384h<C22291d<C22420o>> {

    /* renamed from: e */
    private C22420o f53075e;

    static {
        Covode.recordClassIndex(26267);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C22291d<C22420o> dVar) {
        C22455a.m42371a("passport_account_login", (String) null, (String) null, dVar);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22291d<C22420o> mo36600a(boolean z, C22357b bVar) {
        return new C22291d(z, 1016, this.f53075e);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f53075e.f53055u = C22371b.C22372a.m42131a(jSONObject, jSONObject2);
        this.f53075e.f53008m = jSONObject;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C22371b.m42128a(this.f53075e, jSONObject);
        this.f53075e.f53008m = jSONObject2;
    }

    private C22451m(Context context, C22355a aVar, C22420o oVar, AbstractC22436n nVar) {
        super(context, aVar, nVar);
        this.f53075e = oVar;
    }

    /* renamed from: a */
    public static C22451m m42356a(Context context, String str, String str2, String str3, String str4, String str5, AbstractC22436n nVar) {
        C22420o oVar = new C22420o(str2, str3, str, null, str4, null, str5, 0);
        C22355a.C22356a aVar = new C22355a.C22356a();
        aVar.f52826a = C22306c.C22307a.m41972a("/passport/user/login/");
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(oVar.f53047a)) {
            hashMap.put("email", C13627m.m24501c(oVar.f53047a));
        }
        if (!TextUtils.isEmpty(oVar.f53049c)) {
            hashMap.put("mobile", C13627m.m24501c(oVar.f53049c));
        }
        if (!TextUtils.isEmpty(oVar.f53048b)) {
            hashMap.put("username", C13627m.m24501c(oVar.f53048b));
        }
        if (!TextUtils.isEmpty(oVar.f53050d)) {
            hashMap.put("account", C13627m.m24501c(oVar.f53050d));
        }
        if (!TextUtils.isEmpty(oVar.f53052f)) {
            hashMap.put("token", oVar.f53052f);
        }
        if (!TextUtils.isEmpty(oVar.f53053g)) {
            hashMap.put("captcha", oVar.f53053g);
        }
        if (oVar.f53054t > 0) {
            hashMap.put("scene", C13627m.m24501c(String.valueOf(oVar.f53054t)));
        }
        hashMap.put("password", C13627m.m24501c(oVar.f53051e));
        hashMap.put("mix_mode", "1");
        return new C22451m(context, aVar.mo36707a(hashMap).mo36710c(), oVar, nVar);
    }
}
