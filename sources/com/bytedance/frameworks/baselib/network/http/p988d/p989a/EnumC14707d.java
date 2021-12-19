package com.bytedance.frameworks.baselib.network.http.p988d.p989a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.d */
enum EnumC14707d {
    IDLE,
    WAITING_FOR_STALLED_SOCKET_POOL,
    WAITING_FOR_AVAILABLE_SOCKET,
    WAITING_FOR_DELEGATE,
    WAITING_FOR_CACHE,
    WAITING_FOR_APPCACHE,
    DOWNLOADING_PAC_FILE,
    RESOLVING_PROXY_FOR_URL,
    RESOLVING_HOST_IN_PAC_FILE,
    ESTABLISHING_PROXY_TUNNEL,
    RESOLVING_HOST,
    CONNECTING,
    SSL_HANDSHAKE,
    SENDING_REQUEST,
    WAITING_FOR_RESPONSE,
    READING_RESPONSE;

    static {
        Covode.recordClassIndex(16804);
    }
}
