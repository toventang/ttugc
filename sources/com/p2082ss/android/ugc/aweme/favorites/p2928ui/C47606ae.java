package com.p2082ss.android.ugc.aweme.favorites.p2928ui;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1182af;
import com.C1764a;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.core.C12759i;
import com.bytedance.assem.arch.core.C12767q;
import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
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
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.favorites.api.C47196f;
import com.p2082ss.android.ugc.aweme.favorites.model.C47481j;
import com.p2082ss.android.ugc.aweme.favorites.p2921c.C47314j;
import com.p2082ss.android.ugc.aweme.favorites.p2921c.C47350l;
import com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47662ah;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.C47803e;
import com.p2082ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionListViewModel;
import com.p2082ss.android.ugc.aweme.metrics.C59249n;
import com.p2082ss.android.ugc.trill.R;
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

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.ae */
public final class C47606ae extends Fragment implements AbstractC20527q, C47314j.AbstractC47347y, C47350l.AbstractC47371u {

    /* renamed from: b */
    public static final C47607a f110461b = new C47607a((byte) 0);

    /* renamed from: a */
    public AbstractC47729o f110462a;

    /* renamed from: c */
    private final AbstractC89244h f110463c = C89250i.m154773a((AbstractC89171a) C47608b.f110465a);

    /* renamed from: d */
    private SparseArray f110464d;

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ae$i */
    public static final class C47615i extends AbstractC89220m implements AbstractC89172b<C47803e, C47803e> {
        public static final C47615i INSTANCE = new C47615i();

        static {
            Covode.recordClassIndex(56237);
        }

        public C47615i() {
            super(1);
        }

        public final C47803e invoke(C47803e eVar) {
            C89219l.m154719c(eVar, "");
            return eVar;
        }
    }

    static {
        Covode.recordClassIndex(56228);
    }

