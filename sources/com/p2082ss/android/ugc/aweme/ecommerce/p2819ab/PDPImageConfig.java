package com.p2082ss.android.ugc.aweme.ecommerce.p2819ab;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ab.PDPImageConfig */
public final class PDPImageConfig implements Parcelable {
    public static final Parcelable.Creator<PDPImageConfig> CREATOR = new C43317a();
    @AbstractC27891c(mo46611a = "pdp_header_progressive_switch")

    /* renamed from: a */
    public final int f101092a;

    static {
        Covode.recordClassIndex(51530);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PDPImageConfig) && this.f101092a == ((PDPImageConfig) obj).f101092a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f101092a;
    }

    public final String toString() {
        return "PDPImageConfig(progressiveSwitch=" + this.f101092a + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeInt(this.f101092a);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ab.PDPImageConfig$a */
    public static class C43317a implements Parcelable.Creator<PDPImageConfig> {
        static {
            Covode.recordClassIndex(51531);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PDPImageConfig[] newArray(int i) {
            return new PDPImageConfig[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PDPImageConfig createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new PDPImageConfig(parcel.readInt());
        }
    }

    public /* synthetic */ PDPImageConfig() {
        this(0);
    }

    public PDPImageConfig(int i) {
        this.f101092a = i;
    }
}
