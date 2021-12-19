package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e;

import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2304af.C33429a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55273c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3259i.AbstractC56230a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlinx.coroutines.AbstractC89507ah;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.android.AbstractC89522b;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.g */
public final class C55085g {

    /* renamed from: a */
    static final AbstractC89522b f126064a = C33429a.f79465a;

    /* renamed from: b */
    public static final C55085g f126065b = new C55085g();

    /* renamed from: c */
    private static final AbstractC89244h f126066c = C89250i.m154773a((AbstractC89171a) C55091d.f126084a);

    /* renamed from: d */
    private static final AbstractC89244h f126067d = C89250i.m154773a((AbstractC89171a) C55094g.f126087a);

    /* renamed from: e */
    private static final AbstractC89244h f126068e = C89250i.m154773a((AbstractC89171a) C55089b.f126082a);

    /* renamed from: f */
    private static final AbstractC89507ah f126069f;

    /* renamed from: g */
    private static AbstractC89516am f126070g;

    /* renamed from: h */
    private static final AbstractC89244h f126071h = C89250i.m154773a((AbstractC89171a) C55090c.f126083a);

    /* renamed from: a */
    public static Set<String> m100754a() {
        return (Set) f126068e.getValue();
    }

    /* renamed from: b */
    public static Set<String> m100759b() {
        return (Set) f126071h.getValue();
    }

    /* renamed from: d */
    private static LruCache<String, IMUser> m100765d() {
        return (LruCache) f126066c.getValue();
    }

    /* renamed from: e */
    private static LruCache<String, IMUser> m100766e() {
        return (LruCache) f126067d.getValue();
    }

    private C55085g() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.g$b */
    static final class C55089b extends AbstractC89220m implements AbstractC89171a<Set<String>> {

        /* renamed from: a */
        public static final C55089b f126082a = new C55089b();

        static {
            Covode.recordClassIndex(64817);
        }

        C55089b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Set<String> invoke() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.g$c */
    static final class C55090c extends AbstractC89220m implements AbstractC89171a<Set<String>> {

        /* renamed from: a */
        public static final C55090c f126083a = new C55090c();

        static {
            Covode.recordClassIndex(64818);
        }

        C55090c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Set<String> invoke() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.g$d */
    static final class C55091d extends AbstractC89220m implements AbstractC89171a<LruCache<String, IMUser>> {

        /* renamed from: a */
        public static final C55091d f126084a = new C55091d();

        static {
            Covode.recordClassIndex(64819);
        }

