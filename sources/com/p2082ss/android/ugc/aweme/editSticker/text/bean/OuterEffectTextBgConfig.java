package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextBgConfig */
public final class OuterEffectTextBgConfig implements Parcelable {
    public static final Parcelable.Creator<OuterEffectTextBgConfig> CREATOR = new C46062a();
    @AbstractC27891c(mo46611a = "bg_name")
    private final String bgName;
    @AbstractC27891c(mo46611a = "dimen_mode_height")
    private final int dimenModeHeight;
    @AbstractC27891c(mo46611a = "dimen_mode_width")
    private final int dimenModeWidth;
    @AbstractC27891c(mo46611a = "gravity")
    private final int gravity;
    @AbstractC27891c(mo46611a = "height")
    private final int height;
    @AbstractC27891c(mo46611a = "is_nine_patch")
    private final boolean isNinePatch;
    @AbstractC27891c(mo46611a = "margin_bottom")
    private final int marginBottom;
    @AbstractC27891c(mo46611a = "margin_end")
    private final int marginEnd;
    @AbstractC27891c(mo46611a = "margin_start")
    private final int marginStart;
    @AbstractC27891c(mo46611a = "margin_top")
    private final int marginTop;
    @AbstractC27891c(mo46611a = "nine_patch_info")
    private final EffectTextBgNinePatch ninePatchInfo;
    @AbstractC27891c(mo46611a = "width")
    private final int width;

    static {
        Covode.recordClassIndex(54607);
    }

