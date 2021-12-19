package com.p2082ss.android.ugc.aweme.follow.presenter;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.follow.C51065a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.follow.presenter.FollowFeedList */
public class FollowFeedList extends BaseResponse implements AbstractC33623d, Cloneable {
    @AbstractC27891c(mo46611a = "blank_panel_text")
    private String blankPanelText;
    @AbstractC27891c(mo46611a = "snapshot_control")
    private int cacheControl;
    long cursor;
    @AbstractC27891c(mo46611a = "err_msg")
    private String errMsg;
    @AbstractC27891c(mo46611a = "feed_type")
    private int feedType;
    @AbstractC27891c(mo46611a = "fetch_recommend")
    private int fetchRecommend;
    @AbstractC27891c(mo46611a = "has_more")
    private int hasMore;
    @AbstractC27891c(mo46611a = "is_recommend")
    int isRecommend;
    @AbstractC27891c(mo46611a = "last_view")
    C51065a lastViewData;
    int level;
    @AbstractC27891c(mo46611a = "log_pb")
    private LogPbBean logPb;
    @AbstractC27891c(mo46611a = "data")
    private List<FollowFeed> mItems;
    @AbstractC27891c(mo46611a = "max_cursor")
    long maxCursor;
    @AbstractC27891c(mo46611a = "min_cursor")
    long minCursor;
    @AbstractC27891c(mo46611a = "need_change_snapshot")
    private int needCache;
    @AbstractC27891c(mo46611a = "need_delete_snapshot")
    private int needDeleteCache;
    @AbstractC27891c(mo46611a = "new_item_count")
    private int newItemCount;
    @AbstractC27891c(mo46611a = "new_room_count")
    private int newLiveCount;
    @AbstractC27891c(mo46611a = "rid")
    String requestId;
    @AbstractC27891c(mo46611a = "up_phone_notice")
    int upPhoneNotice;
    @AbstractC27891c(mo46611a = "update_item_count")
    private int updateItemCount;

    static {
        Covode.recordClassIndex(60271);
    }

    public String getBlankPanelText() {
        return this.blankPanelText;
    }

    public long getCursor() {
        return this.cursor;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public int getFeedType() {
        return this.feedType;
    }

    public int getFetchRecommend() {
        return this.fetchRecommend;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public int getIsRecommend() {
        return this.isRecommend;
    }

    public List<FollowFeed> getItems() {
        return this.mItems;
    }

    public C51065a getLastViewData() {
        return this.lastViewData;
    }

    public int getLevel() {
        return this.level;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public long getMaxCursor() {
        return this.maxCursor;
    }

    public long getMinCursor() {
        return this.minCursor;
    }

    public int getNewItemCount() {
        return this.newItemCount;
    }

    public int getNewLiveCount() {
        return this.newLiveCount;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public String getRequestId() {
        return this.requestId;
    }

    public int getUpPhoneNotice() {
        return this.upPhoneNotice;
    }

    public int getUpdateItemCount() {
        return this.updateItemCount;
    }

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public boolean needCache() {
        if (this.needCache == 1) {
            return true;
        }
        return false;
    }

    public boolean needDeleteCache() {
        if (this.needDeleteCache == 1) {
            return true;
        }
        return false;
    }

    public boolean needUseCache() {
        if (this.cacheControl == 1) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public FollowFeedList clone() {
        try {
            FollowFeedList followFeedList = (FollowFeedList) super.clone();
            followFeedList.errMsg = this.errMsg;
            followFeedList.hasMore = this.hasMore;
            followFeedList.minCursor = this.minCursor;
            followFeedList.maxCursor = this.maxCursor;
            followFeedList.requestId = this.requestId;
            followFeedList.mItems = (ArrayList) ((ArrayList) this.mItems).clone();
            followFeedList.fetchRecommend = this.fetchRecommend;
            followFeedList.logPb = this.logPb;
            followFeedList.cursor = this.cursor;
            followFeedList.level = this.level;
            followFeedList.lastViewData = this.lastViewData;
            followFeedList.newItemCount = this.newItemCount;
            followFeedList.newLiveCount = this.newLiveCount;
            followFeedList.feedType = this.feedType;
            followFeedList.updateItemCount = this.updateItemCount;
            followFeedList.blankPanelText = this.blankPanelText;
            return followFeedList;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setBlankPanelText(String str) {
        this.blankPanelText = str;
    }

    public void setCursor(long j) {
        this.cursor = j;
    }

    public void setErrMsg(String str) {
        this.errMsg = str;
    }

    public void setFeedType(int i) {
        this.feedType = i;
    }

    public void setFetchRecommend(int i) {
        this.fetchRecommend = i;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setIsRecommend(int i) {
        this.isRecommend = i;
    }

    public void setItems(List<FollowFeed> list) {
        this.mItems = list;
    }

    public void setLastViewData(C51065a aVar) {
        this.lastViewData = aVar;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public void setMinCursor(long j) {
        this.minCursor = j;
    }

    public void setNewItemCount(int i) {
        this.newItemCount = i;
    }

    public void setNewLiveCount(int i) {
        this.newLiveCount = i;
    }

    public void setUpPhoneNotice(int i) {
        this.upPhoneNotice = i;
    }

    public void setUpdateItemCount(int i) {
        this.updateItemCount = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public void setRequestId(String str) {
        this.requestId = str;
        for (FollowFeed followFeed : this.mItems) {
            followFeed.setRequestId(str);
        }
    }
}
