package com.p2082ss.android.ugc.gamora.recorder.p4304k;

import android.p003ss.com.vboost.C0004a;
import android.p003ss.com.vboost.EnumC0044d;
import android.p003ss.com.vboost.EnumC0065f;
import android.view.ScaleGestureDetector;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2560h;
import com.bytedance.als.C2564l;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14315b;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.C14190j;
import com.bytedance.creativex.recorder.p940b.p941a.C14191k;
import com.bytedance.creativex.recorder.p940b.p941a.C14192l;
import com.bytedance.creativex.recorder.p940b.p941a.C14201t;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.property.C65360bc;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68109p;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.AbstractC74227m;
import com.p2082ss.android.ugc.aweme.utils.C80461fw;
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

/* renamed from: com.ss.android.ugc.gamora.recorder.k.g */
public final class C83809g extends AbstractC2562j<AbstractC83746a> implements AbstractC21566a, AbstractC83746a {

    /* renamed from: b */
    static final /* synthetic */ AbstractC89286i[] f187048b = {new C89232y(C83809g.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new C89232y(C83809g.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new C89232y(C83809g.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C83809g.class, "recordControlApi", "getRecordControlApi()Lcom/ss/android/ugc/aweme/shortvideo/recordcontrol/TikTokRecordControlApi;", 0), new C89232y(C83809g.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C89232y(C83809g.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0)};

    /* renamed from: A */
    private final AbstractC89248d f187049A;

    /* renamed from: B */
    private final AbstractC89244h f187050B;

    /* renamed from: C */
    private final C21582f f187051C;

    /* renamed from: D */
    private final int f187052D = R.id.dg9;

    /* renamed from: E */
    private final AbstractC83749c f187053E;

    /* renamed from: c */
    public final AbstractC83746a f187054c;

    /* renamed from: d */
    final C2564l<Long> f187055d;

    /* renamed from: e */
    public final C2564l<Boolean> f187056e;

    /* renamed from: f */
    final C2564l<Boolean> f187057f;

    /* renamed from: g */
    final C2564l<C89378p<List<TimeSpeedModelExtension>, Long>> f187058g;

    /* renamed from: h */
    final C2564l<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f187059h;

    /* renamed from: i */
    final C2564l<C89378p<List<TimeSpeedModelExtension>, Long>> f187060i;

    /* renamed from: j */
    final C2564l<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f187061j;

    /* renamed from: k */
    final AbstractC89248d f187062k;

    /* renamed from: l */
    public final int f187063l;

    /* renamed from: m */
    final AbstractC89244h f187064m;

    /* renamed from: n */
    public final boolean f187065n;

    /* renamed from: o */
    public final AbstractC83748b f187066o;

    /* renamed from: p */
    public final AbstractC22186b f187067p;

    /* renamed from: q */
    private final C2564l<Boolean> f187068q;

    /* renamed from: r */
    private final C2564l<Boolean> f187069r;

    /* renamed from: s */
    private final C2564l<Integer> f187070s;

    /* renamed from: t */
    private final C2564l<RetakeVideoContext> f187071t;

    /* renamed from: u */
    private final ActivityC0945e f187072u;

    /* renamed from: v */
    private final AbstractC89248d f187073v;

    /* renamed from: w */
    private final AbstractC14315b f187074w;

    /* renamed from: x */
    private final AbstractC89248d f187075x;

    /* renamed from: y */
    private final AbstractC89248d f187076y;

    /* renamed from: z */
    private final AbstractC89248d f187077z;

    static {
        Covode.recordClassIndex(97699);
    }

    /* renamed from: j */
    private final AbstractC14177d m144163j() {
        return (AbstractC14177d) this.f187076y.mo23374a(this, f187048b[2]);
    }

    /* renamed from: e */
    public final AbstractC71864a mo128743e() {
        return (AbstractC71864a) this.f187073v.mo23374a(this, f187048b[0]);
    }

    /* renamed from: f */
    public final AbstractC83406b mo128744f() {
        return (AbstractC83406b) this.f187075x.mo23374a(this, f187048b[1]);
    }

    /* renamed from: g */
    public final AbstractC74227m mo128745g() {
        return (AbstractC74227m) this.f187077z.mo23374a(this, f187048b[3]);
    }

    /* renamed from: h */
    public final ShortVideoContext mo128746h() {
        return (ShortVideoContext) this.f187049A.mo23374a(this, f187048b[4]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC83746a getApiComponent() {
        return this.f187054c;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f187051C;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a
    /* renamed from: a */
    public final void mo128710a() {
        this.f187066o.mo122979C();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a
    /* renamed from: b */
    public final void mo128715b() {
        this.f187066o.mo122980D();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a
    /* renamed from: c */
    public final void mo128717c() {
        this.f187066o.mo122982F();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a
    /* renamed from: d */
    public final void mo128719d() {
        this.f187066o.mo122983G();
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.g$w */
    static final class C83832w extends AbstractC89220m implements AbstractC89171a<Long> {

        /* renamed from: a */
        public static final C83832w f187100a = new C83832w();

        static {
            Covode.recordClassIndex(97722);
        }

        C83832w() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf(C70637di.m124840a());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.g$a */
    public static final class C83810a extends AbstractC89220m implements AbstractC89171a<ShortVideoContextViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f187078a;

        static {
            Covode.recordClassIndex(97700);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83810a(AbstractC21566a aVar) {
            super(0);
            this.f187078a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.ac, com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f187078a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<androidx.fragment.app.e> r1 = androidx.fragment.app.ActivityC0945e.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                androidx.fragment.app.e r0 = (androidx.fragment.app.ActivityC0945e) r0
                androidx.lifecycle.ad r1 = m144181x5e64504a(r0)
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r0 = com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
                androidx.lifecycle.ac r0 = r1.mo3983a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.recorder.p4304k.C83809g.C83810a.invoke():androidx.lifecycle.ac");
        }

        /* renamed from: com_ss_android_ugc_gamora_recorder_progress_RecordControlProgressComponent$$special$$inlined$viewModel$1_androidx_lifecycle_VScopeLancet_of */
        public static C1175ad m144181x5e64504a(ActivityC0945e eVar) {
            return C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null);
        }
    }

    /* renamed from: i */
    public final void mo128747i() {
        if (mo128746h().mo110018b()) {
            this.f187066o.mo122985a(0.2f);
        } else {
            this.f187066o.mo122985a(1.0f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x01a8, code lost:
        if (r0 == null) goto L_0x01aa;
     */
    @Override // com.bytedance.als.AbstractC2562j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate() {
        /*
        // Method dump skipped, instructions count: 577
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.recorder.p4304k.C83809g.onCreate():void");
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.g$c */
    static final class C83812c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83809g f187080a;

        static {
            Covode.recordClassIndex(97702);
        }

        C83812c(C83809g gVar) {
            this.f187080a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f187080a.mo128742c(8);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.g$f */
    static final class C83815f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83809g f187083a;

        static {
            Covode.recordClassIndex(97705);
        }

        C83815f(C83809g gVar) {
            this.f187083a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f187083a.f187056e.mo7019b(obj);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.g$o */
    static final class C83824o<T> implements AbstractC2565m {

        /* renamed from: a */
        public static final C83824o f187092a = new C83824o();

        static {
            Covode.recordClassIndex(97714);
        }

        C83824o() {
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C80461fw.m139466a("tool_record_start");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.g$e */
    static final class C83814e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83809g f187082a;

        static {
            Covode.recordClassIndex(97704);
        }

        C83814e(C83809g gVar) {
            this.f187082a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f187082a.f187055d.mo7019b(Long.valueOf(((C14190j) obj).f34464a));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.g$g */
    static final class C83816g<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83809g f187084a;

        static {
            Covode.recordClassIndex(97706);
        }

        C83816g(C83809g gVar) {
            this.f187084a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f187084a.mo128742c(4);
            this.f187084a.mo128741b(4);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.g$k */
    static final class C83820k<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83809g f187088a;

        static {
            Covode.recordClassIndex(97710);
        }

        C83820k(C83809g gVar) {
            this.f187088a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C14192l lVar = (C14192l) obj;
            if (!lVar.f34467a) {
                this.f187088a.mo128718c(lVar.f34468b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.g$u */
    static final class C83830u<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83809g f187098a;

        static {
            Covode.recordClassIndex(97720);
        }

        C83830u(C83809g gVar) {
            this.f187098a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f187098a.f187065n) {
                this.f187098a.f187066o.mo122994f(8);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a
    /* renamed from: a */
    public final void mo128711a(int i) {
        this.f187070s.mo7019b(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo128741b(int i) {
        this.f187066o.mo122992d(i);
    }

    /* renamed from: c */
    public final void mo128742c(int i) {
        this.f187066o.mo122993e(i);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.g$b */
    static final class C83811b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83809g f187079a;

        static {
            Covode.recordClassIndex(97701);
        }

        C83811b(C83809g gVar) {
            this.f187079a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C83809g gVar = this.f187079a;
            C89219l.m154716b(bool, "");
            gVar.f187057f.mo7019b(Boolean.valueOf(bool.booleanValue()));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.g$h */
    static final class C83817h<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83809g f187085a;

        static {
            Covode.recordClassIndex(97707);
        }

        C83817h(C83809g gVar) {
            this.f187085a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                bool.booleanValue();
                if (bool.booleanValue()) {
                    bool.booleanValue();
                    this.f187085a.mo128745g().mo22890b(true);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.g$j */
    static final class C83819j<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83809g f187087a;

        static {
            Covode.recordClassIndex(97709);
        }

        C83819j(C83809g gVar) {
            this.f187087a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C14191k kVar = (C14191k) obj;
            if (kVar.f34466b) {
                this.f187087a.f187066o.mo122981E();
            }
            this.f187087a.f187066o.mo122987a(kVar.f34465a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.g$l */
    static final class C83821l<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83809g f187089a;

        static {
            Covode.recordClassIndex(97711);
        }

        C83821l(C83809g gVar) {
            this.f187089a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f187089a.mo128746h().f155817b.f155653i) {
                this.f187089a.mo128711a(2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.g$n */
    static final class C83823n<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83809g f187091a;

        static {
            Covode.recordClassIndex(97713);
        }

        C83823n(C83809g gVar) {
            this.f187091a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f187091a.mo128746h().f155817b.f155653i) {
                this.f187091a.mo128711a(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.g$s */
    static final class C83828s<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83809g f187096a;

        static {
            Covode.recordClassIndex(97718);
        }

        C83828s(C83809g gVar) {
            this.f187096a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f187096a.mo128718c(true);
            this.f187096a.mo128710a();
            this.f187096a.mo128719d();
            this.f187096a.mo128717c();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.g$v */
    static final class C83831v<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83809g f187099a;

        static {
            Covode.recordClassIndex(97721);
        }

        C83831v(C83809g gVar) {
            this.f187099a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f187099a.mo128746h().f155817b.mo109899k() <= ((long) this.f187099a.f187063l)) {
                C0004a.m3a(EnumC0044d.TT_15S_CAPTURE_START, EnumC0065f.END);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a
    /* renamed from: b */
    public final void mo128716b(boolean z) {
        this.f187068q.mo7019b(Boolean.valueOf(z));
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a
    /* renamed from: c */
    public final void mo128718c(boolean z) {
        this.f187069r.mo7019b(Boolean.valueOf(z));
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.g$q */
    static final class C83826q<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83809g f187094a;

        static {
            Covode.recordClassIndex(97716);
        }

        C83826q(C83809g gVar) {
            this.f187094a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            AbstractC71864a e = this.f187094a.mo128743e();
            if (e == null || !e.mo113519g()) {
                C83809g gVar = this.f187094a;
                C89219l.m154716b(bool, "");
                gVar.mo128716b(bool.booleanValue());
            } else {
                this.f187094a.mo128716b(false);
            }
            C83809g gVar2 = this.f187094a;
            C89219l.m154716b(bool, "");
            gVar2.mo128718c(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.g$t */
    static final class C83829t<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83809g f187097a;

        static {
            Covode.recordClassIndex(97719);
        }

        C83829t(C83809g gVar) {
            this.f187097a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f187097a.mo128715b();
            this.f187097a.mo128718c(true);
            if (this.f187097a.mo128746h().f155817b.mo109896h() > 0) {
                this.f187097a.mo128741b(0);
                this.f187097a.mo128742c(0);
                this.f187097a.mo128747i();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a
    /* renamed from: a */
    public final void mo128713a(RetakeVideoContext retakeVideoContext) {
        C89219l.m154721d(retakeVideoContext, "");
        this.f187071t.mo7019b(retakeVideoContext);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.g$d */
    static final class C83813d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83809g f187081a;

        static {
            Covode.recordClassIndex(97703);
        }

        C83813d(C83809g gVar) {
            this.f187081a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f187081a.mo128746h().f155817b.f155653i) {
                this.f187081a.mo128711a(1);
            }
            if (this.f187081a.mo128746h().f155817b.mo109899k() <= ((long) this.f187081a.f187063l)) {
                C0004a.m3a(EnumC0044d.TT_15S_CAPTURE_START, EnumC0065f.BEGIN);
            }
            if (this.f187081a.f187065n) {
                this.f187081a.f187066o.mo122994f(0);
            }
            C80461fw.m139467a("tool_record_start", C65360bc.m117058b(), (long) C65360bc.m117059c());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.g$i */
    static final class C83818i<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83809g f187086a;

        static {
            Covode.recordClassIndex(97708);
        }

        C83818i(C83809g gVar) {
            this.f187086a = gVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.h.d */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                if (this.f187086a.mo128744f() != null) {
                    AbstractC83406b f = this.f187086a.mo128744f();
                    if (f == null) {
                        C89219l.m154715b();
                    }
                    String currentBottomTag = f.getCurrentBottomTag();
                    C83809g gVar = this.f187086a;
                    if (!(!C89219l.m154714a((Object) currentBottomTag, (Object) ((ActivityC0945e) gVar.f187062k.mo23374a(gVar, C83809g.f187048b[5])).getString(R.string.f7u)))) {
                        return;
                    }
                }
                this.f187086a.mo128714a(true);
                return;
            }
            this.f187086a.mo128714a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.g$m */
    static final class C83822m<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83809g f187090a;

        static {
            Covode.recordClassIndex(97712);
        }

        C83822m(C83809g gVar) {
            this.f187090a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                if (!this.f187090a.f187067p.mo36422g(this.f187090a.f187066o.mo122989b())) {
                    this.f187090a.f187067p.mo36417e(this.f187090a.f187066o.mo122989b());
                }
            } else if (this.f187090a.f187067p.mo36422g(this.f187090a.f187066o.mo122989b())) {
                this.f187090a.f187067p.mo36413d(this.f187090a.f187066o.mo122989b());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.g$p */
    static final class C83825p<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83809g f187093a;

        static {
            Covode.recordClassIndex(97715);
        }

        C83825p(C83809g gVar) {
            this.f187093a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (!bool.booleanValue()) {
                this.f187093a.mo128742c(8);
                this.f187093a.mo128741b(8);
            } else if (this.f187093a.mo128746h().f155817b.mo109896h() > 0) {
                this.f187093a.mo128742c(0);
                this.f187093a.mo128741b(0);
                this.f187093a.mo128747i();
            } else {
                this.f187093a.mo128742c(8);
                this.f187093a.mo128741b(8);
            }
            if ((this.f187093a.mo128746h().f155817b.mo109889b() || this.f187093a.mo128746h().f155817b.mo109890c()) && !bool.booleanValue()) {
                this.f187093a.mo128742c(4);
                this.f187093a.mo128741b(4);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a
    /* renamed from: a */
    public final void mo128714a(boolean z) {
        this.f187066o.mo122988a(z);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.g$r */
    static final class C83827r<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83809g f187095a;

        static {
            Covode.recordClassIndex(97717);
        }

        C83827r(C83809g gVar) {
            this.f187095a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            long a;
            boolean z;
            C14201t tVar = (C14201t) obj;
            if (tVar != null) {
                C83809g gVar = this.f187095a;
                if (tVar.f34478c != null) {
                    if (gVar.mo128746h().f155817b.f155653i) {
                        C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension> uVar = new C89386u<>(tVar.f34476a, Long.valueOf(tVar.f34477b), tVar.f34478c);
                        C89219l.m154721d(uVar, "");
                        gVar.f187061j.mo7019b(uVar);
                    } else {
                        C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension> uVar2 = new C89386u<>(tVar.f34476a, Long.valueOf(tVar.f34477b), tVar.f34478c);
                        C89219l.m154721d(uVar2, "");
                        gVar.f187059h.mo7019b(uVar2);
                    }
                } else if (gVar.mo128746h().f155817b.f155653i) {
                    C89378p<List<TimeSpeedModelExtension>, Long> pVar = new C89378p<>(tVar.f34476a, Long.valueOf(tVar.f34477b));
                    C89219l.m154721d(pVar, "");
                    gVar.f187060i.mo7019b(pVar);
                } else {
                    C89378p<List<TimeSpeedModelExtension>, Long> pVar2 = new C89378p<>(tVar.f34476a, Long.valueOf(tVar.f34477b));
                    C89219l.m154721d(pVar2, "");
                    gVar.f187058g.mo7019b(pVar2);
                }
                long j = tVar.f34477b;
                C83809g gVar2 = this.f187095a;
                if (gVar2.mo128746h().mo110022c()) {
                    a = 3000;
                } else if (gVar2.mo128746h().f155817b.mo109890c()) {
                    a = gVar2.mo128746h().f155817b.f155646b;
                } else if (gVar2.mo128746h().f155817b.f155653i) {
                    a = gVar2.mo128746h().f155817b.f155655k;
                } else {
                    gVar2.mo128746h();
                    if (C68109p.m120400a() == 2) {
                        a = ((Number) gVar2.f187064m.getValue()).longValue();
                    } else {
                        a = C70637di.m124840a();
                    }
                }
                if (j >= a) {
                    z = true;
                } else {
                    z = false;
                }
                this.f187095a.f187066o.mo122990b(z);
                int i = 4;
                if (!tVar.f34476a.isEmpty() || tVar.f34477b != 0) {
                    C83809g gVar3 = this.f187095a;
                    if (z) {
                        i = 0;
                    }
                    gVar3.mo128741b(i);
                    T value = this.f187095a.mo128745g().mo22891c().f7727a.getValue();
                    C89219l.m154716b(value, "");
                    if (value.booleanValue()) {
                        this.f187095a.mo128742c(0);
                        this.f187095a.mo128747i();
                        this.f187095a.mo128741b(0);
                        return;
                    }
                    return;
                }
                this.f187095a.mo128742c(4);
                this.f187095a.mo128741b(4);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a
    /* renamed from: a */
    public final void mo128712a(int i, boolean z) {
        this.f187066o.mo122986a(i, z);
    }

    public C83809g(C21582f fVar, AbstractC22186b bVar, AbstractC83749c cVar) {
        C2560h<Boolean> hVar;
        C2560h<Boolean> hVar2;
        C2560h<ScaleGestureDetector> hVar3;
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(cVar, "");
        this.f187051C = fVar;
        this.f187067p = bVar;
        this.f187053E = cVar;
        this.f187054c = this;
        boolean z = true;
        this.f187068q = new C2564l<>(true);
        this.f187069r = new C2564l<>(true);
        C2564l<Long> lVar = new C2564l<>(0L);
        this.f187055d = lVar;
        C2564l<Boolean> lVar2 = new C2564l<>(true);
        this.f187056e = lVar2;
        C2564l<Boolean> lVar3 = new C2564l<>(true);
        this.f187057f = lVar3;
        C2560h<VideoRecordGestureLayout.AbstractC14312a> hVar4 = null;
        C2564l<C89378p<List<TimeSpeedModelExtension>, Long>> lVar4 = new C2564l<>(null);
        this.f187058g = lVar4;
        C2564l<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> lVar5 = new C2564l<>(null);
        this.f187059h = lVar5;
        C2564l<Integer> lVar6 = new C2564l<>(-1);
        this.f187070s = lVar6;
        C2564l<RetakeVideoContext> lVar7 = new C2564l<>(null);
        this.f187071t = lVar7;
        C2564l<C89378p<List<TimeSpeedModelExtension>, Long>> lVar8 = new C2564l<>(null);
        this.f187060i = lVar8;
        C2564l<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> lVar9 = new C2564l<>(null);
        this.f187061j = lVar9;
        this.f187072u = (ActivityC0945e) getDiContainer().mo35249a(ActivityC0945e.class, (String) null);
        this.f187073v = C21572a.m40505b(getDiContainer(), AbstractC71864a.class);
        AbstractC14315b bVar2 = (AbstractC14315b) getDiContainer().mo35252b(AbstractC14315b.class, null);
        this.f187074w = bVar2;
        this.f187075x = C21572a.m40505b(getDiContainer(), AbstractC83406b.class);
        this.f187076y = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);
        this.f187077z = C21572a.m40504a(getDiContainer(), AbstractC74227m.class);
        this.f187049A = C21572a.m40504a(getDiContainer(), ShortVideoContext.class);
        this.f187062k = C21572a.m40504a(getDiContainer(), ActivityC0945e.class);
        this.f187050B = C89250i.m154774a(EnumC89331m.NONE, new C83810a(this));
        this.f187063l = 15000;
        this.f187064m = C89250i.m154773a((AbstractC89171a) C83832w.f187100a);
        this.f187065n = C68109p.m120400a() == 0 ? false : z;
        AbstractC14177d j = m144163j();
        C21582f diContainer = getDiContainer();
        AbstractC74227m g = mo128745g();
        ShortVideoContext h = mo128746h();
        AbstractC71864a e = mo128743e();
        if (e != null) {
            hVar = e.mo113515d();
        } else {
            hVar = null;
        }
        AbstractC71864a e2 = mo128743e();
        if (e2 != null) {
            hVar2 = e2.mo113513c();
        } else {
            hVar2 = null;
        }
        if (bVar2 != null) {
            hVar3 = bVar2.mo23102d();
            hVar4 = bVar2.mo23101c();
        } else {
            hVar3 = null;
        }
        this.f187066o = cVar.mo123000a(new C83856j(j, diContainer, g, h, lVar, lVar2, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar3, hVar, hVar2, hVar3, hVar4));
    }
}
