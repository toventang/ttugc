package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextLayoutConfig */
public final class OuterEffectTextLayoutConfig implements Parcelable {
    public static final Parcelable.Creator<OuterEffectTextLayoutConfig> CREATOR = new C46065a();
    @AbstractC27891c(mo46611a = "layout_type")
    private final int layoutType;
    @AbstractC27891c(mo46611a = "orientation")
    private final int orientation;
    @AbstractC27891c(mo46611a = "padding_bottom")
    private final int paddingBottom;
    @AbstractC27891c(mo46611a = "padding_end")
    private final int paddingEnd;
    @AbstractC27891c(mo46611a = "padding_start")
    private final int paddingStart;
    @AbstractC27891c(mo46611a = "padding_top")
    private final int paddingTop;
    @AbstractC27891c(mo46611a = "rotation")
    private final float rotation;
    @AbstractC27891c(mo46611a = "text_configs")
    private final List<OuterEffectTextConfig> textConfigs;

    static {
        Covode.recordClassIndex(54613);
    }

    public OuterEffectTextLayoutConfig() {
        this(0, 0, 0.0f, 0, 0, 0, 0, null, 255, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88927xab38321d(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextLayoutConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OuterEffectTextLayoutConfig copy$default(OuterEffectTextLayoutConfig outerEffectTextLayoutConfig, int i, int i2, float f, int i3, int i4, int i5, int i6, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = outerEffectTextLayoutConfig.layoutType;
        }
        if ((i7 & 2) != 0) {
            i2 = outerEffectTextLayoutConfig.orientation;
        }
        if ((i7 & 4) != 0) {
            f = outerEffectTextLayoutConfig.rotation;
        }
        if ((i7 & 8) != 0) {
            i3 = outerEffectTextLayoutConfig.paddingStart;
        }
        if ((i7 & 16) != 0) {
            i4 = outerEffectTextLayoutConfig.paddingEnd;
        }
        if ((i7 & 32) != 0) {
            i5 = outerEffectTextLayoutConfig.paddingTop;
        }
        if ((i7 & 64) != 0) {
            i6 = outerEffectTextLayoutConfig.paddingBottom;
        }
        if ((i7 & 128) != 0) {
            list = outerEffectTextLayoutConfig.textConfigs;
        }
        return outerEffectTextLayoutConfig.copy(i, i2, f, i3, i4, i5, i6, list);
    }

    public final int component1() {
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

    public final List<OuterEffectTextConfig> component8() {
        return this.textConfigs;
    }

    public final OuterEffectTextLayoutConfig copy(int i, int i2, float f, int i3, int i4, int i5, int i6, List<OuterEffectTextConfig> list) {
        C89219l.m154721d(list, "");
        return new OuterEffectTextLayoutConfig(i, i2, f, i3, i4, i5, i6, list);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OuterEffectTextLayoutConfig)) {
            return false;
        }
        OuterEffectTextLayoutConfig outerEffectTextLayoutConfig = (OuterEffectTextLayoutConfig) obj;
        return this.layoutType == outerEffectTextLayoutConfig.layoutType && this.orientation == outerEffectTextLayoutConfig.orientation && Float.compare(this.rotation, outerEffectTextLayoutConfig.rotation) == 0 && this.paddingStart == outerEffectTextLayoutConfig.paddingStart && this.paddingEnd == outerEffectTextLayoutConfig.paddingEnd && this.paddingTop == outerEffectTextLayoutConfig.paddingTop && this.paddingBottom == outerEffectTextLayoutConfig.paddingBottom && C89219l.m154714a(this.textConfigs, outerEffectTextLayoutConfig.textConfigs);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((((((((((m88927xab38321d(this.layoutType) * 31) + m88927xab38321d(this.orientation)) * 31) + m88926xab38321d(this.rotation)) * 31) + m88927xab38321d(this.paddingStart)) * 31) + m88927xab38321d(this.paddingEnd)) * 31) + m88927xab38321d(this.paddingTop)) * 31) + m88927xab38321d(this.paddingBottom)) * 31;
        List<OuterEffectTextConfig> list = this.textConfigs;
        return com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "OuterEffectTextLayoutConfig(layoutType=" + this.layoutType + ", orientation=" + this.orientation + ", rotation=" + this.rotation + ", paddingStart=" + this.paddingStart + ", paddingEnd=" + this.paddingEnd + ", paddingTop=" + this.paddingTop + ", paddingBottom=" + this.paddingBottom + ", textConfigs=" + this.textConfigs + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.layoutType);
        parcel.writeInt(this.orientation);
        parcel.writeFloat(this.rotation);
        parcel.writeInt(this.paddingStart);
        parcel.writeInt(this.paddingEnd);
        parcel.writeInt(this.paddingTop);
        parcel.writeInt(this.paddingBottom);
        List<OuterEffectTextConfig> list = this.textConfigs;
        parcel.writeInt(list.size());
        for (OuterEffectTextConfig outerEffectTextConfig : list) {
            outerEffectTextConfig.writeToParcel(parcel, 0);
        }
    }

    public final int getLayoutType() {
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

    public final List<OuterEffectTextConfig> getTextConfigs() {
        return this.textConfigs;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextLayoutConfig$a */
    public static class C46065a implements Parcelable.Creator<OuterEffectTextLayoutConfig> {
        static {
            Covode.recordClassIndex(54614);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OuterEffectTextLayoutConfig[] newArray(int i) {
            return new OuterEffectTextLayoutConfig[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OuterEffectTextLayoutConfig createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            float readFloat = parcel.readFloat();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            int readInt7 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt7);
            while (readInt7 != 0) {
                arrayList.add(OuterEffectTextConfig.CREATOR.createFromParcel(parcel));
                readInt7--;
            }
            return new OuterEffectTextLayoutConfig(readInt, readInt2, readFloat, readInt3, readInt4, readInt5, readInt6, arrayList);
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextLayoutConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88926xab38321d(float f) {
        return Float.floatToIntBits(f);
    }

    public OuterEffectTextLayoutConfig(int i, int i2, float f, int i3, int i4, int i5, int i6, List<OuterEffectTextConfig> list) {
        C89219l.m154721d(list, "");
        this.layoutType = i;
        this.orientation = i2;
        this.rotation = f;
        this.paddingStart = i3;
        this.paddingEnd = i4;
        this.paddingTop = i5;
        this.paddingBottom = i6;
        this.textConfigs = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OuterEffectTextLayoutConfig(int i, int i2, float f, int i3, int i4, int i5, int i6, List list, int i7, C89214g gVar) {
        this((i7 & 1) != 0 ? EnumC46099m.LINEAR.getType() : i, (i7 & 2) != 0 ? 1 : i2, (i7 & 4) != 0 ? 0.0f : f, (i7 & 8) != 0 ? 0 : i3, (i7 & 16) != 0 ? 0 : i4, (i7 & 32) != 0 ? 0 : i5, (i7 & 64) == 0 ? i6 : 0, (i7 & 128) != 0 ? new ArrayList() : list);
    }
}
