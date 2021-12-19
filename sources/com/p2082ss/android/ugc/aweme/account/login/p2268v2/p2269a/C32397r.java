package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.r */
public final class C32397r extends AbstractC22384h<C22291d<C32396q>> {

    /* renamed from: e */
    public static final C32398a f77241e = new C32398a((byte) 0);

    /* renamed from: f */
    private final C32396q f77242f;

    static {
        Covode.recordClassIndex(39165);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.r$a */
    public static final class C32398a {
        static {
            Covode.recordClassIndex(39166);
        }

        private C32398a() {
        }

        public /* synthetic */ C32398a(byte b) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ void mo36601a(C22291d<C32396q> dVar) {
        C22291d<C32396q> dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        C22455a.m42371a("passport_email_check_code", "email", (String) null, dVar2);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22291d<C32396q> mo36600a(boolean z, C22357b bVar) {
        C89219l.m154721d(bVar, "");
        return new C22291d(z, 10046, this.f77242f);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(jSONObject2, "");
        C22371b.m42128a(this.f77242f, jSONObject);
        this.f77242f.f53008m = jSONObject2;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(jSONObject2, "");
        C32396q qVar = this.f77242f;
        C22507a a = C22371b.C22372a.m42131a(jSONObject, jSONObject2);
        C89219l.m154716b(a, "");
        C89219l.m154721d(a, "");
        qVar.f77235b = a;
        this.f77242f.f53008m = jSONObject;
        C32396q qVar2 = this.f77242f;
        String optString = jSONObject2.optString("ticket");
        C89219l.m154716b(optString, "");
        C89219l.m154721d(optString, "");
        qVar2.f77234a = optString;
    }

    private C32397r(Context context, C22355a aVar, C32396q qVar, AbstractC32395p pVar) {
        super(context, aVar, pVar);
        this.f77242f = qVar;
    }

    public /* synthetic */ C32397r(Context context, C22355a aVar, C32396q qVar, AbstractC32395p pVar, byte b) {
        this(context, aVar, qVar, pVar);
    }
}
