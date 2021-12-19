package com.p2082ss.android.ugc.aweme.servicimpl;

import androidx.lifecycle.AbstractC1196i;
import com.bytedance.bpea.basics.C13349j;
import com.bytedance.bpea.basics.C13350k;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.p878a.C13401b;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.aweme.p4244z.AbstractC81785a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C69797ae;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.p3833f.C71833a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.shortvideo.record.p3857b.C72782a;
import com.p2082ss.android.ugc.aweme.tools.C78610l;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.gamora.p4272a.C82004a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.AbstractC83492a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83467k;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.C83409d;
import com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a;
import com.p2082ss.android.ugc.gamora.recorder.p4305l.AbstractC83869f;
import com.p2082ss.android.ugc.gamora.recorder.p4306m.C83891d;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.d */
public final class C67907d implements AbstractC21566a, AbstractC83405a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f152099a = {new C89232y(C67907d.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new C89232y(C67907d.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0), new C89232y(C67907d.class, "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/gamora/recorder/speed/SpeedApiComponent;", 0), new C89232y(C67907d.class, "chooseMusicApiComponent", "getChooseMusicApiComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/ChooseMusicApiComponent;", 0), new C89232y(C67907d.class, "commentStickerComponent", "getCommentStickerComponent()Lcom/ss/android/ugc/aweme/comment_sticker/CommentStickerComponent;", 0), new C89232y(C67907d.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0)};

    /* renamed from: b */
    public AbstractC14177d f152100b;

    /* renamed from: c */
    final AbstractC89248d f152101c = C21572a.m40504a(getDiContainer(), AbstractC71864a.class);

    /* renamed from: d */
    final AbstractC89248d f152102d = C21572a.m40504a(getDiContainer(), AbstractC83490a.class);

    /* renamed from: e */
    final AbstractC89248d f152103e = C21572a.m40504a(getDiContainer(), AbstractC81785a.class);

    /* renamed from: f */
    final AbstractC89248d f152104f = C21572a.m40504a(getDiContainer(), AbstractC83406b.class);

    /* renamed from: g */
    public final AbstractC83492a f152105g = ((AbstractC83492a) getDiContainer().mo35252b(AbstractC83492a.class, null));

    /* renamed from: h */
    public final AbstractC84089j f152106h = ((AbstractC84089j) getDiContainer().mo35252b(AbstractC84089j.class, null));

    /* renamed from: i */
    private final AbstractC89248d f152107i = C21572a.m40504a(getDiContainer(), AbstractC83746a.class);

    /* renamed from: j */
    private final AbstractC89248d f152108j = C21572a.m40504a(getDiContainer(), AbstractC83869f.class);

    /* renamed from: k */
    private final String f152109k;

    /* renamed from: l */
    private final String f152110l;

    /* renamed from: m */
    private final String f152111m;

    /* renamed from: n */
    private final boolean f152112n;

    /* renamed from: o */
    private final C21582f f152113o;

    static {
        Covode.recordClassIndex(80076);
    }

    /* renamed from: a */
    public final AbstractC83746a mo108508a() {
        return (AbstractC83746a) this.f152107i.mo23374a(this, f152099a[1]);
    }

