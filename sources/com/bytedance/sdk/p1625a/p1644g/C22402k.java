package com.bytedance.sdk.p1625a.p1644g;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1628b.AbstractC22302h;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22325l;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import com.bytedance.sdk.p1625a.p1662m.C22496a;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.g.k */
public final class C22402k extends AbstractC22384h<C22325l> {

    /* renamed from: e */
    C22507a f52958e;

    /* renamed from: f */
    private String f52959f = "";

    /* renamed from: g */
    private C22496a f52960g;

    /* renamed from: h */
    private JSONObject f52961h;

    static {
        Covode.recordClassIndex(26218);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ void mo36601a(C22325l lVar) {
        if (TextUtils.isEmpty(this.f52959f)) {
            return;
        }
        if (this.f52959f.equals("mobile")) {
            C22455a.m42371a("passport_mobile_reset_password", "mobile", "ticket", lVar);
        } else if (this.f52959f.equals("email")) {
            C22455a.m42371a("passport_email_reset_password", "email", "ticket", lVar);
        }
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f52961h = jSONObject2;
        C22371b.m42129a(this.f52960g, jSONObject);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f52958e = C22371b.C22372a.m42131a(jSONObject, jSONObject2);
        this.f52961h = jSONObject;
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22325l mo36600a(boolean z, C22357b bVar) {
        C22325l lVar = new C22325l(z);
        if (z) {
            lVar.f52724j = this.f52958e;
        } else {
            lVar.f52715d = bVar.f52831b;
            lVar.f52717f = bVar.f52832c;
            if (this.f52960g.f53181g == 1075) {
                lVar.f52730p = this.f52960g.f53187m;
                lVar.f52733s = this.f52960g.f53190p;
                lVar.f52732r = this.f52960g.f53189o;
                lVar.f52731q = this.f52960g.f53188n;
                lVar.f52729o = this.f52960g.f53186l;
            }
        }
        lVar.f52719h = this.f52961h;
        return lVar;
    }

    public C22402k(Context context, C22355a aVar, String str, AbstractC22302h hVar) {
        super(context, aVar, hVar);
        this.f52959f = str;
        this.f52960g = new C22496a();
    }
}
