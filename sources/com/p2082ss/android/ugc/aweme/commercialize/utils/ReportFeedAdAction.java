package com.p2082ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.p2123b.C29736b;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ReportFeedAdAction */
public final class ReportFeedAdAction {

    /* renamed from: a */
    public static final ReportFeedAdAction f91220a = new ReportFeedAdAction();

    /* renamed from: b */
    private static final RetrofitApi f91221b = ((RetrofitApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(RetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ReportFeedAdAction$RetrofitApi */
    public interface RetrofitApi {
        static {
            Covode.recordClassIndex(46144);
        }

        @AbstractC89731o(mo144285a = "/api/ad/v1/ack_action/")
        @AbstractC89721e
        C1731i<Object> reportAction(@AbstractC89719c(mo144273a = "item_id") String str, @AbstractC89719c(mo144273a = "ad_id") long j, @AbstractC89719c(mo144273a = "creative_id") long j2, @AbstractC89719c(mo144273a = "log_extra") String str2, @AbstractC89719c(mo144273a = "action_extra") String str3, @AbstractC89719c(mo144273a = "action_type") int i);
    }

    private ReportFeedAdAction() {
    }

    static {
        Covode.recordClassIndex(46143);
    }

    /* renamed from: a */
    public static void m78334a(String str) {
        if (str == null) {
            str = "";
        }
        C89219l.m154721d(str, "");
    }
}
