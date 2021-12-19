package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.C25567a;

/* renamed from: com.google.firebase.messaging.p */
public final class C27878p implements Parcelable.Creator<RemoteMessage> {
    static {
        Covode.recordClassIndex(33471);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ RemoteMessage[] newArray(int i) {
        return new RemoteMessage[i];
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ RemoteMessage createFromParcel(Parcel parcel) {
        int a = C25567a.m49330a(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 2) {
                C25567a.m49334b(parcel, readInt);
            } else {
                bundle = C25567a.m49343h(parcel, readInt);
            }
        }
        C25567a.m49346k(parcel, a);
        return new RemoteMessage(bundle);
    }
}
