package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.Specification */
public final class Specification implements Parcelable {
    public static final Parcelable.Creator<Specification> CREATOR = new C44886a();
    @AbstractC27891c(mo46611a = StringSet.name)

    /* renamed from: a */
    public final String f104714a;
    @AbstractC27891c(mo46611a = "value")

    /* renamed from: b */
    public final String f104715b;

    static {
        Covode.recordClassIndex(53288);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Specification)) {
            return false;
        }
        Specification specification = (Specification) obj;
        return C89219l.m154714a(this.f104714a, specification.f104714a) && C89219l.m154714a(this.f104715b, specification.f104715b);
    }

    public final int hashCode() {
        String str = this.f104714a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f104715b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Specification(name=" + this.f104714a + ", value=" + this.f104715b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f104714a);
        parcel.writeString(this.f104715b);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.Specification$a */
    public static class C44886a implements Parcelable.Creator<Specification> {
        static {
            Covode.recordClassIndex(53289);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Specification[] newArray(int i) {
            return new Specification[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Specification createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new Specification(parcel.readString(), parcel.readString());
        }
    }

    public Specification(String str, String str2) {
        C89219l.m154721d(str2, "");
        this.f104714a = str;
        this.f104715b = str2;
    }
}
