package com.p2082ss.android.ugc.aweme.feed.model;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc;
import com.p2082ss.android.ugc.aweme.commercialize.p2571j.AbstractC38029b;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50087aw;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.model.VideoItemParams */
public class VideoItemParams {
    public String adapterType;
    public int currentPosition;
    public DataCenter dataCenter;
    public Fragment fragment;
    public boolean isFromPostList;
    public boolean isMyProfile;
    public AbstractC38029b mAdOpenCallBack;
    public Aweme mAweme;
    public int mAwemeFromPage;
    public volatile String mEnterMethodValue;
    public volatile String mEventType;
    public volatile int mPageType;
    public volatile JSONObject mRequestId;
    public Aweme mWidgetAweme;
    public String trackerData;
    public AbstractC50087aw videoDescViewHost;

    static {
        Covode.recordClassIndex(58773);
    }

    public static VideoItemParams newBuilder() {
        return new VideoItemParams();
    }

    public VideoItemParams setAdOpenCallBack(AbstractC38029b bVar) {
        this.mAdOpenCallBack = bVar;
        return this;
    }

    public VideoItemParams setAweme(Aweme aweme) {
        this.mAweme = aweme;
        return this;
    }

    public VideoItemParams setAwemeFromPage(int i) {
        this.mAwemeFromPage = i;
        return this;
    }

    public VideoItemParams setDataCenter(DataCenter dataCenter2) {
        this.dataCenter = dataCenter2;
        return this;
    }

    public VideoItemParams setEnterMethodValue(String str) {
        this.mEnterMethodValue = str;
        return this;
    }

    public VideoItemParams setEventType(String str) {
        this.mEventType = str;
        return this;
    }

    public VideoItemParams setFragment(Fragment fragment2) {
        this.fragment = fragment2;
        return this;
    }

    public VideoItemParams setFromPostList(boolean z) {
        this.isFromPostList = z;
        return this;
    }

    public VideoItemParams setMyProfile(boolean z) {
        this.isMyProfile = z;
        return this;
    }

    public VideoItemParams setPageType(int i) {
        this.mPageType = i;
        return this;
    }

    public VideoItemParams setRequestId(JSONObject jSONObject) {
        this.mRequestId = jSONObject;
        return this;
    }

    public VideoItemParams setVideoDescViewHost(AbstractC50087aw awVar) {
        this.videoDescViewHost = awVar;
        return this;
    }

    public VideoItemParams setwidgetAweme(Aweme aweme) {
        this.mWidgetAweme = aweme;
        return this;
    }

    public static VideoItemParams newBuilder(BaseFeedPageParams baseFeedPageParams, AbstractC37879bc bcVar, Fragment fragment2, String str, DataCenter dataCenter2, AbstractC50087aw awVar) {
        VideoItemParams awemeFromPage = new VideoItemParams().setEventType(baseFeedPageParams.eventType).setMyProfile(baseFeedPageParams.isMyProfile).setPageType(baseFeedPageParams.pageType).setFromPostList(baseFeedPageParams.isFromPostList).setFragment(fragment2).setEnterMethodValue(str).setDataCenter(dataCenter2).setVideoDescViewHost(awVar).setAwemeFromPage(baseFeedPageParams.awemeFromPage);
        if (baseFeedPageParams.eventType == null) {
            C22708a.m42800a("event type null ");
        }
        if (baseFeedPageParams.param != null) {
            awemeFromPage.trackerData = baseFeedPageParams.param.getTracker();
        }
        if (bcVar != null) {
            awemeFromPage.setAdOpenCallBack(bcVar.mo65977j());
        }
        return awemeFromPage;
    }
}
