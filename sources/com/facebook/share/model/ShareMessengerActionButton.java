package com.facebook.share.model;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public abstract class ShareMessengerActionButton implements ShareModel {

    /* renamed from: a */
    public final String f59264a;

    static {
        Covode.recordClassIndex(30293);
    }

    public int describeContents() {
        return 0;
    }

    ShareMessengerActionButton(Parcel parcel) {
        this.f59264a = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f59264a);
    }
}
