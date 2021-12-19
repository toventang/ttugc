package com.p2082ss.android.ugc.aweme.promote;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager */
public final class PromoteProgramRequestApiManager {

    /* renamed from: a */
    static final String f147149a;

    /* renamed from: b */
    static PromoteProgramRequestApi f147150b;

    /* renamed from: com.ss.android.ugc.aweme.promote.PromoteProgramRequestApiManager$PromoteProgramRequestApi */
    interface PromoteProgramRequestApi {
        static {
            Covode.recordClassIndex(76700);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/creatorlicense/cancel/")
        AbstractFutureC27655q<BaseResponse> cancelPromoteProgram();

        @AbstractC89722f(mo144276a = "/aweme/v1/creatorlicense/confirm/")
        AbstractFutureC27655q<PromoteProgramResponse> confirmPromoteProgram(@AbstractC89736t(mo144292a = "license_version") String str);
    }

    static {
        Covode.recordClassIndex(76697);
        String str = Api.f79771d;
        f147149a = str;
        f147150b = (PromoteProgramRequestApi) C18097a.m33698a(str, PromoteProgramRequestApi.class);
    }
}
