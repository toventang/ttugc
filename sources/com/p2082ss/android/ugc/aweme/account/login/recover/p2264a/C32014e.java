package com.p2082ss.android.ugc.aweme.account.login.recover.p2264a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22419n;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22434l;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.e */
public final class C32014e extends AbstractC22384h<C22291d<C22419n>> {

    /* renamed from: f */
    public static final C32015a f76426f = new C32015a((byte) 0);

    /* renamed from: e */
    public final C22419n f76427e;

    static {
        Covode.recordClassIndex(38769);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.e$a */
    public static final class C32015a {
        static {
            Covode.recordClassIndex(38770);
        }

        private C32015a() {
        }

        public /* synthetic */ C32015a(byte b) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ void mo36601a(C22291d<C22419n> dVar) {
        C22291d<C22419n> dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        C22455a.m42371a("passport_mobile_sendcode", "mobile", this.f52931b.mo36704a(StringSet.type), dVar2);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22291d<C22419n> mo36600a(boolean z, C22357b bVar) {
        C89219l.m154721d(bVar, "");
        return new C22291d(z, 1002, this.f76427e);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(jSONObject2, "");
        C22419n nVar = this.f76427e;
        if (nVar != null) {
            nVar.f53040t = jSONObject2.optInt("retry_time", 30);
        }
        C22419n nVar2 = this.f76427e;
        if (nVar2 != null) {
            nVar2.f53008m = jSONObject;
        }
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(jSONObject2, "");
        C22371b.m42128a(this.f76427e, jSONObject);
        C22419n nVar = this.f76427e;
        if (nVar != null) {
            nVar.f53008m = jSONObject2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32014e(Context context, C22355a aVar, C22419n nVar, AbstractC22434l lVar) {
        super(context, aVar, lVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(nVar, "");
        C89219l.m154721d(lVar, "");
        this.f76427e = nVar;
    }
}
