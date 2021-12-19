package com.p2082ss.android.ugc.aweme.recommend.users.profile.p3671ui;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AbstractC14527i;
import com.bytedance.ext_power_list.AbstractC14534m;
import com.bytedance.ext_power_list.C14533l;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendPermissionCell;
import com.p2082ss.android.ugc.aweme.recommend.users.profile.powerlist.RecommendUserCell;
import com.p2082ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.p2082ss.android.ugc.trill.R;
import dagger.hilt.android.internal.p4539b.C88098a;
import java.util.List;
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

/* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b */
public final class C66707b extends AbstractC14534m<UserProfilePublishListRecommendUserVM> {

    /* renamed from: j */
    private final AbstractC89244h f149896j = C89250i.m154773a((AbstractC89171a) new C66726s(this));

    /* renamed from: k */
    private final AbstractC89244h f149897k = C89250i.m154773a((AbstractC89171a) new C66732x(this));

    /* renamed from: l */
    private final C12814b f149898l;

    /* renamed from: m */
    private final C12786i f149899m;

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$j */
    public static final class C66717j extends AbstractC89220m implements AbstractC89172b<C66737f, C66737f> {
        public static final C66717j INSTANCE = new C66717j();

        static {
            Covode.recordClassIndex(78286);
        }

        public C66717j() {
            super(1);
        }

        public final C66737f invoke(C66737f fVar) {
            C89219l.m154719c(fVar, "");
            return fVar;
        }
    }

    static {
        Covode.recordClassIndex(78276);
    }

    @Override // com.bytedance.ext_power_list.AbstractC14534m
    /* renamed from: w */
    public final PowerList mo23379w() {
        return (PowerList) this.f149896j.getValue();
    }

    /* renamed from: y */
    public final TuxStatusView mo105685y() {
        return (TuxStatusView) this.f149897k.getValue();
    }

