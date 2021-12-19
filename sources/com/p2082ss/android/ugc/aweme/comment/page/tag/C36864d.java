package com.p2082ss.android.ugc.aweme.comment.page.tag;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.lifecycle.SharedViewModelProvider;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.core.C12759i;
import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.ies.foundation.fragment.C17372a;
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
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.page.tag.api.VideoTagApi;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.C36945f;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.FeedTaggedListViewModel;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.SocialVideoTagShareVM;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import dagger.hilt.android.internal.p4539b.C88098a;
import java.io.Serializable;
import java.util.ArrayList;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
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

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.d */
public final class C36864d extends C17372a implements AbstractC20527q {

    /* renamed from: h */
    public static final C36877m f86849h = new C36877m((byte) 0);

    /* renamed from: e */
    public ArrayList<User> f86850e;

    /* renamed from: f */
    public Aweme f86851f;

    /* renamed from: g */
    public AbstractC89171a<C89391z> f86852g;

    /* renamed from: i */
    private final C12814b f86853i;

    /* renamed from: j */
    private final AbstractC89244h f86854j;

    /* renamed from: k */
    private SparseArray f86855k;

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.d$f */
    public static final class C36870f extends AbstractC89220m implements AbstractC89172b<C36945f, C36945f> {
        public static final C36870f INSTANCE = new C36870f();

        static {
            Covode.recordClassIndex(44208);
        }

        public C36870f() {
            super(1);
        }

        public final C36945f invoke(C36945f fVar) {
            C89219l.m154719c(fVar, "");
            return fVar;
        }
    }

