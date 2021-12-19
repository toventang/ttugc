package com.p2082ss.android.ugc.aweme.account.login.recover.p2264a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22418m;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22430h;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.c */
public final class C32010c extends AbstractC22384h<C22291d<C22418m>> {

    /* renamed from: f */
    public static final C32011a f76422f = new C32011a((byte) 0);

    /* renamed from: e */
    public final C22418m f76423e;

    static {
        Covode.recordClassIndex(38765);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.c$a */
    public static final class C32011a {
        static {
            Covode.recordClassIndex(38766);
        }

        private C32011a() {
        }

        public /* synthetic */ C32011a(byte b) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ void mo36601a(C22291d<C22418m> dVar) {
        C22291d<C22418m> dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        C22455a.m42371a("passport_mobile_login", "mobile", "login", dVar2);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22291d<C22418m> mo36600a(boolean z, C22357b bVar) {
        C89219l.m154721d(bVar, "");
        return new C22291d(z, 1006, this.f76423e);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(jSONObject2, "");
        this.f76423e.f53031e = C22371b.C22372a.m42131a(jSONObject, jSONObject2);
        this.f76423e.f53008m = jSONObject;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(jSONObject2, "");
        C22371b.m42128a(this.f76423e, jSONObject);
        this.f76423e.f53008m = jSONObject2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32010c(Context context, C22355a aVar, C22418m mVar, AbstractC22430h hVar) {
        super(context, aVar, hVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(hVar, "");
        this.f76423e = mVar;
    }
}
