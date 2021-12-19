package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;
import java.util.Map;

public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new C27878p();

    /* renamed from: a */
    public Bundle f65433a;

    /* renamed from: b */
    public Map<String, String> f65434b;

    static {
        Covode.recordClassIndex(33449);
    }

    public RemoteMessage(Bundle bundle) {
        this.f65433a = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49350a(parcel, 2, this.f65433a);
        C25569b.m49359b(parcel, a);
    }
}
