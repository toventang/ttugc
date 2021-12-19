package com.p2082ss.android.ugc.effectmanager.common.listener;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.EffectRequest;
import java.io.InputStream;

/* renamed from: com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker */
public interface IEffectNetWorker {
    static {
        Covode.recordClassIndex(95473);
    }

    InputStream execute(EffectRequest effectRequest);
}
