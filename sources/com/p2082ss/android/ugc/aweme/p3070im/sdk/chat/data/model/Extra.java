package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.Extra */
public final class Extra {
    private final boolean bold;
    @AbstractC27891c(mo46611a = "color_type")
    private final int colorType;

    static {
        Covode.recordClassIndex(63432);
    }

    /* renamed from: com_ss_android_ugc_aweme_im_sdk_chat_data_model_Extra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m99073x98eef5bb(int i) {
        return i;
    }

    public static /* synthetic */ Extra copy$default(Extra extra, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = extra.colorType;
        }
        if ((i2 & 2) != 0) {
            z = extra.bold;
        }
        return extra.copy(i, z);
    }

    public final int component1() {
        return this.colorType;
    }

    public final boolean component2() {
        return this.bold;
    }

    public final Extra copy(int i, boolean z) {
        return new Extra(i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Extra)) {
            return false;
        }
        Extra extra = (Extra) obj;
        return this.colorType == extra.colorType && this.bold == extra.bold;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_im_sdk_chat_data_model_Extra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m99073x98eef5bb(this.colorType) * 31;
        boolean z = this.bold;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return com_ss_android_ugc_aweme_im_sdk_chat_data_model_Extra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i;
    }

    public final String toString() {
        return "Extra(colorType=" + this.colorType + ", bold=" + this.bold + ")";
    }

    public final boolean getBold() {
        return this.bold;
    }

    public final int getColorType() {
        return this.colorType;
    }

    public Extra(int i, boolean z) {
        this.colorType = i;
        this.bold = z;
    }
}
