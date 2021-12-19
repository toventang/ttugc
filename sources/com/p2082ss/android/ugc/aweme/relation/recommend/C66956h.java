package com.p2082ss.android.ugc.aweme.relation.recommend;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AbstractC14527i;
import com.bytedance.ext_power_list.AbstractC14534m;
import com.bytedance.ext_power_list.C14533l;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.page.config.C17693c;
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
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.relation.C66865b;
import com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b;
import com.p2082ss.android.ugc.aweme.relation.p3674c.EnumC66892b;
import com.p2082ss.android.ugc.aweme.relation.viewmodel.C67100b;
import com.p2082ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel;
import com.p2082ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.p2082ss.android.ugc.trill.R;
import dagger.hilt.android.internal.p4539b.C88098a;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
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

/* renamed from: com.ss.android.ugc.aweme.relation.recommend.h */
public final class C66956h extends AbstractC14534m<RecFriendsListViewModel> implements AbstractC20527q {

    /* renamed from: j */
    public TextTitleBar f150257j;

    /* renamed from: k */
    private final C12786i f150258k = new C12786i(bW_(), new C66975r(this, null));

    /* renamed from: l */
    private final C12814b f150259l;

    /* renamed from: m */
    private final AbstractC89244h f150260m;

    /* renamed from: n */
    private final AbstractC89244h f150261n;

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$j */
    public static final class C66967j extends AbstractC89220m implements AbstractC89172b<C67100b, C67100b> {
        public static final C66967j INSTANCE = new C66967j();

        static {
            Covode.recordClassIndex(78544);
        }

        public C66967j() {
            super(1);
        }

        public final C67100b invoke(C67100b bVar) {
            C89219l.m154719c(bVar, "");
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(78533);
    }

