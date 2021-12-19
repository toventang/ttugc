package com.p2082ss.android.ugc.aweme.profile.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendList;
import com.p2082ss.android.ugc.aweme.net.C61354g;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61504e;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.AbstractC35320a;
import com.p2082ss.android.ugc.aweme.social.api.IRecommendUserApi;
import com.p2082ss.android.ugc.aweme.social.api.RecommendUserApiService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.model.RecommendCommonUserModel */
public class RecommendCommonUserModel extends AbstractC35320a<RecommendList> {
    public boolean isNewFindFriendsPage = false;
    private final IRecommendUserApi mRecommendApi = RecommendUserApiService.f167940a;
    private HashSet<String> mShownUserIds = new HashSet<>();
    public int newUserCount;
    private List<String> userIdList;

    static {
        Covode.recordClassIndex(75203);
    }

    private int getScenarioFromRecommendType(int i) {
        if (i == 4) {
            return 1;
        }
        if (i != 13) {
            return i != 21 ? 0 : 3;
        }
        return 2;
    }

    public void resetShownUserIds() {
        this.mShownUserIds.clear();
        this.newUserCount = 0;
    }

    public void removeFollowedUser() {
        if (this.mData != null && !((RecommendList) this.mData).getUserList().isEmpty()) {
            List<User> userList = ((RecommendList) this.mData).getUserList();
            int size = userList.size();
            int i = 0;
            while (i < size) {
                if (userList.get(i).getFollowStatus() != 0) {
                    userList.remove(i);
                    size--;
                    i--;
                }
                i++;
            }
            ((RecommendList) this.mData).setUserList(userList);
        }
    }

    public void setRecommendList(RecommendList recommendList) {
        this.mQueryType = 1;
        handleData(recommendList);
    }

    public int getUserImprOrder(String str) {
        List<String> list = this.userIdList;
        if (list != null) {
            return list.indexOf(str);
        }
        return 0;
    }

    public void setData(List<User> list) {
        if (this.mData != null) {
            ((RecommendList) this.mData).setUserList(list);
        }
    }

    public void recommendUserDialogLoadMore(int i) {
        int cursor;
        if (!this.mIsLoading) {
            this.mIsLoading = true;
            this.mQueryType = 4;
            IRecommendUserApi iRecommendUserApi = this.mRecommendApi;
            Integer valueOf = Integer.valueOf(i);
            if (this.mData == null) {
                cursor = 0;
            } else {
                cursor = ((RecommendList) this.mData).getCursor();
            }
            iRecommendUserApi.fetchRecommendUserDialoList(valueOf, Integer.valueOf(cursor), C61504e.C61505a.f139616a.mo99159a()).mo5532a(new C61354g(this.mHandler));
        }
    }

    public void removeData(User user) {
        if (this.mData != null && !((RecommendList) this.mData).getUserList().isEmpty()) {
            List<User> userList = ((RecommendList) this.mData).getUserList();
            userList.remove(user);
            ((RecommendList) this.mData).setUserList(userList);
        }
    }

