package com.kakao.auth.authorization.authcode;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.kakao.util.helper.Utility;

public class AuthorizationCode implements Parcelable {
    public static final Parcelable.Creator<AuthorizationCode> CREATOR = new Parcelable.Creator<AuthorizationCode>() {
        /* class com.kakao.auth.authorization.authcode.AuthorizationCode.C280811 */

        static {
            Covode.recordClassIndex(33865);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthorizationCode[] newArray(int i) {
            return new AuthorizationCode[i];
        }

        @Override // android.os.Parcelable.Creator
        public final AuthorizationCode createFromParcel(Parcel parcel) {
            return new AuthorizationCode(parcel.readString());
        }
    };
    private final String authorizationCode;

    public int describeContents() {
        return 0;
    }

    public String getAuthorizationCode() {
        return this.authorizationCode;
    }

    public static AuthorizationCode createEmptyCode() {
        return new AuthorizationCode("");
    }

    static {
        Covode.recordClassIndex(33864);
    }

    public boolean hasAuthorizationCode() {
        if (!Utility.isNullOrEmpty(this.authorizationCode)) {
            return true;
        }
        return false;
    }

    public AuthorizationCode(String str) {
        this.authorizationCode = str;
    }

    public static AuthorizationCode createFromRedirectedUri(Uri uri) {
        return createNew(uri.getQueryParameter("code"));
    }

    static AuthorizationCode createNew(String str) {
        if (Utility.isNullOrEmpty(str)) {
            return createEmptyCode();
        }
        return new AuthorizationCode(str);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.authorizationCode);
    }
}
