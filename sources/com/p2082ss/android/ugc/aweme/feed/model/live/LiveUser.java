package com.p2082ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.LiveUser */
public class LiveUser implements Serializable, Cloneable {
    @AbstractC27891c(mo46611a = "avatar_large")
    UrlModel avatarLarger;
    @AbstractC27891c(mo46611a = "avatar_medium")
    UrlModel avatarMedium;
    @AbstractC27891c(mo46611a = "avatar_thumb")
    UrlModel avatarThumb;
    @AbstractC27891c(mo46611a = "follow_info")
    FollowInfo followInfo;
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    long f114487id;
    @AbstractC27891c(mo46611a = "nickname")
    String nickname;
    @AbstractC27891c(mo46611a = "sec_uid")
    String secUid;
    @AbstractC27891c(mo46611a = "short_id")
    long shortId;
    @AbstractC27891c(mo46611a = "display_id")
    String uniqueId;

    static {
        Covode.recordClassIndex(58806);
    }

    public String getSecUid() {
        return this.secUid;
    }

    public void setSecUid(String str) {
        this.secUid = str;
    }
}
