package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextShadowConfig */
public final class InnerEffectTextShadowConfig implements Parcelable {
    public static final Parcelable.Creator<InnerEffectTextShadowConfig> CREATOR = new C46058a();
    private final int color;
    private final float offsetX;
    private final float offsetY;
    private final float radius;

    static {
        Covode.recordClassIndex(54599);
    }

    public InnerEffectTextShadowConfig() {
        this(0.0f, 0.0f, 0.0f, 0, 15, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextShadowConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88917x16a5002e(int i) {
        return i;
    }

    public static /* synthetic */ InnerEffectTextShadowConfig copy$default(InnerEffectTextShadowConfig innerEffectTextShadowConfig, float f, float f2, float f3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = innerEffectTextShadowConfig.radius;
        }
        if ((i2 & 2) != 0) {
            f2 = innerEffectTextShadowConfig.offsetX;
        }
        if ((i2 & 4) != 0) {
            f3 = innerEffectTextShadowConfig.offsetY;
        }
        if ((i2 & 8) != 0) {
            i = innerEffectTextShadowConfig.color;
        }
        return innerEffectTextShadowConfig.copy(f, f2, f3, i);
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

    public final int component4() {
        return this.color;
    }

    public final InnerEffectTextShadowConfig copy(float f, float f2, float f3, int i) {
        return new InnerEffectTextShadowConfig(f, f2, f3, i);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerEffectTextShadowConfig)) {
            return false;
        }
        InnerEffectTextShadowConfig innerEffectTextShadowConfig = (InnerEffectTextShadowConfig) obj;
        return Float.compare(this.radius, innerEffectTextShadowConfig.radius) == 0 && Float.compare(this.offsetX, innerEffectTextShadowConfig.offsetX) == 0 && Float.compare(this.offsetY, innerEffectTextShadowConfig.offsetY) == 0 && this.color == innerEffectTextShadowConfig.color;
    }

    public final int hashCode() {
        return (((((m88916x16a5002e(this.radius) * 31) + m88916x16a5002e(this.offsetX)) * 31) + m88916x16a5002e(this.offsetY)) * 31) + m88917x16a5002e(this.color);
    }

    public final String toString() {
        return "InnerEffectTextShadowConfig(radius=" + this.radius + ", offsetX=" + this.offsetX + ", offsetY=" + this.offsetY + ", color=" + this.color + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeFloat(this.radius);
        parcel.writeFloat(this.offsetX);
        parcel.writeFloat(this.offsetY);
        parcel.writeInt(this.color);
    }

    public final int getColor() {
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

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextShadowConfig$a */
    public static class C46058a implements Parcelable.Creator<InnerEffectTextShadowConfig> {
        static {
            Covode.recordClassIndex(54600);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ InnerEffectTextShadowConfig[] newArray(int i) {
            return new InnerEffectTextShadowConfig[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InnerEffectTextShadowConfig createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new InnerEffectTextShadowConfig(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt());
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextShadowConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88916x16a5002e(float f) {
        return Float.floatToIntBits(f);
    }

    public final InnerEffectTextShadowConfig genInstance(float f) {
        return new InnerEffectTextShadowConfig(this.radius * f, this.offsetX * f, this.offsetY * f, this.color);
    }

    public InnerEffectTextShadowConfig(float f, float f2, float f3, int i) {
        this.radius = f;
        this.offsetX = f2;
        this.offsetY = f3;
        this.color = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InnerEffectTextShadowConfig(float f, float f2, float f3, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 0.0f : f2, (i2 & 4) != 0 ? 0.0f : f3, (i2 & 8) != 0 ? -7829368 : i);
    }
}
