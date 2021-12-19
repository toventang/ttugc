package com.p2082ss.android.ugc.aweme.feed.adapter;

import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1182af;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlaySearchViewModel */
public final class VideoPlaySearchViewModel extends AssemViewModel<C48199bb> {

    /* renamed from: j */
    public static final C48066a f111344j = new C48066a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlaySearchViewModel$a */
    public static final class C48066a {

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlaySearchViewModel$a$g */
        public static final class C48073g extends AbstractC89220m implements AbstractC89172b<C48199bb, C48199bb> {
            public static final C48073g INSTANCE = new C48073g();

            static {
                Covode.recordClassIndex(56811);
            }

            public C48073g() {
                super(1);
            }

            public final C48199bb invoke(C48199bb bbVar) {
                C89219l.m154719c(bbVar, "");
                return bbVar;
            }
        }

        static {
            Covode.recordClassIndex(56804);
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlaySearchViewModel$a$b */
        public static final class C48068b extends AbstractC89220m implements AbstractC89171a<Fragment> {

            /* renamed from: a */
            final /* synthetic */ Fragment f111346a;

            static {
                Covode.recordClassIndex(56806);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C48068b(Fragment fragment) {
                super(0);
                this.f111346a = fragment;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final Fragment invoke() {
                return this.f111346a;
            }
        }

        private C48066a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlaySearchViewModel$a$d */
        public static final class C48070d extends AbstractC89220m implements AbstractC89171a<C12815c> {
            public static final C48070d INSTANCE = new C48070d();

            static {
                Covode.recordClassIndex(56808);
            }

            public C48070d() {
                super(0);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12815c invoke() {
                return new C12815c();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlaySearchViewModel$a$h */
        public static final class C48074h extends AbstractC89220m implements AbstractC89171a<C12874b<C48199bb>> {
            public static final C48074h INSTANCE = new C48074h();

            static {
                Covode.recordClassIndex(56812);
            }

            public C48074h() {
                super(0);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12874b<C48199bb> invoke() {
                return new C12874b<>();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlaySearchViewModel$a$k */
        public static final class C48077k extends AbstractC89220m implements AbstractC89171a<C12815c> {
            public static final C48077k INSTANCE = new C48077k();

            static {
                Covode.recordClassIndex(56815);
            }

            public C48077k() {
                super(0);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12815c invoke() {
                return new C12815c();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlaySearchViewModel$a$n */
        public static final class C48080n extends AbstractC89220m implements AbstractC89171a<C12874b<C48199bb>> {
            public static final C48080n INSTANCE = new C48080n();

            static {
                Covode.recordClassIndex(56818);
            }

            public C48080n() {
                super(0);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12874b<C48199bb> invoke() {
                return new C12874b<>();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlaySearchViewModel$a$c */
        public static final class C48069c extends AbstractC89220m implements AbstractC89171a<C1182af> {

            /* renamed from: a */
            final /* synthetic */ Fragment f111347a;

            static {
                Covode.recordClassIndex(56807);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C48069c(Fragment fragment) {
                super(0);
                this.f111347a = fragment;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C1182af invoke() {
                C1182af viewModelStore = this.f111347a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlaySearchViewModel$a$i */
        public static final class C48075i extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

            /* renamed from: a */
            final /* synthetic */ Fragment f111350a;

            static {
                Covode.recordClassIndex(56813);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C48075i(Fragment fragment) {
                super(0);
                this.f111350a = fragment;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final ActivityC0945e invoke() {
                ActivityC0945e requireActivity = this.f111350a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return requireActivity;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlaySearchViewModel$a$a */
        public static final class C48067a extends AbstractC89220m implements AbstractC89171a<String> {

            /* renamed from: a */
            final /* synthetic */ AbstractC89277c f111345a;

            static {
                Covode.recordClassIndex(56805);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C48067a(AbstractC89277c cVar) {
                super(0);
                this.f111345a = cVar;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final String invoke() {
                return "assem_" + C89170a.m154665a(this.f111345a).getName();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlaySearchViewModel$a$e */
        public static final class C48071e extends AbstractC89220m implements AbstractC89171a<C12752d> {

            /* renamed from: a */
            final /* synthetic */ Fragment f111348a;

            static {
                Covode.recordClassIndex(56809);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C48071e(Fragment fragment) {
                super(0);
                this.f111348a = fragment;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12752d invoke() {
                ActivityC0945e requireActivity = this.f111348a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f111348a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlaySearchViewModel$a$f */
        public static final class C48072f extends AbstractC89220m implements AbstractC89171a<C12753e> {

            /* renamed from: a */
            final /* synthetic */ Fragment f111349a;

            static {
                Covode.recordClassIndex(56810);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C48072f(Fragment fragment) {
                super(0);
                this.f111349a = fragment;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12753e invoke() {
                ActivityC0945e requireActivity = this.f111349a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f111349a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlaySearchViewModel$a$j */
        public static final class C48076j extends AbstractC89220m implements AbstractC89171a<C1182af> {

            /* renamed from: a */
            final /* synthetic */ Fragment f111351a;

            static {
                Covode.recordClassIndex(56814);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C48076j(Fragment fragment) {
                super(0);
                this.f111351a = fragment;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C1182af invoke() {
                ActivityC0945e requireActivity = this.f111351a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                C1182af viewModelStore = requireActivity.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlaySearchViewModel$a$l */
        public static final class C48078l extends AbstractC89220m implements AbstractC89171a<C12752d> {

            /* renamed from: a */
            final /* synthetic */ Fragment f111352a;

            static {
                Covode.recordClassIndex(56816);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C48078l(Fragment fragment) {
                super(0);
                this.f111352a = fragment;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12752d invoke() {
                ActivityC0945e requireActivity = this.f111352a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f111352a.getActivity());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlaySearchViewModel$a$m */
        public static final class C48079m extends AbstractC89220m implements AbstractC89171a<C12753e> {

            /* renamed from: a */
            final /* synthetic */ Fragment f111353a;

            static {
                Covode.recordClassIndex(56817);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C48079m(Fragment fragment) {
                super(0);
                this.f111353a = fragment;
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final C12753e invoke() {
                ActivityC0945e requireActivity = this.f111353a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f111353a.getActivity());
            }
        }

        public /* synthetic */ C48066a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(56803);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C48199bb mo20674f() {
        return new C48199bb();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoPlaySearchViewModel$b */
    static final class C48081b extends AbstractC89220m implements AbstractC89172b<C48199bb, C48199bb> {

        /* renamed from: a */
        public static final C48081b f111354a = new C48081b();

        static {
            Covode.recordClassIndex(56819);
        }

        C48081b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48199bb invoke(C48199bb bbVar) {
            C89219l.m154721d(bbVar, "");
            return new C48199bb(new C12776a(C89391z.f203057a));
        }
    }
}
