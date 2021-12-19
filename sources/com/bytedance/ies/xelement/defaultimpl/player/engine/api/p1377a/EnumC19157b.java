package com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.b */
public enum EnumC19157b {
    NETWORK_ERROR(0, "NETWORK_ERROR"),
    INVALIDATE_PLAYER_MODEL(1, "INVALIDATE_DATA_SOURCE"),
    UNKNOWN(-1, "UNKNOWN");
    

    /* renamed from: b */
    private final int f45313b;

    /* renamed from: c */
    private final String f45314c;

    public final int getCode() {
        return this.f45313b;
    }

    public final String getMsg() {
        return this.f45314c;
    }

    static {
        Covode.recordClassIndex(21920);
    }

    private EnumC19157b(int i, String str) {
        this.f45313b = i;
        this.f45314c = str;
    }
}
