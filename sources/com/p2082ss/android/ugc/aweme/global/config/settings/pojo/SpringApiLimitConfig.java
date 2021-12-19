package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.SpringApiLimitConfig */
public class SpringApiLimitConfig {
    @AbstractC27891c(mo46611a = "batch_event_interval")
    private Long batchEventInterval;
    @AbstractC27891c(mo46611a = "config_list")
    private List<ApiConfigEntity> configList = new ArrayList();
    @AbstractC27891c(mo46611a = "disable_fetch_setting")
    private Boolean disableFetchSetting;
    @AbstractC27891c(mo46611a = "enable_delay_applog")
    private Boolean enableDelayApplog;
    @AbstractC27891c(mo46611a = "end_time")
    private Long endTime;
    @AbstractC27891c(mo46611a = "limit_end_time")
    private Long limitEndTime;
    @AbstractC27891c(mo46611a = "limit_start_time")
    private Long limitStartTime;
    @AbstractC27891c(mo46611a = "send_launch_timely")
    private Integer sendLaunchTimely;
    @AbstractC27891c(mo46611a = "start_time")
    private Long startTime;

    static {
        Covode.recordClassIndex(62397);
    }

    public List<ApiConfigEntity> getConfigList() {
        return this.configList;
    }

    public Long getBatchEventInterval() {
        Long l = this.batchEventInterval;
        if (l != null) {
            return l;
        }
        throw new C16041a();
    }

    public Boolean getDisableFetchSetting() {
        Boolean bool = this.disableFetchSetting;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Boolean getEnableDelayApplog() {
        Boolean bool = this.enableDelayApplog;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }

    public Long getEndTime() {
        Long l = this.endTime;
        if (l != null) {
            return l;
        }
        throw new C16041a();
    }

    public Long getLimitEndTime() {
        Long l = this.limitEndTime;
        if (l != null) {
            return l;
        }
        throw new C16041a();
    }

    public Long getLimitStartTime() {
        Long l = this.limitStartTime;
        if (l != null) {
            return l;
        }
        throw new C16041a();
    }

    public Integer getSendLaunchTimely() {
        Integer num = this.sendLaunchTimely;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Long getStartTime() {
        Long l = this.startTime;
        if (l != null) {
            return l;
        }
        throw new C16041a();
    }
}
