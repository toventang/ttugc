package com.p2082ss.android.ugc.aweme.favorites.p2928ui;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1182af;
import com.C1764a;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.core.C12767q;
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
import com.bytedance.ies.foundation.fragment.C17372a;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.bytedance.tux.p1721g.C23144b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.favorites.api.C47196f;
import com.p2082ss.android.ugc.aweme.favorites.api.C47197g;
import com.p2082ss.android.ugc.aweme.favorites.model.C47481j;
import com.p2082ss.android.ugc.aweme.favorites.p2921c.C47350l;
import com.p2082ss.android.ugc.aweme.favorites.p2921c.C47379n;
import com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47662ah;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47799b;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47803e;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47804f;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel;
import com.p2082ss.android.ugc.aweme.metrics.C59243i;
import com.p2082ss.android.ugc.aweme.metrics.C59249n;
import com.p2082ss.android.ugc.trill.R;
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

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.af */
public final class C47633af extends C17372a implements AbstractC12846h, C47350l.AbstractC47371u, C47379n.AbstractC47416x {

    /* renamed from: e */
    private final C12814b f110490e;

    /* renamed from: f */
    private final AbstractC89244h f110491f;

    /* renamed from: g */
    private SparseArray f110492g;

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.af$g */
    public static final class C47640g extends AbstractC89220m implements AbstractC89172b<C47803e, C47803e> {
        public static final C47640g INSTANCE = new C47640g();

        static {
            Covode.recordClassIndex(56262);
        }

        public C47640g() {
            super(1);
        }

        public final C47803e invoke(C47803e eVar) {
            C89219l.m154719c(eVar, "");
            return eVar;
        }
    }

    static {
        Covode.recordClassIndex(56255);
    }

