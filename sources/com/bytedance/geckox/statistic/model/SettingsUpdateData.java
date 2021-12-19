package com.bytedance.geckox.statistic.model;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Map;

public class SettingsUpdateData {
    @AbstractC27891c(mo46611a = "ac")

    /* renamed from: ac */
    public String f36714ac;
    @AbstractC27891c(mo46611a = "aid")
    public long aid;
    @AbstractC27891c(mo46611a = "api_version")
    public String apiVersion;
    @AbstractC27891c(mo46611a = "app_version")
    public String appVersion;
    @AbstractC27891c(mo46611a = "device_id")
    public String deviceId;
    @AbstractC27891c(mo46611a = "device_model")
    private String deviceModel = Build.MODEL;
    @AbstractC27891c(mo46611a = "err_code")
    public int errCode;
    @AbstractC27891c(mo46611a = "err_msg")
    public String errorMsg;
    @AbstractC27891c(mo46611a = "http_status")
    public int httpStatus;
    @AbstractC27891c(mo46611a = "x_tt_logid")
    public String logId;
    @AbstractC27891c(mo46611a = "os")

    /* renamed from: os */
    private int f36715os;
    @AbstractC27891c(mo46611a = "os_version")
    public String osVersion = String.valueOf(Build.VERSION.SDK_INT);
    @AbstractC27891c(mo46611a = "params_for_special")
    private String paramsForSpecial = "gecko";
    @AbstractC27891c(mo46611a = "region")
    public String region;
    @AbstractC27891c(mo46611a = "req_type")
    public int reqType = 1;
    @AbstractC27891c(mo46611a = "sdk_version")
    private String sdkVersion = "3.0.0-rc.0-mt";
    @AbstractC27891c(mo46611a = "settings_info")
    public String settingsInfo;

    static {
        Covode.recordClassIndex(17203);
    }

    public static String getLogId(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            String str = map.get("x-tt-logid");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String str2 = map.get("X-Tt-Logid");
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            String str3 = map.get("X-TT-LOGID");
            if (!TextUtils.isEmpty(str3)) {
                return str3;
            }
        }
        return "";
    }
}
