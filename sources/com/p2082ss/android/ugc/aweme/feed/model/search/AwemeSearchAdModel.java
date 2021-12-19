package com.p2082ss.android.ugc.aweme.feed.model.search;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel */
public final class AwemeSearchAdModel implements Serializable {
    @AbstractC27891c(mo46611a = "learn_more_bg_color")
    private final String SearchAdTransformButtonColor;
    @AbstractC27891c(mo46611a = "button_text")
    private final String SearchAdTransformButtonText;
    @AbstractC27891c(mo46611a = "animation_type")
    private final Integer animationType;
    @AbstractC27891c(mo46611a = "button_color_show_seconds")
    private final float buttonColorShowSeconds;
    @AbstractC27891c(mo46611a = "auto_play")
    private final Boolean isAutoPlayEnable;
    @AbstractC27891c(mo46611a = "show_button_seconds")
    private final float showButtonSeconds;
    @AbstractC27891c(mo46611a = "show_mask_times")
    private final Integer showMaskTimes;

    static {
        Covode.recordClassIndex(58824);
    }

    public static /* synthetic */ AwemeSearchAdModel copy$default(AwemeSearchAdModel awemeSearchAdModel, Boolean bool, Integer num, float f, float f2, String str, Integer num2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = awemeSearchAdModel.isAutoPlayEnable;
        }
        if ((i & 2) != 0) {
            num = awemeSearchAdModel.animationType;
        }
        if ((i & 4) != 0) {
            f = awemeSearchAdModel.showButtonSeconds;
        }
        if ((i & 8) != 0) {
            f2 = awemeSearchAdModel.buttonColorShowSeconds;
        }
        if ((i & 16) != 0) {
            str = awemeSearchAdModel.SearchAdTransformButtonColor;
        }
        if ((i & 32) != 0) {
            num2 = awemeSearchAdModel.showMaskTimes;
        }
        if ((i & 64) != 0) {
            str2 = awemeSearchAdModel.SearchAdTransformButtonText;
        }
        return awemeSearchAdModel.copy(bool, num, f, f2, str, num2, str2);
    }

    public final Boolean component1() {
        return this.isAutoPlayEnable;
    }

    public final Integer component2() {
        return this.animationType;
    }

    public final float component3() {
        return this.showButtonSeconds;
    }

    public final float component4() {
        return this.buttonColorShowSeconds;
    }

    public final String component5() {
        return this.SearchAdTransformButtonColor;
    }

    public final Integer component6() {
        return this.showMaskTimes;
    }

    public final String component7() {
        return this.SearchAdTransformButtonText;
    }

    public final AwemeSearchAdModel copy(Boolean bool, Integer num, float f, float f2, String str, Integer num2, String str2) {
        return new AwemeSearchAdModel(bool, num, f, f2, str, num2, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeSearchAdModel)) {
            return false;
        }
        AwemeSearchAdModel awemeSearchAdModel = (AwemeSearchAdModel) obj;
        return C89219l.m154714a(this.isAutoPlayEnable, awemeSearchAdModel.isAutoPlayEnable) && C89219l.m154714a(this.animationType, awemeSearchAdModel.animationType) && Float.compare(this.showButtonSeconds, awemeSearchAdModel.showButtonSeconds) == 0 && Float.compare(this.buttonColorShowSeconds, awemeSearchAdModel.buttonColorShowSeconds) == 0 && C89219l.m154714a(this.SearchAdTransformButtonColor, awemeSearchAdModel.SearchAdTransformButtonColor) && C89219l.m154714a(this.showMaskTimes, awemeSearchAdModel.showMaskTimes) && C89219l.m154714a(this.SearchAdTransformButtonText, awemeSearchAdModel.SearchAdTransformButtonText);
    }

    public final int hashCode() {
        Boolean bool = this.isAutoPlayEnable;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Integer num = this.animationType;
        int hashCode2 = (((((hashCode + (num != null ? num.hashCode() : 0)) * 31) + m93194x18566766(this.showButtonSeconds)) * 31) + m93194x18566766(this.buttonColorShowSeconds)) * 31;
        String str = this.SearchAdTransformButtonColor;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Integer num2 = this.showMaskTimes;
        int hashCode4 = (hashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str2 = this.SearchAdTransformButtonText;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "AwemeSearchAdModel(isAutoPlayEnable=" + this.isAutoPlayEnable + ", animationType=" + this.animationType + ", showButtonSeconds=" + this.showButtonSeconds + ", buttonColorShowSeconds=" + this.buttonColorShowSeconds + ", SearchAdTransformButtonColor=" + this.SearchAdTransformButtonColor + ", showMaskTimes=" + this.showMaskTimes + ", SearchAdTransformButtonText=" + this.SearchAdTransformButtonText + ")";
    }

    public final Integer getAnimationType() {
        return this.animationType;
    }

    public final float getButtonColorShowSeconds() {
        return this.buttonColorShowSeconds;
    }

    public final String getSearchAdTransformButtonColor() {
        return this.SearchAdTransformButtonColor;
    }

    public final String getSearchAdTransformButtonText() {
        return this.SearchAdTransformButtonText;
    }

    public final float getShowButtonSeconds() {
        return this.showButtonSeconds;
    }

    public final Integer getShowMaskTimes() {
        return this.showMaskTimes;
    }

    public final Boolean isAutoPlayEnable() {
        return this.isAutoPlayEnable;
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_search_AwemeSearchAdModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93194x18566766(float f) {
        return Float.floatToIntBits(f);
    }

    public AwemeSearchAdModel(Boolean bool, Integer num, float f, float f2, String str, Integer num2, String str2) {
        this.isAutoPlayEnable = bool;
        this.animationType = num;
        this.showButtonSeconds = f;
        this.buttonColorShowSeconds = f2;
        this.SearchAdTransformButtonColor = str;
        this.showMaskTimes = num2;
        this.SearchAdTransformButtonText = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AwemeSearchAdModel(Boolean bool, Integer num, float f, float f2, String str, Integer num2, String str2, int i, C89214g gVar) {
        this(bool, num, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? 0.0f : f2, str, num2, str2);
    }
}
