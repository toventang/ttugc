package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig */
public class AdLandingPageConfig {
    @AbstractC27891c(mo46611a = "ad_card_preload_common_channel")
    private List<String> adCardPreloadCommonChannel = new ArrayList();
    @AbstractC27891c(mo46611a = "ad_card_preload_common_prefix")
    private List<String> adCardPreloadCommonPrefix = new ArrayList();
    @AbstractC27891c(mo46611a = "ad_landing_page_auto_jump_allow_list")
    private List<String> adLandingPageAutoJumpAllowList = new ArrayList();
    @AbstractC27891c(mo46611a = "ad_landing_page_auto_jump_control_enabled")
    private Boolean adLandingPageAutoJumpControlEnabled;
    @AbstractC27891c(mo46611a = "ad_landing_page_auto_jump_intercept_list")
    private List<String> adLandingPageAutoJumpInterceptList = new ArrayList();
    @AbstractC27891c(mo46611a = "ad_landing_page_click_jump_control_enabled")
    private Boolean adLandingPageClickJumpControlEnabled;
    @AbstractC27891c(mo46611a = "ad_landing_page_click_jump_interval")
    private Integer adLandingPageClickJumpInterval;
    @AbstractC27891c(mo46611a = "ad_landing_page_click_jump_interval_tips")
    private String adLandingPageClickJumpIntervalTips;
    @AbstractC27891c(mo46611a = "ad_landing_page_pause_list")
    private List<String> adLandingPagePauseList = new ArrayList();
    @AbstractC27891c(mo46611a = "ad_landing_page_preload_cache_count")
    private Integer adLandingPagePreloadCacheCount;
    @AbstractC27891c(mo46611a = "ad_landing_page_preload_common_channel")
    private List<String> adLandingPagePreloadCommonChannel = new ArrayList();
    @AbstractC27891c(mo46611a = "ad_landing_page_preload_common_prefix")
    private List<String> adLandingPagePreloadCommonPrefix = new ArrayList();
    @AbstractC27891c(mo46611a = "ad_landing_page_preload_enabled")
    private Boolean adLandingPagePreloadEnabled;
    @AbstractC27891c(mo46611a = "ad_landing_page_report_delay")
    private int adLandingPageReportDelay = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
    @AbstractC27891c(mo46611a = "ad_landing_page_report_limit_times")
    private Integer adLandingPageReportLimitTimes;
    @AbstractC27891c(mo46611a = "ad_landing_page_report_packet_key")
    private String adLandingPageReportPacketKey;
    @AbstractC27891c(mo46611a = "ad_landing_page_report_page_count")
    private Integer adLandingPageReportPageCount;
    @AbstractC27891c(mo46611a = "ad_landing_page_report_url")
    private String adLandingPageReportUrl;
    @AbstractC27891c(mo46611a = "ad_landing_page_report_wifi_only_enable")
    private Boolean adLandingPageReportWifiOnlyEnable;
    @AbstractC27891c(mo46611a = "ad_lynx_page_preload_cache_count")
    private Integer adLynxPagePreloadCacheCount;
    @AbstractC27891c(mo46611a = "allow_jump_control_enable")
    private Boolean allowJumpControlEnable = false;
    @AbstractC27891c(mo46611a = "allow_jump_list")
    private List<String> allowJumpList = new ArrayList();
    @AbstractC27891c(mo46611a = "analytics")
    private String analytics;
    @AbstractC27891c(mo46611a = "enable_dynamic_navbar")
    private Boolean enableDynamicNavbar;
    @AbstractC27891c(mo46611a = "enable_referer")
    private Boolean enableReferer = true;
    @AbstractC27891c(mo46611a = "ad_hybrid_monitor_res_perf_enable")
    private boolean hybridMonitorResPerfEnable = false;
    @AbstractC27891c(mo46611a = "ad_hybrid_monitor_sample_rate")
    private int hybridMonitorSampleRate = 3;
    @AbstractC27891c(mo46611a = "modify_xrw")
    private boolean modifyXrw = true;
    @AbstractC27891c(mo46611a = "premem_analytics")
    private String prememAnalytics;
    @AbstractC27891c(mo46611a = "premem_cache_js_enable")
    private boolean prememCacheJsEnable = false;
    @AbstractC27891c(mo46611a = "premem_cache_max_age_in_days")
    private int prememCacheMaxAgeInDays = 1;

