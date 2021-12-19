package com.p2082ss.android.ugc.aweme.feed.assem.videocomment;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
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
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14524g;
import com.bytedance.ext_power_list.C14530k;
import com.p2082ss.android.ugc.aweme.base.utils.View$OnTouchListenerC34732p;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36387c;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39114d;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48198ba;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48200bc;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48244cj;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a;
import com.p2082ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.p2483co.C36149c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56216k;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
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

/* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b */
public final class C49179b extends AbstractC48491a<C49179b> {

    /* renamed from: u */
    static final /* synthetic */ AbstractC89286i[] f113163u = {new C89232y(C49179b.class, "commentVM", "getCommentVM()Lcom/ss/android/ugc/aweme/feed/assem/videocomment/VideoCommentVM;", 0)};

    /* renamed from: A */
    private final AbstractC89244h f113164A;

    /* renamed from: B */
    private final AbstractC89244h f113165B;

    /* renamed from: C */
    private final AbstractC89244h f113166C;

    /* renamed from: D */
    private C36149c f113167D;

    /* renamed from: E */
    private SparseArray f113168E;

    /* renamed from: v */
    public TextView f113169v;

    /* renamed from: w */
    public View f113170w;

    /* renamed from: x */
    public ImageView f113171x;

    /* renamed from: y */
    public ImageView f113172y;

    /* renamed from: z */
    private final AbstractC89248d f113173z;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$b */
    public static final class C49181b extends AbstractC89220m implements AbstractC89172b<C49216n, C49216n> {
        public static final C49181b INSTANCE = new C49181b();

        static {
            Covode.recordClassIndex(57976);
        }

        public C49181b() {
            super(1);
        }

