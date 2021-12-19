package com.bytedance.assem.arch.viewModel;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.extensions.C12794p;
import com.bytedance.assem.arch.extensions.C12795q;
import com.bytedance.assem.arch.extensions.C12796r;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.assem.arch.p795b.C12690t;
import com.bytedance.assem.arch.viewModel.AbstractC12840g;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.bytedance.assem.arch.viewModel.f */
public interface AbstractC12818f<RECEIVER extends AbstractC22876d> {
    static {
        Covode.recordClassIndex(14650);
    }

    /* renamed from: a */
    <S extends AbstractC12853j> void mo20508a(AssemViewModel<S> assemViewModel, C12854k<S> kVar, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super RECEIVER, ? super S, C89391z> mVar);

    /* renamed from: a */
    <S extends AbstractC12853j, A> void mo20509a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super RECEIVER, ? super A, C89391z> mVar);

    /* renamed from: a */
    <S extends AbstractC12853j, A, B> void mo20510a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C12854k<C12794p<A, B>> kVar3, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89187q<? super RECEIVER, ? super A, ? super B, C89391z> qVar);

    /* renamed from: a */
    <S extends AbstractC12853j, A, B, C> void mo20511a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C12854k<C12795q<A, B, C>> kVar4, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89188r<? super RECEIVER, ? super A, ? super B, ? super C, C89391z> rVar);

    /* renamed from: a */
    <S extends AbstractC12853j, A, B, C, D> void mo20512a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C12854k<C12796r<A, B, C, D>> kVar5, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89189s<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, C89391z> sVar);

    /* renamed from: b */
    <S extends AbstractC12853j, A> void mo20515b(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super RECEIVER, ? super A, C89391z> mVar);

    AbstractC22878f getActualLifecycleOwnerHolder();

    AbstractC22880h<RECEIVER> getActualReceiverHolder();

    boolean getHasSubscribedForReused();

    AbstractC1204m getHostLifecycleOwner();

    RECEIVER getReceiverForHostVM();

    boolean getUniqueOnlyDefault();

    /* renamed from: com.bytedance.assem.arch.viewModel.f$a */
    public static final class C12819a {
        static {
            Covode.recordClassIndex(14651);
        }

        /* renamed from: a */
        public static /* synthetic */ void m23067a(AbstractC12818f fVar, AssemViewModel assemViewModel, AbstractC89290k kVar, AbstractC89290k kVar2, AbstractC89290k kVar3, C12854k kVar4, AbstractC89188r rVar, int i) {
            C12854k kVar5 = kVar4;
            if ((i & 8) != 0) {
                kVar5 = C12856l.m23102a(assemViewModel.f31149c);
            }
            fVar.mo20511a(assemViewModel, kVar, kVar2, kVar3, kVar5, null, rVar);
        }

        /* renamed from: a */
        public static <RECEIVER extends AbstractC22876d, S extends AbstractC12853j, A, B, C, D> void m23068a(AbstractC12818f<RECEIVER> fVar, AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C12854k<C12796r<A, B, C, D>> kVar5, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89189s<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
            C89219l.m154719c(assemViewModel, "");
            C89219l.m154719c(kVar, "");
            C89219l.m154719c(kVar2, "");
            C89219l.m154719c(kVar3, "");
            C89219l.m154719c(kVar4, "");
            C89219l.m154719c(kVar5, "");
            C89219l.m154719c(sVar, "");
            if (assemViewModel.f31149c) {
                assemViewModel.mo20671d().mo20685a(fVar.getActualLifecycleOwnerHolder().getActualLifecycleOwner(), kVar, kVar2, kVar3, kVar4, C12856l.m23101a(fVar, kVar5, assemViewModel.f31149c, assemViewModel.bR_()), AbstractC12840g.C12841a.C12845d.f31274a, new C12828f(fVar.getActualReceiverHolder(), fVar, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar));
            } else if (!fVar.getHasSubscribedForReused()) {
                AbstractC12840g<S> d = assemViewModel.mo20671d();
                AbstractC1204m hostLifecycleOwner = fVar.getHostLifecycleOwner();
                if (hostLifecycleOwner == null) {
                    hostLifecycleOwner = fVar.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
                }
                d.mo20685a(hostLifecycleOwner, kVar, kVar2, kVar3, kVar4, C12856l.m23101a(fVar, kVar5, false, assemViewModel.bR_()), m23058a(fVar), new C12833j(fVar, sVar));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.assem.arch.viewModel.f$a$b */
        public static final class C12821b extends AbstractC89220m implements AbstractC89171a<Boolean> {

            /* renamed from: a */
            public static final C12821b f31187a = new C12821b();

            static {
                Covode.recordClassIndex(14653);
            }

            C12821b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Boolean invoke() {
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.assem.arch.viewModel.f$a$a */
        public static final class C12820a extends AbstractC89220m implements AbstractC89171a<Boolean> {

            /* renamed from: a */
            final /* synthetic */ AbstractC12818f f31186a;

            static {
                Covode.recordClassIndex(14652);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12820a(AbstractC12818f fVar) {
                super(0);
                this.f31186a = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Boolean invoke() {
                boolean z;
                AbstractC22876d receiverForHostVM = this.f31186a.getReceiverForHostVM();
                if (receiverForHostVM == null || !(receiverForHostVM instanceof AbstractC12693u)) {
                    z = true;
                } else {
                    z = ((AbstractC12693u) receiverForHostVM).f30898k;
                }
                return Boolean.valueOf(z);
            }
        }

        /* renamed from: a */
        private static <RECEIVER extends AbstractC22876d> AbstractC89171a<Boolean> m23058a(AbstractC12818f<RECEIVER> fVar) {
            if (fVar.getReceiverForHostVM() != null) {
                return new C12820a(fVar);
            }
            return C12821b.f31187a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.assem.arch.viewModel.f$a$c */
        public static final class C12822c extends AbstractC89220m implements AbstractC89172b<A, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC22880h f31188a;

            /* renamed from: b */
            final /* synthetic */ AbstractC12818f f31189b;

            /* renamed from: c */
            final /* synthetic */ AssemViewModel f31190c;

            /* renamed from: d */
            final /* synthetic */ AbstractC89290k f31191d;

            /* renamed from: e */
            final /* synthetic */ C12854k f31192e;

            /* renamed from: f */
            final /* synthetic */ AbstractC89172b f31193f;

            /* renamed from: g */
            final /* synthetic */ AbstractC89183m f31194g;

            static {
                Covode.recordClassIndex(14654);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12822c(AbstractC22880h hVar, AbstractC12818f fVar, AssemViewModel assemViewModel, AbstractC89290k kVar, C12854k kVar2, AbstractC89172b bVar, AbstractC89183m mVar) {
                super(1);
                this.f31188a = hVar;
                this.f31189b = fVar;
                this.f31190c = assemViewModel;
                this.f31191d = kVar;
                this.f31192e = kVar2;
                this.f31193f = bVar;
                this.f31194g = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(final Object obj) {
                final AbstractC22876d actualReceiver = this.f31188a.getActualReceiver();
                if (actualReceiver != null) {
                    C12690t.m22849a(actualReceiver, new AbstractC89171a<C89391z>() {
                        /* class com.bytedance.assem.arch.viewModel.AbstractC12818f.C12819a.C12822c.C128231 */

                        static {
                            Covode.recordClassIndex(14655);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* bridge */ /* synthetic */ C89391z invoke() {
                            this.f31194g.invoke(actualReceiver, obj);
                            return C89391z.f203057a;
                        }
                    });
                }
                return C89391z.f203057a;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.assem.arch.viewModel.f$a$g */
        public static final class C12830g extends AbstractC89220m implements AbstractC89172b<A, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC12818f f31240a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89183m f31241b;

            static {
                Covode.recordClassIndex(14662);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12830g(AbstractC12818f fVar, AbstractC89183m mVar) {
                super(1);
                this.f31240a = fVar;
                this.f31241b = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Object obj) {
                AbstractC22876d receiverForHostVM = this.f31240a.getReceiverForHostVM();
                if (!(receiverForHostVM == null && (receiverForHostVM = this.f31240a.getActualReceiverHolder().getActualReceiver()) == null)) {
                    this.f31241b.invoke(receiverForHostVM, obj);
                }
                return C89391z.f203057a;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.assem.arch.viewModel.f$a$k */
        public static final class C12834k extends AbstractC89220m implements AbstractC89172b<A, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC22880h f31248a;

            /* renamed from: b */
            final /* synthetic */ AbstractC12818f f31249b;

            /* renamed from: c */
            final /* synthetic */ AssemViewModel f31250c;

            /* renamed from: d */
            final /* synthetic */ AbstractC89290k f31251d;

            /* renamed from: e */
            final /* synthetic */ C12854k f31252e;

            /* renamed from: f */
            final /* synthetic */ AbstractC89172b f31253f;

            /* renamed from: g */
            final /* synthetic */ AbstractC89183m f31254g;

            static {
                Covode.recordClassIndex(14666);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12834k(AbstractC22880h hVar, AbstractC12818f fVar, AssemViewModel assemViewModel, AbstractC89290k kVar, C12854k kVar2, AbstractC89172b bVar, AbstractC89183m mVar) {
                super(1);
                this.f31248a = hVar;
                this.f31249b = fVar;
                this.f31250c = assemViewModel;
                this.f31251d = kVar;
                this.f31252e = kVar2;
                this.f31253f = bVar;
                this.f31254g = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(final Object obj) {
                final AbstractC22876d actualReceiver = this.f31248a.getActualReceiver();
                if (actualReceiver != null) {
                    C12690t.m22849a(actualReceiver, new AbstractC89171a<C89391z>() {
                        /* class com.bytedance.assem.arch.viewModel.AbstractC12818f.C12819a.C12834k.C128351 */

                        static {
                            Covode.recordClassIndex(14667);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* bridge */ /* synthetic */ C89391z invoke() {
                            this.f31254g.invoke(actualReceiver, obj);
                            return C89391z.f203057a;
                        }
                    });
                }
                return C89391z.f203057a;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.assem.arch.viewModel.f$a$l */
        public static final class C12836l extends AbstractC89220m implements AbstractC89172b<A, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC12818f f31258a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89183m f31259b;

            static {
                Covode.recordClassIndex(14668);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12836l(AbstractC12818f fVar, AbstractC89183m mVar) {
                super(1);
                this.f31258a = fVar;
                this.f31259b = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Object obj) {
                AbstractC22876d receiverForHostVM = this.f31258a.getReceiverForHostVM();
                if (!(receiverForHostVM == null && (receiverForHostVM = this.f31258a.getActualReceiverHolder().getActualReceiver()) == null)) {
                    this.f31259b.invoke(receiverForHostVM, obj);
                }
                return C89391z.f203057a;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.assem.arch.viewModel.f$a$m */
        public static final class C12837m extends AbstractC89220m implements AbstractC89172b<S, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC22880h f31260a;

            /* renamed from: b */
            final /* synthetic */ AbstractC12818f f31261b;

            /* renamed from: c */
            final /* synthetic */ AssemViewModel f31262c;

            /* renamed from: d */
            final /* synthetic */ C12854k f31263d;

            /* renamed from: e */
            final /* synthetic */ AbstractC89172b f31264e;

            /* renamed from: f */
            final /* synthetic */ AbstractC89183m f31265f;

            static {
                Covode.recordClassIndex(14669);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12837m(AbstractC22880h hVar, AbstractC12818f fVar, AssemViewModel assemViewModel, C12854k kVar, AbstractC89172b bVar, AbstractC89183m mVar) {
                super(1);
                this.f31260a = hVar;
                this.f31261b = fVar;
                this.f31262c = assemViewModel;
                this.f31263d = kVar;
                this.f31264e = bVar;
                this.f31265f = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Object obj) {
                final AbstractC12853j jVar = (AbstractC12853j) obj;
                C89219l.m154719c(jVar, "");
                final AbstractC22876d actualReceiver = this.f31260a.getActualReceiver();
                if (actualReceiver != null) {
                    C12690t.m22849a(actualReceiver, new AbstractC89171a<C89391z>() {
                        /* class com.bytedance.assem.arch.viewModel.AbstractC12818f.C12819a.C12837m.C128381 */

                        static {
                            Covode.recordClassIndex(14670);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* bridge */ /* synthetic */ C89391z invoke() {
                            this.f31265f.invoke(actualReceiver, jVar);
                            return C89391z.f203057a;
                        }
                    });
                }
                return C89391z.f203057a;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.assem.arch.viewModel.f$a$n */
        public static final class C12839n extends AbstractC89220m implements AbstractC89172b<S, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC12818f f31269a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89183m f31270b;

            static {
                Covode.recordClassIndex(14671);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12839n(AbstractC12818f fVar, AbstractC89183m mVar) {
                super(1);
                this.f31269a = fVar;
                this.f31270b = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Object obj) {
                C89219l.m154719c(obj, "");
                AbstractC22876d receiverForHostVM = this.f31269a.getReceiverForHostVM();
                if (!(receiverForHostVM == null && (receiverForHostVM = this.f31269a.getActualReceiverHolder().getActualReceiver()) == null)) {
                    this.f31270b.invoke(receiverForHostVM, obj);
                }
                return C89391z.f203057a;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.assem.arch.viewModel.f$a$d */
        public static final class C12824d extends AbstractC89220m implements AbstractC89183m<A, B, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC22880h f31198a;

            /* renamed from: b */
            final /* synthetic */ AbstractC12818f f31199b;

            /* renamed from: c */
            final /* synthetic */ AssemViewModel f31200c;

            /* renamed from: d */
            final /* synthetic */ AbstractC89290k f31201d;

            /* renamed from: e */
            final /* synthetic */ AbstractC89290k f31202e;

            /* renamed from: f */
            final /* synthetic */ C12854k f31203f;

            /* renamed from: g */
            final /* synthetic */ AbstractC89172b f31204g;

            /* renamed from: h */
            final /* synthetic */ AbstractC89187q f31205h;

            static {
                Covode.recordClassIndex(14656);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12824d(AbstractC22880h hVar, AbstractC12818f fVar, AssemViewModel assemViewModel, AbstractC89290k kVar, AbstractC89290k kVar2, C12854k kVar3, AbstractC89172b bVar, AbstractC89187q qVar) {
                super(2);
                this.f31198a = hVar;
                this.f31199b = fVar;
                this.f31200c = assemViewModel;
                this.f31201d = kVar;
                this.f31202e = kVar2;
                this.f31203f = kVar3;
                this.f31204g = bVar;
                this.f31205h = qVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(final Object obj, final Object obj2) {
                final AbstractC22876d actualReceiver = this.f31198a.getActualReceiver();
                if (actualReceiver != null) {
                    C12690t.m22849a(actualReceiver, new AbstractC89171a<C89391z>() {
                        /* class com.bytedance.assem.arch.viewModel.AbstractC12818f.C12819a.C12824d.C128251 */

                        static {
                            Covode.recordClassIndex(14657);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* bridge */ /* synthetic */ C89391z invoke() {
                            this.f31205h.invoke(actualReceiver, obj, obj2);
                            return C89391z.f203057a;
                        }
                    });
                }
                return C89391z.f203057a;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.assem.arch.viewModel.f$a$h */
        public static final class C12831h extends AbstractC89220m implements AbstractC89183m<A, B, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC12818f f31242a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89187q f31243b;

            static {
                Covode.recordClassIndex(14663);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12831h(AbstractC12818f fVar, AbstractC89187q qVar) {
                super(2);
                this.f31242a = fVar;
                this.f31243b = qVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(Object obj, Object obj2) {
                AbstractC22876d receiverForHostVM = this.f31242a.getReceiverForHostVM();
                if (!(receiverForHostVM == null && (receiverForHostVM = this.f31242a.getActualReceiverHolder().getActualReceiver()) == null)) {
                    this.f31243b.invoke(receiverForHostVM, obj, obj2);
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: a */
        public static <RECEIVER extends AbstractC22876d, VM1 extends AssemViewModel<S1>, S1 extends AbstractC12853j, R> R m23059a(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
            C89219l.m154719c(vm1, "");
            C89219l.m154719c(bVar, "");
            return (R) bVar.invoke(vm1.mo20671d().mo20680a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.assem.arch.viewModel.f$a$e */
        public static final class C12826e extends AbstractC89220m implements AbstractC89187q<A, B, C, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC22880h f31210a;

            /* renamed from: b */
            final /* synthetic */ AbstractC12818f f31211b;

            /* renamed from: c */
            final /* synthetic */ AssemViewModel f31212c;

            /* renamed from: d */
            final /* synthetic */ AbstractC89290k f31213d;

            /* renamed from: e */
            final /* synthetic */ AbstractC89290k f31214e;

            /* renamed from: f */
            final /* synthetic */ AbstractC89290k f31215f;

            /* renamed from: g */
            final /* synthetic */ C12854k f31216g;

            /* renamed from: h */
            final /* synthetic */ AbstractC89172b f31217h;

            /* renamed from: i */
            final /* synthetic */ AbstractC89188r f31218i;

            static {
                Covode.recordClassIndex(14658);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12826e(AbstractC22880h hVar, AbstractC12818f fVar, AssemViewModel assemViewModel, AbstractC89290k kVar, AbstractC89290k kVar2, AbstractC89290k kVar3, C12854k kVar4, AbstractC89172b bVar, AbstractC89188r rVar) {
                super(3);
                this.f31210a = hVar;
                this.f31211b = fVar;
                this.f31212c = assemViewModel;
                this.f31213d = kVar;
                this.f31214e = kVar2;
                this.f31215f = kVar3;
                this.f31216g = kVar4;
                this.f31217h = bVar;
                this.f31218i = rVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89187q
            public final /* synthetic */ C89391z invoke(final Object obj, final Object obj2, final Object obj3) {
                final AbstractC22876d actualReceiver = this.f31210a.getActualReceiver();
                if (actualReceiver != null) {
                    C12690t.m22849a(actualReceiver, new AbstractC89171a<C89391z>() {
                        /* class com.bytedance.assem.arch.viewModel.AbstractC12818f.C12819a.C12826e.C128271 */

                        static {
                            Covode.recordClassIndex(14659);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* synthetic */ C89391z invoke() {
                            this.f31218i.mo8774a(actualReceiver, obj, obj2, obj3);
                            return C89391z.f203057a;
                        }
                    });
                }
                return C89391z.f203057a;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.assem.arch.viewModel.f$a$i */
        public static final class C12832i extends AbstractC89220m implements AbstractC89187q<A, B, C, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC12818f f31244a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89188r f31245b;

            static {
                Covode.recordClassIndex(14664);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12832i(AbstractC12818f fVar, AbstractC89188r rVar) {
                super(3);
                this.f31244a = fVar;
                this.f31245b = rVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89187q
            public final /* synthetic */ C89391z invoke(Object obj, Object obj2, Object obj3) {
                AbstractC22876d receiverForHostVM = this.f31244a.getReceiverForHostVM();
                if (!(receiverForHostVM == null && (receiverForHostVM = this.f31244a.getActualReceiverHolder().getActualReceiver()) == null)) {
                    this.f31245b.mo8774a(receiverForHostVM, obj, obj2, obj3);
                }
                return C89391z.f203057a;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.assem.arch.viewModel.f$a$f */
        public static final class C12828f extends AbstractC89220m implements AbstractC89188r<A, B, C, D, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC22880h f31224a;

            /* renamed from: b */
            final /* synthetic */ AbstractC12818f f31225b;

            /* renamed from: c */
            final /* synthetic */ AssemViewModel f31226c;

            /* renamed from: d */
            final /* synthetic */ AbstractC89290k f31227d;

            /* renamed from: e */
            final /* synthetic */ AbstractC89290k f31228e;

            /* renamed from: f */
            final /* synthetic */ AbstractC89290k f31229f;

            /* renamed from: g */
            final /* synthetic */ AbstractC89290k f31230g;

            /* renamed from: h */
            final /* synthetic */ C12854k f31231h;

            /* renamed from: i */
            final /* synthetic */ AbstractC89172b f31232i;

            /* renamed from: j */
            final /* synthetic */ AbstractC89189s f31233j;

            static {
                Covode.recordClassIndex(14660);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12828f(AbstractC22880h hVar, AbstractC12818f fVar, AssemViewModel assemViewModel, AbstractC89290k kVar, AbstractC89290k kVar2, AbstractC89290k kVar3, AbstractC89290k kVar4, C12854k kVar5, AbstractC89172b bVar, AbstractC89189s sVar) {
                super(4);
                this.f31224a = hVar;
                this.f31225b = fVar;
                this.f31226c = assemViewModel;
                this.f31227d = kVar;
                this.f31228e = kVar2;
                this.f31229f = kVar3;
                this.f31230g = kVar4;
                this.f31231h = kVar5;
                this.f31232i = bVar;
                this.f31233j = sVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89188r
            /* renamed from: a */
            public final /* synthetic */ C89391z mo8774a(final Object obj, final Object obj2, final Object obj3, final Object obj4) {
                final AbstractC22876d actualReceiver = this.f31224a.getActualReceiver();
                if (actualReceiver != null) {
                    C12690t.m22849a(actualReceiver, new AbstractC89171a<C89391z>() {
                        /* class com.bytedance.assem.arch.viewModel.AbstractC12818f.C12819a.C12828f.C128291 */

                        static {
                            Covode.recordClassIndex(14661);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* bridge */ /* synthetic */ C89391z invoke() {
                            this.f31233j.invoke(actualReceiver, obj, obj2, obj3, obj4);
                            return C89391z.f203057a;
                        }
                    });
                }
                return C89391z.f203057a;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.assem.arch.viewModel.f$a$j */
        public static final class C12833j extends AbstractC89220m implements AbstractC89188r<A, B, C, D, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC12818f f31246a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89189s f31247b;

            static {
                Covode.recordClassIndex(14665);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12833j(AbstractC12818f fVar, AbstractC89189s sVar) {
                super(4);
                this.f31246a = fVar;
                this.f31247b = sVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89188r
            /* renamed from: a */
            public final /* synthetic */ C89391z mo8774a(Object obj, Object obj2, Object obj3, Object obj4) {
                AbstractC22876d receiverForHostVM = this.f31246a.getReceiverForHostVM();
                if (receiverForHostVM == null) {
                    receiverForHostVM = this.f31246a.getActualReceiverHolder().getActualReceiver();
                }
                if (receiverForHostVM != null) {
                    this.f31247b.invoke(receiverForHostVM, obj, obj2, obj3, obj4);
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: a */
        public static <RECEIVER extends AbstractC22876d, S extends AbstractC12853j> void m23060a(AbstractC12818f<RECEIVER> fVar, AssemViewModel<S> assemViewModel, C12854k<S> kVar, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super RECEIVER, ? super S, C89391z> mVar) {
            C89219l.m154719c(assemViewModel, "");
            C89219l.m154719c(kVar, "");
            C89219l.m154719c(mVar, "");
            if (assemViewModel.f31149c) {
                assemViewModel.mo20671d().mo20681a(fVar.getActualLifecycleOwnerHolder().getActualLifecycleOwner(), C12856l.m23101a(fVar, kVar, assemViewModel.f31149c, assemViewModel.bR_()), bVar, new C12837m(fVar.getActualReceiverHolder(), fVar, assemViewModel, kVar, bVar, mVar));
            } else if (!fVar.getHasSubscribedForReused()) {
                AbstractC12840g<S> d = assemViewModel.mo20671d();
                AbstractC1204m hostLifecycleOwner = fVar.getHostLifecycleOwner();
                if (hostLifecycleOwner == null) {
                    hostLifecycleOwner = fVar.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
                }
                C12854k<S> a = C12856l.m23101a(fVar, kVar, false, assemViewModel.bR_());
                m23058a(fVar);
                d.mo20681a(hostLifecycleOwner, a, bVar, new C12839n(fVar, mVar));
            }
        }

        /* renamed from: b */
        public static /* synthetic */ void m23070b(AbstractC12818f fVar, AssemViewModel assemViewModel, AbstractC89290k kVar, C12854k kVar2, AbstractC89183m mVar, int i) {
            C12854k kVar3 = kVar2;
            if ((i & 2) != 0) {
                AbstractC89127f a = assemViewModel.aP_().mo20678a();
                C89219l.m154719c(a, "");
                kVar3 = new C12854k();
                kVar3.f31283e = a;
                kVar3.f31285g = true;
            }
            fVar.mo20515b(assemViewModel, kVar, kVar3, null, mVar);
        }

        /* renamed from: b */
        public static <RECEIVER extends AbstractC22876d, S extends AbstractC12853j, A> void m23069b(AbstractC12818f<RECEIVER> fVar, AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super RECEIVER, ? super A, C89391z> mVar) {
            C89219l.m154719c(assemViewModel, "");
            C89219l.m154719c(kVar, "");
            C89219l.m154719c(kVar2, "");
            C89219l.m154719c(mVar, "");
            if (assemViewModel.f31149c) {
                AbstractC22880h<RECEIVER> actualReceiverHolder = fVar.getActualReceiverHolder();
                AbstractC12840g<S> d = assemViewModel.mo20671d();
                AbstractC1204m actualLifecycleOwner = fVar.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
                kVar2.f31285g = true;
                d.mo20682a(actualLifecycleOwner, kVar, C12856l.m23101a(fVar, kVar2, assemViewModel.f31149c, assemViewModel.bR_()), AbstractC12840g.C12841a.C12842a.f31271a, new C12834k(actualReceiverHolder, fVar, assemViewModel, kVar, kVar2, bVar, mVar));
                return;
            }
            AbstractC12840g<S> d2 = assemViewModel.mo20671d();
            AbstractC1204m hostLifecycleOwner = fVar.getHostLifecycleOwner();
            if (hostLifecycleOwner == null) {
                hostLifecycleOwner = fVar.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            }
            kVar2.f31285g = true;
            d2.mo20682a(hostLifecycleOwner, kVar, C12856l.m23101a(fVar, kVar2, false, assemViewModel.bR_()), m23058a(fVar), new C12836l(fVar, mVar));
        }

        /* renamed from: a */
        public static <RECEIVER extends AbstractC22876d, S extends AbstractC12853j, A> void m23062a(AbstractC12818f<RECEIVER> fVar, AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super RECEIVER, ? super A, C89391z> mVar) {
            C89219l.m154719c(assemViewModel, "");
            C89219l.m154719c(kVar, "");
            C89219l.m154719c(kVar2, "");
            C89219l.m154719c(mVar, "");
            if (assemViewModel.f31149c) {
                assemViewModel.mo20671d().mo20682a(fVar.getActualLifecycleOwnerHolder().getActualLifecycleOwner(), kVar, C12856l.m23101a(fVar, kVar2, assemViewModel.f31149c, assemViewModel.bR_()), AbstractC12840g.C12841a.C12842a.f31271a, new C12822c(fVar.getActualReceiverHolder(), fVar, assemViewModel, kVar, kVar2, bVar, mVar));
                return;
            }
            AbstractC12840g<S> d = assemViewModel.mo20671d();
            AbstractC1204m hostLifecycleOwner = fVar.getHostLifecycleOwner();
            if (hostLifecycleOwner == null) {
                hostLifecycleOwner = fVar.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            }
            d.mo20682a(hostLifecycleOwner, kVar, C12856l.m23101a(fVar, kVar2, false, assemViewModel.bR_()), m23058a(fVar), new C12830g(fVar, mVar));
        }

        /* renamed from: a */
        public static /* synthetic */ void m23063a(AbstractC12818f fVar, AssemViewModel assemViewModel, AbstractC89290k kVar, C12854k kVar2, AbstractC89183m mVar, int i) {
            C12854k kVar3 = kVar2;
            if ((i & 2) != 0) {
                kVar3 = C12856l.m23102a(assemViewModel.f31149c);
            }
            fVar.mo20509a(assemViewModel, kVar, kVar3, null, mVar);
        }

        /* renamed from: a */
        public static <RECEIVER extends AbstractC22876d, S extends AbstractC12853j, A, B> void m23064a(AbstractC12818f<RECEIVER> fVar, AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C12854k<C12794p<A, B>> kVar3, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89187q<? super RECEIVER, ? super A, ? super B, C89391z> qVar) {
            C89219l.m154719c(assemViewModel, "");
            C89219l.m154719c(kVar, "");
            C89219l.m154719c(kVar2, "");
            C89219l.m154719c(kVar3, "");
            C89219l.m154719c(qVar, "");
            if (assemViewModel.f31149c) {
                assemViewModel.mo20671d().mo20683a((AbstractC12840g) fVar.getActualLifecycleOwnerHolder().getActualLifecycleOwner(), (AbstractC1204m) kVar, (AbstractC89290k) kVar2, (AbstractC89290k) C12856l.m23101a(fVar, kVar3, assemViewModel.f31149c, assemViewModel.bR_()), (C12854k) AbstractC12840g.C12841a.C12843b.f31272a, (AbstractC89183m) new C12824d(fVar.getActualReceiverHolder(), fVar, assemViewModel, kVar, kVar2, kVar3, bVar, qVar));
            } else if (!fVar.getHasSubscribedForReused()) {
                AbstractC12840g<S> d = assemViewModel.mo20671d();
                AbstractC1204m hostLifecycleOwner = fVar.getHostLifecycleOwner();
                if (hostLifecycleOwner == null) {
                    hostLifecycleOwner = fVar.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
                }
                d.mo20683a(hostLifecycleOwner, kVar, kVar2, C12856l.m23101a(fVar, kVar3, false, assemViewModel.bR_()), m23058a(fVar), new C12831h(fVar, qVar));
            }
        }

        /* renamed from: a */
        public static <RECEIVER extends AbstractC22876d, S extends AbstractC12853j, A, B, C> void m23066a(AbstractC12818f<RECEIVER> fVar, AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C12854k<C12795q<A, B, C>> kVar4, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89188r<? super RECEIVER, ? super A, ? super B, ? super C, C89391z> rVar) {
            C89219l.m154719c(assemViewModel, "");
            C89219l.m154719c(kVar, "");
            C89219l.m154719c(kVar2, "");
            C89219l.m154719c(kVar3, "");
            C89219l.m154719c(kVar4, "");
            C89219l.m154719c(rVar, "");
            if (assemViewModel.f31149c) {
                assemViewModel.mo20671d().mo20684a(fVar.getActualLifecycleOwnerHolder().getActualLifecycleOwner(), kVar, kVar2, kVar3, C12856l.m23101a(fVar, kVar4, assemViewModel.f31149c, assemViewModel.bR_()), AbstractC12840g.C12841a.C12844c.f31273a, new C12826e(fVar.getActualReceiverHolder(), fVar, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar));
            } else if (!fVar.getHasSubscribedForReused()) {
                AbstractC12840g<S> d = assemViewModel.mo20671d();
                AbstractC1204m hostLifecycleOwner = fVar.getHostLifecycleOwner();
                if (hostLifecycleOwner == null) {
                    hostLifecycleOwner = fVar.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
                }
                d.mo20684a(hostLifecycleOwner, kVar, kVar2, kVar3, C12856l.m23101a(fVar, kVar4, false, assemViewModel.bR_()), m23058a(fVar), new C12832i(fVar, rVar));
            }
        }
    }
}
