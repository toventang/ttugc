package com.p2082ss.android.ugc.aweme.p3452ml.p3454ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.commercialize.CommerceSmartUIModel;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.InputFeaturesConfig;

/* renamed from: com.ss.android.ugc.aweme.ml.ab.CommerceSmartUIModelV2 */
public final class CommerceSmartUIModelV2 extends CommerceSmartUIModel {
    @AbstractC27891c(mo46611a = "features")
    private InputFeaturesConfig features;
    @AbstractC27891c(mo46611a = "real")
    private OnePlaytimePredictRealConfig realConfig;
    @AbstractC27891c(mo46611a = "track")
    private OneSmartDataTrackConfig track;

    static {
        Covode.recordClassIndex(70402);
    }

    public final InputFeaturesConfig getFeatures() {
        return this.features;
    }

    public final OnePlaytimePredictRealConfig getRealConfig() {
        return this.realConfig;
    }

    public final OneSmartDataTrackConfig getTrack() {
        return this.track;
    }

    public final void setFeatures(InputFeaturesConfig inputFeaturesConfig) {
        this.features = inputFeaturesConfig;
    }

    public final void setRealConfig(OnePlaytimePredictRealConfig onePlaytimePredictRealConfig) {
        this.realConfig = onePlaytimePredictRealConfig;
    }

    public final void setTrack(OneSmartDataTrackConfig oneSmartDataTrackConfig) {
        this.track = oneSmartDataTrackConfig;
    }
}