    static {
        Covode.recordClassIndex(62325);
    }

    public List<String> getAdCardPreloadCommonChannel() {
        return this.adCardPreloadCommonChannel;
    }

    public List<String> getAdCardPreloadCommonPrefix() {
        return this.adCardPreloadCommonPrefix;
    }

    public List<String> getAdLandingPageAutoJumpAllowList() {
        return this.adLandingPageAutoJumpAllowList;
    }

    public List<String> getAdLandingPageAutoJumpInterceptList() {
        return this.adLandingPageAutoJumpInterceptList;
    }

    public List<String> getAdLandingPagePauseList() {
        return this.adLandingPagePauseList;
    }

    public List<String> getAdLandingPagePreloadCommonChannel() {
        return this.adLandingPagePreloadCommonChannel;
    }

    public List<String> getAdLandingPagePreloadCommonPrefix() {
        return this.adLandingPagePreloadCommonPrefix;
    }

    public int getAdLandingPageReportDelay() {
        return this.adLandingPageReportDelay;
    }

    public Boolean getAllowJumpControlEnable() {
        return this.allowJumpControlEnable;
    }

    public List<String> getAllowJumpList() {
        return this.allowJumpList;
    }

    public Boolean getEnableReferer() {
        return this.enableReferer;
    }

    public int getHybridMonitorSampleRate() {
        return this.hybridMonitorSampleRate;
    }

    public String getPrememAnalytics() {
        return this.prememAnalytics;
    }

    public boolean isHybridMonitorResPerfEnable() {
        return this.hybridMonitorResPerfEnable;
    }

    public boolean isModifyXrw() {
        return this.modifyXrw;
    }

    public boolean isPrememCacheJsEnable() {
        return this.prememCacheJsEnable;
    }

    public int getPrememCacheMaxAgeInDays() {
        return Math.max(0, this.prememCacheMaxAgeInDays);
    }

    public Boolean getAdLandingPageAutoJumpControlEnabled() {
        Boolean bool = this.adLandingPageAutoJumpControlEnabled;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Boolean getAdLandingPageClickJumpControlEnabled() {
        Boolean bool = this.adLandingPageClickJumpControlEnabled;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Integer getAdLandingPageClickJumpInterval() {
        Integer num = this.adLandingPageClickJumpInterval;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public String getAdLandingPageClickJumpIntervalTips() {
        String str = this.adLandingPageClickJumpIntervalTips;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public Integer getAdLandingPagePreloadCacheCount() {
        Integer num = this.adLandingPagePreloadCacheCount;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Boolean getAdLandingPagePreloadEnabled() {
        Boolean bool = this.adLandingPagePreloadEnabled;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Integer getAdLandingPageReportLimitTimes() {
        Integer num = this.adLandingPageReportLimitTimes;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public String getAdLandingPageReportPacketKey() {
        String str = this.adLandingPageReportPacketKey;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public Integer getAdLandingPageReportPageCount() {
        Integer num = this.adLandingPageReportPageCount;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public String getAdLandingPageReportUrl() {
        String str = this.adLandingPageReportUrl;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public Boolean getAdLandingPageReportWifiOnlyEnable() {
        Boolean bool = this.adLandingPageReportWifiOnlyEnable;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Integer getAdLynxPagePreloadCacheCount() {
        Integer num = this.adLynxPagePreloadCacheCount;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public String getAnalytics() {
        String str = this.analytics;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }

    public Boolean getEnableDynamicNavbar() {
        Boolean bool = this.enableDynamicNavbar;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }
}
