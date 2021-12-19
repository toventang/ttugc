package com.p2082ss.android.ugc.aweme.favorites.p2928ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.core.app.C0576b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.core.C12759i;
import com.bytedance.assem.arch.core.C12767q;
import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.extensions.C12794p;
import com.bytedance.assem.arch.extensions.C12795q;
import com.bytedance.assem.arch.extensions.C12796r;
import com.bytedance.assem.arch.viewModel.AbstractC12846h;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.favorites.api.C47192d;
import com.p2082ss.android.ugc.aweme.favorites.api.C47196f;
import com.p2082ss.android.ugc.aweme.favorites.model.AbstractC47491k;
import com.p2082ss.android.ugc.aweme.favorites.model.C47481j;
import com.p2082ss.android.ugc.aweme.favorites.p2921c.C47235f;
import com.p2082ss.android.ugc.aweme.favorites.p2921c.C47275h;
import com.p2082ss.android.ugc.aweme.favorites.p2923e.AbstractC47421a;
import com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47658ag;
import com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47662ah;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47797a;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47802d;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47804f;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50529ae;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63853q;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment */
public final class VideoCollectionCollectionContentFragment extends AbstractC47421a implements AbstractC12846h, C47235f.AbstractC47264v, C47275h.AbstractC47306u {

    /* renamed from: e */
    public String f110380e;

    /* renamed from: f */
    public String f110381f;

    /* renamed from: g */
    public Long f110382g;

    /* renamed from: h */
    public Integer f110383h;

    /* renamed from: i */
    public int f110384i;

    /* renamed from: j */
    public Integer f110385j;

    /* renamed from: k */
    public C47192d f110386k;

    /* renamed from: l */
    private final C12814b f110387l;

    /* renamed from: m */
    private final AbstractC89244h f110388m;

    /* renamed from: n */
    private SparseArray f110389n;

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$f */
    public static final class C47557f extends AbstractC89220m implements AbstractC89172b<C47802d, C47802d> {
        public static final C47557f INSTANCE = new C47557f();

        static {
            Covode.recordClassIndex(56178);
        }

        public C47557f() {
            super(1);
        }

