package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerCoverExtraData */
public final class TextStickerCoverExtraData implements Parcelable {
    public static final Parcelable.Creator<TextStickerCoverExtraData> CREATOR = new C46068a();
    private final boolean isPortrait;

    static {
        Covode.recordClassIndex(54619);
    }

    public TextStickerCoverExtraData() {
        this(false, 1, null);
    }

    public static /* synthetic */ TextStickerCoverExtraData copy$default(TextStickerCoverExtraData textStickerCoverExtraData, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = textStickerCoverExtraData.isPortrait;
        }
        return textStickerCoverExtraData.copy(z);
    }

    public final boolean component1() {
        return this.isPortrait;
    }

    public final TextStickerCoverExtraData copy(boolean z) {
        return new TextStickerCoverExtraData(z);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TextStickerCoverExtraData) && this.isPortrait == ((TextStickerCoverExtraData) obj).isPortrait;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.isPortrait;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "TextStickerCoverExtraData(isPortrait=" + this.isPortrait + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.isPortrait ? 1 : 0);
    }

    public final boolean isPortrait() {
        return this.isPortrait;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerCoverExtraData$a */
    public static class C46068a implements Parcelable.Creator<TextStickerCoverExtraData> {
        static {
            Covode.recordClassIndex(54620);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TextStickerCoverExtraData[] newArray(int i) {
            return new TextStickerCoverExtraData[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TextStickerCoverExtraData createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new TextStickerCoverExtraData(parcel.readInt() != 0);
        }
    }

    public TextStickerCoverExtraData(boolean z) {
        this.isPortrait = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextStickerCoverExtraData(boolean z, int i, C89214g gVar) {
        this((i & 1) != 0 ? true : z);
    }
}
