package com.bytedance.android.live.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public final class RoomStatus implements Parcelable {
    public static final Parcelable.Creator<RoomStatus> CREATOR = new Parcelable.Creator<RoomStatus>() {
        /* class com.bytedance.android.live.base.model.RoomStatus.C29581 */

        static {
            Covode.recordClassIndex(3403);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RoomStatus[] newArray(int i) {
            return new RoomStatus[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RoomStatus createFromParcel(Parcel parcel) {
            return new RoomStatus(parcel);
        }
    };

    /* renamed from: a */
    public long f8703a;

    /* renamed from: b */
    public long f8704b;

    /* renamed from: c */
    public boolean f8705c;

    /* renamed from: d */
    public int f8706d;

    public final int describeContents() {
        return 0;
    }

    public RoomStatus() {
    }

    static {
        Covode.recordClassIndex(3402);
    }

    protected RoomStatus(Parcel parcel) {
        boolean z;
        this.f8703a = parcel.readLong();
        this.f8704b = parcel.readLong();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f8705c = z;
        this.f8706d = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8703a);
        parcel.writeLong(this.f8704b);
        parcel.writeByte(this.f8705c ? (byte) 1 : 0);
        parcel.writeInt(this.f8706d);
    }
}
