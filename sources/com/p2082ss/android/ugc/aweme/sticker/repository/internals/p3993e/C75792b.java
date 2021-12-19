package com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3993e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.p3993e.AbstractC75850f;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75698f;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75704j;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75711q;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75713r;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3987d.p3988a.AbstractC75730a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.AbstractC89244h;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.b */
public final class C75792b implements AbstractC75713r {

    /* renamed from: a */
    public final C88958b<List<AbstractC75730a>> f170244a;

    /* renamed from: b */
    public final List<AbstractC75730a> f170245b = new ArrayList();

    /* renamed from: c */
    private final AbstractC89244h<AbstractC75704j> f170246c;

    static {
        Covode.recordClassIndex(88726);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75711q
    /* renamed from: a */
    public final AbstractC75711q.AbstractC75712a mo119441a() {
        return new C75793a();
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75713r
    /* renamed from: b */
    public final AbstractC88979t<List<AbstractC75730a>> mo119447b() {
        AbstractC88979t<List<AbstractC75730a>> c = this.f170244a.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.b$a */
    final class C75793a implements AbstractC75711q.AbstractC75712a {

        /* renamed from: b */
        private final List<AbstractC75850f> f170248b = new ArrayList();

        static {
            Covode.recordClassIndex(88727);
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75711q.AbstractC75712a
        /* renamed from: a */
        public final void mo119443a() {
            Iterator<T> it = this.f170248b.iterator();
            while (it.hasNext()) {
                it.next().mo119522a(C75792b.this.f170245b);
            }
            C75792b.this.f170244a.onNext(C75792b.this.f170245b);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C75793a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75711q.AbstractC75712a
        /* renamed from: a */
        public final void mo119444a(AbstractC75730a aVar) {
            C89219l.m154721d(aVar, "");
            this.f170248b.add(new AbstractC75850f.C75851a(aVar));
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75711q.AbstractC75712a
        /* renamed from: b */
        public final void mo119446b(AbstractC75730a aVar) {
            C89219l.m154721d(aVar, "");
            this.f170248b.add(new AbstractC75850f.C75852b(aVar));
        }

        @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75711q.AbstractC75712a
        /* renamed from: a */
        public final void mo119445a(AbstractC89172b<? super AbstractC75730a, Boolean> bVar) {
            C89219l.m154721d(bVar, "");
            this.f170248b.add(new AbstractC75850f.C75853c(bVar));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.h<? extends com.ss.android.ugc.aweme.sticker.repository.a.j> */
    /* JADX WARN: Multi-variable type inference failed */
    public C75792b(AbstractC89244h<? extends AbstractC75704j> hVar) {
        C89219l.m154721d(hVar, "");
        this.f170246c = hVar;
        C88958b<List<AbstractC75730a>> bVar = new C88958b<>();
        C89219l.m154716b(bVar, "");
        this.f170244a = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.e.b$b */
    static final class C75794b extends AbstractC89220m implements AbstractC89172b<Effect, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C75792b f170249a;

        /* renamed from: b */
        final /* synthetic */ String f170250b;

        /* renamed from: c */
        final /* synthetic */ List f170251c;

        static {
            Covode.recordClassIndex(88728);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C75794b(C75792b bVar, String str, List list) {
            super(1);
            this.f170249a = bVar;
            this.f170250b = str;
            this.f170251c = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Effect effect) {
            boolean z;
            Effect effect2 = effect;
            C89219l.m154721d(effect2, "");
            String str = this.f170250b;
            List list = this.f170251c;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((AbstractC75730a) it.next()).mo119485b(str, effect2)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                return Boolean.valueOf(z);
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75711q
    /* renamed from: a */
    public final void mo119442a(String str, List<Effect> list) {
        List<AbstractC75730a> list2;
        String str2 = "";
        C89219l.m154721d(list, str2);
        if (str != null) {
            str2 = str;
        }
        List<AbstractC75730a> list3 = this.f170245b;
        AbstractC75698f fVar = this.f170246c.getValue().mo119430a().get(str);
        if (fVar == null || (list2 = fVar.mo119420c()) == null) {
            list2 = C89086z.INSTANCE;
        }
        C89070n.m154537a((List) list, (AbstractC89172b) new C75794b(this, str2, C89070n.m154572d((Collection) list3, (Iterable) list2)));
    }
}
