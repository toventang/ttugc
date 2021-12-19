package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityIcon */
public class UgProfileActivityIcon {
    @AbstractC27891c(mo46611a = "icon_url")
    private UrlModel iconUrl;
    @AbstractC27891c(mo46611a = "profile_activity_button_list")
    private List<UgProfileActivityButton> profileActivityButtonList;

    static {
        Covode.recordClassIndex(62413);
    }

    public UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public List<UgProfileActivityButton> getProfileActivityButtonList() {
        return this.profileActivityButtonList;
    }
}
