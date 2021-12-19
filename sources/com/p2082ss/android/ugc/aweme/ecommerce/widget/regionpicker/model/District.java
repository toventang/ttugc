package com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.model.District */
public final class District implements Parcelable {
    public static final Parcelable.Creator<District> CREATOR = new C45653a();
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: a */
    public final String f106272a;
    @AbstractC27891c(mo46611a = "geoname_id")

    /* renamed from: b */
    public final String f106273b;
    @AbstractC27891c(mo46611a = "index")

    /* renamed from: c */
    public final String f106274c;

    static {
        Covode.recordClassIndex(54153);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f106272a);
        parcel.writeString(this.f106273b);
        parcel.writeString(this.f106274c);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.model.District$a */
    public static class C45653a implements Parcelable.Creator<District> {
        static {
            Covode.recordClassIndex(54154);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ District[] newArray(int i) {
            return new District[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ District createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new District(parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    public District(String str, String str2, String str3) {
        this.f106272a = str;
        this.f106273b = str2;
        this.f106274c = str3;
    }
}
