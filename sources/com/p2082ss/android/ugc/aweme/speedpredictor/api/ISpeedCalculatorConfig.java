package com.p2082ss.android.ugc.aweme.speedpredictor.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.AbstractC75219d;

/* renamed from: com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig */
public interface ISpeedCalculatorConfig {
    static {
        Covode.recordClassIndex(88099);
    }

    int getCalculatorType();

    double getDefaultSpeedInBPS();

    AbstractC75215a getIntelligentAlgoConfig();

    AbstractC75219d.EnumC75220a getSpeedAlgorithmType();

    int getSpeedQueueSize();
}
