package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgFeedBottomNoticeBar */
public class UgFeedBottomNoticeBar {
    @AbstractC27891c(mo46611a = "hashtag_ids")
    private List<String> hashTagIds;
    @AbstractC27891c(mo46611a = "icon")
    private String icon;
    @AbstractC27891c(mo46611a = "jump_link")
    private String jumpLink;
    @AbstractC27891c(mo46611a = "text")
    private String text;

    static {
        Covode.recordClassIndex(62407);
    }

    public List<String> getHashTagIds() {
        return this.hashTagIds;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getJumpLink() {
        return this.jumpLink;
    }

    public String getText() {
        return this.text;
    }

    public void setHashTagIds(List<String> list) {
        this.hashTagIds = list;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setJumpLink(String str) {
        this.jumpLink = str;
    }

    public void setText(String str) {
        this.text = str;
    }
}
