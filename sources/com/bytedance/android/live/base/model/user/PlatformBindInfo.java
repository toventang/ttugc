package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class PlatformBindInfo {
    @AbstractC27891c(mo46611a = "allow_sync")
    private boolean allowSync;
    @AbstractC27891c(mo46611a = "bind_user_name")
    private String bindUserName;
    @AbstractC27891c(mo46611a = "platform")
    private String platform;
    @AbstractC27891c(mo46611a = "publish_sync_tips_cnt")
    private int publishSyncTipsCnt;
    @AbstractC27891c(mo46611a = "tigger_full_sync")
    private boolean tiggerFullSync;

    static {
        Covode.recordClassIndex(3449);
    }

    public String getBindUserName() {
        return this.bindUserName;
    }

    public String getPlatform() {
        return this.platform;
    }

    public int getPublishSyncTipsCnt() {
        return this.publishSyncTipsCnt;
    }

    public boolean isAllowSync() {
        return this.allowSync;
    }

    public boolean isTiggerFullSync() {
        return this.tiggerFullSync;
    }

    public int hashCode() {
        int i;
        String str = this.platform;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = ((((i * 31) + (this.allowSync ? 1 : 0)) * 31) + (this.tiggerFullSync ? 1 : 0)) * 31;
        String str2 = this.bindUserName;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((i3 + i2) * 31) + this.publishSyncTipsCnt;
    }

    public void setAllowSync(boolean z) {
        this.allowSync = z;
    }

    public void setBindUserName(String str) {
        this.bindUserName = str;
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public void setPublishSyncTipsCnt(int i) {
        this.publishSyncTipsCnt = i;
    }

    public void setTiggerFullSync(boolean z) {
        this.tiggerFullSync = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PlatformBindInfo platformBindInfo = (PlatformBindInfo) obj;
            if (this.allowSync != platformBindInfo.allowSync || this.tiggerFullSync != platformBindInfo.tiggerFullSync || this.publishSyncTipsCnt != platformBindInfo.publishSyncTipsCnt) {
                return false;
            }
            String str = this.platform;
            if (str == null ? platformBindInfo.platform != null : !str.equals(platformBindInfo.platform)) {
                return false;
            }
            String str2 = this.bindUserName;
            String str3 = platformBindInfo.bindUserName;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }
}
