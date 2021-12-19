package com.p2082ss.android.ugc.aweme.discover.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.discover.model.BannerList;
import com.p2082ss.android.ugc.aweme.discover.model.TrendingTopicList;
import com.p2082ss.android.ugc.aweme.discover.repo.fetcher.DiscoveryTimeGapInterceptor;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.discover.api.DiscoverApiNew */
public interface DiscoverApiNew {

    /* renamed from: a */
    public static final C41838a f97591a = C41838a.f97593b;

    static {
        Covode.recordClassIndex(49754);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/find/")
    AbstractC88403ab<BannerList> getBannerList(@AbstractC89736t(mo144292a = "banner_tab_type") Integer num, @AbstractC89736t(mo144292a = "ad_personality_mode") Integer num2, @AbstractC89736t(mo144292a = "cmpl_enc") String str);

    @AbstractC89722f(mo144276a = "/aweme/v1/category/list/")
    AbstractC88403ab<TrendingTopicList> getTrendingTopics(@AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2, @AbstractC89736t(mo144292a = "ad_personality_mode") Integer num, @AbstractC89736t(mo144292a = "cmpl_enc") String str);

    @AbstractC89722f(mo144276a = "/aweme/v2/category/list/")
    AbstractC88403ab<TrendingTopicList> getTrendingTopicsV2(@AbstractC89736t(mo144292a = "cursor") int i, @AbstractC89736t(mo144292a = "count") int i2, @AbstractC89736t(mo144292a = "is_complete") Integer num, @AbstractC89736t(mo144292a = "ad_personality_mode") Integer num2, @AbstractC89736t(mo144292a = "cmpl_enc") String str);

    /* renamed from: com.ss.android.ugc.aweme.discover.api.DiscoverApiNew$a */
    public static final class C41838a {

        /* renamed from: a */
        public static final DiscoverApiNew f97592a;

        /* renamed from: b */
        static final /* synthetic */ C41838a f97593b = new C41838a();

        private C41838a() {
        }

        static {
            Covode.recordClassIndex(49755);
            Object a = RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28825a((AbstractC22021a) new DiscoveryTimeGapInterceptor()).mo28832d().mo28858a(DiscoverApiNew.class);
            C89219l.m154716b(a, "");
            f97592a = (DiscoverApiNew) a;
        }
    }
}
