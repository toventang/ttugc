package com.p2082ss.android.ugc.aweme.mix.createmix;

import android.content.Context;
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
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.extensions.C12794p;
import com.bytedance.assem.arch.extensions.C12795q;
import com.bytedance.assem.arch.extensions.C12796r;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12846h;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59396b;
import com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.C59528a;
import com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.EnumC59529b;
import com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.p2082ss.android.ugc.aweme.mix.p3447b.C59405e;
import com.p2082ss.android.ugc.aweme.mix.p3448c.C59413b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
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

/* renamed from: com.ss.android.ugc.aweme.mix.createmix.g */
public final class C59467g extends AbstractC34586a implements AbstractC12846h {

    /* renamed from: c */
    public static final C59474g f135765c = new C59474g((byte) 0);

    /* renamed from: a */
    public DmtStatusView f135766a;

    /* renamed from: b */
    public TuxButton f135767b;

    /* renamed from: d */
    private NormalTitleBar f135768d;

    /* renamed from: e */
    private final C12814b f135769e;

    /* renamed from: j */
    private SparseArray f135770j;

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.g$b */
    public static final class C59469b extends AbstractC89220m implements AbstractC89172b<C59528a, C59528a> {
        public static final C59469b INSTANCE = new C59469b();

        static {
            Covode.recordClassIndex(69862);
        }

        public C59469b() {
            super(1);
        }

        public final C59528a invoke(C59528a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(69860);
    }

