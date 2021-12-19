package com.p2082ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1447b.C20147a;
import com.bytedance.jedi.p1445a.p1447b.C20155b;
import com.bytedance.jedi.p1445a.p1448c.AbstractC20168e;
import com.bytedance.jedi.p1445a.p1448c.C20165b;
import com.bytedance.jedi.p1445a.p1449d.C20172a;
import com.bytedance.jedi.p1445a.p1458h.C20271f;
import com.bytedance.jedi.p1445a.p1459i.AbstractC20272a;
import com.bytedance.jedi.p1445a.p1460j.AbstractC20284a;
import com.bytedance.jedi.p1445a.p1460j.AbstractC20287b;
import com.bytedance.jedi.p1445a.p1461k.AbstractC20292c;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50722e;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50747h;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50748i;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50750k;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50751l;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.AbstractC50810n;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.C50710a;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.C50719b;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.C50721d;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.EnumC50720c;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.utils.C50812b;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50704l;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50709q;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50695c;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50696d;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50697e;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50698f;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.EnumC50699g;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50687a;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p2082ss.android.ugc.tools.utils.C84909p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88790v;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4560f.p4561a.p4591l.C88958b;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4602b.C89090a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.g */
public final class C50763g extends AbstractC20287b implements AbstractC50707o {

    /* renamed from: b */
    public final C88958b<C50695c> f117162b;

    /* renamed from: c */
    public final C20172a<Integer, C50696d> f117163c = new C20172a<>((byte) 0);

    /* renamed from: d */
    public final C88958b<Map<Integer, C50696d>> f117164d;

    /* renamed from: e */
    public AtomicReference<C89378p<AbstractC88979t<C50710a>, AbstractC88969g<C50710a>>> f117165e;

    /* renamed from: f */
    C88411a f117166f;

    /* renamed from: g */
    final AbstractC50810n f117167g;

    /* renamed from: h */
    public final AbstractC50748i f117168h;

    /* renamed from: i */
    final boolean f117169i;

    /* renamed from: j */
    private final C20271f<C50710a> f117170j;

    /* renamed from: k */
    private final C88960c<C50697e> f117171k;

    /* renamed from: l */
    private final AbstractC89244h f117172l;

    /* renamed from: m */
    private final AbstractC50751l f117173m;

    /* renamed from: n */
    private final AbstractC50750k f117174n;

    /* renamed from: o */
    private final AbstractC50722e f117175o;

    /* renamed from: p */
    private final AbstractC50747h f117176p;

