package com.toutiao.proxyserver;

import com.bytedance.covode.number.Covode;
import com.toutiao.proxyserver.p4490b.C87297c;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.toutiao.proxyserver.k */
public final class C87349k {

    /* renamed from: a */
    ConcurrentHashMap<String, C87297c> f197999a;

    /* renamed from: b */
    private ConcurrentLinkedQueue<String> f198000b;

    static {
        Covode.recordClassIndex(103245);
    }

    /* renamed from: com.toutiao.proxyserver.k$a */
    public static class C87350a {

        /* renamed from: a */
        public static final C87349k f198001a = new C87349k((byte) 0);

        static {
            Covode.recordClassIndex(103246);
        }
    }

    private C87349k() {
        this.f198000b = new ConcurrentLinkedQueue<>();
        this.f197999a = new ConcurrentHashMap<>();
    }

    /* synthetic */ C87349k(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo141390a(String str, C87297c cVar) {
        if (str != null && cVar != null && !this.f197999a.containsKey(str)) {
            this.f197999a.put(str, cVar);
            this.f198000b.offer(str);
            int i = 0;
            while (this.f198000b.size() > 30) {
                String poll = this.f198000b.poll();
                if (poll != null) {
                    this.f197999a.remove(poll);
                }
                i++;
                if (i > 30) {
                    return;
                }
                if (poll == null) {
                    return;
                }
            }
        }
    }
}