    /* renamed from: z */
    public final UserProfilePublishListRecommendUserVM mo23378v() {
        return (UserProfilePublishListRecommendUserVM) this.f149898l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$g */
    public static final class C66714g extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f149905a;

        static {
            Covode.recordClassIndex(78283);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66714g(AbstractC12748a aVar) {
            super(0);
            this.f149905a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f149905a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$f */
    public static final class C66713f extends AbstractC89220m implements AbstractC89171a<C12874b<C66737f>> {
        public static final C66713f INSTANCE = new C66713f();

        static {
            Covode.recordClassIndex(78282);
        }

        public C66713f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66737f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$h */
    public static final class C66715h extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f149906a;

        static {
            Covode.recordClassIndex(78284);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66715h(AbstractC12748a aVar) {
            super(0);
            this.f149906a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f149906a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$l */
    public static final class C66719l extends AbstractC89220m implements AbstractC89171a<C12874b<C66737f>> {
        public static final C66719l INSTANCE = new C66719l();

        static {
            Covode.recordClassIndex(78288);
        }

        public C66719l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66737f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$q */
    public static final class C66724q extends AbstractC89220m implements AbstractC89171a<C12874b<C66737f>> {
        public static final C66724q INSTANCE = new C66724q();

        static {
            Covode.recordClassIndex(78293);
        }

        public C66724q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66737f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$i */
    public static final class C66716i extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f149907a;

        static {
            Covode.recordClassIndex(78285);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66716i(AbstractC12748a aVar) {
            super(0);
            this.f149907a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f149907a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$k */
    public static final class C66718k extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f149908a;

        static {
            Covode.recordClassIndex(78287);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66718k(AbstractC12748a aVar) {
            super(0);
            this.f149908a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f149908a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$s */
    static final class C66726s extends AbstractC89220m implements AbstractC89171a<PowerList> {

        /* renamed from: a */
        final /* synthetic */ C66707b f149915a;

        static {
            Covode.recordClassIndex(78295);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66726s(C66707b bVar) {
            super(0);
            this.f149915a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PowerList invoke() {
            return this.f149915a.mo20528t().findViewById(R.id.d54);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$x */
    static final class C66732x extends AbstractC89220m implements AbstractC89171a<TuxStatusView> {

        /* renamed from: a */
        final /* synthetic */ C66707b f149922a;

        static {
            Covode.recordClassIndex(78301);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66732x(C66707b bVar) {
            super(0);
            this.f149922a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxStatusView invoke() {
            return this.f149922a.mo20528t().findViewById(R.id.e7i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$y */
    static final class C66733y extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C66707b f149923a;

        static {
            Covode.recordClassIndex(78302);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66733y(C66707b bVar) {
            super(0);
            this.f149923a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            C1175ad.AbstractC1177b a = C88098a.m153168a(C12777b.m23004b(this.f149923a));
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$a */
    public static final class C66708a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f149900a;

        static {
            Covode.recordClassIndex(78277);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66708a(AbstractC89277c cVar) {
            super(0);
            this.f149900a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f149900a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$b */
    public static final class C66709b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f149901a;

        static {
            Covode.recordClassIndex(78278);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66709b(AbstractC12748a aVar) {
            super(0);
            this.f149901a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f149901a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$c */
    public static final class C66710c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f149902a;

        static {
            Covode.recordClassIndex(78279);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66710c(AbstractC12748a aVar) {
            super(0);
            this.f149902a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f149902a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$m */
    public static final class C66720m extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f149909a;

        static {
            Covode.recordClassIndex(78289);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66720m(AbstractC12748a aVar) {
            super(0);
            this.f149909a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f149909a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$n */
    public static final class C66721n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f149910a;

        static {
            Covode.recordClassIndex(78290);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66721n(AbstractC12748a aVar) {
            super(0);
            this.f149910a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f149910a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$o */
    public static final class C66722o extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f149911a;

        static {
            Covode.recordClassIndex(78291);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66722o(AbstractC12748a aVar) {
            super(0);
            this.f149911a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f149911a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$p */
    public static final class C66723p extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f149912a;

        static {
            Covode.recordClassIndex(78292);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66723p(AbstractC12748a aVar) {
            super(0);
            this.f149912a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f149912a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$r */
    public static final class C66725r extends AbstractC89220m implements AbstractC89171a<C66746l> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f149913a;

        /* renamed from: b */
        final /* synthetic */ String f149914b;

        static {
            Covode.recordClassIndex(78294);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66725r(AbstractC12748a aVar, String str) {
            super(0);
            this.f149913a = aVar;
            this.f149914b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.ss.android.ugc.aweme.recommend.users.profile.ui.l] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.recommend.users.profile.p3671ui.C66746l invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f149913a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.recommend.users.profile.ui.l> r1 = com.p2082ss.android.ugc.aweme.recommend.users.profile.p3671ui.C66746l.class
                java.lang.String r0 = r3.f149914b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.recommend.users.profile.p3671ui.C66707b.C66725r.invoke():java.lang.Object");
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

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$d */
    public static final class C66711d extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f149903a;

        static {
            Covode.recordClassIndex(78280);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66711d(AbstractC12748a aVar) {
            super(0);
            this.f149903a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f149903a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$e */
    public static final class C66712e extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f149904a;

        static {
            Covode.recordClassIndex(78281);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66712e(AbstractC12748a aVar) {
            super(0);
            this.f149904a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f149904a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C66707b() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        C66733y yVar = new C66733y(this);
        AbstractC89277c a = C89204ab.m154669a(UserProfilePublishListRecommendUserVM.class);
        C66708a aVar = new C66708a(a);
        C66717j jVar = C66717j.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C66719l.INSTANCE, new C66720m(this), new C66721n(this), yVar, jVar, new C66722o(this), new C66723p(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C66724q.INSTANCE, new C66709b(this), new C66710c(this), yVar, jVar, new C66711d(this), new C66712e(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C66713f.INSTANCE, new C66714g(this), new C66715h(this), yVar, jVar, new C66716i(this), new C66718k(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f149898l = bVar;
        this.f149899m = new C12786i(bW_(), new C66725r(this, null));
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$v */
    static final class C66729v extends AbstractC89220m implements AbstractC89172b<C14533l, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66707b f149918a;

        static {
            Covode.recordClassIndex(78298);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66729v(C66707b bVar) {
            super(1);
            this.f149918a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C14533l lVar) {
            final C14533l lVar2 = lVar;
            C89219l.m154721d(lVar2, "");
            C66707b.m22977a(this.f149918a.mo23378v(), new AbstractC89172b<C66737f, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.recommend.users.profile.p3671ui.C66707b.C66729v.C667301 */

                /* renamed from: a */
                final /* synthetic */ C66729v f149919a;

                static {
                    Covode.recordClassIndex(78299);
                }

                {
                    this.f149919a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C66737f fVar) {
                    C66737f fVar2 = fVar;
                    C89219l.m154721d(fVar2, "");
                    List b = AbstractC14527i.C14528a.m26537b(fVar2);
                    if ((b == null || b.isEmpty()) && lVar2.f35142b) {
                        this.f149919a.f149918a.mo23378v().mo23339a((Object) null);
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$w */
    static final class View$OnClickListenerC66731w implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f149921a;

        static {
            Covode.recordClassIndex(78300);
        }

        View$OnClickListenerC66731w(View view) {
            this.f149921a = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Activity a = C34729o.m70950a(this.f149921a.getContext());
            if (a != null) {
                C63419ae.f143971a.mo101955a(a, "others_homepage", "others_homepage");
            }
            C39162r.m79460a("click_suggested_account_information", new C33744d().mo59983a("enter_from", "others_homepage").f79943a);
        }
    }

    @Override // com.bytedance.ext_power_list.AbstractC14534m, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        User user;
        C89219l.m154721d(view, "");
        super.mo20630b(view);
        mo23379w().mo28083a(RecommendUserCell.class, RecommendPermissionCell.class);
        az_();
        mo23379w().setLayoutManager(new LinearLayoutManager());
        mo105685y().mo37867a();
        View a = C1764a.m5927a(LayoutInflater.from(az_()), R.layout.bhh, mo23379w(), false);
        a.findViewById(R.id.eia).setOnClickListener(new View$OnClickListenerC66731w(view));
        mo23379w().mo28079a(0, a);
        UserProfilePublishListRecommendUserVM z = mo23378v();
        C66746l lVar = (C66746l) this.f149899m.getValue();
        if (lVar != null) {
            user = lVar.f149939a;
        } else {
            user = null;
        }
        z.f149866m = user;
        AbstractC12818f.C12819a.m23063a(this, mo23378v(), C66734c.f149924a, (C12854k) null, new C66727t(this), 6);
        AbstractC12818f.C12819a.m23063a(this, mo23378v(), C66735d.f149925a, (C12854k) null, new C66728u(this), 6);
        AssemViewModel.m23030a(mo23378v(), C66736e.f149926a, null, null, null, new C66729v(this), 14);
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$t */
    static final class C66727t extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66707b f149916a;

        static {
            Covode.recordClassIndex(78296);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66727t(C66707b bVar) {
            super(2);
            this.f149916a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(pVar, "");
            this.f149916a.mo23379w().mo4435d(intValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.ui.b$u */
    static final class C66728u extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66707b f149917a;

        static {
            Covode.recordClassIndex(78297);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66728u(C66707b bVar) {
            super(2);
            this.f149917a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(pVar, "");
            if (booleanValue) {
                this.f149917a.mo105685y().setVisibility(8);
            }
            return C89391z.f203057a;
        }
    }
}
