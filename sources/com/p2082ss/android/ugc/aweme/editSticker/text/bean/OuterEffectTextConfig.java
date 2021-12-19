package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextConfig */
public final class OuterEffectTextConfig implements Parcelable {
    public static final Parcelable.Creator<OuterEffectTextConfig> CREATOR = new C46063a();
    @AbstractC27891c(mo46611a = "bg_configs")
    private final List<OuterEffectTextBgConfig> bgConfigs;
    @AbstractC27891c(mo46611a = "cover_configs")
    private final List<OuterEffectTextCoverConfig> coverConfigs;
    @AbstractC27891c(mo46611a = "cursor_color")
    private final String cursorColor;
    @AbstractC27891c(mo46611a = "font_style")
    private final int fontStyle;
    @AbstractC27891c(mo46611a = "gradient_orientation")
    private final int gradientOrientation;
    @AbstractC27891c(mo46611a = "gradient_type")
    private final int gradientType;
    @AbstractC27891c(mo46611a = "gravity")
    private final int gravity;
    @AbstractC27891c(mo46611a = "layer_weight")
    private final int layerWeight;
    @AbstractC27891c(mo46611a = "margin_bottom")
    private final int marginBottom;
    @AbstractC27891c(mo46611a = "margin_end")
    private final int marginEnd;
    @AbstractC27891c(mo46611a = "margin_start")
    private final int marginStart;
    @AbstractC27891c(mo46611a = "margin_top")
    private final int marginTop;
    @AbstractC27891c(mo46611a = "max_line")
    private final int maxLine;
    @AbstractC27891c(mo46611a = "min_height")
    private final int minHeight;
    @AbstractC27891c(mo46611a = "min_width")
    private final int minWidth;
    @AbstractC27891c(mo46611a = "padding_bottom")
    private final int paddingBottom;
    @AbstractC27891c(mo46611a = "padding_end")
    private final int paddingEnd;
    @AbstractC27891c(mo46611a = "padding_start")
    private final int paddingStart;
    @AbstractC27891c(mo46611a = "padding_top")
    private final int paddingTop;
    @AbstractC27891c(mo46611a = "paint_style")
    private final int paintStyle;
    @AbstractC27891c(mo46611a = "placeholder_string_color")
    private final String placeholderStringColor;
    @AbstractC27891c(mo46611a = "shadow_config")
    private final OuterEffectTextShadowConfig shadowConfig;
    @AbstractC27891c(mo46611a = "spacing_add")
    private final float spacingAdd;
    @AbstractC27891c(mo46611a = "spacing_letter")
    private final float spacingLetter;
    @AbstractC27891c(mo46611a = "spacing_mult")
    private final float spacingMult;
    @AbstractC27891c(mo46611a = "stroke_configs")
    private final List<OuterEffectTextStrokeConfig> strokeConfigs;
    @AbstractC27891c(mo46611a = "text_color_end")
    private final String textColorEnd;
    @AbstractC27891c(mo46611a = "text_color_start")
    private final String textColorStart;
    @AbstractC27891c(mo46611a = "text_size")
    private final int textSize;
    @AbstractC27891c(mo46611a = "typeface_id")
    private final String typefaceId;

    static {
        Covode.recordClassIndex(54609);
    }

    public OuterEffectTextConfig() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 0, null, null, 0, 0, 0, 0.0f, 0.0f, 0.0f, null, null, null, null, null, 1073741823, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88923x28987713(int i) {
        return i;
    }

