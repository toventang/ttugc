package com.p2082ss.android.ugc.aweme.account.login.recover.p2264a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1626a.C22306c;
import com.bytedance.sdk.p1625a.p1626a.p1627a.C22291d;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1645h.p1646a.C22420o;
import com.bytedance.sdk.p1625a.p1645h.p1647b.p1648a.AbstractC22436n;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import java.util.HashMap;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.f */
public final class C32016f extends AbstractC22384h<C22291d<C22420o>> {

    /* renamed from: f */
    public static final C32017a f76428f = new C32017a((byte) 0);

    /* renamed from: e */
    public final C22420o f76429e;

    static {
        Covode.recordClassIndex(38771);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.f$a */
    public static final class C32017a {
        static {
            Covode.recordClassIndex(38772);
        }

        private C32017a() {
        }

        public /* synthetic */ C32017a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C32016f m66404a(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, AbstractC22436n nVar) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(str5, "");
            C89219l.m154721d(str6, "");
            C89219l.m154721d(str7, "");
            C89219l.m154721d(str8, "");
            C89219l.m154721d(nVar, "");
            C22420o oVar = new C22420o(str3, str4, str2, str5, str6, str7, str8, i);
            C22355a.C22356a aVar = new C22355a.C22356a();
            aVar.f52826a = C22306c.C22307a.m41972a("/passport/user/login/");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(oVar.f53047a)) {
                hashMap.put("email", C13627m.m24501c(oVar.f53047a));
            }
            if (!TextUtils.isEmpty(oVar.f53049c)) {
                hashMap.put("mobile", C13627m.m24501c(oVar.f53049c));
            }
            if (!TextUtils.isEmpty(oVar.f53048b)) {
                hashMap.put("username", C13627m.m24501c(oVar.f53048b));
            }
            if (!TextUtils.isEmpty(oVar.f53050d)) {
                hashMap.put("account", C13627m.m24501c(oVar.f53050d));
            }
            if (!TextUtils.isEmpty(oVar.f53052f)) {
                hashMap.put("token", oVar.f53052f);
            }
            if (!TextUtils.isEmpty(oVar.f53053g)) {
                hashMap.put("captcha", oVar.f53053g);
            }
            if (oVar.f53054t > 0) {
                hashMap.put("scene", C13627m.m24501c(String.valueOf(oVar.f53054t)));
            }
            hashMap.put("password", C13627m.m24501c(oVar.f53051e));
            hashMap.put("mix_mode", "1");
            if (str != null) {
                hashMap.put("not_login_ticket", str);
            }
            hashMap.put("account_type", String.valueOf(i2));
            C22355a c = aVar.mo36707a(hashMap).mo36710c();
            C89219l.m154716b(c, "");
            return new C32016f(context, c, oVar, nVar);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ void mo36601a(C22291d<C22420o> dVar) {
        C22291d<C22420o> dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        C22455a.m42371a("passport_account_login", (String) null, (String) null, dVar2);
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C22291d<C22420o> mo36600a(boolean z, C22357b bVar) {
        C89219l.m154721d(bVar, "");
        return new C22291d(z, 1016, this.f76429e);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(jSONObject2, "");
        C22420o oVar = this.f76429e;
        if (oVar != null) {
            oVar.f53055u = C22371b.C22372a.m42131a(jSONObject, jSONObject2);
        }
        C22420o oVar2 = this.f76429e;
        if (oVar2 != null) {
            oVar2.f53008m = jSONObject;
        }
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(jSONObject2, "");
        C22371b.m42128a(this.f76429e, jSONObject);
        C22420o oVar = this.f76429e;
        if (oVar != null) {
            oVar.f53008m = jSONObject2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32016f(Context context, C22355a aVar, C22420o oVar, AbstractC22436n nVar) {
        super(context, aVar, nVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(nVar, "");
        this.f76429e = oVar;
    }
}
