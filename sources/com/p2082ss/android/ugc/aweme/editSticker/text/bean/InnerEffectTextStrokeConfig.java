package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextStrokeConfig */
public final class InnerEffectTextStrokeConfig implements Parcelable {
    public static final Parcelable.Creator<InnerEffectTextStrokeConfig> CREATOR = new C46059a();
    private final int strokeColor;
    private final Paint.Join strokeJoin;
    private final float strokeWidth;

    static {
        Covode.recordClassIndex(54601);
    }

    public InnerEffectTextStrokeConfig() {
        this(0.0f, 0, null, 7, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextStrokeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88919xae7da346(int i) {
        return i;
    }

    public static /* synthetic */ InnerEffectTextStrokeConfig copy$default(InnerEffectTextStrokeConfig innerEffectTextStrokeConfig, float f, int i, Paint.Join join, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = innerEffectTextStrokeConfig.strokeWidth;
        }
        if ((i2 & 2) != 0) {
            i = innerEffectTextStrokeConfig.strokeColor;
        }
        if ((i2 & 4) != 0) {
            join = innerEffectTextStrokeConfig.strokeJoin;
        }
        return innerEffectTextStrokeConfig.copy(f, i, join);
    }

    public final float component1() {
        return this.strokeWidth;
    }

    public final int component2() {
        return this.strokeColor;
    }

    public final Paint.Join component3() {
        return this.strokeJoin;
    }

    public final InnerEffectTextStrokeConfig copy(float f, int i, Paint.Join join) {
        C89219l.m154721d(join, "");
        return new InnerEffectTextStrokeConfig(f, i, join);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerEffectTextStrokeConfig)) {
            return false;
        }
        InnerEffectTextStrokeConfig innerEffectTextStrokeConfig = (InnerEffectTextStrokeConfig) obj;
        return Float.compare(this.strokeWidth, innerEffectTextStrokeConfig.strokeWidth) == 0 && this.strokeColor == innerEffectTextStrokeConfig.strokeColor && C89219l.m154714a(this.strokeJoin, innerEffectTextStrokeConfig.strokeJoin);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextStrokeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((m88918xae7da346(this.strokeWidth) * 31) + m88919xae7da346(this.strokeColor)) * 31;
        Paint.Join join = this.strokeJoin;
        return com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextStrokeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (join != null ? join.hashCode() : 0);
    }

    public final String toString() {
        return "InnerEffectTextStrokeConfig(strokeWidth=" + this.strokeWidth + ", strokeColor=" + this.strokeColor + ", strokeJoin=" + this.strokeJoin + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeFloat(this.strokeWidth);
        parcel.writeInt(this.strokeColor);
        parcel.writeString(this.strokeJoin.name());
    }

    public final int getStrokeColor() {
        return this.strokeColor;
    }

    public final Paint.Join getStrokeJoin() {
        return this.strokeJoin;
    }

    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextStrokeConfig$a */
    public static class C46059a implements Parcelable.Creator<InnerEffectTextStrokeConfig> {
        static {
            Covode.recordClassIndex(54602);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ InnerEffectTextStrokeConfig[] newArray(int i) {
            return new InnerEffectTextStrokeConfig[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InnerEffectTextStrokeConfig createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new InnerEffectTextStrokeConfig(parcel.readFloat(), parcel.readInt(), (Paint.Join) Enum.valueOf(Paint.Join.class, parcel.readString()));
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_editSticker_text_bean_InnerEffectTextStrokeConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88918xae7da346(float f) {
        return Float.floatToIntBits(f);
    }

    public InnerEffectTextStrokeConfig(float f, int i, Paint.Join join) {
        C89219l.m154721d(join, "");
        this.strokeWidth = f;
        this.strokeColor = i;
        this.strokeJoin = join;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InnerEffectTextStrokeConfig(float f, int i, Paint.Join join, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? -16777216 : i, (i2 & 4) != 0 ? Paint.Join.ROUND : join);
    }
}
