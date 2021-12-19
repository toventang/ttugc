package com.p2082ss.android.ugc.aweme.account.api.p2241a;

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

/* renamed from: com.ss.android.ugc.aweme.account.api.a.a */
public final class C31571a extends AbstractC22384h<C22291d<C22419n>> {

    /* renamed from: f */
    public static final C31572a f75519f = new C31572a((byte) 0);

    /* renamed from: e */
    public final C22419n f75520e;

    static {
        Covode.recordClassIndex(38294);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.api.a.a$a */
    public static final class C31572a {
        static {
            Covode.recordClassIndex(38295);
        }

        private C31572a() {
        }

        public /* synthetic */ C31572a(byte b) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C22291d<C22419n> dVar) {
        C22455a.m42371a("passport_mobile_sendcode", "mobile", this.f52931b.mo36704a(StringSet.type), dVar);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22291d<C22419n> mo36600a(boolean z, C22357b bVar) {
        return new C22291d(z, 1002, this.f75520e);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        int i;
        C22419n nVar = this.f75520e;
        if (jSONObject2 != null) {
            i = jSONObject2.optInt("retry_time", 30);
        } else {
            i = 0;
        }
        nVar.f53040t = i;
        this.f75520e.f53008m = jSONObject;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C22371b.m42128a(this.f75520e, jSONObject);
        this.f75520e.f53008m = jSONObject2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31571a(Context context, C22355a aVar, C22419n nVar, AbstractC22434l lVar) {
        super(context, aVar, lVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(nVar, "");
        C89219l.m154721d(lVar, "");
        this.f75520e = nVar;
    }
}