    static {
        Covode.recordClassIndex(44202);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: c */
    private FeedTaggedListViewModel m74506c() {
        return (FeedTaggedListViewModel) this.f86853i.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f86855k == null) {
            this.f86855k = new SparseArray();
        }
        View view = (View) this.f86855k.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f86855k.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    public final void bx_() {
        SparseArray sparseArray = this.f86855k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.d$b */
    public static final class C36866b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ Fragment f86857a;

        static {
            Covode.recordClassIndex(44204);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36866b(Fragment fragment) {
            super(0);
            this.f86857a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            return this.f86857a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.d$m */
    public static final class C36877m {
        static {
            Covode.recordClassIndex(44215);
        }

        private C36877m() {
        }

        public /* synthetic */ C36877m(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.d$o */
    static final class C36879o extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C36879o f86869a = new C36879o();

        static {
            Covode.recordClassIndex(44217);
        }

        C36879o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
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

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.d$g */
    public static final class C36871g extends AbstractC89220m implements AbstractC89171a<C12874b<C36945f>> {
        public static final C36871g INSTANCE = new C36871g();

        static {
            Covode.recordClassIndex(44209);
        }

        public C36871g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36945f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.d$l */
    public static final class C36876l extends AbstractC89220m implements AbstractC89171a<C12874b<C36945f>> {
        public static final C36876l INSTANCE = new C36876l();

        static {
            Covode.recordClassIndex(44214);
        }

        public C36876l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36945f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.d$n */
    public static final class C36878n implements AbstractC12779c {

        /* renamed from: a */
        public final Aweme f86865a;

        /* renamed from: b */
        public final ArrayList<User> f86866b;

        /* renamed from: c */
        public final String f86867c;

        /* renamed from: d */
        public final String f86868d;

        static {
            Covode.recordClassIndex(44216);
        }

        private /* synthetic */ C36878n() {
            this(null, null, "", "");
        }

        public C36878n(Aweme aweme, ArrayList<User> arrayList, String str, String str2) {
            this.f86865a = aweme;
            this.f86866b = arrayList;
            this.f86867c = str;
            this.f86868d = str2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.d$c */
    public static final class C36867c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f86858a;

        static {
            Covode.recordClassIndex(44205);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36867c(Fragment fragment) {
            super(0);
            this.f86858a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f86858a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.d$h */
    public static final class C36872h extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f86861a;

        static {
            Covode.recordClassIndex(44210);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36872h(Fragment fragment) {
            super(0);
            this.f86861a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f86861a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return requireActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.d$t */
    static final class C36887t extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C36864d f86879a;

        static {
            Covode.recordClassIndex(44225);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36887t(C36864d dVar) {
            super(0);
            this.f86879a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            C1175ad.AbstractC1177b a = C88098a.m153168a(C12777b.m23004b(this.f86879a));
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.d$a */
    public static final class C36865a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f86856a;

        static {
            Covode.recordClassIndex(44203);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36865a(AbstractC89277c cVar) {
            super(0);
            this.f86856a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f86856a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.d$d */
    public static final class C36868d extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f86859a;

        static {
            Covode.recordClassIndex(44206);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36868d(Fragment fragment) {
            super(0);
            this.f86859a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f86859a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f86859a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.d$e */
    public static final class C36869e extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f86860a;

        static {
            Covode.recordClassIndex(44207);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36869e(Fragment fragment) {
            super(0);
            this.f86860a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f86860a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f86860a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.d$i */
    public static final class C36873i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f86862a;

        static {
            Covode.recordClassIndex(44211);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36873i(Fragment fragment) {
            super(0);
            this.f86862a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f86862a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.d$j */
    public static final class C36874j extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f86863a;

        static {
            Covode.recordClassIndex(44212);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36874j(Fragment fragment) {
            super(0);
            this.f86863a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f86863a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f86863a.getActivity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.d$k */
    public static final class C36875k extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f86864a;

        static {
            Covode.recordClassIndex(44213);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36875k(Fragment fragment) {
            super(0);
            this.f86864a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f86864a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f86864a.getActivity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.d$s */
    static final class C36886s extends AbstractC89220m implements AbstractC89171a<SocialVideoTagShareVM> {

        /* renamed from: a */
        final /* synthetic */ C36864d f86878a;

        static {
            Covode.recordClassIndex(44224);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36886s(C36864d dVar) {
            super(0);
            this.f86878a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SocialVideoTagShareVM invoke() {
            SharedViewModelProvider sharedViewModelProvider = new SharedViewModelProvider();
            AbstractC1196i lifecycle = this.f86878a.getLifecycle();
            C89219l.m154716b(lifecycle, "");
            return sharedViewModelProvider.mo3981a(lifecycle, SocialVideoTagShareVM.class);
        }
    }

    public C36864d() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        C36887t tVar = new C36887t(this);
        AbstractC89277c a = C89204ab.m154669a(FeedTaggedListViewModel.class);
        C36865a aVar = new C36865a(a);
        C36870f fVar = C36870f.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C36871g.INSTANCE, new C36872h(this), new C36873i(this), tVar, fVar, new C36874j(this), new C36875k(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C36876l.INSTANCE, new C36866b(this), new C36867c(this), tVar, fVar, new C36868d(this), new C36869e(this));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.f86853i = bVar;
        this.f86854j = C89250i.m154773a((AbstractC89171a) new C36886s(this));
        this.f86852g = C36879o.f86869a;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (m74506c().f86902k) {
            m74506c().f86902k = false;
            SocialVideoTagShareVM socialVideoTagShareVM = (SocialVideoTagShareVM) this.f86854j.getValue();
            Aweme aweme = this.f86851f;
            if (aweme != null) {
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                String curUserId = g.getCurUserId();
                String aid = aweme.getAid();
                C89219l.m154716b(aid, "");
                VideoTagApi.C36850a.m74491a().tagUpdate("", "[" + curUserId + ']', Long.parseLong(aid)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143254a(new SocialVideoTagShareVM.C36903a(aweme, curUserId, socialVideoTagShareVM), SocialVideoTagShareVM.C36904b.f86913a);
            }
        }
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.d$p */
    static final class C36880p extends AbstractC89220m implements AbstractC89172b<BaseFragmentViewModel, C89391z> {

        /* renamed from: a */
        public static final C36880p f86870a = new C36880p();

        static {
            Covode.recordClassIndex(44218);
        }

        C36880p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            C89219l.m154721d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(C368811.f86871a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.d$r */
    static final class View$OnClickListenerC36885r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36864d f86877a;

        static {
            Covode.recordClassIndex(44223);
        }

        View$OnClickListenerC36885r(C36864d dVar) {
            this.f86877a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f86877a.f86852g.invoke();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo27716a(C36880p.f86870a);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.d$q */
    static final class C36882q extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C36864d f86872a;

        /* renamed from: b */
        final /* synthetic */ String f86873b;

        /* renamed from: c */
        final /* synthetic */ String f86874c;

        static {
            Covode.recordClassIndex(44220);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36882q(C36864d dVar, String str, String str2) {
            super(1);
            this.f86872a = dVar;
            this.f86873b = str;
            this.f86874c = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20576a(this.f86872a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) new AbstractC89172b<C12759i<AbstractC12779c>, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.comment.page.tag.C36864d.C36882q.C368831 */

                /* renamed from: a */
                final /* synthetic */ C36882q f86875a;

                static {
                    Covode.recordClassIndex(44221);
                }

                {
                    this.f86875a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12759i<AbstractC12779c> iVar) {
                    C12759i<AbstractC12779c> iVar2 = iVar;
                    C89219l.m154721d(iVar2, "");
                    iVar2.mo20617a(new C36878n(this.f86875a.f86872a.f86851f, this.f86875a.f86872a.f86850e, this.f86875a.f86873b, this.f86875a.f86874c));
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f86872a, C368842.f86876a);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        String str;
        String str2;
        String str3;
        String authorUid;
        String str4 = "";
        C89219l.m154721d(view, str4);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Serializable serializable2 = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("tagged_users");
        } else {
            serializable = null;
        }
        this.f86850e = (ArrayList) serializable;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable2 = arguments2.getSerializable("aweme");
        }
        this.f86851f = (Aweme) serializable2;
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (str = arguments3.getString("enter_from")) == null) {
            str = str4;
        }
        C89219l.m154716b(str, str4);
        Bundle arguments4 = getArguments();
        if (arguments4 == null || (str2 = arguments4.getString("anchor_type")) == null) {
            str2 = str4;
        }
        C89219l.m154716b(str2, str4);
        C12780d.m23005a(this, new C36882q(this, str, str2));
        ((TuxIconView) mo27715a(R.id.a6u)).setOnClickListener(new View$OnClickListenerC36885r(this));
        FeedTaggedListViewModel c = m74506c();
        C33744d a = new C33744d().mo59983a("enter_from", c.mo23342g().f86867c);
        Aweme aweme = c.mo23342g().f86865a;
        if (aweme == null || (str3 = aweme.getAid()) == null) {
            str3 = str4;
        }
        C33744d a2 = a.mo59983a("group_id", str3);
        Aweme aweme2 = c.mo23342g().f86865a;
        if (!(aweme2 == null || (authorUid = aweme2.getAuthorUid()) == null)) {
            str4 = authorUid;
        }
        C39162r.m79460a("show_in_this_video_bottom_sheet", a2.mo59983a("author_id", str4).mo59983a("anchor_type", c.mo23342g().f86868d).f79943a);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.ia, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
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
