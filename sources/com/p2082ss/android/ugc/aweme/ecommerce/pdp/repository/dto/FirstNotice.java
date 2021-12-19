package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.FirstNotice */
public final class FirstNotice implements Parcelable {
    public static final Parcelable.Creator<FirstNotice> CREATOR = new C44872a();
    @AbstractC27891c(mo46611a = "icon")

    /* renamed from: a */
    public final Image f104635a;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: b */
    public final String f104636b;
    @AbstractC27891c(mo46611a = "description")

    /* renamed from: c */
    public final String f104637c;
    @AbstractC27891c(mo46611a = "btn_txt")

    /* renamed from: d */
    public final String f104638d;

    static {
        Covode.recordClassIndex(53262);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        Image image = this.f104635a;
        if (image != null) {
            parcel.writeInt(1);
            image.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f104636b);
        parcel.writeString(this.f104637c);
        parcel.writeString(this.f104638d);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.FirstNotice$a */
    public static class C44872a implements Parcelable.Creator<FirstNotice> {
        static {
            Covode.recordClassIndex(53263);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FirstNotice[] newArray(int i) {
            return new FirstNotice[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FirstNotice createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new FirstNotice(parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    public FirstNotice(Image image, String str, String str2, String str3) {
        this.f104635a = image;
        this.f104636b = str;
        this.f104637c = str2;
        this.f104638d = str3;
    }
}
