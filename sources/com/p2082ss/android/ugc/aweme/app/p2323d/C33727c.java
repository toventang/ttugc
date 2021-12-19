package com.p2082ss.android.ugc.aweme.app.p2323d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.performance.ICrashEffectIdInfoListener;

/* renamed from: com.ss.android.ugc.aweme.app.d.c */
final /* synthetic */ class C33727c implements ICrashEffectIdInfoListener {

    /* renamed from: a */
    private final C33726b f79892a;

    static {
        Covode.recordClassIndex(40622);
    }

    C33727c(C33726b bVar) {
        this.f79892a = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.performance.ICrashEffectIdInfoListener
    public final void setEffectIdInfo(String str, String str2) {
        this.f79892a.f79890a.put(str, str2);
    }
}
