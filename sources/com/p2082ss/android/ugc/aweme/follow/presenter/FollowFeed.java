package com.p2082ss.android.ugc.aweme.follow.presenter;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import com.p2082ss.android.ugc.aweme.follow.C51065a;
import com.p2082ss.android.ugc.aweme.newfollow.p3505b.AbstractC61496a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.follow.presenter.FollowFeed */
public class FollowFeed extends AbstractC61496a {
    @AbstractC27891c(mo46611a = "aweme")
    private Aweme aweme;
    private long blockFavoriteTime;
    @AbstractC27891c(mo46611a = "comment_list")
    private List<Comment> commentList;
    private List<String> favoriteIds;
    @AbstractC27891c(mo46611a = "favorite_list")
    private List<Aweme> favorites;
    @AbstractC27891c(mo46611a = "feed_type")
    private int feedType;
    private C51065a lastViewData;
    @AbstractC27891c(mo46611a = "count")
    private int likeCount;
    @AbstractC27891c(mo46611a = "like_list")
    private List<User> likeList;
    private boolean mIsMomentStyle;
    private User mRecommendUser;
    @AbstractC27891c(mo46611a = "recommend_reason")
    private String recommendReason;
    @AbstractC27891c(mo46611a = "cell_room")
    private RoomFeedCellStruct roomStruct;
    @AbstractC27891c(mo46611a = "user")
    private List<User> user;

    static {
        Covode.recordClassIndex(60270);
    }

    @Override // com.p2082ss.android.ugc.aweme.newfollow.p3505b.AbstractC61496a
    public boolean needUpdateComment() {
        return true;
    }

    public FollowFeed() {
    }

    @Override // com.p2082ss.android.ugc.aweme.newfollow.p3505b.AbstractC61496a
    public Aweme getAweme() {
        return this.aweme;
    }

    public long getBlockFavoriteTime() {
        return this.blockFavoriteTime;
    }

    public List<String> getFavoriteIds() {
        return this.favoriteIds;
    }

    public List<Aweme> getFavorites() {
        return this.favorites;
    }

    public C51065a getLastViewData() {
        return this.lastViewData;
    }

    public int getLikeCount() {
        return this.likeCount;
    }

    @Override // com.p2082ss.android.ugc.aweme.newfollow.p3505b.AbstractC61496a
    public List<User> getLikeList() {
        return this.likeList;
    }

    public String getRecommendReason() {
        return this.recommendReason;
    }

    public User getRecommendUser() {
        return this.mRecommendUser;
    }

    public RoomFeedCellStruct getRoomStruct() {
        return this.roomStruct;
    }

    public List<User> getUser() {
        return this.user;
    }

    public boolean isMomentStyle() {
        return this.mIsMomentStyle;
    }

    @Override // com.p2082ss.android.ugc.aweme.newfollow.p3505b.AbstractC61496a
    public List<Comment> getCommentList() {
        Aweme aweme2;
        if (this.commentList == null || (aweme2 = this.aweme) == null || !aweme2.getAwemeControl().canShowComment()) {
            this.commentList = new ArrayList();
        }
        return this.commentList;
    }

    @Override // com.p2082ss.android.ugc.aweme.newfollow.p3505b.AbstractC61496a
    public int getFeedType() {
        int i = this.feedType;
        if (i == -1) {
            return 65288;
        }
        if (i == 1) {
            return 65280;
        }
        if (i == 2) {
            return 65281;
        }
        if (i != 3) {
            return i;
        }
        return 65298;
    }

    @Override // com.p2082ss.android.ugc.aweme.newfollow.p3505b.AbstractC61496a
    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setBlockFavoriteTime(long j) {
        this.blockFavoriteTime = j;
    }

    public void setFavoriteIds(List<String> list) {
        this.favoriteIds = list;
    }

    public void setFavorites(List<Aweme> list) {
        this.favorites = list;
    }

    @Override // com.p2082ss.android.ugc.aweme.newfollow.p3505b.AbstractC61496a
    public void setFeedType(int i) {
        this.feedType = i;
    }

    public void setIsMomentStyle(boolean z) {
        this.mIsMomentStyle = z;
    }

    public void setLastViewData(C51065a aVar) {
        this.lastViewData = aVar;
    }

    public void setLikeCount(int i) {
        this.likeCount = i;
    }

    public void setLikeList(List<User> list) {
        this.likeList = list;
    }

    public void setRecommendReason(String str) {
        this.recommendReason = str;
    }

    public void setRecommendUser(User user2) {
        this.mRecommendUser = user2;
    }

    public void setRoomStruct(RoomFeedCellStruct roomFeedCellStruct) {
        this.roomStruct = roomFeedCellStruct;
    }

    public void setUser(List<User> list) {
        this.user = list;
    }

    public static FollowFeed createLastWatchHistoryItem(C51065a aVar) {
        FollowFeed followFeed = new FollowFeed();
        followFeed.setFeedType(65297);
        followFeed.setLastViewData(aVar);
        return followFeed;
    }

    @Override // com.p2082ss.android.ugc.aweme.newfollow.p3505b.AbstractC61496a
    public void setCommentList(List<Comment> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.commentList = list;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d, com.p2082ss.android.ugc.aweme.newfollow.p3505b.AbstractC61496a
    public void setRequestId(String str) {
        super.setRequestId(str);
        Aweme aweme2 = this.aweme;
        if (aweme2 != null) {
            aweme2.setRequestId(str);
        }
    }

    public FollowFeed(Aweme aweme2) {
        this.feedType = 65280;
        this.aweme = aweme2;
        this.commentList = new ArrayList();
    }
}
