package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.video.data.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import p4560f.p4561a.AbstractC88403ab;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.data.api.FavoriteAwemeService */
public interface FavoriteAwemeService {

    /* renamed from: a */
    public static final C54201a f124171a = C54201a.f124172a;

    static {
        Covode.recordClassIndex(63886);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/aweme/favorite/")
    AbstractC88403ab<FeedItemList> getFavoriteAweme(@AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "user_id") String str, @AbstractC89736t(mo144292a = "sec_user_id") String str2, @AbstractC89736t(mo144292a = "max_cursor") long j);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.data.api.FavoriteAwemeService$a */
    public static final class C54201a {

        /* renamed from: a */
        static final /* synthetic */ C54201a f124172a = new C54201a();

        private C54201a() {
        }

        static {
            Covode.recordClassIndex(63887);
        }
    }
}
