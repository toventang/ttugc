package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.FriendList */
public class FriendList<T extends User> extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "cursor")
    int cursor;
    @AbstractC27891c(mo46611a = "social_users", mo46612b = {"user_list"})
    List<T> friends;
    @AbstractC27891c(mo46611a = "has_more")
    boolean hasMore;
    @AbstractC27891c(mo46611a = "log_pb")
    LogPbBean logPbBean;
    @AbstractC27891c(mo46611a = "register_count")
    int registerCount;
    @AbstractC27891c(mo46611a = "total_count")
    int total;
    @AbstractC27891c(mo46611a = StringSet.type)
    int type;
    @AbstractC27891c(mo46611a = "unregistered_user")
    List<UnRegisteredUser> unregisteredUser;

    static {
        Covode.recordClassIndex(60889);
    }

    public int getCursor() {
        return this.cursor;
    }

    public List<T> getFriends() {
        return this.friends;
    }

    public LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    public int getRegisterCount() {
        return this.registerCount;
    }

    public int getTotalCount() {
        return this.total;
    }

    public int getType() {
        return this.type;
    }

    public List<UnRegisteredUser> getUnregisteredUser() {
        return this.unregisteredUser;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setCursor(int i) {
        this.cursor = i;
    }

    public void setFriends(List<T> list) {
        this.friends = list;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setLogPbBean(LogPbBean logPbBean2) {
        this.logPbBean = logPbBean2;
    }

    public void setRegisterCount(int i) {
        this.registerCount = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUnregisteredUser(List<UnRegisteredUser> list) {
        this.unregisteredUser = list;
    }
}
