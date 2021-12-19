package com.p2082ss.android.ugc.aweme.feed.assem.caution;

import android.text.SpannableString;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
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
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14524g;
import com.bytedance.ext_power_list.C14530k;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48200bc;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48244cj;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a;
import com.p2082ss.android.ugc.aweme.feed.assem.caution.VideoTopCautionVM;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49536y;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.KtfInfo;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.shortvideo.C71872i;
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

/* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.a */
public final class C48497a extends AbstractC48491a<C48497a> {

    /* renamed from: u */
    static final /* synthetic */ AbstractC89286i[] f112244u = {new C89232y(C48497a.class, "topCautionVM", "getTopCautionVM()Lcom/ss/android/ugc/aweme/feed/assem/caution/VideoTopCautionVM;", 0)};

    /* renamed from: v */
    public static final C48510m f112245v = new C48510m((byte) 0);

    /* renamed from: w */
    private final AbstractC89248d f112246w;

    /* renamed from: x */
    private final AbstractC89244h f112247x = new C14524g(C89204ab.m154669a(VideoViewModel.class), this, C48505h.INSTANCE, C48506i.INSTANCE, C48504g.INSTANCE);

    /* renamed from: y */
    private final AbstractC89244h f112248y = new C14524g(C89204ab.m154669a(VideoPlayViewModel.class), this, C48508k.INSTANCE, C48509l.INSTANCE, C48507j.INSTANCE);

    /* renamed from: z */
    private SparseArray f112249z;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.a$b */
    public static final class C48499b extends AbstractC89220m implements AbstractC89172b<C48522g, C48522g> {
        public static final C48499b INSTANCE = new C48499b();

        static {
            Covode.recordClassIndex(57275);
        }

        public C48499b() {
            super(1);
        }

