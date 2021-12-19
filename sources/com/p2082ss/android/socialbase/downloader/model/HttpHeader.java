package com.p2082ss.android.socialbase.downloader.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.socialbase.downloader.model.HttpHeader */
public class HttpHeader implements Parcelable, Comparable {
    public static final Parcelable.Creator<HttpHeader> CREATOR = new Parcelable.Creator<HttpHeader>() {
        /* class com.p2082ss.android.socialbase.downloader.model.HttpHeader.C305881 */

        static {
            Covode.recordClassIndex(37120);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ HttpHeader[] newArray(int i) {
            return new HttpHeader[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ HttpHeader createFromParcel(Parcel parcel) {
            return new HttpHeader(parcel);
        }
    };

    /* renamed from: a */
    public final String f72990a;

    /* renamed from: b */
    public final String f72991b;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(37119);
    }

    public int hashCode() {
        int hashCode;
        String str = this.f72990a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.f72991b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        return "HttpHeader{name='" + this.f72990a + '\'' + ", value='" + this.f72991b + '\'' + '}';
    }

    protected HttpHeader(Parcel parcel) {
        this.f72990a = parcel.readString();
        this.f72991b = parcel.readString();
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof HttpHeader)) {
            return 1;
        }
        HttpHeader httpHeader = (HttpHeader) obj;
        if (TextUtils.equals(this.f72990a, httpHeader.f72990a)) {
            return 0;
        }
        String str = this.f72990a;
        if (str == null) {
            return -1;
        }
        int compareTo = str.compareTo(httpHeader.f72990a);
        if (compareTo > 0) {
            return 1;
        }
        if (compareTo < 0) {
            return -1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            HttpHeader httpHeader = (HttpHeader) obj;
            if (!TextUtils.equals(this.f72990a, httpHeader.f72990a) || !TextUtils.equals(this.f72991b, httpHeader.f72991b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public HttpHeader(String str, String str2) {
        this.f72990a = str;
        this.f72991b = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f72990a);
        parcel.writeString(this.f72991b);
    }
}
