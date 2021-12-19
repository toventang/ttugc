package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerString */
public final class TextStickerString implements Parcelable {
    public static final Parcelable.Creator<TextStickerString> CREATOR = new C46073a();
    private final String str;

    static {
        Covode.recordClassIndex(54626);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.str);
    }

    public final String getStr() {
        return this.str;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerString$a */
    public static class C46073a implements Parcelable.Creator<TextStickerString> {
        static {
            Covode.recordClassIndex(54627);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TextStickerString[] newArray(int i) {
            return new TextStickerString[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TextStickerString createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new TextStickerString(parcel.readString());
        }
    }

    public TextStickerString(String str2) {
        C89219l.m154721d(str2, "");
        this.str = str2;
    }
}
