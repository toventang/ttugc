package com.p2082ss.android.ugc.aweme.detail.p2751ui.p2753b;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1182af;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.extensions.C12794p;
import com.bytedance.assem.arch.extensions.C12795q;
import com.bytedance.assem.arch.extensions.C12796r;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12846h;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.p2082ss.android.ugc.aweme.IDetailPageOperatorService;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa;
import com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41265ab;
import com.p2082ss.android.ugc.aweme.detail.operators.C41314s;
import com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48199bb;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoPlaySearchViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.MixFlowParam;
import com.p2082ss.android.ugc.aweme.feed.p2944e.C49445o;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50529ae;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.feed.param.MobParamProvider;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.search.p3683a.C67338a;
import java.util.HashMap;
import java.util.List;
import p4600h.C89391z;
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

/* renamed from: com.ss.android.ugc.aweme.detail.ui.b.a */
public abstract class AbstractC41363a extends C41426z implements AbstractC12846h {

    /* renamed from: q */
    public final boolean f96526q;

    /* renamed from: r */
    public int f96527r;

    /* renamed from: s */
    public C49812b f96528s;

    /* renamed from: t */
    public boolean f96529t;

    /* renamed from: u */
    public boolean f96530u;

    /* renamed from: v */
    private final C12814b f96531v;

    /* renamed from: w */
    private SparseArray f96532w;

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.b.a$g */
    public static final class C41370g extends AbstractC89220m implements AbstractC89172b<C48199bb, C48199bb> {
        public static final C41370g INSTANCE = new C41370g();

        static {
            Covode.recordClassIndex(49265);
        }

        public C41370g() {
            super(1);
        }

        public final C48199bb invoke(C48199bb bbVar) {
            C89219l.m154719c(bbVar, "");
            return bbVar;
        }
    }

