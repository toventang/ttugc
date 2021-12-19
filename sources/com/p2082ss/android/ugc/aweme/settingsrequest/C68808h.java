package com.p2082ss.android.ugc.aweme.settingsrequest;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.settingsrequest.h */
final /* synthetic */ class C68808h implements AbstractC88433f {

    /* renamed from: a */
    private final AbstractC68806f f153891a;

    /* renamed from: b */
    private final IESSettingsProxy f153892b;

    static {
        Covode.recordClassIndex(81085);
    }

    C68808h(AbstractC68806f fVar, IESSettingsProxy iESSettingsProxy) {
        this.f153891a = fVar;
        this.f153892b = iESSettingsProxy;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        this.f153891a.mo109265d(this.f153892b);
    }
}
