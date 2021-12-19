package com.p2082ss.android.ugc.aweme.relation.recommend;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.C1764a;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.core.C12759i;
import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.relation.viewmodel.C67100b;
import com.p2082ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel;
import com.p2082ss.android.ugc.trill.R;
import dagger.hilt.android.internal.p4539b.C88098a;
import java.io.Serializable;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.relation.recommend.g */
public final class C66937g extends AbstractC66934d {

    /* renamed from: d */
    public static final C66950m f150236d = new C66950m((byte) 0);

    /* renamed from: a */
    public C66994m f150237a;

    /* renamed from: b */
    public String f150238b;

    /* renamed from: c */
    public String f150239c;

    /* renamed from: e */
    private final C12814b f150240e;

    /* renamed from: j */
    private final AbstractC89244h f150241j;

    /* renamed from: k */
    private SparseArray f150242k;

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.g$f */
    public static final class C66943f extends AbstractC89220m implements AbstractC89172b<C67100b, C67100b> {
        public static final C66943f INSTANCE = new C66943f();

        static {
            Covode.recordClassIndex(78520);
        }

        public C66943f() {
            super(1);
        }

        public final C67100b invoke(C67100b bVar) {
            C89219l.m154719c(bVar, "");
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(78514);
    }

    /* renamed from: a */
    private final RecFriendsListViewModel m118680a() {
        return (RecFriendsListViewModel) this.f150240e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.g$b */
    public static final class C66939b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ Fragment f150244a;

        static {
            Covode.recordClassIndex(78516);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66939b(Fragment fragment) {
            super(0);
            this.f150244a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            return this.f150244a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.g$m */
    public static final class C66950m {
        static {
            Covode.recordClassIndex(78527);
        }

        private C66950m() {
        }

        public /* synthetic */ C66950m(byte b) {
            this();
        }

        /* renamed from: a */
        public static C66937g m118681a(C66994m mVar, String str, String str2) {
            C89219l.m154721d(mVar, "");
            C66937g gVar = new C66937g();
            Bundle bundle = new Bundle();
            bundle.putSerializable("recommendFriendsConfig", mVar);
            bundle.putString("platforms", str);
            bundle.putString("skip_platforms", str2);
            gVar.setArguments(bundle);
            return gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.g$g */
    public static final class C66944g extends AbstractC89220m implements AbstractC89171a<C12874b<C67100b>> {
        public static final C66944g INSTANCE = new C66944g();

        static {
            Covode.recordClassIndex(78521);
        }

        public C66944g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C67100b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.g$l */
    public static final class C66949l extends AbstractC89220m implements AbstractC89171a<C12874b<C67100b>> {
        public static final C66949l INSTANCE = new C66949l();

        static {
            Covode.recordClassIndex(78526);
        }

        public C66949l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C67100b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.g$c */
    public static final class C66940c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f150245a;

        static {
            Covode.recordClassIndex(78517);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66940c(Fragment fragment) {
            super(0);
            this.f150245a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f150245a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.g$h */
    public static final class C66945h extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f150248a;

        static {
            Covode.recordClassIndex(78522);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66945h(Fragment fragment) {
            super(0);
            this.f150248a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f150248a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return requireActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.g$o */
    static final class C66954o extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C66954o f150255a = new C66954o();

        static {
            Covode.recordClassIndex(78531);
        }

        C66954o() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            return g.getCurUserId();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.g$p */
    static final class C66955p extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C66937g f150256a;

        static {
            Covode.recordClassIndex(78532);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66955p(C66937g gVar) {
            super(0);
            this.f150256a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            C1175ad.AbstractC1177b a = C88098a.m153168a(this.f150256a.getActivity());
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f150242k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.g$a */
    public static final class C66938a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f150243a;

        static {
            Covode.recordClassIndex(78515);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66938a(AbstractC89277c cVar) {
            super(0);
            this.f150243a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f150243a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.g$d */
    public static final class C66941d extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f150246a;

        static {
            Covode.recordClassIndex(78518);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66941d(Fragment fragment) {
            super(0);
            this.f150246a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f150246a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f150246a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.g$e */
    public static final class C66942e extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f150247a;

        static {
            Covode.recordClassIndex(78519);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66942e(Fragment fragment) {
            super(0);
            this.f150247a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f150247a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f150247a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.g$i */
    public static final class C66946i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f150249a;

        static {
            Covode.recordClassIndex(78523);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66946i(Fragment fragment) {
            super(0);
            this.f150249a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f150249a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.g$j */
    public static final class C66947j extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f150250a;

        static {
            Covode.recordClassIndex(78524);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66947j(Fragment fragment) {
            super(0);
            this.f150250a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f150250a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f150250a.getActivity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.g$k */
    public static final class C66948k extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f150251a;

        static {
            Covode.recordClassIndex(78525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66948k(Fragment fragment) {
            super(0);
            this.f150251a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f150251a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f150251a.getActivity());
        }
    }

    public C66937g() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        C66955p pVar = new C66955p(this);
        AbstractC89277c a = C89204ab.m154669a(RecFriendsListViewModel.class);
        C66938a aVar = new C66938a(a);
        C66943f fVar = C66943f.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C66944g.INSTANCE, new C66945h(this), new C66946i(this), pVar, fVar, new C66947j(this), new C66948k(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C66949l.INSTANCE, new C66939b(this), new C66940c(this), pVar, fVar, new C66941d(this), new C66942e(this));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.f150240e = bVar;
        this.f150241j = C89250i.m154773a((AbstractC89171a) C66954o.f150255a);
        this.f150238b = "";
        this.f150239c = "";
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.g$n */
    static final class C66951n extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66937g f150252a;

        static {
            Covode.recordClassIndex(78528);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66951n(C66937g gVar) {
            super(1);
            this.f150252a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20576a(this.f150252a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) new AbstractC89172b<C12759i<AbstractC12779c>, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.relation.recommend.C66937g.C66951n.C669521 */

                /* renamed from: a */
                final /* synthetic */ C66951n f150253a;

                static {
                    Covode.recordClassIndex(78529);
                }

                {
                    this.f150253a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12759i<AbstractC12779c> iVar) {
                    C12759i<AbstractC12779c> iVar2 = iVar;
                    C89219l.m154721d(iVar2, "");
                    C66994m mVar = this.f150253a.f150252a.f150237a;
                    if (mVar == null) {
                        C89219l.m154710a("config");
                    }
                    iVar2.mo20617a(new C66936f(mVar, this.f150253a.f150252a.f150238b, this.f150253a.f150252a.f150239c));
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f150252a, C669532.f150254a);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        String str = "";
        C89219l.m154721d(view, str);
        super.onViewCreated(view, bundle);
        String str2 = (String) this.f150241j.getValue();
        if (str2 == null || str2.length() == 0) {
            m118680a();
            RecFriendsListViewModel.m118727a(getActivity());
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("recommendFriendsConfig");
            if (!(serializable instanceof C66994m)) {
                serializable = null;
            }
            C66994m mVar = (C66994m) serializable;
            if (mVar == null) {
                m118680a();
                RecFriendsListViewModel.m118727a(getActivity());
                return;
            }
            this.f150237a = mVar;
            String string = arguments.getString("platforms");
            if (string == null) {
                string = str;
            }
            this.f150238b = string;
            String string2 = arguments.getString("skip_platforms");
            if (string2 != null) {
                str = string2;
            }
            this.f150239c = str;
        }
        C12780d.m23005a(this, new C66951n(this));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a27, viewGroup, false);
    }
}
