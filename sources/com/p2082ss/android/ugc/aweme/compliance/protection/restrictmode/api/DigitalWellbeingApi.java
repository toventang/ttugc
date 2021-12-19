package com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.restrictmode.api.DigitalWellbeingApi */
public interface DigitalWellbeingApi {

    /* renamed from: a */
    public static final C40095a f94163a = C40095a.f94164a;

    static {
        Covode.recordClassIndex(47871);
    }

    @AbstractC89731o(mo144285a = "/aweme/v1/minor/user/check/password/")
    @AbstractC89721e
    AbstractC88979t<BaseResponse> checkPassword(@AbstractC89719c(mo144273a = "password") String str);

    @AbstractC89731o(mo144285a = "/aweme/v1/minor/user/set/settings/")
    @AbstractC89721e
    AbstractC88979t<C40096a> setMinorSettings(@AbstractC89719c(mo144273a = "settings") String str);

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.restrictmode.api.DigitalWellbeingApi$a */
    public static final class C40095a {

        /* renamed from: a */
        static final /* synthetic */ C40095a f94164a = new C40095a();

        private C40095a() {
        }

        static {
            Covode.recordClassIndex(47872);
        }
    }
}
