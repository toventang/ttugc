package com.p2082ss.android.ugc.aweme.p3452ml.p3454ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.InputFeaturesConfig;

/* renamed from: com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig */
public final class OneSmartDataTrackConfig {
    @AbstractC27891c(mo46611a = "next_real_cnt")
    private int nextRealCnt = 1;
    @AbstractC27891c(mo46611a = "predict")
    private InputFeaturesConfig predict;
    @AbstractC27891c(mo46611a = "real")
    private InputFeaturesConfig real;
    @AbstractC27891c(mo46611a = "report_rate")
    private float reportRate;
    @AbstractC27891c(mo46611a = "scene")
    private String scene;
    @AbstractC27891c(mo46611a = "track_type")
    private int trackType;

    static {
        Covode.recordClassIndex(70406);
    }

    public final int getNextRealCnt() {
        return this.nextRealCnt;
    }

    public final InputFeaturesConfig getPredict() {
        return this.predict;
    }

    public final InputFeaturesConfig getReal() {
        return this.real;
    }

    public final float getReportRate() {
        return this.reportRate;
    }

    public final String getScene() {
        return this.scene;
    }

    public final int getTrackType() {
        return this.trackType;
    }

    public final String toString() {
        return "{scene=" + this.scene + ", trackType=" + this.trackType + ", predict=" + this.predict + ", real=" + this.real + ", reportRate=" + this.reportRate + ", nextRealCnt=" + this.nextRealCnt + '}';
    }

    public final void setNextRealCnt(int i) {
        this.nextRealCnt = i;
    }

    public final void setPredict(InputFeaturesConfig inputFeaturesConfig) {
        this.predict = inputFeaturesConfig;
    }

    public final void setReal(InputFeaturesConfig inputFeaturesConfig) {
        this.real = inputFeaturesConfig;
    }

    public final void setReportRate(float f) {
        this.reportRate = f;
    }

    public final void setScene(String str) {
        this.scene = str;
    }

    public final void setTrackType(int i) {
        this.trackType = i;
    }
}
