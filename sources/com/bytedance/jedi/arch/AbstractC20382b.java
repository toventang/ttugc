package com.bytedance.jedi.arch;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20468h;
import com.bytedance.jedi.arch.AbstractC20527q;
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
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.bytedance.jedi.arch.b */
public interface AbstractC20382b extends AbstractC20527q {
    static {
        Covode.recordClassIndex(23894);
    }

    <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1);

    <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar);

    <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar);

    <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar);

    /* renamed from: com.bytedance.jedi.arch.b$a */
    public static final class C20383a {

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.jedi.arch.b$a$b */
        public static final class C20385b extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, A, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC89183m f48275a;

            static {
                Covode.recordClassIndex(23897);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20385b(AbstractC89183m mVar) {
                super(2);
                this.f48275a = mVar;
            }

            /* renamed from: com.bytedance.jedi.arch.b$a$b$a */
            static final class RunnableC20386a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ Throwable f48276a;

                static {
                    Covode.recordClassIndex(23898);
                }

                RunnableC20386a(Throwable th) {
                    this.f48276a = th;
                }

                public final void run() {
                    throw this.f48276a;
                }
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Object obj) {
                AbstractC20477i iVar2 = iVar;
                C89219l.m154721d(iVar2, "");
                if (obj != null) {
                    try {
                        this.f48275a.invoke((AbstractC20382b) iVar2, obj);
                    } catch (Throwable th) {
                        C20390c.f48281a.post(new RunnableC20386a(th));
                        throw th;
                    }
                }
                return C89391z.f203057a;
            }
        }

        static {
            Covode.recordClassIndex(23895);
        }

        /* renamed from: a */
        public static <S extends AbstractC20368af> AbstractC88412b m38583a(AbstractC20382b bVar, JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(mVar, "");
            return AbstractC20527q.C20528a.m38708a(bVar, jediViewModel, ahVar, mVar);
        }

        /* renamed from: a */
        public static <S extends AbstractC20368af, T> AbstractC88412b m38584a(AbstractC20382b bVar, JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar2, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(ahVar, "");
            return AbstractC20527q.C20528a.m38710a(bVar, jediViewModel, kVar, ahVar, mVar, bVar2, mVar2);
        }

        /* renamed from: a */
        public static <S extends AbstractC20368af, A, B> AbstractC88412b m38585a(AbstractC20382b bVar, JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(kVar2, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(qVar, "");
            return AbstractC20527q.C20528a.m38711a(bVar, jediViewModel, kVar, kVar2, ahVar, qVar);
        }

        /* renamed from: a */
        public static <S extends AbstractC20368af, A, B, C> AbstractC88412b m38586a(AbstractC20382b bVar, JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(kVar2, "");
            C89219l.m154721d(kVar3, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(rVar, "");
            return AbstractC20527q.C20528a.m38712a(bVar, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
        }

        /* renamed from: a */
        public static <S extends AbstractC20368af, A, B, C, D> AbstractC88412b m38587a(AbstractC20382b bVar, JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(kVar2, "");
            C89219l.m154721d(kVar3, "");
            C89219l.m154721d(kVar4, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(sVar, "");
            return AbstractC20527q.C20528a.m38713a(bVar, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
        }

        /* renamed from: a */
        public static <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R m38593a(AbstractC20382b bVar, VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar2) {
            C89219l.m154721d(vm1, "");
            C89219l.m154721d(bVar2, "");
            return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar2);
        }

        /* renamed from: d */
        public static <S extends AbstractC20368af, A> AbstractC88412b m38606d(AbstractC20382b bVar, JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(mVar, "");
            return AbstractC20527q.C20528a.m38709a(bVar, jediViewModel, kVar, ahVar, mVar);
        }

        /* renamed from: a */
        public static <S extends AbstractC20368af, A> void m38599a(AbstractC20382b bVar, JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(mVar, "");
            bVar.selectSubscribe(jediViewModel, kVar, ahVar, new C20385b(mVar));
        }

        /* renamed from: a */
        public static <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, VM2 extends JediViewModel<S2>, S2 extends AbstractC20368af, R> R m38592a(VM1 vm1, VM2 vm2, AbstractC89183m<? super S1, ? super S2, ? extends R> mVar) {
            C89219l.m154721d(vm1, "");
            C89219l.m154721d(vm2, "");
            C89219l.m154721d(mVar, "");
            C89219l.m154719c(vm1, "");
            C89219l.m154719c(vm2, "");
            C89219l.m154719c(mVar, "");
            C89219l.m154719c(vm1, "");
            C89219l.m154719c(vm2, "");
            C89219l.m154719c(mVar, "");
            C89219l.m154719c(vm1, "");
            C89219l.m154719c(vm2, "");
            C89219l.m154719c(mVar, "");
            return (R) mVar.invoke(vm1.aB_(), vm2.aB_());
        }

        /* renamed from: a */
        public static <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, VM2 extends JediViewModel<S2>, S2 extends AbstractC20368af, VM3 extends JediViewModel<S3>, S3 extends AbstractC20368af, R> R m38591a(VM1 vm1, VM2 vm2, VM3 vm3, AbstractC89187q<? super S1, ? super S2, ? super S3, ? extends R> qVar) {
            C89219l.m154721d(vm1, "");
            C89219l.m154721d(vm2, "");
            C89219l.m154721d(vm3, "");
            C89219l.m154721d(qVar, "");
            C89219l.m154719c(vm1, "");
            C89219l.m154719c(vm2, "");
            C89219l.m154719c(vm3, "");
            C89219l.m154719c(qVar, "");
            C89219l.m154719c(vm1, "");
            C89219l.m154719c(vm2, "");
            C89219l.m154719c(vm3, "");
            C89219l.m154719c(qVar, "");
            C89219l.m154719c(vm1, "");
            C89219l.m154719c(vm2, "");
            C89219l.m154719c(vm3, "");
            C89219l.m154719c(qVar, "");
            return (R) qVar.invoke(vm1.aB_(), vm2.aB_(), vm3.aB_());
        }

        /* renamed from: a */
        public static <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, VM2 extends JediViewModel<S2>, S2 extends AbstractC20368af, VM3 extends JediViewModel<S3>, S3 extends AbstractC20368af, VM4 extends JediViewModel<S4>, S4 extends AbstractC20368af, R> R m38590a(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, AbstractC89188r<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> rVar) {
            C89219l.m154721d(vm1, "");
            C89219l.m154721d(vm2, "");
            C89219l.m154721d(vm3, "");
            C89219l.m154721d(vm4, "");
            C89219l.m154721d(rVar, "");
            C89219l.m154719c(vm1, "");
            C89219l.m154719c(vm2, "");
            C89219l.m154719c(vm3, "");
            C89219l.m154719c(vm4, "");
            C89219l.m154719c(rVar, "");
            C89219l.m154719c(vm1, "");
            C89219l.m154719c(vm2, "");
            C89219l.m154719c(vm3, "");
            C89219l.m154719c(vm4, "");
            C89219l.m154719c(rVar, "");
            C89219l.m154719c(vm1, "");
            C89219l.m154719c(vm2, "");
            C89219l.m154719c(vm3, "");
            C89219l.m154719c(vm4, "");
            C89219l.m154719c(rVar, "");
            return (R) rVar.mo8774a(vm1.aB_(), vm2.aB_(), vm3.aB_(), vm4.aB_());
        }

        /* renamed from: a */
        public static <M1 extends C20536x<S1, PROP1>, PROP1 extends AbstractC20368af, S1 extends AbstractC20368af, R> R m38598a(C20536x<S1, PROP1> xVar, AbstractC89172b<? super PROP1, ? extends R> bVar) {
            C89219l.m154721d(xVar, "");
            C89219l.m154721d(bVar, "");
            C89219l.m154719c(xVar, "");
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(xVar, "");
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(xVar, "");
            C89219l.m154719c(bVar, "");
            return (R) bVar.invoke((Object) xVar.mo33810b().invoke(xVar.mo33803a().aB_()));
        }

        /* renamed from: a */
        public static <M1 extends C20536x<S1, PROP1>, PROP1 extends AbstractC20368af, S1 extends AbstractC20368af, M2 extends C20536x<S2, PROP2>, PROP2 extends AbstractC20368af, S2 extends AbstractC20368af, R> R m38597a(C20536x<S1, PROP1> xVar, C20536x<S2, PROP2> xVar2, AbstractC89183m<? super PROP1, ? super PROP2, ? extends R> mVar) {
            C89219l.m154721d(xVar, "");
            C89219l.m154721d(xVar2, "");
            C89219l.m154721d(mVar, "");
            C89219l.m154719c(xVar, "");
            C89219l.m154719c(xVar2, "");
            C89219l.m154719c(mVar, "");
            C89219l.m154719c(xVar, "");
            C89219l.m154719c(xVar2, "");
            C89219l.m154719c(mVar, "");
            C89219l.m154719c(xVar, "");
            C89219l.m154719c(xVar2, "");
            C89219l.m154719c(mVar, "");
            return (R) mVar.invoke((Object) xVar.mo33810b().invoke(xVar.mo33803a().aB_()), (Object) xVar2.mo33810b().invoke(xVar2.mo33803a().aB_()));
        }

        /* renamed from: a */
        public static <M1 extends C20536x<S1, PROP1>, PROP1 extends AbstractC20368af, S1 extends AbstractC20368af, M2 extends C20536x<S2, PROP2>, PROP2 extends AbstractC20368af, S2 extends AbstractC20368af, M3 extends C20536x<S3, PROP3>, PROP3 extends AbstractC20368af, S3 extends AbstractC20368af, R> R m38596a(C20536x<S1, PROP1> xVar, C20536x<S2, PROP2> xVar2, C20536x<S3, PROP3> xVar3, AbstractC89187q<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> qVar) {
            C89219l.m154721d(xVar, "");
            C89219l.m154721d(xVar2, "");
            C89219l.m154721d(xVar3, "");
            C89219l.m154721d(qVar, "");
            C89219l.m154719c(xVar, "");
            C89219l.m154719c(xVar2, "");
            C89219l.m154719c(xVar3, "");
            C89219l.m154719c(qVar, "");
            C89219l.m154719c(xVar, "");
            C89219l.m154719c(xVar2, "");
            C89219l.m154719c(xVar3, "");
            C89219l.m154719c(qVar, "");
            C89219l.m154719c(xVar, "");
            C89219l.m154719c(xVar2, "");
            C89219l.m154719c(xVar3, "");
            C89219l.m154719c(qVar, "");
            return (R) qVar.invoke((Object) xVar.mo33810b().invoke(xVar.mo33803a().aB_()), (Object) xVar2.mo33810b().invoke(xVar2.mo33803a().aB_()), (Object) xVar3.mo33810b().invoke(xVar3.mo33803a().aB_()));
        }

        /* renamed from: a */
        public static <M1 extends C20536x<S1, PROP1>, PROP1 extends AbstractC20368af, S1 extends AbstractC20368af, M2 extends C20536x<S2, PROP2>, PROP2 extends AbstractC20368af, S2 extends AbstractC20368af, M3 extends C20536x<S3, PROP3>, PROP3 extends AbstractC20368af, S3 extends AbstractC20368af, M4 extends C20536x<S4, PROP4>, PROP4 extends AbstractC20368af, S4 extends AbstractC20368af, R> R m38595a(C20536x<S1, PROP1> xVar, C20536x<S2, PROP2> xVar2, C20536x<S3, PROP3> xVar3, C20536x<S4, PROP4> xVar4, AbstractC89188r<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> rVar) {
            C89219l.m154721d(xVar, "");
            C89219l.m154721d(xVar2, "");
            C89219l.m154721d(xVar3, "");
            C89219l.m154721d(xVar4, "");
            C89219l.m154721d(rVar, "");
            C89219l.m154719c(xVar, "");
            C89219l.m154719c(xVar2, "");
            C89219l.m154719c(xVar3, "");
            C89219l.m154719c(xVar4, "");
            C89219l.m154719c(rVar, "");
            C89219l.m154719c(xVar, "");
            C89219l.m154719c(xVar2, "");
            C89219l.m154719c(xVar3, "");
            C89219l.m154719c(xVar4, "");
            C89219l.m154719c(rVar, "");
            C89219l.m154719c(xVar, "");
            C89219l.m154719c(xVar2, "");
            C89219l.m154719c(xVar3, "");
            C89219l.m154719c(xVar4, "");
            C89219l.m154719c(rVar, "");
            return (R) rVar.mo8774a((Object) xVar.mo33810b().invoke(xVar.mo33803a().aB_()), (Object) xVar2.mo33810b().invoke(xVar2.mo33803a().aB_()), (Object) xVar3.mo33810b().invoke(xVar3.mo33803a().aB_()), (Object) xVar4.mo33810b().invoke(xVar4.mo33803a().aB_()));
        }

        /* renamed from: a */
        public static <M1 extends C20536x<S1, PROP1>, PROP1 extends AbstractC20368af, S1 extends AbstractC20368af, M2 extends C20536x<S2, PROP2>, PROP2 extends AbstractC20368af, S2 extends AbstractC20368af, M3 extends C20536x<S3, PROP3>, PROP3 extends AbstractC20368af, S3 extends AbstractC20368af, M4 extends C20536x<S4, PROP4>, PROP4 extends AbstractC20368af, S4 extends AbstractC20368af, M5 extends C20536x<S5, PROP5>, PROP5 extends AbstractC20368af, S5 extends AbstractC20368af, R> R m38594a(C20536x<S1, PROP1> xVar, C20536x<S2, PROP2> xVar2, C20536x<S3, PROP3> xVar3, C20536x<S4, PROP4> xVar4, C20536x<S5, PROP5> xVar5, AbstractC89189s<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> sVar) {
            C89219l.m154721d(xVar, "");
            C89219l.m154721d(xVar2, "");
            C89219l.m154721d(xVar3, "");
            C89219l.m154721d(xVar4, "");
            C89219l.m154721d(xVar5, "");
            C89219l.m154721d(sVar, "");
            C89219l.m154719c(xVar, "");
            C89219l.m154719c(xVar2, "");
            C89219l.m154719c(xVar3, "");
            C89219l.m154719c(xVar4, "");
            C89219l.m154719c(xVar5, "");
            C89219l.m154719c(sVar, "");
            C89219l.m154719c(xVar, "");
            C89219l.m154719c(xVar2, "");
            C89219l.m154719c(xVar3, "");
            C89219l.m154719c(xVar4, "");
            C89219l.m154719c(xVar5, "");
            C89219l.m154719c(sVar, "");
            C89219l.m154719c(xVar, "");
            C89219l.m154719c(xVar2, "");
            C89219l.m154719c(xVar3, "");
            C89219l.m154719c(xVar4, "");
            C89219l.m154719c(xVar5, "");
            C89219l.m154719c(sVar, "");
            return (R) sVar.invoke((Object) xVar.mo33810b().invoke(xVar.mo33803a().aB_()), (Object) xVar2.mo33810b().invoke(xVar2.mo33803a().aB_()), (Object) xVar3.mo33810b().invoke(xVar3.mo33803a().aB_()), (Object) xVar4.mo33810b().invoke(xVar4.mo33803a().aB_()), (Object) xVar5.mo33810b().invoke(xVar5.mo33803a().aB_()));
        }

        /* renamed from: a */
        public static AbstractC1204m m38581a(AbstractC20382b bVar) {
            return bVar;
        }

        /* renamed from: b */
        public static AbstractC20534v m38601b(AbstractC20382b bVar) {
            return bVar;
        }

        /* renamed from: c */
        public static AbstractC20367ae<AbstractC20477i> m38604c(AbstractC20382b bVar) {
            return bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.jedi.arch.b$a$a */
        public static final class C20384a extends AbstractC89220m implements AbstractC89172b<S1, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C89233z.C89238e f48274a;

            static {
                Covode.recordClassIndex(23896);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20384a(C89233z.C89238e eVar) {
                super(1);
                this.f48274a = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Object obj) {
                C89219l.m154721d(obj, "");
                this.f48274a.element = obj;
                return C89391z.f203057a;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.jedi.arch.b$a$c */
        public static final class C20387c extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20391d<? extends A>, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC89183m f48277a;

            static {
                Covode.recordClassIndex(23899);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20387c(AbstractC89183m mVar) {
                super(2);
                this.f48277a = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Object obj) {
                final AbstractC20382b bVar2 = bVar;
                C20391d dVar = (C20391d) obj;
                C89219l.m154721d(bVar2, "");
                C89219l.m154721d(dVar, "");
                dVar.mo33724a(new AbstractC89172b<A, C89391z>(this) {
                    /* class com.bytedance.jedi.arch.AbstractC20382b.C20383a.C20387c.C203881 */

                    /* renamed from: a */
                    final /* synthetic */ C20387c f48278a;

                    static {
                        Covode.recordClassIndex(23900);
                    }

                    {
                        this.f48278a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* bridge */ /* synthetic */ C89391z invoke(Object obj) {
                        this.f48278a.f48277a.invoke(bVar2, obj);
                        return C89391z.f203057a;
                    }
                });
                return C89391z.f203057a;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.jedi.arch.b$a$d */
        public static final class C20389d extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C20365ac<? extends A>, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC89183m f48280a;

            static {
                Covode.recordClassIndex(23901);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C20389d(AbstractC89183m mVar) {
                super(2);
                this.f48280a = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Object obj) {
                C20365ac acVar = (C20365ac) obj;
                C89219l.m154721d(bVar, "");
                C89219l.m154721d(acVar, "");
                this.f48280a.invoke(bVar, acVar.f48249a);
                return C89391z.f203057a;
            }
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [S1 extends com.bytedance.jedi.arch.af, com.bytedance.jedi.arch.af] */
        /* renamed from: a */
        public static <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 m38582a(AbstractC20382b bVar, VM1 vm1) {
            C89219l.m154721d(vm1, "");
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = null;
            bVar.withState(vm1, new C20384a(eVar));
            T t = eVar.element;
            if (t == 0) {
                C89219l.m154715b();
            }
            return t;
        }

        /* renamed from: b */
        public static /* synthetic */ void m38603b(AbstractC20382b bVar, JediViewModel jediViewModel, AbstractC89290k kVar, AbstractC89183m mVar) {
            bVar.subscribeEvent(jediViewModel, kVar, new C20370ah(), mVar);
        }

        /* renamed from: b */
        public static <S extends AbstractC20368af, A> void m38602b(AbstractC20382b bVar, JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(mVar, "");
            bVar.selectNonNullSubscribe(jediViewModel, kVar, ahVar, new C20387c(mVar));
        }

        /* renamed from: c */
        public static <S extends AbstractC20368af, A> void m38605c(AbstractC20382b bVar, JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(mVar, "");
            bVar.selectNonNullSubscribe(jediViewModel, kVar, ahVar, new C20389d(mVar));
        }

        /* renamed from: a */
        public static <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, VM2 extends JediViewModel<S2>, S2 extends AbstractC20368af, VM3 extends JediViewModel<S3>, S3 extends AbstractC20368af, VM4 extends JediViewModel<S4>, S4 extends AbstractC20368af, VM5 extends JediViewModel<S5>, S5 extends AbstractC20368af, R> R m38589a(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, VM5 vm5, AbstractC89189s<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> sVar) {
            C89219l.m154721d(vm1, "");
            C89219l.m154721d(vm2, "");
            C89219l.m154721d(vm3, "");
            C89219l.m154721d(vm4, "");
            C89219l.m154721d(vm5, "");
            C89219l.m154721d(sVar, "");
            C89219l.m154719c(vm1, "");
            C89219l.m154719c(vm2, "");
            C89219l.m154719c(vm3, "");
            C89219l.m154719c(vm4, "");
            C89219l.m154719c(vm5, "");
            C89219l.m154719c(sVar, "");
            C89219l.m154719c(vm1, "");
            C89219l.m154719c(vm2, "");
            C89219l.m154719c(vm3, "");
            C89219l.m154719c(vm4, "");
            C89219l.m154719c(vm5, "");
            C89219l.m154719c(sVar, "");
            C89219l.m154719c(vm1, "");
            C89219l.m154719c(vm2, "");
            C89219l.m154719c(vm3, "");
            C89219l.m154719c(vm4, "");
            C89219l.m154719c(vm5, "");
            C89219l.m154719c(sVar, "");
            return (R) sVar.invoke(vm1.aB_(), vm2.aB_(), vm3.aB_(), vm4.aB_(), vm5.aB_());
        }

        /* renamed from: a */
        public static <S extends AbstractC20368af, A, B, C, D, E> AbstractC88412b m38588a(AbstractC20382b bVar, JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, AbstractC89290k<S, ? extends E> kVar5, C20370ah<C20377ao<A, B, C, D, E>> ahVar, AbstractC89190t<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, ? super E, C89391z> tVar) {
            C89219l.m154721d(jediViewModel, "");
            C89219l.m154721d(kVar, "");
            C89219l.m154721d(kVar2, "");
            C89219l.m154721d(kVar3, "");
            C89219l.m154721d(kVar4, "");
            C89219l.m154721d(kVar5, "");
            C89219l.m154721d(ahVar, "");
            C89219l.m154721d(tVar, "");
            C89219l.m154719c(jediViewModel, "");
            C89219l.m154719c(kVar, "");
            C89219l.m154719c(kVar2, "");
            C89219l.m154719c(kVar3, "");
            C89219l.m154719c(kVar4, "");
            C89219l.m154719c(kVar5, "");
            C89219l.m154719c(ahVar, "");
            C89219l.m154719c(tVar, "");
            C89219l.m154719c(jediViewModel, "");
            C89219l.m154719c(kVar, "");
            C89219l.m154719c(kVar2, "");
            C89219l.m154719c(kVar3, "");
            C89219l.m154719c(kVar4, "");
            C89219l.m154719c(kVar5, "");
            C89219l.m154719c(ahVar, "");
            C89219l.m154719c(tVar, "");
            C89219l.m154719c(jediViewModel, "");
            C89219l.m154719c(kVar, "");
            C89219l.m154719c(kVar2, "");
            C89219l.m154719c(kVar3, "");
            C89219l.m154719c(kVar4, "");
            C89219l.m154719c(kVar5, "");
            C89219l.m154719c(ahVar, "");
            C89219l.m154719c(tVar, "");
            AbstractC20367ae receiverHolder = bVar.getReceiverHolder();
            AbstractC1204m lifecycleOwner = bVar.getLifecycleOwnerHolder().getLifecycleOwner();
            C20370ah a = C20500i.m38704a(bVar, ahVar);
            AbstractC20468h.C20469a.C20475f fVar = new AbstractC20468h.C20469a.C20475f(receiverHolder, bVar, jediViewModel, kVar, kVar2, kVar3, kVar4, kVar5, ahVar, tVar);
            C89219l.m154719c(jediViewModel, "");
            C89219l.m154719c(kVar, "");
            C89219l.m154719c(kVar2, "");
            C89219l.m154719c(kVar3, "");
            C89219l.m154719c(kVar4, "");
            C89219l.m154719c(kVar5, "");
            C89219l.m154719c(a, "");
            C89219l.m154719c(fVar, "");
            AbstractC88979t<R> a2 = jediViewModel.bj_().mo33700b().mo143292d(new C20500i.C20515o(jediViewModel, lifecycleOwner, kVar, kVar2, kVar3, kVar4, kVar5, fVar)).mo143263a(a.f48251b);
            AbstractC88984x xVar = a2;
            if (a.f48250a) {
                xVar = (AbstractC88979t<T>) a2.mo143297f();
            }
            C89219l.m154709a((Object) xVar, "");
            return jediViewModel.mo33681a((AbstractC88979t) xVar, lifecycleOwner, a.f48254e, a.f48252c, a.f48255f, new C20500i.C20507g(a, jediViewModel, lifecycleOwner, kVar, kVar2, kVar3, kVar4, kVar5, fVar));
        }
    }
}
