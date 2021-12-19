package com.p2082ss.android.ugc.aweme.p3452ml.p3454ab;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.ml.ab.SmartSceneReportConfig */
public final class SmartSceneReportConfig {
    @AbstractC27891c(mo46611a = "enable")
    private boolean enable;
    @AbstractC27891c(mo46611a = "ignore_scene")
    private String ignoreScene;
    @AbstractC27891c(mo46611a = "init_rate")
    private float initRate;
    @AbstractC27891c(mo46611a = "run_rate")
    private float runRate;

    static {
        Covode.recordClassIndex(70423);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final String getIgnoreScene() {
        return this.ignoreScene;
    }

    public final float getInitRate() {
        return this.initRate;
    }

    public final float getRunRate() {
        return this.runRate;
    }

    public final String toString() {
        return "SmartSceneReportConfig(enable=" + this.enable + ", initRate=" + this.initRate + ", runRate=" + this.runRate + ", ignoreScene=" + this.ignoreScene + ')';
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setIgnoreScene(String str) {
        this.ignoreScene = str;
    }

    public final void setInitRate(float f) {
        this.initRate = f;
    }

    public final void setRunRate(float f) {
        this.runRate = f;
    }
}
