package com.p2082ss.android.ugc.aweme.feed.assem.corss.language;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12784g;
import com.bytedance.assem.arch.p795b.AbstractC12693u;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.C14524g;
import com.bytedance.ext_power_list.C14530k;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.AbstractC23332b;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23319b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48200bc;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48244cj;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a;
import com.p2082ss.android.ugc.aweme.feed.assem.corss.language.VideoCLACaptionViewModel;
import com.p2082ss.android.ugc.aweme.feed.caption.C49334a;
import com.p2082ss.android.ugc.aweme.feed.caption.C49337c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionModel;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoCaptionUpdateParams;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50532ah;
import com.p2082ss.android.ugc.aweme.main.p3433f.C59089a;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.setting.TranslatedCaptionCacheServiceImpl;
import java.util.List;
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
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a */
public final class C48541a extends AbstractC48491a<C48541a> {

    /* renamed from: D */
    public static final int f112302D = (((int) C84912r.m145930a(C17867d.m33078a(), 58.0f)) + C34723i.m70927b());

    /* renamed from: E */
    public static final int f112303E;

    /* renamed from: F */
    public static final int f112304F = ((int) C84912r.m145930a(C17867d.m33078a(), 32.0f));

    /* renamed from: G */
    public static final C48559m f112305G = new C48559m((byte) 0);

    /* renamed from: K */
    private static final int f112306K;

    /* renamed from: L */
    private static final int f112307L;

    /* renamed from: u */
    static final /* synthetic */ AbstractC89286i[] f112308u = {new C89232y(C48541a.class, "claCaptionVM", "getClaCaptionVM()Lcom/ss/android/ugc/aweme/feed/assem/corss/language/VideoCLACaptionViewModel;", 0)};

    /* renamed from: A */
    public ImageView f112309A;

    /* renamed from: B */
    public ImageView f112310B;

    /* renamed from: C */
    public ValueAnimator f112311C;

    /* renamed from: H */
    private final AbstractC89248d f112312H;

    /* renamed from: I */
    private final AbstractC89244h f112313I = new C14524g(C89204ab.m154669a(VideoViewModel.class), this, C48554h.INSTANCE, C48555i.INSTANCE, C48553g.INSTANCE);

    /* renamed from: J */
    private final AbstractC89244h f112314J = new C14524g(C89204ab.m154669a(VideoPlayViewModel.class), this, C48557k.INSTANCE, C48558l.INSTANCE, C48556j.INSTANCE);

    /* renamed from: M */
    private SparseArray f112315M;

    /* renamed from: v */
    public AbstractC23317a f112316v;

    /* renamed from: w */
    public FrameLayout f112317w;

    /* renamed from: x */
    public LinearLayout f112318x;

    /* renamed from: y */
    public LinearLayout f112319y;

    /* renamed from: z */
    public TuxTextView f112320z;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$b */
    public static final class C48548b extends AbstractC89220m implements AbstractC89172b<C48583l, C48583l> {
        public static final C48548b INSTANCE = new C48548b();

        static {
            Covode.recordClassIndex(57325);
        }

        public C48548b() {
            super(1);
        }