    /* renamed from: b */
    public final AbstractC83869f mo108509b() {
        return (AbstractC83869f) this.f152108j.mo23374a(this, f152099a[2]);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a
    public final AbstractC83467k provideScene() {
        return null;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f152113o;
    }

    /* renamed from: a */
    public static final /* synthetic */ AbstractC14177d m120169a(C67907d dVar) {
        AbstractC14177d dVar2 = dVar.f152100b;
        if (dVar2 == null) {
            C89219l.m154710a("cameraApiComponent");
        }
        return dVar2;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a
    public final void initialize(C82004a aVar) {
        C89219l.m154721d(aVar, "");
        this.f152100b = aVar.mo127183d();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a
    public final C83409d createBottomTabItem(C82004a aVar) {
        C89219l.m154721d(aVar, "");
        return new C83409d(this.f152109k, this.f152110l, this.f152111m, this.f152112n, new C67908a(this, aVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.d$a */
    public static final class C67908a implements AbstractC83468l {

        /* renamed from: a */
        final /* synthetic */ C67907d f152114a;

        /* renamed from: b */
        final /* synthetic */ C82004a f152115b;

        static {
            Covode.recordClassIndex(80077);
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l
        public final boolean onTabUnselected(C83409d dVar, AbstractC83468l.C83469a aVar) {
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(aVar, "");
            return false;
        }

        C67908a(C67907d dVar, C82004a aVar) {
            this.f152114a = dVar;
            this.f152115b = aVar;
        }

        @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l
        public final boolean onTabSelected(C83409d dVar, AbstractC83468l.C83469a aVar) {
            C89219l.m154721d(dVar, "");
            C89219l.m154721d(aVar, "");
            this.f152115b.mo127186g().mo22650a("record");
            int a = C69797ae.m123321a(dVar.f186283c);
            this.f152115b.mo127181b().f155763X = a;
            AbstractC1196i lifecycle = this.f152115b.mo127169a().getLifecycle();
            C89219l.m154716b(lifecycle, "");
            if (lifecycle.mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.STARTED)) {
                C67907d.m120169a(this.f152114a).mo22740a(false, new PrivacyCert(new C13349j("1016"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()}));
            }
            C67907d dVar2 = this.f152114a;
            ((AbstractC71864a) dVar2.f152101c.mo23374a(dVar2, C67907d.f152099a[0])).mo113512b(aVar.f186420d);
            AbstractC83746a a2 = this.f152114a.mo108508a();
            a2.mo128715b();
            a2.mo128712a(3, false);
            C67907d.m120169a(this.f152114a).mo22777a(0);
            this.f152114a.mo108508a().mo128716b(true);
            if (this.f152114a.mo108509b().mo128763d()) {
                this.f152114a.mo108509b().mo128761b(true);
            }
            if (C63244g.m114602a().mo73284l().shouldDropCurrentMusicFor3min(dVar.f186283c, this.f152115b.mo127181b())) {
                C67907d dVar3 = this.f152114a;
                ((AbstractC83490a) dVar3.f152102d.mo23374a(dVar3, C67907d.f152099a[3])).clearMusic();
                new C79459a(this.f152115b.mo127169a()).mo123050a(R.string.czl).mo123053a();
            }
            String str = dVar.f186283c;
            ShortVideoContext b = this.f152115b.mo127181b();
            boolean z = aVar.f186422f;
            if ((C89219l.m154714a((Object) C69797ae.m123322a(), (Object) str) || C89219l.m154714a((Object) C69797ae.f155980a, (Object) str) || (C83891d.m144285c() && C89219l.m154714a((Object) C69797ae.f155981b, (Object) str))) && !b.f155817b.mo109889b() && !b.f155817b.mo109890c()) {
                C78610l lVar = new C78610l(C89219l.m154714a((Object) C69797ae.f155980a, (Object) str), true);
                lVar.f176650c = C89219l.m154714a((Object) str, (Object) C69797ae.f155982c);
                lVar.f176652e = z;
                lVar.f176651d = 2;
                C67907d dVar4 = this.f152114a;
                ((AbstractC83406b) dVar4.f152104f.mo23374a(dVar4, C67907d.f152099a[5])).configSwitchDuration(lVar);
            }
            C82004a aVar2 = this.f152115b;
            String str2 = dVar.f186283c;
            ShortVideoContext b2 = this.f152115b.mo127181b();
            if ((C89219l.m154714a((Object) C69797ae.m123322a(), (Object) str2) || C89219l.m154714a((Object) C69797ae.f155980a, (Object) str2)) && b2.f155817b.mo109888a()) {
                if (b2.mo110025d()) {
                    b2.mo110023d(C72782a.m128361a(b2.f155743D.f155846a));
                } else if (!b2.f155752M || (b2.f155817b.mo109891d().isEmpty() && !b2.f155817b.f155653i)) {
                    b2.mo110023d(0);
                }
                C71833a.m126848a(b2.f155817b.f155669y, C70005cr.m123611a().f156482a, b2.f155817b.f155661q);
                aVar2.mo127182c().mo56600a(b2.f155817b.f155669y, (long) b2.f155817b.f155661q, b2.f155817b.f155651g, false);
            }
            C71833a.m126852b(a);
            if (this.f152115b.mo127181b().f155817b.f155650f.isEmpty()) {
                C67907d dVar5 = this.f152114a;
                ((AbstractC81785a) dVar5.f152103e.mo23374a(dVar5, C67907d.f152099a[4])).mo125490a(true);
            }
            return true;
        }
    }

    public C67907d(String str, String str2, String str3, boolean z, C21582f fVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(fVar, "");
        this.f152109k = str;
        this.f152110l = str2;
        this.f152111m = str3;
        this.f152112n = z;
        this.f152113o = fVar;
    }
}
