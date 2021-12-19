package com.p2082ss.ttvideoengine.p4418k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ttvideoengine.p4430s.C86631b;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.concurrent.Future;

/* renamed from: com.ss.ttvideoengine.k.g */
public class C86552g extends C86541a {

    /* renamed from: f */
    public InetAddress f195007f;

    /* renamed from: g */
    public boolean f195008g;

    /* renamed from: h */
    private Future f195009h;

    static {
        Covode.recordClassIndex(101780);
    }

    @Override // com.p2082ss.ttvideoengine.p4418k.C86541a
    /* renamed from: c */
    public final void mo137806c() {
        if (!this.f194974b) {
            this.f194974b = true;
            Future future = this.f195009h;
            if (future != null) {
                future.cancel(true);
                this.f195009h = null;
            }
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4418k.C86541a
    /* renamed from: d */
    public final void mo137808d() {
        super.mo137808d();
        this.f194974b = true;
        Future future = this.f195009h;
        if (future != null) {
            future.cancel(true);
            this.f195009h = null;
        }
    }

    /* renamed from: com.ss.ttvideoengine.k.g$a */
    static class RunnableC86554a implements Runnable {

        /* renamed from: a */
        private final WeakReference<C86552g> f195011a;

        static {
            Covode.recordClassIndex(101782);
        }

        public final void run() {
            MethodCollector.m26663i(5200);
            C86552g gVar = this.f195011a.get();
            if (gVar == null) {
                MethodCollector.m26664o(5200);
                return;
            }
            synchronized (C86552g.class) {
                try {
                    if (!gVar.f195008g) {
                        gVar.f195008g = true;
                        gVar.mo137807c(new C86633c("kTTVideoErrorDomainLocalDNS", -10000));
                    }
                } finally {
                    MethodCollector.m26664o(5200);
                }
            }
        }

        public RunnableC86554a(C86552g gVar) {
            this.f195011a = new WeakReference<>(gVar);
        }
    }

    @Override // com.p2082ss.ttvideoengine.p4418k.C86541a
    /* renamed from: b */
    public final void mo137804b() {
        try {
            this.f195009h = C86631b.m150044a(new Runnable() {
                /* class com.p2082ss.ttvideoengine.p4418k.C86552g.RunnableC865531 */

                static {
                    Covode.recordClassIndex(101781);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
                    if (r4 != null) goto L_0x0079;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
                    r8.f195010a.mo137807c(new com.p2082ss.ttvideoengine.p4430s.C86633c("kTTVideoErrorDomainLocalDNS", -9997));
                    com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(6402);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
                    return;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
                    r3 = new org.json.JSONObject();
                    r1 = new org.json.JSONArray();
                    r1.put(r4);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
                    r3.put("ips", r1);
                    r3.put("time", java.lang.System.currentTimeMillis());
                    r3.put("dns_type", "localDNS");
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 218
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ttvideoengine.p4418k.C86552g.RunnableC865531.run():void");
                }
            });
        } catch (Exception e) {
            mo137807c(new C86633c("kTTVideoErrorDomainLocalDNS", -9968, e.getMessage()));
        }
        this.f194973a.postDelayed(new RunnableC86554a(this), 10000);
    }

    public C86552g(String str) {
        super(str);
        C86641i.m150110a("LocalDNS", "DNS use LocalDNS");
    }
}
