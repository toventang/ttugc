package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.model.SocialDataStruct */
public final class SocialDataStruct implements Serializable {
    @AbstractC27891c(mo46611a = "social_platform_settings")
    private List<SocialPlatformSetting> socialPlatformSettings;

    static {
        Covode.recordClassIndex(75207);
    }

    public final List<SocialPlatformSetting> getSocialPlatformSettings() {
        return this.socialPlatformSettings;
    }

    public final void setSocialPlatformSettings(List<SocialPlatformSetting> list) {
        this.socialPlatformSettings = list;
    }

    public SocialDataStruct(List<SocialPlatformSetting> list) {
        this.socialPlatformSettings = list;
    }
}
