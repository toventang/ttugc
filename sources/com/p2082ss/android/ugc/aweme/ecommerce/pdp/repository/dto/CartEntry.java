package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry */
public final class CartEntry implements Parcelable {
    public static final Parcelable.Creator<CartEntry> CREATOR = new C44871a();
    @AbstractC27891c(mo46611a = "link")

    /* renamed from: a */
    public final String f104633a;
    @AbstractC27891c(mo46611a = "item_count")

    /* renamed from: b */
    public final Integer f104634b;

    static {
        Covode.recordClassIndex(53260);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartEntry)) {
            return false;
        }
        CartEntry cartEntry = (CartEntry) obj;
        return C89219l.m154714a(this.f104633a, cartEntry.f104633a) && C89219l.m154714a(this.f104634b, cartEntry.f104634b);
    }

    public final int hashCode() {
        String str = this.f104633a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f104634b;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CartEntry(link=" + this.f104633a + ", itemCount=" + this.f104634b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f104633a);
        Integer num = this.f104634b;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry$a */
    public static class C44871a implements Parcelable.Creator<CartEntry> {
        static {
            Covode.recordClassIndex(53261);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CartEntry[] newArray(int i) {
            return new CartEntry[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CartEntry createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new CartEntry(parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }
    }

    public CartEntry(String str, Integer num) {
        this.f104633a = str;
        this.f104634b = num;
    }
}
