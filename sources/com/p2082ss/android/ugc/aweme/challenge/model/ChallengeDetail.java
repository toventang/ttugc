package com.p2082ss.android.ugc.aweme.challenge.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.model.ChallengeDetail */
public class ChallengeDetail extends BaseResponse {
    @AbstractC27891c(mo46611a = "ch_info")
    public Challenge challenge;
    @AbstractC27891c(mo46611a = "dynamic_list")
    public List<ChallengeMixFeed> dynamicList;
    @AbstractC27891c(mo46611a = "log_pb")
    public LogPbBean logPb;
    @AbstractC27891c(mo46611a = "preview_status")
    public int previewStatus;
    @AbstractC27891c(mo46611a = "rec_list")
    public List<RelatedChallengeMusic> relatedChallengeMusicList;
    @AbstractC27891c(mo46611a = "slide_list")
    public List<Aweme> slideList;
    @AbstractC27891c(mo46611a = "slide_title")
    public String slideTitle;

    static {
        Covode.recordClassIndex(42734);
    }

    public ChallengeDetail setDynamicList(List<ChallengeMixFeed> list) {
        this.dynamicList = list;
        return this;
    }

    public ChallengeDetail setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
        return this;
    }
}
