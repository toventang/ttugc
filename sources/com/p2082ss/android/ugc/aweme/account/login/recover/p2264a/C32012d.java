package com.p2082ss.android.ugc.aweme.account.login.recover.p2264a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22289b;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.p2265a.AbstractC32003c;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.p2266b.C32009c;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.d */
public final class C32012d extends AbstractC22384h<C22289b> {

    /* renamed from: f */
    public static final C32013a f76424f = new C32013a((byte) 0);

    /* renamed from: e */
    public C32009c f76425e;

    static {
        Covode.recordClassIndex(38767);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36601a(C22289b bVar) {
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.d$a */
    public static final class C32013a {
        static {
            Covode.recordClassIndex(38768);
        }

        private C32013a() {
        }

        public /* synthetic */ C32013a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final C22289b mo36600a(boolean z, C22357b bVar) {
        C32009c cVar = this.f76425e;
        if (cVar == null) {
            cVar = new C32009c(z);
            cVar.f52713b = z;
        }
        if (!z && bVar != null) {
            cVar.f52715d = bVar.f52831b;
            cVar.f52717f = bVar.f52832c;
        }
        this.f76425e = null;
        return cVar;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        C32009c cVar = new C32009c(true);
        this.f76425e = cVar;
        if (jSONObject2 != null) {
            cVar.f76420j = jSONObject2.optBoolean("safe");
            cVar.f76421k = jSONObject2.optString("ticket");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32012d(Context context, C22355a aVar, AbstractC32003c cVar) {
        super(context, aVar, cVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(cVar, "");
    }
}
