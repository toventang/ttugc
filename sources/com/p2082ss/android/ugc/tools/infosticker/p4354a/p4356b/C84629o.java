package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effectplatform.C46422m;
import com.p2082ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63190ap;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84454k;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.b.o */
final class C84629o implements AbstractC84454k<Effect, C84605m> {
    static {
        Covode.recordClassIndex(98594);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Long, java.lang.Object] */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84454k
    /* renamed from: a */
    public final /* synthetic */ void mo118903a(Effect effect, Long l, C84605m mVar) {
        Effect effect2 = effect;
        String str = "";
        C89219l.m154721d(effect2, str);
        AbstractC63190ap I = C63244g.m114602a().mo73263I();
        C69840ar arVar = new C69840ar();
        String b = C63244g.m114602a().mo73261G().mo46674b(effect2.getFileUrl());
        if (b == null) {
            b = str;
        }
        C69840ar a = arVar.mo110189a("url", b).mo110189a("duration", String.valueOf(l));
        String effectId = effect2.getEffectId();
        if (effectId == null) {
            effectId = str;
        }
        C69840ar a2 = a.mo110189a("effect_id", effectId);
        String name = effect2.getName();
        if (name != null) {
            str = name;
        }
        I.mo101629a("info_sticker_download_error_rate", 0, a2.mo110189a("effect_name", str).mo110187a("effect_type", Integer.valueOf(effect2.getEffectType())).mo110191a());
        C80322d.m139251a("tool_performance_resource_download", new C84425b().mo129406a("resource_type", C46422m.m89589a("info_effect")).mo129405a("duration", l).mo129403a("status", 0).mo129406a("resource_id", effect2.getEffectId()).mo129407a("is_auto_download", false).f188764a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Long, java.lang.Exception, java.lang.Object] */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84454k
    /* renamed from: a */
    public final /* synthetic */ void mo118902a(Effect effect, Long l, Exception exc, C84605m mVar) {
        Integer num;
        String str;
        String str2;
        Effect effect2 = effect;
        C84605m mVar2 = mVar;
        String str3 = "";
        C89219l.m154721d(effect2, str3);
        AbstractC63190ap I = C63244g.m114602a().mo73263I();
        C69840ar arVar = new C69840ar();
        String effectId = effect2.getEffectId();
        if (effectId == null) {
            effectId = str3;
        }
        C69840ar a = arVar.mo110189a("effect_id", effectId);
        String name = effect2.getName();
        if (name == null) {
            name = str3;
        }
        C69840ar a2 = a.mo110189a("effect_name", name).mo110187a("effect_type", Integer.valueOf(effect2.getEffectType()));
        String b = C63244g.m114602a().mo73261G().mo46674b(effect2.getFileUrl());
        if (b != null) {
            str3 = b;
        }
        C69840ar a3 = a2.mo110189a("url", str3).mo110189a("exception", Log.getStackTraceString(exc));
        Integer num2 = null;
        if (mVar2 != null) {
            num = mVar2.f189066a;
        } else {
            num = null;
        }
        C69840ar a4 = a3.mo110189a("errorCode", String.valueOf(num));
        if (mVar2 != null) {
            str = mVar2.f189067b;
        } else {
            str = null;
        }
        I.mo101629a("info_sticker_download_error_rate", 1, a4.mo110189a("errorMsg", String.valueOf(str)).mo110191a());
        C84425b a5 = new C84425b().mo129406a("resource_type", C46422m.m89589a("info_effect")).mo129405a("duration", l).mo129403a("status", 1).mo129406a("resource_id", effect2.getEffectId()).mo129405a("error_domain", EffectPlatformFactory.m89604a().getHosts().get(0));
        if (mVar2 != null) {
            num2 = mVar2.f189066a;
        }
        C84425b a6 = a5.mo129406a("error_code", String.valueOf(num2));
        if (mVar2 == null || (str2 = mVar2.f189067b) == null) {
            str2 = "empty_error_msg";
        }
        C80322d.m139251a("tool_performance_resource_download", a6.mo129406a("error_msg", str2).mo129407a("is_auto_download", false).f188764a);
    }
}
