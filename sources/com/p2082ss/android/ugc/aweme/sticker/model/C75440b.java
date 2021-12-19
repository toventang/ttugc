package com.p2082ss.android.ugc.aweme.sticker.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.sticker.model.b */
public final class C75440b extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "challenge_id")

    /* renamed from: a */
    private final String f169528a = "";
    @AbstractC27891c(mo46611a = "challenge_name")

    /* renamed from: b */
    private final String f169529b = "";
    @AbstractC27891c(mo46611a = "profile_image")

    /* renamed from: c */
    private final String f169530c = "";
    @AbstractC27891c(mo46611a = "guide_desc")

    /* renamed from: d */
    private final String f169531d = "";
    @AbstractC27891c(mo46611a = "open_url")

    /* renamed from: e */
    private final String f169532e = "";

    static {
        Covode.recordClassIndex(88361);
    }

    public final String getChallengeId() {
        return this.f169528a;
    }

    public final String getChallengeName() {
        return this.f169529b;
    }

    public final String getGuideDesc() {
        return this.f169531d;
    }

    public final String getOpenUrl() {
        return this.f169532e;
    }

    public final String getProfileImage() {
        return this.f169530c;
    }
}
