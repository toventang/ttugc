package com.bytedance.assem.arch.p795b;

import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.extensions.AbstractC12789k;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12787j;
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.extensions.C12794p;
import com.bytedance.assem.arch.extensions.C12795q;
import com.bytedance.assem.arch.extensions.C12796r;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.p4634a.p4635a.AbstractC89449a;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.bytedance.assem.arch.b.u */
public abstract class AbstractC12693u<RECEIVER extends AbstractC22876d> extends AbstractC12748a implements AbstractC12818f<RECEIVER>, AbstractC22876d, AbstractC22878f, AbstractC22880h<RECEIVER>, AbstractC89449a {

    /* renamed from: g */
    public View f30894g;

    /* renamed from: h */
    public final CopyOnWriteArraySet<AbstractC12660k<?, ?>> f30895h = new CopyOnWriteArraySet<>();

    /* renamed from: i */
    public boolean f30896i;

    /* renamed from: j */
    public boolean f30897j;

    /* renamed from: k */
    public boolean f30898k = true;

    /* renamed from: l */
    public boolean f30899l = true;

    /* renamed from: m */
    public boolean f30900m;

    /* renamed from: n */
    public AbstractC12659j f30901n;

    /* renamed from: o */
    private final AbstractC89244h f30902o = C89250i.m154773a((AbstractC89171a) new C12694a(this));

    /* renamed from: p */
    private final CopyOnWriteArrayList<AbstractC89171a<C89391z>> f30903p = new CopyOnWriteArrayList<>();

    static {
        Covode.recordClassIndex(14513);
    }

    /* renamed from: A */
    public abstract void mo20506A();

