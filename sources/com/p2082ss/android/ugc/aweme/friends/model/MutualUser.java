package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.model.MutualUser */
public final class MutualUser implements Serializable {
    @AbstractC27891c(mo46611a = "avatar_medium")
    public UrlModel avatarMedium;
    @AbstractC27891c(mo46611a = "nickname")
    public String nickname;
    @AbstractC27891c(mo46611a = "sec_uid")
    public String secUid;

    static {
        Covode.recordClassIndex(60907);
    }

    public MutualUser() {
    }

    public final UrlModel getAvatarMedium() {
        return this.avatarMedium;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final int hashCode() {
        return Objects.hash(this.secUid, this.nickname);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof MutualUser)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return Objects.equals(this.secUid, this.nickname);
    }

    public MutualUser(String str, String str2, UrlModel urlModel) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.secUid = str;
        this.nickname = str2;
        this.avatarMedium = urlModel;
    }
}
