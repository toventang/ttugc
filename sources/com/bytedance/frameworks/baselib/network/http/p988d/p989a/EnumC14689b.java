package com.bytedance.frameworks.baselib.network.http.p988d.p989a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.b */
enum EnumC14689b {
    CONNECTION_INFO_UNKNOWN(0),
    CONNECTION_INFO_HTTP1_1(1),
    CONNECTION_INFO_DEPRECATED_SPDY3(3),
    CONNECTION_INFO_HTTP2(4),
    CONNECTION_INFO_QUIC_UNKNOWN_VERSION(5),
    CONNECTION_INFO_HTTP1_0(9);
    

    /* renamed from: g */
    final int f35688g;

    static {
        Covode.recordClassIndex(16786);
    }

    private EnumC14689b(int i) {
        this.f35688g = i;
    }
}
