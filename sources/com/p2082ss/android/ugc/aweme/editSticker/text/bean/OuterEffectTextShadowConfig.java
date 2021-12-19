package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextShadowConfig */
public final class OuterEffectTextShadowConfig implements Parcelable {
    public static final Parcelable.Creator<OuterEffectTextShadowConfig> CREATOR = new C46066a();
    @AbstractC27891c(mo46611a = C19386b.f45894a)
    private final String color;
    @AbstractC27891c(mo46611a = "offsetX")
    private final float offsetX;
    @AbstractC27891c(mo46611a = "offsetY")
    private final float offsetY;
    @AbstractC27891c(mo46611a = "radius")
    private final float radius;

    static {
        Covode.recordClassIndex(54615);
    }

    public OuterEffectTextShadowConfig() {
        this(0.0f, 0.0f, 0.0f, null, 15, null);
    }

    public static /* synthetic */ OuterEffectTextShadowConfig copy$default(OuterEffectTextShadowConfig outerEffectTextShadowConfig, float f, float f2, float f3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            f = outerEffectTextShadowConfig.radius;
        }
        if ((i & 2) != 0) {
            f2 = outerEffectTextShadowConfig.offsetX;
        }
        if ((i & 4) != 0) {
            f3 = outerEffectTextShadowConfig.offsetY;
        }
        if ((i & 8) != 0) {
            str = outerEffectTextShadowConfig.color;
        }
        return outerEffectTextShadowConfig.copy(f, f2, f3, str);
    }

    public final float component1() {
        return this.radius;
    }

    public final float component2() {
        return this.offsetX;
    }

    public final float component3() {
        return this.offsetY;
    }

    public final String component4() {
        return this.color;
    }

    public final OuterEffectTextShadowConfig copy(float f, float f2, float f3, String str) {
        C89219l.m154721d(str, "");
        return new OuterEffectTextShadowConfig(f, f2, f3, str);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OuterEffectTextShadowConfig)) {
            return false;
        }
        OuterEffectTextShadowConfig outerEffectTextShadowConfig = (OuterEffectTextShadowConfig) obj;
        return Float.compare(this.radius, outerEffectTextShadowConfig.radius) == 0 && Float.compare(this.offsetX, outerEffectTextShadowConfig.offsetX) == 0 && Float.compare(this.offsetY, outerEffectTextShadowConfig.offsetY) == 0 && C89219l.m154714a(this.color, outerEffectTextShadowConfig.color);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextShadowConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((m88928x8d3e0593(this.radius) * 31) + m88928x8d3e0593(this.offsetX)) * 31) + m88928x8d3e0593(this.offsetY)) * 31;
        String str = this.color;
        return com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextShadowConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "OuterEffectTextShadowConfig(radius=" + this.radius + ", offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", color=" + this.color + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeFloat(this.radius);
        parcel.writeFloat(this.offsetX);
        parcel.writeFloat(this.offsetY);
        parcel.writeString(this.color);
    }

    public final String getColor() {
        return this.color;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final float getRadius() {
        return this.radius;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextShadowConfig$a */
    public static class C46066a implements Parcelable.Creator<OuterEffectTextShadowConfig> {
        static {
            Covode.recordClassIndex(54616);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OuterEffectTextShadowConfig[] newArray(int i) {
            return new OuterEffectTextShadowConfig[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OuterEffectTextShadowConfig createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new OuterEffectTextShadowConfig(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readString());
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_editSticker_text_bean_OuterEffectTextShadowConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88928x8d3e0593(float f) {
        return Float.floatToIntBits(f);
    }

    public OuterEffectTextShadowConfig(float f, float f2, float f3, String str) {
        C89219l.m154721d(str, "");
        this.radius = f;
        this.offsetX = f2;
        this.offsetY = f3;
        this.color = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OuterEffectTextShadowConfig(float f, float f2, float f3, String str, int i, C89214g gVar) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? "#FF888888" : str);
    }
}
