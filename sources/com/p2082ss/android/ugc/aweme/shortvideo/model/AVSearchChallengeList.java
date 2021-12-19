package com.p2082ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.common.LogPbBean;
import com.p2082ss.android.ugc.aweme.shortvideo.C71852g;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList */
public class AVSearchChallengeList {
    @AbstractC27891c(mo46611a = "cursor")
    public long cursor;
    @AbstractC27891c(mo46611a = "has_more")
    public boolean hasMore;
    @AbstractC27891c(mo46611a = "keyword_disabled")
    public boolean isDisabled;
    @AbstractC27891c(mo46611a = "is_match")
    public boolean isMatch;
    @AbstractC27891c(mo46611a = "challenge_list")
    public List<C71852g> items;
    public String keyword;
    @AbstractC27891c(mo46611a = "log_pb")
    public LogPbBean logPb;
    @AbstractC27891c(mo46611a = "words_query_record")
    public RecommendWordMob recommendWordMob;

    static {
        Covode.recordClassIndex(84538);
    }
}
