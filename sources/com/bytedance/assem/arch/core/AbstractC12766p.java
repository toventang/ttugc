package com.bytedance.assem.arch.core;

import android.view.View;
import androidx.lifecycle.AbstractC1204m;
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
import kotlinx.p4634a.p4635a.AbstractC89449a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.bytedance.assem.arch.core.p */
public abstract class AbstractC12766p extends AbstractC12748a implements AbstractC12818f<AbstractC12766p>, AbstractC22876d, AbstractC22878f, AbstractC22880h<AbstractC12766p>, AbstractC89449a {

    /* renamed from: g */
    public View f31047g;

    /* renamed from: h */
    public boolean f31048h;

    static {
        Covode.recordClassIndex(14590);
    }

    /* renamed from: b */
    public abstract void mo20630b(View view);

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public AbstractC1204m getHostLifecycleOwner() {
        return null;
    }

    /* Return type fixed from 'com.bytedance.tiktok.proxy.d' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public /* bridge */ /* synthetic */ AbstractC12766p getReceiverForHostVM() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    /* renamed from: u */
    public abstract void mo20631u();

    @Override // com.bytedance.tiktok.proxy.AbstractC22878f
    public AbstractC1204m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public AbstractC22878f getActualLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.tiktok.proxy.d' to match base method */
    @Override // com.bytedance.tiktok.proxy.AbstractC22880h
    public /* bridge */ /* synthetic */ AbstractC12766p getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public AbstractC22880h<AbstractC12766p> getActualReceiverHolder() {
        return this;
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: p */
    public void mo20527p() {
        super.mo20527p();
        this.f31048h = false;
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public void mo20518f() {
        super.mo20518f();
        mo20631u();
        this.f31048h = true;
    }

    @Override // kotlinx.p4634a.p4635a.AbstractC89449a
    /* renamed from: t */
    public final View mo20528t() {
        View view = this.f31047g;
        if (view == null) {
            C89219l.m154710a("containerView");
        }
        return view;
    }

    /* renamed from: a */
    public final void mo20629a(View view) {
        C89219l.m154719c(view, "");
        this.f31047g = view;
    }

    /* renamed from: a */
    public static <VM1 extends AssemViewModel<S1>, S1 extends AbstractC12853j, R> R m22977a(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154719c(vm1, "");
        C89219l.m154719c(bVar, "");
        return (R) AbstractC12818f.C12819a.m23059a(vm1, bVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j> void mo20508a(AssemViewModel<S> assemViewModel, C12854k<S> kVar, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC12766p, ? super S, C89391z> mVar) {
        C89219l.m154719c(assemViewModel, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(mVar, "");
        AbstractC12818f.C12819a.m23060a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: b */
    public final <S extends AbstractC12853j, A> void mo20515b(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC12766p, ? super A, C89391z> mVar) {
        C89219l.m154719c(assemViewModel, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(kVar2, "");
        C89219l.m154719c(mVar, "");
        AbstractC12818f.C12819a.m23069b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A> void mo20509a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC12766p, ? super A, C89391z> mVar) {
        C89219l.m154719c(assemViewModel, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(kVar2, "");
        C89219l.m154719c(mVar, "");
        AbstractC12818f.C12819a.m23062a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B> void mo20510a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C12854k<C12794p<A, B>> kVar3, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89187q<? super AbstractC12766p, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154719c(assemViewModel, "");
        C89219l.m154719c(kVar, "");
        C89219l.m154719c(kVar2, "");
        C89219l.m154719c(kVar3, "");
        C89219l.m154719c(qVar, "");
        AbstractC12818f.C12819a.m23064a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C> void mo20511a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C12854k<C12795q<A, B, C>> kVar4, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89188r<? super AbstractC12766p, ? super A, ? super B, ? super C, C89391z> rVar) {
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
    public final <S extends AbstractC12853j, A, B, C, D> void mo20512a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C12854k<C12796r<A, B, C, D>> kVar5, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89189s<? super AbstractC12766p, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
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
