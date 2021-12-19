package com.p2082ss.android.ugc.aweme.specialplus;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specialplus.SpecialPlusConfig */
public final class SpecialPlusConfig {
    @AbstractC27891c(mo46611a = "app_version")
    private String appVersion = "";
    @AbstractC27891c(mo46611a = "appearance_period_in_hours")
    private float appearance_period_in_hours = 24.0f;
    @AbstractC27891c(mo46611a = "cool_down_period_in_hours")
    private float cool_down_period_in_hours = 4.0f;
    @AbstractC27891c(mo46611a = "condition")
    private SpecialPlusLabels labels = new SpecialPlusLabels();
    @AbstractC27891c(mo46611a = "plus_icon")
    private SpecialPlusMedia plusIcon = new SpecialPlusMedia();
    @AbstractC27891c(mo46611a = "tips")
    private SpecialPlusTips tips = new SpecialPlusTips();
    @AbstractC27891c(mo46611a = "valid_time")
    private SpecialPlusTimePeriod[] validTime = new SpecialPlusTimePeriod[0];
    @AbstractC27891c(mo46611a = "version")
    private int version;

    static {
        Covode.recordClassIndex(88081);
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final float getAppearance_period_in_hours() {
        return this.appearance_period_in_hours;
    }

    public final float getCool_down_period_in_hours() {
        return this.cool_down_period_in_hours;
    }

    public final SpecialPlusLabels getLabels() {
        return this.labels;
    }

    public final SpecialPlusMedia getPlusIcon() {
        return this.plusIcon;
    }

    public final SpecialPlusTips getTips() {
        return this.tips;
    }

    public final SpecialPlusTimePeriod[] getValidTime() {
        return this.validTime;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setAppearance_period_in_hours(float f) {
        this.appearance_period_in_hours = f;
    }

    public final void setCool_down_period_in_hours(float f) {
        this.cool_down_period_in_hours = f;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public final void setAppVersion(String str) {
        C89219l.m154721d(str, "");
        this.appVersion = str;
    }

    public final void setLabels(SpecialPlusLabels specialPlusLabels) {
        C89219l.m154721d(specialPlusLabels, "");
        this.labels = specialPlusLabels;
    }

    public final void setPlusIcon(SpecialPlusMedia specialPlusMedia) {
        C89219l.m154721d(specialPlusMedia, "");
        this.plusIcon = specialPlusMedia;
    }

    public final void setTips(SpecialPlusTips specialPlusTips) {
        C89219l.m154721d(specialPlusTips, "");
        this.tips = specialPlusTips;
    }

    public final void setValidTime(SpecialPlusTimePeriod[] specialPlusTimePeriodArr) {
        C89219l.m154721d(specialPlusTimePeriodArr, "");
        this.validTime = specialPlusTimePeriodArr;
    }
}
