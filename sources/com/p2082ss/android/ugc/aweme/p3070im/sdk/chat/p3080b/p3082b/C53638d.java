package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3082b;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.b.d */
public final class C53638d {

    /* renamed from: a */
    public static final AbstractC89244h f123064a = C89250i.m154773a((AbstractC89171a) C53639a.f123071a);

    /* renamed from: b */
    static final ConcurrentHashMap<String, List<C53643f>> f123065b = new ConcurrentHashMap<>();

    /* renamed from: c */
    static Map<String, C53643f> f123066c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final C53638d f123067d = new C53638d();

    /* renamed from: e */
    private static int f123068e = Math.max(6, Runtime.getRuntime().availableProcessors());

    /* renamed from: f */
    private static final ExecutorService f123069f;

    /* renamed from: g */
    private static final AbstractC89244h f123070g = C89250i.m154773a((AbstractC89171a) C53640b.f123072a);

    private C53638d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.b.d$a */
    static final class C53639a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C53639a f123071a = new C53639a();

        static {
            Covode.recordClassIndex(63219);
        }

        C53639a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C53637c.m98894a().f123056a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.b.d$b */
    static final class C53640b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C53640b f123072a = new C53640b();

        static {
            Covode.recordClassIndex(63220);
        }

        C53640b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C53637c.m98894a().f123057b);
        }
    }

    static {
        Covode.recordClassIndex(63218);
        int i = f123068e;
        f123069f = new ThreadPoolExecutor(i, i, 30, TimeUnit.SECONDS, new PriorityBlockingQueue());
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.b.d$c */
    public static final class C53641c implements AbstractC53642e {

        /* renamed from: a */
        final /* synthetic */ C53643f f123073a;

        static {
            Covode.recordClassIndex(63221);
        }

        C53641c(C53643f fVar) {
            this.f123073a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3082b.AbstractC53642e
        /* renamed from: a */
        public final void mo90204a(C53646h hVar) {
            C89219l.m154721d(hVar, "");
            hVar.f123084b = 2;
            C53643f fVar = this.f123073a;
            C19538ai aiVar = fVar.f123074a.get();
            if (aiVar != null) {
                C89219l.m154716b(aiVar, "");
                List<C53646h> list = fVar.f123075b;
                ArrayList arrayList = new ArrayList();
                for (T t : list) {
                    if (t.f123084b != 2) {
                        arrayList.add(t);
                    }
                }
                if (arrayList.isEmpty()) {
                    C53638d.f123066c.remove(aiVar.getUuid());
                    List<C53643f> list2 = C53638d.f123065b.get(aiVar.getConversationId());
                    if (list2 != null) {
                        list2.remove(fVar);
                    }
                    aiVar.getUuid();
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m98896a(C53643f fVar) {
        C19538ai aiVar = fVar.f123074a.get();
        if (aiVar == null) {
            return false;
        }
        C89219l.m154716b(aiVar, "");
        if (f123066c.get(aiVar.getUuid()) == null) {
            Map<String, C53643f> map = f123066c;
            String uuid = aiVar.getUuid();
            C89219l.m154716b(uuid, "");
            map.put(uuid, fVar);
            aiVar.getUuid();
            f123069f.execute(new RunnableC53645g(fVar, new C53641c(fVar)));
            return true;
        }
        C56244a.m102190b("MediaPreloader", "tryDownloadImage " + aiVar.getUuid() + " job exists");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062 A[LOOP:1: B:17:0x005c->B:19:0x0062, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m98897b(java.util.List<com.bytedance.p1399im.core.p1408d.C19538ai> r8) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3082b.C53638d.m98897b(java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e0, code lost:
        if (com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55225q.m100991b(r4.getImageType()) == false) goto L_0x010e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fc A[LOOP:3: B:44:0x00f6->B:46:0x00fc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0016 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m98895a(java.util.List<com.bytedance.p1399im.core.p1408d.C19538ai> r14) {
        /*
        // Method dump skipped, instructions count: 291
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3082b.C53638d.m98895a(java.util.List):void");
    }
}
