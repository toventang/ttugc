package com.p2082ss.android.ugc.aweme.comment.page.tag.p2501a;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.C17656f;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.comment.page.tag.C36890g;
import com.p2082ss.android.ugc.aweme.comment.page.tag.SelectedListCell;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.C36940a;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.C36943d;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
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

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.j */
public final class C36711j extends AbstractC12769a {

    /* renamed from: j */
    PowerList f86699j;

    /* renamed from: k */
    private final C12814b f86700k;

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.j$l */
    public static final class C36723l extends AbstractC89220m implements AbstractC89172b<C36943d, C36943d> {
        public static final C36723l INSTANCE = new C36723l();

        static {
            Covode.recordClassIndex(44060);
        }

        public C36723l() {
            super(1);
        }

        public final C36943d invoke(C36943d dVar) {
            C89219l.m154719c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(44048);
    }

    /* renamed from: v */
    public final VideoTagFriendsListViewModel mo64310v() {
        return (VideoTagFriendsListViewModel) this.f86700k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.j$h */
    public static final class C36719h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86706a;

        static {
            Covode.recordClassIndex(44056);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36719h(AbstractC12748a aVar) {
            super(0);
            this.f86706a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f86706a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.j$d */
    public static final class C36715d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C36715d INSTANCE = new C36715d();

        static {
            Covode.recordClassIndex(44052);
        }

        public C36715d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.j$g */
    public static final class C36718g extends AbstractC89220m implements AbstractC89171a<C12874b<C36943d>> {
        public static final C36718g INSTANCE = new C36718g();

        static {
            Covode.recordClassIndex(44055);
        }

        public C36718g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36943d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.j$i */
    public static final class C36720i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86707a;

        static {
            Covode.recordClassIndex(44057);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36720i(AbstractC12748a aVar) {
            super(0);
            this.f86707a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f86707a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.j$j */
    public static final class C36721j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86708a;

        static {
            Covode.recordClassIndex(44058);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36721j(AbstractC12748a aVar) {
            super(0);
            this.f86708a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f86708a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.j$n */
    public static final class C36725n extends AbstractC89220m implements AbstractC89171a<C12874b<C36943d>> {
        public static final C36725n INSTANCE = new C36725n();

        static {
            Covode.recordClassIndex(44062);
        }

        public C36725n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36943d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.j$q */
    public static final class C36728q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C36728q INSTANCE = new C36728q();

        static {
            Covode.recordClassIndex(44065);
        }

        public C36728q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.j$t */
    public static final class C36731t extends AbstractC89220m implements AbstractC89171a<C12874b<C36943d>> {
        public static final C36731t INSTANCE = new C36731t();

        static {
            Covode.recordClassIndex(44068);
        }

        public C36731t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36943d> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.j$k */
    public static final class C36722k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86709a;

        static {
            Covode.recordClassIndex(44059);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36722k(AbstractC12748a aVar) {
            super(0);
            this.f86709a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f86709a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.j$m */
    public static final class C36724m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86710a;

        static {
            Covode.recordClassIndex(44061);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36724m(AbstractC12748a aVar) {
            super(0);
            this.f86710a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f86710a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.j$a */
    public static final class C36712a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f86701a;

        static {
            Covode.recordClassIndex(44049);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36712a(AbstractC89277c cVar) {
            super(0);
            this.f86701a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f86701a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.j$b */
    public static final class C36713b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86702a;

        static {
            Covode.recordClassIndex(44050);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36713b(AbstractC12748a aVar) {
            super(0);
            this.f86702a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86702a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.j$c */
    public static final class C36714c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86703a;

        static {
            Covode.recordClassIndex(44051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36714c(AbstractC12748a aVar) {
            super(0);
            this.f86703a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86703a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.j$o */
    public static final class C36726o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86711a;

        static {
            Covode.recordClassIndex(44063);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36726o(AbstractC12748a aVar) {
            super(0);
            this.f86711a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86711a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.j$p */
    public static final class C36727p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86712a;

        static {
            Covode.recordClassIndex(44064);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36727p(AbstractC12748a aVar) {
            super(0);
            this.f86712a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86712a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.j$r */
    public static final class C36729r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86713a;

        static {
            Covode.recordClassIndex(44066);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36729r(AbstractC12748a aVar) {
            super(0);
            this.f86713a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86713a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.j$s */
    public static final class C36730s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86714a;

        static {
            Covode.recordClassIndex(44067);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36730s(AbstractC12748a aVar) {
            super(0);
            this.f86714a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86714a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.j$e */
    public static final class C36716e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86704a;

        static {
            Covode.recordClassIndex(44053);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36716e(AbstractC12748a aVar) {
            super(0);
            this.f86704a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86704a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.j$f */
    public static final class C36717f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86705a;

        static {
            Covode.recordClassIndex(44054);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36717f(AbstractC12748a aVar) {
            super(0);
            this.f86705a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86705a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C36711j() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(VideoTagFriendsListViewModel.class);
        C36712a aVar = new C36712a(a);
        C36723l lVar = C36723l.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C36725n.INSTANCE, new C36726o(this), new C36727p(this), C36728q.INSTANCE, lVar, new C36729r(this), new C36730s(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C36731t.INSTANCE, new C36713b(this), new C36714c(this), C36715d.INSTANCE, lVar, new C36716e(this), new C36717f(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C36718g.INSTANCE, new C36719h(this), new C36720i(this), new C36721j(this), lVar, new C36722k(this), new C36724m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f86700k = bVar;
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        PowerList powerList = (PowerList) mo20528t().findViewById(R.id.duw);
        powerList.mo28083a(SelectedListCell.class);
        powerList.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.mo4356b(0);
        powerList.setLayoutManager(linearLayoutManager);
        C89219l.m154716b(powerList, "");
        this.f86699j = powerList;
        AbstractC12818f.C12819a.m23063a(this, mo64310v(), C36735k.f86718a, C12856l.m23100a(), new C36732u(this), 4);
        AbstractC12818f.C12819a.m23063a(this, mo64310v(), C36736l.f86719a, C12856l.m23100a(), new C36733v(this), 4);
        AbstractC12818f.C12819a.m23063a(this, mo64310v(), C36737m.f86720a, C12856l.m23100a(), new C36734w(this), 4);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.j$v */
    static final class C36733v extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends IMUser>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C36711j f86716a;

        static {
            Covode.recordClassIndex(44070);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36733v(C36711j jVar) {
            super(2);
            this.f86716a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends IMUser> aVar) {
            T t;
            C12776a<? extends IMUser> aVar2 = aVar;
            C89219l.m154721d(pVar, "");
            if (!(aVar2 == null || (t = aVar2.f31085a) == null)) {
                C36711j jVar = this.f86716a;
                jVar.mo64309a(t, jVar.mo64310v().mo64386c((IMUser) t));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.j$w */
    static final class C36734w extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends IMUser>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C36711j f86717a;

        static {
            Covode.recordClassIndex(44071);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36734w(C36711j jVar) {
            super(2);
            this.f86717a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends IMUser> aVar) {
            T t;
            C12776a<? extends IMUser> aVar2 = aVar;
            C89219l.m154721d(pVar, "");
            if (!(aVar2 == null || (t = aVar2.f31085a) == null)) {
                this.f86717a.mo64309a((IMUser) t, false);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.j$u */
    static final class C36732u extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends C36940a>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C36711j f86715a;

        static {
            Covode.recordClassIndex(44069);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36732u(C36711j jVar) {
            super(2);
            this.f86715a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends C36940a> aVar) {
            C89219l.m154721d(pVar, "");
            C36711j jVar = this.f86715a;
            List<IMUser> j = C89070n.m154590j(jVar.mo64310v().mo64388i());
            PowerList powerList = jVar.f86699j;
            if (powerList == null) {
                C89219l.m154710a("selectedList");
            }
            C17656f<AbstractC17641a> state = powerList.getState();
            state.mo28128a();
            for (IMUser iMUser : j) {
                state.mo28132a(new C36890g(iMUser));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo64309a(IMUser iMUser, boolean z) {
        PowerList powerList = this.f86699j;
        if (powerList == null) {
            C89219l.m154710a("selectedList");
        }
        C17656f<AbstractC17641a> state = powerList.getState();
        if (z) {
            state.mo28132a(new C36890g(iMUser));
            PowerList powerList2 = this.f86699j;
            if (powerList2 == null) {
                C89219l.m154710a("selectedList");
            }
            PowerList powerList3 = this.f86699j;
            if (powerList3 == null) {
                C89219l.m154710a("selectedList");
            }
            powerList2.mo4413b(powerList3.getState().mo28134b() - 1);
            return;
        }
        state.mo28137b(new C36890g(iMUser));
    }
}
