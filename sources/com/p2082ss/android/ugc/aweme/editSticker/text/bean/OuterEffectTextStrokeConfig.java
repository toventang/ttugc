package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextStrokeConfig */
public final class OuterEffectTextStrokeConfig implements Parcelable {
    public static final Parcelable.Creator<OuterEffectTextStrokeConfig> CREATOR = new C46067a();
    @AbstractC27891c(mo46611a = "stroke_color")
    private final String strokeColor;
    @AbstractC27891c(mo46611a = "stroke_join")
    private final int strokeJoin;
    @AbstractC27891c(mo46611a = "stroke_width")
    private final float strokeWidth;

    static {
        Covode.recordClassIndex(54617);
    }

    public OuterEffectTextStrokeConfig() {
        this(0.0f, null, 0, 7, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextStrokeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88930x2516a8ab(int i) {
        return i;
    }

    public static /* synthetic */ OuterEffectTextStrokeConfig copy$default(OuterEffectTextStrokeConfig outerEffectTextStrokeConfig, float f, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = outerEffectTextStrokeConfig.strokeWidth;
        }
        if ((i2 & 2) != 0) {
            str = outerEffectTextStrokeConfig.strokeColor;
        }
        if ((i2 & 4) != 0) {
            i = outerEffectTextStrokeConfig.strokeJoin;
        }
        return outerEffectTextStrokeConfig.copy(f, str, i);
    }

    public final float component1() {
        return this.strokeWidth;
    }

    public final String component2() {
        return this.strokeColor;
    }

    public final int component3() {
        return this.strokeJoin;
    }

    public final OuterEffectTextStrokeConfig copy(float f, String str, int i) {
        C89219l.m154721d(str, "");
        return new OuterEffectTextStrokeConfig(f, str, i);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OuterEffectTextStrokeConfig)) {
            return false;
        }
        OuterEffectTextStrokeConfig outerEffectTextStrokeConfig = (OuterEffectTextStrokeConfig) obj;
        return Float.compare(this.strokeWidth, outerEffectTextStrokeConfig.strokeWidth) == 0 && C89219l.m154714a(this.strokeColor, outerEffectTextStrokeConfig.strokeColor) && this.strokeJoin == outerEffectTextStrokeConfig.strokeJoin;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextStrokeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m88929x2516a8ab(this.strokeWidth) * 31;
        String str = this.strokeColor;
        return ((com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextStrokeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31) + m88930x2516a8ab(this.strokeJoin);
    }

    public final String toString() {
        return "OuterEffectTextStrokeConfig(strokeWidth=" + this.strokeWidth + ", strokeColor=" + this.strokeColor + ", strokeJoin=" + this.strokeJoin + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeFloat(this.strokeWidth);
        parcel.writeString(this.strokeColor);
        parcel.writeInt(this.strokeJoin);
    }

    public final String getStrokeColor() {
        return this.strokeColor;
    }

    public final int getStrokeJoin() {
        return this.strokeJoin;
    }

    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextStrokeConfig$a */
    public static class C46067a implements Parcelable.Creator<OuterEffectTextStrokeConfig> {
        static {
            Covode.recordClassIndex(54618);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OuterEffectTextStrokeConfig[] newArray(int i) {
            return new OuterEffectTextStrokeConfig[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OuterEffectTextStrokeConfig createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new OuterEffectTextStrokeConfig(parcel.readFloat(), parcel.readString(), parcel.readInt());
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextStrokeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88929x2516a8ab(float f) {
        return Float.floatToIntBits(f);
    }

    public OuterEffectTextStrokeConfig(float f, String str, int i) {
        C89219l.m154721d(str, "");
        this.strokeWidth = f;
        this.strokeColor = str;
        this.strokeJoin = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OuterEffectTextStrokeConfig(float f, String str, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? "#ff000000" : str, (i2 & 4) != 0 ? Paint.Join.ROUND.ordinal() : i);
    }
}
