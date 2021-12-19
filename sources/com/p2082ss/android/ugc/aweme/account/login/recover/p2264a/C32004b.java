package com.p2082ss.android.ugc.aweme.account.login.recover.p2264a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1641d.C22357b;
import com.bytedance.sdk.p1625a.p1643f.AbstractC22384h;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.p2265a.AbstractC32002b;
import com.p2082ss.android.ugc.aweme.account.login.recover.p2264a.p2266b.C32008b;
import java.io.Serializable;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.b */
public final class C32004b extends AbstractC22384h<C32008b> {

    /* renamed from: e */
    public static final C32005a f76409e = new C32005a((byte) 0);

    /* renamed from: f */
    private C32008b f76410f;

    static {
        Covode.recordClassIndex(38759);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36601a(C32008b bVar) {
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final void mo36602a(JSONObject jSONObject, JSONObject jSONObject2) {
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.b$a */
    public static final class C32005a {
        static {
            Covode.recordClassIndex(38760);
        }

        private C32005a() {
        }

        public /* synthetic */ C32005a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.recover.a.b$b */
    public static final class C32006b implements Serializable {

        /* renamed from: a */
        private final int f76411a;

        /* renamed from: b */
        private final String f76412b;

        /* renamed from: c */
        private final String f76413c;

        /* renamed from: d */
        private final String f76414d;

        /* renamed from: e */
        private final String f76415e;

        static {
            Covode.recordClassIndex(38761);
        }

        /* renamed from: com_ss_android_ugc_aweme_account_login_recover_api_GetAccountTicketThread$GetAccountTicketRequestObj_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
        public static int m66387xfc4e7b3b(int i) {
            return i;
        }

        public static /* synthetic */ C32006b copy$default(C32006b bVar, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = bVar.f76411a;
            }
            if ((i2 & 2) != 0) {
                str = bVar.f76412b;
            }
            if ((i2 & 4) != 0) {
                str2 = bVar.f76413c;
            }
            if ((i2 & 8) != 0) {
                str3 = bVar.f76414d;
            }
            if ((i2 & 16) != 0) {
                str4 = bVar.f76415e;
            }
            return bVar.copy(i, str, str2, str3, str4);
        }

        public final int component1() {
            return this.f76411a;
        }

        public final String component2() {
            return this.f76412b;
        }

        public final String component3() {
            return this.f76413c;
        }

        public final String component4() {
            return this.f76414d;
        }

        public final String component5() {
            return this.f76415e;
        }

        public final C32006b copy(int i, String str, String str2, String str3, String str4) {
            return new C32006b(i, str, str2, str3, str4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32006b)) {
                return false;
            }
            C32006b bVar = (C32006b) obj;
            return this.f76411a == bVar.f76411a && C89219l.m154714a(this.f76412b, bVar.f76412b) && C89219l.m154714a(this.f76413c, bVar.f76413c) && C89219l.m154714a(this.f76414d, bVar.f76414d) && C89219l.m154714a(this.f76415e, bVar.f76415e);
        }

        public final int hashCode() {
            int com_ss_android_ugc_aweme_account_login_recover_api_GetAccountTicketThread$GetAccountTicketRequestObj_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m66387xfc4e7b3b(this.f76411a) * 31;
            String str = this.f76412b;
            int i = 0;
            int hashCode = (com_ss_android_ugc_aweme_account_login_recover_api_GetAccountTicketThread$GetAccountTicketRequestObj_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f76413c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f76414d;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f76415e;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return hashCode3 + i;
        }

        public final String toString() {
            return "GetAccountTicketRequestObj(find_way=" + this.f76411a + ", area_code=" + this.f76412b + ", mobile=" + this.f76413c + ", login_name=" + this.f76414d + ", email=" + this.f76415e + ")";
        }

        public final String getArea_code() {
            return this.f76412b;
        }

        public final String getEmail() {
            return this.f76415e;
        }

        public final int getFind_way() {
            return this.f76411a;
        }

        public final String getLogin_name() {
            return this.f76414d;
        }

        public final String getMobile() {
            return this.f76413c;
        }

        public C32006b(int i, String str, String str2, String str3, String str4) {
            this.f76411a = i;
            this.f76412b = str;
            this.f76413c = str2;
            this.f76414d = str3;
            this.f76415e = str4;
        }
    }

    /* Return type fixed from 'com.bytedance.sdk.a.a.a.b' to match base method */
    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: a */
    public final /* synthetic */ C32008b mo36600a(boolean z, C22357b bVar) {
        C32008b bVar2 = this.f76410f;
        if (bVar2 == null) {
            bVar2 = new C32008b(z);
        } else {
            bVar2.f52713b = z;
        }
        if (!z && bVar != null) {
            bVar2.f52715d = bVar.f52831b;
            bVar2.f52717f = bVar.f52832c;
        }
        return bVar2;
    }

    @Override // com.bytedance.sdk.p1625a.p1643f.AbstractC22384h
    /* renamed from: b */
    public final void mo36603b(JSONObject jSONObject, JSONObject jSONObject2) {
        C32008b bVar = new C32008b(true);
        this.f76410f = bVar;
        if (jSONObject2 != null) {
            bVar.f76419j = jSONObject2.optString("token");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32004b(Context context, C22355a aVar, AbstractC32002b bVar) {
        super(context, aVar, bVar);
        C89219l.m154721d(bVar, "");
    }
}
