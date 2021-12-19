package com.p2082ss.android.ugc.aweme.feed.assem.photosensitivevideomask;

import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C1175ad;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
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
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48200bc;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48244cj;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49673ah;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33208e;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.C33205b;
import com.p2082ss.android.ugc.aweme.p4173ug.guide.C79639a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.a */
public final class C48868a extends AbstractC48491a<C48868a> {

    /* renamed from: u */
    static final /* synthetic */ AbstractC89286i[] f112754u = {new C89232y(C48868a.class, "maskVM", "getMaskVM()Lcom/ss/android/ugc/aweme/feed/assem/photosensitivevideomask/PhotosensitiveVideoMaskVM;", 0)};

    /* renamed from: A */
    private final AbstractC89244h f112755A = new C14524g(C89204ab.m154669a(VideoViewModel.class), this, C48879k.INSTANCE, C48880l.INSTANCE, C48878j.INSTANCE);

    /* renamed from: B */
    private final AbstractC89248d f112756B;

    /* renamed from: C */
    private SparseArray f112757C;

    /* renamed from: v */
    public TextView f112758v;

    /* renamed from: w */
    public TextView f112759w;

    /* renamed from: x */
    public TextView f112760x;

    /* renamed from: y */
    public TextView f112761y;

    /* renamed from: z */
    private final AbstractC89244h f112762z = new C14524g(C89204ab.m154669a(VideoPlayViewModel.class), this, C48876h.INSTANCE, C48877i.INSTANCE, C48875g.INSTANCE);

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.a$b */
    public static final class C48870b extends AbstractC89220m implements AbstractC89172b<C48896j, C48896j> {
        public static final C48870b INSTANCE = new C48870b();

        static {
            Covode.recordClassIndex(57657);
        }

        public C48870b() {
            super(1);
        }

