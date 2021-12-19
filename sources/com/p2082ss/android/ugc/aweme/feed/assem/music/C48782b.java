package com.p2082ss.android.ugc.aweme.feed.assem.music;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.C1175ad;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14524g;
import com.bytedance.ext_power_list.C14530k;
import com.bytedance.ies.dmt.p1194ui.widget.View$OnTouchListenerC17271b;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.p2380a.C34668a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.p2380a.C34670c;
import com.p2082ss.android.ugc.aweme.experiment.C46965gb;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48200bc;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48244cj;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a;
import com.p2082ss.android.ugc.aweme.feed.assem.music.VideoMusicCoverVM;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.widget.PeriscopeLayout;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.p2483co.C36151e;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.power.C63303c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b */
public final class C48782b extends AbstractC48491a<C48782b> {

    /* renamed from: u */
    static final /* synthetic */ AbstractC89286i[] f112649u = {new C89232y(C48782b.class, "musicCoverVM", "getMusicCoverVM()Lcom/ss/android/ugc/aweme/feed/assem/music/VideoMusicCoverVM;", 0), new C89232y(C48782b.class, "musicBaseVM", "getMusicBaseVM()Lcom/ss/android/ugc/aweme/feed/assem/music/VideoMusicBaseVM;", 0)};

    /* renamed from: A */
    public ValueAnimator f112650A;

    /* renamed from: B */
    public long f112651B;

    /* renamed from: C */
    public final double f112652C;

    /* renamed from: D */
    public final double f112653D;

    /* renamed from: E */
    public final int f112654E;

    /* renamed from: F */
    private final AbstractC89248d f112655F;

    /* renamed from: G */
    private final AbstractC89248d f112656G;

    /* renamed from: H */
    private final AbstractC89244h f112657H;

    /* renamed from: I */
    private final AbstractC89244h f112658I;

    /* renamed from: J */
    private final float f112659J;

    /* renamed from: K */
    private SparseArray f112660K;

    /* renamed from: v */
    public SmartCircleImageView f112661v;

    /* renamed from: w */
    public SmartCircleImageView f112662w;

    /* renamed from: x */
    public PeriscopeLayout f112663x;

    /* renamed from: y */
    public FrameLayout f112664y;

    /* renamed from: z */
    public C36151e f112665z;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$e */
    public static final class C48788e extends AbstractC89220m implements AbstractC89172b<C48823m, C48823m> {
        public static final C48788e INSTANCE = new C48788e();

        static {
            Covode.recordClassIndex(57574);
        }

        public C48788e() {
            super(1);
        }

