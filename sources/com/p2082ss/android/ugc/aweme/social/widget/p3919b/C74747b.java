package com.p2082ss.android.ugc.aweme.social.widget.p3919b;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.social.widget.p3919b.AbstractC74745a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.b.b */
public final class C74747b implements AbstractC74745a {

    /* renamed from: a */
    public List<User> f168007a;

    /* renamed from: b */
    private final String f168008b;

    /* renamed from: c */
    private final String f168009c;

    /* renamed from: d */
    private long f168010d;

    /* renamed from: e */
    private final Set<String> f168011e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.b.b$a */
    public static final class C74748a extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f168012a;

        /* renamed from: b */
        int f168013b;

        /* renamed from: c */
        final /* synthetic */ C74747b f168014c;

        static {
            Covode.recordClassIndex(87591);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74748a(C74747b bVar, AbstractC89124d dVar) {
            super(dVar);
            this.f168014c = bVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f168012a = obj;
            this.f168013b |= Integer.MIN_VALUE;
            return this.f168014c.mo117799a(0, 0, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.b.b$b */
    public static final class C74749b extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f168015a;

        /* renamed from: b */
        int f168016b;

        /* renamed from: c */
        final /* synthetic */ C74747b f168017c;

        /* renamed from: d */
        Object f168018d;

        /* renamed from: e */
        Object f168019e;

        static {
            Covode.recordClassIndex(87592);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74749b(C74747b bVar, AbstractC89124d dVar) {
            super(dVar);
            this.f168017c = bVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f168015a = obj;
            this.f168016b |= Integer.MIN_VALUE;
            return this.f168017c.mo117795a(this);
        }
    }

    static {
        Covode.recordClassIndex(87590);
    }

    @Override // com.bytedance.provider.AbstractC21747h
    /* renamed from: a */
    public final String mo35386a() {
        return this.f168008b;
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.p3919b.AbstractC74745a
    /* renamed from: b */
    public final List<User> mo117797b() {
        return this.f168007a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.b.b$c */
    public static final class C74750c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C74747b f168020a;

        /* renamed from: b */
        final /* synthetic */ List f168021b;

        static {
            Covode.recordClassIndex(87593);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74750c(C74747b bVar, List list) {
            super(0);
            this.f168020a = bVar;
            this.f168021b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f168020a.mo117801c(this.f168021b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.b.b$d */
    static final class C74751d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C74747b f168022a;

        /* renamed from: b */
        final /* synthetic */ List f168023b;

        static {
            Covode.recordClassIndex(87594);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74751d(C74747b bVar, List list) {
            super(0);
            this.f168022a = bVar;
            this.f168023b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C74747b bVar = this.f168022a;
            bVar.mo117801c(bVar.mo117800b(bVar.f168007a));
            return C89391z.f203057a;
        }
    }

    public /* synthetic */ C74747b() {
        this(new CopyOnWriteArrayList());
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.p3919b.AbstractC74745a
    /* renamed from: c */
    public final long mo117798c() {
        if (this.f168010d == -1) {
            return -1;
        }
        return SystemClock.elapsedRealtime() - this.f168010d;
    }

    /* renamed from: c */
    public final void mo117801c(List<User> list) {
        C89219l.m154721d(list, "");
        this.f168007a = list;
    }

    /* renamed from: a */
    private void m131236a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        AbstractC74745a.C74746a.m131235a(this, aVar);
    }

    private C74747b(List<User> list) {
        C89219l.m154721d(list, "");
        this.f168007a = list;
        this.f168008b = "MAFSource";
        this.f168009c = "MAFSource";
        this.f168010d = -1;
        this.f168011e = new LinkedHashSet();
    }

    /* renamed from: b */
    public final List<User> mo117800b(List<? extends User> list) {
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            Set<String> set = this.f168011e;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C89219l.m154714a((Object) it.next(), (Object) t2.getUid())) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            arrayList.add(t);
        }
        return C89070n.m154585g((Collection) arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    @Override // com.p2082ss.android.ugc.aweme.social.widget.p3919b.AbstractC74745a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo117795a(p4600h.p4603c.AbstractC89124d<? super p4600h.C89391z> r6) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.social.widget.p3919b.C74747b.mo117795a(h.c.d):java.lang.Object");
    }

    @Override // com.p2082ss.android.ugc.aweme.social.widget.p3919b.AbstractC74745a
    /* renamed from: a */
    public final void mo117796a(List<? extends User> list) {
        MethodCollector.m26663i(7291);
        C89219l.m154721d(list, "");
        synchronized (this) {
            try {
                Set<String> set = this.f168011e;
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getUid());
                }
                set.addAll(arrayList);
                m131236a(new C74751d(this, list));
            } finally {
                MethodCollector.m26664o(7291);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo117799a(int r6, int r7, p4600h.p4603c.AbstractC89124d<? super java.util.List<? extends com.p2082ss.android.ugc.aweme.profile.model.User>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.p2082ss.android.ugc.aweme.social.widget.p3919b.C74747b.C74748a
            if (r0 == 0) goto L_0x0046
            r4 = r8
            com.ss.android.ugc.aweme.social.widget.b.b$a r4 = (com.p2082ss.android.ugc.aweme.social.widget.p3919b.C74747b.C74748a) r4
            int r0 = r4.f168013b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0046
            int r0 = r4.f168013b
            int r0 = r0 - r1
            r4.f168013b = r0
        L_0x0013:
            java.lang.Object r3 = r4.f168012a
            h.c.a.a r2 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
            int r0 = r4.f168013b
            r1 = 1
            if (r0 == 0) goto L_0x0034
            if (r0 != r1) goto L_0x004c
            p4600h.C89382r.m154942a(r3)
        L_0x0021:
            com.ss.android.ugc.aweme.base.api.a r3 = (com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a) r3
            java.lang.Object r0 = r3.checkValid()
            com.ss.android.ugc.aweme.social.c.c r0 = (com.p2082ss.android.ugc.aweme.social.p3916c.C74723c) r0
            if (r0 == 0) goto L_0x0031
            java.util.List r0 = r0.getUserListWithRid()
            if (r0 != 0) goto L_0x0033
        L_0x0031:
            h.a.z r0 = p4600h.p4601a.C89086z.INSTANCE
        L_0x0033:
            return r0
        L_0x0034:
            p4600h.C89382r.m154942a(r3)
            com.ss.android.ugc.aweme.social.api.RecommendUserApiService r0 = com.p2082ss.android.ugc.aweme.social.api.RecommendUserApiService.f167940a
            f.a.t r0 = r0.getMAFList(r6, r7)
            r4.f168013b = r1
            java.lang.Object r3 = kotlinx.coroutines.p4638c.C89575b.m155515a(r0, r4)
            if (r3 != r2) goto L_0x0021
            return r2
        L_0x0046:
            com.ss.android.ugc.aweme.social.widget.b.b$a r4 = new com.ss.android.ugc.aweme.social.widget.b.b$a
            r4.<init>(r5, r8)
            goto L_0x0013
        L_0x004c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.social.widget.p3919b.C74747b.mo117799a(int, int, h.c.d):java.lang.Object");
    }
}
