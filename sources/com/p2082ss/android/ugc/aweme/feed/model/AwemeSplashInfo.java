package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27889a;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo */
public class AwemeSplashInfo implements Serializable {
    public transient boolean adCardShownOnce;
    public String anchorId;
    @AbstractC27891c(mo46611a = "awesome_splash_id")
    private String awesomeSplashId;
    public transient boolean contextTrackSent;
    @AbstractC27891c(mo46611a = "disable_hotstart_show")
    private boolean disableHotStartShow;
    @AbstractC27891c(mo46611a = "enable_splash_open")
    private boolean enableSplashOpen;
    @AbstractC27891c(mo46611a = "end_time")
    private int endTime;
    @AbstractC27891c(mo46611a = "enter_app_text")
    private String enterAppText;
    public transient boolean hasUpdateLiving;
    @AbstractC27891c(mo46611a = "hot_show_type")
    private int hotShowType;
    @AbstractC27891c(mo46611a = "is_invalid_ad")
    private boolean isInvalidAd;
    @AbstractC27889a(mo46607a = false, mo46608b = false)
    private transient boolean isShown;
    @AbstractC27891c(mo46611a = "label_info")
    private LabelInfo labelInfo;
    @AbstractC27891c(mo46611a = "logo_color")
    private int logoColor;
    @AbstractC27891c(mo46611a = "predownload_text")
    private String predownloadText;
    @AbstractC27891c(mo46611a = "preload_type")
    private int preloadType;
    @AbstractC27891c(mo46611a = "show_live_info")
    private int showLiveInfo;
    @AbstractC27891c(mo46611a = "skip_info")
    private SkipInfo skipInfo;
    @AbstractC27891c(mo46611a = "splash_button_text")
    private String splashButtonText;
    @AbstractC27891c(mo46611a = "splash_feed_type")
    private int splashFeedType;
    @AbstractC27891c(mo46611a = "splash_show_time")
    private float splashShowTime = 3000.0f;
    @AbstractC27891c(mo46611a = "swipe_up_delay")
    private long swipeUpDelay;
    @AbstractC27891c(mo46611a = "swipe_up_type")
    private int swipeUpType;
    public transient TopViewLiveInfo topViewLiveInfo;

    static {
        Covode.recordClassIndex(58635);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo$LabelInfo */
    public class LabelInfo implements Serializable {
        @AbstractC27891c(mo46611a = "background_color")
        private String backgroundColor;
        @AbstractC27891c(mo46611a = "position")
        private int position;
        @AbstractC27891c(mo46611a = "text")
        private String text;
        @AbstractC27891c(mo46611a = "text_color")
        private String textColor;

        static {
            Covode.recordClassIndex(58636);
        }

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public int getPosition() {
            return this.position;
        }

        public String getText() {
            return this.text;
        }

        public String getTextColor() {
            return this.textColor;
        }

        public LabelInfo() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo$SkipInfo */
    public class SkipInfo implements Serializable {
        @AbstractC27891c(mo46611a = "background_color")
        private String backgroundColor;
        @AbstractC27891c(mo46611a = "button_extra_style")
        private int buttonExtraStyle;
        @AbstractC27891c(mo46611a = "countdown_unit")
        private String countdownUnit;
        @AbstractC27891c(mo46611a = "countdown_enable")
        private int countdown_enable;
        @AbstractC27891c(mo46611a = "height_extra_size")
        private int heightExtraSize;
        @AbstractC27891c(mo46611a = "position")
        private int position;
        @AbstractC27891c(mo46611a = "text")
        private String text;
        @AbstractC27891c(mo46611a = "text_color")
        private String textColor;
        @AbstractC27891c(mo46611a = "width_extra_size")
        private int widthExtraSize;

        static {
            Covode.recordClassIndex(58637);
        }

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public int getButtonExtraStyle() {
            return this.buttonExtraStyle;
        }

        public String getCountdownUnit() {
            return this.countdownUnit;
        }

        public int getHeightExtraSize() {
            return this.heightExtraSize;
        }

        public int getPosition() {
            return this.position;
        }

        public String getText() {
            return this.text;
        }

        public String getTextColor() {
            return this.textColor;
        }

        public int getWidthExtraSize() {
            return this.widthExtraSize;
        }

        public boolean isCountdown_enable() {
            if (this.countdown_enable == 1) {
                return true;
            }
            return false;
        }

        public SkipInfo() {
        }
    }

    public String getAwesomeSplashId() {
        return this.awesomeSplashId;
    }

    public int getEndTime() {
        return this.endTime;
    }

    public String getEnterAppText() {
        return this.enterAppText;
    }

    public int getHotShowType() {
        return this.hotShowType;
    }

    public LabelInfo getLabelInfo() {
        return this.labelInfo;
    }

    public int getLogoColor() {
        return this.logoColor;
    }

    public String getPredownloadText() {
        return this.predownloadText;
    }

    public int getPreloadType() {
        return this.preloadType;
    }

    public int getShowLiveInfo() {
        return this.showLiveInfo;
    }

    public SkipInfo getSkipInfo() {
        return this.skipInfo;
    }

    public String getSplashButtonText() {
        return this.splashButtonText;
    }

    public int getSplashFeedType() {
        return this.splashFeedType;
    }

    public float getSplashShowTime() {
        return this.splashShowTime;
    }

    public long getSwipeUpDelay() {
        return this.swipeUpDelay;
    }

    public int getSwipeUpType() {
        return this.swipeUpType;
    }

    public boolean isDisableHotStartShow() {
        return this.disableHotStartShow;
    }

    public boolean isEnableSplashOpen() {
        return this.enableSplashOpen;
    }

    public boolean isInvalidAd() {
        return this.isInvalidAd;
    }

    public boolean isShown() {
        return this.isShown;
    }

    public void setAwesomeSplashId(String str) {
        this.awesomeSplashId = str;
    }

    public void setEnableSplashOpen(boolean z) {
        this.enableSplashOpen = z;
    }

    public void setEndTime(int i) {
        this.endTime = i;
    }

    public void setHotShowType(int i) {
        this.hotShowType = i;
    }

    public void setInvalidAd(boolean z) {
        this.isInvalidAd = z;
    }

    public void setLogoColor(int i) {
        this.logoColor = i;
    }

    public void setPreloadType(int i) {
        this.preloadType = i;
    }

    public void setShowLiveInfo(int i) {
        this.showLiveInfo = i;
    }

    public void setShown(boolean z) {
        this.isShown = z;
    }

    public void setSplashButtonText(String str) {
        this.splashButtonText = str;
    }

    public void setSplashFeedType(int i) {
        this.splashFeedType = i;
    }

    public void setSplashShowTime(float f) {
        this.splashShowTime = f;
    }
}
