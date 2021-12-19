package com.p2082ss.android.ugc.aweme.sticker.p3957e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75705k;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;

/* renamed from: com.ss.android.ugc.aweme.sticker.e.d */
public final class C75324d implements AbstractC75705k {
    static {
        Covode.recordClassIndex(88241);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75705k
    /* renamed from: a */
    public final void mo118900a(Effect effect, long j, int i) {
        String str;
        C84425b a = new C84425b().mo129406a("resource_type", "effect").mo129404a("duration", j).mo129403a("status", 0);
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        C80322d.m139251a("tool_performance_resource_download_user_view", a.mo129406a("resource_id", str).mo129403a("hit_cache", i).f188764a);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75705k
    /* renamed from: a */
    public final void mo118901a(Effect effect, long j, int i, Integer num) {
        String str;
        C84425b a = new C84425b().mo129406a("resource_type", "effect").mo129404a("duration", j).mo129403a("status", 1);
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        C80322d.m139251a("tool_performance_resource_download_user_view", a.mo129406a("resource_id", str).mo129405a("error_domain", EffectPlatformFactory.m89604a().getHosts().get(0)).mo129405a("error_code", num).mo129403a("hit_cache", i).f188764a);
    }
}
