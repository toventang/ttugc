package com.bytedance.falconx.statistic;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class InterceptorModel {
    @AbstractC27891c(mo46611a = "ac")

    /* renamed from: ac */
    public String f35238ac;
    @AbstractC27891c(mo46611a = "access_key")
    public String accessKey;
    @AbstractC27891c(mo46611a = "channel")
    public String channel;
    @AbstractC27891c(mo46611a = "err_code")
    public String errCode;
    @AbstractC27891c(mo46611a = "err_msg")
    public String errMsg;
    public boolean isCombo;
    @AbstractC27891c(mo46611a = "log_id")
    public String logId;
    @AbstractC27891c(mo46611a = "mime_type")
    public String mimeType;
    @AbstractC27891c(mo46611a = "offline_duration")
    public Long offlineDuration;
    @AbstractC27891c(mo46611a = "offline_rule")
    public String offlineRule;
    @AbstractC27891c(mo46611a = "offline_status")
    public Integer offlineStatus;
    @AbstractC27891c(mo46611a = "online_duration")
    public Long onlineDuration;
    @AbstractC27891c(mo46611a = "page_url")
    public String pageUrl;
    @AbstractC27891c(mo46611a = "pkg_version")
    public Long pkgVersion;
    @AbstractC27891c(mo46611a = "res_root_dir")
    public String resRootDir;
    public Long startTime = Long.valueOf(SystemClock.uptimeMillis());
    @AbstractC27891c(mo46611a = "resource_url")
    public String url;

    static {
        Covode.recordClassIndex(16660);
    }

    public long getVersion() {
        Long l = this.pkgVersion;
        if (l == null) {
            return -1;
        }
        return l.longValue();
    }

    public void setErrorCode(String str) {
        this.errCode = str;
    }

    public void setErrorMsg(String str) {
        this.errMsg = str;
    }

    public void loadFinish(boolean z) {
        if (z) {
            this.offlineDuration = Long.valueOf(SystemClock.uptimeMillis() - this.startTime.longValue());
            this.offlineStatus = 1;
            return;
        }
        this.offlineStatus = 0;
    }
}
