package com.p2082ss.android.ugc.aweme.commercialize.profile;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.FakeUserAwemeApi */
public interface FakeUserAwemeApi {

    /* renamed from: a */
    public static final C38390a f90710a = C38390a.f90711a;

    static {
        Covode.recordClassIndex(45895);
    }

    @AbstractC22000h(mo35789a = "/tiktok/v1/ad/diversion/post/")
    AbstractC21983b<FeedItemList> getFakeUserAwemeList(@AbstractC22018z(mo35807a = "user_id") String str, @AbstractC22018z(mo35807a = "sec_user_id") String str2, @AbstractC22018z(mo35807a = "max_cursor") long j, @AbstractC22018z(mo35807a = "min_cursor") long j2, @AbstractC22018z(mo35807a = "count") int i, @AbstractC22018z(mo35807a = "adv_id") String str3, @AbstractC22018z(mo35807a = "item_id") String str4);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.FakeUserAwemeApi$a */
    public static final class C38390a {

        /* renamed from: a */
        static final /* synthetic */ C38390a f90711a = new C38390a();

        private C38390a() {
        }

        static {
            Covode.recordClassIndex(45896);
        }
    }
}
