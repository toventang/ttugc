package com.p2082ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.EventDetailData;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.feed.api.LiveEventActionApi */
public final class LiveEventActionApi {

    /* renamed from: a */
    public static final LiveEventActionApi f111998a = new LiveEventActionApi();

    /* renamed from: b */
    private static final RealApi f111999b = ((RealApi) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(RealApi.class));

    /* renamed from: com.ss.android.ugc.aweme.feed.api.LiveEventActionApi$RealApi */
    public interface RealApi {
        static {
            Covode.recordClassIndex(57094);
        }

        @AbstractC89722f(mo144276a = "/tiktok/event/get/v1")
        AbstractC88979t<EventDetailData> getEventDetail(@AbstractC89736t(mo144292a = "event_id") String str);

        @AbstractC89731o(mo144285a = "/tiktok/event/subscribe/v1")
        AbstractC88979t<BaseResponse> registerEvent(@AbstractC89736t(mo144292a = "event_id") String str);

        @AbstractC89731o(mo144285a = "/tiktok/event/unsubscribe/v1")
        AbstractC88979t<BaseResponse> unregisterEvent(@AbstractC89736t(mo144292a = "event_id") String str);
    }

    private LiveEventActionApi() {
    }

    static {
        Covode.recordClassIndex(57093);
    }
}
