package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.HybridMonitorConfig */
public class HybridMonitorConfig {
    @AbstractC27891c(mo46611a = "gecko_channel_monitor_allow_list")
    private List<String> geckoChannelMonitorAllowList = new ArrayList();
    @AbstractC27891c(mo46611a = "h5_static_resource_report_allow_list")
    private List<String> h5StaticResourceReportAllowList = new ArrayList();
    @AbstractC27891c(mo46611a = "h5_static_resource_report_enabled")
    private Boolean h5StaticResourceReportEnabled;
    @AbstractC27891c(mo46611a = "jsb_host_allow_list")
    private List<String> jsbHostAllowList = new ArrayList();
    @AbstractC27891c(mo46611a = "perf_monitor_regex_list")
    private List<String> perfMonitorRegexList = new ArrayList();
    @AbstractC27891c(mo46611a = "rn_timing_interval")
    private Integer rnTimingInterval;
    @AbstractC27891c(mo46611a = "slardar_sdk_config")
    private String slardarSdkConfig;

    static {
        Covode.recordClassIndex(62363);
    }

    public List<String> getGeckoChannelMonitorAllowList() {
        return this.geckoChannelMonitorAllowList;
    }

    public List<String> getH5StaticResourceReportAllowList() {
        return this.h5StaticResourceReportAllowList;
    }

    public List<String> getJsbHostAllowList() {
        return this.jsbHostAllowList;
    }

    public List<String> getPerfMonitorRegexList() {
        return this.perfMonitorRegexList;
    }

    public Boolean getH5StaticResourceReportEnabled() {
        Boolean bool = this.h5StaticResourceReportEnabled;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Integer getRnTimingInterval() {
        Integer num = this.rnTimingInterval;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public String getSlardarSdkConfig() {
        String str = this.slardarSdkConfig;
        if (str != null) {
            return str;
        }
        throw new C16041a();
    }
}
