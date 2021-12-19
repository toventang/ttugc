package com.p2082ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.LiveStreamUrlExtra */
public class LiveStreamUrlExtra implements Serializable {
    @AbstractC27891c(mo46611a = "anchor_interact_profile")
    int anchorInteractProfile;
    @AbstractC27891c(mo46611a = "audience_interact_profile")
    int audienceInteractProfile;
    @AbstractC27891c(mo46611a = "bitrate_adapt_strategy")
    int bitrateAdaptStrategy;
    @AbstractC27891c(mo46611a = "default_bitrate")
    int defaultBitrate = 500;
    @AbstractC27891c(mo46611a = "bframe_enable")
    boolean enableBFrame = true;
    @AbstractC27891c(mo46611a = "fps")
    int fps = 15;
    @AbstractC27891c(mo46611a = "gop_sec")
    float gopSec = 2.0f;
    @AbstractC27891c(mo46611a = "hardware_encode")
    boolean hardwareEncode;
    @AbstractC27891c(mo46611a = "height")
    int height = 640;
    @AbstractC27891c(mo46611a = "roi")
    boolean isRoi;
    @AbstractC27891c(mo46611a = "sw_roi")
    boolean isSwRoi;
    @AbstractC27891c(mo46611a = "max_bitrate")
    int maxBitrate = 800;
    @AbstractC27891c(mo46611a = "min_bitrate")
    int minBitrate = 200;
    @AbstractC27891c(mo46611a = "ngb_push_url")
    String ngbPushUrl = "";
    @AbstractC27891c(mo46611a = "ngb_push_url_postfix")
    String ngbPushUrlPrefix = "";
    private int previewHeight;
    private int previewWidth;
    @AbstractC27891c(mo46611a = "video_profile")
    int profile = 1;
    @AbstractC27891c(mo46611a = "super_resolution")
    SrConfig srConfig;
    @AbstractC27891c(mo46611a = "width")
    int width = 360;

    static {
        Covode.recordClassIndex(58804);
    }

    public int getAnchorInteractProfile() {
        return this.anchorInteractProfile;
    }

    public int getAudienceInteractProfile() {
        return this.audienceInteractProfile;
    }

    public int getBitrateAdaptStrategy() {
        return this.bitrateAdaptStrategy;
    }

    public float getGopSec() {
        return this.gopSec;
    }

    public String getNgbPushUrl() {
        return this.ngbPushUrl;
    }

    public String getNgbPushUrlPrefix() {
        return this.ngbPushUrlPrefix;
    }

    public int getProfile() {
        return this.profile;
    }

    public SrConfig getSrConfig() {
        return this.srConfig;
    }

    public boolean isEnableBFrame() {
        return this.enableBFrame;
    }

    public boolean isHardwareEncode() {
        return this.hardwareEncode;
    }

    public boolean isRoi() {
        return this.isRoi;
    }

    public boolean isSwRoi() {
        return this.isSwRoi;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.model.live.LiveStreamUrlExtra$SrConfig */
    public static class SrConfig implements Serializable {
        @AbstractC27891c(mo46611a = "antialiasing")
        public boolean antiAlias;
        @AbstractC27891c(mo46611a = "enable")
        public boolean enabled;
        @AbstractC27891c(mo46611a = "strength")
        public int strength;

        static {
            Covode.recordClassIndex(58805);
        }

        public SrConfig() {
            this(false, false, 0);
        }

        public String toString() {
            return "SrConfig{enabled=" + this.enabled + ", antiAlias=" + this.antiAlias + ", strength=" + this.strength + '}';
        }

        public SrConfig(boolean z, boolean z2, int i) {
            this.enabled = z;
            this.antiAlias = z2;
            this.strength = i;
        }
    }

    public int getPreviewHeight() {
        int i = this.previewHeight;
        if (i == 0) {
            return 1280;
        }
        return i;
    }

    public int getPreviewWidth() {
        int i = this.previewWidth;
        if (i == 0) {
            return 720;
        }
        return i;
    }

    public int getDefaultBitrate() {
        if (this.defaultBitrate == 0) {
            this.defaultBitrate = 500;
        }
        return this.defaultBitrate;
    }

    public int getFPS() {
        if (this.fps == 0) {
            this.fps = 15;
        }
        return this.fps;
    }

    public int getHeight() {
        if (this.height == 0) {
            this.height = 640;
        }
        return this.height;
    }

    public int getMinBitrate() {
        if (this.minBitrate == 0) {
            this.minBitrate = 200;
        }
        return this.minBitrate;
    }

    public int getWidth() {
        if (this.width == 0) {
            this.width = 360;
        }
        return this.width;
    }

    public int getMaxBitrate() {
        if (this.maxBitrate == 0) {
            this.maxBitrate = (getDefaultBitrate() * 2) - getMinBitrate();
        }
        return this.maxBitrate;
    }

    public String toString() {
        return "LiveStreamUrlExtra{ngbPushUrl='" + this.ngbPushUrl + '\'' + ", ngbPushUrlPrefix='" + this.ngbPushUrlPrefix + '\'' + ", height=" + this.height + ", width=" + this.width + ", minBitrate=" + this.minBitrate + ", defaultBitrate=" + this.defaultBitrate + ", maxBitrate=" + this.maxBitrate + ", profile=" + this.profile + ", hardwareEncode=" + this.hardwareEncode + ", bitrateAdaptStrategy=" + this.bitrateAdaptStrategy + ", fps=" + this.fps + ", anchorInteractProfile=" + this.anchorInteractProfile + ", audienceInteractProfile=" + this.audienceInteractProfile + ", srConfig=" + this.srConfig + ", gopSec=" + this.gopSec + ", enableBFrame=" + this.enableBFrame + ", isRoi=" + this.isRoi + ", isSwRoi=" + this.isSwRoi + ", previewWidth=" + this.previewWidth + ", previewHeight=" + this.previewHeight + '}';
    }

    public void setAnchorInteractProfile(int i) {
        this.anchorInteractProfile = i;
    }

    public void setAudienceInteractProfile(int i) {
        this.audienceInteractProfile = i;
    }

    @AbstractC27891c(mo46611a = "bitrate_adapt_strategy")
    public void setBitrateAdaptStrategy(int i) {
        this.bitrateAdaptStrategy = i;
    }

    public void setDefaultBitrate(int i) {
        this.defaultBitrate = i;
    }

    @AbstractC27891c(mo46611a = "bframe_enable")
    public void setEnableBFrame(boolean z) {
        this.enableBFrame = z;
    }

    public void setFPS(int i) {
        this.fps = i;
    }

    @AbstractC27891c(mo46611a = "gop_sec")
    public void setGopSec(float f) {
        this.gopSec = f;
    }

    public void setHardwareEncode(boolean z) {
        this.hardwareEncode = z;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setMaxBitrate(int i) {
        this.maxBitrate = i;
    }

    public void setMinBitrate(int i) {
        this.minBitrate = i;
    }

    public void setNgbPushUrl(String str) {
        this.ngbPushUrl = str;
    }

    public void setNgbPushUrlPrefix(String str) {
        this.ngbPushUrlPrefix = str;
    }

    public void setProfile(int i) {
        this.profile = i;
    }

    @AbstractC27891c(mo46611a = "roi")
    public void setRoi(boolean z) {
        this.isRoi = z;
    }

    public void setSrConfig(SrConfig srConfig2) {
        this.srConfig = srConfig2;
    }

    @AbstractC27891c(mo46611a = "sw_roi")
    public void setSwRoi(boolean z) {
        this.isSwRoi = z;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
