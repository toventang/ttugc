package com.p2082ss.android.ugc.aweme.ecommerce.address.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.dto.AddressItem */
public final class AddressItem implements Parcelable {
    public static final Parcelable.Creator<AddressItem> CREATOR = new C43359a();
    @AbstractC27891c(mo46611a = "key")

    /* renamed from: a */
    public final String f101194a;
    @AbstractC27891c(mo46611a = "value")

    /* renamed from: b */
    public final String f101195b;

    static {
        Covode.recordClassIndex(51580);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressItem)) {
            return false;
        }
        AddressItem addressItem = (AddressItem) obj;
        return C89219l.m154714a(this.f101194a, addressItem.f101194a) && C89219l.m154714a(this.f101195b, addressItem.f101195b);
    }

    public final int hashCode() {
        String str = this.f101194a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f101195b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AddressItem(key=" + this.f101194a + ", value=" + this.f101195b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f101194a);
        parcel.writeString(this.f101195b);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.dto.AddressItem$a */
    public static class C43359a implements Parcelable.Creator<AddressItem> {
        static {
            Covode.recordClassIndex(51581);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AddressItem[] newArray(int i) {
            return new AddressItem[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AddressItem createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new AddressItem(parcel.readString(), parcel.readString());
        }
    }

    public AddressItem(String str, String str2) {
        this.f101194a = str;
        this.f101195b = str2;
    }
}
