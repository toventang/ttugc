package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextCoverConfig */
public final class OuterEffectTextCoverConfig implements Parcelable {
    public static final Parcelable.Creator<OuterEffectTextCoverConfig> CREATOR = new C46064a();
    @AbstractC27891c(mo46611a = "gradient_orientation")
    private final int gradientOrientation;
    @AbstractC27891c(mo46611a = "gradient_type")
    private final int gradientType;
    @AbstractC27891c(mo46611a = "offsetX")
    private final float offsetX;
    @AbstractC27891c(mo46611a = "offsetY")
    private final float offsetY;
    @AbstractC27891c(mo46611a = "paint_style")
    private final int paintStyle;
    @AbstractC27891c(mo46611a = "shadow_config")
    private final OuterEffectTextShadowConfig shadowConfig;
    @AbstractC27891c(mo46611a = "stroke_configs")
    private final List<OuterEffectTextStrokeConfig> strokeConfigs;
    @AbstractC27891c(mo46611a = "text_color_end")
    private final String textColorEnd;
    @AbstractC27891c(mo46611a = "text_color_start")
    private final String textColorStart;

    static {
        Covode.recordClassIndex(54611);
    }

    public OuterEffectTextCoverConfig() {
        this(null, null, 0, 0, 0, 0.0f, 0.0f, null, null, 511, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextCoverConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88925x5a4f4958(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextCoverConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OuterEffectTextCoverConfig copy$default(OuterEffectTextCoverConfig outerEffectTextCoverConfig, String str, String str2, int i, int i2, int i3, float f, float f2, List list, OuterEffectTextShadowConfig outerEffectTextShadowConfig, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = outerEffectTextCoverConfig.textColorStart;
        }
        if ((i4 & 2) != 0) {
            str2 = outerEffectTextCoverConfig.textColorEnd;
        }
        if ((i4 & 4) != 0) {
            i = outerEffectTextCoverConfig.gradientType;
        }
        if ((i4 & 8) != 0) {
            i2 = outerEffectTextCoverConfig.gradientOrientation;
        }
        if ((i4 & 16) != 0) {
            i3 = outerEffectTextCoverConfig.paintStyle;
        }
        if ((i4 & 32) != 0) {
            f = outerEffectTextCoverConfig.offsetX;
        }
        if ((i4 & 64) != 0) {
            f2 = outerEffectTextCoverConfig.offsetY;
        }
        if ((i4 & 128) != 0) {
            list = outerEffectTextCoverConfig.strokeConfigs;
        }
        if ((i4 & 256) != 0) {
            outerEffectTextShadowConfig = outerEffectTextCoverConfig.shadowConfig;
        }
        return outerEffectTextCoverConfig.copy(str, str2, i, i2, i3, f, f2, list, outerEffectTextShadowConfig);
    }

    public final String component1() {
        return this.textColorStart;
    }

    public final String component2() {
        return this.textColorEnd;
    }

    public final int component3() {
        return this.gradientType;
    }

    public final int component4() {
        return this.gradientOrientation;
    }

    public final int component5() {
        return this.paintStyle;
    }

    public final float component6() {
        return this.offsetX;
    }

    public final float component7() {
        return this.offsetY;
    }

    public final List<OuterEffectTextStrokeConfig> component8() {
        return this.strokeConfigs;
    }

    public final OuterEffectTextShadowConfig component9() {
        return this.shadowConfig;
    }

    public final OuterEffectTextCoverConfig copy(String str, String str2, int i, int i2, int i3, float f, float f2, List<OuterEffectTextStrokeConfig> list, OuterEffectTextShadowConfig outerEffectTextShadowConfig) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(list, "");
        return new OuterEffectTextCoverConfig(str, str2, i, i2, i3, f, f2, list, outerEffectTextShadowConfig);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OuterEffectTextCoverConfig)) {
            return false;
        }
        OuterEffectTextCoverConfig outerEffectTextCoverConfig = (OuterEffectTextCoverConfig) obj;
        return C89219l.m154714a(this.textColorStart, outerEffectTextCoverConfig.textColorStart) && C89219l.m154714a(this.textColorEnd, outerEffectTextCoverConfig.textColorEnd) && this.gradientType == outerEffectTextCoverConfig.gradientType && this.gradientOrientation == outerEffectTextCoverConfig.gradientOrientation && this.paintStyle == outerEffectTextCoverConfig.paintStyle && Float.compare(this.offsetX, outerEffectTextCoverConfig.offsetX) == 0 && Float.compare(this.offsetY, outerEffectTextCoverConfig.offsetY) == 0 && C89219l.m154714a(this.strokeConfigs, outerEffectTextCoverConfig.strokeConfigs) && C89219l.m154714a(this.shadowConfig, outerEffectTextCoverConfig.shadowConfig);
    }

    public final int hashCode() {
        String str = this.textColorStart;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.textColorEnd;
        int hashCode2 = (((((((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + m88925x5a4f4958(this.gradientType)) * 31) + m88925x5a4f4958(this.gradientOrientation)) * 31) + m88925x5a4f4958(this.paintStyle)) * 31) + m88924x5a4f4958(this.offsetX)) * 31) + m88924x5a4f4958(this.offsetY)) * 31;
        List<OuterEffectTextStrokeConfig> list = this.strokeConfigs;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        OuterEffectTextShadowConfig outerEffectTextShadowConfig = this.shadowConfig;
        if (outerEffectTextShadowConfig != null) {
            i = outerEffectTextShadowConfig.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "OuterEffectTextCoverConfig(textColorStart=" + this.textColorStart + ", textColorEnd=" + this.textColorEnd + ", gradientType=" + this.gradientType + ", gradientOrientation=" + this.gradientOrientation + ", paintStyle=" + this.paintStyle + ", offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", strokeConfigs=" + this.strokeConfigs + ", shadowConfig=" + this.shadowConfig + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.textColorStart);
        parcel.writeString(this.textColorEnd);
        parcel.writeInt(this.gradientType);
        parcel.writeInt(this.gradientOrientation);
        parcel.writeInt(this.paintStyle);
        parcel.writeFloat(this.offsetX);
        parcel.writeFloat(this.offsetY);
        List<OuterEffectTextStrokeConfig> list = this.strokeConfigs;
        parcel.writeInt(list.size());
        for (OuterEffectTextStrokeConfig outerEffectTextStrokeConfig : list) {
            outerEffectTextStrokeConfig.writeToParcel(parcel, 0);
        }
        OuterEffectTextShadowConfig outerEffectTextShadowConfig = this.shadowConfig;
        if (outerEffectTextShadowConfig != null) {
            parcel.writeInt(1);
            outerEffectTextShadowConfig.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public final int getGradientOrientation() {
        return this.gradientOrientation;
    }

    public final int getGradientType() {
        return this.gradientType;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final int getPaintStyle() {
        return this.paintStyle;
    }

    public final OuterEffectTextShadowConfig getShadowConfig() {
        return this.shadowConfig;
    }

    public final List<OuterEffectTextStrokeConfig> getStrokeConfigs() {
        return this.strokeConfigs;
    }

    public final String getTextColorEnd() {
        return this.textColorEnd;
    }

    public final String getTextColorStart() {
        return this.textColorStart;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextCoverConfig$a */
    public static class C46064a implements Parcelable.Creator<OuterEffectTextCoverConfig> {
        static {
            Covode.recordClassIndex(54612);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OuterEffectTextCoverConfig[] newArray(int i) {
            return new OuterEffectTextCoverConfig[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OuterEffectTextCoverConfig createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            int readInt4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt4);
            while (readInt4 != 0) {
                arrayList.add(OuterEffectTextStrokeConfig.CREATOR.createFromParcel(parcel));
                readInt4--;
            }
            return new OuterEffectTextCoverConfig(readString, readString2, readInt, readInt2, readInt3, readFloat, readFloat2, arrayList, parcel.readInt() != 0 ? OuterEffectTextShadowConfig.CREATOR.createFromParcel(parcel) : null);
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextCoverConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88924x5a4f4958(float f) {
        return Float.floatToIntBits(f);
    }

    public OuterEffectTextCoverConfig(String str, String str2, int i, int i2, int i3, float f, float f2, List<OuterEffectTextStrokeConfig> list, OuterEffectTextShadowConfig outerEffectTextShadowConfig) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(list, "");
        this.textColorStart = str;
        this.textColorEnd = str2;
        this.gradientType = i;
        this.gradientOrientation = i2;
        this.paintStyle = i3;
        this.offsetX = f;
        this.offsetY = f2;
        this.strokeConfigs = list;
        this.shadowConfig = outerEffectTextShadowConfig;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OuterEffectTextCoverConfig(String str, String str2, int i, int i2, int i3, float f, float f2, List list, OuterEffectTextShadowConfig outerEffectTextShadowConfig, int i4, C89214g gVar) {
        this((i4 & 1) != 0 ? "#ffff0000" : str, (i4 & 2) != 0 ? "#ff0000ff" : str2, (i4 & 4) != 0 ? EnumC46096k.NONE.getType() : i, (i4 & 8) != 0 ? EnumC46094j.VERTICAL.getOrientation() : i2, (i4 & 16) != 0 ? Paint.Style.STROKE.ordinal() : i3, (i4 & 32) != 0 ? 0.0f : f, (i4 & 64) == 0 ? f2 : 0.0f, (i4 & 128) != 0 ? new ArrayList() : list, (i4 & 256) != 0 ? null : outerEffectTextShadowConfig);
    }
}