    static {
        Covode.recordClassIndex(59931);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o
    /* renamed from: g */
    public final AbstractC50704l mo86072g() {
        return this.f117173m;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: f.a.l.c<com.ss.android.ugc.aweme.filter.repository.a.e> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo86118a(List<C50696d> list) {
        ArrayList<Object> arrayList = new ArrayList();
        for (T t : list) {
            C50696d b = this.f117163c.mo33459b(Integer.valueOf(t.f117041a));
            if (b == null) {
                b = C50812b.m95163a(t.f117041a);
            }
            if (true ^ C89219l.m154714a((Object) b, (Object) t)) {
                this.f117163c.mo33457a(Integer.valueOf(t.f117041a), t);
                arrayList.add(new C50697e(b, t));
            }
        }
        if (!arrayList.isEmpty()) {
            C88958b<Map<Integer, C50696d>> bVar = this.f117164d;
            List<C89378p<Integer, C50696d>> d = this.f117163c.mo33462d();
            ArrayList arrayList2 = new ArrayList();
            for (T t2 : d) {
                if (t2.getSecond() != null) {
                    arrayList2.add(t2);
                }
            }
            ArrayList<C89378p> arrayList3 = arrayList2;
            LinkedHashMap linkedHashMap = new LinkedHashMap(C89271h.m154769b(C89041ag.m154411a(C89070n.m154526a((Iterable) arrayList3, 10)), 16));
            for (C89378p pVar : arrayList3) {
                Object first = pVar.getFirst();
                Object second = pVar.getSecond();
                if (second == null) {
                    C89219l.m154715b();
                }
                C89378p pVar2 = new C89378p(first, second);
                linkedHashMap.put(pVar2.getFirst(), pVar2.getSecond());
            }
            bVar.onNext(linkedHashMap);
            for (Object obj : arrayList) {
                this.f117171k.onNext(obj);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.g$i */
    static final class C50776i implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C50763g f117189a;

        static {
            Covode.recordClassIndex(59944);
        }

        C50776i(C50763g gVar) {
            this.f117189a = gVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f117189a.f117165e.set(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.g$k */
    static final class C50778k extends AbstractC89220m implements AbstractC89171a<AbstractC50748i> {

        /* renamed from: a */
        final /* synthetic */ C50763g f117192a;

        static {
            Covode.recordClassIndex(59946);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50778k(C50763g gVar) {
            super(0);
            this.f117192a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC50748i invoke() {
            AbstractC50748i iVar = this.f117192a.f117168h;
            iVar.mo86107a(this.f117192a);
            return iVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o
    /* renamed from: d */
    public final AbstractC88979t<Map<Integer, C50696d>> mo86069d() {
        AbstractC88979t<Map<Integer, C50696d>> c = this.f117164d.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o
    /* renamed from: e */
    public final AbstractC88979t<C50697e> mo86070e() {
        AbstractC88979t<C50697e> c = this.f117171k.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o
    /* renamed from: f */
    public final AbstractC50709q mo86071f() {
        return (AbstractC50709q) this.f117172l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.g$n */
    static final class RunnableC50781n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C50763g f117195a;

        static {
            Covode.recordClassIndex(59949);
        }

        RunnableC50781n(C50763g gVar) {
            this.f117195a = gVar;
        }

        public final void run() {
            this.f117195a.f117163c.mo33461c();
            this.f117195a.f117164d.onNext(C89041ag.m154415a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o
    /* renamed from: c */
    public final AbstractC88979t<C50695c> mo86068c() {
        AbstractC88979t<C50695c> c = this.f117162b.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o
    /* renamed from: b */
    public final void mo86067b() {
        C88411a aVar = this.f117166f;
        aVar.dispose();
        aVar.mo142944a();
        this.f117166f = new C88411a();
        this.f117175o.mo86097b();
        this.f117174n.mo86084b();
        this.f117170j.mo33461c();
        this.f117162b.onNext(C50687a.f117027a);
        C88392a.m153583a().mo142900a(new RunnableC50781n(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o
    /* renamed from: a */
    public final void mo86064a() {
        AbstractC88979t<C50710a> b;
        AbstractC88969g<C50710a> second;
        AbstractC88979t c = C20155b.m38133a(this.f117176p, this.f117170j, C50769f.f117182a).mo33480a(new C50772g(this)).mo33487c(C89391z.f203057a);
        C88958b bVar = new C88958b();
        C89219l.m154716b(bVar, "");
        if (this.f117165e.compareAndSet(null, C89387v.m154943a(c, bVar))) {
            c.mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143264a(new C50775h(this)).mo143279b((AbstractC88428a) new C50776i(this)).mo143062b((AbstractC88986z) bVar);
            b = bVar.mo143283c();
            C89219l.m154716b(b, "");
        } else {
            C89378p<AbstractC88979t<C50710a>, AbstractC88969g<C50710a>> pVar = this.f117165e.get();
            if (pVar == null || (second = pVar.getSecond()) == null || (b = second.mo143283c()) == null) {
                b = AbstractC88979t.m154310b(new C50710a(C50687a.f117027a, true));
                C89219l.m154716b(b, "");
            }
        }
        C89219l.m154716b(b.mo143280b(C50767d.f117180a).mo143292d(C50768e.f117181a), "");
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o
    /* renamed from: b */
    public final EnumC50699g mo86066b(int i) {
        return m95094d(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.g$c */
    public static final class C50766c<T, R> implements AbstractC88434g<C50719b, C50696d> {

        /* renamed from: a */
        final /* synthetic */ C50763g f117179a;

        static {
            Covode.recordClassIndex(59934);
        }

        C50766c(C50763g gVar) {
            this.f117179a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ C50696d apply(C50719b bVar) {
            C50719b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return this.f117179a.mo86117a(bVar2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.g$e */
    static final class C50768e<T, R> implements AbstractC88434g<C50710a, C50695c> {

        /* renamed from: a */
        public static final C50768e f117181a = new C50768e();

        static {
            Covode.recordClassIndex(59936);
        }

        C50768e() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ C50695c apply(C50710a aVar) {
            C50710a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            return aVar2.f117057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.g$h */
    static final class C50775h<T> implements AbstractC88433f<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C50763g f117188a;

        static {
            Covode.recordClassIndex(59943);
        }

        C50775h(C50763g gVar) {
            this.f117188a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Throwable th) {
            this.f117188a.f117165e.set(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.g$m */
    static final class C50780m<T> implements AbstractC88433f<List<? extends C50696d>> {

        /* renamed from: a */
        final /* synthetic */ C50763g f117194a;

        static {
            Covode.recordClassIndex(59948);
        }

        C50780m(C50763g gVar) {
            this.f117194a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.filter.repository.internal.main.g */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(List<? extends C50696d> list) {
            List<? extends C50696d> list2 = list;
            C50763g gVar = this.f117194a;
            C89219l.m154716b(list2, "");
            gVar.mo86118a((List<C50696d>) list2);
        }
    }

    /* renamed from: b */
    private AbstractC88979t<C50696d> m95091b(C50698f fVar) {
        C89219l.m154721d(fVar, "");
        return m95093c(fVar);
    }

    /* renamed from: c */
    private C50696d m95092c(int i) {
        return this.f117163c.mo33459b(Integer.valueOf(i));
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o
    /* renamed from: a */
    public final AbstractC88979t<C50696d> mo86062a(FilterBean filterBean) {
        C89219l.m154721d(filterBean, "");
        return m95091b(C50812b.m95165a(filterBean));
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.g$g */
    static final class C50772g extends AbstractC89220m implements AbstractC89183m<AbstractC88979t<C50710a>, AbstractC88979t<C50710a>, AbstractC88979t<C50710a>> {

        /* renamed from: a */
        final /* synthetic */ C50763g f117185a;

        static {
            Covode.recordClassIndex(59940);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C50772g(C50763g gVar) {
            super(2);
            this.f117185a = gVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.g$g$a */
        static final class C50773a<T, R> implements AbstractC88434g<C50710a, AbstractC88984x<? extends C50710a>> {

            /* renamed from: a */
            public static final C50773a f117186a = new C50773a();

            static {
                Covode.recordClassIndex(59941);
            }

            C50773a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ AbstractC88984x<? extends C50710a> apply(C50710a aVar) {
                C50710a aVar2 = aVar;
                C89219l.m154721d(aVar2, "");
                if (aVar2.f117058b) {
                    return C88925a.m154171a(C88790v.f201616a);
                }
                return AbstractC88979t.m154310b(aVar2);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.g$g$b */
        static final class C50774b<T> implements AbstractC88433f<C50710a> {

            /* renamed from: a */
            final /* synthetic */ C50772g f117187a;

            static {
                Covode.recordClassIndex(59942);
            }

            C50774b(C50772g gVar) {
                this.f117187a = gVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(C50710a aVar) {
                C50763g gVar = this.f117187a.f117185a;
                List<C50698f> list = aVar.f117057a.f117039a;
                gVar.f117166f.mo142945a(gVar.f117167g.mo33487c(list).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88392a.m153583a()).mo143254a(new C50777j(gVar, list), C84909p.f189747a));
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ AbstractC88979t<C50710a> invoke(AbstractC88979t<C50710a> tVar, AbstractC88979t<C50710a> tVar2) {
            AbstractC88979t<C50710a> tVar3 = tVar;
            AbstractC88979t<C50710a> tVar4 = tVar2;
            C89219l.m154721d(tVar3, "");
            C89219l.m154721d(tVar4, "");
            AbstractC88979t<R> d = tVar4.mo143267a((AbstractC88434g<? super C50710a, ? extends AbstractC88984x<? extends R>>) C50773a.f117186a, false).mo143287c(C88925a.m154171a(C88790v.f201616a)).mo143293d(tVar3.mo143280b(new C50774b(this)));
            C89219l.m154716b(d, "");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.g$d */
    static final class C50767d<T> implements AbstractC88433f<C50710a> {

        /* renamed from: a */
        public static final C50767d f117180a = new C50767d();

        static {
            Covode.recordClassIndex(59935);
        }

        C50767d() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C50710a aVar) {
            C50710a aVar2 = aVar;
            if (aVar2.f117058b && aVar2.f117057a.f117039a.isEmpty()) {
                throw new RuntimeException("Failed to fetch filter data.");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.g$f */
    static final class C50769f extends AbstractC89220m implements AbstractC89172b<C20147a.C20149b<C89391z, C50710a, C89391z, C50710a>, C89391z> {

        /* renamed from: a */
        public static final C50769f f117182a = new C50769f();

        static {
            Covode.recordClassIndex(59937);
        }

        C50769f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C20147a.C20149b<C89391z, C50710a, C89391z, C50710a> bVar) {
            C20147a.C20149b<C89391z, C50710a, C89391z, C50710a> bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            C507701 r0 = C507701.f117183a;
            C89219l.m154719c(r0, "");
            bVar2.f47922a = r0;
            C507712 r02 = C507712.f117184a;
            C89219l.m154719c(r02, "");
            bVar2.f47923b = r02;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.g$l */
    static final class C50779l<T, R> implements AbstractC88434g<C50719b, List<? extends C50696d>> {

        /* renamed from: a */
        final /* synthetic */ C50763g f117193a;

        static {
            Covode.recordClassIndex(59947);
        }

        C50779l(C50763g gVar) {
            this.f117193a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ List<? extends C50696d> apply(C50719b bVar) {
            C50719b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return C89070n.m154516a(this.f117193a.mo86117a(bVar2));
        }
    }

    /* renamed from: d */
    private final EnumC50699g m95094d(int i) {
        EnumC50699g gVar;
        C50696d b = this.f117163c.mo33459b(Integer.valueOf(i));
        if (b == null || (gVar = b.f117042b) == null) {
            return EnumC50699g.FILTER_STATE_UNKNOWN;
        }
        return gVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.g$b */
    static final class C50765b<T> implements AbstractC88433f<List<? extends C89378p<? extends C89391z, ? extends C50710a>>> {

        /* renamed from: a */
        final /* synthetic */ C50763g f117178a;

        static {
            Covode.recordClassIndex(59933);
        }

        C50765b(C50763g gVar) {
            this.f117178a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(List<? extends C89378p<? extends C89391z, ? extends C50710a>> list) {
            C50710a aVar;
            List<? extends C89378p<? extends C89391z, ? extends C50710a>> list2 = list;
            C89219l.m154716b(list2, "");
            C89378p pVar = (C89378p) C89070n.m154561b((List) list2, 0);
            if (pVar != null && (aVar = (C50710a) pVar.getSecond()) != null) {
                this.f117178a.f117162b.onNext(aVar.f117057a);
            }
        }
    }

    /* renamed from: c */
    private final AbstractC88979t<C50696d> m95093c(C50698f fVar) {
        EnumC50699g gVar;
        C50696d c = m95092c(fVar.f117047a);
        if (c != null) {
            gVar = c.f117042b;
        } else {
            gVar = null;
        }
        if (gVar == EnumC50699g.FILTER_STATE_DOWNLOAD_SUCCESS) {
            AbstractC88979t<C50696d> b = AbstractC88979t.m154310b(c);
            C89219l.m154716b(b, "");
            return b;
        }
        AbstractC88979t<R> d = this.f117174n.mo86082a(fVar).mo143292d(new C50766c(this));
        C89219l.m154716b(d, "");
        return d;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o
    /* renamed from: a */
    public final C50698f mo86061a(int i) {
        C50695c cVar;
        List<C50698f> list;
        C50710a b = this.f117170j.mo33459b(C89391z.f203057a);
        T t = null;
        if (b == null || (cVar = b.f117057a) == null || (list = cVar.f117039a) == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.f117047a == i) {
                t = next;
                break;
            }
        }
        return t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo86119b(List<C50698f> list) {
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (m95094d(t.f117047a) != EnumC50699g.FILTER_STATE_DOWNLOAD_SUCCESS) {
                arrayList.add(t);
            }
        }
        ArrayList<C50698f> arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            for (C50698f fVar : arrayList2) {
                this.f117174n.mo86083b(fVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.g$j */
    static final class C50777j<T> implements AbstractC88433f<List<? extends C50696d>> {

        /* renamed from: a */
        final /* synthetic */ C50763g f117190a;

        /* renamed from: b */
        final /* synthetic */ List f117191b;

        static {
            Covode.recordClassIndex(59945);
        }

        C50777j(C50763g gVar, List list) {
            this.f117190a = gVar;
            this.f117191b = list;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(List<? extends C50696d> list) {
            T t;
            List<? extends C50696d> list2 = list;
            C50763g gVar = this.f117190a;
            List list3 = this.f117191b;
            C89219l.m154716b(list2, "");
            ArrayList arrayList = new ArrayList();
            for (T t2 : list2) {
                C50696d b = gVar.f117163c.mo33459b(Integer.valueOf(t2.f117041a));
                if (b == null || b.f117042b == EnumC50699g.FILTER_STATE_UNKNOWN) {
                    arrayList.add(t2);
                }
            }
            gVar.mo86118a(arrayList);
            if (gVar.f117169i) {
                ArrayList arrayList2 = new ArrayList();
                for (T t3 : list3) {
                    T t4 = t3;
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (t.f117041a == t4.f117047a) {
                            break;
                        }
                    }
                    T t5 = t;
                    if (t5 == null || t5.f117042b != EnumC50699g.FILTER_STATE_DOWNLOAD_SUCCESS) {
                        arrayList2.add(t3);
                    }
                }
                gVar.mo86119b(arrayList2);
            }
        }
    }

    /* renamed from: a */
    public final C50696d mo86117a(C50719b bVar) {
        if (bVar.f117083a == EnumC50720c.PENDING || bVar.f117083a == EnumC50720c.START) {
            return new C50696d(bVar.f117084b.f117047a, EnumC50699g.FILTER_STATE_DOWNLOADING, "", "");
        }
        if (bVar.f117083a == EnumC50720c.SUCCESS) {
            C50721d dVar = bVar.f117085c;
            if (dVar == null) {
                if (this.f117175o.mo86096a(bVar.f117084b)) {
                    dVar = this.f117175o.mo86013a(bVar.f117084b.f117047a);
                } else {
                    dVar = this.f117173m.mo86109d(bVar.f117084b.f117047a);
                }
            }
            return new C50696d(bVar.f117084b.f117047a, EnumC50699g.FILTER_STATE_DOWNLOAD_SUCCESS, dVar.f117088a, dVar.f117089b);
        } else if (bVar.f117083a == EnumC50720c.FAILED) {
            return new C50696d(bVar.f117084b.f117047a, EnumC50699g.FILTER_STATE_DOWNLOAD_FAILED, "", "");
        } else {
            return new C50696d(bVar.f117084b.f117047a, EnumC50699g.FILTER_STATE_UNKNOWN, "", "");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o
    /* renamed from: a */
    public final void mo86065a(C50698f fVar) {
        C50695c cVar;
        List<C50698f> list;
        C89219l.m154721d(fVar, "");
        C50710a b = this.f117170j.mo33459b(C89391z.f203057a);
        if (!(b == null || (cVar = b.f117057a) == null || (list = cVar.f117039a) == null)) {
            for (T t : list) {
                if (t.f117047a == fVar.f117047a) {
                    if (t != null) {
                        List<C50698f> list2 = b.f117057a.f117039a;
                        ArrayList arrayList = new ArrayList();
                        for (T t2 : list2) {
                            if (t2.f117047a != fVar.f117047a) {
                                arrayList.add(t2);
                            }
                        }
                        ArrayList arrayList2 = arrayList;
                        List<C89378p<EffectCategoryResponse, List<C50698f>>> list3 = b.f117057a.f117040b;
                        ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) list3, 10));
                        for (T t3 : list3) {
                            Object first = t3.getFirst();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj : (Iterable) t3.getSecond()) {
                                if (((C50698f) obj).f117047a != fVar.f117047a) {
                                    arrayList4.add(obj);
                                }
                            }
                            arrayList3.add(C89387v.m154943a(first, arrayList4));
                        }
                        this.f117170j.mo33641c(new C50710a(new C50695c(arrayList2, arrayList3), b.f117058b));
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.g$a */
    public static final class C50764a<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ List f117177a;

        static {
            Covode.recordClassIndex(59932);
        }

        public C50764a(List list) {
            this.f117177a = list;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            T t3 = t;
            Iterator it = this.f117177a.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (((C50698f) it.next()).f117047a == t3.f117047a) {
                    break;
                } else {
                    i++;
                }
            }
            int i2 = Integer.MAX_VALUE;
            if (i < 0) {
                i = Integer.MAX_VALUE;
            }
            Integer valueOf = Integer.valueOf(i);
            T t4 = t2;
            Iterator it2 = this.f117177a.iterator();
            int i3 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (((C50698f) it2.next()).f117047a != t4.f117047a) {
                    i3++;
                } else if (i3 >= 0) {
                    i2 = i3;
                }
            }
            return C89090a.m154604a(valueOf, Integer.valueOf(i2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a0, code lost:
        if (r5 == null) goto L_0x00a2;
     */
    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50707o
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p4560f.p4561a.AbstractC88979t<com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50696d> mo86063a(com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50698f r19, java.util.List<? extends p4600h.C89378p<com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse, ? extends java.util.List<com.p2082ss.android.ugc.aweme.filter.repository.p2986a.C50698f>>> r20) {
        /*
        // Method dump skipped, instructions count: 709
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50763g.mo86063a(com.ss.android.ugc.aweme.filter.repository.a.f, java.util.List):f.a.t");
    }

    /* renamed from: a */
    private static List<C50698f> m95090a(C50698f fVar, List<C50698f> list, List<? extends C89378p<EffectCategoryResponse, ? extends List<C50698f>>> list2) {
        Iterator<C50698f> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().f117047a != fVar.f117047a) {
                i++;
            } else if (i >= 0) {
                return list;
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.add(fVar);
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            C89070n.m154535a((Collection) arrayList2, (Iterable) ((List) it2.next().getSecond()));
        }
        ArrayList arrayList3 = arrayList2;
        if (arrayList.size() > 1) {
            C89070n.m154530a((List) arrayList, (Comparator) new C50764a(arrayList3));
        }
        return arrayList;
    }

    public C50763g(AbstractC50751l lVar, AbstractC50750k kVar, AbstractC50722e eVar, AbstractC50747h hVar, AbstractC50810n nVar, AbstractC50748i iVar, boolean z) {
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(nVar, "");
        C89219l.m154721d(iVar, "");
        this.f117173m = lVar;
        this.f117174n = kVar;
        this.f117175o = eVar;
        this.f117176p = hVar;
        this.f117167g = nVar;
        this.f117168h = iVar;
        this.f117169i = z;
        C20271f<C50710a> fVar = new C20271f<>();
        this.f117170j = fVar;
        C88958b<C50695c> bVar = new C88958b<>();
        C89219l.m154716b(bVar, "");
        this.f117162b = bVar;
        C88958b<Map<Integer, C50696d>> bVar2 = new C88958b<>();
        C89219l.m154716b(bVar2, "");
        this.f117164d = bVar2;
        C88960c<C50697e> cVar = new C88960c<>();
        C89219l.m154716b(cVar, "");
        this.f117171k = cVar;
        this.f117165e = new AtomicReference<>(null);
        this.f117172l = C89250i.m154773a((AbstractC89171a) new C50778k(this));
        this.f117166f = new C88411a();
        AbstractC20292c unused = mo33647a(C20165b.m38139a(hVar), C20165b.m38137a(fVar), AbstractC20272a.C20276b.m38473a(AbstractC20272a.C20276b.C20277a.f48121a, AbstractC20284a.C20285a.C20286a.f48130a));
        C20165b.m38137a(fVar).mo33476a(true, new AbstractC20168e[0]).mo143254a(new C50765b(this), C84909p.f189747a);
        kVar.mo86081a().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143292d(new C50779l(this)).mo143261a(C88392a.m153583a()).mo143254a(new C50780m(this), C84909p.f189747a);
    }
}