        public final C49216n invoke(C49216n nVar) {
            C89219l.m154719c(nVar, "");
            return nVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$g */
    public static final class C49186g extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {
        public static final C49186g INSTANCE = new C49186g();

        static {
            Covode.recordClassIndex(57981);
        }

        public C49186g() {
            super(1);
        }

        public final C48244cj invoke(C48244cj cjVar) {
            C89219l.m154719c(cjVar, "");
            return cjVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$j */
    public static final class C49189j extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {
        public static final C49189j INSTANCE = new C49189j();

        static {
            Covode.recordClassIndex(57984);
        }

        public C49189j() {
            super(1);
        }

        public final C48200bc invoke(C48200bc bcVar) {
            C89219l.m154719c(bcVar, "");
            return bcVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$m */
    public static final class C49192m extends AbstractC89220m implements AbstractC89172b<C48198ba, C48198ba> {
        public static final C49192m INSTANCE = new C49192m();

        static {
            Covode.recordClassIndex(57987);
        }

        public C49192m() {
            super(1);
        }

        public final C48198ba invoke(C48198ba baVar) {
            C89219l.m154719c(baVar, "");
            return baVar;
        }
    }

    static {
        Covode.recordClassIndex(57974);
    }

    /* renamed from: I */
    private final VideoViewModel m92270I() {
        return (VideoViewModel) this.f113164A.getValue();
    }

    /* renamed from: J */
    private final VideoEventDispatchViewModel m92271J() {
        return (VideoEventDispatchViewModel) this.f113166C.getValue();
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: D */
    public final int mo20547D() {
        return R.layout.sy;
    }

    /* renamed from: G */
    public final VideoCommentVM mo80852G() {
        return (VideoCommentVM) this.f113173z.mo23374a(this, f113163u[0]);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: H */
    public final View mo80494H() {
        if (this.f113168E == null) {
            this.f113168E = new SparseArray();
        }
        View view = (View) this.f113168E.get(R.id.dii);
        if (view != null) {
            return view;
        }
        View t = mo20528t();
        if (t == null) {
            return null;
        }
        View findViewById = t.findViewById(R.id.dii);
        this.f113168E.put(R.id.dii, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$c */
    public static final class C49182c extends AbstractC89220m implements AbstractC89171a<C12874b<C49216n>> {
        public static final C49182c INSTANCE = new C49182c();

        static {
            Covode.recordClassIndex(57977);
        }

        public C49182c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C49216n> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$d */
    public static final class C49183d extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f113175a;

        static {
            Covode.recordClassIndex(57978);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49183d(AbstractC12693u uVar) {
            super(0);
            this.f113175a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f113175a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$h */
    public static final class C49187h extends AbstractC89220m implements AbstractC89171a<C12874b<C48244cj>> {
        public static final C49187h INSTANCE = new C49187h();

        static {
            Covode.recordClassIndex(57982);
        }

        public C49187h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48244cj> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$i */
    public static final class C49188i extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C49188i INSTANCE = new C49188i();

        static {
            Covode.recordClassIndex(57983);
        }

        public C49188i() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$k */
    public static final class C49190k extends AbstractC89220m implements AbstractC89171a<C12874b<C48200bc>> {
        public static final C49190k INSTANCE = new C49190k();

        static {
            Covode.recordClassIndex(57985);
        }

        public C49190k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48200bc> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$l */
    public static final class C49191l extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C49191l INSTANCE = new C49191l();

        static {
            Covode.recordClassIndex(57986);
        }

        public C49191l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$n */
    public static final class C49193n extends AbstractC89220m implements AbstractC89171a<C12874b<C48198ba>> {
        public static final C49193n INSTANCE = new C49193n();

        static {
            Covode.recordClassIndex(57988);
        }

        public C49193n() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48198ba> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$o */
    public static final class C49194o extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C49194o INSTANCE = new C49194o();

        static {
            Covode.recordClassIndex(57989);
        }

        public C49194o() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$e */
    public static final class C49184e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f113176a;

        static {
            Covode.recordClassIndex(57979);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49184e(AbstractC12693u uVar) {
            super(0);
            this.f113176a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f113176a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$f */
    public static final class C49185f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f113177a;

        static {
            Covode.recordClassIndex(57980);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49185f(AbstractC12693u uVar) {
            super(0);
            this.f113177a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f113177a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$a */
    public static final class C49180a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f113174a;

        static {
            Covode.recordClassIndex(57975);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49180a(AbstractC89277c cVar) {
            super(0);
            this.f113174a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f113174a).getName();
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: y */
    public final void mo20533y() {
        VideoCommentVM G;
        VideoCommentVM G2;
        super.mo20533y();
        AbstractC12818f.C12819a.m23063a(this, mo80852G(), C49205c.f113188a, (C12854k) null, C49196q.f113179a, 6);
        mo20510a(G, C49206d.f113189a, C49207e.f113190a, C12856l.m23102a(mo80852G().f31149c), null, C49197r.f113180a);
        AbstractC12818f.C12819a.m23063a(this, mo80852G(), C49208f.f113191a, (C12854k) null, C49198s.f113181a, 6);
        mo20510a(G2, C49209g.f113192a, C49210h.f113193a, C12856l.m23102a(mo80852G().f31149c), null, C49195p.f113178a);
    }

    public C49179b() {
        AbstractC12848i.C12851c cVar = AbstractC12848i.C12851c.f31277a;
        AbstractC89277c a = C89204ab.m154669a(VideoCommentVM.class);
        this.f113173z = C14530k.m26542a(this, a, cVar == null ? AbstractC12848i.C12851c.f31277a : cVar, new C49180a(a), C49182c.INSTANCE, new C49183d(this), C49181b.INSTANCE, null, null, new C49184e(this), new C49185f(this));
        this.f113164A = new C14524g(C89204ab.m154669a(VideoViewModel.class), this, C49187h.INSTANCE, C49188i.INSTANCE, C49186g.INSTANCE);
        this.f113165B = new C14524g(C89204ab.m154669a(VideoPlayViewModel.class), this, C49190k.INSTANCE, C49191l.INSTANCE, C49189j.INSTANCE);
        this.f113166C = new C14524g(C89204ab.m154669a(VideoEventDispatchViewModel.class), this, C49193n.INSTANCE, C49194o.INSTANCE, C49192m.INSTANCE);
    }

    /* renamed from: a */
    public static final /* synthetic */ ImageView m92272a(C49179b bVar) {
        ImageView imageView = bVar.f113172y;
        if (imageView == null) {
            C89219l.m154710a("commentImageView");
        }
        return imageView;
    }

    /* renamed from: b */
    public static final /* synthetic */ ImageView m92273b(C49179b bVar) {
        ImageView imageView = bVar.f113171x;
        if (imageView == null) {
            C89219l.m154710a("commentGiftIconView");
        }
        return imageView;
    }

    /* renamed from: c */
    public static final /* synthetic */ TextView m92274c(C49179b bVar) {
        TextView textView = bVar.f113169v;
        if (textView == null) {
            C89219l.m154710a("commentCountView");
        }
        return textView;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
        mo20546C().setVisibility(0);
        C36149c cVar = this.f113167D;
        if (cVar != null) {
            cVar.mo63274b();
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
        mo20546C().setVisibility(8);
        View findViewById = view.findViewById(R.id.a9a);
        C89219l.m154716b(findViewById, "");
        this.f113169v = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.a99);
        C89219l.m154716b(findViewById2, "");
        this.f113170w = findViewById2;
        View findViewById3 = view.findViewById(R.id.a9q);
        C89219l.m154716b(findViewById3, "");
        this.f113172y = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.a9o);
        C89219l.m154716b(findViewById4, "");
        this.f113171x = (ImageView) findViewById4;
        if (C56216k.m102131a()) {
            TextView textView = this.f113169v;
            if (textView == null) {
                C89219l.m154710a("commentCountView");
            }
            C39114d.m79408a(textView, 14);
        }
        C36149c cVar = new C36149c();
        cVar.f85394a = mo20528t();
        View view2 = this.f113170w;
        if (view2 == null) {
            C89219l.m154710a("commentLayout");
        }
        cVar.f85395b = view2;
        cVar.f85397d = cVar.f85397d;
        cVar.f85396c = cVar.f85396c;
        this.f113167D = cVar;
        View view3 = this.f113170w;
        if (view3 == null) {
            C89219l.m154710a("commentLayout");
        }
        view3.setOnTouchListener(View$OnTouchListenerC34732p.f82022a);
        View view4 = this.f113170w;
        if (view4 == null) {
            C89219l.m154710a("commentLayout");
        }
        view4.setOnClickListener(new View$OnClickListenerC49201v(this));
        AbstractC12818f.C12819a.m23070b(this, m92270I(), C49212j.f113195a, C12856l.m23100a(), C49202w.f113185a, 4);
        AbstractC12818f.C12819a.m23070b(this, m92270I(), C49213k.f113196a, C12856l.m23100a(), C49203x.f113186a, 4);
        AbstractC12818f.C12819a.m23070b(this, (VideoPlayViewModel) this.f113165B.getValue(), C49214l.f113197a, C12856l.m23100a(), C49204y.f113187a, 4);
        AbstractC12818f.C12819a.m23070b(this, m92271J(), C49215m.f113198a, C12856l.m23100a(), C49199t.f113182a, 4);
        AbstractC12818f.C12819a.m23070b(this, m92271J(), C49211i.f113194a, C12856l.m23100a(), C49200u.f113183a, 4);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$v */
    static final class View$OnClickListenerC49201v implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49179b f113184a;

        static {
            Covode.recordClassIndex(57996);
        }

        View$OnClickListenerC49201v(C49179b bVar) {
            this.f113184a = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0156, code lost:
            if (r0.isAllowComment() == true) goto L_0x015e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r8) {
            /*
            // Method dump skipped, instructions count: 429
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.assem.videocomment.C49179b.View$OnClickListenerC49201v.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$q */
    static final class C49196q extends AbstractC89220m implements AbstractC89183m<C49179b, Integer, C89391z> {

        /* renamed from: a */
        public static final C49196q f113179a = new C49196q();

        static {
            Covode.recordClassIndex(57991);
        }

        C49196q() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49179b bVar, Integer num) {
            C49179b bVar2 = bVar;
            int intValue = num.intValue();
            C89219l.m154721d(bVar2, "");
            View view = bVar2.f113170w;
            if (view == null) {
                C89219l.m154710a("commentLayout");
            }
            view.setVisibility(intValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$s */
    static final class C49198s extends AbstractC89220m implements AbstractC89183m<C49179b, Drawable, C89391z> {

        /* renamed from: a */
        public static final C49198s f113181a = new C49198s();

        static {
            Covode.recordClassIndex(57993);
        }

        C49198s() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49179b bVar, Drawable drawable) {
            C49179b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            C49179b.m92272a(bVar2).setImageDrawable(drawable);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$w */
    static final class C49202w extends AbstractC89220m implements AbstractC89183m<C49179b, C12776a<? extends Integer>, C89391z> {

        /* renamed from: a */
        public static final C49202w f113185a = new C49202w();

        static {
            Covode.recordClassIndex(57997);
        }

        C49202w() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49179b bVar, C12776a<? extends Integer> aVar) {
            C49179b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            VideoCommentVM G = bVar2.mo80852G();
            G.mo20662a(new VideoCommentVM.C49176c(G));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$x */
    static final class C49203x extends AbstractC89220m implements AbstractC89183m<C49179b, C12776a<? extends Integer>, C89391z> {

        /* renamed from: a */
        public static final C49203x f113186a = new C49203x();

        static {
            Covode.recordClassIndex(57998);
        }

        C49203x() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49179b bVar, C12776a<? extends Integer> aVar) {
            C49179b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            VideoCommentVM G = bVar2.mo80852G();
            G.mo20667b(new VideoCommentVM.C49172a(G));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$t */
    static final class C49199t extends AbstractC89220m implements AbstractC89183m<C49179b, C49672ag, C89391z> {

        /* renamed from: a */
        public static final C49199t f113182a = new C49199t();

        static {
            Covode.recordClassIndex(57994);
        }

        C49199t() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49179b bVar, C49672ag agVar) {
            String str;
            C49179b bVar2 = bVar;
            C49672ag agVar2 = agVar;
            C89219l.m154721d(bVar2, "");
            if (agVar2 != null && agVar2.f114315a == 14) {
                Object obj = agVar2.f114316b;
                Aweme aweme = ((VideoItemParams) C12661l.m22797a(bVar2)).mAweme;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (C89219l.m154714a(obj, (Object) str)) {
                    bVar2.mo80852G().mo80851c(((VideoItemParams) C12661l.m22797a(bVar2)).mAweme);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$y */
    static final class C49204y extends AbstractC89220m implements AbstractC89183m<C49179b, C12776a<? extends Float>, C89391z> {

        /* renamed from: a */
        public static final C49204y f113187a = new C49204y();

        static {
            Covode.recordClassIndex(57999);
        }

        C49204y() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49179b bVar, C12776a<? extends Float> aVar) {
            T t;
            C49179b bVar2 = bVar;
            C12776a<? extends Float> aVar2 = aVar;
            C89219l.m154721d(bVar2, "");
            if (!(aVar2 == null || (t = aVar2.f31085a) == null || t.floatValue() <= 80.0f)) {
                VideoCommentVM G = bVar2.mo80852G();
                G.mo20667b(new VideoCommentVM.C49174b(G));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$u */
    static final class C49200u extends AbstractC89220m implements AbstractC89183m<C49179b, C36387c, C89391z> {

        /* renamed from: a */
        public static final C49200u f113183a = new C49200u();

        static {
            Covode.recordClassIndex(57995);
        }

        C49200u() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C49179b bVar, C36387c cVar) {
            Integer num;
            Object obj;
            C49179b bVar2 = bVar;
            C36387c cVar2 = cVar;
            C89219l.m154721d(bVar2, "");
            Integer[] numArr = {3, 4, 8};
            Object[] objArr = null;
            if (cVar2 != null) {
                num = Integer.valueOf(cVar2.f86061a);
            } else {
                num = null;
            }
            if (C89064i.m154489a(numArr, num)) {
                if (cVar2 != null) {
                    obj = cVar2.f86062b;
                } else {
                    obj = null;
                }
                if (obj instanceof Object[]) {
                    objArr = obj;
                }
                Object[] objArr2 = objArr;
                if (objArr2 != null && objArr2.length == 2) {
                    bVar2.mo80852G().mo80851c(((VideoItemParams) C12661l.m22797a(bVar2)).mAweme);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$p */
    static final class C49195p extends AbstractC89220m implements AbstractC89187q<C49179b, String, Integer, C89391z> {

        /* renamed from: a */
        public static final C49195p f113178a = new C49195p();

        static {
            Covode.recordClassIndex(57990);
        }

        C49195p() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(C49179b bVar, String str, Integer num) {
            C49179b bVar2 = bVar;
            String str2 = str;
            int intValue = num.intValue();
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(str2, "");
            C49179b.m92274c(bVar2).setVisibility(intValue);
            C49179b.m92274c(bVar2).setText(str2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$r */
    static final class C49197r extends AbstractC89220m implements AbstractC89187q<C49179b, Integer, Boolean, C89391z> {

        /* renamed from: a */
        public static final C49197r f113180a = new C49197r();

        static {
            Covode.recordClassIndex(57992);
        }

        C49197r() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(C49179b bVar, Integer num, Boolean bool) {
            C49179b bVar2 = bVar;
            int intValue = num.intValue();
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar2, "");
            C49179b.m92273b(bVar2).setVisibility(intValue);
            if (booleanValue && intValue == 0) {
                C49179b.m92273b(bVar2).setAlpha(0.0f);
                C49179b.m92273b(bVar2).animate().alpha(1.0f).setDuration(600).start();
            }
            return C89391z.f203057a;
        }
    }
}
