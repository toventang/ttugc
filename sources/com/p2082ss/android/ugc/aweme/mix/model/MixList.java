package com.p2082ss.android.ugc.aweme.mix.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.mix.model.MixList */
public class MixList implements Serializable {
    @AbstractC27891c(mo46611a = "cursor")
    public long cursor;
    @AbstractC27891c(mo46611a = "has_more")
    public int hasMore;
    @AbstractC27891c(mo46611a = "log_pb")
    public LogPbBean logPb;
    @AbstractC27891c(mo46611a = "mix_list")
    public List<C59867d> mixList;
    @AbstractC27891c(mo46611a = "status_code")
    public int statusCode;
    @AbstractC27891c(mo46611a = "status_msg")
    public String statusMsg;

    static {
        Covode.recordClassIndex(70269);
    }
}
