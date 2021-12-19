package com.p2082ss.android.ugc.aweme.profile.assem;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AbstractC14534m;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.profile.assem.p3566VM.C63443a;
import com.p2082ss.android.ugc.aweme.profile.assem.p3566VM.MyVideoListVM;
import com.p2082ss.android.ugc.aweme.profile.assem.powercell.MyVideoCell;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C63966a;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64349c;
import com.p2082ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.p2082ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.profile.assem.a */
public final class C63444a extends AbstractC14534m<MyVideoListVM> {

    /* renamed from: j */
    public static final C63466v f144053j = new C63466v((byte) 0);

    /* renamed from: k */
    private Fragment f144054k;

    /* renamed from: l */
    private final AbstractC89244h f144055l = C89250i.m154773a((AbstractC89171a) new C63467w(this));

    /* renamed from: m */
    private final AbstractC89244h f144056m = C89250i.m154773a((AbstractC89171a) new C63469y(this));

    /* renamed from: n */
    private final C12814b f144057n;

    /* renamed from: o */
    private final C12786i f144058o;

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$l */
    public static final class C63456l extends AbstractC89220m implements AbstractC89172b<C63443a, C63443a> {
        public static final C63456l INSTANCE = new C63456l();

        static {
            Covode.recordClassIndex(74763);
        }

        public C63456l() {
            super(1);
        }

        public final C63443a invoke(C63443a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(74751);
    }

