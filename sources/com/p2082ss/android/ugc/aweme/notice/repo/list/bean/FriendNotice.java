package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.FriendNotice */
public class FriendNotice {
    @AbstractC27891c(mo46611a = "content")
    private String content;
    @AbstractC27891c(mo46611a = "schema_url")
    private String openUrl;
    @AbstractC27891c(mo46611a = StringSet.type)
    private int type;
    @AbstractC27891c(mo46611a = "from_user")
    private User user;

    static {
        Covode.recordClassIndex(72338);
    }

    public String getContent() {
        return this.content;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public int getType() {
        return this.type;
    }

    public User getUser() {
        return this.user;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
