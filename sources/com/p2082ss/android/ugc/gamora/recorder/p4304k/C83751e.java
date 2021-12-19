package com.p2082ss.android.ugc.gamora.recorder.p4304k;

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
import com.bytedance.als.C2549d;
import com.bytedance.als.C2560h;
import com.bytedance.als.C2563k;
import com.bytedance.als.C2564l;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14315b;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.C14190j;
import com.bytedance.creativex.recorder.p940b.p941a.C14191k;
import com.bytedance.creativex.recorder.p940b.p941a.C14192l;
import com.bytedance.creativex.recorder.p940b.p941a.C14201t;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.property.C65360bc;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.RecordContext;
import com.p2082ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.AbstractC74227m;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout;
import com.p2082ss.android.ugc.aweme.tools.C78600h;
import com.p2082ss.android.ugc.aweme.utils.C80461fw;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.gamora.recorder.p4301h.C83719b;
import com.p2082ss.android.ugc.gamora.recorder.p4304k.C83782f;
import com.p2082ss.android.ugc.gamora.recorder.p4305l.AbstractC83869f;
import com.p2082ss.android.ugc.gamora.recorder.p4306m.AbstractC83881a;
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

/* renamed from: com.ss.android.ugc.gamora.recorder.k.e */
public final class C83751e extends AbstractC2562j<AbstractC83750d> implements AbstractC21566a, AbstractC83750d {

