package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3206a;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
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
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.view.C55599d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.view.HintCell;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.view.SearchResultListCell;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.C55619b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89378p;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.i */
public final class C55451i extends AbstractC12769a {

    /* renamed from: j */
    public PowerList f126698j;

    /* renamed from: k */
    private final C12814b f126699k;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.i$l */
    public static final class C55463l extends AbstractC89220m implements AbstractC89172b<C55619b, C55619b> {
        public static final C55463l INSTANCE = new C55463l();

        static {
            Covode.recordClassIndex(65234);
        }

        public C55463l() {
            super(1);
        }

        public final C55619b invoke(C55619b bVar) {
            C89219l.m154719c(bVar, "");
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(65222);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.i$h */
    public static final class C55459h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126705a;

        static {
            Covode.recordClassIndex(65230);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55459h(AbstractC12748a aVar) {
            super(0);
            this.f126705a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f126705a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.i$d */
    public static final class C55455d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C55455d INSTANCE = new C55455d();

        static {
            Covode.recordClassIndex(65226);
        }

        public C55455d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.i$g */
    public static final class C55458g extends AbstractC89220m implements AbstractC89171a<C12874b<C55619b>> {
        public static final C55458g INSTANCE = new C55458g();

        static {
            Covode.recordClassIndex(65229);
        }

        public C55458g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C55619b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.i$i */
    public static final class C55460i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126706a;

        static {
            Covode.recordClassIndex(65231);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55460i(AbstractC12748a aVar) {
            super(0);
            this.f126706a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f126706a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.i$j */
    public static final class C55461j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126707a;

        static {
            Covode.recordClassIndex(65232);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55461j(AbstractC12748a aVar) {
            super(0);
            this.f126707a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f126707a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.i$n */
    public static final class C55465n extends AbstractC89220m implements AbstractC89171a<C12874b<C55619b>> {
        public static final C55465n INSTANCE = new C55465n();

        static {
            Covode.recordClassIndex(65236);
        }

        public C55465n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C55619b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.i$q */
    public static final class C55468q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C55468q INSTANCE = new C55468q();

        static {
            Covode.recordClassIndex(65239);
        }

        public C55468q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.i$t */
    public static final class C55471t extends AbstractC89220m implements AbstractC89171a<C12874b<C55619b>> {
        public static final C55471t INSTANCE = new C55471t();

        static {
            Covode.recordClassIndex(65242);
        }

        public C55471t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C55619b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.i$k */
    public static final class C55462k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126708a;

        static {
            Covode.recordClassIndex(65233);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55462k(AbstractC12748a aVar) {
            super(0);
            this.f126708a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f126708a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.i$m */
    public static final class C55464m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126709a;

        static {
            Covode.recordClassIndex(65235);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55464m(AbstractC12748a aVar) {
            super(0);
            this.f126709a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f126709a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.i$a */
    public static final class C55452a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f126700a;

        static {
            Covode.recordClassIndex(65223);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55452a(AbstractC89277c cVar) {
            super(0);
            this.f126700a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f126700a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.i$b */
    public static final class C55453b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126701a;

        static {
            Covode.recordClassIndex(65224);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55453b(AbstractC12748a aVar) {
            super(0);
            this.f126701a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f126701a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.i$c */
    public static final class C55454c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126702a;

        static {
            Covode.recordClassIndex(65225);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55454c(AbstractC12748a aVar) {
            super(0);
            this.f126702a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f126702a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.i$o */
    public static final class C55466o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126710a;

        static {
            Covode.recordClassIndex(65237);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55466o(AbstractC12748a aVar) {
            super(0);
            this.f126710a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f126710a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.i$p */
    public static final class C55467p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126711a;

        static {
            Covode.recordClassIndex(65238);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55467p(AbstractC12748a aVar) {
            super(0);
            this.f126711a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f126711a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.i$r */
    public static final class C55469r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126712a;

        static {
            Covode.recordClassIndex(65240);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55469r(AbstractC12748a aVar) {
            super(0);
            this.f126712a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f126712a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.i$s */
    public static final class C55470s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126713a;

        static {
            Covode.recordClassIndex(65241);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55470s(AbstractC12748a aVar) {
            super(0);
            this.f126713a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f126713a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.i$e */
    public static final class C55456e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126703a;

        static {
            Covode.recordClassIndex(65227);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55456e(AbstractC12748a aVar) {
            super(0);
            this.f126703a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f126703a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.i$f */
    public static final class C55457f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126704a;

        static {
            Covode.recordClassIndex(65228);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55457f(AbstractC12748a aVar) {
            super(0);
            this.f126704a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f126704a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C55451i() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(ContactListViewModel.class);
        C55452a aVar = new C55452a(a);
        C55463l lVar = C55463l.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C55465n.INSTANCE, new C55466o(this), new C55467p(this), C55468q.INSTANCE, lVar, new C55469r(this), new C55470s(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C55471t.INSTANCE, new C55453b(this), new C55454c(this), C55455d.INSTANCE, lVar, new C55456e(this), new C55457f(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C55458g.INSTANCE, new C55459h(this), new C55460i(this), new C55461j(this), lVar, new C55462k(this), new C55464m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f126699k = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.i$u */
    public static final class C55472u extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C55451i f126714a;

        static {
            Covode.recordClassIndex(65243);
        }

        C55472u(C55451i iVar) {
            this.f126714a = iVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            AbstractC55450h hVar = (AbstractC55450h) C12801d.m23025c(this.f126714a, C89204ab.m154669a(AbstractC55450h.class));
            if (hVar != null) {
                hVar.mo92464w();
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        PowerList powerList = (PowerList) mo20528t().findViewById(R.id.djc);
        powerList.mo28083a(SearchResultListCell.class, HintCell.class);
        powerList.mo4405a(new C55472u(this));
        powerList.setItemAnimator(null);
        C89219l.m154716b(powerList, "");
        this.f126698j = powerList;
        AbstractC12818f.C12819a.m23063a(this, (ContactListViewModel) this.f126699k.getValue(), C55475j.f126717a, C12856l.m23100a(), new C55473v(this), 4);
        C12801d.m23021a(this, C89204ab.m154669a(AbstractC55450h.class), C55476k.f126718a, C55477l.f126719a, new C55474w(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.i$w */
    static final class C55474w extends AbstractC89220m implements AbstractC89183m<C12776a<? extends Boolean>, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C55451i f126716a;

        static {
            Covode.recordClassIndex(65245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55474w(C55451i iVar) {
            super(2);
            this.f126716a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C12776a<? extends Boolean> aVar, String str) {
            String str2 = str;
            C89219l.m154721d(aVar, "");
            PowerList powerList = this.f126716a.f126698j;
            if (powerList == null) {
                C89219l.m154710a("searchResultPowerList");
            }
            powerList.getState().mo28128a();
            int i = 0;
            if (str2 == null || str2.length() == 0) {
                i = 4;
            }
            powerList.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.i$v */
    static final class C55473v extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C89378p<? extends List<? extends IMUser>, ? extends String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C55451i f126715a;

        static {
            Covode.recordClassIndex(65244);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55473v(C55451i iVar) {
            super(2);
            this.f126715a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C89378p<? extends List<? extends IMUser>, ? extends String> pVar2) {
            C89378p<? extends List<? extends IMUser>, ? extends String> pVar3 = pVar2;
            C89219l.m154721d(pVar, "");
            C89219l.m154721d(pVar3, "");
            List<IMUser> list = (List) pVar3.component1();
            String str = (String) pVar3.component2();
            C55451i iVar = this.f126715a;
            PowerList powerList = iVar.f126698j;
            if (powerList == null) {
                C89219l.m154710a("searchResultPowerList");
            }
            if (powerList.getVisibility() == 0) {
                PowerList powerList2 = iVar.f126698j;
                if (powerList2 == null) {
                    C89219l.m154710a("searchResultPowerList");
                }
                C17656f<AbstractC17641a> state = powerList2.getState();
                state.mo28128a();
                if (list.isEmpty()) {
                    state.mo28132a(HintCell.f126815a);
                } else {
                    ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                    for (IMUser iMUser : list) {
                        arrayList.add(new C55599d(iMUser, str));
                    }
                    state.mo28133a(arrayList);
                }
            }
            return C89391z.f203057a;
        }
    }
}
