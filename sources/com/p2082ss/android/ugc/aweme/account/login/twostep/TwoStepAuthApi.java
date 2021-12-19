package com.p2082ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.account.api.AccountApiInModule;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi */
public final class TwoStepAuthApi {

    /* renamed from: a */
    public static String f76630a;

    /* renamed from: b */
    public static final TwoStepAuthApi f76631b = new TwoStepAuthApi();

    /* renamed from: c */
    private static final AbstractC89244h f76632c = C89250i.m154773a((AbstractC89171a) C32122d.f76653a);

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$Api */
    public interface Api {
        static {
            Covode.recordClassIndex(38878);
        }

        @AbstractC89731o(mo144285a = "/passport/safe/two_step_verification/add_auth_device/")
        @AbstractC21999g
        C1731i<C89391z> addAuthDevice(@AbstractC89719c(mo144273a = "verify_ticket") String str);

        @AbstractC89731o(mo144285a = "/passport/safe/two_step_verification/add_verification/")
        @AbstractC21999g
        C1731i<C32176a> addVerification(@AbstractC89719c(mo144273a = "verify_ticket") String str, @AbstractC89719c(mo144273a = "verify_way") String str2, @AbstractC89719c(mo144273a = "is_default") int i);

        @AbstractC89722f(mo144276a = "/passport/safe/two_step_verification/get_auth_device_list/")
        C1731i<C32180b> getAuthDeviceList();

        @AbstractC89722f(mo144276a = "/passport/auth/available_ways/")
        C1731i<C32182c> getAvailableWays();

        @AbstractC89722f(mo144276a = "/passport/safe/api/user/unusual_info_preview/")
        C1731i<C32295x> getUnusualInfo();

        @AbstractC89722f(mo144276a = "/passport/safe/two_step_verification/get_verification_list/")
        C1731i<C32176a> getVerification();

        @AbstractC89731o(mo144285a = "/passport/safe/two_step_verification/remove_all/")
        @AbstractC21999g
        C1731i<C32176a> removeAllVerification(@AbstractC89719c(mo144273a = "verify_ticket") String str);

        @AbstractC89731o(mo144285a = "/passport/safe/two_step_verification/remove_auth_device/")
        @AbstractC21999g
        C1731i<C32180b> removeAuthDevice(@AbstractC89719c(mo144273a = "del_did") String str);

        @AbstractC89731o(mo144285a = "/passport/safe/two_step_verification/remove_verification/")
        @AbstractC21999g
        C1731i<C32176a> removeVerification(@AbstractC89719c(mo144273a = "verify_ticket") String str, @AbstractC89719c(mo144273a = "verify_way") String str2);

        @AbstractC89731o(mo144285a = "/passport/email/send_code/")
        @AbstractC21999g
        C1731i<C32116a> sendEmailCode(@AbstractC89719c(mo144273a = "verify_ticket") String str, @AbstractC89719c(mo144273a = "type") Integer num);

        @AbstractC89731o(mo144285a = "/passport/mobile/send_code/v1/")
        @AbstractC21999g
        C1731i<C32118b> sendSmsCode(@AbstractC89719c(mo144273a = "verify_ticket") String str, @AbstractC89719c(mo144273a = "is6Digits") Integer num, @AbstractC89719c(mo144273a = "type") Integer num2);

        @AbstractC89731o(mo144285a = "/passport/email/check_code/")
        @AbstractC21999g
        C1731i<C32120c> verifyEmailCode(@AbstractC89719c(mo144273a = "mix_mode") Integer num, @AbstractC89719c(mo144273a = "email") String str, @AbstractC89719c(mo144273a = "code") String str2, @AbstractC89719c(mo144273a = "type") int i, @AbstractC89719c(mo144273a = "verify_ticket") String str3);

        @AbstractC89731o(mo144285a = "/passport/account/verify/")
        @AbstractC21999g
        C1731i<C32120c> verifyPassword(@AbstractC89719c(mo144273a = "username") String str, @AbstractC89719c(mo144273a = "mobile") String str2, @AbstractC89719c(mo144273a = "email") String str3, @AbstractC89719c(mo144273a = "password") String str4, @AbstractC89719c(mo144273a = "mix_mode") int i, @AbstractC89719c(mo144273a = "verify_ticket") String str5);

        @AbstractC89731o(mo144285a = "/passport/mobile/check_code/")
        @AbstractC21999g
        C1731i<C32120c> verifySmsCode(@AbstractC89719c(mo144273a = "mix_mode") Integer num, @AbstractC89719c(mo144273a = "mobile") String str, @AbstractC89719c(mo144273a = "code") String str2, @AbstractC89719c(mo144273a = "type") int i, @AbstractC89719c(mo144273a = "verify_ticket") String str3);