    /* renamed from: b */
    static final /* synthetic */ AbstractC89286i[] f186922b = {new C89232y(C83751e.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new C89232y(C83751e.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new C89232y(C83751e.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C83751e.class, "recordControlApi", "getRecordControlApi()Lcom/ss/android/ugc/aweme/shortvideo/recordcontrol/TikTokRecordControlApi;", 0), new C89232y(C83751e.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C89232y(C83751e.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0)};

    /* renamed from: A */
    private final AbstractC89248d f186923A = C21572a.m40504a(getDiContainer(), AbstractC74227m.class);

    /* renamed from: B */
    private final AbstractC89248d f186924B = C21572a.m40504a(getDiContainer(), ShortVideoContext.class);

    /* renamed from: C */
    private final AbstractC89244h f186925C = C89250i.m154774a(EnumC89331m.NONE, new C83752a(this));

    /* renamed from: D */
    private final int f186926D = -21;

    /* renamed from: E */
    private final AbstractC89244h f186927E = C89250i.m154773a((AbstractC89171a) new C83756ad(this));

    /* renamed from: F */
    private final C21582f f186928F;

    /* renamed from: G */
    private final int f186929G = R.id.dg9;

    /* renamed from: c */
    public final AbstractC83750d f186930c = this;

    /* renamed from: d */
    public final C2564l<Long> f186931d = new C2564l<>(0L);

    /* renamed from: e */
    public final C2564l<Boolean> f186932e = new C2564l<>(true);

    /* renamed from: f */
    public final C2564l<Boolean> f186933f = new C2564l<>(true);

    /* renamed from: g */
    public final C2564l<C89378p<List<TimeSpeedModelExtension>, Long>> f186934g = new C2564l<>(null);

    /* renamed from: h */
    public final C2564l<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f186935h = new C2564l<>(null);

    /* renamed from: i */
    public final C2564l<Long> f186936i = new C2564l<>(0L);

    /* renamed from: j */
    public final C2563k<Boolean> f186937j = new C2563k<>();

    /* renamed from: k */
    public final C2549d<Integer> f186938k = new C2549d<>(0);

    /* renamed from: l */
    public final C2564l<Integer> f186939l = new C2564l<>(-1);

    /* renamed from: m */
    public final C2564l<RetakeVideoContext> f186940m = new C2564l<>(null);

    /* renamed from: n */
    public final C2564l<C89378p<List<TimeSpeedModelExtension>, Long>> f186941n = new C2564l<>(null);

    /* renamed from: o */
    public final C2564l<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> f186942o = new C2564l<>(null);

    /* renamed from: p */
    public final AbstractC14315b f186943p = ((AbstractC14315b) getDiContainer().mo35252b(AbstractC14315b.class, null));

    /* renamed from: q */
    final AbstractC89248d f186944q = C21572a.m40504a(getDiContainer(), ActivityC0945e.class);

    /* renamed from: r */
    public final int f186945r = 15000;

    /* renamed from: s */
    public boolean f186946s;

    /* renamed from: t */
    public final AbstractC22186b f186947t;

    /* renamed from: u */
    private final C2564l<Boolean> f186948u = new C2564l<>(true);

    /* renamed from: v */
    private final C2564l<Boolean> f186949v = new C2564l<>(true);

    /* renamed from: w */
    private final ActivityC0945e f186950w = ((ActivityC0945e) getDiContainer().mo35249a(ActivityC0945e.class, (String) null));

    /* renamed from: x */
    private final AbstractC89248d f186951x = C21572a.m40505b(getDiContainer(), AbstractC71864a.class);

    /* renamed from: y */
    private final AbstractC89248d f186952y = C21572a.m40505b(getDiContainer(), AbstractC83406b.class);

    /* renamed from: z */
    private final AbstractC89248d f186953z = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);

    static {
        Covode.recordClassIndex(97641);
    }

    /* renamed from: e */
    public final AbstractC71864a mo128724e() {
        return (AbstractC71864a) this.f186951x.mo23374a(this, f186922b[0]);
    }

    /* renamed from: f */
    public final AbstractC83406b mo128726f() {
        return (AbstractC83406b) this.f186952y.mo23374a(this, f186922b[1]);
    }

    /* renamed from: g */
    public final AbstractC14177d mo128727g() {
        return (AbstractC14177d) this.f186953z.mo23374a(this, f186922b[2]);
    }

    /* renamed from: h */
    public final AbstractC74227m mo128728h() {
        return (AbstractC74227m) this.f186923A.mo23374a(this, f186922b[3]);
    }

    /* renamed from: i */
    public final ShortVideoContext mo128729i() {
        return (ShortVideoContext) this.f186924B.mo23374a(this, f186922b[4]);
    }

    /* renamed from: j */
    public final C83782f mo128730j() {
        return (C83782f) this.f186927E.getValue();
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC83750d getApiComponent() {
        return this.f186930c;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f186928F;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$a */
    public static final class C83752a extends AbstractC89220m implements AbstractC89171a<ShortVideoContextViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186954a;

        static {
            Covode.recordClassIndex(97642);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83752a(AbstractC21566a aVar) {
            super(0);
            this.f186954a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.ac, com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186954a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<androidx.fragment.app.e> r1 = androidx.fragment.app.ActivityC0945e.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                androidx.fragment.app.e r0 = (androidx.fragment.app.ActivityC0945e) r0
                androidx.lifecycle.ad r1 = m144145x25ff1c98(r0)
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r0 = com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
                androidx.lifecycle.ac r0 = r1.mo3983a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.recorder.p4304k.C83751e.C83752a.invoke():androidx.lifecycle.ac");
        }

        /* renamed from: com_ss_android_ugc_gamora_recorder_progress_LighteningControlProgressComponent$$special$$inlined$viewModel$1_androidx_lifecycle_VScopeLancet_of */
        public static C1175ad m144145x25ff1c98(ActivityC0945e eVar) {
            return C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a
    /* renamed from: a */
    public final void mo128710a() {
        LighteningRecordLayout lighteningRecordLayout = mo128730j().f187008d;
        if (lighteningRecordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        lighteningRecordLayout.mo116750b();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a
    /* renamed from: b */
    public final void mo128715b() {
        LighteningRecordLayout lighteningRecordLayout = mo128730j().f187008d;
        if (lighteningRecordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        lighteningRecordLayout.mo116752d();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a
    /* renamed from: c */
    public final void mo128717c() {
        LighteningRecordLayout lighteningRecordLayout = mo128730j().f187008d;
        if (lighteningRecordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        lighteningRecordLayout.mo116751c();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a
    /* renamed from: d */
    public final void mo128719d() {
        LighteningRecordLayout lighteningRecordLayout = mo128730j().f187008d;
        if (lighteningRecordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        lighteningRecordLayout.f166792D = true;
    }

    /* renamed from: k */
    public final void mo128731k() {
        if (mo128729i().mo110018b()) {
            mo128730j().mo128733a(0.2f);
        } else {
            mo128730j().mo128733a(1.0f);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$ad */
    static final class C83756ad extends AbstractC89220m implements AbstractC89171a<C83782f> {

        /* renamed from: a */
        final /* synthetic */ C83751e f186958a;

        static {
            Covode.recordClassIndex(97646);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83756ad(C83751e eVar) {
            super(0);
            this.f186958a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C83782f invoke() {
            C2560h<Boolean> hVar;
            C2560h<Boolean> hVar2;
            C2560h<ScaleGestureDetector> hVar3;
            AbstractC14177d g = this.f186958a.mo128727g();
            AbstractC74227m h = this.f186958a.mo128728h();
            ShortVideoContext i = this.f186958a.mo128729i();
            C2564l<Long> lVar = this.f186958a.f186931d;
            C2564l<Boolean> lVar2 = this.f186958a.f186932e;
            C2564l<C89378p<List<TimeSpeedModelExtension>, Long>> lVar3 = this.f186958a.f186934g;
            C2564l<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> lVar4 = this.f186958a.f186935h;
            C2564l<Integer> lVar5 = this.f186958a.f186939l;
            C2564l<RetakeVideoContext> lVar6 = this.f186958a.f186940m;
            C2564l<C89378p<List<TimeSpeedModelExtension>, Long>> lVar7 = this.f186958a.f186941n;
            C2564l<C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension>> lVar8 = this.f186958a.f186942o;
            C2564l<Boolean> lVar9 = this.f186958a.f186933f;
            AbstractC71864a e = this.f186958a.mo128724e();
            C2560h<VideoRecordGestureLayout.AbstractC14312a> hVar4 = null;
            if (e != null) {
                hVar = e.mo113515d();
            } else {
                hVar = null;
            }
            AbstractC71864a e2 = this.f186958a.mo128724e();
            if (e2 != null) {
                hVar2 = e2.mo113513c();
            } else {
                hVar2 = null;
            }
            AbstractC14315b bVar = this.f186958a.f186943p;
            if (bVar != null) {
                hVar3 = bVar.mo23102d();
            } else {
                hVar3 = null;
            }
            AbstractC14315b bVar2 = this.f186958a.f186943p;
            if (bVar2 != null) {
                hVar4 = bVar2.mo23101c();
            }
            return new C83782f(g, h, i, lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, hVar, hVar2, hVar3, hVar4, this.f186958a.f186936i, this.f186958a.f186937j, this.f186958a.f186938k);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0194, code lost:
        if (r2 == null) goto L_0x0196;
     */
    @Override // com.bytedance.als.AbstractC2562j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate() {
        /*
        // Method dump skipped, instructions count: 721
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.recorder.p4304k.C83751e.onCreate():void");
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$ac */
    static final class C83755ac<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186957a;

        static {
            Covode.recordClassIndex(97645);
        }

        C83755ac(C83751e eVar) {
            this.f186957a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f186957a.mo128723c(8);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$g */
    static final class C83762g<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186964a;

        static {
            Covode.recordClassIndex(97652);
        }

        C83762g(C83751e eVar) {
            this.f186964a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f186964a.f186932e.mo7019b(obj);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$p */
    static final class C83771p<T> implements AbstractC2565m {

        /* renamed from: a */
        public static final C83771p f186973a = new C83771p();

        static {
            Covode.recordClassIndex(97661);
        }

        C83771p() {
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C80461fw.m139466a("tool_record_start");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$f */
    static final class C83761f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186963a;

        static {
            Covode.recordClassIndex(97651);
        }

        C83761f(C83751e eVar) {
            this.f186963a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f186963a.f186931d.mo7019b(Long.valueOf(((C14190j) obj).f34464a));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$l */
    static final class C83767l<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186969a;

        static {
            Covode.recordClassIndex(97657);
        }

        C83767l(C83751e eVar) {
            this.f186969a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C14192l lVar = (C14192l) obj;
            if (!lVar.f34467a) {
                this.f186969a.mo128718c(lVar.f34468b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$v */
    static final class C83777v<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186979a;

        static {
            Covode.recordClassIndex(97667);
        }

        C83777v(C83751e eVar) {
            this.f186979a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f186979a.mo128730j().mo128735a(false);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a
    /* renamed from: a */
    public final void mo128711a(int i) {
        this.f186939l.mo7019b(Integer.valueOf(i));
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a
    /* renamed from: b */
    public final void mo128716b(boolean z) {
        this.f186948u.mo7019b(Boolean.valueOf(z));
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a
    /* renamed from: c */
    public final void mo128718c(boolean z) {
        this.f186949v.mo7019b(Boolean.valueOf(z));
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83750d
    /* renamed from: d */
    public final void mo128720d(boolean z) {
        this.f186946s = z;
        mo128730j().mo128735a(z);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$ab */
    static final class C83754ab<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186956a;

        static {
            Covode.recordClassIndex(97644);
        }

        C83754ab(C83751e eVar) {
            this.f186956a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f186956a.mo128729i().f155817b.mo109899k() <= ((long) this.f186956a.f186945r)) {
                C0004a.m3a(EnumC0044d.TT_15S_CAPTURE_START, EnumC0065f.END);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$d */
    static final class C83759d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186961a;

        static {
            Covode.recordClassIndex(97649);
        }

        C83759d(C83751e eVar) {
            this.f186961a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C83751e eVar = this.f186961a;
            C89219l.m154716b(bool, "");
            eVar.f186933f.mo7019b(Boolean.valueOf(bool.booleanValue()));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$h */
    static final class C83763h<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186965a;

        static {
            Covode.recordClassIndex(97653);
        }

        C83763h(C83751e eVar) {
            this.f186965a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f186965a.mo128723c(4);
            this.f186965a.mo128722b(4);
            this.f186965a.mo128721a(0, (TimeSpeedModelExtension) null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$i */
    static final class C83764i<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186966a;

        static {
            Covode.recordClassIndex(97654);
        }

        C83764i(C83751e eVar) {
            this.f186966a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                bool.booleanValue();
                if (bool.booleanValue()) {
                    bool.booleanValue();
                    this.f186966a.mo128728h().mo22890b(true);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$m */
    static final class C83768m<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186970a;

        static {
            Covode.recordClassIndex(97658);
        }

        C83768m(C83751e eVar) {
            this.f186970a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f186970a.mo128729i().f155817b.f155653i) {
                this.f186970a.mo128711a(2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$n */
    static final class C83769n<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186971a;

        static {
            Covode.recordClassIndex(97659);
        }

        C83769n(C83751e eVar) {
            this.f186971a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f186971a.mo128729i().f155817b.f155653i) {
                this.f186971a.mo128711a(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$q */
    static final class C83772q<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186974a;

        static {
            Covode.recordClassIndex(97662);
        }

        C83772q(C83751e eVar) {
            this.f186974a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C83751e eVar = this.f186974a;
            C89219l.m154716b(bool, "");
            eVar.mo128725e(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$r */
    static final class C83773r<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186975a;

        static {
            Covode.recordClassIndex(97663);
        }

        C83773r(C83751e eVar) {
            this.f186975a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f186975a.f186937j.mo6996a() != null) {
                C83751e eVar = this.f186975a;
                eVar.mo128725e(C89219l.m154714a((Object) eVar.f186937j.mo6996a(), (Object) true));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$z */
    static final class C83781z<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186983a;

        static {
            Covode.recordClassIndex(97671);
        }

        C83781z(C83751e eVar) {
            this.f186983a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f186983a.mo128718c(true);
            this.f186983a.mo128710a();
            this.f186983a.mo128719d();
            this.f186983a.mo128717c();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$aa */
    static final class C83753aa<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186955a;

        static {
            Covode.recordClassIndex(97643);
        }

        C83753aa(C83751e eVar) {
            this.f186955a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f186955a.mo128729i().f155763X != 15) {
                this.f186955a.mo128715b();
                this.f186955a.mo128718c(true);
                if (this.f186955a.mo128729i().f155817b.mo109896h() > 0) {
                    this.f186955a.mo128722b(0);
                    this.f186955a.mo128723c(0);
                    this.f186955a.mo128731k();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$c */
    static final class C83758c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186960a;

        static {
            Covode.recordClassIndex(97648);
        }

        C83758c(C83751e eVar) {
            this.f186960a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C83719b bVar = new C83719b();
            int i = this.f186960a.mo128729i().f155763X;
            int i2 = 1;
            if (i != 2) {
                if (i == 10 || i == 11 || i == 14) {
                    i2 = 0;
                } else if (i != 15) {
                    i2 = -1;
                }
            }
            bVar.f186867a.storeInt("story_lightening_tab_when_leave", i2);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$e */
    static final class C83760e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186962a;

        static {
            Covode.recordClassIndex(97650);
        }

        C83760e(C83751e eVar) {
            this.f186962a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f186962a.mo128729i().f155817b.f155653i) {
                this.f186962a.mo128711a(1);
            }
            if (this.f186962a.mo128729i().f155817b.mo109899k() <= ((long) this.f186962a.f186945r)) {
                C0004a.m3a(EnumC0044d.TT_15S_CAPTURE_START, EnumC0065f.BEGIN);
            }
            C80461fw.m139467a("tool_record_start", C65360bc.m117058b(), (long) C65360bc.m117059c());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$s */
    static final class C83774s<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186976a;

        static {
            Covode.recordClassIndex(97664);
        }

        C83774s(C83751e eVar) {
            this.f186976a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C14207x xVar = (C14207x) obj;
            C89219l.m154716b(xVar, "");
            if (xVar.f34487c && this.f186976a.mo128729i().f155763X == 15) {
                this.f186976a.mo128728h().mo22880a(new C78600h("stop_record"));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$t */
    static final class C83775t<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186977a;

        static {
            Covode.recordClassIndex(97665);
        }

        C83775t(C83751e eVar) {
            this.f186977a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (!this.f186977a.mo128729i().f155817b.f155653i) {
                if (this.f186977a.f186946s) {
                    this.f186977a.mo128730j().mo128735a(true);
                }
                if (!this.f186977a.mo128729i().mo110022c()) {
                    this.f186977a.mo128730j().mo128732a();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo128722b(int i) {
        ImageView imageView = mo128730j().f187010f;
        if (imageView == null) {
            C89219l.m154710a("goNextButton");
        }
        imageView.setVisibility(i);
    }

    /* renamed from: c */
    public final void mo128723c(int i) {
        View view = mo128730j().f187009e;
        if (view == null) {
            C89219l.m154710a("deleteLast");
        }
        view.setVisibility(i);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$b */
    static final class C83757b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186959a;

        static {
            Covode.recordClassIndex(97647);
        }

        C83757b(C83751e eVar) {
            this.f186959a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C89386u uVar = (C89386u) obj;
            if ((((Number) uVar.getFirst()).intValue() == 12346 || ((Number) uVar.getFirst()).intValue() == 12345) && this.f186959a.mo128729i().f155763X == 15 && -1 == ((Number) uVar.getSecond()).intValue()) {
                C73991bj.m130133d("record remove segment, impl");
                C83751e eVar = this.f186959a;
                eVar.mo128712a(3, false);
                eVar.mo128730j().f187018u = true;
                eVar.mo128728h().mo22893c(true);
                AbstractC74227m h = eVar.mo128728h();
                C14207x xVar = new C14207x("reset progress");
                xVar.f34485a = 3;
                C89219l.m154716b(xVar, "");
                h.mo22879a(xVar);
                RecordContext recordContext = eVar.mo128729i().f155817b.f155642G;
                recordContext.f155724a.reset();
                recordContext.f155725b.reset();
                recordContext.f155726c.reset();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$j */
    static final class C83765j<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186967a;

        static {
            Covode.recordClassIndex(97655);
        }

        C83765j(C83751e eVar) {
            this.f186967a = eVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.h.d */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                if (this.f186967a.mo128726f() != null) {
                    AbstractC83406b f = this.f186967a.mo128726f();
                    if (f == null) {
                        C89219l.m154715b();
                    }
                    String currentBottomTag = f.getCurrentBottomTag();
                    C83751e eVar = this.f186967a;
                    if (!(!C89219l.m154714a((Object) currentBottomTag, (Object) ((ActivityC0945e) eVar.f186944q.mo23374a(eVar, C83751e.f186922b[5])).getString(R.string.f7u)))) {
                        return;
                    }
                }
                this.f186967a.mo128714a(true);
                return;
            }
            this.f186967a.mo128714a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$k */
    static final class C83766k<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186968a;

        static {
            Covode.recordClassIndex(97656);
        }

        C83766k(C83751e eVar) {
            this.f186968a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C14191k kVar = (C14191k) obj;
            if (kVar.f34466b) {
                C83782f j = this.f186968a.mo128730j();
                if (j.f187017t != null) {
                    FrameLayout frameLayout = j.f187017t;
                    if (frameLayout == null) {
                        C89219l.m154710a("colorSchemeLayout");
                    }
                    frameLayout.post(new C83782f.RunnableC83808z(j));
                }
            }
            C83782f j2 = this.f186968a.mo128730j();
            Animation animation = kVar.f34465a;
            C89219l.m154721d(animation, "");
            LighteningRecordLayout lighteningRecordLayout = j2.f187008d;
            if (lighteningRecordLayout == null) {
                C89219l.m154710a("recordLayout");
            }
            C13628n.m24519a(lighteningRecordLayout);
            LighteningRecordLayout lighteningRecordLayout2 = j2.f187008d;
            if (lighteningRecordLayout2 == null) {
                C89219l.m154710a("recordLayout");
            }
            lighteningRecordLayout2.startAnimation(animation);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$o */
    static final class C83770o<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186972a;

        static {
            Covode.recordClassIndex(97660);
        }

        C83770o(C83751e eVar) {
            this.f186972a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                if (!this.f186972a.f186947t.mo36422g(this.f186972a.mo128730j())) {
                    this.f186972a.f186947t.mo36417e(this.f186972a.mo128730j());
                }
            } else if (this.f186972a.f186947t.mo36422g(this.f186972a.mo128730j())) {
                this.f186972a.f186947t.mo36413d(this.f186972a.mo128730j());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$u */
    static final class C83776u<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186978a;

        static {
            Covode.recordClassIndex(97666);
        }

        C83776u(C83751e eVar) {
            this.f186978a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f186978a.mo128729i().f155817b.mo109896h() == 0 && !this.f186978a.mo128729i().f155817b.f155653i) {
                if (this.f186978a.f186946s) {
                    this.f186978a.mo128730j().mo128735a(true);
                }
                if (!this.f186978a.mo128729i().mo110022c()) {
                    this.f186978a.mo128730j().mo128732a();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$x */
    static final class C83779x<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186981a;

        static {
            Covode.recordClassIndex(97669);
        }

        C83779x(C83751e eVar) {
            this.f186981a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            AbstractC71864a e = this.f186981a.mo128724e();
            if ((e == null || !e.mo113519g()) && (!this.f186981a.mo128729i().f155778aL || !this.f186981a.mo128729i().f155752M)) {
                C83751e eVar = this.f186981a;
                C89219l.m154716b(bool, "");
                eVar.mo128716b(bool.booleanValue());
            } else {
                this.f186981a.mo128716b(false);
            }
            C83751e eVar2 = this.f186981a;
            C89219l.m154716b(bool, "");
            eVar2.mo128718c(bool.booleanValue());
        }
    }

    /* renamed from: e */
    public final void mo128725e(boolean z) {
        AbstractC83881a aVar = (AbstractC83881a) getDiContainer().mo35252b(AbstractC83881a.class, null);
        AbstractC83869f fVar = (AbstractC83869f) getDiContainer().mo35252b(AbstractC83869f.class, null);
        if (z) {
            if (aVar != null && aVar.mo123014e()) {
                aVar.mo123010b(-C71812ep.m126783a(42.0d, C63247i.f143610a));
                if (fVar != null) {
                    fVar.mo128758a(-C71812ep.m126783a(54.0d, C63247i.f143610a));
                }
            } else if (fVar != null) {
                fVar.mo128758a(-C71812ep.m126783a(28.0d, C63247i.f143610a));
            }
        } else if (aVar != null && aVar.mo123014e()) {
            aVar.mo123010b(0);
            if (fVar != null) {
                fVar.mo128758a(-C71812ep.m126783a(20.0d, C63247i.f143610a));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$w */
    static final class C83778w<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186980a;

        static {
            Covode.recordClassIndex(97668);
        }

        C83778w(C83751e eVar) {
            this.f186980a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (this.f186980a.mo128729i().f155763X != 15) {
                C89219l.m154716b(bool, "");
                if (!bool.booleanValue()) {
                    this.f186980a.mo128723c(8);
                    this.f186980a.mo128722b(8);
                } else if (this.f186980a.mo128729i().f155817b.mo109896h() > 0) {
                    this.f186980a.mo128723c(0);
                    this.f186980a.mo128731k();
                    this.f186980a.mo128722b(0);
                } else {
                    this.f186980a.mo128723c(8);
                    this.f186980a.mo128722b(8);
                }
                if ((this.f186980a.mo128729i().f155817b.mo109889b() || this.f186980a.mo128729i().f155817b.mo109890c()) && !bool.booleanValue()) {
                    this.f186980a.mo128723c(4);
                    this.f186980a.mo128722b(4);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a
    /* renamed from: a */
    public final void mo128713a(RetakeVideoContext retakeVideoContext) {
        C89219l.m154721d(retakeVideoContext, "");
        this.f186940m.mo7019b(retakeVideoContext);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.k.e$y */
    static final class C83780y<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83751e f186982a;

        static {
            Covode.recordClassIndex(97670);
        }

        C83780y(C83751e eVar) {
            this.f186982a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            long a;
            boolean z;
            C14201t tVar = (C14201t) obj;
            if (tVar != null) {
                C83751e eVar = this.f186982a;
                if (tVar.f34478c != null) {
                    if (eVar.mo128729i().f155817b.f155653i) {
                        C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension> uVar = new C89386u<>(tVar.f34476a, Long.valueOf(tVar.f34477b), tVar.f34478c);
                        C89219l.m154721d(uVar, "");
                        eVar.f186942o.mo7019b(uVar);
                    } else {
                        C89386u<List<TimeSpeedModelExtension>, Long, TimeSpeedModelExtension> uVar2 = new C89386u<>(tVar.f34476a, Long.valueOf(tVar.f34477b), tVar.f34478c);
                        C89219l.m154721d(uVar2, "");
                        eVar.f186935h.mo7019b(uVar2);
                    }
                } else if (eVar.mo128729i().f155817b.f155653i) {
                    C89378p<List<TimeSpeedModelExtension>, Long> pVar = new C89378p<>(tVar.f34476a, Long.valueOf(tVar.f34477b));
                    C89219l.m154721d(pVar, "");
                    eVar.f186941n.mo7019b(pVar);
                } else {
                    C89378p<List<TimeSpeedModelExtension>, Long> pVar2 = new C89378p<>(tVar.f34476a, Long.valueOf(tVar.f34477b));
                    C89219l.m154721d(pVar2, "");
                    eVar.f186934g.mo7019b(pVar2);
                }
                this.f186982a.mo128721a(tVar.f34477b, tVar.f34478c);
                if (this.f186982a.mo128729i().f155763X != 15) {
                    long j = tVar.f34477b;
                    C83751e eVar2 = this.f186982a;
                    if (eVar2.mo128729i().mo110022c()) {
                        a = 3000;
                    } else if (eVar2.mo128729i().f155817b.mo109890c()) {
                        a = eVar2.mo128729i().f155817b.f155646b;
                    } else if (eVar2.mo128729i().f155817b.f155653i) {
                        a = eVar2.mo128729i().f155817b.f155655k;
                    } else {
                        a = C70637di.m124840a();
                    }
                    if (j >= a) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ImageView imageView = this.f186982a.mo128730j().f187010f;
                    if (imageView == null) {
                        C89219l.m154710a("goNextButton");
                    }
                    imageView.setSelected(z);
                    int i = 4;
                    if (!tVar.f34476a.isEmpty() || tVar.f34477b != 0) {
                        C83751e eVar3 = this.f186982a;
                        if (z) {
                            i = 0;
                        }
                        eVar3.mo128722b(i);
                        T value = this.f186982a.mo128728h().mo22891c().f7727a.getValue();
                        C89219l.m154716b(value, "");
                        if (value.booleanValue()) {
                            this.f186982a.mo128723c(0);
                            this.f186982a.mo128731k();
                            this.f186982a.mo128722b(0);
                            return;
                        }
                        return;
                    }
                    this.f186982a.mo128723c(4);
                    this.f186982a.mo128722b(4);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a
    /* renamed from: a */
    public final void mo128714a(boolean z) {
        LighteningRecordLayout lighteningRecordLayout = mo128730j().f187008d;
        if (lighteningRecordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        lighteningRecordLayout.setEnabled(z);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a
    /* renamed from: a */
    public final void mo128712a(int i, boolean z) {
        LighteningRecordLayout lighteningRecordLayout = mo128730j().f187008d;
        if (lighteningRecordLayout == null) {
            C89219l.m154710a("recordLayout");
        }
        lighteningRecordLayout.mo116749a(i, z);
    }

    /* renamed from: a */
    public final void mo128721a(long j, TimeSpeedModelExtension timeSpeedModelExtension) {
        int i;
        if (!mo128729i().mo110022c() || (timeSpeedModelExtension == null && (timeSpeedModelExtension = mo128729i().f155743D.f155847b) == null)) {
            i = 0;
        } else {
            i = timeSpeedModelExtension.getDuration();
        }
        this.f186936i.mo7019b(Long.valueOf(j + ((long) i)));
    }

    public C83751e(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f186928F = fVar;
        this.f186947t = bVar;
    }
}
