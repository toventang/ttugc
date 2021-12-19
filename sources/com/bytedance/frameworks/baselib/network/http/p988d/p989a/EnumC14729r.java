package com.bytedance.frameworks.baselib.network.http.p988d.p989a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.r */
enum EnumC14729r {
    NOT_SET(0),
    SERVE_FROM_CACHE(2),
    SERVE_FROM_PREFER_ADDR(5),
    SERVE_FROM_HTTP_DNS_JOB(6),
    SERVE_FROM_PROC_DNS_JOB(8),
    SERVE_FROM_HARDCODE_HOSTS(9),
    SERVE_FROM_BATCH_PRELOAD(19),
    SERVE_FROM_ASYNC_BATCH_PRELOAD(20);
    

    /* renamed from: i */
    final int f35909i;

    static {
        Covode.recordClassIndex(16826);
    }

    private EnumC14729r(int i) {
        this.f35909i = i;
    }
}
