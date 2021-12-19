package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextBgConfig */
public final class InnerEffectTextBgConfig implements Parcelable {
    public static final Parcelable.Creator<InnerEffectTextBgConfig> CREATOR = new C46054a();
    private final String bgName;
    private final EnumC46086e dimensionModeHeight;
    private final EnumC46086e dimensionModeWidth;
    private final int gravity;
    private final int height;
    private final boolean isNinePatch;
    private final int marginBottom;
    private final int marginEnd;
    private final int marginStart;
    private final int marginTop;
    private final EffectTextBgNinePatch ninePatchInfo;
    private final int width;

    static {
        Covode.recordClassIndex(54591);
    }

    public InnerEffectTextBgConfig() {
        this(null, false, null, 0, null, null, 0, 0, 0, 0, 0, 0, 4095, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextBgConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88909x1d613a93(int i) {
        return i;
    }

    public static /* synthetic */ InnerEffectTextBgConfig copy$default(InnerEffectTextBgConfig innerEffectTextBgConfig, String str, boolean z, EffectTextBgNinePatch effectTextBgNinePatch, int i, EnumC46086e eVar, EnumC46086e eVar2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = innerEffectTextBgConfig.bgName;
        }
        if ((i8 & 2) != 0) {
            z = innerEffectTextBgConfig.isNinePatch;
        }
        if ((i8 & 4) != 0) {
            effectTextBgNinePatch = innerEffectTextBgConfig.ninePatchInfo;
        }
        if ((i8 & 8) != 0) {
            i = innerEffectTextBgConfig.gravity;
        }
        if ((i8 & 16) != 0) {
            eVar = innerEffectTextBgConfig.dimensionModeWidth;
        }
        if ((i8 & 32) != 0) {
            eVar2 = innerEffectTextBgConfig.dimensionModeHeight;
        }
        if ((i8 & 64) != 0) {
            i2 = innerEffectTextBgConfig.width;
        }
        if ((i8 & 128) != 0) {
            i3 = innerEffectTextBgConfig.height;
        }
        if ((i8 & 256) != 0) {
            i4 = innerEffectTextBgConfig.marginStart;
        }
        if ((i8 & 512) != 0) {
            i5 = innerEffectTextBgConfig.marginEnd;
        }
        if ((i8 & 1024) != 0) {
            i6 = innerEffectTextBgConfig.marginTop;
        }
        if ((i8 & 2048) != 0) {
            i7 = innerEffectTextBgConfig.marginBottom;
        }
        return innerEffectTextBgConfig.copy(str, z, effectTextBgNinePatch, i, eVar, eVar2, i2, i3, i4, i5, i6, i7);
    }

    public final String component1() {
        return this.bgName;
    }

    public final int component10() {
        return this.marginEnd;
    }

    public final int component11() {
        return this.marginTop;
    }

    public final int component12() {
        return this.marginBottom;
    }

    public final boolean component2() {
        return this.isNinePatch;
    }

    public final EffectTextBgNinePatch component3() {
        return this.ninePatchInfo;
    }

    public final int component4() {
        return this.gravity;
    }

    public final EnumC46086e component5() {
        return this.dimensionModeWidth;
    }

    public final EnumC46086e component6() {
        return this.dimensionModeHeight;
    }

    public final int component7() {
        return this.width;
    }

    public final int component8() {
        return this.height;
    }

    public final int component9() {
        return this.marginStart;
    }

    public final InnerEffectTextBgConfig copy(String str, boolean z, EffectTextBgNinePatch effectTextBgNinePatch, int i, EnumC46086e eVar, EnumC46086e eVar2, int i2, int i3, int i4, int i5, int i6, int i7) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(effectTextBgNinePatch, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(eVar2, "");
        return new InnerEffectTextBgConfig(str, z, effectTextBgNinePatch, i, eVar, eVar2, i2, i3, i4, i5, i6, i7);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerEffectTextBgConfig)) {
            return false;
        }
        InnerEffectTextBgConfig innerEffectTextBgConfig = (InnerEffectTextBgConfig) obj;
        return C89219l.m154714a(this.bgName, innerEffectTextBgConfig.bgName) && this.isNinePatch == innerEffectTextBgConfig.isNinePatch && C89219l.m154714a(this.ninePatchInfo, innerEffectTextBgConfig.ninePatchInfo) && this.gravity == innerEffectTextBgConfig.gravity && C89219l.m154714a(this.dimensionModeWidth, innerEffectTextBgConfig.dimensionModeWidth) && C89219l.m154714a(this.dimensionModeHeight, innerEffectTextBgConfig.dimensionModeHeight) && this.width == innerEffectTextBgConfig.width && this.height == innerEffectTextBgConfig.height && this.marginStart == innerEffectTextBgConfig.marginStart && this.marginEnd == innerEffectTextBgConfig.marginEnd && this.marginTop == innerEffectTextBgConfig.marginTop && this.marginBottom == innerEffectTextBgConfig.marginBottom;
    }

    public final int hashCode() {
        String str = this.bgName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.isNinePatch;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        EffectTextBgNinePatch effectTextBgNinePatch = this.ninePatchInfo;
        int hashCode2 = (((i5 + (effectTextBgNinePatch != null ? effectTextBgNinePatch.hashCode() : 0)) * 31) + m88909x1d613a93(this.gravity)) * 31;
        EnumC46086e eVar = this.dimensionModeWidth;
        int hashCode3 = (hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        EnumC46086e eVar2 = this.dimensionModeHeight;
        if (eVar2 != null) {
            i = eVar2.hashCode();
        }
        return ((((((((((((hashCode3 + i) * 31) + m88909x1d613a93(this.width)) * 31) + m88909x1d613a93(this.height)) * 31) + m88909x1d613a93(this.marginStart)) * 31) + m88909x1d613a93(this.marginEnd)) * 31) + m88909x1d613a93(this.marginTop)) * 31) + m88909x1d613a93(this.marginBottom);
    }

    public final String toString() {
        return "InnerEffectTextBgConfig(bgName=" + this.bgName + ", isNinePatch=" + this.isNinePatch + ", ninePatchInfo=" + this.ninePatchInfo + ", gravity=" + this.gravity + ", dimensionModeWidth=" + this.dimensionModeWidth + ", dimensionModeHeight=" + this.dimensionModeHeight + ", width=" + this.width + ", height=" + this.height + ", marginStart=" + this.marginStart + ", marginEnd=" + this.marginEnd + ", marginTop=" + this.marginTop + ", marginBottom=" + this.marginBottom + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.bgName);
        parcel.writeInt(this.isNinePatch ? 1 : 0);
        this.ninePatchInfo.writeToParcel(parcel, 0);
        parcel.writeInt(this.gravity);
        parcel.writeString(this.dimensionModeWidth.name());
        parcel.writeString(this.dimensionModeHeight.name());
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.marginStart);
        parcel.writeInt(this.marginEnd);
        parcel.writeInt(this.marginTop);
        parcel.writeInt(this.marginBottom);
    }

    public final String getBgName() {
        return this.bgName;
    }

    public final EnumC46086e getDimensionModeHeight() {
        return this.dimensionModeHeight;
    }

    public final EnumC46086e getDimensionModeWidth() {
        return this.dimensionModeWidth;
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getHeight() {
        return this.height;
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

    public final EffectTextBgNinePatch getNinePatchInfo() {
        return this.ninePatchInfo;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isNinePatch() {
        return this.isNinePatch;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextBgConfig$a */
    public static class C46054a implements Parcelable.Creator<InnerEffectTextBgConfig> {
        static {
            Covode.recordClassIndex(54592);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ InnerEffectTextBgConfig[] newArray(int i) {
            return new InnerEffectTextBgConfig[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InnerEffectTextBgConfig createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new InnerEffectTextBgConfig(parcel.readString(), parcel.readInt() != 0, EffectTextBgNinePatch.CREATOR.createFromParcel(parcel), parcel.readInt(), (EnumC46086e) Enum.valueOf(EnumC46086e.class, parcel.readString()), (EnumC46086e) Enum.valueOf(EnumC46086e.class, parcel.readString()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }
    }

    public InnerEffectTextBgConfig(String str, boolean z, EffectTextBgNinePatch effectTextBgNinePatch, int i, EnumC46086e eVar, EnumC46086e eVar2, int i2, int i3, int i4, int i5, int i6, int i7) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(effectTextBgNinePatch, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(eVar2, "");
        this.bgName = str;
        this.isNinePatch = z;
        this.ninePatchInfo = effectTextBgNinePatch;
        this.gravity = i;
        this.dimensionModeWidth = eVar;
        this.dimensionModeHeight = eVar2;
        this.width = i2;
        this.height = i3;
        this.marginStart = i4;
        this.marginEnd = i5;
        this.marginTop = i6;
        this.marginBottom = i7;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InnerEffectTextBgConfig(String str, boolean z, EffectTextBgNinePatch effectTextBgNinePatch, int i, EnumC46086e eVar, EnumC46086e eVar2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, C89214g gVar) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? false : z, (i8 & 4) != 0 ? new EffectTextBgNinePatch(null, null, 0, 0, 0, 0, 63, null) : effectTextBgNinePatch, (i8 & 8) != 0 ? EnumC46088f.LEFT.getGravity() | EnumC46088f.TOP.getGravity() : i, (i8 & 16) != 0 ? EnumC46086e.MATCH_PARENT : eVar, (i8 & 32) != 0 ? EnumC46086e.MATCH_PARENT : eVar2, (i8 & 64) != 0 ? 0 : i2, (i8 & 128) != 0 ? 0 : i3, (i8 & 256) != 0 ? 0 : i4, (i8 & 512) != 0 ? 0 : i5, (i8 & 1024) != 0 ? 0 : i6, (i8 & 2048) == 0 ? i7 : 0);
    }
}
