package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.FeatureUserTypeConfig */
public final class FeatureUserTypeConfig extends FeatureTypeConfig {
    @AbstractC27891c(mo46611a = "percentage_mode")
    private boolean percentageMode;

    static {
        Covode.recordClassIndex(70541);
    }

    public final boolean getPercentageMode() {
        return this.percentageMode;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.FeatureTypeConfig
    public final String toString() {
        return "UserType{super=" + super.toString() + ", percentageMode=" + this.percentageMode + '}';
    }

    public final void setPercentageMode(boolean z) {
        this.percentageMode = z;
    }
}
