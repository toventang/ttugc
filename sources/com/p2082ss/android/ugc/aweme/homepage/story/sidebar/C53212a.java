package com.p2082ss.android.ugc.aweme.homepage.story.sidebar;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.assem.arch.p797d.AbstractC12770b;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1722h.C23159f;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.homepage.story.container.DrawerViewModel;
import com.p2082ss.android.ugc.aweme.homepage.story.feed.C53110d;
import com.p2082ss.android.ugc.aweme.homepage.story.feed.C53111e;
import com.p2082ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM;
import com.p2082ss.android.ugc.aweme.homepage.story.p3054c.C53031b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.p2082ss.android.ugc.aweme.story.C77260g;
import com.p2082ss.android.ugc.aweme.story.p4024c.C76660b;
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
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a */
public final class C53212a extends AbstractC12770b implements IAccountService.AbstractC31272b, AbstractC53241c {

    /* renamed from: o */
    final AbstractC89244h f122252o;

    /* renamed from: p */
    private final C12814b f122253p;

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$l */
    public static final class C53224l extends AbstractC89220m implements AbstractC89172b<C53110d, C53110d> {
        public static final C53224l INSTANCE = new C53224l();

        static {
            Covode.recordClassIndex(62775);
        }

        public C53224l() {
            super(1);
        }

        public final C53110d invoke(C53110d dVar) {
            C89219l.m154719c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(62763);
    }

