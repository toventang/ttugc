package com.p2082ss.android.ugc.aweme.feed.assem.music;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
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
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.experiment.C46965gb;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48200bc;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48244cj;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a;
import com.p2082ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleVM;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49537z;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.p2483co.C36152f;
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

/* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n */
public final class C48824n extends AbstractC48491a<C48824n> {

    /* renamed from: u */
    static final /* synthetic */ AbstractC89286i[] f112702u = {new C89232y(C48824n.class, "musicTitleVM", "getMusicTitleVM()Lcom/ss/android/ugc/aweme/feed/assem/music/VideoMusicTitleVM;", 0), new C89232y(C48824n.class, "musicBaseVM", "getMusicBaseVM()Lcom/ss/android/ugc/aweme/feed/assem/music/VideoMusicBaseVM;", 0)};

    /* renamed from: A */
    private final AbstractC89248d f112703A;

    /* renamed from: B */
    private final AbstractC89244h f112704B;

    /* renamed from: C */
    private final AbstractC89244h f112705C;

    /* renamed from: D */
    private LinearLayout f112706D;

    /* renamed from: E */
    private TextView f112707E;

    /* renamed from: F */
    private boolean f112708F;

    /* renamed from: G */
    private SparseArray f112709G;

    /* renamed from: v */
    public ImageView f112710v;

    /* renamed from: w */
    public TextView f112711w;

    /* renamed from: x */
    public MarqueeView f112712x;

    /* renamed from: y */
    public C36152f f112713y;

    /* renamed from: z */
    private final AbstractC89248d f112714z;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$e */
    public static final class C48831e extends AbstractC89220m implements AbstractC89172b<C48863x, C48863x> {
        public static final C48831e INSTANCE = new C48831e();

        static {
            Covode.recordClassIndex(57617);
        }

        public C48831e() {
            super(1);
        }

