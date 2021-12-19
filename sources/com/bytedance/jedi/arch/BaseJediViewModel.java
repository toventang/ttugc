package com.bytedance.jedi.arch;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88790v;
import p4560f.p4561a.p4587h.C88925a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

public abstract class BaseJediViewModel<S extends AbstractC20368af> extends JediViewModel<S> {
    static {
        Covode.recordClassIndex(23859);
    }

    /* renamed from: com.bytedance.jedi.arch.BaseJediViewModel$b */
    public static final class C20352b implements AbstractC20382b {

        /* renamed from: a */
        final /* synthetic */ AbstractC1204m f48227a;

        static {
            Covode.recordClassIndex(23861);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20468h
        public final boolean getUniqueOnlyGlobal() {
            return true;
        }

        /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
        @Override // com.bytedance.jedi.arch.AbstractC20367ae
        public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
            return this;
        }

        @Override // com.bytedance.jedi.arch.AbstractC20534v
        public final AbstractC1204m getLifecycleOwner() {
            return AbstractC20382b.C20383a.m38581a(this);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20468h
        public final AbstractC20534v getLifecycleOwnerHolder() {
            return AbstractC20382b.C20383a.m38601b(this);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20468h
        public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
            return AbstractC20382b.C20383a.m38604c(this);
        }

        @Override // androidx.lifecycle.AbstractC1204m
        public final AbstractC1196i getLifecycle() {
            AbstractC1196i lifecycle = this.f48227a.getLifecycle();
            C89219l.m154716b(lifecycle, "");
            return lifecycle;
        }

        C20352b(AbstractC1204m mVar) {
            this.f48227a = mVar;
        }

        @Override // com.bytedance.jedi.arch.AbstractC20382b
        public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
            C89219l.m154721d(vm1, "");
            return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20468h
        public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
            C89219l.m154721d(vm1, "");
            C89219l.m154721d(bVar, "");
            return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20468h
        public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(mVar, "");
            return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20382b
        public final <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(mVar, "");
            AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20468h
        public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(mVar, "");
            return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20382b
        public final <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(mVar, "");
            AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20382b
        public final <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(mVar, "");
            AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20468h
        public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(kVar2, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(qVar, "");
            return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20468h
        public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(ahVar, "");
            return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20468h
        public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(kVar2, "");
            C89219l.m154721d(kVar3, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(rVar, "");
            return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
        }

        @Override // com.bytedance.jedi.arch.AbstractC20468h
        public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(kVar2, "");
            C89219l.m154721d(kVar3, "");
            C89219l.m154721d(kVar4, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(sVar, "");
            return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
        }
    }

    /* renamed from: com.bytedance.jedi.arch.BaseJediViewModel$a */
    static final class C20351a extends AbstractC89220m implements AbstractC89172b<S, S> {

        /* renamed from: a */
        public static final C20351a f48226a = new C20351a();

        static {
            Covode.recordClassIndex(23860);
        }

        C20351a() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(Object obj) {
            C89219l.m154721d(obj, "");
            return obj;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.arch.BaseJediViewModel$c */
    public static final class C20353c extends AbstractC89220m implements AbstractC89172b<A, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f48228a;

        static {
            Covode.recordClassIndex(23862);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20353c(AbstractC89172b bVar) {
            super(1);
            this.f48228a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* bridge */ /* synthetic */ C89391z invoke(Object obj) {
            if (obj != null) {
                this.f48228a.invoke(obj);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final S mo33676a(AbstractC1204m mVar) {
        C89219l.m154721d(mVar, "");
        return (S) ((AbstractC20368af) new C20352b(mVar).withState(this, C20351a.f48226a));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public <A> AbstractC88412b m38548b(AbstractC1204m mVar, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89172b<? super A, C89391z> bVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(bVar, "");
        AbstractC1196i lifecycle = mVar.getLifecycle();
        C89219l.m154716b(lifecycle, "");
        if (lifecycle.mo4011a() == AbstractC1196i.EnumC1199b.DESTROYED) {
            AbstractC88412b g = C88925a.m154171a(C88790v.f201616a).mo143300g();
            C89219l.m154716b(g, "");
            return g;
        }
        AbstractC88412b a = mo33683a(kVar, ahVar, bVar);
        mVar.getLifecycle().mo4012a(new BaseJediViewModel$selectSubscribe$2(a));
        return a;
    }

    /* renamed from: a */
    public final <A> AbstractC88412b mo33677a(AbstractC1204m mVar, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89172b<? super A, C89391z> bVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(bVar, "");
        return m38548b(mVar, kVar, ahVar, new C20353c(bVar));
    }
}
