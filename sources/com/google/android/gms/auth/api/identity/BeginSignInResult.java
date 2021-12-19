package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;

public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new C25284c();

    /* renamed from: a */
    public final PendingIntent f59967a;

    static {
        Covode.recordClassIndex(30662);
    }

    public BeginSignInResult(PendingIntent pendingIntent) {
        this.f59967a = (PendingIntent) C25565r.m49314a(pendingIntent);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49352a(parcel, 1, this.f59967a, i);
        C25569b.m49359b(parcel, a);
    }
}
