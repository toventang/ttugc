package com.p2082ss.android.ugc.aweme.feed.assem.generalmask;

import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.C1175ad;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12784g;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.assem.arch.p795b.C12661l;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14524g;
import com.bytedance.ext_power_list.C14530k;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48200bc;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48244cj;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a;
import com.p2082ss.android.ugc.aweme.feed.assem.generalmask.GeneralVideoMaskVM;
import com.p2082ss.android.ugc.aweme.feed.model.Audio;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49673ah;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49674b;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33208e;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.C33205b;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79639a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89624i;
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

/* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.a */
public final class C48716a extends AbstractC48491a<C48716a> {

    /* renamed from: u */
    static final /* synthetic */ AbstractC89286i[] f112584u = {new C89232y(C48716a.class, "generalVideoMaskVM", "getGeneralVideoMaskVM()Lcom/ss/android/ugc/aweme/feed/assem/generalmask/GeneralVideoMaskVM;", 0)};

    /* renamed from: v */
    private final AbstractC89244h f112585v = new C14524g(C89204ab.m154669a(VideoViewModel.class), this, C48724h.INSTANCE, C48725i.INSTANCE, C48723g.INSTANCE);

    /* renamed from: w */
    private final AbstractC89244h f112586w = new C14524g(C89204ab.m154669a(VideoPlayViewModel.class), this, C48727k.INSTANCE, C48728l.INSTANCE, C48726j.INSTANCE);

    /* renamed from: x */
    private final AbstractC89248d f112587x;

    /* renamed from: y */
    private SparseArray f112588y;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.a$b */
    public static final class C48718b extends AbstractC89220m implements AbstractC89172b<C48738e, C48738e> {
        public static final C48718b INSTANCE = new C48718b();

        static {
            Covode.recordClassIndex(57499);
        }

        public C48718b() {
            super(1);
        }