        public final C47802d invoke(C47802d dVar) {
            C89219l.m154719c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(56172);
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2923e.AbstractC47421a, com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f110389n == null) {
            this.f110389n = new SparseArray();
        }
        View view = (View) this.f110389n.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f110389n.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2923e.AbstractC47421a, com.bytedance.ies.foundation.fragment.C17372a
    public final void bx_() {
        SparseArray sparseArray = this.f110389n;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2923e.AbstractC47421a
    /* renamed from: e */
    public final int mo79700e() {
        return R.layout.zo;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC1204m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22876d getReceiverForHostVM() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    /* renamed from: i */
    public final VideoCollectionContentViewModel mo79770i() {
        return (VideoCollectionContentViewModel) this.f110387l.getValue();
    }

    /* renamed from: j */
    public final C88411a mo79771j() {
        return (C88411a) this.f110388m.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$b */
    public static final class C47553b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110391a;

        static {
            Covode.recordClassIndex(56174);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47553b(Fragment fragment) {
            super(0);
            this.f110391a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            return this.f110391a;
        }
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22878f
    public final AbstractC1204m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22878f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22880h
    public final AbstractC22876d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22880h<AbstractC22876d> getActualReceiverHolder() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C, D> void mo20512a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C12854k<C12796r<A, B, C, D>> kVar5, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89189s<? super AbstractC22876d, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(kVar5, "");
        C89219l.m154721d(sVar, "");
        AbstractC12846h.C12847a.m23096a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2921c.C47235f.AbstractC47264v
    /* renamed from: a */
    public final void mo79656a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            C89219l.m154716b(activity, "");
            C39162r.m79462a("remove_unavailable_from_collection", C89387v.m154943a("collection_video", "enter_from"));
            C23023b bVar = new C23023b(activity);
            bVar.mo37482a(false);
            bVar.mo37411b(activity.getResources().getString(R.string.btw));
            bVar.mo37483b(R.string.btu);
            C23028c.m43435a(bVar, new C47583t(this, activity, aweme));
            new C23013a(bVar).mo37396b().show();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$g */
    public static final class C47558g extends AbstractC89220m implements AbstractC89171a<C12874b<C47802d>> {
        public static final C47558g INSTANCE = new C47558g();

        static {
            Covode.recordClassIndex(56179);
        }

        public C47558g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47802d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$l */
    public static final class C47563l extends AbstractC89220m implements AbstractC89171a<C12874b<C47802d>> {
        public static final C47563l INSTANCE = new C47563l();

        static {
            Covode.recordClassIndex(56184);
        }

        public C47563l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47802d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$m */
    static final class C47564m extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C47564m f110399a = new C47564m();

        static {
            Covode.recordClassIndex(56185);
        }

        C47564m() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$c */
    public static final class C47554c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110392a;

        static {
            Covode.recordClassIndex(56175);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47554c(Fragment fragment) {
            super(0);
            this.f110392a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f110392a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$h */
    public static final class C47559h extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110395a;

        static {
            Covode.recordClassIndex(56180);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47559h(Fragment fragment) {
            super(0);
            this.f110395a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f110395a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return requireActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$n */
    static final class C47565n extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ VideoCollectionCollectionContentFragment f110400a;

        static {
            Covode.recordClassIndex(56186);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47565n(VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment) {
            super(0);
            this.f110400a = videoCollectionCollectionContentFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            String str = this.f110400a.f110380e;
            if (str == null) {
                str = "";
            }
            return VideoCollectionContentViewModel.C47759a.m90805a(str);
        }
    }

    /* renamed from: h */
    public final C47192d mo79769h() {
        C47192d dVar = this.f110386k;
        if (dVar == null) {
            C89219l.m154710a("initializeDetail");
        }
        return dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2923e.AbstractC47421a, com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        mo79771j().mo142944a();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$a */
    public static final class C47552a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f110390a;

        static {
            Covode.recordClassIndex(56173);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47552a(AbstractC89277c cVar) {
            super(0);
            this.f110390a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f110390a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$d */
    public static final class C47555d extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110393a;

        static {
            Covode.recordClassIndex(56176);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47555d(Fragment fragment) {
            super(0);
            this.f110393a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f110393a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f110393a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$e */
    public static final class C47556e extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110394a;

        static {
            Covode.recordClassIndex(56177);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47556e(Fragment fragment) {
            super(0);
            this.f110394a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f110394a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f110394a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$i */
    public static final class C47560i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110396a;

        static {
            Covode.recordClassIndex(56181);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47560i(Fragment fragment) {
            super(0);
            this.f110396a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f110396a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$j */
    public static final class C47561j extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110397a;

        static {
            Covode.recordClassIndex(56182);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47561j(Fragment fragment) {
            super(0);
            this.f110397a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f110397a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f110397a.getActivity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$k */
    public static final class C47562k extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110398a;

        static {
            Covode.recordClassIndex(56183);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47562k(Fragment fragment) {
            super(0);
            this.f110398a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f110398a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f110398a.getActivity());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2921c.C47275h.AbstractC47306u
    /* renamed from: a */
    public final void mo79678a() {
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            C89219l.m154716b(activity, "");
            m90588a(mo79770i(), new C47572q(this, activity));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.favorites.p2921c.C47275h.AbstractC47306u
    /* renamed from: c */
    public final void mo64296c() {
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            C89219l.m154716b(activity, "");
            m90588a(mo79770i(), new C47576r(this, activity));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2923e.AbstractC47421a
    /* renamed from: g */
    public final boolean mo79702g() {
        C89233z.C89234a aVar = new C89233z.C89234a();
        aVar.element = false;
        m90588a(mo79770i(), new C47588u(this, aVar));
        return aVar.element;
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$v */
    static final class RunnableC47589v implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f110435a;

        /* renamed from: b */
        final /* synthetic */ VideoCollectionCollectionContentFragment f110436b;

        static {
            Covode.recordClassIndex(56210);
        }

        RunnableC47589v(int i, VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment) {
            this.f110435a = i;
            this.f110436b = videoCollectionCollectionContentFragment;
        }

        public final void run() {
            ActivityC0945e requireActivity = this.f110436b.requireActivity();
            C89219l.m154716b(requireActivity, "");
            C23144b bVar = new C23144b(requireActivity);
            Resources resources = this.f110436b.getResources();
            int i = this.f110435a;
            bVar.mo37635a(resources.getQuantityString(R.plurals.cl, i, String.valueOf(i))).mo37636b(R.raw.icon_tick_fill_small).mo37639d(R.attr.aw).mo37637b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$p */
    public static final class C47571p implements C47658ag.AbstractC47659a {

        /* renamed from: a */
        final /* synthetic */ VideoCollectionCollectionContentFragment f110407a;

        static {
            Covode.recordClassIndex(56192);
        }

        @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47658ag.AbstractC47659a
        /* renamed from: a */
        public final void mo79773a() {
            C39162r.m79462a("change_collection_name_click", C89387v.m154943a("collection_video", "enter_from"), C89387v.m154943a(this.f110407a.f110380e, "collection_id"));
            VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment = this.f110407a;
            ActivityC0945e activity = videoCollectionCollectionContentFragment.getActivity();
            if (activity != null) {
                C89219l.m154716b(activity, "");
                AbstractC0952i supportFragmentManager = activity.getSupportFragmentManager();
                C89219l.m154716b(supportFragmentManager, "");
                String string = activity.getString(R.string.bsu);
                C89219l.m154716b(string, "");
                C47192d dVar = videoCollectionCollectionContentFragment.f110386k;
                if (dVar == null) {
                    C89219l.m154710a("initializeDetail");
                }
                String str = dVar.f109843b;
                String string2 = activity.getString(R.string.fdd);
                C89219l.m154716b(string2, "");
                C47662ah.C47663a.m90669a(supportFragmentManager, string, str, string2, new C47596x(videoCollectionCollectionContentFragment, activity));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47658ag.AbstractC47659a
        /* renamed from: b */
        public final void mo79774b() {
            C39162r.m79462a("delete_collection_click", C89387v.m154943a("collection_video", "enter_from"), C89387v.m154943a(this.f110407a.f110380e, "collection_id"));
            VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment = this.f110407a;
            ActivityC0945e activity = videoCollectionCollectionContentFragment.getActivity();
            if (activity != null) {
                C89219l.m154716b(activity, "");
                C23023b bVar = new C23023b(activity);
                bVar.mo37482a(false);
                String string = activity.getString(R.string.bt5);
                C89219l.m154716b(string, "");
                Object[] objArr = new Object[1];
                C47192d dVar = videoCollectionCollectionContentFragment.f110386k;
                if (dVar == null) {
                    C89219l.m154710a("initializeDetail");
                }
                objArr[0] = dVar.f109843b;
                String a = C1764a.m5928a(string, Arrays.copyOf(objArr, 1));
                C89219l.m154716b(a, "");
                bVar.mo37411b(a);
                bVar.mo37483b(R.string.bth);
                C23028c.m43435a(bVar, new C47566o(videoCollectionCollectionContentFragment, activity));
                new C23013a(bVar).mo37396b().show();
            }
        }

        C47571p(VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment) {
            this.f110407a = videoCollectionCollectionContentFragment;
        }
    }

    public VideoCollectionCollectionContentFragment() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        C47565n nVar = new C47565n(this);
        AbstractC89277c a = C89204ab.m154669a(VideoCollectionContentViewModel.class);
        C47552a aVar = new C47552a(a);
        C47557f fVar = C47557f.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C47558g.INSTANCE, new C47559h(this), new C47560i(this), nVar, fVar, new C47561j(this), new C47562k(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C47563l.INSTANCE, new C47553b(this), new C47554c(this), nVar, fVar, new C47555d(this), new C47556e(this));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.f110387l = bVar;
        this.f110388m = C89250i.m154773a((AbstractC89171a) C47564m.f110399a);
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2921c.C47275h.AbstractC47306u
    /* renamed from: d */
    public final void mo79680d() {
        C39162r.m79462a("collection_setting_click", C89387v.m154943a("collection_video", "enter_from"), C89387v.m154943a(this.f110380e, "collection_id"));
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            C89219l.m154716b(activity, "");
            C47658ag agVar = new C47658ag();
            C47571p pVar = new C47571p(this);
            C89219l.m154721d(pVar, "");
            agVar.f110519a = pVar;
            new C23226a.C23227a().mo37812a(1).mo37817a(agVar).f55057a.show(activity.getSupportFragmentManager(), "VideoCollectionOperation");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int i;
        long j;
        Long l;
        super.onResume();
        C47196f a = C47804f.m90816a("COLLECTION_CONTENT");
        if (a != null) {
            if (a.f109854a == 10) {
                List<String> list = a.f109859f;
                if (list != null) {
                    i = list.size();
                } else {
                    i = 0;
                }
                C47192d dVar = this.f110386k;
                if (dVar == null) {
                    C89219l.m154710a("initializeDetail");
                }
                C47192d.C47193a aVar = dVar.f109846e;
                if (aVar == null || (l = aVar.f109847a) == null) {
                    j = 0;
                } else {
                    j = l.longValue();
                }
                C47192d dVar2 = this.f110386k;
                if (dVar2 == null) {
                    C89219l.m154710a("initializeDetail");
                }
                C47192d.C47193a aVar2 = dVar2.f109846e;
                if (aVar2 != null) {
                    aVar2.f109847a = Long.valueOf(j + ((long) i));
                }
                ActivityC0945e requireActivity = requireActivity();
                C89219l.m154716b(requireActivity, "");
                new C23144b(requireActivity).mo37635a(getResources().getQuantityString(R.plurals.cl, i, String.valueOf(i))).mo37636b(R.raw.icon_tick_fill_small).mo37639d(R.attr.aw).mo37637b();
            }
            mo79770i().mo79856d(true);
            C47804f.m90817a("COLLECTION_LIST", new C47196f(3, null, null, null, null, null, null, null, 254));
        }
        Integer num = this.f110385j;
        if (num != null) {
            int intValue = num.intValue();
            View view = getView();
            if (view != null) {
                view.postDelayed(new RunnableC47589v(intValue, this), 500);
            }
            this.f110385j = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$r */
    static final class C47576r extends AbstractC89220m implements AbstractC89172b<C47802d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCollectionCollectionContentFragment f110416a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f110417b;

        static {
            Covode.recordClassIndex(56197);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47576r(VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment, ActivityC0945e eVar) {
            super(1);
            this.f110416a = videoCollectionCollectionContentFragment;
            this.f110417b = eVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$r$a */
        static final class C47577a extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C47576r f110418a;

            /* renamed from: b */
            final /* synthetic */ List f110419b;

            static {
                Covode.recordClassIndex(56198);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C47577a(C47576r rVar, List list) {
                super(1);
                this.f110418a = rVar;
                this.f110419b = list;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C23025b bVar) {
                C23025b bVar2 = bVar;
                C89219l.m154721d(bVar2, "");
                bVar2.mo37416a(R.string.f_7, new AbstractC89172b<C23024a, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoCollectionCollectionContentFragment.C47576r.C47577a.C475781 */

                    /* renamed from: a */
                    final /* synthetic */ C47577a f110420a;

                    static {
                        Covode.recordClassIndex(56199);
                    }

                    {
                        this.f110420a = r1;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C23024a aVar) {
                        C23024a aVar2 = aVar;
                        C89219l.m154721d(aVar2, "");
                        String str = this.f110420a.f110418a.f110416a.f110380e;
                        List<C47797a> list = this.f110420a.f110419b;
                        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                        for (C47797a aVar3 : list) {
                            arrayList.add(aVar3.f110745a.getAid());
                        }
                        final C47196f fVar = new C47196f(11, str, null, null, null, null, arrayList, null, 188);
                        AbstractC88412b a = new C47481j().f110302b.mo79755a(fVar).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new AbstractC88433f(this) {
                            /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoCollectionCollectionContentFragment.C47576r.C47577a.C475781.C475791 */

                            /* renamed from: a */
                            final /* synthetic */ C475781 f110421a;

                            static {
                                Covode.recordClassIndex(56200);
                            }

                            {
                                this.f110421a = r1;
                            }

                            @Override // p4560f.p4561a.p4567d.AbstractC88433f
                            public final /* synthetic */ void accept(Object obj) {
                                long j;
                                Long l;
                                C39162r.m79462a("collection_move_videos", C89387v.m154943a("collection_video", "enter_from"), C89387v.m154943a(this.f110421a.f110420a.f110418a.f110416a.f110380e, "from"), C89387v.m154943a("", "to"));
                                C47804f.m90817a("COLLECTION_LIST", fVar);
                                C47192d.C47193a aVar = this.f110421a.f110420a.f110418a.f110416a.mo79769h().f109846e;
                                if (aVar == null || (l = aVar.f109847a) == null) {
                                    j = 0;
                                } else {
                                    j = l.longValue();
                                }
                                C47192d.C47193a aVar2 = this.f110421a.f110420a.f110418a.f110416a.mo79769h().f109846e;
                                if (aVar2 != null) {
                                    aVar2.f109847a = Long.valueOf(j - ((long) this.f110421a.f110420a.f110419b.size()));
                                }
                                this.f110421a.f110420a.f110418a.f110416a.mo79770i().mo79856d(true);
                                new C23144b(this.f110421a.f110420a.f110418a.f110417b).mo37635a(this.f110421a.f110420a.f110418a.f110416a.getResources().getQuantityString(R.plurals.cq, this.f110421a.f110420a.f110419b.size(), Integer.valueOf(this.f110421a.f110420a.f110419b.size()))).mo37637b();
                            }
                        }, new AbstractC88433f(this) {
                            /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoCollectionCollectionContentFragment.C47576r.C47577a.C475781.C475802 */

                            /* renamed from: a */
                            final /* synthetic */ C475781 f110423a;

                            static {
                                Covode.recordClassIndex(56201);
                            }

                            {
                                this.f110423a = r1;
                            }

                            @Override // p4560f.p4561a.p4567d.AbstractC88433f
                            public final /* synthetic */ void accept(Object obj) {
                                new C23144b(this.f110423a.f110420a.f110418a.f110417b).mo37640e(R.string.bof).mo37637b();
                            }
                        });
                        C89219l.m154716b(a, "");
                        C88934a.m154195a(a, this.f110420a.f110418a.f110416a.mo79771j());
                        aVar2.mo37414a().dismiss();
                        return C89391z.f203057a;
                    }
                });
                bVar2.mo37418b(R.string.a8y, new AbstractC89172b<C23024a, C89391z>() {
                    /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoCollectionCollectionContentFragment.C47576r.C47577a.C475812 */

                    static {
                        Covode.recordClassIndex(56202);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C23024a aVar) {
                        C23024a aVar2 = aVar;
                        C89219l.m154721d(aVar2, "");
                        aVar2.mo37414a().dismiss();
                        return C89391z.f203057a;
                    }
                });
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
            if (r6 == null) goto L_0x0036;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47802d r11) {
            /*
            // Method dump skipped, instructions count: 137
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoCollectionCollectionContentFragment.C47576r.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$x */
    public static final class C47596x implements C47662ah.AbstractC47664b {

        /* renamed from: a */
        final /* synthetic */ VideoCollectionCollectionContentFragment f110444a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f110445b;

        static {
            Covode.recordClassIndex(56217);
        }

        /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$x$b */
        static final class C47598b<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C47596x f110449a;

            static {
                Covode.recordClassIndex(56219);
            }

            C47598b(C47596x xVar) {
                this.f110449a = xVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                new C23144b(this.f110449a.f110445b).mo37640e(R.string.bof).mo37637b();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$x$a */
        static final class C47597a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C47596x f110446a;

            /* renamed from: b */
            final /* synthetic */ String f110447b;

            /* renamed from: c */
            final /* synthetic */ C47196f f110448c;

            static {
                Covode.recordClassIndex(56218);
            }

            C47597a(C47596x xVar, String str, C47196f fVar) {
                this.f110446a = xVar;
                this.f110447b = str;
                this.f110448c = fVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                TextView textView;
                RecyclerView recyclerView;
                RecyclerView.AbstractC1350a adapter;
                this.f110446a.f110444a.mo79769h().f109843b = this.f110447b;
                C47804f.m90817a("COLLECTION_LIST", this.f110448c);
                new C23144b(this.f110446a.f110445b).mo37640e(R.string.bsv).mo37637b();
                View view = this.f110446a.f110444a.getView();
                if (!(view == null || (recyclerView = (RecyclerView) view.findViewById(R.id.a7o)) == null || (adapter = recyclerView.getAdapter()) == null)) {
                    adapter.notifyItemChanged(0);
                }
                View view2 = this.f110446a.f110444a.getView();
                if (view2 != null && (textView = (TextView) view2.findViewById(R.id.cpj)) != null) {
                    textView.setText(this.f110447b);
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47662ah.AbstractC47664b
        /* renamed from: a */
        public final void mo79777a(String str) {
            C89219l.m154721d(str, "");
            if (this.f110444a.f110380e != null) {
                C39162r.m79462a("change_collection_name_save", C89387v.m154943a("collection_video", "enter_from"), C89387v.m154943a(this.f110444a.f110380e, "collection_id"));
                C47196f fVar = new C47196f(3, this.f110444a.f110380e, str, null, null, null, null, null, 248);
                AbstractC88412b a = new C47481j().f110302b.mo79755a(fVar).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C47597a(this, str, fVar), new C47598b(this));
                C89219l.m154716b(a, "");
                C88934a.m154195a(a, this.f110444a.mo79771j());
            }
        }

        C47596x(VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment, ActivityC0945e eVar) {
            this.f110444a = videoCollectionCollectionContentFragment;
            this.f110445b = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$o */
    static final class C47566o extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCollectionCollectionContentFragment f110401a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f110402b;

        static {
            Covode.recordClassIndex(56187);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47566o(VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment, ActivityC0945e eVar) {
            super(1);
            this.f110401a = videoCollectionCollectionContentFragment;
            this.f110402b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37420c(R.string.b4w, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoCollectionCollectionContentFragment.C47566o.C475671 */

                /* renamed from: a */
                final /* synthetic */ C47566o f110403a;

                static {
                    Covode.recordClassIndex(56188);
                }

                {
                    this.f110403a = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C23024a aVar2 = aVar;
                    C89219l.m154721d(aVar2, "");
                    C39162r.m79462a("delete_collection_confirm", C89387v.m154943a("collection_video", "enter_from"), C89387v.m154943a(this.f110403a.f110401a.f110380e, "collection_id"));
                    final C47196f fVar = new C47196f(2, this.f110403a.f110401a.f110380e, null, null, null, null, null, null, 252);
                    AbstractC88412b a = new C47481j().f110302b.mo79755a(fVar).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new AbstractC88433f(this) {
                        /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoCollectionCollectionContentFragment.C47566o.C475671.C475681 */

                        /* renamed from: a */
                        final /* synthetic */ C475671 f110404a;

                        static {
                            Covode.recordClassIndex(56189);
                        }

                        {
                            this.f110404a = r1;
                        }

                        @Override // p4560f.p4561a.p4567d.AbstractC88433f
                        public final /* synthetic */ void accept(Object obj) {
                            C47804f.m90817a("COLLECTION_LIST", fVar);
                            this.f110404a.f110403a.f110401a.mo79701f();
                        }
                    }, new AbstractC88433f(this) {
                        /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoCollectionCollectionContentFragment.C47566o.C475671.C475692 */

                        /* renamed from: a */
                        final /* synthetic */ C475671 f110406a;

                        static {
                            Covode.recordClassIndex(56190);
                        }

                        {
                            this.f110406a = r1;
                        }

                        @Override // p4560f.p4561a.p4567d.AbstractC88433f
                        public final /* synthetic */ void accept(Object obj) {
                            new C23144b(this.f110406a.f110403a.f110402b).mo37640e(R.string.bof).mo37637b();
                        }
                    });
                    C89219l.m154716b(a, "");
                    C88934a.m154195a(a, this.f110403a.f110401a.mo79771j());
                    aVar2.mo37414a().dismiss();
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.a8y, new AbstractC89172b<C23024a, C89391z>() {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoCollectionCollectionContentFragment.C47566o.C475702 */

                static {
                    Covode.recordClassIndex(56191);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C23024a aVar2 = aVar;
                    C89219l.m154721d(aVar2, "");
                    aVar2.mo37414a().dismiss();
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$t */
    static final class C47583t extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCollectionCollectionContentFragment f110427a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f110428b;

        /* renamed from: c */
        final /* synthetic */ Aweme f110429c;

        static {
            Covode.recordClassIndex(56204);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47583t(VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment, ActivityC0945e eVar, Aweme aweme) {
            super(1);
            this.f110427a = videoCollectionCollectionContentFragment;
            this.f110428b = eVar;
            this.f110429c = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.f_7, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoCollectionCollectionContentFragment.C47583t.C475841 */

                /* renamed from: a */
                final /* synthetic */ C47583t f110430a;

                static {
                    Covode.recordClassIndex(56205);
                }

                {
                    this.f110430a = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C23024a aVar2 = aVar;
                    C89219l.m154721d(aVar2, "");
                    AbstractC47491k kVar = new C47481j().f110302b;
                    String aid = this.f110430a.f110429c.getAid();
                    C89219l.m154716b(aid, "");
                    AbstractC88412b a = kVar.mo79759b(aid).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new AbstractC88433f(this) {
                        /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoCollectionCollectionContentFragment.C47583t.C475841.C475851 */

                        /* renamed from: a */
                        final /* synthetic */ C475841 f110431a;

                        static {
                            Covode.recordClassIndex(56206);
                        }

                        {
                            this.f110431a = r1;
                        }

                        @Override // p4560f.p4561a.p4567d.AbstractC88433f
                        public final /* synthetic */ void accept(Object obj) {
                            long j;
                            Long l;
                            C31575b.m65859a();
                            IAccountUserService e = C31575b.f75524a.mo57069e();
                            C89219l.m154716b(e, "");
                            C39162r.m79462a("cancel_favourite_video", C89387v.m154943a("collection_video", "enter_from"), C89387v.m154943a("unavailable_popup", "enter_method"), C89387v.m154943a(this.f110431a.f110430a.f110429c.getAuthorUid(), "author_id"), C89387v.m154943a(this.f110431a.f110430a.f110429c.getAid(), "aweme_id"), C89387v.m154943a(e.getCurUserId(), "user_id"));
                            C47192d.C47193a aVar = this.f110431a.f110430a.f110427a.mo79769h().f109846e;
                            if (aVar == null || (l = aVar.f109847a) == null) {
                                j = 0;
                            } else {
                                j = l.longValue();
                            }
                            C47192d.C47193a aVar2 = this.f110431a.f110430a.f110427a.mo79769h().f109846e;
                            if (aVar2 != null) {
                                aVar2.f109847a = Long.valueOf(j - 1);
                            }
                            this.f110431a.f110430a.f110427a.mo79770i().mo79856d(true);
                            C47804f.m90817a("COLLECTION_LIST", new C47196f(3, null, null, null, null, null, null, null, 254));
                        }
                    }, new AbstractC88433f(this) {
                        /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoCollectionCollectionContentFragment.C47583t.C475841.C475862 */

                        /* renamed from: a */
                        final /* synthetic */ C475841 f110432a;

                        static {
                            Covode.recordClassIndex(56207);
                        }

                        {
                            this.f110432a = r1;
                        }

                        @Override // p4560f.p4561a.p4567d.AbstractC88433f
                        public final /* synthetic */ void accept(Object obj) {
                            new C23144b(this.f110432a.f110430a.f110428b).mo37640e(R.string.bof).mo37637b();
                        }
                    });
                    C89219l.m154716b(a, "");
                    C88934a.m154195a(a, this.f110430a.f110427a.mo79771j());
                    aVar2.mo37414a().dismiss();
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.a8y, new AbstractC89172b<C23024a, C89391z>() {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoCollectionCollectionContentFragment.C47583t.C475872 */

                static {
                    Covode.recordClassIndex(56208);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C23024a aVar2 = aVar;
                    C89219l.m154721d(aVar2, "");
                    aVar2.mo37414a().dismiss();
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$w */
    static final class C47590w extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCollectionCollectionContentFragment f110437a;

        /* renamed from: b */
        final /* synthetic */ View f110438b;

        static {
            Covode.recordClassIndex(56211);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47590w(VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment, View view) {
            super(1);
            this.f110437a = videoCollectionCollectionContentFragment;
            this.f110438b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20576a(this.f110437a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) new AbstractC89172b<C12759i<AbstractC12779c>, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoCollectionCollectionContentFragment.C47590w.C475911 */

                /* renamed from: a */
                final /* synthetic */ C47590w f110439a;

                static {
                    Covode.recordClassIndex(56212);
                }

                {
                    this.f110439a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12759i<AbstractC12779c> iVar) {
                    C12759i<AbstractC12779c> iVar2 = iVar;
                    C89219l.m154721d(iVar2, "");
                    iVar2.mo20617a(this.f110439a.f110437a.mo79769h());
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20576a(this.f110437a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) C475922.f110440a);
            assembler2.mo20576a(this.f110437a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) new AbstractC89172b<C12759i<AbstractC12779c>, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoCollectionCollectionContentFragment.C47590w.C475933 */

                /* renamed from: a */
                final /* synthetic */ C47590w f110441a;

                static {
                    Covode.recordClassIndex(56214);
                }

                {
                    this.f110441a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12759i<AbstractC12779c> iVar) {
                    C12759i<AbstractC12779c> iVar2 = iVar;
                    C89219l.m154721d(iVar2, "");
                    boolean z = true;
                    if (this.f110441a.f110437a.f110384i <= 1) {
                        z = false;
                    }
                    iVar2.mo20617a(new C47275h.C47305t(z));
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f110437a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoCollectionCollectionContentFragment.C47590w.C475944 */

                /* renamed from: a */
                final /* synthetic */ C47590w f110442a;

                static {
                    Covode.recordClassIndex(56215);
                }

                {
                    this.f110442a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.f31053e = this.f110442a.f110438b;
                    qVar2.mo20632a(C89204ab.m154669a(C47275h.class));
                    qVar2.f31050b = new C47275h();
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f110437a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoCollectionCollectionContentFragment.C47590w.C475955 */

                /* renamed from: a */
                final /* synthetic */ C47590w f110443a;

                static {
                    Covode.recordClassIndex(56216);
                }

                {
                    this.f110443a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.f31053e = this.f110443a.f110438b.findViewById(R.id.a7o);
                    qVar2.mo20632a(C89204ab.m154669a(C47235f.class));
                    qVar2.f31050b = new C47235f();
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$q */
    static final class C47572q extends AbstractC89220m implements AbstractC89172b<C47802d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCollectionCollectionContentFragment f110408a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f110409b;

        static {
            Covode.recordClassIndex(56193);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47572q(VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment, ActivityC0945e eVar) {
            super(1);
            this.f110408a = videoCollectionCollectionContentFragment;
            this.f110409b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
            if (r4 == null) goto L_0x0035;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47802d r8) {
            /*
                r7 = this;
                com.ss.android.ugc.aweme.favorites.viewmodel.d r8 = (com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47802d) r8
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r8, r0)
                com.bytedance.assem.arch.extensions.f<java.util.List<com.ss.android.ugc.aweme.favorites.viewmodel.a>> r0 = r8.f110751a
                java.lang.Object r1 = r0.mo20635a()
                java.util.List r1 = (java.util.List) r1
                r0 = 1
                if (r1 == 0) goto L_0x0035
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r3 = r1.iterator()
            L_0x001b:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0031
                java.lang.Object r2 = r3.next()
                r0 = r2
                com.ss.android.ugc.aweme.favorites.viewmodel.a r0 = (com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47797a) r0
                int r1 = r0.f110746b
                r0 = 2
                if (r1 != r0) goto L_0x001b
                r4.add(r2)
                goto L_0x001b
            L_0x0031:
                java.util.List r4 = (java.util.List) r4
                if (r4 != 0) goto L_0x0037
            L_0x0035:
                h.a.z r4 = p4600h.p4601a.C89086z.INSTANCE
            L_0x0037:
                com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment r0 = r7.f110408a
                java.lang.String r3 = r0.f110380e
                androidx.fragment.app.e r1 = r7.f110409b
                r2 = 1
                com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment r0 = r7.f110408a
                int r0 = r0.f110384i
                int r5 = r0 + -1
                com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$q$1 r6 = new com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$q$1
                r6.<init>(r7, r4)
                java.lang.String r4 = "collection_video"
                com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47606ae.C47607a.m90645a(r1, r2, r3, r4, r5, r6)
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoCollectionCollectionContentFragment.C47572q.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$u */
    static final class C47588u extends AbstractC89220m implements AbstractC89172b<C47802d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCollectionCollectionContentFragment f110433a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f110434b;

        static {
            Covode.recordClassIndex(56209);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47588u(VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment, C89233z.C89234a aVar) {
            super(1);
            this.f110433a = videoCollectionCollectionContentFragment;
            this.f110434b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C47802d dVar) {
            boolean z;
            C47802d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            C89233z.C89234a aVar = this.f110434b;
            List<C47797a> a = dVar2.f110751a.mo20635a();
            if (a != null) {
                z = true;
                if (!(a instanceof Collection) || !a.isEmpty()) {
                    Iterator<T> it = a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().f110746b != 0) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            z = false;
            aVar.element = z;
            if (this.f110434b.element) {
                this.f110433a.mo79770i().mo79853a(false);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionCollectionContentFragment$s */
    static final class C47582s extends AbstractC89220m implements AbstractC89172b<C47802d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCollectionCollectionContentFragment f110424a;

        /* renamed from: b */
        final /* synthetic */ View f110425b;

        /* renamed from: c */
        final /* synthetic */ Aweme f110426c;

        static {
            Covode.recordClassIndex(56203);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47582s(VideoCollectionCollectionContentFragment videoCollectionCollectionContentFragment, View view, Aweme aweme) {
            super(1);
            this.f110424a = videoCollectionCollectionContentFragment;
            this.f110425b = view;
            this.f110426c = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C47802d dVar) {
            ArrayList arrayList;
            boolean z;
            C47802d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            List<C47797a> a = dVar2.f110751a.mo20635a();
            Boolean bool = null;
            if (a != null) {
                ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) a, 10));
                Iterator<T> it = a.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next().f110745a);
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            List<C47797a> a2 = dVar2.f110751a.mo20635a();
            boolean z2 = false;
            if (a2 != null) {
                if (!(a2 instanceof Collection) || !a2.isEmpty()) {
                    Iterator<T> it2 = a2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (it2.next().f110746b != 0) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = false;
                bool = Boolean.valueOf(z);
            }
            boolean z3 = dVar2.f110753c;
            AbstractC63853q<?, ?> d = C63419ae.f143971a.mo101966d();
            d.mo103307a(arrayList, z3);
            d.mo103305a(this.f110424a.f110380e);
            C50529ae.f116790a = d;
            View view = this.f110425b;
            C0576b b = C0576b.m2193b(view, view.getWidth(), this.f110425b.getHeight());
            C89219l.m154716b(b, "");
            SmartRoute buildRoute = SmartRouter.buildRoute(this.f110424a.getActivity(), "aweme://aweme/detail/");
            Bundle bundle = new Bundle();
            bundle.putString("id", this.f110426c.getAid());
            bundle.putString("video_from", "from_profile_other");
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            bundle.putString("userid", g.getCurUserId());
            IAccountUserService g2 = C31575b.m65865g();
            C89219l.m154716b(g2, "");
            bundle.putString("sec_userid", g2.getCurSecUserId());
            bundle.putString("refer", "collection_video");
            bundle.putInt("video_type", 4);
            if (bool != null) {
                z2 = bool.booleanValue();
            }
            bundle.putBoolean("is_clean_mode", z2);
            buildRoute.withParam(bundle).withBundleAnimation(b.mo2564a()).withParam("activity_has_activity_options", true).open();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static <VM1 extends AssemViewModel<S1>, S1 extends AbstractC12853j, R> R m90588a(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC12846h.C12847a.m23091a(vm1, bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2923e.AbstractC47421a, com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        this.f110386k = new C47192d(this.f110380e, this.f110381f, new C47192d.C47194b(this.f110383h), new C47192d.C47193a(this.f110382g, 2), 4);
        C12780d.m23005a(this, new C47590w(this, view));
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2921c.C47235f.AbstractC47264v
    /* renamed from: a */
    public final void mo79655a(View view, Aweme aweme) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(aweme, "");
        m90588a(mo79770i(), new C47582s(this, view, aweme));
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j> void mo20508a(AssemViewModel<S> assemViewModel, C12854k<S> kVar, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super S, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23092a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: b */
    public final <S extends AbstractC12853j, A> void mo20515b(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23097b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A> void mo20509a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23093a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B> void mo20510a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C12854k<C12794p<A, B>> kVar3, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89187q<? super AbstractC22876d, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(qVar, "");
        AbstractC12846h.C12847a.m23094a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C> void mo20511a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C12854k<C12795q<A, B, C>> kVar4, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89188r<? super AbstractC22876d, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(rVar, "");
        AbstractC12846h.C12847a.m23095a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }
}
