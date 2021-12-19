package com.p2082ss.android.ugc.aweme.favorites.p2928ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.core.app.C0576b;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1182af;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
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
import com.bytedance.assem.arch.viewModel.C12815c;
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
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.favorites.api.C47190b;
import com.p2082ss.android.ugc.aweme.favorites.api.C47192d;
import com.p2082ss.android.ugc.aweme.favorites.api.C47196f;
import com.p2082ss.android.ugc.aweme.favorites.model.AbstractC47491k;
import com.p2082ss.android.ugc.aweme.favorites.model.C47481j;
import com.p2082ss.android.ugc.aweme.favorites.p2921c.C47235f;
import com.p2082ss.android.ugc.aweme.favorites.p2923e.AbstractC47421a;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47797a;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47802d;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47804f;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50529ae;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63853q;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
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
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment */
public final class VideoAllFavoriteContentFragment extends AbstractC47421a implements AbstractC12846h, C47235f.AbstractC47264v {

    /* renamed from: e */
    public Long f110313e;

    /* renamed from: f */
    private final AbstractC89244h f110314f = C89250i.m154773a((AbstractC89171a) C47507o.f110326a);

    /* renamed from: g */
    private final C12814b f110315g;

    /* renamed from: h */
    private SparseArray f110316h;

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$g */
    public static final class C47499g extends AbstractC89220m implements AbstractC89172b<C47802d, C47802d> {
        public static final C47499g INSTANCE = new C47499g();

        static {
            Covode.recordClassIndex(56117);
        }

        public C47499g() {
            super(1);
        }

