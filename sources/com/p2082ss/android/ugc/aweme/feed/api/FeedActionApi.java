package com.p2082ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Map;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;
import p4640l.p4644b.AbstractC89737u;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FeedActionApi */
public final class FeedActionApi {

    /* renamed from: a */
    public static final RetrofitApi f111983a = ((RetrofitApi) C18097a.m33698a(C29736b.f70924e, RetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.feed.api.FeedActionApi$RetrofitApi */
    public interface RetrofitApi {
        static {
            Covode.recordClassIndex(57076);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/aweme/delete/")
        AbstractFutureC27655q<BaseResponse> deleteItem(@AbstractC89736t(mo144292a = "aweme_id") String str);

        @AbstractC89722f(mo144276a = "/aweme/v1/schedule/aweme/delete/")
        AbstractFutureC27655q<BaseResponse> deleteScheduleItem(@AbstractC89736t(mo144292a = "aweme_id") String str);

        @AbstractC89722f(mo144276a = "/aweme/v1/commit/item/digg/")
        AbstractFutureC27655q<BaseResponse> diggItem(@AbstractC89737u Map<String, String> map);
    }

    static {
        Covode.recordClassIndex(57075);
    }
}
