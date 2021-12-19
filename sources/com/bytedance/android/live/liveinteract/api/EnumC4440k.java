package com.bytedance.android.live.liveinteract.api;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.liveinteract.api.k */
public enum EnumC4440k {
    DISABLED(1),
    MATCH(10),
    INVITING(11),
    APPLYING(12),
    STATE_WAITING(15),
    CONNECTION_START(20),
    CONNECTION_SUCCEED(21),
    STATE_ONLINE(21),
    CONNECTION_FINISH(30),
    CONNECTION_FINISH_SUCCEED(31),
    STATE_OFFLINE(31),
    UNLOADED(40);
    

    /* renamed from: b */
    private int f12036b;

    public final int getState() {
        return this.f12036b;
    }

    static {
        Covode.recordClassIndex(5016);
    }

    public final void setState(int i) {
        this.f12036b = i;
    }

    private EnumC4440k(int i) {
        this.f12036b = i;
    }
}
