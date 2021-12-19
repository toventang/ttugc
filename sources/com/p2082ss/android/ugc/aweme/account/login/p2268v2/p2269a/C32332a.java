package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22406a;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22423a;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a */
public final class C32332a extends AbstractC22384h<C22291d<C22406a>> {

    /* renamed from: e */
    public static final C32333a f77123e = new C32333a((byte) 0);

    /* renamed from: f */
    private final C22406a f77124f;

    static {
        Covode.recordClassIndex(39100);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a$a */
    public static final class C32333a {
        static {
            Covode.recordClassIndex(39101);
        }

        private C32333a() {
        }

        public /* synthetic */ C32333a(byte b) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ void mo36601a(C22291d<C22406a> dVar) {
        C22291d<C22406a> dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        C22455a.m42371a("passport_mobile_bind", "mobile", (String) null, dVar2);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22291d<C22406a> mo36600a(boolean z, C22357b bVar) {
        C89219l.m154721d(bVar, "");
        return new C22291d(z, 1012, this.f77124f);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(jSONObject2, "");
        this.f77124f.f52971g = C22371b.C22372a.m42131a(jSONObject, jSONObject2);
        this.f77124f.f53008m = jSONObject;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(jSONObject2, "");
        C22371b.m42128a(this.f77124f, jSONObject);
        this.f77124f.f53008m = jSONObject2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32332a(Context context, C22355a aVar, C22406a aVar2, AbstractC22423a aVar3) {
        super(context, aVar, aVar3);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar3, "");
        this.f77124f = aVar2;
    }
}
