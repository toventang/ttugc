package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.android.gms.auth.api.identity.c */
public final class C25284c implements Parcelable.Creator<BeginSignInResult> {
    static {
        Covode.recordClassIndex(30666);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BeginSignInResult[] newArray(int i) {
        return new BeginSignInResult[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ BeginSignInResult createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                C25567a.m49334b(parcel, readInt);
            } else {
                pendingIntent = (PendingIntent) C25567a.m49332a(parcel, readInt, PendingIntent.CREATOR);
            }
        }
        C25567a.m49346k(parcel, a);
        return new BeginSignInResult(pendingIntent);
    }
}
