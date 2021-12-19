package com.p2082ss.android.ugc.aweme.p3452ml.p3454ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartSceneConfig;

/* renamed from: com.ss.android.ugc.aweme.ml.ab.OnePlaytimePredictConfig */
public final class OnePlaytimePredictConfig {
    @AbstractC27891c(mo46611a = "real")
    private OnePlaytimePredictRealConfig realConfig;
    @AbstractC27891c(mo46611a = "run_delay")
    private int runDelay;
    @AbstractC27891c(mo46611a = "run_feed_gap")
    private int runFeedGap;
    @AbstractC27891c(mo46611a = "run_time_gap")
    private int runTimeGap;
    @AbstractC27891c(mo46611a = "config")
    private SmartSceneConfig sceneConfig;
    @AbstractC27891c(mo46611a = "skip_count")
    private int skipCount;
    @AbstractC27891c(mo46611a = "trigger")
    private int trigger;

    static {
        Covode.recordClassIndex(70404);
    }

    public final OnePlaytimePredictRealConfig getRealConfig() {
        return this.realConfig;
    }

    public final int getRunDelay() {
        return this.runDelay;
    }

    public final int getRunFeedGap() {
        return this.runFeedGap;
    }

    public final int getRunTimeGap() {
        return this.runTimeGap;
    }

    public final SmartSceneConfig getSceneConfig() {
        return this.sceneConfig;
    }

    public final int getSkipCount() {
        return this.skipCount;
    }

    public final int getTrigger() {
        return this.trigger;
    }

    public final String toString() {
        return "{sceneConfig=" + this.sceneConfig + ", trigger=" + this.trigger + ", skipCount=" + this.skipCount + ", runDelay=" + this.runDelay + ", runTimeGap=" + this.runTimeGap + ", runFeedGap=" + this.runFeedGap + ", realConfig=" + this.realConfig + '}';
    }

    public final void setRealConfig(OnePlaytimePredictRealConfig onePlaytimePredictRealConfig) {
        this.realConfig = onePlaytimePredictRealConfig;
    }

    public final void setRunDelay(int i) {
        this.runDelay = i;
    }

    public final void setRunFeedGap(int i) {
        this.runFeedGap = i;
    }

    public final void setRunTimeGap(int i) {
        this.runTimeGap = i;
    }

    public final void setSceneConfig(SmartSceneConfig smartSceneConfig) {
        this.sceneConfig = smartSceneConfig;
    }

    public final void setSkipCount(int i) {
        this.skipCount = i;
    }

    public final void setTrigger(int i) {
        this.trigger = i;
    }
}
