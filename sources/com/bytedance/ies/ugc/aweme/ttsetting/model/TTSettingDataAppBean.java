package com.bytedance.ies.ugc.aweme.ttsetting.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;

public final class TTSettingDataAppBean {
    @AbstractC27891c(mo46611a = "aweme_live_podcast")
    private C18170b awemeLivePodcast;
    @AbstractC27891c(mo46611a = "aweme_music_ailab")
    private C18171c awemeMusicAilab;
    @AbstractC27891c(mo46611a = "aweme_push_monitor_config")
    private C18172d awemePushMonitorConfig;
    @AbstractC27891c(mo46611a = "aweme_uniqueid_settings")
    private C18173e awemeUniqueidSettings;
    @AbstractC27891c(mo46611a = "pre_download_delay_days")
    private Integer preDownloadDelayDays;
    @AbstractC27891c(mo46611a = "pre_download_delay_second")
    private Long preDownloadDelaySecond;
    @AbstractC27891c(mo46611a = "pre_download_start_time")
    private Integer preDownloadStartTime;
    @AbstractC27891c(mo46611a = "pre_download_version")
    private Integer preDownloadVersion;
    @AbstractC27891c(mo46611a = "teens_mode_alert_count")
    private Integer teensModeAlertCount;
    @AbstractC27891c(mo46611a = "teens_mode_match_alert_switch")
    private Boolean teensModeMatchAlertSwitch;
    @AbstractC27891c(mo46611a = "update_sdk")
    private Integer updateSdk;
    @AbstractC27891c(mo46611a = "user_badge_click_settings")
    private C18169a userBadgeClickSettings;

    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataAppBean$a */
    public static final class C18169a {
        static {
            Covode.recordClassIndex(20820);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataAppBean$b */
    public static final class C18170b {
        @AbstractC27891c(mo46611a = "can_be_obs_live_podcast")

        /* renamed from: a */
        public Boolean f43274a;

        static {
            Covode.recordClassIndex(20821);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataAppBean$c */
    public static final class C18171c {
        @AbstractC27891c(mo46611a = "song_url_list")

        /* renamed from: a */
        public ArrayList<String> f43275a;
        @AbstractC27891c(mo46611a = "frame_count")

        /* renamed from: b */
        public Integer f43276b;
        @AbstractC27891c(mo46611a = "song_uri")

        /* renamed from: c */
        public String f43277c;

        static {
            Covode.recordClassIndex(20822);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataAppBean$d */
    public static final class C18172d {
        @AbstractC27891c(mo46611a = "monitor_live_interval_second")

        /* renamed from: a */
        public Integer f43278a;
        @AbstractC27891c(mo46611a = "enable_upload_unactive_apps")

        /* renamed from: b */
        public Boolean f43279b;
        @AbstractC27891c(mo46611a = "upload_unactive_app_packages")

        /* renamed from: c */
        public ArrayList<String> f43280c;
        @AbstractC27891c(mo46611a = "default_send_data_interval")

        /* renamed from: d */
        public Integer f43281d;
        @AbstractC27891c(mo46611a = "max_send_start_info_num")

        /* renamed from: e */
        public Integer f43282e;
        @AbstractC27891c(mo46611a = "is_monitor_alive_enable")

        /* renamed from: f */
        public Integer f43283f;

        static {
            Covode.recordClassIndex(20823);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.ttsetting.model.TTSettingDataAppBean$e */
    public static final class C18173e {
        @AbstractC27891c(mo46611a = "other_info_enable")

        /* renamed from: a */
        public Integer f43284a;
        @AbstractC27891c(mo46611a = "get_phone_enable")

        /* renamed from: b */
        public Integer f43285b;
        @AbstractC27891c(mo46611a = "tt_get_mobile_retry_times")

        /* renamed from: c */
        public Integer f43286c;
        @AbstractC27891c(mo46611a = "enable_al")

        /* renamed from: d */
        public Integer f43287d;
        @AbstractC27891c(mo46611a = "get_mobile_delay")

        /* renamed from: e */
        public Integer f43288e;

        static {
            Covode.recordClassIndex(20824);
        }
    }

    static {
        Covode.recordClassIndex(20819);
    }

    public final C18170b getAwemeLivePodcast() {
        return this.awemeLivePodcast;
    }

    public final C18171c getAwemeMusicAilab() {
        return this.awemeMusicAilab;
    }

    public final C18172d getAwemePushMonitorConfig() {
        return this.awemePushMonitorConfig;
    }

    public final C18173e getAwemeUniqueidSettings() {
        return this.awemeUniqueidSettings;
    }

    public final Integer getPreDownloadDelayDays() {
        return this.preDownloadDelayDays;
    }

    public final Long getPreDownloadDelaySecond() {
        return this.preDownloadDelaySecond;
    }

    public final Integer getPreDownloadStartTime() {
        return this.preDownloadStartTime;
    }

    public final Integer getPreDownloadVersion() {
        return this.preDownloadVersion;
    }

    public final Integer getTeensModeAlertCount() {
        return this.teensModeAlertCount;
    }

    public final Boolean getTeensModeMatchAlertSwitch() {
        return this.teensModeMatchAlertSwitch;
    }

    public final Integer getUpdateSdk() {
        return this.updateSdk;
    }

    public final C18169a getUserBadgeClickSettings() {
        return this.userBadgeClickSettings;
    }

    public final void setAwemeLivePodcast(C18170b bVar) {
        this.awemeLivePodcast = bVar;
    }

    public final void setAwemeMusicAilab(C18171c cVar) {
        this.awemeMusicAilab = cVar;
    }

    public final void setAwemePushMonitorConfig(C18172d dVar) {
        this.awemePushMonitorConfig = dVar;
    }

    public final void setAwemeUniqueidSettings(C18173e eVar) {
        this.awemeUniqueidSettings = eVar;
    }

    public final void setPreDownloadDelayDays(Integer num) {
        this.preDownloadDelayDays = num;
    }

    public final void setPreDownloadDelaySecond(Long l) {
        this.preDownloadDelaySecond = l;
    }

    public final void setPreDownloadStartTime(Integer num) {
        this.preDownloadStartTime = num;
    }

    public final void setPreDownloadVersion(Integer num) {
        this.preDownloadVersion = num;
    }

    public final void setTeensModeAlertCount(Integer num) {
        this.teensModeAlertCount = num;
    }

    public final void setTeensModeMatchAlertSwitch(Boolean bool) {
        this.teensModeMatchAlertSwitch = bool;
    }

    public final void setUpdateSdk(Integer num) {
        this.updateSdk = num;
    }

    public final void setUserBadgeClickSettings(C18169a aVar) {
        this.userBadgeClickSettings = aVar;
    }
}
