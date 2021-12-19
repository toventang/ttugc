package com.p2082ss.android.ugc.aweme.mix.mixdetail;

import android.content.Context;
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
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1615s.p1616a.C22112a;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewholder.C59774b;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedManageCell;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.C59853a;
import com.p2082ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosManageViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c */
public final class C59634c extends AbstractC12769a implements AbstractC59733v {

    /* renamed from: j */
    public String f136011j;

    /* renamed from: k */
    private C1465n f136012k;

    /* renamed from: l */
    private final C12814b f136013l;

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$l */
    public static final class C59646l extends AbstractC89220m implements AbstractC89172b<C59853a, C59853a> {
        public static final C59646l INSTANCE = new C59646l();

        static {
            Covode.recordClassIndex(70047);
        }

        public C59646l() {
            super(1);
        }

        public final C59853a invoke(C59853a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(70035);
    }

    /* renamed from: v */
    public final MixVideosManageViewModel mo97191v() {
        return (MixVideosManageViewModel) this.f136013l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$h */
    public static final class C59642h extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f136019a;

        static {
            Covode.recordClassIndex(70043);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59642h(AbstractC12748a aVar) {
            super(0);
            this.f136019a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f136019a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$d */
    public static final class C59638d extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59638d INSTANCE = new C59638d();

        static {
            Covode.recordClassIndex(70039);
        }

        public C59638d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$g */
    public static final class C59641g extends AbstractC89220m implements AbstractC89171a<C12874b<C59853a>> {
        public static final C59641g INSTANCE = new C59641g();

        static {
            Covode.recordClassIndex(70042);
        }

        public C59641g() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59853a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$i */
    public static final class C59643i extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f136020a;

        static {
            Covode.recordClassIndex(70044);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59643i(AbstractC12748a aVar) {
            super(0);
            this.f136020a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f136020a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$j */
    public static final class C59644j extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f136021a;

        static {
            Covode.recordClassIndex(70045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59644j(AbstractC12748a aVar) {
            super(0);
            this.f136021a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f136021a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$n */
    public static final class C59648n extends AbstractC89220m implements AbstractC89171a<C12874b<C59853a>> {
        public static final C59648n INSTANCE = new C59648n();

        static {
            Covode.recordClassIndex(70049);
        }

        public C59648n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59853a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$q */
    public static final class C59651q extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C59651q INSTANCE = new C59651q();

        static {
            Covode.recordClassIndex(70052);
        }

        public C59651q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$t */
    public static final class C59654t extends AbstractC89220m implements AbstractC89171a<C12874b<C59853a>> {
        public static final C59654t INSTANCE = new C59654t();

        static {
            Covode.recordClassIndex(70055);
        }

        public C59654t() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C59853a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$k */
    public static final class C59645k extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f136022a;

        static {
            Covode.recordClassIndex(70046);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59645k(AbstractC12748a aVar) {
            super(0);
            this.f136022a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f136022a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$m */
    public static final class C59647m extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f136023a;

        static {
            Covode.recordClassIndex(70048);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59647m(AbstractC12748a aVar) {
            super(0);
            this.f136023a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f136023a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$w */
    public static final class C59658w extends C22112a {

        /* renamed from: a */
        final /* synthetic */ C59634c f136033a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f136034b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f136035c;

        static {
            Covode.recordClassIndex(70059);
        }

        @Override // com.bytedance.p1615s.p1616a.C22112a
        /* renamed from: b */
        public final void mo36300b() {
            super.mo36300b();
            C12777b.m23004b(this.f136033a);
        }

        @Override // com.bytedance.p1615s.p1616a.C22112a
        /* renamed from: a */
        public final void mo36297a() {
            super.mo36297a();
            T t = this.f136034b.element;
            C89219l.m154716b(t, "");
            t.setVisibility(0);
            this.f136034b.element.mo27384f();
        }

        @Override // com.bytedance.p1615s.p1616a.C22112a
        /* renamed from: a */
        public final void mo36298a(Exception exc) {
            super.mo36298a(exc);
            T t = this.f136034b.element;
            C89219l.m154716b(t, "");
            new C23144b((View) t).mo37640e(R.string.dcq).mo37637b();
            this.f136034b.element.mo27387h();
        }

        @Override // com.bytedance.p1615s.p1616a.C22112a
        /* renamed from: a */
        public final void mo36299a(boolean z) {
            super.mo36299a(z);
            this.f136034b.element.mo27379a(true);
            T t = this.f136035c.element;
            C89219l.m154716b(t, "");
            if (t.getState().mo28134b() == 0) {
                this.f136034b.element.mo27385g();
            } else {
                this.f136034b.element.mo27379a(true);
            }
        }

        C59658w(C59634c cVar, C89233z.C89238e eVar, C89233z.C89238e eVar2) {
            this.f136033a = cVar;
            this.f136034b = eVar;
            this.f136035c = eVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$a */
    public static final class C59635a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f136014a;

        static {
            Covode.recordClassIndex(70036);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59635a(AbstractC89277c cVar) {
            super(0);
            this.f136014a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f136014a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$b */
    public static final class C59636b extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f136015a;

        static {
            Covode.recordClassIndex(70037);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59636b(AbstractC12748a aVar) {
            super(0);
            this.f136015a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final Fragment invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f136015a);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$c */
    public static final class C59637c extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f136016a;

        static {
            Covode.recordClassIndex(70038);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59637c(AbstractC12748a aVar) {
            super(0);
            this.f136016a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f136016a);
            if (a != null) {
                C1182af viewModelStore = a.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$o */
    public static final class C59649o extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f136024a;

        static {
            Covode.recordClassIndex(70050);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59649o(AbstractC12748a aVar) {
            super(0);
            this.f136024a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final ActivityC0945e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f136024a);
            if (b != null) {
                return b;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$p */
    public static final class C59650p extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f136025a;

        static {
            Covode.recordClassIndex(70051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59650p(AbstractC12748a aVar) {
            super(0);
            this.f136025a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f136025a);
            if (b != null) {
                C1182af viewModelStore = b.getViewModelStore();
                C89219l.m154709a((Object) viewModelStore, "");
                return viewModelStore;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$r */
    public static final class C59652r extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f136026a;

        static {
            Covode.recordClassIndex(70053);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59652r(AbstractC12748a aVar) {
            super(0);
            this.f136026a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f136026a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$s */
    public static final class C59653s extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f136027a;

        static {
            Covode.recordClassIndex(70054);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59653s(AbstractC12748a aVar) {
            super(0);
            this.f136027a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f136027a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$e */
    public static final class C59639e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f136017a;

        static {
            Covode.recordClassIndex(70040);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59639e(AbstractC12748a aVar) {
            super(0);
            this.f136017a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f136017a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20583b(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$f */
    public static final class C59640f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f136018a;

        static {
            Covode.recordClassIndex(70041);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59640f(AbstractC12748a aVar) {
            super(0);
            this.f136018a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            Fragment a = C12777b.m22999a((AbstractC1204m) this.f136018a);
            if (a != null) {
                ActivityC0945e requireActivity = a.requireActivity();
                C89219l.m154709a((Object) requireActivity, "");
                return Assembler.C12747a.m22936a(requireActivity).mo20584c(a);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public C59634c() {
        C12814b bVar;
        AbstractC12848i.C12849a aVar = AbstractC12848i.C12849a.f31275a;
        AbstractC89277c a = C89204ab.m154669a(MixVideosManageViewModel.class);
        C59635a aVar2 = new C59635a(a);
        C59646l lVar = C59646l.INSTANCE;
        if (C89219l.m154714a(aVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar2, C59648n.INSTANCE, new C59649o(this), new C59650p(this), C59651q.INSTANCE, lVar, new C59652r(this), new C59653s(this));
        } else if (C89219l.m154714a(aVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar2, C59654t.INSTANCE, new C59636b(this), new C59637c(this), C59638d.INSTANCE, lVar, new C59639e(this), new C59640f(this));
        } else if (aVar == null || C89219l.m154714a(aVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar2, C59641g.INSTANCE, new C59642h(this), new C59643i(this), new C59644j(this), lVar, new C59645k(this), new C59647m(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f136013l = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.mix.mixdetail.AbstractC59733v
    /* renamed from: a */
    public final void mo97093a(PowerCell<?> powerCell) {
        C1465n nVar;
        if (powerCell != null && (nVar = this.f136012k) != null) {
            nVar.mo4980b(powerCell);
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = (T) view.findViewById(R.id.e7i);
        DmtStatusView.C17269a a = DmtStatusView.C17269a.m31905a(az_());
        Context az_ = az_();
        C17273d.C17274a a2 = new C17273d.C17274a(az_).mo27458a(2131233293, (int) C13628n.m24520b(az_, 72.0f), (int) C13628n.m24520b(az_, 72.0f));
        String string = C17867d.m33078a().getResources().getString(R.string.bmy);
        C89219l.m154716b(string, "");
        Object[] objArr = new Object[1];
        String str = mo97191v().f136171l;
        if (str == null) {
            C89219l.m154710a("mMixName");
        }
        objArr[0] = str;
        String a3 = C1764a.m5928a(string, Arrays.copyOf(objArr, 1));
        C89219l.m154716b(a3, "");
        DmtStatusView.C17269a a4 = a.mo27404a(a2.mo27461a(a3).mo27464c(R.string.bmw).f41365a);
        a4.f41304g = 0;
        eVar.element.setBuilder(a4.mo27398a(R.string.fz3));
        C89233z.C89238e eVar2 = new C89233z.C89238e();
        eVar2.element = (T) view.findViewById(R.id.ckz);
        AbstractC12818f.C12819a.m23063a(this, mo97191v(), C59660d.f136037a, C12856l.m23100a(), new C59655u(eVar, eVar2), 4);
        AbstractC12818f.C12819a.m23063a(this, mo97191v(), C59661e.f136038a, C12856l.m23100a(), new C59656v(this, eVar), 4);
        eVar2.element.mo28083a(MixFeedManageCell.class);
        eVar2.element.setLifecycleOwner(this);
        eVar2.element.setHasFixedSize(true);
        eVar2.element.mo28082a(mo97191v().mo23343h());
        eVar2.element.mo4402a(new C59631a());
        eVar2.element.mo28081a(new C59658w(this, eVar, eVar2));
        String g = mo97191v().mo23342g();
        this.f136011j = g;
        if (g != null) {
            MixVideosManageViewModel v = mo97191v();
            String str2 = this.f136011j;
            if (str2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154721d(str2, "");
            v.f136170k = str2;
            v.mo23343h().f42330c.mo28163e();
        }
        C89233z.C89238e eVar3 = new C89233z.C89238e();
        eVar3.element = null;
        T t = eVar2.element;
        C89219l.m154716b(t, "");
        eVar3.element = (T) new C59862x(t, mo97191v(), false);
        T t2 = eVar3.element;
        Objects.requireNonNull(t2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.mix.mixdetail.TouchCallbackCenter");
        C1465n nVar = new C1465n(t2);
        this.f136012k = nVar;
        nVar.mo4979a((RecyclerView) eVar2.element);
        AbstractC12818f.C12819a.m23063a(this, mo97191v(), C59662f.f136039a, (C12854k) null, new C59659x(eVar3), 6);
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$x */
    static final class C59659x extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f136036a;

        static {
            Covode.recordClassIndex(70060);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59659x(C89233z.C89238e eVar) {
            super(2);
            this.f136036a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends Boolean> aVar) {
            C12776a<? extends Boolean> aVar2 = aVar;
            C89219l.m154721d(pVar, "");
            C89219l.m154721d(aVar2, "");
            this.f136036a.element.f136355a = aVar2.f31085a.booleanValue();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$v */
    static final class C59656v extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C59634c f136030a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f136031b;

        static {
            Covode.recordClassIndex(70057);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59656v(C59634c cVar, C89233z.C89238e eVar) {
            super(2);
            this.f136030a = cVar;
            this.f136031b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, C12776a<? extends Boolean> aVar) {
            C12776a<? extends Boolean> aVar2 = aVar;
            C89219l.m154721d(pVar, "");
            C89219l.m154721d(aVar2, "");
            if (aVar2.f31085a.booleanValue()) {
                AbstractC12766p.m22977a(this.f136030a.mo97191v(), new AbstractC89172b<C59853a, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.mix.mixdetail.C59634c.C59656v.C596571 */

                    /* renamed from: a */
                    final /* synthetic */ C59656v f136032a;

                    static {
                        Covode.recordClassIndex(70058);
                    }

                    {
                        this.f136032a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C59853a aVar) {
                        C59853a aVar2 = aVar;
                        C89219l.m154721d(aVar2, "");
                        List<Aweme> list = aVar2.f136325a;
                        if (list == null || list.size() != 0) {
                            this.f136032a.f136031b.element.mo27382d();
                        } else {
                            this.f136032a.f136031b.element.mo27385g();
                        }
                        return C89391z.f203057a;
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.mixdetail.c$u */
    static final class C59655u extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, List<? extends Aweme>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f136028a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f136029b;

        static {
            Covode.recordClassIndex(70056);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59655u(C89233z.C89238e eVar, C89233z.C89238e eVar2) {
            super(2);
            this.f136028a = eVar;
            this.f136029b = eVar2;
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
                if (list2.isEmpty()) {
                    this.f136028a.element.mo27385g();
                } else {
                    this.f136028a.element.mo27382d();
                }
                T t = this.f136029b.element;
                C89219l.m154716b(t, "");
                t.getState().mo28138b(j);
            }
            return C89391z.f203057a;
        }
    }
}