        @AbstractC89731o(mo144285a = "/passport/auth/verify/")
        @AbstractC21999g
        C1731i<C32120c> verifyThirdParty(@AbstractC89719c(mo144273a = "access_token") String str, @AbstractC89719c(mo144273a = "access_token_secret") String str2, @AbstractC89719c(mo144273a = "code") String str3, @AbstractC89719c(mo144273a = "expires_in") Integer num, @AbstractC89719c(mo144273a = "openid") Integer num2, @AbstractC89719c(mo144273a = "platform") String str4, @AbstractC89719c(mo144273a = "platform_app_id") Integer num3, @AbstractC89719c(mo144273a = "mid") Integer num4, @AbstractC89719c(mo144273a = "verify_ticket") String str5);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a */
    public static final class C32116a {
        @AbstractC27891c(mo46611a = "message")

        /* renamed from: a */
        public final String f76633a;
        @AbstractC27891c(mo46611a = "data")

        /* renamed from: b */
        public final C32117a f76634b;

        /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a */
        public static final class C32117a {
            @AbstractC27891c(mo46611a = "email")

            /* renamed from: a */
            public final String f76635a;
            @AbstractC27891c(mo46611a = "captcha")

            /* renamed from: b */
            public final String f76636b;
            @AbstractC27891c(mo46611a = "description")

            /* renamed from: c */
            public final String f76637c;
            @AbstractC27891c(mo46611a = "error_code")

            /* renamed from: d */
            public final Integer f76638d;

            static {
                Covode.recordClassIndex(38880);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C32117a)) {
                    return false;
                }
                C32117a aVar = (C32117a) obj;
                return C89219l.m154714a(this.f76635a, aVar.f76635a) && C89219l.m154714a(this.f76636b, aVar.f76636b) && C89219l.m154714a(this.f76637c, aVar.f76637c) && C89219l.m154714a(this.f76638d, aVar.f76638d);
            }

            public final int hashCode() {
                String str = this.f76635a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.f76636b;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.f76637c;
                int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
                Integer num = this.f76638d;
                if (num != null) {
                    i = num.hashCode();
                }
                return hashCode3 + i;
            }

            public final String toString() {
                return "Data(email=" + this.f76635a + ", captcha=" + this.f76636b + ", errorDescription=" + this.f76637c + ", errorCode=" + this.f76638d + ")";
            }
        }

