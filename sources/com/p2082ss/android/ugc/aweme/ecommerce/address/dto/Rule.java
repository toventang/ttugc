package com.p2082ss.android.ugc.aweme.ecommerce.address.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.dto.Rule */
public final class Rule implements Parcelable {
    public static final Parcelable.Creator<Rule> CREATOR = new C43364a();
    @AbstractC27891c(mo46611a = "error")

    /* renamed from: a */
    public final String f101212a;
    @AbstractC27891c(mo46611a = "regex")

    /* renamed from: b */
    public final String f101213b;

    static {
        Covode.recordClassIndex(51589);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rule)) {
            return false;
        }
        Rule rule = (Rule) obj;
        return C89219l.m154714a(this.f101212a, rule.f101212a) && C89219l.m154714a(this.f101213b, rule.f101213b);
    }

    public final int hashCode() {
        String str = this.f101212a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f101213b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Rule(error=" + this.f101212a + ", regex=" + this.f101213b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.f101212a);
        parcel.writeString(this.f101213b);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.dto.Rule$a */
    public static class C43364a implements Parcelable.Creator<Rule> {
        static {
            Covode.recordClassIndex(51590);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Rule[] newArray(int i) {
            return new Rule[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Rule createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new Rule(parcel.readString(), parcel.readString());
        }
    }

    public Rule(String str, String str2) {
        this.f101212a = str;
        this.f101213b = str2;
    }
}
