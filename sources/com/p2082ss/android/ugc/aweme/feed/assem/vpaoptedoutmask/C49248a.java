package com.p2082ss.android.ugc.aweme.feed.assem.vpaoptedoutmask;

import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.C1175ad;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.assem.arch.p795b.C12661l;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14524g;
import com.bytedance.ext_power_list.C14530k;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48200bc;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48244cj;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a;
import com.p2082ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.VPAOptedOutMaskVM;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.a */
public final class C49248a extends AbstractC48491a<C49248a> {

    /* renamed from: u */
    static final /* synthetic */ AbstractC89286i[] f113238u = {new C89232y(C49248a.class, "maskVM", "getMaskVM()Lcom/ss/android/ugc/aweme/feed/assem/vpaoptedoutmask/VPAOptedOutMaskVM;", 0)};

    /* renamed from: v */
    private final AbstractC89248d f113239v;

    /* renamed from: w */
    private final AbstractC89244h f113240w;

    /* renamed from: x */
    private final AbstractC89244h f113241x;

    /* renamed from: y */
    private SparseArray f113242y;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.a$b */
    public static final class C49250b extends AbstractC89220m implements AbstractC89172b<C49267e, C49267e> {
        public static final C49250b INSTANCE = new C49250b();

        static {
            Covode.recordClassIndex(58047);
        }

        public C49250b() {
            super(1);
        }

