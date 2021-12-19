package com.twitter.sdk.android.core.internal.oauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.TwitterAuthToken;

public class OAuthResponse implements Parcelable {
    public static final Parcelable.Creator<OAuthResponse> CREATOR = new Parcelable.Creator<OAuthResponse>() {
        /* class com.twitter.sdk.android.core.internal.oauth.OAuthResponse.C877431 */

        static {
            Covode.recordClassIndex(103739);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OAuthResponse[] newArray(int i) {
            return new OAuthResponse[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OAuthResponse createFromParcel(Parcel parcel) {
            return new OAuthResponse(parcel, (byte) 0);
        }
    };

    /* renamed from: a */
    public final TwitterAuthToken f199286a;

    /* renamed from: b */
    public final String f199287b;

    /* renamed from: c */
    public final long f199288c;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(103738);
    }

    public String toString() {
        return "authToken=" + this.f199286a + ",userName=" + this.f199287b + ",userId=" + this.f199288c;
    }

    private OAuthResponse(Parcel parcel) {
        this.f199286a = (TwitterAuthToken) parcel.readParcelable(TwitterAuthToken.class.getClassLoader());
        this.f199287b = parcel.readString();
        this.f199288c = parcel.readLong();
    }

    /* synthetic */ OAuthResponse(Parcel parcel, byte b) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f199286a, i);
        parcel.writeString(this.f199287b);
        parcel.writeLong(this.f199288c);
    }

    public OAuthResponse(TwitterAuthToken twitterAuthToken, String str, long j) {
        this.f199286a = twitterAuthToken;
        this.f199287b = str;
        this.f199288c = j;
    }
}