    /* renamed from: b */
    public final C88411a mo79789b() {
        return (C88411a) this.f110463c.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ae$a */
    public static final class C47607a {
        static {
            Covode.recordClassIndex(56229);
        }

        private C47607a() {
        }

        public /* synthetic */ C47607a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m90645a(ActivityC0945e eVar, boolean z, String str, String str2, int i, AbstractC47729o oVar) {
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(oVar, "");
            C47606ae aeVar = new C47606ae();
            aeVar.mo79788a(oVar);
            Bundle bundle = new Bundle();
            bundle.putString("excludeId", str);
            bundle.putString("enterFrom", str2);
            bundle.putBoolean("moveToCollection", z);
            bundle.putInt("firstPageCount", i);
            aeVar.setArguments(bundle);
            new C23226a.C23227a().mo37812a(0).mo37817a(aeVar).mo37822b(false).f55057a.show(eVar.getSupportFragmentManager(), "VideoCollectionChooseCollection");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ae$d */
    public static final class C47610d extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110467a;

        static {
            Covode.recordClassIndex(56232);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47610d(Fragment fragment) {
            super(0);
            this.f110467a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            return this.f110467a;
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

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ae$b */
    static final class C47608b extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C47608b f110465a = new C47608b();

        static {
            Covode.recordClassIndex(56230);
        }

        C47608b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ae$f */
    public static final class C47612f extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C47612f INSTANCE = new C47612f();

        static {
            Covode.recordClassIndex(56234);
        }

        public C47612f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ae$j */
    public static final class C47616j extends AbstractC89220m implements AbstractC89171a<C12874b<C47803e>> {
        public static final C47616j INSTANCE = new C47616j();

        static {
            Covode.recordClassIndex(56238);
        }

        public C47616j() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47803e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ae$m */
    public static final class C47619m extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C47619m INSTANCE = new C47619m();

        static {
            Covode.recordClassIndex(56241);
        }

        public C47619m() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ae$p */
    public static final class C47622p extends AbstractC89220m implements AbstractC89171a<C12874b<C47803e>> {
        public static final C47622p INSTANCE = new C47622p();

        static {
            Covode.recordClassIndex(56244);
        }

        public C47622p() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C47803e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ae$e */
    public static final class C47611e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110468a;

        static {
            Covode.recordClassIndex(56233);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47611e(Fragment fragment) {
            super(0);
            this.f110468a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            C1182af viewModelStore = this.f110468a.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ae$k */
    public static final class C47617k extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110471a;

        static {
            Covode.recordClassIndex(56239);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47617k(Fragment fragment) {
            super(0);
            this.f110471a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f110471a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return requireActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ae$c */
    public static final class C47609c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f110466a;

        static {
            Covode.recordClassIndex(56231);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47609c(AbstractC89277c cVar) {
            super(0);
            this.f110466a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f110466a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ae$g */
    public static final class C47613g extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110469a;

        static {
            Covode.recordClassIndex(56235);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47613g(Fragment fragment) {
            super(0);
            this.f110469a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f110469a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f110469a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ae$h */
    public static final class C47614h extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110470a;

        static {
            Covode.recordClassIndex(56236);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47614h(Fragment fragment) {
            super(0);
            this.f110470a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f110470a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f110470a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ae$l */
    public static final class C47618l extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110472a;

        static {
            Covode.recordClassIndex(56240);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47618l(Fragment fragment) {
            super(0);
            this.f110472a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f110472a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ae$n */
    public static final class C47620n extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110473a;

        static {
            Covode.recordClassIndex(56242);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47620n(Fragment fragment) {
            super(0);
            this.f110473a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e requireActivity = this.f110473a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20583b(this.f110473a.getActivity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ae$o */
    public static final class C47621o extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f110474a;

        static {
            Covode.recordClassIndex(56243);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47621o(Fragment fragment) {
            super(0);
            this.f110474a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e requireActivity = this.f110474a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return Assembler.C12747a.m22936a(requireActivity).mo20584c(this.f110474a.getActivity());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        mo79789b().mo142944a();
        SparseArray sparseArray = this.f110464d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2921c.C47314j.AbstractC47347y
    /* renamed from: a */
    public final void mo79690a() {
        String str;
        C59249n nVar = new C59249n();
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("enterFrom");
        } else {
            str = null;
        }
        nVar.mo96820a(str).mo96792f();
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            C89219l.m154716b(activity, "");
            new C47626r(this, new C47623q(this, activity)).invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ae$r */
    static final class C47626r extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C47606ae f110480a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f110481b;

        static {
            Covode.recordClassIndex(56248);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47626r(C47606ae aeVar, AbstractC89172b bVar) {
            super(0);
            this.f110480a = aeVar;
            this.f110481b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String string = this.f110480a.requireContext().getString(R.string.bsl);
            C89219l.m154716b(string, "");
            String string2 = this.f110480a.requireContext().getString(R.string.fdd);
            C89219l.m154716b(string2, "");
            C47662ah a = C47662ah.C47663a.m90667a(string, (String) null, string2, false, (C47662ah.AbstractC47664b) new C47627a(this));
            C47606ae aeVar = this.f110480a;
            C89219l.m154719c(aeVar, "");
            C89219l.m154719c(a, "");
            C23226a c = C23226a.C23228b.m43792c(aeVar);
            if (c != null) {
                c.mo37809a(a);
            }
            return C89391z.f203057a;
        }

        /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ae$r$a */
        public static final class C47627a implements C47662ah.AbstractC47664b {

            /* renamed from: a */
            final /* synthetic */ C47626r f110482a;

            static {
                Covode.recordClassIndex(56249);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C47627a(C47626r rVar) {
                this.f110482a = rVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47662ah.AbstractC47664b
            /* renamed from: a */
            public final void mo79777a(String str) {
                C89219l.m154721d(str, "");
                this.f110482a.f110481b.invoke(str);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2921c.C47350l.AbstractC47371u
    /* renamed from: c */
    public final void mo79693c() {
        C12814b bVar;
        String str;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(VideoCollectionListViewModel.class);
        C47609c cVar = new C47609c(a);
        C47615i iVar = C47615i.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, cVar, C47616j.INSTANCE, new C47617k(this), new C47618l(this), C47619m.INSTANCE, iVar, new C47620n(this), new C47621o(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, cVar, C47622p.INSTANCE, new C47610d(this), new C47611e(this), C47612f.INSTANCE, iVar, new C47613g(this), new C47614h(this));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        VideoCollectionListViewModel videoCollectionListViewModel = (VideoCollectionListViewModel) bVar.getValue();
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("excludeId");
        } else {
            str = null;
        }
        videoCollectionListViewModel.mo79858a(true, str);
    }

    /* renamed from: a */
    public final void mo79788a(AbstractC47729o oVar) {
        C89219l.m154721d(oVar, "");
        this.f110462a = oVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ae$s */
    static final class View$OnClickListenerC47628s implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47606ae f110483a;

        static {
            Covode.recordClassIndex(56250);
        }

        View$OnClickListenerC47628s(C47606ae aeVar) {
            this.f110483a = aeVar;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        public final void onClick(android.view.View r2) {
            /*
                r1 = this;
                com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent.onClick(r2)
                com.ss.android.ugc.aweme.favorites.ui.ae r0 = r1.f110483a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47606ae.View$OnClickListenerC47628s.onClick(android.view.View):void");
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    @Override // com.p2082ss.android.ugc.aweme.favorites.p2921c.C47314j.AbstractC47347y
    /* renamed from: a */
    public final void mo79691a(com.p2082ss.android.ugc.aweme.favorites.api.C47192d r3) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r0)
            com.ss.android.ugc.aweme.favorites.ui.o r1 = r2.f110462a
            if (r1 == 0) goto L_0x000d
            r0 = 0
            r1.mo79775a(r0, r3)
        L_0x000d:
            r0 = r2
            com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47606ae.mo79691a(com.ss.android.ugc.aweme.favorites.api.d):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ae$t */
    static final class C47629t extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C47606ae f110484a;

        /* renamed from: b */
        final /* synthetic */ boolean f110485b;

        /* renamed from: c */
        final /* synthetic */ View f110486c;

        static {
            Covode.recordClassIndex(56251);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47629t(C47606ae aeVar, boolean z, View view) {
            super(1);
            this.f110484a = aeVar;
            this.f110485b = z;
            this.f110486c = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20576a(this.f110484a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) new AbstractC89172b<C12759i<AbstractC12779c>, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47606ae.C47629t.C476301 */

                /* renamed from: a */
                final /* synthetic */ C47629t f110487a;

                static {
                    Covode.recordClassIndex(56252);
                }

                {
                    this.f110487a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12759i<AbstractC12779c> iVar) {
                    String str;
                    C12759i<AbstractC12779c> iVar2 = iVar;
                    C89219l.m154721d(iVar2, "");
                    boolean z = this.f110487a.f110485b;
                    Bundle arguments = this.f110487a.f110484a.getArguments();
                    if (arguments != null) {
                        str = arguments.getString("excludeId");
                    } else {
                        str = null;
                    }
                    iVar2.mo20617a(new C47314j.C47344w(z, str));
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f110484a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47606ae.C47629t.C476312 */

                /* renamed from: a */
                final /* synthetic */ C47629t f110488a;

                static {
                    Covode.recordClassIndex(56253);
                }

                {
                    this.f110488a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.f31053e = this.f110488a.f110486c.findViewById(R.id.a7r);
                    qVar2.mo20632a(C89204ab.m154669a(C47314j.class));
                    qVar2.f31050b = new C47314j();
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f110484a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47606ae.C47629t.C476323 */

                /* renamed from: a */
                final /* synthetic */ C47629t f110489a;

                static {
                    Covode.recordClassIndex(56254);
                }

                {
                    this.f110489a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.f31053e = this.f110489a.f110486c.findViewById(R.id.e7i);
                    qVar2.mo20632a(C89204ab.m154669a(C47350l.class));
                    qVar2.f31050b = new C47350l();
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ae$q */
    static final class C47623q extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C47606ae f110475a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f110476b;

        static {
            Covode.recordClassIndex(56245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47623q(C47606ae aeVar, ActivityC0945e eVar) {
            super(1);
            this.f110475a = aeVar;
            this.f110476b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            final String str2 = str;
            C89219l.m154721d(str2, "");
            AbstractC88412b a = new C47481j().f110302b.mo79755a(new C47196f(1, null, str2, null, null, null, null, null, 250)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47606ae.C47623q.C476241 */

                /* renamed from: a */
                final /* synthetic */ C47623q f110477a;

                static {
                    Covode.recordClassIndex(56246);
                }

                {
                    this.f110477a = r1;
                }

                /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                    java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
                    	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                    	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                    	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                    	at java.base/java.util.Objects.checkIndex(Objects.java:359)
                    	at java.base/java.util.ArrayList.get(ArrayList.java:427)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                    	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                    */
                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(java.lang.Object r9) {
                    /*
                        r8 = this;
                        com.ss.android.ugc.aweme.favorites.api.g r9 = (com.p2082ss.android.ugc.aweme.favorites.api.C47197g) r9
                        com.ss.android.ugc.aweme.metrics.i r2 = new com.ss.android.ugc.aweme.metrics.i
                        r2.<init>()
                        com.ss.android.ugc.aweme.favorites.ui.ae$q r0 = r8.f110477a
                        com.ss.android.ugc.aweme.favorites.ui.ae r0 = r0.f110475a
                        android.os.Bundle r1 = r0.getArguments()
                        if (r1 == 0) goto L_0x0048
                        java.lang.String r0 = "enterFrom"
                        java.lang.String r0 = r1.getString(r0)
                    L_0x0017:
                        com.ss.android.ugc.aweme.metrics.i r1 = r2.mo96812a(r0)
                        r0 = 0
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                        com.ss.android.ugc.aweme.metrics.i r0 = r1.mo96811a(r0)
                        r0.mo96792f()
                        com.ss.android.ugc.aweme.favorites.ui.ae$q r0 = r8.f110477a
                        com.ss.android.ugc.aweme.favorites.ui.ae r0 = r0.f110475a
                        com.ss.android.ugc.aweme.favorites.ui.o r1 = r0.f110462a
                        if (r1 == 0) goto L_0x0040
                        r0 = 1
                        com.ss.android.ugc.aweme.favorites.api.d r2 = new com.ss.android.ugc.aweme.favorites.api.d
                        java.lang.String r3 = r9.f109862a
                        java.lang.String r4 = r7
                        r5 = 0
                        r6 = 0
                        r7 = 28
                        r2.<init>(r3, r4, r5, r6, r7)
                        r1.mo79775a(r0, r2)
                    L_0x0040:
                        com.ss.android.ugc.aweme.favorites.ui.ae$q r0 = r8.f110477a
                        com.ss.android.ugc.aweme.favorites.ui.ae r0 = r0.f110475a
                        com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                        return
                    L_0x0048:
                        r0 = 0
                        goto L_0x0017
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47606ae.C47623q.C476241.accept(java.lang.Object):void");
                }
            }, new AbstractC88433f(this) {
                /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47606ae.C47623q.C476252 */

                /* renamed from: a */
                final /* synthetic */ C47623q f110479a;

                static {
                    Covode.recordClassIndex(56247);
                }

                {
                    this.f110479a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    new C23144b(this.f110479a.f110476b).mo37640e(R.string.bof).mo37637b();
                }
            });
            C89219l.m154716b(a, "");
            C88934a.m154195a(a, this.f110475a.mo79789b());
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r0 == null) goto L_0x0018;
     */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47606ae.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.zm, viewGroup, false);
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
