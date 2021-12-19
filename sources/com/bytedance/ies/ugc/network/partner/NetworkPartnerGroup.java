package com.bytedance.ies.ugc.network.partner;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.network.partner.AbstractC18185b;
import com.bytedance.ies.ugc.network.partner.p1275a.C18184a;
import com.bytedance.ies.ugc.network.partner.p1276b.C18199f;
import com.bytedance.ies.ugc.network.partner.p1276b.C18201g;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.p2404bs.C34932b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class NetworkPartnerGroup {

    /* renamed from: a */
    public final List<AbstractC18185b.AbstractC18186a> f43289a;

    /* renamed from: b */
    public final List<AbstractC18185b.AbstractC18190e> f43290b;

    /* renamed from: c */
    public final List<AbstractC18185b.AbstractC18192f> f43291c;

    /* renamed from: d */
    public final List<AbstractC18185b.AbstractC18189d> f43292d;

    /* renamed from: e */
    public final List<AbstractC18185b.AbstractC18187b> f43293e;

    /* renamed from: f */
    public final StringBuilder f43294f;

    public static final class PartnerInterceptor implements AbstractC22021a {

        /* renamed from: c */
        public static final AbstractC89244h f43295c = C89250i.m154773a((AbstractC89171a) C18175b.f43303a);

        /* renamed from: d */
        public static final C18174a f43296d = new C18174a((byte) 0);

        /* renamed from: a */
        public List<? extends AbstractC18185b.AbstractC18187b> f43297a;

        /* renamed from: b */
        public final StringBuilder f43298b;

        /* renamed from: e */
        private final List<AbstractC18185b.AbstractC18186a> f43299e;

        /* renamed from: f */
        private final List<AbstractC18185b.AbstractC18190e> f43300f;

        /* renamed from: g */
        private final List<AbstractC18185b.AbstractC18192f> f43301g;

        /* renamed from: h */
        private final List<AbstractC18185b.AbstractC18189d> f43302h;

        /* renamed from: com.bytedance.ies.ugc.network.partner.NetworkPartnerGroup$PartnerInterceptor$a */
        public static final class C18174a {
            static {
                Covode.recordClassIndex(20830);
            }

            /* renamed from: a */
            public static Handler m33820a() {
                return (Handler) PartnerInterceptor.f43295c.getValue();
            }

            private C18174a() {
            }

            public /* synthetic */ C18174a(byte b) {
                this();
            }
        }

        /* renamed from: com.bytedance.ies.ugc.network.partner.NetworkPartnerGroup$PartnerInterceptor$b */
        static final class C18175b extends AbstractC89220m implements AbstractC89171a<Handler> {

            /* renamed from: a */
            public static final C18175b f43303a = new C18175b();

            static {
                Covode.recordClassIndex(20831);
            }

            C18175b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Handler invoke() {
                HandlerThread handlerThread = new HandlerThread("PartnerBystanderThread");
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.ies.ugc.network.partner.NetworkPartnerGroup$PartnerInterceptor$d */
        public static final class RunnableC18177d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ PartnerInterceptor f43306a;

            /* renamed from: b */
            final /* synthetic */ Request f43307b;

            /* renamed from: c */
            final /* synthetic */ C22099u f43308c;

            /* renamed from: d */
            final /* synthetic */ Throwable f43309d;

            static {
                Covode.recordClassIndex(20833);
            }

            RunnableC18177d(PartnerInterceptor partnerInterceptor, Request request, C22099u uVar, Throwable th) {
                this.f43306a = partnerInterceptor;
                this.f43307b = request;
                this.f43308c = uVar;
                this.f43309d = th;
            }

            public final void run() {
                try {
                    for (AbstractC18185b.AbstractC18187b bVar : this.f43306a.f43297a) {
                        bVar.mo29041c(this.f43307b);
                    }
                } catch (Throwable unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.ies.ugc.network.partner.NetworkPartnerGroup$PartnerInterceptor$e */
        public static final class RunnableC18178e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ PartnerInterceptor f43310a;

            /* renamed from: b */
            final /* synthetic */ Throwable f43311b;

            static {
                Covode.recordClassIndex(20834);
            }

            RunnableC18178e(PartnerInterceptor partnerInterceptor, Throwable th) {
                this.f43310a = partnerInterceptor;
                this.f43311b = th;
            }

            public final void run() {
                try {
                    for (AbstractC18185b.AbstractC18187b bVar : this.f43310a.f43297a) {
                        bVar.mo29039a(this.f43311b);
                    }
                } catch (Throwable unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.ies.ugc.network.partner.NetworkPartnerGroup$PartnerInterceptor$g */
        public static final class RunnableC18180g implements Runnable {

            /* renamed from: a */
            final /* synthetic */ PartnerInterceptor f43314a;

            /* renamed from: b */
            final /* synthetic */ Request f43315b;

            static {
                Covode.recordClassIndex(20836);
            }

            RunnableC18180g(PartnerInterceptor partnerInterceptor, Request request) {
                this.f43314a = partnerInterceptor;
                this.f43315b = request;
            }

            public final void run() {
                try {
                    for (AbstractC18185b.AbstractC18187b bVar : this.f43314a.f43297a) {
                        bVar.mo29040b(this.f43315b);
                    }
                } catch (Throwable unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.ies.ugc.network.partner.NetworkPartnerGroup$PartnerInterceptor$h */
        public static final class RunnableC18181h implements Runnable {

            /* renamed from: a */
            final /* synthetic */ PartnerInterceptor f43316a;

            /* renamed from: b */
            final /* synthetic */ C22099u f43317b;

            static {
                Covode.recordClassIndex(20837);
            }

            RunnableC18181h(PartnerInterceptor partnerInterceptor, C22099u uVar) {
                this.f43316a = partnerInterceptor;
                this.f43317b = uVar;
            }

            public final void run() {
                try {
                    for (AbstractC18185b.AbstractC18187b bVar : this.f43316a.f43297a) {
                        bVar.mo29038a(this.f43317b);
                    }
                } catch (Throwable unused) {
                }
            }
        }

        static {
            Covode.recordClassIndex(20829);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.ies.ugc.network.partner.NetworkPartnerGroup$PartnerInterceptor$f */
        public static final class RunnableC18179f implements Runnable {

            /* renamed from: a */
            final /* synthetic */ PartnerInterceptor f43312a;

            /* renamed from: b */
            final /* synthetic */ Request f43313b;

            static {
                Covode.recordClassIndex(20835);
            }

            RunnableC18179f(PartnerInterceptor partnerInterceptor, Request request) {
                this.f43312a = partnerInterceptor;
                this.f43313b = request;
            }

            public final void run() {
                boolean z;
                try {
                    for (AbstractC18185b.AbstractC18187b bVar : this.f43312a.f43297a) {
                        bVar.mo29037a(this.f43313b);
                    }
                } catch (Throwable th) {
                    try {
                        C12290b.m22066a("fix2160NPE", (JSONObject) null, (JSONObject) null, new JSONObject().put("path", this.f43313b.getPath()).put("e", th.getMessage()));
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.ies.ugc.network.partner.NetworkPartnerGroup$PartnerInterceptor$c */
        public static final class RunnableC18176c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f43304a;

            /* renamed from: b */
            final /* synthetic */ C18184a f43305b;

            static {
                Covode.recordClassIndex(20832);
            }

            RunnableC18176c(String str, C18184a aVar) {
                this.f43304a = str;
                this.f43305b = aVar;
            }

            public final void run() {
                String str = this.f43304a;
                C89219l.m154716b(str, "");
                C18184a aVar = this.f43305b;
                C89219l.m154721d(str, "");
                C89219l.m154721d(aVar, "");
                try {
                    aVar.f43329g.clear();
                    HashMap<String, Long> a = C18184a.m33825a(C18184a.m33825a(C18184a.m33825a(C18184a.m33825a(aVar.f43329g, aVar.f43325c), aVar.f43326d), aVar.f43327e), aVar.f43328f);
                    C89219l.m154721d(a, "");
                    long j = 0;
                    for (Map.Entry<String, Long> entry : a.entrySet()) {
                        j += entry.getValue().longValue();
                    }
                    JSONObject put = new JSONObject().put("all_handler_duration", j).put("chain_proceed_duration", aVar.f43323a).put("partner_interceptor_duration", aVar.f43324b).put("partner_interceptor_self_duration", aVar.f43324b - aVar.f43323a).put("partner_process_duration", (aVar.f43324b - j) - aVar.f43323a);
                    for (Map.Entry<String, Long> entry2 : aVar.f43325c.entrySet()) {
                        put.put(entry2.getKey() + '_' + "request" + "_duration", entry2.getValue().longValue());
                    }
                    for (Map.Entry<String, Long> entry3 : aVar.f43326d.entrySet()) {
                        put.put(entry3.getKey() + '_' + "response" + "_duration", entry3.getValue().longValue());
                    }
                    for (Map.Entry<String, Long> entry4 : aVar.f43327e.entrySet()) {
                        put.put(entry4.getKey() + '_' + "exception" + "_duration", entry4.getValue().longValue());
                    }
                    for (Map.Entry<String, Long> entry5 : aVar.f43328f.entrySet()) {
                        put.put(entry5.getKey() + '_' + "block" + "_duration", entry5.getValue().longValue());
                    }
                    C12290b.m22066a("network_partner_log", (JSONObject) null, put, new JSONObject().put("path", str));
                } catch (Throwable unused) {
                }
            }
        }

        /* renamed from: a */
        private final void m33818a(Throwable th) {
            C18174a.m33820a().post(new RunnableC18178e(this, th));
        }

        public PartnerInterceptor(NetworkPartnerGroup networkPartnerGroup) {
            boolean z;
            C89219l.m154721d(networkPartnerGroup, "");
            this.f43299e = new ArrayList(networkPartnerGroup.f43289a);
            this.f43300f = new ArrayList(networkPartnerGroup.f43290b);
            this.f43301g = new ArrayList(networkPartnerGroup.f43291c);
            this.f43302h = new ArrayList(networkPartnerGroup.f43292d);
            this.f43297a = new CopyOnWriteArrayList(networkPartnerGroup.f43293e);
            StringBuilder sb = new StringBuilder(networkPartnerGroup.f43294f);
            sb.append("PartnerInterceptor Bystanders, status={size: ").append(this.f43297a.size()).append(", data: [");
            for (Object obj : this.f43297a) {
                if (obj == null) {
                    z = true;
                } else {
                    z = false;
                }
                sb.append(z).append(",");
            }
            sb.append("]}\n");
            this.f43298b = sb;
        }

        @Override // com.bytedance.retrofit2.p1612c.AbstractC22021a
        public final C22099u intercept(AbstractC22021a.AbstractC22022a aVar) {
            if (!(aVar.mo35812c() instanceof C34932b)) {
                return m33816a(aVar);
            }
            C34932b bVar = (C34932b) aVar.mo35812c();
            if (bVar.f82415W > 0) {
                long uptimeMillis = SystemClock.uptimeMillis() - bVar.f82415W;
                bVar.mo61814a(bVar.f82417Y, uptimeMillis);
                bVar.mo61815b(bVar.f82417Y, uptimeMillis);
            }
            bVar.mo61813a(getClass().getSimpleName());
            bVar.f82415W = SystemClock.uptimeMillis();
            C22099u<?> a = m33816a(aVar);
            if (bVar.f82416X > 0) {
                long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f82416X;
                String simpleName = getClass().getSimpleName();
                bVar.mo61814a(simpleName, uptimeMillis2);
                bVar.mo61816c(simpleName, uptimeMillis2);
            }
            bVar.f82416X = SystemClock.uptimeMillis();
            return a;
        }

        /* renamed from: a */
        private C22099u<?> m33816a(AbstractC22021a.AbstractC22022a aVar) {
            Object obj;
            C89219l.m154721d(aVar, "");
            long uptimeMillis = SystemClock.uptimeMillis();
            Request a = aVar.mo35809a();
            C89219l.m154716b(a, "");
            C18199f fVar = new C18199f(a);
            C18182a aVar2 = new C18182a(aVar);
            C18184a aVar3 = aVar2.f43320c;
            try {
                C22099u<?> a2 = m33815a(fVar, aVar2);
                if (a2 != null) {
                    m33817a(a, a2, null);
                    return a2;
                }
                C18174a.m33820a().post(new RunnableC18179f(this, a));
                C18184a aVar4 = aVar2.f43320c;
                for (AbstractC18185b.AbstractC18190e eVar : this.f43300f) {
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    eVar.mo29043a(fVar, aVar2);
                    String a3 = eVar.mo29034a();
                    C89219l.m154721d(a3, "");
                    aVar4.f43325c.put(a3, Long.valueOf(C18184a.m33824a(SystemClock.uptimeMillis() - uptimeMillis2, aVar4.f43325c.get(a3))));
                }
                Request b = fVar.mo29059b();
                C22099u<?> b2 = m33819b(fVar, aVar2);
                if (b2 != null) {
                    m33817a(b, b2, null);
                    String path = b.getPath();
                    aVar3.f43324b = SystemClock.uptimeMillis() - uptimeMillis;
                    C18174a.m33820a().post(new RunnableC18176c(path, aVar3));
                    return b2;
                }
                C18174a.m33820a().post(new RunnableC18180g(this, b));
                long uptimeMillis3 = SystemClock.uptimeMillis();
                try {
                    obj = C89379q.m157068constructorimpl(aVar.mo35810a(b));
                } catch (Throwable th) {
                    obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
                aVar3.f43323a = SystemClock.uptimeMillis() - uptimeMillis3;
                Throwable r14 = C89379q.m157071exceptionOrNullimpl(obj);
                if (r14 != null) {
                    m33818a(r14);
                    C18199f fVar2 = new C18199f(b);
                    C18184a aVar5 = aVar2.f43320c;
                    boolean z = false;
                    for (AbstractC18185b.AbstractC18189d dVar : this.f43302h) {
                        long uptimeMillis4 = SystemClock.uptimeMillis();
                        if (z || dVar.mo29042a(fVar2, aVar2, r14, z)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String a4 = dVar.mo29034a();
                        C89219l.m154721d(a4, "");
                        aVar5.f43327e.put(a4, Long.valueOf(C18184a.m33824a(SystemClock.uptimeMillis() - uptimeMillis4, aVar5.f43327e.get(a4))));
                    }
                    if (!z) {
                        m33817a(b, null, r14);
                        throw r14;
                    }
                }
                C89382r.m154942a(obj);
                C22099u uVar = (C22099u) obj;
                C18174a.m33820a().post(new RunnableC18181h(this, uVar));
                C18201g<?> gVar = new C18201g<>(uVar);
                C18184a aVar6 = aVar2.f43320c;
                for (AbstractC18185b.AbstractC18192f fVar3 : this.f43301g) {
                    long uptimeMillis5 = SystemClock.uptimeMillis();
                    fVar3.mo29044a(gVar, aVar2);
                    String a5 = fVar3.mo29034a();
                    C89219l.m154721d(a5, "");
                    aVar6.f43326d.put(a5, Long.valueOf(C18184a.m33824a(SystemClock.uptimeMillis() - uptimeMillis5, aVar6.f43326d.get(a5))));
                }
                C22099u<?> a6 = gVar.mo29060a();
                m33817a(b, a6, null);
                String path2 = b.getPath();
                aVar3.f43324b = SystemClock.uptimeMillis() - uptimeMillis;
                C18174a.m33820a().post(new RunnableC18176c(path2, aVar3));
                return a6;
            } finally {
                String path3 = a.getPath();
                aVar3.f43324b = SystemClock.uptimeMillis() - uptimeMillis;
                C18174a.m33820a().post(new RunnableC18176c(path3, aVar3));
            }
        }

        /* renamed from: b */
        private final C22099u<?> m33819b(C18199f fVar, C18182a aVar) {
            C18184a aVar2 = aVar.f43320c;
            try {
                for (AbstractC18185b.AbstractC18186a aVar3 : this.f43299e) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    aVar3.mo29036b(fVar, aVar);
                    aVar2.mo29033a(aVar3.mo29034a(), SystemClock.uptimeMillis() - uptimeMillis);
                }
                return null;
            } catch (Throwable th) {
                Object r1 = C89379q.m157068constructorimpl(C89382r.m154941a(th));
                Throwable r0 = C89379q.m157071exceptionOrNullimpl(r1);
                if (r0 == null) {
                    return (C22099u) r1;
                }
                m33818a(r0);
                throw r0;
            }
        }

        /* renamed from: a */
        private final C22099u<?> m33815a(C18199f fVar, C18182a aVar) {
            C18184a aVar2 = aVar.f43320c;
            try {
                for (AbstractC18185b.AbstractC18186a aVar3 : this.f43299e) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    C22099u<?> a = aVar3.mo29035a(fVar, aVar);
                    aVar2.mo29033a(aVar3.mo29034a(), SystemClock.uptimeMillis() - uptimeMillis);
                    if (a != null) {
                        return a;
                    }
                }
                return null;
            } catch (Throwable th) {
                Object r1 = C89379q.m157068constructorimpl(C89382r.m154941a(th));
                Throwable r0 = C89379q.m157071exceptionOrNullimpl(r1);
                if (r0 == null) {
                    return (C22099u) r1;
                }
                m33818a(r0);
                throw r0;
            }
        }

        /* renamed from: a */
        private final void m33817a(Request request, C22099u<?> uVar, Throwable th) {
            C18174a.m33820a().post(new RunnableC18177d(this, request, uVar, th));
        }
    }

    static {
        Covode.recordClassIndex(20828);
    }

    /* renamed from: a */
    public final NetworkPartnerGroup mo29021a() {
        return new NetworkPartnerGroup(this);
    }

    public NetworkPartnerGroup() {
        this.f43289a = new ArrayList();
        this.f43290b = new ArrayList();
        this.f43291c = new ArrayList();
        this.f43292d = new ArrayList();
        this.f43293e = new ArrayList();
        this.f43294f = new StringBuilder();
    }

    /* renamed from: a */
    public final NetworkPartnerGroup mo29022a(NetworkPartnerGroup networkPartnerGroup) {
        C89219l.m154721d(networkPartnerGroup, "");
        this.f43289a.addAll(networkPartnerGroup.f43289a);
        this.f43290b.addAll(networkPartnerGroup.f43290b);
        this.f43291c.addAll(networkPartnerGroup.f43291c);
        this.f43292d.addAll(networkPartnerGroup.f43292d);
        this.f43293e.addAll(networkPartnerGroup.f43293e);
        this.f43294f.append((CharSequence) networkPartnerGroup.f43294f);
        return this;
    }

    private NetworkPartnerGroup(NetworkPartnerGroup networkPartnerGroup) {
        this();
        mo29022a(networkPartnerGroup);
        this.f43294f.append((CharSequence) networkPartnerGroup.f43294f);
        StringBuilder append = this.f43294f.append("extend from super Group, ");
        C89219l.m154716b(append, "");
        mo29024a(append).append("\n");
    }

    /* renamed from: a */
    public final NetworkPartnerGroup mo29023a(AbstractC18185b bVar) {
        C89219l.m154721d(bVar, "");
        if (bVar instanceof AbstractC18185b.AbstractC18187b) {
            StringBuilder append = this.f43294f.append("add bystander:");
            String a = bVar.mo29034a();
            if (a == null) {
                a = "null";
            }
            append.append(a).append("\n");
            this.f43293e.add(bVar);
            return this;
        }
        if (bVar instanceof AbstractC18185b.AbstractC18186a) {
            this.f43289a.add(bVar);
        }
        if (bVar instanceof AbstractC18185b.AbstractC18189d) {
            this.f43292d.add(bVar);
        }
        if (bVar instanceof AbstractC18185b.AbstractC18192f) {
            this.f43291c.add(bVar);
        }
        if (bVar instanceof AbstractC18185b.AbstractC18190e) {
            this.f43290b.add(bVar);
        }
        return this;
    }

    /* renamed from: a */
    public final StringBuilder mo29024a(StringBuilder sb) {
        boolean z;
        sb.append("status={size: ").append(this.f43293e.size()).append(", data: [");
        for (AbstractC18185b.AbstractC18187b bVar : this.f43293e) {
            if (bVar == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z).append(",");
        }
        StringBuilder append = sb.append("]}");
        C89219l.m154716b(append, "");
        return append;
    }
}
