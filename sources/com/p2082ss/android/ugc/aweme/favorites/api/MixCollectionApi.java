package com.p2082ss.android.ugc.aweme.favorites.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.favorites.p2920b.C47200a;
import p4560f.p4561a.AbstractC88979t;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.MixCollectionApi */
public interface MixCollectionApi {

    /* renamed from: a */
    public static final C47187a f109830a = C47187a.f109831a;

    static {
        Covode.recordClassIndex(55793);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/mix/listcollection/")
    AbstractC88979t<C47200a> getMixCollection(@AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "cursor") long j, @AbstractC89736t(mo144292a = "mix_ids") String str);

    @AbstractC89722f(mo144276a = "/aweme/v1/mix/list/")
    AbstractC88979t<C47200a> getProfileVideoMixList(@AbstractC89736t(mo144292a = "user_id") String str, @AbstractC89736t(mo144292a = "sec_user_id") String str2, @AbstractC89736t(mo144292a = "count") int i, @AbstractC89736t(mo144292a = "cursor") long j);

    @AbstractC89722f(mo144276a = "/aweme/v1/mix/multi/details/")
    AbstractC88979t<C47200a> getSearchMixCollection(@AbstractC89736t(mo144292a = "mix_ids") String str);

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.MixCollectionApi$a */
    public static final class C47187a {

        /* renamed from: a */
        static final /* synthetic */ C47187a f109831a = new C47187a();

        private C47187a() {
        }

        static {
            Covode.recordClassIndex(55794);
        }
    }
}
