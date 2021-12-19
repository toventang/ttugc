package com.p2082ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.settings.LikoAnalysisConfig */
public class LikoAnalysisConfig {
    @AbstractC27891c(mo46611a = "bigObjectFilterSystem")
    boolean bigObjectFilterSystem = true;
    @AbstractC27891c(mo46611a = "bigObjectLatitude")
    int bigObjectLatitude = 3;
    @AbstractC27891c(mo46611a = "bitmapLatitude")
    int bitmapLatitude = 204800;
    @AbstractC27891c(mo46611a = "objectInstanceFilterSystem")
    boolean objectInstanceFilterSystem = true;
    @AbstractC27891c(mo46611a = "objectInstanceLatitude")
    int objectInstanceLatitude = 10;
    @AbstractC27891c(mo46611a = "supportBigObjectAnalysis")
    boolean supportBigObjectAnalysis = true;
    @AbstractC27891c(mo46611a = "supportBitmapAnalysis")
    boolean supportBitmapAnalysis = true;
    @AbstractC27891c(mo46611a = "supportObjectInstanceAnalysis")
    boolean supportObjectInstanceAnalysis = true;

    static {
        Covode.recordClassIndex(80990);
    }

    public int getBigObjectLatitude() {
        return this.bigObjectLatitude;
    }

    public int getBitmapLatitude() {
        return this.bitmapLatitude;
    }

    public int getObjectInstanceLatitude() {
        return this.objectInstanceLatitude;
    }

    public boolean isBigObjectFilterSystem() {
        return this.bigObjectFilterSystem;
    }

    public boolean isObjectInstanceFilterSystem() {
        return this.objectInstanceFilterSystem;
    }

    public boolean isSupportBigObjectAnalysis() {
        return this.supportBigObjectAnalysis;
    }

    public boolean isSupportBitmapAnalysis() {
        return this.supportBitmapAnalysis;
    }

    public boolean isSupportObjectInstanceAnalysis() {
        return this.supportObjectInstanceAnalysis;
    }

    public void setBigObjectFilterSystem(boolean z) {
        this.bigObjectFilterSystem = z;
    }

    public void setBigObjectLatitude(int i) {
        this.bigObjectLatitude = i;
    }

    public void setBitmapLatitude(int i) {
        this.bitmapLatitude = i;
    }

    public void setObjectInstanceFilterSystem(boolean z) {
        this.objectInstanceFilterSystem = z;
    }

    public void setObjectInstanceLatitude(int i) {
        this.objectInstanceLatitude = i;
    }

    public void setSupportBigObjectAnalysis(boolean z) {
        this.supportBigObjectAnalysis = z;
    }

    public void setSupportBitmapAnalysis(boolean z) {
        this.supportBitmapAnalysis = z;
    }

    public void setSupportObjectInstanceAnalysis(boolean z) {
        this.supportObjectInstanceAnalysis = z;
    }
}
