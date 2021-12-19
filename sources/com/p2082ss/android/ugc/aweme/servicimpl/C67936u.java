package com.p2082ss.android.ugc.aweme.servicimpl;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.aweme.p4244z.AbstractC81785a;
import com.p2082ss.android.ugc.aweme.shortvideo.C70628da;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.p3833f.C71833a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.creationflow.C73592c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74172g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74228n;
import com.p2082ss.android.ugc.aweme.tools.C78610l;
import com.p2082ss.android.ugc.gamora.p4272a.C82004a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.AbstractC83492a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83467k;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.C83409d;
import com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83750d;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.u */
public final class C67936u implements AbstractC21566a, AbstractC83405a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f152184a = {new C89232y(C67936u.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C89232y(C67936u.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new C89232y(C67936u.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/LighteningControlProgressApiComponent;", 0), new C89232y(C67936u.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C67936u.class, "commentStickerComponent", "getCommentStickerComponent()Lcom/ss/android/ugc/aweme/comment_sticker/CommentStickerComponent;", 0), new C89232y(C67936u.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0)};

    /* renamed from: f */
    public static final C67937a f152185f = new C67937a((byte) 0);

    /* renamed from: b */
    final AbstractC89248d f152186b;

    /* renamed from: c */
    final AbstractC89248d f152187c;

    /* renamed from: d */
    final AbstractC89248d f152188d;

    /* renamed from: e */
    public final boolean f152189e;

    /* renamed from: g */
    private final AbstractC89248d f152190g;

    /* renamed from: h */
    private final AbstractC89248d f152191h;

    /* renamed from: i */
    private final AbstractC89248d f152192i;

    /* renamed from: j */
    private final AbstractC83492a f152193j;

    /* renamed from: k */
    private final AbstractC84089j f152194k;

    /* renamed from: l */
    private final String f152195l;

    /* renamed from: m */
    private final String f152196m;

    /* renamed from: n */
    private final String f152197n;

    /* renamed from: o */
    private final boolean f152198o = true;

    /* renamed from: p */
    private final C21582f f152199p;

    static {
        Covode.recordClassIndex(80105);
    }

    /* renamed from: a */
    public final AbstractC14193m mo108519a() {
        return (AbstractC14193m) this.f152190g.mo23374a(this, f152184a[0]);
    }

    /* renamed from: b */
    public final AbstractC83750d mo108520b() {
        return (AbstractC83750d) this.f152191h.mo23374a(this, f152184a[2]);
    }

    /* renamed from: c */
    public final AbstractC14177d mo108521c() {
        return (AbstractC14177d) this.f152192i.mo23374a(this, f152184a[3]);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a
    public final AbstractC83467k provideScene() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.u$a */
    public static final class C67937a {
        static {
            Covode.recordClassIndex(80106);
        }

        private C67937a() {
        }

        public /* synthetic */ C67937a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f152199p;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a
    public final C83409d createBottomTabItem(C82004a aVar) {
        C89219l.m154721d(aVar, "");
        return new C83409d(this.f152195l, this.f152196m, this.f152197n, this.f152198o, new C67938b(this, aVar));
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a
    public final void initialize(C82004a aVar) {
        C89219l.m154721d(aVar, "");
        mo108519a().mo22884a(C70628da.class, new C67925j((ActivityC0945e) getDiContainer().mo35247a(ActivityC0945e.class), (AbstractC14209z) getDiContainer().mo35247a(AbstractC14209z.class), (C74172g) getDiContainer().mo35247a(C74228n.class), aVar.mo127181b(), (C73592c) getDiContainer().mo35247a(C73592c.class), (AbstractC84089j) getDiContainer().mo35247a(AbstractC84089j.class), aVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.u$b */
    public static final class C67938b implements AbstractC83468l {

        /* renamed from: a */
        final /* synthetic */ C67936u f152200a;

        /* renamed from: b */
        final /* synthetic */ C82004a f152201b;

        static {
            Covode.recordClassIndex(80107);
        }

        C67938b(C67936u uVar, C82004a aVar) {
            this.f152200a = uVar;
            this.f152201b = aVar;
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l
        public final boolean onTabUnselected(C83409d dVar, AbstractC83468l.C83469a aVar) {
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(aVar, "");
            this.f152200a.mo108520b().mo128720d(false);
            return false;
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l
        public final boolean onTabSelected(C83409d dVar, AbstractC83468l.C83469a aVar) {
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(aVar, "");
            if (this.f152200a.f152189e) {
                AbstractC1196i lifecycle = this.f152201b.mo127169a().getLifecycle();
                C89219l.m154716b(lifecycle, "");
                if (lifecycle.mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.STARTED)) {
                    this.f152200a.mo108521c().mo22740a(false, PrivacyCert.Builder.Companion.with("bpea-286").usage("When users are on the video shooting page, they can use the camera and microphone to create video works in TikTok. ").tag("").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
                }
            }
            this.f152201b.mo127186g().mo22650a("record");
            this.f152200a.mo108519a().mo22882a(C70628da.class);
            this.f152201b.mo127181b().f155763X = 15;
            C67936u uVar = this.f152200a;
            ((AbstractC71864a) uVar.f152186b.mo23374a(uVar, C67936u.f152184a[1])).mo113512b(true);
            AbstractC83750d b = this.f152200a.mo108520b();
            b.mo128715b();
            b.mo128712a(3, false);
            b.mo128716b(true);
            b.mo128720d(true);
            this.f152200a.mo108521c().mo22777a(0);
            C67936u uVar2 = this.f152200a;
            ShortVideoContext b2 = this.f152201b.mo127181b();
            boolean z = aVar.f186422f;
            if (!b2.f155817b.mo109889b() && !b2.f155817b.mo109890c()) {
                C78610l lVar = new C78610l(true, true);
                lVar.f176652e = z;
                lVar.f176651d = 2;
                lVar.f176653f = false;
                ((AbstractC83406b) uVar2.f152188d.mo23374a(uVar2, C67936u.f152184a[5])).configSwitchDuration(lVar);
            }
            C71833a.m126852b(15);
            C67936u uVar3 = this.f152200a;
            AbstractC81785a aVar2 = (AbstractC81785a) uVar3.f152187c.mo23374a(uVar3, C67936u.f152184a[4]);
            if (aVar2 != null) {
                aVar2.mo125490a(true);
            }
            return true;
        }
    }

    public C67936u(String str, String str2, String str3, boolean z, C21582f fVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(fVar, "");
        this.f152195l = str;
        this.f152196m = str2;
        this.f152197n = str3;
        this.f152189e = z;
        this.f152199p = fVar;
        this.f152190g = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);
        this.f152186b = C21572a.m40504a(getDiContainer(), AbstractC71864a.class);
        this.f152191h = C21572a.m40504a(getDiContainer(), AbstractC83750d.class);
        this.f152192i = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);
        this.f152187c = C21572a.m40505b(getDiContainer(), AbstractC81785a.class);
        this.f152188d = C21572a.m40504a(getDiContainer(), AbstractC83406b.class);
        this.f152193j = (AbstractC83492a) getDiContainer().mo35252b(AbstractC83492a.class, null);
        this.f152194k = (AbstractC84089j) getDiContainer().mo35252b(AbstractC84089j.class, null);
    }
}
