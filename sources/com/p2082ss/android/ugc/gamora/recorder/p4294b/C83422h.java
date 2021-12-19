package com.p2082ss.android.ugc.gamora.recorder.p4294b;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2549d;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2563k;
import com.bytedance.als.C2564l;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14315b;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14318d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z;
import com.bytedance.creativex.recorder.p940b.p941a.C14191k;
import com.bytedance.creativex.recorder.p940b.p941a.C14192l;
import com.bytedance.creativex.recorder.p940b.p941a.C14201t;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14333c;
import com.bytedance.framwork.core.p999b.p1004e.C14796b;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22226a;
import com.bytedance.scene.ktx.C22227b;
import com.bytedance.scene.ktx.C22228c;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.property.C65366bf;
import com.p2082ss.android.ugc.aweme.property.C65436ds;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.shortvideo.C70768ec;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.countdown.C69938b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3833f.C71833a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordNewActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73989bh;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.sticker.types.p4010f.C76058a;
import com.p2082ss.android.ugc.aweme.tools.C78610l;
import com.p2082ss.android.ugc.aweme.tools.p4099d.C78104a;
import com.p2082ss.android.ugc.aweme.tools.p4099d.C78105b;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80573ig;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.p4272a.C82004a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a;
import com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a;
import com.p2082ss.android.ugc.gamora.recorder.p4306m.AbstractC83881a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.gamora.recorder.b.h */
public class C83422h extends AbstractC2562j<AbstractC83406b> implements AbstractC20382b, AbstractC21566a, AbstractC83406b {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f186322a = {new C89232y(C83422h.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new C89232y(C83422h.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C89232y(C83422h.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C89232y(C83422h.class, "controlProgressApiComponent", "getControlProgressApiComponent()Lcom/ss/android/ugc/gamora/recorder/progress/ControlProgressApiComponent;", 0), new C89232y(C83422h.class, "chooseMusicApiComponent", "getChooseMusicApiComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/ChooseMusicApiComponent;", 0), new C89232y(C83422h.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C89232y(C83422h.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0), new C89232y(C83422h.class, "stickerPanelApiComponent", "getStickerPanelApiComponent()Lcom/bytedance/creativex/recorder/sticker/api/StickerPanelApiComponent;", 0)};

    /* renamed from: A */
    private final C2563k<Boolean> f186323A;

    /* renamed from: B */
    private final C2563k<Integer> f186324B;

    /* renamed from: C */
    private final C2563k<Integer> f186325C;

    /* renamed from: D */
    private boolean f186326D;

    /* renamed from: E */
    private final AbstractC89244h f186327E;

    /* renamed from: F */
    private final C21582f f186328F;

    /* renamed from: b */
    public final AbstractC83406b f186329b = this;

    /* renamed from: c */
    final AbstractC71864a f186330c;

    /* renamed from: d */
    final AbstractC89248d f186331d;

    /* renamed from: e */
    final AbstractC89248d f186332e;

    /* renamed from: f */
    public final C2564l<Integer> f186333f;

    /* renamed from: g */
    public final C83410e f186334g;

    /* renamed from: h */
    public final C83410e f186335h;

    /* renamed from: i */
    final C2549d<Integer> f186336i;

    /* renamed from: j */
    public final C83462j f186337j;

    /* renamed from: k */
    public final C83415g f186338k;

    /* renamed from: l */
    public boolean f186339l;

    /* renamed from: m */
    public final AbstractC22186b f186340m;

    /* renamed from: n */
    public final List<AbstractC83405a> f186341n;

    /* renamed from: o */
    public final List<AbstractC83405a> f186342o;

    /* renamed from: p */
    private final AbstractC89248d f186343p;

    /* renamed from: q */
    private final AbstractC89248d f186344q;

    /* renamed from: r */
    private final AbstractC89248d f186345r;

    /* renamed from: s */
    private final AbstractC89248d f186346s;

    /* renamed from: t */
    private final AbstractC89248d f186347t;

    /* renamed from: u */
    private final AbstractC89248d f186348u;

    /* renamed from: v */
    private C82004a f186349v;

    /* renamed from: w */
    private final C2563k<C83408c> f186350w;

    /* renamed from: x */
    private final C2563k<String> f186351x;

    /* renamed from: y */
    private final C2559g<C83408c> f186352y;

    /* renamed from: z */
    private final C2559g<String> f186353z;

    static {
        Covode.recordClassIndex(97308);
    }

    /* renamed from: a */
    public final AbstractC14209z mo128438a() {
        return (AbstractC14209z) this.f186343p.mo23374a(this, f186322a[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final AbstractC14193m mo128441b() {
        return (AbstractC14193m) this.f186344q.mo23374a(this, f186322a[1]);
    }

    /* renamed from: c */
    public final ShortVideoContext mo128442c() {
        return (ShortVideoContext) this.f186345r.mo23374a(this, f186322a[2]);
    }

    /* renamed from: d */
    public final AbstractC84089j mo128443d() {
        return (AbstractC84089j) this.f186347t.mo23374a(this, f186322a[5]);
    }

    /* renamed from: e */
    public final AbstractC14315b mo128444e() {
        return (AbstractC14315b) this.f186348u.mo23374a(this, f186322a[6]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b
    public void onCombinePhotoTabChanged(C83408c cVar) {
        C89219l.m154721d(cVar, "");
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public /* bridge */ /* synthetic */ AbstractC83406b getApiComponent() {
        return this.f186329b;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b
    public C2559g<C83408c> getBottomTabIndexChangeEvent() {
        return this.f186352y;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b
    public C2564l<Integer> getComplexTabVisibility() {
        return this.f186333f;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.f186328F;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b
    public String getCurrentBottomTag() {
        return this.f186334g.mo128434d();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b
    public void hidePopupForLiveTab() {
        this.f186334g.mo128432b();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b
    public void tryShowPopupForLiveTab() {
        this.f186334g.mo128425a();
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$a */
    static final class RunnableC83423a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC22186b f186354a;

        /* renamed from: b */
        final /* synthetic */ C83414f f186355b;

        /* renamed from: c */
        final /* synthetic */ C83422h f186356c;

        /* renamed from: d */
        final /* synthetic */ AbstractC83405a f186357d;

        /* renamed from: e */
        final /* synthetic */ int f186358e;

        static {
            Covode.recordClassIndex(97309);
        }

        RunnableC83423a(AbstractC22186b bVar, C83414f fVar, C83422h hVar, AbstractC83405a aVar, int i) {
            this.f186354a = bVar;
            this.f186355b = fVar;
            this.f186356c = hVar;
            this.f186357d = aVar;
            this.f186358e = i;
        }

        public final void run() {
            C83422h.m143818a(this.f186354a, this.f186355b, true);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b
    public int bottomTabSize() {
        return this.f186334g.f186288a.size();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b
    public C82004a provideRecordEnv() {
        C82004a aVar = this.f186349v;
        if (aVar == null) {
            C89219l.m154710a("recordEnv");
        }
        return aVar;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$s */
    static final class C83441s extends AbstractC89220m implements AbstractC89171a<C70768ec> {

        /* renamed from: a */
        final /* synthetic */ C83422h f186379a;

        static {
            Covode.recordClassIndex(97327);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83441s(C83422h hVar) {
            super(0);
            this.f186379a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70768ec invoke() {
            return new C70768ec(this.f186379a.mo128442c(), this.f186379a.getDiContainer());
        }
    }

    /* renamed from: f */
    public final boolean mo128445f() {
        String str;
        if (C14796b.m27161a(this.f186334g.f186288a)) {
            return false;
        }
        for (T t : this.f186334g.f186288a) {
            AbstractC83467k kVar = t.f186300c;
            if (kVar != null) {
                str = kVar.mo108523a();
            } else {
                str = null;
            }
            if (C89219l.m154714a((Object) "RecordLiveScene", (Object) str)) {
                t.f186300c.mo122522G();
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b
    public boolean isCurrentTabNeedCamera() {
        if (!(!C89219l.m154714a((Object) getCurrentBottomTag(), (Object) "record_mode_mv")) || !(!C89219l.m154714a((Object) getCurrentBottomTag(), (Object) C2556g.m7473b(this).getString(R.string.f80)))) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b
    public boolean isZTLiveSwitch() {
        String str;
        if (C14796b.m27161a(this.f186334g.f186288a)) {
            return false;
        }
        for (T t : this.f186334g.f186288a) {
            AbstractC83467k kVar = t.f186300c;
            if (kVar != null) {
                str = kVar.mo108523a();
            } else {
                str = null;
            }
            if (C89219l.m154714a((Object) "RecordLiveScene", (Object) str)) {
                t.f186300c.mo122520E();
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b
    public void updateBottomTab() {
        if (C65366bf.m117062a() && !mo128438a().mo22747A().mo56984i() && !mo128442c().f155817b.f155653i) {
            this.f186334g.mo128430a(C73989bh.m130123a(mo128442c().mo110043s()));
            showBottomTab(true);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$k */
    static final class RunnableC83433k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C83422h f186370a;

        static {
            Covode.recordClassIndex(97319);
        }

        RunnableC83433k(C83422h hVar) {
            this.f186370a = hVar;
        }

        public final void run() {
            if (this.f186370a.mo128442c().f155817b.mo109896h() >= this.f186370a.mo128442c().f155817b.mo109899k() && !this.f186370a.mo128442c().f155817b.f155653i && C65366bf.m117062a() && !this.f186370a.mo128438a().mo22747A().mo56984i()) {
                this.f186370a.f186334g.mo128430a(C73989bh.m130123a(this.f186370a.mo128442c().mo110043s()));
                this.f186370a.showBottomTab(true);
            }
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onCreate() {
        T t;
        C83414f fVar;
        super.onCreate();
        Object a = this.f186340m.mo36471B().mo36579a("record_env_context");
        if (a == null) {
            C89219l.m154715b();
        }
        C82004a aVar = (C82004a) a;
        this.f186349v = aVar;
        C83410e eVar = this.f186334g;
        if (aVar == null) {
            C89219l.m154710a("recordEnv");
        }
        eVar.mo128427a(aVar, this.f186341n, this.f186350w, this.f186351x);
        C83410e eVar2 = this.f186335h;
        C82004a aVar2 = this.f186349v;
        if (aVar2 == null) {
            C89219l.m154710a("recordEnv");
        }
        eVar2.mo128427a(aVar2, this.f186342o, this.f186350w, this.f186351x);
        List<C83414f> list = this.f186334g.f186288a;
        AbstractC22186b bVar = this.f186340m;
        List<C83414f> list2 = this.f186334g.f186288a;
        T t2 = null;
        if (mo128442c().f155800aj) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    fVar = null;
                    break;
                }
                fVar = it.next();
                if (C89219l.m154714a((Object) fVar.f186299b.f186283c, (Object) C80573ig.m139668a(R.string.f7u))) {
                    break;
                }
            }
            C83414f fVar2 = fVar;
            if (fVar2 != null) {
                m143817a(bVar, fVar2);
                AbstractC83467k kVar = fVar2.f186300c;
                if (kVar != null) {
                    C22226a.m41822a(bVar, R.id.dg9, this.f186337j, "RecordBottomTabScene");
                    bVar.mo36387a(R.id.dg9, kVar, kVar.mo108523a());
                }
                m143818a(bVar, fVar2, false);
                this.f186334g.mo128435e();
                m143820a(fVar2.f186299b.f186283c);
                return;
            }
        }
        for (T t3 : list) {
            if (t3.f186300c != null) {
                C22226a.m41822a(this.f186340m, R.id.dg9, t3.f186300c, t3.f186300c.mo108523a());
            }
        }
        this.f186340m.mo36387a(R.id.dg9, this.f186337j, "RecordBottomTabScene");
        AbstractC22186b bVar2 = this.f186340m;
        for (C83414f fVar3 : list) {
            m143817a(bVar2, fVar3);
        }
        this.f186323A.mo6997a(bVar2, new C83425c(bVar2));
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t = null;
                break;
            }
            t = it2.next();
            if (t.f186299b.f186285e) {
                break;
            }
        }
        T t4 = t;
        if (t4 != null) {
            m143818a(bVar2, t4, true);
        }
        mo128442c();
        isZTLiveSwitch();
        List<C83414f> list3 = this.f186335h.f186288a;
        for (T t5 : list3) {
            if (t5.f186300c != null) {
                C22226a.m41822a(this.f186340m, R.id.dg9, t5.f186300c, t5.f186300c.mo108523a());
            }
        }
        this.f186340m.mo36387a(R.id.dg9, this.f186338k, "ComplexLighteningTabScene");
        AbstractC22186b bVar3 = this.f186340m;
        for (C83414f fVar4 : list3) {
            m143817a(bVar3, fVar4);
        }
        AbstractC22186b bVar4 = this.f186340m;
        if (!this.f186326D) {
            this.f186326D = true;
            Iterator<T> it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                T next = it3.next();
                if (next.f186299b.f186285e) {
                    t2 = next;
                    break;
                }
            }
            T t6 = t2;
            if (t6 != null) {
                m143818a(bVar4, t6, false);
                this.f186334g.mo128435e();
                m143820a(t6.f186299b.f186283c);
            }
        }
        C22228c.m41830a(this.f186337j, new RunnableC83433k(this));
        this.f186353z.mo6997a(this, new C83434l(this));
        getBottomTabIndexChangeEvent().mo6997a(this, new C83435m<>(this));
        mo128441b().mo22908o().mo7038b(this, new C83436n<>(this));
        mo128441b().mo22901h().mo6997a(this, new C83437o<>(this));
        this.f186324B.mo6997a(this, new C83438p(this));
        this.f186325C.mo6997a(this, new C83427e(this));
        mo128441b().mo22906m().mo6997a(this, new C83428f<>(this));
        mo128441b().mo22904k().mo6997a(this, new C83429g<>(this));
        mo128441b().mo22916w().mo6997a(this, new C83430h<>(this));
        mo128438a().mo22799ag().mo6997a(this, new C83431i<>(this));
        mo128438a().mo22798af().mo6997a(this, new C83432j<>(this));
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        if (!createIAVServiceProxybyMonsterPlugin.getStoryService().mo93871e()) {
            return;
        }
        if (!C65436ds.m117154a() || !C89070n.m154522b("slide_right", "click_upper_left_camera", "click_west_window_camera").contains(mo128442c().f155838w)) {
            mo128444e().mo23097a(new C83424b(this), 4);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$b */
    public static final class C83424b extends AbstractC14318d {

        /* renamed from: a */
        final /* synthetic */ C83422h f186359a;

        static {
            Covode.recordClassIndex(97310);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83424b(C83422h hVar) {
            this.f186359a = hVar;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
        /* renamed from: a */
        public final boolean mo23047a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            T value;
            if (this.f186359a.mo128438a().mo22747A().mo56984i() || this.f186359a.mo128438a().mo22800ah()) {
                return false;
            }
            C69938b bVar = (C69938b) this.f186359a.getDiContainer().mo35252b(C69938b.class, null);
            if ((bVar != null && bVar.mo110376d()) || (value = this.f186359a.f186333f.f7727a.getValue()) == null || value.intValue() != 0) {
                return false;
            }
            if (motionEvent == null || motionEvent2 == null) {
                return super.mo23047a(motionEvent, motionEvent2, f, f2);
            }
            if (this.f186359a.mo128442c().f155817b.mo109896h() != 0) {
                return false;
            }
            AbstractC14318d a = this.f186359a.mo128444e().mo23095a(1);
            if (a != null && a.mo23047a(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
            AbstractC14318d a2 = this.f186359a.mo128444e().mo23095a(6);
            if ((a2 == null || !a2.mo23047a(motionEvent, motionEvent2, f, f2)) && Math.abs(motionEvent.getX() - motionEvent2.getX()) <= Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                return false;
            }
            return true;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
        /* renamed from: b */
        public final boolean mo23057b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            T value;
            if (this.f186359a.mo128438a().mo22747A().mo56984i() || this.f186359a.mo128438a().mo22800ah()) {
                return false;
            }
            C69938b bVar = (C69938b) this.f186359a.getDiContainer().mo35252b(C69938b.class, null);
            if ((bVar != null && bVar.mo110376d()) || (value = this.f186359a.f186333f.f7727a.getValue()) == null || value.intValue() != 0) {
                return false;
            }
            if (motionEvent == null || motionEvent2 == null) {
                return super.mo23057b(motionEvent, motionEvent2, f, f2);
            }
            if (this.f186359a.mo128442c().f155817b.mo109896h() != 0) {
                return false;
            }
            AbstractC14318d a = this.f186359a.mo128444e().mo23095a(1);
            if (a != null && a.mo23057b(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
            AbstractC14318d a2 = this.f186359a.mo128444e().mo23095a(6);
            if (a2 != null && a2.mo23057b(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
            TabHost tabHost = this.f186359a.f186338k.f186306e;
            if (tabHost == null) {
                C89219l.m154710a("tabHost");
            }
            boolean a3 = C80471gb.m139483a(C2556g.m7473b(this.f186359a));
            if (motionEvent2.getX() > motionEvent.getX() && Math.abs(motionEvent.getX() - motionEvent2.getX()) > Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                if (!a3 || !C65436ds.m117154a()) {
                    C83422h.m143819a(tabHost);
                } else {
                    C83422h.m143821b(tabHost);
                }
                return true;
            } else if (motionEvent.getX() <= motionEvent2.getX() || Math.abs(motionEvent2.getX() - motionEvent.getX()) <= Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                return false;
            } else {
                if (!a3 || !C65436ds.m117154a()) {
                    C83422h.m143821b(tabHost);
                } else {
                    C83422h.m143819a(tabHost);
                }
                return true;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$h */
    static final class C83430h<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83422h f186367a;

        static {
            Covode.recordClassIndex(97316);
        }

        C83430h(C83422h hVar) {
            this.f186367a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f186367a.showBottomTab(false);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$r */
    static final class C83440r extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

        /* renamed from: a */
        public static final C83440r f186378a = new C83440r();

        static {
            Covode.recordClassIndex(97326);
        }

        C83440r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23024a aVar) {
            C89219l.m154721d(aVar, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$f */
    static final class C83428f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83422h f186365a;

        static {
            Covode.recordClassIndex(97314);
        }

        C83428f(C83422h hVar) {
            this.f186365a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f186365a.f186334g.mo128431a(true);
            this.f186365a.f186335h.mo128431a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$i */
    static final class C83431i<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83422h f186368a;

        static {
            Covode.recordClassIndex(97317);
        }

        C83431i(C83422h hVar) {
            this.f186368a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f186368a.f186337j.mo128479a(((C14191k) obj).f34465a);
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b
    public void notifyBottomTabIndexChange(C83408c cVar) {
        C89219l.m154721d(cVar, "");
        this.f186350w.mo6999a(cVar);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b
    public void showBottomTab(boolean z) {
        this.f186323A.mo6999a(Boolean.valueOf(z));
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$c */
    static final class C83425c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ AbstractC22186b f186360a;

        static {
            Covode.recordClassIndex(97311);
        }

        C83425c(AbstractC22186b bVar) {
            this.f186360a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                C22226a.m41823a(this.f186360a, "RecordBottomTabScene");
            } else {
                C22226a.m41824b(this.f186360a, "RecordBottomTabScene");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$e */
    static final class C83427e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83422h f186364a;

        static {
            Covode.recordClassIndex(97313);
        }

        C83427e(C83422h hVar) {
            this.f186364a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            AbstractC22219j a = this.f186364a.f186340m.mo36386a("RecordBottomTabScene");
            if (a == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(a, "");
            ((C83462j) a).mo128480a(num);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$p */
    static final class C83438p<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83422h f186375a;

        static {
            Covode.recordClassIndex(97324);
        }

        C83438p(C83422h hVar) {
            this.f186375a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            AbstractC22219j a = this.f186375a.f186340m.mo36386a("RecordBottomTabScene");
            if (a == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(a, "");
            ((C83462j) a).mo128481b(num);
        }
    }

    /* renamed from: b */
    public static void m143821b(TabHost tabHost) {
        if (tabHost.getCurrentIndex() < tabHost.getTabCount() - 1) {
            tabHost.mo116830a(tabHost.getCurrentIndex() + 1, 3);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b
    public void configSwitchDuration(C78610l lVar) {
        C89219l.m154721d(lVar, "");
        ((C70768ec) this.f186327E.getValue()).onEvent(lVar);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b
    public void resetToCurTab(String str) {
        C89219l.m154721d(str, "");
        int a = this.f186337j.mo128477a(str);
        if (a >= 0) {
            this.f186337j.mo128478a(a, false);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$o */
    static final class C83437o<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83422h f186374a;

        static {
            Covode.recordClassIndex(97323);
        }

        C83437o(C83422h hVar) {
            this.f186374a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f186374a.showBottomTab(false);
            this.f186374a.mo128440a(false);
            this.f186374a.f186334g.mo128431a(false);
            this.f186374a.f186335h.mo128431a(false);
            ShortVideoContext c = this.f186374a.mo128442c();
            if (c.f155764Y != c.f155763X) {
                c.f155764Y = c.f155763X;
                C71833a.m126854c(c.f155764Y);
            }
        }
    }

    /* renamed from: a */
    public static void m143819a(TabHost tabHost) {
        if (tabHost.getCurrentIndex() > 0) {
            tabHost.mo116830a(tabHost.getCurrentIndex() - 1, 3);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$g */
    static final class C83429g<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83422h f186366a;

        static {
            Covode.recordClassIndex(97315);
        }

        C83429g(C83422h hVar) {
            this.f186366a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C14207x xVar = (C14207x) obj;
            if (this.f186366a.mo128442c().f155817b.mo109896h() > 0) {
                if (C65366bf.m117062a() && !this.f186366a.mo128442c().f155817b.f155653i) {
                    C89219l.m154716b(xVar, "");
                    if (xVar.f34485a != 2) {
                        this.f186366a.f186334g.mo128430a(C73989bh.m130123a(this.f186366a.mo128442c().mo110043s()));
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (this.f186366a.mo128442c().f155817b.f155653i) {
                return;
            } else {
                if (C65366bf.m117062a()) {
                    this.f186366a.f186334g.mo128433c();
                }
            }
            this.f186366a.showBottomTab(true);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$j */
    static final class C83432j<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83422h f186369a;

        static {
            Covode.recordClassIndex(97318);
        }

        C83432j(C83422h hVar) {
            this.f186369a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C14192l lVar = (C14192l) obj;
            boolean z = false;
            if (lVar.f34468b) {
                if (this.f186369a.mo128442c().f155817b.mo109896h() == 0) {
                    z = true;
                }
                if (lVar.f34467a || (z && !this.f186369a.mo128442c().f155817b.f155653i)) {
                    if (C65366bf.m117062a()) {
                        this.f186369a.f186334g.mo128433c();
                    }
                    this.f186369a.showBottomTab(true);
                    this.f186369a.mo128440a(true);
                } else if (C65366bf.m117062a() && !this.f186369a.mo128438a().mo22747A().mo56984i() && !this.f186369a.mo128442c().f155817b.f155653i) {
                    this.f186369a.showBottomTab(true);
                }
            } else {
                this.f186369a.showBottomTab(false);
                this.f186369a.mo128440a(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$l */
    static final class C83434l<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83422h f186371a;

        static {
            Covode.recordClassIndex(97320);
        }

        C83434l(C83422h hVar) {
            this.f186371a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            String str = (String) obj;
            if (!this.f186371a.mo128442c().mo110018b()) {
                return;
            }
            if (C89219l.m154714a((Object) str, (Object) C80573ig.m139668a(R.string.f7r)) || C89219l.m154714a((Object) str, (Object) "record_mode_mv")) {
                C83422h hVar = this.f186371a;
                C23025b bVar = new C23025b(C2556g.m7473b(hVar));
                bVar.mo37416a(R.string.fru, new C83439q(hVar, str));
                bVar.mo37418b(R.string.b0_, C83440r.f186378a);
                ((C23023b) ((C23023b) C23013a.C23015a.m43405a(C2556g.m7473b(hVar)).mo37479a(R.string.frw).mo37483b(R.string.frv)).mo37407a(bVar).mo37482a(false)).mo37405a().mo37396b().show();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$q */
    static final class C83439q extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83422h f186376a;

        /* renamed from: b */
        final /* synthetic */ String f186377b;

        static {
            Covode.recordClassIndex(97325);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83439q(C83422h hVar, String str) {
            super(1);
            this.f186376a = hVar;
            this.f186377b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23024a aVar) {
            C89219l.m154721d(aVar, "");
            C83422h hVar = this.f186376a;
            C75346e.m132156a(hVar.mo128443d(), (Effect) null);
            C78105b.m136529a(C78104a.f175370a);
            hVar.mo128443d().mo128898F().mo109783a();
            hVar.mo128442c().mo110013a(false);
            hVar.f186330c.mo113510a(true, false);
            hVar.mo128441b().mo22893c(true);
            ((AbstractC14333c) hVar.f186332e.mo23374a(hVar, C83422h.f186322a[7])).mo23139a(true);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private final void m143820a(String str) {
        AbstractC83881a aVar = (AbstractC83881a) getDiContainer().mo35252b(AbstractC83881a.class, null);
        if (aVar == null || !aVar.mo123014e()) {
            T value = getComplexTabVisibility().f7727a.getValue();
            if (value == null || value.intValue() != 0) {
                mo128439a(new C83408c("by_default", str, 0, false, false, 24));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$d */
    public static final class C83426d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83422h f186361a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f186362b;

        /* renamed from: c */
        final /* synthetic */ C83414f f186363c;

        static {
            Covode.recordClassIndex(97312);
        }

        C83426d(C83422h hVar, AbstractC22186b bVar, C83414f fVar) {
            this.f186361a = hVar;
            this.f186362b = bVar;
            this.f186363c = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                bool.booleanValue();
                if (this.f186363c.f186300c != null) {
                    if (bool.booleanValue()) {
                        if (C89219l.m154714a((Object) this.f186363c.f186300c.mo108523a(), (Object) "RecordLiveScene")) {
                            this.f186363c.f186300c.mo122519D();
                            Activity activity = this.f186362b.f52549m;
                            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
                            ((VideoRecordNewActivity) activity).mo115991a(true, false);
                            if (this.f186361a.isZTLiveSwitch()) {
                                this.f186361a.mo128445f();
                            }
                        }
                        this.f186362b.mo36417e(this.f186363c.f186300c);
                        this.f186363c.f186300c.mo108524b();
                        return;
                    }
                    if (C89219l.m154714a((Object) this.f186363c.f186300c.mo108523a(), (Object) "RecordLiveScene")) {
                        this.f186363c.f186300c.mo122519D();
                        Activity activity2 = this.f186362b.f52549m;
                        Objects.requireNonNull(activity2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
                        ((VideoRecordNewActivity) activity2).mo115991a(false, true);
                    }
                    this.f186363c.f186300c.mo108525d();
                    this.f186362b.mo36413d(this.f186363c.f186300c);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$m */
    static final class C83435m<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83422h f186372a;

        static {
            Covode.recordClassIndex(97321);
        }

        C83435m(C83422h hVar) {
            this.f186372a = hVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: h.h.d */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C83408c cVar = (C83408c) obj;
            C83422h hVar = this.f186372a;
            C89219l.m154716b(cVar, "");
            hVar.mo128439a(cVar);
            String string = this.f186372a.f186340m.mo36486t().getString(R.string.f7u);
            C89219l.m154716b(string, "");
            if (TextUtils.equals((CharSequence) cVar.f186276b, string)) {
                Object obj2 = cVar.f186277c;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
                if (!TextUtils.equals((CharSequence) obj2, string)) {
                    C83422h hVar2 = this.f186372a;
                    ((AbstractC83746a) hVar2.f186331d.mo23374a(hVar2, C83422h.f186322a[3])).mo128714a(true);
                }
            }
            if (!TextUtils.equals((CharSequence) cVar.f186276b, "record_mode_mv")) {
                Object obj3 = cVar.f186277c;
                Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.CharSequence");
                if (TextUtils.equals((CharSequence) obj3, "record_mode_mv")) {
                    this.f186372a.mo128438a().mo22777a(0);
                }
            }
            String str = (String) cVar.f186277c;
            if (!C89219l.m154714a((Object) str, (Object) C80573ig.m139668a(R.string.f7r))) {
                this.f186372a.f186339l = C76058a.C76059a.m133344a(str);
            }
            this.f186372a.mo128443d().mo128908e(this.f186372a.f186339l);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.h$n */
    static final class C83436n<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83422h f186373a;

        static {
            Covode.recordClassIndex(97322);
        }

        C83436n(C83422h hVar) {
            this.f186373a = hVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C14201t tVar = (C14201t) obj;
            if (tVar == null) {
                return;
            }
            if (!tVar.f34476a.isEmpty() || tVar.f34477b != 0) {
                if (!C65366bf.m117062a() || this.f186373a.mo128438a().mo22747A().mo56984i() || this.f186373a.mo128442c().f155817b.f155653i) {
                    this.f186373a.showBottomTab(false);
                } else if (this.f186373a.mo128442c().f155817b.mo109896h() < this.f186373a.mo128442c().f155817b.mo109899k() && this.f186373a.mo128442c().f155763X != 15) {
                    this.f186373a.f186334g.mo128430a(C73989bh.m130123a(this.f186373a.mo128442c().mo110043s()));
                    this.f186373a.showBottomTab(true);
                }
            } else if (!this.f186373a.mo128442c().f155817b.f155653i && tVar.f34479d) {
                if (C65366bf.m117062a()) {
                    this.f186373a.f186334g.mo128433c();
                }
                this.f186373a.showBottomTab(true);
                this.f186373a.mo128440a(true);
            }
        }
    }

    /* renamed from: a */
    public final void mo128439a(C83408c cVar) {
        C84425b a;
        C89219l.m154721d(cVar, "");
        if (cVar.f186279e) {
            String str = "";
            for (C83414f fVar : this.f186334g.f186288a) {
                Object obj = cVar.f186277c;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                if (TextUtils.equals((CharSequence) obj, fVar.f186299b.f186283c)) {
                    str = fVar.f186299b.f186284d;
                }
            }
            for (C83414f fVar2 : this.f186335h.f186288a) {
                Object obj2 = cVar.f186277c;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
                if (TextUtils.equals((CharSequence) obj2, fVar2.f186299b.f186283c)) {
                    str = fVar2.f186299b.f186284d;
                }
            }
            if (!TextUtils.equals(str, "")) {
                if (TextUtils.equals(str, "video_15")) {
                    str = "camera";
                }
                C84425b a2 = new C84425b().mo129406a("creation_id", mo128442c().f155830o).mo129406a("shoot_way", mo128442c().f155831p).mo129403a("draft_id", mo128442c().f155740A).mo129406a("to_status", str).mo129406a("from_status", C73989bh.m130122a(cVar.f186276b)).mo129406a("shoot_page", "video_shoot_page");
                if (!C65366bf.m117062a() || mo128442c().f155817b.mo109896h() <= 0) {
                    a = a2.mo129406a("enter_from", "video_shoot_page");
                } else {
                    a = a2.mo129406a("enter_from", "video_recording_page");
                }
                C39162r.m79460a("change_record_mode", a.f188764a);
            }
        }
    }

    /* renamed from: a */
    public final void mo128440a(boolean z) {
        int i;
        if (getCurrentBottomTag().equals(C80573ig.m139668a(R.string.f7r))) {
            TabHost tabHost = this.f186338k.f186306e;
            if (tabHost == null) {
                C89219l.m154710a("tabHost");
            }
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            tabHost.setVisibility(i);
        }
    }

    /* renamed from: a */
    private final void m143817a(AbstractC22186b bVar, C83414f fVar) {
        fVar.f186298a.observe(C22227b.m41826b(bVar), new C83426d(this, bVar, fVar));
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b
    public void setCurrentTab(String str, boolean z) {
        C89219l.m154721d(str, "");
        this.f186334g.mo128429a(str, z);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b
    public void showComplexTab(int i, C83408c cVar) {
        this.f186338k.f186308g = cVar;
        this.f186333f.mo7019b(Integer.valueOf(i));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    /* renamed from: a */
    static void m143818a(AbstractC22186b bVar, C83414f fVar, boolean z) {
        AbstractC22219j a = bVar.mo36386a("RecordBottomTabScene");
        if (a == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(a, "");
        C83462j jVar = (C83462j) a;
        int a2 = jVar.mo128477a(fVar.f186299b.f186283c);
        if (a2 >= 0) {
            jVar.mo128478a(a2, z);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b
    public void addBottomTab(int i, AbstractC83405a aVar, int i2) {
        C89219l.m154721d(aVar, "");
        AbstractC22186b bVar = this.f186340m;
        Iterator<T> it = this.f186334g.f186288a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            String str = next.f186299b.f186283c;
            C82004a aVar2 = this.f186349v;
            if (aVar2 == null) {
                C89219l.m154710a("recordEnv");
            }
            if (C89219l.m154714a((Object) str, (Object) aVar.createBottomTabItem(aVar2).f186283c)) {
                if (next != null) {
                    return;
                }
            }
        }
        C83410e eVar = this.f186334g;
        C82004a aVar3 = this.f186349v;
        if (aVar3 == null) {
            C89219l.m154710a("recordEnv");
        }
        C83414f a = eVar.mo128424a(aVar3, i, aVar);
        m143817a(bVar, a);
        AbstractC83467k kVar = a.f186300c;
        if (kVar != null) {
            C22226a.m41822a(bVar, R.id.dg_, kVar, kVar.mo108523a());
        }
        if (a.f186299b.f186285e) {
            C22228c.m41831a(bVar, new RunnableC83423a(bVar, a, this, aVar, i), 500);
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: java.util.List<? extends com.ss.android.ugc.gamora.recorder.b.a> */
    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: java.util.List<? extends com.ss.android.ugc.gamora.recorder.b.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public C83422h(AbstractC22186b bVar, C21582f fVar, List<? extends AbstractC83405a> list, List<? extends AbstractC83405a> list2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f186340m = bVar;
        this.f186328F = fVar;
        this.f186341n = list;
        this.f186342o = list2;
        Object a = getDiContainer().mo35249a(AbstractC71864a.class, (String) null);
        C89219l.m154716b(a, "");
        AbstractC71864a aVar = (AbstractC71864a) a;
        this.f186330c = aVar;
        this.f186343p = C21572a.m40504a(getDiContainer(), AbstractC14209z.class);
        this.f186344q = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);
        this.f186345r = C21572a.m40504a(getDiContainer(), ShortVideoContext.class);
        this.f186331d = C21572a.m40504a(getDiContainer(), AbstractC83746a.class);
        this.f186346s = C21572a.m40504a(getDiContainer(), AbstractC83490a.class);
        this.f186347t = C21572a.m40504a(getDiContainer(), AbstractC84089j.class);
        this.f186348u = C21572a.m40504a(getDiContainer(), AbstractC14315b.class);
        this.f186332e = C21572a.m40504a(getDiContainer(), AbstractC14333c.class);
        C2563k<C83408c> kVar = new C2563k<>();
        this.f186350w = kVar;
        C2563k<String> kVar2 = new C2563k<>();
        this.f186351x = kVar2;
        this.f186352y = kVar;
        this.f186353z = kVar2;
        C2564l<Integer> lVar = new C2564l<>(8);
        this.f186333f = lVar;
        C83410e eVar = new C83410e();
        this.f186334g = eVar;
        C83410e eVar2 = new C83410e();
        this.f186335h = eVar2;
        C2563k<Boolean> kVar3 = new C2563k<>();
        this.f186323A = kVar3;
        this.f186336i = new C2549d<>(null);
        this.f186324B = new C2563k<>();
        this.f186325C = new C2563k<>();
        this.f186337j = new C83462j(getDiContainer(), mo128442c(), eVar, aVar.mo113513c());
        this.f186338k = new C83415g(getDiContainer(), mo128442c(), eVar2, lVar, aVar.mo113513c(), kVar3);
        this.f186327E = C89250i.m154774a(EnumC89331m.NONE, new C83441s(this));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
