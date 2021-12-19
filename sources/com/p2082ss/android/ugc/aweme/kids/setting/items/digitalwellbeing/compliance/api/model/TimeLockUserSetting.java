package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.model.TimeLockUserSetting */
public class TimeLockUserSetting implements Serializable {
    private boolean isContentFilterOn;
    private transient boolean isNotifyParentModeOnly;
    private boolean isTimeLockOn;
    private long lastSetTime;
    private int lockTimeInMin = 120;
    private String password;
    private String userId;

    static {
        Covode.recordClassIndex(67888);
    }

    public long getLastSetTime() {
        return this.lastSetTime;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isContentFilterOn() {
        return this.isContentFilterOn;
    }

    public boolean isNotifyParentModeOnly() {
        return this.isNotifyParentModeOnly;
    }

    public boolean isTimeLockOn() {
        return this.isTimeLockOn;
    }

    public int getLockTimeInMin() {
        int i = this.lockTimeInMin;
        if (i <= 30) {
            return 40;
        }
        return i;
    }

    public int hashCode() {
        String str = this.userId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "TimeLockUserSetting{userId='" + this.userId + '\'' + ", lastSetTime=" + this.lastSetTime + ", password='" + this.password + '\'' + ", isTimeLockOn=" + this.isTimeLockOn + ", isContentFilterOn=" + this.isContentFilterOn + '}';
    }

    public void setContentFilterOn(boolean z) {
        this.isContentFilterOn = z;
    }

    public void setLastSetTime(long j) {
        this.lastSetTime = j;
    }

    public void setLockTimeInMin(int i) {
        this.lockTimeInMin = i;
    }

    public void setNotifyParentModeOnly(boolean z) {
        this.isNotifyParentModeOnly = z;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setTimeLockOn(boolean z) {
        this.isTimeLockOn = z;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            String str = this.userId;
            String str2 = ((TimeLockUserSetting) obj).userId;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }
}
