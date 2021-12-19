package com.p2082ss.android.ugc.aweme.ecommerce.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.Icon */
public final class Icon implements Parcelable {
    public static final Parcelable.Creator<Icon> CREATOR = new C43604a();
    @AbstractC27891c(mo46611a = "icon")

    /* renamed from: a */
    public final Image f101641a;
    @AbstractC27891c(mo46611a = "icon_dark")

    /* renamed from: b */
    public final Image f101642b;
    @AbstractC27891c(mo46611a = "link")

    /* renamed from: c */
    public final String f101643c;

    static {
        Covode.recordClassIndex(51854);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Icon)) {
            return false;
        }
        Icon icon = (Icon) obj;
        return C89219l.m154714a(this.f101641a, icon.f101641a) && C89219l.m154714a(this.f101642b, icon.f101642b) && C89219l.m154714a(this.f101643c, icon.f101643c);
    }

    public final int hashCode() {
        Image image = this.f101641a;
        int i = 0;
        int hashCode = (image != null ? image.hashCode() : 0) * 31;
        Image image2 = this.f101642b;
        int hashCode2 = (hashCode + (image2 != null ? image2.hashCode() : 0)) * 31;
        String str = this.f101643c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "Icon(icon=" + this.f101641a + ", iconDark=" + this.f101642b + ", link=" + this.f101643c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        this.f101641a.writeToParcel(parcel, 0);
        Image image = this.f101642b;
        if (image != null) {
            parcel.writeInt(1);
            image.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f101643c);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.Icon$a */
    public static class C43604a implements Parcelable.Creator<Icon> {
        static {
            Covode.recordClassIndex(51855);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Icon[] newArray(int i) {
            return new Icon[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Icon createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new Icon(Image.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }
    }

    public Icon(Image image, Image image2, String str) {
        C89219l.m154721d(image, "");
        this.f101641a = image;
        this.f101642b = image2;
        this.f101643c = str;
    }
}
