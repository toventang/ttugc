package com.p2082ss.android.ugc.aweme.ftc.p3036h;

import android.p003ss.com.vboost.C0004a;
import android.p003ss.com.vboost.EnumC0044d;
import android.p003ss.com.vboost.EnumC0065f;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2560h;
import com.bytedance.als.C2564l;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14315b;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14190j;
import com.bytedance.creativex.recorder.p940b.p941a.C14191k;
import com.bytedance.creativex.recorder.p940b.p941a.C14192l;
import com.bytedance.creativex.recorder.p940b.p941a.C14201t;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.ftc.p3036h.C52592d;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68109p;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89386u;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.ftc.h.b */
public final class C52570b extends AbstractC2562j<AbstractC52568a> implements AbstractC21566a, AbstractC52568a {

    /* renamed from: b */
    static final /* synthetic */ AbstractC89286i[] f121031b = {new C89232y(C52570b.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new C89232y(C52570b.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new C89232y(C52570b.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C52570b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C89232y(C52570b.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C89232y(C52570b.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0)};

    /* renamed from: A */
    private final C21582f f121032A;

    /* renamed from: B */
    private final int f121033B = R.id.dg9;

    /* renamed from: c */
    public final AbstractC52568a f121034c = this;

    /* renamed from: d */
    final C2564l<Long> f121035d;

    /* renamed from: e */
    final C2564l<Boolean> f121036e;

    /* renamed from: f */
    final C2564l<C89378p<List<TimeSpeedModelExtension>, Long>> f121037f;

    /* renamed from: g */
    final C2564l<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f121038g;

    /* renamed from: h */
    final C2564l<C89378p<List<TimeSpeedModelExtension>, Long>> f121039h;

    /* renamed from: i */
    final C2564l<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f121040i;

    /* renamed from: j */
    final AbstractC89248d f121041j;

    /* renamed from: k */
    public final int f121042k;

    /* renamed from: l */
    public final boolean f121043l;

    /* renamed from: m */
    public final C52592d f121044m;

    /* renamed from: n */
    public final AbstractC22186b f121045n;

    /* renamed from: o */
    private final C2564l<Boolean> f121046o;

    /* renamed from: p */
    private final C2564l<Boolean> f121047p;

    /* renamed from: q */
    private final C2564l<Integer> f121048q;

    /* renamed from: r */
    private final C2564l<RetakeVideoContext> f121049r;

    /* renamed from: s */
    private final ActivityC0945e f121050s;

    /* renamed from: t */
    private final AbstractC89248d f121051t;

    /* renamed from: u */
    private final AbstractC14315b f121052u;

    /* renamed from: v */
    private final AbstractC89248d f121053v;

    /* renamed from: w */
    private final AbstractC89248d f121054w;

    /* renamed from: x */
    private final AbstractC89248d f121055x;

    /* renamed from: y */
    private final AbstractC89248d f121056y;

    /* renamed from: z */
    private final AbstractC89244h f121057z;

    static {
        Covode.recordClassIndex(61966);
    }

    /* renamed from: j */
    private final AbstractC14177d m97483j() {
        return (AbstractC14177d) this.f121054w.mo23374a(this, f121031b[2]);
    }

    /* renamed from: f */
    public final AbstractC71864a mo88332f() {
        return (AbstractC71864a) this.f121051t.mo23374a(this, f121031b[0]);
    }

    /* renamed from: g */
    public final AbstractC83406b mo88333g() {
        return (AbstractC83406b) this.f121053v.mo23374a(this, f121031b[1]);
    }

    /* renamed from: h */
    public final AbstractC14193m mo88334h() {
        return (AbstractC14193m) this.f121055x.mo23374a(this, f121031b[3]);
    }

    /* renamed from: i */
    public final ShortVideoContext mo88335i() {
        return (ShortVideoContext) this.f121056y.mo23374a(this, f121031b[4]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC52568a getApiComponent() {
        return this.f121034c;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f121032A;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3036h.AbstractC52568a
    /* renamed from: b */
    public final void mo88324b() {
        RecordLayout recordLayout = this.f121044m.f121097d;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout.mo116797a(1);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3036h.AbstractC52568a
    /* renamed from: c */
    public final void mo88326c() {
        RecordLayout recordLayout = this.f121044m.f121097d;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout.mo116801c();
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3036h.AbstractC52568a
    /* renamed from: d */
    public final void mo88327d() {
        RecordLayout recordLayout = this.f121044m.f121097d;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout.mo116799b();
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3036h.AbstractC52568a
    /* renamed from: e */
    public final void mo88328e() {
        RecordLayout recordLayout = this.f121044m.f121097d;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout.f166943y = true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.b$a */
    public static final class C52571a extends AbstractC89220m implements AbstractC89171a<ShortVideoContextViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f121058a;

        static {
            Covode.recordClassIndex(61967);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C52571a(AbstractC21566a aVar) {
            super(0);
            this.f121058a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.ac, com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f121058a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<androidx.fragment.app.e> r1 = androidx.fragment.app.ActivityC0945e.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                androidx.fragment.app.e r0 = (androidx.fragment.app.ActivityC0945e) r0
                androidx.lifecycle.ad r1 = m97500x3992ac8c(r0)
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r0 = com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
                androidx.lifecycle.ac r0 = r1.mo3983a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.p3036h.C52570b.C52571a.invoke():androidx.lifecycle.ac");
        }

        /* renamed from: com_ss_android_ugc_aweme_ftc_progress_FTCRecordControlProgressComponent$$special$$inlined$viewModel$1_androidx_lifecycle_VScopeLancet_of */
        public static C1175ad m97500x3992ac8c(ActivityC0945e eVar) {
            return C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3036h.AbstractC52568a
    /* renamed from: a */
    public final void mo88320a() {
        RecordLayout recordLayout = this.f121044m.f121097d;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout.mo116798a(3, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0190, code lost:
        if (r0 == null) goto L_0x0192;
     */
    @Override // com.bytedance.als.AbstractC2562j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate() {
        /*
        // Method dump skipped, instructions count: 540
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.p3036h.C52570b.onCreate():void");
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.b$c */
    static final class C52573c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52570b f121060a;

        static {
            Covode.recordClassIndex(61969);
        }

        C52573c(C52570b bVar) {
            this.f121060a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f121060a.mo88330c(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.b$e */
    static final class C52575e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52570b f121062a;

        static {
            Covode.recordClassIndex(61971);
        }

        C52575e(C52570b bVar) {
            this.f121062a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f121062a.f121035d.mo7019b(Long.valueOf(((C14190j) obj).f34464a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.b$f */
    static final class C52576f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52570b f121063a;

        static {
            Covode.recordClassIndex(61972);
        }

        C52576f(C52570b bVar) {
            this.f121063a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f121063a.mo88330c(4);
            this.f121063a.mo88329b(4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.b$j */
    static final class C52580j<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52570b f121067a;

        static {
            Covode.recordClassIndex(61976);
        }

        C52580j(C52570b bVar) {
            this.f121067a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C14192l lVar = (C14192l) obj;
            if (!lVar.f34467a) {
                this.f121067a.mo88325b(lVar.f34468b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.b$s */
    static final class C52589s<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52570b f121076a;

        static {
            Covode.recordClassIndex(61985);
        }

        C52589s(C52570b bVar) {
            this.f121076a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f121076a.f121043l) {
                this.f121076a.f121044m.mo88339d(8);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3036h.AbstractC52568a
    /* renamed from: a */
    public final void mo88321a(int i) {
        this.f121048q.mo7019b(Integer.valueOf(i));
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.b$b */
    static final class C52572b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52570b f121059a;

        static {
            Covode.recordClassIndex(61968);
        }

        C52572b(C52570b bVar) {
            this.f121059a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C52570b bVar = this.f121059a;
            C89219l.m154716b(bool, "");
            bVar.f121036e.mo7019b(Boolean.valueOf(bool.booleanValue()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.b$g */
    static final class C52577g<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52570b f121064a;

        static {
            Covode.recordClassIndex(61973);
        }

        C52577g(C52570b bVar) {
            this.f121064a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                bool.booleanValue();
                if (bool.booleanValue()) {
                    bool.booleanValue();
                    this.f121064a.mo88334h().mo22890b(true);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.b$k */
    static final class C52581k<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52570b f121068a;

        static {
            Covode.recordClassIndex(61977);
        }

        C52581k(C52570b bVar) {
            this.f121068a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f121068a.mo88335i().f155817b.f155653i) {
                this.f121068a.mo88321a(2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.b$l */
    static final class C52582l<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52570b f121069a;

        static {
            Covode.recordClassIndex(61978);
        }

        C52582l(C52570b bVar) {
            this.f121069a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f121069a.mo88335i().f155817b.f155653i) {
                this.f121069a.mo88321a(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.b$q */
    static final class C52587q<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52570b f121074a;

        static {
            Covode.recordClassIndex(61983);
        }

        C52587q(C52570b bVar) {
            this.f121074a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f121074a.mo88325b(true);
            this.f121074a.mo88324b();
            this.f121074a.mo88328e();
            this.f121074a.mo88327d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.b$t */
    static final class C52590t<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52570b f121077a;

        static {
            Covode.recordClassIndex(61986);
        }

        C52590t(C52570b bVar) {
            this.f121077a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f121077a.mo88335i().f155817b.mo109899k() <= ((long) this.f121077a.f121042k)) {
                C0004a.m3a(EnumC0044d.TT_15S_CAPTURE_START, EnumC0065f.END);
            }
        }
    }

    /* renamed from: b */
    public final void mo88329b(int i) {
        ImageView imageView = this.f121044m.f121099f;
        if (imageView == null) {
            C89219l.m154710a("goNextButton");
        }
        imageView.setVisibility(i);
    }

    /* renamed from: c */
    public final void mo88330c(int i) {
        View view = this.f121044m.f121098e;
        if (view == null) {
            C89219l.m154710a("deleteLast");
        }
        view.setVisibility(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.b$d */
    static final class C52574d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52570b f121061a;

        static {
            Covode.recordClassIndex(61970);
        }

        C52574d(C52570b bVar) {
            this.f121061a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f121061a.mo88335i().f155817b.f155653i) {
                this.f121061a.mo88321a(1);
            }
            if (this.f121061a.mo88335i().f155817b.mo109899k() <= ((long) this.f121061a.f121042k)) {
                C0004a.m3a(EnumC0044d.TT_15S_CAPTURE_START, EnumC0065f.BEGIN);
            }
            if (this.f121061a.f121043l) {
                this.f121061a.f121044m.mo88339d(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.b$o */
    static final class C52585o<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52570b f121072a;

        static {
            Covode.recordClassIndex(61981);
        }

        C52585o(C52570b bVar) {
            this.f121072a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            AbstractC71864a f = this.f121072a.mo88332f();
            if (f == null || !f.mo113519g()) {
                C52570b bVar = this.f121072a;
                C89219l.m154716b(bool, "");
                bVar.mo88323a(bool.booleanValue());
            } else {
                this.f121072a.mo88323a(false);
            }
            C52570b bVar2 = this.f121072a;
            C89219l.m154716b(bool, "");
            bVar2.mo88325b(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.b$r */
    static final class C52588r<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52570b f121075a;

        static {
            Covode.recordClassIndex(61984);
        }

        C52588r(C52570b bVar) {
            this.f121075a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f121075a.mo88326c();
            this.f121075a.mo88325b(true);
            if (this.f121075a.mo88335i().f155817b.mo109896h() > 0) {
                this.f121075a.mo88329b(0);
                this.f121075a.mo88330c(0);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3036h.AbstractC52568a
    /* renamed from: a */
    public final void mo88322a(RetakeVideoContext retakeVideoContext) {
        C89219l.m154721d(retakeVideoContext, "");
        this.f121049r.mo7019b(retakeVideoContext);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3036h.AbstractC52568a
    /* renamed from: b */
    public final void mo88325b(boolean z) {
        this.f121047p.mo7019b(Boolean.valueOf(z));
    }

    /* renamed from: c */
    public final void mo88331c(boolean z) {
        RecordLayout recordLayout = this.f121044m.f121097d;
        if (recordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        recordLayout.setEnabled(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.b$h */
    static final class C52578h<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52570b f121065a;

        static {
            Covode.recordClassIndex(61974);
        }

        C52578h(C52570b bVar) {
            this.f121065a = bVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.h.d */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                if (this.f121065a.mo88333g() != null) {
                    AbstractC83406b g = this.f121065a.mo88333g();
                    if (g == null) {
                        C89219l.m154715b();
                    }
                    String currentBottomTag = g.getCurrentBottomTag();
                    C52570b bVar = this.f121065a;
                    if (!(!C89219l.m154714a((Object) currentBottomTag, (Object) ((ActivityC0945e) bVar.f121041j.mo23374a(bVar, C52570b.f121031b[5])).getString(R.string.f7u)))) {
                        return;
                    }
                }
                this.f121065a.mo88331c(true);
                return;
            }
            this.f121065a.mo88331c(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.b$i */
    static final class C52579i<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52570b f121066a;

        static {
            Covode.recordClassIndex(61975);
        }

        C52579i(C52570b bVar) {
            this.f121066a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C14191k kVar = (C14191k) obj;
            if (kVar.f34466b) {
                C52592d dVar = this.f121066a.f121044m;
                if (dVar.f121102i != null) {
                    FrameLayout frameLayout = dVar.f121102i;
                    if (frameLayout == null) {
                        C89219l.m154710a("colorSchemeLayout");
                    }
                    frameLayout.post(new C52592d.RunnableC52612r(dVar));
                }
            }
            C52592d dVar2 = this.f121066a.f121044m;
            Animation animation = kVar.f34465a;
            C89219l.m154721d(animation, "");
            RecordLayout recordLayout = dVar2.f121097d;
            if (recordLayout == null) {
                C89219l.m154710a("recordLayout");
            }
            C13628n.m24519a(recordLayout);
            RecordLayout recordLayout2 = dVar2.f121097d;
            if (recordLayout2 == null) {
                C89219l.m154710a("recordLayout");
            }
            recordLayout2.startAnimation(animation);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.b$m */
    static final class C52583m<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52570b f121070a;

        static {
            Covode.recordClassIndex(61979);
        }

        C52583m(C52570b bVar) {
            this.f121070a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                if (!this.f121070a.f121045n.mo36422g(this.f121070a.f121044m)) {
                    this.f121070a.f121045n.mo36417e(this.f121070a.f121044m);
                }
            } else if (this.f121070a.f121045n.mo36422g(this.f121070a.f121044m)) {
                this.f121070a.f121045n.mo36413d(this.f121070a.f121044m);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.b$n */
    static final class C52584n<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52570b f121071a;

        static {
            Covode.recordClassIndex(61980);
        }

        C52584n(C52570b bVar) {
            this.f121071a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (!bool.booleanValue()) {
                this.f121071a.mo88330c(8);
                this.f121071a.mo88329b(8);
            } else if (this.f121071a.mo88335i().f155817b.mo109896h() > 0) {
                this.f121071a.mo88330c(0);
                this.f121071a.mo88329b(0);
            } else {
                this.f121071a.mo88330c(8);
                this.f121071a.mo88329b(8);
            }
            if ((this.f121071a.mo88335i().f155817b.mo109889b() || this.f121071a.mo88335i().f155817b.mo109890c()) && !bool.booleanValue()) {
                this.f121071a.mo88330c(4);
                this.f121071a.mo88329b(4);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3036h.AbstractC52568a
    /* renamed from: a */
    public final void mo88323a(boolean z) {
        this.f121046o.mo7019b(Boolean.valueOf(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.h.b$p */
    static final class C52586p<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52570b f121073a;

        static {
            Covode.recordClassIndex(61982);
        }

        C52586p(C52570b bVar) {
            this.f121073a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            long a;
            boolean z;
            C14201t tVar = (C14201t) obj;
            if (tVar != null) {
                C52570b bVar = this.f121073a;
                if (tVar.f34478c != null) {
                    if (bVar.mo88335i().f155817b.f155653i) {
                        C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension> uVar = new C89386u<>(tVar.f34476a, Long.valueOf(tVar.f34477b), tVar.f34478c);
                        C89219l.m154721d(uVar, "");
                        bVar.f121040i.mo7019b(uVar);
                    } else {
                        C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension> uVar2 = new C89386u<>(tVar.f34476a, Long.valueOf(tVar.f34477b), tVar.f34478c);
                        C89219l.m154721d(uVar2, "");
                        bVar.f121038g.mo7019b(uVar2);
                    }
                } else if (bVar.mo88335i().f155817b.f155653i) {
                    C89378p<List<TimeSpeedModelExtension>, Long> pVar = new C89378p<>(tVar.f34476a, Long.valueOf(tVar.f34477b));
                    C89219l.m154721d(pVar, "");
                    bVar.f121039h.mo7019b(pVar);
                } else {
                    C89378p<List<TimeSpeedModelExtension>, Long> pVar2 = new C89378p<>(tVar.f34476a, Long.valueOf(tVar.f34477b));
                    C89219l.m154721d(pVar2, "");
                    bVar.f121037f.mo7019b(pVar2);
                }
                long j = tVar.f34477b;
                C52570b bVar2 = this.f121073a;
                if (bVar2.mo88335i().mo110022c()) {
                    a = 3000;
                } else if (bVar2.mo88335i().f155817b.mo109890c()) {
                    a = bVar2.mo88335i().f155817b.f155646b;
                } else if (bVar2.mo88335i().f155817b.f155653i) {
                    a = bVar2.mo88335i().f155817b.f155655k;
                } else {
                    a = C70637di.m124840a();
                }
                if (j >= a) {
                    z = true;
                } else {
                    z = false;
                }
                ImageView imageView = this.f121073a.f121044m.f121099f;
                if (imageView == null) {
                    C89219l.m154710a("goNextButton");
                }
                imageView.setSelected(z);
                int i = 4;
                if (!tVar.f34476a.isEmpty() || tVar.f34477b != 0) {
                    C52570b bVar3 = this.f121073a;
                    if (z) {
                        i = 0;
                    }
                    bVar3.mo88329b(i);
                    T value = this.f121073a.mo88334h().mo22891c().f7727a.getValue();
                    C89219l.m154716b(value, "");
                    if (value.booleanValue()) {
                        this.f121073a.mo88330c(0);
                        this.f121073a.mo88329b(0);
                        return;
                    }
                    return;
                }
                this.f121073a.mo88330c(4);
                this.f121073a.mo88329b(4);
            }
        }
    }

    public C52570b(C21582f fVar, AbstractC22186b bVar) {
        C2560h<Boolean> hVar;
        C2560h<Boolean> hVar2;
        C2560h<ScaleGestureDetector> hVar3;
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f121032A = fVar;
        this.f121045n = bVar;
        boolean z = true;
        this.f121046o = new C2564l<>(true);
        this.f121047p = new C2564l<>(true);
        C2564l<Long> lVar = new C2564l<>(0L);
        this.f121035d = lVar;
        C2564l<Boolean> lVar2 = new C2564l<>(true);
        this.f121036e = lVar2;
        C2560h<VideoRecordGestureLayout.AbstractC14312a> hVar4 = null;
        C2564l<C89378p<List<TimeSpeedModelExtension>, Long>> lVar3 = new C2564l<>(null);
        this.f121037f = lVar3;
        C2564l<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> lVar4 = new C2564l<>(null);
        this.f121038g = lVar4;
        C2564l<Integer> lVar5 = new C2564l<>(-1);
        this.f121048q = lVar5;
        C2564l<RetakeVideoContext> lVar6 = new C2564l<>(null);
        this.f121049r = lVar6;
        C2564l<C89378p<List<TimeSpeedModelExtension>, Long>> lVar7 = new C2564l<>(null);
        this.f121039h = lVar7;
        C2564l<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> lVar8 = new C2564l<>(null);
        this.f121040i = lVar8;
        this.f121050s = (ActivityC0945e) getDiContainer().mo35249a(ActivityC0945e.class, (String) null);
        this.f121051t = C21572a.m40505b(getDiContainer(), AbstractC71864a.class);
        AbstractC14315b bVar2 = (AbstractC14315b) getDiContainer().mo35252b(AbstractC14315b.class, null);
        this.f121052u = bVar2;
        this.f121053v = C21572a.m40505b(getDiContainer(), AbstractC83406b.class);
        this.f121054w = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);
        this.f121055x = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);
        this.f121056y = C21572a.m40504a(getDiContainer(), ShortVideoContext.class);
        this.f121041j = C21572a.m40504a(getDiContainer(), ActivityC0945e.class);
        this.f121057z = C89250i.m154774a(EnumC89331m.NONE, new C52571a(this));
        this.f121042k = 15000;
        this.f121043l = C68109p.m120400a() == 0 ? false : z;
        C52591c cVar = new C52591c();
        AbstractC14177d j = m97483j();
        C89219l.m154721d(j, "");
        cVar.f121078a = j;
        AbstractC14193m h = mo88334h();
        C89219l.m154721d(h, "");
        cVar.f121079b = h;
        ShortVideoContext i = mo88335i();
        C89219l.m154721d(i, "");
        cVar.f121080c = i;
        C89219l.m154721d(lVar, "");
        cVar.f121081d = lVar;
        C89219l.m154721d(lVar4, "");
        cVar.f121083f = lVar4;
        C89219l.m154721d(lVar3, "");
        cVar.f121082e = lVar3;
        C89219l.m154721d(lVar5, "");
        cVar.f121084g = lVar5;
        C89219l.m154721d(lVar6, "");
        cVar.f121085h = lVar6;
        C89219l.m154721d(lVar7, "");
        cVar.f121086i = lVar7;
        C89219l.m154721d(lVar8, "");
        cVar.f121087j = lVar8;
        C89219l.m154721d(lVar2, "");
        cVar.f121088k = lVar2;
        AbstractC71864a f = mo88332f();
        if (f != null) {
            hVar = f.mo113515d();
        } else {
            hVar = null;
        }
        cVar.f121089l = hVar;
        AbstractC71864a f2 = mo88332f();
        if (f2 != null) {
            hVar2 = f2.mo113513c();
        } else {
            hVar2 = null;
        }
        cVar.f121090m = hVar2;
        if (bVar2 != null) {
            hVar3 = bVar2.mo23102d();
        } else {
            hVar3 = null;
        }
        cVar.f121091n = hVar3;
        cVar.f121092o = bVar2 != null ? bVar2.mo23101c() : hVar4;
        this.f121044m = new C52592d(cVar);
    }
}
