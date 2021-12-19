package com.twitter.sdk.android.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class TwitterAuthConfig implements Parcelable {
    public static final Parcelable.Creator<TwitterAuthConfig> CREATOR = new Parcelable.Creator<TwitterAuthConfig>() {
        /* class com.twitter.sdk.android.core.TwitterAuthConfig.C876791 */

        static {
            Covode.recordClassIndex(103665);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TwitterAuthConfig[] newArray(int i) {
            return new TwitterAuthConfig[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TwitterAuthConfig createFromParcel(Parcel parcel) {
            return new TwitterAuthConfig(parcel, (byte) 0);
        }
    };

    /* renamed from: a */
    public final String f199171a;

    /* renamed from: b */
    public final String f199172b;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(103664);
    }

    private TwitterAuthConfig(Parcel parcel) {
        this.f199171a = parcel.readString();
        this.f199172b = parcel.readString();
    }

    /* renamed from: a */
    private static String m152580a(String str) {
        if (str != null) {
            return str.trim();
        }
        return null;
    }

    /* synthetic */ TwitterAuthConfig(Parcel parcel, byte b) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f199171a);
        parcel.writeString(this.f199172b);
    }

    public TwitterAuthConfig(String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("TwitterAuthConfig must not be created with null consumer key or secret.");
        }
        this.f199171a = m152580a(str);
        this.f199172b = m152580a(str2);
    }
}