        public final C48863x invoke(C48863x xVar) {
            C89219l.m154719c(xVar, "");
            return xVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$k */
    public static final class C48837k extends AbstractC89220m implements AbstractC89172b<C48781a, C48781a> {
        public static final C48837k INSTANCE = new C48837k();

        static {
            Covode.recordClassIndex(57623);
        }

        public C48837k() {
            super(1);
        }

        public final C48781a invoke(C48781a aVar) {
            C89219l.m154719c(aVar, "");
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$m */
    public static final class C48839m extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {
        public static final C48839m INSTANCE = new C48839m();

        static {
            Covode.recordClassIndex(57625);
        }

        public C48839m() {
            super(1);
        }

        public final C48244cj invoke(C48244cj cjVar) {
            C89219l.m154719c(cjVar, "");
            return cjVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$p */
    public static final class C48842p extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {
        public static final C48842p INSTANCE = new C48842p();

        static {
            Covode.recordClassIndex(57628);
        }

        public C48842p() {
            super(1);
        }

        public final C48200bc invoke(C48200bc bcVar) {
            C89219l.m154719c(bcVar, "");
            return bcVar;
        }
    }

    static {
        Covode.recordClassIndex(57610);
    }

    /* renamed from: J */
    private final VideoPlayViewModel m92085J() {
        return (VideoPlayViewModel) this.f112705C.getValue();
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: D */
    public final int mo20547D() {
        return R.layout.t7;
    }

    /* renamed from: G */
    public final VideoMusicTitleVM mo80701G() {
        return (VideoMusicTitleVM) this.f112714z.mo23374a(this, f112702u[0]);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: H */
    public final View mo80494H() {
        if (this.f112709G == null) {
            this.f112709G = new SparseArray();
        }
        View view = (View) this.f112709G.get(R.id.dii);
        if (view != null) {
            return view;
        }
        View t = mo20528t();
        if (t == null) {
            return null;
        }
        View findViewById = t.findViewById(R.id.dii);
        this.f112709G.put(R.id.dii, findViewById);
        return findViewById;
    }

    /* renamed from: I */
    public final VideoMusicBaseVM mo80702I() {
        return (VideoMusicBaseVM) this.f112703A.mo23374a(this, f112702u[1]);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$b */
    public static final class C48828b extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112718a;

        static {
            Covode.recordClassIndex(57614);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48828b(AbstractC12693u uVar) {
            super(0);
            this.f112718a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f112718a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$f */
    public static final class C48832f extends AbstractC89220m implements AbstractC89171a<C12874b<C48863x>> {
        public static final C48832f INSTANCE = new C48832f();

        static {
            Covode.recordClassIndex(57618);
        }

        public C48832f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48863x> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$g */
    public static final class C48833g extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112721a;

        static {
            Covode.recordClassIndex(57619);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48833g(AbstractC12693u uVar) {
            super(0);
            this.f112721a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f112721a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$l */
    public static final class C48838l extends AbstractC89220m implements AbstractC89171a<C12874b<C48781a>> {
        public static final C48838l INSTANCE = new C48838l();

        static {
            Covode.recordClassIndex(57624);
        }

        public C48838l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48781a> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$n */
    public static final class C48840n extends AbstractC89220m implements AbstractC89171a<C12874b<C48244cj>> {
        public static final C48840n INSTANCE = new C48840n();

        static {
            Covode.recordClassIndex(57626);
        }

        public C48840n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48244cj> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$o */
    public static final class C48841o extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48841o INSTANCE = new C48841o();

        static {
            Covode.recordClassIndex(57627);
        }

        public C48841o() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$q */
    public static final class C48843q extends AbstractC89220m implements AbstractC89171a<C12874b<C48200bc>> {
        public static final C48843q INSTANCE = new C48843q();

        static {
            Covode.recordClassIndex(57629);
        }

        public C48843q() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48200bc> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$r */
    public static final class C48844r extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48844r INSTANCE = new C48844r();

        static {
            Covode.recordClassIndex(57630);
        }

        public C48844r() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$c */
    public static final class C48829c extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112719a;

        static {
            Covode.recordClassIndex(57615);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48829c(AbstractC12693u uVar) {
            super(0);
            this.f112719a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f112719a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$d */
    public static final class C48830d extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112720a;

        static {
            Covode.recordClassIndex(57616);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48830d(AbstractC12693u uVar) {
            super(0);
            this.f112720a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f112720a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$h */
    public static final class C48834h extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112722a;

        static {
            Covode.recordClassIndex(57620);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48834h(AbstractC12693u uVar) {
            super(0);
            this.f112722a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f112722a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$i */
    public static final class C48835i extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112723a;

        static {
            Covode.recordClassIndex(57621);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48835i(AbstractC12693u uVar) {
            super(0);
            this.f112723a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f112723a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$a */
    public static final class C48825a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f112715a;

        static {
            Covode.recordClassIndex(57611);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48825a(AbstractC89277c cVar) {
            super(0);
            this.f112715a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f112715a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$j */
    public static final class C48836j extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f112724a;

        static {
            Covode.recordClassIndex(57622);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48836j(AbstractC89277c cVar) {
            super(0);
            this.f112724a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f112724a).getName();
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: y */
    public final void mo20533y() {
        super.mo20533y();
        AbstractC12818f.C12819a.m23063a(this, mo80701G(), C48854o.f112735a, (C12854k) null, C48847t.f112728a, 6);
        AbstractC12818f.C12819a.m23063a(this, mo80701G(), C48855p.f112736a, (C12854k) null, C48848u.f112729a, 6);
        AbstractC12818f.C12819a.m23063a(this, mo80701G(), C48856q.f112737a, (C12854k) null, C48849v.f112730a, 6);
        AbstractC12818f.C12819a.m23063a(this, mo80701G(), C48857r.f112738a, (C12854k) null, C48850w.f112731a, 6);
        AbstractC12818f.C12819a.m23063a(this, mo80701G(), C48858s.f112739a, (C12854k) null, C48845s.f112725a, 6);
    }

    public C48824n() {
        AbstractC12848i.C12851c cVar = AbstractC12848i.C12851c.f31277a;
        AbstractC89277c a = C89204ab.m154669a(VideoMusicTitleVM.class);
        this.f112714z = C14530k.m26542a(this, a, cVar == null ? AbstractC12848i.C12851c.f31277a : cVar, new C48825a(a), C48832f.INSTANCE, new C48833g(this), C48831e.INSTANCE, null, null, new C48834h(this), new C48835i(this));
        AbstractC12848i.C12851c cVar2 = AbstractC12848i.C12851c.f31277a;
        AbstractC89277c a2 = C89204ab.m154669a(VideoMusicBaseVM.class);
        this.f112703A = C14530k.m26542a(this, a2, cVar2 == null ? AbstractC12848i.C12851c.f31277a : cVar2, new C48836j(a2), C48838l.INSTANCE, new C48828b(this), C48837k.INSTANCE, null, null, new C48829c(this), new C48830d(this));
        this.f112704B = new C14524g(C89204ab.m154669a(VideoViewModel.class), this, C48840n.INSTANCE, C48841o.INSTANCE, C48839m.INSTANCE);
        this.f112705C = new C14524g(C89204ab.m154669a(VideoPlayViewModel.class), this, C48843q.INSTANCE, C48844r.INSTANCE, C48842p.INSTANCE);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
    }

    /* renamed from: a */
    public final void mo80703a(String str) {
        TextView textView = this.f112707E;
        if (textView != null) {
            textView.setText(str);
        }
        MarqueeView marqueeView = this.f112712x;
        if (marqueeView != null) {
            marqueeView.setText(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$ab */
    static final class View$OnClickListenerC48827ab implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48824n f112717a;

        static {
            Covode.recordClassIndex(57613);
        }

        View$OnClickListenerC48827ab(C48824n nVar) {
            this.f112717a = nVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            VideoMusicBaseVM I = this.f112717a.mo80702I();
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            I.mo80680a(context, view.getId());
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
        this.f112712x = (MarqueeView) mo20546C().findViewById(R.id.coj);
        this.f112707E = (TextView) mo20546C().findViewById(R.id.col);
        this.f112711w = (TextView) mo20546C().findViewById(R.id.cny);
        this.f112710v = (ImageView) mo20546C().findViewById(R.id.cnr);
        this.f112706D = (LinearLayout) mo20546C().findViewById(R.id.coh);
        this.f112708F = C16048b.m29633a().mo25421a(true, "marquee_title_opt", false);
        View$OnClickListenerC48827ab abVar = new View$OnClickListenerC48827ab(this);
        TextView textView = this.f112707E;
        if (textView != null) {
            textView.setOnClickListener(abVar);
        }
        MarqueeView marqueeView = this.f112712x;
        if (marqueeView != null) {
            marqueeView.setOnClickListener(abVar);
        }
        ImageView imageView = this.f112710v;
        if (imageView != null) {
            imageView.setOnClickListener(abVar);
        }
        if (!C49537z.m92776b()) {
            TextView textView2 = this.f112707E;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            MarqueeView marqueeView2 = this.f112712x;
            if (marqueeView2 != null) {
                marqueeView2.setVisibility(8);
            }
        }
        AbstractC12818f.C12819a.m23070b(this, (VideoViewModel) this.f112704B.getValue(), C48859t.f112740a, C12856l.m23100a(), C48851x.f112732a, 4);
        AbstractC12818f.C12819a.m23070b(this, m92085J(), C48860u.f112741a, C12856l.m23100a(), C48852y.f112733a, 4);
        AbstractC12818f.C12819a.m23070b(this, m92085J(), C48861v.f112742a, C12856l.m23100a(), C48853z.f112734a, 4);
        AbstractC12818f.C12819a.m23070b(this, m92085J(), C48862w.f112743a, C12856l.m23100a(), C48826aa.f112716a, 4);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$s */
    static final class C48845s extends AbstractC89220m implements AbstractC89183m<C48824n, Music, C89391z> {

        /* renamed from: a */
        public static final C48845s f112725a = new C48845s();

        static {
            Covode.recordClassIndex(57631);
        }

        C48845s() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48824n nVar, Music music) {
            final C48824n nVar2 = nVar;
            final Music music2 = music;
            C89219l.m154721d(nVar2, "");
            C48824n.m22850a(nVar2.mo80701G(), new AbstractC89172b<C48863x, C89391z>() {
                /* class com.p2082ss.android.ugc.aweme.feed.assem.music.C48824n.C48845s.C488461 */

                static {
                    Covode.recordClassIndex(57632);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX WARNING: Removed duplicated region for block: B:66:0x0108  */
                /* JADX WARNING: Removed duplicated region for block: B:72:0x0125  */
                /* JADX WARNING: Removed duplicated region for block: B:75:0x012d  */
                /* JADX WARNING: Removed duplicated region for block: B:78:0x013c  */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.feed.assem.music.C48863x r16) {
                    /*
                    // Method dump skipped, instructions count: 703
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.music.C48824n.C48845s.C488461.invoke(java.lang.Object):java.lang.Object");
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$t */
    static final class C48847t extends AbstractC89220m implements AbstractC89183m<C48824n, Boolean, C89391z> {

        /* renamed from: a */
        public static final C48847t f112728a = new C48847t();

        static {
            Covode.recordClassIndex(57633);
        }

        C48847t() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48824n nVar, Boolean bool) {
            MarqueeView marqueeView;
            C48824n nVar2 = nVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(nVar2, "");
            if (booleanValue && (marqueeView = nVar2.f112712x) != null) {
                marqueeView.mo85788a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$u */
    static final class C48848u extends AbstractC89220m implements AbstractC89183m<C48824n, Boolean, C89391z> {

        /* renamed from: a */
        public static final C48848u f112729a = new C48848u();

        static {
            Covode.recordClassIndex(57634);
        }

        C48848u() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48824n nVar, Boolean bool) {
            MarqueeView marqueeView;
            C48824n nVar2 = nVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(nVar2, "");
            if (booleanValue && (marqueeView = nVar2.f112712x) != null) {
                marqueeView.mo85789b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$v */
    static final class C48849v extends AbstractC89220m implements AbstractC89183m<C48824n, Boolean, C89391z> {

        /* renamed from: a */
        public static final C48849v f112730a = new C48849v();

        static {
            Covode.recordClassIndex(57635);
        }

        C48849v() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48824n nVar, Boolean bool) {
            MarqueeView marqueeView;
            C48824n nVar2 = nVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(nVar2, "");
            if (booleanValue && (marqueeView = nVar2.f112712x) != null) {
                marqueeView.mo85790c();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$x */
    static final class C48851x extends AbstractC89220m implements AbstractC89183m<C48824n, C12776a<? extends Integer>, C89391z> {

        /* renamed from: a */
        public static final C48851x f112732a = new C48851x();

        static {
            Covode.recordClassIndex(57637);
        }

        C48851x() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48824n nVar, C12776a<? extends Integer> aVar) {
            C48824n nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            nVar2.mo80702I().mo80681i();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$aa */
    static final class C48826aa extends AbstractC89220m implements AbstractC89183m<C48824n, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        public static final C48826aa f112716a = new C48826aa();

        static {
            Covode.recordClassIndex(57612);
        }

        C48826aa() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48824n nVar, C12776a<? extends Boolean> aVar) {
            long j;
            C48824n nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            C89219l.m154721d(aVar, "");
            VideoMusicTitleVM G = nVar2.mo80701G();
            if (G.f112642k && !C16048b.m29633a().mo25421a(true, "anim_opt", false)) {
                G.f112642k = false;
                Handler handler = new Handler(Looper.getMainLooper());
                VideoMusicTitleVM.RunnableC48779c cVar = new VideoMusicTitleVM.RunnableC48779c(G);
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

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$w */
    static final class C48850w extends AbstractC89220m implements AbstractC89183m<C48824n, Boolean, C89391z> {

        /* renamed from: a */
        public static final C48850w f112731a = new C48850w();

        static {
            Covode.recordClassIndex(57636);
        }

        C48850w() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48824n nVar, Boolean bool) {
            C48824n nVar2 = nVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(nVar2, "");
            if (booleanValue) {
                nVar2.mo20528t().setVisibility(8);
            } else {
                nVar2.mo20528t().setVisibility(0);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$y */
    static final class C48852y extends AbstractC89220m implements AbstractC89183m<C48824n, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        public static final C48852y f112733a = new C48852y();

        static {
            Covode.recordClassIndex(57638);
        }

        C48852y() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48824n nVar, C12776a<? extends Boolean> aVar) {
            long j;
            C48824n nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            C89219l.m154721d(aVar, "");
            VideoMusicTitleVM G = nVar2.mo80701G();
            if (!G.f112642k) {
                G.f112642k = true;
                Handler handler = new Handler(Looper.getMainLooper());
                VideoMusicTitleVM.RunnableC48777b bVar = new VideoMusicTitleVM.RunnableC48777b(G);
                if (C46965gb.f109453a) {
                    j = 300;
                } else {
                    j = 0;
                }
                handler.postDelayed(bVar, j);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.music.n$z */
    static final class C48853z extends AbstractC89220m implements AbstractC89183m<C48824n, C12776a<? extends Integer>, C89391z> {

        /* renamed from: a */
        public static final C48853z f112734a = new C48853z();

        static {
            Covode.recordClassIndex(57639);
        }

        C48853z() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48824n nVar, C12776a<? extends Integer> aVar) {
            long j;
            C48824n nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            C89219l.m154721d(aVar, "");
            VideoMusicTitleVM G = nVar2.mo80701G();
            if (G.f112642k) {
                G.f112642k = false;
                Handler handler = new Handler(Looper.getMainLooper());
                VideoMusicTitleVM.RunnableC48775a aVar2 = new VideoMusicTitleVM.RunnableC48775a(G);
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
}
