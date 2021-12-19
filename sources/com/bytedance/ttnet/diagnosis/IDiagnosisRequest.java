package com.bytedance.ttnet.diagnosis;

import com.bytedance.covode.number.Covode;

public interface IDiagnosisRequest {
    static {
        Covode.recordClassIndex(26855);
    }

    void cancel();

    void doExtraCommand(String str, String str2);

    void setUserExtraInfo(String str);

    void start(IDiagnosisCallback iDiagnosisCallback);
}
