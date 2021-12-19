package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.net.C39151f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p2401bq.p2402a.C34908a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c.C55066d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c.C55072j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55219n;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55257a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55273c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.model.C55842a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.model.C55843b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.model.RelationFetchResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.p3228a.EnumC55835a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3222a.C55729a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.b */
public final class C55836b implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public static final C55836b f127270a;

    /* renamed from: b */
    private static final AbstractC89244h f127271b = C89250i.m154773a((AbstractC89171a) C55839c.f127280a);

    /* renamed from: c */
    private static volatile boolean f127272c;

    /* renamed from: d */
    private static volatile boolean f127273d;

    /* renamed from: e */
    private static final AbstractC89244h f127274e = C89250i.m154773a((AbstractC89171a) C55837a.f127276a);

    /* renamed from: f */
    private static final AbstractC89244h f127275f = C89250i.m154773a((AbstractC89171a) C55840d.f127281a);

    /* renamed from: a */
    private static C55072j m101601a() {
        return (C55072j) f127271b.getValue();
    }

    /* renamed from: b */
    private static ReentrantLock m101611b() {
        return (ReentrantLock) f127274e.getValue();
    }

    /* renamed from: c */
    private static List<EnumC55835a> m101612c() {
        return (List) f127275f.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(178, new RunnableC90250g(C55836b.class, "onEvent", C39151f.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    private C55836b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.b$a */
    static final class C55837a extends AbstractC89220m implements AbstractC89171a<ReentrantLock> {

        /* renamed from: a */
        public static final C55837a f127276a = new C55837a();

        static {
            Covode.recordClassIndex(65624);
        }

        C55837a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ReentrantLock invoke() {
            return new ReentrantLock();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.b$c */
    static final class C55839c extends AbstractC89220m implements AbstractC89171a<C55072j> {

        /* renamed from: a */
        public static final C55839c f127280a = new C55839c();

        static {
            Covode.recordClassIndex(65626);
        }

        C55839c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C55072j invoke() {
            return C55066d.m100705a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.b$d */
    static final class C55840d extends AbstractC89220m implements AbstractC89171a<List<EnumC55835a>> {

        /* renamed from: a */
        public static final C55840d f127281a = new C55840d();

        static {
            Covode.recordClassIndex(65627);
        }

        C55840d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<EnumC55835a> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: d */
    private static boolean m101613d() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: e */
    private static boolean m101614e() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean d = m101613d();
        C58029j.f132256h = d;
        return d;
    }

    static {
        Covode.recordClassIndex(65623);
        C55836b bVar = new C55836b();
        f127270a = bVar;
        EventBus.m156966a(EventBus.m156962a(), bVar);
    }

    /* renamed from: a */
    public static void m101606a(String str) {
        C56244a.m102191c("RelationFetchManager", str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.b$b */
    public static final class C55838b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f127277a;

        /* renamed from: b */
        final /* synthetic */ EnumC55835a f127278b;

        /* renamed from: c */
        final /* synthetic */ boolean f127279c;

        static {
            Covode.recordClassIndex(65625);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55838b(EnumC55835a aVar, boolean z, AbstractC89124d dVar) {
            super(2, dVar);
            this.f127278b = aVar;
            this.f127279c = z;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C55838b(this.f127278b, this.f127279c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C55838b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            boolean z;
            if (this.f127277a == 0) {
                C89382r.m154942a(obj);
                try {
                    boolean b = C55836b.f127270a.mo92670b(this.f127278b, this.f127279c);
                    StringBuilder append = new StringBuilder("fetchRelationAsync [").append(this.f127278b).append("]: result=");
                    if (b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C55836b.m101606a(append.append(z).toString());
                } catch (Exception e) {
                    C55836b.m101606a("fetchRelationAsync [" + this.f127278b + "]: error=" + e.getMessage());
                }
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public static boolean m101607a(EnumC55835a aVar) {
        boolean z;
        long b = m101609b(aVar);
        long a = m101601a().mo91987a(aVar);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b >= 1000 * a) {
            z = true;
        } else {
            z = false;
        }
        C56244a.m102191c("RelationFetchManager", "checkFrequencyByFetchScene [" + aVar + "] " + z + ": [" + currentTimeMillis + ", " + b + ", " + a + "] ");
        return z;
    }

    /* renamed from: b */
    private static long m101609b(EnumC55835a aVar) {
        int i = C55841c.f127282a[aVar.ordinal()];
        if (i == 1) {
            C55219n a = C55219n.m100965a();
            C89219l.m154716b(a, "");
            return a.mo92208e();
        } else if (i == 2) {
            C55219n a2 = C55219n.m100965a();
            C89219l.m154716b(a2, "");
            return a2.mo92209f();
        } else if (i == 3) {
            C55219n a3 = C55219n.m100965a();
            C89219l.m154716b(a3, "");
            return a3.mo92210g();
        } else if (i == 4) {
            C55219n a4 = C55219n.m100965a();
            C89219l.m154716b(a4, "");
            return a4.mo92211h();
        } else if (i != 5) {
            return Long.MAX_VALUE;
        } else {
            C55219n a5 = C55219n.m100965a();
            C89219l.m154716b(a5, "");
            return a5.mo92212i();
        }
    }

    @AbstractC90264r
    public final void onEvent(C39151f fVar) {
        MethodCollector.m26663i(4874);
        if (C55197c.m100917a()) {
            C17867d.m33078a();
            EnumC55835a aVar = null;
            if (m101614e() && this != null) {
                synchronized (m101612c()) {
                    try {
                        C56244a.m102191c("RelationFetchManager", "bookNextFetchTask task=" + m101612c());
                        if (!m101612c().isEmpty()) {
                            if (m101612c().contains(EnumC55835a.COLDUP_FULL)) {
                                aVar = EnumC55835a.COLDUP_FULL;
                            } else if (m101612c().contains(EnumC55835a.COLDUP_DIFF)) {
                                aVar = EnumC55835a.COLDUP_DIFF;
                            } else {
                                aVar = m101612c().get(0);
                            }
                        }
                        m101612c().clear();
                    } catch (Throwable th) {
                        MethodCollector.m26664o(4874);
                        throw th;
                    }
                }
                if (aVar != null) {
                    m101604a(aVar, false);
                    MethodCollector.m26664o(4874);
                    return;
                }
                MethodCollector.m26664o(4874);
                return;
            }
        }
        MethodCollector.m26664o(4874);
    }

    /* renamed from: a */
    private final void m101605a(C55843b bVar) {
        C55219n a = C55219n.m100965a();
        C89219l.m154716b(a, "");
        List<C55842a> j = a.mo92213j();
        C89219l.m154716b(j, "");
        C56244a.m102191c("RelationFetchManager", "checkFetchResult start, localPageList=" + j.size());
        if (bVar.f127286a) {
            ListIterator<C55842a> listIterator = j.listIterator();
            while (listIterator.hasNext()) {
                C55842a next = listIterator.next();
                listIterator.remove();
                if (next.f127284a > 0 && next.f127284a > next.f127285b && !m101602a(EnumC55835a.MISSING_PAGE, next.f127284a, next.f127285b).f127286a) {
                    break;
                }
            }
        } else if (bVar.f127288c > bVar.f127294i) {
            j.add(new C55842a(bVar.f127288c, bVar.f127294i));
        }
        C55219n.m100965a().mo92204a(j);
        C89219l.m154716b(C55273c.m101041a(), "");
        C56244a.m102191c("RelationFetchManager", "checkFetchResult end, localPageList=" + j.size() + ", dbSize=" + C55273c.m101063j());
    }

    /* renamed from: a */
    public static void m101604a(EnumC55835a aVar, boolean z) {
        if (!C80580in.m139687c()) {
            C56244a.m102191c("RelationFetchManager", "fetchRelationAsync [" + aVar + "] start: forceClear=" + z);
            AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89546bf.f203266a), null, null, new C55838b(aVar, z, null), 3);
        }
    }

    /* renamed from: a */
    private static List<IMUser> m101603a(List<IMUser> list, List<C34908a> list2) {
        boolean z;
        long j;
        long j2;
        long j3;
        Long l;
        HashMap hashMap = new HashMap();
        if (list2 != null) {
            for (T t : list2) {
                String str = t.f82361a;
                HashMap hashMap2 = new HashMap();
                for (T t2 : t.f82362b) {
                    hashMap2.put(Long.valueOf(t2.f82363a), Long.valueOf(t2.f82364b));
                }
                hashMap.put(str, hashMap2);
            }
        }
        if (list != null) {
            for (T t3 : list) {
                HashMap hashMap3 = (HashMap) hashMap.get(t3.getUid());
                if (hashMap3 != null) {
                    Long l2 = (Long) hashMap3.get(3L);
                    long j4 = 0;
                    if ((l2 != null && l2.longValue() == 0) || ((l = (Long) hashMap3.get(6L)) != null && l.longValue() == 0)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    t3.setMentionEnabled(z);
                    Long l3 = (Long) hashMap3.get(3L);
                    if (l3 != null) {
                        j = l3.longValue();
                    } else {
                        j = 0;
                    }
                    t3.setCommentMentionBlockStatus(j);
                    Long l4 = (Long) hashMap3.get(4L);
                    if (l4 != null) {
                        j2 = l4.longValue();
                    } else {
                        j2 = 0;
                    }
                    t3.setVideoTagBlockStatus(j2);
                    Long l5 = (Long) hashMap3.get(5L);
                    if (l5 != null) {
                        j3 = l5.longValue();
                    } else {
                        j3 = 0;
                    }
                    t3.setQaInviteBlockStatus(j3);
                    Long l6 = (Long) hashMap3.get(6L);
                    if (l6 != null) {
                        j4 = l6.longValue();
                    }
                    t3.setVideoMentionBlockStatus(j4);
                }
            }
        }
        return list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0146, code lost:
        if (r5 != false) goto L_0x0084;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo92670b(com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.p3228a.EnumC55835a r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 782
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.C55836b.mo92670b(com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a, boolean):boolean");
    }

    /* renamed from: b */
    private static RelationFetchResponse m101610b(EnumC55835a aVar, long j, long j2) {
        EnumC55835a aVar2;
        int i;
        Throwable th;
        RelationFetchResponse relationFetchResponse = null;
        if (C80580in.m139687c()) {
            C56244a.m102191c("RelationFetchManager", "doRealNetworkRequest cancel because isChildrenMode=true");
            return null;
        }
        C56244a.m102191c("RelationFetchManager", "doRealNetworkRequest [" + aVar + "] [" + j + ", " + j2 + "] start");
        if (aVar == EnumC55835a.LOADER_DIFF) {
            aVar2 = EnumC55835a.COLDUP_DIFF;
        } else {
            aVar2 = aVar;
        }
        int i2 = 0;
        while (!f127273d) {
            try {
                i = 2;
                try {
                    return C55257a.f126351a.getSpotlightRelation(100, aVar2.getValue(), 1, j, j2, 0, C55729a.m101483a()).get();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                i = 2;
                StringBuilder append = new StringBuilder("fetchScene=").append(aVar).append(", retryTimes= ").append(i2).append(", error=");
                String message = th.getMessage();
                if (message == null) {
                    message = "null stack message";
                }
                String sb = append.append(message).toString();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("error", Integer.valueOf(i));
                linkedHashMap.put("error_stack", sb);
                C55197c.m100920b("spotlight_relation_load_error_new", linkedHashMap);
                C56244a.m102191c("RelationFetchManager", "monitorNetworkRequestError: errorStack=".concat(String.valueOf(sb)));
                C56244a.m102187a("RelationFetchManager", th);
                i2++;
                relationFetchResponse = null;
                if (i2 >= 2) {
                    return relationFetchResponse;
                }
            }
        }
        return relationFetchResponse;
    }

    /* renamed from: a */
    private final C55843b m101602a(EnumC55835a aVar, long j, long j2) {
        boolean z;
        RelationFetchResponse b;
        boolean z2;
        String str;
        C56244a.m102191c("RelationFetchManager", "doRealFetchAndDBUpdate [" + aVar + "] [" + j + ", " + j2 + "] start");
        C55843b bVar = new C55843b(aVar, j, j2);
        boolean z3 = true;
        long j3 = j;
        boolean z4 = true;
        while (true) {
            if (f127273d || !C55197c.m100917a() || (b = m101610b(aVar, j3, j2)) == null) {
                break;
            }
            if (b.getHasMore() == z3) {
                z2 = true;
            } else {
                z2 = false;
            }
            j3 = b.getMinTime();
            BaseResponse.ServerTimeExtra serverTimeExtra = b.extra;
            if (!(serverTimeExtra == null || (str = serverTimeExtra.logid) == null)) {
                bVar.mo92703a().add(str);
            }
            List<IMUser> followings = b.getFollowings();
            if (followings == null || followings.isEmpty()) {
                break;
            }
            bVar.f127289d += b.getFollowings().size();
            if (z4 && EnumC55835a.COLDUP_FULL == aVar) {
                C55273c.m101041a();
                C55273c.m101060g();
                z4 = false;
            }
            if (!C55729a.m101483a()) {
                if (!m101608a(aVar, b.getFollowings(), false)) {
                    break;
                }
            } else if (!m101608a(aVar, m101603a(b.getFollowings(), b.getBlockResults()), z3)) {
                break;
            } else {
                C55729a.m101482a(0);
            }
            bVar.f127290e = bVar.f127289d;
            int i = bVar.f127291f;
            int i2 = z3 ? 1 : 0;
            int i3 = z3 ? 1 : 0;
            int i4 = z3 ? 1 : 0;
            bVar.f127291f = i + i2;
            bVar.f127287b = Math.max(bVar.f127287b, b.getMaxTime());
            bVar.f127288c = b.getMinTime();
            if (bVar.f127291f <= 200) {
                z3 = true;
                if (!z2) {
                    break;
                }
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("error", 1);
                linkedHashMap.put("error_stack", bVar.toString());
                C55197c.m100920b("spotlight_relation_load_error_new", linkedHashMap);
                C56244a.m102191c("RelationFetchManager", "monitorTooManyLoadError: errorStack=".concat(String.valueOf(bVar)));
                break;
            }
        }
        if (!z2) {
            if (bVar.f127289d == bVar.f127290e) {
                z = true;
                bVar.f127286a = z;
                C56244a.m102191c("RelationFetchManager", "doRealFetchAndDBUpdate [" + aVar + "] [" + j + ", " + j2 + "] end: result=" + bVar);
                return bVar;
            }
        }
        z = false;
        bVar.f127286a = z;
        C56244a.m102191c("RelationFetchManager", "doRealFetchAndDBUpdate [" + aVar + "] [" + j + ", " + j2 + "] end: result=" + bVar);
        return bVar;
    }

    /* renamed from: a */
    private static boolean m101608a(EnumC55835a aVar, List<IMUser> list, boolean z) {
        Integer num;
        StringBuilder append = new StringBuilder("doRealDBUpdate [").append(aVar).append("] start: result=");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        C56244a.m102191c("RelationFetchManager", append.append(num).append(' ').toString());
        if (list == null || list.isEmpty()) {
            return false;
        }
        int i = 0;
        while (!f127273d) {
            if (z) {
                try {
                    C55273c.m101041a();
                    C55273c.m101049a(list);
                } catch (Throwable th) {
                    StringBuilder append2 = new StringBuilder("fetchScene=").append(aVar).append(", retryTimes= ").append(i).append(", error=");
                    String message = th.getMessage();
                    if (message == null) {
                        message = "null stack message";
                    }
                    String sb = append2.append(message).toString();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("error", 3);
                    linkedHashMap.put("error_stack", sb);
                    C55197c.m100920b("spotlight_relation_load_error_new", linkedHashMap);
                    C56244a.m102191c("RelationFetchManager", "monitorDBUpdateError: errorStack=".concat(String.valueOf(sb)));
                    C56244a.m102187a("RelationFetchManager", th);
                    i++;
                    if (i >= 2) {
                        break;
                    }
                }
            } else {
                C55273c.m101041a();
                C55273c.m101052b(list);
            }
            return true;
        }
        return false;
    }
}
