package com.p2082ss.android.ugc.aweme.compliance.protection.restrictmode.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.a */
public final class C40104a implements Serializable {
    @AbstractC27891c(mo46611a = "isTeenageModeSelf")

    /* renamed from: a */
    private boolean f94177a;
    @AbstractC27891c(mo46611a = "timeLockSelfInMin")

    /* renamed from: b */
    private int f94178b;

    static {
        Covode.recordClassIndex(47882);
    }

    public final int getTimeLockSelfInMin() {
        return this.f94178b;
    }

    public final boolean isRestrictModeSelf() {
        return this.f94177a;
    }

    public final void setRestrictModeSelf(boolean z) {
        this.f94177a = z;
    }

    public final void setTimeLockSelfInMin(int i) {
        this.f94178b = i;
    }

    public C40104a(boolean z, int i) {
        this.f94177a = z;
        this.f94178b = i;
    }
}
