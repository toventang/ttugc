package com.p2082ss.android.ugc.aweme.settingsrequest;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* renamed from: com.ss.android.ugc.aweme.settingsrequest.g */
final /* synthetic */ class C68807g implements AbstractC88983w {

    /* renamed from: a */
    private final AbstractC68806f f153889a;

    /* renamed from: b */
    private final IESSettingsProxy f153890b;

    static {
        Covode.recordClassIndex(81084);
    }

    C68807g(AbstractC68806f fVar, IESSettingsProxy iESSettingsProxy) {
        this.f153889a = fVar;
        this.f153890b = iESSettingsProxy;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        AbstractC68806f fVar = this.f153889a;
        IESSettingsProxy iESSettingsProxy = this.f153890b;
        fVar.mo109264c(iESSettingsProxy);
        vVar.mo143031a(iESSettingsProxy);
        vVar.mo143023a();
    }
}