        public final C47802d invoke(C47802d dVar) {
            C89219l.m154719c(dVar, "");
            return dVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$r */
    public static final class C47510r<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C47510r f110329a = new C47510r();

        static {
            Covode.recordClassIndex(56128);
        }

        C47510r() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$y */
    public final /* synthetic */ class View$OnClickListenerC47526y implements View.OnClickListener {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f110351a;

        static {
            Covode.recordClassIndex(56144);
        }

        public View$OnClickListenerC47526y(AbstractC89172b bVar) {
            this.f110351a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            C89219l.m154716b(this.f110351a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(56110);
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2923e.AbstractC47421a, com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f110316h == null) {
            this.f110316h = new SparseArray();
        }
        View view = (View) this.f110316h.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f110316h.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2923e.AbstractC47421a, com.bytedance.ies.foundation.fragment.C17372a
    public final void bx_() {
        SparseArray sparseArray = this.f110316h;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: c */
    public final C88411a mo64296c() {
        return (C88411a) this.f110314f.getValue();
    }

    /* renamed from: d */
    public final VideoCollectionContentViewModel mo79763d() {
        return (VideoCollectionContentViewModel) this.f110315g.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2923e.AbstractC47421a
    /* renamed from: e */
    public final int mo79700e() {
        return R.layout.zl;
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

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$b */
    public static final class C47494b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110318a;

        static {
            Covode.recordClassIndex(56112);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47494b(Fragment fragment) {
            super(0);
            this.f110318a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            return this.f110318a;
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
            C23028c.m43435a(bVar, new C47512t(this, activity, aweme));
            new C23013a(bVar).mo37396b().show();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$d */
    public static final class C47496d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C47496d INSTANCE = new C47496d();

        static {
            Covode.recordClassIndex(56114);
        }

        public C47496d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$h */
    public static final class C47500h extends AbstractC89220m implements AbstractC89171a<C12874b<C47802d>> {
        public static final C47500h INSTANCE = new C47500h();

        static {
            Covode.recordClassIndex(56118);
        }

        public C47500h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47802d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$k */
    public static final class C47503k extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C47503k INSTANCE = new C47503k();

        static {
            Covode.recordClassIndex(56121);
        }

        public C47503k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$n */
    public static final class C47506n extends AbstractC89220m implements AbstractC89171a<C12874b<C47802d>> {
        public static final C47506n INSTANCE = new C47506n();

        static {
            Covode.recordClassIndex(56124);
        }

        public C47506n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47802d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$o */
    static final class C47507o extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C47507o f110326a = new C47507o();

        static {
            Covode.recordClassIndex(56125);
        }

        C47507o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$c */
    public static final class C47495c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110319a;

        static {
            Covode.recordClassIndex(56113);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47495c(Fragment fragment) {
            super(0);
            this.f110319a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f110319a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$i */
    public static final class C47501i extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110322a;

        static {
            Covode.recordClassIndex(56119);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47501i(Fragment fragment) {
            super(0);
            this.f110322a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f110322a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return requireActivity;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2923e.AbstractC47421a, com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        mo64296c().mo142944a();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$a */
    public static final class C47493a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f110317a;

        static {
            Covode.recordClassIndex(56111);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47493a(AbstractC89277c cVar) {
            super(0);
            this.f110317a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f110317a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$e */
    public static final class C47497e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110320a;

        static {
            Covode.recordClassIndex(56115);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47497e(Fragment fragment) {
            super(0);
            this.f110320a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f110320a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f110320a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$f */
    public static final class C47498f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110321a;

        static {
            Covode.recordClassIndex(56116);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47498f(Fragment fragment) {
            super(0);
            this.f110321a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f110321a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f110321a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$j */
    public static final class C47502j extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110323a;

        static {
            Covode.recordClassIndex(56120);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47502j(Fragment fragment) {
            super(0);
            this.f110323a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f110323a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$l */
    public static final class C47504l extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110324a;

        static {
            Covode.recordClassIndex(56122);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47504l(Fragment fragment) {
            super(0);
            this.f110324a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f110324a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f110324a.getActivity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$m */
    public static final class C47505m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110325a;

        static {
            Covode.recordClassIndex(56123);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47505m(Fragment fragment) {
            super(0);
            this.f110325a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f110325a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f110325a.getActivity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$w */
    static final class C47523w extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ TuxStatusView f110347a;

        static {
            Covode.recordClassIndex(56141);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47523w(TuxStatusView tuxStatusView) {
            super(0);
            this.f110347a = tuxStatusView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f110347a.mo37867a();
            TuxStatusView tuxStatusView = this.f110347a;
            C89219l.m154716b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            return C89391z.f203057a;
        }
    }

    /* renamed from: i */
    private final void m90560i() {
        AbstractC88412b a = new C47481j().f110302b.mo79752a(2).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C47509q(this), C47510r.f110329a);
        C89219l.m154716b(a, "");
        C88934a.m154195a(a, mo64296c());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C47196f a = C47804f.m90816a("COLLECTION_CONTENT");
        if (a != null && a.f109854a == 3) {
            mo79763d().mo79855c(true);
            m90560i();
            C47804f.m90817a("COLLECTION_LIST", a);
        }
    }

    public VideoAllFavoriteContentFragment() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(VideoCollectionContentViewModel.class);
        C47493a aVar = new C47493a(a);
        C47499g gVar = C47499g.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C47500h.INSTANCE, new C47501i(this), new C47502j(this), C47503k.INSTANCE, gVar, new C47504l(this), new C47505m(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C47506n.INSTANCE, new C47494b(this), new C47495c(this), C47496d.INSTANCE, gVar, new C47497e(this), new C47498f(this));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.f110315g = bVar;
    }

    /* renamed from: h */
    public final void mo79764h() {
        Resources resources;
        Resources resources2;
        CharSequence charSequence = null;
        if (this.f110313e != null) {
            StringBuilder sb = new StringBuilder();
            Context context = getContext();
            if (!(context == null || (resources2 = context.getResources()) == null)) {
                charSequence = resources2.getText(R.string.btm);
            }
            m90559a(this, sb.append(charSequence).append(" (").append(this.f110313e).append(')').toString());
            return;
        }
        Context context2 = getContext();
        if (!(context2 == null || (resources = context2.getResources()) == null)) {
            charSequence = resources.getText(R.string.btm);
        }
        m90559a(this, String.valueOf(charSequence));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$p */
    public static final class C47508p extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoAllFavoriteContentFragment f110327a;

        static {
            Covode.recordClassIndex(56126);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47508p(VideoAllFavoriteContentFragment videoAllFavoriteContentFragment) {
            super(1);
            this.f110327a = videoAllFavoriteContentFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            this.f110327a.mo79701f();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$q */
    public static final class C47509q<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ VideoAllFavoriteContentFragment f110328a;

        static {
            Covode.recordClassIndex(56127);
        }

        C47509q(VideoAllFavoriteContentFragment videoAllFavoriteContentFragment) {
            this.f110328a = videoAllFavoriteContentFragment;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Long l;
            C47192d.C47193a aVar;
            VideoAllFavoriteContentFragment videoAllFavoriteContentFragment = this.f110328a;
            C47192d dVar = ((C47190b) obj).f109838a;
            if (dVar == null || (aVar = dVar.f109846e) == null) {
                l = null;
            } else {
                l = aVar.f109847a;
            }
            videoAllFavoriteContentFragment.f110313e = l;
            this.f110328a.mo79764h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$t */
    static final class C47512t extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoAllFavoriteContentFragment f110333a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f110334b;

        /* renamed from: c */
        final /* synthetic */ Aweme f110335c;

        static {
            Covode.recordClassIndex(56130);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47512t(VideoAllFavoriteContentFragment videoAllFavoriteContentFragment, ActivityC0945e eVar, Aweme aweme) {
            super(1);
            this.f110333a = videoAllFavoriteContentFragment;
            this.f110334b = eVar;
            this.f110335c = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.f_7, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoAllFavoriteContentFragment.C47512t.C475131 */

                /* renamed from: a */
                final /* synthetic */ C47512t f110336a;

                static {
                    Covode.recordClassIndex(56131);
                }

                {
                    this.f110336a = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C23024a aVar2 = aVar;
                    C89219l.m154721d(aVar2, "");
                    AbstractC47491k kVar = new C47481j().f110302b;
                    String aid = this.f110336a.f110335c.getAid();
                    C89219l.m154716b(aid, "");
                    AbstractC88412b a = kVar.mo79759b(aid).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new AbstractC88433f(this) {
                        /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoAllFavoriteContentFragment.C47512t.C475131.C475141 */

                        /* renamed from: a */
                        final /* synthetic */ C475131 f110337a;

                        static {
                            Covode.recordClassIndex(56132);
                        }

                        {
                            this.f110337a = r1;
                        }

                        @Override // p4560f.p4561a.p4567d.AbstractC88433f
                        public final /* synthetic */ void accept(Object obj) {
                            Long l = this.f110337a.f110336a.f110333a.f110313e;
                            if (l != null) {
                                long longValue = l.longValue();
                                this.f110337a.f110336a.f110333a.f110313e = Long.valueOf(longValue - 1);
                                this.f110337a.f110336a.f110333a.mo79764h();
                            }
                            C31575b.m65859a();
                            IAccountUserService e = C31575b.f75524a.mo57069e();
                            C89219l.m154716b(e, "");
                            C39162r.m79462a("cancel_favourite_video", C89387v.m154943a("collection_video", "enter_from"), C89387v.m154943a("unavailable_popup", "enter_method"), C89387v.m154943a(this.f110337a.f110336a.f110335c.getAuthorUid(), "author_id"), C89387v.m154943a(this.f110337a.f110336a.f110335c.getAid(), "aweme_id"), C89387v.m154943a(e.getCurUserId(), "user_id"));
                            this.f110337a.f110336a.f110333a.mo79763d().mo79855c(true);
                            C47804f.m90817a("COLLECTION_LIST", new C47196f(3, null, null, null, null, null, null, null, 254));
                        }
                    }, new AbstractC88433f(this) {
                        /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoAllFavoriteContentFragment.C47512t.C475131.C475152 */

                        /* renamed from: a */
                        final /* synthetic */ C475131 f110338a;

                        static {
                            Covode.recordClassIndex(56133);
                        }

                        {
                            this.f110338a = r1;
                        }

                        @Override // p4560f.p4561a.p4567d.AbstractC88433f
                        public final /* synthetic */ void accept(Object obj) {
                            new C23144b(this.f110338a.f110336a.f110334b).mo37640e(R.string.bof).mo37637b();
                        }
                    });
                    C89219l.m154716b(a, "");
                    C88934a.m154195a(a, this.f110336a.f110333a.mo64296c());
                    aVar2.mo37414a().dismiss();
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.a8y, new AbstractC89172b<C23024a, C89391z>() {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoAllFavoriteContentFragment.C47512t.C475162 */

                static {
                    Covode.recordClassIndex(56134);
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

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$u */
    static final class C47517u extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoAllFavoriteContentFragment f110339a;

        /* renamed from: b */
        final /* synthetic */ View f110340b;

        static {
            Covode.recordClassIndex(56135);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47517u(VideoAllFavoriteContentFragment videoAllFavoriteContentFragment, View view) {
            super(1);
            this.f110339a = videoAllFavoriteContentFragment;
            this.f110340b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20576a(this.f110339a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) C475181.f110341a);
            assembler2.mo20576a(this.f110339a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) C475192.f110342a);
            assembler2.mo20582b(this.f110339a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoAllFavoriteContentFragment.C47517u.C475203 */

                /* renamed from: a */
                final /* synthetic */ C47517u f110343a;

                static {
                    Covode.recordClassIndex(56138);
                }

                {
                    this.f110343a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.f31053e = this.f110343a.f110340b.findViewById(R.id.a7r);
                    qVar2.mo20632a(C89204ab.m154669a(C47235f.class));
                    qVar2.f31050b = new C47235f();
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$x */
    static final class C47524x extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoAllFavoriteContentFragment f110348a;

        /* renamed from: b */
        final /* synthetic */ TuxStatusView f110349b;

        static {
            Covode.recordClassIndex(56142);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47524x(VideoAllFavoriteContentFragment videoAllFavoriteContentFragment, TuxStatusView tuxStatusView) {
            super(1);
            this.f110348a = videoAllFavoriteContentFragment;
            this.f110349b = tuxStatusView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            this.f110349b.setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoAllFavoriteContentFragment.C47524x.C475251 */

                /* renamed from: a */
                final /* synthetic */ C47524x f110350a;

                static {
                    Covode.recordClassIndex(56143);
                }

                {
                    this.f110350a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f110350a.f110348a.mo79763d().mo79855c(true);
                    return C89391z.f203057a;
                }
            }));
            TuxStatusView tuxStatusView = this.f110349b;
            C89219l.m154716b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$v */
    static final class C47521v extends AbstractC89220m implements AbstractC89172b<List<? extends C47797a>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ TuxStatusView f110344a;

        /* renamed from: b */
        final /* synthetic */ Context f110345b;

        static {
            Covode.recordClassIndex(56139);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47521v(TuxStatusView tuxStatusView, Context context) {
            super(1);
            this.f110344a = tuxStatusView;
            this.f110345b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends C47797a> list) {
            List<? extends C47797a> list2 = list;
            C89219l.m154721d(list2, "");
            if (list2.isEmpty()) {
                TuxStatusView tuxStatusView = this.f110344a;
                TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
                String string = this.f110345b.getString(R.string.bsa);
                C89219l.m154716b(string, "");
                TuxStatusView.C23263c a = cVar.mo37879a(string);
                String string2 = this.f110345b.getString(R.string.bs_);
                C89219l.m154716b(string2, "");
                tuxStatusView.setStatus(a.mo37878a((CharSequence) string2).mo37877a(C23005c.m43393a(C475221.f110346a)));
                TuxStatusView tuxStatusView2 = this.f110344a;
                C89219l.m154716b(tuxStatusView2, "");
                tuxStatusView2.setVisibility(0);
            } else {
                TuxStatusView tuxStatusView3 = this.f110344a;
                C89219l.m154716b(tuxStatusView3, "");
                tuxStatusView3.setVisibility(8);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoAllFavoriteContentFragment$s */
    static final class C47511s extends AbstractC89220m implements AbstractC89172b<C47802d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoAllFavoriteContentFragment f110330a;

        /* renamed from: b */
        final /* synthetic */ View f110331b;

        /* renamed from: c */
        final /* synthetic */ Aweme f110332c;

        static {
            Covode.recordClassIndex(56129);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47511s(VideoAllFavoriteContentFragment videoAllFavoriteContentFragment, View view, Aweme aweme) {
            super(1);
            this.f110330a = videoAllFavoriteContentFragment;
            this.f110331b = view;
            this.f110332c = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C47802d dVar) {
            ArrayList arrayList;
            C47802d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            List<C47797a> a = dVar2.f110751a.mo20635a();
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
            boolean z = dVar2.f110753c;
            AbstractC63853q<?, ?> d = C63419ae.f143971a.mo101966d();
            d.mo103307a(arrayList, z);
            C50529ae.f116790a = d;
            View view = this.f110331b;
            C0576b b = C0576b.m2193b(view, view.getWidth(), this.f110331b.getHeight());
            C89219l.m154716b(b, "");
            SmartRoute buildRoute = SmartRouter.buildRoute(this.f110330a.getActivity(), "aweme://aweme/detail/");
            Bundle bundle = new Bundle();
            bundle.putString("id", this.f110332c.getAid());
            bundle.putString("video_from", "from_profile_other");
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            bundle.putString("userid", g.getCurUserId());
            IAccountUserService g2 = C31575b.m65865g();
            C89219l.m154716b(g2, "");
            bundle.putString("sec_userid", g2.getCurSecUserId());
            bundle.putString("refer", "collection_video");
            bundle.putInt("video_type", 4);
            buildRoute.withParam(bundle).withBundleAnimation(b.mo2564a()).withParam("activity_has_activity_options", true).open();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2921c.C47235f.AbstractC47264v
    /* renamed from: a */
    public final void mo79655a(View view, Aweme aweme) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(aweme, "");
        VideoCollectionContentViewModel d = mo79763d();
        C47511s sVar = new C47511s(this, view, aweme);
        C89219l.m154721d(d, "");
        C89219l.m154721d(sVar, "");
        AbstractC12846h.C12847a.m23091a(d, sVar);
    }

    /* renamed from: a */
    private static /* synthetic */ void m90559a(VideoAllFavoriteContentFragment videoAllFavoriteContentFragment, String str) {
        C47508p pVar = new C47508p(videoAllFavoriteContentFragment);
        Context context = videoAllFavoriteContentFragment.getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            View findViewById = activity.findViewById(R.id.title);
            C89219l.m154716b(findViewById, "");
            ((TextView) findViewById).setText(str);
            activity.findViewById(R.id.pi).setOnClickListener(new View$OnClickListenerC47526y(pVar));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2923e.AbstractC47421a, com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        mo79764h();
        C12780d.m23005a(this, new C47517u(this, view));
        m90560i();
        TuxStatusView tuxStatusView = (TuxStatusView) view.findViewById(R.id.e7i);
        Context context = view.getContext();
        VideoCollectionContentViewModel d = mo79763d();
        AbstractC89290k kVar = C47605ad.f110460a;
        C47521v vVar = new C47521v(tuxStatusView, context);
        AssemViewModel.m23030a(d, kVar, null, new C47524x(this, tuxStatusView), new C47523w(tuxStatusView), vVar, 2);
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
}
