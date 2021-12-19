package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3206a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerlist.C17656f;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c.C55064c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55233v;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3204ui.view.C55382b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.invite.p3204ui.view.ShareGroupCell;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.EnumC55388a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3207b.C55533a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3207b.C55539b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.view.C55597b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.view.C55600e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.view.ContactListCell;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.view.IndexCell;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.C55619b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a */
public final class C55393a extends AbstractC12769a {

    /* renamed from: j */
    public PowerList f126647j;

    /* renamed from: k */
    private final C12786i f126648k = new C12786i(bW_(), new C55414u(this, "init_config"));

    /* renamed from: l */
    private final C12814b f126649l;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$l */
    public static final class C55405l extends AbstractC89220m implements AbstractC89172b<C55619b, C55619b> {
        public static final C55405l INSTANCE = new C55405l();

        static {
            Covode.recordClassIndex(65176);
        }

        public C55405l() {
            super(1);
        }

        public final C55619b invoke(C55619b bVar) {
            C89219l.m154719c(bVar, "");
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(65164);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final C55539b.C55555p mo92460v() {
        return (C55539b.C55555p) this.f126648k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$h */
    public static final class C55401h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126655a;

        static {
            Covode.recordClassIndex(65172);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55401h(AbstractC12748a aVar) {
            super(0);
            this.f126655a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f126655a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$d */
    public static final class C55397d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C55397d INSTANCE = new C55397d();

        static {
            Covode.recordClassIndex(65168);
        }

        public C55397d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$g */
    public static final class C55400g extends AbstractC89220m implements AbstractC89171a<C12874b<C55619b>> {
        public static final C55400g INSTANCE = new C55400g();

        static {
            Covode.recordClassIndex(65171);
        }

        public C55400g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C55619b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$i */
    public static final class C55402i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126656a;

        static {
            Covode.recordClassIndex(65173);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55402i(AbstractC12748a aVar) {
            super(0);
            this.f126656a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f126656a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$j */
    public static final class C55403j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126657a;

        static {
            Covode.recordClassIndex(65174);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55403j(AbstractC12748a aVar) {
            super(0);
            this.f126657a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f126657a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$n */
    public static final class C55407n extends AbstractC89220m implements AbstractC89171a<C12874b<C55619b>> {
        public static final C55407n INSTANCE = new C55407n();

        static {
            Covode.recordClassIndex(65178);
        }

        public C55407n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C55619b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$q */
    public static final class C55410q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C55410q INSTANCE = new C55410q();

        static {
            Covode.recordClassIndex(65181);
        }

        public C55410q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$t */
    public static final class C55413t extends AbstractC89220m implements AbstractC89171a<C12874b<C55619b>> {
        public static final C55413t INSTANCE = new C55413t();

        static {
            Covode.recordClassIndex(65184);
        }

        public C55413t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C55619b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$k */
    public static final class C55404k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126658a;

        static {
            Covode.recordClassIndex(65175);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55404k(AbstractC12748a aVar) {
            super(0);
            this.f126658a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f126658a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$m */
    public static final class C55406m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126659a;

        static {
            Covode.recordClassIndex(65177);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55406m(AbstractC12748a aVar) {
            super(0);
            this.f126659a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f126659a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$a */
    public static final class C55394a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f126650a;

        static {
            Covode.recordClassIndex(65165);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55394a(AbstractC89277c cVar) {
            super(0);
            this.f126650a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f126650a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$b */
    public static final class C55395b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126651a;

        static {
            Covode.recordClassIndex(65166);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55395b(AbstractC12748a aVar) {
            super(0);
            this.f126651a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f126651a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$c */
    public static final class C55396c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126652a;

        static {
            Covode.recordClassIndex(65167);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55396c(AbstractC12748a aVar) {
            super(0);
            this.f126652a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f126652a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$o */
    public static final class C55408o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126660a;

        static {
            Covode.recordClassIndex(65179);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55408o(AbstractC12748a aVar) {
            super(0);
            this.f126660a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f126660a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$p */
    public static final class C55409p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126661a;

        static {
            Covode.recordClassIndex(65180);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55409p(AbstractC12748a aVar) {
            super(0);
            this.f126661a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f126661a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$r */
    public static final class C55411r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126662a;

        static {
            Covode.recordClassIndex(65182);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55411r(AbstractC12748a aVar) {
            super(0);
            this.f126662a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f126662a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$s */
    public static final class C55412s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126663a;

        static {
            Covode.recordClassIndex(65183);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55412s(AbstractC12748a aVar) {
            super(0);
            this.f126663a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f126663a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$u */
    public static final class C55414u extends AbstractC89220m implements AbstractC89171a<C55539b.C55555p> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126664a;

        /* renamed from: b */
        final /* synthetic */ String f126665b;

        static {
            Covode.recordClassIndex(65185);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55414u(AbstractC12748a aVar, String str) {
            super(0);
            this.f126664a = aVar;
            this.f126665b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$p] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3207b.C55539b.C55555p invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f126664a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$p> r1 = com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3207b.C55539b.C55555p.class
                java.lang.String r0 = r3.f126665b
                java.lang.Object r0 = r2.mo20603a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3206a.C55393a.C55414u.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$e */
    public static final class C55398e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126653a;

        static {
            Covode.recordClassIndex(65169);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55398e(AbstractC12748a aVar) {
            super(0);
            this.f126653a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f126653a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$f */
    public static final class C55399f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126654a;

        static {
            Covode.recordClassIndex(65170);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55399f(AbstractC12748a aVar) {
            super(0);
            this.f126654a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f126654a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C55393a() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(ContactListViewModel.class);
        C55394a aVar = new C55394a(a);
        C55405l lVar = C55405l.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C55407n.INSTANCE, new C55408o(this), new C55409p(this), C55410q.INSTANCE, lVar, new C55411r(this), new C55412s(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C55413t.INSTANCE, new C55395b(this), new C55396c(this), C55397d.INSTANCE, lVar, new C55398e(this), new C55399f(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C55400g.INSTANCE, new C55401h(this), new C55402i(this), new C55403j(this), lVar, new C55404k(this), new C55406m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f126649l = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$w */
    public static final class C55416w extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C55393a f126667a;

        static {
            Covode.recordClassIndex(65187);
        }

        C55416w(C55393a aVar) {
            this.f126667a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            AbstractC55450h hVar = (AbstractC55450h) C12801d.m23025c(this.f126667a, C89204ab.m154669a(AbstractC55450h.class));
            if (hVar != null) {
                hVar.mo92464w();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$v */
    static final class View$OnClickListenerC55415v implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C55393a f126666a;

        static {
            Covode.recordClassIndex(65186);
        }

        View$OnClickListenerC55415v(C55393a aVar) {
            this.f126666a = aVar;
        }

        public final void onClick(View view) {
            AbstractC0952i fragmentManager;
            ClickAgent.onClick(view);
            C55393a aVar = this.f126666a;
            C56244a.m102191c("GroupCreateFragment", "enterJoinedGroupListFragment onClick");
            Fragment a = C12777b.m22999a((AbstractC1204m) aVar);
            if (a != null && (fragmentManager = a.getFragmentManager()) != null) {
                C56244a.m102191c("GroupCreateFragment", "enterJoinedGroupListFragment onTransfer");
                AbstractC0976n a2 = fragmentManager.mo3552a();
                a2.mo3452a(R.anim.dq, 0, 0, R.anim.dx);
                a2.mo3469b(R.id.b4i, new C55533a());
                a2.mo3457a("GroupCreateFragment");
                a2.mo3467b();
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        PowerList powerList = (PowerList) mo20528t().findViewById(R.id.acc);
        C89219l.m154716b(powerList, "");
        this.f126647j = powerList;
        if (powerList == null) {
            C89219l.m154710a("contactPowerList");
        }
        powerList.mo28083a(ContactListCell.class, IndexCell.class, ShareGroupCell.class);
        powerList.setItemAnimator(null);
        powerList.mo4405a(new C55416w(this));
        AbstractC12818f.C12819a.m23063a(this, (ContactListViewModel) this.f126649l.getValue(), C55419b.f126670a, C12856l.m23100a(), new C55417x(this), 4);
        C12801d.m23021a(this, C89204ab.m154669a(AbstractC55450h.class), C55420c.f126671a, C55421d.f126672a, new C55418y(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$y */
    static final class C55418y extends AbstractC89220m implements AbstractC89183m<C12776a<? extends Boolean>, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C55393a f126669a;

        static {
            Covode.recordClassIndex(65189);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55418y(C55393a aVar) {
            super(2);
            this.f126669a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C12776a<? extends Boolean> aVar, String str) {
            String str2 = str;
            C89219l.m154721d(aVar, "");
            PowerList powerList = this.f126669a.f126647j;
            if (powerList == null) {
                C89219l.m154710a("contactPowerList");
            }
            int i = 0;
            if (!(str2 == null || str2.length() == 0)) {
                i = 8;
            }
            powerList.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$x */
    static final class C55417x extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends List<? extends IMUser>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C55393a f126668a;

        static {
            Covode.recordClassIndex(65188);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55417x(C55393a aVar) {
            super(2);
            this.f126668a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends List<? extends IMUser>> aVar) {
            Context az_;
            String string;
            MethodCollector.m26663i(3330);
            C12776a<? extends List<? extends IMUser>> aVar2 = aVar;
            C89219l.m154721d(pVar, "");
            C89219l.m154721d(aVar2, "");
            C55393a aVar3 = this.f126668a;
            T t = aVar2.f31085a;
            PowerList powerList = aVar3.f126647j;
            if (powerList == null) {
                C89219l.m154710a("contactPowerList");
            }
            powerList.getState().mo28128a();
            if (aVar3.mo92460v().getEntry().getShowJoinedGroupsHeader()) {
                PowerList powerList2 = aVar3.f126647j;
                if (powerList2 == null) {
                    C89219l.m154710a("contactPowerList");
                }
                if (powerList2.getHeaderCount() <= 0) {
                    PowerList powerList3 = aVar3.f126647j;
                    if (powerList3 == null) {
                        C89219l.m154710a("contactPowerList");
                    }
                    View inflate = LayoutInflater.from(powerList3.getContext()).inflate(R.layout.a50, (ViewGroup) null);
                    inflate.setOnClickListener(new View$OnClickListenerC55415v(aVar3));
                    PowerList powerList4 = aVar3.f126647j;
                    if (powerList4 == null) {
                        C89219l.m154710a("contactPowerList");
                    }
                    powerList4.mo28079a(0, inflate);
                    C89219l.m154716b(inflate, "");
                    C55233v.m101004a(inflate);
                }
            }
            int i = 0;
            for (Object obj : t) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                IMUser iMUser = (IMUser) obj;
                if (i == 0 || (!C89219l.m154714a((Object) ((IMUser) t.get(i - 1)).getInitialLetter(), (Object) iMUser.getInitialLetter()))) {
                    PowerList powerList5 = aVar3.f126647j;
                    if (powerList5 == null) {
                        C89219l.m154710a("contactPowerList");
                    }
                    C17656f<AbstractC17641a> state = powerList5.getState();
                    String initialLetter = iMUser.getInitialLetter();
                    C89219l.m154716b(initialLetter, "");
                    state.mo28132a(new C55600e(initialLetter));
                }
                PowerList powerList6 = aVar3.f126647j;
                if (powerList6 == null) {
                    C89219l.m154710a("contactPowerList");
                }
                powerList6.getState().mo28132a(new C55597b(iMUser));
                i = i2;
            }
            if (!(!C55064c.m100703a() || aVar3.mo92460v().getEntry() != EnumC55388a.ADD_MEMBER || aVar3.mo92460v().getConversationId().length() == 0 || (az_ = aVar3.az_()) == null || (string = az_.getString(R.string.c7q)) == null)) {
                PowerList powerList7 = aVar3.f126647j;
                if (powerList7 == null) {
                    C89219l.m154710a("contactPowerList");
                }
                C17656f<AbstractC17641a> state2 = powerList7.getState();
                C89219l.m154716b(string, "");
                state2.mo28132a(new C55600e(string));
                state2.mo28132a(new C55382b(aVar3.mo92460v().getConversationId()));
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(3330);
            return zVar;
        }
    }
}