    /* access modifiers changed from: protected */
    public void handleData(RecommendList recommendList) {
        if (recommendList != null) {
            LogPbBean logPb = recommendList.getLogPb();
            if (!(recommendList.getUserList() == null || logPb == null)) {
                for (User user : recommendList.getUserList()) {
                    user.setRequestId(logPb.getImprId());
                }
            }
            if (this.mQueryType == 1) {
                this.newUserCount = 0;
                super.handleData((Object) recommendList);
                Iterator<User> it = recommendList.getUserList().iterator();
                while (it.hasNext()) {
                    User next = it.next();
                    if (this.mShownUserIds.contains(next.getUid())) {
                        it.remove();
                    } else {
                        this.mShownUserIds.add(next.getUid());
                    }
                }
            } else if (this.mQueryType == 4) {
                if (this.mData != null) {
                    List<User> userList = ((RecommendList) this.mData).getUserList();
                    List<User> inviterList = ((RecommendList) this.mData).getInviterList();
                    int size = userList.size();
                    for (User user2 : recommendList.getUserList()) {
                        if (!this.mShownUserIds.contains(user2.getUid())) {
                            userList.add(user2);
                            this.mShownUserIds.add(user2.getUid());
                        }
                    }
                    inviterList.addAll(recommendList.getInviterList());
                    this.newUserCount = userList.size() - size;
                    this.mData = recommendList;
                    ((RecommendList) this.mData).setUserList(userList);
                    ((RecommendList) this.mData).setInviterList(inviterList);
                } else {
                    this.mData = recommendList;
                }
            }
            List<String> list = this.userIdList;
            if (list == null) {
                this.userIdList = new ArrayList();
            } else {
                list.clear();
            }
            if (recommendList.getUserList() != null) {
                for (User user3 : recommendList.getUserList()) {
                    this.userIdList.add(user3.getUid());
                }
            }
            C48027ac.C48028a.f111257a.mo80056a(recommendList.getRid(), recommendList.getLogPb());
        }
    }

    public void loadMore(int i, String str, int i2, int i3, int i4, int i5, String str2, String str3) {
        int cursor;
        if (!this.mIsLoading) {
            this.mIsLoading = true;
            this.mQueryType = 4;
            if (this.mData == null) {
                cursor = 0;
            } else {
                cursor = ((RecommendList) this.mData).getCursor();
            }
            fetchData(i, str, cursor, i2, i3, i4, null, i5, str2, str3, false);
        }
    }

    public void fetchData(int i, String str, int i2, int i3, int i4, int i5, String str2, int i6) {
        int i7;
        if (!this.mIsLoading) {
            if (C31575b.m65865g().isUidContactPermisioned()) {
                i7 = 1;
            } else {
                i7 = 2;
            }
            this.mIsLoading = true;
            this.mQueryType = 1;
            this.mRecommendApi.recommendList(Integer.valueOf(i), (Integer) 0, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i7), C61504e.C61505a.f139616a.mo99159a(), str2, i6).mo5532a(new C61354g(this.mHandler));
        }
    }

    public void refreshRecommendUser(int i, String str, int i2, int i3, int i4, String str2, int i5, String str3, String str4, String str5, boolean z) {
        if (!this.mIsLoading) {
            this.mIsLoading = true;
            this.mQueryType = 1;
            fetchData(i, str, 0, i2, i3, i4, str2, i5, str3, str4, z);
        }
    }

    private void fetchData(int i, String str, int i2, int i3, int i4, int i5, String str2, int i6, String str3, String str4, boolean z) {
        int i7;
        if (C31575b.m65865g().isUidContactPermisioned()) {
            i7 = 1;
        } else {
            i7 = 2;
        }
        if (!TextUtils.isEmpty(str2)) {
            this.mRecommendApi.recommendList(Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3), 1, Integer.valueOf(i7), C61504e.C61505a.f139616a.mo99159a(), str2, str3, str4).mo5532a(new C61354g(this.mHandler));
        } else if (i3 == 1) {
            this.mRecommendApi.recommendListMT(Integer.valueOf(i), Integer.valueOf(i2), C61504e.C61505a.f139616a.mo99159a(), str, Integer.valueOf(getScenarioFromRecommendType(i3)), false).mo5532a(new C61354g(this.mHandler));
        } else if (i3 == 4 || i3 == 13 || i3 == 21) {
            this.mRecommendApi.recommendListMT(Integer.valueOf(i), Integer.valueOf(i2), C61504e.C61505a.f139616a.mo99159a(), str3, Integer.valueOf(getScenarioFromRecommendType(i3)), z).mo5532a(new C61354g(this.mHandler));
        } else if (3 == i3) {
            this.mRecommendApi.recommendList4NewFindFriends(Integer.valueOf(i), Integer.valueOf(i2), C61504e.C61505a.f139616a.mo99159a()).mo5532a(new C61354g(this.mHandler));
        }
    }
}