        C55091d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LruCache<String, IMUser> invoke() {
            return new LruCache(1000);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.g$g */
    static final class C55094g extends AbstractC89220m implements AbstractC89171a<LruCache<String, IMUser>> {

        /* renamed from: a */
        public static final C55094g f126087a = new C55094g();

        static {
            Covode.recordClassIndex(64822);
        }

        C55094g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LruCache<String, IMUser> invoke() {
            return new LruCache(1000);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.g$e */
    public static final class CallableC55092e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ List f126085a;

        static {
            Covode.recordClassIndex(64820);
        }

        CallableC55092e(List list) {
            this.f126085a = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            List list = this.f126085a;
            C55273c.m101041a();
            C55273c.m101052b(list);
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    public static final void m100762c() {
        m100765d().evictAll();
        m100766e().evictAll();
        C89517an.m155450b(f126070g);
        f126070g = C89517an.m155448a(f126069f);
    }

    static {
        Covode.recordClassIndex(64813);
        AbstractC89507ah ahVar = C89546bf.f203267b;
        f126069f = ahVar;
        f126070g = C89517an.m155448a(ahVar);
    }

    /* renamed from: a */
    public static final AbstractC88412b m100752a(IMUser iMUser) {
        if (iMUser != null) {
            return m100758b(C89070n.m154516a(iMUser));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.g$a */
    public static final class C55086a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f126072a;

        /* renamed from: b */
        final /* synthetic */ String f126073b;

        /* renamed from: c */
        final /* synthetic */ String f126074c;

        /* renamed from: d */
        final /* synthetic */ AbstractC56230a f126075d;

        static {
            Covode.recordClassIndex(64814);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55086a(String str, String str2, AbstractC56230a aVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f126073b = str;
            this.f126074c = str2;
            this.f126075d = aVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C55086a(this.f126073b, this.f126074c, this.f126075d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C55086a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.g$a$a */
        public static final class C55088a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

            /* renamed from: a */
            int f126079a;

            /* renamed from: b */
            final /* synthetic */ C55086a f126080b;

            /* renamed from: c */
            final /* synthetic */ Exception f126081c;

            static {
                Covode.recordClassIndex(64816);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C55088a(C55086a aVar, Exception exc, AbstractC89124d dVar) {
                super(2, dVar);
                this.f126080b = aVar;
                this.f126081c = exc;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C55088a(this.f126080b, this.f126081c, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                return ((C55088a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                if (this.f126079a == 0) {
                    C89382r.m154942a(obj);
                    AbstractC56230a aVar = this.f126080b.f126075d;
                    if (aVar == null) {
                        return null;
                    }
                    aVar.mo91086a(this.f126081c);
                    return C89391z.f203057a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0065 A[SYNTHETIC, Splitter:B:25:0x0065] */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
            // Method dump skipped, instructions count: 453
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g.C55086a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.g$f */
    public static final class C55093f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ List f126086a;

        static {
            Covode.recordClassIndex(64821);
        }

        C55093f(List list) {
            this.f126086a = list;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            for (T t : this.f126086a) {
                AbstractC81915c.m141874a(new C55120m(t.getUid(), t.getSecUid()));
            }
        }
    }

    /* renamed from: a */
    private final IMUser m100750a(String str) {
        IMUser iMUser = m100766e().get(str);
        if (iMUser != null) {
            C56244a.m102190b("IMUserRepository", "getLocalUserWithUid in cache");
            return iMUser;
        }
        C55273c.m101041a();
        IMUser a = C55273c.m101043a(str);
        if (a != null) {
            C56244a.m102190b("IMUserRepository", "getLocalUserWithUid in db");
            m100760b(a);
            return a;
        }
        C56244a.m102190b("IMUserRepository", "getLocalUserWithUid in none");
        return null;
    }

    /* renamed from: b */
    private final IMUser m100756b(String str) {
        IMUser iMUser = m100765d().get(str);
        if (iMUser != null) {
            C56244a.m102190b("IMUserRepository", "getLocalUserWithSecUid in cache");
            return iMUser;
        }
        C55273c.m101041a();
        IMUser b = C55273c.m101050b(str);
        if (b != null) {
            C56244a.m102190b("IMUserRepository", "getLocalUserWithSecUid in db");
            m100760b(b);
            return b;
        }
        C56244a.m102190b("IMUserRepository", "getLocalUsgetLocalUserWithSecUiderWithUid in none");
        return null;
    }

    /* renamed from: c */
    private static void m100764c(List<? extends IMUser> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            m100760b((IMUser) it.next());
        }
    }

    /* renamed from: b */
    private static AbstractC88412b m100758b(List<? extends IMUser> list) {
        if (list == null) {
            return null;
        }
        m100764c(list);
        return AbstractC88403ab.m153604a((Callable) new CallableC55092e(list)).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142929d(new C55093f(list));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v39, resolved type: android.util.LruCache<java.lang.String, com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX DEBUG: Multi-variable search result rejected for r0v41, resolved type: android.util.LruCache<java.lang.String, com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static List<IMUser> m100753a(List<C89378p<String, String>> list) {
        Object obj;
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        ArrayList<C89378p> arrayList2 = new ArrayList();
        for (T t : list) {
            Object first = t.getFirst();
            Object second = t.getSecond();
            if ((first == null || (obj = m100766e().get(first)) == null) && (second == null || (obj = m100765d().get(second)) == null)) {
                arrayList2.add(t);
            } else {
                arrayList.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList();
        for (C89378p pVar : arrayList2) {
            Object first2 = pVar.getFirst();
            if (first2 != null) {
                arrayList3.add(first2);
            }
        }
        C55273c.m101041a();
        List<IMUser> a = C55273c.m101045a("uid", arrayList3, -1, -1);
        C89219l.m154716b(a, "");
        arrayList.addAll(a);
        if (a.size() == arrayList2.size()) {
            return arrayList;
        }
        ArrayList arrayList4 = new ArrayList(C89070n.m154526a((Iterable) a, 10));
        for (T t2 : a) {
            C89219l.m154716b(t2, "");
            arrayList4.add(t2.getUid());
        }
        Set l = C89070n.m154592l(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!l.contains(((C89378p) obj2).getFirst())) {
                arrayList5.add(obj2);
            }
        }
        ArrayList<C89378p> arrayList6 = arrayList5;
        ArrayList arrayList7 = new ArrayList();
        for (C89378p pVar2 : arrayList6) {
            Object second2 = pVar2.getSecond();
            if (second2 != null) {
                arrayList7.add(second2);
            }
        }
        C55273c.m101041a();
        List<IMUser> a2 = C55273c.m101046a(arrayList7, -1, -1);
        C89219l.m154716b(a2, "");
        arrayList.addAll(a2);
        if (a2.size() == arrayList6.size()) {
            return arrayList;
        }
        ArrayList arrayList8 = new ArrayList(C89070n.m154526a((Iterable) a2, 10));
        for (T t3 : a2) {
            C89219l.m154716b(t3, "");
            arrayList8.add(t3.getSecUid());
        }
        Set l2 = C89070n.m154592l(arrayList8);
        ArrayList<C89378p> arrayList9 = new ArrayList();
        for (Object obj3 : arrayList6) {
            if (!l2.contains(((C89378p) obj3).getSecond())) {
                arrayList9.add(obj3);
            }
        }
        for (C89378p pVar3 : arrayList9) {
            m100763c((String) pVar3.getFirst(), (String) pVar3.getSecond(), null);
        }
        return arrayList;
    }

    /* renamed from: b */
    private static void m100760b(IMUser iMUser) {
        if (iMUser != null) {
            String secUid = iMUser.getSecUid();
            if (!(secUid == null || secUid.length() == 0)) {
                m100765d().put(iMUser.getSecUid(), iMUser);
            }
            String uid = iMUser.getUid();
            if (uid != null && uid.length() != 0) {
                m100766e().put(iMUser.getUid(), iMUser);
            }
        }
    }

    /* renamed from: a */
    public static final IMUser m100751a(String str, String str2) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (str2 == null || str2.length() == 0)) {
            return null;
        }
        IMUser b = m100757b(str, str2);
        if (b != null) {
            return b;
        }
        m100763c(str, str2, null);
        return null;
    }

    /* renamed from: b */
    public static final IMUser m100757b(String str, String str2) {
        if (str != null && str.length() != 0) {
            return f126065b.m100750a(str);
        }
        if (str2 != null && str2.length() != 0) {
            return f126065b.m100756b(str2);
        }
        C56244a.m102191c("IMUserRepository", "Could not get user because both uid are null");
        return null;
    }

    /* renamed from: b */
    public static final void m100761b(String str, String str2, AbstractC56230a aVar) {
        if ((str != null && str.length() != 0) || (str2 != null && str2.length() != 0)) {
            m100763c(str, str2, aVar);
        }
    }

    /* renamed from: a */
    public static final void m100755a(String str, String str2, AbstractC56230a aVar) {
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            aVar.mo91086a(new IllegalArgumentException("Query user with empty uid and sec uid"));
            return;
        }
        IMUser b = m100757b(str, str2);
        if (b != null) {
            aVar.mo91085a(b);
        } else {
            m100763c(str, str2, aVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        r1 = m100754a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
        if (r7 != null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        if (p4600h.p4601a.C89070n.m154556a((java.lang.Iterable) m100754a(), (java.lang.Object) r6) == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0085, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0089, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008a, code lost:
        if (r6 == null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008c, code lost:
        java.lang.Boolean.valueOf(m100754a().add(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0098, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009a, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4010);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009e, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009f, code lost:
        com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a.m102185a("IMUserRepository", "Starting task to load user");
        r0 = kotlinx.coroutines.C89624i.m155555a(com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g.f126070g, null, null, new com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g.C55086a(r5, r6, r7, null), 3);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(4010);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b5, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m100763c(java.lang.String r5, java.lang.String r6, com.p2082ss.android.ugc.aweme.p3070im.service.p3259i.AbstractC56230a r7) {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g.m100763c(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.im.service.i.a):void");
    }
}
