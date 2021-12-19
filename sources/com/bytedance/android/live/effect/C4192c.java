package com.bytedance.android.live.effect;

import com.bytedance.android.live.effect.api.AbstractC4167d;
import com.bytedance.android.live.effect.api.AbstractC4169e;
import com.bytedance.android.live.effect.api.AbstractC4170f;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.p240a.AbstractC4149b;
import com.bytedance.android.live.effect.api.p240a.AbstractC4152e;
import com.bytedance.android.live.effect.api.p240a.AbstractC4154g;
import com.bytedance.android.live.effect.api.p240a.AbstractC4155h;
import com.bytedance.android.live.effect.api.p240a.AbstractC4156i;
import com.bytedance.android.live.effect.api.p240a.AbstractC4157j;
import com.bytedance.android.live.effect.api.p240a.AbstractC4162k;
import com.bytedance.android.live.effect.model.C4312b;
import com.bytedance.android.live.effect.p241b.C4178a;
import com.bytedance.android.live.effect.p241b.C4179b;
import com.bytedance.android.live.effect.p241b.C4180c;
import com.bytedance.android.live.effect.p242c.C4204f;
import com.bytedance.android.live.effect.p242c.C4208j;
import com.bytedance.android.live.effect.p243d.C4223c;
import com.bytedance.android.live.effect.p245f.C4282d;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.c */
public class C4192c implements IEffectService {
    static {
        Covode.recordClassIndex(4762);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public AbstractC4167d getEffectLogHelper() {
        return C4175b.f11604a;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public AbstractC4157j getLiveEffectDataProvider() {
        return C4284g.f11804b;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public AbstractC4162k getLiveEffectRestoreManager() {
        return C4303k.f11839a;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public AbstractC4170f getLiveFilterManager() {
        return C4208j.C4212b.f11691a;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public AbstractC4155h composerManager() {
        return C4179b.m10204f();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public AbstractC4156i composerManagerB() {
        return C4180c.C4181a.m10258a();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public AbstractC4169e getLiveFilterHelper() {
        return new C4204f();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public AbstractC4152e baseComposerManager() {
        if (LiveNewEffectPanelSetting.INSTANCE.useNewPanel()) {
            return composerManagerB();
        }
        return composerManager();
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public C11672a convertStickerBean(Effect effect) {
        return C4282d.m10385a(effect);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public AbstractC4149b getComposerHandler(AbstractC11683e eVar) {
        return new C4178a(eVar);
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public AbstractC11293v getEffectNewDialogFragment(C4312b bVar) {
        C4223c cVar = new C4223c();
        cVar.f11716f = bVar;
        return cVar;
    }

    @Override // com.bytedance.android.live.effect.api.IEffectService
    public AbstractC11293v getEffectDialogFragment(AbstractC4154g gVar, C4312b bVar) {
        C89219l.m154721d(gVar, "");
        C4292h hVar = new C4292h();
        hVar.f11819a = gVar;
        hVar.f11820b = bVar;
        return hVar;
    }
}