    public static /* synthetic */ OuterEffectTextConfig copy$default(OuterEffectTextConfig outerEffectTextConfig, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, String str, String str2, int i14, int i15, String str3, String str4, int i16, int i17, int i18, float f, float f2, float f3, String str5, List list, List list2, List list3, OuterEffectTextShadowConfig outerEffectTextShadowConfig, int i19, Object obj) {
        String str6 = str;
        int i20 = i13;
        int i21 = i12;
        int i22 = i11;
        int i23 = i4;
        int i24 = i3;
        int i25 = i2;
        int i26 = i;
        int i27 = i5;
        int i28 = i6;
        int i29 = i7;
        int i30 = i8;
        int i31 = i9;
        int i32 = i10;
        List list4 = list3;
        List list5 = list2;
        List list6 = list;
        String str7 = str5;
        float f4 = f3;
        String str8 = str3;
        int i33 = i15;
        int i34 = i14;
        String str9 = str2;
        String str10 = str4;
        int i35 = i16;
        int i36 = i17;
        int i37 = i18;
        float f5 = f;
        OuterEffectTextShadowConfig outerEffectTextShadowConfig2 = outerEffectTextShadowConfig;
        float f6 = f2;
        if ((i19 & 1) != 0) {
            i26 = outerEffectTextConfig.paddingStart;
        }
        if ((i19 & 2) != 0) {
            i25 = outerEffectTextConfig.paddingEnd;
        }
        if ((i19 & 4) != 0) {
            i24 = outerEffectTextConfig.paddingTop;
        }
        if ((i19 & 8) != 0) {
            i23 = outerEffectTextConfig.paddingBottom;
        }
        if ((i19 & 16) != 0) {
            i27 = outerEffectTextConfig.layerWeight;
        }
        if ((i19 & 32) != 0) {
            i28 = outerEffectTextConfig.marginStart;
        }
        if ((i19 & 64) != 0) {
            i29 = outerEffectTextConfig.marginEnd;
        }
        if ((i19 & 128) != 0) {
            i30 = outerEffectTextConfig.marginTop;
        }
        if ((i19 & 256) != 0) {
            i31 = outerEffectTextConfig.marginBottom;
        }
        if ((i19 & 512) != 0) {
            i32 = outerEffectTextConfig.textSize;
        }
        if ((i19 & 1024) != 0) {
            i22 = outerEffectTextConfig.maxLine;
        }
        if ((i19 & 2048) != 0) {
            i21 = outerEffectTextConfig.minWidth;
        }
        if ((i19 & 4096) != 0) {
            i20 = outerEffectTextConfig.minHeight;
        }
        if ((i19 & 8192) != 0) {
            str6 = outerEffectTextConfig.placeholderStringColor;
        }
        if ((i19 & 16384) != 0) {
            str9 = outerEffectTextConfig.typefaceId;
        }
        if ((32768 & i19) != 0) {
            i34 = outerEffectTextConfig.fontStyle;
        }
        if ((65536 & i19) != 0) {
            i33 = outerEffectTextConfig.paintStyle;
        }
        if ((131072 & i19) != 0) {
            str8 = outerEffectTextConfig.textColorStart;
        }
        if ((262144 & i19) != 0) {
            str10 = outerEffectTextConfig.textColorEnd;
        }
        if ((524288 & i19) != 0) {
            i35 = outerEffectTextConfig.gradientType;
        }
        if ((1048576 & i19) != 0) {
            i36 = outerEffectTextConfig.gradientOrientation;
        }
        if ((2097152 & i19) != 0) {
            i37 = outerEffectTextConfig.gravity;
        }
        if ((4194304 & i19) != 0) {
            f5 = outerEffectTextConfig.spacingMult;
        }
        if ((8388608 & i19) != 0) {
            f6 = outerEffectTextConfig.spacingAdd;
        }
        if ((16777216 & i19) != 0) {
            f4 = outerEffectTextConfig.spacingLetter;
        }
        if ((33554432 & i19) != 0) {
            str7 = outerEffectTextConfig.cursorColor;
        }
        if ((67108864 & i19) != 0) {
            list6 = outerEffectTextConfig.strokeConfigs;
        }
        if ((134217728 & i19) != 0) {
            list5 = outerEffectTextConfig.coverConfigs;
        }
        if ((268435456 & i19) != 0) {
            list4 = outerEffectTextConfig.bgConfigs;
        }
        if ((i19 & 536870912) != 0) {
            outerEffectTextShadowConfig2 = outerEffectTextConfig.shadowConfig;
        }
        return outerEffectTextConfig.copy(i26, i25, i24, i23, i27, i28, i29, i30, i31, i32, i22, i21, i20, str6, str9, i34, i33, str8, str10, i35, i36, i37, f5, f6, f4, str7, list6, list5, list4, outerEffectTextShadowConfig2);
    }

    public final int component1() {
        return this.paddingStart;
    }

