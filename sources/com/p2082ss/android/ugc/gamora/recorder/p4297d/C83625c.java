package com.p2082ss.android.ugc.gamora.recorder.p4297d;

import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2549d;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22226a;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.presenter.handler.p3980c.AbstractC75620c;
import com.p2082ss.android.ugc.aweme.tools.C78483e;
import com.p2082ss.android.ugc.gamora.recorder.p4305l.AbstractC83869f;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.gamora.recorder.d.c */
public final class C83625c extends AbstractC2562j<AbstractC83623a> implements AbstractC21566a, AbstractC83623a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f186697a = {new C89232y(C83625c.class, "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/gamora/recorder/speed/SpeedApiComponent;", 0)};

    /* renamed from: b */
    public final AbstractC83623a f186698b = this;

    /* renamed from: c */
    public boolean f186699c;

    /* renamed from: d */
    public final AbstractC22186b f186700d;

    /* renamed from: e */
    private final AbstractC71864a f186701e = ((AbstractC71864a) getDiContainer().mo35249a(AbstractC71864a.class, (String) null));

    /* renamed from: f */
    private final AbstractC89248d f186702f = C21572a.m40504a(getDiContainer(), AbstractC83869f.class);

    /* renamed from: g */
    private final AbstractC84089j f186703g = ((AbstractC84089j) getDiContainer().mo35249a(AbstractC84089j.class, (String) null));

    /* renamed from: h */
    private final ShortVideoContext f186704h = ((ShortVideoContext) getDiContainer().mo35249a(ShortVideoContext.class, (String) null));

    /* renamed from: i */
    private final C2549d<Boolean> f186705i = new C2549d<>(true);

    /* renamed from: j */
    private final C21582f f186706j;

    static {
        Covode.recordClassIndex(97515);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC83623a getApiComponent() {
        return this.f186698b;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f186706j;
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onPause() {
        super.onPause();
        C83630d dVar = (C83630d) this.f186700d.mo36386a("RecordCommerceTagScene");
        if (dVar != null) {
            FaceStickerBean faceStickerBean = FaceStickerBean.NONE;
            C89219l.m154716b(faceStickerBean, "");
            dVar.f186712a = faceStickerBean.getStickerId();
        }
    }

    /* renamed from: a */
    public final void mo128638a() {
        FaceStickerBean i = this.f186703g.mo23127i();
        if (i != null && C83624b.m143964a(i)) {
            ((AbstractC83869f) this.f186702f.mo23374a(this, f186697a[0])).mo128761b(false);
        }
        mo128639b();
    }

    /* renamed from: b */
    public final void mo128639b() {
        boolean z;
        FaceStickerBean i = this.f186703g.mo23127i();
        if (i != null) {
            z = C83624b.m143964a(i);
        } else {
            z = false;
        }
        if (this.f186699c && z) {
            T value = this.f186705i.f7727a.getValue();
            C89219l.m154716b(value, "");
            if (value.booleanValue()) {
                C83630d dVar = (C83630d) this.f186700d.mo36386a("RecordCommerceTagScene");
                if (dVar != null && dVar.mo128640a(new C78483e(this.f186703g.mo23127i(), this.f186704h.f155831p))) {
                    C70005cr a = C70005cr.m123611a();
                    C89219l.m154716b(a, "");
                    a.f156490i = true;
                    C70005cr a2 = C70005cr.m123611a();
                    C89219l.m154716b(a2, "");
                    a2.f156491j = true;
                    return;
                }
                return;
            }
        }
        C22226a.m41824b(this.f186700d, "RecordCommerceTagScene");
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        C22226a.m41822a(this.f186700d, R.id.dg9, new C83630d(this.f186701e.mo113513c()), "RecordCommerceTagScene");
        this.f186705i.mo7036a(this, new C83626a(this));
        this.f186701e.mo113507a().mo7036a(this, new C83627b(this));
        this.f186703g.mo23124f().mo6997a(this, new C83628c(this));
        this.f186703g.mo23122d().mo6997a(this, new C83629d(this));
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.d.c$a */
    static final class C83626a<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83625c f186707a;

        static {
            Covode.recordClassIndex(97516);
        }

        C83626a(C83625c cVar) {
            this.f186707a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f186707a.mo128639b();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.d.c$d */
    static final class C83629d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83625c f186710a;

        static {
            Covode.recordClassIndex(97519);
        }

        C83629d(C83625c cVar) {
            this.f186710a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f186710a.mo128638a();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.d.c$c */
    static final class C83628c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83625c f186709a;

        static {
            Covode.recordClassIndex(97518);
        }

        C83628c(C83625c cVar) {
            this.f186709a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC75620c cVar = (AbstractC75620c) obj;
            C83625c cVar2 = this.f186709a;
            if (cVar != null) {
                cVar.mo119346a();
            }
            cVar2.mo128638a();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4297d.AbstractC83623a
    /* renamed from: a */
    public final void mo128637a(boolean z) {
        this.f186705i.mo7019b(Boolean.valueOf(z));
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.d.c$b */
    static final class C83627b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83625c f186708a;

        static {
            Covode.recordClassIndex(97517);
        }

        C83627b(C83625c cVar) {
            this.f186708a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C83625c cVar = this.f186708a;
            C89219l.m154716b(bool, "");
            cVar.f186699c = bool.booleanValue();
            this.f186708a.mo128639b();
        }
    }

    public C83625c(AbstractC22186b bVar, C21582f fVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        this.f186700d = bVar;
        this.f186706j = fVar;
    }
}
