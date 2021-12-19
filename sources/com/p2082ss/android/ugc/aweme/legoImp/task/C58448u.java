package com.p2082ss.android.ugc.aweme.legoImp.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.Npth;
import com.p2082ss.android.ugc.aweme.services.performance.ICrashEffectIdInfoListener;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.u */
final /* synthetic */ class C58448u implements ICrashEffectIdInfoListener {

    /* renamed from: a */
    static final ICrashEffectIdInfoListener f133068a = new C58448u();

    static {
        Covode.recordClassIndex(68709);
    }

    private C58448u() {
    }

    @Override // com.p2082ss.android.ugc.aweme.services.performance.ICrashEffectIdInfoListener
    public final void setEffectIdInfo(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        Npth.addTags(hashMap);
    }
}