    /* renamed from: A */
    private final C64349c m115045A() {
        return (C64349c) this.f144058o.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public MyVideoListVM mo23378v() {
        return (MyVideoListVM) this.f144057n.getValue();
    }

    @Override // com.bytedance.ext_power_list.AbstractC14534m
    /* renamed from: w */
    public final PowerList mo23379w() {
        return (PowerList) this.f144055l.getValue();
    }

    /* renamed from: y */
    public final TuxStatusView mo102124y() {
        return (TuxStatusView) this.f144056m.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$h */
    public static final class C63452h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144064a;

        static {
            Covode.recordClassIndex(74759);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63452h(AbstractC12748a aVar) {
            super(0);
            this.f144064a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f144064a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$v */
    public static final class C63466v {
        static {
            Covode.recordClassIndex(74773);
        }

        private C63466v() {
        }

        public /* synthetic */ C63466v(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$d */
    public static final class C63448d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C63448d INSTANCE = new C63448d();

        static {
            Covode.recordClassIndex(74755);
        }

        public C63448d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$g */
    public static final class C63451g extends AbstractC89220m implements AbstractC89171a<C12874b<C63443a>> {
        public static final C63451g INSTANCE = new C63451g();

        static {
            Covode.recordClassIndex(74758);
        }

        public C63451g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C63443a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$i */
    public static final class C63453i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144065a;

        static {
            Covode.recordClassIndex(74760);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63453i(AbstractC12748a aVar) {
            super(0);
            this.f144065a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f144065a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$j */
    public static final class C63454j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144066a;

        static {
            Covode.recordClassIndex(74761);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63454j(AbstractC12748a aVar) {
            super(0);
            this.f144066a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f144066a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$n */
    public static final class C63458n extends AbstractC89220m implements AbstractC89171a<C12874b<C63443a>> {
        public static final C63458n INSTANCE = new C63458n();

        static {
            Covode.recordClassIndex(74765);
        }

        public C63458n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C63443a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$q */
    public static final class C63461q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C63461q INSTANCE = new C63461q();

        static {
            Covode.recordClassIndex(74768);
        }

        public C63461q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$t */
    public static final class C63464t extends AbstractC89220m implements AbstractC89171a<C12874b<C63443a>> {
        public static final C63464t INSTANCE = new C63464t();

        static {
            Covode.recordClassIndex(74771);
        }

        public C63464t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C63443a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$k */
    public static final class C63455k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144067a;

        static {
            Covode.recordClassIndex(74762);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63455k(AbstractC12748a aVar) {
            super(0);
            this.f144067a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f144067a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$m */
    public static final class C63457m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144068a;

        static {
            Covode.recordClassIndex(74764);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63457m(AbstractC12748a aVar) {
            super(0);
            this.f144068a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f144068a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$w */
    static final class C63467w extends AbstractC89220m implements AbstractC89171a<PowerList> {

        /* renamed from: a */
        final /* synthetic */ C63444a f144075a;

        static {
            Covode.recordClassIndex(74774);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63467w(C63444a aVar) {
            super(0);
            this.f144075a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PowerList invoke() {
            return this.f144075a.mo20528t().findViewById(R.id.d54);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$y */
    static final class C63469y extends AbstractC89220m implements AbstractC89171a<TuxStatusView> {

        /* renamed from: a */
        final /* synthetic */ C63444a f144077a;

        static {
            Covode.recordClassIndex(74776);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63469y(C63444a aVar) {
            super(0);
            this.f144077a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxStatusView invoke() {
            return this.f144077a.mo20528t().findViewById(R.id.e7i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$a */
    public static final class C63445a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f144059a;

        static {
            Covode.recordClassIndex(74752);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63445a(AbstractC89277c cVar) {
            super(0);
            this.f144059a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f144059a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$b */
    public static final class C63446b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144060a;

        static {
            Covode.recordClassIndex(74753);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63446b(AbstractC12748a aVar) {
            super(0);
            this.f144060a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f144060a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$c */
    public static final class C63447c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144061a;

        static {
            Covode.recordClassIndex(74754);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63447c(AbstractC12748a aVar) {
            super(0);
            this.f144061a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f144061a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$o */
    public static final class C63459o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144069a;

        static {
            Covode.recordClassIndex(74766);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63459o(AbstractC12748a aVar) {
            super(0);
            this.f144069a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f144069a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$p */
    public static final class C63460p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144070a;

        static {
            Covode.recordClassIndex(74767);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63460p(AbstractC12748a aVar) {
            super(0);
            this.f144070a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f144070a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$r */
    public static final class C63462r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144071a;

        static {
            Covode.recordClassIndex(74769);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63462r(AbstractC12748a aVar) {
            super(0);
            this.f144071a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f144071a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$s */
    public static final class C63463s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144072a;

        static {
            Covode.recordClassIndex(74770);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63463s(AbstractC12748a aVar) {
            super(0);
            this.f144072a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f144072a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$u */
    public static final class C63465u extends AbstractC89220m implements AbstractC89171a<C64349c> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144073a;

        /* renamed from: b */
        final /* synthetic */ String f144074b;

        static {
            Covode.recordClassIndex(74772);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63465u(AbstractC12748a aVar, String str) {
            super(0);
            this.f144073a = aVar;
            this.f144074b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.ui.widget.c, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64349c invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f144073a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.profile.ui.widget.c> r1 = com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64349c.class
                java.lang.String r0 = r3.f144074b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.assem.C63444a.C63465u.invoke():java.lang.Object");
        }
    }

    @Override // com.bytedance.ext_power_list.AbstractC14534m
    /* renamed from: x */
    public final C17693c mo23380x() {
        C17693c cVar = new C17693c();
        cVar.f42319a = 5;
        cVar.f42320b = true;
        return cVar.mo28182a(LoadingFooterCell.class);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$e */
    public static final class C63449e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144062a;

        static {
            Covode.recordClassIndex(74756);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63449e(AbstractC12748a aVar) {
            super(0);
            this.f144062a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f144062a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$f */
    public static final class C63450f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f144063a;

        static {
            Covode.recordClassIndex(74757);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63450f(AbstractC12748a aVar) {
            super(0);
            this.f144063a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f144063a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C63444a() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(MyVideoListVM.class);
        C63445a aVar = new C63445a(a);
        C63456l lVar = C63456l.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C63458n.INSTANCE, new C63459o(this), new C63460p(this), C63461q.INSTANCE, lVar, new C63462r(this), new C63463s(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C63464t.INSTANCE, new C63446b(this), new C63447c(this), C63448d.INSTANCE, lVar, new C63449e(this), new C63450f(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C63451g.INSTANCE, new C63452h(this), new C63453i(this), new C63454j(this), lVar, new C63455k(this), new C63457m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f144057n = bVar;
        this.f144058o = new C12786i(bW_(), new C63465u(this, null));
    }

    @Override // com.bytedance.ext_power_list.AbstractC14534m, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        Fragment fragment;
        String str;
        C89219l.m154721d(view, "");
        super.mo20630b(view);
        C64349c A = m115045A();
        String str2 = null;
        if (A != null) {
            fragment = A.f145884c;
        } else {
            fragment = null;
        }
        this.f144054k = fragment;
        mo23378v().f144040n = this.f144054k;
        PowerList w = mo23379w();
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        w.mo4402a(new C63966a(C89241a.m154730a(TypedValue.applyDimension(1, 1.0f, system.getDisplayMetrics()))));
        mo23379w().mo28083a(MyVideoCell.class);
        Fragment fragment2 = this.f144054k;
        if (fragment2 != null) {
            fragment2.getActivity();
        }
        mo23379w().setLayoutManager(new WrapGridLayoutManager(3, 1));
        mo102124y().mo37867a();
        MyVideoListVM z = mo23378v();
        C64349c A2 = m115045A();
        if (A2 != null) {
            str = A2.f145882a;
        } else {
            str = null;
        }
        z.f144037k = str;
        MyVideoListVM z2 = mo23378v();
        C64349c A3 = m115045A();
        if (A3 != null) {
            str2 = A3.f145883b;
        }
        z2.f144038l = str2;
        AbstractC12818f.C12819a.m23063a(this, mo23378v(), C63473b.f144080a, (C12854k) null, new C63468x(this), 6);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.assem.a$x */
    static final class C63468x extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C63444a f144076a;

        static {
            Covode.recordClassIndex(74775);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63468x(C63444a aVar) {
            super(2);
            this.f144076a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(pVar, "");
            if (booleanValue) {
                this.f144076a.mo102124y().setVisibility(8);
                this.f144076a.mo23379w().setVisibility(0);
            }
            return C89391z.f203057a;
        }
    }
}
