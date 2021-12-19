package com.p2082ss.android.ugc.aweme.discover.model;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.TrendingTopicOrAd */
public final class TrendingTopicOrAd implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 42;

    /* renamed from: ad */
    private final TrendingTopicsAdInfo f99017ad;
    public final TrendingTopic topic;

    static {
        Covode.recordClassIndex(50536);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.model.TrendingTopicOrAd$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(50537);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public final TrendingTopicsAdInfo getAd() {
        return this.f99017ad;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean isAd() {
        if (this.f99017ad != null) {
            return true;
        }
        return false;
    }

    public final boolean isTopic() {
        if (this.topic != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        Long l;
        if (isAd()) {
            Object[] objArr = new Object[1];
            TrendingTopicsAdInfo trendingTopicsAdInfo = this.f99017ad;
            if (trendingTopicsAdInfo != null) {
                l = Long.valueOf(trendingTopicsAdInfo.getAdId());
            } else {
                l = null;
            }
            objArr[0] = l;
            String a = C1764a.m5928a("TrendingTopicOrAd[Ad %d]", Arrays.copyOf(objArr, 1));
            C89219l.m154716b(a, "");
            return a;
        }
        TrendingTopic trendingTopic = this.topic;
        if (trendingTopic == null) {
            C89219l.m154715b();
        }
        if (trendingTopic.getChallenge() != null) {
            Object[] objArr2 = new Object[1];
            Challenge challenge = this.topic.getChallenge();
            if (challenge == null) {
                C89219l.m154715b();
            }
            objArr2[0] = challenge.getDesc();
            String a2 = C1764a.m5928a("TrendingTopicOrAd[Category.challenge %s]", Arrays.copyOf(objArr2, 1));
            C89219l.m154716b(a2, "");
            return a2;
        } else if (this.topic.getMusic() != null) {
            String a3 = C1764a.m5928a("TrendingTopicOrAd[Category.music %s]", Arrays.copyOf(new Object[]{this.topic.getMusic().getAlbum()}, 1));
            C89219l.m154716b(a3, "");
            return a3;
        } else if (this.topic.getItems() == null) {
            return "TrendingTopicOrAd[Category.unknown]";
        } else {
            String a4 = C1764a.m5928a("TrendingTopicOrAd[Category.items %d]", Arrays.copyOf(new Object[]{Integer.valueOf(this.topic.getItems().size())}, 1));
            C89219l.m154716b(a4, "");
            return a4;
        }
    }

    public TrendingTopicOrAd(TrendingTopic trendingTopic) {
        this.topic = trendingTopic;
        this.f99017ad = null;
    }

    public TrendingTopicOrAd(TrendingTopicsAdInfo trendingTopicsAdInfo) {
        this.topic = null;
        this.f99017ad = trendingTopicsAdInfo;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TrendingTopicOrAd)) {
            return false;
        }
        if (isTopic()) {
            TrendingTopicOrAd trendingTopicOrAd = (TrendingTopicOrAd) obj;
            if (trendingTopicOrAd.isTopic()) {
                TrendingTopic trendingTopic = this.topic;
                if (trendingTopic == null) {
                    C89219l.m154715b();
                }
                if (trendingTopic.getChallenge() != null) {
                    TrendingTopic trendingTopic2 = trendingTopicOrAd.topic;
                    if (trendingTopic2 == null) {
                        C89219l.m154715b();
                    }
                    if (trendingTopic2.getChallenge() != null) {
                        Challenge challenge = this.topic.getChallenge();
                        if (challenge == null) {
                            C89219l.m154715b();
                        }
                        String cid = challenge.getCid();
                        Challenge challenge2 = trendingTopicOrAd.topic.getChallenge();
                        if (challenge2 == null) {
                            C89219l.m154715b();
                        }
                        return C89219l.m154714a((Object) cid, (Object) challenge2.getCid());
                    }
                }
                if (this.topic.getMusic() != null) {
                    TrendingTopic trendingTopic3 = trendingTopicOrAd.topic;
                    if (trendingTopic3 == null) {
                        C89219l.m154715b();
                    }
                    if (trendingTopic3.getMusic() != null) {
                        return C89219l.m154714a(this.topic.getMusic(), trendingTopicOrAd.topic.getMusic());
                    }
                }
                return false;
            }
        }
        if (isAd()) {
            TrendingTopicOrAd trendingTopicOrAd2 = (TrendingTopicOrAd) obj;
            if (trendingTopicOrAd2.isAd()) {
                return equals(this.f99017ad, trendingTopicOrAd2.f99017ad);
            }
        }
        return false;
    }

    private final boolean equals(Long l, Long l2) {
        if (l != null) {
            return C89219l.m154714a(l, l2);
        }
        if (l2 == null) {
            return true;
        }
        return false;
    }

    private final boolean equals(TrendingTopicsAdInfo trendingTopicsAdInfo, TrendingTopicsAdInfo trendingTopicsAdInfo2) {
        if (trendingTopicsAdInfo == trendingTopicsAdInfo2) {
            return true;
        }
        if (trendingTopicsAdInfo == null || trendingTopicsAdInfo2 == null) {
            return false;
        }
        return equals(Long.valueOf(trendingTopicsAdInfo.getAdId()), Long.valueOf(trendingTopicsAdInfo2.getAdId()));
    }
}