        public final C48823m invoke(C48823m mVar) {
            C89219l.m154719c(mVar, "");
            return mVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$k */
    public static final class C48794k extends AbstractC89220m implements AbstractC89172b<C48781a, C48781a> {
        public static final C48794k INSTANCE = new C48794k();

        static {
            Covode.recordClassIndex(57580);
        }

        public C48794k() {
            super(1);
        }

        public final C48781a invoke(C48781a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$m */
    public static final class C48796m extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {
        public static final C48796m INSTANCE = new C48796m();

        static {
            Covode.recordClassIndex(57582);
        }

        public C48796m() {
            super(1);
        }

        public final C48244cj invoke(C48244cj cjVar) {
            C89219l.m154719c(cjVar, "");
            return cjVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$p */
    public static final class C48799p extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {
        public static final C48799p INSTANCE = new C48799p();

        static {
            Covode.recordClassIndex(57585);
        }

        public C48799p() {
            super(1);
        }

        public final C48200bc invoke(C48200bc bcVar) {
            C89219l.m154719c(bcVar, "");
            return bcVar;
        }
    }

    static {
        Covode.recordClassIndex(57568);
    }

    /* renamed from: K */
    private final VideoPlayViewModel m92073K() {
        return (VideoPlayViewModel) this.f112658I.getValue();
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: D */
    public final int mo20547D() {
        return R.layout.sz;
    }

    /* renamed from: G */
    public final VideoMusicCoverVM mo80688G() {
        return (VideoMusicCoverVM) this.f112655F.mo23374a(this, f112649u[0]);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: H */
    public final View mo80494H() {
        if (this.f112660K == null) {
            this.f112660K = new SparseArray();
        }
        View view = (View) this.f112660K.get(R.id.dii);
        if (view != null) {
            return view;
        }
        View t = mo20528t();
        if (t == null) {
            return null;
        }
        View findViewById = t.findViewById(R.id.dii);
        this.f112660K.put(R.id.dii, findViewById);
        return findViewById;
    }

    /* renamed from: I */
    public final VideoMusicBaseVM mo80689I() {
        return (VideoMusicBaseVM) this.f112656G.mo23374a(this, f112649u[1]);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$b */
    public static final class C48785b extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112668a;

        static {
            Covode.recordClassIndex(57571);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48785b(AbstractC12693u uVar) {
            super(0);
            this.f112668a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f112668a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$f */
    public static final class C48789f extends AbstractC89220m implements AbstractC89171a<C12874b<C48823m>> {
        public static final C48789f INSTANCE = new C48789f();

        static {
            Covode.recordClassIndex(57575);
        }

        public C48789f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48823m> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$g */
    public static final class C48790g extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112671a;

        static {
            Covode.recordClassIndex(57576);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48790g(AbstractC12693u uVar) {
            super(0);
            this.f112671a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f112671a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$l */
    public static final class C48795l extends AbstractC89220m implements AbstractC89171a<C12874b<C48781a>> {
        public static final C48795l INSTANCE = new C48795l();

        static {
            Covode.recordClassIndex(57581);
        }

        public C48795l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48781a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$n */
    public static final class C48797n extends AbstractC89220m implements AbstractC89171a<C12874b<C48244cj>> {
        public static final C48797n INSTANCE = new C48797n();

        static {
            Covode.recordClassIndex(57583);
        }

        public C48797n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48244cj> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$o */
    public static final class C48798o extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48798o INSTANCE = new C48798o();

        static {
            Covode.recordClassIndex(57584);
        }

        public C48798o() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$q */
    public static final class C48800q extends AbstractC89220m implements AbstractC89171a<C12874b<C48200bc>> {
        public static final C48800q INSTANCE = new C48800q();

        static {
            Covode.recordClassIndex(57586);
        }

        public C48800q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48200bc> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$r */
    public static final class C48801r extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48801r INSTANCE = new C48801r();

        static {
            Covode.recordClassIndex(57587);
        }

        public C48801r() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$c */
    public static final class C48786c extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112669a;

        static {
            Covode.recordClassIndex(57572);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48786c(AbstractC12693u uVar) {
            super(0);
            this.f112669a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f112669a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$d */
    public static final class C48787d extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112670a;

        static {
            Covode.recordClassIndex(57573);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48787d(AbstractC12693u uVar) {
            super(0);
            this.f112670a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f112670a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$h */
    public static final class C48791h extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112672a;

        static {
            Covode.recordClassIndex(57577);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48791h(AbstractC12693u uVar) {
            super(0);
            this.f112672a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f112672a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$i */
    public static final class C48792i extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112673a;

        static {
            Covode.recordClassIndex(57578);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48792i(AbstractC12693u uVar) {
            super(0);
            this.f112673a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f112673a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$a */
    public static final class C48783a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f112666a;

        static {
            Covode.recordClassIndex(57569);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48783a(AbstractC89277c cVar) {
            super(0);
            this.f112666a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f112666a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$j */
    public static final class C48793j extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f112674a;

        static {
            Covode.recordClassIndex(57579);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48793j(AbstractC89277c cVar) {
            super(0);
            this.f112674a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f112674a).getName();
        }
    }

    /* renamed from: J */
    public final C36151e mo80690J() {
        if (this.f112665z == null) {
            this.f112665z = new C36151e();
        }
        C36151e eVar = this.f112665z;
        if (eVar == null) {
            C89219l.m154710a("musicCoverViewScaleHelper");
        }
        return eVar;
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: y */
    public final void mo20533y() {
        VideoMusicCoverVM G;
        super.mo20533y();
        mo20510a(G, C48813c.f112686a, C48815e.f112688a, C12856l.m23102a(mo80688G().f31149c), null, C48805t.f112678a);
        AbstractC12818f.C12819a.m23063a(this, mo80688G(), C48816f.f112689a, (C12854k) null, C48807u.f112680a, 6);
        AbstractC12818f.C12819a.m23063a(this, mo80688G(), C48817g.f112690a, (C12854k) null, C48808v.f112681a, 6);
        AbstractC12818f.C12819a.m23063a(this, mo80688G(), C48818h.f112691a, (C12854k) null, C48809w.f112682a, 6);
        AbstractC12818f.C12819a.m23063a(this, mo80688G(), C48814d.f112687a, (C12854k) null, C48802s.f112675a, 6);
    }

    public C48782b() {
        AbstractC12848i.C12851c cVar = AbstractC12848i.C12851c.f31277a;
        AbstractC89277c a = C89204ab.m154669a(VideoMusicCoverVM.class);
        this.f112655F = C14530k.m26542a(this, a, cVar == null ? AbstractC12848i.C12851c.f31277a : cVar, new C48783a(a), C48789f.INSTANCE, new C48790g(this), C48788e.INSTANCE, null, null, new C48791h(this), new C48792i(this));
        AbstractC12848i.C12851c cVar2 = AbstractC12848i.C12851c.f31277a;
        AbstractC89277c a2 = C89204ab.m154669a(VideoMusicBaseVM.class);
        this.f112656G = C14530k.m26542a(this, a2, cVar2 == null ? AbstractC12848i.C12851c.f31277a : cVar2, new C48793j(a2), C48795l.INSTANCE, new C48785b(this), C48794k.INSTANCE, null, null, new C48786c(this), new C48787d(this));
        this.f112657H = new C14524g(C89204ab.m154669a(VideoViewModel.class), this, C48797n.INSTANCE, C48798o.INSTANCE, C48796m.INSTANCE);
        this.f112658I = new C14524g(C89204ab.m154669a(VideoPlayViewModel.class), this, C48800q.INSTANCE, C48801r.INSTANCE, C48799p.INSTANCE);
        this.f112652C = 49.0d;
        this.f112653D = 27.0d;
        this.f112654E = 64;
        this.f112659J = 80.0f;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
    }

    /* renamed from: a */
    public static void m92074a(SmartImageView smartImageView) {
        C20766v a = C20761r.m39056a(2131233154);
        a.f49092E = smartImageView;
        a.mo34186c();
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
        this.f112664y = (FrameLayout) mo20546C().findViewById(R.id.cnm);
        this.f112662w = (SmartCircleImageView) mo20546C().findViewById(R.id.cnl);
        this.f112661v = (SmartCircleImageView) mo20546C().findViewById(R.id.cxm);
        this.f112663x = (PeriscopeLayout) mo20546C().findViewById(R.id.ctt);
        SmartCircleImageView smartCircleImageView = this.f112662w;
        if (smartCircleImageView != null) {
            smartCircleImageView.setOnTouchListener(new View$OnTouchListenerC17271b());
        }
        C36151e J = mo80690J();
        J.f85402a = mo20546C().findViewById(R.id.co8);
        J.f85404c = this.f112664y;
        J.f85405d = this.f112662w;
        J.f85403b = this.f112663x;
        J.f85406e = this.f112661v;
        J.f85407f = mo20528t();
        AbstractC12818f.C12819a.m23070b(this, (VideoViewModel) this.f112657H.getValue(), C48819i.f112692a, C12856l.m23100a(), C48810x.f112683a, 4);
        AbstractC12818f.C12819a.m23070b(this, m92073K(), C48820j.f112693a, C12856l.m23100a(), C48811y.f112684a, 4);
        AbstractC12818f.C12819a.m23070b(this, m92073K(), C48821k.f112694a, C12856l.m23100a(), C48812z.f112685a, 4);
        AbstractC12818f.C12819a.m23070b(this, m92073K(), C48822l.f112695a, C12856l.m23100a(), C48784aa.f112667a, 4);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$x */
    static final class C48810x extends AbstractC89220m implements AbstractC89183m<C48782b, C12776a<? extends Integer>, C89391z> {

        /* renamed from: a */
        public static final C48810x f112683a = new C48810x();

        static {
            Covode.recordClassIndex(57596);
        }

        C48810x() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48782b bVar, C12776a<? extends Integer> aVar) {
            C48782b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo80689I().mo80681i();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$aa */
    static final class C48784aa extends AbstractC89220m implements AbstractC89183m<C48782b, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        public static final C48784aa f112667a = new C48784aa();

        static {
            Covode.recordClassIndex(57570);
        }

        C48784aa() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48782b bVar, C12776a<? extends Boolean> aVar) {
            long j;
            C48782b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar, "");
            VideoMusicCoverVM G = bVar2.mo80688G();
            if (G.f112635k && !VideoMusicCoverVM.m92066h()) {
                G.f112635k = false;
                Handler handler = new Handler(Looper.getMainLooper());
                VideoMusicCoverVM.RunnableC48773c cVar = new VideoMusicCoverVM.RunnableC48773c(G);
                if (C46965gb.f109453a) {
                    j = 300;
                } else {
                    j = 0;
                }
                handler.postDelayed(cVar, j);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$s */
    static final class C48802s extends AbstractC89220m implements AbstractC89183m<C48782b, Boolean, C89391z> {

        /* renamed from: a */
        public static final C48802s f112675a = new C48802s();

        static {
            Covode.recordClassIndex(57588);
        }

        C48802s() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48782b bVar, Boolean bool) {
            final C48782b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar2, "");
            if (booleanValue) {
                SmartCircleImageView smartCircleImageView = bVar2.f112662w;
                if (smartCircleImageView != null) {
                    smartCircleImageView.setOnClickListener(new View.OnClickListener() {
                        /* class com.p2082ss.android.ugc.aweme.feed.assem.music.C48782b.C48802s.View$OnClickListenerC488031 */

                        static {
                            Covode.recordClassIndex(57589);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            new C79459a(bVar2.az_()).mo123050a(R.string.fel).mo123053a();
                        }
                    });
                }
            } else {
                SmartCircleImageView smartCircleImageView2 = bVar2.f112662w;
                if (smartCircleImageView2 != null) {
                    smartCircleImageView2.setOnClickListener(new View.OnClickListener() {
                        /* class com.p2082ss.android.ugc.aweme.feed.assem.music.C48782b.C48802s.View$OnClickListenerC488042 */

                        static {
                            Covode.recordClassIndex(57590);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            if (!C58001a.m104815a(view, 1200)) {
                                VideoMusicBaseVM I = bVar2.mo80689I();
                                C89219l.m154716b(view, "");
                                Context context = view.getContext();
                                C89219l.m154716b(context, "");
                                I.mo80680a(context, view.getId());
                            }
                        }
                    });
                }
            }
            bVar2.mo80690J().mo63274b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$u */
    static final class C48807u extends AbstractC89220m implements AbstractC89183m<C48782b, Boolean, C89391z> {

        /* renamed from: a */
        public static final C48807u f112680a = new C48807u();

        static {
            Covode.recordClassIndex(57593);
        }

        C48807u() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48782b bVar, Boolean bool) {
            ValueAnimator valueAnimator;
            C48782b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar2, "");
            if (booleanValue) {
                PeriscopeLayout periscopeLayout = bVar2.f112663x;
                if (periscopeLayout != null) {
                    periscopeLayout.mo85801b();
                }
                if (!(bVar2.f112664y == null || (valueAnimator = bVar2.f112650A) == null)) {
                    valueAnimator.end();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$v */
    static final class C48808v extends AbstractC89220m implements AbstractC89183m<C48782b, Boolean, C89391z> {

        /* renamed from: a */
        public static final C48808v f112681a = new C48808v();

        static {
            Covode.recordClassIndex(57594);
        }

        C48808v() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48782b bVar, Boolean bool) {
            ValueAnimator valueAnimator;
            C48782b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar2, "");
            if (booleanValue) {
                if (!(bVar2.f112664y == null || (valueAnimator = bVar2.f112650A) == null)) {
                    valueAnimator.end();
                }
                PeriscopeLayout periscopeLayout = bVar2.f112663x;
                if (periscopeLayout != null) {
                    periscopeLayout.mo85802c();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$z */
    static final class C48812z extends AbstractC89220m implements AbstractC89183m<C48782b, C12776a<? extends Integer>, C89391z> {

        /* renamed from: a */
        public static final C48812z f112685a = new C48812z();

        static {
            Covode.recordClassIndex(57598);
        }

        C48812z() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48782b bVar, C12776a<? extends Integer> aVar) {
            long j;
            C48782b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar, "");
            VideoMusicCoverVM G = bVar2.mo80688G();
            if (G.f112635k && !VideoMusicCoverVM.m92066h()) {
                G.f112635k = false;
                Handler handler = new Handler(Looper.getMainLooper());
                VideoMusicCoverVM.RunnableC48769a aVar2 = new VideoMusicCoverVM.RunnableC48769a(G);
                if (C46965gb.f109453a) {
                    j = 300;
                } else {
                    j = 0;
                }
                handler.postDelayed(aVar2, j);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$y */
    static final class C48811y extends AbstractC89220m implements AbstractC89183m<C48782b, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        public static final C48811y f112684a = new C48811y();

        static {
            Covode.recordClassIndex(57597);
        }

        C48811y() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48782b bVar, C12776a<? extends Boolean> aVar) {
            long j;
            C48782b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(aVar, "");
            VideoMusicCoverVM G = bVar2.mo80688G();
            if (!G.f112635k && !VideoMusicCoverVM.m92066h()) {
                C63303c a = C63303c.m114800a();
                C89219l.m154716b(a, "");
                if (!a.mo101877b()) {
                    G.f112635k = true;
                    Handler handler = new Handler(Looper.getMainLooper());
                    VideoMusicCoverVM.RunnableC48771b bVar3 = new VideoMusicCoverVM.RunnableC48771b(G);
                    if (C46965gb.f109453a) {
                        j = 300;
                    } else {
                        j = 0;
                    }
                    handler.postDelayed(bVar3, j);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$w */
    static final class C48809w extends AbstractC89220m implements AbstractC89183m<C48782b, Music, C89391z> {

        /* renamed from: a */
        public static final C48809w f112682a = new C48809w();

        static {
            Covode.recordClassIndex(57595);
        }

        C48809w() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00b6  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00e2  */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.feed.assem.music.C48782b r7, com.p2082ss.android.ugc.aweme.music.model.Music r8) {
            /*
            // Method dump skipped, instructions count: 278
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.music.C48782b.C48809w.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.b$t */
    static final class C48805t extends AbstractC89220m implements AbstractC89187q<C48782b, Boolean, Boolean, C89391z> {

        /* renamed from: a */
        public static final C48805t f112678a = new C48805t();

        static {
            Covode.recordClassIndex(57591);
        }

        C48805t() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(C48782b bVar, Boolean bool, Boolean bool2) {
            PeriscopeLayout periscopeLayout;
            final C48782b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            C89219l.m154721d(bVar2, "");
            if (booleanValue && bVar2.f112664y != null) {
                if (bVar2.f112650A != null) {
                    ValueAnimator valueAnimator = bVar2.f112650A;
                    if (valueAnimator != null) {
                        valueAnimator.end();
                    }
                } else {
                    bVar2.f112650A = ValueAnimator.ofFloat(0.0f, 360.0f);
                    ValueAnimator valueAnimator2 = bVar2.f112650A;
                    if (valueAnimator2 != null) {
                        valueAnimator2.setDuration(8000L);
                    }
                    ValueAnimator valueAnimator3 = bVar2.f112650A;
                    if (valueAnimator3 != null) {
                        valueAnimator3.setRepeatMode(1);
                    }
                    ValueAnimator valueAnimator4 = bVar2.f112650A;
                    if (valueAnimator4 != null) {
                        valueAnimator4.setInterpolator(new LinearInterpolator());
                    }
                    ValueAnimator valueAnimator5 = bVar2.f112650A;
                    if (valueAnimator5 != null) {
                        valueAnimator5.setRepeatCount(-1);
                    }
                    ValueAnimator valueAnimator6 = bVar2.f112650A;
                    if (valueAnimator6 != null) {
                        valueAnimator6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            /* class com.p2082ss.android.ugc.aweme.feed.assem.music.C48782b.C48805t.C488061 */

                            static {
                                Covode.recordClassIndex(57592);
                            }

                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                if (System.currentTimeMillis() - bVar2.f112651B > ((long) bVar2.f112654E)) {
                                    bVar2.f112651B = System.currentTimeMillis();
                                    FrameLayout frameLayout = bVar2.f112664y;
                                    if (frameLayout != null) {
                                        C89219l.m154716b(valueAnimator, "");
                                        Object animatedValue = valueAnimator.getAnimatedValue();
                                        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                                        frameLayout.setRotation(((Float) animatedValue).floatValue());
                                    }
                                }
                            }
                        });
                    }
                }
                ValueAnimator valueAnimator7 = bVar2.f112650A;
                if (valueAnimator7 != null) {
                    C34668a.m70812a(valueAnimator7, C34670c.f81923a);
                }
            }
            if (booleanValue2 && (periscopeLayout = bVar2.f112663x) != null) {
                periscopeLayout.mo85799a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m92075a(SmartImageView smartImageView, UrlModel urlModel, int i, int i2) {
        C20766v a = C20761r.m39060a(C34735v.m70965a(urlModel)).mo34176a(i, i2);
        a.f49098K = true;
        C20766v a2 = a.mo34179a("VideoMusicCoverView");
        a2.f49092E = smartImageView;
        a2.mo34186c();
    }
}
