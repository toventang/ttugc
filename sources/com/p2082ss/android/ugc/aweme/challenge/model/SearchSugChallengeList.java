package com.p2082ss.android.ugc.aweme.challenge.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.LogPbBean;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.model.SearchSugChallengeList */
public final class SearchSugChallengeList extends BaseResponse {
    @AbstractC27891c(mo46611a = "is_match")
    public boolean isMatch;
    @AbstractC27891c(mo46611a = "sug_list")
    public List<AVChallenge> items = new ArrayList();
    public String keyword = "";
    @AbstractC27891c(mo46611a = "log_pb")
    public LogPbBean logPb;
    @AbstractC27891c(mo46611a = "words_query_record")
    public final RecommendWordMob recommendWordMob;

    static {
        Covode.recordClassIndex(42748);
    }

    public final void setItems(List<AVChallenge> list) {
        C89219l.m154721d(list, "");
        this.items = list;
    }

    public final void setKeyword(String str) {
        C89219l.m154721d(str, "");
        this.keyword = str;
    }
}
