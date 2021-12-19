package com.linecorp.linesdk.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public class LineAuthenticationConfig implements Parcelable {
    public static final Parcelable.Creator<LineAuthenticationConfig> CREATOR = new Parcelable.Creator<LineAuthenticationConfig>() {
        /* class com.linecorp.linesdk.auth.LineAuthenticationConfig.C281641 */

        static {
            Covode.recordClassIndex(34106);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LineAuthenticationConfig[] newArray(int i) {
            return new LineAuthenticationConfig[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LineAuthenticationConfig createFromParcel(Parcel parcel) {
            return new LineAuthenticationConfig(parcel, (byte) 0);
        }
    };

    /* renamed from: f */
    private static int f65902f = 1;

    /* renamed from: g */
    private static int f65903g = 2;

    /* renamed from: a */
    public final String f65904a;

    /* renamed from: b */
    public final Uri f65905b;

    /* renamed from: c */
    public final Uri f65906c;

    /* renamed from: d */
    public final boolean f65907d;

    /* renamed from: e */
    public final boolean f65908e;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(34105);
    }

    public int hashCode() {
        return (((((((this.f65904a.hashCode() * 31) + this.f65905b.hashCode()) * 31) + this.f65906c.hashCode()) * 31) + (this.f65907d ? 1 : 0)) * 31) + (this.f65908e ? 1 : 0);
    }

    public String toString() {
        return "LineAuthenticationConfig{channelId=" + this.f65904a + ", endPointBaseUrl=" + this.f65905b + ", webLoginPageUrl=" + this.f65906c + ", isLineAppAuthenticationDisabled=" + this.f65907d + ", isEncryptorPreparationDisabled=" + this.f65908e + '}';
    }

    private LineAuthenticationConfig(C28165a aVar) {
        this.f65904a = aVar.f65909a;
        this.f65905b = aVar.f65910b;
        this.f65906c = aVar.f65911c;
        this.f65907d = aVar.f65912d;
        this.f65908e = aVar.f65913e;
    }

    /* renamed from: com.linecorp.linesdk.auth.LineAuthenticationConfig$a */
    public static class C28165a {

        /* renamed from: a */
        public final String f65909a;

        /* renamed from: b */
        public Uri f65910b;

        /* renamed from: c */
        public Uri f65911c;

        /* renamed from: d */
        public boolean f65912d;

        /* renamed from: e */
        public boolean f65913e;

        static {
            Covode.recordClassIndex(34107);
        }

        public C28165a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f65909a = str;
                this.f65910b = Uri.parse("https://access.line.me/v2");
                this.f65911c = Uri.parse("https://access.line.me/dialog/oauth/weblogin");
                return;
            }
            throw new IllegalArgumentException("channelId is empty.");
        }
    }

    private LineAuthenticationConfig(Parcel parcel) {
        boolean z;
        this.f65904a = parcel.readString();
        this.f65905b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f65906c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        int readInt = parcel.readInt();
        boolean z2 = true;
        if ((f65902f & readInt) > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f65907d = z;
        this.f65908e = (readInt & f65903g) <= 0 ? false : z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineAuthenticationConfig lineAuthenticationConfig = (LineAuthenticationConfig) obj;
        if (this.f65907d == lineAuthenticationConfig.f65907d && this.f65908e == lineAuthenticationConfig.f65908e && this.f65904a.equals(lineAuthenticationConfig.f65904a) && this.f65905b.equals(lineAuthenticationConfig.f65905b)) {
            return this.f65906c.equals(lineAuthenticationConfig.f65906c);
        }
        return false;
    }

    /* synthetic */ LineAuthenticationConfig(Parcel parcel, byte b) {
        this(parcel);
    }

    public /* synthetic */ LineAuthenticationConfig(C28165a aVar, byte b) {
        this(aVar);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.f65904a);
        parcel.writeParcelable(this.f65905b, i);
        parcel.writeParcelable(this.f65906c, i);
        int i3 = 0;
        if (this.f65907d) {
            i2 = f65902f;
        } else {
            i2 = 0;
        }
        int i4 = i2 | 0;
        if (this.f65908e) {
            i3 = f65903g;
        }
        parcel.writeInt(i4 | i3);
    }
}