        public final C48583l invoke(C48583l lVar) {
            C89219l.m154719c(lVar, "");
            return lVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$g */
    public static final class C48553g extends AbstractC89220m implements AbstractC89172b<C48244cj, C48244cj> {
        public static final C48553g INSTANCE = new C48553g();

        static {
            Covode.recordClassIndex(57330);
        }

        public C48553g() {
            super(1);
        }

        public final C48244cj invoke(C48244cj cjVar) {
            C89219l.m154719c(cjVar, "");
            return cjVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$j */
    public static final class C48556j extends AbstractC89220m implements AbstractC89172b<C48200bc, C48200bc> {
        public static final C48556j INSTANCE = new C48556j();

        static {
            Covode.recordClassIndex(57333);
        }

        public C48556j() {
            super(1);
        }

        public final C48200bc invoke(C48200bc bcVar) {
            C89219l.m154719c(bcVar, "");
            return bcVar;
        }
    }

    /* renamed from: J */
    private final VideoViewModel m91932J() {
        return (VideoViewModel) this.f112313I.getValue();
    }

    /* renamed from: K */
    private final VideoPlayViewModel m91933K() {
        return (VideoPlayViewModel) this.f112314J.getValue();
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: D */
    public final int mo20547D() {
        return R.layout.tj;
    }

    /* renamed from: G */
    public final VideoCLACaptionViewModel mo80571G() {
        return (VideoCLACaptionViewModel) this.f112312H.mo23374a(this, f112308u[0]);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: H */
    public final View mo80494H() {
        if (this.f112315M == null) {
            this.f112315M = new SparseArray();
        }
        View view = (View) this.f112315M.get(R.id.dii);
        if (view != null) {
            return view;
        }
        View t = mo20528t();
        if (t == null) {
            return null;
        }
        View findViewById = t.findViewById(R.id.dii);
        this.f112315M.put(R.id.dii, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$m */
    public static final class C48559m {
        static {
            Covode.recordClassIndex(57336);
        }

        private C48559m() {
        }

        public /* synthetic */ C48559m(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$c */
    public static final class C48549c extends AbstractC89220m implements AbstractC89171a<C12874b<C48583l>> {
        public static final C48549c INSTANCE = new C48549c();

        static {
            Covode.recordClassIndex(57326);
        }

        public C48549c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48583l> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$d */
    public static final class C48550d extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112327a;

        static {
            Covode.recordClassIndex(57327);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48550d(AbstractC12693u uVar) {
            super(0);
            this.f112327a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f112327a.mo20598q();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$h */
    public static final class C48554h extends AbstractC89220m implements AbstractC89171a<C12874b<C48244cj>> {
        public static final C48554h INSTANCE = new C48554h();

        static {
            Covode.recordClassIndex(57331);
        }

        public C48554h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48244cj> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$i */
    public static final class C48555i extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48555i INSTANCE = new C48555i();

        static {
            Covode.recordClassIndex(57332);
        }

        public C48555i() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$k */
    public static final class C48557k extends AbstractC89220m implements AbstractC89171a<C12874b<C48200bc>> {
        public static final C48557k INSTANCE = new C48557k();

        static {
            Covode.recordClassIndex(57334);
        }

        public C48557k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C48200bc> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$l */
    public static final class C48558l extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C48558l INSTANCE = new C48558l();

        static {
            Covode.recordClassIndex(57335);
        }

        public C48558l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$e */
    public static final class C48551e extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112328a;

        static {
            Covode.recordClassIndex(57328);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48551e(AbstractC12693u uVar) {
            super(0);
            this.f112328a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f112328a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$f */
    public static final class C48552f extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12693u f112329a;

        static {
            Covode.recordClassIndex(57329);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48552f(AbstractC12693u uVar) {
            super(0);
            this.f112329a = uVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f112329a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$a */
    public static final class C48542a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f112321a;

        static {
            Covode.recordClassIndex(57319);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C48542a(AbstractC89277c cVar) {
            super(0);
            this.f112321a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f112321a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$ae */
    static final class C48547ae extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48541a f112326a;

        static {
            Covode.recordClassIndex(57324);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48547ae(C48541a aVar) {
            super(0);
            this.f112326a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f112326a.mo80573a(true);
            AbstractC23317a aVar = this.f112326a.f112316v;
            if (aVar != null) {
                aVar.dismiss();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: y */
    public final void mo20533y() {
        super.mo20533y();
        AbstractC12818f.C12819a.m23063a(this, mo80571G(), C48573b.f112348a, (C12854k) null, C48564r.f112339a, 6);
        AbstractC12818f.C12819a.m23063a(this, mo80571G(), C48574c.f112349a, (C12854k) null, C48565s.f112340a, 6);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$ad */
    static final class C48546ad extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C48541a f112325a;

        static {
            Covode.recordClassIndex(57323);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48546ad(C48541a aVar) {
            super(0);
            this.f112325a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            LinearLayout linearLayout;
            TuxTextView tuxTextView = this.f112325a.f112320z;
            if (tuxTextView != null) {
                tuxTextView.setText("");
            }
            TuxTextView tuxTextView2 = this.f112325a.f112320z;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(8);
            }
            ImageView imageView = this.f112325a.f112309A;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (!this.f112325a.mo80571G().f112270D && (linearLayout = this.f112325a.f112319y) != null) {
                linearLayout.setVisibility(0);
            }
            AbstractC23317a aVar = this.f112325a.f112316v;
            if (aVar != null) {
                aVar.dismiss();
            }
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(57318);
        int a = (int) C84912r.m145930a(C17867d.m33078a(), 16.0f);
        f112306K = a;
        int a2 = (int) C84912r.m145930a(C17867d.m33078a(), 56.0f);
        f112307L = a2;
        f112303E = Math.min((int) C84912r.m145930a(C17867d.m33078a(), 320.0f), (C34723i.m70928b(C17867d.m33078a()) - a) - a2);
    }

    public C48541a() {
        AbstractC89277c a = C89204ab.m154669a(VideoCLACaptionViewModel.class);
        this.f112312H = C14530k.m26542a(this, a, AbstractC12848i.C12851c.f31277a, new C48542a(a), C48549c.INSTANCE, new C48550d(this), C48548b.INSTANCE, null, null, new C48551e(this), new C48552f(this));
    }

    /* renamed from: I */
    public final void mo80572I() {
        boolean z;
        CharSequence text;
        String str;
        Aweme aweme;
        TuxTextView tuxTextView = this.f112320z;
        if (tuxTextView != null) {
            tuxTextView.setText(mo80571G().f112278y);
        }
        VideoCLACaptionViewModel G = mo80571G();
        LinearLayout linearLayout = this.f112319y;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            z = false;
        } else {
            z = true;
        }
        Aweme aweme2 = null;
        if (G.f112267A != -1 && z) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - G.f112267A;
            C33744d dVar = new C33744d();
            VideoItemParams videoItemParams = (VideoItemParams) G.mo23342g();
            if (videoItemParams != null) {
                str = videoItemParams.mEventType;
            } else {
                str = null;
            }
            C33744d a = dVar.mo59983a("enter_from", str);
            VideoItemParams videoItemParams2 = (VideoItemParams) G.mo23342g();
            if (videoItemParams2 != null) {
                aweme = videoItemParams2.mAweme;
            } else {
                aweme = null;
            }
            C33744d a2 = a.mo59983a("group_id", C59208ac.m108771e(aweme));
            VideoItemParams videoItemParams3 = (VideoItemParams) G.mo23342g();
            if (videoItemParams3 != null) {
                aweme2 = videoItemParams3.mAweme;
            }
            C39162r.m79460a("cla_caption_switch_language_time", a2.mo59983a("author_id", C59208ac.m108758a(aweme2)).mo59981a("duration", elapsedRealtime).mo59980a("enable_experiment", C16048b.m29633a().mo25412a(true, "player_enable_opt_subload_time", 1)).f79943a);
        }
        if (mo80571G().f112273m) {
            ImageView imageView = this.f112310B;
            if (imageView != null) {
                imageView.setAlpha(1.0f);
            }
            TuxTextView tuxTextView2 = this.f112320z;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(8);
            }
            ImageView imageView2 = this.f112309A;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            ImageView imageView3 = this.f112310B;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.f112319y;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout3 = this.f112318x;
        if (linearLayout3 != null) {
            linearLayout3.setAlpha(1.0f);
        }
        LinearLayout linearLayout4 = this.f112318x;
        if (linearLayout4 != null) {
            linearLayout4.setScaleX(1.0f);
        }
        LinearLayout linearLayout5 = this.f112318x;
        if (linearLayout5 != null) {
            linearLayout5.setScaleY(1.0f);
        }
        ImageView imageView4 = this.f112310B;
        if (imageView4 != null) {
            imageView4.setVisibility(8);
        }
        LinearLayout linearLayout6 = this.f112319y;
        if (linearLayout6 != null) {
            linearLayout6.setVisibility(8);
        }
        TuxTextView tuxTextView3 = this.f112320z;
        if (tuxTextView3 == null || (text = tuxTextView3.getText()) == null || text.length() == 0) {
            TuxTextView tuxTextView4 = this.f112320z;
            if (tuxTextView4 != null) {
                tuxTextView4.setVisibility(8);
            }
            ImageView imageView5 = this.f112309A;
            if (imageView5 != null) {
                imageView5.setVisibility(8);
                return;
            }
            return;
        }
        TuxTextView tuxTextView5 = this.f112320z;
        if (tuxTextView5 != null) {
            tuxTextView5.setVisibility(0);
        }
        ImageView imageView6 = this.f112309A;
        if (imageView6 != null) {
            imageView6.setVisibility(mo80571G().mo80565k());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$o */
    public static final class C48561o extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C48541a f112334a;

        static {
            Covode.recordClassIndex(57338);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C48561o(C48541a aVar) {
            this.f112334a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f112334a.mo80572I();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$q */
    public static final class C48563q extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C48541a f112338a;

        static {
            Covode.recordClassIndex(57340);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C48563q(C48541a aVar) {
            this.f112338a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f112338a.mo80572I();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(VideoItemParams videoItemParams) {
        C89219l.m154721d(videoItemParams, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$z */
    static final class View$OnClickListenerC48572z implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48541a f112347a;

        static {
            Covode.recordClassIndex(57349);
        }

        View$OnClickListenerC48572z(C48541a aVar) {
            this.f112347a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f112347a.mo80573a(false);
            VideoCLACaptionViewModel G = this.f112347a.mo80571G();
            G.mo20667b(new VideoCLACaptionViewModel.C48532g(G));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$n */
    public static final class C48560n implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C48541a f112330a;

        /* renamed from: b */
        final /* synthetic */ boolean f112331b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89236c f112332c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89236c f112333d;

        static {
            Covode.recordClassIndex(57337);
        }

        C48560n(C48541a aVar, boolean z, C89233z.C89236c cVar, C89233z.C89236c cVar2) {
            this.f112330a = aVar;
            this.f112331b = z;
            this.f112332c = cVar;
            this.f112333d = cVar2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ImageView imageView = this.f112330a.f112310B;
            if (imageView != null) {
                C89219l.m154716b(valueAnimator, "");
                imageView.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
            }
            if (!this.f112331b) {
                LinearLayout linearLayout = this.f112330a.f112318x;
                if (linearLayout != null) {
                    C89219l.m154716b(valueAnimator, "");
                    linearLayout.setAlpha(valueAnimator.getAnimatedFraction());
                }
                LinearLayout linearLayout2 = this.f112330a.f112318x;
                if (linearLayout2 != null) {
                    C89219l.m154716b(valueAnimator, "");
                    linearLayout2.setScaleX(((((float) C48541a.f112304F) * 1.0f) / ((float) this.f112332c.element)) + ((((float) (this.f112332c.element - C48541a.f112304F)) * valueAnimator.getAnimatedFraction()) / ((float) this.f112332c.element)));
                }
                LinearLayout linearLayout3 = this.f112330a.f112318x;
                if (linearLayout3 != null) {
                    C89219l.m154716b(valueAnimator, "");
                    linearLayout3.setScaleY(((((float) C48541a.f112304F) * 1.0f) / ((float) this.f112333d.element)) + ((((float) (this.f112333d.element - C48541a.f112304F)) * valueAnimator.getAnimatedFraction()) / ((float) this.f112333d.element)));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$p */
    public static final class C48562p implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C48541a f112335a;

        /* renamed from: b */
        final /* synthetic */ int f112336b;

        /* renamed from: c */
        final /* synthetic */ int f112337c;

        static {
            Covode.recordClassIndex(57339);
        }

        C48562p(C48541a aVar, int i, int i2) {
            this.f112335a = aVar;
            this.f112336b = i;
            this.f112337c = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ImageView imageView = this.f112335a.f112310B;
            if (imageView != null) {
                C89219l.m154716b(valueAnimator, "");
                imageView.setAlpha(valueAnimator.getAnimatedFraction());
            }
            LinearLayout linearLayout = this.f112335a.f112318x;
            if (linearLayout != null) {
                C89219l.m154716b(valueAnimator, "");
                linearLayout.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
            }
            LinearLayout linearLayout2 = this.f112335a.f112318x;
            if (linearLayout2 != null) {
                int i = this.f112336b;
                C89219l.m154716b(valueAnimator, "");
                linearLayout2.setScaleX(((((float) i) - (((float) (i - C48541a.f112304F)) * valueAnimator.getAnimatedFraction())) * 1.0f) / ((float) this.f112336b));
            }
            LinearLayout linearLayout3 = this.f112335a.f112318x;
            if (linearLayout3 != null) {
                int i2 = this.f112337c;
                C89219l.m154716b(valueAnimator, "");
                linearLayout3.setScaleY(((((float) i2) - (((float) (i2 - C48541a.f112304F)) * valueAnimator.getAnimatedFraction())) * 1.0f) / ((float) this.f112337c));
            }
        }
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
        this.f112317w = (FrameLayout) mo20546C().findViewById(R.id.a1n);
        this.f112318x = (LinearLayout) mo20546C().findViewById(R.id.a1r);
        this.f112319y = (LinearLayout) mo20546C().findViewById(R.id.a1p);
        this.f112320z = (TuxTextView) mo20546C().findViewById(R.id.a1q);
        this.f112309A = (ImageView) mo20546C().findViewById(R.id.enf);
        this.f112310B = (ImageView) mo20546C().findViewById(R.id.bex);
        LinearLayout linearLayout = this.f112318x;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new View$OnClickListenerC48566t(this));
        }
        ImageView imageView = this.f112310B;
        if (imageView != null) {
            imageView.setOnClickListener(new View$OnClickListenerC48572z(this));
        }
        AbstractC12818f.C12819a.m23063a(this, m91932J(), C48579h.f112354a, (C12854k) null, C48543aa.f112322a, 6);
        AbstractC12818f.C12819a.m23063a(this, m91932J(), C48580i.f112355a, (C12854k) null, C48544ab.f112323a, 6);
        AbstractC12818f.C12819a.m23063a(this, m91932J(), C48581j.f112356a, (C12854k) null, C48545ac.f112324a, 6);
        AbstractC12818f.C12819a.m23063a(this, m91932J(), C48582k.f112357a, (C12854k) null, C48567u.f112342a, 6);
        AbstractC12818f.C12819a.m23063a(this, m91933K(), C48575d.f112350a, (C12854k) null, C48568v.f112343a, 6);
        AbstractC12818f.C12819a.m23063a(this, m91933K(), C48576e.f112351a, (C12854k) null, C48569w.f112344a, 6);
        AbstractC12818f.C12819a.m23063a(this, m91933K(), C48577f.f112352a, (C12854k) null, C48570x.f112345a, 6);
        AbstractC12818f.C12819a.m23063a(this, m91933K(), C48578g.f112353a, (C12854k) null, C48571y.f112346a, 6);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$t */
    static final class View$OnClickListenerC48566t implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48541a f112341a;

        static {
            Covode.recordClassIndex(57343);
        }

        View$OnClickListenerC48566t(C48541a aVar) {
            this.f112341a = aVar;
        }

        public final void onClick(View view) {
            Aweme aweme;
            Aweme aweme2;
            Aweme aweme3;
            Aweme aweme4;
            String str;
            String str2;
            String str3;
            LinearLayout linearLayout;
            EnumC23352h hVar;
            VideoItemParams videoItemParams;
            Aweme aweme5;
            String str4;
            Aweme aweme6;
            Aweme aweme7;
            Aweme aweme8;
            ClickAgent.onClick(view);
            VideoCLACaptionViewModel G = this.f112341a.mo80571G();
            C33744d dVar = new C33744d();
            VideoItemParams videoItemParams2 = (VideoItemParams) G.mo23342g();
            Context context = null;
            if (videoItemParams2 != null) {
                aweme = videoItemParams2.mAweme;
            } else {
                aweme = null;
            }
            C33744d a = dVar.mo59980a("have_transl", C50532ah.m94726b(aweme) ? 1 : 0).mo59980a("use_transl", !G.f112272l ? 1 : 0);
            VideoItemParams videoItemParams3 = (VideoItemParams) G.mo23342g();
            if (videoItemParams3 != null) {
                aweme2 = videoItemParams3.mAweme;
            } else {
                aweme2 = null;
            }
            C33744d a2 = a.mo59983a("subtitle_type", C50532ah.m94727c(aweme2));
            VideoItemParams videoItemParams4 = (VideoItemParams) G.mo23342g();
            if (videoItemParams4 != null) {
                aweme3 = videoItemParams4.mAweme;
            } else {
                aweme3 = null;
            }
            C33744d a3 = a2.mo59983a("subtitle_lang", C50532ah.m94729e(aweme3)).mo59980a("have_tts", G.f112269C ? 1 : 0).mo59980a("use_tts", G.mo80564j() ? 1 : 0);
            boolean z = G.f112272l;
            VideoItemParams videoItemParams5 = (VideoItemParams) G.mo23342g();
            if (videoItemParams5 != null) {
                aweme4 = videoItemParams5.mAweme;
            } else {
                aweme4 = null;
            }
            C33744d a4 = a3.mo59980a("cla_subtitle_type", C50532ah.m94724a(z, aweme4));
            VideoItemParams videoItemParams6 = (VideoItemParams) G.mo23342g();
            if (videoItemParams6 == null || (aweme8 = videoItemParams6.mAweme) == null) {
                str = null;
            } else {
                str = aweme8.getAid();
            }
            C33744d a5 = a4.mo59983a("group_id", str);
            VideoItemParams videoItemParams7 = (VideoItemParams) G.mo23342g();
            if (videoItemParams7 == null || (aweme7 = videoItemParams7.mAweme) == null) {
                str2 = null;
            } else {
                str2 = aweme7.getAuthorUid();
            }
            C33744d a6 = a5.mo59983a("author_id", str2);
            VideoItemParams videoItemParams8 = (VideoItemParams) G.mo23342g();
            if (videoItemParams8 != null) {
                str3 = videoItemParams8.mEventType;
            } else {
                str3 = null;
            }
            C39162r.m79460a("click_subtitle", a6.mo59983a("enter_from", str3).f79943a);
            if (!(C49334a.m92423a() || (videoItemParams = (VideoItemParams) G.mo23342g()) == null || (aweme5 = videoItemParams.mAweme) == null || aweme5.getAuthorUid() == null)) {
                VideoItemParams videoItemParams9 = (VideoItemParams) G.mo23342g();
                if (videoItemParams9 == null || (aweme6 = videoItemParams9.mAweme) == null) {
                    str4 = null;
                } else {
                    str4 = aweme6.getAuthorUid();
                }
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (!C89219l.m154714a((Object) str4, (Object) g.getCurUserId())) {
                    Activity j = C17873f.m33102j();
                    if (j instanceof ActivityC0945e) {
                        context = j;
                    }
                    ActivityC0945e eVar = (ActivityC0945e) context;
                    if (eVar != null) {
                        G.mo80562a(eVar);
                        return;
                    }
                }
            }
            C48541a aVar = this.f112341a;
            if (aVar.az_() != null && aVar.f112318x != null && (linearLayout = aVar.f112318x) != null && linearLayout.getVisibility() == 0) {
                Context az_ = aVar.az_();
                if (az_ == null) {
                    C89219l.m154715b();
                }
                int i = -((int) C84912r.m145930a(az_, 8.0f));
                VideoCLACaptionViewModel G2 = aVar.mo80571G();
                LinearLayout linearLayout2 = aVar.f112318x;
                if (linearLayout2 == null) {
                    C89219l.m154715b();
                }
                C48546ad adVar = new C48546ad(aVar);
                C48547ae aeVar = new C48547ae(aVar);
                C89219l.m154721d(linearLayout2, "");
                C89219l.m154721d(adVar, "");
                C89219l.m154721d(aeVar, "");
                Context context2 = linearLayout2.getContext();
                C89219l.m154716b(context2, "");
                AbstractC23332b b = new C23319b(context2).mo38041b(linearLayout2);
                Context context3 = linearLayout2.getContext();
                C89219l.m154716b(context3, "");
                AbstractC23332b d = ((C23319b) b.mo38028a(context3.getResources().getColor(R.color.c7)).mo38030a(-1001L)).mo38011a(new VideoCLACaptionViewModel.C48523a(G2, adVar, aeVar)).mo38042b(new VideoCLACaptionViewModel.C48526b(G2)).mo38035a(new VideoCLACaptionViewModel.C48527c(G2)).mo38039b(i).mo38044c().mo38043b(true).mo38046d(C49337c.f113384C);
                if (G2.f112275v) {
                    hVar = EnumC23352h.BOTTOM;
                } else {
                    hVar = EnumC23352h.TOP;
                }
                d.mo38034a(hVar);
                aVar.f112316v = d.mo38012d();
                AbstractC23317a aVar2 = aVar.f112316v;
                if (aVar2 != null) {
                    aVar2.mo38001a();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo80573a(boolean z) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        VideoCLACaptionViewModel G = mo80571G();
        G.f112273m = z;
        TranslatedCaptionCacheServiceImpl.m146355j().mo108887a(G.f112273m);
        AbstractC81915c.m141874a(new C59089a(!G.f112273m));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 200);
        C89219l.m154716b(ofInt, "");
        ofInt.setDuration(200L);
        this.f112311C = ofInt;
        if (!C80471gb.m139482a() && (linearLayout4 = this.f112318x) != null) {
            linearLayout4.setPivotX(0.0f);
        }
        if (mo80571G().f112275v) {
            LinearLayout linearLayout5 = this.f112318x;
            if (linearLayout5 != null) {
                linearLayout5.setPivotY(0.0f);
            }
        } else {
            LinearLayout linearLayout6 = this.f112318x;
            if (linearLayout6 != null) {
                linearLayout6.setPivotY((float) linearLayout6.getHeight());
            }
        }
        if (!z) {
            LinearLayout linearLayout7 = this.f112318x;
            if (linearLayout7 != null) {
                linearLayout7.setAlpha(1.0f);
            }
            LinearLayout linearLayout8 = this.f112318x;
            if (linearLayout8 != null) {
                linearLayout8.setScaleX(1.0f);
            }
            LinearLayout linearLayout9 = this.f112318x;
            if (linearLayout9 != null) {
                linearLayout9.setScaleY(1.0f);
            }
            String str = mo80571G().f112278y;
            boolean isEmpty = TextUtils.isEmpty(str);
            C89233z.C89236c cVar = new C89233z.C89236c();
            int i = f112303E;
            cVar.element = i;
            C89233z.C89236c cVar2 = new C89233z.C89236c();
            cVar2.element = f112304F;
            if (isEmpty) {
                TuxTextView tuxTextView = this.f112320z;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(8);
                }
                ImageView imageView = this.f112309A;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else {
                TuxTextView tuxTextView2 = this.f112320z;
                if (tuxTextView2 != null) {
                    tuxTextView2.setVisibility(0);
                }
                ImageView imageView2 = this.f112309A;
                if (imageView2 != null) {
                    imageView2.setVisibility(mo80571G().mo80565k());
                }
                TuxTextView tuxTextView3 = this.f112320z;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(str);
                }
                LinearLayout linearLayout10 = this.f112318x;
                if (linearLayout10 != null) {
                    linearLayout10.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                }
                LinearLayout linearLayout11 = this.f112318x;
                if (linearLayout11 == null) {
                    C89219l.m154715b();
                }
                cVar.element = linearLayout11.getMeasuredWidth();
                LinearLayout linearLayout12 = this.f112318x;
                if (linearLayout12 == null) {
                    C89219l.m154715b();
                }
                cVar2.element = linearLayout12.getMeasuredHeight();
                if (C80471gb.m139482a() && (linearLayout3 = this.f112318x) != null) {
                    linearLayout3.setPivotX((float) cVar.element);
                }
                if (!mo80571G().f112275v && (linearLayout2 = this.f112318x) != null) {
                    linearLayout2.setPivotY((float) cVar2.element);
                }
            }
            if (cVar.element > 0 && cVar2.element > 0) {
                ofInt.addUpdateListener(new C48560n(this, isEmpty, cVar, cVar2));
            }
            ofInt.addListener(new C48561o(this));
        } else {
            LinearLayout linearLayout13 = this.f112318x;
            if (linearLayout13 == null) {
                C89219l.m154715b();
            }
            int width = linearLayout13.getWidth();
            LinearLayout linearLayout14 = this.f112318x;
            if (linearLayout14 == null) {
                C89219l.m154715b();
            }
            int height = linearLayout14.getHeight();
            if (C80471gb.m139482a() && (linearLayout = this.f112318x) != null) {
                linearLayout.setPivotX((float) width);
            }
            ImageView imageView3 = this.f112310B;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            ImageView imageView4 = this.f112310B;
            if (imageView4 != null) {
                imageView4.setAlpha(0.0f);
            }
            if (width > 0 && height > 0) {
                ofInt.addUpdateListener(new C48562p(this, width, height));
            }
            ofInt.addListener(new C48563q(this));
        }
        ofInt.start();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$s */
    static final class C48565s extends AbstractC89220m implements AbstractC89183m<C48541a, C12784g, C89391z> {

        /* renamed from: a */
        public static final C48565s f112340a = new C48565s();

        static {
            Covode.recordClassIndex(57342);
        }

        C48565s() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48541a aVar, C12784g gVar) {
            C48541a aVar2 = aVar;
            C12784g gVar2 = gVar;
            C89219l.m154721d(aVar2, "");
            C89219l.m154721d(gVar2, "");
            if (gVar2.f31102a) {
                aVar2.mo80572I();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$v */
    static final class C48568v extends AbstractC89220m implements AbstractC89183m<C48541a, C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        public static final C48568v f112343a = new C48568v();

        static {
            Covode.recordClassIndex(57345);
        }

        C48568v() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48541a aVar, C12776a<? extends C89391z> aVar2) {
            C48541a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            if (aVar2 != null) {
                aVar3.mo80571G().mo80563i();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$w */
    static final class C48569w extends AbstractC89220m implements AbstractC89183m<C48541a, C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        public static final C48569w f112344a = new C48569w();

        static {
            Covode.recordClassIndex(57346);
        }

        C48569w() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48541a aVar, C12776a<? extends C89391z> aVar2) {
            C48541a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            if (aVar2 != null) {
                aVar3.mo80571G().mo80563i();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$u */
    static final class C48567u extends AbstractC89220m implements AbstractC89183m<C48541a, C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        public static final C48567u f112342a = new C48567u();

        static {
            Covode.recordClassIndex(57344);
        }

        C48567u() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48541a aVar, C12776a<? extends C89391z> aVar2) {
            C48541a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            if (aVar2 != null) {
                TuxTextView tuxTextView = aVar3.f112320z;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(8);
                }
                ImageView imageView = aVar3.f112310B;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                ImageView imageView2 = aVar3.f112309A;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                LinearLayout linearLayout = aVar3.f112319y;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                ValueAnimator valueAnimator = aVar3.f112311C;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                AbstractC23317a aVar4 = aVar3.f112316v;
                if (aVar4 != null) {
                    aVar4.dismiss();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$ac */
    static final class C48545ac extends AbstractC89220m implements AbstractC89183m<C48541a, C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        public static final C48545ac f112324a = new C48545ac();

        static {
            Covode.recordClassIndex(57322);
        }

        C48545ac() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48541a aVar, C12776a<? extends C89391z> aVar2) {
            C48541a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            if (aVar2 != null) {
                VideoCLACaptionViewModel G = aVar3.mo80571G();
                G.f112271k = -1;
                G.f112272l = false;
                G.f112274n = false;
                G.f112275v = false;
                G.f112276w = false;
                G.f112277x = false;
                G.f112279z = false;
                G.f112278y = "";
                G.f112267A = -1;
                LinearLayout linearLayout = aVar3.f112318x;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                TuxTextView tuxTextView = aVar3.f112320z;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(8);
                }
                ImageView imageView = aVar3.f112310B;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                ImageView imageView2 = aVar3.f112309A;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                LinearLayout linearLayout2 = aVar3.f112319y;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                ValueAnimator valueAnimator = aVar3.f112311C;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                AbstractC23317a aVar4 = aVar3.f112316v;
                if (aVar4 != null) {
                    aVar4.dismiss();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$ab */
    static final class C48544ab extends AbstractC89220m implements AbstractC89183m<C48541a, C12776a<? extends Integer>, C89391z> {

        /* renamed from: a */
        public static final C48544ab f112323a = new C48544ab();

        static {
            Covode.recordClassIndex(57321);
        }

        C48544ab() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48541a aVar, C12776a<? extends Integer> aVar2) {
            Aweme aweme;
            boolean z;
            Aweme aweme2;
            Video video;
            CaptionModel captionModel;
            List<CaptionItemModel> captionList;
            Aweme aweme3;
            Video video2;
            CaptionModel captionModel2;
            VideoItemParams videoItemParams;
            Aweme aweme4;
            Video video3;
            CaptionModel captionModel3;
            List<CaptionItemModel> captionList2;
            C48541a aVar3 = aVar;
            C89219l.m154721d(aVar3, "");
            if (aVar2 != null) {
                VideoCLACaptionViewModel G = aVar3.mo80571G();
                G.f112274n = G.mo23343h();
                VideoItemParams videoItemParams2 = (VideoItemParams) G.mo23342g();
                Aweme aweme5 = null;
                if (videoItemParams2 != null) {
                    aweme = videoItemParams2.mAweme;
                } else {
                    aweme = null;
                }
                G.f112270D = C50532ah.m94735k(aweme);
                G.f112268B = TranslatedCaptionCacheServiceImpl.m146355j().mo108895e();
                if (!TranslatedCaptionCacheServiceImpl.m146355j().mo108893d() || !G.f112270D) {
                    z = false;
                } else {
                    z = true;
                }
                G.f112269C = z;
                VideoItemParams videoItemParams3 = (VideoItemParams) G.mo23342g();
                if (!(videoItemParams3 == null || (aweme3 = videoItemParams3.mAweme) == null || (video2 = aweme3.getVideo()) == null || (captionModel2 = video2.getCaptionModel()) == null || captionModel2.getCaptionList() == null || ((videoItemParams = (VideoItemParams) G.mo23342g()) != null && (aweme4 = videoItemParams.mAweme) != null && (video3 = aweme4.getVideo()) != null && (captionModel3 = video3.getCaptionModel()) != null && (captionList2 = captionModel3.getCaptionList()) != null && captionList2.isEmpty()))) {
                    G.mo20667b(new VideoCLACaptionViewModel.C48534i(G));
                }
                if (!G.f112274n) {
                    G.mo20662a(VideoCLACaptionViewModel.C48529d.f112288a);
                } else {
                    G.f112271k = SystemClock.elapsedRealtime();
                    VideoItemParams videoItemParams4 = (VideoItemParams) G.mo23342g();
                    if (videoItemParams4 != null) {
                        aweme5 = videoItemParams4.mAweme;
                    }
                    G.f112275v = C50532ah.m94731g(aweme5);
                    TranslatedCaptionCacheServiceImpl.m146355j().mo108886a("");
                    G.f112273m = TranslatedCaptionCacheServiceImpl.m146355j().mo108890b();
                    VideoItemParams videoItemParams5 = (VideoItemParams) G.mo23342g();
                    if (!(videoItemParams5 == null || (aweme2 = videoItemParams5.mAweme) == null || (video = aweme2.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null || !(!captionList.isEmpty()))) {
                        AbstractC80747i O = C81079v.m140776O();
                        C89219l.m154716b(O, "");
                        O.mo123918L().mo124464l();
                        G.mo20662a(VideoCLACaptionViewModel.C48530e.f112289a);
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$r */
    static final class C48564r extends AbstractC89220m implements AbstractC89183m<C48541a, Boolean, C89391z> {

        /* renamed from: a */
        public static final C48564r f112339a = new C48564r();

        static {
            Covode.recordClassIndex(57341);
        }

        C48564r() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48541a aVar, Boolean bool) {
            ViewGroup.LayoutParams layoutParams;
            ViewGroup.LayoutParams layoutParams2;
            ViewGroup.LayoutParams layoutParams3;
            ViewGroup.LayoutParams layoutParams4;
            ViewGroup.LayoutParams layoutParams5;
            ViewGroup.LayoutParams layoutParams6;
            C48541a aVar2 = aVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(aVar2, "");
            if (booleanValue) {
                FrameLayout.LayoutParams layoutParams7 = null;
                if (aVar2.mo80571G().f112275v) {
                    FrameLayout frameLayout = aVar2.f112317w;
                    if (frameLayout != null) {
                        layoutParams4 = frameLayout.getLayoutParams();
                    } else {
                        layoutParams4 = null;
                    }
                    if (!(layoutParams4 instanceof FrameLayout.LayoutParams)) {
                        layoutParams4 = null;
                    }
                    FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams4;
                    if (layoutParams8 != null) {
                        layoutParams8.gravity = 8388659;
                        layoutParams8.topMargin = C48541a.f112302D;
                        LinearLayout linearLayout = aVar2.f112318x;
                        if (linearLayout != null) {
                            layoutParams5 = linearLayout.getLayoutParams();
                        } else {
                            layoutParams5 = null;
                        }
                        if (!(layoutParams5 instanceof LinearLayout.LayoutParams)) {
                            layoutParams5 = null;
                        }
                        LinearLayout.LayoutParams layoutParams9 = (LinearLayout.LayoutParams) layoutParams5;
                        if (layoutParams9 != null) {
                            layoutParams9.gravity = 8388659;
                        }
                        ImageView imageView = aVar2.f112310B;
                        if (imageView != null) {
                            layoutParams6 = imageView.getLayoutParams();
                        } else {
                            layoutParams6 = null;
                        }
                        if (layoutParams6 instanceof FrameLayout.LayoutParams) {
                            layoutParams7 = layoutParams6;
                        }
                        FrameLayout.LayoutParams layoutParams10 = (FrameLayout.LayoutParams) layoutParams7;
                        if (layoutParams10 != null) {
                            layoutParams10.gravity = 8388659;
                        }
                        FrameLayout frameLayout2 = aVar2.f112317w;
                        if (frameLayout2 != null) {
                            frameLayout2.setLayoutParams(layoutParams8);
                        }
                    }
                } else {
                    FrameLayout frameLayout3 = aVar2.f112317w;
                    if (frameLayout3 != null) {
                        layoutParams = frameLayout3.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                    if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                        layoutParams = null;
                    }
                    FrameLayout.LayoutParams layoutParams11 = (FrameLayout.LayoutParams) layoutParams;
                    if (layoutParams11 != null) {
                        layoutParams11.gravity = 8388691;
                        LinearLayout linearLayout2 = aVar2.f112318x;
                        if (linearLayout2 != null) {
                            layoutParams2 = linearLayout2.getLayoutParams();
                        } else {
                            layoutParams2 = null;
                        }
                        if (!(layoutParams2 instanceof LinearLayout.LayoutParams)) {
                            layoutParams2 = null;
                        }
                        LinearLayout.LayoutParams layoutParams12 = (LinearLayout.LayoutParams) layoutParams2;
                        if (layoutParams12 != null) {
                            layoutParams12.gravity = 8388691;
                        }
                        ImageView imageView2 = aVar2.f112310B;
                        if (imageView2 != null) {
                            layoutParams3 = imageView2.getLayoutParams();
                        } else {
                            layoutParams3 = null;
                        }
                        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                            layoutParams7 = layoutParams3;
                        }
                        FrameLayout.LayoutParams layoutParams13 = layoutParams7;
                        if (layoutParams13 != null) {
                            layoutParams13.gravity = 8388691;
                        }
                        FrameLayout frameLayout4 = aVar2.f112317w;
                        if (frameLayout4 != null) {
                            frameLayout4.setLayoutParams(layoutParams11);
                        }
                    }
                }
                LinearLayout linearLayout3 = aVar2.f112318x;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(0);
                }
            } else {
                LinearLayout linearLayout4 = aVar2.f112318x;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(8);
                }
                ImageView imageView3 = aVar2.f112310B;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$aa */
    static final class C48543aa extends AbstractC89220m implements AbstractC89183m<C48541a, C12776a<? extends VideoCaptionUpdateParams>, C89391z> {

        /* renamed from: a */
        public static final C48543aa f112322a = new C48543aa();

        static {
            Covode.recordClassIndex(57320);
        }

        C48543aa() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48541a aVar, C12776a<? extends VideoCaptionUpdateParams> aVar2) {
            Aweme aweme;
            Video video;
            CaptionModel captionModel;
            List<CaptionItemModel> captionList;
            String str;
            VideoItemParams videoItemParams;
            Aweme aweme2;
            String str2;
            Aweme aweme3;
            String str3;
            String str4;
            Aweme aweme4;
            String str5;
            Aweme aweme5;
            Aweme aweme6;
            C48541a aVar3 = aVar;
            C12776a<? extends VideoCaptionUpdateParams> aVar4 = aVar2;
            C89219l.m154721d(aVar3, "");
            if (aVar4 != null) {
                VideoCLACaptionViewModel G = aVar3.mo80571G();
                T t = aVar4.f31085a;
                C89219l.m154721d(t, "");
                if (G.f112274n) {
                    Context context = null;
                    if (G.f112271k != -1 && !G.f112279z) {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - G.f112271k;
                        G.f112271k = -1;
                        C33744d dVar = new C33744d();
                        VideoItemParams videoItemParams2 = (VideoItemParams) G.mo23342g();
                        if (videoItemParams2 != null) {
                            str5 = videoItemParams2.mEventType;
                        } else {
                            str5 = null;
                        }
                        C33744d a = dVar.mo59983a("enter_from", str5);
                        VideoItemParams videoItemParams3 = (VideoItemParams) G.mo23342g();
                        if (videoItemParams3 != null) {
                            aweme5 = videoItemParams3.mAweme;
                        } else {
                            aweme5 = null;
                        }
                        C33744d a2 = a.mo59983a("group_id", C59208ac.m108771e(aweme5));
                        VideoItemParams videoItemParams4 = (VideoItemParams) G.mo23342g();
                        if (videoItemParams4 != null) {
                            aweme6 = videoItemParams4.mAweme;
                        } else {
                            aweme6 = null;
                        }
                        C39162r.m79460a("cla_caption_first_visible_time", a2.mo59983a("author_id", C59208ac.m108758a(aweme6)).mo59981a("duration", elapsedRealtime).mo59980a("enable_experiment", C16048b.m29633a().mo25412a(true, "player_enable_opt_subload_time", 1)).f79943a);
                    }
                    VideoItemParams videoItemParams5 = (VideoItemParams) G.mo23342g();
                    if (!(videoItemParams5 == null || (aweme = videoItemParams5.mAweme) == null || (video = aweme.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (captionList = captionModel.getCaptionList()) == null || !(!captionList.isEmpty()))) {
                        String str6 = t.awemeId;
                        VideoItemParams videoItemParams6 = (VideoItemParams) G.mo23342g();
                        if (videoItemParams6 == null || (aweme4 = videoItemParams6.mAweme) == null) {
                            str = null;
                        } else {
                            str = aweme4.getAid();
                        }
                        if (C89219l.m154714a((Object) str, (Object) str6) && (!G.f112279z || !(((str3 = t.captionText) == null || str3.length() == 0) && ((str4 = G.f112278y) == null || str4.length() == 0)))) {
                            G.f112279z = true;
                            if (!(C49334a.m92423a() || (videoItemParams = (VideoItemParams) G.mo23342g()) == null || (aweme2 = videoItemParams.mAweme) == null || aweme2.getAuthorUid() == null)) {
                                VideoItemParams videoItemParams7 = (VideoItemParams) G.mo23342g();
                                if (videoItemParams7 == null || (aweme3 = videoItemParams7.mAweme) == null) {
                                    str2 = null;
                                } else {
                                    str2 = aweme3.getAuthorUid();
                                }
                                IAccountUserService g = C31575b.m65865g();
                                C89219l.m154716b(g, "");
                                if ((!C89219l.m154714a((Object) str2, (Object) g.getCurUserId())) && G.mo80564j()) {
                                    Context j = C17873f.m33102j();
                                    if (j instanceof ActivityC0945e) {
                                        context = j;
                                    }
                                    ActivityC0945e eVar = (ActivityC0945e) context;
                                    if (eVar != null) {
                                        G.mo80562a(eVar);
                                    }
                                }
                            }
                            G.f112278y = t.captionText;
                            if (!G.f112276w) {
                                G.mo20662a(VideoCLACaptionViewModel.C48540o.f112301a);
                            }
                        }
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$x */
    static final class C48570x extends AbstractC89220m implements AbstractC89183m<C48541a, C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        public static final C48570x f112345a = new C48570x();

        static {
            Covode.recordClassIndex(57347);
        }

        C48570x() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48541a aVar, C12776a<? extends C89391z> aVar2) {
            String str;
            String str2;
            String str3;
            Aweme aweme;
            Aweme aweme2;
            Aweme aweme3;
            Aweme aweme4;
            Video video;
            CaptionModel captionModel;
            CaptionLanguage originalCaptionLanguage;
            String languageName;
            Aweme aweme5;
            Aweme aweme6;
            C48541a aVar3 = aVar;
            String str4 = "";
            C89219l.m154721d(aVar3, str4);
            if (aVar2 != null) {
                VideoCLACaptionViewModel G = aVar3.mo80571G();
                if (G.f112274n && G.mo80564j()) {
                    C33744d dVar = new C33744d();
                    VideoItemParams videoItemParams = (VideoItemParams) G.mo23342g();
                    Aweme aweme7 = null;
                    if (videoItemParams != null) {
                        str = videoItemParams.mEventType;
                    } else {
                        str = null;
                    }
                    C33744d a = dVar.mo59983a("enter_from", str);
                    VideoItemParams videoItemParams2 = (VideoItemParams) G.mo23342g();
                    if (videoItemParams2 == null || (aweme6 = videoItemParams2.mAweme) == null) {
                        str2 = null;
                    } else {
                        str2 = aweme6.getAid();
                    }
                    C33744d a2 = a.mo59983a("group_id", str2);
                    VideoItemParams videoItemParams3 = (VideoItemParams) G.mo23342g();
                    if (videoItemParams3 == null || (aweme5 = videoItemParams3.mAweme) == null) {
                        str3 = null;
                    } else {
                        str3 = aweme5.getAuthorUid();
                    }
                    C33744d a3 = a2.mo59983a("author_id", str3).mo59980a("use_transl", !G.f112272l ? 1 : 0);
                    VideoItemParams videoItemParams4 = (VideoItemParams) G.mo23342g();
                    if (videoItemParams4 != null) {
                        aweme = videoItemParams4.mAweme;
                    } else {
                        aweme = null;
                    }
                    C33744d a4 = a3.mo59983a("subtitle_type", C50532ah.m94727c(aweme));
                    VideoItemParams videoItemParams5 = (VideoItemParams) G.mo23342g();
                    if (videoItemParams5 != null) {
                        aweme2 = videoItemParams5.mAweme;
                    } else {
                        aweme2 = null;
                    }
                    C33744d a5 = a4.mo59980a("have_transl", C50532ah.m94726b(aweme2) ? 1 : 0);
                    if (G.f112272l) {
                        VideoItemParams videoItemParams6 = (VideoItemParams) G.mo23342g();
                        if (!(videoItemParams6 == null || (aweme4 = videoItemParams6.mAweme) == null || (video = aweme4.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (originalCaptionLanguage = captionModel.getOriginalCaptionLanguage()) == null || (languageName = originalCaptionLanguage.getLanguageName()) == null)) {
                            str4 = languageName;
                        }
                    } else {
                        VideoItemParams videoItemParams7 = (VideoItemParams) G.mo23342g();
                        if (videoItemParams7 != null) {
                            aweme3 = videoItemParams7.mAweme;
                        } else {
                            aweme3 = null;
                        }
                        str4 = C50532ah.m94729e(aweme3);
                    }
                    C33744d a6 = a5.mo59983a("subtitle_lang", str4).mo59980a("have_tts", G.f112269C ? 1 : 0).mo59980a("use_tts", G.mo80564j() ? 1 : 0);
                    boolean z = G.f112272l;
                    VideoItemParams videoItemParams8 = (VideoItemParams) G.mo23342g();
                    if (videoItemParams8 != null) {
                        aweme7 = videoItemParams8.mAweme;
                    }
                    C39162r.m79460a("subtitle_tts_play", a6.mo59980a("cla_subtitle_type", C50532ah.m94724a(z, aweme7)).f79943a);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.corss.language.a$y */
    static final class C48571y extends AbstractC89220m implements AbstractC89183m<C48541a, C12776a<? extends C89391z>, C89391z> {

        /* renamed from: a */
        public static final C48571y f112346a = new C48571y();

        static {
            Covode.recordClassIndex(57348);
        }

        C48571y() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(C48541a aVar, C12776a<? extends C89391z> aVar2) {
            String str;
            String str2;
            String str3;
            Aweme aweme;
            Aweme aweme2;
            Aweme aweme3;
            Aweme aweme4;
            Video video;
            CaptionModel captionModel;
            CaptionLanguage originalCaptionLanguage;
            String languageName;
            Aweme aweme5;
            Aweme aweme6;
            C48541a aVar3 = aVar;
            String str4 = "";
            C89219l.m154721d(aVar3, str4);
            if (aVar2 != null) {
                VideoCLACaptionViewModel G = aVar3.mo80571G();
                if (G.f112274n && G.mo80564j()) {
                    C33744d dVar = new C33744d();
                    VideoItemParams videoItemParams = (VideoItemParams) G.mo23342g();
                    Aweme aweme7 = null;
                    if (videoItemParams != null) {
                        str = videoItemParams.mEventType;
                    } else {
                        str = null;
                    }
                    C33744d a = dVar.mo59983a("enter_from", str);
                    VideoItemParams videoItemParams2 = (VideoItemParams) G.mo23342g();
                    if (videoItemParams2 == null || (aweme6 = videoItemParams2.mAweme) == null) {
                        str2 = null;
                    } else {
                        str2 = aweme6.getAid();
                    }
                    C33744d a2 = a.mo59983a("group_id", str2);
                    VideoItemParams videoItemParams3 = (VideoItemParams) G.mo23342g();
                    if (videoItemParams3 == null || (aweme5 = videoItemParams3.mAweme) == null) {
                        str3 = null;
                    } else {
                        str3 = aweme5.getAuthorUid();
                    }
                    C33744d a3 = a2.mo59983a("author_id", str3).mo59980a("use_transl", !G.f112272l ? 1 : 0);
                    VideoItemParams videoItemParams4 = (VideoItemParams) G.mo23342g();
                    if (videoItemParams4 != null) {
                        aweme = videoItemParams4.mAweme;
                    } else {
                        aweme = null;
                    }
                    C33744d a4 = a3.mo59983a("subtitle_type", C50532ah.m94727c(aweme));
                    VideoItemParams videoItemParams5 = (VideoItemParams) G.mo23342g();
                    if (videoItemParams5 != null) {
                        aweme2 = videoItemParams5.mAweme;
                    } else {
                        aweme2 = null;
                    }
                    C33744d a5 = a4.mo59980a("have_transl", C50532ah.m94726b(aweme2) ? 1 : 0);
                    if (G.f112272l) {
                        VideoItemParams videoItemParams6 = (VideoItemParams) G.mo23342g();
                        if (!(videoItemParams6 == null || (aweme4 = videoItemParams6.mAweme) == null || (video = aweme4.getVideo()) == null || (captionModel = video.getCaptionModel()) == null || (originalCaptionLanguage = captionModel.getOriginalCaptionLanguage()) == null || (languageName = originalCaptionLanguage.getLanguageName()) == null)) {
                            str4 = languageName;
                        }
                    } else {
                        VideoItemParams videoItemParams7 = (VideoItemParams) G.mo23342g();
                        if (videoItemParams7 != null) {
                            aweme3 = videoItemParams7.mAweme;
                        } else {
                            aweme3 = null;
                        }
                        str4 = C50532ah.m94729e(aweme3);
                    }
                    C33744d a6 = a5.mo59983a("subtitle_lang", str4).mo59980a("have_tts", G.f112269C ? 1 : 0).mo59980a("use_tts", G.mo80564j() ? 1 : 0);
                    boolean z = G.f112272l;
                    VideoItemParams videoItemParams8 = (VideoItemParams) G.mo23342g();
                    if (videoItemParams8 != null) {
                        aweme7 = videoItemParams8.mAweme;
                    }
                    C39162r.m79460a("subtitle_tts_play_end", a6.mo59980a("cla_subtitle_type", C50532ah.m94724a(z, aweme7)).f79943a);
                }
            }
            return C89391z.f203057a;
        }
    }
}
