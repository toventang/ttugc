package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.TeenageModeSetting */
public final class TeenageModeSetting implements Serializable {
    private int timeLockSelfInMin;

    static {
        Covode.recordClassIndex(67897);
    }

    public final int getTimeLockSelfInMin() {
        return this.timeLockSelfInMin;
    }

    public final void setTimeLockSelfInMin(int i) {
        this.timeLockSelfInMin = i;
    }

    public TeenageModeSetting(int i) {
        this.timeLockSelfInMin = i;
    }
}
