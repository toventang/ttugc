package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.profile.model.TagBAUser;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.BAInfos */
public final class BAInfos implements Serializable {
    @AbstractC27891c(mo46611a = "ba_infos")
    private final List<TagBAUser> baInfos;
    @AbstractC27891c(mo46611a = "status_code")
    private final int statusCode;
    @AbstractC27891c(mo46611a = "status_msg")
    private String statusMsg;

    static {
        Covode.recordClassIndex(58650);
    }

    public final List<TagBAUser> getBaInfos() {
        return this.baInfos;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}
