package com.p2082ss.android.ugc.gamora.recorder.p4298e;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2563k;
import com.bytedance.als.C2564l;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14201t;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68109p;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.gamora.recorder.e.b */
public class C83635b extends AbstractC2562j<AbstractC83634a> implements AbstractC21566a, AbstractC83634a {
    static final /* synthetic */ AbstractC89286i[] $$delegatedProperties = {new C89232y(C83635b.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new C89232y(C83635b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C89232y(C83635b.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C89232y(C83635b.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0)};
    public final AbstractC83634a apiComponent = this;
    private final C21582f diContainer;
    private final C2563k<C89391z> dismissSuperEntranceEvent;
    private final C2563k<C89391z> dismissUploadPopEntranceEvent;
    private final C2564l<Integer> effectContainerVisibility;
    private final C2563k<C89391z> needNoTouchListener;
    public final AbstractC22186b parentScene;
    private final AbstractC89248d planCUIApiComponent$delegate = C21572a.m40504a(getDiContainer(), AbstractC71864a.class);
    private final AbstractC89248d recordControlApi$delegate = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);
    private final C83642d recordDockBarScene;
    private final AbstractC89248d shortVideoContext$delegate = C21572a.m40504a(getDiContainer(), ShortVideoContext.class);
    private final AbstractC89244h shortVideoContextViewModel$delegate = C89250i.m154774a(EnumC89331m.NONE, new C83636a(this));
    private final AbstractC89248d stickerApiComponent$delegate = C21572a.m40504a(getDiContainer(), AbstractC84089j.class);
    public final C2564l<Integer> uploadVisibility;

    static {
        Covode.recordClassIndex(97525);
    }

    private final AbstractC71864a getPlanCUIApiComponent() {
        return (AbstractC71864a) this.planCUIApiComponent$delegate.mo23374a(this, $$delegatedProperties[0]);
    }

    private final ShortVideoContextViewModel getShortVideoContextViewModel() {
        return (ShortVideoContextViewModel) this.shortVideoContextViewModel$delegate.getValue();
    }

    private final AbstractC84089j getStickerApiComponent() {
        return (AbstractC84089j) this.stickerApiComponent$delegate.mo23374a(this, $$delegatedProperties[2]);
    }

    public final AbstractC14193m getRecordControlApi() {
        return (AbstractC14193m) this.recordControlApi$delegate.mo23374a(this, $$delegatedProperties[1]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.shortVideoContext$delegate.mo23374a(this, $$delegatedProperties[3]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public /* bridge */ /* synthetic */ AbstractC83634a getApiComponent() {
        return this.apiComponent;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.diContainer;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4298e.AbstractC83634a
    public void dismissSuperEntranceEvent() {
        this.dismissSuperEntranceEvent.mo6999a(C89391z.f203057a);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4298e.AbstractC83634a
    public void dismissUploadPopEntranceEvent() {
        this.dismissUploadPopEntranceEvent.mo6999a(C89391z.f203057a);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4298e.AbstractC83634a
    public C2559g<C89391z> getNoBlockTouchEvent() {
        return this.recordDockBarScene.f186739d;
    }

    public final void hideUploadAndEffect() {
        setUploadVisibility(8);
        setEffectContainerVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.b$a */
    public static final class C83636a extends AbstractC89220m implements AbstractC89171a<ShortVideoContextViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186721a;

        static {
            Covode.recordClassIndex(97526);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83636a(AbstractC21566a aVar) {
            super(0);
            this.f186721a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.ac, com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186721a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<androidx.fragment.app.e> r1 = androidx.fragment.app.ActivityC0945e.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                androidx.fragment.app.e r0 = (androidx.fragment.app.ActivityC0945e) r0
                androidx.lifecycle.ad r1 = m143972x44132918(r0)
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel> r0 = com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel.class
                androidx.lifecycle.ac r0 = r1.mo3983a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.recorder.p4298e.C83635b.C83636a.invoke():androidx.lifecycle.ac");
        }

        /* renamed from: com_ss_android_ugc_gamora_recorder_control_RecordDockBarComponent$$special$$inlined$viewModel$1_androidx_lifecycle_VScopeLancet_of */
        public static C1175ad m143972x44132918(ActivityC0945e eVar) {
            return C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4298e.AbstractC83634a
    public void dismissLivePopupEvent() {
        ((AbstractC83406b) getDiContainer().mo35249a(AbstractC83406b.class, (String) null)).hidePopupForLiveTab();
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onCreate() {
        super.onCreate();
        this.parentScene.mo36387a(R.id.dg9, this.recordDockBarScene, "RecordDockBarScene");
        getRecordControlApi().mo22908o().mo7038b(this, new C83637b(this));
        getPlanCUIApiComponent().mo113507a().mo7036a(this, new C83638c(this));
        getRecordControlApi().mo22904k().mo6997a(this, new C83639d(this));
        getRecordControlApi().mo22916w().mo6997a(this, new C83640e(this));
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4298e.AbstractC83634a
    public void setNeedNoTouchListener(boolean z) {
        this.needNoTouchListener.mo6999a(C89391z.f203057a);
    }

    public void setEffectContainerVisibility(int i) {
        this.effectContainerVisibility.mo7019b(Integer.valueOf(i));
    }

    public void setUploadVisibility(int i) {
        this.uploadVisibility.mo7019b(Integer.valueOf(i));
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.b$e */
    static final class C83640e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83635b f186725a;

        static {
            Covode.recordClassIndex(97530);
        }

        C83640e(C83635b bVar) {
            this.f186725a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f186725a.getShortVideoContext().mo110018b()) {
                this.f186725a.hideUploadAndEffect();
            } else {
                this.f186725a.setUploadVisibility(4);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.b$d */
    static final class C83639d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83635b f186724a;

        static {
            Covode.recordClassIndex(97529);
        }

        C83639d(C83635b bVar) {
            this.f186724a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f186724a.getShortVideoContext().mo110018b()) {
                this.f186724a.hideUploadAndEffect();
            } else if (this.f186724a.getShortVideoContext().f155817b.mo109896h() > 0) {
                this.f186724a.setUploadVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.b$b */
    static final class C83637b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83635b f186722a;

        static {
            Covode.recordClassIndex(97527);
        }

        C83637b(C83635b bVar) {
            this.f186722a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C14201t tVar = (C14201t) obj;
            if (this.f186722a.getShortVideoContext().mo110018b()) {
                this.f186722a.hideUploadAndEffect();
            } else if (tVar == null) {
            } else {
                if (!tVar.f34476a.isEmpty() || tVar.f34477b != 0) {
                    this.f186722a.getShortVideoContext();
                    if (C68109p.m120400a() == 2) {
                        T value = this.f186722a.uploadVisibility.f7727a.getValue();
                        if (value == null || value.intValue() != 4) {
                            this.f186722a.setUploadVisibility(4);
                            return;
                        }
                        return;
                    }
                    this.f186722a.setUploadVisibility(4);
                } else if (!this.f186722a.getShortVideoContext().f155817b.f155653i && tVar.f34479d && !this.f186722a.getShortVideoContext().f155817b.mo109889b() && !this.f186722a.getShortVideoContext().f155817b.mo109890c() && !this.f186722a.getShortVideoContext().mo110022c()) {
                    T value2 = this.f186722a.getRecordControlApi().mo22891c().f7727a.getValue();
                    C89219l.m154716b(value2, "");
                    if (value2.booleanValue()) {
                        this.f186722a.setUploadVisibility(0);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.e.b$c */
    static final class C83638c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83635b f186723a;

        static {
            Covode.recordClassIndex(97528);
        }

        C83638c(C83635b bVar) {
            this.f186723a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            if (this.f186723a.getShortVideoContext().mo110018b()) {
                this.f186723a.hideUploadAndEffect();
                return;
            }
            C89219l.m154716b(bool, "");
            int i2 = 0;
            if (!bool.booleanValue() || this.f186723a.getShortVideoContext().f155817b.mo109896h() > 0) {
                this.f186723a.setUploadVisibility(8);
            } else {
                C83635b bVar = this.f186723a;
                if (bVar.getShortVideoContext().f155817b.f155653i || this.f186723a.getShortVideoContext().mo110022c()) {
                    i = 8;
                } else {
                    i = 0;
                }
                bVar.setUploadVisibility(i);
            }
            C83635b bVar2 = this.f186723a;
            if (!bool.booleanValue()) {
                i2 = 4;
            }
            bVar2.setEffectContainerVisibility(i2);
            if (this.f186723a.getShortVideoContext().f155817b.mo109889b() || this.f186723a.getShortVideoContext().f155817b.mo109890c()) {
                this.f186723a.setUploadVisibility(8);
            }
        }
    }

    public C83635b(AbstractC22186b bVar, C21582f fVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        this.parentScene = bVar;
        this.diContainer = fVar;
        C2564l<Integer> lVar = new C2564l<>(8);
        this.effectContainerVisibility = lVar;
        C2563k<C89391z> kVar = new C2563k<>();
        this.dismissSuperEntranceEvent = kVar;
        C2563k<C89391z> kVar2 = new C2563k<>();
        this.dismissUploadPopEntranceEvent = kVar2;
        C2564l<Integer> lVar2 = new C2564l<>(8);
        this.uploadVisibility = lVar2;
        C2563k<C89391z> kVar3 = new C2563k<>();
        this.needNoTouchListener = kVar3;
        this.recordDockBarScene = new C83642d(getDiContainer(), lVar, lVar2, kVar3, getPlanCUIApiComponent().mo113513c(), new C83641c(kVar, kVar2, getStickerApiComponent().mo128896D().mo128841a()));
    }
}
