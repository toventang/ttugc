package com.p2082ss.android.ugc.p4267g.p4268a.p4270b;

import com.bytedance.covode.number.Covode;
import com.bytedance.netecho.Netecho;
import com.bytedance.netecho.result.TcpDetectResult;
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

/* renamed from: com.ss.android.ugc.g.a.b.c */
public final class C81995c implements AbstractC81992a {

    /* renamed from: a */
    public final long f183502a;

    /* renamed from: b */
    private final HashMap<String, C81988c> f183503b;

    /* renamed from: c */
    private final HashMap<String, HashMap<String, Object>> f183504c;

    static {
        Covode.recordClassIndex(95810);
    }

    /* renamed from: com.ss.android.ugc.g.a.b.c$a */
    static final class RunnableC81996a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Map.Entry f183505a;

        /* renamed from: b */
        final /* synthetic */ C81995c f183506b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f183507c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89234a f183508d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89238e f183509e;

        static {
            Covode.recordClassIndex(95811);
        }

        RunnableC81996a(Map.Entry entry, C81995c cVar, C89233z.C89238e eVar, C89233z.C89234a aVar, C89233z.C89238e eVar2) {
            this.f183505a = entry;
            this.f183506b = cVar;
            this.f183507c = eVar;
            this.f183508d = aVar;
            this.f183509e = eVar2;
        }

        public final void run() {
            try {
                TcpDetectResult detectTcp = Netecho.INSTANCE.detectTcp(((C81988c) this.f183505a.getValue()).f183476a, ((C81988c) this.f183505a.getValue()).f183477b, this.f183506b.f183502a);
                this.f183507c.element.put(this.f183505a.getKey(), detectTcp);
                if (detectTcp.getSuccess()) {
                    this.f183508d.element = true;
                }
            } catch (Throwable unused) {
            }
            this.f183509e.element.countDown();
        }
    }

    @Override // com.p2082ss.android.ugc.p4267g.p4268a.p4270b.AbstractC81992a
    /* renamed from: a */
    public final C81986a mo127164a() {
        EnumC81991b bVar;
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = (T) new CountDownLatch(this.f183503b.size());
        C89233z.C89234a aVar = new C89233z.C89234a();
        aVar.element = false;
        C89233z.C89238e eVar2 = new C89233z.C89238e();
        eVar2.element = (T) new ConcurrentHashMap();
        for (Map.Entry<String, C81988c> entry : this.f183503b.entrySet()) {
            new Thread(new RunnableC81996a(entry, this, eVar2, aVar, eVar)).start();
        }
        try {
            eVar.element.await(this.f183502a + 1000, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        boolean z = aVar.element;
        for (Map.Entry entry2 : eVar2.element.entrySet()) {
            HashMap<String, Object> hashMap = this.f183504c.get(entry2.getKey());
            if (hashMap != null) {
                hashMap.put("tcp_result", entry2.getValue());
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

    public C81995c(HashMap<String, C81988c> hashMap, HashMap<String, HashMap<String, Object>> hashMap2, long j) {
        C89219l.m154719c(hashMap, "");
        C89219l.m154719c(hashMap2, "");
        this.f183503b = hashMap;
        this.f183504c = hashMap2;
        this.f183502a = j;
    }
}
