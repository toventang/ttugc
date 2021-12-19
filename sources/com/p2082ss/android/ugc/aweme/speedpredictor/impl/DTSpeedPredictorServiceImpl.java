package com.p2082ss.android.ugc.aweme.speedpredictor.impl;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedPredictorService;

/* renamed from: com.ss.android.ugc.aweme.speedpredictor.impl.DTSpeedPredictorServiceImpl */
public class DTSpeedPredictorServiceImpl implements ISpeedPredictorService {
    static {
        Covode.recordClassIndex(88108);
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedPredictorService
    /* renamed from: a */
    public final ISpeedCalculator mo118401a() {
        return new C75227b();
    }
}