        static {
            Covode.recordClassIndex(38879);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32116a)) {
                return false;
            }
            C32116a aVar = (C32116a) obj;
            return C89219l.m154714a(this.f76633a, aVar.f76633a) && C89219l.m154714a(this.f76634b, aVar.f76634b);
        }

        public final int hashCode() {
            String str = this.f76633a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C32117a aVar = this.f76634b;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "SendEmailCodeResponse(message=" + this.f76633a + ", data=" + this.f76634b + ")";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$b */
    public static final class C32118b {
        @AbstractC27891c(mo46611a = "message")

        /* renamed from: a */
        public final String f76639a;
        @AbstractC27891c(mo46611a = "data")

        /* renamed from: b */
        public final C32119a f76640b;

        /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$b$a */
        public static final class C32119a {
            @AbstractC27891c(mo46611a = "mobile")

            /* renamed from: a */
            public final String f76641a;
            @AbstractC27891c(mo46611a = "retry_time")

            /* renamed from: b */
            public final Integer f76642b;
            @AbstractC27891c(mo46611a = "captcha")

            /* renamed from: c */
            public final String f76643c;
            @AbstractC27891c(mo46611a = "description")

            /* renamed from: d */
            public final String f76644d;
            @AbstractC27891c(mo46611a = "error_code")

            /* renamed from: e */
            public final Integer f76645e;
            @AbstractC27891c(mo46611a = "next_url")

            /* renamed from: f */
            public final String f76646f;

            static {
                Covode.recordClassIndex(38882);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C32119a)) {
                    return false;
                }
                C32119a aVar = (C32119a) obj;
                return C89219l.m154714a(this.f76641a, aVar.f76641a) && C89219l.m154714a(this.f76642b, aVar.f76642b) && C89219l.m154714a(this.f76643c, aVar.f76643c) && C89219l.m154714a(this.f76644d, aVar.f76644d) && C89219l.m154714a(this.f76645e, aVar.f76645e) && C89219l.m154714a(this.f76646f, aVar.f76646f);
            }

            public final int hashCode() {
                String str = this.f76641a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                Integer num = this.f76642b;
                int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
                String str2 = this.f76643c;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.f76644d;
                int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
                Integer num2 = this.f76645e;
                int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
                String str4 = this.f76646f;
                if (str4 != null) {
                    i = str4.hashCode();
                }
                return hashCode5 + i;
            }

            public final String toString() {
                return "Data(mobile=" + this.f76641a + ", retryTime=" + this.f76642b + ", captcha=" + this.f76643c + ", errorDescription=" + this.f76644d + ", errorCode=" + this.f76645e + ", nextUrl=" + this.f76646f + ")";
            }
        }

        static {
            Covode.recordClassIndex(38881);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32118b)) {
                return false;
            }
            C32118b bVar = (C32118b) obj;
            return C89219l.m154714a(this.f76639a, bVar.f76639a) && C89219l.m154714a(this.f76640b, bVar.f76640b);
        }

        public final int hashCode() {
            String str = this.f76639a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C32119a aVar = this.f76640b;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "SendSmsCodeResponse(message=" + this.f76639a + ", data=" + this.f76640b + ")";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c */
    public static final class C32120c {
        @AbstractC27891c(mo46611a = "message")

        /* renamed from: a */
        public final String f76647a;
        @AbstractC27891c(mo46611a = "data")

        /* renamed from: b */
        public final C32121a f76648b;

        /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a */
        public static final class C32121a {
            @AbstractC27891c(mo46611a = "ticket")

            /* renamed from: a */
            public final String f76649a;
            @AbstractC27891c(mo46611a = "captcha")

            /* renamed from: b */
            public final String f76650b;
            @AbstractC27891c(mo46611a = "error_code")

            /* renamed from: c */
            public final Integer f76651c;
            @AbstractC27891c(mo46611a = "description")

            /* renamed from: d */
            public final String f76652d;

            static {
                Covode.recordClassIndex(38884);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C32121a)) {
                    return false;
                }
                C32121a aVar = (C32121a) obj;
                return C89219l.m154714a(this.f76649a, aVar.f76649a) && C89219l.m154714a(this.f76650b, aVar.f76650b) && C89219l.m154714a(this.f76651c, aVar.f76651c) && C89219l.m154714a(this.f76652d, aVar.f76652d);
            }

            public final int hashCode() {
                String str = this.f76649a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.f76650b;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                Integer num = this.f76651c;
                int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
                String str3 = this.f76652d;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                return hashCode3 + i;
            }

            public final String toString() {
                return "Data(ticket=" + this.f76649a + ", captcha=" + this.f76650b + ", errorCode=" + this.f76651c + ", errorDescription=" + this.f76652d + ")";
            }
        }

        static {
            Covode.recordClassIndex(38883);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32120c)) {
                return false;
            }
            C32120c cVar = (C32120c) obj;
            return C89219l.m154714a(this.f76647a, cVar.f76647a) && C89219l.m154714a(this.f76648b, cVar.f76648b);
        }

        public final int hashCode() {
            String str = this.f76647a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C32121a aVar = this.f76648b;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "TwoStepApiResponse(message=" + this.f76647a + ", data=" + this.f76648b + ")";
        }
    }

    /* renamed from: a */
    public static Api m66501a() {
        return (Api) f76632c.getValue();
    }

    private TwoStepAuthApi() {
    }

    /* renamed from: b */
    public static C1731i<C32180b> m66502b() {
        return m66501a().getAuthDeviceList();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$d */
    static final class C32122d extends AbstractC89220m implements AbstractC89171a<Api> {

        /* renamed from: a */
        public static final C32122d f76653a = new C32122d();

        static {
            Covode.recordClassIndex(38885);
        }

        C32122d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Api invoke() {
            String str = AccountApiInModule.f75516a;
            C89219l.m154716b(str, "");
            return C18097a.m33696a().mo28816a(str).mo28858a(Api.class);
        }
    }

    static {
        Covode.recordClassIndex(38877);
    }

    /* renamed from: a */
    public static C1731i<C32176a> m66498a(String str) {
        C89219l.m154721d(str, "");
        return m66501a().removeAllVerification(str);
    }

    /* renamed from: a */
    public static C1731i<C32176a> m66499a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return m66501a().removeVerification(str, str2);
    }

    /* renamed from: a */
    public static C1731i<C32176a> m66500a(String str, String str2, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return m66501a().addVerification(str, str2, i);
    }
}
