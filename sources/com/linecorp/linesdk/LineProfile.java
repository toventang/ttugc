package com.linecorp.linesdk;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class LineProfile implements Parcelable {
    public static final Parcelable.Creator<LineProfile> CREATOR = new Parcelable.Creator<LineProfile>() {
        /* class com.linecorp.linesdk.LineProfile.C281401 */

        static {
            Covode.recordClassIndex(34081);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LineProfile[] newArray(int i) {
            return new LineProfile[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LineProfile createFromParcel(Parcel parcel) {
            return new LineProfile(parcel, (byte) 0);
        }
    };

    /* renamed from: a */
    public final String f65852a;

    /* renamed from: b */
    public final String f65853b;

    /* renamed from: c */
    public final Uri f65854c;

    /* renamed from: d */
    public final String f65855d;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(34080);
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.f65852a.hashCode() * 31) + this.f65853b.hashCode()) * 31;
        Uri uri = this.f65854c;
        int i2 = 0;
        if (uri != null) {
            i = uri.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str = this.f65855d;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "LineProfile{displayName='" + this.f65853b + '\'' + ", userId='" + this.f65852a + '\'' + ", pictureUrl='" + this.f65854c + '\'' + ", statusMessage='" + this.f65855d + '\'' + '}';
    }

    private LineProfile(Parcel parcel) {
        this.f65852a = parcel.readString();
        this.f65853b = parcel.readString();
        this.f65854c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f65855d = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LineProfile lineProfile = (LineProfile) obj;
            if (!this.f65852a.equals(lineProfile.f65852a) || !this.f65853b.equals(lineProfile.f65853b)) {
                return false;
            }
            Uri uri = this.f65854c;
            if (uri == null ? lineProfile.f65854c != null : !uri.equals(lineProfile.f65854c)) {
                return false;
            }
            String str = this.f65855d;
            String str2 = lineProfile.f65855d;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    /* synthetic */ LineProfile(Parcel parcel, byte b) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f65852a);
        parcel.writeString(this.f65853b);
        parcel.writeParcelable(this.f65854c, i);
        parcel.writeString(this.f65855d);
    }

    public LineProfile(String str, String str2, Uri uri, String str3) {
        this.f65852a = str;
        this.f65853b = str2;
        this.f65854c = uri;
        this.f65855d = str3;
    }
}
