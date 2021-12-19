package com.linecorp.linesdk.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.linecorp.linesdk.EnumC28179b;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineProfile;

public class LineLoginResult implements Parcelable {
    public static final Parcelable.Creator<LineLoginResult> CREATOR = new Parcelable.Creator<LineLoginResult>() {
        /* class com.linecorp.linesdk.auth.LineLoginResult.C281661 */

        static {
            Covode.recordClassIndex(34110);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LineLoginResult[] newArray(int i) {
            return new LineLoginResult[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LineLoginResult createFromParcel(Parcel parcel) {
            return new LineLoginResult(parcel, (byte) 0);
        }
    };

    /* renamed from: a */
    public static final LineLoginResult f65914a = new LineLoginResult(EnumC28179b.CANCEL, LineApiError.f65847a);

    /* renamed from: b */
    public final EnumC28179b f65915b;

    /* renamed from: c */
    public final LineProfile f65916c;

    /* renamed from: d */
    public final LineCredential f65917d;

    /* renamed from: e */
    public final LineApiError f65918e;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(34109);
    }

    public int hashCode() {
        int i;
        int hashCode = this.f65915b.hashCode() * 31;
        LineProfile lineProfile = this.f65916c;
        int i2 = 0;
        if (lineProfile != null) {
            i = lineProfile.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        LineCredential lineCredential = this.f65917d;
        if (lineCredential != null) {
            i2 = lineCredential.hashCode();
        }
        return ((i3 + i2) * 31) + this.f65918e.hashCode();
    }

    public String toString() {
        return "LineLoginResult{errorData=" + this.f65918e + ", responseCode=" + this.f65915b + ", lineProfile=" + this.f65916c + ", lineCredential=" + this.f65917d + '}';
    }

    private LineLoginResult(Parcel parcel) {
        this.f65915b = (EnumC28179b) parcel.readSerializable();
        this.f65916c = (LineProfile) parcel.readParcelable(LineProfile.class.getClassLoader());
        this.f65917d = (LineCredential) parcel.readParcelable(LineAccessToken.class.getClassLoader());
        this.f65918e = (LineApiError) parcel.readParcelable(LineApiError.class.getClassLoader());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineLoginResult lineLoginResult = (LineLoginResult) obj;
        if (this.f65915b != lineLoginResult.f65915b) {
            return false;
        }
        LineProfile lineProfile = this.f65916c;
        if (lineProfile == null ? lineLoginResult.f65916c != null : !lineProfile.equals(lineLoginResult.f65916c)) {
            return false;
        }
        LineCredential lineCredential = this.f65917d;
        if (lineCredential == null ? lineLoginResult.f65917d == null : lineCredential.equals(lineLoginResult.f65917d)) {
            return this.f65918e.equals(lineLoginResult.f65918e);
        }
        return false;
    }

    /* synthetic */ LineLoginResult(Parcel parcel, byte b) {
        this(parcel);
    }

    public LineLoginResult(LineProfile lineProfile, LineCredential lineCredential) {
        this(EnumC28179b.SUCCESS, lineProfile, lineCredential, LineApiError.f65847a);
    }

    public LineLoginResult(EnumC28179b bVar, LineApiError lineApiError) {
        this(bVar, null, null, lineApiError);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f65915b);
        parcel.writeParcelable(this.f65916c, i);
        parcel.writeParcelable(this.f65917d, i);
        parcel.writeParcelable(this.f65918e, i);
    }

    private LineLoginResult(EnumC28179b bVar, LineProfile lineProfile, LineCredential lineCredential, LineApiError lineApiError) {
        this.f65915b = bVar;
        this.f65916c = lineProfile;
        this.f65917d = lineCredential;
        this.f65918e = lineApiError;
    }
}