        public final C48896j invoke(C48896j jVar) {
            C89219l.m154719c(jVar, "");
            return jVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.a$g */
    public static final class C48875g extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {
        public static final C48875g INSTANCE = new C48875g();

        static {
            Covode.recordClassIndex(57662);
        }

        public C48875g() {
            super(1);
        }

        public final C48200bc invoke(C48200bc bcVar) {
            C89219l.m154719c(bcVar, "");
            return bcVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.a$j */
    public static final class C48878j extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {
        public static final C48878j INSTANCE = new C48878j();

        static {
            Covode.recordClassIndex(57665);
        }

        public C48878j() {
            super(1);
        }

        public final C48244cj invoke(C48244cj cjVar) {
            C89219l.m154719c(cjVar, "");
            return cjVar;
        }
    }

    static {
        Covode.recordClassIndex(57655);
    }

    /* renamed from: I */
    private final VideoViewModel m92099I() {
        return (VideoViewModel) this.f112755A.getValue();
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: D */
    public final int mo20547D() {
        return R.layout.s8;
    }

    /* renamed from: G */
    public final PhotosensitiveVideoMaskVM mo80713G() {
        return (PhotosensitiveVideoMaskVM) this.f112756B.mo23374a(this, f112754u[0]);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: H */
    public final View mo80494H() {
        if (this.f112757C == null) {
            this.f112757C = new SparseArray();
        }
        View view = (View) this.f112757C.get(R.id.dii);
        if (view != null) {
            return view;
        }
        View t = mo20528t();
        if (t == null) {
            return null;
        }
        View findViewById = t.findViewById(R.id.dii);
        this.f112757C.put(R.id.dii, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.a$c */
    public static final class C48871c extends AbstractC89220m implements AbstractC89171a<C12874b<C48896j>> {
        public static final C48871c INSTANCE = new C48871c();

        static {
            Covode.recordClassIndex(57658);
        }

        public C48871c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48896j> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.a$d */
    public static final class C48872d extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112764a;

        static {
            Covode.recordClassIndex(57659);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48872d(AbstractC12693u uVar) {
            super(0);
            this.f112764a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f112764a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.a$h */
    public static final class C48876h extends AbstractC89220m implements AbstractC89171a<C12874b<C48200bc>> {
        public static final C48876h INSTANCE = new C48876h();

        static {
            Covode.recordClassIndex(57663);
        }

        public C48876h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48200bc> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.a$i */
    public static final class C48877i extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48877i INSTANCE = new C48877i();

        static {
            Covode.recordClassIndex(57664);
        }

        public C48877i() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.a$k */
    public static final class C48879k extends AbstractC89220m implements AbstractC89171a<C12874b<C48244cj>> {
        public static final C48879k INSTANCE = new C48879k();

        static {
            Covode.recordClassIndex(57666);
        }

        public C48879k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48244cj> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.a$l */
    public static final class C48880l extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48880l INSTANCE = new C48880l();

        static {
            Covode.recordClassIndex(57667);
        }

        public C48880l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.a$e */
    public static final class C48873e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112765a;

        static {
            Covode.recordClassIndex(57660);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48873e(AbstractC12693u uVar) {
            super(0);
            this.f112765a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f112765a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.a$f */
    public static final class C48874f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112766a;

        static {
            Covode.recordClassIndex(57661);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48874f(AbstractC12693u uVar) {
            super(0);
            this.f112766a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f112766a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.a$a */
    public static final class C48869a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f112763a;

        static {
            Covode.recordClassIndex(57656);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48869a(AbstractC89277c cVar) {
            super(0);
            this.f112763a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f112763a).getName();
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: y */
    public final void mo20533y() {
        super.mo20533y();
        AbstractC12818f.C12819a.m23063a(this, mo80713G(), C48888b.f112775a, (C12854k) null, C48881m.f112767a, 6);
        PhotosensitiveVideoMaskVM G = mo80713G();
        mo20512a(G, C48889c.f112776a, C48890d.f112777a, C48891e.f112778a, C48892f.f112779a, C12856l.m23102a(G.f31149c), null, C48882n.f112768a);
    }

    public C48868a() {
        AbstractC12848i.C12851c cVar = AbstractC12848i.C12851c.f31277a;
        AbstractC89277c a = C89204ab.m154669a(PhotosensitiveVideoMaskVM.class);
        this.f112756B = C14530k.m26542a(this, a, cVar == null ? AbstractC12848i.C12851c.f31277a : cVar, new C48869a(a), C48871c.INSTANCE, new C48872d(this), C48870b.INSTANCE, null, null, new C48873e(this), new C48874f(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.a$o */
    static final class View$OnClickListenerC48883o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TextView f112769a;

        /* renamed from: b */
        final /* synthetic */ C48868a f112770b;

        static {
            Covode.recordClassIndex(57670);
        }

        View$OnClickListenerC48883o(TextView textView, C48868a aVar) {
            this.f112769a = textView;
            this.f112770b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C33744d a = new C33744d().mo59983a("scenario", "photosensitive");
            Aweme aweme = ((VideoItemParams) C12661l.m22797a(this.f112770b)).mAweme;
            C89219l.m154716b(aweme, "");
            C39162r.m79460a("tns_mask_layer_click_skip", a.mo59983a("group_id", aweme.getAid()).f79943a);
            C39223a.m79590d().mo68615a((IComplianceBusinessService) 1, (int) ((AbstractC89171a<C89391z>) null));
            new C79459a(this.f112769a.getContext()).mo123050a(R.string.dp3).mo123053a();
            AbstractC81915c.m141874a(new C79639a());
            this.f112770b.mo80713G().mo80712i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.a$p */
    static final class View$OnClickListenerC48884p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48868a f112771a;

        static {
            Covode.recordClassIndex(57671);
        }

        View$OnClickListenerC48884p(C48868a aVar) {
            this.f112771a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C33744d a = new C33744d().mo59983a("scenario", "photosensitive");
            Aweme aweme = ((VideoItemParams) C12661l.m22797a(this.f112771a)).mAweme;
            C89219l.m154716b(aweme, "");
            C39162r.m79460a("tns_mask_layer_click_watch", a.mo59983a("group_id", aweme.getAid()).f79943a);
            C39223a.m79590d().mo68615a((IComplianceBusinessService) 2, (int) ((AbstractC89171a<C89391z>) null));
            this.f112771a.mo80713G().mo23343h();
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
        mo20546C().setVisibility(8);
        View findViewById = view.findViewById(R.id.acq);
        C89219l.m154716b(findViewById, "");
        this.f112758v = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.title);
        C89219l.m154716b(findViewById2, "");
        this.f112759w = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.button);
        C89219l.m154716b(findViewById3, "");
        this.f112760x = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.zz);
        C89219l.m154716b(findViewById4, "");
        TextView textView = (TextView) findViewById4;
        this.f112761y = textView;
        if (textView == null) {
            C89219l.m154710a("negativeBtn");
        }
        textView.setText(R.string.dow);
        textView.setOnClickListener(new View$OnClickListenerC48883o(textView, this));
        TextView textView2 = this.f112760x;
        if (textView2 == null) {
            C89219l.m154710a("positiveBtn");
        }
        textView2.setText(R.string.doy);
        textView2.setOnClickListener(new View$OnClickListenerC48884p(this));
        ((ImageView) view.findViewById(R.id.bh1)).setImageResource(2131231745);
        AbstractC12818f.C12819a.m23070b(this, (VideoPlayViewModel) this.f112762z.getValue(), C48893g.f112780a, C12856l.m23100a(), C48885q.f112772a, 4);
        AbstractC12818f.C12819a.m23070b(this, m92099I(), C48894h.f112781a, (C12854k) null, C48886r.f112773a, 6);
        AbstractC12818f.C12819a.m23070b(this, m92099I(), C48895i.f112782a, (C12854k) null, C48887s.f112774a, 6);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.a$r */
    static final class C48886r extends AbstractC89220m implements AbstractC89183m<C48868a, C12776a<? extends Integer>, C89391z> {

        /* renamed from: a */
        public static final C48886r f112773a = new C48886r();

        static {
            Covode.recordClassIndex(57673);
        }

        C48886r() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48868a aVar, C12776a<? extends Integer> aVar2) {
            C48868a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            if (aVar2 != null) {
                if (C80635y.m139814i(((VideoItemParams) C12661l.m22797a(aVar3)).mAweme)) {
                    aVar3.mo80713G().mo80712i();
                } else {
                    aVar3.mo80713G().mo23343h();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.a$m */
    static final class C48881m extends AbstractC89220m implements AbstractC89183m<C48868a, Integer, C89391z> {

        /* renamed from: a */
        public static final C48881m f112767a = new C48881m();

        static {
            Covode.recordClassIndex(57668);
        }

        C48881m() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48868a aVar, Integer num) {
            Aweme aweme;
            Aweme aweme2;
            C48868a aVar2 = aVar;
            int intValue = num.intValue();
            C89219l.m154721d(aVar2, "");
            aVar2.mo20546C().setVisibility(intValue);
            if (intValue == 0) {
                String str = null;
                if (C39223a.m79590d().mo68623h() == 1) {
                    C33744d dVar = new C33744d();
                    VideoItemParams videoItemParams = (VideoItemParams) C12661l.m22797a(aVar2);
                    if (!(videoItemParams == null || (aweme2 = videoItemParams.mAweme) == null)) {
                        str = aweme2.getAid();
                    }
                    C39162r.m79460a("tns_show_photosensitive_removed", dVar.mo59983a("group_id", str).f79943a);
                } else {
                    C33744d a = new C33744d().mo59983a("scenario", "photosensitive");
                    VideoItemParams videoItemParams2 = (VideoItemParams) C12661l.m22797a(aVar2);
                    if (!(videoItemParams2 == null || (aweme = videoItemParams2.mAweme) == null)) {
                        str = aweme.getAid();
                    }
                    C39162r.m79460a("tns_show_mask_layer", a.mo59983a("group_id", str).f79943a);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.a$q */
    static final class C48885q extends AbstractC89220m implements AbstractC89183m<C48868a, C12776a<? extends Boolean>, C89391z> {

        /* renamed from: a */
        public static final C48885q f112772a = new C48885q();

        static {
            Covode.recordClassIndex(57672);
        }

        C48885q() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48868a aVar, C12776a<? extends Boolean> aVar2) {
            C48868a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            C89219l.m154721d(aVar2, "");
            if (C80635y.m139811f(((VideoItemParams) C12661l.m22797a(aVar3)).mAweme) && aVar3.mo20546C().getVisibility() == 0) {
                aVar3.mo80713G();
                Aweme aweme = ((VideoItemParams) C12661l.m22797a(aVar3)).mAweme;
                C89219l.m154716b(aweme, "");
                C89219l.m154721d(aweme, "");
                if (C37699a.m76251aW(aweme)) {
                    AbstractC33208e a = C33205b.m68071a();
                    if (a != null) {
                        a.mo59099c();
                    }
                } else {
                    C81079v.m140776O().mo123908B();
                }
                String aid = aweme.getAid();
                C89219l.m154716b(aid, "");
                AbstractC81915c.m141874a(new C49673ah(true, aid));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.a$s */
    static final class C48887s extends AbstractC89220m implements AbstractC89183m<C48868a, C12776a<? extends String>, C89391z> {

        /* renamed from: a */
        public static final C48887s f112774a = new C48887s();

        static {
            Covode.recordClassIndex(57674);
        }

        C48887s() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48868a aVar, C12776a<? extends String> aVar2) {
            int i;
            C48868a aVar3 = aVar;
            C12776a<? extends String> aVar4 = aVar2;
            C89219l.m154721d(aVar3, "");
            if (aVar4 != null) {
                T t = aVar4.f31085a;
                Aweme aweme = ((VideoItemParams) C12661l.m22797a(aVar3)).mAweme;
                C89219l.m154716b(aweme, "");
                if (!(!C89219l.m154714a((Object) t, (Object) aweme.getAid())) && C80635y.m139814i(((VideoItemParams) C12661l.m22797a(aVar3)).mAweme) && C39223a.m79590d().mo68623h() == 0 && ((i = C39223a.m79590d().mo68624i()) == 2 || i == 1)) {
                    C39223a.m79590d().mo68615a((IComplianceBusinessService) i, (int) ((AbstractC89171a<C89391z>) null));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.a$n */
    static final class C48882n extends AbstractC89220m implements AbstractC89189s<C48868a, String, String, Integer, Integer, C89391z> {

        /* renamed from: a */
        public static final C48882n f112768a = new C48882n();

        static {
            Covode.recordClassIndex(57669);
        }

        C48882n() {
            super(5);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89189s
        public final /* synthetic */ C89391z invoke(C48868a aVar, String str, String str2, Integer num, Integer num2) {
            C48868a aVar2 = aVar;
            String str3 = str;
            String str4 = str2;
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            C89219l.m154721d(aVar2, "");
            TextView textView = aVar2.f112758v;
            if (textView == null) {
                C89219l.m154710a("contentTextView");
            }
            textView.setText(str3);
            TextView textView2 = aVar2.f112759w;
            if (textView2 == null) {
                C89219l.m154710a("titleTextView");
            }
            textView2.setText(str4);
            TextView textView3 = aVar2.f112760x;
            if (textView3 == null) {
                C89219l.m154710a("positiveBtn");
            }
            textView3.setVisibility(intValue);
            TextView textView4 = aVar2.f112761y;
            if (textView4 == null) {
                C89219l.m154710a("negativeBtn");
            }
            textView4.setVisibility(intValue2);
            return C89391z.f203057a;
        }
    }
}
