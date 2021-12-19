package com.p2082ss.android.ugc.aweme.comment.page.tag.p2501a;

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
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36410g;
import com.p2082ss.android.ugc.aweme.comment.page.tag.C36863c;
import com.p2082ss.android.ugc.aweme.comment.page.tag.C36864d;
import com.p2082ss.android.ugc.aweme.comment.page.tag.C36888e;
import com.p2082ss.android.ugc.aweme.comment.page.tag.C36889f;
import com.p2082ss.android.ugc.aweme.comment.page.tag.FeedTaggedEditCell;
import com.p2082ss.android.ugc.aweme.comment.page.tag.FeedTaggedListCell;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.C36945f;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.EnumC36944e;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.FeedTaggedListViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import dagger.hilt.android.internal.p4539b.C88098a;
import java.util.ArrayList;
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

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.a */
public final class C36652a extends AbstractC12769a {

    /* renamed from: j */
    private final C12814b f86643j;

    /* renamed from: k */
    private PowerList f86644k;

    /* renamed from: l */
    private final C12786i f86645l;

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.a$j */
    public static final class C36662j extends AbstractC89220m implements AbstractC89172b<C36945f, C36945f> {
        public static final C36662j INSTANCE = new C36662j();

        static {
            Covode.recordClassIndex(43999);
        }

        public C36662j() {
            super(1);
        }

        public final C36945f invoke(C36945f fVar) {
            C89219l.m154719c(fVar, "");
            return fVar;
        }
    }

    static {
        Covode.recordClassIndex(43989);
    }

