package com.p2082ss.android.ugc.aweme.feed.assem.report;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.C1175ad;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14524g;
import com.bytedance.ext_power_list.C14530k;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48200bc;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48244cj;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.p2082ss.android.ugc.aweme.feed.api.CancelVideoMaskApi;
import com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a;
import com.p2082ss.android.ugc.aweme.feed.assem.report.ReportVideoMaskVM;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80422fe;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
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

/* renamed from: com.ss.android.ugc.aweme.feed.assem.report.c */
public final class C48959c extends AbstractC48491a<C48959c> {

    /* renamed from: u */
    static final /* synthetic */ AbstractC89286i[] f112862u = {new C89232y(C48959c.class, "reportVM", "getReportVM()Lcom/ss/android/ugc/aweme/feed/assem/report/ReportVideoMaskVM;", 0)};

    /* renamed from: v */
    private final AbstractC89248d f112863v;

    /* renamed from: w */
    private final AbstractC89244h f112864w = new C14524g(C89204ab.m154669a(VideoViewModel.class), this, C48967h.INSTANCE, C48968i.INSTANCE, C48966g.INSTANCE);

    /* renamed from: x */
    private final AbstractC89244h f112865x = new C14524g(C89204ab.m154669a(VideoPlayViewModel.class), this, C48970k.INSTANCE, C48971l.INSTANCE, C48969j.INSTANCE);

    /* renamed from: y */
    private SparseArray f112866y;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.c$b */
    public static final class C48961b extends AbstractC89220m implements AbstractC89172b<C48980h, C48980h> {
        public static final C48961b INSTANCE = new C48961b();

        static {
            Covode.recordClassIndex(57750);
        }

        public C48961b() {
            super(1);
        }

