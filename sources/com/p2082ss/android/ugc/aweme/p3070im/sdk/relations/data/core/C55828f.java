package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMServiceProvider;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.service.C55278b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55765e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.C55747a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.C55758b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.C55777g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.C55780h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3226c.C55807a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55732c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.social.p3914a.C74710e;
import com.p2082ss.android.ugc.aweme.social.p3916c.C74721a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.f */
public final class C55828f extends AbstractC55736a {

    /* renamed from: f */
    public static final C55829a f127258f = new C55829a((byte) 0);

    /* renamed from: e */
    public int f127259e;

    /* renamed from: g */
    private List<String> f127260g;

    /* renamed from: h */
    private Set<String> f127261h;

    /* renamed from: i */
    private final boolean f127262i;

    /* renamed from: j */
    private final AbstractC89244h f127263j;

    /* renamed from: k */
    private final C55777g<IMContact> f127264k;

    /* renamed from: l */
    private C55747a<IMContact> f127265l;

    static {
        Covode.recordClassIndex(65614);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.f$a */
    public static final class C55829a {
        static {
            Covode.recordClassIndex(65615);
        }

        private C55829a() {
        }

        public /* synthetic */ C55829a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.f$b */
    static final class C55830b extends AbstractC89220m implements AbstractC89171a<C55780h> {

        /* renamed from: a */
        public static final C55830b f127266a = new C55830b();

        static {
            Covode.recordClassIndex(65616);
        }

        C55830b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C55780h invoke() {
            return new C55780h.C55781a().f127204a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo92667i() {
        if (!this.f127262i || !C74710e.f167932f || !C89219l.m154714a((Object) this.f127129d.f127111b, (Object) "aweme")) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.f$c */
    static final /* synthetic */ class C55831c extends C89217j implements AbstractC89171a<Boolean> {
        static {
            Covode.recordClassIndex(65617);
        }

        C55831c(C55828f fVar) {
            super(0, fVar, C55828f.class, "interceptStart", "interceptStart()Z", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
            if (com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55273c.m101062i() > 0) goto L_0x001b;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Boolean invoke() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.receiver
                com.ss.android.ugc.aweme.im.sdk.relations.data.core.a r0 = (com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55736a) r0
                com.ss.android.ugc.aweme.im.sdk.relations.data.b.c r0 = r0.f127129d
                boolean r1 = r0.f127112c
                r2 = 0
                r0 = 1
                if (r1 == 0) goto L_0x001b
                com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c r1 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55273c.m101041a()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
                int r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55273c.m101062i()
                if (r0 <= 0) goto L_0x001c
            L_0x001b:
                r2 = 1
            L_0x001c:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.C55828f.C55831c.invoke():java.lang.Object");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55736a
    /* renamed from: c */
    public final /* synthetic */ AbstractC55765e mo92617c() {
        C55747a<R> aVar = (C55747a<R>) this.f127265l;
        if (aVar == null) {
            if (mo92667i()) {
                C56244a.m102191c("SharePanelRelationModel", "enter share panel maf experiment");
                this.f127264k.mo92650a((C55780h) this.f127263j.getValue());
            }
            C55747a.C55748a a = new C55747a.C55748a().mo92629a(this.f127264k);
            C55831c cVar = new C55831c(this);
            C89219l.m154721d(cVar, "");
            a.f127157a.f127152b = cVar;
            aVar = a.mo92630a(new C55832d(this)).mo92631b(new C55833e(this)).mo92628a(this).f127157a;
            this.f127265l = aVar;
            if (aVar == null) {
                C89219l.m154715b();
            }
        }
        return aVar;
    }

    public /* synthetic */ C55828f(C55732c cVar) {
        this(cVar, 15);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.f$d */
    static final /* synthetic */ class C55832d extends C89217j implements AbstractC89172b<C55747a.C55750c<IMContact>, Boolean> {
        static {
            Covode.recordClassIndex(65618);
        }

        C55832d(C55828f fVar) {
            super(1, fVar, C55828f.class, "intercept", "intercept(Lcom/ss/android/ugc/aweme/im/sdk/relations/data/core/core/CombinedLoader$InterceptPayload;)Z", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(C55747a.C55750c<IMContact> cVar) {
            C55747a.C55750c<IMContact> cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            return Boolean.valueOf(((C55828f) this.receiver).mo92666a(cVar2));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55736a, com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
    /* renamed from: a */
    public final void mo92510a(Throwable th) {
        C89219l.m154721d(th, "");
        C56244a.m102191c("SharePanelRelationModel", "onLoadError ".concat(String.valueOf(th)));
        super.mo92510a(th);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.f$e */
    static final /* synthetic */ class C55833e extends C89217j implements AbstractC89172b<List<IMContact>, List<IMContact>> {
        static {
            Covode.recordClassIndex(65619);
        }

        C55833e(C55828f fVar) {
            super(1, fVar, C55828f.class, "interceptFinish", "interceptFinish(Ljava/util/List;)Ljava/util/List;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ List<IMContact> invoke(List<IMContact> list) {
            List<IMContact> list2 = list;
            C89219l.m154721d(list2, "");
            C56244a.m102191c("SharePanelRelationModel", "interceptFinish, before list size: " + list2.size());
            if (((C55828f) this.receiver).mo92667i()) {
                list2 = C55807a.m101588a(list2);
            }
            C56244a.m102191c("SharePanelRelationModel", "interceptFinish, after list size: " + list2.size());
            return list2;
        }
    }

    /* renamed from: a */
    public final boolean mo92666a(C55747a.C55750c<IMContact> cVar) {
        C56244a.m102191c("SharePanelRelationModel", "intercept begin " + cVar.f127160c.getClass().getName() + " list: " + cVar.f127159b.size() + " map: " + cVar.f127158a.size());
        cVar.f127158a.put(cVar.f127160c, cVar.f127159b);
        this.f127261h.addAll(m101487a(cVar.f127159b));
        if (cVar.f127160c == this.f127127b) {
            this.f127128c = m101487a(cVar.f127159b);
            List<String> list = this.f127260g;
            List<String> list2 = this.f127128c;
            if (list2 == null) {
                C89219l.m154715b();
            }
            list.addAll(C89070n.m154585g((Collection) list2));
            C55807a.m101589a();
        }
        List<R> list3 = cVar.f127159b;
        ArrayList arrayList = new ArrayList(C89070n.m154526a(list3, 10));
        int i = 0;
        for (T t : list3) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            T t2 = t;
            if (!(t2 instanceof C74721a) && (t2 instanceof IMUser)) {
                T t3 = t2;
                C55278b familiarService = IMServiceProvider.INSTANCE.getFamiliarService();
                String uid = t3.getUid();
                C89219l.m154716b(uid, "");
                t3.setRecType(familiarService.mo92287a(uid, t3.getSecUid(), t3));
            }
            if (i < 5) {
                t2.setIsRecentTop5Contact(1);
            }
            arrayList.add(C89391z.f203057a);
            i = i2;
        }
        C56244a.m102191c("SharePanelRelationModel", "intercept finish " + cVar.f127160c.getClass().getName());
        if (C55758b.m101515b(cVar.f127158a) > this.f127259e) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55736a, com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
    /* renamed from: a */
    public final void mo92512a(List<IMContact> list, boolean z) {
        C89219l.m154721d(list, "");
        int size = list.size();
        int i = this.f127259e;
        if (size > i) {
            list = list.subList(0, i);
        }
        C56244a.m102191c("SharePanelRelationModel", "onLoadSuccess list: " + list.size() + " hasMore: " + z);
        super.mo92512a(list, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55828f(C55732c cVar, int i) {
        super(cVar);
        boolean z;
        C89219l.m154721d(cVar, "");
        this.f127259e = i;
        this.f127260g = new ArrayList();
        this.f127261h = new LinkedHashSet();
        if (!cVar.mo92609a() || cVar.f127120k != C55732c.EnumC55734b.NORMAL) {
            z = false;
        } else {
            z = true;
        }
        this.f127262i = z;
        this.f127263j = C89250i.m154773a((AbstractC89171a) C55830b.f127266a);
        C55777g<IMContact> a = C55777g.C55778a.m101559a();
        a.mo92650a(this.f127127b);
        a.mo92650a(mo92614a());
        a.mo92650a(mo92616b());
        this.f127264k = a;
    }
}