        public final C49267e invoke(C49267e eVar) {
            C89219l.m154719c(eVar, "");
            return eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.a$g */
    public static final class C49255g extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {
        public static final C49255g INSTANCE = new C49255g();

        static {
            Covode.recordClassIndex(58052);
        }

        public C49255g() {
            super(1);
        }

        public final C48200bc invoke(C48200bc bcVar) {
            C89219l.m154719c(bcVar, "");
            return bcVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.a$j */
    public static final class C49258j extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {
        public static final C49258j INSTANCE = new C49258j();

        static {
            Covode.recordClassIndex(58055);
        }

        public C49258j() {
            super(1);
        }

        public final C48244cj invoke(C48244cj cjVar) {
            C89219l.m154719c(cjVar, "");
            return cjVar;
        }
    }

    static {
        Covode.recordClassIndex(58045);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: D */
    public final int mo20547D() {
        return R.layout.tr;
    }

    /* renamed from: G */
    public final VPAOptedOutMaskVM mo80875G() {
        return (VPAOptedOutMaskVM) this.f113239v.mo23374a(this, f113238u[0]);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: H */
    public final View mo80494H() {
        if (this.f113242y == null) {
            this.f113242y = new SparseArray();
        }
        View view = (View) this.f113242y.get(R.id.dii);
        if (view != null) {
            return view;
        }
        View t = mo20528t();
        if (t == null) {
            return null;
        }
        View findViewById = t.findViewById(R.id.dii);
        this.f113242y.put(R.id.dii, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.a$c */
    public static final class C49251c extends AbstractC89220m implements AbstractC89171a<C12874b<C49267e>> {
        public static final C49251c INSTANCE = new C49251c();

        static {
            Covode.recordClassIndex(58048);
        }

        public C49251c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C49267e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.a$d */
    public static final class C49252d extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f113244a;

        static {
            Covode.recordClassIndex(58049);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49252d(AbstractC12693u uVar) {
            super(0);
            this.f113244a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f113244a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.a$h */
    public static final class C49256h extends AbstractC89220m implements AbstractC89171a<C12874b<C48200bc>> {
        public static final C49256h INSTANCE = new C49256h();

        static {
            Covode.recordClassIndex(58053);
        }

        public C49256h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48200bc> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.a$i */
    public static final class C49257i extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C49257i INSTANCE = new C49257i();

        static {
            Covode.recordClassIndex(58054);
        }

        public C49257i() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.a$k */
    public static final class C49259k extends AbstractC89220m implements AbstractC89171a<C12874b<C48244cj>> {
        public static final C49259k INSTANCE = new C49259k();

        static {
            Covode.recordClassIndex(58056);
        }

        public C49259k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48244cj> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.a$l */
    public static final class C49260l extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C49260l INSTANCE = new C49260l();

        static {
            Covode.recordClassIndex(58057);
        }

        public C49260l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.a$e */
    public static final class C49253e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f113245a;

        static {
            Covode.recordClassIndex(58050);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49253e(AbstractC12693u uVar) {
            super(0);
            this.f113245a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f113245a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.a$f */
    public static final class C49254f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f113246a;

        static {
            Covode.recordClassIndex(58051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49254f(AbstractC12693u uVar) {
            super(0);
            this.f113246a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f113246a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.a$a */
    public static final class C49249a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f113243a;

        static {
            Covode.recordClassIndex(58046);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49249a(AbstractC89277c cVar) {
            super(0);
            this.f113243a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f113243a).getName();
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: y */
    public final void mo20533y() {
        super.mo20533y();
        AbstractC12818f.C12819a.m23063a(this, mo80875G(), C49264b.f113250a, (C12854k) null, C49261m.f113247a, 6);
    }

    public C49248a() {
        AbstractC12848i.C12851c cVar = AbstractC12848i.C12851c.f31277a;
        AbstractC89277c a = C89204ab.m154669a(VPAOptedOutMaskVM.class);
        this.f113239v = C14530k.m26542a(this, a, cVar == null ? AbstractC12848i.C12851c.f31277a : cVar, new C49249a(a), C49251c.INSTANCE, new C49252d(this), C49250b.INSTANCE, null, null, new C49253e(this), new C49254f(this));
        this.f113240w = new C14524g(C89204ab.m154669a(VideoPlayViewModel.class), this, C49256h.INSTANCE, C49257i.INSTANCE, C49255g.INSTANCE);
        this.f113241x = new C14524g(C89204ab.m154669a(VideoViewModel.class), this, C49259k.INSTANCE, C49260l.INSTANCE, C49258j.INSTANCE);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
        mo20546C().setVisibility(mo80875G().mo23343h());
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
        AbstractC12818f.C12819a.m23070b(this, (VideoPlayViewModel) this.f113240w.getValue(), C49265c.f113251a, (C12854k) null, C49262n.f113248a, 6);
        AbstractC12818f.C12819a.m23070b(this, (VideoViewModel) this.f113241x.getValue(), C49266d.f113252a, (C12854k) null, C49263o.f113249a, 6);
        mo20546C().setVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.a$n */
    static final class C49262n extends AbstractC89220m implements AbstractC89183m<C49248a, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        public static final C49262n f113248a = new C49262n();

        static {
            Covode.recordClassIndex(58059);
        }

        C49262n() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49248a aVar, C12776a<? extends Boolean> aVar2) {
            C49248a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            C89219l.m154721d(aVar2, "");
            aVar3.mo80875G().mo20667b(VPAOptedOutMaskVM.C49246a.f113236a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.a$o */
    static final class C49263o extends AbstractC89220m implements AbstractC89183m<C49248a, C12776a<? extends Integer>, C89391z> {

        /* renamed from: a */
        public static final C49263o f113249a = new C49263o();

        static {
            Covode.recordClassIndex(58060);
        }

        C49263o() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49248a aVar, C12776a<? extends Integer> aVar2) {
            C49248a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            VPAOptedOutMaskVM G = aVar3.mo80875G();
            G.mo20662a(new VPAOptedOutMaskVM.C49247b(G));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.vpaoptedoutmask.a$m */
    static final class C49261m extends AbstractC89220m implements AbstractC89183m<C49248a, Integer, C89391z> {

        /* renamed from: a */
        public static final C49261m f113247a = new C49261m();

        static {
            Covode.recordClassIndex(58058);
        }

        C49261m() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49248a aVar, Integer num) {
            C49248a aVar2 = aVar;
            int intValue = num.intValue();
            C89219l.m154721d(aVar2, "");
            aVar2.mo20546C().setVisibility(intValue);
            if (intValue == 0) {
                C33744d a = new C33744d().mo59983a("enter_from", ((VideoItemParams) C12661l.m22797a(aVar2)).mEventType);
                Aweme aweme = ((VideoItemParams) C12661l.m22797a(aVar2)).mAweme;
                C89219l.m154716b(aweme, "");
                C33744d a2 = a.mo59983a("group_id", aweme.getAid());
                Aweme aweme2 = ((VideoItemParams) C12661l.m22797a(aVar2)).mAweme;
                C89219l.m154716b(aweme2, "");
                C39162r.m79460a("opt_out_layer_show", a2.mo59983a("author_id", aweme2.getAuthorUid()).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108759a(((VideoItemParams) C12661l.m22797a(aVar2)).mAweme, ((VideoItemParams) C12661l.m22797a(aVar2)).mPageType))).f79943a);
            }
            return C89391z.f203057a;
        }
    }
}
