package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class LineAccessToken implements Parcelable {
    public static final Parcelable.Creator<LineAccessToken> CREATOR = new Parcelable.Creator<LineAccessToken>() {
        /* class com.linecorp.linesdk.LineAccessToken.C281371 */

        static {
            Covode.recordClassIndex(34075);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LineAccessToken[] newArray(int i) {
            return new LineAccessToken[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LineAccessToken createFromParcel(Parcel parcel) {
            return new LineAccessToken(parcel, (byte) 0);
        }
    };

    /* renamed from: a */
    public final String f65844a;

    /* renamed from: b */
    public final long f65845b;

    /* renamed from: c */
    public final long f65846c;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(34074);
    }

    public int hashCode() {
        long j = this.f65845b;
        long j2 = this.f65846c;
        return (((this.f65844a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "LineAccessToken{accessToken='#####', expiresInMillis=" + this.f65845b + ", issuedClientTimeMillis=" + this.f65846c + '}';
    }

    private LineAccessToken(Parcel parcel) {
        this.f65844a = parcel.readString();
        this.f65845b = parcel.readLong();
        this.f65846c = parcel.readLong();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineAccessToken lineAccessToken = (LineAccessToken) obj;
        if (this.f65845b == lineAccessToken.f65845b && this.f65846c == lineAccessToken.f65846c) {
            return this.f65844a.equals(lineAccessToken.f65844a);
        }
        return false;
    }

    /* synthetic */ LineAccessToken(Parcel parcel, byte b) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f65844a);
        parcel.writeLong(this.f65845b);
        parcel.writeLong(this.f65846c);
    }

    public LineAccessToken(String str, long j, long j2) {
        this.f65844a = str;
        this.f65845b = j;
        this.f65846c = j2;
    }
}
