package com.bytedance.scene.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public class ActivityStatusRecord implements Parcelable {
    public static final Parcelable.Creator<ActivityStatusRecord> CREATOR = new Parcelable.Creator<ActivityStatusRecord>() {
        /* class com.bytedance.scene.navigation.ActivityStatusRecord.C222341 */

        static {
            Covode.recordClassIndex(26043);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ActivityStatusRecord[] newArray(int i) {
            return new ActivityStatusRecord[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ActivityStatusRecord createFromParcel(Parcel parcel) {
            return new ActivityStatusRecord(parcel);
        }
    };

    /* renamed from: a */
    int f52574a;

    /* renamed from: b */
    int f52575b;

    /* renamed from: c */
    int f52576c;

    /* renamed from: d */
    int f52577d;

    /* renamed from: e */
    int f52578e;

    /* renamed from: f */
    int f52579f;

    public int describeContents() {
        return 0;
    }

    ActivityStatusRecord() {
    }

    static {
        Covode.recordClassIndex(26042);
    }

    protected ActivityStatusRecord(Parcel parcel) {
        this.f52574a = parcel.readInt();
        this.f52575b = parcel.readInt();
        this.f52576c = parcel.readInt();
        this.f52577d = parcel.readInt();
        this.f52578e = parcel.readInt();
        this.f52579f = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f52574a);
        parcel.writeInt(this.f52575b);
        parcel.writeInt(this.f52576c);
        parcel.writeInt(this.f52577d);
        parcel.writeInt(this.f52578e);
        parcel.writeInt(this.f52579f);
    }
}
