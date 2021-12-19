package com.p2082ss.android.ugc.aweme.playereventreporter;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.playereventreporter.VideoInfo */
public final class VideoInfo {
    public static final C63096a Companion = new C63096a((byte) 0);
    private String access2 = "";
    private String aid = "";
    private String appId = "";
    private String appVersion = "";
    private String bitRateSet = "";
    private String carrierRegion = "";
    private String codec = "";
    private int codecId = -1;
    private String codecName = "";
    private String codecNameStr = "";
    private String contentType = "";
    private float duration;
    private int enableHwDecode = -1;
    private int encodedFrameRate = -1;
    private String enterFrom = "";
    private String feedTab = "";
    private String format = "";
    private int internetSpeed = -1;
    private int isBatterySaver = -1;
    private int isBytevc1;
    private String isFirst = "";
    private String isFromFeedCache = "";
    private int isHitCache = -1;
    private int isLogin = -1;
    private int isNewUser = -1;
    private int isPreloaded = -1;
    private String key = "";
    private long playBitrate = -1;
    private int playOrder = -1;
    private int preCacheSize = -1;
    private String priorityRegion = "";
    private String ptPredictL = "";
    private String requestId = "";
    private String topActivity = "";
    private String url = "";
    private long videoBitrate = -1;
    private int videoQuality = -1;
    private long videoSize;

    static {
        Covode.recordClassIndex(73936);
    }

    public final void copyFrom(VideoInfo videoInfo) {
    }

    /* renamed from: com.ss.android.ugc.aweme.playereventreporter.VideoInfo$a */
    public static final class C63096a {
        static {
            Covode.recordClassIndex(73937);
        }

        private C63096a() {
        }

        public /* synthetic */ C63096a(byte b) {
            this();
        }
    }

    public final String getAccess2() {
        return this.access2;
    }

