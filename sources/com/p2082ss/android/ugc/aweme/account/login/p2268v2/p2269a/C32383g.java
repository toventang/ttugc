package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.g */
public final class C32383g extends AbstractC22384h<C22291d<C32386i>> {

    /* renamed from: e */
    public static final C32384a f77221e = new C32384a((byte) 0);

    /* renamed from: f */
    private final C32386i f77222f;

    static {
        Covode.recordClassIndex(39151);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.g$a */
    public static final class C32384a {
        static {
            Covode.recordClassIndex(39152);
        }

        private C32384a() {
        }

        public /* synthetic */ C32384a(byte b) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ void mo36601a(C22291d<C32386i> dVar) {
        C89219l.m154721d(dVar, "");
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(jSONObject2, "");
        this.f77222f.f53008m = jSONObject2;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(jSONObject2, "");
        this.f77222f.f53008m = jSONObject;
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22291d<C32386i> mo36600a(boolean z, C22357b bVar) {
        C89219l.m154721d(bVar, "");
        this.f77222f.f53003h = bVar.f52831b;
        this.f77222f.f53005j = bVar.f52832c;
        return new C22291d(z, 1009, this.f77222f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32383g(Context context, C22355a aVar, C32386i iVar, AbstractC32385h hVar) {
        super(context, aVar, hVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(hVar, "");
        this.f77222f = iVar;
    }
}
