package com.bytedance.apm.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class SpPair implements Parcelable {
    public static final Parcelable.Creator<SpPair> CREATOR = new Parcelable.Creator<SpPair>() {
        /* class com.bytedance.apm.core.SpPair.C124341 */

        static {
            Covode.recordClassIndex(14244);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SpPair[] newArray(int i) {
            return new SpPair[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SpPair createFromParcel(Parcel parcel) {
            return new SpPair(parcel);
        }
    };

    /* renamed from: a */
    public String f30190a;

    /* renamed from: b */
    public Object f30191b;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(14243);
    }

    protected SpPair(Parcel parcel) {
        this.f30190a = parcel.readString();
        this.f30191b = parcel.readValue(getClass().getClassLoader());
    }

    public SpPair(String str, Object obj) {
        this.f30190a = str;
        this.f30191b = obj;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f30190a);
        parcel.writeValue(this.f30191b);
    }
}
