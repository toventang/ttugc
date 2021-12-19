package com.p2082ss.android.ugc.aweme.discover.repo.fetcher;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.Banner;
import com.p2082ss.android.ugc.aweme.discover.model.BannerList;
import com.p2082ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.a */
public final class C42503a {

    /* renamed from: a */
    public static final C42503a f99107a = new C42503a();

    private C42503a() {
    }

    static {
        Covode.recordClassIndex(50592);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.a$b */
    static final class C42505b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C42505b f99109a = new C42505b();

        static {
            Covode.recordClassIndex(50594);
        }

        C42505b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            C89219l.m154721d(list, "");
            return new DiscoverSectionItem.BannerSection(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.fetcher.a$a */
    static final class C42504a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C42504a f99108a = new C42504a();

        static {
            Covode.recordClassIndex(50593);
        }

        C42504a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            String str;
            BannerList bannerList = (BannerList) obj;
            C89219l.m154721d(bannerList, "");
            LogPbBean logPbBean = bannerList.logPb;
            if (logPbBean != null) {
                str = logPbBean.getImprId();
            } else {
                str = null;
            }
            for (Banner banner : bannerList.items) {
                banner.setRequestId(str);
            }
            return AbstractC88403ab.m153602a(bannerList.items);
        }
    }
}
