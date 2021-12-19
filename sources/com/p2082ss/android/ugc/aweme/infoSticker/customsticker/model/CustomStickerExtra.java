package com.p2082ss.android.ugc.aweme.infoSticker.customsticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerExtra */
public final class CustomStickerExtra implements Parcelable {
    public static final Parcelable.Creator<CustomStickerExtra> CREATOR = new C56715a();
    @AbstractC27891c(mo46611a = "upload_gif_count")
    private final int gifCountLimit;
    @AbstractC27891c(mo46611a = "upload_image_max")
    private final int gifSizeLimit;
    @AbstractC27891c(mo46611a = "image_input_height")
    private final int uploadHeightLimit;
    @AbstractC27891c(mo46611a = "image_input_width")
    private final int uploadWidthLimit;

    static {
        Covode.recordClassIndex(66573);
    }

    /* renamed from: com_ss_android_ugc_aweme_infoSticker_customsticker_model_CustomStickerExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m102724x5f43be6c(int i) {
        return i;
    }

    public static /* synthetic */ CustomStickerExtra copy$default(CustomStickerExtra customStickerExtra, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = customStickerExtra.gifSizeLimit;
        }
        if ((i5 & 2) != 0) {
            i2 = customStickerExtra.gifCountLimit;
        }
        if ((i5 & 4) != 0) {
            i3 = customStickerExtra.uploadWidthLimit;
        }
        if ((i5 & 8) != 0) {
            i4 = customStickerExtra.uploadHeightLimit;
        }
        return customStickerExtra.copy(i, i2, i3, i4);
    }

    public final int component1() {
        return this.gifSizeLimit;
    }

    public final int component2() {
        return this.gifCountLimit;
    }

    public final int component3() {
        return this.uploadWidthLimit;
    }

    public final int component4() {
        return this.uploadHeightLimit;
    }

    public final CustomStickerExtra copy(int i, int i2, int i3, int i4) {
        return new CustomStickerExtra(i, i2, i3, i4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomStickerExtra)) {
            return false;
        }
        CustomStickerExtra customStickerExtra = (CustomStickerExtra) obj;
        return this.gifSizeLimit == customStickerExtra.gifSizeLimit && this.gifCountLimit == customStickerExtra.gifCountLimit && this.uploadWidthLimit == customStickerExtra.uploadWidthLimit && this.uploadHeightLimit == customStickerExtra.uploadHeightLimit;
    }

    public final int hashCode() {
        return (((((m102724x5f43be6c(this.gifSizeLimit) * 31) + m102724x5f43be6c(this.gifCountLimit)) * 31) + m102724x5f43be6c(this.uploadWidthLimit)) * 31) + m102724x5f43be6c(this.uploadHeightLimit);
    }

    public final String toString() {
        return "CustomStickerExtra(gifSizeLimit=" + this.gifSizeLimit + ", gifCountLimit=" + this.gifCountLimit + ", uploadWidthLimit=" + this.uploadWidthLimit + ", uploadHeightLimit=" + this.uploadHeightLimit + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.gifSizeLimit);
        parcel.writeInt(this.gifCountLimit);
        parcel.writeInt(this.uploadWidthLimit);
        parcel.writeInt(this.uploadHeightLimit);
    }

    public final int getGifCountLimit() {
        return this.gifCountLimit;
    }

    public final int getGifSizeLimit() {
        return this.gifSizeLimit;
    }

    public final int getUploadHeightLimit() {
        return this.uploadHeightLimit;
    }

    public final int getUploadWidthLimit() {
        return this.uploadWidthLimit;
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerExtra$a */
    public static class C56715a implements Parcelable.Creator<CustomStickerExtra> {
        static {
            Covode.recordClassIndex(66574);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CustomStickerExtra[] newArray(int i) {
            return new CustomStickerExtra[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CustomStickerExtra createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new CustomStickerExtra(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }
    }

    public CustomStickerExtra(int i, int i2, int i3, int i4) {
        this.gifSizeLimit = i;
        this.gifCountLimit = i2;
        this.uploadWidthLimit = i3;
        this.uploadHeightLimit = i4;
    }
}
