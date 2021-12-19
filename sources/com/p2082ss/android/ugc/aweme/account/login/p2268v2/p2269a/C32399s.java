package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.bytedance.sdk.p1625a.p1643f.C22371b;
import com.bytedance.sdk.p1625a.p1645h.p1646a.AbstractC22414i;
import com.bytedance.sdk.p1625a.p1649i.C22455a;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s */
public final class C32399s extends AbstractC22384h<C32403u> {

    /* renamed from: f */
    public static final C32400a f77243f = new C32400a((byte) 0);

    /* renamed from: e */
    public boolean f77244e;

    /* renamed from: g */
    private C22507a f77245g;

    /* renamed from: h */
    private JSONObject f77246h = new JSONObject();

    /* renamed from: i */
    private final C32401b f77247i;

    static {
        Covode.recordClassIndex(39167);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$a */
    public static final class C32400a {
        static {
            Covode.recordClassIndex(39168);
        }

        private C32400a() {
        }

        public /* synthetic */ C32400a(byte b) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C32403u uVar) {
        String str;
        String str2;
        C32403u uVar2 = uVar;
        if (this.f77244e) {
            str = "passport_mobile_reset_password";
            str2 = "mobile";
        } else {
            str = "passport_email_reset_password";
            str2 = "email";
        }
        C22455a.m42371a(str, str2, "force_reset_pw", uVar2);
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(jSONObject2, "");
        this.f77245g = C22371b.C22372a.m42131a(jSONObject, jSONObject2);
        this.f77246h = jSONObject2;
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C32403u mo36600a(boolean z, C22357b bVar) {
        int i;
        C89219l.m154721d(bVar, "");
        if (this.f77244e) {
            i = 1010;
        } else {
            i = 10002;
        }
        C32401b bVar2 = this.f77247i;
        JSONObject jSONObject = this.f77246h;
        C32403u uVar = new C32403u(i, bVar2, jSONObject, jSONObject.optString("captcha"), this.f77245g);
        if (!z) {
            uVar.f52715d = bVar.f52831b;
            uVar.f52717f = bVar.f52832c;
        }
        return uVar;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(jSONObject2, "");
        C22371b.m42128a(this.f77247i, jSONObject);
        this.f77247i.f53008m = jSONObject2;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.s$b */
    public static final class C32401b extends AbstractC22414i {

        /* renamed from: a */
        public final String f77248a;

        /* renamed from: b */
        public final String f77249b;

        /* renamed from: c */
        public final String f77250c;

        static {
            Covode.recordClassIndex(39169);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32401b)) {
                return false;
            }
            C32401b bVar = (C32401b) obj;
            return C89219l.m154714a(this.f77248a, bVar.f77248a) && C89219l.m154714a(this.f77249b, bVar.f77249b) && C89219l.m154714a(this.f77250c, bVar.f77250c);
        }

        public final int hashCode() {
            String str = this.f77248a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f77249b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f77250c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public final String toString() {
            return "ForceResetPassObj(password=" + this.f77248a + ", conditionalLoginTicket=" + this.f77249b + ", ticket=" + this.f77250c + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32401b(String str, String str2, String str3) {
            super(13);
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            this.f77248a = str;
            this.f77249b = str2;
            this.f77250c = str3;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32399s(Context context, C22355a aVar, C32401b bVar, AbstractC32402t tVar) {
        super(context, aVar, tVar);
        C89219l.m154721d(bVar, "");
        this.f77247i = bVar;
    }
}
