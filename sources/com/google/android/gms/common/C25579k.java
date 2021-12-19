package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.common.k */
public final class C25579k implements Parcelable.Creator<ConnectionResult> {
    static {
        Covode.recordClassIndex(30986);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ConnectionResult[] newArray(int i) {
        return new ConnectionResult[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ConnectionResult createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = C25567a.m49339d(parcel, readInt);
            } else if (i3 == 2) {
                i2 = C25567a.m49339d(parcel, readInt);
            } else if (i3 == 3) {
                pendingIntent = (PendingIntent) C25567a.m49332a(parcel, readInt, PendingIntent.CREATOR);
            } else if (i3 != 4) {
                C25567a.m49334b(parcel, readInt);
            } else {
                str = C25567a.m49341f(parcel, readInt);
            }
        }
        C25567a.m49346k(parcel, a);
        return new ConnectionResult(i, i2, pendingIntent, str);
    }
}
