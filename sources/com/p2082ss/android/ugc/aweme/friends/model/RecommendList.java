package com.p2082ss.android.ugc.aweme.friends.model;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.follow.p2997c.p2998a.p2999a.C51075a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.RecommendList */
public class RecommendList extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "cursor")
    int cursor;
    @AbstractC27891c(mo46611a = "has_more")
    boolean hasMore;
    @AbstractC27891c(mo46611a = "inviters")
    List<User> inviterList;
    @AbstractC27891c(mo46611a = "log_pb")
    LogPbBean logPb;
    @AbstractC27891c(mo46611a = "new_user_count")
    int newUserCount;
    @AbstractC27891c(mo46611a = "user_extra_list")
    List<C51075a> recommendFollowList;
    @AbstractC27891c(mo46611a = "rid")
    private String rid;
    @AbstractC27891c(mo46611a = "total")
    int totalCount;
    @AbstractC27891c(mo46611a = "user_list")
    List<User> userList;

    static {
        Covode.recordClassIndex(60912);
    }

    public int getCursor() {
        return this.cursor;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public int getNewUserCount() {
        return this.newUserCount;
    }

    public List<C51075a> getRecommendFollowList() {
        return this.recommendFollowList;
    }

    public String getRid() {
        return this.rid;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public boolean hasMore() {
        return this.hasMore;
    }

    public List<User> getInviterList() {
        if (this.inviterList == null) {
            this.inviterList = new ArrayList(0);
        }
        return this.inviterList;
    }

    public List<User> getUserList() {
        if (this.userList == null) {
            this.userList = new ArrayList(0);
        }
        return this.userList;
    }

    @Override // java.lang.Object
    public RecommendList clone() {
        RecommendList recommendList = new RecommendList();
        ArrayList arrayList = new ArrayList();
        if (!C13603b.m24435a((Collection) this.userList)) {
            for (User user : this.userList) {
                if (user != null) {
                    arrayList.add(user.clone());
                }
            }
        }
        recommendList.userList = arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (!C13603b.m24435a((Collection) this.recommendFollowList)) {
            for (C51075a aVar : this.recommendFollowList) {
                if (aVar != null) {
                    arrayList2.add(aVar.clone());
                }
            }
        }
        recommendList.recommendFollowList = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        if (!C13603b.m24435a((Collection) this.inviterList)) {
            for (User user2 : this.inviterList) {
                if (user2 != null) {
                    arrayList3.add(user2.clone());
                }
            }
        }
        recommendList.inviterList = arrayList3;
        recommendList.rid = this.rid;
        recommendList.cursor = this.cursor;
        recommendList.hasMore = this.hasMore;
        recommendList.totalCount = this.totalCount;
        recommendList.newUserCount = this.newUserCount;
        recommendList.extra = this.extra;
        recommendList.status_code = this.status_code;
        recommendList.status_msg = this.status_msg;
        recommendList.error_code = this.error_code;
        recommendList.logPb = this.logPb;
        return recommendList;
    }

    public void setCursor(int i) {
        this.cursor = i;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setInviterList(List<User> list) {
        this.inviterList = list;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setRecommendFollowList(List<C51075a> list) {
        this.recommendFollowList = list;
    }

    public void setRid(String str) {
        this.rid = str;
    }

    public void setTotalCount(int i) {
        this.totalCount = i;
    }

    public void setUserList(List<User> list) {
        this.userList = list;
    }
}
