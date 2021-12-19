package com.p2082ss.android.ugc.aweme.mix.createmix;

import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.recyclerview.widget.C1465n;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.PowerList;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.mix.createmix.viewholder.MixFeedOrderCell;
import com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.C59528a;
import com.p2082ss.android.ugc.aweme.mix.createmix.viewmodel.MixCreateViewModel;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.AbstractC59733v;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.C59862x;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewholder.C59774b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
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

/* renamed from: com.ss.android.ugc.aweme.mix.createmix.e */
public final class C59444e extends AbstractC12769a implements AbstractC59733v {

    /* renamed from: j */
    private C1465n f135747j;

    /* renamed from: k */
    private final C12814b f135748k;

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.e$l */
    public static final class C59456l extends AbstractC89220m implements AbstractC89172b<C59528a, C59528a> {
        public static final C59456l INSTANCE = new C59456l();

        static {
            Covode.recordClassIndex(69849);
        }

        public C59456l() {
            super(1);
        }

        public final C59528a invoke(C59528a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(69837);
    }

    /* renamed from: v */
    private final MixCreateViewModel m109133v() {
        return (MixCreateViewModel) this.f135748k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.e$h */
    public static final class C59452h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135754a;

        static {
            Covode.recordClassIndex(69845);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59452h(AbstractC12748a aVar) {
            super(0);
            this.f135754a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f135754a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.e$d */
    public static final class C59448d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59448d INSTANCE = new C59448d();

        static {
            Covode.recordClassIndex(69841);
        }

        public C59448d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.e$g */
    public static final class C59451g extends AbstractC89220m implements AbstractC89171a<C12874b<C59528a>> {
        public static final C59451g INSTANCE = new C59451g();

        static {
            Covode.recordClassIndex(69844);
        }

        public C59451g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59528a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.e$i */
    public static final class C59453i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135755a;

        static {
            Covode.recordClassIndex(69846);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59453i(AbstractC12748a aVar) {
            super(0);
            this.f135755a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f135755a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.e$j */
    public static final class C59454j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135756a;

        static {
            Covode.recordClassIndex(69847);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59454j(AbstractC12748a aVar) {
            super(0);
            this.f135756a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f135756a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.e$n */
    public static final class C59458n extends AbstractC89220m implements AbstractC89171a<C12874b<C59528a>> {
        public static final C59458n INSTANCE = new C59458n();

        static {
            Covode.recordClassIndex(69851);
        }

        public C59458n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59528a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.e$q */
    public static final class C59461q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59461q INSTANCE = new C59461q();

        static {
            Covode.recordClassIndex(69854);
        }

        public C59461q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.e$t */
    public static final class C59464t extends AbstractC89220m implements AbstractC89171a<C12874b<C59528a>> {
        public static final C59464t INSTANCE = new C59464t();

        static {
            Covode.recordClassIndex(69857);
        }

        public C59464t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59528a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.e$k */
    public static final class C59455k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135757a;

        static {
            Covode.recordClassIndex(69848);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59455k(AbstractC12748a aVar) {
            super(0);
            this.f135757a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f135757a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.e$m */
    public static final class C59457m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135758a;

        static {
            Covode.recordClassIndex(69850);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59457m(AbstractC12748a aVar) {
            super(0);
            this.f135758a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f135758a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.e$a */
    public static final class C59445a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f135749a;

        static {
            Covode.recordClassIndex(69838);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59445a(AbstractC89277c cVar) {
            super(0);
            this.f135749a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f135749a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.e$b */
    public static final class C59446b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135750a;

        static {
            Covode.recordClassIndex(69839);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59446b(AbstractC12748a aVar) {
            super(0);
            this.f135750a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f135750a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.e$c */
    public static final class C59447c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135751a;

        static {
            Covode.recordClassIndex(69840);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59447c(AbstractC12748a aVar) {
            super(0);
            this.f135751a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f135751a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.e$o */
    public static final class C59459o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135759a;

        static {
            Covode.recordClassIndex(69852);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59459o(AbstractC12748a aVar) {
            super(0);
            this.f135759a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f135759a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.e$p */
    public static final class C59460p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135760a;

        static {
            Covode.recordClassIndex(69853);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59460p(AbstractC12748a aVar) {
            super(0);
            this.f135760a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f135760a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.e$r */
    public static final class C59462r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135761a;

        static {
            Covode.recordClassIndex(69855);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59462r(AbstractC12748a aVar) {
            super(0);
            this.f135761a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f135761a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.e$s */
    public static final class C59463s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135762a;

        static {
            Covode.recordClassIndex(69856);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59463s(AbstractC12748a aVar) {
            super(0);
            this.f135762a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f135762a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.e$e */
    public static final class C59449e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135752a;

        static {
            Covode.recordClassIndex(69842);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59449e(AbstractC12748a aVar) {
            super(0);
            this.f135752a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f135752a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.e$f */
    public static final class C59450f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f135753a;

        static {
            Covode.recordClassIndex(69843);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59450f(AbstractC12748a aVar) {
            super(0);
            this.f135753a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f135753a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C59444e() {
        C12814b bVar;
        AbstractC12848i.C12849a aVar = AbstractC12848i.C12849a.f31275a;
        AbstractC89277c a = C89204ab.m154669a(MixCreateViewModel.class);
        C59445a aVar2 = new C59445a(a);
        C59456l lVar = C59456l.INSTANCE;
        if (C89219l.m154714a(aVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar2, C59458n.INSTANCE, new C59459o(this), new C59460p(this), C59461q.INSTANCE, lVar, new C59462r(this), new C59463s(this));
        } else if (C89219l.m154714a(aVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar2, C59464t.INSTANCE, new C59446b(this), new C59447c(this), C59448d.INSTANCE, lVar, new C59449e(this), new C59450f(this));
        } else if (aVar == null || C89219l.m154714a(aVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar2, C59451g.INSTANCE, new C59452h(this), new C59453i(this), new C59454j(this), lVar, new C59455k(this), new C59457m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f135748k = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.mixdetail.AbstractC59733v
    /* renamed from: a */
    public final void mo97093a(PowerCell<?> powerCell) {
        if (powerCell != null) {
            C1465n nVar = this.f135747j;
            if (nVar == null) {
                C89219l.m154710a("mItemTouchHelper");
            } else {
                nVar.mo4980b(powerCell);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        PowerList powerList = (PowerList) view.findViewById(R.id.ckz);
        AbstractC12818f.C12819a.m23063a(this, m109133v(), C59466f.f135764a, (C12854k) null, new C59465u(powerList), 6);
        powerList.mo28083a(MixFeedOrderCell.class);
        powerList.setLifecycleOwner(this);
        powerList.setHasFixedSize(true);
        powerList.mo28079a(0, C1764a.m5927a(LayoutInflater.from(az_()), R.layout.akc, null, false));
        C89219l.m154716b(powerList, "");
        C1465n nVar = new C1465n(new C59862x(powerList, m109133v(), true));
        this.f135747j = nVar;
        nVar.mo4979a((RecyclerView) powerList);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.createmix.e$u */
    static final class C59465u extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, List<? extends Aweme>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PowerList f135763a;

        static {
            Covode.recordClassIndex(69858);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59465u(PowerList powerList) {
            super(2);
            this.f135763a = powerList;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, List<? extends Aweme> list) {
            List<? extends Aweme> list2 = list;
            C89219l.m154721d(pVar, "");
            if (list2 != null) {
                ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C59774b(it.next()));
                }
                List j = C89070n.m154590j(arrayList);
                PowerList powerList = this.f135763a;
                C89219l.m154716b(powerList, "");
                powerList.getState().mo28138b(j);
            }
            return C89391z.f203057a;
        }
    }
}
