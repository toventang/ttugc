package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22408c;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22425c;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.aa */
public final class C32356aa extends AbstractC22384h<C22291d<C22408c>> {

    /* renamed from: e */
    public static final C32357a f77170e = new C32357a((byte) 0);

    /* renamed from: f */
    private final C22408c f77171f;

    static {
        Covode.recordClassIndex(39124);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.aa$a */
    public static final class C32357a {
        static {
            Covode.recordClassIndex(39125);
        }

        private C32357a() {
        }

        public /* synthetic */ C32357a(byte b) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ void mo36601a(C22291d<C22408c> dVar) {
        C22291d<C22408c> dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        C22455a.m42371a("passport_mobile_change_password", "mobile", (String) null, dVar2);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22291d<C22408c> mo36600a(boolean z, C22357b bVar) {
        C89219l.m154721d(bVar, "");
        return new C22291d(z, 1010, this.f77171f);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(jSONObject2, "");
        this.f77171f.f53008m = jSONObject;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(jSONObject2, "");
        C22371b.m42128a(this.f77171f, jSONObject);
        this.f77171f.f53008m = jSONObject2;
    }

    private C32356aa(Context context, C22355a aVar, C22408c cVar, AbstractC22425c cVar2) {
        super(context, aVar, cVar2);
        this.f77171f = cVar;
    }

    public /* synthetic */ C32356aa(Context context, C22355a aVar, C22408c cVar, AbstractC22425c cVar2, byte b) {
        this(context, aVar, cVar, cVar2);
    }
}
