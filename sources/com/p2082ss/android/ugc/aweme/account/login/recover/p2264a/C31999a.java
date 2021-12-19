package com.p2082ss.android.ugc.aweme.account.login.recover.p2264a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.p2265a.AbstractC32001a;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.p2266b.C32007a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.a */
public final class C31999a extends AbstractC22384h<C32007a> {

    /* renamed from: e */
    public static final C32000a f76407e = new C32000a((byte) 0);

    /* renamed from: f */
    private C32007a f76408f;

    static {
        Covode.recordClassIndex(38754);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.a$a */
    public static final class C32000a {
        static {
            Covode.recordClassIndex(38755);
        }

        private C32000a() {
        }

        public /* synthetic */ C32000a(byte b) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C32007a aVar) {
        C22455a.m42371a("passport_auth_available_ways", (String) null, (String) null, aVar);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C32007a mo36600a(boolean z, C22357b bVar) {
        C32007a aVar = this.f76408f;
        if (aVar == null) {
            aVar = new C32007a(z);
        } else {
            aVar.f52713b = z;
        }
        if (!z && bVar != null) {
            aVar.f52715d = bVar.f52831b;
            aVar.f52717f = bVar.f52832c;
        }
        this.f76408f = null;
        return aVar;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        C32007a aVar = new C32007a(true);
        this.f76408f = aVar;
        if (jSONObject2 != null) {
            aVar.f52751j = jSONObject2.optString("email");
            aVar.f52752k = jSONObject2.optBoolean("has_email");
            aVar.f52753l = jSONObject2.optBoolean("has_mobile");
            aVar.f52754m = jSONObject2.optBoolean("has_oauth");
            aVar.f52755n = jSONObject2.optBoolean("has_pwd");
            aVar.f52756o = jSONObject2.optBoolean("is_most_device");
            aVar.f52757p = jSONObject2.optString("mobile");
            aVar.f52759r = jSONObject2.optString("token");
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject2.optJSONArray("oauth_platforms");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            aVar.f52758q = arrayList;
            aVar.f76416s = jSONObject2.optString("avatar_url");
            aVar.f76417t = jSONObject2.optString("username");
            aVar.f76418u = jSONObject2.optBoolean("is_ftc_user");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31999a(Context context, C22355a aVar, AbstractC32001a aVar2) {
        super(context, aVar, aVar2);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
    }
}
