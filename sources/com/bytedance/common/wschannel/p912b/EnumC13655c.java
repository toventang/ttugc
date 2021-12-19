package com.bytedance.common.wschannel.p912b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.common.wschannel.b.c */
public enum EnumC13655c {
    CONNECTION_UNKNOWN(1),
    CONNECTING(2),
    CONNECT_FAILED(4),
    CONNECT_CLOSED(8),
    CONNECTED(16);
    

    /* renamed from: a */
    final int f33176a;

    public final int getTypeValue() {
        return this.f33176a;
    }

    public final String toString() {
        return "ConnectionState{State=" + this.f33176a + '}';
    }

    static {
        Covode.recordClassIndex(15687);
    }

    private EnumC13655c(int i) {
        this.f33176a = i;
    }
}
