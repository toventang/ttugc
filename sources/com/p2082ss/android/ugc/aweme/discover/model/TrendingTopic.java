package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27890b;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import com.p2082ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.TrendingTopic */
public final class TrendingTopic extends AbstractC34479a implements LazyDeserializeItem, Serializable {
    @AbstractC27890b(mo46609a = StringJsonAdapterFactory.class)
    @AbstractC27891c(mo46611a = "ad_data")
    private final TrendingTopicsAdInfo adData;
    @AbstractC27891c(mo46611a = "creator_info")
    private final User author;
    @AbstractC27891c(mo46611a = "category_type")
    private final int categoryType;
    @AbstractC27891c(mo46611a = "challenge_info")
    private final Challenge challenge;
    @AbstractC27891c(mo46611a = "desc")
    private final String desc;
    @AbstractC27891c(mo46611a = "effect_info")
    private final C75445g effect;
    @AbstractC27891c(mo46611a = "aweme_list")
    private final List<Aweme> items;
    @AbstractC27891c(mo46611a = "music_info")
    private final Music music;
    private transient boolean needToBeSupplied;
    @AbstractC27891c(mo46611a = "word_record")
    private final Word word;

    static {
        Covode.recordClassIndex(50534);
    }

    public TrendingTopic() {
        this(0, null, null, null, null, null, null, null, null, 511, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_discover_model_TrendingTopic_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m84892x1ee3880d(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.discover.model.TrendingTopic */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrendingTopic copy$default(TrendingTopic trendingTopic, int i, List list, Challenge challenge2, Music music2, C75445g gVar, User user, String str, Word word2, TrendingTopicsAdInfo trendingTopicsAdInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = trendingTopic.categoryType;
        }
        if ((i2 & 2) != 0) {
            list = trendingTopic.items;
        }
        if ((i2 & 4) != 0) {
            challenge2 = trendingTopic.challenge;
        }
        if ((i2 & 8) != 0) {
            music2 = trendingTopic.music;
        }
        if ((i2 & 16) != 0) {
            gVar = trendingTopic.effect;
        }
        if ((i2 & 32) != 0) {
            user = trendingTopic.author;
        }
        if ((i2 & 64) != 0) {
            str = trendingTopic.desc;
        }
        if ((i2 & 128) != 0) {
            word2 = trendingTopic.word;
        }
        if ((i2 & 256) != 0) {
            trendingTopicsAdInfo = trendingTopic.adData;
        }
        return trendingTopic.copy(i, list, challenge2, music2, gVar, user, str, word2, trendingTopicsAdInfo);
    }

    public final int component1() {
        return this.categoryType;
    }

    public final List<Aweme> component2() {
        return this.items;
    }

    public final Challenge component3() {
        return this.challenge;
    }

    public final Music component4() {
        return this.music;
    }

    public final C75445g component5() {
        return this.effect;
    }

    public final User component6() {
        return this.author;
    }

    public final String component7() {
        return this.desc;
    }

    public final Word component8() {
        return this.word;
    }

    public final TrendingTopicsAdInfo component9() {
        return this.adData;
    }

    public final TrendingTopic copy(int i, List<? extends Aweme> list, Challenge challenge2, Music music2, C75445g gVar, User user, String str, Word word2, TrendingTopicsAdInfo trendingTopicsAdInfo) {
        C89219l.m154721d(str, "");
        return new TrendingTopic(i, list, challenge2, music2, gVar, user, str, word2, trendingTopicsAdInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendingTopic)) {
            return false;
        }
        TrendingTopic trendingTopic = (TrendingTopic) obj;
        return this.categoryType == trendingTopic.categoryType && C89219l.m154714a(this.items, trendingTopic.items) && C89219l.m154714a(this.challenge, trendingTopic.challenge) && C89219l.m154714a(this.music, trendingTopic.music) && C89219l.m154714a(this.effect, trendingTopic.effect) && C89219l.m154714a(this.author, trendingTopic.author) && C89219l.m154714a(this.desc, trendingTopic.desc) && C89219l.m154714a(this.word, trendingTopic.word) && C89219l.m154714a(this.adData, trendingTopic.adData);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_discover_model_TrendingTopic_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m84892x1ee3880d(this.categoryType) * 31;
        List<Aweme> list = this.items;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_discover_model_TrendingTopic_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Challenge challenge2 = this.challenge;
        int hashCode2 = (hashCode + (challenge2 != null ? challenge2.hashCode() : 0)) * 31;
        Music music2 = this.music;
        int hashCode3 = (hashCode2 + (music2 != null ? music2.hashCode() : 0)) * 31;
        C75445g gVar = this.effect;
        int hashCode4 = (hashCode3 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        User user = this.author;
        int hashCode5 = (hashCode4 + (user != null ? user.hashCode() : 0)) * 31;
        String str = this.desc;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 31;
        Word word2 = this.word;
        int hashCode7 = (hashCode6 + (word2 != null ? word2.hashCode() : 0)) * 31;
        TrendingTopicsAdInfo trendingTopicsAdInfo = this.adData;
        if (trendingTopicsAdInfo != null) {
            i = trendingTopicsAdInfo.hashCode();
        }
        return hashCode7 + i;
    }

    public final String toString() {
        return "TrendingTopic(categoryType=" + this.categoryType + ", items=" + this.items + ", challenge=" + this.challenge + ", music=" + this.music + ", effect=" + this.effect + ", author=" + this.author + ", desc=" + this.desc + ", word=" + this.word + ", adData=" + this.adData + ")";
    }

    public final TrendingTopicsAdInfo getAdData() {
        return this.adData;
    }

    public final User getAuthor() {
        return this.author;
    }

    public final int getCategoryType() {
        return this.categoryType;
    }

    public final Challenge getChallenge() {
        return this.challenge;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final C75445g getEffect() {
        return this.effect;
    }

    public final List<Aweme> getItems() {
        return this.items;
    }

    public final Music getMusic() {
        return this.music;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.LazyDeserializeItem
    public final boolean getNeedToBeSupplied() {
        return this.needToBeSupplied;
    }

    public final Word getWord() {
        return this.word;
    }

    public final boolean isAd() {
        if (this.adData != null) {
            return true;
        }
        return false;
    }

    public final boolean isChallenge() {
        if (this.challenge != null) {
            return true;
        }
        return false;
    }

    public final boolean isMusic() {
        if (this.music != null) {
            return true;
        }
        return false;
    }

    public final UrlModel getClickTrackUrlList() {
        TrendingTopicsAdInfo trendingTopicsAdInfo = this.adData;
        if (trendingTopicsAdInfo != null) {
            return trendingTopicsAdInfo.getClickTrackUrlList();
        }
        return null;
    }

    public final long getCreativeId() {
        TrendingTopicsAdInfo trendingTopicsAdInfo = this.adData;
        if (trendingTopicsAdInfo != null) {
            return trendingTopicsAdInfo.getCreativeId();
        }
        return 0;
    }

    public final String getLogExtra() {
        TrendingTopicsAdInfo trendingTopicsAdInfo = this.adData;
        if (trendingTopicsAdInfo != null) {
            return trendingTopicsAdInfo.getLogExtra();
        }
        return null;
    }

    public final UrlModel getTrackUrlList() {
        TrendingTopicsAdInfo trendingTopicsAdInfo = this.adData;
        if (trendingTopicsAdInfo != null) {
            return trendingTopicsAdInfo.getTrackUrlList();
        }
        return null;
    }

    public final boolean isChallengeAd() {
        if (!isAd() || this.challenge == null) {
            return false;
        }
        return true;
    }

    public final boolean isPicAd() {
        if (!isAd() || this.challenge != null) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.LazyDeserializeItem
    public final void setNeedToBeSupplied(boolean z) {
        this.needToBeSupplied = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    public TrendingTopic(int i, List<? extends Aweme> list, Challenge challenge2, Music music2, C75445g gVar, User user, String str, Word word2, TrendingTopicsAdInfo trendingTopicsAdInfo) {
        C89219l.m154721d(str, "");
        this.categoryType = i;
        this.items = list;
        this.challenge = challenge2;
        this.music = music2;
        this.effect = gVar;
        this.author = user;
        this.desc = str;
        this.word = word2;
        this.adData = trendingTopicsAdInfo;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TrendingTopic(int i, List list, Challenge challenge2, Music music2, C75445g gVar, User user, String str, Word word2, TrendingTopicsAdInfo trendingTopicsAdInfo, int i2, C89214g gVar2) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : challenge2, (i2 & 8) != 0 ? null : music2, (i2 & 16) != 0 ? null : gVar, (i2 & 32) != 0 ? null : user, (i2 & 64) != 0 ? "" : str, (i2 & 128) != 0 ? null : word2, (i2 & 256) == 0 ? trendingTopicsAdInfo : null);
    }
}
