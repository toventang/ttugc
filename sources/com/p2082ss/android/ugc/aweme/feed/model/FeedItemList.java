package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d;
import com.p2082ss.android.ugc.aweme.app.api.p2320c.AbstractC33622e;
import com.p2082ss.android.ugc.aweme.commercialize.feed.timegap.C37992c;
import com.p2082ss.ugc.aweme.proto.aweme_v2_feed_response;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89086z;

/* renamed from: com.ss.android.ugc.aweme.feed.model.FeedItemList */
public class FeedItemList implements AbstractC33622e, AbstractC33623d, IFeedItemList {
    public volatile boolean appendCache;
    @AbstractC27891c(mo46611a = "aweme_acl")
    public AwemeACLShare awemeACLShareInfo;
    @AbstractC27891c(mo46611a = "block_code")
    public int blockCode;
    @AbstractC27891c(mo46611a = "cursor")
    public long cursor;
    @AbstractC27891c(mo46611a = "disable_adjust_for_cache")
    public boolean disableAdjustForCache;
    @AbstractC27891c(mo46611a = "enable_re_rank")
    public boolean enableReRank;
    @AbstractC27891c(mo46611a = "error_code")
    public int error_code;
    @AbstractC27891c(mo46611a = "extra")
    public Extra extra;
    public int fetchType;
    @AbstractC27891c(mo46611a = "has_more")
    public int hasMore;
    @AbstractC27891c(mo46611a = "is_hiding_invalid_item")
    public int hidingInvalidItem;
    @AbstractC27891c(mo46611a = "guide_word")
    public HotSearchGuideWord hotSearchGuideWord;
    @AbstractC27891c(mo46611a = "hotsoon_text")
    public String hotSoonText;
    @AbstractC27891c(mo46611a = "hotsoon_filtered_count")
    public int hotsoonFilteredCount;
    @AbstractC27891c(mo46611a = "hotsoon_has_more")
    public int hotsoonHasMore;
    @AbstractC27891c(mo46611a = "invalid_item_count")
    public int invalidItemCount;
    @AbstractC27891c(mo46611a = "invalid_item_id_list")
    public List<String> invalidItemIdList;
    @AbstractC27891c(mo46611a = "invalid_item_text")
    public String invalidItemText;
    @AbstractC27891c(mo46611a = "is_clear_invalid_item")
    public int isClearInvalidItem;
    public boolean isFromLocalCache;
    public boolean isFromSplitData;
    public boolean isFromUnusedFeed;
    @AbstractC27891c(mo46611a = "aweme_list")
    public List<Aweme> items;
    public Map<String, String> localExtra = new HashMap();
    @AbstractC27891c(mo46611a = "log_pb")
    public LogPbBean logPb;
    @AbstractC27891c(mo46611a = "max_cursor", mo46612b = {"max_time"})
    public long maxCursor;
    @AbstractC27891c(mo46611a = "min_cursor", mo46612b = {"min_time"})
    public long minCursor;
    public transient Long networkInfoKey;
    public transient aweme_v2_feed_response pbData;
    @AbstractC27891c(mo46611a = "preload_ads")
    public List<Aweme> preloadAds;
    @AbstractC27891c(mo46611a = "refresh_clear")
    public int refreshClear;
    public volatile boolean replaceFake;
    @AbstractC27891c(mo46611a = "rid")
    public String requestId;
    @AbstractC27891c(mo46611a = "showtime_gap_rsp_info")
    public C37992c showTimeGapResponse;
    @AbstractC27891c(mo46611a = "status_code")
    public int status_code;
    @AbstractC27891c(mo46611a = "status_msg")
    public String status_msg;

    static {
        Covode.recordClassIndex(58685);
    }

    public String getIdlIdentifier() {
        return "";
    }

    public void setIdlIdentifier(String str) {
    }

    public void setReplaceFake() {
        this.replaceFake = true;
    }

    public Long getNetworkInfoKey() {
        return this.networkInfoKey;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public String getRequestId() {
        return this.requestId;
    }

    public boolean isHasMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    public boolean isRefreshClear() {
        if (this.refreshClear == 1) {
            return true;
        }
        return false;
    }

    public void resetForceAppend() {
        this.replaceFake = false;
        this.appendCache = false;
    }

    public boolean isForceAppend() {
        if (this.replaceFake || this.appendCache) {
            return true;
        }
        return false;
    }

    private boolean needSetPbToAweme() {
        List<Aweme> list = this.items;
        if (list == null || list.size() == 0 || this.items.get(0).getLogPbBean() != null) {
            return false;
        }
        return true;
    }

    public int size() {
        if (C13603b.m24435a((Collection) this.items)) {
            return 0;
        }
        return this.items.size();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.model.IFeedItemList
    public List<Aweme> getItems() {
        if (needSetPbToAweme()) {
            for (Aweme aweme : this.items) {
                aweme.setLogPbBean(this.logPb);
            }
        }
        return this.items;
    }

    public FeedItemList clone() {
        ArrayList arrayList;
        FeedItemList feedItemList = new FeedItemList();
        feedItemList.minCursor = this.minCursor;
        feedItemList.maxCursor = this.maxCursor;
        feedItemList.cursor = this.cursor;
        feedItemList.hasMore = this.hasMore;
        List<Aweme> list = this.items;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().clone());
            }
            arrayList = arrayList2;
        } else {
            arrayList = C89086z.INSTANCE;
        }
        feedItemList.items = arrayList;
        feedItemList.requestId = this.requestId;
        feedItemList.refreshClear = this.refreshClear;
        feedItemList.extra = this.extra;
        feedItemList.status_code = this.status_code;
        feedItemList.status_msg = this.status_msg;
        feedItemList.error_code = this.error_code;
        feedItemList.blockCode = this.blockCode;
        feedItemList.hotSearchGuideWord = this.hotSearchGuideWord;
        feedItemList.preloadAds = this.preloadAds;
        feedItemList.fetchType = this.fetchType;
        feedItemList.replaceFake = this.replaceFake;
        feedItemList.appendCache = this.appendCache;
        feedItemList.localExtra = this.localExtra;
        feedItemList.isFromLocalCache = this.isFromLocalCache;
        feedItemList.logPb = this.logPb;
        feedItemList.invalidItemCount = this.invalidItemCount;
        feedItemList.hidingInvalidItem = this.hidingInvalidItem;
        feedItemList.invalidItemText = this.invalidItemText;
        feedItemList.awemeACLShareInfo = this.awemeACLShareInfo;
        return feedItemList;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.p2320c.AbstractC33622e
    public void setNetworkInfoKey(Long l) {
        this.networkInfoKey = l;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setLocalExtra(String str, String str2) {
        this.localExtra.put(str, str2);
    }
}
