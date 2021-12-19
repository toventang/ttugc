package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ThirdParty */
public final class ThirdParty implements Parcelable {
    public static final Parcelable.Creator<ThirdParty> CREATOR = new C44887a();
    @AbstractC27891c(mo46611a = "pkg_name")

    /* renamed from: a */
    public final String f104716a;
    @AbstractC27891c(mo46611a = "product_links_h5")

    /* renamed from: b */
    public final String f104717b;
    @AbstractC27891c(mo46611a = "product_links_native")

    /* renamed from: c */
    public final String f104718c;
    @AbstractC27891c(mo46611a = "btn_text")

    /* renamed from: d */
    public final String f104719d;
    @AbstractC27891c(mo46611a = "source")

    /* renamed from: e */
    public final String f104720e;
    @AbstractC27891c(mo46611a = "first_notice")

    /* renamed from: f */
    public final FirstNotice f104721f;

    static {
        Covode.recordClassIndex(53290);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f104716a);
        parcel.writeString(this.f104717b);
        parcel.writeString(this.f104718c);
        parcel.writeString(this.f104719d);
        parcel.writeString(this.f104720e);
        FirstNotice firstNotice = this.f104721f;
        if (firstNotice != null) {
            parcel.writeInt(1);
            firstNotice.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ThirdParty$a */
    public static class C44887a implements Parcelable.Creator<ThirdParty> {
        static {
            Covode.recordClassIndex(53291);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ThirdParty[] newArray(int i) {
            return new ThirdParty[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ThirdParty createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new ThirdParty(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? FirstNotice.CREATOR.createFromParcel(parcel) : null);
        }
    }

    public ThirdParty(String str, String str2, String str3, String str4, String str5, FirstNotice firstNotice) {
        this.f104716a = str;
        this.f104717b = str2;
        this.f104718c = str3;
        this.f104719d = str4;
        this.f104720e = str5;
        this.f104721f = firstNotice;
    }
}
