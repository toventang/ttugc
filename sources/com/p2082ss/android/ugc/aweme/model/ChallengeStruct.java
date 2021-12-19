package com.p2082ss.android.ugc.aweme.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.model.ChallengeStruct */
public final class ChallengeStruct {
    @AbstractC27891c(mo46611a = "aweme_list")
    private List<? extends Aweme> awemeList;
    @AbstractC27891c(mo46611a = "challenge_info")
    private Challenge challenge;
    @AbstractC27891c(mo46611a = "cover_url")
    private List<String> coverUrlList;
    @AbstractC27891c(mo46611a = "cha_desc")
    private String desc;

    static {
        Covode.recordClassIndex(70611);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final Challenge getChallenge() {
        return this.challenge;
    }

    public final List<String> getCoverUrlList() {
        return this.coverUrlList;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final void setAwemeList(List<? extends Aweme> list) {
        this.awemeList = list;
    }

    public final void setChallenge(Challenge challenge2) {
        this.challenge = challenge2;
    }

    public final void setCoverUrlList(List<String> list) {
        this.coverUrlList = list;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public ChallengeStruct(Challenge challenge2, String str, List<String> list, List<? extends Aweme> list2) {
        this.challenge = challenge2;
        this.desc = str;
        this.coverUrlList = list;
        this.awemeList = list2;
    }
}
