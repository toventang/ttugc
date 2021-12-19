package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextUnderlineIndexRange */
public final class TextStickerTextUnderlineIndexRange implements Parcelable, Cloneable {
    public static final Parcelable.Creator<TextStickerTextUnderlineIndexRange> CREATOR = new C46077a();
    private int end;
    private int start;

    static {
        Covode.recordClassIndex(54633);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public final int hashCode() {
        return this.start;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextUnderlineIndexRange$a */
    public static class C46077a implements Parcelable.Creator<TextStickerTextUnderlineIndexRange> {
        static {
            Covode.recordClassIndex(54634);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TextStickerTextUnderlineIndexRange[] newArray(int i) {
            return new TextStickerTextUnderlineIndexRange[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TextStickerTextUnderlineIndexRange createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new TextStickerTextUnderlineIndexRange(parcel.readInt(), parcel.readInt());
        }
    }

    @Override // java.lang.Object
    public final TextStickerTextUnderlineIndexRange clone() {
        return new TextStickerTextUnderlineIndexRange(this.start, this.end);
    }

    public final void setEnd(int i) {
        this.end = i;
    }

    public final void setStart(int i) {
        this.start = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextStickerTextUnderlineIndexRange) {
            TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange = (TextStickerTextUnderlineIndexRange) obj;
            if (this.start == textStickerTextUnderlineIndexRange.start && this.end == textStickerTextUnderlineIndexRange.end) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean isValid(int i) {
        int i2;
        int i3;
        if (i <= 0 || (i2 = this.start) < 0 || (i3 = this.end) > i || i3 - i2 <= 0) {
            return false;
        }
        return true;
    }

    public TextStickerTextUnderlineIndexRange(int i, int i2) {
        this.start = i;
        this.end = i2;
    }
}
