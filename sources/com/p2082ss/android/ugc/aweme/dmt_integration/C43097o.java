package com.p2082ss.android.ugc.aweme.dmt_integration;

import androidx.fragment.app.ActivityC0945e;
import com.bef.effectsdk.BuildConfig;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.C46358h;
import com.p2082ss.android.ugc.aweme.effect.p2895e.AbstractC46354a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63278f;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.o */
public final class C43097o implements AbstractC63278f {
    static {
        Covode.recordClassIndex(51250);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63278f
    /* renamed from: b */
    public final String mo73333b() {
        C89219l.m154716b(BuildConfig.VERSION_NAME, "");
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63278f
    /* renamed from: a */
    public final String mo73332a() {
        C63244g.m114602a();
        C89219l.m154716b("142710f02c3a11e8b42429f14557854a", "");
        return "142710f02c3a11e8b42429f14557854a";
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63278f
    /* renamed from: c */
    public final int mo73334c() {
        IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
        C89219l.m154716b(iESSettingsProxy, "");
        Integer editEffectAutoDownloadSize = iESSettingsProxy.getEditEffectAutoDownloadSize();
        C89219l.m154716b(editEffectAutoDownloadSize, "");
        return editEffectAutoDownloadSize.intValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63278f
    /* renamed from: d */
    public final List<String> mo73335d() {
        IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
        C89219l.m154716b(iESSettingsProxy, "");
        List<String> filterColors = iESSettingsProxy.getFilterColors();
        C89219l.m154716b(filterColors, "");
        return filterColors;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63278f
    /* renamed from: a */
    public final AbstractC46354a mo73331a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        return new C46358h(eVar);
    }
}
