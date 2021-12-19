package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.j */
public final class C32387j extends AbstractC22384h<C22291d<C32390l>> {

    /* renamed from: e */
    public static final C32388a f77225e = new C32388a((byte) 0);

    /* renamed from: f */
    private final C32390l f77226f;

    static {
        Covode.recordClassIndex(39155);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.j$a */
    public static final class C32388a {
        static {
            Covode.recordClassIndex(39156);
        }

        private C32388a() {
        }

        public /* synthetic */ C32388a(byte b) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ void mo36601a(C22291d<C32390l> dVar) {
        C89219l.m154721d(dVar, "");
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22291d<C32390l> mo36600a(boolean z, C22357b bVar) {
        C89219l.m154721d(bVar, "");
        return new C22291d(z, 1010, this.f77226f);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(jSONObject2, "");
        this.f77226f.f53008m = jSONObject;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(jSONObject2, "");
        C22371b.m42128a(this.f77226f, jSONObject);
        this.f77226f.f53008m = jSONObject2;
    }

    private C32387j(Context context, C22355a aVar, C32390l lVar, AbstractC32389k kVar) {
        super(context, aVar, kVar);
        this.f77226f = lVar;
    }

    public /* synthetic */ C32387j(Context context, C22355a aVar, C32390l lVar, AbstractC32389k kVar, byte b) {
        this(context, aVar, lVar, kVar);
    }
}
