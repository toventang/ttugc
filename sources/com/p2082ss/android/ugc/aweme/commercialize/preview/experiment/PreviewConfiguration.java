package com.p2082ss.android.ugc.aweme.commercialize.preview.experiment;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.commercialize.preview.experiment.PreviewConfiguration */
public final class PreviewConfiguration {
    @AbstractC27891c(mo46611a = "delay_time_in_millisecond")
    private final int delayTimeInMillisecond;
    @AbstractC27891c(mo46611a = "validation_duration_in_minute")
    private final int validationDurationInMinute;

    static {
        Covode.recordClassIndex(45805);
    }

    /* renamed from: com_ss_android_ugc_aweme_commercialize_preview_experiment_PreviewConfiguration_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m77705x469be0c5(int i) {
        return i;
    }

    public static /* synthetic */ PreviewConfiguration copy$default(PreviewConfiguration previewConfiguration, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = previewConfiguration.delayTimeInMillisecond;
        }
        if ((i3 & 2) != 0) {
            i2 = previewConfiguration.validationDurationInMinute;
        }
        return previewConfiguration.copy(i, i2);
    }

    public final int component1() {
        return this.delayTimeInMillisecond;
    }

    public final int component2() {
        return this.validationDurationInMinute;
    }

    public final PreviewConfiguration copy(int i, int i2) {
        return new PreviewConfiguration(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewConfiguration)) {
            return false;
        }
        PreviewConfiguration previewConfiguration = (PreviewConfiguration) obj;
        return this.delayTimeInMillisecond == previewConfiguration.delayTimeInMillisecond && this.validationDurationInMinute == previewConfiguration.validationDurationInMinute;
    }

    public final int hashCode() {
        return (m77705x469be0c5(this.delayTimeInMillisecond) * 31) + m77705x469be0c5(this.validationDurationInMinute);
    }

    public final String toString() {
        return "PreviewConfiguration(delayTimeInMillisecond=" + this.delayTimeInMillisecond + ", validationDurationInMinute=" + this.validationDurationInMinute + ")";
    }

    public final int getDelayTimeInMillisecond() {
        return this.delayTimeInMillisecond;
    }

    public final int getValidationDurationInMinute() {
        return this.validationDurationInMinute;
    }

    public PreviewConfiguration(int i, int i2) {
        this.delayTimeInMillisecond = i;
        this.validationDurationInMinute = i2;
    }
}