    public final String getAid() {
        return this.aid;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getBitRateSet() {
        return this.bitRateSet;
    }

    public final String getCarrierRegion() {
        return this.carrierRegion;
    }

    public final String getCodec() {
        return this.codec;
    }

    public final int getCodecId() {
        return this.codecId;
    }

    public final String getCodecName() {
        return this.codecName;
    }

    public final String getCodecNameStr() {
        return this.codecNameStr;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final float getDuration() {
        return this.duration;
    }

    public final int getEnableHwDecode() {
        return this.enableHwDecode;
    }

    public final int getEncodedFrameRate() {
        return this.encodedFrameRate;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getFeedTab() {
        return this.feedTab;
    }

    public final String getFormat() {
        return this.format;
    }

    public final int getInternetSpeed() {
        return this.internetSpeed;
    }

    public final String getKey() {
        return this.key;
    }

    public final long getPlayBitrate() {
        return this.playBitrate;
    }

    public final int getPlayOrder() {
        return this.playOrder;
    }

    public final int getPreCacheSize() {
        return this.preCacheSize;
    }

    public final String getPriorityRegion() {
        return this.priorityRegion;
    }

    public final String getPtPredictL() {
        return this.ptPredictL;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getTopActivity() {
        return this.topActivity;
    }

    public final String getUrl() {
        return this.url;
    }

    public final long getVideoBitrate() {
        return this.videoBitrate;
    }

    public final int getVideoQuality() {
        return this.videoQuality;
    }

    public final long getVideoSize() {
        return this.videoSize;
    }

    public final int isBatterySaver() {
        return this.isBatterySaver;
    }

    public final int isBytevc1() {
        return this.isBytevc1;
    }

    public final String isFirst() {
        return this.isFirst;
    }

    public final String isFromFeedCache() {
        return this.isFromFeedCache;
    }

    public final int isHitCache() {
        return this.isHitCache;
    }

    public final int isLogin() {
        return this.isLogin;
    }

    public final int isNewUser() {
        return this.isNewUser;
    }

    public final int isPreloaded() {
        return this.isPreloaded;
    }

    public final String toString() {
        return "VideoInfo(key=" + this.key + ", url=" + this.url + ", requestId=" + this.requestId + ", duration=" + this.duration + ", isNewUser=" + this.isNewUser + ", isBytevc1=" + this.isBytevc1 + ", encodedFrameRate=" + this.encodedFrameRate + ", appId=" + this.appId + ", appVersion=" + this.appVersion + ", codecName=" + this.codecName + ", codecNameStr=" + this.codecNameStr + ',' + "contentType=" + this.contentType + ", codec=" + this.codec + ", internetSpeed=" + this.internetSpeed + ", aid=" + this.aid + ", isBatterySaver=" + this.isBatterySaver + ", videoQuality=" + this.videoQuality + ", bitRateSet=" + this.bitRateSet + ", playOrder=" + this.playOrder + ", enableHwDecode=" + this.enableHwDecode + ", videoBitrate=" + this.videoBitrate + ", playBitrate=" + this.playBitrate + ", isPreloaded=" + this.isPreloaded + ", priorityRegion='" + this.priorityRegion + "', carrierRegion='" + this.carrierRegion + "', enterFrom=" + this.enterFrom + ", format='" + this.format + "', isLogin=" + this.isLogin + ')';
    }

    public final void setAccess2(String str) {
        this.access2 = str;
    }

    public final void setAid(String str) {
        this.aid = str;
    }

    public final void setAppId(String str) {
        this.appId = str;
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final void setBatterySaver(int i) {
        this.isBatterySaver = i;
    }

    public final void setBitRateSet(String str) {
        this.bitRateSet = str;
    }

    public final void setBytevc1(int i) {
        this.isBytevc1 = i;
    }

    public final void setCodec(String str) {
        this.codec = str;
    }

    public final void setCodecId(int i) {
        this.codecId = i;
    }

    public final void setCodecName(String str) {
        this.codecName = str;
    }

    public final void setCodecNameStr(String str) {
        this.codecNameStr = str;
    }

    public final void setContentType(String str) {
        this.contentType = str;
    }

    public final void setDuration(float f) {
        this.duration = f;
    }

    public final void setEnableHwDecode(int i) {
        this.enableHwDecode = i;
    }

    public final void setEncodedFrameRate(int i) {
        this.encodedFrameRate = i;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setFeedTab(String str) {
        this.feedTab = str;
    }

    public final void setFirst(String str) {
        this.isFirst = str;
    }

    public final void setFormat(String str) {
        this.format = str;
    }

    public final void setFromFeedCache(String str) {
        this.isFromFeedCache = str;
    }

    public final void setHitCache(int i) {
        this.isHitCache = i;
    }

    public final void setInternetSpeed(int i) {
        this.internetSpeed = i;
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setLogin(int i) {
        this.isLogin = i;
    }

    public final void setNewUser(int i) {
        this.isNewUser = i;
    }

    public final void setPlayBitrate(long j) {
        this.playBitrate = j;
    }

    public final void setPlayOrder(int i) {
        this.playOrder = i;
    }

    public final void setPreCacheSize(int i) {
        this.preCacheSize = i;
    }

    public final void setPreloaded(int i) {
        this.isPreloaded = i;
    }

    public final void setPtPredictL(String str) {
        this.ptPredictL = str;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public final void setTopActivity(String str) {
        this.topActivity = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setVideoBitrate(long j) {
        this.videoBitrate = j;
    }

    public final void setVideoQuality(int i) {
        this.videoQuality = i;
    }

    public final void setVideoSize(long j) {
        this.videoSize = j;
    }

    public final void setCarrierRegion(String str) {
        C89219l.m154719c(str, "");
        this.carrierRegion = str;
    }

    public final void setPriorityRegion(String str) {
        C89219l.m154719c(str, "");
        this.priorityRegion = str;
    }

    public final VideoInfo clone(VideoInfo videoInfo) {
        if (videoInfo == null) {
            return null;
        }
        VideoInfo videoInfo2 = new VideoInfo();
        videoInfo2.key = videoInfo.key;
        videoInfo2.url = videoInfo.url;
        videoInfo2.requestId = videoInfo.requestId;
        videoInfo2.duration = videoInfo.duration;
        videoInfo2.videoSize = videoInfo.videoSize;
        videoInfo2.isNewUser = videoInfo.isNewUser;
        videoInfo2.isBytevc1 = videoInfo.isBytevc1;
        videoInfo2.encodedFrameRate = videoInfo.encodedFrameRate;
        videoInfo2.appId = videoInfo.appId;
        videoInfo2.appVersion = videoInfo.appVersion;
        videoInfo2.codecName = videoInfo.codecName;
        videoInfo2.codecNameStr = videoInfo.codecNameStr;
        videoInfo2.contentType = videoInfo.contentType;
        videoInfo2.codec = videoInfo.codec;
        videoInfo2.internetSpeed = videoInfo.internetSpeed;
        videoInfo2.aid = videoInfo.aid;
        videoInfo2.isBatterySaver = videoInfo.isBatterySaver;
        videoInfo2.videoQuality = videoInfo.videoQuality;
        videoInfo2.bitRateSet = videoInfo.bitRateSet;
        videoInfo2.playOrder = videoInfo.playOrder;
        videoInfo2.enableHwDecode = videoInfo.enableHwDecode;
        videoInfo2.videoBitrate = videoInfo.videoBitrate;
        videoInfo2.playBitrate = videoInfo.playBitrate;
        videoInfo2.isPreloaded = videoInfo.isPreloaded;
        videoInfo2.priorityRegion = videoInfo.priorityRegion;
        videoInfo2.carrierRegion = videoInfo.carrierRegion;
        videoInfo2.enterFrom = videoInfo.enterFrom;
        videoInfo2.format = videoInfo.format;
        videoInfo2.isLogin = videoInfo.isLogin;
        videoInfo2.preCacheSize = videoInfo.preCacheSize;
        return new VideoInfo();
    }
}
