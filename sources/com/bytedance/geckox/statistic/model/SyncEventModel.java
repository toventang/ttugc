package com.bytedance.geckox.statistic.model;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.C14905e;
import com.google.gson.p2018a.AbstractC27891c;

public class SyncEventModel {
    @AbstractC27891c(mo46611a = "aid")
    private long aid;
    @AbstractC27891c(mo46611a = "app_version")
    private String appVersion;
    @AbstractC27891c(mo46611a = "device_id")
    private String deviceId;
    @AbstractC27891c(mo46611a = "device_model")
    private String deviceModel = Build.MODEL;
    @AbstractC27891c(mo46611a = "os")

    /* renamed from: os */
    private int f36716os;
    @AbstractC27891c(mo46611a = "os_version")
    public String osVersion = new StringBuilder().append(Build.VERSION.SDK_INT).toString();
    @AbstractC27891c(mo46611a = "params_for_special")
    private String params = "gecko";
    @AbstractC27891c(mo46611a = "region")
    private String region;
    @AbstractC27891c(mo46611a = "sdk_version")
    private String sdkVersion = "3.0.0-rc.0-mt";
    @AbstractC27891c(mo46611a = "sync_stats_type")
    private int syncStatsType;
    @AbstractC27891c(mo46611a = "sync_task_id")
    private int syncTaskId;
    @AbstractC27891c(mo46611a = "sync_task_type")
    private int syncTaskType;

    static {
        Covode.recordClassIndex(17204);
    }

    public void setSyncStatsType(int i) {
        this.syncStatsType = i;
    }

    public void setSyncTaskId(int i) {
        this.syncTaskId = i;
    }

    public void setSyncTaskType(int i) {
        this.syncTaskType = i;
    }

    public SyncEventModel(C14905e eVar) {
        this.aid = eVar.f36410i.longValue();
        this.appVersion = eVar.f36411j;
        this.region = eVar.f36414m;
        this.deviceId = eVar.f36412k;
    }
}