        public final C48980h invoke(C48980h hVar) {
            C89219l.m154719c(hVar, "");
            return hVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.c$g */
    public static final class C48966g extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {
        public static final C48966g INSTANCE = new C48966g();

        static {
            Covode.recordClassIndex(57755);
        }

        public C48966g() {
            super(1);
        }

        public final C48244cj invoke(C48244cj cjVar) {
            C89219l.m154719c(cjVar, "");
            return cjVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.c$j */
    public static final class C48969j extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {
        public static final C48969j INSTANCE = new C48969j();

        static {
            Covode.recordClassIndex(57758);
        }

        public C48969j() {
            super(1);
        }

        public final C48200bc invoke(C48200bc bcVar) {
            C89219l.m154719c(bcVar, "");
            return bcVar;
        }
    }

    static {
        Covode.recordClassIndex(57748);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: D */
    public final int mo20547D() {
        return R.layout.td;
    }

    /* renamed from: G */
    public final ReportVideoMaskVM mo80746G() {
        return (ReportVideoMaskVM) this.f112863v.mo23374a(this, f112862u[0]);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: H */
    public final View mo80494H() {
        if (this.f112866y == null) {
            this.f112866y = new SparseArray();
        }
        View view = (View) this.f112866y.get(R.id.dii);
        if (view != null) {
            return view;
        }
        View t = mo20528t();
        if (t == null) {
            return null;
        }
        View findViewById = t.findViewById(R.id.dii);
        this.f112866y.put(R.id.dii, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.c$c */
    public static final class C48962c extends AbstractC89220m implements AbstractC89171a<C12874b<C48980h>> {
        public static final C48962c INSTANCE = new C48962c();

        static {
            Covode.recordClassIndex(57751);
        }

        public C48962c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48980h> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.c$d */
    public static final class C48963d extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112868a;

        static {
            Covode.recordClassIndex(57752);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48963d(AbstractC12693u uVar) {
            super(0);
            this.f112868a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f112868a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.c$h */
    public static final class C48967h extends AbstractC89220m implements AbstractC89171a<C12874b<C48244cj>> {
        public static final C48967h INSTANCE = new C48967h();

        static {
            Covode.recordClassIndex(57756);
        }

        public C48967h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48244cj> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.c$i */
    public static final class C48968i extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48968i INSTANCE = new C48968i();

        static {
            Covode.recordClassIndex(57757);
        }

        public C48968i() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.c$k */
    public static final class C48970k extends AbstractC89220m implements AbstractC89171a<C12874b<C48200bc>> {
        public static final C48970k INSTANCE = new C48970k();

        static {
            Covode.recordClassIndex(57759);
        }

        public C48970k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48200bc> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.c$l */
    public static final class C48971l extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48971l INSTANCE = new C48971l();

        static {
            Covode.recordClassIndex(57760);
        }

        public C48971l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.c$e */
    public static final class C48964e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112869a;

        static {
            Covode.recordClassIndex(57753);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48964e(AbstractC12693u uVar) {
            super(0);
            this.f112869a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f112869a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.c$f */
    public static final class C48965f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112870a;

        static {
            Covode.recordClassIndex(57754);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48965f(AbstractC12693u uVar) {
            super(0);
            this.f112870a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f112870a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.c$a */
    public static final class C48960a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f112867a;

        static {
            Covode.recordClassIndex(57749);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48960a(AbstractC89277c cVar) {
            super(0);
            this.f112867a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f112867a).getName();
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: y */
    public final void mo20533y() {
        ReportVideoMaskVM G;
        super.mo20533y();
        Thread currentThread = Thread.currentThread();
        C89219l.m154716b(currentThread, "");
        currentThread.getName();
        mo20510a(G, C48976d.f112877a, C48977e.f112878a, C12856l.m23102a(mo80746G().f31149c), null, C48972m.f112871a);
    }

    public C48959c() {
        AbstractC89277c a = C89204ab.m154669a(ReportVideoMaskVM.class);
        this.f112863v = C14530k.m26542a(this, a, AbstractC12848i.C12851c.f31277a, new C48960a(a), C48962c.INSTANCE, new C48963d(this), C48961b.INSTANCE, null, null, new C48964e(this), new C48965f(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
        Thread currentThread = Thread.currentThread();
        C89219l.m154716b(currentThread, "");
        currentThread.getName();
        mo20546C().setVisibility(8);
        AbstractC12818f.C12819a.m23070b(this, (VideoViewModel) this.f112864w.getValue(), C48978f.f112879a, C12856l.m23100a(), C48974n.f112875a, 4);
        AbstractC12818f.C12819a.m23070b(this, (VideoPlayViewModel) this.f112865x.getValue(), C48979g.f112880a, C12856l.m23100a(), C48975o.f112876a, 4);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.c$m */
    static final class C48972m extends AbstractC89220m implements AbstractC89187q<C48959c, VideoMaskInfo, Boolean, C89391z> {

        /* renamed from: a */
        public static final C48972m f112871a = new C48972m();

        static {
            Covode.recordClassIndex(57761);
        }

        C48972m() {
            super(3);
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.c$m$a */
        static final class View$OnClickListenerC48973a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C48959c f112872a;

            /* renamed from: b */
            final /* synthetic */ VideoMaskInfo f112873b;

            /* renamed from: c */
            final /* synthetic */ Context f112874c;

            static {
                Covode.recordClassIndex(57762);
            }

            View$OnClickListenerC48973a(C48959c cVar, VideoMaskInfo videoMaskInfo, Context context) {
                this.f112872a = cVar;
                this.f112873b = videoMaskInfo;
                this.f112874c = context;
            }

            public final void onClick(View view) {
                Aweme aweme;
                VideoItemParams videoItemParams;
                Aweme aweme2;
                ClickAgent.onClick(view);
                ReportVideoMaskVM G = this.f112872a.mo80746G();
                Context context = this.f112874c;
                C89219l.m154716b(context, "");
                C89219l.m154721d(context, "");
                if (!C80422fe.m139425a(context)) {
                    new C79459a(context).mo123050a(R.string.dcq).mo123053a();
                } else {
                    VideoItemParams videoItemParams2 = (VideoItemParams) G.mo23342g();
                    if (!(videoItemParams2 == null || (aweme = videoItemParams2.mAweme) == null || (videoItemParams = (VideoItemParams) G.mo23342g()) == null || (aweme2 = videoItemParams.mAweme) == null || aweme2.getReportMaskInfo() == null)) {
                        String aid = aweme.getAid();
                        C89219l.m154716b(aid, "");
                        CancelVideoMaskApi.m91764a(aid, aweme.getReportMaskInfo().getMaskType(), aweme.getReportMaskInfo().getStatus()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new ReportVideoMaskVM.C48952a(G, context));
                    }
                }
                this.f112872a.mo80746G().mo80745a("showpost_click");
                ReportVideoMaskVM G2 = this.f112872a.mo80746G();
                Context context2 = this.f112874c;
                C89219l.m154716b(context2, "");
                G2.mo80744a(context2, "play");
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(C48959c cVar, VideoMaskInfo videoMaskInfo, Boolean bool) {
            String string;
            String string2;
            String string3;
            C48959c cVar2 = cVar;
            VideoMaskInfo videoMaskInfo2 = videoMaskInfo;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(cVar2, "");
            Thread currentThread = Thread.currentThread();
            C89219l.m154716b(currentThread, "");
            currentThread.getName();
            if (!booleanValue) {
                cVar2.mo20546C().setVisibility(8);
            } else if (cVar2.mo20546C().getVisibility() != 0) {
                Context context = cVar2.mo20546C().getContext();
                TuxTextView tuxTextView = (TuxTextView) cVar2.mo20546C().findViewById(R.id.title);
                if (tuxTextView != null) {
                    if (videoMaskInfo2 == null || (string3 = videoMaskInfo2.getTitle()) == null) {
                        string3 = context.getString(R.string.fah);
                    }
                    tuxTextView.setText(string3);
                }
                TuxTextView tuxTextView2 = (TuxTextView) cVar2.mo20546C().findViewById(R.id.acq);
                C89219l.m154716b(tuxTextView2, "");
                if (videoMaskInfo2 == null || (string = videoMaskInfo2.getContent()) == null) {
                    string = context.getString(R.string.faf);
                }
                tuxTextView2.setText(string);
                TuxTextView tuxTextView3 = (TuxTextView) cVar2.mo20546C().findViewById(R.id.button);
                if (tuxTextView3 != null) {
                    if (videoMaskInfo2 == null || (string2 = videoMaskInfo2.getCancelMaskLabel()) == null) {
                        string2 = context.getString(R.string.fag);
                    }
                    tuxTextView3.setText(string2);
                    tuxTextView3.setOnClickListener(new View$OnClickListenerC48973a(cVar2, videoMaskInfo2, context));
                }
                cVar2.mo20546C().setVisibility(0);
                cVar2.mo80746G().mo80745a("reportlayer_show");
                ReportVideoMaskVM G = cVar2.mo80746G();
                C89219l.m154716b(context, "");
                G.mo80744a(context, "othershow");
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.c$o */
    static final class C48975o extends AbstractC89220m implements AbstractC89183m<C48959c, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        public static final C48975o f112876a = new C48975o();

        static {
            Covode.recordClassIndex(57764);
        }

        C48975o() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48959c cVar, C12776a<? extends Boolean> aVar) {
            C48959c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            C89219l.m154721d(aVar, "");
            ReportVideoMaskVM G = cVar2.mo80746G();
            G.mo20667b(new ReportVideoMaskVM.C48955c(G));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.c$n */
    static final class C48974n extends AbstractC89220m implements AbstractC89183m<C48959c, C12776a<? extends Integer>, C89391z> {

        /* renamed from: a */
        public static final C48974n f112875a = new C48974n();

        static {
            Covode.recordClassIndex(57763);
        }

        C48974n() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48959c cVar, C12776a<? extends Integer> aVar) {
            C48959c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            Thread currentThread = Thread.currentThread();
            C89219l.m154716b(currentThread, "");
            currentThread.getName();
            ReportVideoMaskVM G = cVar2.mo80746G();
            VideoItemParams videoItemParams = (VideoItemParams) G.mo23342g();
            if (videoItemParams != null) {
                G.mo20662a(new ReportVideoMaskVM.C48954b(videoItemParams, G));
            }
            return C89391z.f203057a;
        }
    }
}