    public final int component10() {
        return this.textSize;
    }

    public final int component11() {
        return this.maxLine;
    }

    public final int component12() {
        return this.minWidth;
    }

    public final int component13() {
        return this.minHeight;
    }

    public final String component14() {
        return this.placeholderStringColor;
    }

    public final String component15() {
        return this.typefaceId;
    }

    public final int component16() {
        return this.fontStyle;
    }

    public final int component17() {
        return this.paintStyle;
    }

    public final String component18() {
        return this.textColorStart;
    }

    public final String component19() {
        return this.textColorEnd;
    }

    public final int component2() {
        return this.paddingEnd;
    }

    public final int component20() {
        return this.gradientType;
    }

    public final int component21() {
        return this.gradientOrientation;
    }

    public final int component22() {
        return this.gravity;
    }

    public final float component23() {
        return this.spacingMult;
    }

    public final float component24() {
        return this.spacingAdd;
    }

    public final float component25() {
        return this.spacingLetter;
    }

    public final String component26() {
        return this.cursorColor;
    }

    public final List<OuterEffectTextStrokeConfig> component27() {
        return this.strokeConfigs;
    }

    public final List<OuterEffectTextCoverConfig> component28() {
        return this.coverConfigs;
    }

    public final List<OuterEffectTextBgConfig> component29() {
        return this.bgConfigs;
    }

    public final int component3() {
        return this.paddingTop;
    }

    public final OuterEffectTextShadowConfig component30() {
        return this.shadowConfig;
    }

    public final int component4() {
        return this.paddingBottom;
    }

    public final int component5() {
        return this.layerWeight;
    }

    public final int component6() {
        return this.marginStart;
    }

    public final int component7() {
        return this.marginEnd;
    }

    public final int component8() {
        return this.marginTop;
    }

    public final int component9() {
        return this.marginBottom;
    }

