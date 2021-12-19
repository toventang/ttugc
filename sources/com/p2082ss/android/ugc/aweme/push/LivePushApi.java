package com.p2082ss.android.ugc.aweme.push;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p077b.C1731i;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.push.LivePushApi */
public interface LivePushApi {

    /* renamed from: a */
    public static final C65690a f148019a = C65690a.f148020a;

    static {
        Covode.recordClassIndex(77182);
    }

    @AbstractC89731o(mo144285a = "/cloudpush/callback/in_app_notification/")
    @AbstractC89721e
    C1731i<BaseResponse> reportLiveInnerPush(@AbstractC89719c(mo144273a = "client_time") Long l, @AbstractC89719c(mo144273a = "rule_id") Long l2, @AbstractC89719c(mo144273a = "group_id") Long l3, @AbstractC89719c(mo144273a = "sender") String str, @AbstractC89719c(mo144273a = "gd_label") String str2, @AbstractC89719c(mo144273a = "o_url") String str3);

    /* renamed from: com.ss.android.ugc.aweme.push.LivePushApi$a */
    public static final class C65690a {

        /* renamed from: a */
        static final /* synthetic */ C65690a f148020a = new C65690a();

        private C65690a() {
        }

        static {
            Covode.recordClassIndex(77183);
        }
    }
}
