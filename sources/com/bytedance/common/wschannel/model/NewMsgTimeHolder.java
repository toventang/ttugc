package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class NewMsgTimeHolder implements Parcelable {
    public static final Parcelable.Creator<NewMsgTimeHolder> CREATOR = new Parcelable.Creator<NewMsgTimeHolder>() {
        /* class com.bytedance.common.wschannel.model.NewMsgTimeHolder.C137621 */

        static {
            Covode.recordClassIndex(15805);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ NewMsgTimeHolder[] newArray(int i) {
            return new NewMsgTimeHolder[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ NewMsgTimeHolder createFromParcel(Parcel parcel) {
            return new NewMsgTimeHolder(parcel);
        }
    };

    /* renamed from: a */
    public final long f33435a;

    /* renamed from: b */
    public final long f33436b;

    /* renamed from: c */
    public final long f33437c;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(15804);
    }

    protected NewMsgTimeHolder(Parcel parcel) {
        this.f33435a = parcel.readLong();
        this.f33436b = parcel.readLong();
        this.f33437c = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f33435a);
        parcel.writeLong(this.f33436b);
        parcel.writeLong(this.f33437c);
    }

    public NewMsgTimeHolder(long j, long j2, long j3) {
        this.f33435a = j;
        this.f33436b = j2;
        this.f33437c = j3;
    }
}