        public final C48738e invoke(C48738e eVar) {
            C89219l.m154719c(eVar, "");
            return eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.a$g */
    public static final class C48723g extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {
        public static final C48723g INSTANCE = new C48723g();

        static {
            Covode.recordClassIndex(57504);
        }

        public C48723g() {
            super(1);
        }

        public final C48244cj invoke(C48244cj cjVar) {
            C89219l.m154719c(cjVar, "");
            return cjVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.a$j */
    public static final class C48726j extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {
        public static final C48726j INSTANCE = new C48726j();

        static {
            Covode.recordClassIndex(57507);
        }

        public C48726j() {
            super(1);
        }

        public final C48200bc invoke(C48200bc bcVar) {
            C89219l.m154719c(bcVar, "");
            return bcVar;
        }
    }

    static {
        Covode.recordClassIndex(57497);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: D */
    public final int mo20547D() {
        return R.layout.s8;
    }

    /* renamed from: G */
    public final GeneralVideoMaskVM mo80662G() {
        return (GeneralVideoMaskVM) this.f112587x.mo23374a(this, f112584u[0]);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: H */
    public final View mo80494H() {
        if (this.f112588y == null) {
            this.f112588y = new SparseArray();
        }
        View view = (View) this.f112588y.get(R.id.dii);
        if (view != null) {
            return view;
        }
        View t = mo20528t();
        if (t == null) {
            return null;
        }
        View findViewById = t.findViewById(R.id.dii);
        this.f112588y.put(R.id.dii, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.a$c */
    public static final class C48719c extends AbstractC89220m implements AbstractC89171a<C12874b<C48738e>> {
        public static final C48719c INSTANCE = new C48719c();

        static {
            Covode.recordClassIndex(57500);
        }

        public C48719c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48738e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.a$d */
    public static final class C48720d extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112590a;

        static {
            Covode.recordClassIndex(57501);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48720d(AbstractC12693u uVar) {
            super(0);
            this.f112590a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f112590a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.a$h */
    public static final class C48724h extends AbstractC89220m implements AbstractC89171a<C12874b<C48244cj>> {
        public static final C48724h INSTANCE = new C48724h();

        static {
            Covode.recordClassIndex(57505);
        }

        public C48724h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48244cj> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.a$i */
    public static final class C48725i extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48725i INSTANCE = new C48725i();

        static {
            Covode.recordClassIndex(57506);
        }

        public C48725i() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.a$k */
    public static final class C48727k extends AbstractC89220m implements AbstractC89171a<C12874b<C48200bc>> {
        public static final C48727k INSTANCE = new C48727k();

        static {
            Covode.recordClassIndex(57508);
        }

        public C48727k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48200bc> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.a$l */
    public static final class C48728l extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48728l INSTANCE = new C48728l();

        static {
            Covode.recordClassIndex(57509);
        }

        public C48728l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.a$e */
    public static final class C48721e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112591a;

        static {
            Covode.recordClassIndex(57502);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48721e(AbstractC12693u uVar) {
            super(0);
            this.f112591a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f112591a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.a$f */
    public static final class C48722f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112592a;

        static {
            Covode.recordClassIndex(57503);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48722f(AbstractC12693u uVar) {
            super(0);
            this.f112592a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f112592a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.a$a */
    public static final class C48717a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f112589a;

        static {
            Covode.recordClassIndex(57498);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48717a(AbstractC89277c cVar) {
            super(0);
            this.f112589a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f112589a).getName();
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: y */
    public final void mo20533y() {
        super.mo20533y();
        AbstractC12818f.C12819a.m23063a(this, mo80662G(), C48735b.f112599a, C12856l.m23100a(), new C48729m(this), 4);
    }

    public C48716a() {
        AbstractC89277c a = C89204ab.m154669a(GeneralVideoMaskVM.class);
        this.f112587x = C14530k.m26542a(this, a, AbstractC12848i.C12851c.f31277a, new C48717a(a), C48719c.INSTANCE, new C48720d(this), C48718b.INSTANCE, null, null, new C48721e(this), new C48722f(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.a$n */
    static final class View$OnClickListenerC48731n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48716a f112595a;

        static {
            Covode.recordClassIndex(57512);
        }

        View$OnClickListenerC48731n(C48716a aVar) {
            this.f112595a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            new C79459a(this.f112595a.az_()).mo123050a(R.string.dp3).mo123053a();
            AbstractC81915c.m141874a(new C79639a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.a$o */
    static final class View$OnClickListenerC48732o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48716a f112596a;

        static {
            Covode.recordClassIndex(57513);
        }

        View$OnClickListenerC48732o(C48716a aVar) {
            this.f112596a = aVar;
        }

        public final void onClick(View view) {
            Aweme aweme;
            Video video;
            String str;
            ClickAgent.onClick(view);
            GeneralVideoMaskVM G = this.f112596a.mo80662G();
            G.mo20662a(GeneralVideoMaskVM.C48709a.f112574a);
            VideoItemParams videoItemParams = (VideoItemParams) G.mo23342g();
            Audio audio = null;
            if (videoItemParams != null) {
                aweme = videoItemParams.mAweme;
            } else {
                aweme = null;
            }
            if (aweme == null || !aweme.isAd()) {
                AbstractC80747i O = C81079v.m140776O();
                if (aweme != null) {
                    video = aweme.getVideo();
                    audio = aweme.getAudio();
                } else {
                    video = null;
                }
                O.mo123923a(video, audio, false, true);
            } else if (C37699a.m76251aW(aweme)) {
                AbstractC33208e a = C33205b.m68071a();
                if (a != null) {
                    a.mo59097b();
                }
            } else {
                C81079v.m140776O().mo123950y();
            }
            if (aweme == null || (str = aweme.getAid()) == null) {
                str = "";
            }
            AbstractC81915c.m141874a(new C49673ah(false, str));
            AbstractC81915c.m141874a(new C49674b(true));
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
        mo20546C().setVisibility(8);
        TuxTextView tuxTextView = (TuxTextView) mo20546C().findViewById(R.id.button);
        if (tuxTextView != null) {
            tuxTextView.setOnClickListener(new View$OnClickListenerC48731n(this));
        }
        TuxTextView tuxTextView2 = (TuxTextView) mo20546C().findViewById(R.id.zz);
        if (tuxTextView2 != null) {
            tuxTextView2.setOnClickListener(new View$OnClickListenerC48732o(this));
        }
        AbstractC12818f.C12819a.m23063a(this, (VideoViewModel) this.f112585v.getValue(), C48736c.f112600a, (C12854k) null, new C48733p(this), 6);
        AbstractC12818f.C12819a.m23063a(this, (VideoPlayViewModel) this.f112586w.getValue(), C48737d.f112601a, C12856l.m23100a(), C48734q.f112598a, 4);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.a$p */
    static final class C48733p extends AbstractC89220m implements AbstractC89183m<C48716a, C12776a<? extends Integer>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48716a f112597a;

        static {
            Covode.recordClassIndex(57514);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48733p(C48716a aVar) {
            super(2);
            this.f112597a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48716a aVar, C12776a<? extends Integer> aVar2) {
            C48716a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            if (aVar2 != null) {
                C12661l.m22798b(aVar3);
                aVar3.mo80662G();
                GeneralVideoMaskVM G = aVar3.mo80662G();
                G.mo20662a(new GeneralVideoMaskVM.C48710b(G));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.a$q */
    static final class C48734q extends AbstractC89220m implements AbstractC89183m<C48716a, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        public static final C48734q f112598a = new C48734q();

        static {
            Covode.recordClassIndex(57515);
        }

        C48734q() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48716a aVar, C12776a<? extends Boolean> aVar2) {
            C48716a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            C89219l.m154721d(aVar2, "");
            GeneralVideoMaskVM G = aVar3.mo80662G();
            G.mo20667b(new GeneralVideoMaskVM.C48714f(G));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.generalmask.a$m */
    static final class C48729m extends AbstractC89220m implements AbstractC89183m<C48716a, C12784g, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48716a f112593a;

        static {
            Covode.recordClassIndex(57510);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48729m(C48716a aVar) {
            super(2);
            this.f112593a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48716a aVar, C12784g gVar) {
            final C48716a aVar2 = aVar;
            C12784g gVar2 = gVar;
            C89219l.m154721d(aVar2, "");
            C89219l.m154721d(gVar2, "");
            aVar2.mo80662G();
            if (gVar2.f31102a) {
                C48716a.m22850a(aVar2.mo80662G(), new AbstractC89172b<C48738e, C89391z>() {
                    /* class com.p2082ss.android.ugc.aweme.feed.assem.generalmask.C48716a.C48729m.C487301 */

                    static {
                        Covode.recordClassIndex(57511);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C48738e eVar) {
                        String str;
                        String str2;
                        C48738e eVar2 = eVar;
                        C89219l.m154721d(eVar2, "");
                        C48716a aVar = aVar2;
                        VideoMaskInfo videoMaskInfo = eVar2.f112603b;
                        if (aVar.mo20546C().getVisibility() != 0) {
                            aVar.mo20546C().setVisibility(0);
                            TuxTextView tuxTextView = (TuxTextView) aVar.mo20546C().findViewById(R.id.title);
                            C89219l.m154716b(tuxTextView, "");
                            if (videoMaskInfo != null) {
                                str = videoMaskInfo.getTitle();
                            } else {
                                str = null;
                            }
                            tuxTextView.setText(str);
                            TuxTextView tuxTextView2 = (TuxTextView) aVar.mo20546C().findViewById(R.id.acq);
                            C89219l.m154716b(tuxTextView2, "");
                            if (videoMaskInfo != null) {
                                str2 = videoMaskInfo.getContent();
                            } else {
                                str2 = null;
                            }
                            tuxTextView2.setText(str2);
                            TuxTextView tuxTextView3 = (TuxTextView) aVar.mo20546C().findViewById(R.id.button);
                            if (tuxTextView3 != null) {
                                GeneralVideoMaskVM G = aVar.mo80662G();
                                AbstractC89568bz unused = C89624i.m155555a(G.aP_(), null, null, new GeneralVideoMaskVM.C48711c(G, null), 3);
                                tuxTextView3.setText(R.string.d0u);
                            }
                            TuxTextView tuxTextView4 = (TuxTextView) aVar.mo20546C().findViewById(R.id.zz);
                            if (tuxTextView4 != null) {
                                GeneralVideoMaskVM G2 = aVar.mo80662G();
                                AbstractC89568bz unused2 = C89624i.m155555a(G2.aP_(), null, null, new GeneralVideoMaskVM.C48712d(G2, null), 3);
                                tuxTextView4.setText(R.string.d0v);
                            }
                            GeneralVideoMaskVM G3 = aVar.mo80662G();
                            AbstractC89568bz unused3 = C89624i.m155555a(G3.aP_(), null, null, new GeneralVideoMaskVM.C48713e(G3, null), 3);
                        }
                        return C89391z.f203057a;
                    }
                });
            } else {
                aVar2.mo20546C().setVisibility(8);
            }
            return C89391z.f203057a;
        }
    }
}
