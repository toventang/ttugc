package com.p2082ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicOwnerInfo */
public final class MusicOwnerInfo implements Serializable {
    @AbstractC27891c(mo46611a = "avatar")
    public UrlModel avatar;
    @AbstractC27891c(mo46611a = "enter_type")
    public int enterType;
    @AbstractC27891c(mo46611a = "handle")
    public String handle;
    @AbstractC27891c(mo46611a = "nick_name")
    public String nickName;
    @AbstractC27891c(mo46611a = "sec_uid")
    public String secUid;
    @AbstractC27891c(mo46611a = "uid")
    public String uid;
    @AbstractC27891c(mo46611a = "is_verified")
    public boolean verified;

    /* renamed from: com.ss.android.ugc.aweme.music.model.MusicOwnerInfo$ArtistType */
    public interface ArtistType {
        public static final Companion Companion = Companion.$$INSTANCE;

        static {
            Covode.recordClassIndex(71409);
        }

        /* renamed from: com.ss.android.ugc.aweme.music.model.MusicOwnerInfo$ArtistType$Companion */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            static {
                Covode.recordClassIndex(71410);
            }
        }
    }

    static {
        Covode.recordClassIndex(71408);
    }

    public final UrlModel getAvatar() {
        return this.avatar;
    }

    public final int getEnterType() {
        return this.enterType;
    }

    public final String getHandle() {
        return this.handle;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final boolean getVerified() {
        return this.verified;
    }

    public final void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public final void setEnterType(int i) {
        this.enterType = i;
    }

    public final void setHandle(String str) {
        this.handle = str;
    }

    public final void setNickName(String str) {
        this.nickName = str;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public final void setVerified(boolean z) {
        this.verified = z;
    }
}
