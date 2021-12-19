package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.feed.model.HotSearchInfo */
public final class HotSearchInfo implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static final long serialVersionUID = 4;
    @AbstractC27891c(mo46611a = "challenge_id")
    public String challengeId;
    @AbstractC27891c(mo46611a = "group_id")

    /* renamed from: id */
    public String f114478id;
    @AbstractC27891c(mo46611a = "label")
    public int label;
    @AbstractC27891c(mo46611a = "rank")
    public int rank;
    @AbstractC27891c(mo46611a = "search_word")
    public String searchWord;
    @AbstractC27891c(mo46611a = "sentence")
    public String sentence;
    @AbstractC27891c(mo46611a = "value")
    public long value;
    @AbstractC27891c(mo46611a = "vb_rank")
    public int videoRank;
    @AbstractC27891c(mo46611a = "vb_rank_value")
    public long videoRankVV;

    static {
        Covode.recordClassIndex(58704);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.model.HotSearchInfo$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(58705);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public final String getChallengeId() {
        return this.challengeId;
    }

    public final String getId() {
        return this.f114478id;
    }

    public final int getLabel() {
        return this.label;
    }

    public final int getRank() {
        return this.rank;
    }

    public final String getSearchWord() {
        return this.searchWord;
    }

    public final String getSentence() {
        return this.sentence;
    }

    public final long getValue() {
        return this.value;
    }

    public final int getVideoRank() {
        return this.videoRank;
    }

    public final long getVideoRankVV() {
        return this.videoRankVV;
    }

    public final void setChallengeId(String str) {
        this.challengeId = str;
    }

    public final void setSearchWord(String str) {
        this.searchWord = str;
    }

    public final void setSentence(String str) {
        this.sentence = str;
    }

    public final void setValue(long j) {
        this.value = j;
    }

    public final void setVideoRank(int i) {
        this.videoRank = i;
    }

    public final void setVideoRankVV(long j) {
        this.videoRankVV = j;
    }
}
