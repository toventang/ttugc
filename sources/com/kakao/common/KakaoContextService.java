package com.kakao.common;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.common.IConfiguration;

public class KakaoContextService {
    private static KakaoContextService instance;
    private IConfiguration configuration;
    private PhaseInfo phaseInfo;

    static {
        Covode.recordClassIndex(33922);
    }

    private KakaoContextService() {
    }

    public IConfiguration getAppConfiguration() {
        return this.configuration;
    }

    public PhaseInfo phaseInfo() {
        return this.phaseInfo;
    }

    public static synchronized KakaoContextService getInstance() {
        KakaoContextService kakaoContextService;
        synchronized (KakaoContextService.class) {
            MethodCollector.m26663i(3264);
            if (instance == null) {
                instance = new KakaoContextService();
            }
            kakaoContextService = instance;
            MethodCollector.m26664o(3264);
        }
        return kakaoContextService;
    }

    public void setPhaseInfo(PhaseInfo phaseInfo2) {
        if (phaseInfo2 != null) {
            this.phaseInfo = phaseInfo2;
        }
    }

    public synchronized void initialize(Context context) {
        MethodCollector.m26663i(3189);
        if (this.configuration == null) {
            this.configuration = IConfiguration.Factory.createConfiguration(context);
        }
        if (this.phaseInfo == null) {
            this.phaseInfo = new DefaultPhaseInfo(context);
        }
        MethodCollector.m26664o(3189);
    }

    public KakaoContextService(IConfiguration iConfiguration, PhaseInfo phaseInfo2) {
        this.configuration = iConfiguration;
        this.phaseInfo = phaseInfo2;
    }

    public synchronized void initialize(Context context, PhaseInfo phaseInfo2) {
        MethodCollector.m26663i(3191);
        if (this.configuration == null) {
            this.configuration = IConfiguration.Factory.createConfiguration(context);
        }
        this.phaseInfo = phaseInfo2;
        MethodCollector.m26664o(3191);
    }
}