    static {
        Covode.recordClassIndex(49258);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e
    /* renamed from: a */
    public View mo61343a(int i) {
        if (this.f96532w == null) {
            this.f96532w = new SparseArray();
        }
        View view = (View) this.f96532w.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f96532w.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public abstract List<Aweme> mo70642a(AbstractC41262aa aaVar);

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e
    /* renamed from: e */
    public void mo61344e() {
        SparseArray sparseArray = this.f96532w;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public AbstractC1204m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public AbstractC22876d getReceiverForHostVM() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo61344e();
    }

    /* renamed from: v */
    public abstract int mo70643v();

    /* renamed from: w */
    public abstract MixFlowParam mo70644w();

    /* renamed from: x */
    public abstract View mo70645x();

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.b.a$b */
    public static final class C41365b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ Fragment f96534a;

        static {
            Covode.recordClassIndex(49260);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41365b(Fragment fragment) {
            super(0);
            this.f96534a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            return this.f96534a;
        }
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22878f
    public AbstractC1204m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public AbstractC22878f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22880h
    public AbstractC22876d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public AbstractC22880h<AbstractC22876d> getActualReceiverHolder() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.b.a$d */
    public static final class C41367d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C41367d INSTANCE = new C41367d();

        static {
            Covode.recordClassIndex(49262);
        }

        public C41367d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.b.a$h */
    public static final class C41371h extends AbstractC89220m implements AbstractC89171a<C12874b<C48199bb>> {
        public static final C41371h INSTANCE = new C41371h();

        static {
            Covode.recordClassIndex(49266);
        }

        public C41371h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48199bb> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.b.a$k */
    public static final class C41374k extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C41374k INSTANCE = new C41374k();

        static {
            Covode.recordClassIndex(49269);
        }

        public C41374k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.b.a$n */
    public static final class C41377n extends AbstractC89220m implements AbstractC89171a<C12874b<C48199bb>> {
        public static final C41377n INSTANCE = new C41377n();

        static {
            Covode.recordClassIndex(49272);
        }

        public C41377n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48199bb> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.b.a$c */
    public static final class C41366c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f96535a;

        static {
            Covode.recordClassIndex(49261);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41366c(Fragment fragment) {
            super(0);
            this.f96535a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f96535a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.b.a$i */
    public static final class C41372i extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f96538a;

        static {
            Covode.recordClassIndex(49267);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41372i(Fragment fragment) {
            super(0);
            this.f96538a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f96538a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return requireActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.b.a$a */
    public static final class C41364a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f96533a;

        static {
            Covode.recordClassIndex(49259);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41364a(AbstractC89277c cVar) {
            super(0);
            this.f96533a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f96533a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.b.a$e */
    public static final class C41368e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f96536a;

        static {
            Covode.recordClassIndex(49263);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41368e(Fragment fragment) {
            super(0);
            this.f96536a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f96536a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f96536a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.b.a$f */
    public static final class C41369f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f96537a;

        static {
            Covode.recordClassIndex(49264);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41369f(Fragment fragment) {
            super(0);
            this.f96537a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f96537a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f96537a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.b.a$j */
    public static final class C41373j extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f96539a;

        static {
            Covode.recordClassIndex(49268);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41373j(Fragment fragment) {
            super(0);
            this.f96539a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f96539a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.b.a$l */
    public static final class C41375l extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f96540a;

        static {
            Covode.recordClassIndex(49270);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41375l(Fragment fragment) {
            super(0);
            this.f96540a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f96540a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f96540a.getActivity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.b.a$m */
    public static final class C41376m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f96541a;

        static {
            Covode.recordClassIndex(49271);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41376m(Fragment fragment) {
            super(0);
            this.f96541a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f96541a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f96541a.getActivity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.b.a$p */
    static final class RunnableC41379p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC41363a f96543a;

        static {
            Covode.recordClassIndex(49274);
        }

        RunnableC41379p(AbstractC41363a aVar) {
            this.f96543a = aVar;
        }

        public final void run() {
            C41178b bVar;
            VerticalViewPager verticalViewPager;
            AbstractC41363a aVar = this.f96543a;
            if (aVar.isAdded() && (bVar = aVar.f96636k) != null && (verticalViewPager = bVar.f114759N) != null) {
                verticalViewPager.mo67974a(new C41378o(aVar));
            }
        }
    }

    public AbstractC41363a() {
        boolean z;
        C12814b bVar;
        if (C50529ae.f116794e != null) {
            z = true;
        } else {
            z = false;
        }
        this.f96526q = z;
        this.f96527r = -1;
        this.f96528s = new C49812b();
        AbstractC12848i.C12849a aVar = AbstractC12848i.C12849a.f31275a;
        AbstractC89277c a = C89204ab.m154669a(VideoPlaySearchViewModel.class);
        C41364a aVar2 = new C41364a(a);
        C41370g gVar = C41370g.INSTANCE;
        if (C89219l.m154714a(aVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar2, C41371h.INSTANCE, new C41372i(this), new C41373j(this), C41374k.INSTANCE, gVar, new C41375l(this), new C41376m(this));
        } else if (aVar == null || C89219l.m154714a(aVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar2, C41377n.INSTANCE, new C41365b(this), new C41366c(this), C41367d.INSTANCE, gVar, new C41368e(this), new C41369f(this));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.f96531v = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.b.a$o */
    public static final class C41378o extends ViewPager.C1582h {

        /* renamed from: a */
        final /* synthetic */ AbstractC41363a f96542a;

        static {
            Covode.recordClassIndex(49273);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C41378o(AbstractC41363a aVar) {
            this.f96542a = aVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            boolean a;
            if (this.f96542a.f96526q) {
                AbstractC41262aa aaVar = this.f96542a.f96641p;
                if (!(aaVar instanceof C41382c)) {
                    aaVar = null;
                }
                C41382c cVar = (C41382c) aaVar;
                if (cVar != null) {
                    this.f96542a.f96529t = cVar.mo70649a(i);
                    AbstractC41363a aVar = this.f96542a;
                    if (aVar.f96527r < 0) {
                        a = true;
                    } else {
                        a = cVar.mo70649a(this.f96542a.f96527r);
                    }
                    aVar.f96530u = a;
                }
                this.f96542a.f96527r = i;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z
    /* renamed from: a */
    public final AbstractC41262aa mo70641a(AbstractC39100a<?, ?> aVar) {
        AbstractC39100a<?, ?> aVar2 = C50529ae.f116794e;
        AbstractC41262aa aaVar = null;
        if (aVar2 != null) {
            C50529ae.f116794e = null;
            C49812b bVar = this.f96635j;
            JediViewModel<?> j = mo70692j();
            if (C41314s.f96426a.size() == 0) {
                for (IDetailPageOperatorService iDetailPageOperatorService : ServiceManager.get().getServices(IDetailPageOperatorService.class)) {
                    HashMap<String, AbstractC41265ab> a = iDetailPageOperatorService.mo57213a();
                    if (a != null) {
                        C41314s.f96426a.putAll(a);
                    }
                }
            }
            AbstractC41265ab abVar = C41314s.f96426a.get("from_search_mix");
            if (abVar != null) {
                aaVar = abVar.mo62369a(bVar, aVar2, j);
            }
        }
        if (aaVar == null || C67338a.m119381a()) {
            AbstractC41262aa a2 = super.mo70641a(aVar);
            C89219l.m154716b(a2, "");
            return a2;
        }
        AbstractC41262aa a3 = super.mo70641a(aVar);
        MixFlowParam w = mo70644w();
        MixFlowParam mixFlowParam = new MixFlowParam("general_search", "from_search_mix");
        int v = mo70643v();
        C89219l.m154716b(a3, "");
        return new C41382c(w, mixFlowParam, v, a3, aaVar, mo70642a(a3));
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z
    public void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        if (C67338a.m119381a()) {
            super.onViewCreated(view, bundle);
            return;
        }
        C49812b bVar = this.f96635j;
        this.f96528s.setEventType(bVar.getEventType());
        this.f96528s.setPreviousPage(bVar.getPreviousPage());
        this.f96528s.setFrom(bVar.getFrom());
        this.f96528s.setHotEnterMethod(bVar.getHotEnterMethod());
        super.onViewCreated(view, bundle);
        view.post(new RunnableC41379p(this));
        AbstractC12818f.C12819a.m23063a(this, (VideoPlaySearchViewModel) this.f96531v.getValue(), C41381b.f96545a, (C12854k) null, new C41380q(this), 6);
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.b.a$q */
    static final class C41380q extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC41363a f96544a;

        static {
            Covode.recordClassIndex(49275);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41380q(AbstractC41363a aVar) {
            super(2);
            this.f96544a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, C12776a<? extends C89391z> aVar) {
            C49445o oVar;
            C49445o oVar2;
            C89219l.m154721d(dVar, "");
            if (this.f96544a.f96530u && !this.f96544a.f96529t) {
                AbstractC41363a aVar2 = this.f96544a;
                C49812b bVar = aVar2.f96635j;
                C89219l.m154716b(bVar, "");
                bVar.setFrom("from_search_mix");
                C49812b bVar2 = aVar2.f96635j;
                C89219l.m154716b(bVar2, "");
                bVar2.setEventType("general_search");
                C49812b bVar3 = aVar2.f96635j;
                C89219l.m154716b(bVar3, "");
                bVar3.setPreviousPage(aVar2.f96528s.getEventType());
                C49812b bVar4 = aVar2.f96635j;
                C89219l.m154716b(bVar4, "");
                bVar4.setIsFromPlaylist(1);
                Context requireContext = aVar2.requireContext();
                C89219l.m154716b(requireContext, "");
                MobParamProvider.C49810a.m93272a(requireContext).mo84341a("slide_type", "artificial_to_natural");
                C41178b bVar5 = aVar2.f96636k;
                if (!(bVar5 == null || (oVar2 = bVar5.f114783aK) == null)) {
                    oVar2.f113601d = "general_search";
                }
                View x = aVar2.mo70645x();
                if (x != null) {
                    x.setVisibility(4);
                }
            } else if (!this.f96544a.f96530u && this.f96544a.f96529t) {
                AbstractC41363a aVar3 = this.f96544a;
                C49812b bVar6 = aVar3.f96635j;
                C89219l.m154716b(bVar6, "");
                bVar6.setFrom(aVar3.f96528s.getFrom());
                C49812b bVar7 = aVar3.f96635j;
                C89219l.m154716b(bVar7, "");
                bVar7.setEventType(aVar3.f96528s.getEventType());
                C49812b bVar8 = aVar3.f96635j;
                C89219l.m154716b(bVar8, "");
                bVar8.setPreviousPage(aVar3.f96528s.getPreviousPage());
                C49812b bVar9 = aVar3.f96635j;
                C89219l.m154716b(bVar9, "");
                bVar9.setIsFromPlaylist(0);
                Context requireContext2 = aVar3.requireContext();
                C89219l.m154716b(requireContext2, "");
                MobParamProvider.C49810a.m93272a(requireContext2).mo84341a("slide_type", "artificial_to_own");
                C41178b bVar10 = aVar3.f96636k;
                if (!(bVar10 == null || (oVar = bVar10.f114783aK) == null)) {
                    oVar.f113601d = aVar3.f96528s.getEventType();
                }
                View x2 = aVar3.mo70645x();
                if (x2 != null) {
                    x2.setVisibility(0);
                }
            }
            return C89391z.f203057a;
        }
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
    /* renamed from: a */
    public final <S extends AbstractC12853j, A> void mo20509a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23093a(this, assemViewModel, kVar, kVar2, bVar, mVar);
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
