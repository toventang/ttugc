package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPair */
public final class TextStickerTextPair implements Parcelable {
    public static final Parcelable.Creator<TextStickerTextPair> CREATOR = new C46074a();
    @AbstractC27891c(mo46611a = "first", mo46612b = {"a"})

    /* renamed from: a */
    public final String f107313a;
    @AbstractC27891c(mo46611a = "second", mo46612b = {"b"})

    /* renamed from: b */
    public final List<InteractTextStructWrap> f107314b;

    static {
        Covode.recordClassIndex(54628);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStickerTextPair)) {
            return false;
        }
        TextStickerTextPair textStickerTextPair = (TextStickerTextPair) obj;
        return C89219l.m154714a(this.f107313a, textStickerTextPair.f107313a) && C89219l.m154714a(this.f107314b, textStickerTextPair.f107314b);
    }

    public final int hashCode() {
        String str = this.f107313a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<InteractTextStructWrap> list = this.f107314b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f107313a);
        List<InteractTextStructWrap> list = this.f107314b;
        parcel.writeInt(list.size());
        for (InteractTextStructWrap interactTextStructWrap : list) {
            interactTextStructWrap.writeToParcel(parcel, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextPair$a */
    public static class C46074a implements Parcelable.Creator<TextStickerTextPair> {
        static {
            Covode.recordClassIndex(54629);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TextStickerTextPair[] newArray(int i) {
            return new TextStickerTextPair[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TextStickerTextPair createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(InteractTextStructWrap.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new TextStickerTextPair(readString, arrayList);
        }
    }

    public /* synthetic */ TextStickerTextPair() {
        this("", new ArrayList());
    }

    public final String toString() {
        return "(" + this.f107313a + ", " + this.f107314b + ')';
    }

    public TextStickerTextPair(String str, List<InteractTextStructWrap> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        this.f107313a = str;
        this.f107314b = list;
    }
}
