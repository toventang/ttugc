package com.p2082ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicAwemeList */
public class MusicAwemeList extends BaseResponse implements AbstractC33623d {
    @AbstractC27891c(mo46611a = "cursor")
    public long cursor;
    @AbstractC27891c(mo46611a = "has_more")
    public int hasMore;
    @AbstractC27891c(mo46611a = "aweme_list")
    public List<Aweme> items;
    @AbstractC27891c(mo46611a = "log_pb")
    public LogPbBean logPb;
    @AbstractC27891c(mo46611a = "rid")
    String requestId;

    static {
        Covode.recordClassIndex(71399);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public String getRequestId() {
        return this.requestId;
    }

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public void setRequestId(String str) {
        this.requestId = str;
    }
}