        public final C48522g invoke(C48522g gVar) {
            C89219l.m154719c(gVar, "");
            return gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.a$g */
    public static final class C48504g extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {
        public static final C48504g INSTANCE = new C48504g();

        static {
            Covode.recordClassIndex(57280);
        }

        public C48504g() {
            super(1);
        }

        public final C48244cj invoke(C48244cj cjVar) {
            C89219l.m154719c(cjVar, "");
            return cjVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.a$j */
    public static final class C48507j extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {
        public static final C48507j INSTANCE = new C48507j();

        static {
            Covode.recordClassIndex(57283);
        }

        public C48507j() {
            super(1);
        }

        public final C48200bc invoke(C48200bc bcVar) {
            C89219l.m154719c(bcVar, "");
            return bcVar;
        }
    }

    static {
        Covode.recordClassIndex(57273);
    }

    /* renamed from: I */
    private final VideoViewModel m91911I() {
        return (VideoViewModel) this.f112247x.getValue();
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: D */
    public final int mo20547D() {
        return R.layout.tn;
    }

    /* renamed from: G */
    public final VideoTopCautionVM mo80554G() {
        return (VideoTopCautionVM) this.f112246w.mo23374a(this, f112244u[0]);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: H */
    public final View mo80494H() {
        if (this.f112249z == null) {
            this.f112249z = new SparseArray();
        }
        View view = (View) this.f112249z.get(R.id.dii);
        if (view != null) {
            return view;
        }
        View t = mo20528t();
        if (t == null) {
            return null;
        }
        View findViewById = t.findViewById(R.id.dii);
        this.f112249z.put(R.id.dii, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.a$m */
    public static final class C48510m {
        static {
            Covode.recordClassIndex(57286);
        }

        private C48510m() {
        }

        public /* synthetic */ C48510m(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.a$c */
    public static final class C48500c extends AbstractC89220m implements AbstractC89171a<C12874b<C48522g>> {
        public static final C48500c INSTANCE = new C48500c();

        static {
            Covode.recordClassIndex(57276);
        }

        public C48500c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48522g> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.a$d */
    public static final class C48501d extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112251a;

        static {
            Covode.recordClassIndex(57277);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48501d(AbstractC12693u uVar) {
            super(0);
            this.f112251a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f112251a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.a$h */
    public static final class C48505h extends AbstractC89220m implements AbstractC89171a<C12874b<C48244cj>> {
        public static final C48505h INSTANCE = new C48505h();

        static {
            Covode.recordClassIndex(57281);
        }

        public C48505h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48244cj> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.a$i */
    public static final class C48506i extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48506i INSTANCE = new C48506i();

        static {
            Covode.recordClassIndex(57282);
        }

        public C48506i() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.a$k */
    public static final class C48508k extends AbstractC89220m implements AbstractC89171a<C12874b<C48200bc>> {
        public static final C48508k INSTANCE = new C48508k();

        static {
            Covode.recordClassIndex(57284);
        }

        public C48508k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48200bc> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.a$l */
    public static final class C48509l extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48509l INSTANCE = new C48509l();

        static {
            Covode.recordClassIndex(57285);
        }

        public C48509l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.a$e */
    public static final class C48502e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112252a;

        static {
            Covode.recordClassIndex(57278);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48502e(AbstractC12693u uVar) {
            super(0);
            this.f112252a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f112252a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.a$f */
    public static final class C48503f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112253a;

        static {
            Covode.recordClassIndex(57279);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48503f(AbstractC12693u uVar) {
            super(0);
            this.f112253a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f112253a.bD_().f30985g;
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u, com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: A */
    public final void mo20506A() {
        super.mo20506A();
        C51423a.m95784a(2, "VideoTopCautionAssem", "onInActive");
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.a$a */
    public static final class C48498a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f112250a;

        static {
            Covode.recordClassIndex(57274);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48498a(AbstractC89277c cVar) {
            super(0);
            this.f112250a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f112250a).getName();
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: y */
    public final void mo20533y() {
        super.mo20533y();
        AbstractC12818f.C12819a.m23063a(this, mo80554G(), C48517b.f112260a, (C12854k) null, C48511n.f112254a, 6);
        AbstractC12818f.C12819a.m23063a(this, mo80554G(), C48518c.f112261a, (C12854k) null, C48512o.f112255a, 6);
    }

    public C48497a() {
        AbstractC89277c a = C89204ab.m154669a(VideoTopCautionVM.class);
        this.f112246w = C14530k.m26542a(this, a, AbstractC12848i.C12851c.f31277a, new C48498a(a), C48500c.INSTANCE, new C48501d(this), C48499b.INSTANCE, null, null, new C48502e(this), new C48503f(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a, com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: c */
    public final /* synthetic */ boolean mo20470c(VideoItemParams videoItemParams) {
        return mo20470c(videoItemParams);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: b */
    public final boolean mo80553b(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
        if (C49536y.f113919a) {
            return C50539g.m94746b(videoItemParams.mAweme);
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.a$p */
    static final class View$OnClickListenerC48513p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48497a f112256a;

        static {
            Covode.recordClassIndex(57289);
        }

        View$OnClickListenerC48513p(C48497a aVar) {
            this.f112256a = aVar;
        }

        public final void onClick(View view) {
            Aweme aweme;
            ClickAgent.onClick(view);
            VideoTopCautionVM G = this.f112256a.mo80554G();
            G.mo20662a(VideoTopCautionVM.C48493a.f112240a);
            VideoItemParams videoItemParams = (VideoItemParams) G.mo23342g();
            String str = null;
            if (videoItemParams != null && videoItemParams.mAweme != null) {
                C33744d dVar = new C33744d();
                VideoItemParams videoItemParams2 = (VideoItemParams) G.mo23342g();
                if (!(videoItemParams2 == null || (aweme = videoItemParams2.mAweme) == null)) {
                    str = aweme.getAid();
                }
                C39162r.m79460a("tns_banner_dismiss_ktf", dVar.mo59983a("object_id", str).f79943a);
            }
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
        ViewGroup.LayoutParams layoutParams = mo20546C().getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin - C34723i.m70927b(), layoutParams2.rightMargin, layoutParams2.bottomMargin);
        }
        TuxIconView tuxIconView = (TuxIconView) mo20546C().findViewById(R.id.a24);
        if (tuxIconView != null) {
            tuxIconView.setOnClickListener(new View$OnClickListenerC48513p(this));
        }
        mo20546C().setVisibility(8);
        AbstractC12818f.C12819a.m23063a(this, m91911I(), C48519d.f112262a, (C12854k) null, C48514q.f112257a, 6);
        AbstractC12818f.C12819a.m23063a(this, m91911I(), C48520e.f112263a, (C12854k) null, C48515r.f112258a, 6);
        AbstractC12818f.C12819a.m23063a(this, (VideoPlayViewModel) this.f112248y.getValue(), C48521f.f112264a, (C12854k) null, C48516s.f112259a, 6);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.a$n */
    static final class C48511n extends AbstractC89220m implements AbstractC89183m<C48497a, Boolean, C89391z> {

        /* renamed from: a */
        public static final C48511n f112254a = new C48511n();

        static {
            Covode.recordClassIndex(57287);
        }

        C48511n() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48497a aVar, Boolean bool) {
            int i;
            C48497a aVar2 = aVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(aVar2, "");
            View C = aVar2.mo20546C();
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            C.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.a$o */
    static final class C48512o extends AbstractC89220m implements AbstractC89183m<C48497a, SpannableString, C89391z> {

        /* renamed from: a */
        public static final C48512o f112255a = new C48512o();

        static {
            Covode.recordClassIndex(57288);
        }

        C48512o() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48497a aVar, SpannableString spannableString) {
            C48497a aVar2 = aVar;
            SpannableString spannableString2 = spannableString;
            C89219l.m154721d(aVar2, "");
            TuxTextView tuxTextView = (TuxTextView) aVar2.mo20546C().findViewById(R.id.a25);
            if (tuxTextView != null) {
                tuxTextView.setText(spannableString2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.a$q */
    static final class C48514q extends AbstractC89220m implements AbstractC89183m<C48497a, C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        public static final C48514q f112257a = new C48514q();

        static {
            Covode.recordClassIndex(57290);
        }

        C48514q() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48497a aVar, C12776a<? extends C89391z> aVar2) {
            C48497a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            aVar3.mo80554G().mo20662a(VideoTopCautionVM.C48494b.f112241a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.a$r */
    static final class C48515r extends AbstractC89220m implements AbstractC89183m<C48497a, C12776a<? extends Integer>, C89391z> {

        /* renamed from: a */
        public static final C48515r f112258a = new C48515r();

        static {
            Covode.recordClassIndex(57291);
        }

        C48515r() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48497a aVar, C12776a<? extends Integer> aVar2) {
            Aweme aweme;
            C71872i uploadMiscInfoStruct;
            KtfInfo ktfInfo;
            C48497a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            VideoTopCautionVM G = aVar3.mo80554G();
            G.f112239k = true;
            VideoItemParams videoItemParams = (VideoItemParams) G.mo23342g();
            if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null || (uploadMiscInfoStruct = aweme.getUploadMiscInfoStruct()) == null || (ktfInfo = uploadMiscInfoStruct.ktfInfo) == null)) {
                C89219l.m154716b(ktfInfo, "");
                ktfInfo.resetState();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.caution.a$s */
    static final class C48516s extends AbstractC89220m implements AbstractC89183m<C48497a, C12776a<? extends Float>, C89391z> {

        /* renamed from: a */
        public static final C48516s f112259a = new C48516s();

        static {
            Covode.recordClassIndex(57292);
        }

        C48516s() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48497a aVar, C12776a<? extends Float> aVar2) {
            T t;
            C48497a aVar3 = aVar;
            C12776a<? extends Float> aVar4 = aVar2;
            C89219l.m154721d(aVar3, "");
            VideoTopCautionVM G = aVar3.mo80554G();
            Aweme aweme = null;
            if (aVar4 != null) {
                t = aVar4.f31085a;
            } else {
                t = null;
            }
            VideoItemParams videoItemParams = (VideoItemParams) G.mo23342g();
            if (videoItemParams != null) {
                aweme = videoItemParams.mAweme;
            }
            if (C50539g.m94746b(aweme) && t != null && t.floatValue() > 2.0f && G.f112239k) {
                G.f112239k = false;
                G.mo20667b(new VideoTopCautionVM.C48495c(G));
            }
            return C89391z.f203057a;
        }
    }
}
