package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem */
public abstract class DiscoverSectionItem {
    static {
        Covode.recordClassIndex(50445);
    }

    private DiscoverSectionItem() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem$SuggestSearchSection */
    public static final class SuggestSearchSection extends DiscoverSectionItem {
        public SuggestWordResponse suggestSearch;

        static {
            Covode.recordClassIndex(50447);
        }

        public static /* synthetic */ SuggestSearchSection copy$default(SuggestSearchSection suggestSearchSection, SuggestWordResponse suggestWordResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                suggestWordResponse = suggestSearchSection.suggestSearch;
            }
            return suggestSearchSection.copy(suggestWordResponse);
        }

        public final SuggestSearchSection copy(SuggestWordResponse suggestWordResponse) {
            C89219l.m154721d(suggestWordResponse, "");
            return new SuggestSearchSection(suggestWordResponse);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof SuggestSearchSection) && C89219l.m154714a(this.suggestSearch, ((SuggestSearchSection) obj).suggestSearch);
            }
            return true;
        }

        public final int hashCode() {
            SuggestWordResponse suggestWordResponse = this.suggestSearch;
            if (suggestWordResponse != null) {
                return suggestWordResponse.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "SuggestSearchSection(suggestSearch=" + this.suggestSearch + ")";
        }

        public final void setSuggestSearch(SuggestWordResponse suggestWordResponse) {
            C89219l.m154721d(suggestWordResponse, "");
            this.suggestSearch = suggestWordResponse;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SuggestSearchSection(SuggestWordResponse suggestWordResponse) {
            super(null);
            C89219l.m154721d(suggestWordResponse, "");
            this.suggestSearch = suggestWordResponse;
        }
    }

    public /* synthetic */ DiscoverSectionItem(C89214g gVar) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem$BannerSection */
    public static final class BannerSection extends DiscoverSectionItem {
        public final List<Banner> bannerList;

        static {
            Covode.recordClassIndex(50446);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem$BannerSection */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ BannerSection copy$default(BannerSection bannerSection, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = bannerSection.bannerList;
            }
            return bannerSection.copy(list);
        }

        public final BannerSection copy(List<? extends Banner> list) {
            C89219l.m154721d(list, "");
            return new BannerSection(list);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof BannerSection) && C89219l.m154714a(this.bannerList, ((BannerSection) obj).bannerList);
            }
            return true;
        }

        public final int hashCode() {
            List<Banner> list = this.bannerList;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "BannerSection(bannerList=" + this.bannerList + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.discover.model.Banner> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BannerSection(List<? extends Banner> list) {
            super(null);
            C89219l.m154721d(list, "");
            this.bannerList = list;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem$TrendingTopicOrAdSection */
    public static final class TrendingTopicOrAdSection extends DiscoverSectionItem {
        public final TrendingTopicOrAd trendingTopicOrAd;

        static {
            Covode.recordClassIndex(50448);
        }

        public static /* synthetic */ TrendingTopicOrAdSection copy$default(TrendingTopicOrAdSection trendingTopicOrAdSection, TrendingTopicOrAd trendingTopicOrAd2, int i, Object obj) {
            if ((i & 1) != 0) {
                trendingTopicOrAd2 = trendingTopicOrAdSection.trendingTopicOrAd;
            }
            return trendingTopicOrAdSection.copy(trendingTopicOrAd2);
        }

        public final TrendingTopicOrAdSection copy(TrendingTopicOrAd trendingTopicOrAd2) {
            C89219l.m154721d(trendingTopicOrAd2, "");
            return new TrendingTopicOrAdSection(trendingTopicOrAd2);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof TrendingTopicOrAdSection) && C89219l.m154714a(this.trendingTopicOrAd, ((TrendingTopicOrAdSection) obj).trendingTopicOrAd);
            }
            return true;
        }

        public final int hashCode() {
            TrendingTopicOrAd trendingTopicOrAd2 = this.trendingTopicOrAd;
            if (trendingTopicOrAd2 != null) {
                return trendingTopicOrAd2.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "TrendingTopicOrAdSection(trendingTopicOrAd=" + this.trendingTopicOrAd + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TrendingTopicOrAdSection(TrendingTopicOrAd trendingTopicOrAd2) {
            super(null);
            C89219l.m154721d(trendingTopicOrAd2, "");
            this.trendingTopicOrAd = trendingTopicOrAd2;
        }
    }
}
