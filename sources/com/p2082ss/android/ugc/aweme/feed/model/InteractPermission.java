package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.InteractPermission */
public final class InteractPermission implements Serializable {
    @AbstractC27891c(mo46611a = "duet")
    public int duet;
    @AbstractC27891c(mo46611a = "duet_privacy_setting")
    public int duetPrivacySettingControl;
    @AbstractC27891c(mo46611a = "stitch")
    public int stitch;
    @AbstractC27891c(mo46611a = "stitch_privacy_setting")
    public int stitchPrivacySettingControl;
    @AbstractC27891c(mo46611a = "upvote")
    public int upvote;

    static {
        Covode.recordClassIndex(58710);
    }

    public final int getDuet() {
        return this.duet;
    }

    public final int getDuetPrivacySettingControl() {
        return this.duetPrivacySettingControl;
    }

    public final int getStitch() {
        return this.stitch;
    }

    public final int getStitchPrivacySettingControl() {
        return this.stitchPrivacySettingControl;
    }

    public final int getUpvote() {
        return this.upvote;
    }

    public final void setDuet(int i) {
        this.duet = i;
    }

    public final void setDuetPrivacySettingControl(int i) {
        this.duetPrivacySettingControl = i;
    }

    public final void setStitch(int i) {
        this.stitch = i;
    }

    public final void setStitchPrivacySettingControl(int i) {
        this.stitchPrivacySettingControl = i;
    }

    public final void setUpvote(int i) {
        this.upvote = i;
    }
}