    /* renamed from: c */
    public abstract void mo20517c(View view);

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public AbstractC1204m getHostLifecycleOwner() {
        return (AbstractC1204m) this.f30902o.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    /* renamed from: w */
    public abstract void mo20531w();

    /* renamed from: y */
    public void mo20533y() {
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22878f
    public AbstractC1204m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22880h
    public RECEIVER getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public boolean getHasSubscribedForReused() {
        return this.f30900m;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public RECEIVER getReceiverForHostVM() {
        return this;
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: p */
    public void mo20527p() {
        super.mo20527p();
        this.f30896i = false;
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    public final void bV_() {
        this.f31000d.mo4016a(AbstractC1196i.EnumC1198a.ON_RESUME);
        mo20525j();
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public void mo20518f() {
        super.mo20518f();
        mo20531w();
        this.f30896i = true;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public AbstractC22878f getActualLifecycleOwnerHolder() {
        AbstractC12659j jVar = this.f30901n;
        if (jVar != null) {
            return (AbstractC22878f) jVar;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public AbstractC22880h<RECEIVER> getActualReceiverHolder() {
        AbstractC12659j jVar = this.f30901n;
        if (jVar != null) {
            return (AbstractC22880h) jVar;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    @Override // kotlinx.p4634a.p4635a.AbstractC89449a
    /* renamed from: t */
    public final View mo20528t() {
        View view = this.f30894g;
        if (view == null) {
            C89219l.m154710a("containerView");
        }
        return view;
    }

    /* renamed from: u */
    public final List<AbstractC12748a> mo20529u() {
        AssemSupervisor a = C12777b.m23003a((AbstractC12748a) this);
        if (a != null) {
            return a.f30979a;
        }
        return null;
    }

    /* renamed from: x */
    public final boolean mo20532x() {
        if (this.f30894g != null) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.assem.arch.b.u$a */
    static final class C12694a extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f30904a;

        static {
            Covode.recordClassIndex(14514);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12694a(AbstractC12693u uVar) {
            super(0);
            this.f30904a = uVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC1204m invoke() {
            Object a = C12777b.m22999a((AbstractC1204m) this.f30904a);
            if (a == null && (a = C12777b.m23004b(this.f30904a)) == null) {
                C89219l.m154707a();
            }
            return a;
        }
    }

    /* renamed from: v */
    public final boolean mo20530v() {
        CopyOnWriteArrayList<AbstractC12748a> copyOnWriteArrayList;
        AssemSupervisor a = C12777b.m23003a((AbstractC12748a) this);
        if (a == null || (copyOnWriteArrayList = a.f30979a) == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public final void mo20534z() {
        CopyOnWriteArraySet<AbstractC12660k<?, ?>> copyOnWriteArraySet = this.f30895h;
        if (copyOnWriteArraySet != null) {
            Iterator<T> it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                it.next().mo20481a();
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: j */
    public void mo20525j() {
        AbstractC12789k kVar;
        C88958b<C12651b> b;
        super.mo20525j();
        AbstractC12659j jVar = this.f30901n;
        if (!(jVar == null || (b = jVar.mo20475b()) == null)) {
            b.onNext(new C12651b(EnumC12650a.HostResume, this));
        }
        if (C89219l.m154714a(C89204ab.m154669a(getClass()), C12787j.f31111e) && (kVar = C12787j.f31108b) != null) {
            kVar.mo20640a("AssemList", "onHostResume, proxy: " + this.f30901n);
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: n */
    public void mo20526n() {
        AbstractC12789k kVar;
        C88958b<C12651b> b;
        super.mo20526n();
        AbstractC12659j jVar = this.f30901n;
        if (!(jVar == null || (b = jVar.mo20475b()) == null)) {
            b.onNext(new C12651b(EnumC12650a.HostStop, this));
        }
        if (C89219l.m154714a(C89204ab.m154669a(getClass()), C12787j.f31111e) && (kVar = C12787j.f31108b) != null) {
            kVar.mo20640a("AssemList", "onHostStop, proxy: " + this.f30901n);
        }
    }

    /* renamed from: a */
    public final void mo20507a(View view) {
        C89219l.m154719c(view, "");
        this.f30894g = view;
    }

    /* renamed from: b */
    public final void mo20514b(View view) {
        C89219l.m154719c(view, "");
        mo20517c(view);
        this.f30897j = true;
        Iterator<T> it = this.f30903p.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
        this.f30903p.clear();
    }

    /* renamed from: a */
    public final void mo20513a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154719c(aVar, "");
        if (this.f30897j) {
            aVar.invoke();
        } else {
            this.f30903p.add(aVar);
        }
    }

    /* renamed from: a */
    public static <VM1 extends AssemViewModel<S1>, S1 extends AbstractC12853j, R> R m22850a(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154719c(vm1, "");
        C89219l.m154719c(bVar, "");
        return (R) AbstractC12818f.C12819a.m23059a(vm1, bVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j> void mo20508a(AssemViewModel<S> assemViewModel, C12854k<S> kVar, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super RECEIVER, ? super S, C89391z> mVar) {
        C89219l.m154719c(assemViewModel, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(mVar, "");
        AbstractC12818f.C12819a.m23060a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: b */
    public final <S extends AbstractC12853j, A> void mo20515b(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super RECEIVER, ? super A, C89391z> mVar) {
        C89219l.m154719c(assemViewModel, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(kVar2, "");
        C89219l.m154719c(mVar, "");
        AbstractC12818f.C12819a.m23069b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A> void mo20509a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super RECEIVER, ? super A, C89391z> mVar) {
        C89219l.m154719c(assemViewModel, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(kVar2, "");
        C89219l.m154719c(mVar, "");
        AbstractC12818f.C12819a.m23062a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B> void mo20510a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C12854k<C12794p<A, B>> kVar3, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89187q<? super RECEIVER, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154719c(assemViewModel, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(kVar2, "");
        C89219l.m154719c(kVar3, "");
        C89219l.m154719c(qVar, "");
        AbstractC12818f.C12819a.m23064a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C> void mo20511a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C12854k<C12795q<A, B, C>> kVar4, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89188r<? super RECEIVER, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154719c(assemViewModel, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(kVar2, "");
        C89219l.m154719c(kVar3, "");
        C89219l.m154719c(kVar4, "");
        C89219l.m154719c(rVar, "");
        AbstractC12818f.C12819a.m23066a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C, D> void mo20512a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C12854k<C12796r<A, B, C, D>> kVar5, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89189s<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154719c(assemViewModel, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(kVar2, "");
        C89219l.m154719c(kVar3, "");
        C89219l.m154719c(kVar4, "");
        C89219l.m154719c(kVar5, "");
        C89219l.m154719c(sVar, "");
        AbstractC12818f.C12819a.m23068a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
