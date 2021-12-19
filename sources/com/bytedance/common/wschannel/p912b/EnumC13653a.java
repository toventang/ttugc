package com.bytedance.common.wschannel.p912b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.common.wschannel.b.a */
public enum EnumC13653a {
    CHANNEL_SELF(1),
    CHANNEL_OK(2);
    

    /* renamed from: a */
    int f33171a;

    public final int getVal() {
        return this.f33171a;
    }

    public final String toString() {
        return "ChannelType{Type=" + this.f33171a + '}';
    }

    static {
        Covode.recordClassIndex(15685);
    }

    /* renamed from: of */
    public static EnumC13653a m24590of(int i) {
        if (i == 1) {
            return CHANNEL_SELF;
        }
        return CHANNEL_OK;
    }

    private EnumC13653a(int i) {
        this.f33171a = i;
    }
}