    /* renamed from: v */
    public final StorySidebarFeedVM mo89689v() {
        return (StorySidebarFeedVM) this.f122253p.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$h */
    public static final class C53220h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122259a;

        static {
            Covode.recordClassIndex(62771);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53220h(AbstractC12748a aVar) {
            super(0);
            this.f122259a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f122259a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$d */
    public static final class C53216d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C53216d INSTANCE = new C53216d();

        static {
            Covode.recordClassIndex(62767);
        }

        public C53216d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$g */
    public static final class C53219g extends AbstractC89220m implements AbstractC89171a<C12874b<C53110d>> {
        public static final C53219g INSTANCE = new C53219g();

        static {
            Covode.recordClassIndex(62770);
        }

        public C53219g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C53110d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$i */
    public static final class C53221i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122260a;

        static {
            Covode.recordClassIndex(62772);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53221i(AbstractC12748a aVar) {
            super(0);
            this.f122260a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f122260a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$j */
    public static final class C53222j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122261a;

        static {
            Covode.recordClassIndex(62773);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53222j(AbstractC12748a aVar) {
            super(0);
            this.f122261a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f122261a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$n */
    public static final class C53226n extends AbstractC89220m implements AbstractC89171a<C12874b<C53110d>> {
        public static final C53226n INSTANCE = new C53226n();

        static {
            Covode.recordClassIndex(62777);
        }

        public C53226n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C53110d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$q */
    public static final class C53229q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C53229q INSTANCE = new C53229q();

        static {
            Covode.recordClassIndex(62780);
        }

        public C53229q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$t */
    public static final class C53232t extends AbstractC89220m implements AbstractC89171a<C12874b<C53110d>> {
        public static final C53232t INSTANCE = new C53232t();

        static {
            Covode.recordClassIndex(62783);
        }

        public C53232t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C53110d> invoke() {
            return new C12874b<>();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.story.sidebar.AbstractC53241c
    /* renamed from: w */
    public final StorySidebarFeedVM mo89690w() {
        return mo89689v();
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$k */
    public static final class C53223k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122262a;

        static {
            Covode.recordClassIndex(62774);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53223k(AbstractC12748a aVar) {
            super(0);
            this.f122262a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f122262a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$m */
    public static final class C53225m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122263a;

        static {
            Covode.recordClassIndex(62776);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53225m(AbstractC12748a aVar) {
            super(0);
            this.f122263a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f122263a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$u */
    static final class C53233u extends AbstractC89220m implements AbstractC89171a<DrawerViewModel> {

        /* renamed from: a */
        final /* synthetic */ C53212a f122268a;

        static {
            Covode.recordClassIndex(62784);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53233u(C53212a aVar) {
            super(0);
            this.f122268a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DrawerViewModel invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f122268a);
            if (b != null) {
                return DrawerViewModel.C53032a.m97961a(b);
            }
            return null;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        C31575b.m65859a();
        C31575b.f75524a.mo57064a(this);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: p */
    public final void mo20527p() {
        super.mo20527p();
        C31575b.m65859a();
        C31575b.f75524a.mo57066b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$a */
    public static final class C53213a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f122254a;

        static {
            Covode.recordClassIndex(62764);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53213a(AbstractC89277c cVar) {
            super(0);
            this.f122254a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f122254a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$b */
    public static final class C53214b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122255a;

        static {
            Covode.recordClassIndex(62765);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53214b(AbstractC12748a aVar) {
            super(0);
            this.f122255a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f122255a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$c */
    public static final class C53215c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122256a;

        static {
            Covode.recordClassIndex(62766);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53215c(AbstractC12748a aVar) {
            super(0);
            this.f122256a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f122256a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$o */
    public static final class C53227o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122264a;

        static {
            Covode.recordClassIndex(62778);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53227o(AbstractC12748a aVar) {
            super(0);
            this.f122264a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f122264a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$p */
    public static final class C53228p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122265a;

        static {
            Covode.recordClassIndex(62779);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53228p(AbstractC12748a aVar) {
            super(0);
            this.f122265a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f122265a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$r */
    public static final class C53230r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122266a;

        static {
            Covode.recordClassIndex(62781);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53230r(AbstractC12748a aVar) {
            super(0);
            this.f122266a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f122266a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$s */
    public static final class C53231s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122267a;

        static {
            Covode.recordClassIndex(62782);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53231s(AbstractC12748a aVar) {
            super(0);
            this.f122267a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f122267a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$e */
    public static final class C53217e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122257a;

        static {
            Covode.recordClassIndex(62768);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53217e(AbstractC12748a aVar) {
            super(0);
            this.f122257a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f122257a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$f */
    public static final class C53218f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f122258a;

        static {
            Covode.recordClassIndex(62769);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53218f(AbstractC12748a aVar) {
            super(0);
            this.f122258a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f122258a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$v */
    static final class C53234v extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C53212a f122269a;

        static {
            Covode.recordClassIndex(62785);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53234v(C53212a aVar) {
            super(0);
            this.f122269a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f122269a.mo89689v().mo89615a("pull down inside sidebar");
            C53111e eVar = this.f122269a.mo89689v().f122080j;
            String str = eVar.f122133a;
            String str2 = eVar.f122134b;
            String str3 = eVar.f122135c;
            String str4 = eVar.f122136d;
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C39162r.m79460a("westwindow_refresh", new C33744d().mo59983a("enter_from", str).mo59983a("enter_method", str2).mo59983a("notice_type", str3).mo59983a("author_id", str4).f79943a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$x */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC53236x implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C53212a f122271a;

        static {
            Covode.recordClassIndex(62787);
        }

        public final void onGlobalLayout() {
            int i;
            ViewTreeObserver viewTreeObserver = this.f122271a.mo20528t().getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            C53212a aVar = this.f122271a;
            int[] iArr = new int[2];
            View findViewById = aVar.mo20528t().findViewById(R.id.dvt);
            findViewById.getLocationOnScreen(iArr);
            int i2 = iArr[0];
            C89219l.m154716b(findViewById, "");
            int width = i2 + (findViewById.getWidth() / 2);
            int height = iArr[1] + findViewById.getHeight() + StorySidebarListCell.f122207k + (StorySidebarListCell.f122205b / 2);
            Context context = aVar.mo20528t().getContext();
            C89219l.m154716b(context, "");
            if (C23163i.m43663a(context)) {
                Context context2 = aVar.mo20528t().getContext();
                C89219l.m154716b(context2, "");
                i = (C23159f.m43649a(context2) * 2) - width;
            } else {
                i = -width;
            }
            C77260g.f173332a.mo120145a(new int[]{i, height});
        }

        ViewTreeObserver$OnGlobalLayoutListenerC53236x(C53212a aVar) {
            this.f122271a = aVar;
        }
    }

    public C53212a() {
        C12814b bVar;
        AbstractC12848i.C12849a aVar = AbstractC12848i.C12849a.f31275a;
        AbstractC89277c a = C89204ab.m154669a(StorySidebarFeedVM.class);
        C53213a aVar2 = new C53213a(a);
        C53224l lVar = C53224l.INSTANCE;
        if (C89219l.m154714a(aVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar2, C53226n.INSTANCE, new C53227o(this), new C53228p(this), C53229q.INSTANCE, lVar, new C53230r(this), new C53231s(this));
        } else if (C89219l.m154714a(aVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar2, C53232t.INSTANCE, new C53214b(this), new C53215c(this), C53216d.INSTANCE, lVar, new C53217e(this), new C53218f(this));
        } else if (aVar == null || C89219l.m154714a(aVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar2, C53219g.INSTANCE, new C53220h(this), new C53221i(this), new C53222j(this), lVar, new C53223k(this), new C53225m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f122253p = bVar;
        this.f122252o = C89250i.m154773a((AbstractC89171a) new C53233u(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$y */
    static final class C53237y extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C53212a f122272a;

        static {
            Covode.recordClassIndex(62788);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53237y(C53212a aVar) {
            super(1);
            this.f122272a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20582b(this.f122272a, C532381.f122273a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$z */
    static final class View$OnClickListenerC53239z implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C53212a f122274a;

        static {
            Covode.recordClassIndex(62790);
        }

        View$OnClickListenerC53239z(C53212a aVar) {
            this.f122274a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                C53212a aVar = this.f122274a;
                if (C76660b.m134247g() || C76660b.m134248h()) {
                    ActivityC0945e b = C12777b.m23004b(aVar);
                    if (b != null) {
                        AVExternalServiceImpl.m113114a().storyService().startStoryActivity(b, new EnterStoryParam(null, "click_west_window_camera", C53031b.m97955a(b), false, false, false, false, 49, null));
                        return;
                    }
                    return;
                }
                DrawerViewModel drawerViewModel = (DrawerViewModel) aVar.f122252o.getValue();
                if (drawerViewModel != null) {
                    drawerViewModel.mo89466a(1, "click_westwindow_camera");
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        ViewTreeObserver viewTreeObserver = mo20528t().getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC53236x(this));
        }
        C12780d.m23007a(this, new C53237y(this));
        view.setClickable(true);
        ((LinearLayoutCompat) view.findViewById(R.id.ccu)).setOnClickListener(new View$OnClickListenerC53239z(this));
        ((SpringLayout) view.findViewById(R.id.dhb)).setOnRefreshListener(new C53234v(this));
        AbstractC12818f.C12819a.m23063a(this, mo89689v(), C53240b.f122275a, (C12854k) null, new C53235w(view), 6);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$w */
    static final class C53235w extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f122270a;

        static {
            Covode.recordClassIndex(62786);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53235w(View view) {
            super(2);
            this.f122270a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(pVar, "");
            if ((intValue & 2) > 0) {
                ((SpringLayout) this.f122270a.findViewById(R.id.dhb)).setRefreshing(false);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31272b
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        ActivityC0945e b;
        if (z && (b = C12777b.m23004b(this)) != null && !b.isFinishing()) {
            mo89689v().mo89615a("new log in");
        }
    }
}
