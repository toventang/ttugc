package com.p2082ss.android.ugc.aweme.discover.adapter;

import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.Banner;
import com.p2082ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.p2082ss.android.ugc.aweme.discover.model.TrendingTopicOrAd;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import java.util.List;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.h */
public final class C41726h extends C1445j.AbstractC1451e<DiscoverSectionItem> {
    static {
        Covode.recordClassIndex(49639);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
    /* renamed from: a */
    public final /* synthetic */ boolean mo4953a(DiscoverSectionItem discoverSectionItem, DiscoverSectionItem discoverSectionItem2) {
        C89219l.m154721d(discoverSectionItem, "");
        C89219l.m154721d(discoverSectionItem2, "");
        return C89219l.m154714a(discoverSectionItem, discoverSectionItem2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
    /* renamed from: b */
    public final /* synthetic */ boolean mo4954b(DiscoverSectionItem discoverSectionItem, DiscoverSectionItem discoverSectionItem2) {
        DiscoverSectionItem discoverSectionItem3 = discoverSectionItem;
        DiscoverSectionItem discoverSectionItem4 = discoverSectionItem2;
        C89219l.m154721d(discoverSectionItem3, "");
        C89219l.m154721d(discoverSectionItem4, "");
        Object obj = null;
        if (discoverSectionItem3 instanceof DiscoverSectionItem.SuggestSearchSection) {
            SuggestWordResponse suggestWordResponse = ((DiscoverSectionItem.SuggestSearchSection) discoverSectionItem3).suggestSearch;
            if (!(discoverSectionItem4 instanceof DiscoverSectionItem.SuggestSearchSection)) {
                discoverSectionItem4 = null;
            }
            DiscoverSectionItem.SuggestSearchSection suggestSearchSection = (DiscoverSectionItem.SuggestSearchSection) discoverSectionItem4;
            if (suggestSearchSection != null) {
                obj = suggestSearchSection.suggestSearch;
            }
            return C89219l.m154714a(suggestWordResponse, obj);
        } else if (discoverSectionItem3 instanceof DiscoverSectionItem.BannerSection) {
            List<Banner> list = ((DiscoverSectionItem.BannerSection) discoverSectionItem3).bannerList;
            if (!(discoverSectionItem4 instanceof DiscoverSectionItem.BannerSection)) {
                discoverSectionItem4 = null;
            }
            DiscoverSectionItem.BannerSection bannerSection = (DiscoverSectionItem.BannerSection) discoverSectionItem4;
            if (bannerSection != null) {
                obj = bannerSection.bannerList;
            }
            return C89219l.m154714a(list, obj);
        } else if (discoverSectionItem3 instanceof DiscoverSectionItem.TrendingTopicOrAdSection) {
            TrendingTopicOrAd trendingTopicOrAd = ((DiscoverSectionItem.TrendingTopicOrAdSection) discoverSectionItem3).trendingTopicOrAd;
            if (!(discoverSectionItem4 instanceof DiscoverSectionItem.TrendingTopicOrAdSection)) {
                discoverSectionItem4 = null;
            }
            DiscoverSectionItem.TrendingTopicOrAdSection trendingTopicOrAdSection = (DiscoverSectionItem.TrendingTopicOrAdSection) discoverSectionItem4;
            if (trendingTopicOrAdSection != null) {
                obj = trendingTopicOrAdSection.trendingTopicOrAd;
            }
            return C89219l.m154714a(trendingTopicOrAd, obj);
        } else {
            throw new C89376n();
        }
    }
}
