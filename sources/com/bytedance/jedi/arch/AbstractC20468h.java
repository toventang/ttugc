package com.bytedance.jedi.arch;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.arch.internal.C20500i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4612a.AbstractC89190t;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.bytedance.jedi.arch.h */
public interface AbstractC20468h<RECEIVER extends AbstractC20467g> {
    static {
        Covode.recordClassIndex(23989);
    }

    <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super RECEIVER, ? super Throwable, C89391z> mVar, AbstractC89172b<? super RECEIVER, C89391z> bVar, AbstractC89183m<? super RECEIVER, ? super T, C89391z> mVar2);

    AbstractC20534v getLifecycleOwnerHolder();

    AbstractC20367ae<RECEIVER> getReceiverHolder();

    boolean getUniqueOnlyGlobal();

    <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super RECEIVER, ? super A, C89391z> mVar);

    <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super RECEIVER, ? super A, ? super B, C89391z> qVar);

    <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super RECEIVER, ? super A, ? super B, ? super C, C89391z> rVar);

    <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, C89391z> sVar);

    <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super RECEIVER, ? super S, C89391z> mVar);

    <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar);

    /* renamed from: com.bytedance.jedi.arch.h$a */
    public static final class C20469a {
        static {
            Covode.recordClassIndex(23990);
        }

        /* renamed from: a */
        public static <RECEIVER extends AbstractC20467g, S extends AbstractC20368af, A, B, C, D> AbstractC88412b m38673a(AbstractC20468h<? extends RECEIVER> hVar, JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
            C89219l.m154719c(jediViewModel, "");
            C89219l.m154719c(kVar, "");
            C89219l.m154719c(kVar2, "");
            C89219l.m154719c(kVar3, "");
            C89219l.m154719c(kVar4, "");
            C89219l.m154719c(ahVar, "");
            C89219l.m154719c(sVar, "");
            AbstractC20367ae<? extends RECEIVER> receiverHolder = hVar.getReceiverHolder();
            AbstractC1204m lifecycleOwner = hVar.getLifecycleOwnerHolder().getLifecycleOwner();
            C20370ah a = C20500i.m38704a(hVar, ahVar);
            C20474e eVar = new C20474e(receiverHolder, hVar, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
            C89219l.m154719c(jediViewModel, "");
            C89219l.m154719c(kVar, "");
            C89219l.m154719c(kVar2, "");
            C89219l.m154719c(kVar3, "");
            C89219l.m154719c(kVar4, "");
            C89219l.m154719c(a, "");
            C89219l.m154719c(eVar, "");
            AbstractC88979t<R> a2 = jediViewModel.bj_().mo33700b().mo143292d(new C20500i.C20513m(jediViewModel, lifecycleOwner, kVar, kVar2, kVar3, kVar4, eVar)).mo143263a(a.f48251b);
            AbstractC88984x xVar = a2;
            if (a.f48250a) {
                xVar = (AbstractC88979t<T>) a2.mo143297f();
            }
            C89219l.m154709a((Object) xVar, "");
            return jediViewModel.mo33681a((AbstractC88979t) xVar, lifecycleOwner, a.f48254e, a.f48252c, a.f48255f, new C20500i.C20514n(a, jediViewModel, lifecycleOwner, kVar, kVar2, kVar3, kVar4, eVar));
        }

        /* renamed from: a */
        public static <RECEIVER extends AbstractC20467g, VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R m38675a(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
            C89219l.m154719c(vm1, "");
            C89219l.m154719c(bVar, "");
            return (R) bVar.invoke(vm1.aB_());
        }

        /* renamed from: com.bytedance.jedi.arch.h$a$b */
        public static final class C20471b extends AbstractC89220m implements AbstractC89172b<A, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC20367ae f48417a;

            /* renamed from: b */
            final /* synthetic */ AbstractC20468h f48418b;

            /* renamed from: c */
            final /* synthetic */ JediViewModel f48419c;

            /* renamed from: d */
            final /* synthetic */ AbstractC89290k f48420d;

            /* renamed from: e */
            final /* synthetic */ C20370ah f48421e;

            /* renamed from: f */
            final /* synthetic */ AbstractC89183m f48422f;

            static {
                Covode.recordClassIndex(23992);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20471b(AbstractC20367ae aeVar, AbstractC20468h hVar, JediViewModel jediViewModel, AbstractC89290k kVar, C20370ah ahVar, AbstractC89183m mVar) {
                super(1);
                this.f48417a = aeVar;
                this.f48418b = hVar;
                this.f48419c = jediViewModel;
                this.f48420d = kVar;
                this.f48421e = ahVar;
                this.f48422f = mVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Object obj) {
                AbstractC20467g receiver = this.f48417a.getReceiver();
                if (receiver != null) {
                    this.f48422f.invoke(receiver, obj);
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.bytedance.jedi.arch.h$a$g */
        public static final class C20476g extends AbstractC89220m implements AbstractC89172b<S, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC20367ae f48457a;

            /* renamed from: b */
            final /* synthetic */ AbstractC20468h f48458b;

            /* renamed from: c */
            final /* synthetic */ JediViewModel f48459c;

            /* renamed from: d */
            final /* synthetic */ C20370ah f48460d;

            /* renamed from: e */
            final /* synthetic */ AbstractC89183m f48461e;

            static {
                Covode.recordClassIndex(23997);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20476g(AbstractC20367ae aeVar, AbstractC20468h hVar, JediViewModel jediViewModel, C20370ah ahVar, AbstractC89183m mVar) {
                super(1);
                this.f48457a = aeVar;
                this.f48458b = hVar;
                this.f48459c = jediViewModel;
                this.f48460d = ahVar;
                this.f48461e = mVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Object obj) {
                C89219l.m154719c(obj, "");
                AbstractC20467g receiver = this.f48457a.getReceiver();
                if (receiver != null) {
                    this.f48461e.invoke(receiver, obj);
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.bytedance.jedi.arch.h$a$a */
        public static final class C20470a extends AbstractC89220m implements AbstractC89172b<AbstractC20362a<? extends T>, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC20367ae f48409a;

            /* renamed from: b */
            final /* synthetic */ AbstractC20468h f48410b;

            /* renamed from: c */
            final /* synthetic */ JediViewModel f48411c;

            /* renamed from: d */
            final /* synthetic */ AbstractC89290k f48412d;

            /* renamed from: e */
            final /* synthetic */ C20370ah f48413e;

            /* renamed from: f */
            final /* synthetic */ AbstractC89172b f48414f;

            /* renamed from: g */
            final /* synthetic */ AbstractC89183m f48415g;

            /* renamed from: h */
            final /* synthetic */ AbstractC89183m f48416h;

            static {
                Covode.recordClassIndex(23991);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20470a(AbstractC20367ae aeVar, AbstractC20468h hVar, JediViewModel jediViewModel, AbstractC89290k kVar, C20370ah ahVar, AbstractC89172b bVar, AbstractC89183m mVar, AbstractC89183m mVar2) {
                super(1);
                this.f48409a = aeVar;
                this.f48410b = hVar;
                this.f48411c = jediViewModel;
                this.f48412d = kVar;
                this.f48413e = ahVar;
                this.f48414f = bVar;
                this.f48415g = mVar;
                this.f48416h = mVar2;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Object obj) {
                AbstractC89183m mVar;
                AbstractC20467g receiver;
                AbstractC20467g receiver2;
                AbstractC20467g receiver3;
                AbstractC20362a aVar = (AbstractC20362a) obj;
                C89219l.m154719c(aVar, "");
                if (aVar instanceof C20535w) {
                    AbstractC89172b bVar = this.f48414f;
                    if (!(bVar == null || (receiver3 = this.f48409a.getReceiver()) == null)) {
                        bVar.invoke(receiver3);
                    }
                } else if (aVar instanceof C20466f) {
                    AbstractC89183m mVar2 = this.f48415g;
                    if (!(mVar2 == null || (receiver2 = this.f48409a.getReceiver()) == null)) {
                        mVar2.invoke(receiver2, ((C20466f) aVar).f48408a);
                    }
                } else if (!(!(aVar instanceof C20372aj) || (mVar = this.f48416h) == null || (receiver = this.f48409a.getReceiver()) == null)) {
                    mVar.invoke(receiver, ((C20372aj) aVar).f48256a);
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.bytedance.jedi.arch.h$a$c */
        public static final class C20472c extends AbstractC89220m implements AbstractC89183m<A, B, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC20367ae f48423a;

            /* renamed from: b */
            final /* synthetic */ AbstractC20468h f48424b;

            /* renamed from: c */
            final /* synthetic */ JediViewModel f48425c;

            /* renamed from: d */
            final /* synthetic */ AbstractC89290k f48426d;

            /* renamed from: e */
            final /* synthetic */ AbstractC89290k f48427e;

            /* renamed from: f */
            final /* synthetic */ C20370ah f48428f;

            /* renamed from: g */
            final /* synthetic */ AbstractC89187q f48429g;

            static {
                Covode.recordClassIndex(23993);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20472c(AbstractC20367ae aeVar, AbstractC20468h hVar, JediViewModel jediViewModel, AbstractC89290k kVar, AbstractC89290k kVar2, C20370ah ahVar, AbstractC89187q qVar) {
                super(2);
                this.f48423a = aeVar;
                this.f48424b = hVar;
                this.f48425c = jediViewModel;
                this.f48426d = kVar;
                this.f48427e = kVar2;
                this.f48428f = ahVar;
                this.f48429g = qVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(Object obj, Object obj2) {
                AbstractC20467g receiver = this.f48423a.getReceiver();
                if (receiver != null) {
                    this.f48429g.invoke(receiver, obj, obj2);
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.bytedance.jedi.arch.h$a$d */
        public static final class C20473d extends AbstractC89220m implements AbstractC89187q<A, B, C, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC20367ae f48430a;

            /* renamed from: b */
            final /* synthetic */ AbstractC20468h f48431b;

            /* renamed from: c */
            final /* synthetic */ JediViewModel f48432c;

            /* renamed from: d */
            final /* synthetic */ AbstractC89290k f48433d;

            /* renamed from: e */
            final /* synthetic */ AbstractC89290k f48434e;

            /* renamed from: f */
            final /* synthetic */ AbstractC89290k f48435f;

            /* renamed from: g */
            final /* synthetic */ C20370ah f48436g;

            /* renamed from: h */
            final /* synthetic */ AbstractC89188r f48437h;

            static {
                Covode.recordClassIndex(23994);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20473d(AbstractC20367ae aeVar, AbstractC20468h hVar, JediViewModel jediViewModel, AbstractC89290k kVar, AbstractC89290k kVar2, AbstractC89290k kVar3, C20370ah ahVar, AbstractC89188r rVar) {
                super(3);
                this.f48430a = aeVar;
                this.f48431b = hVar;
                this.f48432c = jediViewModel;
                this.f48433d = kVar;
                this.f48434e = kVar2;
                this.f48435f = kVar3;
                this.f48436g = ahVar;
                this.f48437h = rVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89187q
            public final /* synthetic */ C89391z invoke(Object obj, Object obj2, Object obj3) {
                AbstractC20467g receiver = this.f48430a.getReceiver();
                if (receiver != null) {
                    this.f48437h.mo8774a(receiver, obj, obj2, obj3);
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.bytedance.jedi.arch.h$a$e */
        public static final class C20474e extends AbstractC89220m implements AbstractC89188r<A, B, C, D, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC20367ae f48438a;

            /* renamed from: b */
            final /* synthetic */ AbstractC20468h f48439b;

            /* renamed from: c */
            final /* synthetic */ JediViewModel f48440c;

            /* renamed from: d */
            final /* synthetic */ AbstractC89290k f48441d;

            /* renamed from: e */
            final /* synthetic */ AbstractC89290k f48442e;

            /* renamed from: f */
            final /* synthetic */ AbstractC89290k f48443f;

            /* renamed from: g */
            final /* synthetic */ AbstractC89290k f48444g;

            /* renamed from: h */
            final /* synthetic */ C20370ah f48445h;

            /* renamed from: i */
            final /* synthetic */ AbstractC89189s f48446i;

            static {
                Covode.recordClassIndex(23995);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20474e(AbstractC20367ae aeVar, AbstractC20468h hVar, JediViewModel jediViewModel, AbstractC89290k kVar, AbstractC89290k kVar2, AbstractC89290k kVar3, AbstractC89290k kVar4, C20370ah ahVar, AbstractC89189s sVar) {
                super(4);
                this.f48438a = aeVar;
                this.f48439b = hVar;
                this.f48440c = jediViewModel;
                this.f48441d = kVar;
                this.f48442e = kVar2;
                this.f48443f = kVar3;
                this.f48444g = kVar4;
                this.f48445h = ahVar;
                this.f48446i = sVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89188r
            /* renamed from: a */
            public final /* synthetic */ C89391z mo8774a(Object obj, Object obj2, Object obj3, Object obj4) {
                AbstractC20467g receiver = this.f48438a.getReceiver();
                if (receiver != null) {
                    this.f48446i.invoke(receiver, obj, obj2, obj3, obj4);
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: a */
        public static <RECEIVER extends AbstractC20467g, S extends AbstractC20368af> AbstractC88412b m38663a(AbstractC20468h<? extends RECEIVER> hVar, JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super RECEIVER, ? super S, C89391z> mVar) {
            C89219l.m154719c(jediViewModel, "");
            C89219l.m154719c(ahVar, "");
            C89219l.m154719c(mVar, "");
            AbstractC20367ae<? extends RECEIVER> receiverHolder = hVar.getReceiverHolder();
            AbstractC1204m lifecycleOwner = hVar.getLifecycleOwnerHolder().getLifecycleOwner();
            C20370ah a = C20500i.m38704a(hVar, ahVar);
            C20476g gVar = new C20476g(receiverHolder, hVar, jediViewModel, ahVar, mVar);
            C89219l.m154719c(jediViewModel, "");
            C89219l.m154719c(a, "");
            C89219l.m154719c(gVar, "");
            AbstractC88979t<S> a2 = jediViewModel.bj_().mo33700b().mo143263a(a.f48251b);
            if (a.f48250a) {
                a2 = a2.mo143297f();
            }
            C89219l.m154709a((Object) a2, "");
            return jediViewModel.mo33681a(a2, lifecycleOwner, a.f48254e, a.f48252c, a.f48255f, gVar);
        }

        /* renamed from: com.bytedance.jedi.arch.h$a$f */
        public static final class C20475f extends AbstractC89220m implements AbstractC89189s<A, B, C, D, E, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC20367ae f48447a;

            /* renamed from: b */
            final /* synthetic */ AbstractC20468h f48448b;

            /* renamed from: c */
            final /* synthetic */ JediViewModel f48449c;

            /* renamed from: d */
            final /* synthetic */ AbstractC89290k f48450d;

            /* renamed from: e */
            final /* synthetic */ AbstractC89290k f48451e;

            /* renamed from: f */
            final /* synthetic */ AbstractC89290k f48452f;

            /* renamed from: g */
            final /* synthetic */ AbstractC89290k f48453g;

            /* renamed from: h */
            final /* synthetic */ AbstractC89290k f48454h;

            /* renamed from: i */
            final /* synthetic */ C20370ah f48455i;

            /* renamed from: j */
            final /* synthetic */ AbstractC89190t f48456j;

            static {
                Covode.recordClassIndex(23996);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20475f(AbstractC20367ae aeVar, AbstractC20468h hVar, JediViewModel jediViewModel, AbstractC89290k kVar, AbstractC89290k kVar2, AbstractC89290k kVar3, AbstractC89290k kVar4, AbstractC89290k kVar5, C20370ah ahVar, AbstractC89190t tVar) {
                super(5);
                this.f48447a = aeVar;
                this.f48448b = hVar;
                this.f48449c = jediViewModel;
                this.f48450d = kVar;
                this.f48451e = kVar2;
                this.f48452f = kVar3;
                this.f48453g = kVar4;
                this.f48454h = kVar5;
                this.f48455i = ahVar;
                this.f48456j = tVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89189s
            public final /* synthetic */ C89391z invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                this.f48447a.getReceiver();
                return C89391z.f203057a;
            }
        }

        /* renamed from: a */
        public static <RECEIVER extends AbstractC20467g, S extends AbstractC20368af, A> AbstractC88412b m38665a(AbstractC20468h<? extends RECEIVER> hVar, JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super RECEIVER, ? super A, C89391z> mVar) {
            C89219l.m154719c(jediViewModel, "");
            C89219l.m154719c(kVar, "");
            C89219l.m154719c(ahVar, "");
            C89219l.m154719c(mVar, "");
            return C20500i.m38705a(jediViewModel, hVar.getLifecycleOwnerHolder().getLifecycleOwner(), kVar, C20500i.m38704a(hVar, ahVar), new C20471b(hVar.getReceiverHolder(), hVar, jediViewModel, kVar, ahVar, mVar));
        }

        /* renamed from: a */
        public static <RECEIVER extends AbstractC20467g, S extends AbstractC20368af, A, B> AbstractC88412b m38669a(AbstractC20468h<? extends RECEIVER> hVar, JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super RECEIVER, ? super A, ? super B, C89391z> qVar) {
            C89219l.m154719c(jediViewModel, "");
            C89219l.m154719c(kVar, "");
            C89219l.m154719c(kVar2, "");
            C89219l.m154719c(ahVar, "");
            C89219l.m154719c(qVar, "");
            AbstractC20367ae<? extends RECEIVER> receiverHolder = hVar.getReceiverHolder();
            AbstractC1204m lifecycleOwner = hVar.getLifecycleOwnerHolder().getLifecycleOwner();
            C20370ah a = C20500i.m38704a(hVar, ahVar);
            C20472c cVar = new C20472c(receiverHolder, hVar, jediViewModel, kVar, kVar2, ahVar, qVar);
            C89219l.m154719c(jediViewModel, "");
            C89219l.m154719c(kVar, "");
            C89219l.m154719c(kVar2, "");
            C89219l.m154719c(a, "");
            C89219l.m154719c(cVar, "");
            AbstractC88979t<R> a2 = jediViewModel.bj_().mo33700b().mo143292d(new C20500i.C20509i(jediViewModel, lifecycleOwner, kVar, kVar2, cVar)).mo143263a(a.f48251b);
            AbstractC88984x xVar = a2;
            if (a.f48250a) {
                xVar = (AbstractC88979t<T>) a2.mo143297f();
            }
            C89219l.m154709a((Object) xVar, "");
            return jediViewModel.mo33681a((AbstractC88979t) xVar, lifecycleOwner, a.f48254e, a.f48252c, a.f48255f, new C20500i.C20510j(a, jediViewModel, lifecycleOwner, kVar, kVar2, cVar));
        }

        /* renamed from: a */
        public static <RECEIVER extends AbstractC20467g, S extends AbstractC20368af, T> AbstractC88412b m38666a(AbstractC20468h<? extends RECEIVER> hVar, JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super RECEIVER, ? super Throwable, C89391z> mVar, AbstractC89172b<? super RECEIVER, C89391z> bVar, AbstractC89183m<? super RECEIVER, ? super T, C89391z> mVar2) {
            C89219l.m154719c(jediViewModel, "");
            C89219l.m154719c(kVar, "");
            C89219l.m154719c(ahVar, "");
            return C20500i.m38705a(jediViewModel, hVar.getLifecycleOwnerHolder().getLifecycleOwner(), kVar, C20500i.m38704a(hVar, ahVar), new C20470a(hVar.getReceiverHolder(), hVar, jediViewModel, kVar, ahVar, bVar, mVar, mVar2));
        }

        /* renamed from: a */
        public static <RECEIVER extends AbstractC20467g, S extends AbstractC20368af, A, B, C> AbstractC88412b m38671a(AbstractC20468h<? extends RECEIVER> hVar, JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super RECEIVER, ? super A, ? super B, ? super C, C89391z> rVar) {
            C89219l.m154719c(jediViewModel, "");
            C89219l.m154719c(kVar, "");
            C89219l.m154719c(kVar2, "");
            C89219l.m154719c(kVar3, "");
            C89219l.m154719c(ahVar, "");
            C89219l.m154719c(rVar, "");
            AbstractC20367ae<? extends RECEIVER> receiverHolder = hVar.getReceiverHolder();
            AbstractC1204m lifecycleOwner = hVar.getLifecycleOwnerHolder().getLifecycleOwner();
            C20370ah a = C20500i.m38704a(hVar, ahVar);
            C20473d dVar = new C20473d(receiverHolder, hVar, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
            C89219l.m154719c(jediViewModel, "");
            C89219l.m154719c(kVar, "");
            C89219l.m154719c(kVar2, "");
            C89219l.m154719c(kVar3, "");
            C89219l.m154719c(a, "");
            C89219l.m154719c(dVar, "");
            AbstractC88979t<R> a2 = jediViewModel.bj_().mo33700b().mo143292d(new C20500i.C20511k(jediViewModel, lifecycleOwner, kVar, kVar2, kVar3, dVar)).mo143263a(a.f48251b);
            AbstractC88984x xVar = a2;
            if (a.f48250a) {
                xVar = (AbstractC88979t<T>) a2.mo143297f();
            }
            C89219l.m154709a((Object) xVar, "");
            return jediViewModel.mo33681a((AbstractC88979t) xVar, lifecycleOwner, a.f48254e, a.f48252c, a.f48255f, new C20500i.C20512l(a, jediViewModel, lifecycleOwner, kVar, kVar2, kVar3, dVar));
        }

        /* renamed from: a */
        public static /* synthetic */ AbstractC88412b m38667a(AbstractC20468h hVar, JediViewModel jediViewModel, AbstractC89290k kVar, C20370ah ahVar, AbstractC89183m mVar, AbstractC89172b bVar, AbstractC89183m mVar2, int i) {
            C20370ah ahVar2 = ahVar;
            AbstractC89183m mVar3 = mVar;
            AbstractC89172b bVar2 = bVar;
            if ((i & 2) != 0) {
                ahVar2 = new C20370ah();
            }
            AbstractC89183m mVar4 = null;
            if ((i & 4) != 0) {
                mVar3 = null;
            }
            if ((i & 8) != 0) {
                bVar2 = null;
            }
            if ((i & 16) == 0) {
                mVar4 = mVar2;
            }
            return hVar.asyncSubscribe(jediViewModel, kVar, ahVar2, mVar3, bVar2, mVar4);
        }
    }
}