    /* renamed from: A */
    public final C66994m mo105853A() {
        return (C66994m) this.f150260m.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.bytedance.ext_power_list.AbstractC14534m
    /* renamed from: w */
    public final PowerList mo23379w() {
        return (PowerList) this.f150261n.getValue();
    }

    /* renamed from: y */
    public final C66936f mo105854y() {
        return (C66936f) this.f150258k.getValue();
    }

    /* renamed from: z */
    public final RecFriendsListViewModel mo23378v() {
        return (RecFriendsListViewModel) this.f150259l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$g */
    public static final class C66964g extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f150268a;

        static {
            Covode.recordClassIndex(78541);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66964g(AbstractC12748a aVar) {
            super(0);
            this.f150268a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f150268a;
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

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$f */
    public static final class C66963f extends AbstractC89220m implements AbstractC89171a<C12874b<C67100b>> {
        public static final C66963f INSTANCE = new C66963f();

        static {
            Covode.recordClassIndex(78540);
        }

        public C66963f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C67100b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$h */
    public static final class C66965h extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f150269a;

        static {
            Covode.recordClassIndex(78542);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66965h(AbstractC12748a aVar) {
            super(0);
            this.f150269a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f150269a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$l */
    public static final class C66969l extends AbstractC89220m implements AbstractC89171a<C12874b<C67100b>> {
        public static final C66969l INSTANCE = new C66969l();

        static {
            Covode.recordClassIndex(78546);
        }

        public C66969l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C67100b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$q */
    public static final class C66974q extends AbstractC89220m implements AbstractC89171a<C12874b<C67100b>> {
        public static final C66974q INSTANCE = new C66974q();

        static {
            Covode.recordClassIndex(78551);
        }

        public C66974q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C67100b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$aa */
    static final class C66958aa extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C66956h f150263a;

        static {
            Covode.recordClassIndex(78535);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66958aa(C66956h hVar) {
            super(0);
            this.f150263a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            C1175ad.AbstractC1177b a = C88098a.m153168a(C12777b.m23004b(this.f150263a));
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$i */
    public static final class C66966i extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f150270a;

        static {
            Covode.recordClassIndex(78543);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66966i(AbstractC12748a aVar) {
            super(0);
            this.f150270a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f150270a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$k */
    public static final class C66968k extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f150271a;

        static {
            Covode.recordClassIndex(78545);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66968k(AbstractC12748a aVar) {
            super(0);
            this.f150271a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f150271a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$s */
    static final class C66976s extends AbstractC89220m implements AbstractC89171a<C66994m> {

        /* renamed from: a */
        final /* synthetic */ C66956h f150278a;

        static {
            Covode.recordClassIndex(78553);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66976s(C66956h hVar) {
            super(0);
            this.f150278a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C66994m invoke() {
            return this.f150278a.mo105854y().f150233a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$t */
    static final class C66977t extends AbstractC89220m implements AbstractC89171a<PowerList> {

        /* renamed from: a */
        final /* synthetic */ C66956h f150279a;

        static {
            Covode.recordClassIndex(78554);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66977t(C66956h hVar) {
            super(0);
            this.f150279a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PowerList invoke() {
            return this.f150279a.mo20528t().findViewById(R.id.d57);
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: n */
    public final void mo20526n() {
        super.mo20526n();
        mo23378v();
        RecFriendsListViewModel.m118729a("background");
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$a */
    public static final class C66957a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f150262a;

        static {
            Covode.recordClassIndex(78534);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66957a(AbstractC89277c cVar) {
            super(0);
            this.f150262a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f150262a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$b */
    public static final class C66959b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f150264a;

        static {
            Covode.recordClassIndex(78536);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66959b(AbstractC12748a aVar) {
            super(0);
            this.f150264a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f150264a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$c */
    public static final class C66960c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f150265a;

        static {
            Covode.recordClassIndex(78537);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66960c(AbstractC12748a aVar) {
            super(0);
            this.f150265a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f150265a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$m */
    public static final class C66970m extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f150272a;

        static {
            Covode.recordClassIndex(78547);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66970m(AbstractC12748a aVar) {
            super(0);
            this.f150272a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f150272a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$n */
    public static final class C66971n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f150273a;

        static {
            Covode.recordClassIndex(78548);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66971n(AbstractC12748a aVar) {
            super(0);
            this.f150273a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f150273a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$o */
    public static final class C66972o extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f150274a;

        static {
            Covode.recordClassIndex(78549);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66972o(AbstractC12748a aVar) {
            super(0);
            this.f150274a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f150274a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$p */
    public static final class C66973p extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f150275a;

        static {
            Covode.recordClassIndex(78550);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66973p(AbstractC12748a aVar) {
            super(0);
            this.f150275a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f150275a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$r */
    public static final class C66975r extends AbstractC89220m implements AbstractC89171a<C66936f> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f150276a;

        /* renamed from: b */
        final /* synthetic */ String f150277b;

        static {
            Covode.recordClassIndex(78552);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66975r(AbstractC12748a aVar, String str) {
            super(0);
            this.f150276a = aVar;
            this.f150277b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.relation.recommend.f] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.relation.recommend.C66936f invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f150276a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.relation.recommend.f> r1 = com.p2082ss.android.ugc.aweme.relation.recommend.C66936f.class
                java.lang.String r0 = r3.f150277b
                java.lang.Object r0 = r2.mo20603a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.relation.recommend.C66956h.C66975r.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$x */
    static final class C66981x extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ TuxDualBallView f150286a;

        static {
            Covode.recordClassIndex(78558);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66981x(TuxDualBallView tuxDualBallView) {
            super(0);
            this.f150286a = tuxDualBallView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            TuxDualBallView tuxDualBallView = this.f150286a;
            C89219l.m154716b(tuxDualBallView, "");
            tuxDualBallView.setVisibility(0);
            this.f150286a.mo37884b();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ext_power_list.AbstractC14534m
    /* renamed from: x */
    public final C17693c mo23380x() {
        C17693c cVar = new C17693c();
        cVar.f42319a = 5;
        cVar.f42320b = false;
        return cVar.mo28182a(LoadingFooterCell.class);
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$d */
    public static final class C66961d extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f150266a;

        static {
            Covode.recordClassIndex(78538);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66961d(AbstractC12748a aVar) {
            super(0);
            this.f150266a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f150266a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$e */
    public static final class C66962e extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f150267a;

        static {
            Covode.recordClassIndex(78539);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66962e(AbstractC12748a aVar) {
            super(0);
            this.f150267a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f150267a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C66956h() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        C66958aa aaVar = new C66958aa(this);
        AbstractC89277c a = C89204ab.m154669a(RecFriendsListViewModel.class);
        C66957a aVar = new C66957a(a);
        C66967j jVar = C66967j.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C66969l.INSTANCE, new C66970m(this), new C66971n(this), aaVar, jVar, new C66972o(this), new C66973p(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C66974q.INSTANCE, new C66959b(this), new C66960c(this), aaVar, jVar, new C66961d(this), new C66962e(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C66963f.INSTANCE, new C66964g(this), new C66965h(this), aaVar, jVar, new C66966i(this), new C66968k(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f150259l = bVar;
        this.f150260m = C89250i.m154773a((AbstractC89171a) new C66976s(this));
        this.f150261n = C89250i.m154773a((AbstractC89171a) new C66977t(this));
    }

    /* renamed from: a */
    public static final /* synthetic */ TextTitleBar m118682a(C66956h hVar) {
        TextTitleBar textTitleBar = hVar.f150257j;
        if (textTitleBar == null) {
            C89219l.m154710a("titleBar");
        }
        return textTitleBar;
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$u */
    static final class View$OnClickListenerC66978u implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C66956h f150280a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f150281b;

        static {
            Covode.recordClassIndex(78555);
        }

        View$OnClickListenerC66978u(C66956h hVar, ActivityC0945e eVar) {
            this.f150280a = hVar;
            this.f150281b = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f150280a.mo23378v();
            RecFriendsListViewModel.m118727a(this.f150281b);
            this.f150280a.mo23378v();
            RecFriendsListViewModel.m118729a("click");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$y */
    static final class C66982y extends AbstractC89220m implements AbstractC89172b<C14533l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66956h f150287a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f150288b;

        /* renamed from: c */
        final /* synthetic */ TuxDualBallView f150289c;

        static {
            Covode.recordClassIndex(78559);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66982y(C66956h hVar, ActivityC0945e eVar, TuxDualBallView tuxDualBallView) {
            super(1);
            this.f150287a = hVar;
            this.f150288b = eVar;
            this.f150289c = tuxDualBallView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C14533l lVar) {
            C89219l.m154721d(lVar, "");
            C66956h.m22977a(this.f150287a.mo23378v(), new AbstractC89172b<C67100b, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.relation.recommend.C66956h.C66982y.C669831 */

                /* renamed from: a */
                final /* synthetic */ C66982y f150290a;

                static {
                    Covode.recordClassIndex(78560);
                }

                {
                    this.f150290a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C67100b bVar) {
                    C67100b bVar2 = bVar;
                    C89219l.m154721d(bVar2, "");
                    List b = AbstractC14527i.C14528a.m26537b(bVar2);
                    if (b == null || b.isEmpty()) {
                        new C23144b(this.f150290a.f150288b).mo37635a(this.f150290a.f150287a.mo105853A().getToast()).mo37637b();
                        C34727m.m70945a(new Runnable(this) {
                            /* class com.p2082ss.android.ugc.aweme.relation.recommend.C66956h.C66982y.C669831.RunnableC669841 */

                            /* renamed from: a */
                            final /* synthetic */ C669831 f150291a;

                            static {
                                Covode.recordClassIndex(78561);
                            }

                            {
                                this.f150291a = r1;
                            }

                            public final void run() {
                                this.f150291a.f150290a.f150287a.mo23378v();
                                RecFriendsListViewModel.m118727a(this.f150291a.f150290a.f150288b);
                            }
                        }, 1000);
                    } else {
                        TuxDualBallView tuxDualBallView = this.f150290a.f150289c;
                        C89219l.m154716b(tuxDualBallView, "");
                        tuxDualBallView.setVisibility(8);
                        this.f150290a.f150289c.mo37885c();
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$z */
    static final class C66985z extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66956h f150292a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f150293b;

        static {
            Covode.recordClassIndex(78562);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66985z(C66956h hVar, ActivityC0945e eVar) {
            super(1);
            this.f150292a = hVar;
            this.f150293b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            C66956h.m22977a(this.f150292a.mo23378v(), new AbstractC89172b<C67100b, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.relation.recommend.C66956h.C66985z.C669861 */

                /* renamed from: a */
                final /* synthetic */ C66985z f150294a;

                static {
                    Covode.recordClassIndex(78563);
                }

                {
                    this.f150294a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C67100b bVar) {
                    C67100b bVar2 = bVar;
                    C89219l.m154721d(bVar2, "");
                    List b = AbstractC14527i.C14528a.m26537b(bVar2);
                    if (b == null || b.isEmpty()) {
                        new C23144b(this.f150294a.f150293b).mo37635a(this.f150294a.f150292a.mo105853A().getToast()).mo37637b();
                        C34727m.m70945a(new Runnable(this) {
                            /* class com.p2082ss.android.ugc.aweme.relation.recommend.C66956h.C66985z.C669861.RunnableC669871 */

                            /* renamed from: a */
                            final /* synthetic */ C669861 f150295a;

                            static {
                                Covode.recordClassIndex(78564);
                            }

                            {
                                this.f150295a = r1;
                            }

                            public final void run() {
                                this.f150295a.f150294a.f150292a.mo23378v();
                                RecFriendsListViewModel.m118727a(this.f150295a.f150294a.f150293b);
                            }
                        }, 1000);
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$w */
    static final class View$OnClickListenerC66980w implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C66956h f150284a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f150285b;

        static {
            Covode.recordClassIndex(78557);
        }

        View$OnClickListenerC66980w(C66956h hVar, ActivityC0945e eVar) {
            this.f150284a = hVar;
            this.f150285b = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                String str = this.f150284a.mo105854y().f150234b;
                String str2 = "";
                C89219l.m154721d(str, str2);
                C33744d a = new C33744d().mo59983a("enter_from", "version_update");
                int hashCode = str.hashCode();
                if (hashCode != 49) {
                    if (hashCode != 50) {
                        if (hashCode == 48503 && str.equals("1,2")) {
                            str2 = "facebook&contact";
                        }
                    } else if (str.equals("2")) {
                        str2 = "facebook";
                    }
                } else if (str.equals("1")) {
                    str2 = "contact";
                }
                C39162r.m79460a("confirm_rec_page", a.mo59983a("platform", str2).mo59983a("result", "done").f79943a);
                this.f150284a.mo23378v();
                RecFriendsListViewModel.m118727a(this.f150285b);
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AbstractC14534m, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        MethodCollector.m26663i(14268);
        String str = "";
        C89219l.m154721d(view, str);
        super.mo20630b(view);
        ActivityC0945e b = C12777b.m23004b(this);
        if (b == null) {
            MethodCollector.m26664o(14268);
            return;
        }
        if (C66865b.m118577e()) {
            View findViewById = view.findViewById(R.id.dnb);
            C89219l.m154716b(findViewById, str);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            double b2 = (double) C13628n.m24521b(b);
            Double.isNaN(b2);
            layoutParams.height = (int) (b2 * 0.9d);
        }
        PowerList w = mo23379w();
        w.setVisibility(0);
        View inflate = LayoutInflater.from(w.getContext()).inflate(R.layout.a2s, (ViewGroup) null);
        C89219l.m154716b(inflate, str);
        TuxTextView tuxTextView = (TuxTextView) inflate.findViewById(R.id.title);
        C89219l.m154716b(tuxTextView, str);
        tuxTextView.setText(mo105853A().getTitle());
        TuxTextView tuxTextView2 = (TuxTextView) inflate.findViewById(R.id.dtf);
        C89219l.m154716b(tuxTextView2, str);
        tuxTextView2.setText(mo105853A().getSubTitle());
        ((TuxTextView) inflate.findViewById(R.id.title)).mo37697a(38.0f);
        w.mo28079a(0, inflate);
        mo23379w().mo28083a(RecommendFriendCell.class);
        az_();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        mo23379w().setLayoutManager(linearLayoutManager);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.a70);
        C89219l.m154716b(tuxIconView, str);
        tuxIconView.setVisibility(0);
        tuxIconView.setOnClickListener(new View$OnClickListenerC66978u(this, b));
        View findViewById2 = view.findViewById(R.id.eiz);
        C89219l.m154716b(findViewById2, str);
        TextTitleBar textTitleBar = (TextTitleBar) findViewById2;
        this.f150257j = textTitleBar;
        if (textTitleBar == null) {
            C89219l.m154710a("titleBar");
        }
        textTitleBar.setTitle(mo105853A().getTitle());
        mo23379w().mo4405a(new C66979v(this, linearLayoutManager));
        TuxButton tuxButton = (TuxButton) view.findViewById(R.id.u3);
        C89219l.m154716b(tuxButton, str);
        tuxButton.setText(mo105853A().getButtonText());
        C17235c.m31810a(tuxButton, 0.75f);
        tuxButton.setOnClickListener(new View$OnClickListenerC66980w(this, b));
        TuxDualBallView tuxDualBallView = (TuxDualBallView) view.findViewById(R.id.cff);
        AssemViewModel.m23030a(mo23378v(), C66988i.f150296a, null, new C66985z(this, b), new C66981x(tuxDualBallView), new C66982y(this, b, tuxDualBallView), 2);
        mo23378v().mo23342g();
        String str2 = mo105854y().f150234b;
        C89219l.m154721d(str2, str);
        C33744d a = new C33744d().mo59983a("enter_from", "version_update");
        int hashCode = str2.hashCode();
        if (hashCode != 49) {
            if (hashCode != 50) {
                if (hashCode == 48503 && str2.equals("1,2")) {
                    str = "facebook&contact";
                }
            } else if (str2.equals("2")) {
                str = "facebook";
            }
        } else if (str2.equals("1")) {
            str = "contact";
        }
        C39162r.m79460a("show_rec_page", a.mo59983a("platform", str).f79943a);
        C66870b.m118588b(2, EnumC66892b.RECOMMEND.getValue());
        C66870b.m118588b(1, EnumC66892b.RECOMMEND.getValue());
        MethodCollector.m26664o(14268);
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.recommend.h$v */
    public static final class C66979v extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C66956h f150282a;

        /* renamed from: b */
        final /* synthetic */ LinearLayoutManager f150283b;

        static {
            Covode.recordClassIndex(78556);
        }

        C66979v(C66956h hVar, LinearLayoutManager linearLayoutManager) {
            this.f150282a = hVar;
            this.f150283b = linearLayoutManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            super.mo4754a(recyclerView, i, i2);
            int k = this.f150283b.mo4371k();
            if (k == 0) {
                if (C66956h.m118682a(this.f150282a).getAlpha() == 1.0f) {
                    C66956h.m118682a(this.f150282a).setAlpha(0.0f);
                }
            } else if (k > 0 && C66956h.m118682a(this.f150282a).getAlpha() == 0.0f) {
                C66956h.m118682a(this.f150282a).setAlpha(1.0f);
            }
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
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
