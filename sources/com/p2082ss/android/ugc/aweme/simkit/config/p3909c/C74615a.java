package com.p2082ss.android.ugc.aweme.simkit.config.p3909c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.AbstractC75215a;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.AbstractC75219d;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;

/* renamed from: com.ss.android.ugc.aweme.simkit.config.c.a */
public class C74615a implements ISpeedCalculatorConfig {
    static {
        Covode.recordClassIndex(87436);
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public int getCalculatorType() {
        return 1;
    }

    public AbstractC75219d getCustomSpeedAlgorithm() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public double getDefaultSpeedInBPS() {
        return -1.0d;
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public AbstractC75215a getIntelligentAlgoConfig() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public int getSpeedQueueSize() {
        return 10;
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig
    public AbstractC75219d.EnumC75220a getSpeedAlgorithmType() {
        return AbstractC75219d.EnumC75220a.DEFAULT;
    }
}
