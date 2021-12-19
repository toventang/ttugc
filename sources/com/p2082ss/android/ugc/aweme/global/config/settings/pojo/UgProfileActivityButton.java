package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgProfileActivityButton */
public class UgProfileActivityButton {
    @AbstractC27891c(mo46611a = "h5_link")
    private String h5Link;
    @AbstractC27891c(mo46611a = "activity_id")

    /* renamed from: id */
    private String f121693id;
    @AbstractC27891c(mo46611a = StringSet.name)
    private String name;
    @AbstractC27891c(mo46611a = "resource_url")
    private UrlModel resourceUrl;
    @AbstractC27891c(mo46611a = "show_scenery")
    private Integer showScenery;
    @AbstractC27891c(mo46611a = "tab_bubble_text")
    private String tabBubbleText;
    @AbstractC27891c(mo46611a = "time_limit")
    private Integer timeLimit;

    static {
        Covode.recordClassIndex(62412);
    }

    public String getH5Link() {
        return this.h5Link;
    }

    public UrlModel getResourceUrl() {
        return this.resourceUrl;
    }

    public String getId() {
        String str = this.f121693id;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public String getName() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public Integer getShowScenery() {
        Integer num = this.showScenery;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public String getTabBubbleText() {
        String str = this.tabBubbleText;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public Integer getTimeLimit() {
        Integer num = this.timeLimit;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public void setId(String str) {
        this.f121693id = str;
    }
}
