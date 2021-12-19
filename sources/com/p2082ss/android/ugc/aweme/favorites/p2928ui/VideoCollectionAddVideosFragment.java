package com.p2082ss.android.ugc.aweme.favorites.p2928ui;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.C0576b;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1182af;
import com.C1764a;
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
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.favorites.api.C47196f;
import com.p2082ss.android.ugc.aweme.favorites.model.C47481j;
import com.p2082ss.android.ugc.aweme.favorites.p2921c.C47205d;
import com.p2082ss.android.ugc.aweme.favorites.p2921c.C47235f;
import com.p2082ss.android.ugc.aweme.favorites.p2923e.AbstractC47421a;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47797a;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47802d;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47804f;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
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
/* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment */
public final class VideoCollectionAddVideosFragment extends AbstractC47421a implements AbstractC12846h, C47205d.AbstractC47226u, C47235f.AbstractC47264v {

    /* renamed from: h */
    public static final C47541o f110352h = new C47541o((byte) 0);

    /* renamed from: e */
    public String f110353e;

    /* renamed from: f */
    public String f110354f;

    /* renamed from: g */
    public String f110355g;

    /* renamed from: i */
    private final C12814b f110356i;

    /* renamed from: j */
    private final AbstractC89244h f110357j;

    /* renamed from: k */
    private SparseArray f110358k;

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment$g */
    public static final class C47533g extends AbstractC89220m implements AbstractC89172b<C47802d, C47802d> {
        public static final C47533g INSTANCE = new C47533g();

        static {
            Covode.recordClassIndex(56152);
        }

        public C47533g() {
            super(1);
        }

