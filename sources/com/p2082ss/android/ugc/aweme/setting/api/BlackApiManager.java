package com.p2082ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.setting.model.C68175e;
import java.util.concurrent.ExecutionException;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.setting.api.BlackApiManager */
public final class BlackApiManager {

    /* renamed from: a */
    static BlackApi f152319a = ((BlackApi) C18097a.m33698a(Api.f79771d, BlackApi.class));

    /* renamed from: com.ss.android.ugc.aweme.setting.api.BlackApiManager$BlackApi */
    interface BlackApi {
        static {
            Covode.recordClassIndex(80172);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/user/block/list/")
        AbstractFutureC27655q<C68175e> fetchBlackList(@AbstractC89736t(mo144292a = "index") int i, @AbstractC89736t(mo144292a = "count") int i2);

        @AbstractC89722f(mo144276a = "/aweme/v1/im/set/chatpriv/")
        AbstractFutureC27655q<BaseResponse> setChatAuthority(@AbstractC89736t(mo144292a = "val") int i);
    }

    static {
        Covode.recordClassIndex(80171);
    }

    /* renamed from: a */
    public static C68175e m120302a(int i) {
        try {
            return f152319a.fetchBlackList(i, 10).get();
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }
}
