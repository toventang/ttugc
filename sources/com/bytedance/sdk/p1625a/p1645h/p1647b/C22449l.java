package com.bytedance.sdk.p1625a.p1645h.p1647b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1645h.p1646a.AbstractC22414i;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22435m;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.a.h.b.l */
public final class C22449l extends AbstractC22384h<C22291d<C22450a>> {

    /* renamed from: e */
    private C22450a f53072e;

    static {
        Covode.recordClassIndex(26265);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C22291d<C22450a> dVar) {
        C22455a.m42371a("passport_mobile_set_password", "mobile", (String) null, dVar);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f53072e.f53008m = jSONObject;
    }

    /* renamed from: com.bytedance.sdk.a.h.b.l$a */
    public static class C22450a extends AbstractC22414i {

        /* renamed from: a */
        public String f53073a;

        /* renamed from: b */
        public String f53074b = null;

        static {
            Covode.recordClassIndex(26266);
        }

        public C22450a(String str, String str2) {
            super(13);
            this.f53073a = str;
        }
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22291d<C22450a> mo36600a(boolean z, C22357b bVar) {
        return new C22291d(z, 10002, this.f53072e);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C22371b.m42128a(this.f53072e, jSONObject);
        this.f53072e.f53008m = jSONObject2;
    }

    public C22449l(Context context, C22355a aVar, C22450a aVar2, AbstractC22435m mVar) {
        super(context, aVar, mVar);
        this.f53072e = aVar2;
    }
}