    /* renamed from: e */
    private final VideoCollectionListViewModel m90647e() {
        return (VideoCollectionListViewModel) this.f110490e.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f110492g == null) {
            this.f110492g = new SparseArray();
        }
        View view = (View) this.f110492g.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f110492g.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    public final void bx_() {
        SparseArray sparseArray = this.f110492g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: d */
    public final C88411a mo79792d() {
        return (C88411a) this.f110491f.getValue();
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

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.af$b */
    public static final class C47635b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110494a;

        static {
            Covode.recordClassIndex(56257);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47635b(Fragment fragment) {
            super(0);
            this.f110494a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            return this.f110494a;
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

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.af$d */
    public static final class C47637d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C47637d INSTANCE = new C47637d();

        static {
            Covode.recordClassIndex(56259);
        }

        public C47637d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.af$h */
    public static final class C47641h extends AbstractC89220m implements AbstractC89171a<C12874b<C47803e>> {
        public static final C47641h INSTANCE = new C47641h();

        static {
            Covode.recordClassIndex(56263);
        }

        public C47641h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47803e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.af$k */
    public static final class C47644k extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C47644k INSTANCE = new C47644k();

        static {
            Covode.recordClassIndex(56266);
        }

        public C47644k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.af$n */
    public static final class C47647n extends AbstractC89220m implements AbstractC89171a<C12874b<C47803e>> {
        public static final C47647n INSTANCE = new C47647n();

        static {
            Covode.recordClassIndex(56269);
        }

        public C47647n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47803e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.af$o */
    static final class C47648o extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C47648o f110502a = new C47648o();

        static {
            Covode.recordClassIndex(56270);
        }

        C47648o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.af$c */
    public static final class C47636c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110495a;

        static {
            Covode.recordClassIndex(56258);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47636c(Fragment fragment) {
            super(0);
            this.f110495a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f110495a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.af$i */
    public static final class C47642i extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110498a;

        static {
            Covode.recordClassIndex(56264);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47642i(Fragment fragment) {
            super(0);
            this.f110498a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f110498a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return requireActivity;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.favorites.p2921c.C47350l.AbstractC47371u
    /* renamed from: c */
    public final void mo64296c() {
        m90647e().mo79857a(true);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        mo79792d().mo142944a();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.af$a */
    public static final class C47634a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f110493a;

        static {
            Covode.recordClassIndex(56256);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47634a(AbstractC89277c cVar) {
            super(0);
            this.f110493a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f110493a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.af$e */
    public static final class C47638e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110496a;

        static {
            Covode.recordClassIndex(56260);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47638e(Fragment fragment) {
            super(0);
            this.f110496a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f110496a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f110496a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.af$f */
    public static final class C47639f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110497a;

        static {
            Covode.recordClassIndex(56261);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47639f(Fragment fragment) {
            super(0);
            this.f110497a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f110497a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f110497a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.af$j */
    public static final class C47643j extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110499a;

        static {
            Covode.recordClassIndex(56265);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47643j(Fragment fragment) {
            super(0);
            this.f110499a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f110499a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.af$l */
    public static final class C47645l extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110500a;

        static {
            Covode.recordClassIndex(56267);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47645l(Fragment fragment) {
            super(0);
            this.f110500a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f110500a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f110500a.getActivity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.af$m */
    public static final class C47646m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110501a;

        static {
            Covode.recordClassIndex(56268);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47646m(Fragment fragment) {
            super(0);
            this.f110501a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f110501a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f110501a.getActivity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.af$q */
    static final class C47652q extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C47633af f110509a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f110510b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f110511c;

        static {
            Covode.recordClassIndex(56274);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47652q(C47633af afVar, ActivityC0945e eVar, AbstractC89172b bVar) {
            super(0);
            this.f110509a = afVar;
            this.f110510b = eVar;
            this.f110511c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC0952i supportFragmentManager = this.f110510b.getSupportFragmentManager();
            C89219l.m154716b(supportFragmentManager, "");
            String string = this.f110509a.requireContext().getString(R.string.bsl);
            C89219l.m154716b(string, "");
            String string2 = this.f110509a.requireContext().getString(R.string.dfa);
            C89219l.m154716b(string2, "");
            C47662ah.C47663a.m90668a(supportFragmentManager, string, string2, new C47662ah.AbstractC47664b(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47633af.C47652q.C476531 */

                /* renamed from: a */
                final /* synthetic */ C47652q f110512a;

                static {
                    Covode.recordClassIndex(56275);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f110512a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47662ah.AbstractC47664b
                /* renamed from: a */
                public final void mo79777a(String str) {
                    C89219l.m154721d(str, "");
                    this.f110512a.f110511c.invoke(str);
                }
            });
            return C89391z.f203057a;
        }
    }

    public C47633af() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(VideoCollectionListViewModel.class);
        C47634a aVar = new C47634a(a);
        C47640g gVar = C47640g.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C47641h.INSTANCE, new C47642i(this), new C47643j(this), C47644k.INSTANCE, gVar, new C47645l(this), new C47646m(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C47647n.INSTANCE, new C47635b(this), new C47636c(this), C47637d.INSTANCE, gVar, new C47638e(this), new C47639f(this));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.f110490e = bVar;
        this.f110491f = C89250i.m154773a((AbstractC89171a) C47648o.f110502a);
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2921c.C47379n.AbstractC47416x
    /* renamed from: a */
    public final void mo79699a() {
        new C59249n().mo96820a("collection_video").mo96792f();
        ActivityC0945e requireActivity = requireActivity();
        C89219l.m154716b(requireActivity, "");
        new C47652q(this, requireActivity, new C47649p(this, requireActivity)).invoke();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C47196f a = C47804f.m90816a("COLLECTION_LIST");
        if (a != null) {
            if (a.f109854a == 2) {
                ActivityC0945e requireActivity = requireActivity();
                C89219l.m154716b(requireActivity, "");
                new C23144b(requireActivity).mo37640e(R.string.bt6).mo37637b();
            }
            if (a.f109854a == 1) {
                ActivityC0945e requireActivity2 = requireActivity();
                C89219l.m154716b(requireActivity2, "");
                new C23144b(requireActivity2).mo37640e(R.string.bsy).mo37636b(R.raw.icon_tick_fill_small).mo37639d(R.attr.aw).mo37637b();
            }
            if (a.f109854a == 10) {
                VideoCollectionListViewModel e = m90647e();
                C47654r rVar = new C47654r(a, this);
                C89219l.m154721d(e, "");
                C89219l.m154721d(rVar, "");
                AbstractC12846h.C12847a.m23091a(e, rVar);
            }
            m90647e().mo79857a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.af$s */
    static final class C47655s extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C47633af f110515a;

        /* renamed from: b */
        final /* synthetic */ View f110516b;

        static {
            Covode.recordClassIndex(56277);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47655s(C47633af afVar, View view) {
            super(1);
            this.f110515a = afVar;
            this.f110516b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20582b(this.f110515a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47633af.C47655s.C476561 */

                /* renamed from: a */
                final /* synthetic */ C47655s f110517a;

                static {
                    Covode.recordClassIndex(56278);
                }

                {
                    this.f110517a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.f31053e = this.f110517a.f110516b.findViewById(R.id.a7r);
                    qVar2.mo20632a(C89204ab.m154669a(C47379n.class));
                    qVar2.f31050b = new C47379n();
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f110515a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47633af.C47655s.C476572 */

                /* renamed from: a */
                final /* synthetic */ C47655s f110518a;

                static {
                    Covode.recordClassIndex(56279);
                }

                {
                    this.f110518a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.f31053e = this.f110518a.f110516b.findViewById(R.id.e7i);
                    qVar2.mo20632a(C89204ab.m154669a(C47350l.class));
                    qVar2.f31050b = new C47350l();
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.af$p */
    static final class C47649p extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C47633af f110503a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f110504b;

        static {
            Covode.recordClassIndex(56271);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47649p(C47633af afVar, ActivityC0945e eVar) {
            super(1);
            this.f110503a = afVar;
            this.f110504b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            final String str2 = str;
            C89219l.m154721d(str2, "");
            final C47196f fVar = new C47196f(1, null, str2, null, null, null, null, null, 250);
            AbstractC88412b a = new C47481j().f110302b.mo79755a(fVar).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47633af.C47649p.C476501 */

                /* renamed from: a */
                final /* synthetic */ C47649p f110505a;

                static {
                    Covode.recordClassIndex(56272);
                }

                {
                    this.f110505a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    new C59243i().mo96812a("collection_video").mo96811a((Integer) 1).mo96792f();
                    String str = ((C47197g) obj).f109862a;
                    if (str == null) {
                        str = "";
                    }
                    SmartRouter.buildRoute(this.f110505a.f110504b, "aweme://favorite/videos/collections/add/video").withParam("collectionId", str).withParam("collectionName", str2).withParam("from", "COLLECTION_LIST").open();
                    C47804f.m90817a("COLLECTION_LIST", fVar);
                }
            }, new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47633af.C47649p.C476512 */

                /* renamed from: a */
                final /* synthetic */ C47649p f110508a;

                static {
                    Covode.recordClassIndex(56273);
                }

                {
                    this.f110508a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    new C23144b(this.f110508a.f110504b).mo37640e(R.string.bof).mo37637b();
                }
            });
            C89219l.m154716b(a, "");
            C88934a.m154195a(a, this.f110503a.mo79792d());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.af$r */
    static final class C47654r extends AbstractC89220m implements AbstractC89172b<C47803e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C47196f f110513a;

        /* renamed from: b */
        final /* synthetic */ C47633af f110514b;

        static {
            Covode.recordClassIndex(56276);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47654r(C47196f fVar, C47633af afVar) {
            super(1);
            this.f110513a = fVar;
            this.f110514b = afVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C47803e eVar) {
            Integer num;
            long j;
            C47803e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            SmartRoute withParam = SmartRouter.buildRoute(this.f110514b.getContext(), "aweme://favorite/videos/collections/content").withParam(StringSet.name, this.f110513a.f109856c);
            List<C47799b> a = eVar2.f110754a.mo20635a();
            Integer num2 = null;
            if (a != null) {
                int i = 0;
                if (!(a instanceof Collection) || !a.isEmpty()) {
                    Iterator<T> it = a.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if (it.next().f110749b == 2 && (i = i + 1) < 0) {
                            C89070n.m154523b();
                        }
                    }
                }
                num = Integer.valueOf(i);
            } else {
                num = null;
            }
            SmartRoute withParam2 = withParam.withParam("collectionCount", num).withParam("id", this.f110513a.f109855b);
            List<String> list = this.f110513a.f109859f;
            if (list != null) {
                num2 = Integer.valueOf(list.size());
            }
            SmartRoute withParam3 = withParam2.withParam("showAddVideosCount", num2).withParam("state", 1);
            List<String> list2 = this.f110513a.f109859f;
            if (list2 != null) {
                j = (long) list2.size();
            } else {
                j = 0;
            }
            withParam3.withParam("total", j).open();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C47804f.f110757a.clear();
        C12780d.m23005a(this, new C47655s(this, view));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.mm, viewGroup, false);
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
