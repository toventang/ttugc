package com.p2082ss.android.ugc.gamora.recorder.p4306m;

import android.view.MotionEvent;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2549d;
import com.bytedance.als.C2560h;
import com.bytedance.als.C2563k;
import com.bytedance.als.C2564l;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14315b;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14318d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14201t;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22228c;
import com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.p4244z.AbstractC81785a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65366bf;
import com.p2082ss.android.ugc.aweme.property.C65436ds;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68109p;
import com.p2082ss.android.ugc.aweme.shortvideo.C69797ae;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.countdown.C69938b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3833f.C71833a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.shortvideo.record.p3857b.C72782a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73989bh;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.tools.C78610l;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.p4272a.C82004a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.AbstractC83492a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83468l;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.C83408c;
import com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a;
import com.p2082ss.android.ugc.gamora.recorder.p4305l.AbstractC83869f;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4619j.C89271h;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.gamora.recorder.m.b */
public final class C83882b extends AbstractC2562j<AbstractC83881a> implements AbstractC21566a, AbstractC83881a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f187227a = {new C89232y(C83882b.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new C89232y(C83882b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C89232y(C83882b.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new C89232y(C83882b.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C89232y(C83882b.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0), new C89232y(C83882b.class, "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/gamora/recorder/speed/SpeedApiComponent;", 0), new C89232y(C83882b.class, "recordBottomTabComponent", "getRecordBottomTabComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new C89232y(C83882b.class, "chooseMusicApiComponent", "getChooseMusicApiComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/ChooseMusicApiComponent;", 0), new C89232y(C83882b.class, "commentStickerComponent", "getCommentStickerComponent()Lcom/ss/android/ugc/aweme/comment_sticker/CommentStickerComponent;", 0), new C89232y(C83882b.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C83882b.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0)};

    /* renamed from: A */
    private AbstractC83468l.C83469a f187228A;

    /* renamed from: B */
    private final C2549d<Integer> f187229B;

    /* renamed from: C */
    private final C21582f f187230C;

    /* renamed from: b */
    public final C83882b f187231b = this;

    /* renamed from: c */
    public final C2564l<Integer> f187232c = new C2564l<>(8);

    /* renamed from: d */
    public boolean f187233d;

    /* renamed from: e */
    public C83893e f187234e;

    /* renamed from: f */
    public boolean f187235f;

    /* renamed from: g */
    final AbstractC89244h f187236g;

    /* renamed from: h */
    public final AbstractC22186b f187237h;

    /* renamed from: i */
    private final AbstractC89248d f187238i = C21572a.m40504a(getDiContainer(), AbstractC71864a.class);

    /* renamed from: j */
    private final AbstractC89248d f187239j = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);

    /* renamed from: k */
    private final AbstractC89248d f187240k = C21572a.m40504a(getDiContainer(), AbstractC83406b.class);

    /* renamed from: l */
    private final AbstractC89248d f187241l = C21572a.m40504a(getDiContainer(), ShortVideoContext.class);

    /* renamed from: m */
    private final AbstractC89248d f187242m = C21572a.m40504a(getDiContainer(), AbstractC83746a.class);

    /* renamed from: n */
    private final AbstractC89248d f187243n = C21572a.m40504a(getDiContainer(), AbstractC83869f.class);

    /* renamed from: o */
    private final AbstractC89248d f187244o = C21572a.m40504a(getDiContainer(), AbstractC83406b.class);

    /* renamed from: p */
    private final AbstractC83492a f187245p = ((AbstractC83492a) getDiContainer().mo35252b(AbstractC83492a.class, null));

    /* renamed from: q */
    private final AbstractC84089j f187246q = ((AbstractC84089j) getDiContainer().mo35252b(AbstractC84089j.class, null));

    /* renamed from: r */
    private final AbstractC89248d f187247r = C21572a.m40504a(getDiContainer(), AbstractC83490a.class);

    /* renamed from: s */
    private final AbstractC89248d f187248s = C21572a.m40505b(getDiContainer(), AbstractC81785a.class);

    /* renamed from: t */
    private final AbstractC89248d f187249t = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);

    /* renamed from: u */
    private final AbstractC89248d f187250u = C21572a.m40504a(getDiContainer(), AbstractC14315b.class);

    /* renamed from: v */
    private final C2563k<C83408c> f187251v;

    /* renamed from: w */
    private final C2564l<C89391z> f187252w;

    /* renamed from: x */
    private final C2563k<C83408c> f187253x;

    /* renamed from: y */
    private final C2563k<C83903f> f187254y;

    /* renamed from: z */
    private String f187255z;

    static {
        Covode.recordClassIndex(97773);
    }

    /* renamed from: g */
    private final AbstractC71864a m144252g() {
        return (AbstractC71864a) this.f187238i.mo23374a(this, f187227a[0]);
    }

    /* renamed from: h */
    private final AbstractC14193m m144253h() {
        return (AbstractC14193m) this.f187239j.mo23374a(this, f187227a[1]);
    }

    /* renamed from: i */
    private final AbstractC83406b m144254i() {
        return (AbstractC83406b) this.f187240k.mo23374a(this, f187227a[2]);
    }

    /* renamed from: j */
    private final AbstractC83746a m144255j() {
        return (AbstractC83746a) this.f187242m.mo23374a(this, f187227a[4]);
    }

    /* renamed from: k */
    private final AbstractC83869f m144256k() {
        return (AbstractC83869f) this.f187243n.mo23374a(this, f187227a[5]);
    }

    /* renamed from: l */
    private final AbstractC83406b m144257l() {
        return (AbstractC83406b) this.f187244o.mo23374a(this, f187227a[6]);
    }

    /* renamed from: m */
    private final AbstractC83490a m144258m() {
        return (AbstractC83490a) this.f187247r.mo23374a(this, f187227a[7]);
    }

    /* renamed from: n */
    private final AbstractC81785a m144259n() {
        return (AbstractC81785a) this.f187248s.mo23374a(this, f187227a[8]);
    }

    /* renamed from: a */
    public final ShortVideoContext mo128773a() {
        return (ShortVideoContext) this.f187241l.mo23374a(this, f187227a[3]);
    }

    /* renamed from: b */
    public final AbstractC14177d mo128778b() {
        return (AbstractC14177d) this.f187249t.mo23374a(this, f187227a[9]);
    }

    /* renamed from: f */
    public final AbstractC14315b mo128779f() {
        return (AbstractC14315b) this.f187250u.mo23374a(this, f187227a[10]);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4306m.AbstractC83881a
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C2560h mo123012c() {
        return this.f187232c;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC83881a getApiComponent() {
        return this.f187231b;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f187230C;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4306m.AbstractC83881a
    /* renamed from: a */
    public final void mo123006a(boolean z) {
        this.f187233d = z;
        mo128774a(z ? 0 : 8);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4306m.AbstractC83881a
    /* renamed from: a */
    public final void mo123008a(boolean z, boolean z2) {
        if (!this.f187233d) {
            return;
        }
        if (!z || mo128773a().f155817b.f155653i) {
            mo128774a(8);
            return;
        }
        if (mo128773a().f155817b.mo109896h() > 0) {
            if (!C65366bf.m117062a() || mo128778b().mo22747A().mo56984i() || mo128773a().f155817b.f155653i) {
                mo128774a(8);
                return;
            } else if (z2) {
                return;
            }
        } else if (C65366bf.m117062a()) {
            mo128777a(true, (Set<String>) null);
        }
        mo128774a(0);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4306m.AbstractC83881a
    /* renamed from: a */
    public final void mo123005a(String str, boolean z) {
        Object obj;
        C89219l.m154721d(str, "");
        C83893e eVar = this.f187234e;
        if (eVar == null) {
            C89219l.m154710a("splitShootScene");
        }
        TabHost E = eVar.mo62771E();
        Iterator it = C89271h.m154766a(0, E.getTabCount()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C89219l.m154714a(E.mo116835b(((Number) obj).intValue()), (Object) str)) {
                break;
            }
        }
        Integer num = (Integer) obj;
        if (num != null) {
            E.mo116831a(num.intValue(), true, z);
        }
    }

    /* renamed from: a */
    public final void mo128777a(boolean z, Set<String> set) {
        this.f187254y.mo6999a(new C83903f(z, set));
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.m.b$a */
    static final class C83883a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C83883a f187256a = new C83883a();

        static {
            Covode.recordClassIndex(97774);
        }

        C83883a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C65366bf.m117062a());
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4306m.AbstractC83881a
    /* renamed from: e */
    public final boolean mo123014e() {
        T value;
        if (!this.f187233d || (value = this.f187232c.f7727a.getValue()) == null || value.intValue() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4306m.AbstractC83881a
    /* renamed from: d */
    public final void mo123013d() {
        if (this.f187233d && C65366bf.m117062a() && !mo128778b().mo22747A().mo56984i() && !mo128773a().f155817b.f155653i) {
            mo128777a(false, C73989bh.m130123a(mo128773a().mo110043s()));
            mo128774a(0);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.m.b$c */
    static final class RunnableC83885c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C83882b f187258a;

        static {
            Covode.recordClassIndex(97776);
        }

        RunnableC83885c(C83882b bVar) {
            this.f187258a = bVar;
        }

        public final void run() {
            if (this.f187258a.f187233d && this.f187258a.mo128773a().f155817b.mo109896h() >= this.f187258a.mo128773a().f155817b.mo109899k() && !this.f187258a.mo128773a().f155817b.f155653i && C65366bf.m117062a() && !this.f187258a.mo128778b().mo22747A().mo56984i()) {
                C83882b bVar = this.f187258a;
                bVar.mo128777a(false, C73989bh.m130123a(bVar.mo128773a().mo110043s()));
                this.f187258a.mo128774a(0);
            }
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        boolean z;
        super.onCreate();
        this.f187255z = C63244g.m114602a().mo73284l().getDefaultShootTabTag(mo128773a());
        C21582f diContainer = getDiContainer();
        C2563k<C83408c> kVar = this.f187253x;
        C2564l<Integer> lVar = this.f187232c;
        C2560h<Boolean> c = m144252g().mo113513c();
        C2564l<C89391z> lVar2 = this.f187252w;
        C2563k<C83903f> kVar2 = this.f187254y;
        String str = this.f187255z;
        if (!C83891d.m144282a() || mo128773a().f155817b.mo109889b() || mo128773a().f155817b.mo109890c() || mo128773a().mo110033i()) {
            z = false;
        } else {
            z = true;
        }
        C83893e eVar = new C83893e(diContainer, kVar, lVar, c, lVar2, kVar2, str, z, C83890c.m144279a(mo128773a()), this.f187229B);
        this.f187234e = eVar;
        this.f187237h.mo36387a(R.id.dg9, eVar, "SplitShootScene");
        C83893e eVar2 = this.f187234e;
        if (eVar2 == null) {
            C89219l.m154710a("splitShootScene");
        }
        C22228c.m41830a(eVar2, new RunnableC83885c(this));
        m144253h().mo22916w().mo6997a(this, new C83886d(this));
        this.f187253x.mo6997a(this, new C83887e(this));
        m144253h().mo22912s().mo6997a(this, new C83888f(this));
        m144253h().mo22908o().mo7038b(this, new C83889g(this));
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        if (!createIAVServiceProxybyMonsterPlugin.getStoryService().mo93871e()) {
            return;
        }
        if (!C65436ds.m117154a() || !C89070n.m154522b("slide_right", "click_upper_left_camera", "click_west_window_camera").contains(mo128773a().f155838w)) {
            mo128779f().mo23097a(new C83884b(this), 3);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4306m.AbstractC83881a
    /* renamed from: b */
    public final void mo123011b(boolean z) {
        this.f187233d = z;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.m.b$b */
    public static final class C83884b extends AbstractC14318d {

        /* renamed from: a */
        final /* synthetic */ C83882b f187257a;

        static {
            Covode.recordClassIndex(97775);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83884b(C83882b bVar) {
            this.f187257a = bVar;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
        /* renamed from: a */
        public final boolean mo23047a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            T value;
            if (this.f187257a.mo128778b().mo22747A().mo56984i() || this.f187257a.mo128778b().mo22800ah()) {
                return false;
            }
            C69938b bVar = (C69938b) this.f187257a.getDiContainer().mo35252b(C69938b.class, null);
            if ((bVar != null && bVar.mo110376d()) || !this.f187257a.f187233d || (value = this.f187257a.f187232c.f7727a.getValue()) == null || value.intValue() != 0) {
                return false;
            }
            if (motionEvent == null || motionEvent2 == null) {
                return super.mo23047a(motionEvent, motionEvent2, f, f2);
            }
            AbstractC14318d a = this.f187257a.mo128779f().mo23095a(1);
            if (a != null && a.mo23047a(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
            AbstractC14318d a2 = this.f187257a.mo128779f().mo23095a(6);
            if ((a2 == null || !a2.mo23047a(motionEvent, motionEvent2, f, f2)) && Math.abs(motionEvent.getX() - motionEvent2.getX()) <= Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                return false;
            }
            return true;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
        /* renamed from: b */
        public final boolean mo23057b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            T value;
            if (this.f187257a.mo128778b().mo22747A().mo56984i() || this.f187257a.mo128778b().mo22800ah()) {
                return false;
            }
            C69938b bVar = (C69938b) this.f187257a.getDiContainer().mo35252b(C69938b.class, null);
            if ((bVar != null && bVar.mo110376d()) || !this.f187257a.f187233d || (value = this.f187257a.f187232c.f7727a.getValue()) == null || value.intValue() != 0) {
                return false;
            }
            if (motionEvent == null || motionEvent2 == null) {
                return super.mo23057b(motionEvent, motionEvent2, f, f2);
            }
            AbstractC14318d a = this.f187257a.mo128779f().mo23095a(1);
            if (a != null && a.mo23057b(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
            AbstractC14318d a2 = this.f187257a.mo128779f().mo23095a(6);
            if (a2 != null && a2.mo23057b(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
            C83893e eVar = this.f187257a.f187234e;
            if (eVar == null) {
                C89219l.m154710a("splitShootScene");
            }
            TabHost E = eVar.mo62771E();
            boolean a3 = C80471gb.m139483a(C2556g.m7473b(this.f187257a));
            if (motionEvent2.getX() > motionEvent.getX() && Math.abs(motionEvent.getX() - motionEvent2.getX()) > Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                if (!a3 || !C65436ds.m117154a()) {
                    C83890c.m144278a(E);
                } else {
                    C83890c.m144280b(E);
                }
                return true;
            } else if (motionEvent.getX() <= motionEvent2.getX() || Math.abs(motionEvent2.getX() - motionEvent.getX()) <= Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                return false;
            } else {
                if (!a3 || !C65436ds.m117154a()) {
                    C83890c.m144280b(E);
                } else {
                    C83890c.m144278a(E);
                }
                return true;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.m.b$d */
    static final class C83886d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83882b f187259a;

        static {
            Covode.recordClassIndex(97777);
        }

        C83886d(C83882b bVar) {
            this.f187259a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f187259a.mo128774a(8);
        }
    }

    /* renamed from: a */
    public final void mo128774a(int i) {
        this.f187232c.mo7019b(Integer.valueOf(i));
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4306m.AbstractC83881a
    /* renamed from: b */
    public final void mo123010b(int i) {
        this.f187229B.mo7019b(Integer.valueOf(i));
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4306m.AbstractC83881a
    /* renamed from: a */
    public final void mo123003a(AbstractC83468l.C83469a aVar) {
        int i;
        C89219l.m154721d(aVar, "");
        this.f187228A = aVar;
        if (this.f187235f) {
            String str = this.f187255z;
            C83408c cVar = aVar.f186419c;
            if (cVar != null) {
                i = cVar.f186278d;
            } else {
                i = 0;
            }
            mo128776a(null, str, true, i, aVar.f186422f, aVar.f186420d);
        } else {
            mo128775a(new C83408c(null, "RecordCombinePhoto", 0, aVar.f186422f, false, 16));
        }
        this.f187252w.mo7019b(C89391z.f203057a);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.m.b$e */
    static final class C83887e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83882b f187260a;

        static {
            Covode.recordClassIndex(97778);
        }

        C83887e(C83882b bVar) {
            this.f187260a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C83408c cVar = (C83408c) obj;
            this.f187260a.f187235f = !C89219l.m154714a(cVar.f186277c, (Object) "RecordCombinePhoto");
            if (C89219l.m154714a(cVar.f186276b, (Object) "RecordCombinePhoto") || C89219l.m154714a(cVar.f186277c, (Object) "RecordCombinePhoto")) {
                C83882b bVar = this.f187260a;
                C89219l.m154716b(cVar, "");
                bVar.mo128775a(cVar);
                return;
            }
            C83882b bVar2 = this.f187260a;
            Object obj2 = cVar.f186276b;
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            Object obj3 = cVar.f186277c;
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
            bVar2.mo128776a((String) obj2, (String) obj3, false, cVar.f186278d, cVar.f186275a, cVar.f186280f);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.m.b$f */
    static final class C83888f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83882b f187261a;

        static {
            Covode.recordClassIndex(97779);
        }

        C83888f(C83882b bVar) {
            this.f187261a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C83882b bVar = this.f187261a;
            if (bVar.f187233d) {
                if (bVar.mo128773a().f155817b.mo109896h() > 0) {
                    if (!C65366bf.m117062a() || bVar.mo128778b().mo22747A().mo56984i() || bVar.mo128773a().f155817b.f155653i) {
                        bVar.mo128774a(8);
                        return;
                    }
                    bVar.mo128777a(false, C73989bh.m130123a(bVar.mo128773a().mo110043s()));
                } else if (bVar.mo128773a().f155817b.f155653i) {
                    return;
                } else {
                    if (C65366bf.m117062a()) {
                        bVar.mo128777a(true, (Set<String>) null);
                    }
                }
                bVar.mo128774a(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.m.b$g */
    static final class C83889g<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83882b f187262a;

        static {
            Covode.recordClassIndex(97780);
        }

        C83889g(C83882b bVar) {
            this.f187262a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean a;
            C14201t tVar = (C14201t) obj;
            if (tVar != null && tVar.f34476a != null) {
                this.f187262a.mo128773a();
                if (C68109p.m120400a() == 2) {
                    a = ((Boolean) this.f187262a.f187236g.getValue()).booleanValue();
                } else {
                    a = C65366bf.m117062a();
                }
                if (!tVar.f34476a.isEmpty() || tVar.f34477b != 0) {
                    if (!this.f187262a.f187233d) {
                        return;
                    }
                    if (!a || this.f187262a.mo128778b().mo22747A().mo56984i() || this.f187262a.mo128773a().f155817b.f155653i) {
                        this.f187262a.mo128774a(8);
                    } else if (this.f187262a.mo128773a().f155817b.mo109896h() < this.f187262a.mo128773a().f155817b.mo109899k()) {
                        C83882b bVar = this.f187262a;
                        bVar.mo128777a(false, C73989bh.m130123a(bVar.mo128773a().mo110043s()));
                        this.f187262a.mo128774a(0);
                    }
                } else if (!this.f187262a.mo128773a().f155817b.f155653i && tVar.f34479d && this.f187262a.f187233d) {
                    if (a) {
                        this.f187262a.mo128777a(true, (Set<String>) null);
                    }
                    this.f187262a.mo128773a();
                    if (C68109p.m120400a() == 2) {
                        T value = this.f187262a.f187232c.f7727a.getValue();
                        if ((value == null || value.intValue() != 0) && !this.f187262a.mo128773a().mo110018b()) {
                            this.f187262a.mo128774a(0);
                        }
                    } else if (!this.f187262a.mo128773a().mo110018b()) {
                        this.f187262a.mo128774a(0);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo128775a(C83408c cVar) {
        AbstractC75655o t;
        if (C89219l.m154714a(cVar.f186276b, (Object) "RecordCombinePhoto")) {
            Object obj = cVar.f186277c;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            this.f187255z = (String) obj;
        }
        m144257l().onCombinePhotoTabChanged(cVar);
        int i = cVar.f186278d;
        Object obj2 = cVar.f186276b;
        Effect effect = null;
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        m144251a(false, i, (String) obj2, cVar.f186275a);
        m144257l().notifyBottomTabIndexChange(new C83408c(cVar.f186276b, cVar.f186277c, cVar.f186278d, false, false, 16));
        if (C89219l.m154714a(cVar.f186277c, (Object) "RecordCombinePhoto")) {
            AbstractC84089j jVar = this.f187246q;
            if (!(jVar == null || (t = jVar.mo23167t()) == null)) {
                effect = t.mo119294f();
            }
            AbstractC83492a aVar = this.f187245p;
            if (aVar != null) {
                aVar.mo128513a(mo128773a().f155817b.mo109893e(), 0, null, effect, AbstractC83492a.C83493a.C83494a.f186459a);
            }
        }
    }

    public C83882b(AbstractC22186b bVar, C21582f fVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        this.f187237h = bVar;
        this.f187230C = fVar;
        C2563k<C83408c> kVar = new C2563k<>();
        this.f187251v = kVar;
        this.f187252w = new C2564l<>(C89391z.f203057a);
        this.f187253x = kVar;
        this.f187254y = new C2563k<>();
        this.f187255z = C69797ae.f155980a;
        this.f187229B = new C2549d<>(0);
        this.f187235f = true;
        this.f187236g = C89250i.m154773a((AbstractC89171a) C83883a.f187256a);
    }

    /* renamed from: a */
    private static void m144249a(C82004a aVar, String str, ShortVideoContext shortVideoContext, boolean z) {
        if ((C69797ae.m123323b(str) || C89219l.m154714a((Object) C69797ae.f155980a, (Object) str)) && shortVideoContext.f155817b.mo109888a()) {
            if (shortVideoContext.mo110025d()) {
                shortVideoContext.mo110023d(C72782a.m128361a(shortVideoContext.f155743D.f155846a));
            } else if (!z) {
                shortVideoContext.mo110023d(0);
            }
            Workspace workspace = shortVideoContext.f155817b.f155652h;
            C89219l.m154716b(workspace, "");
            C71833a.m126848a(workspace.mo110093c(), C70005cr.m123611a().f156482a, shortVideoContext.f155817b.f155661q);
            AbstractC31133a c = aVar.mo127182c();
            Workspace workspace2 = shortVideoContext.f155817b.f155652h;
            C89219l.m154716b(workspace2, "");
            c.mo56600a(workspace2.mo110093c(), (long) shortVideoContext.f155817b.f155661q, shortVideoContext.f155817b.f155651g, false);
        }
    }

    /* renamed from: a */
    private final void m144250a(String str, ShortVideoContext shortVideoContext, boolean z, boolean z2) {
        if ((C69797ae.m123323b(str) || C89219l.m154714a((Object) C69797ae.f155980a, (Object) str)) && !shortVideoContext.f155817b.mo109889b() && !shortVideoContext.f155817b.mo109890c()) {
            C78610l lVar = new C78610l(!C69797ae.m123323b(str), true);
            lVar.f176650c = C89219l.m154714a((Object) str, (Object) C69797ae.f155982c);
            lVar.f176652e = z;
            lVar.f176651d = 2;
            lVar.f176653f = !z2;
            m144254i().configSwitchDuration(lVar);
        }
    }

    /* renamed from: a */
    private final void m144251a(boolean z, int i, String str, boolean z2) {
        String str2;
        String str3;
        String str4;
        C84425b a;
        if (C89219l.m154714a((Object) this.f187255z, (Object) C69797ae.f155980a)) {
            str2 = "video_15";
        } else if (C71833a.m126853c() == 14) {
            str2 = "video_180";
        } else {
            str2 = "video_60";
        }
        String str5 = "";
        if (i == 1) {
            str3 = "tab_bar_click";
        } else if (i == 2) {
            str3 = "tab_bar_slide";
        } else if (i == 3) {
            str3 = "full_slide";
        } else if (i != 4) {
            str3 = str5;
        } else {
            str3 = "cross";
        }
        if (z) {
            str4 = "outer";
        } else {
            str4 = "inner";
        }
        String a2 = C73989bh.m130122a(str);
        if (z2) {
            a2 = "by_default";
            str3 = str5;
        } else {
            str5 = str4;
        }
        C84425b a3 = new C84425b().mo129406a("creation_id", mo128773a().f155830o).mo129406a("shoot_way", mo128773a().f155831p).mo129403a("draft_id", mo128773a().f155740A).mo129406a("to_status", str2).mo129406a("change_type", str5).mo129406a("change_method", str3).mo129406a("from_status", a2);
        if (!C65366bf.m117062a() || mo128773a().f155817b.mo109896h() <= 0) {
            a = a3.mo129406a("enter_from", "video_shoot_page");
        } else {
            a = a3.mo129406a("enter_from", "video_recording_page");
        }
        C39162r.m79460a("change_record_mode", a.f188764a);
    }

    /* renamed from: a */
    public final void mo128776a(String str, String str2, boolean z, int i, boolean z2, boolean z3) {
        AbstractC81785a n;
        AbstractC75655o t;
        this.f187255z = str2;
        Effect effect = null;
        Object b = getDiContainer().mo35252b(AbstractC83406b.class, null);
        if (b == null) {
            C89219l.m154715b();
        }
        C82004a provideRecordEnv = ((AbstractC83406b) b).provideRecordEnv();
        AbstractC14177d d = provideRecordEnv.mo127183d();
        provideRecordEnv.mo127186g().mo22650a("record");
        int a = C69797ae.m123321a(str2);
        provideRecordEnv.mo127181b().f155763X = a;
        m144252g().mo113512b(z3);
        AbstractC83746a j = m144255j();
        j.mo128715b();
        boolean z4 = false;
        j.mo128712a(3, false);
        d.mo22777a(0);
        m144255j().mo128716b(true);
        if (m144256k().mo128763d()) {
            m144256k().mo128761b(true);
        }
        if (C63244g.m114602a().mo73284l().shouldDropCurrentMusicFor3min(str2, mo128773a())) {
            m144258m().clearMusic();
            new C79459a(provideRecordEnv.mo127169a()).mo123050a(R.string.czl).mo123053a();
        }
        AbstractC83492a aVar = this.f187245p;
        if (aVar != null) {
            AbstractC84089j jVar = this.f187246q;
            if (!(jVar == null || (t = jVar.mo23167t()) == null)) {
                effect = t.mo119294f();
            }
            aVar.mo128516c(effect);
        }
        ShortVideoContext b2 = provideRecordEnv.mo127181b();
        if (z) {
            AbstractC83468l.C83469a aVar2 = this.f187228A;
            if (aVar2 == null) {
                C89219l.m154710a("extraInfo");
            }
            z4 = aVar2.f186422f;
        }
        m144250a(str2, b2, z4, z);
        m144249a(provideRecordEnv, str2, provideRecordEnv.mo127181b(), z);
        C71833a.m126852b(a);
        if (provideRecordEnv.mo127181b().f155817b.f155650f.isEmpty() && (n = m144259n()) != null) {
            n.mo125490a(true);
        }
        m144251a(z, i, str, z2);
        m144257l().notifyBottomTabIndexChange(new C83408c(str, str2, i, false, false, 16));
    }
}
