package com.p2082ss.android.ugc.aweme.qna.p3643a;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
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
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.p4205v.p4206a.C80638a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qna.api.C66006c;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66360f;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.QnaBannerViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.qna.a.b */
public final class C65885b extends AbstractC12769a {

    /* renamed from: j */
    Activity f148453j;

    /* renamed from: k */
    public boolean f148454k;

    /* renamed from: l */
    public ArrayList<User> f148455l;

    /* renamed from: m */
    private final C12786i f148456m = new C12786i(bW_(), new C65906u(this, null));

    /* renamed from: n */
    private C80638a f148457n;

    /* renamed from: o */
    private final C12814b f148458o;

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$l */
    public static final class C65897l extends AbstractC89220m implements AbstractC89172b<C66360f, C66360f> {
        public static final C65897l INSTANCE = new C65897l();

        static {
            Covode.recordClassIndex(77402);
        }

        public C65897l() {
            super(1);
        }

        public final C66360f invoke(C66360f fVar) {
            C89219l.m154719c(fVar, "");
            return fVar;
        }
    }

    static {
        Covode.recordClassIndex(77390);
    }

    /* renamed from: v */
    private final QnaBannerViewModel m117807v() {
        return (QnaBannerViewModel) this.f148458o.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$h */
    public static final class C65893h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148464a;

        static {
            Covode.recordClassIndex(77398);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65893h(AbstractC12748a aVar) {
            super(0);
            this.f148464a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f148464a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$d */
    public static final class C65889d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C65889d INSTANCE = new C65889d();

        static {
            Covode.recordClassIndex(77394);
        }

        public C65889d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$g */
    public static final class C65892g extends AbstractC89220m implements AbstractC89171a<C12874b<C66360f>> {
        public static final C65892g INSTANCE = new C65892g();

        static {
            Covode.recordClassIndex(77397);
        }

        public C65892g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66360f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$i */
    public static final class C65894i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148465a;

        static {
            Covode.recordClassIndex(77399);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65894i(AbstractC12748a aVar) {
            super(0);
            this.f148465a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f148465a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$j */
    public static final class C65895j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148466a;

        static {
            Covode.recordClassIndex(77400);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65895j(AbstractC12748a aVar) {
            super(0);
            this.f148466a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f148466a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$n */
    public static final class C65899n extends AbstractC89220m implements AbstractC89171a<C12874b<C66360f>> {
        public static final C65899n INSTANCE = new C65899n();

        static {
            Covode.recordClassIndex(77404);
        }

        public C65899n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66360f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$q */
    public static final class C65902q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C65902q INSTANCE = new C65902q();

        static {
            Covode.recordClassIndex(77407);
        }

        public C65902q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$t */
    public static final class C65905t extends AbstractC89220m implements AbstractC89171a<C12874b<C66360f>> {
        public static final C65905t INSTANCE = new C65905t();

        static {
            Covode.recordClassIndex(77410);
        }

        public C65905t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66360f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$k */
    public static final class C65896k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148467a;

        static {
            Covode.recordClassIndex(77401);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65896k(AbstractC12748a aVar) {
            super(0);
            this.f148467a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f148467a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$m */
    public static final class C65898m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148468a;

        static {
            Covode.recordClassIndex(77403);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65898m(AbstractC12748a aVar) {
            super(0);
            this.f148468a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f148468a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$a */
    public static final class C65886a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f148459a;

        static {
            Covode.recordClassIndex(77391);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65886a(AbstractC89277c cVar) {
            super(0);
            this.f148459a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f148459a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$b */
    public static final class C65887b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148460a;

        static {
            Covode.recordClassIndex(77392);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65887b(AbstractC12748a aVar) {
            super(0);
            this.f148460a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f148460a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$c */
    public static final class C65888c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148461a;

        static {
            Covode.recordClassIndex(77393);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65888c(AbstractC12748a aVar) {
            super(0);
            this.f148461a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f148461a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$o */
    public static final class C65900o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148469a;

        static {
            Covode.recordClassIndex(77405);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65900o(AbstractC12748a aVar) {
            super(0);
            this.f148469a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f148469a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$p */
    public static final class C65901p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148470a;

        static {
            Covode.recordClassIndex(77406);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65901p(AbstractC12748a aVar) {
            super(0);
            this.f148470a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f148470a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$r */
    public static final class C65903r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148471a;

        static {
            Covode.recordClassIndex(77408);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65903r(AbstractC12748a aVar) {
            super(0);
            this.f148471a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f148471a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$s */
    public static final class C65904s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148472a;

        static {
            Covode.recordClassIndex(77409);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65904s(AbstractC12748a aVar) {
            super(0);
            this.f148472a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f148472a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$u */
    public static final class C65906u extends AbstractC89220m implements AbstractC89171a<C66006c> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148473a;

        /* renamed from: b */
        final /* synthetic */ String f148474b;

        static {
            Covode.recordClassIndex(77411);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65906u(AbstractC12748a aVar, String str) {
            super(0);
            this.f148473a = aVar;
            this.f148474b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.qna.api.c, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.qna.api.C66006c invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f148473a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.qna.api.c> r1 = com.p2082ss.android.ugc.aweme.qna.api.C66006c.class
                java.lang.String r0 = r3.f148474b
                java.lang.Object r0 = r2.mo20603a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.qna.p3643a.C65885b.C65906u.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$e */
    public static final class C65890e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148462a;

        static {
            Covode.recordClassIndex(77395);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65890e(AbstractC12748a aVar) {
            super(0);
            this.f148462a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f148462a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$f */
    public static final class C65891f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f148463a;

        static {
            Covode.recordClassIndex(77396);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65891f(AbstractC12748a aVar) {
            super(0);
            this.f148463a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f148463a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C65885b() {
        C12814b bVar;
        AbstractC12848i.C12849a aVar = AbstractC12848i.C12849a.f31275a;
        AbstractC89277c a = C89204ab.m154669a(QnaBannerViewModel.class);
        C65886a aVar2 = new C65886a(a);
        C65897l lVar = C65897l.INSTANCE;
        if (C89219l.m154714a(aVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar2, C65899n.INSTANCE, new C65900o(this), new C65901p(this), C65902q.INSTANCE, lVar, new C65903r(this), new C65904s(this));
        } else if (C89219l.m154714a(aVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar2, C65905t.INSTANCE, new C65887b(this), new C65888c(this), C65889d.INSTANCE, lVar, new C65890e(this), new C65891f(this));
        } else if (aVar == null || C89219l.m154714a(aVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar2, C65892g.INSTANCE, new C65893h(this), new C65894i(this), new C65895j(this), lVar, new C65896k(this), new C65898m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f148458o = bVar;
        this.f148455l = new ArrayList<>();
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$v */
    static final class View$OnClickListenerC65907v implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f148475a;

        static {
            Covode.recordClassIndex(77412);
        }

        View$OnClickListenerC65907v(AbstractC89172b bVar) {
            this.f148475a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                AbstractC89172b bVar = this.f148475a;
                C89219l.m154716b(view, "");
                bVar.invoke(view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$y */
    static final class C65910y extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65885b f148478a;

        static {
            Covode.recordClassIndex(77415);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65910y(C65885b bVar) {
            super(1);
            this.f148478a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            String str;
            C89219l.m154721d(view, "");
            C65885b bVar = this.f148478a;
            Activity activity = bVar.f148453j;
            if (activity == null) {
                C89219l.m154710a("activity");
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//user/ask/");
            if (bVar.f148454k) {
                str = "qa_personal_profile";
            } else {
                str = "qa_others_profile";
            }
            buildRoute.withParam("enter_from", str).withParam("enter_method", "ask_question").withParam("invited_users", bVar.f148455l).open();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        View view2;
        boolean z;
        C89219l.m154721d(view, "");
        ActivityC0945e b = C12777b.m23004b(this);
        if (b != null) {
            this.f148453j = b;
            String str = ((C66006c) this.f148456m.getValue()).f148594c;
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            this.f148454k = TextUtils.equals(str, g.getCurUserId());
            view.setVisibility(0);
            Activity activity = this.f148453j;
            if (activity == null) {
                C89219l.m154710a("activity");
            }
            Activity activity2 = this.f148453j;
            if (activity2 == null) {
                C89219l.m154710a("activity");
            }
            LayoutInflater layoutInflater = activity2.getLayoutInflater();
            C89219l.m154716b(layoutInflater, "");
            C80638a aVar = new C80638a(activity, layoutInflater, R.string.f15);
            this.f148457n = aVar;
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.RelativeLayout");
            aVar.mo70370a((RelativeLayout) view);
            C80638a aVar2 = this.f148457n;
            if (aVar2 != null) {
                IAccountUserService g2 = C31575b.m65865g();
                C89219l.m154716b(g2, "");
                String avatarUrl = g2.getAvatarUrl();
                C89219l.m154716b(avatarUrl, "");
                C89219l.m154721d(avatarUrl, "");
                View view3 = aVar2.f180291a;
                SmartCircleImageView smartCircleImageView = null;
                if (view3 != null) {
                    view2 = view3.findViewById(R.id.e6x);
                } else {
                    view2 = null;
                }
                View view4 = aVar2.f180291a;
                if (view4 != null) {
                    smartCircleImageView = (SmartCircleImageView) view4.findViewById(R.id.e6r);
                }
                if (avatarUrl.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    if (smartCircleImageView != null) {
                        smartCircleImageView.setVisibility(8);
                    }
                } else if (aVar2.f180291a != null) {
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    if (smartCircleImageView != null) {
                        smartCircleImageView.setVisibility(0);
                    }
                    C20766v a = C20761r.m39061a(avatarUrl);
                    a.f49092E = smartCircleImageView;
                    a.mo34186c();
                }
            }
            if (this.f148457n != null) {
                View findViewById = view.findViewById(R.id.e6q);
                C89219l.m154716b(findViewById, "");
                findViewById.setOnClickListener(new View$OnClickListenerC65907v(new C65910y(this)));
            }
            AbstractC12818f.C12819a.m23063a(this, m117807v(), C65911c.f148479a, (C12854k) null, new C65908w(this), 6);
            AbstractC12818f.C12819a.m23063a(this, m117807v(), C65912d.f148480a, (C12854k) null, new C65909x(view), 6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$x */
    static final class C65909x extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f148477a;

        static {
            Covode.recordClassIndex(77414);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65909x(View view) {
            super(2);
            this.f148477a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, Boolean bool) {
            int i;
            Boolean bool2 = bool;
            C89219l.m154721d(pVar, "");
            if (bool2 != null) {
                boolean booleanValue = bool2.booleanValue();
                View view = this.f148477a;
                if (booleanValue) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.a.b$w */
    static final class C65908w extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, User, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65885b f148476a;

        static {
            Covode.recordClassIndex(77413);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65908w(C65885b bVar) {
            super(2);
            this.f148476a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, User user) {
            ArrayList<User> arrayList;
            User user2 = user;
            C89219l.m154721d(pVar, "");
            if (user2 != null) {
                C65885b bVar = this.f148476a;
                String uid = user2.getUid();
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                bVar.f148454k = TextUtils.equals(uid, g.getCurUserId());
                if (!this.f148476a.f148454k && (arrayList = this.f148476a.f148455l) != null) {
                    arrayList.add(0, user2);
                }
            }
            return C89391z.f203057a;
        }
    }
}
