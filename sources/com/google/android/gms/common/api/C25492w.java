package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.common.api.w */
public final class C25492w implements Parcelable.Creator<Status> {
    static {
        Covode.recordClassIndex(30891);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i) {
        return new Status[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i2 = C25567a.m49339d(parcel, readInt);
            } else if (i3 == 2) {
                str = C25567a.m49341f(parcel, readInt);
            } else if (i3 == 3) {
                pendingIntent = (PendingIntent) C25567a.m49332a(parcel, readInt, PendingIntent.CREATOR);
            } else if (i3 != 1000) {
                C25567a.m49334b(parcel, readInt);
            } else {
                i = C25567a.m49339d(parcel, readInt);
            }
        }
        C25567a.m49346k(parcel, a);
        return new Status(i, i2, str, pendingIntent);
    }
}
