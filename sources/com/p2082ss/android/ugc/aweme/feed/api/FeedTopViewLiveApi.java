package com.p2082ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.feed.model.TopViewLiveInfo;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FeedTopViewLiveApi */
public interface FeedTopViewLiveApi {

    /* renamed from: a */
    public static final C48325a f111992a = C48325a.f111993a;

    static {
        Covode.recordClassIndex(57087);
    }

    @AbstractC22000h(mo35789a = "/aweme/v1/topview/live/")
    AbstractC88979t<TopViewLiveInfo> getTopViewLiveInfo(@AbstractC22018z(mo35807a = "sec_uid") String str);

    /* renamed from: com.ss.android.ugc.aweme.feed.api.FeedTopViewLiveApi$a */
    public static final class C48325a {

        /* renamed from: a */
        static final /* synthetic */ C48325a f111993a = new C48325a();

        private C48325a() {
        }

        static {
            Covode.recordClassIndex(57088);
        }
    }
}