        public final C47802d invoke(C47802d dVar) {
            C89219l.m154719c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(56145);
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2923e.AbstractC47421a, com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f110358k == null) {
            this.f110358k = new SparseArray();
        }
        View view = (View) this.f110358k.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f110358k.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2921c.C47235f.AbstractC47264v
    /* renamed from: a */
    public final void mo79656a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2923e.AbstractC47421a, com.bytedance.ies.foundation.fragment.C17372a
    public final void bx_() {
        SparseArray sparseArray = this.f110358k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: c */
    public final C88411a mo64296c() {
        return (C88411a) this.f110357j.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2923e.AbstractC47421a
    /* renamed from: e */
    public final int mo79700e() {
        return R.layout.zn;
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

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment$b */
    public static final class C47528b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110360a;

        static {
            Covode.recordClassIndex(56147);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47528b(Fragment fragment) {
            super(0);
            this.f110360a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            return this.f110360a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment$o */
    public static final class C47541o {
        static {
            Covode.recordClassIndex(56160);
        }

        private C47541o() {
        }

        public /* synthetic */ C47541o(byte b) {
            this();
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

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment$d */
    public static final class C47530d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C47530d INSTANCE = new C47530d();

        static {
            Covode.recordClassIndex(56149);
        }

        public C47530d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment$h */
    public static final class C47534h extends AbstractC89220m implements AbstractC89171a<C12874b<C47802d>> {
        public static final C47534h INSTANCE = new C47534h();

        static {
            Covode.recordClassIndex(56153);
        }

        public C47534h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47802d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment$k */
    public static final class C47537k extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C47537k INSTANCE = new C47537k();

        static {
            Covode.recordClassIndex(56156);
        }

        public C47537k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment$n */
    public static final class C47540n extends AbstractC89220m implements AbstractC89171a<C12874b<C47802d>> {
        public static final C47540n INSTANCE = new C47540n();

        static {
            Covode.recordClassIndex(56159);
        }

        public C47540n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47802d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment$p */
    static final class C47542p extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C47542p f110368a = new C47542p();

        static {
            Covode.recordClassIndex(56161);
        }

        C47542p() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment$c */
    public static final class C47529c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110361a;

        static {
            Covode.recordClassIndex(56148);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47529c(Fragment fragment) {
            super(0);
            this.f110361a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f110361a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment$i */
    public static final class C47535i extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110364a;

        static {
            Covode.recordClassIndex(56154);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47535i(Fragment fragment) {
            super(0);
            this.f110364a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f110364a.requireActivity();
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

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment$a */
    public static final class C47527a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f110359a;

        static {
            Covode.recordClassIndex(56146);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47527a(AbstractC89277c cVar) {
            super(0);
            this.f110359a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f110359a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment$e */
    public static final class C47531e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110362a;

        static {
            Covode.recordClassIndex(56150);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47531e(Fragment fragment) {
            super(0);
            this.f110362a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f110362a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f110362a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment$f */
    public static final class C47532f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110363a;

        static {
            Covode.recordClassIndex(56151);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47532f(Fragment fragment) {
            super(0);
            this.f110363a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f110363a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f110363a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment$j */
    public static final class C47536j extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110365a;

        static {
            Covode.recordClassIndex(56155);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47536j(Fragment fragment) {
            super(0);
            this.f110365a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f110365a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment$l */
    public static final class C47538l extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110366a;

        static {
            Covode.recordClassIndex(56157);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47538l(Fragment fragment) {
            super(0);
            this.f110366a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f110366a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f110366a.getActivity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment$m */
    public static final class C47539m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110367a;

        static {
            Covode.recordClassIndex(56158);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47539m(Fragment fragment) {
            super(0);
            this.f110367a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f110367a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f110367a.getActivity());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2921c.C47205d.AbstractC47226u
    /* renamed from: a */
    public final void mo79644a() {
        VideoCollectionContentViewModel videoCollectionContentViewModel = (VideoCollectionContentViewModel) this.f110356i.getValue();
        C47543q qVar = new C47543q(this);
        C89219l.m154721d(videoCollectionContentViewModel, "");
        C89219l.m154721d(qVar, "");
        AbstractC12846h.C12847a.m23091a(videoCollectionContentViewModel, qVar);
    }

    public VideoCollectionAddVideosFragment() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(VideoCollectionContentViewModel.class);
        C47527a aVar = new C47527a(a);
        C47533g gVar = C47533g.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C47534h.INSTANCE, new C47535i(this), new C47536j(this), C47537k.INSTANCE, gVar, new C47538l(this), new C47539m(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C47540n.INSTANCE, new C47528b(this), new C47529c(this), C47530d.INSTANCE, gVar, new C47531e(this), new C47532f(this));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.f110356i = bVar;
        this.f110357j = C89250i.m154773a((AbstractC89171a) C47542p.f110368a);
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment$r */
    static final class View$OnClickListenerC47546r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoCollectionAddVideosFragment f110373a;

        static {
            Covode.recordClassIndex(56165);
        }

        View$OnClickListenerC47546r(VideoCollectionAddVideosFragment videoCollectionAddVideosFragment) {
            this.f110373a = videoCollectionAddVideosFragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f110373a.mo79701f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment$s */
    static final class C47547s extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCollectionAddVideosFragment f110374a;

        /* renamed from: b */
        final /* synthetic */ View f110375b;

        static {
            Covode.recordClassIndex(56166);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47547s(VideoCollectionAddVideosFragment videoCollectionAddVideosFragment, View view) {
            super(1);
            this.f110374a = videoCollectionAddVideosFragment;
            this.f110375b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20576a(this.f110374a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) C475481.f110376a);
            assembler2.mo20576a(this.f110374a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) C475492.f110377a);
            assembler2.mo20582b(this.f110374a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoCollectionAddVideosFragment.C47547s.C475503 */

                /* renamed from: a */
                final /* synthetic */ C47547s f110378a;

                static {
                    Covode.recordClassIndex(56169);
                }

                {
                    this.f110378a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.f31053e = this.f110378a.f110375b.findViewById(R.id.a7r);
                    qVar2.mo20632a(C89204ab.m154669a(C47235f.class));
                    qVar2.f31050b = new C47235f();
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f110374a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoCollectionAddVideosFragment.C47547s.C475514 */

                /* renamed from: a */
                final /* synthetic */ C47547s f110379a;

                static {
                    Covode.recordClassIndex(56170);
                }

                {
                    this.f110379a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.f31053e = this.f110379a.f110375b;
                    qVar2.mo20632a(C89204ab.m154669a(C47205d.class));
                    qVar2.f31050b = new C47205d();
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.VideoCollectionAddVideosFragment$q */
    static final class C47543q extends AbstractC89220m implements AbstractC89172b<C47802d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoCollectionAddVideosFragment f110369a;

        static {
            Covode.recordClassIndex(56162);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47543q(VideoCollectionAddVideosFragment videoCollectionAddVideosFragment) {
            super(1);
            this.f110369a = videoCollectionAddVideosFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C47802d dVar) {
            C47802d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            List<C47797a> a = dVar2.f110751a.mo20635a();
            if (a != null) {
                ArrayList arrayList = new ArrayList();
                for (T t : a) {
                    if (t.f110746b == 2) {
                        arrayList.add(t);
                    }
                }
                ArrayList<C47797a> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
                for (C47797a aVar : arrayList2) {
                    arrayList3.add(aVar.f110745a);
                }
                ArrayList<Aweme> arrayList4 = arrayList3;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    String str = this.f110369a.f110353e;
                    ArrayList arrayList5 = new ArrayList(C89070n.m154526a((Iterable) arrayList4, 10));
                    for (Aweme aweme : arrayList4) {
                        arrayList5.add(aweme.getAid());
                    }
                    final C47196f fVar = new C47196f(10, str, null, null, null, arrayList5, null, null, 220);
                    AbstractC88412b a2 = new C47481j().f110302b.mo79755a(fVar).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new AbstractC88433f(this) {
                        /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoCollectionAddVideosFragment.C47543q.C475441 */

                        /* renamed from: a */
                        final /* synthetic */ C47543q f110370a;

                        static {
                            Covode.recordClassIndex(56163);
                        }

                        {
                            this.f110370a = r1;
                        }

                        @Override // p4560f.p4561a.p4567d.AbstractC88433f
                        public final /* synthetic */ void accept(Object obj) {
                            C39162r.m79462a("collection_add_videos", C89387v.m154943a("collection_video", "enter_from"), C89387v.m154943a(this.f110370a.f110369a.f110353e, "collection_id"));
                            String str = this.f110370a.f110369a.f110355g;
                            if (str != null) {
                                C47196f fVar = fVar;
                                C47804f.m90817a(str, new C47196f(fVar.f109854a, fVar.f109855b, this.f110370a.f110369a.f110354f, fVar.f109857d, fVar.f109858e, fVar.f109859f, fVar.f109860g, fVar.f109861h));
                            }
                            this.f110370a.f110369a.mo79701f();
                        }
                    }, new AbstractC88433f(this) {
                        /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.VideoCollectionAddVideosFragment.C47543q.C475452 */

                        /* renamed from: a */
                        final /* synthetic */ C47543q f110372a;

                        static {
                            Covode.recordClassIndex(56164);
                        }

                        {
                            this.f110372a = r1;
                        }

                        @Override // p4560f.p4561a.p4567d.AbstractC88433f
                        public final /* synthetic */ void accept(Object obj) {
                            ActivityC0945e requireActivity = this.f110372a.f110369a.requireActivity();
                            C89219l.m154716b(requireActivity, "");
                            new C23144b(requireActivity).mo37640e(R.string.bof).mo37637b();
                        }
                    });
                    C89219l.m154716b(a2, "");
                    C88934a.m154195a(a2, this.f110369a.mo64296c());
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2923e.AbstractC47421a, com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        view.findViewById(R.id.a0w).setOnClickListener(new View$OnClickListenerC47546r(this));
        C12780d.m23005a(this, new C47547s(this, view));
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2921c.C47235f.AbstractC47264v
    /* renamed from: a */
    public final void mo79655a(View view, Aweme aweme) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(aweme, "");
        C0576b b = C0576b.m2193b(view, view.getWidth(), view.getHeight());
        C89219l.m154716b(b, "");
        SmartRoute buildRoute = SmartRouter.buildRoute(getActivity(), "aweme://aweme/detail/");
        Bundle bundle = new Bundle();
        bundle.putString("id", aweme.getAid());
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        bundle.putString("userid", g.getCurUserId());
        IAccountUserService g2 = C31575b.m65865g();
        C89219l.m154716b(g2, "");
        bundle.putString("sec_userid", g2.getCurSecUserId());
        bundle.putString("refer", "collection_video");
        bundle.putString("tab_name", "collection");
        bundle.putBoolean("is_clean_mode", true);
        buildRoute.withParam(bundle).withBundleAnimation(b.mo2564a()).withParam("activity_has_activity_options", true).open();
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2923e.AbstractC47421a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.zn, viewGroup, false);
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
