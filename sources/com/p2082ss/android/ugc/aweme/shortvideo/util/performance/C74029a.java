package com.p2082ss.android.ugc.aweme.shortvideo.util.performance;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C74040v;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.performance.a */
public final class C74029a {

    /* renamed from: a */
    public static final C74029a f166159a = new C74029a();

    /* renamed from: b */
    private static final AbstractC89244h f166160b = C89250i.m154773a((AbstractC89171a) C74034e.f166169a);

    /* renamed from: c */
    private static final AbstractC89244h f166161c = C89250i.m154773a((AbstractC89171a) C74030a.f166164a);

    /* renamed from: d */
    private static final AbstractC89244h f166162d = C89250i.m154773a((AbstractC89171a) C74032c.f166167a);

    /* renamed from: e */
    private static final AbstractC89244h f166163e = C89250i.m154773a((AbstractC89171a) C74033d.f166168a);

    /* renamed from: a */
    static ICreativePerformanceMonitorService m130191a() {
        return (ICreativePerformanceMonitorService) f166161c.getValue();
    }

    /* renamed from: b */
    private static Handler m130193b() {
        return (Handler) f166160b.getValue();
    }

    /* renamed from: c */
    private static long m130194c() {
        return ((Number) f166162d.getValue()).longValue();
    }

    /* renamed from: d */
    private static boolean m130195d() {
        return ((Boolean) f166163e.getValue()).booleanValue();
    }

    private C74029a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.performance.a$a */
    static final class C74030a extends AbstractC89220m implements AbstractC89171a<ICreativePerformanceMonitorService> {

        /* renamed from: a */
        public static final C74030a f166164a = new C74030a();

        static {
            Covode.recordClassIndex(86782);
        }

        C74030a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ICreativePerformanceMonitorService invoke() {
            return AVExternalServiceImpl.m113114a().performanceMonitorService();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.performance.a$e */
    static final class C74034e extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C74034e f166169a = new C74034e();

        static {
            Covode.recordClassIndex(86786);
        }

        C74034e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(C74040v.m130196a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.performance.a$c */
    static final class C74032c extends AbstractC89220m implements AbstractC89171a<Long> {

        /* renamed from: a */
        public static final C74032c f166167a = new C74032c();

        static {
            Covode.recordClassIndex(86784);
        }

        C74032c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf(C16048b.m29633a().mo25413a(true, "creative_tools_monitor_performance_interval", 1000L));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.performance.a$d */
    static final class C74033d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C74033d f166168a = new C74033d();

        static {
            Covode.recordClassIndex(86785);
        }

        C74033d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C16048b.m29633a().mo25421a(true, "creative_tools_open_monitor_performance", false));
        }
    }

    static {
        Covode.recordClassIndex(86781);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.performance.a$b */
    public static final class RunnableC74031b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f166165a;

        /* renamed from: b */
        final /* synthetic */ Map f166166b;

        static {
            Covode.recordClassIndex(86783);
        }

        RunnableC74031b(String str, Map map) {
            this.f166165a = str;
            this.f166166b = map;
        }

        public final void run() {
            String str = this.f166165a;
            Map map = this.f166166b;
            Map<String, Double> cpuRate = C74029a.m130191a().getCpuRate();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C89041ag.m154411a(cpuRate.size()));
            for (T t : cpuRate.entrySet()) {
                linkedHashMap.put(t.getKey(), String.valueOf(((Number) t.getValue()).doubleValue()));
            }
            map.putAll(linkedHashMap);
            Map<String, Long> memory = C74029a.m130191a().getMemory();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C89041ag.m154411a(memory.size()));
            for (T t2 : memory.entrySet()) {
                linkedHashMap2.put(t2.getKey(), String.valueOf(((Number) t2.getValue()).longValue()));
            }
            map.putAll(linkedHashMap2);
            C80322d.m139251a(str, map);
        }
    }

    /* renamed from: a */
    public static void m130192a(String str, Map<String, String> map) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        if (m130195d()) {
            m130193b().postDelayed(new RunnableC74031b(str, map), m130194c());
        } else {
            C80322d.m139251a(str, map);
        }
    }
}
