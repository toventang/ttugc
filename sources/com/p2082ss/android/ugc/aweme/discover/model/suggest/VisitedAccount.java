package com.p2082ss.android.ugc.aweme.discover.model.suggest;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.suggest.VisitedAccount */
public final class VisitedAccount implements Serializable {
    @AbstractC27891c(mo46611a = "avatar_url")
    private UrlModel avatarUrl;
    @AbstractC27891c(mo46611a = "custom_verify")
    private String customVerify;
    @AbstractC27891c(mo46611a = "enterprise_verify_reason")
    private String enterpriseVerifyReason;
    @AbstractC27891c(mo46611a = "nickname")
    private String nickname;
    @AbstractC27891c(mo46611a = "follow_status")
    private String relationShip;
    @AbstractC27891c(mo46611a = "sec_uid")
    private String secUid;
    @AbstractC27891c(mo46611a = "uid")
    private String uid;

    static {
        Covode.recordClassIndex(50548);
    }

    public final UrlModel getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getCustomVerify() {
        return this.customVerify;
    }

    public final String getEnterpriseVerifyReason() {
        return this.enterpriseVerifyReason;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getRelationShip() {
        return this.relationShip;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setAvatarUrl(UrlModel urlModel) {
        this.avatarUrl = urlModel;
    }

    public final void setCustomVerify(String str) {
        this.customVerify = str;
    }

    public final void setEnterpriseVerifyReason(String str) {
        this.enterpriseVerifyReason = str;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final void setRelationShip(String str) {
        this.relationShip = str;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setUid(String str) {
        this.uid = str;
    }
}
