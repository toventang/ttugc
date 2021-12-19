package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig */
public final class InnerEffectTextLayoutConfig implements Parcelable {
    public static final Parcelable.Creator<InnerEffectTextLayoutConfig> CREATOR = new C46057a();
    private final InnerEffectExtraConfig extraConfig;
    private final EnumC46099m layoutType;
    private final int orientation;
    private final int paddingBottom;
    private final int paddingEnd;
    private final int paddingStart;
    private final int paddingTop;
    private final float rotation;
    private final List<InnerEffectTextConfig> textConfigs;

    static {
        Covode.recordClassIndex(54597);
    }

    public InnerEffectTextLayoutConfig() {
        this(null, 0, 0.0f, 0, 0, 0, 0, null, null, 511, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88915x349f2cb8(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InnerEffectTextLayoutConfig copy$default(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, EnumC46099m mVar, int i, float f, int i2, int i3, int i4, int i5, List list, InnerEffectExtraConfig innerEffectExtraConfig, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            mVar = innerEffectTextLayoutConfig.layoutType;
        }
        if ((i6 & 2) != 0) {
            i = innerEffectTextLayoutConfig.orientation;
        }
        if ((i6 & 4) != 0) {
            f = innerEffectTextLayoutConfig.rotation;
        }
        if ((i6 & 8) != 0) {
            i2 = innerEffectTextLayoutConfig.paddingStart;
        }
        if ((i6 & 16) != 0) {
            i3 = innerEffectTextLayoutConfig.paddingEnd;
        }
        if ((i6 & 32) != 0) {
            i4 = innerEffectTextLayoutConfig.paddingTop;
        }
        if ((i6 & 64) != 0) {
            i5 = innerEffectTextLayoutConfig.paddingBottom;
        }
        if ((i6 & 128) != 0) {
            list = innerEffectTextLayoutConfig.textConfigs;
        }
        if ((i6 & 256) != 0) {
            innerEffectExtraConfig = innerEffectTextLayoutConfig.extraConfig;
        }
        return innerEffectTextLayoutConfig.copy(mVar, i, f, i2, i3, i4, i5, list, innerEffectExtraConfig);
    }

    public final EnumC46099m component1() {
        return this.layoutType;
    }

    public final int component2() {
        return this.orientation;
    }

    public final float component3() {
        return this.rotation;
    }

    public final int component4() {
        return this.paddingStart;
    }

    public final int component5() {
        return this.paddingEnd;
    }

    public final int component6() {
        return this.paddingTop;
    }

    public final int component7() {
        return this.paddingBottom;
    }

    public final List<InnerEffectTextConfig> component8() {
        return this.textConfigs;
    }

    public final InnerEffectExtraConfig component9() {
        return this.extraConfig;
    }

    public final InnerEffectTextLayoutConfig copy(EnumC46099m mVar, int i, float f, int i2, int i3, int i4, int i5, List<InnerEffectTextConfig> list, InnerEffectExtraConfig innerEffectExtraConfig) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(innerEffectExtraConfig, "");
        return new InnerEffectTextLayoutConfig(mVar, i, f, i2, i3, i4, i5, list, innerEffectExtraConfig);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerEffectTextLayoutConfig)) {
            return false;
        }
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig = (InnerEffectTextLayoutConfig) obj;
        return C89219l.m154714a(this.layoutType, innerEffectTextLayoutConfig.layoutType) && this.orientation == innerEffectTextLayoutConfig.orientation && Float.compare(this.rotation, innerEffectTextLayoutConfig.rotation) == 0 && this.paddingStart == innerEffectTextLayoutConfig.paddingStart && this.paddingEnd == innerEffectTextLayoutConfig.paddingEnd && this.paddingTop == innerEffectTextLayoutConfig.paddingTop && this.paddingBottom == innerEffectTextLayoutConfig.paddingBottom && C89219l.m154714a(this.textConfigs, innerEffectTextLayoutConfig.textConfigs) && C89219l.m154714a(this.extraConfig, innerEffectTextLayoutConfig.extraConfig);
    }

    public final int hashCode() {
        EnumC46099m mVar = this.layoutType;
        int i = 0;
        int hashCode = (((((((((((((mVar != null ? mVar.hashCode() : 0) * 31) + m88915x349f2cb8(this.orientation)) * 31) + m88914x349f2cb8(this.rotation)) * 31) + m88915x349f2cb8(this.paddingStart)) * 31) + m88915x349f2cb8(this.paddingEnd)) * 31) + m88915x349f2cb8(this.paddingTop)) * 31) + m88915x349f2cb8(this.paddingBottom)) * 31;
        List<InnerEffectTextConfig> list = this.textConfigs;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        InnerEffectExtraConfig innerEffectExtraConfig = this.extraConfig;
        if (innerEffectExtraConfig != null) {
            i = innerEffectExtraConfig.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "InnerEffectTextLayoutConfig(layoutType=" + this.layoutType + ", orientation=" + this.orientation + ", rotation=" + this.rotation + ", paddingStart=" + this.paddingStart + ", paddingEnd=" + this.paddingEnd + ", paddingTop=" + this.paddingTop + ", paddingBottom=" + this.paddingBottom + ", textConfigs=" + this.textConfigs + ", extraConfig=" + this.extraConfig + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.layoutType.name());
        parcel.writeInt(this.orientation);
        parcel.writeFloat(this.rotation);
        parcel.writeInt(this.paddingStart);
        parcel.writeInt(this.paddingEnd);
        parcel.writeInt(this.paddingTop);
        parcel.writeInt(this.paddingBottom);
        List<InnerEffectTextConfig> list = this.textConfigs;
        parcel.writeInt(list.size());
        for (InnerEffectTextConfig innerEffectTextConfig : list) {
            innerEffectTextConfig.writeToParcel(parcel, 0);
        }
        this.extraConfig.writeToParcel(parcel, 0);
    }

    public final InnerEffectExtraConfig getExtraConfig() {
        return this.extraConfig;
    }

    public final EnumC46099m getLayoutType() {
        return this.layoutType;
    }

    public final int getOrientation() {
        return this.orientation;
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

    public final float getRotation() {
        return this.rotation;
    }

    public final List<InnerEffectTextConfig> getTextConfigs() {
        return this.textConfigs;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig$a */
    public static class C46057a implements Parcelable.Creator<InnerEffectTextLayoutConfig> {
        static {
            Covode.recordClassIndex(54598);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ InnerEffectTextLayoutConfig[] newArray(int i) {
            return new InnerEffectTextLayoutConfig[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InnerEffectTextLayoutConfig createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            EnumC46099m mVar = (EnumC46099m) Enum.valueOf(EnumC46099m.class, parcel.readString());
            int readInt = parcel.readInt();
            float readFloat = parcel.readFloat();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt6);
            while (readInt6 != 0) {
                arrayList.add(InnerEffectTextConfig.CREATOR.createFromParcel(parcel));
                readInt6--;
            }
            return new InnerEffectTextLayoutConfig(mVar, readInt, readFloat, readInt2, readInt3, readInt4, readInt5, arrayList, InnerEffectExtraConfig.CREATOR.createFromParcel(parcel));
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88914x349f2cb8(float f) {
        return Float.floatToIntBits(f);
    }

    public InnerEffectTextLayoutConfig(EnumC46099m mVar, int i, float f, int i2, int i3, int i4, int i5, List<InnerEffectTextConfig> list, InnerEffectExtraConfig innerEffectExtraConfig) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(innerEffectExtraConfig, "");
        this.layoutType = mVar;
        this.orientation = i;
        this.rotation = f;
        this.paddingStart = i2;
        this.paddingEnd = i3;
        this.paddingTop = i4;
        this.paddingBottom = i5;
        this.textConfigs = list;
        this.extraConfig = innerEffectExtraConfig;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InnerEffectTextLayoutConfig(EnumC46099m mVar, int i, float f, int i2, int i3, int i4, int i5, List list, InnerEffectExtraConfig innerEffectExtraConfig, int i6, C89214g gVar) {
        this((i6 & 1) != 0 ? EnumC46099m.LINEAR : mVar, (i6 & 2) != 0 ? 1 : i, (i6 & 4) != 0 ? 0.0f : f, (i6 & 8) != 0 ? 0 : i2, (i6 & 16) != 0 ? 0 : i3, (i6 & 32) != 0 ? 0 : i4, (i6 & 64) != 0 ? 0 : i5, (i6 & 128) != 0 ? new ArrayList() : list, (i6 & 256) != 0 ? new InnerEffectExtraConfig(false, 1, null) : innerEffectExtraConfig);
    }
}
