package com.p2082ss.android.ugc.p4267g.p4268a;

import com.bytedance.covode.number.Covode;
import com.bytedance.netecho.Netecho;
import com.bytedance.netecho.result.DnsResolveResult;
import com.p2082ss.android.ugc.p4267g.p4268a.p4269a.C81986a;
import com.p2082ss.android.ugc.p4267g.p4268a.p4269a.C81987b;
import com.p2082ss.android.ugc.p4267g.p4268a.p4269a.C81988c;
import com.p2082ss.android.ugc.p4267g.p4268a.p4269a.C81989d;
import com.p2082ss.android.ugc.p4267g.p4268a.p4269a.C81990e;
import com.p2082ss.android.ugc.p4267g.p4268a.p4270b.AbstractC81992a;
import com.p2082ss.android.ugc.p4267g.p4268a.p4270b.C81993b;
import com.p2082ss.android.ugc.p4267g.p4268a.p4270b.C81995c;
import com.p2082ss.android.ugc.p4267g.p4268a.p4271c.C82000a;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.g.a.a */
public final class RunnableC81984a implements Runnable {

    /* renamed from: a */
    public CopyOnWriteArrayList<C89378p<AbstractC89183m<EnumC81991b, HashMap<String, HashMap<String, Object>>, C89391z>, AbstractC89172b<HashMap<String, Object>, C89391z>>> f183456a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public CopyOnWriteArrayList<Long> f183457b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final ArrayList<AbstractC81992a> f183458c;

    /* renamed from: d */
    private HashMap<String, HashMap<String, Object>> f183459d = new HashMap<>();

    /* renamed from: e */
    private HashMap<String, C81988c> f183460e = new HashMap<>();

    /* renamed from: f */
    private final C81987b f183461f;

    /* renamed from: g */
    private final C81989d f183462g;

    static {
        Covode.recordClassIndex(95799);
    }

    /* renamed from: com.ss.android.ugc.g.a.a$a */
    static final class RunnableC81985a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f183463a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f183464b;

        /* renamed from: c */
        final /* synthetic */ long f183465c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f183466d;

        static {
            Covode.recordClassIndex(95800);
        }

        RunnableC81985a(String str, C89233z.C89238e eVar, long j, C89233z.C89238e eVar2) {
            this.f183463a = str;
            this.f183464b = eVar;
            this.f183465c = j;
            this.f183466d = eVar2;
        }

        public final void run() {
            try {
                List<String> b = C89361p.m154915b(this.f183463a, new String[]{":"});
                if (b.size() == 2) {
                    int parseInt = Integer.parseInt(b.get(1));
                    if (1 <= parseInt) {
                        if (65534 >= parseInt) {
                            this.f183464b.element.put(this.f183463a, new C89378p(Netecho.INSTANCE.resolveDns(b.get(0), this.f183465c), Integer.valueOf(parseInt)));
                            C89378p pVar = (C89378p) this.f183464b.element.get(this.f183463a);
                            if (pVar != null) {
                                pVar.getFirst();
                            }
                            C89378p pVar2 = (C89378p) this.f183464b.element.get(this.f183463a);
                            if (pVar2 != null) {
                                pVar2.getSecond();
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            this.f183466d.element.countDown();
        }
    }

    public final void run() {
        String str;
        String[] strArr = this.f183461f.f183475g;
        long j = (long) this.f183461f.f183470b;
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = (T) new CountDownLatch(strArr.length);
        C89233z.C89238e eVar2 = new C89233z.C89238e();
        eVar2.element = (T) new ConcurrentHashMap();
        for (String str2 : strArr) {
            new Thread(new RunnableC81985a(str2, eVar2, j, eVar)).start();
        }
        try {
            eVar.element.await(j + 1000, TimeUnit.MILLISECONDS);
        } catch (Exception unused) {
        }
        eVar2.element.size();
        for (Map.Entry entry : eVar2.element.entrySet()) {
            DnsResolveResult dnsResolveResult = (DnsResolveResult) ((C89378p) entry.getValue()).getFirst();
            this.f183459d.put(entry.getKey(), new HashMap());
            HashMap<String, Object> hashMap = this.f183459d.get(entry.getKey());
            if (hashMap != null) {
                hashMap.put("dns_result", dnsResolveResult);
            }
            if (dnsResolveResult.getSuccess() && dnsResolveResult.getIp() != null) {
                AbstractMap abstractMap = this.f183460e;
                Object key = entry.getKey();
                String ip = ((DnsResolveResult) ((C89378p) entry.getValue()).getFirst()).getIp();
                if (ip == null) {
                    C89219l.m154707a();
                }
                abstractMap.put(key, new C81988c(ip, ((Number) ((C89378p) entry.getValue()).getSecond()).intValue()));
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        EnumC81991b bVar = EnumC81991b.UNKNOWN_STATUS;
        try {
            long j2 = -1;
            long j3 = -1;
            for (T t : this.f183458c) {
                long currentTimeMillis2 = System.currentTimeMillis();
                C81986a a = t.mo127164a();
                if (t instanceof C81993b) {
                    j3 = System.currentTimeMillis() - currentTimeMillis2;
                } else if (t instanceof C81995c) {
                    j2 = System.currentTimeMillis() - currentTimeMillis2;
                }
                if (!Thread.interrupted()) {
                    bVar = a.f183468b;
                    if (!a.f183467a) {
                        break;
                    }
                } else {
                    return;
                }
            }
            long currentTimeMillis3 = System.currentTimeMillis();
            if (bVar == EnumC81991b.NETWORK_GOOD) {
                C82003d.f183523a = currentTimeMillis3;
            }
            if (bVar == EnumC81991b.NO_NETWORK && this.f183460e.size() == 0) {
                bVar = EnumC81991b.UNKNOWN_STATUS;
                str = "2";
            } else {
                str = null;
            }
            long j4 = currentTimeMillis3 - currentTimeMillis;
            if (j4 > ((long) this.f183461f.f183471c) + ((long) this.f183461f.f183472d) + 3000) {
                bVar = EnumC81991b.UNKNOWN_STATUS;
                str = "3";
            }
            this.f183459d.put("extra_info", C82000a.m141958a(str, this.f183462g));
            boolean z = false;
            for (T t2 : this.f183456a) {
                ((AbstractC89183m) t2.getFirst()).invoke(bVar, this.f183459d);
                if (!z) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(C81990e.f183489j, String.valueOf(bVar.ordinal()));
                    hashMap2.put(C81990e.f183482c, Long.valueOf(currentTimeMillis));
                    if (j2 != -1) {
                        hashMap2.put(C81990e.f183485f, Long.valueOf(j2));
                    }
                    if (j3 != -1) {
                        hashMap2.put(C81990e.f183484e, Long.valueOf(j3));
                    }
                    hashMap2.put(C81990e.f183486g, Long.valueOf(j4));
                    hashMap2.put(C81990e.f183490k, this.f183459d);
                    ((AbstractC89172b) t2.getSecond()).invoke(hashMap2);
                    z = true;
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public RunnableC81984a(C81987b bVar, C81989d dVar) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(dVar, "");
        this.f183461f = bVar;
        this.f183462g = dVar;
        ArrayList<AbstractC81992a> arrayList = new ArrayList<>();
        this.f183458c = arrayList;
        arrayList.add(new C81993b(this.f183460e, this.f183459d, (long) bVar.f183471c));
        arrayList.add(new C81995c(this.f183460e, this.f183459d, (long) bVar.f183472d));
    }
}
