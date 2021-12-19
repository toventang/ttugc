package com.twitter.sdk.android.core.internal.oauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.twitter.sdk.android.core.AbstractC87681a;

public class OAuth2Token extends AbstractC87681a implements Parcelable {
    public static final Parcelable.Creator<OAuth2Token> CREATOR = new Parcelable.Creator<OAuth2Token>() {
        /* class com.twitter.sdk.android.core.internal.oauth.OAuth2Token.C877421 */

        static {
            Covode.recordClassIndex(103737);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OAuth2Token[] newArray(int i) {
            return new OAuth2Token[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OAuth2Token createFromParcel(Parcel parcel) {
            return new OAuth2Token(parcel, (byte) 0);
        }
    };
    @AbstractC27891c(mo46611a = "token_type")

    /* renamed from: c */
    public final String f199284c;
    @AbstractC27891c(mo46611a = "access_token")

    /* renamed from: d */
    public final String f199285d;

    /* renamed from: a */
    public boolean mo142186a() {
        return false;
    }

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(103736);
    }

    public int hashCode() {
        int i;
        String str = this.f199284c;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.f199285d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    private OAuth2Token(Parcel parcel) {
        this.f199284c = parcel.readString();
        this.f199285d = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OAuth2Token oAuth2Token = (OAuth2Token) obj;
        String str = this.f199285d;
        if (str == null ? oAuth2Token.f199285d != null : !str.equals(oAuth2Token.f199285d)) {
            return false;
        }
        String str2 = this.f199284c;
        String str3 = oAuth2Token.f199284c;
        if (str2 == null ? str3 == null : str2.equals(str3)) {
            return true;
        }
        return false;
    }

    /* synthetic */ OAuth2Token(Parcel parcel, byte b) {
        this(parcel);
    }

    public OAuth2Token(String str, String str2) {
        this.f199284c = str;
        this.f199285d = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f199284c);
        parcel.writeString(this.f199285d);
    }
}
