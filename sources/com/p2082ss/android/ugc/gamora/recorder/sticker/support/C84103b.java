package com.p2082ss.android.ugc.gamora.recorder.sticker.support;

import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import com.bef.effectsdk.view.BEFView;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.gamora.recorder.sticker.support.b */
public final class C84103b extends AbstractC2562j<AbstractC84102a> implements AbstractC21566a, AbstractC84102a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f187688a = {new C89232y(C84103b.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C84103b.class, "stickerApi", "getStickerApi()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0)};

    /* renamed from: b */
    public BEFView f187689b;

    /* renamed from: c */
    public final ActivityC0945e f187690c = ((ActivityC0945e) getDiContainer().mo35249a(ActivityC0945e.class, (String) null));

    /* renamed from: d */
    private final AbstractC89248d f187691d = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);

    /* renamed from: e */
    private final AbstractC89248d f187692e = C21572a.m40504a(getDiContainer(), AbstractC84089j.class);

    /* renamed from: f */
    private final AbstractC89244h f187693f = C89250i.m154773a((AbstractC89171a) new C84106c(this));

    /* renamed from: g */
    private final StickerSupportLogicComponent$lifecycleObserver$1 f187694g = new StickerSupportLogicComponent$lifecycleObserver$1(this);

    /* renamed from: h */
    private final C21582f f187695h;

    static {
        Covode.recordClassIndex(97999);
    }

    /* renamed from: c */
    private AbstractC14177d m144618c() {
        return (AbstractC14177d) this.f187691d.mo23374a(this, f187688a[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final FrameLayout mo128932a() {
        return (FrameLayout) this.f187693f.getValue();
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC84102a getApiComponent() {
        return this;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f187695h;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.support.b$c */
    static final class C84106c extends AbstractC89220m implements AbstractC89171a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ C84103b f187698a;

        static {
            Covode.recordClassIndex(98002);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84106c(C84103b bVar) {
            super(0);
            this.f187698a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FrameLayout invoke() {
            return this.f187698a.f187690c.findViewById(R.id.dge);
        }
    }

    /* renamed from: b */
    public final void mo128933b() {
        long aj = m144618c().mo22802aj();
        BEFView bEFView = this.f187689b;
        if (bEFView != null) {
            bEFView.attachEffect(aj);
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onDestroy() {
        MethodCollector.m26663i(9103);
        super.onDestroy();
        BEFView bEFView = this.f187689b;
        if (bEFView != null) {
            bEFView.onPause();
            mo128932a().removeView(bEFView);
            bEFView.onDestroy();
        }
        this.f187689b = null;
        this.f187690c.getLifecycle().mo4013b(this.f187694g);
        MethodCollector.m26664o(9103);
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        m144618c().mo22818g().mo7036a(this, new C84104a(this));
        ((AbstractC84089j) this.f187692e.mo23374a(this, f187688a[1])).mo23167t().mo119302n().mo119323b().observe(this, new C84105b(this));
        this.f187690c.getLifecycle().mo4012a(this.f187694g);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.support.b$a */
    static final class C84104a<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C84103b f187696a;

        static {
            Covode.recordClassIndex(98000);
        }

        C84104a(C84103b bVar) {
            this.f187696a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && bool.booleanValue()) {
                this.f187696a.mo128933b();
            }
        }
    }

    /* renamed from: a */
    static BEFView.FitMode m144617a(int i) {
        if (i == 0) {
            return BEFView.FitMode.FIT_WIDTH;
        }
        if (i == 1) {
            return BEFView.FitMode.FIT_HEIGHT;
        }
        if (i == 2) {
            return BEFView.FitMode.FILL_SCREEN;
        }
        if (i == 3) {
            return BEFView.FitMode.FIT_WIDTH_BOTTOM;
        }
        if (i != 4) {
            return null;
        }
        return BEFView.FitMode.NO_CLIP;
    }

    public C84103b(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f187695h = fVar;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.support.b$b */
    static final class C84105b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C84103b f187697a;

        static {
            Covode.recordClassIndex(98001);
        }

        C84105b(C84103b bVar) {
            this.f187697a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            MethodCollector.m26663i(10119);
            EffectTemplate effectTemplate = (EffectTemplate) obj;
            C84103b bVar = this.f187697a;
            BEFView bEFView = bVar.f187689b;
            if (bEFView != null) {
                bEFView.setStickerPath("");
            }
            BEFView bEFView2 = bVar.f187689b;
            if (bEFView2 != null) {
                bEFView2.onPause();
                bVar.mo128932a().removeView(bEFView2);
                bEFView2.onDestroy();
            }
            bVar.f187689b = null;
            if (effectTemplate != null && !TextUtils.isEmpty(effectTemplate.getSdkExtra())) {
                try {
                    JSONObject jSONObject = new JSONObject(effectTemplate.getSdkExtra());
                    String optString = jSONObject.optString("befViewResRoot");
                    if (!TextUtils.isEmpty(optString)) {
                        ActivityC0945e eVar = bVar.f187690c;
                        double optDouble = jSONObject.optDouble("befViewRenderFPS");
                        int optInt = jSONObject.optInt("befViewFitMode", -1);
                        int[] g = C65357b.m117051g();
                        BEFView.Builder obtain = BEFView.Builder.obtain();
                        if (g != null && g.length >= 2) {
                            obtain = obtain.setRenderSize(g[0], g[1]);
                        }
                        if (!Double.isNaN(optDouble)) {
                            obtain = obtain.setFPS(optDouble);
                        }
                        if (C84103b.m144617a(optInt) != null) {
                            obtain = obtain.setFitMode(C84103b.m144617a(optInt));
                        }
                        bVar.f187689b = obtain.build(eVar);
                        BEFView bEFView3 = bVar.f187689b;
                        if (bEFView3 != null) {
                            bEFView3.setOpaque(false);
                        }
                        bVar.mo128933b();
                        bVar.mo128932a().addView(bVar.f187689b);
                        C33398a.f79357a.mo59450a(bVar.f187689b, 576, 1024);
                        String str = effectTemplate.getUnzipPath() + File.separator + optString;
                        BEFView bEFView4 = bVar.f187689b;
                        if (bEFView4 != null) {
                            bEFView4.setStickerPath(str);
                            MethodCollector.m26664o(10119);
                            return;
                        }
                        MethodCollector.m26664o(10119);
                        return;
                    }
                } catch (Exception e) {
                    C84911q.m145926b("fail to get sticker support resource path from sticker.sdkExtra");
                    e.printStackTrace();
                }
            }
            MethodCollector.m26664o(10119);
        }
    }
}
