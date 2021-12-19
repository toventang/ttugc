package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55273c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55765e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.C55747a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.C55759c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.C55777g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55732c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.util.Comparator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.e */
public final class C55823e extends AbstractC55858h {

    /* renamed from: e */
    public static final C55824a f127252e = new C55824a((byte) 0);

    /* renamed from: f */
    private final String f127253f;

    /* renamed from: g */
    private final C55759c f127254g;

    /* renamed from: h */
    private final C55777g<IMContact> f127255h;

    /* renamed from: i */
    private C55747a<IMContact> f127256i;

    static {
        Covode.recordClassIndex(65609);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.e$a */
    public static final class C55824a {
        static {
            Covode.recordClassIndex(65610);
        }

        private C55824a() {
        }

        public /* synthetic */ C55824a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55736a
    /* renamed from: c */
    public final AbstractC55765e<IMContact> mo92617c() {
        C55747a<IMContact> aVar = this.f127256i;
        if (aVar != null) {
            return aVar;
        }
        C55747a<R> aVar2 = new C55747a.C55748a().mo92629a(this.f127255h).mo92630a(new C55827c(this)).mo92628a(this).f127157a;
        this.f127256i = aVar2;
        if (aVar2 == null) {
            C89219l.m154715b();
        }
        return aVar2;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.e$b */
    static final class C55825b extends AbstractC89220m implements AbstractC89172b<List<? extends IMUser>, List<? extends IMUser>> {

        /* renamed from: a */
        public static final C55825b f127257a = new C55825b();

        static {
            Covode.recordClassIndex(65611);
        }

        C55825b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ List<? extends IMUser> invoke(List<? extends IMUser> list) {
            List<? extends IMUser> list2 = list;
            C89219l.m154721d(list2, "");
            return C89070n.m154553a((Iterable) list2, (Comparator) new C55826a());
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.e$b$a */
        public static final class C55826a<T> implements Comparator {
            static {
                Covode.recordClassIndex(65612);
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C89090a.m154604a(Integer.valueOf(t2.getFollowStatus()), Integer.valueOf(t.getFollowStatus()));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.e$c */
    static final /* synthetic */ class C55827c extends C89217j implements AbstractC89172b<C55747a.C55750c<IMContact>, Boolean> {
        static {
            Covode.recordClassIndex(65613);
        }

        C55827c(C55823e eVar) {
            super(1, eVar, C55823e.class, "intercept", "intercept(Lcom/ss/android/ugc/aweme/im/sdk/relations/data/core/core/CombinedLoader$InterceptPayload;)Z", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(C55747a.C55750c<IMContact> cVar) {
            C55747a.C55750c<IMContact> cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            return Boolean.valueOf(((C55823e) this.receiver).mo92664a(cVar2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55823e(C55732c cVar) {
        super(cVar);
        String f;
        C89219l.m154721d(cVar, "");
        if (cVar.f127122m) {
            f = C55273c.m101053c();
        } else {
            f = C55273c.m101059f();
        }
        this.f127253f = f;
        C55759c.C55760a aVar = new C55759c.C55760a();
        C89219l.m154716b(f, "");
        C55759c cVar2 = (C55759c) aVar.mo92636a(f).mo92637a(false).mo92647a(100).mo92648a(C55825b.f127257a).mo92639b();
        this.f127254g = cVar2;
        this.f127255h = C55777g.C55778a.m101559a().mo92650a(this.f127127b).mo92650a(cVar2);
    }

    /* renamed from: a */
    public final boolean mo92664a(C55747a.C55750c<IMContact> cVar) {
        List<R> list;
        if (cVar.f127160c != this.f127127b || cVar.f127159b.size() <= 15) {
            list = cVar.f127159b;
        } else {
            list = cVar.f127159b.subList(0, 15);
        }
        cVar.f127158a.put(cVar.f127160c, list);
        if (cVar.f127160c != this.f127127b || !(!list.isEmpty())) {
            if (cVar.f127160c == this.f127254g && ((C55759c) cVar.f127160c).f127173e == 1 && (!list.isEmpty())) {
                list.get(0).setType(3);
            }
            return false;
        }
        list.get(0).setType(2);
        this.f127128c = m101487a(list);
        return true;
    }
}
