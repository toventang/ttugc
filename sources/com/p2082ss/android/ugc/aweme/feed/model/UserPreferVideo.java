package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;

/* renamed from: com.ss.android.ugc.aweme.feed.model.UserPreferVideo */
public class UserPreferVideo {
    @AbstractC27891c(mo46611a = "cover")
    public UrlModel cover;
    @AbstractC27891c(mo46611a = "dynamic_cover")
    public UrlModel dynamicCover;
    @AbstractC27891c(mo46611a = "gid")
    public String gid;
    @AbstractC27891c(mo46611a = "play_addr")
    public UrlModel video;

    static {
        Covode.recordClassIndex(58765);
    }

    public String toString() {
        return "UserPreferVideo{gid='" + this.gid + '\'' + ", video=" + this.video + ", cover=" + this.cover + ", dynamicCover=" + this.dynamicCover + '}';
    }
}