    public final OuterEffectTextConfig copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, String str, String str2, int i14, int i15, String str3, String str4, int i16, int i17, int i18, float f, float f2, float f3, String str5, List<OuterEffectTextStrokeConfig> list, List<OuterEffectTextCoverConfig> list2, List<OuterEffectTextBgConfig> list3, OuterEffectTextShadowConfig outerEffectTextShadowConfig) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        C89219l.m154721d(list3, "");
        return new OuterEffectTextConfig(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, str, str2, i14, i15, str3, str4, i16, i17, i18, f, f2, f3, str5, list, list2, list3, outerEffectTextShadowConfig);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OuterEffectTextConfig)) {
            return false;
        }
        OuterEffectTextConfig outerEffectTextConfig = (OuterEffectTextConfig) obj;
        return this.paddingStart == outerEffectTextConfig.paddingStart && this.paddingEnd == outerEffectTextConfig.paddingEnd && this.paddingTop == outerEffectTextConfig.paddingTop && this.paddingBottom == outerEffectTextConfig.paddingBottom && this.layerWeight == outerEffectTextConfig.layerWeight && this.marginStart == outerEffectTextConfig.marginStart && this.marginEnd == outerEffectTextConfig.marginEnd && this.marginTop == outerEffectTextConfig.marginTop && this.marginBottom == outerEffectTextConfig.marginBottom && this.textSize == outerEffectTextConfig.textSize && this.maxLine == outerEffectTextConfig.maxLine && this.minWidth == outerEffectTextConfig.minWidth && this.minHeight == outerEffectTextConfig.minHeight && C89219l.m154714a(this.placeholderStringColor, outerEffectTextConfig.placeholderStringColor) && C89219l.m154714a(this.typefaceId, outerEffectTextConfig.typefaceId) && this.fontStyle == outerEffectTextConfig.fontStyle && this.paintStyle == outerEffectTextConfig.paintStyle && C89219l.m154714a(this.textColorStart, outerEffectTextConfig.textColorStart) && C89219l.m154714a(this.textColorEnd, outerEffectTextConfig.textColorEnd) && this.gradientType == outerEffectTextConfig.gradientType && this.gradientOrientation == outerEffectTextConfig.gradientOrientation && this.gravity == outerEffectTextConfig.gravity && Float.compare(this.spacingMult, outerEffectTextConfig.spacingMult) == 0 && Float.compare(this.spacingAdd, outerEffectTextConfig.spacingAdd) == 0 && Float.compare(this.spacingLetter, outerEffectTextConfig.spacingLetter) == 0 && C89219l.m154714a(this.cursorColor, outerEffectTextConfig.cursorColor) && C89219l.m154714a(this.strokeConfigs, outerEffectTextConfig.strokeConfigs) && C89219l.m154714a(this.coverConfigs, outerEffectTextConfig.coverConfigs) && C89219l.m154714a(this.bgConfigs, outerEffectTextConfig.bgConfigs) && C89219l.m154714a(this.shadowConfig, outerEffectTextConfig.shadowConfig);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((((((((((((((((((((((m88923x28987713(this.paddingStart) * 31) + m88923x28987713(this.paddingEnd)) * 31) + m88923x28987713(this.paddingTop)) * 31) + m88923x28987713(this.paddingBottom)) * 31) + m88923x28987713(this.layerWeight)) * 31) + m88923x28987713(this.marginStart)) * 31) + m88923x28987713(this.marginEnd)) * 31) + m88923x28987713(this.marginTop)) * 31) + m88923x28987713(this.marginBottom)) * 31) + m88923x28987713(this.textSize)) * 31) + m88923x28987713(this.maxLine)) * 31) + m88923x28987713(this.minWidth)) * 31) + m88923x28987713(this.minHeight)) * 31;
        String str = this.placeholderStringColor;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.typefaceId;
        int hashCode2 = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + m88923x28987713(this.fontStyle)) * 31) + m88923x28987713(this.paintStyle)) * 31;
        String str3 = this.textColorStart;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.textColorEnd;
        int hashCode4 = (((((((((((((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + m88923x28987713(this.gradientType)) * 31) + m88923x28987713(this.gradientOrientation)) * 31) + m88923x28987713(this.gravity)) * 31) + m88922x28987713(this.spacingMult)) * 31) + m88922x28987713(this.spacingAdd)) * 31) + m88922x28987713(this.spacingLetter)) * 31;
        String str5 = this.cursorColor;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<OuterEffectTextStrokeConfig> list = this.strokeConfigs;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        List<OuterEffectTextCoverConfig> list2 = this.coverConfigs;
        int hashCode7 = (hashCode6 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<OuterEffectTextBgConfig> list3 = this.bgConfigs;
        int hashCode8 = (hashCode7 + (list3 != null ? list3.hashCode() : 0)) * 31;
        OuterEffectTextShadowConfig outerEffectTextShadowConfig = this.shadowConfig;
        if (outerEffectTextShadowConfig != null) {
            i = outerEffectTextShadowConfig.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        return "OuterEffectTextConfig(paddingStart=" + this.paddingStart + ", paddingEnd=" + this.paddingEnd + ", paddingTop=" + this.paddingTop + ", paddingBottom=" + this.paddingBottom + ", layerWeight=" + this.layerWeight + ", marginStart=" + this.marginStart + ", marginEnd=" + this.marginEnd + ", marginTop=" + this.marginTop + ", marginBottom=" + this.marginBottom + ", textSize=" + this.textSize + ", maxLine=" + this.maxLine + ", minWidth=" + this.minWidth + ", minHeight=" + this.minHeight + ", placeholderStringColor=" + this.placeholderStringColor + ", typefaceId=" + this.typefaceId + ", fontStyle=" + this.fontStyle + ", paintStyle=" + this.paintStyle + ", textColorStart=" + this.textColorStart + ", textColorEnd=" + this.textColorEnd + ", gradientType=" + this.gradientType + ", gradientOrientation=" + this.gradientOrientation + ", gravity=" + this.gravity + ", spacingMult=" + this.spacingMult + ", spacingAdd=" + this.spacingAdd + ", spacingLetter=" + this.spacingLetter + ", cursorColor=" + this.cursorColor + ", strokeConfigs=" + this.strokeConfigs + ", coverConfigs=" + this.coverConfigs + ", bgConfigs=" + this.bgConfigs + ", shadowConfig=" + this.shadowConfig + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.paddingStart);
        parcel.writeInt(this.paddingEnd);
        parcel.writeInt(this.paddingTop);
        parcel.writeInt(this.paddingBottom);
        parcel.writeInt(this.layerWeight);
        parcel.writeInt(this.marginStart);
        parcel.writeInt(this.marginEnd);
        parcel.writeInt(this.marginTop);
        parcel.writeInt(this.marginBottom);
        parcel.writeInt(this.textSize);
        parcel.writeInt(this.maxLine);
        parcel.writeInt(this.minWidth);
        parcel.writeInt(this.minHeight);
        parcel.writeString(this.placeholderStringColor);
        parcel.writeString(this.typefaceId);
        parcel.writeInt(this.fontStyle);
        parcel.writeInt(this.paintStyle);
        parcel.writeString(this.textColorStart);
        parcel.writeString(this.textColorEnd);
        parcel.writeInt(this.gradientType);
        parcel.writeInt(this.gradientOrientation);
        parcel.writeInt(this.gravity);
        parcel.writeFloat(this.spacingMult);
        parcel.writeFloat(this.spacingAdd);
        parcel.writeFloat(this.spacingLetter);
        parcel.writeString(this.cursorColor);
        List<OuterEffectTextStrokeConfig> list = this.strokeConfigs;
        parcel.writeInt(list.size());
        for (OuterEffectTextStrokeConfig outerEffectTextStrokeConfig : list) {
            outerEffectTextStrokeConfig.writeToParcel(parcel, 0);
        }
        List<OuterEffectTextCoverConfig> list2 = this.coverConfigs;
        parcel.writeInt(list2.size());
        for (OuterEffectTextCoverConfig outerEffectTextCoverConfig : list2) {
            outerEffectTextCoverConfig.writeToParcel(parcel, 0);
        }
        List<OuterEffectTextBgConfig> list3 = this.bgConfigs;
        parcel.writeInt(list3.size());
        for (OuterEffectTextBgConfig outerEffectTextBgConfig : list3) {
            outerEffectTextBgConfig.writeToParcel(parcel, 0);
        }
        OuterEffectTextShadowConfig outerEffectTextShadowConfig = this.shadowConfig;
        if (outerEffectTextShadowConfig != null) {
            parcel.writeInt(1);
            outerEffectTextShadowConfig.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public final List<OuterEffectTextBgConfig> getBgConfigs() {
        return this.bgConfigs;
    }

    public final List<OuterEffectTextCoverConfig> getCoverConfigs() {
        return this.coverConfigs;
    }

    public final String getCursorColor() {
        return this.cursorColor;
    }

    public final int getFontStyle() {
        return this.fontStyle;
    }

    public final int getGradientOrientation() {
        return this.gradientOrientation;
    }

    public final int getGradientType() {
        return this.gradientType;
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getLayerWeight() {
        return this.layerWeight;
    }

    public final int getMarginBottom() {
        return this.marginBottom;
    }

    public final int getMarginEnd() {
        return this.marginEnd;
    }

    public final int getMarginStart() {
        return this.marginStart;
    }

    public final int getMarginTop() {
        return this.marginTop;
    }

    public final int getMaxLine() {
        return this.maxLine;
    }

    public final int getMinHeight() {
        return this.minHeight;
    }

    public final int getMinWidth() {
        return this.minWidth;
    }

    public final int getPaddingBottom() {
        return this.paddingBottom;
    }

    public final int getPaddingEnd() {
        return this.paddingEnd;
    }

    public final int getPaddingStart() {
        return this.paddingStart;
    }

    public final int getPaddingTop() {
        return this.paddingTop;
    }

    public final int getPaintStyle() {
        return this.paintStyle;
    }

    public final String getPlaceholderStringColor() {
        return this.placeholderStringColor;
    }

    public final OuterEffectTextShadowConfig getShadowConfig() {
        return this.shadowConfig;
    }

    public final float getSpacingAdd() {
        return this.spacingAdd;
    }

    public final float getSpacingLetter() {
        return this.spacingLetter;
    }

    public final float getSpacingMult() {
        return this.spacingMult;
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

    public final int getTextSize() {
        return this.textSize;
    }

    public final String getTypefaceId() {
        return this.typefaceId;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextConfig$a */
    public static class C46063a implements Parcelable.Creator<OuterEffectTextConfig> {
        static {
            Covode.recordClassIndex(54610);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OuterEffectTextConfig[] newArray(int i) {
            return new OuterEffectTextConfig[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OuterEffectTextConfig createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            int readInt7 = parcel.readInt();
            int readInt8 = parcel.readInt();
            int readInt9 = parcel.readInt();
            int readInt10 = parcel.readInt();
            int readInt11 = parcel.readInt();
            int readInt12 = parcel.readInt();
            int readInt13 = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt14 = parcel.readInt();
            int readInt15 = parcel.readInt();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt16 = parcel.readInt();
            int readInt17 = parcel.readInt();
            int readInt18 = parcel.readInt();
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            float readFloat3 = parcel.readFloat();
            String readString5 = parcel.readString();
            int readInt19 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt19);
            while (readInt19 != 0) {
                arrayList.add(OuterEffectTextStrokeConfig.CREATOR.createFromParcel(parcel));
                readInt19--;
            }
            int readInt20 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt20);
            while (readInt20 != 0) {
                arrayList2.add(OuterEffectTextCoverConfig.CREATOR.createFromParcel(parcel));
                readInt20--;
            }
            int readInt21 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt21);
            while (readInt21 != 0) {
                arrayList3.add(OuterEffectTextBgConfig.CREATOR.createFromParcel(parcel));
                readInt21--;
            }
            return new OuterEffectTextConfig(readInt, readInt2, readInt3, readInt4, readInt5, readInt6, readInt7, readInt8, readInt9, readInt10, readInt11, readInt12, readInt13, readString, readString2, readInt14, readInt15, readString3, readString4, readInt16, readInt17, readInt18, readFloat, readFloat2, readFloat3, readString5, arrayList, arrayList2, arrayList3, parcel.readInt() != 0 ? OuterEffectTextShadowConfig.CREATOR.createFromParcel(parcel) : null);
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88922x28987713(float f) {
        return Float.floatToIntBits(f);
    }

    public OuterEffectTextConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, String str, String str2, int i14, int i15, String str3, String str4, int i16, int i17, int i18, float f, float f2, float f3, String str5, List<OuterEffectTextStrokeConfig> list, List<OuterEffectTextCoverConfig> list2, List<OuterEffectTextBgConfig> list3, OuterEffectTextShadowConfig outerEffectTextShadowConfig) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        C89219l.m154721d(list3, "");
        this.paddingStart = i;
        this.paddingEnd = i2;
        this.paddingTop = i3;
        this.paddingBottom = i4;
        this.layerWeight = i5;
        this.marginStart = i6;
        this.marginEnd = i7;
        this.marginTop = i8;
        this.marginBottom = i9;
        this.textSize = i10;
        this.maxLine = i11;
        this.minWidth = i12;
        this.minHeight = i13;
        this.placeholderStringColor = str;
        this.typefaceId = str2;
        this.fontStyle = i14;
        this.paintStyle = i15;
        this.textColorStart = str3;
        this.textColorEnd = str4;
        this.gradientType = i16;
        this.gradientOrientation = i17;
        this.gravity = i18;
        this.spacingMult = f;
        this.spacingAdd = f2;
        this.spacingLetter = f3;
        this.cursorColor = str5;
        this.strokeConfigs = list;
        this.coverConfigs = list2;
        this.bgConfigs = list3;
        this.shadowConfig = outerEffectTextShadowConfig;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ OuterEffectTextConfig(int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, int r41, int r42, int r43, int r44, int r45, java.lang.String r46, java.lang.String r47, int r48, int r49, java.lang.String r50, java.lang.String r51, int r52, int r53, int r54, float r55, float r56, float r57, java.lang.String r58, java.util.List r59, java.util.List r60, java.util.List r61, com.p2082ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextShadowConfig r62, int r63, p4600h.p4611f.p4613b.C89214g r64) {
        /*
        // Method dump skipped, instructions count: 280
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextConfig.<init>(int, int, int, int, int, int, int, int, int, int, int, int, int, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, int, int, int, float, float, float, java.lang.String, java.util.List, java.util.List, java.util.List, com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextShadowConfig, int, h.f.b.g):void");
    }
}