    /* renamed from: v */
    private final C36864d.C36878n m74460v() {
        return (C36864d.C36878n) this.f86645l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.a$g */
    public static final class C36659g extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86651a;

        static {
            Covode.recordClassIndex(43996);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36659g(AbstractC12748a aVar) {
            super(0);
            this.f86651a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f86651a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.a$f */
    public static final class C36658f extends AbstractC89220m implements AbstractC89171a<C12874b<C36945f>> {
        public static final C36658f INSTANCE = new C36658f();

        static {
            Covode.recordClassIndex(43995);
        }

        public C36658f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36945f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.a$h */
    public static final class C36660h extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86652a;

        static {
            Covode.recordClassIndex(43997);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36660h(AbstractC12748a aVar) {
            super(0);
            this.f86652a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f86652a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.a$l */
    public static final class C36664l extends AbstractC89220m implements AbstractC89171a<C12874b<C36945f>> {
        public static final C36664l INSTANCE = new C36664l();

        static {
            Covode.recordClassIndex(44001);
        }

        public C36664l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36945f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.a$q */
    public static final class C36669q extends AbstractC89220m implements AbstractC89171a<C12874b<C36945f>> {
        public static final C36669q INSTANCE = new C36669q();

        static {
            Covode.recordClassIndex(44006);
        }

        public C36669q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C36945f> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.a$i */
    public static final class C36661i extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86653a;

        static {
            Covode.recordClassIndex(43998);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36661i(AbstractC12748a aVar) {
            super(0);
            this.f86653a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f86653a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.a$k */
    public static final class C36663k extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86654a;

        static {
            Covode.recordClassIndex(44000);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36663k(AbstractC12748a aVar) {
            super(0);
            this.f86654a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f86654a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.a$t */
    static final class C36672t extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ C36652a f86662a;

        static {
            Covode.recordClassIndex(44009);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36672t(C36652a aVar) {
            super(0);
            this.f86662a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1175ad.AbstractC1177b invoke() {
            C1175ad.AbstractC1177b a = C88098a.m153168a(C12777b.m23004b(this.f86662a));
            if (a == null) {
                C89219l.m154715b();
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.a$a */
    public static final class C36653a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f86646a;

        static {
            Covode.recordClassIndex(43990);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36653a(AbstractC89277c cVar) {
            super(0);
            this.f86646a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f86646a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.a$b */
    public static final class C36654b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86647a;

        static {
            Covode.recordClassIndex(43991);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36654b(AbstractC12748a aVar) {
            super(0);
            this.f86647a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86647a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.a$c */
    public static final class C36655c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86648a;

        static {
            Covode.recordClassIndex(43992);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36655c(AbstractC12748a aVar) {
            super(0);
            this.f86648a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86648a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.a$m */
    public static final class C36665m extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86655a;

        static {
            Covode.recordClassIndex(44002);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36665m(AbstractC12748a aVar) {
            super(0);
            this.f86655a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86655a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.a$n */
    public static final class C36666n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86656a;

        static {
            Covode.recordClassIndex(44003);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36666n(AbstractC12748a aVar) {
            super(0);
            this.f86656a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86656a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.a$o */
    public static final class C36667o extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86657a;

        static {
            Covode.recordClassIndex(44004);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36667o(AbstractC12748a aVar) {
            super(0);
            this.f86657a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86657a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.a$p */
    public static final class C36668p extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86658a;

        static {
            Covode.recordClassIndex(44005);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36668p(AbstractC12748a aVar) {
            super(0);
            this.f86658a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f86658a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.a$r */
    public static final class C36670r extends AbstractC89220m implements AbstractC89171a<C36864d.C36878n> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86659a;

        /* renamed from: b */
        final /* synthetic */ String f86660b;

        static {
            Covode.recordClassIndex(44007);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36670r(AbstractC12748a aVar, String str) {
            super(0);
            this.f86659a = aVar;
            this.f86660b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.comment.page.tag.d$n, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.comment.page.tag.C36864d.C36878n invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f86659a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.comment.page.tag.d$n> r1 = com.p2082ss.android.ugc.aweme.comment.page.tag.C36864d.C36878n.class
                java.lang.String r0 = r3.f86660b
                java.lang.Object r0 = r2.mo20603a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.page.tag.p2501a.C36652a.C36670r.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.a$d */
    public static final class C36656d extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86649a;

        static {
            Covode.recordClassIndex(43993);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36656d(AbstractC12748a aVar) {
            super(0);
            this.f86649a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86649a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.a$e */
    public static final class C36657e extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f86650a;

        static {
            Covode.recordClassIndex(43994);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36657e(AbstractC12748a aVar) {
            super(0);
            this.f86650a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f86650a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C36652a() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        C36672t tVar = new C36672t(this);
        AbstractC89277c a = C89204ab.m154669a(FeedTaggedListViewModel.class);
        C36653a aVar = new C36653a(a);
        C36662j jVar = C36662j.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C36664l.INSTANCE, new C36665m(this), new C36666n(this), tVar, jVar, new C36667o(this), new C36668p(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C36669q.INSTANCE, new C36654b(this), new C36655c(this), tVar, jVar, new C36656d(this), new C36657e(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C36658f.INSTANCE, new C36659g(this), new C36660h(this), tVar, jVar, new C36661i(this), new C36663k(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f86643j = bVar;
        this.f86645l = new C12786i(bW_(), new C36670r(this, null));
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        PowerList powerList = (PowerList) mo20528t().findViewById(R.id.b18);
        C89219l.m154716b(powerList, "");
        this.f86644k = powerList;
        if (powerList == null) {
            C89219l.m154710a("taggedList");
        }
        if (powerList != null) {
            powerList.mo28083a(FeedTaggedListCell.class, FeedTaggedEditCell.class);
            powerList.setItemAnimator(null);
        }
        ArrayList<User> arrayList = m74460v().f86866b;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) arrayList, 10));
            for (T t : arrayList) {
                PowerList powerList2 = this.f86644k;
                if (powerList2 == null) {
                    C89219l.m154710a("taggedList");
                }
                powerList2.getState().mo28132a(new C36888e(t, new C36889f(m74460v().f86865a, m74460v().f86867c)));
                arrayList2.add(C89391z.f203057a);
            }
        }
        Aweme aweme = m74460v().f86865a;
        if (aweme != null && C36410g.m74112c() && C80580in.m139681a(aweme.getAuthorUid())) {
            PowerList powerList3 = this.f86644k;
            if (powerList3 == null) {
                C89219l.m154710a("taggedList");
            }
            powerList3.getState().mo28132a(new C36863c(new C36889f(aweme, m74460v().f86867c)));
        }
        AbstractC12818f.C12819a.m23063a(this, (FeedTaggedListViewModel) this.f86643j.getValue(), C36673b.f86663a, (C12854k) null, C36671s.f86661a, 6);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.a.a$s */
    static final class C36671s extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends EnumC36944e>, C89391z> {

        /* renamed from: a */
        public static final C36671s f86661a = new C36671s();

        static {
            Covode.recordClassIndex(44008);
        }

        C36671s() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends EnumC36944e> aVar) {
            AbstractC12766p pVar2 = pVar;
            C12776a<? extends EnumC36944e> aVar2 = aVar;
            C89219l.m154721d(pVar2, "");
            if (!(aVar2 == null || aVar2.f31085a == null)) {
                ((TuxIconView) pVar2.mo20528t().findViewById(R.id.a6u)).performClick();
            }
            return C89391z.f203057a;
        }
    }
}
