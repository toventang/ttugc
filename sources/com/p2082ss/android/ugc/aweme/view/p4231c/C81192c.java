package com.p2082ss.android.ugc.aweme.view.p4231c;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.google.android.material.bottomsheet.C26614b;
import com.google.android.material.bottomsheet.DialogC26609a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39082ag;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.model.C60157q;
import com.p2082ss.android.ugc.aweme.model.C60159r;
import com.p2082ss.android.ugc.aweme.model.api.p3459a.C60107b;
import com.p2082ss.android.ugc.aweme.p2398bn.C34891a;
import com.p2082ss.android.ugc.aweme.view.p4229a.C81140h;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherState;
import com.p2082ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherViewModel;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.view.c.c */
public final class C81192c extends C26614b implements AbstractC20527q, C81140h.AbstractC81142b {

    /* renamed from: a */
    private final AbstractC89244h f181400a = C89250i.m154773a((AbstractC89171a) new C81194b(this));

    /* renamed from: b */
    private SparseArray f181401b;

    static {
        Covode.recordClassIndex(94520);
    }

    /* renamed from: d */
    private View m140946d() {
        if (this.f181401b == null) {
            this.f181401b = new SparseArray();
        }
        View view = (View) this.f181401b.get(R.id.d97);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(R.id.d97);
        this.f181401b.put(R.id.d97, findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public final ProfileNaviSwitcherViewModel mo124653b() {
        return (ProfileNaviSwitcherViewModel) this.f181400a.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        mo124653b().mo124924a();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f181401b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.c.c$b */
    static final class C81194b extends AbstractC89220m implements AbstractC89171a<ProfileNaviSwitcherViewModel> {

        /* renamed from: a */
        final /* synthetic */ C81192c f181403a;

        static {
            Covode.recordClassIndex(94522);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81194b(C81192c cVar) {
            super(0);
            this.f181403a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ProfileNaviSwitcherViewModel invoke() {
            JediViewModel a = C20531t.m38716a(this.f181403a.requireActivity()).mo33800a(ProfileNaviSwitcherViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.view.p4229a.C81140h.AbstractC81142b
    /* renamed from: a */
    public final void mo124598a() {
        C34891a.m71268a(C34891a.f82340a);
        dismiss();
        ProfileNaviSwitcherViewModel b = mo124653b();
        b.mo33690d(ProfileNaviSwitcherViewModel.C81383a.f181768a);
        b.mo33690d(ProfileNaviSwitcherViewModel.C81384b.f181769a);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (getDialog() != null) {
            View findViewById = getDialog().findViewById(R.id.ajx);
            C89219l.m154716b(findViewById, "");
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            Context context = getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            layoutParams.height = (int) C39082ag.C39083a.m79347a(context, 360.0f);
        }
    }

    /* renamed from: c */
    public final void mo124654c() {
        RecyclerView recyclerView = (RecyclerView) m140946d();
        C89219l.m154716b(recyclerView, "");
        if (recyclerView.getAdapter() == null) {
            RecyclerView recyclerView2 = (RecyclerView) m140946d();
            C89219l.m154716b(recyclerView2, "");
            if (getContext() == null) {
                C89219l.m154715b();
            }
            recyclerView2.setLayoutManager(new GridLayoutManager(2));
            RecyclerView recyclerView3 = (RecyclerView) m140946d();
            C89219l.m154716b(recyclerView3, "");
            recyclerView3.setAdapter(new C81140h(((ProfileNaviSwitcherState) mo124653b().mo33676a(this)).getNaviList(), this));
            ((RecyclerView) m140946d()).mo4405a(new C81195c(this));
            return;
        }
        RecyclerView recyclerView4 = (RecyclerView) m140946d();
        C89219l.m154716b(recyclerView4, "");
        RecyclerView.AbstractC1350a adapter = recyclerView4.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.view.c.c$c */
    public static final class C81195c extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C81192c f181404a;

        static {
            Covode.recordClassIndex(94523);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C81195c(C81192c cVar) {
            this.f181404a = cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            if (!recyclerView.canScrollVertically(1)) {
                this.f181404a.mo124653b().mo124925a(0);
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.appcompat.app.C0242i, com.google.android.material.bottomsheet.C26614b
    public final Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        return new DialogC26609a(context, R.style.a09);
    }

    @Override // com.p2082ss.android.ugc.aweme.view.p4229a.C81140h.AbstractC81142b
    /* renamed from: a */
    public final void mo124599a(C60107b bVar) {
        C89219l.m154721d(bVar, "");
        C39162r.m79460a("choose_avatar", new C33744d().mo59983a("enter_from", "avatar_switcher_page").mo59983a("avatar_id", bVar.getNavi_id()).f79943a);
        dismiss();
        mo124653b();
        if (C60159r.f137138a != null) {
            mo124653b();
            C60157q qVar = C60159r.f137138a;
            if (qVar == null) {
                C89219l.m154715b();
            }
            if (!(!C89219l.m154714a((Object) qVar.f137132a, (Object) bVar.getNavi_id()))) {
                return;
            }
        }
        ProfileNaviSwitcherViewModel b = mo124653b();
        C89219l.m154721d(bVar, "");
        C60159r.m109649a(bVar);
        b.mo33690d(ProfileNaviSwitcherViewModel.C81387e.f181774a);
        b.mo33690d(ProfileNaviSwitcherViewModel.C81388f.f181775a);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.view.c.c$a */
    static final class C81193a extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C81192c f181402a;

        static {
            Covode.recordClassIndex(94521);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C81193a(C81192c cVar) {
            super(2);
            this.f181402a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f181402a.mo124654c();
            }
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        AbstractC88412b unused = selectSubscribe(mo124653b(), C81196d.f181405a, new C20370ah(), new C81193a(this));
        mo124654c();
        mo124653b().mo124925a(0);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        C39162r.m79460a("enter_avatar_switch", new C33744d().mo59983a("enter_from", "avatar_hub").f79943a);
        return C1764a.m5927a(layoutInflater, R.layout.ap4, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20527q.C20528a.m38711a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20527q.C20528a.m38710a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20527q.C20528a.m38712a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
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
        return AbstractC20527q.C20528a.m38713a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
