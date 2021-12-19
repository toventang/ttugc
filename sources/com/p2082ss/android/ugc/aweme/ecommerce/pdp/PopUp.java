package com.p2082ss.android.ugc.aweme.ecommerce.pdp;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PopUp */
public final class PopUp implements Parcelable {
    public static final Parcelable.Creator<PopUp> CREATOR = new C44673a();
    @AbstractC27891c(mo46611a = "schema")

    /* renamed from: a */
    public final String f104235a;
    @AbstractC27891c(mo46611a = "fc_second")

    /* renamed from: b */
    public final long f104236b;

    static {
        Covode.recordClassIndex(53058);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopUp)) {
            return false;
        }
        PopUp popUp = (PopUp) obj;
        return C89219l.m154714a(this.f104235a, popUp.f104235a) && this.f104236b == popUp.f104236b;
    }

    public final int hashCode() {
        String str = this.f104235a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.f104236b;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "PopUp(schema=" + this.f104235a + ", fcSecond=" + this.f104236b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f104235a);
        parcel.writeLong(this.f104236b);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PopUp$a */
    public static class C44673a implements Parcelable.Creator<PopUp> {
        static {
            Covode.recordClassIndex(53059);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PopUp[] newArray(int i) {
            return new PopUp[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PopUp createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new PopUp(parcel.readString(), parcel.readLong());
        }
    }

    public PopUp(String str, long j) {
        C89219l.m154721d(str, "");
        this.f104235a = str;
        this.f104236b = j;
    }
}
