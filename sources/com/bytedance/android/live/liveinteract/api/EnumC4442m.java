package com.bytedance.android.live.liveinteract.api;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.liveinteract.api.m */
public enum EnumC4442m {
    NONE(0),
    FOLLOW_INVITE(1),
    RECOMMEND_INVITE(2),
    RANDOM_LINK_MIC_INVITE(5);
    

    /* renamed from: b */
    private int f12038b;

    public final int getType() {
        return this.f12038b;
    }

    static {
        Covode.recordClassIndex(5018);
    }

    public final void setType(int i) {
        this.f12038b = i;
    }

    private EnumC4442m(int i) {
        this.f12038b = i;
    }
}
