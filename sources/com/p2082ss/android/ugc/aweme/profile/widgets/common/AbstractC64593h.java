package com.p2082ss.android.ugc.aweme.profile.widgets.common;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.refresh.TuxRefreshLayout;
import com.bytedance.tux.widget.spring.EnumC23427e;
import com.bytedance.tux.widget.spring.EnumC23429g;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64522c;
import com.p2082ss.android.ugc.aweme.story.avatar.C76587p;
import com.p2082ss.android.ugc.aweme.story.avatar.ProfileStoryRingViewModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4161b.C79365a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.h */
public abstract class AbstractC64593h extends AbstractC12769a implements AbstractC64616j {

    /* renamed from: j */
    public SpringLayout f146312j;

    /* renamed from: k */
    final C12814b f146313k;

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.h$l */
    public static final class C64605l extends AbstractC89220m implements AbstractC89172b<C76587p, C76587p> {
        public static final C64605l INSTANCE = new C64605l();

        static {
            Covode.recordClassIndex(76071);
        }

        public C64605l() {
            super(1);
        }

        public final C76587p invoke(C76587p pVar) {
            C89219l.m154719c(pVar, "");
            return pVar;
        }
    }

    static {
        Covode.recordClassIndex(76059);
    }

    /* renamed from: w */
    public abstract String mo104145w();

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.h$h */
    public static final class C64601h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146319a;

        static {
            Covode.recordClassIndex(76067);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64601h(AbstractC12748a aVar) {
            super(0);
            this.f146319a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f146319a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.h$d */
    public static final class C64597d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C64597d INSTANCE = new C64597d();

        static {
            Covode.recordClassIndex(76063);
        }

        public C64597d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.h$g */
    public static final class C64600g extends AbstractC89220m implements AbstractC89171a<C12874b<C76587p>> {
        public static final C64600g INSTANCE = new C64600g();

        static {
            Covode.recordClassIndex(76066);
        }

        public C64600g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C76587p> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.h$i */
    public static final class C64602i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146320a;

        static {
            Covode.recordClassIndex(76068);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64602i(AbstractC12748a aVar) {
            super(0);
            this.f146320a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f146320a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.h$j */
    public static final class C64603j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146321a;

        static {
            Covode.recordClassIndex(76069);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64603j(AbstractC12748a aVar) {
            super(0);
            this.f146321a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f146321a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.h$n */
    public static final class C64607n extends AbstractC89220m implements AbstractC89171a<C12874b<C76587p>> {
        public static final C64607n INSTANCE = new C64607n();

        static {
            Covode.recordClassIndex(76073);
        }

        public C64607n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C76587p> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.h$q */
    public static final class C64610q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C64610q INSTANCE = new C64610q();

        static {
            Covode.recordClassIndex(76076);
        }

        public C64610q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.h$t */
    public static final class C64613t extends AbstractC89220m implements AbstractC89171a<C12874b<C76587p>> {
        public static final C64613t INSTANCE = new C64613t();

        static {
            Covode.recordClassIndex(76079);
        }

        public C64613t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C76587p> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.h$k */
    public static final class C64604k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146322a;

        static {
            Covode.recordClassIndex(76070);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64604k(AbstractC12748a aVar) {
            super(0);
            this.f146322a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f146322a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.h$m */
    public static final class C64606m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146323a;

        static {
            Covode.recordClassIndex(76072);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64606m(AbstractC12748a aVar) {
            super(0);
            this.f146323a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f146323a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.h$a */
    public static final class C64594a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f146314a;

        static {
            Covode.recordClassIndex(76060);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64594a(AbstractC89277c cVar) {
            super(0);
            this.f146314a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f146314a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.h$b */
    public static final class C64595b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146315a;

        static {
            Covode.recordClassIndex(76061);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64595b(AbstractC12748a aVar) {
            super(0);
            this.f146315a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f146315a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.h$c */
    public static final class C64596c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146316a;

        static {
            Covode.recordClassIndex(76062);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64596c(AbstractC12748a aVar) {
            super(0);
            this.f146316a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f146316a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.h$o */
    public static final class C64608o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146324a;

        static {
            Covode.recordClassIndex(76074);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64608o(AbstractC12748a aVar) {
            super(0);
            this.f146324a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f146324a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.h$p */
    public static final class C64609p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146325a;

        static {
            Covode.recordClassIndex(76075);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64609p(AbstractC12748a aVar) {
            super(0);
            this.f146325a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f146325a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.h$r */
    public static final class C64611r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146326a;

        static {
            Covode.recordClassIndex(76077);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64611r(AbstractC12748a aVar) {
            super(0);
            this.f146326a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f146326a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.h$s */
    public static final class C64612s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146327a;

        static {
            Covode.recordClassIndex(76078);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64612s(AbstractC12748a aVar) {
            super(0);
            this.f146327a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f146327a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.h$e */
    public static final class C64598e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146317a;

        static {
            Covode.recordClassIndex(76064);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64598e(AbstractC12748a aVar) {
            super(0);
            this.f146317a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f146317a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.h$f */
    public static final class C64599f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146318a;

        static {
            Covode.recordClassIndex(76065);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64599f(AbstractC12748a aVar) {
            super(0);
            this.f146318a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f146318a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.h$u */
    public static final class C64614u extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC64593h f146328a;

        static {
            Covode.recordClassIndex(76080);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64614u(AbstractC64593h hVar) {
            super(0);
            this.f146328a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC64616j.C64617a.m116533a(this.f146328a, EnumC64592g.NORMAL, 1);
            AbstractC64522c cVar = (AbstractC64522c) C12801d.m23028e(this.f146328a, C89204ab.m154669a(AbstractC64522c.class));
            if (cVar != null) {
                cVar.mo104095O();
            }
            C39162r.m79460a("refresh_page", new C33744d().mo59983a("enter_from", this.f146328a.mo104145w()).f79943a);
            ((ProfileStoryRingViewModel) this.f146328a.f146313k.getValue()).mo120227a("pull");
            return C89391z.f203057a;
        }
    }

    public AbstractC64593h() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(ProfileStoryRingViewModel.class);
        C64594a aVar = new C64594a(a);
        C64605l lVar = C64605l.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C64607n.INSTANCE, new C64608o(this), new C64609p(this), C64610q.INSTANCE, lVar, new C64611r(this), new C64612s(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C64613t.INSTANCE, new C64595b(this), new C64596c(this), C64597d.INSTANCE, lVar, new C64598e(this), new C64599f(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C64600g.INSTANCE, new C64601h(this), new C64602i(this), new C64603j(this), lVar, new C64604k(this), new C64606m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f146313k = bVar;
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public void mo20630b(View view) {
        C89219l.m154721d(view, "");
        this.f146312j = (TuxRefreshLayout) view.findViewById(R.id.dhb);
        if (C79365a.m138152a()) {
            SpringLayout springLayout = this.f146312j;
            if (springLayout != null) {
                springLayout.setOnRefreshListener(new C64614u(this));
                return;
            }
            return;
        }
        SpringLayout springLayout2 = this.f146312j;
        if (springLayout2 != null) {
            springLayout2.setNestedHeader(null);
        }
        SpringLayout springLayout3 = this.f146312j;
        if (springLayout3 != null) {
            springLayout3.setOverScrollMode(EnumC23427e.NONE);
        }
        SpringLayout springLayout4 = this.f146312j;
        if (springLayout4 != null) {
            springLayout4.setScrollMode(EnumC23429g.NONE);
        }
    }
}
