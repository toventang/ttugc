package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LineCredential implements Parcelable {
    public static final Parcelable.Creator<LineCredential> CREATOR = new Parcelable.Creator<LineCredential>() {
        /* class com.linecorp.linesdk.LineCredential.C281391 */

        static {
            Covode.recordClassIndex(34079);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LineCredential[] newArray(int i) {
            return new LineCredential[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LineCredential createFromParcel(Parcel parcel) {
            return new LineCredential(parcel, (byte) 0);
        }
    };

    /* renamed from: a */
    public final LineAccessToken f65850a;

    /* renamed from: b */
    public final List<String> f65851b;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(34078);
    }

    public int hashCode() {
        return (this.f65850a.hashCode() * 31) + this.f65851b.hashCode();
    }

    public String toString() {
        return "LineCredential{accessToken=" + ((Object) "#####") + ", permission=" + this.f65851b + '}';
    }

    private LineCredential(Parcel parcel) {
        this.f65850a = (LineAccessToken) parcel.readParcelable(LineAccessToken.class.getClassLoader());
        ArrayList arrayList = new ArrayList(8);
        parcel.readStringList(arrayList);
        this.f65851b = Collections.unmodifiableList(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineCredential lineCredential = (LineCredential) obj;
        if (!this.f65850a.equals(lineCredential.f65850a)) {
            return false;
        }
        return this.f65851b.equals(lineCredential.f65851b);
    }

    /* synthetic */ LineCredential(Parcel parcel, byte b) {
        this(parcel);
    }

    public LineCredential(LineAccessToken lineAccessToken, List<String> list) {
        this.f65850a = lineAccessToken;
        this.f65851b = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f65850a, i);
        parcel.writeStringList(this.f65851b);
    }
}
