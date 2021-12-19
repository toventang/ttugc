package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartSdkConfig */
public final class SmartSdkConfig {
    @AbstractC27891c(mo46611a = "mlsdk")
    private MlSdkConfig mlSdkConfig;
    @AbstractC27891c(mo46611a = "pitaya")
    private PitayaConfig pitayaConfig;

    static {
        Covode.recordClassIndex(70587);
    }

    public final MlSdkConfig getMlSdkConfig() {
        return this.mlSdkConfig;
    }

    public final PitayaConfig getPitayaConfig() {
        return this.pitayaConfig;
    }

    public final String toString() {
        if (this.pitayaConfig != null) {
            return "{pitayaConfig=" + this.pitayaConfig + '}';
        }
        return "{mlSdkConfig=" + this.mlSdkConfig + '}';
    }

    public final void setMlSdkConfig(MlSdkConfig mlSdkConfig2) {
        this.mlSdkConfig = mlSdkConfig2;
    }

    public final void setPitayaConfig(PitayaConfig pitayaConfig2) {
        this.pitayaConfig = pitayaConfig2;
    }
}
