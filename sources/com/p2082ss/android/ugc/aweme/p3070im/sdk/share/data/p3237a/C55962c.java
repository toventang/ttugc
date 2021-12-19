package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.p3237a;

import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55815d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.C55845g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.p3223b.C55732c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.data.a.c */
public final class C55962c implements AbstractC55764d<IMContact>, AbstractC55815d, AbstractC55960b {

    /* renamed from: e */
    public static final C55963a f127615e = new C55963a((byte) 0);

    /* renamed from: a */
    public final C1213t<String> f127616a = new C1213t<>();

    /* renamed from: b */
    public final C1213t<List<IMContact>> f127617b = new C1213t<>();

    /* renamed from: c */
    public final C1213t<List<IMContact>> f127618c = new C1213t<>();

    /* renamed from: f */
    private final C55845g f127619f;

    static {
        Covode.recordClassIndex(65755);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.data.a.c$a */
    public static final class C55963a {
        static {
            Covode.recordClassIndex(65756);
        }

        private C55963a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.data.a.c$a$a */
        public static final class C55964a extends AbstractC89220m implements AbstractC89171a<C55845g> {

            /* renamed from: a */
            final /* synthetic */ String f127620a;

            /* renamed from: b */
            final /* synthetic */ C55732c.EnumC55734b f127621b;

            /* renamed from: c */
            final /* synthetic */ Boolean f127622c;

            static {
                Covode.recordClassIndex(65757);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C55964a(String str, C55732c.EnumC55734b bVar, Boolean bool) {
                super(0);
                this.f127620a = str;
                this.f127621b = bVar;
                this.f127622c = bool;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C55845g invoke() {
                C55732c cVar = new C55732c(2, false);
                cVar.f127114e = true;
                cVar.f127116g = true;
                cVar.f127119j = true;
                cVar.f127118i = true;
                cVar.f127111b = this.f127620a;
                cVar.f127120k = this.f127621b;
                cVar.f127110a = this.f127622c;
                return new C55845g(cVar);
            }
        }

        public /* synthetic */ C55963a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C55962c m101844a(String str, Boolean bool, C55732c.EnumC55734b bVar) {
            return new C55962c((C55845g) C89250i.m154773a((AbstractC89171a) new C55964a(str, bVar, bool)).getValue());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.p3237a.AbstractC55960b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ LiveData mo92828a() {
        return this.f127616a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.p3237a.AbstractC55960b
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ LiveData mo92830b() {
        return this.f127617b;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.p3237a.AbstractC55960b
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ LiveData mo92831c() {
        return this.f127618c;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.p3237a.AbstractC55960b
    /* renamed from: e */
    public final void mo92833e() {
        this.f127619f.mo92615a((AbstractC55764d<IMContact>) this);
        this.f127619f.mo92710a((AbstractC55815d) this);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.p3237a.AbstractC55960b
    /* renamed from: f */
    public final void mo92834f() {
        this.f127619f.mo92618d();
        this.f127619f.mo92712m();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.p3237a.AbstractC55960b
    /* renamed from: d */
    public final void mo92832d() {
        List<IMContact> e = this.f127619f.mo92619e();
        if (!e.isEmpty()) {
            mo92512a(e, this.f127619f.mo92620f());
        } else {
            this.f127619f.mo92621g();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
    /* renamed from: a */
    public final void mo92510a(Throwable th) {
        C89219l.m154721d(th, "");
        C89219l.m154721d(th, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
    /* renamed from: c */
    public final void mo92517c(Throwable th) {
        C89219l.m154721d(th, "");
        C89219l.m154721d(th, "");
    }

    public C55962c(C55845g gVar) {
        C89219l.m154721d(gVar, "");
        this.f127619f = gVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.data.p3237a.AbstractC55960b
    /* renamed from: a */
    public final void mo92829a(String str) {
        C89219l.m154721d(str, "");
        this.f127616a.setValue(str);
        if (str.length() == 0) {
            this.f127617b.setValue(C89086z.INSTANCE);
        } else {
            this.f127619f.mo92711a(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55815d
    /* renamed from: b */
    public final void mo92514b(Throwable th) {
        C89219l.m154721d(th, "");
        this.f127618c.postValue(new ArrayList());
        C56244a.m102186a("ShareContactsRepository", "onSearchError", th);
    }

    /* renamed from: a */
    private static List<IMContact> m101830a(List<IMContact> list) {
        T t;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.getType() == 3) {
                break;
            }
        }
        int b = C89070n.m154558b((List) list, (Object) t);
        if (t == null || b < 0) {
            return list;
        }
        return C89070n.m154572d((Collection) C89070n.m154594n(list.subList(0, b)), (Iterable) list.subList(b, list.size()));
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
    /* renamed from: b */
    public final void mo92515b(List<IMContact> list, boolean z) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.AbstractC55815d
    /* renamed from: a */
    public final void mo92511a(List<IMContact> list, String str) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        C56244a.m102190b("ShareContactsRepository", "onSearchResult: " + list.size());
        this.f127617b.setValue(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55764d
    /* renamed from: a */
    public final void mo92512a(List<IMContact> list, boolean z) {
        C89219l.m154721d(list, "");
        List<IMContact> a = m101830a(list);
        C56244a.m102190b("ShareContactsRepository", "onLoadSuccess: " + a.size() + ", " + z);
        this.f127618c.setValue(a);
    }
}
