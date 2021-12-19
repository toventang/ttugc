package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.EnterpriseTab */
public class EnterpriseTab implements Serializable {
    @AbstractC27891c(mo46611a = "show_tab_settings")
    boolean showTabSettings;
    @AbstractC27891c(mo46611a = "tab_link")
    String tabLink;
    @AbstractC27891c(mo46611a = "tab_type")
    int tabType;
    @AbstractC27891c(mo46611a = "title")
    String title;

    static {
        Covode.recordClassIndex(75166);
    }

    public String getTabLink() {
        return this.tabLink;
    }

    public int getTabType() {
        return this.tabType;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isShowTabSettings() {
        return this.showTabSettings;
    }

    public void setShowTabSettings(boolean z) {
        this.showTabSettings = z;
    }

    public void setTabLink(String str) {
        this.tabLink = str;
    }

    public void setTabType(int i) {
        this.tabType = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
