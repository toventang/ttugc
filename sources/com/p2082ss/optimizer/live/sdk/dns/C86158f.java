package com.p2082ss.optimizer.live.sdk.dns;

import com.bytedance.covode.number.Covode;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

/* renamed from: com.ss.optimizer.live.sdk.dns.f */
public final class C86158f extends AbstractCallableC86165l {
    static {
        Covode.recordClassIndex(101300);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C86164k call() {
        try {
            InetAddress[] allByName = InetAddress.getAllByName(this.f192163a);
            ArrayList arrayList = new ArrayList();
            if (allByName != null && allByName.length > 0) {
                for (InetAddress inetAddress : allByName) {
                    String hostAddress = inetAddress.getHostAddress();
                    if (m147981a(hostAddress)) {
                        arrayList.add(hostAddress);
                    }
                }
            }
            if (C86159g.f192141a) {
                C86159g.m147972a();
            }
            return new C86164k(this.f192163a, arrayList);
        } catch (UnknownHostException e) {
            e.printStackTrace();
            if (C86159g.f192141a) {
                C86159g.m147972a();
            }
            return new C86164k(this.f192163a, null);
        }
    }

    C86158f(String str) {
        super(str);
    }
}
