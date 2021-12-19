package com.p2082ss.android.ugc.aweme.account.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.account.loginsetting.C32831b;
import com.p2082ss.android.ugc.aweme.account.util.C33036f;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p077b.C1731i;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.account.api.AccountApiInModule */
public final class AccountApiInModule {

    /* renamed from: a */
    public static final String f75516a = "https://api.tiktokv.com";

    /* renamed from: b */
    public static Api f75517b = ((Api) C18097a.m33698a("https://api.tiktokv.com", Api.class));

    /* renamed from: c */
    private static final boolean f75518c = false;

    /* renamed from: com.ss.android.ugc.aweme.account.api.AccountApiInModule$Api */
    public interface Api {
        static {
            Covode.recordClassIndex(38291);
        }

        @AbstractC89722f(mo144276a = "/passport/password/has_set/")
        AbstractFutureC27655q<Object> checkPasswordSet();

        @AbstractC89731o(mo144285a = "/passport/mobile/can_send_voice_code/")
        @AbstractC89721e
        C1731i<C32831b> checkVoiceCodeAvailability(@AbstractC89719c(mo144273a = "mobile") String str, @AbstractC89719c(mo144273a = "mix_mode") String str2);

        @AbstractC89731o(mo144285a = "/aweme/v1/ad/ba/on/")
        @AbstractC89721e
        AbstractFutureC27655q<BaseResponse> switchBusinessAccount(@AbstractC89719c(mo144273a = "category_name") String str);

        @AbstractC89731o(mo144285a = "/aweme/v1/user/proaccount/setting/")
        @AbstractC89721e
        AbstractFutureC27655q<BaseResponse> switchProAccount(@AbstractC89719c(mo144273a = "action_type") int i, @AbstractC89719c(mo144273a = "category_name") String str, @AbstractC89719c(mo144273a = "category_id") String str2, @AbstractC89719c(mo144273a = "pro_g") int i2);
    }

    static {
        Covode.recordClassIndex(38290);
    }

    /* renamed from: a */
    public static C1731i<C32831b> m65852a(String str) {
        try {
            return f75517b.checkVoiceCodeAvailability(C33036f.m67670a(str), "1");
        } catch (Exception unused) {
            return null;
        }
    }
}
