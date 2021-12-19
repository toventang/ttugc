package com.p2082ss.android.ugc.aweme.video.simkit;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.p3452ml.C59974a;
import com.p2082ss.android.ugc.aweme.simkit.config.p3909c.C74615a;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.AbstractC75215a;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.AbstractC75218c;
import com.p2082ss.android.ugc.aweme.speedpredictor.api.AbstractC75219d;
import com.p2082ss.android.ugc.aweme.video.preload.p4215b.C80866b;
import com.p2082ss.android.ugc.playerkit.simapicommon.C84231a;

/* renamed from: com.ss.android.ugc.aweme.video.simkit.SpeedConfigImpl */
public class SpeedConfigImpl extends C74615a {
    private final AbstractC75219d.EnumC75220a algorithmType;
    private final int calculatorType;
    private final AbstractC75215a intelligentAlgoConfig = new C80866b();

    static {
        Covode.recordClassIndex(94277);
    }

    /* renamed from: com_ss_android_ugc_aweme_video_simkit_SpeedConfigImpl_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m140500x19c090f8(String str, String str2) {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig, com.p2082ss.android.ugc.aweme.simkit.config.p3909c.C74615a
    public int getCalculatorType() {
        return this.calculatorType;
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig, com.p2082ss.android.ugc.aweme.simkit.config.p3909c.C74615a
    public AbstractC75215a getIntelligentAlgoConfig() {
        return this.intelligentAlgoConfig;
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig, com.p2082ss.android.ugc.aweme.simkit.config.p3909c.C74615a
    public AbstractC75219d.EnumC75220a getSpeedAlgorithmType() {
        return this.algorithmType;
    }

    @Override // com.p2082ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig, com.p2082ss.android.ugc.aweme.simkit.config.p3909c.C74615a
    public int getSpeedQueueSize() {
        return C16048b.m29633a().mo25412a(true, "video_speed_queue_size", 10);
    }

    public SpeedConfigImpl() {
        AbstractC75219d.EnumC75220a aVar;
        int i;
        if (C59974a.f136568a.f136569b == null) {
            aVar = AbstractC75219d.EnumC75220a.DEFAULT;
        } else {
            aVar = AbstractC75219d.EnumC75220a.INTELLIGENT;
        }
        this.algorithmType = aVar;
        int i2 = 1;
        if (C16048b.m29633a().mo25412a(true, "speed_monitor_sink", 0) != 1) {
            m140500x19c090f8("wbp-test-speed", "Modular planSelect: [sdk], algorithm: [" + aVar + "].");
            i = 1;
        } else {
            i = 2;
            m140500x19c090f8("wbp-test-speed", "Modular planSelect: [cloud], algorithm: [" + aVar + "].");
        }
        if (AbstractC75218c.m131982a(i) != null || i == 1) {
            i2 = i;
        } else if (C84231a.m144834a().isDebug()) {
            throw new RuntimeException("no runtime cloud type speed predict module");
        }
        this.calculatorType = i2;
    }
}
