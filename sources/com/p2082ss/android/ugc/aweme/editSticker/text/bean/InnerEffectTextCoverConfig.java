package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextCoverConfig */
public final class InnerEffectTextCoverConfig implements Parcelable {
    public static final Parcelable.Creator<InnerEffectTextCoverConfig> CREATOR = new C46056a();
    private final EnumC46094j gradientOrientation;
    private final EnumC46096k gradientType;
    private final float offsetX;
    private final float offsetY;
    private final Paint.Style paintStyle;
    private final InnerEffectTextShadowConfig shadowConfig;
    private final List<InnerEffectTextStrokeConfig> strokeConfigs;
    private final int textColorEnd;
    private final int textColorStart;

    static {
        Covode.recordClassIndex(54595);
    }

    public InnerEffectTextCoverConfig() {
        this(0, 0, null, null, null, 0.0f, 0.0f, null, null, 511, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextCoverConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88913xeb210f5d(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextCoverConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InnerEffectTextCoverConfig copy$default(InnerEffectTextCoverConfig innerEffectTextCoverConfig, int i, int i2, EnumC46096k kVar, EnumC46094j jVar, Paint.Style style, float f, float f2, List list, InnerEffectTextShadowConfig innerEffectTextShadowConfig, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = innerEffectTextCoverConfig.textColorStart;
        }
        if ((i3 & 2) != 0) {
            i2 = innerEffectTextCoverConfig.textColorEnd;
        }
        if ((i3 & 4) != 0) {
            kVar = innerEffectTextCoverConfig.gradientType;
        }
        if ((i3 & 8) != 0) {
            jVar = innerEffectTextCoverConfig.gradientOrientation;
        }
        if ((i3 & 16) != 0) {
            style = innerEffectTextCoverConfig.paintStyle;
        }
        if ((i3 & 32) != 0) {
            f = innerEffectTextCoverConfig.offsetX;
        }
        if ((i3 & 64) != 0) {
            f2 = innerEffectTextCoverConfig.offsetY;
        }
        if ((i3 & 128) != 0) {
            list = innerEffectTextCoverConfig.strokeConfigs;
        }
        if ((i3 & 256) != 0) {
            innerEffectTextShadowConfig = innerEffectTextCoverConfig.shadowConfig;
        }
        return innerEffectTextCoverConfig.copy(i, i2, kVar, jVar, style, f, f2, list, innerEffectTextShadowConfig);
    }

    public final int component1() {
        return this.textColorStart;
    }

    public final int component2() {
        return this.textColorEnd;
    }

    public final EnumC46096k component3() {
        return this.gradientType;
    }

    public final EnumC46094j component4() {
        return this.gradientOrientation;
    }

    public final Paint.Style component5() {
        return this.paintStyle;
    }

    public final float component6() {
        return this.offsetX;
    }

    public final float component7() {
        return this.offsetY;
    }

    public final List<InnerEffectTextStrokeConfig> component8() {
        return this.strokeConfigs;
    }

    public final InnerEffectTextShadowConfig component9() {
        return this.shadowConfig;
    }

    public final InnerEffectTextCoverConfig copy(int i, int i2, EnumC46096k kVar, EnumC46094j jVar, Paint.Style style, float f, float f2, List<InnerEffectTextStrokeConfig> list, InnerEffectTextShadowConfig innerEffectTextShadowConfig) {
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(style, "");
        C89219l.m154721d(list, "");
        return new InnerEffectTextCoverConfig(i, i2, kVar, jVar, style, f, f2, list, innerEffectTextShadowConfig);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerEffectTextCoverConfig)) {
            return false;
        }
        InnerEffectTextCoverConfig innerEffectTextCoverConfig = (InnerEffectTextCoverConfig) obj;
        return this.textColorStart == innerEffectTextCoverConfig.textColorStart && this.textColorEnd == innerEffectTextCoverConfig.textColorEnd && C89219l.m154714a(this.gradientType, innerEffectTextCoverConfig.gradientType) && C89219l.m154714a(this.gradientOrientation, innerEffectTextCoverConfig.gradientOrientation) && C89219l.m154714a(this.paintStyle, innerEffectTextCoverConfig.paintStyle) && Float.compare(this.offsetX, innerEffectTextCoverConfig.offsetX) == 0 && Float.compare(this.offsetY, innerEffectTextCoverConfig.offsetY) == 0 && C89219l.m154714a(this.strokeConfigs, innerEffectTextCoverConfig.strokeConfigs) && C89219l.m154714a(this.shadowConfig, innerEffectTextCoverConfig.shadowConfig);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextCoverConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((m88913xeb210f5d(this.textColorStart) * 31) + m88913xeb210f5d(this.textColorEnd)) * 31;
        EnumC46096k kVar = this.gradientType;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextCoverConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        EnumC46094j jVar = this.gradientOrientation;
        int hashCode2 = (hashCode + (jVar != null ? jVar.hashCode() : 0)) * 31;
        Paint.Style style = this.paintStyle;
        int hashCode3 = (((((hashCode2 + (style != null ? style.hashCode() : 0)) * 31) + m88912xeb210f5d(this.offsetX)) * 31) + m88912xeb210f5d(this.offsetY)) * 31;
        List<InnerEffectTextStrokeConfig> list = this.strokeConfigs;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        InnerEffectTextShadowConfig innerEffectTextShadowConfig = this.shadowConfig;
        if (innerEffectTextShadowConfig != null) {
            i = innerEffectTextShadowConfig.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "InnerEffectTextCoverConfig(textColorStart=" + this.textColorStart + ", textColorEnd=" + this.textColorEnd + ", gradientType=" + this.gradientType + ", gradientOrientation=" + this.gradientOrientation + ", paintStyle=" + this.paintStyle + ", offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", strokeConfigs=" + this.strokeConfigs + ", shadowConfig=" + this.shadowConfig + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.textColorStart);
        parcel.writeInt(this.textColorEnd);
        parcel.writeString(this.gradientType.name());
        parcel.writeString(this.gradientOrientation.name());
        parcel.writeString(this.paintStyle.name());
        parcel.writeFloat(this.offsetX);
        parcel.writeFloat(this.offsetY);
        List<InnerEffectTextStrokeConfig> list = this.strokeConfigs;
        parcel.writeInt(list.size());
        for (InnerEffectTextStrokeConfig innerEffectTextStrokeConfig : list) {
            innerEffectTextStrokeConfig.writeToParcel(parcel, 0);
        }
        InnerEffectTextShadowConfig innerEffectTextShadowConfig = this.shadowConfig;
        if (innerEffectTextShadowConfig != null) {
            parcel.writeInt(1);
            innerEffectTextShadowConfig.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public final EnumC46094j getGradientOrientation() {
        return this.gradientOrientation;
    }

    public final EnumC46096k getGradientType() {
        return this.gradientType;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final Paint.Style getPaintStyle() {
        return this.paintStyle;
    }

    public final InnerEffectTextShadowConfig getShadowConfig() {
        return this.shadowConfig;
    }

    public final List<InnerEffectTextStrokeConfig> getStrokeConfigs() {
        return this.strokeConfigs;
    }

    public final int getTextColorEnd() {
        return this.textColorEnd;
    }

    public final int getTextColorStart() {
        return this.textColorStart;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextCoverConfig$a */
    public static class C46056a implements Parcelable.Creator<InnerEffectTextCoverConfig> {
        static {
            Covode.recordClassIndex(54596);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ InnerEffectTextCoverConfig[] newArray(int i) {
            return new InnerEffectTextCoverConfig[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InnerEffectTextCoverConfig createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            EnumC46096k kVar = (EnumC46096k) Enum.valueOf(EnumC46096k.class, parcel.readString());
            EnumC46094j jVar = (EnumC46094j) Enum.valueOf(EnumC46094j.class, parcel.readString());
            Paint.Style style = (Paint.Style) Enum.valueOf(Paint.Style.class, parcel.readString());
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            while (readInt3 != 0) {
                arrayList.add(InnerEffectTextStrokeConfig.CREATOR.createFromParcel(parcel));
                readInt3--;
            }
            return new InnerEffectTextCoverConfig(readInt, readInt2, kVar, jVar, style, readFloat, readFloat2, arrayList, parcel.readInt() != 0 ? InnerEffectTextShadowConfig.CREATOR.createFromParcel(parcel) : null);
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextCoverConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88912xeb210f5d(float f) {
        return Float.floatToIntBits(f);
    }

    public InnerEffectTextCoverConfig(int i, int i2, EnumC46096k kVar, EnumC46094j jVar, Paint.Style style, float f, float f2, List<InnerEffectTextStrokeConfig> list, InnerEffectTextShadowConfig innerEffectTextShadowConfig) {
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(style, "");
        C89219l.m154721d(list, "");
        this.textColorStart = i;
        this.textColorEnd = i2;
        this.gradientType = kVar;
        this.gradientOrientation = jVar;
        this.paintStyle = style;
        this.offsetX = f;
        this.offsetY = f2;
        this.strokeConfigs = list;
        this.shadowConfig = innerEffectTextShadowConfig;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InnerEffectTextCoverConfig(int i, int i2, EnumC46096k kVar, EnumC46094j jVar, Paint.Style style, float f, float f2, List list, InnerEffectTextShadowConfig innerEffectTextShadowConfig, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? -65536 : i, (i3 & 2) != 0 ? -16776961 : i2, (i3 & 4) != 0 ? EnumC46096k.NONE : kVar, (i3 & 8) != 0 ? EnumC46094j.VERTICAL : jVar, (i3 & 16) != 0 ? Paint.Style.STROKE : style, (i3 & 32) != 0 ? 0.0f : f, (i3 & 64) == 0 ? f2 : 0.0f, (i3 & 128) != 0 ? new ArrayList() : list, (i3 & 256) != 0 ? null : innerEffectTextShadowConfig);
    }
}
