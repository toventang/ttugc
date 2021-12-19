package com.p2082ss.android.ugc.aweme.ttep.ttepcomponent;

import android.view.MotionEvent;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14315b;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14318d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.asve.p2217f.C31098f;
import com.p2082ss.android.ugc.aweme.sticker.p3958f.C75346e;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75704j;
import com.p2082ss.android.ugc.aweme.ttep.ttepcomponent.p4156c.C79323a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.vesdk.C85346av;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.TTEPPreviewEffectLogicComponent */
public final class TTEPPreviewEffectLogicComponent extends AbstractC2562j<AbstractC79278a> implements AbstractC21566a, AbstractC79278a {
    static final /* synthetic */ AbstractC89286i[] $$delegatedProperties = {new C89232y(TTEPPreviewEffectLogicComponent.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C89232y(TTEPPreviewEffectLogicComponent.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0), new C89232y(TTEPPreviewEffectLogicComponent.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0), new C89232y(TTEPPreviewEffectLogicComponent.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0)};
    private final ActivityC0945e activity = ((ActivityC0945e) getDiContainer().mo35249a(ActivityC0945e.class, (String) null));
    private final AbstractC89248d cameraApi$delegate = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);
    private final C21582f diContainer;
    private final AbstractC89248d filterApiComponent$delegate = C21572a.m40504a(getDiContainer(), AbstractC14210a.class);
    private final AbstractC89248d gestureApiComponent$delegate = C21572a.m40504a(getDiContainer(), AbstractC14315b.class);
    private boolean isFirst = true;
    private final AbstractC89248d stickerApiComponent$delegate = C21572a.m40504a(getDiContainer(), AbstractC84089j.class);

    static {
        Covode.recordClassIndex(92464);
    }

    private final AbstractC14210a getFilterApiComponent() {
        return (AbstractC14210a) this.filterApiComponent$delegate.mo23374a(this, $$delegatedProperties[1]);
    }

    private final AbstractC14315b getGestureApiComponent() {
        return (AbstractC14315b) this.gestureApiComponent$delegate.mo23374a(this, $$delegatedProperties[2]);
    }

    private final AbstractC84089j getStickerApiComponent() {
        return (AbstractC84089j) this.stickerApiComponent$delegate.mo23374a(this, $$delegatedProperties[0]);
    }

    public final AbstractC14177d getCameraApi() {
        return (AbstractC14177d) this.cameraApi$delegate.mo23374a(this, $$delegatedProperties[3]);
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.TTEPPreviewEffectLogicComponent$b */
    public static final class C79277b extends AbstractC14318d {
        static {
            Covode.recordClassIndex(92467);
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14313b
        /* renamed from: c */
        public final boolean mo23062c(MotionEvent motionEvent) {
            return true;
        }

        C79277b() {
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final AbstractC79278a getApiComponent() {
        return this;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.diContainer;
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.TTEPPreviewEffectLogicComponent$a */
    public static final class C79275a implements AbstractC89188r<Integer, Integer, String, C85346av, C89391z> {

        /* renamed from: a */
        final /* synthetic */ TTEPPreviewEffectLogicComponent f178098a;

        static {
            Covode.recordClassIndex(92465);
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.TTEPPreviewEffectLogicComponent$a$a */
        static final class C79276a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C79275a f178099a;

            static {
                Covode.recordClassIndex(92466);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C79276a(C79275a aVar) {
                super(0);
                this.f178099a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f178099a.f178098a.applyEffect();
                return C89391z.f203057a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C79275a(TTEPPreviewEffectLogicComponent tTEPPreviewEffectLogicComponent) {
            this.f178098a = tTEPPreviewEffectLogicComponent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8774a(Integer num, Integer num2, String str, C85346av avVar) {
            int intValue = num.intValue();
            num2.intValue();
            C89219l.m154721d(avVar, "");
            if (intValue == 1050) {
                this.f178098a.getCameraApi().mo22747A().mo56928b(this);
                C31098f.m64301a(new C79276a(this));
            }
            return C89391z.f203057a;
        }
    }

    private final Effect getPreviewEffect() {
        return (Effect) this.activity.getIntent().getParcelableExtra("extra_ttep_preview_effect");
    }

    public final void applyEffect() {
        if (this.isFirst) {
            this.isFirst = false;
            Effect previewEffect = getPreviewEffect();
            if (previewEffect != null) {
                C75346e.m132156a(getStickerApiComponent(), previewEffect);
            }
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        getCameraApi().mo22747A().mo56916a(new C79275a(this));
        getFilterApiComponent().setFilterDisable(true, "build_in");
        getGestureApiComponent().mo23096a(new C79277b());
        AbstractC75704j i = getStickerApiComponent().mo23167t().mo119291c().mo119463i();
        Effect previewEffect = getPreviewEffect();
        if (previewEffect != null) {
            i.mo119431a(new C79323a(previewEffect, this.activity));
        }
    }

    public TTEPPreviewEffectLogicComponent(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.diContainer = fVar;
    }
}
