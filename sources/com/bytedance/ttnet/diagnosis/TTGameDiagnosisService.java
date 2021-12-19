package com.bytedance.ttnet.diagnosis;

import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class TTGameDiagnosisService {
    public static final String TAG = TTGameDiagnosisService.class.getSimpleName();
    private static volatile TTGameDiagnosisService sInstance = null;
    private volatile boolean mIsMonitoring;
    private IDiagnosisRequest mRequest;

    private TTGameDiagnosisService() {
    }

    public boolean isMonitoring() {
        return this.mIsMonitoring;
    }

    static {
        Covode.recordClassIndex(26856);
    }

    public static TTGameDiagnosisService inst() {
        MethodCollector.m26663i(4768);
        if (sInstance == null) {
            synchronized (TTGameDiagnosisService.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new TTGameDiagnosisService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4768);
                    throw th;
                }
            }
        }
        TTGameDiagnosisService tTGameDiagnosisService = sInstance;
        MethodCollector.m26664o(4768);
        return tTGameDiagnosisService;
    }

    public void monitorEnd() {
        MethodCollector.m26663i(4777);
        synchronized (this) {
            try {
                if (this.mIsMonitoring) {
                    this.mRequest.doExtraCommand("finish", "");
                    this.mIsMonitoring = false;
                    MethodCollector.m26664o(4777);
                }
            } finally {
                MethodCollector.m26664o(4777);
            }
        }
    }

    public void doDiagnosisDuringGaming(String str) {
        MethodCollector.m26663i(4784);
        synchronized (this) {
            try {
                if (this.mIsMonitoring) {
                    this.mRequest.doExtraCommand("diagnosis", str);
                    MethodCollector.m26664o(4784);
                }
            } finally {
                MethodCollector.m26664o(4784);
            }
        }
    }

    public void monitorBegin(String str, String str2) {
        MethodCollector.m26663i(4773);
        synchronized (this) {
            try {
                if (!this.mIsMonitoring) {
                    IDiagnosisRequest createRequest = TTNetDiagnosisService.createRequest(4, str, 0, Integer.MAX_VALUE);
                    this.mRequest = createRequest;
                    createRequest.start(new IDiagnosisCallback() {
                        /* class com.bytedance.ttnet.diagnosis.TTGameDiagnosisService.C229451 */

                        static {
                            Covode.recordClassIndex(26857);
                        }

                        @Override // com.bytedance.ttnet.diagnosis.IDiagnosisCallback
                        public final void onDiagnosisComplete(String str) {
                            Logger.debug();
                        }
                    });
                    this.mRequest.doExtraCommand("extra_info", str2);
                    this.mIsMonitoring = true;
                    MethodCollector.m26664o(4773);
                }
            } finally {
                MethodCollector.m26664o(4773);
            }
        }
    }
}
