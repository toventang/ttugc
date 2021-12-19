package com.p2082ss.android.ttvecamera;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ttvecamera.TEFocusParameters */
public class TEFocusParameters implements Parcelable {
    public static final Parcelable.Creator<TEFocusParameters> CREATOR = new Parcelable.Creator<TEFocusParameters>() {
        /* class com.p2082ss.android.ttvecamera.TEFocusParameters.C307501 */

        static {
            Covode.recordClassIndex(37373);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TEFocusParameters[] newArray(int i) {
            return new TEFocusParameters[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TEFocusParameters createFromParcel(Parcel parcel) {
            return new TEFocusParameters(parcel);
        }
    };

    /* renamed from: a */
    public Rect f73609a;

    /* renamed from: b */
    public Rect f73610b;

    /* renamed from: c */
    public int f73611c;

    /* renamed from: d */
    public int f73612d;

    public int describeContents() {
        return 0;
    }

    public TEFocusParameters() {
    }

    static {
        Covode.recordClassIndex(37372);
    }

    public String toString() {
        return "active size is:" + this.f73609a.toString() + " crop size is: " + this.f73610b.toString() + "  max AF regions is: " + this.f73611c + "  max AE regions is: " + this.f73612d;
    }

    public TEFocusParameters(Parcel parcel) {
        this.f73609a = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.f73611c = parcel.readInt();
        this.f73612d = parcel.readInt();
        this.f73610b = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f73609a, i);
        parcel.writeInt(this.f73611c);
        parcel.writeInt(this.f73612d);
        parcel.writeParcelable(this.f73610b, i);
    }
}
