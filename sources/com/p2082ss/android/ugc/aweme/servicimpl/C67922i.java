package com.p2082ss.android.ugc.aweme.servicimpl;

import androidx.lifecycle.AbstractC1196i;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.gamora.p4272a.C82004a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83467k;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.C83409d;
import com.p2082ss.android.ugc.gamora.recorder.p4305l.AbstractC83869f;
import com.p2082ss.android.ugc.gamora.recorder.p4306m.AbstractC83881a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.i */
public final class C67922i implements AbstractC21566a, AbstractC83405a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f152140a = {new C89232y(C67922i.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new C89232y(C67922i.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0), new C89232y(C67922i.class, "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/gamora/recorder/speed/SpeedApiComponent;", 0), new C89232y(C67922i.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0)};

    /* renamed from: d */
    public static final C67923a f152141d = new C67923a((byte) 0);

    /* renamed from: b */
    final AbstractC89248d f152142b = C21572a.m40505b(getDiContainer(), AbstractC83869f.class);

    /* renamed from: c */
    final AbstractC89248d f152143c = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);

    /* renamed from: e */
    private final AbstractC89248d f152144e = C21572a.m40504a(getDiContainer(), AbstractC83406b.class);

    /* renamed from: f */
    private final AbstractC89248d f152145f = C21572a.m40505b(getDiContainer(), AbstractC83881a.class);

    /* renamed from: g */
    private final String f152146g;

    /* renamed from: h */
    private final String f152147h;

    /* renamed from: i */
    private final String f152148i;

    /* renamed from: j */
    private final boolean f152149j;

    /* renamed from: k */
    private final C21582f f152150k;

    static {
        Covode.recordClassIndex(80091);
    }

    /* renamed from: a */
    public final AbstractC83406b mo108516a() {
        return (AbstractC83406b) this.f152144e.mo23374a(this, f152140a[0]);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a
    public final void initialize(C82004a aVar) {
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a
    public final AbstractC83467k provideScene() {
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.i$a */
    public static final class C67923a {
        static {
            Covode.recordClassIndex(80092);
        }

        private C67923a() {
        }

        public /* synthetic */ C67923a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f152150k;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a
    public final C83409d createBottomTabItem(C82004a aVar) {
        C89219l.m154721d(aVar, "");
        return new C83409d(this.f152146g, this.f152147h, this.f152148i, this.f152149j, new C67924b(this, aVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.i$b */
    public static final class C67924b implements AbstractC83468l {

        /* renamed from: a */
        final /* synthetic */ C67922i f152151a;

        /* renamed from: b */
        final /* synthetic */ C82004a f152152b;

        static {
            Covode.recordClassIndex(80093);
        }

        C67924b(C67922i iVar, C82004a aVar) {
            this.f152151a = iVar;
            this.f152152b = aVar;
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l
        public final boolean onTabUnselected(C83409d dVar, AbstractC83468l.C83469a aVar) {
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(aVar, "");
            this.f152151a.mo108516a().showComplexTab(8, aVar.f186419c);
            return false;
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l
        public final boolean onTabSelected(C83409d dVar, AbstractC83468l.C83469a aVar) {
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(aVar, "");
            AbstractC1196i lifecycle = this.f152152b.mo127169a().getLifecycle();
            C89219l.m154716b(lifecycle, "");
            if (lifecycle.mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.STARTED)) {
                C67922i iVar = this.f152151a;
                ((AbstractC14177d) iVar.f152143c.mo23374a(iVar, C67922i.f152140a[3])).mo22740a(false, PrivacyCert.Builder.Companion.with("bpea-284").usage("When users are on the video shooting page, they can use the camera and microphone to create video works in TikTok. ").tag("").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            }
            C67922i iVar2 = this.f152151a;
            AbstractC83869f fVar = (AbstractC83869f) iVar2.f152142b.mo23374a(iVar2, C67922i.f152140a[2]);
            if (fVar != null) {
                fVar.mo128758a(-this.f152152b.mo127169a().getResources().getDimensionPixelOffset(R.dimen.cr));
            }
            this.f152151a.mo108516a().showComplexTab(0, aVar.f186419c);
            return true;
        }
    }

    public C67922i(String str, String str2, String str3, boolean z, C21582f fVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(fVar, "");
        this.f152146g = str;
        this.f152147h = str2;
        this.f152148i = str3;
        this.f152149j = z;
        this.f152150k = fVar;
    }
}
