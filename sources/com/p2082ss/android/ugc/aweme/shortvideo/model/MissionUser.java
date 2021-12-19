package com.p2082ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.MissionUser */
public final class MissionUser implements Serializable {
    @AbstractC27891c(mo46611a = "nickname")
    private String nickname;
    @AbstractC27891c(mo46611a = "sec_uid")
    private final String secUid;
    @AbstractC27891c(mo46611a = "uid")
    private final String uid;

    static {
        Covode.recordClassIndex(84596);
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }
}
