package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.ah */
public final class C32376ah extends AbstractC22384h<C22291d<C32375ag>> {

    /* renamed from: e */
    public static final C32377a f77206e = new C32377a((byte) 0);

    /* renamed from: f */
    private final C32375ag f77207f;

    static {
        Covode.recordClassIndex(39144);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.ah$a */
    public static final class C32377a {
        static {
            Covode.recordClassIndex(39145);
        }

        private C32377a() {
        }

        public /* synthetic */ C32377a(byte b) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ void mo36601a(C22291d<C32375ag> dVar) {
        C22291d<C32375ag> dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        C22455a.m42371a("passport_account_verify", "mobile", (String) null, dVar2);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22291d<C32375ag> mo36600a(boolean z, C22357b bVar) {
        C89219l.m154721d(bVar, "");
        return new C22291d(z, 10031, this.f77207f);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(jSONObject2, "");
        this.f77207f.f53008m = jSONObject;
        C32375ag agVar = this.f77207f;
        String optString = jSONObject2.optString("ticket");
        C89219l.m154716b(optString, "");
        C89219l.m154721d(optString, "");
        agVar.f77203a = optString;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(jSONObject2, "");
        C22371b.m42128a(this.f77207f, jSONObject);
        this.f77207f.f53008m = jSONObject2;
    }

    private C32376ah(Context context, C22355a aVar, C32375ag agVar, AbstractC32374af afVar) {
        super(context, aVar, afVar);
        this.f77207f = agVar;
    }

    public /* synthetic */ C32376ah(Context context, C22355a aVar, C32375ag agVar, AbstractC32374af afVar, byte b) {
        this(context, aVar, agVar, afVar);
    }
}
