package com.toutiao.proxyserver;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.toutiao.proxyserver.ae */
public final class C87291ae {

    /* renamed from: a */
    ConcurrentHashMap<String, C87292a> f197852a;

    /* renamed from: b */
    ConcurrentHashMap<String, String> f197853b;

    /* renamed from: c */
    private ConcurrentHashMap<String, String> f197854c;

    /* renamed from: d */
    private ConcurrentLinkedQueue<String> f197855d;

    /* renamed from: com.toutiao.proxyserver.ae$a */
    public static class C87292a {

        /* renamed from: a */
        public AtomicLong f197856a = new AtomicLong(0);

        static {
            Covode.recordClassIndex(103188);
        }
    }

    static {
        Covode.recordClassIndex(103187);
    }

    /* renamed from: com.toutiao.proxyserver.ae$b */
    public static class C87293b {

        /* renamed from: a */
        public static final C87291ae f197857a = new C87291ae((byte) 0);

        static {
            Covode.recordClassIndex(103189);
        }
    }

    private C87291ae() {
        this.f197852a = new ConcurrentHashMap<>();
        this.f197854c = new ConcurrentHashMap<>();
        this.f197853b = new ConcurrentHashMap<>();
        this.f197855d = new ConcurrentLinkedQueue<>();
    }

    /* renamed from: a */
    private void m151498a() {
        int i = 0;
        while (this.f197855d.size() > 100) {
            String poll = this.f197855d.poll();
            if (poll != null) {
                String str = this.f197854c.get(poll);
                this.f197852a.remove(poll);
                this.f197854c.remove(poll);
                this.f197853b.remove(str);
            }
            i++;
            if (i > 100) {
                return;
            }
            if (poll == null) {
                return;
            }
        }
    }

    /* synthetic */ C87291ae(byte b) {
        this();
    }

    /* renamed from: a */
    public final long mo141325a(String str) {
        C87292a aVar;
        if (str == null || !this.f197852a.containsKey(str) || (aVar = this.f197852a.get(str)) == null) {
            return 0;
        }
        return aVar.f197856a.get();
    }

    /* renamed from: a */
    public final void mo141326a(String str, long j) {
        C87292a aVar;
        if (str != null) {
            if (this.f197852a.containsKey(str)) {
                aVar = this.f197852a.get(str);
                if (aVar == null) {
                    return;
                }
            } else {
                aVar = new C87292a();
                this.f197852a.put(str, aVar);
            }
            aVar.f197856a.set(j);
        }
    }

    /* renamed from: a */
    public final void mo141327a(String str, String str2) {
        if (!this.f197854c.containsKey(str)) {
            this.f197855d.offer(str);
        }
        this.f197854c.put(str, str2);
        this.f197853b.put(str2, str);
        m151498a();
    }
}
