package com.bytedance.android.livesdkapi.p702ws;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.ws.b */
public enum EnumC11885b {
    CONNECTION_UNKNOWN(1),
    CONNECTING(2),
    CONNECT_FAILED(4),
    CONNECT_CLOSED(8),
    CONNECTED(16);
    

    /* renamed from: a */
    final int f28444a;

    public final int getTypeValue() {
        return this.f28444a;
    }

    public final String toString() {
        return "ConnectionState{State=" + this.f28444a + '}';
    }

    static {
        Covode.recordClassIndex(13608);
    }

    private EnumC11885b(int i) {
        this.f28444a = i;
    }
}
