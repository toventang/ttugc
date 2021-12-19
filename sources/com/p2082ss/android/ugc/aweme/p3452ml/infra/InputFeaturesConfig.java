package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig */
public final class InputFeaturesConfig {
    @AbstractC27891c(mo46611a = "f_feed")
    private FeatureFeedTypeConfig fTypeFeed;
    @AbstractC27891c(mo46611a = "f_g_action")
    private FeatureTypeConfig fTypeGAction;
    @AbstractC27891c(mo46611a = "f_phone")
    private FeaturePhoneTypeConfig fTypePhone;
    @AbstractC27891c(mo46611a = "f_play")
    private FeaturePlayTypeConfig fTypePlay;
    @AbstractC27891c(mo46611a = "f_user")
    private FeatureUserTypeConfig fTypeUser;

    static {
        Covode.recordClassIndex(70548);
    }

    public final FeatureFeedTypeConfig getFTypeFeed() {
        return this.fTypeFeed;
    }

    public final FeatureTypeConfig getFTypeGAction() {
        return this.fTypeGAction;
    }

    public final FeaturePhoneTypeConfig getFTypePhone() {
        return this.fTypePhone;
    }

    public final FeaturePlayTypeConfig getFTypePlay() {
        return this.fTypePlay;
    }

    public final FeatureUserTypeConfig getFTypeUser() {
        return this.fTypeUser;
    }

    public final String toString() {
        return "{fTypeFeed=" + this.fTypeFeed + ", fTypePlay=" + this.fTypePlay + ", fTypeUser=" + this.fTypeUser + ", fTypeGAction=" + this.fTypeGAction + ", fTypePhone=" + this.fTypePhone + '}';
    }

    public final void setFTypeFeed(FeatureFeedTypeConfig featureFeedTypeConfig) {
        this.fTypeFeed = featureFeedTypeConfig;
    }

    public final void setFTypeGAction(FeatureTypeConfig featureTypeConfig) {
        this.fTypeGAction = featureTypeConfig;
    }

    public final void setFTypePhone(FeaturePhoneTypeConfig featurePhoneTypeConfig) {
        this.fTypePhone = featurePhoneTypeConfig;
    }

    public final void setFTypePlay(FeaturePlayTypeConfig featurePlayTypeConfig) {
        this.fTypePlay = featurePlayTypeConfig;
    }

    public final void setFTypeUser(FeatureUserTypeConfig featureUserTypeConfig) {
        this.fTypeUser = featureUserTypeConfig;
    }
}
