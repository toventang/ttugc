package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3206a;

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
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.view.C55597b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.view.SelectedListCell;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.C55619b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.m */
public final class C55478m extends AbstractC12769a {

    /* renamed from: j */
    PowerList f126720j;

    /* renamed from: k */
    private final C12814b f126721k;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.m$l */
    public static final class C55490l extends AbstractC89220m implements AbstractC89172b<C55619b, C55619b> {
        public static final C55490l INSTANCE = new C55490l();

        static {
            Covode.recordClassIndex(65261);
        }

        public C55490l() {
            super(1);
        }

        public final C55619b invoke(C55619b bVar) {
            C89219l.m154719c(bVar, "");
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(65249);
    }

    /* renamed from: v */
    public final ContactListViewModel mo92474v() {
        return (ContactListViewModel) this.f126721k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.m$h */
    public static final class C55486h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126727a;

        static {
            Covode.recordClassIndex(65257);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55486h(AbstractC12748a aVar) {
            super(0);
            this.f126727a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f126727a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.m$d */
    public static final class C55482d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C55482d INSTANCE = new C55482d();

        static {
            Covode.recordClassIndex(65253);
        }

        public C55482d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.m$g */
    public static final class C55485g extends AbstractC89220m implements AbstractC89171a<C12874b<C55619b>> {
        public static final C55485g INSTANCE = new C55485g();

        static {
            Covode.recordClassIndex(65256);
        }

        public C55485g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C55619b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.m$i */
    public static final class C55487i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126728a;

        static {
            Covode.recordClassIndex(65258);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55487i(AbstractC12748a aVar) {
            super(0);
            this.f126728a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f126728a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.m$j */
    public static final class C55488j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126729a;

        static {
            Covode.recordClassIndex(65259);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55488j(AbstractC12748a aVar) {
            super(0);
            this.f126729a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f126729a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.m$n */
    public static final class C55492n extends AbstractC89220m implements AbstractC89171a<C12874b<C55619b>> {
        public static final C55492n INSTANCE = new C55492n();

        static {
            Covode.recordClassIndex(65263);
        }

        public C55492n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C55619b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.m$q */
    public static final class C55495q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C55495q INSTANCE = new C55495q();

        static {
            Covode.recordClassIndex(65266);
        }

        public C55495q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.m$t */
    public static final class C55498t extends AbstractC89220m implements AbstractC89171a<C12874b<C55619b>> {
        public static final C55498t INSTANCE = new C55498t();

        static {
            Covode.recordClassIndex(65269);
        }

        public C55498t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C55619b> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.m$k */
    public static final class C55489k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126730a;

        static {
            Covode.recordClassIndex(65260);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55489k(AbstractC12748a aVar) {
            super(0);
            this.f126730a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f126730a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.m$m */
    public static final class C55491m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126731a;

        static {
            Covode.recordClassIndex(65262);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55491m(AbstractC12748a aVar) {
            super(0);
            this.f126731a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f126731a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.m$a */
    public static final class C55479a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f126722a;

        static {
            Covode.recordClassIndex(65250);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55479a(AbstractC89277c cVar) {
            super(0);
            this.f126722a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f126722a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.m$b */
    public static final class C55480b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126723a;

        static {
            Covode.recordClassIndex(65251);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55480b(AbstractC12748a aVar) {
            super(0);
            this.f126723a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f126723a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.m$c */
    public static final class C55481c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126724a;

        static {
            Covode.recordClassIndex(65252);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55481c(AbstractC12748a aVar) {
            super(0);
            this.f126724a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f126724a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.m$o */
    public static final class C55493o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126732a;

        static {
            Covode.recordClassIndex(65264);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55493o(AbstractC12748a aVar) {
            super(0);
            this.f126732a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f126732a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.m$p */
    public static final class C55494p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126733a;

        static {
            Covode.recordClassIndex(65265);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55494p(AbstractC12748a aVar) {
            super(0);
            this.f126733a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f126733a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.m$r */
    public static final class C55496r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126734a;

        static {
            Covode.recordClassIndex(65267);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55496r(AbstractC12748a aVar) {
            super(0);
            this.f126734a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f126734a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.m$s */
    public static final class C55497s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126735a;

        static {
            Covode.recordClassIndex(65268);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55497s(AbstractC12748a aVar) {
            super(0);
            this.f126735a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f126735a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.m$e */
    public static final class C55483e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126725a;

        static {
            Covode.recordClassIndex(65254);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55483e(AbstractC12748a aVar) {
            super(0);
            this.f126725a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f126725a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.m$f */
    public static final class C55484f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f126726a;

        static {
            Covode.recordClassIndex(65255);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55484f(AbstractC12748a aVar) {
            super(0);
            this.f126726a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f126726a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C55478m() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(ContactListViewModel.class);
        C55479a aVar = new C55479a(a);
        C55490l lVar = C55490l.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C55492n.INSTANCE, new C55493o(this), new C55494p(this), C55495q.INSTANCE, lVar, new C55496r(this), new C55497s(this));
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C55498t.INSTANCE, new C55480b(this), new C55481c(this), C55482d.INSTANCE, lVar, new C55483e(this), new C55484f(this));
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C55485g.INSTANCE, new C55486h(this), new C55487i(this), new C55488j(this), lVar, new C55489k(this), new C55491m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f126721k = bVar;
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        View t = mo20528t();
        if (t == null) {
            C89219l.m154715b();
        }
        PowerList powerList = (PowerList) t.findViewById(R.id.duw);
        powerList.mo28083a(SelectedListCell.class);
        powerList.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.mo4356b(0);
        powerList.setLayoutManager(linearLayoutManager);
        C89219l.m154716b(powerList, "");
        this.f126720j = powerList;
        AbstractC12818f.C12819a.m23063a(this, mo92474v(), C55501n.f126738a, C12856l.m23100a(), new C55499u(this), 4);
        AbstractC12818f.C12819a.m23063a(this, mo92474v(), C55502o.f126739a, C12856l.m23100a(), new C55500v(this), 4);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.m$u */
    static final class C55499u extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends List<? extends IMUser>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C55478m f126736a;

        static {
            Covode.recordClassIndex(65270);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55499u(C55478m mVar) {
            super(2);
            this.f126736a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends List<? extends IMUser>> aVar) {
            C89219l.m154721d(pVar, "");
            C89219l.m154721d(aVar, "");
            C55478m mVar = this.f126736a;
            List<IMUser> k = mVar.mo92474v().mo92520k();
            PowerList powerList = mVar.f126720j;
            if (powerList == null) {
                C89219l.m154710a("selectedPowerList");
            }
            C17656f<AbstractC17641a> state = powerList.getState();
            state.mo28128a();
            Iterator<T> it = k.iterator();
            while (it.hasNext()) {
                state.mo28132a(new C55597b(it.next()));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.m$v */
    static final class C55500v extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends IMUser>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C55478m f126737a;

        static {
            Covode.recordClassIndex(65271);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55500v(C55478m mVar) {
            super(2);
            this.f126737a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends IMUser> aVar) {
            T t;
            C12776a<? extends IMUser> aVar2 = aVar;
            C89219l.m154721d(pVar, "");
            if (!(aVar2 == null || (t = aVar2.f31085a) == null)) {
                C55478m mVar = this.f126737a;
                boolean a = mVar.mo92474v().mo92513a((IMUser) t);
                PowerList powerList = mVar.f126720j;
                if (powerList == null) {
                    C89219l.m154710a("selectedPowerList");
                }
                C17656f<AbstractC17641a> state = powerList.getState();
                if (a) {
                    state.mo28132a(new C55597b(t));
                    PowerList powerList2 = mVar.f126720j;
                    if (powerList2 == null) {
                        C89219l.m154710a("selectedPowerList");
                    }
                    PowerList powerList3 = mVar.f126720j;
                    if (powerList3 == null) {
                        C89219l.m154710a("selectedPowerList");
                    }
                    powerList2.mo4413b(powerList3.getState().mo28134b() - 1);
                } else {
                    state.mo28137b(new C55597b(t));
                }
            }
            return C89391z.f203057a;
        }
    }
}