    public OuterEffectTextBgConfig() {
        this(null, false, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextBgConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88921xfc36ba78(int i) {
        return i;
    }

    public static /* synthetic */ OuterEffectTextBgConfig copy$default(OuterEffectTextBgConfig outerEffectTextBgConfig, String str, boolean z, EffectTextBgNinePatch effectTextBgNinePatch, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = outerEffectTextBgConfig.bgName;
        }
        if ((i10 & 2) != 0) {
            z = outerEffectTextBgConfig.isNinePatch;
        }
        if ((i10 & 4) != 0) {
            effectTextBgNinePatch = outerEffectTextBgConfig.ninePatchInfo;
        }
        if ((i10 & 8) != 0) {
            i = outerEffectTextBgConfig.gravity;
        }
        if ((i10 & 16) != 0) {
            i2 = outerEffectTextBgConfig.dimenModeWidth;
        }
        if ((i10 & 32) != 0) {
            i3 = outerEffectTextBgConfig.dimenModeHeight;
        }
        if ((i10 & 64) != 0) {
            i4 = outerEffectTextBgConfig.width;
        }
        if ((i10 & 128) != 0) {
            i5 = outerEffectTextBgConfig.height;
        }
        if ((i10 & 256) != 0) {
            i6 = outerEffectTextBgConfig.marginStart;
        }
        if ((i10 & 512) != 0) {
            i7 = outerEffectTextBgConfig.marginEnd;
        }
        if ((i10 & 1024) != 0) {
            i8 = outerEffectTextBgConfig.marginTop;
        }
        if ((i10 & 2048) != 0) {
            i9 = outerEffectTextBgConfig.marginBottom;
        }
        return outerEffectTextBgConfig.copy(str, z, effectTextBgNinePatch, i, i2, i3, i4, i5, i6, i7, i8, i9);
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

    public final int component5() {
        return this.dimenModeWidth;
    }

    public final int component6() {
        return this.dimenModeHeight;
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

    public final OuterEffectTextBgConfig copy(String str, boolean z, EffectTextBgNinePatch effectTextBgNinePatch, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(effectTextBgNinePatch, "");
        return new OuterEffectTextBgConfig(str, z, effectTextBgNinePatch, i, i2, i3, i4, i5, i6, i7, i8, i9);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OuterEffectTextBgConfig)) {
            return false;
        }
        OuterEffectTextBgConfig outerEffectTextBgConfig = (OuterEffectTextBgConfig) obj;
        return C89219l.m154714a(this.bgName, outerEffectTextBgConfig.bgName) && this.isNinePatch == outerEffectTextBgConfig.isNinePatch && C89219l.m154714a(this.ninePatchInfo, outerEffectTextBgConfig.ninePatchInfo) && this.gravity == outerEffectTextBgConfig.gravity && this.dimenModeWidth == outerEffectTextBgConfig.dimenModeWidth && this.dimenModeHeight == outerEffectTextBgConfig.dimenModeHeight && this.width == outerEffectTextBgConfig.width && this.height == outerEffectTextBgConfig.height && this.marginStart == outerEffectTextBgConfig.marginStart && this.marginEnd == outerEffectTextBgConfig.marginEnd && this.marginTop == outerEffectTextBgConfig.marginTop && this.marginBottom == outerEffectTextBgConfig.marginBottom;
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
        if (effectTextBgNinePatch != null) {
            i = effectTextBgNinePatch.hashCode();
        }
        return ((((((((((((((((((i5 + i) * 31) + m88921xfc36ba78(this.gravity)) * 31) + m88921xfc36ba78(this.dimenModeWidth)) * 31) + m88921xfc36ba78(this.dimenModeHeight)) * 31) + m88921xfc36ba78(this.width)) * 31) + m88921xfc36ba78(this.height)) * 31) + m88921xfc36ba78(this.marginStart)) * 31) + m88921xfc36ba78(this.marginEnd)) * 31) + m88921xfc36ba78(this.marginTop)) * 31) + m88921xfc36ba78(this.marginBottom);
    }

    public final String toString() {
        return "OuterEffectTextBgConfig(bgName=" + this.bgName + ", isNinePatch=" + this.isNinePatch + ", ninePatchInfo=" + this.ninePatchInfo + ", gravity=" + this.gravity + ", dimenModeWidth=" + this.dimenModeWidth + ", dimenModeHeight=" + this.dimenModeHeight + ", width=" + this.width + ", height=" + this.height + ", marginStart=" + this.marginStart + ", marginEnd=" + this.marginEnd + ", marginTop=" + this.marginTop + ", marginBottom=" + this.marginBottom + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.bgName);
        parcel.writeInt(this.isNinePatch ? 1 : 0);
        this.ninePatchInfo.writeToParcel(parcel, 0);
        parcel.writeInt(this.gravity);
        parcel.writeInt(this.dimenModeWidth);
        parcel.writeInt(this.dimenModeHeight);
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

    public final int getDimenModeHeight() {
        return this.dimenModeHeight;
    }

    public final int getDimenModeWidth() {
        return this.dimenModeWidth;
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

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextBgConfig$a */
    public static class C46062a implements Parcelable.Creator<OuterEffectTextBgConfig> {
        static {
            Covode.recordClassIndex(54608);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OuterEffectTextBgConfig[] newArray(int i) {
            return new OuterEffectTextBgConfig[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OuterEffectTextBgConfig createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new OuterEffectTextBgConfig(parcel.readString(), parcel.readInt() != 0, EffectTextBgNinePatch.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }
    }

    public OuterEffectTextBgConfig(String str, boolean z, EffectTextBgNinePatch effectTextBgNinePatch, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(effectTextBgNinePatch, "");
        this.bgName = str;
        this.isNinePatch = z;
        this.ninePatchInfo = effectTextBgNinePatch;
        this.gravity = i;
        this.dimenModeWidth = i2;
        this.dimenModeHeight = i3;
        this.width = i4;
        this.height = i5;
        this.marginStart = i6;
        this.marginEnd = i7;
        this.marginTop = i8;
        this.marginBottom = i9;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OuterEffectTextBgConfig(String str, boolean z, EffectTextBgNinePatch effectTextBgNinePatch, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, C89214g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z, (i10 & 4) != 0 ? new EffectTextBgNinePatch(null, null, 0, 0, 0, 0, 63, null) : effectTextBgNinePatch, (i10 & 8) != 0 ? EnumC46088f.LEFT.getGravity() | EnumC46088f.TOP.getGravity() : i, (i10 & 16) != 0 ? EnumC46086e.MATCH_PARENT.getMode() : i2, (i10 & 32) != 0 ? EnumC46086e.MATCH_PARENT.getMode() : i3, (i10 & 64) != 0 ? 0 : i4, (i10 & 128) != 0 ? 0 : i5, (i10 & 256) != 0 ? 0 : i6, (i10 & 512) != 0 ? 0 : i7, (i10 & 1024) != 0 ? 0 : i8, (i10 & 2048) == 0 ? i9 : 0);
    }
}
