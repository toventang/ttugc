package com.p2082ss.optimizer.live.sdk.dns;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

/* renamed from: com.ss.optimizer.live.sdk.dns.j */
final class CallableC86163j implements Callable<C86162i> {

    /* renamed from: a */
    private static Pattern f192156a;

    /* renamed from: b */
    private final String f192157b;

    /* renamed from: c */
    private final int f192158c = 10;

    static {
        Covode.recordClassIndex(101305);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a5 A[SYNTHETIC, Splitter:B:36:0x00a5] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p2082ss.optimizer.live.sdk.dns.C86162i call() {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.optimizer.live.sdk.dns.CallableC86163j.call():com.ss.optimizer.live.sdk.dns.i");
    }

    CallableC86163j(String str) {
        this.f192157b = str;
        if (f192156a == null) {
            f192156a = Pattern.compile(".*?icmp_seq=(\\d+).*?ttl=(\\d+).*?time=([\\d^\\.]+|[1-9]\\d*\\.\\d*|0\\.\\d*[1-9]\\d*).*?ms");
        }
    }
}
