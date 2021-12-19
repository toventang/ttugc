package com.p2082ss.android.ugc.p4267g.p4268a.p4270b;

import com.bytedance.covode.number.Covode;
import com.bytedance.netecho.Netecho;
import com.bytedance.netecho.result.IcmpDetectResult;
import com.p2082ss.android.ugc.p4267g.p4268a.EnumC81991b;
import com.p2082ss.android.ugc.p4267g.p4268a.p4269a.C81986a;
import com.p2082ss.android.ugc.p4267g.p4268a.p4269a.C81988c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.g.a.b.b */
public final class C81993b implements AbstractC81992a {

    /* renamed from: a */
    public final long f183494a;

    /* renamed from: b */
    private final HashMap<String, C81988c> f183495b;

    /* renamed from: c */
    private final HashMap<String, HashMap<String, Object>> f183496c;

    static {
        Covode.recordClassIndex(95808);
    }

    /* renamed from: com.ss.android.ugc.g.a.b.b$a */
    static final class RunnableC81994a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Map.Entry f183497a;

        /* renamed from: b */
        final /* synthetic */ C81993b f183498b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f183499c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89234a f183500d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89238e f183501e;

        static {
            Covode.recordClassIndex(95809);
        }

        RunnableC81994a(Map.Entry entry, C81993b bVar, C89233z.C89238e eVar, C89233z.C89234a aVar, C89233z.C89238e eVar2) {
            this.f183497a = entry;
            this.f183498b = bVar;
            this.f183499c = eVar;
            this.f183500d = aVar;
            this.f183501e = eVar2;
        }

        public final void run() {
            try {
                IcmpDetectResult detectIcmp = Netecho.INSTANCE.detectIcmp(((C81988c) this.f183497a.getValue()).f183476a, this.f183498b.f183494a, 3);
                this.f183499c.element.put(this.f183497a.getKey(), detectIcmp);
                if (detectIcmp.getSuccess()) {
                    this.f183500d.element = true;
                }
            } catch (Throwable unused) {
            }
            this.f183501e.element.countDown();
        }
    }

    @Override // com.p2082ss.android.ugc.p4267g.p4268a.p4270b.AbstractC81992a
    /* renamed from: a */
    public final C81986a mo127164a() {
        EnumC81991b bVar;
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = (T) new CountDownLatch(this.f183495b.size());
        C89233z.C89234a aVar = new C89233z.C89234a();
        aVar.element = false;
        C89233z.C89238e eVar2 = new C89233z.C89238e();
        eVar2.element = (T) new ConcurrentHashMap();
        for (Map.Entry<String, C81988c> entry : this.f183495b.entrySet()) {
            new Thread(new RunnableC81994a(entry, this, eVar2, aVar, eVar)).start();
        }
        try {
            eVar.element.await(this.f183494a + 1000, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        boolean z = aVar.element;
        for (Map.Entry entry2 : eVar2.element.entrySet()) {
            HashMap<String, Object> hashMap = this.f183496c.get(entry2.getKey());
            if (hashMap != null) {
                hashMap.put("icmp_result", entry2.getValue());
            }
        }
        boolean z2 = !z;
        if (z) {
            bVar = EnumC81991b.NETWORK_GOOD;
        } else {
            bVar = EnumC81991b.NO_NETWORK;
        }
        return new C81986a(z2, bVar);
    }

    public C81993b(HashMap<String, C81988c> hashMap, HashMap<String, HashMap<String, Object>> hashMap2, long j) {
        C89219l.m154719c(hashMap, "");
        C89219l.m154719c(hashMap2, "");
        this.f183495b = hashMap;
        this.f183496c = hashMap2;
        this.f183494a = j;
    }
}
