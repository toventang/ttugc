package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.OneSmartDataTrackConfig;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig */
public class SmartSceneConfig {
    @AbstractC27891c(mo46611a = "disable")
    private boolean disable;
    @AbstractC27891c(mo46611a = "features")
    private InputFeaturesConfig features;
    @AbstractC27891c(mo46611a = "out_type")
    public String outType;
    @AbstractC27891c(mo46611a = "scene")
    private String scene;
    @AbstractC27891c(mo46611a = "sdk")
    private SmartSdkConfig sdkConfig;
    @AbstractC27891c(mo46611a = "track")
    private OneSmartDataTrackConfig track;

    static {
        Covode.recordClassIndex(70586);
    }

    public final boolean getDisable() {
        return this.disable;
    }

    public final InputFeaturesConfig getFeatures() {
        return this.features;
    }

    public final String getScene() {
        return this.scene;
    }

    public final SmartSdkConfig getSdkConfig() {
        return this.sdkConfig;
    }

    public final OneSmartDataTrackConfig getTrack() {
        return this.track;
    }

    public String toString() {
        return "SmartSceneConfig{scene=" + this.scene + ", disable=" + this.disable + ", outType=" + this.outType + ", sdkConfig=" + this.sdkConfig + ", features=" + this.features + ", track=" + this.track + '}';
    }

    public final void setDisable(boolean z) {
        this.disable = z;
    }

    public final void setFeatures(InputFeaturesConfig inputFeaturesConfig) {
        this.features = inputFeaturesConfig;
    }

    public final void setScene(String str) {
        this.scene = str;
    }

    public final void setSdkConfig(SmartSdkConfig smartSdkConfig) {
        this.sdkConfig = smartSdkConfig;
    }

    public final void setTrack(OneSmartDataTrackConfig oneSmartDataTrackConfig) {
        this.track = oneSmartDataTrackConfig;
    }
}