    /* renamed from: a */
    public final MixCreateViewModel mo97095a() {
        return (MixCreateViewModel) this.f135769e.getValue();
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

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.g$g */
    public static final class C59474g {
        static {
            Covode.recordClassIndex(69867);
        }

        private C59474g() {
        }

        /* renamed from: a */
        public static C59467g m109144a() {
            Bundle bundle = new Bundle();
            C59467g gVar = new C59467g();
            gVar.setArguments(bundle);
            return gVar;
        }

        public /* synthetic */ C59474g(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.g$k */
    static final class C59478k extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C59478k f135777a = new C59478k();

        static {
            Covode.recordClassIndex(69871);
        }

        C59478k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.g$n */
    static final class C59481n extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C59481n f135782a = new C59481n();

        static {
            Covode.recordClassIndex(69874);
        }

        C59481n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
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

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.g$c */
    public static final class C59470c extends AbstractC89220m implements AbstractC89171a<C12874b<C59528a>> {
        public static final C59470c INSTANCE = new C59470c();

        static {
            Covode.recordClassIndex(69863);
        }

        public C59470c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59528a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.g$f */
    public static final class C59473f extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59473f INSTANCE = new C59473f();

        static {
            Covode.recordClassIndex(69866);
        }

        public C59473f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.g$d */
    public static final class C59471d extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f135772a;

        static {
            Covode.recordClassIndex(69864);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59471d(Fragment fragment) {
            super(0);
            this.f135772a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e requireActivity = this.f135772a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            return requireActivity;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f135770j;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.g$a */
    public static final class C59468a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f135771a;

        static {
            Covode.recordClassIndex(69861);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59468a(AbstractC89277c cVar) {
            super(0);
            this.f135771a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f135771a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.g$e */
    public static final class C59472e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ Fragment f135773a;

        static {
            Covode.recordClassIndex(69865);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59472e(Fragment fragment) {
            super(0);
            this.f135773a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e requireActivity = this.f135773a.requireActivity();
            C89219l.m154709a((Object) requireActivity, "");
            C1182af viewModelStore = requireActivity.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    public C59467g() {
        AbstractC89277c a = C89204ab.m154669a(MixCreateViewModel.class);
        this.f135769e = new C12814b(a, new C59468a(a), C59470c.INSTANCE, new C59471d(this), new C59472e(this), C59473f.INSTANCE, C59469b.INSTANCE);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.g$o */
    public static final class C59482o implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ C59467g f135783a;

        static {
            Covode.recordClassIndex(69875);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
            C89219l.m154721d(view, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59482o(C59467g gVar) {
            this.f135783a = gVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            AbstractC0952i supportFragmentManager;
            C89219l.m154721d(view, "");
            ActivityC0945e activity = this.f135783a.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                supportFragmentManager.mo3562c();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TuxButton m109136a(C59467g gVar) {
        TuxButton tuxButton = gVar.f135767b;
        if (tuxButton == null) {
            C89219l.m154710a("mBottomView");
        }
        return tuxButton;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.g$p */
    static final class C59483p extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59467g f135784a;

        static {
            Covode.recordClassIndex(69876);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59483p(C59467g gVar) {
            super(1);
            this.f135784a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20582b(this.f135784a, C594841.f135785a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.g$i */
    static final class C59476i extends AbstractC89220m implements AbstractC89172b<C59396b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59467g f135775a;

        static {
            Covode.recordClassIndex(69869);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59476i(C59467g gVar) {
            super(1);
            this.f135775a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C59396b bVar) {
            C59396b bVar2 = bVar;
            if (bVar2 == null || bVar2.status_code != 0) {
                if (this.f135775a.getActivity() != null) {
                    new C23144b(this.f135775a).mo37640e(R.string.fz3).mo37637b();
                }
            } else if (C59413b.m109112a() == 0) {
                AbstractC81915c.m141874a(new C59405e());
                ActivityC0945e activity = this.f135775a.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.g$j */
    static final class C59477j extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59467g f135776a;

        static {
            Covode.recordClassIndex(69870);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59477j(C59467g gVar) {
            super(1);
            this.f135776a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            String message = th2.getMessage();
            if ((message == null || !message.equals("dark_post_failed")) && this.f135776a.getActivity() != null) {
                new C23144b(this.f135776a).mo37640e(R.string.fz3).mo37637b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.g$m */
    static final class C59480m extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59467g f135781a;

        static {
            Covode.recordClassIndex(69873);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59480m(C59467g gVar) {
            super(1);
            this.f135781a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            if (this.f135781a.getActivity() != null) {
                new C23144b(this.f135781a).mo37640e(R.string.fz3).mo37637b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.g$r */
    static final class View$OnClickListenerC59486r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C59467g f135787a;

        static {
            Covode.recordClassIndex(69879);
        }

        View$OnClickListenerC59486r(C59467g gVar) {
            this.f135787a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (C59413b.m109112a() != 1 || !this.f135787a.mo97095a().mo23343h()) {
                this.f135787a.mo97095a().mo97106i();
            } else {
                this.f135787a.mo97095a().mo97102a(EnumC59529b.CREATE_NAME);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.g$l */
    static final class C59479l extends AbstractC89220m implements AbstractC89172b<C59396b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59467g f135778a;

        /* renamed from: b */
        final /* synthetic */ String f135779b;

        /* renamed from: c */
        final /* synthetic */ String f135780c;

        static {
            Covode.recordClassIndex(69872);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59479l(C59467g gVar, String str, String str2) {
            super(1);
            this.f135778a = gVar;
            this.f135779b = str;
            this.f135780c = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 8 out of bounds for length 8
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
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.mix.api.response.C59396b r10) {
            /*
                r9 = this;
                com.ss.android.ugc.aweme.mix.api.response.b r10 = (com.p2082ss.android.ugc.aweme.mix.api.response.C59396b) r10
                if (r10 == 0) goto L_0x004a
                int r0 = r10.status_code
                if (r0 != 0) goto L_0x004a
                com.bytedance.tux.g.b r1 = new com.bytedance.tux.g.b
                com.ss.android.ugc.aweme.mix.createmix.g r0 = r9.f135778a
                r1.<init>(r0)
                com.bytedance.tux.g.b r1 = r1.mo37632a()
                r0 = 2131830462(0x7f1126be, float:1.9293922E38)
                com.bytedance.tux.g.b r0 = r1.mo37640e(r0)
                r0.mo37637b()
                com.ss.android.ugc.aweme.mix.services.IMixFeedService r1 = com.p2082ss.android.ugc.aweme.mix.services.MixFeedService.m109435k()
                com.ss.android.ugc.aweme.mix.createmix.g r0 = r9.f135778a
                androidx.fragment.app.e r2 = r0.getActivity()
                com.ss.android.ugc.aweme.mix.createmix.g r0 = r9.f135778a
                com.ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel r0 = r0.mo97095a()
                java.lang.String r5 = r0.f135806j
                java.lang.String r6 = r9.f135779b
                java.lang.String r7 = r9.f135780c
                java.lang.String r3 = ""
                java.lang.String r4 = "from_profile_mix_list"
                java.lang.String r8 = ""
                com.p2082ss.android.ugc.aweme.mix.services.IMixFeedService.C59922a.m109401a(r1, r2, r3, r4, r5, r6, r7, r8)
                com.ss.android.ugc.aweme.mix.createmix.g r0 = r9.f135778a
                androidx.fragment.app.e r0 = r0.getActivity()
                if (r0 == 0) goto L_0x0047
                r0.finish()
            L_0x0047:
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            L_0x004a:
                com.ss.android.ugc.aweme.mix.createmix.g r0 = r9.f135778a
                androidx.fragment.app.e r0 = r0.getActivity()
                if (r0 == 0) goto L_0x0047
                com.bytedance.tux.g.b r1 = new com.bytedance.tux.g.b
                com.ss.android.ugc.aweme.mix.createmix.g r0 = r9.f135778a
                r1.<init>(r0)
                r0 = 2131829795(0x7f112423, float:1.929257E38)
                com.bytedance.tux.g.b r0 = r1.mo37640e(r0)
                r0.mo37637b()
                goto L_0x0047
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mix.createmix.C59467g.C59479l.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.g$q */
    static final class C59485q extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, List<? extends Aweme>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59467g f135786a;

        static {
            Covode.recordClassIndex(69878);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59485q(C59467g gVar) {
            super(2);
            this.f135786a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, List<? extends Aweme> list) {
            List<? extends Aweme> list2 = list;
            C89219l.m154721d(dVar, "");
            if (list2 == null || list2.size() != 0) {
                DmtStatusView dmtStatusView = this.f135786a.f135766a;
                if (dmtStatusView == null) {
                    C89219l.m154710a("mStatusView");
                }
                dmtStatusView.mo27379a(true);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.g$h */
    static final class C59475h extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59467g f135774a;

        static {
            Covode.recordClassIndex(69868);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59475h(C59467g gVar) {
            super(2);
            this.f135774a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(dVar, "");
            CharSequence charSequence = null;
            if (!booleanValue) {
                TuxButton a = C59467g.m109136a(this.f135774a);
                Context context = this.f135774a.getContext();
                if (context != null) {
                    charSequence = context.getText(R.string.baq);
                }
                a.setText(charSequence);
            } else if (C59413b.m109112a() == 1 || C59413b.m109112a() == 2) {
                TuxButton a2 = C59467g.m109136a(this.f135774a);
                Context context2 = this.f135774a.getContext();
                if (context2 != null) {
                    charSequence = context2.getText(R.string.dfb);
                }
                a2.setText(charSequence);
            } else {
                TuxButton a3 = C59467g.m109136a(this.f135774a);
                Context context3 = this.f135774a.getContext();
                if (context3 != null) {
                    charSequence = context3.getText(R.string.aw0);
                }
                a3.setText(charSequence);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.cky);
        C89219l.m154716b(findViewById, "");
        NormalTitleBar normalTitleBar = (NormalTitleBar) findViewById;
        this.f135768d = normalTitleBar;
        if (normalTitleBar == null) {
            C89219l.m154710a("mTitleBar");
        }
        normalTitleBar.setOnTitleBarClickListener(new C59482o(this));
        C12780d.m23005a(this, new C59483p(this));
        View findViewById2 = view.findViewById(R.id.e7i);
        C89219l.m154716b(findViewById2, "");
        DmtStatusView dmtStatusView = (DmtStatusView) findViewById2;
        this.f135766a = dmtStatusView;
        if (dmtStatusView == null) {
            C89219l.m154710a("mStatusView");
        }
        dmtStatusView.setBuilder(DmtStatusView.C17269a.m31905a(getContext()).mo27397a().mo27404a(new C17273d.C17274a(getContext()).mo27457a(2131233293).mo27462b(R.string.bmy).mo27464c(R.string.bmz).f41365a));
        DmtStatusView dmtStatusView2 = this.f135766a;
        if (dmtStatusView2 == null) {
            C89219l.m154710a("mStatusView");
        }
        dmtStatusView2.mo27385g();
        AbstractC12818f.C12819a.m23063a(this, mo97095a(), C59490k.f135791a, (C12854k) null, new C59485q(this), 6);
        View findViewById3 = view.findViewById(R.id.ckn);
        C89219l.m154716b(findViewById3, "");
        TuxButton tuxButton = (TuxButton) findViewById3;
        this.f135767b = tuxButton;
        if (tuxButton == null) {
            C89219l.m154710a("mBottomView");
        }
        tuxButton.setOnClickListener(new View$OnClickListenerC59486r(this));
        C31575b.m65859a();
        IAccountUserService e = C31575b.f75524a.mo57069e();
        C89219l.m154716b(e, "");
        String curUserId = e.getCurUserId();
        C31575b.m65859a();
        IAccountUserService e2 = C31575b.f75524a.mo57069e();
        C89219l.m154716b(e2, "");
        String curSecUserId = e2.getCurSecUserId();
        AssemViewModel.m23030a(mo97095a(), C59487h.f135788a, null, new C59477j(this), C59478k.f135777a, new C59476i(this), 2);
        AssemViewModel.m23030a(mo97095a(), C59488i.f135789a, null, new C59480m(this), C59481n.f135782a, new C59479l(this, curUserId, curSecUserId), 2);
        AbstractC12818f.C12819a.m23063a(this, mo97095a(), C59489j.f135790a, (C12854k) null, new C59475h(this), 6);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a15, viewGroup, false);
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
