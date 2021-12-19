package com.bytedance.scene.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.p1617a.AbstractC22129d;
import com.bytedance.scene.p1621c.AbstractC22156g;

/* access modifiers changed from: package-private */
public class Record implements Parcelable {
    public static final Parcelable.Creator<Record> CREATOR = new Parcelable.Creator<Record>() {
        /* class com.bytedance.scene.navigation.Record.C222351 */

        static {
            Covode.recordClassIndex(26047);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Record[] newArray(int i) {
            return new Record[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Record createFromParcel(Parcel parcel) {
            return new Record(parcel);
        }
    };

    /* renamed from: a */
    AbstractC22219j f52586a;

    /* renamed from: b */
    boolean f52587b;

    /* renamed from: c */
    ActivityStatusRecord f52588c;

    /* renamed from: d */
    AbstractC22129d f52589d;

    /* renamed from: e */
    Object f52590e;

    /* renamed from: f */
    boolean f52591f;

    /* renamed from: g */
    AbstractC22156g f52592g;

    /* renamed from: h */
    String f52593h;

    public int describeContents() {
        return 0;
    }

    public Record() {
    }

    static {
        Covode.recordClassIndex(26046);
    }

    protected Record(Parcel parcel) {
        boolean z;
        this.f52588c = (ActivityStatusRecord) parcel.readParcelable(ActivityStatusRecord.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f52587b = z;
        this.f52593h = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f52588c, i);
        parcel.writeByte(this.f52587b ? (byte) 1 : 0);
        parcel.writeString(this.f52593h);
    }
}
