package com.twitter.sdk.android.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class TwitterAuthToken extends AbstractC87681a implements Parcelable {
    public static final Parcelable.Creator<TwitterAuthToken> CREATOR = new Parcelable.Creator<TwitterAuthToken>() {
        /* class com.twitter.sdk.android.core.TwitterAuthToken.C876801 */

        static {
            Covode.recordClassIndex(103667);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TwitterAuthToken[] newArray(int i) {
            return new TwitterAuthToken[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TwitterAuthToken createFromParcel(Parcel parcel) {
            return new TwitterAuthToken(parcel, (byte) 0);
        }
    };
    @AbstractC27891c(mo46611a = "token")

    /* renamed from: b */
    public final String f199173b;
    @AbstractC27891c(mo46611a = "secret")

    /* renamed from: c */
    public final String f199174c;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(103666);
    }

    public int hashCode() {
        int i;
        String str = this.f199173b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.f199174c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "token=" + this.f199173b + ",secret=" + this.f199174c;
    }

    private TwitterAuthToken(Parcel parcel) {
        this.f199173b = parcel.readString();
        this.f199174c = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwitterAuthToken)) {
            return false;
        }
        TwitterAuthToken twitterAuthToken = (TwitterAuthToken) obj;
        String str = this.f199174c;
        if (str == null ? twitterAuthToken.f199174c != null : !str.equals(twitterAuthToken.f199174c)) {
            return false;
        }
        String str2 = this.f199173b;
        String str3 = twitterAuthToken.f199173b;
        if (str2 == null ? str3 == null : str2.equals(str3)) {
            return true;
        }
        return false;
    }

    /* synthetic */ TwitterAuthToken(Parcel parcel, byte b) {
        this(parcel);
    }

    public TwitterAuthToken(String str, String str2) {
        this.f199173b = str;
        this.f199174c = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f199173b);
        parcel.writeString(this.f199174c);
    }
}
